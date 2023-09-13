package hello.project.web.manager.itemManage;

import hello.project.domain.category.category.Category;
import hello.project.domain.category.category.CategorySecond;
import hello.project.repository.category.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/manager/item")
@RequiredArgsConstructor
public class ItemManageController {

    private final CategoryRepository categoryRepository;

    @GetMapping("/items")
    public String items(){
        return "manager/itemManage/itemManage";
    }

    @GetMapping("/add")
    public String add(){
        return "manager/itemManage/addItemManage";
    }

    @GetMapping("/detail")
    public String detail(){
        return "manager/itemManage/detailItemManage";
    }

    @GetMapping("/edit")
    public String edit(){
        return "manager/itemManage/editItemManage";
    }


    @ModelAttribute("categories")
    public List<CategorySecond> categories(){
        return categoryRepository.findAll();
    }
}
