package com.spring_data_jpa_demo.jpa_demo.repository;

import com.spring_data_jpa_demo.jpa_demo.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
