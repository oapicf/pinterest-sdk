package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(AdsApiVerticle())
}

class AdsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.AdsApiImpl").newInstance() as AdsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(AdsApi.address)
            .register(AdsApi::class.java,instance)
    }
}