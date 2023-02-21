package gov.cdc.ncezid.transport.service

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
//        Micronaut.run(Application.javaClass)
        Micronaut.build()
            .mainClass(Application.javaClass)
            .environmentPropertySource(true)
            .start()
    }
}