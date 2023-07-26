package dev.chiba.ReactiveApp.service;

import dev.chiba.ReactiveApp.model.Student;
import dev.chiba.ReactiveApp.repo.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo studentRepo;

    public Flux<Student> findAll(){
        return studentRepo.findAll()
                .delayElements(Duration.ofSeconds(1));
    }

    public Mono<Student> save(Student student){
        return studentRepo.save(student);
    }

    public Mono<Student> getById(Long id){
        return studentRepo.findById(id);
    }
}
