package ems.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Lab5.Springboot.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	List<Employee> findByName(String employeeFirstName);

}
