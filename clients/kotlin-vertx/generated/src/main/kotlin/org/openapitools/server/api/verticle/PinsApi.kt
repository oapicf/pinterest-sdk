package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AnalyticsMetricsResponse
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.Pin
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


interface PinsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* pinsAnalytics
     * Get Pin analytics */
    suspend fun pinsAnalytics(pinId:kotlin.String?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,metricTypes:kotlin.Array<kotlin.String>?,appTypes:kotlin.String?,splitField:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<kotlin.collections.Map<kotlin.String, AnalyticsMetricsResponse>>
    /* pinsCreate
     * Create Pin */
    suspend fun pinsCreate(pin:Pin?,context:OperationRequest):Response<Pin>
    /* pinsDelete
     * Delete Pin */
    suspend fun pinsDelete(pinId:kotlin.String?,context:OperationRequest):Response<Void>
    /* pinsGet
     * Get Pin */
    suspend fun pinsGet(pinId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<Pin>
    companion object {
        const val address = "PinsApi-service"
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
            for (m in PinsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(PinsApi::class.java, address)
            return routerFactory
        }
    }
}
