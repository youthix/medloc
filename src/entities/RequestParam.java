package entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "requestParam")
public class RequestParam {

    private String searchString;
    private String filterType;
    private String pageNo;
    private String productID;
    private String companyID;
    private String stockistID;
	public String getSearchString() {
		return searchString;
	}
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
	public String getFilterType() {
		return filterType;
	}
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}
	public String getPageNo() {
		return pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getCompanyID() {
		return companyID;
	}
	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}
	public String getStockistID() {
		return stockistID;
	}
	public void setStockistID(String stockistID) {
		this.stockistID = stockistID;
	}

    
    
    


}
