package hr.tvz.pilizota.managerapp.repository;

import hr.tvz.pilizota.managerapp.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findEmployeeById(Long id);

    Employee findEmployeeByFirstNameAndLastName(String firstName, String lastName);

    void deleteEmployeeById(Long id);


}
