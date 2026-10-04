package in.strikes.crudSpringBootDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import in.strikes.crudSpringBootDemo.entity.student;

//@Repository
public interface studentRepository extends JpaRepository<student, Long> {
}
