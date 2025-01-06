package com.spring_data_jpa_demo.jpa_demo.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
/**
 * Only for Single table Strategy
 * @DiscriminatorValue("F")
 */
public class File extends Resource {

    String type;
}
