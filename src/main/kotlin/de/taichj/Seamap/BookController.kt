package de.taichj.Seamap

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller

@Controller
class BookController {
    @QueryMapping
    fun bookById(@Argument id: String): Book {
        return Book(id, "Was auch immer")
    }

    @SchemaMapping
    fun author(book: Book): Author {
        return Author(book.id, "Karl", "Marks")
    }
}