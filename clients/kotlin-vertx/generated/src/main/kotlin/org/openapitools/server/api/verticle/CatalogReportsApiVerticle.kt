package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(CatalogReportsApiVerticle())
}

class CatalogReportsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.CatalogReportsApiImpl").newInstance() as CatalogReportsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(CatalogReportsApi.address)
            .register(CatalogReportsApi::class.java,instance)
    }
}