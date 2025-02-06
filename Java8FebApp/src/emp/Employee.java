package emp;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/*
 * Below is a Java code snippet that filters a list of employees based on the given 
 * criteria: name starts with 'R', age between 30 and 50 years, and salary greater than 40,000.
 */
public class Employee {

	private String id;
	private String name;
	private LocalDate dob;
	private String dept;
	private double salary;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public int getAge() {
		return Period.between(this.dob, LocalDate.now()).getYears();
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", dept=" + dept + ", salary=" + salary + "]";
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String id, String name, LocalDate dob, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.dept = dept;
		this.salary = salary;
	}

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("1", "Babu M", LocalDate.of(1981, 8, 8), "Computer Consultancy", 10000));
		empList.add(new Employee("2", "Ram MJ", LocalDate.of(1983, 1, 1), "Mechanical", 50000));
		empList.add(new Employee("3", "Ravi K", LocalDate.of(2000, 10, 10), "Computer", 45000));
		empList.add(new Employee("4", "Viji M", LocalDate.of(1982, 11, 11), "Retails", 30000));
		empList.add(new Employee("4", "Ragavendra M", LocalDate.of(1992, 2, 6), "IT", 60000));
		
		empList.stream().filter(e->e.getName().startsWith("R"))
		.filter(s->s.getSalary()>40000)
		.filter(a->(30<=a.getAge() && a.getAge()<=40)).forEach(System.out::println);
	}

}
