package com.example.demo.implementService;

import com.example.demo.entities.Category;
import com.example.demo.entities.Dishes;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    public Category addCategory(Category category);

    public Category updateCategory(Category category);

    public boolean deleteCategory(Long id);

    public List<Category> getAllCategory();

    public Optional<Category> getCategoryById(Long id);
}
