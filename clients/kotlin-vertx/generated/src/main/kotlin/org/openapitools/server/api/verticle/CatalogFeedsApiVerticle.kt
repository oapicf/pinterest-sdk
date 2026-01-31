package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(CatalogFeedsApiVerticle())
}

class CatalogFeedsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.CatalogFeedsApiImpl").newInstance() as CatalogFeedsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(CatalogFeedsApi.address)
            .register(CatalogFeedsApi::class.java,instance)
    }
}