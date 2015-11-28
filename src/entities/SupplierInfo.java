package entities;

import javax.xml.bind.annotation.XmlRootElement;

import entities.commonObjects.ContactDetails;

@XmlRootElement(name = "supplierInfo")
public class SupplierInfo
{

    private String supplierName;
    private String drugLicencseNO;
    private String tinNO;
    private String remarks;
    private ContactDetails contactDetails;


    public SupplierInfo()
    {
    }

    public String getSupplierName()
    {
        return supplierName;
    }

    public void setSupplierName(String supplierName)
    {
        this.supplierName = supplierName;
    }

	public String getDrugLicencseNO() {
		return drugLicencseNO;
	}

	public void setDrugLicencseNO(String drugLicencseNO) {
		this.drugLicencseNO = drugLicencseNO;
	}

	public String getTinNO() {
		return tinNO;
	}

	public void setTinNO(String tinNO) {
		this.tinNO = tinNO;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

    


}
