package com.repositories;


import com.entities.Composante;
import com.entities.Gestionnaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComposanteRepository extends JpaRepository<Composante, Long> {
}
