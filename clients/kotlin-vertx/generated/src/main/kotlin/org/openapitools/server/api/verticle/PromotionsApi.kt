package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.PromotionCreateRequest
import org.openapitools.server.api.model.PromotionResponse
import org.openapitools.server.api.model.PromotionUpdateRequest
import org.openapitools.server.api.model.PromotionsList200Response
import org.openapitools.server.api.model.PromotionsResponse
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


interface PromotionsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* promotionsCreate
     * Create promotions */
    suspend fun promotionsCreate(adAccountId:kotlin.String?,promotionCreateRequest:kotlin.Array<PromotionCreateRequest>?,context:OperationRequest):Response<PromotionsResponse>
    /* promotionsDelete
     * Delete promotion by id */
    suspend fun promotionsDelete(adAccountId:kotlin.String?,promotionId:kotlin.String?,context:OperationRequest):Response<Void>
    /* promotionsGet
     * Get promotion by id */
    suspend fun promotionsGet(adAccountId:kotlin.String?,promotionId:kotlin.String?,context:OperationRequest):Response<PromotionResponse>
    /* promotionsList
     * Get promotions */
    suspend fun promotionsList(adAccountId:kotlin.String?,pageSize:kotlin.Int?,order:kotlin.String?,bookmark:kotlin.String?,context:OperationRequest):Response<PromotionsList200Response>
    /* promotionsUpdate
     * Update promotions */
    suspend fun promotionsUpdate(adAccountId:kotlin.String?,promotionUpdateRequest:kotlin.Array<PromotionUpdateRequest>?,context:OperationRequest):Response<PromotionsResponse>
    companion object {
        const val address = "PromotionsApi-service"
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
            for (m in PromotionsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(PromotionsApi::class.java, address)
            return routerFactory
        }
    }
}
