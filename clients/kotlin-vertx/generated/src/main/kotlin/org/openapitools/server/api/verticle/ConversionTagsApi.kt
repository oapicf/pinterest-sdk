package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.ConversionEventResponse
import org.openapitools.server.api.model.ConversionTagCreate
import org.openapitools.server.api.model.ConversionTagListResponse
import org.openapitools.server.api.model.ConversionTagResponse
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.PageVisitConversionTagsGet200Response
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


interface ConversionTagsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* conversionTagsCreate
     * Create conversion tag */
    suspend fun conversionTagsCreate(adAccountId:kotlin.String?,conversionTagCreate:ConversionTagCreate?,context:OperationRequest):Response<ConversionTagResponse>
    /* conversionTagsGet
     * Get conversion tag */
    suspend fun conversionTagsGet(adAccountId:kotlin.String?,conversionTagId:kotlin.String?,context:OperationRequest):Response<ConversionTagResponse>
    /* conversionTagsList
     * Get conversion tags */
    suspend fun conversionTagsList(adAccountId:kotlin.String?,filterDeleted:kotlin.Boolean?,context:OperationRequest):Response<ConversionTagListResponse>
    /* ocpmEligibleConversionTagsGet
     * Get Ocpm eligible conversion tags */
    suspend fun ocpmEligibleConversionTagsGet(adAccountId:kotlin.String?,context:OperationRequest):Response<kotlin.collections.Map<kotlin.String, kotlin.Array<ConversionEventResponse>>>
    /* pageVisitConversionTagsGet
     * Get page visit conversion tags */
    suspend fun pageVisitConversionTagsGet(adAccountId:kotlin.String?,pageSize:kotlin.Int?,order:kotlin.String?,bookmark:kotlin.String?,context:OperationRequest):Response<PageVisitConversionTagsGet200Response>
    companion object {
        const val address = "ConversionTagsApi-service"
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
            for (m in ConversionTagsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ConversionTagsApi::class.java, address)
            return routerFactory
        }
    }
}
