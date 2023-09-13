package hello.project.config;

import hello.project.repository.category.CategoryRepository;
import hello.project.repository.category.mybatisCategory.CategoryMapper;
import hello.project.repository.category.mybatisCategory.MyBatisCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {

    private final CategoryMapper categoryMapper;

    @Bean
    public CategoryRepository categoryRepository(){
        return new MyBatisCategoryRepository(categoryMapper);
    }

}
