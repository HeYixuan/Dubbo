package org.springframe.system.service;

import java.io.Serializable;

import org.springframe.system.model.SystemRole;

public interface SystemRoleService {
	/**
	 * 角色新增
	 * @param role
	 */
	public Serializable save(SystemRole role);
}
