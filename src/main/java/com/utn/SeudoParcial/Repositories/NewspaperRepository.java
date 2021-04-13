package com.utn.SeudoParcial.Repositories;

import com.utn.SeudoParcial.Models.Newspaper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

@Repository
public interface NewspaperRepository extends JpaRepository<Newspaper, Integer> {
}
