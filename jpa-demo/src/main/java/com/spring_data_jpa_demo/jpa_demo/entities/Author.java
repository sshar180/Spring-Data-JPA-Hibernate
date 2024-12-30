package com.spring_data_jpa_demo.jpa_demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Table(name = "AUTHOR_TBL")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author {

    @Id
    @GeneratedValue
    /*
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "author_sequence")
    @SequenceGenerator(name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1, // default 50
            initialValue = 10 // default 1
    )**/

    /*
    @GeneratedValue(strategy = GenerationType.TABLE,
    generator = "author_table_generator")
    @TableGenerator(name = "author_table_generator",
    table = "author_table",
    pkColumnName = "author_id",
    valueColumnName = "author_col",
    initialValue = 1,
    allocationSize = 2)
    **/
    private Integer id;

    @Column(name = "firstName", nullable = false, length = 25)
    private String firstName;
    @Column(name = "lastName", nullable = false, length = 25)
    private String lastName;
    @Column(name = "email", nullable = false, length = 35, unique = true)
    private String email;
    @Column(name = "age")
    private int age;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "lastModifiedAt", insertable = false)
    private LocalDateTime lastModifiedAt;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

}
