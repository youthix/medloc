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
    private String locationID;
    private String productName;
    private String companyName;
    private String stockistName;
    private String locationName;
    private String pinCode;
    private String potency;
    
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
	public String getLocationID() {
		return locationID;
	}
	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStockistName() {
		return stockistName;
	}
	public void setStockistName(String stockistName) {
		this.stockistName = stockistName;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getPotency() {
		return potency;
	}
	public void setPotency(String potency) {
		this.potency = potency;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}
