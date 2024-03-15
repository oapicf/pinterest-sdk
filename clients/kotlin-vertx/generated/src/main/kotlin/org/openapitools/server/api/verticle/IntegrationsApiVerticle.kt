package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(IntegrationsApiVerticle())
}

class IntegrationsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.IntegrationsApiImpl").newInstance() as IntegrationsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(IntegrationsApi.address)
            .register(IntegrationsApi::class.java,instance)
    }
}