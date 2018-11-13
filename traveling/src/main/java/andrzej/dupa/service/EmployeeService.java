package andrzej.dupa.service;

import java.util.List;
import java.util.Optional;

import andrzej.dupa.dto.EmployeeDto;
import andrzej.dupa.model.Employee;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public void removeEmployee(Long id);
    public long addEmployee(EmployeeDto employee);


}