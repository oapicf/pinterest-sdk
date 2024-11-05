package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(TargetingTemplateApiVerticle())
}

class TargetingTemplateApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.TargetingTemplateApiImpl").newInstance() as TargetingTemplateApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(TargetingTemplateApi.address)
            .register(TargetingTemplateApi::class.java,instance)
    }
}