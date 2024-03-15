package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(TermsApiVerticle())
}

class TermsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.TermsApiImpl").newInstance() as TermsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(TermsApi.address)
            .register(TermsApi::class.java,instance)
    }
}