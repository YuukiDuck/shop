package duc.project.shop.controller;

import duc.project.shop.dto.OrderDetailDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${api.prefix}/order_details")
@RequiredArgsConstructor
public class OrderDetailController {

    //Lấy theo id
    @GetMapping("/{id}")
    public ResponseEntity getOrderDetail (@Valid @PathVariable Long id){
        return ResponseEntity.ok("getOrderDetail with id =" + id );
    }

    //Lấy danh sách các order_detail của 1 orderId
    @GetMapping("/order/{orderId}")
    public ResponseEntity<?> getOrderDetails(@Valid @PathVariable("orderId") Long orderId) {
        return ResponseEntity.ok("getOrderDetails with orderId = " + orderId);
    }

    //Thêm mới 1 orderdetail
    @PostMapping("")
    public ResponseEntity<?> createOrderDetail(@Valid @RequestBody OrderDetailDTO orderDetailDTO){
        return ResponseEntity.ok("createOrderDetail here");
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateOrderDetail (@Valid @PathVariable("id") Long id,
                                                @RequestBody OrderDetailDTO newOrderDetailData) {
        return ResponseEntity.ok("updateOrderDetail with id=" + id + ", newOrderDetailData:" +newOrderDetailData);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrderDetail (@Valid @PathVariable("id") Long id){
        return ResponseEntity.noContent().build();
    }
}
