package andrzej.dupa.service;

import java.util.List;

import andrzej.dupa.dto.EmployeeDto;
import andrzej.dupa.model.Employee;

public interface EmployeeService {

     List<Employee> getAllEmployees();
     void removeEmployee(Long id);
     long addEmployee(EmployeeDto employee);


}