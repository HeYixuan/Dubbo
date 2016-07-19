package org.springframe.system.service.impl;

import java.io.Serializable;

import org.springframe.system.dao.SystemUserDao;
import org.springframe.system.model.SystemUser;
import org.springframe.system.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SystemUserServiceImpl implements SystemUserService {
	@Autowired
	private SystemUserDao systemUserDao;

	public SystemUser loadByUsername(String username) {
		return systemUserDao.loadByUsername(username);
	}

	public Serializable save(SystemUser systemUser) {
		return systemUserDao.save(systemUser);
	}

	
}
