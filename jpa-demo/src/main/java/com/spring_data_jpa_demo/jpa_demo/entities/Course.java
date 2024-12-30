package com.spring_data_jpa_demo.jpa_demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "COURSE_TBL")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    @ManyToMany
    @JoinTable(name = "course_author",
            joinColumns = {@JoinColumn(name = "course_id")}, // we can have multiple columns
            inverseJoinColumns = {@JoinColumn(name = "author_id")})
    private List<Author> authors;
}
