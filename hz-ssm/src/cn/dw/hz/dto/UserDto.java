/**
 *
 */
package cn.dw.hz.dto;

import java.util.Date;

import cn.dw.hz.model.User;

/**
 * @author aubrey
 * @date  下午5:08:21
 * 
 */
public class UserDto extends User {
	private Date startTime;
	
	private Date endTime;

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	
	
}
