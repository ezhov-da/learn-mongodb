package ru.ezhov.mongotest

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "events")
data class Event(val name: String)