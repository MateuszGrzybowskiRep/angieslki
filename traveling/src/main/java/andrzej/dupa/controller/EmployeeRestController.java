package andrzej.dupa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import andrzej.dupa.model.Employee;
import andrzej.dupa.service.EmployeeService;

@RestController
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(path="/employees", method=RequestMethod.GET)
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable("id") long id){
        return null;
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
    public String removeEmployee(@PathVariable("id") long id){

        employeeService.removeEmployee(id);

        return "Remove employee has been succeed!!!" + id;
    }

}