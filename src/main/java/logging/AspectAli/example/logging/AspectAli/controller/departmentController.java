package logging.AspectAli.example.logging.AspectAli.controller;


import logging.AspectAli.example.logging.AspectAli.entity.Deprtment;
import logging.AspectAli.example.logging.AspectAli.service.DepartmentService;
import org.apache.juli.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/addDepartment")
public class departmentController{

   // private static final Logger logger = LoggerFactory.getLogger()

    private final DepartmentService dService;

    public departmentController(DepartmentService dService) {
        this.dService = dService;
    }
    @PostMapping("/add")
    public ResponseEntity<Deprtment> addDep(@RequestBody Deprtment dep){
        Deprtment dpr = this.dService.addDep(dep);
        return ResponseEntity.ok(dep);
    }

}
