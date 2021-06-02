package example.micronaut

import io.reactivex.Single
import jakarta.inject.Singleton

@Singleton
class GreetingService {

    fun sayHi(name: String): Single<Greeting> {
        return Single.just(Greeting("Hello $name"))
    }
}
