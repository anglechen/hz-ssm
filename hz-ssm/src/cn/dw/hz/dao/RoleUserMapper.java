/**
 *
 */
package cn.dw.hz.dao;

import java.util.List;

import cn.dw.hz.model.RoleUser;

/**
 * @author aubrey
 * @date  上午10:37:12
 * 
 */
public interface RoleUserMapper {
	public void add(RoleUser roleUser);
	public void update(RoleUser roleUser);
	public void delete(RoleUser roleUser);
	public List<RoleUser> query(RoleUser roleUser);
}
