package logging.AspectAli.example.logging.AspectAli.service;

import logging.AspectAli.example.logging.AspectAli.entity.employee;

import java.util.List;

public interface employeeService {

    public employee addEmployee(employee obj , Integer depId) ;

    public employee updateEmployee(employee obj);

    public List<employee> getAllUsers ();

    public  List<employee> getByDepId(Integer depId);

}
