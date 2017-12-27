package demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.Query;

import model.Company;
import model.Employee;

public class One2Many5Demo_OK {
	static EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("One2Many5");
	static EntityManager em = factory.createEntityManager();

	public static void main(String[] args) {
		One2Many5Demo_OK sd = new One2Many5Demo_OK();
		createQeryFabric();

		// only Employees
		sd.printResultEmployees();
		
		printAllResult() ;
		
		methClose();
	}

	private static void createQeryFabric() {
		Employee employee1 = new Employee();
		employee1.setName("John");
		employee1.setRole("Analyst");
		employee1.setGrossSalary(45000);

		Employee employee2 = new Employee();
		employee2.setName("Alla");
		employee2.setRole("Buchgalter");
		employee2.setGrossSalary(23000);

		Employee employee3 = new Employee();
		employee3.setName("Marco");
		employee3.setRole("Archithec");
		employee3.setGrossSalary(57000);
		
		Employee employee4 = new Employee();
		employee4.setName("Markus");
		employee4.setRole("Ingenieur");
		employee4.setGrossSalary(98750);

		Company company = new Company();
		company.setCname("Software dev");
		List<Employee> listEmp = new ArrayList<>();
		listEmp.add(employee1);
		listEmp.add(employee2);
		listEmp.add(employee4);
		company.setEmployeesList(listEmp);

		Company company2 = new Company();
		company2.setCname("Software dev");
		List<Employee> listEmp2 = new ArrayList<>();
		listEmp2.add(employee3);
		company2.setEmployeesList(listEmp2);

		System.out.println("insert ok");

		em.getTransaction().begin();

		em.persist(company);
		em.persist(company2);

		em.persist(employee1);
		em.persist(employee2);
		em.persist(employee3);
		em.persist(employee4);
		
		System.out.println("persist");

		em.getTransaction().commit();

		System.out.println("commited");
		
	}

	
	private static void printAllResult() {
		System.out.println("-----all -----");
		Query query = em.createQuery("SELECT c FROM Company As c", Object[].class);
		@SuppressWarnings("unchecked")
		List<Company> list = query.getResultList();

		
		for (Company comp : list) {
			System.out.printf("\nCompany name: %s\n", comp.getCname());
			for (int i = 0; i < comp.getEmployeesList().size(); i++) {
				System.out.printf("Employee name: %s, role: %s, gross salary: %2f\n",

						comp.getEmployeesList().get(i).getName(), 
						comp.getEmployeesList().get(i).getRole(),
						comp.getEmployeesList().get(i).getGrossSalary());
			}
		}
		System.out.println("-----print end ---\n ");
	}
	
	

	
	@SuppressWarnings("unchecked")
	private void printResultEmployees() {
		System.out.println("-----Employee-----");
		Query query = em.createQuery("SELECT c FROM Employee c");

		List<Employee> list = query.getResultList();
		for (Employee comp : list) {
			System.out.printf("\nEmployee id: %d name: %s ;  role: %s \n",

					comp.getEmployee_id(), comp.getName(), comp.getRole());
		}
		
		System.out.println("-----Employee---end\n");

	}

	private static void methClose() {
		try {
			
		} finally {
			em.close();
			factory.close();
			System.out.println("fabric is closed OK");
		}
	}
}
