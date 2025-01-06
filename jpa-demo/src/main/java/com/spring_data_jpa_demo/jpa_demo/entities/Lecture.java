package com.spring_data_jpa_demo.jpa_demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "LECTURE_TBL")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lecture {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    // Lecture to resource unidirectional
    @OneToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;
}
