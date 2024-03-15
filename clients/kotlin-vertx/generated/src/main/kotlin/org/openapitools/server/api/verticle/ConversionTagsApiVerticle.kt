package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ConversionTagsApiVerticle())
}

class ConversionTagsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ConversionTagsApiImpl").newInstance() as ConversionTagsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ConversionTagsApi.address)
            .register(ConversionTagsApi::class.java,instance)
    }
}