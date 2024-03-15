package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ProductGroupsApiVerticle())
}

class ProductGroupsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ProductGroupsApiImpl").newInstance() as ProductGroupsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ProductGroupsApi.address)
            .register(ProductGroupsApi::class.java,instance)
    }
}