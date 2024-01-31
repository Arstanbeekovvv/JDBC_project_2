package jdbc_id.service;

import jdbc_id.models.Employee;
import jdbc_id.models.Job;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    void createEmployee();
    void addEmployee(Employee employee);
    void dropTable();
    void cleanTable();
    void updateEmployee(Long id,Employee employee);
    List<Employee> getAllEmployees();
    Employee findByEmail(String email);
    Map<Employee, Job> getEmployeeById(Long employeeId);
    List<Employee> getEmployeeByPosition(String position);
}
