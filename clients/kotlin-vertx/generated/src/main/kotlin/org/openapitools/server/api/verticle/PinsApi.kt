package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.Pin
import org.openapitools.server.api.model.PinAnalyticsMetricsResponse
import org.openapitools.server.api.model.PinCreate
import org.openapitools.server.api.model.PinUpdate
import org.openapitools.server.api.model.PinsAnalyticsMetricTypesParameterInner
import org.openapitools.server.api.model.PinsList200Response
import org.openapitools.server.api.model.PinsSaveRequest
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
    suspend fun pinsAnalytics(pinId:kotlin.String?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,metricTypes:kotlin.Array<PinsAnalyticsMetricTypesParameterInner>?,appTypes:kotlin.String?,splitField:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<kotlin.collections.Map<kotlin.String, PinAnalyticsMetricsResponse>>
    /* pinsCreate
     * Create Pin */
    suspend fun pinsCreate(pinCreate:PinCreate?,adAccountId:kotlin.String?,context:OperationRequest):Response<Pin>
    /* pinsDelete
     * Delete Pin */
    suspend fun pinsDelete(pinId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<Void>
    /* pinsGet
     * Get Pin */
    suspend fun pinsGet(pinId:kotlin.String?,pinMetrics:kotlin.Boolean?,adAccountId:kotlin.String?,context:OperationRequest):Response<Pin>
    /* pinsList
     * List Pins */
    suspend fun pinsList(bookmark:kotlin.String?,pageSize:kotlin.Int?,pinFilter:kotlin.String?,includeProtectedPins:kotlin.Boolean?,pinType:kotlin.String?,creativeTypes:kotlin.Array<kotlin.String>?,adAccountId:kotlin.String?,pinMetrics:kotlin.Boolean?,context:OperationRequest):Response<PinsList200Response>
    /* pinsSave
     * Save Pin */
    suspend fun pinsSave(pinId:kotlin.String?,pinsSaveRequest:PinsSaveRequest?,adAccountId:kotlin.String?,context:OperationRequest):Response<Pin>
    /* pinsUpdate
     * Update Pin */
    suspend fun pinsUpdate(pinId:kotlin.String?,pinUpdate:PinUpdate?,adAccountId:kotlin.String?,context:OperationRequest):Response<Pin>
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
