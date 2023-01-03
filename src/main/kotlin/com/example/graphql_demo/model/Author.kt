package com.example.graphql_demo.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "Author")
data class Author(
    val id: Int,
    val firstname: String,
    val lastname: String,
    @DBRef
    val books: List<Book>
) {
    fun fullName(): String {
        return "$firstname $lastname"
    }
}
