package hello.project.repository.category;

import hello.project.domain.category.category.Category;
import hello.project.domain.category.category.CategorySecond;

import java.util.List;

public interface CategoryRepository {
    List<CategorySecond> findAll();
}
