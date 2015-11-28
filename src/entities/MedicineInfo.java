package entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "medicineInfo")
public class MedicineInfo
{

    private String productId;
    private String productName;
    private String batchNo;
    private String companyName;
    private String printPrice;
    private String purchasePrice;
    private String companyDiscountOnPurchase;
    private String discountonSale;
    private String purchaseInvoice;
    private String unitsInStock;
    private String expiryDate;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPrintPrice() {
		return printPrice;
	}
	public void setPrintPrice(String printPrice) {
		this.printPrice = printPrice;
	}
	public String getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public String getCompanyDiscountOnPurchase() {
		return companyDiscountOnPurchase;
	}
	public void setCompanyDiscountOnPurchase(String companyDiscountOnPurchase) {
		this.companyDiscountOnPurchase = companyDiscountOnPurchase;
	}
	public String getDiscountonSale() {
		return discountonSale;
	}
	public void setDiscountonSale(String discountonSale) {
		this.discountonSale = discountonSale;
	}
	public String getPurchaseInvoice() {
		return purchaseInvoice;
	}
	public void setPurchaseInvoice(String purchaseInvoice) {
		this.purchaseInvoice = purchaseInvoice;
	}
	public String getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(String unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
    
    

    
    
}
