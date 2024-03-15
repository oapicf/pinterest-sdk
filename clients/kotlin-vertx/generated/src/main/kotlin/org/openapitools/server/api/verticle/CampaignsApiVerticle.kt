package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(CampaignsApiVerticle())
}

class CampaignsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.CampaignsApiImpl").newInstance() as CampaignsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(CampaignsApi.address)
            .register(CampaignsApi::class.java,instance)
    }
}