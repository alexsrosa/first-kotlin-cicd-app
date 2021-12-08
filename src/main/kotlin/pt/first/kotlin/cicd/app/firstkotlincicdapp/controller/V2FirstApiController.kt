package pt.first.kotlin.cicd.app.firstkotlincicdapp.controller

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

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


    @GetMapping("/another")
    fun another(model: Model): String {
        return "${UUID.randomUUID()} - Always change too"
    }
}