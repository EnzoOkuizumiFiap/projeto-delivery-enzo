package com.deliverytech.delivery_api.repository;

import com.deliverytech.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // Buscar cliente por email
    Optional<Cliente> findByEmail(String email);

    // Buscar apenas clientes ativos
    List<Cliente> findByAtivoTrue();

    // Busca por nome (parcial, ignorando case)
    List<Cliente> findByNomeContainingIgnoreCase(String nome);

    // Verificar se email já existe
    boolean existsByEmail(String email);
}