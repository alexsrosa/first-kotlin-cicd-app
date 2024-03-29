package pt.first.kotlin.cicd.app.firstkotlincicdapp.controller

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import java.util.*
import kotlin.collections.ArrayList

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 04/12/2021 17:34
 */
@RestController
@RequestMapping("/v2/first")
class V2FirstApiController {

    @GetMapping
    fun first(model: Model): String {
        return "${UUID.randomUUID()} - Always change"
    }

    @PostMapping("/anothers")
    fun saveAnother(@RequestParam name: String): String {
        listOfNames.add(name)
        return "$name is add on static list"
    }

    @GetMapping("/anothers")
    fun getAllAnothers(): ArrayList<String> {
        return listOfNames
    }
}

private var listOfNames = ArrayList<String>()