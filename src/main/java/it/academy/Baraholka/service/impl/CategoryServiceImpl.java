package it.academy.Baraholka.service.impl;

import it.academy.Baraholka.NotFoundCategoryExepion;
import it.academy.Baraholka.entity.Category;
import it.academy.Baraholka.model.CategoryModel;
import it.academy.Baraholka.repository.CategoryRepository;
import it.academy.Baraholka.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<CategoryModel> getAll() {
        return null;
    }

    @Override
    public CategoryModel getById(Long id) {
//        Category category = categoryRepository.findById(id).orElseThrow().
        return null;
    }
}
