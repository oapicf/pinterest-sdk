package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(PinsApiVerticle())
}

class PinsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.PinsApiImpl").newInstance() as PinsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(PinsApi.address)
            .register(PinsApi::class.java,instance)
    }
}