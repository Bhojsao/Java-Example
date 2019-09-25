package com.bhoj.java.stuff.hibernate.able.per.hierarchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Bhoj Sao
 *
 */
@Entity
@DiscriminatorValue("CONTRACTEMPLOYEE")
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
