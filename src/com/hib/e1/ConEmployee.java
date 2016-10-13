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
@DiscriminatorValue(value = "conemployee")
public class ConEmployee extends Employee {

	/**
	 * 
	 */
	public ConEmployee() {
		// TODO Auto-generated constructor stub
	}
	@Column(name="PAY_PER_HRS")
	private double payPerHrs;
	
	@Column(name="CONTRACT_DURATION")
	private String contractDur;

	/**
	 * @return the payPerHrs
	 */
	public double getPayPerHrs() {
		return payPerHrs;
	}

	/**
	 * @param payPerHrs the payPerHrs to set
	 */
	public void setPayPerHrs(double payPerHrs) {
		this.payPerHrs = payPerHrs;
	}

	/**
	 * @return the contractDur
	 */
	public String getContractDur() {
		return contractDur;
	}

	/**
	 * @param contractDur the contractDur to set
	 */
	public void setContractDur(String contractDur) {
		this.contractDur = contractDur;
	}
	
	
	

}
