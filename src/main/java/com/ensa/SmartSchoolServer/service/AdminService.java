package com.ensa.SmartSchoolServer.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ensa.SmartSchoolServer.dao.AdminDao;
import com.ensa.SmartSchoolServer.entity.Admin;


@Component
public class AdminService {

	private AdminDao adminDao;

	@Autowired
	public AdminService(AdminDao adminDao) {
		super();
		this.adminDao = adminDao;
	}

	public List<Admin> getAdmins() {

		return this.adminDao.getAdmins();
	}
public Admin getAdmin(String username) {
		return this.adminDao.getAdmin(username);
	}

	public Admin create(Admin admin) {

		return adminDao.create(admin);
	}

	public Admin updateUsername(Admin admin, String username) {

		return adminDao.updateUsername(admin, username);
	}
	
	public boolean updatePassword(Admin admin, String password) {

		return adminDao.updatePassword(admin, password);
	}
   
    public boolean authenticate(String username, String password) {
		
		
		Admin admin = adminDao.getAdmin(username);
		if(admin.equals(null)) {
			return false;
		}
		return admin.getPassword().equals(password) ;
	}
    
    public Admin delete(Admin admin) {
		return adminDao.delete(admin);
	}
}