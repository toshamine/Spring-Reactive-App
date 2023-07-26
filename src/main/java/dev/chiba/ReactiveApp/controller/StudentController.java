package dev.chiba.ReactiveApp.controller;

import dev.chiba.ReactiveApp.model.Student;
import dev.chiba.ReactiveApp.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public Flux<Student> getAll(){
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Student> findById(@PathVariable Long id){
        return studentService.getById(id);
    }

    @PostMapping
    public Mono<Student> save(@RequestBody Student student){
        return studentService.save(student);
    }
}
