package duc.project.shop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import lombok.*;

@Data//toString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDTO {
    @JsonProperty("order_id")
    @Min(value = 1,message = "Order's ID must be > 0")
    private Long orderId;

    @JsonProperty("product_id")
    @Min(value = 1,message = "Product's ID must be > 0")
    private Long productId;

    @Min(value = 1,message = "number_of_products ID must be > 1")
    @JsonProperty("number_of_products")
    private int numberOfProducts;

    @Min(value = 0,message = "Product's ID must be >= 0")
    private Long price;

    @Min(value = 0,message = "total_money ID must be >= 0")
    @JsonProperty("total_money")
    private int totalMoney;

    private  String color;
}
