package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.Audience
import org.openapitools.server.api.model.AudienceCreateCustomRequest
import org.openapitools.server.api.model.AudienceCreateRequest
import org.openapitools.server.api.model.AudienceUpdateRequest
import org.openapitools.server.api.model.AudiencesList200Response
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


interface AudiencesApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* audiencesCreate
     * Create audience */
    suspend fun audiencesCreate(adAccountId:kotlin.String?,audienceCreateRequest:AudienceCreateRequest?,context:OperationRequest):Response<Audience>
    /* audiencesCreateCustom
     * Create custom audience */
    suspend fun audiencesCreateCustom(adAccountId:kotlin.String?,audienceCreateCustomRequest:AudienceCreateCustomRequest?,context:OperationRequest):Response<Audience>
    /* audiencesGet
     * Get audience */
    suspend fun audiencesGet(adAccountId:kotlin.String?,audienceId:kotlin.String?,context:OperationRequest):Response<Audience>
    /* audiencesList
     * List audiences */
    suspend fun audiencesList(adAccountId:kotlin.String?,bookmark:kotlin.String?,order:kotlin.String?,pageSize:kotlin.Int?,ownershipType:kotlin.String?,context:OperationRequest):Response<AudiencesList200Response>
    /* audiencesUpdate
     * Update audience */
    suspend fun audiencesUpdate(adAccountId:kotlin.String?,audienceId:kotlin.String?,audienceUpdateRequest:AudienceUpdateRequest?,context:OperationRequest):Response<Audience>
    companion object {
        const val address = "AudiencesApi-service"
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
            for (m in AudiencesApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(AudiencesApi::class.java, address)
            return routerFactory
        }
    }
}
