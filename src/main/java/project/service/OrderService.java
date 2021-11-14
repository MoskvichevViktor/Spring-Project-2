package project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.dtos.OrderDetailsDto;
import project.entity.Cart;
import project.entity.Order;
import project.entity.OrderItem;
import project.entity.User;
import project.repository.OrderRepository;


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
        // todo распутать этот кусок
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
