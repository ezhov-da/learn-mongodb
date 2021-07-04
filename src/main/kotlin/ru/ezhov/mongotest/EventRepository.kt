package ru.ezhov.mongotest

import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface EventRepository : ReactiveMongoRepository<Event, String>