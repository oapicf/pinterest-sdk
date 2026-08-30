package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.ConversionDeletionRequest
import org.openapitools.server.api.model.ConversionDeletionRequestCreate
import org.openapitools.server.api.model.ConversionDeletionRequestList200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
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


interface ConversionDeletionRequestsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* conversionDeletionRequestCreate
     * Create a conversion deletion request */
    suspend fun conversionDeletionRequestCreate(adAccountId:kotlin.String?,conversionDeletionRequestCreate:ConversionDeletionRequestCreate?,context:OperationRequest):Response<ConversionDeletionRequest>
    /* conversionDeletionRequestDelete
     * Delete a conversion deletion request */
    suspend fun conversionDeletionRequestDelete(requestId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<ConversionDeletionRequest>
    /* conversionDeletionRequestGet
     * Get a single conversion deletion request */
    suspend fun conversionDeletionRequestGet(requestId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<ConversionDeletionRequest>
    /* conversionDeletionRequestList
     * List conversion deletion requests */
    suspend fun conversionDeletionRequestList(adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,order:PinterestLibPaginationOrder?,context:OperationRequest):Response<ConversionDeletionRequestList200Response>
    companion object {
        const val address = "ConversionDeletionRequestsApi-service"
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
            for (m in ConversionDeletionRequestsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ConversionDeletionRequestsApi::class.java, address)
            return routerFactory
        }
    }
}
