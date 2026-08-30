package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ProductTagsApiVerticle())
}

class ProductTagsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ProductTagsApiImpl").newInstance() as ProductTagsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ProductTagsApi.address)
            .register(ProductTagsApi::class.java,instance)
    }
}