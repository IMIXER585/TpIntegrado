package com.UTP.TpIntegrado.persistance.crud;

import com.UTP.TpIntegrado.persistance.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Category, Long> {
}