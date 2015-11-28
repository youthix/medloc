package helperClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import entities.CompanyDetail;
import entities.ProductDetail;
import entities.RequestParam;
import entities.ResponseData;
import entities.StockistDetail;

public class ServiceDelegate {
	
	String searchParamProvided = "0";
	int defPageSize = 6;

	public ServiceDelegate() {
	}

/*	public UserInfo validateUser(UserInfo userInfoObj) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		System.out.println((new StringBuilder("userInfoObj:UserName ="))
				.append(userInfoObj.getUserName())
				.append("userInfoObj:UserName =")
				.append(userInfoObj.getPassword()).toString());
		try {
			con = ConnectionFactory.getConnection();
			stmt = con.createStatement();
			String stringQuery = (new StringBuilder(
					"select * from userinfo where userName='"))
					.append(userInfoObj.getUserName())
					.append("'and password='")
					.append(userInfoObj.getPassword()).append("'").toString();
			rs = stmt.executeQuery(stringQuery);
			if (rs.next()) {
				userInfoObj.setRole("TRUE");
			}
			else {
				userInfoObj.setRole("FALSE");
			}

			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			{
				e.printStackTrace();
			}

		}

		return userInfoObj;
	}*/

/*	public UserList getAllUsers() {

		return callGetAllUserProcedure();

	}*/

	public ResponseData getData(RequestParam requestParam) {
		
		ResponseData responseDataObj = null;
		int pageNo = 1;
		int countCompany = 0 ;
		int countProduct = 0;
		int countStockist = 0;
		int noRecordsReturned = 0 ;
		int noRecordsAvailable = 0;
		int startIndex = 0;
		int endIndex = 0 ;

        try {
        	String filePath = getFilePath (requestParam);
        	//File responseDataFile = new File(filePath);
        	System.out.println("filePath>>"+filePath);
        	File responseDataFile = new File(filePath);
        	System.out.println("responseDataFile>>"+responseDataFile.getAbsolutePath());
        	
			JAXBContext jc = JAXBContext.newInstance(ResponseData.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
		
/*			responseDataObj = (ResponseData) unmarshaller
                    .unmarshal(new StringReader(readFileToString(
                    		responseDataFile, "UTF-8")));*/
			
			responseDataObj = (ResponseData) unmarshaller.unmarshal(responseDataFile);
			if (requestParam.getPageNo()!=null && !requestParam.getPageNo().isEmpty())
			{
				pageNo = Integer.parseInt(requestParam.getPageNo());
			}
			
			
			/*if (searchParamProvided.equalsIgnoreCase("0")){*/
			if ((requestParam.getProductID()==null ||requestParam.getProductID().isEmpty()) && (requestParam.getCompanyID()==null ||requestParam.getCompanyID().isEmpty()) && (requestParam.getStockistID()==null ||requestParam.getStockistID().isEmpty())){				
				if (requestParam.getFilterType().equalsIgnoreCase("Product")){
					responseDataObj.setListCompanyDetail(null);
					responseDataObj.setListStockistDetail(null);
					
				}
				else if(requestParam.getFilterType().equalsIgnoreCase("Stockist")){
					
					responseDataObj.setListCompanyDetail(null);
					responseDataObj.setListProductDetail(null);					
					
				}
				else if (requestParam.getFilterType().equalsIgnoreCase("Company")){
					
					responseDataObj.setListStockistDetail(null);
					responseDataObj.setListProductDetail(null);					
					
				}
				
			}
			
			/*
			 * PaginationImplementation
			 * */
			 startIndex = ((pageNo*defPageSize) - defPageSize)+1;
			 endIndex = (pageNo*defPageSize) ;	
			 
			 List<CompanyDetail> tempSubCompList = new ArrayList<CompanyDetail>();
			 
			 List<ProductDetail> tempSubProdList = new ArrayList<ProductDetail>();
			 
			 List<StockistDetail> tempSubStockistList = new ArrayList<StockistDetail>();
			

				
				if (responseDataObj.getListCompanyDetail()!=null && responseDataObj.getListCompanyDetail().getCompanyDetail()!=null){
					
					 countCompany = responseDataObj.getListCompanyDetail().getCompanyDetail().size();
					 
					 if (countCompany>0 && countCompany>=endIndex){
						 
						 tempSubCompList = responseDataObj.getListCompanyDetail().getCompanyDetail().subList(startIndex-1, endIndex);
					 }
					 else if (countCompany>0 && countCompany<endIndex){
						 
						 tempSubCompList = responseDataObj.getListCompanyDetail().getCompanyDetail().subList(startIndex-1, countCompany);
						 
					 }
					 responseDataObj.getListCompanyDetail().setCompanyDetail(tempSubCompList);
				}
				if (responseDataObj.getListProductDetail()!=null && responseDataObj.getListProductDetail().getProductDetail()!=null){
					
					 countProduct = responseDataObj.getListProductDetail().getProductDetail().size();
					 
					 if (countProduct>0 && countProduct>=endIndex){
						 
						 tempSubProdList = responseDataObj.getListProductDetail().getProductDetail().subList(startIndex-1, endIndex);
					 }
					 else if (countProduct>0 && countProduct<endIndex){
						 
						 tempSubProdList = responseDataObj.getListProductDetail().getProductDetail().subList(startIndex-1, countProduct);
						 
					 }
					 responseDataObj.getListProductDetail().setProductDetail(tempSubProdList);					 
					
				}
				
				if (responseDataObj.getListStockistDetail()!=null && responseDataObj.getListStockistDetail().getStockistDetail()!=null){
					
					 countStockist = responseDataObj.getListStockistDetail().getStockistDetail().size();
					 
					 if (countStockist>0 && countStockist>=endIndex){
						 
						 tempSubStockistList = responseDataObj.getListStockistDetail().getStockistDetail().subList(startIndex-1, endIndex);
					 }
					 else if (countStockist>0 && countStockist<endIndex){
						 
						 tempSubStockistList = responseDataObj.getListStockistDetail().getStockistDetail().subList(startIndex-1, countStockist);
						 
					 }
					 responseDataObj.getListStockistDetail().setStockistDetail(tempSubStockistList);					 
					
				}
				
				/*
				 * Maximum of countCompany/countProduct/countStockist is being calculated
				 * */
				noRecordsAvailable =(countCompany>countProduct)? countCompany:countProduct;
				noRecordsAvailable =(noRecordsAvailable>countStockist)? noRecordsAvailable:countStockist;
				
			
			System.out.println("Done");
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        catch (Exception e){
        	e.printStackTrace();
        }
        
        return responseDataObj;

	}	
/*	private UserList callGetAllUserProcedure() {

		UserList userListObj = new UserList();
		CallableStatement cs = null;
		Connection con = ConnectionFactory.getConnection();

		try {

			cs = con.prepareCall("{call getAllUsers()}");
			ResultSet rs = cs.executeQuery();
			List<UserInfo> userInfoList = new ArrayList<UserInfo>();
			while (rs.next()) {
				UserInfo userInfo = new UserInfo();
				userInfo.setUserName(rs.getString("userName"));
				userInfo.setUserID(rs.getString("userID"));
				userInfo.setPassword(rs.getString("password"));
				userInfoList.add(userInfo);
			}
			userListObj.setUserList(userInfoList);

		} catch (SQLException e) {
			System.err.println("SQLException: " + e.getMessage());
		} finally {
			if (cs != null) {
				try {
					cs.close();
				} catch (SQLException e) {
					System.err.println("SQLException: " + e.getMessage());
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.err.println("SQLException: " + e.getMessage());
				}
			}
		}
		return userListObj;
	}*/
	
    private String readFileToString(File fileToRead,
            String contentEncodingTobeUsed) {

        FileInputStream fis = null;
        FileChannel channel = null;
        ByteBuffer buf = null;
        String sb = null;
        try {

            fis = new FileInputStream(fileToRead);
            channel = fis.getChannel();
            buf = ByteBuffer.allocateDirect((int) channel.size());
            channel.read(buf);
            buf.rewind();
            sb = Charset.forName(contentEncodingTobeUsed).decode(buf)
                    .toString();
            buf.flip();
        } catch (Exception ioexception) {
        	ioexception.printStackTrace();

        } finally {
            try {
                if(channel != null){
                    channel.close();
                }
                if(fis != null){
                    fis.close();
                }
            } catch(IOException e) {
                sb = fileToRead.getAbsolutePath();
            }
        }

        return sb;
    }
    
    private String getFilePath(RequestParam requestParam){
    	
    	//String filePath = "WEB-INF/../WebContent/WEB-INF/ResponseData/Cache/CachedData.xml";
    	//String filePath = "..\\helperClasses\\CachedData.xml";
    	
    	String home="../webapps/medloc/WEB-INF/classes/";
		String filePath = "config/ResponseData/Cache/CachedData.xml";
    	
    	String filterType = requestParam.getFilterType();
    	
    	if (filterType.equalsIgnoreCase("Product")){
    		
    		/*if (requestParam.getSearchString()!=null && !requestParam.getSearchString().isEmpty()){
    			searchParamProvided = "1";*/
    			if (requestParam.getProductID()!=null){
    				
    				filePath = "config/ResponseData/SearchByProduct/SBPS2.xml";
    			}
    			else{
    				
    				filePath = "config/ResponseData/SearchByProduct/SBPS1.xml" ;
    				
    			}
    			

    		//}
    		
    	}
    	else if (filterType.equalsIgnoreCase("Company")) {
    		
    		/*if (requestParam.getSearchString()!=null && !requestParam.getSearchString().isEmpty()){
    			searchParamProvided = "1";*/
    			if (requestParam.getCompanyID()!=null && requestParam.getStockistID()!=null){
    				
    				filePath = "config/ResponseData/SearchByCompany/SBCS3.xml";
    			}
    			else if(requestParam.getCompanyID()!=null && requestParam.getStockistID()==null){
    				
    				filePath = "config/ResponseData/SearchByCompany/SBCS2.xml" ;
    				
    			}
    			else {
    				filePath = "config/ResponseData/SearchByCompany/SBCS1.xml" ;
    			}
    		//}
			
		}
    	else if (filterType.equalsIgnoreCase("Stockist")) {
    		
/*    		if (requestParam.getSearchString()!=null && !requestParam.getSearchString().isEmpty()){
    			searchParamProvided = "1";*/
    			
    			filePath = "config/ResponseData/SearchByStockist/SBSS1.xml" ;
    			
    		//}
			
		}
    	
    	// for FavList 
    	
		if (requestParam.getSearchString()!=null && requestParam.getSearchString().equalsIgnoreCase("FAV")){
			
			filePath = "config/ResponseData/Fav/FavData.xml";
		}
    	
    	return home+filePath;
    	
    }
}
