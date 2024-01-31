package jdbc_id;

import jdbc_id.models.Employee;
import jdbc_id.models.Job;
import jdbc_id.service.EmployeeService;
import jdbc_id.service.JobService;
import jdbc_id.service.impl.EmployeeServiceImpl;
import jdbc_id.service.impl.JobServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        JobService jobService = new JobServiceImpl();
        EmployeeService employeeService = new EmployeeServiceImpl();
        // create tables
//        jobService.createJobTable();
//        employeeService.createEmployee();

        // add objects
//        jobService.addJob(new Job());
//        employeeService.addEmployee(new Employee("Mirlan", "Arstanbeekovvv", 21, "m@mgail.com", 1));

        // delete,clean, drop table
//        employeeService.dropTable();
//        employeeService.cleanTable();
//        jobService.deleteDescriptionColumn();

        // update
//        employeeService.updateEmployee(1L, new Employee("Jigit", "Turumbekov", 20, "jigit@gmail.com", 1));
        // select
//        System.out.println(jobService.getJobByEmployeeId(1L));
//        System.out.println(jobService.getJobById(1L));
//        System.out.println(employeeService.getAllEmployees() + "get All");
//        System.out.println(employeeService.getEmployeeById(1L));
//        employeeService.getEmployeeByPosition("Manager");
        System.out.println(jobService.sortByExperience("asc"));
    }
}
