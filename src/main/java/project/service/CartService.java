package project.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.entity.Cart;
import project.entity.OrderItem;
import project.entity.Product;

import java.util.List;


@Service
@Data
@RequiredArgsConstructor
public class CartService {

    private final ProductService productService;
    private final Cart cart;

    public void addToCartService(Long id) {
        for (OrderItem orderItem : cart.getItems()) {
            if (orderItem.getProduct().getId().equals(id)) {
                orderItem.incrementQuantity();
                cart.recalculate();
                return;
            }
        }

        /*Product product = productService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product doesn't exists id: " + id + " (add to cart)"));
        List<OrderItem> orderItemList = cart.getItems();
        orderItemList.add(new OrderItem(product));
        cart.recalculate();

         */
    }

}
