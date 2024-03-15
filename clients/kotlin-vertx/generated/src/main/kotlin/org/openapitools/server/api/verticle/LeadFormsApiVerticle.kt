package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(LeadFormsApiVerticle())
}

class LeadFormsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.LeadFormsApiImpl").newInstance() as LeadFormsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(LeadFormsApi.address)
            .register(LeadFormsApi::class.java,instance)
    }
}