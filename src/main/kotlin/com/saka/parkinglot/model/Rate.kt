package com.saka.parkinglot.model

import java.math.BigDecimal
import java.time.LocalDateTime

data class Rate(
    val id: Long,
    val value: BigDecimal,
    val startDateTime: LocalDateTime,
    val endDateTime: LocalDateTime? = null
)
