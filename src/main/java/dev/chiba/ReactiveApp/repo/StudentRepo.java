package dev.chiba.ReactiveApp.repo;

import dev.chiba.ReactiveApp.model.Student;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface StudentRepo extends ReactiveCrudRepository<Student,Long> {

    Flux<Student> findAllByFirstNameIgnoreCase(String firstName);
}
