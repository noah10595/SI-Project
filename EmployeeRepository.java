package com.humanresourcesproject.humanresourcesproject.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.humanresourcesproject.humanresourcesproject.modelClasses.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	void deleteEmployeeById(Long id);

	List<Employee> findEmployees(String location);

	Employee findEmployee(Long id);

}
