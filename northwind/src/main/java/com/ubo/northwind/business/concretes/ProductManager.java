package com.ubo.northwind.business.concretes;

import com.ubo.northwind.business.abstracts.ProductService;
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
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
