package org.springframe.system.dao;

import java.io.Serializable;
import org.springframe.system.model.SystemRole;

public interface SystemRoleDao {
	/**
	 * 角色新增
	 * @param role
	 */
	public Serializable save(SystemRole role);
}
