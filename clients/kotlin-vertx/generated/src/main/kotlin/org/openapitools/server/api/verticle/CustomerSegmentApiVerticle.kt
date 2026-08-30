package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(CustomerSegmentApiVerticle())
}

class CustomerSegmentApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.CustomerSegmentApiImpl").newInstance() as CustomerSegmentApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(CustomerSegmentApi.address)
            .register(CustomerSegmentApi::class.java,instance)
    }
}