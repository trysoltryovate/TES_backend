
package com.example.controller;

import com.example.dto.EmployeeDto;
import com.example.entity.Employee;
import com.example.exceptions.UserAlreadyExist;
import com.example.exceptions.UserAlreadyExist;
import com.example.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee-save")
    public Employee save(@RequestBody EmployeeDto dto) throws com.example.exceptions.UserAlreadyExist {
        return employeeService.saveEmployee(dto);
    }

    @GetMapping("/get/{id}")
    public Employee get(@PathVariable long id) {
        return employeeService.get(id);
    }

    @PutMapping("/update/{id}")
    public Employee update(@PathVariable long id,@Valid @RequestBody EmployeeDto dto) {
        return employeeService.updateEmployee(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        boolean deleted = employeeService.deleteEmployee(id);
        return deleted ? "Deleted successfully" : "Employee not found";
    }

    @GetMapping("/getAll")
    public List<Employee> getAll() {
        return employeeService.getAll();
    }
}

