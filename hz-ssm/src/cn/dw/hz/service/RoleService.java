/**
 *
 */
package cn.dw.hz.service;

import java.util.List;

import cn.dw.hz.dao.RoleMapper;
import cn.dw.hz.model.Role;

/**
 * @author aubrey
 * @date  上午10:45:54
 * 
 */
public interface RoleService {
	public void add(Role role);
	public void update(Role role);
	public void delete(Role role);
	public List<Role> query(Role role);
}
