package com.example.springrestapi.service

import com.example.springrestapi.datasouce.ProductRepository
import com.example.springrestapi.model.Product
import org.springframework.stereotype.Service

@Service
class ProductService( val db: ProductRepository){

    fun findProducts(): List<Product> = db.findProducts()

    fun registerProduct(product: Product) {
        db.save(product)
    }
}