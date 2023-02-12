package com.ubo.northwind.business.abstracts;

import com.ubo.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService
{
    List<Product> getAll();
}
