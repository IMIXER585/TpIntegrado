package com.UTP.TpIntegrado.domain.dto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class CategoryDTO {
    private Long id;
    private String type;
    private String prioritylevel;
    private String category;
    private String description;
    private LocalDateTime registeredDate;
}