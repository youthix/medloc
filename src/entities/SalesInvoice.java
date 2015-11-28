package entities;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "salesInvoiceDetails")
public class SalesInvoice {
	
	private String invoiceNo;
	private String invoiceDate;
	private String customerName;
	private String billAmount;
	private List <MedicineInfo> medicineDetails ;
	private String totalItemNo;
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}
	public List<MedicineInfo> getMedicineDetails() {
		return medicineDetails;
	}
	public void setMedicineDetails(List<MedicineInfo> medicineDetails) {
		this.medicineDetails = medicineDetails;
	}
	public String getTotalItemNo() {
		return totalItemNo;
	}
	public void setTotalItemNo(String totalItemNo) {
		this.totalItemNo = totalItemNo;
	}
	
	
	

}
