package com.ubo.northwind.entities.concretes;

import lombok.Data;
import com.ubo.northwind.entities.concretes.Category;
import javax.persistence.*;

@Data
@Entity
@Table(name="products")
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;

    //@Column(name = "category_id")
    //private int categoryId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "units_in_stock")
    private short unitsInStock;

    @Column(name = "quantity_per_unit")
    private String QuantityPerUnit;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product(int id, String productName, double unitPrice, short unitsInStock, String quantityPerUnit) {
        this.id = id;
        //this.categoryId = categoryId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        QuantityPerUnit = quantityPerUnit;
    }

    public Product() {

    }
}
