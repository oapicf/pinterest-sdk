package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.DetailedError
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.IntegrationLogsRequest
import org.openapitools.server.api.model.IntegrationLogsSuccessResponse
import org.openapitools.server.api.model.IntegrationMetadata
import org.openapitools.server.api.model.IntegrationRecord
import org.openapitools.server.api.model.IntegrationRequest
import org.openapitools.server.api.model.IntegrationRequestPatch
import org.openapitools.server.api.model.IntegrationsGetList200Response
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


interface IntegrationsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* integrationsCommerceDel
     * Delete commerce integration */
    suspend fun integrationsCommerceDel(externalBusinessId:kotlin.String?,context:OperationRequest):Response<Void>
    /* integrationsCommerceGet
     * Get commerce integration */
    suspend fun integrationsCommerceGet(externalBusinessId:kotlin.String?,context:OperationRequest):Response<IntegrationMetadata>
    /* integrationsCommercePatch
     * Update commerce integration */
    suspend fun integrationsCommercePatch(externalBusinessId:kotlin.String?,integrationRequestPatch:IntegrationRequestPatch?,context:OperationRequest):Response<IntegrationMetadata>
    /* integrationsCommercePost
     * Create commerce integration */
    suspend fun integrationsCommercePost(integrationRequest:IntegrationRequest?,context:OperationRequest):Response<IntegrationMetadata>
    /* integrationsGetById
     * Get integration metadata */
    suspend fun integrationsGetById(id:kotlin.String?,context:OperationRequest):Response<IntegrationRecord>
    /* integrationsGetList
     * Get integration metadata list */
    suspend fun integrationsGetList(bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<IntegrationsGetList200Response>
    /* integrationsLogsPost
     * Receives batched logs from integration applications. */
    suspend fun integrationsLogsPost(integrationLogsRequest:IntegrationLogsRequest?,context:OperationRequest):Response<IntegrationLogsSuccessResponse>
    companion object {
        const val address = "IntegrationsApi-service"
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
            for (m in IntegrationsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(IntegrationsApi::class.java, address)
            return routerFactory
        }
    }
}
