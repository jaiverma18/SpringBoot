package in.strikes.crudSpringBootDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class student {
    
    @Id 
    private long id;
    
    private String name;
    private String email;
    private int age;
    private String room;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    private String Subject;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSubject() {
        return Subject;
    }
    public void setSubject(String subject) {
        this.Subject = subject;
    }

}
