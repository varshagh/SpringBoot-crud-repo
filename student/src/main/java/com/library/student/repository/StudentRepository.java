package com.library.student.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;
import com.library.student.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

}
