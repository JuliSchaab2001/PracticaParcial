package com.utn.SeudoParcial.Repositories;

import com.utn.SeudoParcial.Models.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {
}
