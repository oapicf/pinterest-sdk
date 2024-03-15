package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(OrderLinesApiVerticle())
}

class OrderLinesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.OrderLinesApiImpl").newInstance() as OrderLinesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(OrderLinesApi.address)
            .register(OrderLinesApi::class.java,instance)
    }
}