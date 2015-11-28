package entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "invoiceDetails")
public class Invoice
{

    private String inVoiceNo;
    private String inVoiceDate;
    private String billAmount;
    private String totalItems;

    public Invoice()
    {
    }

    public String getInVoiceNo()
    {
        return inVoiceNo;
    }

    public void setInVoiceNo(String inVoiceNo)
    {
        this.inVoiceNo = inVoiceNo;
    }

    public String getInVoiceDate()
    {
        return inVoiceDate;
    }

    public void setInVoiceDate(String inVoiceDate)
    {
        this.inVoiceDate = inVoiceDate;
    }

    public String getBillAmount()
    {
        return billAmount;
    }

    public void setBillAmount(String billAmount)
    {
        this.billAmount = billAmount;
    }

    public String getTotalItems()
    {
        return totalItems;
    }

    public void setTotalItems(String totalItems)
    {
        this.totalItems = totalItems;
    }
}
