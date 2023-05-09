package com.teamOne.healthApi.repositories;

import com.teamOne.healthApi.entities.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, String> {
}
