package com.bhoj.java.stuff.hibernate.able.per.hierarchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Bhoj Sao
 *
 */
@Entity
@DiscriminatorValue("REGULAREMPLOYEE")
public class RegularEmployee extends Employee {
	@Column(name="SALARY")    
	private float salary;  
	  
	@Column(name="BONUS")     
	private int bonus;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
