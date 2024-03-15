package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(AudiencesApiVerticle())
}

class AudiencesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.AudiencesApiImpl").newInstance() as AudiencesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(AudiencesApi.address)
            .register(AudiencesApi::class.java,instance)
    }
}