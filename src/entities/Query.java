package entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "query")
public class Query {
	
	public String queryTxt="";
	public String fromMail="";
	public String fromNumber="";
	
	public String getQueryTxt() {
		return queryTxt;
	}
	public void setQueryTxt(String queryTxt) {
		this.queryTxt = queryTxt;
	}
	public String getFromMail() {
		return fromMail;
	}
	public void setFromMail(String fromMail) {
		this.fromMail = fromMail;
	}
	public String getFromNumber() {
		return fromNumber;
	}
	public void setFromNumber(String fromNumber) {
		this.fromNumber = fromNumber;
	}

}
