package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(BoardsApiVerticle())
}

class BoardsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.BoardsApiImpl").newInstance() as BoardsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(BoardsApi.address)
            .register(BoardsApi::class.java,instance)
    }
}