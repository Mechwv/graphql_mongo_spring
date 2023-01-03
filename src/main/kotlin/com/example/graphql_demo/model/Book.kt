package com.example.graphql_demo.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "Book")
data class Book(
    @Id
    val id: ObjectId = ObjectId.get(),
    val title: String,
    val pages: Int,
)
