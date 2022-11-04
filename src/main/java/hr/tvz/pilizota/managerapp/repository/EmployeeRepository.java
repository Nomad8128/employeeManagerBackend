package hr.tvz.pilizota.managerapp.repository;

import hr.tvz.pilizota.managerapp.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findEmployeeByName(String name);
    void deleteEmployeeByName(String name);


}
