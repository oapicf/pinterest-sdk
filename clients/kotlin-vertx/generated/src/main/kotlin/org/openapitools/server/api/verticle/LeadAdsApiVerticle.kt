package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(LeadAdsApiVerticle())
}

class LeadAdsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.LeadAdsApiImpl").newInstance() as LeadAdsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(LeadAdsApi.address)
            .register(LeadAdsApi::class.java,instance)
    }
}