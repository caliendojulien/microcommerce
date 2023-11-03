package fr.ecommerce.microcommerce.web.controller;

import fr.ecommerce.microcommerce.dto.ProductDto;
import fr.ecommerce.microcommerce.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductControler {

    private final ProductService productService;

    @GetMapping("/products")
    public List<ProductDto> list() {
        return productService.all();
    }

    @GetMapping("/products/{id}")
    public ProductDto one(@PathVariable int id) {
        return productService.one(id);
    }
}
