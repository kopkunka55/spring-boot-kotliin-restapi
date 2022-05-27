package com.example.springrestapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("product")
data class Product (
    @Id val product_id: String,
    val product_name: String,
    val stock: Int,
    val created_on: String
    )