package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(CustomerListsApiVerticle())
}

class CustomerListsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.CustomerListsApiImpl").newInstance() as CustomerListsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(CustomerListsApi.address)
            .register(CustomerListsApi::class.java,instance)
    }
}