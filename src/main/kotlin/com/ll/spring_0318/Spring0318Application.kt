package com.ll.spring_0318

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class Spring0318Application

fun main(args: Array<String>) {
    runApplication<Spring0318Application>(*args)
}
