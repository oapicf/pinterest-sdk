package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.LabelCreateRequest
import org.openapitools.server.api.model.LabelUpdateRequest
import org.openapitools.server.api.model.LabeledEntities
import org.openapitools.server.api.model.LabeledEntitiesCreate
import org.openapitools.server.api.model.LabelsList200Response
import org.openapitools.server.api.model.LabelsResponse
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.QueryLabelEntityStatusesItems
import org.openapitools.server.api.model.QueryLabelTypesItems
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


interface LabelsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* labelsApply
     * Apply label to entity */
    suspend fun labelsApply(adAccountId:kotlin.String?,labelId:kotlin.String?,labeledEntitiesCreate:LabeledEntitiesCreate?,context:OperationRequest):Response<LabeledEntities>
    /* labelsCreate
     * Create labels */
    suspend fun labelsCreate(adAccountId:kotlin.String?,labelCreateRequest:LabelCreateRequest?,context:OperationRequest):Response<LabelsResponse>
    /* labelsList
     * List labels */
    suspend fun labelsList(adAccountId:kotlin.String?,campaignIds:kotlin.Array<kotlin.String>?,labelIds:kotlin.Array<kotlin.String>?,entityStatuses:kotlin.Array<QueryLabelEntityStatusesItems>?,labelTypes:kotlin.Array<QueryLabelTypesItems>?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<LabelsList200Response>
    /* labelsRemove
     * Remove label from entities */
    suspend fun labelsRemove(adAccountId:kotlin.String?,labelId:kotlin.String?,labeledEntitiesCreate:LabeledEntitiesCreate?,context:OperationRequest):Response<LabeledEntities>
    /* labelsUpdate
     * Update labels */
    suspend fun labelsUpdate(adAccountId:kotlin.String?,labelUpdateRequest:LabelUpdateRequest?,context:OperationRequest):Response<LabelsResponse>
    companion object {
        const val address = "LabelsApi-service"
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
            for (m in LabelsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(LabelsApi::class.java, address)
            return routerFactory
        }
    }
}
