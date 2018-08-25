/**
 *
 */
package cn.dw.hz.dao;

import java.util.List;

import cn.dw.hz.model.Role;

/**
 * @author aubrey
 * @date  上午10:36:23
 * 
 */
public interface RoleMapper {
	public void add(Role role);
	public void update(Role role);
	public void delete(Role role);
	public List<Role> query(Role role);
}
