package hr.tvz.pilizota.managerapp.service;

import hr.tvz.pilizota.managerapp.employee.Employee;
import hr.tvz.pilizota.managerapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee findEmployeeByName(String name){
        return employeeRepository.findEmployeeByName(name);
    }

    public Employee addEmployee(Employee employee){
        Employee existingEmployee = employeeRepository.findEmployeeByName(employee.getName());
        if (existingEmployee==null){
            return employeeRepository.save(employee);
        }
        else return new Employee();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(String name){
        employeeRepository.deleteEmployeeByName(name);
    }
}
