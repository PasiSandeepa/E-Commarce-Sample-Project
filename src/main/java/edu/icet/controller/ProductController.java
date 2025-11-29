package edu.icet.controller;

import edu.icet.dto.Products;
import edu.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("Products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

    private final ProductService productService;
    @PostMapping("add")
    public void addProduct(@RequestBody Products products) {
        productService.addProducts(products);
    }
    @GetMapping("all")
    public List<Products> getAll(){
        return productService.getAll();
    }
}