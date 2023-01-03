package com.example.graphql_demo.model.gql

import org.bson.types.ObjectId

data class BookResponse(
    val id: ObjectId,
    val title: String,
    val pages: Int,
)
