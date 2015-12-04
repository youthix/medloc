package entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "preferences")
public class Preferences {
	
	public String location="";
	public String emailNotify="";
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmailNotify() {
		return emailNotify;
	}
	public void setEmailNotify(String emailNotify) {
		this.emailNotify = emailNotify;
	}	

}
