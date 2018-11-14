package pl.mgrzybowski.service;

import java.util.List;

import pl.mgrzybowski.dto.EmployeeDto;
import pl.mgrzybowski.model.User;

public interface UserService {

     List<User> getAllEmployees();
     void removeEmployee(Long id);
     long addEmployee(EmployeeDto employee);


}