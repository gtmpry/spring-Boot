package com.javtpoint;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
@Entity  
public class UserRecord {  
    @Id  
    private String id;  
    private String name;  
    private String email;  
    private Long mobile;
    private String password;
  
    public String getId() {  
        return id;  
    }  
    public void setId(String id) {  
        this.id = id;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getEmail() {  
        return email;  
    }  
    public void setEmail(String email) {  
        this.email = email;  
    }
	/**
	 * @return the mobile
	 */
	public Long getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}  
	
	
}  