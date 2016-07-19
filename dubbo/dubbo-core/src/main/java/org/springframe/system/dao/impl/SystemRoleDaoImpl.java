package org.springframe.system.dao.impl;

import java.io.Serializable;

import org.springframe.base.BaseDao;
import org.springframe.system.dao.SystemRoleDao;
import org.springframe.system.model.SystemRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SystemRoleDaoImpl implements SystemRoleDao {
	@Autowired
	private BaseDao<SystemRole>  baseDao;

	public Serializable save(SystemRole role) {
		return baseDao.save(role);
	}
	
}
