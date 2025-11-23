package edu.icet.service;

import edu.icet.dto.Products;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    void addProducts(Products products);
    List<Products>getAll();
}
