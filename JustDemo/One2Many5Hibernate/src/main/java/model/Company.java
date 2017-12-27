package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// model.Company


@Entity
@Table(name="company", schema = "one2many", catalog = "jpademo")
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long company_id;
	@Column(name = "name") 
	private String cname;
	
	@OneToMany(targetEntity=Employee.class)
	@JoinTable(schema="one2many")
	private List<Employee> employeesList = new ArrayList<>();
	
	
	
	
	public long getCompany_id() {
		return company_id;
	}
	public void setCompany_id(long company_id) {
		this.company_id = company_id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Employee> getEmployeesList() {
		return employeesList;
	}
	public void setEmployeesList(List<Employee> employeesList) {
		this.employeesList = employeesList;
	}
	
	
}
