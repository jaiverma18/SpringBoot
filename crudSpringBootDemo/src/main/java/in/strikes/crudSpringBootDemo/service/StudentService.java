package in.strikes.crudSpringBootDemo.service;

import java.util.List;
import java.util.Optional;

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
       studentreq.setIsDeleted(false);
       student studentresp= StudentRepository.save(studentreq);
        
       return studentresp;
       
    }
    public student getStudentById(long id)
    {
        Optional<student> studentresp= StudentRepository.findByIdAndIsDeletedIsFalse(id);
        if(studentresp.isPresent())
        {
            return studentresp.get();
        }
        return null;
        }
        public List<student> getAllStudents()
        {
            List<student> studentresp=StudentRepository.findByIsDeletedIsFalse();
            if(studentresp.isEmpty())
            {
                return null;
            }
            return studentresp;
        }
        public student updateStudent(Long id, student Student)
        {
            Optional<student> existingStudent=StudentRepository.findByIdAndIsDeletedIsFalse(id);
            if(!existingStudent.isPresent())
            {
                return null;
            }
            student studentresp=existingStudent.get();
            studentresp.setName(Student.getName());
            studentresp.setAge(Student.getAge());
            studentresp.setEmail(Student.getEmail());
            studentresp.setRoom(Student.getRoom());
            studentresp.setSubject(Student.getSubject());
            studentresp.setIsDeleted(false);
            return StudentRepository.save(studentresp);
       
        }
        public boolean deleteStudent(Long id)
        {
            boolean isPresent=StudentRepository.existsById(id);
            if(!isPresent)
                return false;
            StudentRepository.deleteById(id);
            return true;
        }
        public Boolean softDeleteStudent(Long id)
        {
           Optional<student> existingStudent=StudentRepository.findByIdAndIsDeletedIsFalse(id);
           if(existingStudent.isPresent())
           {
           student studentresp=existingStudent.get();
           studentresp.setIsDeleted(true);
           StudentRepository.save(studentresp);
           return true;
           }
           return false;
    }
}



