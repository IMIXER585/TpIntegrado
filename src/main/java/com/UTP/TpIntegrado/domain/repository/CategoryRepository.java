package com.UTP.TpIntegrado.domain.repository;

import com.UTP.TpIntegrado.domain.dto.CategoryDTO;
import java.util.List;

public interface CategoryRepository {
    List<CategoryDTO> getAll();
    CategoryDTO getById(Long id);
    CategoryDTO save(CategoryDTO category);
    void delete(Long id);
}