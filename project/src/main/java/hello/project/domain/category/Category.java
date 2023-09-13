package hello.project.domain.category;

import lombok.Data;

@Data
public class Category {
    private Long id;
    private String category;
    private Long age;

    public Category() {
    }

    public Category(String category, Long age) {
        this.category = category;
        this.age = age;
    }
}
