package com.bhoj.java.stuff.hibernate.table.per.concrete;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Bhoj Sao
 *
 */
@Entity
@Table(name="REGULAREMPLOYEE102")
@AttributeOverrides({
	@AttributeOverride(name="id",column = @Column(name="id")),
	@AttributeOverride(name="name", column=@Column(name="name"))  
})
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
