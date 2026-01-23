package com.monkey.blog.services;

import com.monkey.blog.domain.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> listCategories();

    Category createCategory(Category category);
}
