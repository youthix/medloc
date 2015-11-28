package entities.commonObjects;


//@XmlRootElement(name = "contactDetails")
public class ContactDetails {
	
    private String address;
    private String contactNo;
    private String emailAddress;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
    
    

}
