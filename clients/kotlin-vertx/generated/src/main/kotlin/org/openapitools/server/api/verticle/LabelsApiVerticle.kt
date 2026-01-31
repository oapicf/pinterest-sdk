package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(LabelsApiVerticle())
}

class LabelsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.LabelsApiImpl").newInstance() as LabelsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(LabelsApi.address)
            .register(LabelsApi::class.java,instance)
    }
}