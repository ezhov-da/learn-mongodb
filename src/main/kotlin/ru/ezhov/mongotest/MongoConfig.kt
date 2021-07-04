package ru.ezhov.mongotest

import com.mongodb.reactivestreams.client.MongoClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@Configuration
@EnableReactiveMongoRepositories(
        basePackageClasses = arrayOf(EventRepository::class))
class MongoConfig(
        private val mongoClient: MongoClient
) {
    @Bean
    fun reactiveMongoTemplate() = ReactiveMongoTemplate(mongoClient, "testdb")
}