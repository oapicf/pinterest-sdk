package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(AdGroupsApiVerticle())
}

class AdGroupsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.AdGroupsApiImpl").newInstance() as AdGroupsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(AdGroupsApi.address)
            .register(AdGroupsApi::class.java,instance)
    }
}