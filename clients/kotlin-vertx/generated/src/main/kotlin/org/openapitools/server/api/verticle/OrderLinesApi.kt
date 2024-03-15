package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.OrderLine
import org.openapitools.server.api.model.OrderLinesList200Response
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import io.vertx.core.json.JsonArray
import com.github.wooyme.openapi.Response
import io.vertx.ext.web.api.OperationRequest
import io.vertx.kotlin.ext.web.api.contract.openapi3.OpenAPI3RouterFactory
import io.vertx.serviceproxy.ServiceBinder
import io.vertx.ext.web.handler.CookieHandler
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.ext.web.sstore.LocalSessionStore
import java.util.List
import java.util.Map


interface OrderLinesApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* orderLinesGet
     * Get order line */
    suspend fun orderLinesGet(adAccountId:kotlin.String?,orderLineId:kotlin.String?,context:OperationRequest):Response<OrderLine>
    /* orderLinesList
     * Get order lines */
    suspend fun orderLinesList(adAccountId:kotlin.String?,pageSize:kotlin.Int?,order:kotlin.String?,bookmark:kotlin.String?,context:OperationRequest):Response<OrderLinesList200Response>
    companion object {
        const val address = "OrderLinesApi-service"
        suspend fun createRouterFactory(vertx: Vertx,path:String): io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory {
            val routerFactory = OpenAPI3RouterFactory.createAwait(vertx,path)
            routerFactory.addGlobalHandler(CookieHandler.create())
            routerFactory.addGlobalHandler(SessionHandler.create(LocalSessionStore.create(vertx)))
            routerFactory.setExtraOperationContextPayloadMapper{
                JsonObject().put("files",JsonArray(it.fileUploads().map { it.uploadedFileName() }))
            }
            val opf = routerFactory::class.java.getDeclaredField("operations")
            opf.isAccessible = true
            val operations = opf.get(routerFactory) as Map<String, Any>
            for (m in OrderLinesApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(OrderLinesApi::class.java, address)
            return routerFactory
        }
    }
}
