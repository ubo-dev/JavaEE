package com.ubo.northwind.business.abstracts;

import com.ubo.northwind.core.utilites.results.DataResult;
import com.ubo.northwind.core.utilites.results.Result;
import com.ubo.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductService
{
    DataResult<List<Product>> getAll();
    DataResult<List<Product>> getAll(int pageNo, int pageSize);
    Result add(Product product);

    DataResult<Product> getByProductName(String productName);
    DataResult<Product> getByProductNameAndCategory(String productName, int categoryId);
    DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId);
    DataResult<List<Product>> getByCategoryIn(List<Integer> categories);
    DataResult<List<Product>> getByProductNameContains(String productName);
    DataResult<List<Product>> getByProductNameStartsWith(String productName);
    DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
}
