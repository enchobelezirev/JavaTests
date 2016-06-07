package com.team.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.team.model.Student;

public class StudentDao {
	private static EntityManagerFactory managerFactory = Persistence
			.createEntityManagerFactory("uni-sys-jpa");

	public Student add(Student s) {
		EntityManager manager = getManager();
		try {
			manager.getTransaction().begin();
			manager.persist(s);
			manager.getTransaction().commit();
			return s;
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Student get(int id) {
		EntityManager manager = getManager();
		try {
			return manager.find(Student.class, id);
		} catch (Exception e) {
			throw e;
		}
	}

	private EntityManager getManager() {
		return managerFactory.createEntityManager();
	}
}
