package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(BillingApiVerticle())
}

class BillingApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.BillingApiImpl").newInstance() as BillingApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(BillingApi.address)
            .register(BillingApi::class.java,instance)
    }
}