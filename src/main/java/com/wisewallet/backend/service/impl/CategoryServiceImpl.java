package com.wisewallet.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisewallet.backend.entity.Category;
import com.wisewallet.backend.repository.CategoryRepository;
import com.wisewallet.backend.service.CategoryService;

@Service   // ✅ VERY IMPORTANT
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category updateCategory(Long id, Category category) {
        Category existingCategory = categoryRepository.findById(id).orElse(null);

        if (existingCategory != null) {
            existingCategory.setName(category.getName());
            existingCategory.setType(category.getType());
            existingCategory.setColor(category.getColor());
            existingCategory.setIcon(category.getIcon());
            existingCategory.setBudgetAmount(category.getBudgetAmount());

            return categoryRepository.save(existingCategory);
        }

        return null;
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}