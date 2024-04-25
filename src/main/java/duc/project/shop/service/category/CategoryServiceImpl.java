package duc.project.shop.service.category;

import duc.project.shop.dto.CategoryDTO;
import duc.project.shop.model.Category;
import duc.project.shop.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository categoryRepository;

    @Override
    public Category createCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public Category getCategoryById(long id) {
        return null;
    }

    @Override
    public List<Category> getAllCategories() {
        return null;
    }

    @Override
    public Category updateCategory(long id, Category category) {
        return null;
    }

    @Override
    public void deleteCategory(long id) {

    }
}
