package com.exameninterciclo.Pauta_Esteban.repository;

import com.exameninterciclo.Pauta_Esteban.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {
}
