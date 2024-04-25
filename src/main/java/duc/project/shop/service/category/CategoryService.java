package duc.project.shop.service.category;

import duc.project.shop.dto.CategoryDTO;
import duc.project.shop.model.Category;

import java.util.List;

public interface CategoryService {
    Category createCategory(CategoryDTO categoryDTO);

    Category getCategoryById(long id);

    List<Category> getAllCategories();

    Category updateCategory(long id, Category category);

    void deleteCategory(long id);
}
