package logging.AspectAli.example.logging.AspectAli.repo;

import logging.AspectAli.example.logging.AspectAli.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface employeeRepo extends JpaRepository<employee , Integer> {


    List<employee> findByDepartmentId(int departmentId);


}
