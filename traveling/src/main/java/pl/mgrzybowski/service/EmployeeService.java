package pl.mgrzybowski.service;

import java.util.List;

import pl.mgrzybowski.dto.EmployeeDto;
import pl.mgrzybowski.model.Employee;

public interface EmployeeService {

     List<Employee> getAllEmployees();
     void removeEmployee(Long id);
     long addEmployee(EmployeeDto employee);


}