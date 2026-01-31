package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(NotificationApiVerticle())
}

class NotificationApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.NotificationApiImpl").newInstance() as NotificationApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(NotificationApi.address)
            .register(NotificationApi::class.java,instance)
    }
}