package com.example.graphql_demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class GraphqlDemoApplication

fun main(args: Array<String>) {
	runApplication<GraphqlDemoApplication>(*args)
}
