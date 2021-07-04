package ru.ezhov.mongotest

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "events")
data class Event(
        @Id
        val id: String? = null,
        var name: String
)