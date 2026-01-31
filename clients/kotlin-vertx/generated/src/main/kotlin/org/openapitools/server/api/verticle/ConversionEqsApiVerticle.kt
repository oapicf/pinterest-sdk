package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ConversionEqsApiVerticle())
}

class ConversionEqsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ConversionEqsApiImpl").newInstance() as ConversionEqsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ConversionEqsApi.address)
            .register(ConversionEqsApi::class.java,instance)
    }
}