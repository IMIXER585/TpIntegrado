package com.UTP.TpIntegrado.domain.service;

import com.UTP.TpIntegrado.domain.dto.CategoryDTO;
import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAll();
    CategoryDTO getById(Long id);
    CategoryDTO save(CategoryDTO category);
    CategoryDTO update(CategoryDTO category);
    void delete(Long id);
}