package guilherme.Id.springboot2.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student guilherme = new Student(
                    "Guilherme",
                    "Guilherme.ok@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER, 14),
                    21
            );

            Student eduardo = new Student(
                    "Eduardo",
                    "Eduardo.ok@gmail.com",
                    LocalDate.of(2002, Month.FEBRUARY, 3),
                    19
            );

            Student maria = new Student(
                    "Maria",
                    "Maria.ok@gmail.com",
                    LocalDate.of(2000, Month.JULY, 17),
                    21
            );

            repository.saveAll(
                    List.of(guilherme,eduardo,maria)
            );
        };
    }
}
