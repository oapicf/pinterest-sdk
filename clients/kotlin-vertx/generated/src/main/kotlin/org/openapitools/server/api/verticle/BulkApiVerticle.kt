package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(BulkApiVerticle())
}

class BulkApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.BulkApiImpl").newInstance() as BulkApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(BulkApi.address)
            .register(BulkApi::class.java,instance)
    }
}