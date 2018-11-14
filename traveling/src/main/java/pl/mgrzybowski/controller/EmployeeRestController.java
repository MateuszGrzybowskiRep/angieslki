package pl.mgrzybowski.controller;

import java.util.List;

import pl.mgrzybowski.dto.EmployeeDto;
import pl.mgrzybowski.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pl.mgrzybowski.model.User;
import pl.mgrzybowski.service.UserService;

@RestController
public class EmployeeRestController {

    @Autowired
    private UserService employeeService;

    @RequestMapping(path="/employees", method=RequestMethod.GET)
    public List<EmployeeDto> getAllEmployees(){
        List<User> allEmployees = employeeService.getAllEmployees();
        EmployeeMapper employeeMapper = new EmployeeMapper();
        return employeeMapper.toDtoList(allEmployees);
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public User getEmployeeById(@PathVariable("id") long id){
        return null;
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
    public String removeEmployee(@PathVariable("id") long id){

        employeeService.removeEmployee(id);

        return "Remove employee has been succeed!!!" + id;
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public long addEmployee(@RequestBody EmployeeDto employeeDto){

        return employeeService.addEmployee(employeeDto);
    }


}