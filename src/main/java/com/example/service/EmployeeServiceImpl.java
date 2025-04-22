package com.example.service;
import com.example.dto.EmployeeDto;
import com.example.entity.Employee;
import com.example.exceptions.UserAlreadyExist;
import com.example.repositry.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee saveEmployee(EmployeeDto employeeDto) throws com.example.exceptions.UserAlreadyExist {

        Optional<Employee> existingEmail = employeeRepo.findByEmail(employeeDto.getEmail());
        if (existingEmail.isPresent()) {
            throw new com.example.exceptions.UserAlreadyExist("Email is already registered: " + employeeDto.getEmail());
        }

        if (employeeDto.getLinkedin() != null && !employeeDto.getLinkedin().isEmpty()) {
            Optional<Employee> existingLinkedIn = employeeRepo.findByLinkedin(employeeDto.getLinkedin());
            if (existingLinkedIn.isPresent()) {
                throw new com.example.exceptions.UserAlreadyExist("LinkedIn is already registered: " + employeeDto.getLinkedin());
            }
        }
        Optional<Employee> existingMobile = employeeRepo.findByMobileNum(employeeDto.getMobileNum());
        if (existingMobile.isPresent()) {
            throw new UserAlreadyExist("Mobile number is already registered: " + employeeDto.getMobileNum());
        }


        Employee emp = new Employee();
        emp.setMode(employeeDto.getMode());
        emp.setName(employeeDto.getName());
        emp.setSkill(employeeDto.getSkill());
        emp.setProjectsShadow(employeeDto.getProjectsShadow());
        emp.setExperience(employeeDto.getExperience());
        emp.setNda(employeeDto.getNda());
        emp.setCvReady(employeeDto.getCvReady());
        emp.setLinkedin(employeeDto.getLinkedin());
        emp.setDateOfNDA(employeeDto.getDateOfNDA());
        emp.setNotary(employeeDto.getNotary());
        emp.setAffidavit(employeeDto.getAffidavit());
        emp.setSalaryOnDeployed(employeeDto.getSalaryOnDeployed());
        emp.setSalaryOnBench(employeeDto.getSalaryOnBench());
        emp.setReadyToTravel(employeeDto.getReadyToTravel());
        emp.setEmail(employeeDto.getEmail());
        emp.setMobileNum(employeeDto.getMobileNum());

        return employeeRepo.save(emp);
    }

    @Override
    public Employee get(long id) {
        return employeeRepo.findById(id)
                .orElseThrow(() -> new com.example.exceptions.ResourceNotFoundException("Employee not found with ID: " + id));
    }

    @Override
    public Employee updateEmployee(long id, EmployeeDto dto) {
        Employee existing = employeeRepo.findById(id)
                .orElseThrow(() -> new com.example.exceptions.ResourceNotFoundException("Employee not found with ID: " + id));

        existing.setMode(dto.getMode());
        existing.setName(dto.getName());
        existing.setSkill(dto.getSkill());
        existing.setProjectsShadow(dto.getProjectsShadow());
        existing.setExperience(dto.getExperience());
        existing.setNda(dto.getNda());
        existing.setCvReady(dto.getCvReady());
        existing.setLinkedin(dto.getLinkedin());
        existing.setDateOfNDA(dto.getDateOfNDA());
        existing.setNotary(dto.getNotary());
        existing.setAffidavit(dto.getAffidavit());
        existing.setSalaryOnDeployed(dto.getSalaryOnDeployed());
        existing.setSalaryOnBench(dto.getSalaryOnBench());
        existing.setReadyToTravel(dto.getReadyToTravel());
        existing.setEmail(dto.getEmail());
        existing.setMobileNum(dto.getMobileNum());

        return employeeRepo.save(existing);
    }

    @Override
    public boolean deleteEmployee(long id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        if (employee.isPresent()) {
            employeeRepo.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }
}

