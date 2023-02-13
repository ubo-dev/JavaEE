package com.ubo.northwind.business.abstracts;

import com.ubo.northwind.core.utilites.results.DataResult;
import com.ubo.northwind.core.utilites.results.Result;
import com.ubo.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService
{
    DataResult<List<Product>> getAll();
    Result add(Product product);
}
