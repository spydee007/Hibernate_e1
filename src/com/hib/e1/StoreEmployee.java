/**
 * 
 */
package com.hib.e1;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author mshaikh
 *
 */

public class StoreEmployee {

	/**
	 * 
	 */
	public StoreEmployee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger(StoreEmployee.class);
		SessionFactory sf;
		try{
		sf = new Configuration().configure().buildSessionFactory();
		logger.info("Session factory created");
		}
		catch(Throwable ex){
			System.err.println("Failed to create session factory object "+ex);
			logger.error("Error encountered in Sessionfactory initialisation "+ex);
			throw new ExceptionInInitializerError();		
		}
		
		Session session = sf.openSession();
		try{
			
			session.beginTransaction();
//			Employee e1 = new Employee();
//			RegEmployee e2 = new RegEmployee();
//			ConEmployee e3 = new ConEmployee();
			Employee1 e1 = new Employee1();
			RegEmployee1 e2 = new RegEmployee1();
			ConEmployee1 e3 = new ConEmployee1();
			
			e1.setName("Khalid");
			
			e2.setName("Spy");
			e2.setSalary(1509.54);
			e2.setBonus(100.35);
			
			e3.setName("Spydee");
			e3.setPay_per_hrs(10.5);
			e3.setContract_duration("10 Hours");
			int i ;
			i = (Integer)session.save(e1);
			System.out.println("e1 "+i);
			i = (Integer)session.save(e2);
			System.out.println("e2 "+i);
			i = (Integer)session.save(e3);
			System.out.println("e3 "+i);
			session.getTransaction().commit();
			logger.info("records pushed to tables ");
			
		}
		catch(HibernateException e){
			e.printStackTrace();
			logger.error("Error encountered in session initialisation "+e);
		}
		finally{
			//session.flush();
			session.close();
			logger.info("session closed successfully");
		}

	}

}
