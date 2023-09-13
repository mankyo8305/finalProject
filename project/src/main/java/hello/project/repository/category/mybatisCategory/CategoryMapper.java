package hello.project.repository.category.mybatisCategory;

import hello.project.domain.category.category.Category;
import hello.project.domain.category.category.CategorySecond;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    List<CategorySecond> findAll();
}
