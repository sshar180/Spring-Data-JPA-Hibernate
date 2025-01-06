package com.spring_data_jpa_demo.jpa_demo.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
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
 * @DiscriminatorValue("V")
 */

/**
 * In case to provide custom primary_foreign key name for Strategy JOIN
 * @PrimaryKeyJoinColumn(name = "Video_id")
 */

public class Video extends Resource {

    int length;

}
