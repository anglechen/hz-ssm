/**
 *
 */
package cn.dw.hz.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author aubrey
 * @date  上午10:06:53
 * 
 */
public class User {
	
	private Integer id;
	private String name;
	private String loginId;
	private Integer sex;
	private Integer age;
	private String password;
	
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	private Date registerTime;
	
	
	private Integer status;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	
	

}
