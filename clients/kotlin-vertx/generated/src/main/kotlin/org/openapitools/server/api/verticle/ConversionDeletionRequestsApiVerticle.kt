package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ConversionDeletionRequestsApiVerticle())
}

class ConversionDeletionRequestsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ConversionDeletionRequestsApiImpl").newInstance() as ConversionDeletionRequestsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ConversionDeletionRequestsApi.address)
            .register(ConversionDeletionRequestsApi::class.java,instance)
    }
}