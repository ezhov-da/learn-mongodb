package ru.ezhov.mongotest

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class Controller(
        private val eventRepository: EventRepository
) {
    @GetMapping(
            path = ["/save"],
            produces = arrayOf(MediaType.TEXT_EVENT_STREAM_VALUE)
    )
    fun saveAndSend(@RequestParam("name") name: String) =
            eventRepository
                    .save(Event(name))
                    .flux()
}