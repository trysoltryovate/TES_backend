//package com.example.service;
//
//import com.example.entity.Employee;
//
//import java.util.List;
//
//public interface EmployeeService {
//
//    public Employee saveEmployee(Employee employee);
//
//    public List<Employee> getAll();
//
//    public Employee get(long id);
//
//    public Employee updateEmployee(long id, Employee employee);
//
//    public boolean deleteEmployee(long id);
//}
package com.example.service;

import com.example.dto.EmployeeDto;
import com.example.entity.Employee;
import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(EmployeeDto employeeDto);
    Employee get(long id);
    Employee updateEmployee(long id, EmployeeDto dto);
    boolean deleteEmployee(long id);
    List<Employee> getAll();
}
