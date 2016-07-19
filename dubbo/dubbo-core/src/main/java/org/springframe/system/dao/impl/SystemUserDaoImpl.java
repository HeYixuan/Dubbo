package org.springframe.system.dao.impl;

import java.io.Serializable;

import org.springframe.base.BaseDao;
import org.springframe.system.dao.SystemUserDao;
import org.springframe.system.model.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SystemUserDaoImpl implements SystemUserDao {
	@Autowired
	private BaseDao<SystemUser> baseDao;
	
	public SystemUser loadByUsername(String username) {
		String hql = "From SystemUser where username=?";
		return baseDao.get(hql, new Object[]{username});
	}

	public Serializable save(SystemUser systemUser) {
		return baseDao.save(systemUser);
	}

}
