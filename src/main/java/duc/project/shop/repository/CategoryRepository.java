package duc.project.shop.repository;

import duc.project.shop.model.Category;
import duc.project.shop.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<OrderDetail> findByOrderId(Long orderId);

}
