package com.humanresourcesproject.humanresourcesproject.users;
import java.util.List;
import com.humanresourcesproject.humanresourcesproject.modelClasses.Employee;

public abstract class User {
	
	public abstract Employee addEmployee(Employee employee);
	
	public abstract List<Employee> viewAllEmployees();
	
	public abstract List<Employee> findByLocation(String location);
	
	public abstract Employee findById(Long id);
	
	public abstract Employee editEmployee(Employee employee);
	
	public abstract void deleteEmployee(Long id);
		
	public abstract Employee moveEmployeeLocation(Employee employee);
}
