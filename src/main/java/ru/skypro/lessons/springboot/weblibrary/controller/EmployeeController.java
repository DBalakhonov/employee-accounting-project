package ru.skypro.lessons.springboot.weblibrary.controller;

import org.springframework.web.bind.annotation.*;
import ru.skypro.lessons.springboot.weblibrary.Employee;
import ru.skypro.lessons.springboot.weblibrary.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/get")
    public List<Employee> showCounter() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/salary/sum")
    public String showSumSalary(){
        return employeeService.showSumSalary();
    }
    @GetMapping("/salary/min")
    public String showMinSalary(){
        return "Минимальная зарплата среди сотрудников: "+employeeService.showSalaryMin();
    }
    @GetMapping("/salary/max")
    public String showMaxSalary(){
        return "Максимальная зарплата среди сотрудников: "+employeeService.showSalaryMax();
    }

    @PostMapping
    public void addEmployees(@RequestBody Employee employee){
        employeeService.addEmployees(employee);
    }
    @PutMapping("/{id}")
    public void editEmployees(@PathVariable int id,@RequestBody Employee employee){
        employeeService.editEmployees(employee,id);
    }
    @DeleteMapping("/{id}")
    public void deleteEmployees(@PathVariable int id,@RequestBody Employee employee){
        employeeService.deleteEmployees(employee,id);
    }
    @GetMapping("/salaryHigherThan{salary}")
    public List<Employee> showHighSalary(@PathVariable int salary){
        return employeeService.showHighSalary(salary);
    }
}