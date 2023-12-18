package de.taichj.Seamap.fields

import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class FieldController {
    @QueryMapping
    fun field() = Field(1, 1, 1, FIELD_TYPE.SEA)
}