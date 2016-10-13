/**
 * 
 */
package com.hib.e1;

import javax.persistence.*;


/**
 * @author mshaikh
 *
 */
@Entity
@Table(name="regemployee1")
@PrimaryKeyJoinColumns(value = { @PrimaryKeyJoinColumn(name = "ID") })
//@AttributeOverrides(value = { @AttributeOverride(column = @Column(name="ID"), name = "ID") , @AttributeOverride(column = @Column(name="NAME"), name = "NAME") })
public class RegEmployee1 extends Employee1{

	/**
	 * 
	 */
	public RegEmployee1() {
		// TODO Auto-generated constructor stub
	}
	
	@Column(name="SALARY")
	private double salary;
	
	@Column(name="BONUS")
	private double bonus;

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
}
