package com.ubo.northwind.dataAccess.abstracts;

import com.ubo.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer>
{

}
