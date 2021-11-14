package project.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import project.dtos.OrderDetailsDto;
import project.dtos.OrderDto;
import project.entity.User;
import project.service.OrderService;
import project.service.UserService;


import javax.transaction.Transactional;
import java.security.Principal;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/orders")
public class OrderController {
    private final OrderService orderService;
    private final UserService userService;
/*
    @PostMapping
    @ApiImplicitParam(name = HttpHeaders.AUTHORIZATION, paramType = "header")
    public void createNewOrder(Principal principal,
                               @RequestBody OrderDetailsDto orderDetailsDto) {
        User user = userService.findByUsername(principal.getName()).get();
        orderService.createOrderForCurrentUser(user, orderDetailsDto);
    }

    @GetMapping
   @ApiImplicitParam(name = HttpHeaders.AUTHORIZATION, paramType = "header")
    @Transactional
    public List<OrderDto> getAllOrdersForCurrentUser(Principal principal) {
        User user = userService.findByUsername(principal.getName()).get();
        return orderService.findAllByUser(user).stream().map(OrderDto::new).collect(Collectors.toList());
    }
*/

}
