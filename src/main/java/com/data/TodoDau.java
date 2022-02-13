package com.data;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.entities.Todo;

@Component
public class TodoDau {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int save(Todo t) {
		
		return (Integer) this.hibernateTemplate.save(t);
		
	}
	
	public List<Todo> getAll(){
		
		return this.hibernateTemplate.loadAll(Todo.class); 
	}

}
