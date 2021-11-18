package market.services;

import lombok.RequiredArgsConstructor;
import market.models.components.Cart;
import market.models.dtos.OrderDetailsDto;
import market.models.entities.Order;
import market.models.entities.OrderItem;
import market.models.entities.User;
import market.models.repositories.OrderRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final Cart cart;

    public List<Order> findAllByUser(User user) {
        return orderRepository.findAllByUser(user);
    }

    public Order createOrderForCurrentUser(User user, OrderDetailsDto orderDetailsDto) {
        Order order = new Order();
        order.setUser(user);
        order.setPrice(cart.getSum());
        order.setItems(cart.getItems());
        for (OrderItem oi : cart.getItems()) {
            oi.setOrder(order);
        }
        order.setPhone(orderDetailsDto.getPhone());
        order.setAddress(orderDetailsDto.getDeliveryAddress().toString());
        order = orderRepository.save(order);
        cart.clear();
        return order;
    }
}
