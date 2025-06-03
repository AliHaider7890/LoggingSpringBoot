package logging.AspectAli.example.logging.AspectAli.service.impl;

import logging.AspectAli.example.logging.AspectAli.entity.Deprtment;
import logging.AspectAli.example.logging.AspectAli.repo.DepartmentRepo;
import logging.AspectAli.example.logging.AspectAli.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class impleDepartment implements DepartmentService {

    @Autowired
    private DepartmentRepo dRepo;

    @Override
    public Deprtment addDep(Deprtment dep ) {
        Deprtment dpt = this.dRepo.save(dep);
        return dpt;
    }

    @Override
    public Deprtment getAllDep() {
        return null;
    }
}
