package logging.AspectAli.example.logging.AspectAli.repo;

import logging.AspectAli.example.logging.AspectAli.entity.Deprtment;
import logging.AspectAli.example.logging.AspectAli.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepo extends JpaRepository<Deprtment , Integer> {

   // List<employee> findBy



}
