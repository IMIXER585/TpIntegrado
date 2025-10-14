package com.UTP.TpIntegrado.persistance;

import com.UTP.TpIntegrado.domain.dto.CategoryDTO;
import com.UTP.TpIntegrado.domain.repository.CategoryRepository;
import com.UTP.TpIntegrado.persistance.crud.CategoryCrudRepository;
import com.UTP.TpIntegrado.persistance.entity.Category;
import com.UTP.TpIntegrado.persistance.mapper.CategoryMapper;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    private final CategoryCrudRepository crud;
    private final CategoryMapper mapper;

    public CategoryRepositoryImpl(CategoryCrudRepository crud, CategoryMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }

    @Override
    public List<CategoryDTO> getAll() {
        List<Category> categories = (List<Category>) crud.findAll();
        return mapper.toCategoryDTOs(categories);
    }

    @Override
    public CategoryDTO getById(Long id) {
        Optional<Category> category = crud.findById(id);
        return category.map(mapper::toCategoryDTO).orElse(null);
    }

    @Override
    public CategoryDTO save(CategoryDTO dto) {
        Category entity = mapper.toCategory(dto);
        Category saved = crud.save(entity);
        return mapper.toCategoryDTO(saved);
    }

    @Override
    public void delete(Long id) {
        crud.deleteById(id);
    }
}