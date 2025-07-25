package com.deliverytech.delivery.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemPedidoRequest {

    @NotNull
    private Long produtoId;

    @Positive
    private Integer quantidade;
}
