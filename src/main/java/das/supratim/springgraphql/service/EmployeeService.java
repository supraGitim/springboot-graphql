package das.supratim.springgraphql.service;

import das.supratim.springgraphql.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(Long id);
}
