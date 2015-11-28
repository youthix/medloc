package entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "userInfo")
public class UserInfo
{

    private String userName;
    private String password;
    private String userID;
    private String role;
    private String lastLoginTimeStamp;
    

    public UserInfo()
    {
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getUserID()
    {
        return userID;
    }

    public void setUserID(String userID)
    {
        this.userID = userID;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

	public String getLastLoginTimeStamp() {
		return lastLoginTimeStamp;
	}

	public void setLastLoginTimeStamp(String lastLoginTimeStamp) {
		this.lastLoginTimeStamp = lastLoginTimeStamp;
	}
    
    
}
