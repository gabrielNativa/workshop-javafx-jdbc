package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class SellerService {

	private SellerDaoJDBC dao = (SellerDaoJDBC) DaoFactory.createSellerDao();

	public List<Seller> findAll() {

		return dao.findAll();
	}

	public void saveOrUpdate(Seller obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		} 
		else {
			dao.update(obj);

		}
	}
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}
	

}
