package dev.chiba.ReactiveApp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "students")
public class Student {

    @Id
    private Long id;
    @Column("firstname")
    private String firstName;
    @Column("lastname")
    private String lastName;
    private Integer age;
}
