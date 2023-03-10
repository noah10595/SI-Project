package com.humanresourcesproject.humanresourcesproject.users;
import com.humanresourcesproject.humanresourcesproject.repo.EmployeeRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humanresourcesproject.humanresourcesproject.modelClasses.Employee;

@Service
public class HRUser extends User{
	private EmployeeRepository employeeRepo;
		
		@Autowired
		public HRUser(EmployeeRepository employeeRepo) {
			this.employeeRepo = employeeRepo;
	}
		
		public Employee addEmployee(Employee employee) {
			return employeeRepo.save(employee);
		}
		
		public List<Employee> viewAllEmployees(){
			return employeeRepo.findAll();
		}
		
		public List<Employee> findByLocation(String location){
			return employeeRepo.findEmployees(location);
		}
		
		public Employee findById(Long id) {
			return employeeRepo.findEmployee(id);
		}
		
		public Employee editEmployee(Employee employee) {
			return employeeRepo.save(employee);
		}
		
		public void deleteEmployee(Long id) {
			employeeRepo.deleteEmployeeById(id);
		}
		
		public Employee moveEmployeeLocation(Employee employee) {
			return employeeRepo.save(employee);
		}
	
}
