package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(CustomerListUploadsApiVerticle())
}

class CustomerListUploadsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.CustomerListUploadsApiImpl").newInstance() as CustomerListUploadsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(CustomerListUploadsApi.address)
            .register(CustomerListUploadsApi::class.java,instance)
    }
}