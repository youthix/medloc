package entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "locationDetail")
public class LocationDetail {
	
    private String locationId;
    private String locationName;
    private String locationPinCode;
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getLocationPinCode() {
		return locationPinCode;
	}
	public void setLocationPinCode(String locationPinCode) {
		this.locationPinCode = locationPinCode;
	}
    

}
