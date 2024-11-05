package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(AdvancedAuctionApiVerticle())
}

class AdvancedAuctionApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.AdvancedAuctionApiImpl").newInstance() as AdvancedAuctionApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(AdvancedAuctionApi.address)
            .register(AdvancedAuctionApi::class.java,instance)
    }
}