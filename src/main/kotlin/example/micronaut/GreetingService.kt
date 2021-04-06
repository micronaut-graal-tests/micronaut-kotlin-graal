package example.micronaut

import io.reactivex.Single
import javax.inject.Singleton

@Singleton
class GreetingService {

    fun sayHi(name: String): Single<Greeting> {
        return Single.just(Greeting("Hello $name"))
    }
}
