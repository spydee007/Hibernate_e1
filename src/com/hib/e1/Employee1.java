/**
 * 
 */
package com.hib.e1;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;

/**
 * @author mshaikh
 *
 */
@Entity
@Table(name="EMPLOYEE1")
@DynamicUpdate(value=true)
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy=InheritanceType.JOINED)
public class Employee1 {

	/**
	 * 
	 */
	public Employee1() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@SequenceGenerator(name = "seq" , sequenceName = "SEQUENCE_EMPID", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE , generator = "seq")
	@Column(name="ID" , unique= true , nullable = false )
	private int id;
	
	@Column(name="NAME")
	private String name;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	

}
