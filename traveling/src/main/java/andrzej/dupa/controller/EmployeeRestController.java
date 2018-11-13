package andrzej.dupa.controller;

import java.util.List;

import andrzej.dupa.dto.EmployeeDto;
import andrzej.dupa.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import andrzej.dupa.model.Employee;
import andrzej.dupa.service.EmployeeService;

@RestController
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(path="/employees", method=RequestMethod.GET)
    public List<EmployeeDto> getAllEmployees(){
        List<Employee> allEmployees = employeeService.getAllEmployees();
        EmployeeMapper employeeMapper = new EmployeeMapper();
        return employeeMapper.toDtoList(allEmployees);
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

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public long addEmployee(@RequestBody EmployeeDto employeeDto){

        return employeeService.addEmployee(employeeDto);
    }


}