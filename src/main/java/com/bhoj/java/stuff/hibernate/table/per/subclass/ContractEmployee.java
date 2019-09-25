package com.bhoj.java.stuff.hibernate.table.per.subclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author Bhoj Sao
 *
 */
@Entity
@Table(name="CONTRACTEMPLOYEE103")
@PrimaryKeyJoinColumn(name="ID") 
public class ContractEmployee extends Employee {
	@Column(name="PAY_PER_HOUR")  
    private float payPerHour;  
      
    @Column(name="CONTRACT_DURATION")  
    private String contractDuration;

	public float getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(float payPerHour) {
		this.payPerHour = payPerHour;
	}

	public String getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}  
}
