package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(AdAccountsApiVerticle())
}

class AdAccountsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.AdAccountsApiImpl").newInstance() as AdAccountsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(AdAccountsApi.address)
            .register(AdAccountsApi::class.java,instance)
    }
}