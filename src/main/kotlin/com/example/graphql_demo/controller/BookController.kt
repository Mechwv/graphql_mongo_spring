package com.example.graphql_demo.controller

import com.example.graphql_demo.model.Book
import com.example.graphql_demo.model.gql.BookInput
import com.example.graphql_demo.model.gql.BookResponse
import com.example.graphql_demo.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller

@Controller
class BookController(
    val bookRepository: BookRepository
) {

    @SchemaMapping(typeName = "Query", value = "allBooks")
    fun findAll(): List<Book?> {
        return bookRepository.findAll()
    }

    @QueryMapping
    fun findOne(@Argument("title") title: String): List<Book?> {
        return bookRepository.findByTitle(title)
    }

    @MutationMapping
    fun newBook(@Argument("input") bookInput: BookInput): BookResponse {
        val book1 = bookRepository.save(Book(
            title = bookInput.title,
            pages = bookInput.pages
        ))
        return BookResponse(book1.id, book1.title, book1.pages)
    }
}