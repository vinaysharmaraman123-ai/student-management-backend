//package com.student.student.management.Service;
//
//public class StudentService {
//}
package com.student.student.management.Service;

import com.student.student.management.entity.Student;
import com.student.student.management.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    // GET ALL
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // CREATE
    public Student addStudent(Student student) {
        return repository.save(student);
    }

    // UPDATE
    public Student updateStudent(Long id, Student newStudent) {

        return repository.findById(id)
                .map(student -> {
                    student.setName(newStudent.getName());
                    student.setEmail(newStudent.getEmail());
                    student.setCourse(newStudent.getCourse());
                    student.setAge(newStudent.getAge());
                    return repository.save(student);
                })
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    // DELETE
    public String deleteStudent(Long id) {
        repository.deleteById(id);
        return "Student deleted with id: " + id;
    }
}