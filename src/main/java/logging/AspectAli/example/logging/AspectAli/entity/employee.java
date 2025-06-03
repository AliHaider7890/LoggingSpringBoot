package logging.AspectAli.example.logging.AspectAli.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Student_table")
@Entity
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Email
    private String email;

    private String password;

    private Double salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Deprtment department;

    public Long getId() {
        return id;
    }

    public void setPassword(String pass){
      this.password = pass;
    }

    public String getPassword(){
        return this.password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Deprtment getDepartment() {
        return department;
    }

    public void setDepartment(Deprtment department) {
        this.department = department;
    }

}
