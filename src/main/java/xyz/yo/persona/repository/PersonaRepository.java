package xyz.yo.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.yo.persona.model.Persona;


public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
