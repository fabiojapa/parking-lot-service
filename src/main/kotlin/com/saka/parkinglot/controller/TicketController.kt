package com.saka.parkinglot.controller

import com.saka.parkinglot.model.Car
import com.saka.parkinglot.model.CarType
import com.saka.parkinglot.model.Client
import com.saka.parkinglot.model.Rate
import com.saka.parkinglot.model.Ticket
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal
import java.time.LocalDateTime

@RestController
@RequestMapping("/tickets")
class TicketController {
    @PostMapping
    fun create(ticket: Ticket): ResponseEntity<Ticket> {
        // returning hard coded sample entity created
        return ResponseEntity.ok(
            ticket
        )
    }

    @GetMapping("/{id}")
    @ResponseBody
    fun findById(@PathVariable id: Long?): ResponseEntity<Ticket> {
        // returning hard coded sample entity
        return ResponseEntity.ok(
            Ticket(
                1L,
                Client(1L, "fabio saka"),
                Car(
                    1L,
                    "ferrari",
                    CarType(
                        1L,
                        "sport",
                        Rate(1L, BigDecimal.valueOf(5.0), LocalDateTime.now())
                    )
                ),
                LocalDateTime.now(),
                LocalDateTime.now(),
                BigDecimal.valueOf(10.0)
            )
        )
    }
}