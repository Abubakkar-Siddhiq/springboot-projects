package com.monkey.blog.services.impl;

import com.monkey.blog.domain.entity.Category;
import com.monkey.blog.repositories.CategoryRepository;
import com.monkey.blog.services.CategoryService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAll();
    }

    @Override
    @Transactional
    public Category createCategory(Category category) {
        String categoryName = category.getName();
        if(categoryRepository.existsByNameIgnore(category.getName())) {
            throw new IllegalArgumentException("Category already exists with name: " + categoryName);
        }

        return categoryRepository.save(category);
    }
}
