package com.UTP.TpIntegrado.persistance.mapper;

import com.UTP.TpIntegrado.domain.dto.CategoryDTO;
import com.UTP.TpIntegrado.persistance.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);


    CategoryDTO toCategoryDTO(Category category);

    Category toCategory(CategoryDTO dto);

    List<CategoryDTO> toCategoryDTOs(List<Category> categories);
}