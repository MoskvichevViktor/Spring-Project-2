package project.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import project.entity.Product;


@Data
@NoArgsConstructor
public class ProductDto {

    private Long id;

    private String categoryTitle;

   /* public ProductDto(Product product) {
        this.id = product.getId();
        this.title = product.getTitle();
        this.price = product.getPrice();
        this.categoryTitle = product.getCategory().getTitle();
    }*/
}
