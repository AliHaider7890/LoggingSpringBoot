package logging.AspectAli.example.logging.AspectAli.service.impl;

import logging.AspectAli.example.logging.AspectAli.entity.Deprtment;
import logging.AspectAli.example.logging.AspectAli.entity.employee;
import logging.AspectAli.example.logging.AspectAli.repo.DepartmentRepo;
import logging.AspectAli.example.logging.AspectAli.repo.employeeRepo;
import logging.AspectAli.example.logging.AspectAli.service.employeeService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class implEmployee implements employeeService {

//    private static final Logger logger = LoggerFactory.getLogger(implEmployee.class);


    @Autowired
    private employeeRepo emplrepo;
    @Autowired
    private DepartmentRepo depoRepo;

    @Override
    public employee addEmployee(employee obj , Integer depId) throws RuntimeException {

        Deprtment dprtmt = this.depoRepo.findById(depId).orElseThrow();
        employee safe = obj;
        safe.setDepartment(dprtmt);
       // log.info("log " +obj.getName());
        employee saved = this.emplrepo.save(safe);
        return saved;
    }

    @Override
    public employee updateEmployee(employee obj) {
        return null;
    }

    @Override
    public List<employee> getAllUsers() {
        List<employee> emp = this.emplrepo.findAll();
        return emp;
    }

    @Override
    public List<employee> getByDepId(Integer depId) {
        List<employee> emp = this.emplrepo.findByDepartmentId(depId);
        return emp;
    }
}
