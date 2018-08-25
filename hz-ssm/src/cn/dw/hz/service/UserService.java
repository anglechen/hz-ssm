/**
 *
 */
package cn.dw.hz.service;

import java.util.List;

import cn.dw.hz.model.User;

/**
 * @author aubrey
 * @date  上午10:45:45
 * 
 */
public interface UserService {

	public void add(User user);
	public void update(User user);
	public void delete(User user);
	public List<User> query(User user);
}
