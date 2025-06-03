package logging.AspectAli.example.logging.AspectAli.controller;


import jakarta.validation.Valid;
import logging.AspectAli.example.logging.AspectAli.entity.employee;
import logging.AspectAli.example.logging.AspectAli.service.employeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class employeeController {

    private final employeeService empservice;

    public employeeController( employeeService em ){
        this.empservice = em;
    }

    @PostMapping("/create/{depId}")
    public ResponseEntity<employee> createEmployee(@Valid @RequestBody employee emp ,
                                                   @PathVariable Integer depId){
        employee get = this.empservice.addEmployee(emp,depId);
        return new ResponseEntity<employee>(get, HttpStatus.CREATED);
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<employee>> getAllUser(){
        List<employee> getAll = this.empservice.getAllUsers();
        return ResponseEntity.ok(getAll);
    }

    @GetMapping("/{getbyDepId}")
    public ResponseEntity<List<employee>> getbyDepId(@PathVariable Integer getbyDepId){
        List<employee> emp1 = this.empservice.getByDepId(getbyDepId);
        return ResponseEntity.ok(emp1);
    }
}

