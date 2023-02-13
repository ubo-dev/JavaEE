package com.ubo.northwind.api.controllers;

import com.ubo.northwind.business.abstracts.ProductService;
import com.ubo.northwind.core.utilites.results.DataResult;
import com.ubo.northwind.core.utilites.results.Result;
import com.ubo.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController
{
    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Product>> getAll()
    {
        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product)
    {
        return this.productService.add(product);
    }
}
