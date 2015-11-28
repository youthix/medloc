package entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "stockistDetail")
public class StockistDetail {
	
    private String stockistId;
    private String stockistName;
    private String address;
    private String contactNumber;
    private String contactPerson;
    private String emailID;
    private String quantity;
	public String getStockistId() {
		return stockistId;
	}
	public void setStockistId(String stockistId) {
		this.stockistId = stockistId;
	}
	public String getStockistName() {
		return stockistName;
	}
	public void setStockistName(String stockistName) {
		this.stockistName = stockistName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
    
    

}
