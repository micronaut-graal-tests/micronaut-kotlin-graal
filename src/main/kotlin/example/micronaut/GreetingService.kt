package example.micronaut

import jakarta.inject.Singleton
import reactor.core.publisher.Mono

@Singleton
class GreetingService {

    fun sayHi(name: String): Mono<Greeting> {
        return Mono.just(Greeting("Hello $name"))
    }
}
