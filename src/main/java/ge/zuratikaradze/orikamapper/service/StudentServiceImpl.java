package ge.zuratikaradze.orikamapper.service;

import ge.zuratikaradze.orikamapper.config.OrikaConfig;
import ge.zuratikaradze.orikamapper.dto.StudentDto;
import ge.zuratikaradze.orikamapper.model.Student;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {


    @Override
    public StudentDto getStudent() {
        Student student = new Student(1L, "Zura Tikaradze");
        return toDto(student);
    }

    private StudentDto toDto(Student student) {
        MapperFacade facade = new OrikaConfig();
        return facade.map(student, StudentDto.class);
    }
}
