package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(AudienceInsightsApiVerticle())
}

class AudienceInsightsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.AudienceInsightsApiImpl").newInstance() as AudienceInsightsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(AudienceInsightsApi.address)
            .register(AudienceInsightsApi::class.java,instance)
    }
}