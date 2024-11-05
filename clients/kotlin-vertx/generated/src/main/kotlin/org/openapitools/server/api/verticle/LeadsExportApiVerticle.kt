package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(LeadsExportApiVerticle())
}

class LeadsExportApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.LeadsExportApiImpl").newInstance() as LeadsExportApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(LeadsExportApi.address)
            .register(LeadsExportApi::class.java,instance)
    }
}