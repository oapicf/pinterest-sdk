package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ProductCategoriesApiVerticle())
}

class ProductCategoriesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ProductCategoriesApiImpl").newInstance() as ProductCategoriesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ProductCategoriesApi.address)
            .register(ProductCategoriesApi::class.java,instance)
    }
}