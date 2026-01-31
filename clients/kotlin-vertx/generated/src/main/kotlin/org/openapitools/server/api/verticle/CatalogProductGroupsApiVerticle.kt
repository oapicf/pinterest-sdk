package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(CatalogProductGroupsApiVerticle())
}

class CatalogProductGroupsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.CatalogProductGroupsApiImpl").newInstance() as CatalogProductGroupsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(CatalogProductGroupsApi.address)
            .register(CatalogProductGroupsApi::class.java,instance)
    }
}