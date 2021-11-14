package project.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import project.service.CategoryService;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categories")
public class CategoryController {
    private final CategoryService categoryService;

    /*
    @GetMapping("/{id}")
    public Category getOneCategoryById(@PathVariable Long id) {
        return categoryService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category doesn't exists: " + id));
    }
    */

}


