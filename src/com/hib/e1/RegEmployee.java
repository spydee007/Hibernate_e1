/**
 * 
 */
package com.hib.e1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author mshaikh
 *
 */
@Entity
@DiscriminatorValue(value = "regemployee")
public class RegEmployee extends Employee {

	/**
	 * 
	 */
	public RegEmployee() {
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
