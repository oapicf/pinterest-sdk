package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ConversionEventsApiVerticle())
}

class ConversionEventsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ConversionEventsApiImpl").newInstance() as ConversionEventsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ConversionEventsApi.address)
            .register(ConversionEventsApi::class.java,instance)
    }
}