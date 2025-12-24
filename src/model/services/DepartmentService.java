package model.services;


import java.util.List;

import model.dao.DaoFactory;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class DepartmentService {

	private DepartmentDaoJDBC dao = (DepartmentDaoJDBC) DaoFactory.createDepartmentDao();
	
	public List<Department> findAll(){
		
		
		return dao.findAll();
	}
	
}
