package com.saka.parkinglot.model

import java.math.BigDecimal
import java.time.LocalDateTime

data class Ticket(
    val id: Long,
    val client: Client,
    val car: Car,
    val startDateTime: LocalDateTime = LocalDateTime.now(),
    val endDateTime: LocalDateTime? = null,
    val total: BigDecimal? = null
)
