package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(OauthApiVerticle())
}

class OauthApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.OauthApiImpl").newInstance() as OauthApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(OauthApi.address)
            .register(OauthApi::class.java,instance)
    }
}