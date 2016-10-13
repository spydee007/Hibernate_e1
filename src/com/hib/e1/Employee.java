/**
 * 
 */
package com.hib.e1;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import org.hibernate.annotations.*;
/**
 * @author mshaikh
 *
 */
@Entity
@DynamicUpdate(value = true)
//@SelectBeforeUpdate(value = true)
@Table(name="H_EMPLOYEE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE" , discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value = "employee")
public class Employee {

	/**
	 * 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@SequenceGenerator(name = "seq" , sequenceName = "Sequence_empid" , allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE , generator = "seq" )
	@Column(name="ID" , unique=true , nullable=false)
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
