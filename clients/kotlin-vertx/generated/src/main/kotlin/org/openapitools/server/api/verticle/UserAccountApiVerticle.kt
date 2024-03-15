package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(UserAccountApiVerticle())
}

class UserAccountApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.UserAccountApiImpl").newInstance() as UserAccountApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(UserAccountApi.address)
            .register(UserAccountApi::class.java,instance)
    }
}