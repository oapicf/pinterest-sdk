package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AdAccountsCountryResponse
import org.openapitools.server.api.model.BookClosedResponse
import org.openapitools.server.api.model.DeliveryMetricsResponse
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.SingleInterestTargetingOptionResponse
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


interface ResourcesApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* adAccountCountriesGet
     * Get ad accounts countries */
    suspend fun adAccountCountriesGet(context:OperationRequest):Response<AdAccountsCountryResponse>
    /* deliveryMetricsGet
     * Get available metrics&#39; definitions */
    suspend fun deliveryMetricsGet(reportType:kotlin.String?,context:OperationRequest):Response<DeliveryMetricsResponse>
    /* interestTargetingOptionsGet
     * Get interest details */
    suspend fun interestTargetingOptionsGet(interestId:kotlin.String?,context:OperationRequest):Response<SingleInterestTargetingOptionResponse>
    /* leadFormQuestionsGet
     * Get lead form questions */
    suspend fun leadFormQuestionsGet(context:OperationRequest):Response<Void>
    /* metricsReadyStateGet
     * Get metrics ready state */
    suspend fun metricsReadyStateGet(date:kotlin.String?,context:OperationRequest):Response<BookClosedResponse>
    /* targetingOptionsGet
     * Get targeting options */
    suspend fun targetingOptionsGet(targetingType:kotlin.String?,clientId:kotlin.String?,oauthSignature:kotlin.String?,timestamp:kotlin.String?,context:OperationRequest):Response<kotlin.Array<kotlin.Any>>
    companion object {
        const val address = "ResourcesApi-service"
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
            for (m in ResourcesApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ResourcesApi::class.java, address)
            return routerFactory
        }
    }
}
