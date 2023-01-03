package com.example.graphql_demo.repository

import com.example.graphql_demo.model.Author
import com.example.graphql_demo.model.Book
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : MongoRepository<Book, String> {
    fun findByTitle(title: String): List<Book?>
}