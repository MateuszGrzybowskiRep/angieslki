package andrzej.dupa.service;

import java.util.List;
import java.util.Optional;

import andrzej.dupa.model.Employee;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public void removeEmployee(Long id);

    public Optional<Employee> getEmployeeById(long id);

}