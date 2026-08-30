package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(TrendsApiVerticle())
}

class TrendsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.TrendsApiImpl").newInstance() as TrendsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(TrendsApi.address)
            .register(TrendsApi::class.java,instance)
    }
}