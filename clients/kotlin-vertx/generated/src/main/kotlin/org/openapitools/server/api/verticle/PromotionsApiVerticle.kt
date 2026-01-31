package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(PromotionsApiVerticle())
}

class PromotionsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.PromotionsApiImpl").newInstance() as PromotionsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(PromotionsApi.address)
            .register(PromotionsApi::class.java,instance)
    }
}