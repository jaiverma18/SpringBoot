package in.strikes.crudSpringBootDemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.strikes.crudSpringBootDemo.entity.student;
import in.strikes.crudSpringBootDemo.service.StudentService;

@RestController //bean created and managed by spring stored is Ioc
@RequestMapping ("/api/students")
public class studentContoller {
     StudentService studentService;

      studentContoller(StudentService studentService)
     {
        this.studentService=studentService;
     }

    @PostMapping("/create")
    public ResponseEntity<student> CreateStudent(@RequestBody student Student)
    {
        System.out.println("Inside student controller");
       student createdStudent= studentService.CreateStudent(Student);
        System.out.println("Outside student controller");
       return ResponseEntity.status(201).body(createdStudent);
    }
    //read student
    //update student
    //delete student
}
