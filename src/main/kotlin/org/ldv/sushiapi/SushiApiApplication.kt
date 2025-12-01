package org.ldv.sushiapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SushiApiApplication

fun main(args: Array<String>) {
    runApplication<SushiApiApplication>(*args)
}
