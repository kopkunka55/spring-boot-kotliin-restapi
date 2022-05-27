package com.example.springrestapi.controller

import com.example.springrestapi.model.Product
import com.example.springrestapi.service.ProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("products")
class ProductController(val service: ProductService) {
    @GetMapping("/")
    fun index(): List<Product> {
        return service.findProducts()
    }

    @GetMapping("/health-check")
    fun healthCheck(): String {
        return "Healthy"
    }

    @PostMapping("/")
    fun post(@RequestBody product: Product){
        service.registerProduct(product)
    }
}