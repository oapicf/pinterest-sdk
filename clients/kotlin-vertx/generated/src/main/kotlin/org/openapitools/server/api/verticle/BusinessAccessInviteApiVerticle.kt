package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(BusinessAccessInviteApiVerticle())
}

class BusinessAccessInviteApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.BusinessAccessInviteApiImpl").newInstance() as BusinessAccessInviteApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(BusinessAccessInviteApi.address)
            .register(BusinessAccessInviteApi::class.java,instance)
    }
}