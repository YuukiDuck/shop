package duc.project.shop.service.product;

import duc.project.shop.dto.ProductDTO;
import duc.project.shop.model.Product;

public interface ProductService {
    Product createProduct(ProductDTO productDTO);
}
