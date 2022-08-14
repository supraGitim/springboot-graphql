package das.supratim.springgraphql.service;

import das.supratim.springgraphql.model.Employee;
import das.supratim.springgraphql.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }

    @PostConstruct
    private void saveDummyData(){
        employeeRepo.save(new Employee("Ram","ram@mail.com"));
        employeeRepo.save(new Employee("Shyam","shyam@mail.com"));
        employeeRepo.save(new Employee("Jodu","jodu@mail.com"));
        employeeRepo.save(new Employee("Madhu","madhu@mail.com"));
    }

}
