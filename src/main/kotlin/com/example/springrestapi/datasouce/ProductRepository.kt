package com.example.springrestapi.datasouce

import com.example.springrestapi.model.Product
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface ProductRepository: CrudRepository<Product, String> {
    @Query("SELECT * FROM product")
    fun findProducts(): List<Product>

}