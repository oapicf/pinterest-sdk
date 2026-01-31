package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ConversionsApiVerticle())
}

class ConversionsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ConversionsApiImpl").newInstance() as ConversionsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ConversionsApi.address)
            .register(ConversionsApi::class.java,instance)
    }
}