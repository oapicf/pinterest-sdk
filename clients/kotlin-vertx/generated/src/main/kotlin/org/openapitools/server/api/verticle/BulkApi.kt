package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.BulkDownloadRequest
import org.openapitools.server.api.model.BulkDownloadResponse
import org.openapitools.server.api.model.BulkUpsertRequest
import org.openapitools.server.api.model.BulkUpsertResponse
import org.openapitools.server.api.model.BulkUpsertStatusResponse
import org.openapitools.server.api.model.Error
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


interface BulkApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* bulkDownloadCreate
     * Get advertiser entities in bulk */
    suspend fun bulkDownloadCreate(adAccountId:kotlin.String?,bulkDownloadRequest:BulkDownloadRequest?,context:OperationRequest):Response<BulkDownloadResponse>
    /* bulkRequestGet
     * Download advertiser entities in bulk */
    suspend fun bulkRequestGet(adAccountId:kotlin.String?,bulkRequestId:kotlin.String?,includeDetails:kotlin.Boolean?,context:OperationRequest):Response<BulkUpsertStatusResponse>
    /* bulkUpsertCreate
     * Create/update ad entities in bulk */
    suspend fun bulkUpsertCreate(adAccountId:kotlin.String?,bulkUpsertRequest:BulkUpsertRequest?,context:OperationRequest):Response<BulkUpsertResponse>
    companion object {
        const val address = "BulkApi-service"
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
            for (m in BulkApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(BulkApi::class.java, address)
            return routerFactory
        }
    }
}
