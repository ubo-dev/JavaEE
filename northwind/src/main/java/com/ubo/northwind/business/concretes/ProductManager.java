package com.ubo.northwind.business.concretes;

import com.ubo.northwind.business.abstracts.ProductService;
import com.ubo.northwind.core.utilites.results.DataResult;
import com.ubo.northwind.core.utilites.results.Result;
import com.ubo.northwind.core.utilites.results.SuccessDataResult;
import com.ubo.northwind.core.utilites.results.SuccessResult;
import com.ubo.northwind.dataAccess.abstracts.ProductDao;
import com.ubo.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService
{
    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data is listed");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Product has been added.");
    }
}
