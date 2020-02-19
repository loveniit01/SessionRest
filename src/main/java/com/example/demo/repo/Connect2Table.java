package com.example.demo.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Connect2Table {

	@Autowired
    EntityManager entityManager;
	
	public List<Object> connect()
	{List<Object> ll= null;
		try {
			
			String sql =  "select * from login";
			Query query =  entityManager.createNativeQuery(sql);
			 ll = query.getResultList();
			
			System.out.println("===="+ll);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return ll;
	}
	
}
