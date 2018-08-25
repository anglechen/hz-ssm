/**
 *
 */
package cn.dw.hz.dao;

import java.util.List;

import cn.dw.hz.model.User;

/**
 * @author aubrey
 * @date  上午10:28:11
 * 
 */
public interface UserMapper {

	public void add(User user);
	public void update(User user);
	public void delete(User user);
	public List<User> query(User user);
	
	
	
	
	
	
	
	
}
