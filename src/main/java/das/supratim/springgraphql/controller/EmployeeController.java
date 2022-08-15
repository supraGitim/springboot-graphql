package das.supratim.springgraphql.controller;

import das.supratim.springgraphql.model.Employee;
import das.supratim.springgraphql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @QueryMapping
    public List<Employee> getAllEmployees(){
        System.out.println(employeeService.getAllEmployees());
        return employeeService.getAllEmployees();
    }

    @QueryMapping("getEmployee")
    public Optional<Employee> getEmployeeById(@Argument Long id){
        return employeeService.getEmployeeById(id);
    }
}
