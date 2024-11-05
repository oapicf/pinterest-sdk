package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(BusinessAccessAssetsApiVerticle())
}

class BusinessAccessAssetsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.BusinessAccessAssetsApiImpl").newInstance() as BusinessAccessAssetsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(BusinessAccessAssetsApi.address)
            .register(BusinessAccessAssetsApi::class.java,instance)
    }
}