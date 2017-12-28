package cn.et.hibernate;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.et.hibernate.dao.Foods;

public class TestHibernate {
	public static void main(String[] args) {
		queryFood();
	}
	public static void saveFood(){
		Session session = HibernateSessionFactory.getSession();
		Foods food = new Foods();
		food.setFoodname("≤£¡ß");
		food.setPrice(10.0);
		session.getTransaction().begin();
		session.save(food);
		session.getTransaction().commit();
	}
	public static void deleteFood(){
		Session session = HibernateSessionFactory.getSession();
		Foods food = new Foods();
		food.setFoodid(11);
		session.getTransaction().begin();
		session.delete(food);
		session.getTransaction().commit();
	}
	public static void updateFood(){
		Session session = HibernateSessionFactory.getSession();
		Foods food = new Foods();
		food.setFoodid(8);
		food.setFoodname("ƒ„∫√");
		food.setPrice(99.0);
		session.getTransaction().begin();
		session.update(food);
		session.getTransaction().commit();
	}
	
	public static void queryFood(){
		Session session = HibernateSessionFactory.getSession();
		Foods food = (Foods)session.load(Foods.class, 2);
		System.out.println(food.getFoodname());
		
		//hsql”Ô—‘
		Query query=session.createQuery("from Foods where foodname like '%«‡%'");
		List<Foods> foodList=query.list();
		System.out.println(foodList.size());
	}
}
