package hello.project.repository.category.mybatisCategory;

import hello.project.domain.category.category.Category;
import hello.project.domain.category.category.CategorySecond;
import hello.project.repository.category.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MyBatisCategoryRepository implements CategoryRepository {

    private final CategoryMapper categoryMapper;

    @Override
    public List<CategorySecond> findAll() {
        return categoryMapper.findAll();
    }
}
