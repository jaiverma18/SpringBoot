package in.strikes.crudSpringBootDemo.service;

import org.springframework.stereotype.Service;

import in.strikes.crudSpringBootDemo.entity.student;
import in.strikes.crudSpringBootDemo.repository.studentRepository;

@Service 
public class StudentService {
    //listen to an end point{/app/student Post}
    //Buissness logic
    //interact with DB
    //Response to client
    private studentRepository StudentRepository;
      
    public StudentService(studentRepository StudentRepository)
    {
        this.StudentRepository=StudentRepository;
    }
    public student CreateStudent(student studentreq)
    {
         System.out.println("Inside student Service");
       student studentresp= StudentRepository.saveStudent(studentreq);
        System.out.println("Outside student Service");
       return studentresp;
        //buissnes logic
        //give to db
        //store to db
    }
}
