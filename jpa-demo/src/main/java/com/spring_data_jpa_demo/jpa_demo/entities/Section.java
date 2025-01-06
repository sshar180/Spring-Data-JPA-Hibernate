package com.spring_data_jpa_demo.jpa_demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "SECTION_TBL")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Section {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer sectionOrder;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course courses;

    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;

}
