package project.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import project.entity.Order;

import java.math.BigDecimal;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class OrderDto {
    private Long id;
    private String description;
    private BigDecimal price;

    public OrderDto(Order order) {
        this.id = order.getId();
        this.price = order.getPrice();
        this.description = order.getItems().stream().map(o -> o.getProduct().getTitle() + " x" + o.getQuantity()).collect(Collectors.joining(", "));
    }
}
