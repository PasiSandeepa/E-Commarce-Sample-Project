package edu.icet.service.Impl;

import edu.icet.dto.Products;
import edu.icet.entity.Product;
import edu.icet.repository.ProductsRepository;
import edu.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    final ProductsRepository productsRepository;
    final ModelMapper modelMapper;

    @Override
    public void addProducts(Products products) {

        Product product = modelMapper.map(products, Product.class);
        productsRepository.save(product);
    }

    @Override
    public List<Products> getAll() {
        ArrayList<Products> ProductList = new ArrayList<>();
        for (Product product : productsRepository.findAll()) {

            Products products = modelMapper.map(product, Products.class);
            ProductList.add(products);
        }
        return ProductList;
    }
}
