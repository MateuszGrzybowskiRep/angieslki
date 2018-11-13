package andrzej.dupa.service;


import andrzej.dupa.dto.EmployeeDto;
import andrzej.dupa.model.Employee;
import andrzej.dupa.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void removeEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public long addEmployee(EmployeeDto employee) {

        Employee employeeEntitiy = new Employee();
        employeeEntitiy.setEmail(employee.getEmail());
        employeeEntitiy.setName(employee.getName());
        employeeEntitiy.setLastName(employee.getLastName());
        employeeEntitiy.setActive("on".equals(employee.getActive()));
        employeeEntitiy.setPhone(employee.getPhone());

        return employeeRepository.save(employeeEntitiy).getId();

    }


}