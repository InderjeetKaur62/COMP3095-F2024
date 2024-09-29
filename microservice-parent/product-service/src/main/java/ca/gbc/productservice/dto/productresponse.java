package ca.gbc.productservice.dto;

import java.math.BigDecimal;

public record productresponse(
        String id,
        String name,
        String description,
        BigDecimal price  ) {
}
