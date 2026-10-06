package in.strikes.crudSpringBootDemo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import in.strikes.crudSpringBootDemo.entity.student;

//@Repository
public interface studentRepository extends JpaRepository<student, Long> {
    Optional<student> findByIdAndIsDeletedIsFalse(Long id);
    List<student> findByIsDeletedIsFalse();

}
