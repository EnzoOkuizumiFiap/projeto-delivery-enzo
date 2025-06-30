package com.deliverytech.delivery.repository;

import br.com.delivery.api.entity.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {}