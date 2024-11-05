package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(AudienceSharingApiVerticle())
}

class AudienceSharingApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.AudienceSharingApiImpl").newInstance() as AudienceSharingApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(AudienceSharingApi.address)
            .register(AudienceSharingApi::class.java,instance)
    }
}