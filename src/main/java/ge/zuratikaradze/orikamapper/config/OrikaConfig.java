package ge.zuratikaradze.orikamapper.config;

import ge.zuratikaradze.orikamapper.dto.StudentDto;
import ge.zuratikaradze.orikamapper.model.Student;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

public class OrikaConfig extends ConfigurableMapper {

    @Override
    protected void configure(MapperFactory factory) {
        factory.classMap(Student.class, StudentDto.class)
                .byDefault()
                .register();
    }
}
