package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(MediaApiVerticle())
}

class MediaApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.MediaApiImpl").newInstance() as MediaApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(MediaApi.address)
            .register(MediaApi::class.java,instance)
    }
}