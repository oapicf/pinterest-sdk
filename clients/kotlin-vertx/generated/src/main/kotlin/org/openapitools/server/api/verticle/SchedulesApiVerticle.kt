package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(SchedulesApiVerticle())
}

class SchedulesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.SchedulesApiImpl").newInstance() as SchedulesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(SchedulesApi.address)
            .register(SchedulesApi::class.java,instance)
    }
}