package ge.zuratikaradze.orikamapper.controller;

import ge.zuratikaradze.orikamapper.dto.StudentDto;
import ge.zuratikaradze.orikamapper.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student-controller")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public StudentDto getStudent() {
        return studentService.getStudent();
    }
}
