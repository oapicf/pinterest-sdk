package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(CatalogSupplementalApiVerticle())
}

class CatalogSupplementalApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.CatalogSupplementalApiImpl").newInstance() as CatalogSupplementalApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(CatalogSupplementalApi.address)
            .register(CatalogSupplementalApi::class.java,instance)
    }
}