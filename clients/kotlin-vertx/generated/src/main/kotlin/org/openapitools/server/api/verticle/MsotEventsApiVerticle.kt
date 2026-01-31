package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(MsotEventsApiVerticle())
}

class MsotEventsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.MsotEventsApiImpl").newInstance() as MsotEventsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(MsotEventsApi.address)
            .register(MsotEventsApi::class.java,instance)
    }
}