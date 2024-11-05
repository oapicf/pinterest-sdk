package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.TargetingTemplateCreate
import org.openapitools.server.api.model.TargetingTemplateGetResponseData
import org.openapitools.server.api.model.TargetingTemplateList200Response
import org.openapitools.server.api.model.TargetingTemplateUpdateRequest
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


interface TargetingTemplateApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* targetingTemplateCreate
     * Create targeting templates */
    suspend fun targetingTemplateCreate(adAccountId:kotlin.String?,targetingTemplateCreate:TargetingTemplateCreate?,context:OperationRequest):Response<TargetingTemplateGetResponseData>
    /* targetingTemplateList
     * List targeting templates */
    suspend fun targetingTemplateList(adAccountId:kotlin.String?,order:kotlin.String?,includeSizing:kotlin.Boolean?,searchQuery:kotlin.String?,pageSize:kotlin.Int?,bookmark:kotlin.String?,context:OperationRequest):Response<TargetingTemplateList200Response>
    /* targetingTemplateUpdate
     * Update targeting templates */
    suspend fun targetingTemplateUpdate(adAccountId:kotlin.String?,targetingTemplateUpdateRequest:TargetingTemplateUpdateRequest?,context:OperationRequest):Response<Void>
    companion object {
        const val address = "TargetingTemplateApi-service"
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
            for (m in TargetingTemplateApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(TargetingTemplateApi::class.java, address)
            return routerFactory
        }
    }
}
