package it.academy.Baraholka.service;

import it.academy.Baraholka.model.CategoryModel;

import java.util.List;

public interface CategoryService {
    List<CategoryModel> getAll();

    CategoryModel getById(Long id);
}
