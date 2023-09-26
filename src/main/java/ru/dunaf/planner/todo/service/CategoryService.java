package ru.dunaf.planner.todo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dunaf.planner.entity.Category;
import ru.dunaf.planner.todo.repo.CategoryRepository;

import java.util.List;

@Service
@Transactional
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public Category findById (Long id) {
        return repository.findById(id).get();
    }

    public List<Category> findAll(Long userId) {
        return repository.findByUserIdOrderByTitleAsc(userId);
    }


    public Category add(Category category) {
        return repository.save(category);
    }

    public Category update(Category category) {
        return repository.save(category);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    // поиск категорий пользователя по названию
    public List<Category> findByTitle(String text, Long userId) {
        return repository.findByTitle(text, userId);
    }
}
