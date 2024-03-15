package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.Granularity
import org.openapitools.server.api.model.ProductGroupAnalyticsResponseInner
import org.openapitools.server.api.model.ProductGroupPromotionCreateRequest
import org.openapitools.server.api.model.ProductGroupPromotionResponse
import org.openapitools.server.api.model.ProductGroupPromotionUpdateRequest
import org.openapitools.server.api.model.ProductGroupPromotionsList200Response
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


interface ProductGroupPromotionsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* productGroupPromotionsCreate
     * Create product group promotions */
    suspend fun productGroupPromotionsCreate(adAccountId:kotlin.String?,productGroupPromotionCreateRequest:ProductGroupPromotionCreateRequest?,context:OperationRequest):Response<ProductGroupPromotionResponse>
    /* productGroupPromotionsGet
     * Get a product group promotion by id */
    suspend fun productGroupPromotionsGet(adAccountId:kotlin.String?,productGroupPromotionId:kotlin.String?,context:OperationRequest):Response<ProductGroupPromotionResponse>
    /* productGroupPromotionsList
     * Get product group promotions */
    suspend fun productGroupPromotionsList(adAccountId:kotlin.String?,productGroupPromotionIds:kotlin.Array<kotlin.String>?,entityStatuses:kotlin.Array<kotlin.String>?,adGroupId:kotlin.String?,pageSize:kotlin.Int?,order:kotlin.String?,bookmark:kotlin.String?,context:OperationRequest):Response<ProductGroupPromotionsList200Response>
    /* productGroupPromotionsUpdate
     * Update product group promotions */
    suspend fun productGroupPromotionsUpdate(adAccountId:kotlin.String?,productGroupPromotionUpdateRequest:ProductGroupPromotionUpdateRequest?,context:OperationRequest):Response<ProductGroupPromotionResponse>
    /* productGroupsAnalytics
     * Get product group analytics */
    suspend fun productGroupsAnalytics(adAccountId:kotlin.String?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,productGroupIds:kotlin.Array<kotlin.String>?,columns:kotlin.Array<kotlin.String>?,granularity:Granularity?,clickWindowDays:kotlin.Int?,engagementWindowDays:kotlin.Int?,viewWindowDays:kotlin.Int?,conversionReportTime:kotlin.String?,context:OperationRequest):Response<kotlin.Array<ProductGroupAnalyticsResponseInner>>
    companion object {
        const val address = "ProductGroupPromotionsApi-service"
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
            for (m in ProductGroupPromotionsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ProductGroupPromotionsApi::class.java, address)
            return routerFactory
        }
    }
}
