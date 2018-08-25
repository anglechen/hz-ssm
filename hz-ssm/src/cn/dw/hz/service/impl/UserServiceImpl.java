/**
 *
 */
package cn.dw.hz.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dw.hz.dao.UserMapper;
import cn.dw.hz.model.User;
import cn.dw.hz.service.UserService;

/**
 * @author aubrey
 * @date  上午10:52:51
 * 
 */
@Service
public class UserServiceImpl implements UserService {
	
	/*先按类型名字，再类型*/
//	@Resource("userMapper")
	
	/*先按类型查找，再按名字*/
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void add(User user) {
		userMapper.add(user);
	}

	@Override
	public void update(User user) {
		userMapper.update(user);
	}

	@Override
	public void delete(User user) {
		userMapper.delete(user);
	}
	@Override
	public List<User> query(User user) {
		return userMapper.query(user);
	}

}
