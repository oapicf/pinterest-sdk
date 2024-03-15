package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(SearchApiVerticle())
}

class SearchApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.SearchApiImpl").newInstance() as SearchApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(SearchApi.address)
            .register(SearchApi::class.java,instance)
    }
}