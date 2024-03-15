package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ProductGroupPromotionsApiVerticle())
}

class ProductGroupPromotionsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ProductGroupPromotionsApiImpl").newInstance() as ProductGroupPromotionsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ProductGroupPromotionsApi.address)
            .register(ProductGroupPromotionsApi::class.java,instance)
    }
}