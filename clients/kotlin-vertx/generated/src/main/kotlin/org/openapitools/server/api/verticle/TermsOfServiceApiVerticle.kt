package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(TermsOfServiceApiVerticle())
}

class TermsOfServiceApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.TermsOfServiceApiImpl").newInstance() as TermsOfServiceApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(TermsOfServiceApi.address)
            .register(TermsOfServiceApi::class.java,instance)
    }
}