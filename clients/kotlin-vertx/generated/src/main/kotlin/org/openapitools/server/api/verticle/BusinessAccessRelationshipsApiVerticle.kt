package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(BusinessAccessRelationshipsApiVerticle())
}

class BusinessAccessRelationshipsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.BusinessAccessRelationshipsApiImpl").newInstance() as BusinessAccessRelationshipsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(BusinessAccessRelationshipsApi.address)
            .register(BusinessAccessRelationshipsApi::class.java,instance)
    }
}