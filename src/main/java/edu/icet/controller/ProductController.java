package edu.icet.controller;

import edu.icet.dto.Products;
import edu.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping
public class ProductController {

    private final ProductService productService;
    @PostMapping("add")
    public void addProduct(@RequestBody Products products) {
        productService.addProducts(products);
    }
}