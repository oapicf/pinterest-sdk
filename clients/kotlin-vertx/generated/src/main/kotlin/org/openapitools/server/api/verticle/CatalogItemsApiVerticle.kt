package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(CatalogItemsApiVerticle())
}

class CatalogItemsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.CatalogItemsApiImpl").newInstance() as CatalogItemsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(CatalogItemsApi.address)
            .register(CatalogItemsApi::class.java,instance)
    }
}