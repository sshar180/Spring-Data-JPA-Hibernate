package com.spring_data_jpa_demo.jpa_demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Table(name = "RESOURCE_TBL")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

/**
 * // This is only for Single table strategy and Discriminator column is only for
 * single table
 */
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "resource_type")

/**
 * This is only for Join table strategy
 */
//@Inheritance(strategy = InheritanceType.JOINED)

/**
 * This is only for Table per class strategy
 * In this case all the child table will have the column of the parent class
 */
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Resource {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int size;
    private String url;

    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

}
