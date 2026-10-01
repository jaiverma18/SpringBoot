package in.strikes.crudSpringBootDemo.repository;

import org.springframework.stereotype.Component;

import in.strikes.crudSpringBootDemo.entity.student;

@Component 
public class studentRepository {
    
    public student saveStudent(student studentReq){
        //save to database
        System.out.println("Inside student repository");
        studentReq.setName("Jai");
        studentReq.setEmail("jaivrm902@gmail.com");
        studentReq.setAge(25);
        System.out.println("Outside student repository");
        return studentReq;
        
    }
}
