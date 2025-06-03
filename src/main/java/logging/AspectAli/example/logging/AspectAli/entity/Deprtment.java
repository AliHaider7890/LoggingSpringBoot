package logging.AspectAli.example.logging.AspectAli.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "department_table")
@Entity
public class Deprtment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String departmentName;

//    @OneToMany(mappedBy = "department", orphanRemoval = true)
//    private List<employee> emp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

//    public List<employee> getEmp() {
//        return emp;
//    }
//
//    public void setEmp(List<employee> emp) {
//        this.emp = emp;
//    }


}
