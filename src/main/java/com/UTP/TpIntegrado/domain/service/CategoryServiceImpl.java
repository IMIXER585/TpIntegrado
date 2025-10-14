package com.UTP.TpIntegrado.domain.service;

import com.UTP.TpIntegrado.domain.dto.CategoryDTO;
import com.UTP.TpIntegrado.domain.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;

    public CategoryServiceImpl(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CategoryDTO> getAll() {
        return repository.getAll();
    }

    @Override
    public CategoryDTO getById(Long id) {
        return repository.getById(id);
    }

    @Override
    public CategoryDTO save(CategoryDTO category) {
        return repository.save(category);
    }

    @Override
    public CategoryDTO update(CategoryDTO category) {
        return repository.save(category);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }
}