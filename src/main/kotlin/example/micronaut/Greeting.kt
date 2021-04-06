package example.micronaut

import io.micronaut.core.annotation.Introspected

@Introspected
data class Greeting(var msg: String)
