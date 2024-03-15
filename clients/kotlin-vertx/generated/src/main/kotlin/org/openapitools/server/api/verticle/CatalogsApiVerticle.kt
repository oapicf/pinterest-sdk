package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(CatalogsApiVerticle())
}

class CatalogsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.CatalogsApiImpl").newInstance() as CatalogsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(CatalogsApi.address)
            .register(CatalogsApi::class.java,instance)
    }
}