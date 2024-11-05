package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.LeadFormArrayResponse
import org.openapitools.server.api.model.LeadFormCreateRequest
import org.openapitools.server.api.model.LeadFormResponse
import org.openapitools.server.api.model.LeadFormTestRequest
import org.openapitools.server.api.model.LeadFormTestResponse
import org.openapitools.server.api.model.LeadFormUpdateRequest
import org.openapitools.server.api.model.LeadFormsList200Response
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


interface LeadFormsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* leadFormGet
     * Get lead form by id */
    suspend fun leadFormGet(adAccountId:kotlin.String?,leadFormId:kotlin.String?,context:OperationRequest):Response<LeadFormResponse>
    /* leadFormTestCreate
     * Create lead form test data */
    suspend fun leadFormTestCreate(adAccountId:kotlin.String?,leadFormId:kotlin.String?,leadFormTestRequest:LeadFormTestRequest?,context:OperationRequest):Response<LeadFormTestResponse>
    /* leadFormsCreate
     * Create lead forms */
    suspend fun leadFormsCreate(adAccountId:kotlin.String?,leadFormCreateRequest:kotlin.Array<LeadFormCreateRequest>?,context:OperationRequest):Response<LeadFormArrayResponse>
    /* leadFormsList
     * List lead forms */
    suspend fun leadFormsList(adAccountId:kotlin.String?,pageSize:kotlin.Int?,order:kotlin.String?,bookmark:kotlin.String?,context:OperationRequest):Response<LeadFormsList200Response>
    /* leadFormsUpdate
     * Update lead forms */
    suspend fun leadFormsUpdate(adAccountId:kotlin.String?,leadFormUpdateRequest:kotlin.Array<LeadFormUpdateRequest>?,context:OperationRequest):Response<LeadFormArrayResponse>
    companion object {
        const val address = "LeadFormsApi-service"
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
            for (m in LeadFormsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(LeadFormsApi::class.java, address)
            return routerFactory
        }
    }
}
