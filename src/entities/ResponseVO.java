package entities;

public class ResponseVO {
	
	private ListDetailVO Product ;
	private ListDetailVO Company ;
	private ListDetailVO Stockist ;
	private ListDetailVO Location ;
	private String totalNoOfRecords;
	private String noRecordsReturned;
	private String noRecordsToBeReturned;
	private String defaultPageSize;
	public ListDetailVO getProduct() {
		return Product;
	}
	public void setProduct(ListDetailVO product) {
		Product = product;
	}
	public ListDetailVO getCompany() {
		return Company;
	}
	public void setCompany(ListDetailVO company) {
		Company = company;
	}
	public ListDetailVO getStockist() {
		return Stockist;
	}
	public void setStockist(ListDetailVO stockist) {
		Stockist = stockist;
	}
	public ListDetailVO getLocation() {
		return Location;
	}
	public void setLocation(ListDetailVO location) {
		Location = location;
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
	

	
	

}
