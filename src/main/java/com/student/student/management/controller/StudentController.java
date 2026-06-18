//
//package com.student.student.management.controller;
//
//import com.student.student.management.entity.Student;
//import com.student.student.management.repository.StudentRepository;
//import org.springframework.web.bind.annotation.*;
//
//        import java.util.List;
//
//@RestController
//@CrossOrigin(origins = "http://localhost:3000")
//@RequestMapping("/students")
//public class StudentController {
//
//    private final StudentRepository repository;
//
//    public StudentController(StudentRepository repository) {
//        this.repository = repository;
//        System.out.println("StudentController loaded!");
//    }
//
//    @GetMapping
//    public List<Student> getAllStudents() {
//        return repository.findAll();
//    }
//
//    @PostMapping
//    public Student addStudent(@RequestBody Student student) {
//        return repository.save(student);
//    }
//}


//package com.student.student.management.controller;
//
//import com.student.student.management.entity.Student;
//import com.student.student.management.repository.StudentRepository;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@CrossOrigin(origins = "http://localhost:3000")
//@RequestMapping("/students")
//public class StudentController {
//
//    private final StudentRepository repository;
//
//    public StudentController(StudentRepository repository) {
//        this.repository = repository;
//    }
//
//    // GET ALL
//    @GetMapping
//    public List<Student> getAllStudents() {
//        return repository.findAll();
//    }
//
//    // CREATE
//    @PostMapping
//    public Student addStudent(@RequestBody Student student) {
//        return repository.save(student);
//    }
//
//    // UPDATE
//    @PutMapping("/{id}")
//    public Student updateStudent(@PathVariable Long id, @RequestBody Student newStudent) {
//
//        return repository.findById(id)
//                .map(student -> {
//                    student.setName(newStudent.getName());
//                    student.setEmail(newStudent.getEmail());
//                    student.setCourse(newStudent.getCourse());
//                    student.setAge(newStudent.getAge());
//                    return repository.save(student);
//                })
//                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
//    }
//
//    // DELETE
//    @DeleteMapping("/{id}")
//    public String deleteStudent(@PathVariable Long id) {
//
//        repository.deleteById(id);
//        return "Student deleted with id: " + id;
//    }
//}



package com.student.student.management.controller;

import com.student.student.management.Service.StudentService;
import com.student.student.management.entity.Student;
import com.student.student.management.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // GET ALL
    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // CREATE
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return service.deleteStudent(id);
    }
}