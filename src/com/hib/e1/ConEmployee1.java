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
@Table(name="conemployee1")
@PrimaryKeyJoinColumns(value = { @PrimaryKeyJoinColumn(name = "ID") })
//@AttributeOverrides(value = { @AttributeOverride(column = @Column(name="ID"), name = "ID") , @AttributeOverride(column = @Column(name="NAME"), name = "NAME") })
public class ConEmployee1 extends Employee1{

	/**
	 * 
	 */
	public ConEmployee1() {
		// TODO Auto-generated constructor stub
	}
	
	@Column(name="PAY_PER_HRS")
	private double pay_per_hrs;
	
	@Column(name="CONTRACT_DURATION")
	private String contract_duration;

	/**
	 * @return the pay_per_hrs
	 */
	public double getPay_per_hrs() {
		return pay_per_hrs;
	}

	/**
	 * @param pay_per_hrs the pay_per_hrs to set
	 */
	public void setPay_per_hrs(double pay_per_hrs) {
		this.pay_per_hrs = pay_per_hrs;
	}

	/**
	 * @return the contract_duration
	 */
	public String getContract_duration() {
		return contract_duration;
	}

	/**
	 * @param contract_duration the contract_duration to set
	 */
	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}

	
}
