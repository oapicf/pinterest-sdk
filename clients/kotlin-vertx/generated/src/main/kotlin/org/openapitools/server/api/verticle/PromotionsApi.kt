package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.Promotion
import org.openapitools.server.api.model.PromotionBatchUpdate
import org.openapitools.server.api.model.PromotionCreate
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
    suspend fun promotionsCreate(adAccountId:kotlin.String?,promotionCreate:kotlin.Array<PromotionCreate>?,context:OperationRequest):Response<PromotionsResponse>
    /* promotionsDelete
     * Delete promotion by id */
    suspend fun promotionsDelete(promotionId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<Promotion>
    /* promotionsGet
     * Get promotion by id */
    suspend fun promotionsGet(promotionId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<Promotion>
    /* promotionsList
     * Get promotions */
    suspend fun promotionsList(adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,order:PinterestLibPaginationOrder?,context:OperationRequest):Response<PromotionsList200Response>
    /* promotionsUpdate
     * Update promotions */
    suspend fun promotionsUpdate(adAccountId:kotlin.String?,promotionBatchUpdate:kotlin.Array<PromotionBatchUpdate>?,context:OperationRequest):Response<PromotionsResponse>
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
