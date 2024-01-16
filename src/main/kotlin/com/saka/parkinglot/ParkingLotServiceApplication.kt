package com.saka.parkinglot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ParkingLotServiceApplication

fun main(args: Array<String>) {
    runApplication<ParkingLotServiceApplication>(*args)
}
