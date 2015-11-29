package entities;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "responseData")
public class ResponseData {
	
	private ListProductDetail listProductDetail ;
	private ListCompanyDetail listCompanyDetail ;
	private ListStockistDetail listStockistDetail ;
	private ListLocationDetail listLocationDetail ;
	private String totalNoOfRecords;
	private String noRecordsReturned;
	private String noRecordsToBeReturned;
	private String defaultPageSize;
	
	public ListProductDetail getListProductDetail() {

		return listProductDetail;
	}
	public void setListProductDetail(ListProductDetail listProductDetail) {
		this.listProductDetail = listProductDetail;
	}
	public ListCompanyDetail getListCompanyDetail() {
		
		return listCompanyDetail;
	}
	public void setListCompanyDetail(ListCompanyDetail listCompanyDetail) {
		this.listCompanyDetail = listCompanyDetail;
	}
	public ListStockistDetail getListStockistDetail() {

		return listStockistDetail;
	}
	public void setListStockistDetail(ListStockistDetail listStockistDetail) {
		this.listStockistDetail = listStockistDetail;
	}
	public String getTotalNoOfRecords() {
		return totalNoOfRecords;
	}
	public void setTotalNoOfRecords(String totalNoOfRecords) {
		this.totalNoOfRecords = totalNoOfRecords;
	}
	public String getNoRecordsReturned() {
		return noRecordsReturned;
	}
	public void setNoRecordsReturned(String noRecordsReturned) {
		this.noRecordsReturned = noRecordsReturned;
	}
	public String getNoRecordsToBeReturned() {
		return noRecordsToBeReturned;
	}
	public void setNoRecordsToBeReturned(String noRecordsToBeReturned) {
		this.noRecordsToBeReturned = noRecordsToBeReturned;
	}
	public String getDefaultPageSize() {
		return defaultPageSize;
	}
	public void setDefaultPageSize(String defaultPageSize) {
		this.defaultPageSize = defaultPageSize;
	}
	public ListLocationDetail getListLocationDetail() {

		return listLocationDetail;
	}
	public void setListLocationDetail(ListLocationDetail listLocationDetail) {
		this.listLocationDetail = listLocationDetail;
	}

	
	
	

}
