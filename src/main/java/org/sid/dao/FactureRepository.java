package org.sid.dao;

import org.sid.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FactureRepository extends JpaRepository<Facture, Long> {

}