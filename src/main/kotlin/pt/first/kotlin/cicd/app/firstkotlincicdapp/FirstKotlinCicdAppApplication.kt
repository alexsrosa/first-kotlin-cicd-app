package pt.first.kotlin.cicd.app.firstkotlincicdapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstKotlinCicdAppApplication

fun main(args: Array<String>) {
    runApplication<FirstKotlinCicdAppApplication>(*args)
}
