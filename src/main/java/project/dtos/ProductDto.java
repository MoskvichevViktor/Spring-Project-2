package project.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import project.entity.Product;



import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class ProductDto {
    //private final String title;
   // private final BigDecimal price;
    private Long id;

    //@Size(min = 4, max = 255, message = "Title size: 4-255")
    //private String title;

   // @Min(value = 1, message = "Min price = 1")
   // private BigDecimal price;

    private String categoryTitle;

   /* public ProductDto(Product product) {
        this.id = product.getId();
        this.title = product.getTitle();
        this.price = product.getPrice();
        this.categoryTitle = product.getCategory().getTitle();
    }*/
}
