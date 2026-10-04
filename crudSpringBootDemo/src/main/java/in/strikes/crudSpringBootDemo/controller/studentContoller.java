package in.strikes.crudSpringBootDemo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
       student createdStudent= studentService.CreateStudent(Student);
       return ResponseEntity.status(201).body(createdStudent);
    }
    @GetMapping ("/get/{id}")
    public ResponseEntity<student> getStudentById(@PathVariable long id)
    {
      student studentresp=studentService.getStudentById(id);
      if(studentresp==null)
      {
         return ResponseEntity.status(404).body(null);
      }
      return ResponseEntity.status(200).body(studentresp);
    }
    @GetMapping ("/getAll")
    public ResponseEntity<List<student>>getAllStudents()
    {
      List<student> studentresp=studentService.getAllStudents();
      if(studentresp.isEmpty())
      {
         return ResponseEntity.status(404).body(null);
      }
      return ResponseEntity.ok(studentresp);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<student> updateSudent(@PathVariable Long id,@RequestBody student Student)
    {
      student updatedStudent=studentService.updateStudent(id,Student);
      if(updatedStudent==null)
      {
         return ResponseEntity.status(404).body(null);
      }
      return ResponseEntity.status(200).body(updatedStudent);
    }
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id)
    {
      boolean isDeleted=studentService.deleteStudent(id);
      if(!isDeleted)
      {
         return ResponseEntity.status(404).body("Student not found");
      }
      return ResponseEntity.status(200).body("Student deleted successfully");
    }
}
