package com.deliverytech.delivery.repository;

import br.com.delivery.api.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}
 