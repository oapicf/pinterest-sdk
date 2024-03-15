package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(KeywordsApiVerticle())
}

class KeywordsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.KeywordsApiImpl").newInstance() as KeywordsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(KeywordsApi.address)
            .register(KeywordsApi::class.java,instance)
    }
}