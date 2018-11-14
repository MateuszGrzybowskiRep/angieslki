package pl.mgrzybowski.service;


import pl.mgrzybowski.dto.EmployeeDto;
import pl.mgrzybowski.model.User;
import pl.mgrzybowski.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository employeeRepository;

    @Override
    public List<User> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void removeEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public long addEmployee(EmployeeDto employee) {

        User employeeEntitiy = new User();
        employeeEntitiy.setEmail(employee.getEmail());
        employeeEntitiy.setName(employee.getName());
        employeeEntitiy.setLastName(employee.getLastName());
        employeeEntitiy.setActive("on".equals(employee.getActive()));
        employeeEntitiy.setPhone(employee.getPhone());

        return employeeRepository.save(employeeEntitiy).getId();

    }


}