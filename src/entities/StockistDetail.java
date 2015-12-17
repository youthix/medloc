package entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "stockistDetail")
public class StockistDetail {
	
    private String stockistId="";
    private String stockistName="";
    private String address="";
    private String contactNumber="";
    private String contactPerson="";
    private String emailID="";
    private String quantity="";
    private String intro="";
    private String offers="";
    private String price="";
    private String logo="";
    private String shortAdd="";
    private String dPrice="";
    private String mrp="";
    private String discPer="";
    
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
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getOffers() {
		return offers;
	}
	public void setOffers(String offers) {
		this.offers = offers;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getShortAdd() {
		return shortAdd;
	}
	public void setShortAdd(String shortAdd) {
		this.shortAdd = shortAdd;
	}
	public String getdPrice() {
		return dPrice;
	}
	public void setdPrice(String dPrice) {
		this.dPrice = dPrice;
	}
	public String getMrp() {
		return mrp;
	}
	public void setMrp(String mrp) {
		this.mrp = mrp;
	}
	public String getDiscPer() {
		return discPer;
	}
	public void setDiscPer(String discPer) {
		this.discPer = discPer;
	}	
}
