package example.micronaut

import io.micronaut.core.version.VersionUtils
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.reactivex.Single

@Controller("/")
class HelloController(private val greetingService: GreetingService) {

    @Get("/hello/{name}")
    fun sayHi(name: String): Single<Greeting> {
        return greetingService.sayHi(name)
    }

    @Get("/version")
    fun version(): String {
        return VersionUtils.MICRONAUT_VERSION
    }

    @Get("/color/{color}")
    fun test(color: Color) = color
}
