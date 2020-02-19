package com.example.demo.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Login;

@Repository
public class Connect2Table {

	@Autowired
    EntityManager entityManager;
	
	public List<Login> connect()
	{List<Login> ll= null;
		try {
			
			String sql =  "select ll from "+Login.class.getName() +" ll";
			Query query =  entityManager.createNamedQuery(sql);
			 ll = query.getResultList();
			
			System.out.println("===="+ll);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return ll;
	}
	
}
