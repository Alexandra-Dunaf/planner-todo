package ru.dunaf.planner.todo.controller;

import ru.dunaf.planner.todo.feign.UserFeignClient;
import ru.dunaf.planner.todo.service.CategoryService;
import ru.dunaf.planner.utils.rest.resttemplate.UserRestBuilder;

public class CategoryControllerBuilder {
    private CategoryService categoryService;
    private UserRestBuilder userRestBuilder;
    private UserFeignClient userFeignClient;

    public CategoryControllerBuilder setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
        return this;
    }

    public CategoryControllerBuilder setUserRestBuilder(UserRestBuilder userRestBuilder) {
        this.userRestBuilder = userRestBuilder;
        return this;
    }

    public CategoryControllerBuilder setUserFeignClient(UserFeignClient userFeignClient) {
        this.userFeignClient = userFeignClient;
        return this;
    }

    public CategoryController createCategoryController() {
        return new CategoryController(categoryService, userRestBuilder, userFeignClient);
    }
}