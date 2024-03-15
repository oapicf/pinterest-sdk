package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AdsCreditRedeemRequest
import org.openapitools.server.api.model.AdsCreditRedeemResponse
import org.openapitools.server.api.model.AdsCreditsDiscountsGet200Response
import org.openapitools.server.api.model.BillingProfilesGet200Response
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.SSIOAccountResponse
import org.openapitools.server.api.model.SSIOCreateInsertionOrderRequest
import org.openapitools.server.api.model.SSIOCreateInsertionOrderResponse
import org.openapitools.server.api.model.SSIOEditInsertionOrderRequest
import org.openapitools.server.api.model.SSIOEditInsertionOrderResponse
import org.openapitools.server.api.model.SSIOInsertionOrderStatusResponse
import org.openapitools.server.api.model.SsioInsertionOrdersStatusGetByAdAccount200Response
import org.openapitools.server.api.model.SsioOrderLinesGetByAdAccount200Response
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


interface BillingApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* adsCreditRedeem
     * Redeem ad credits */
    suspend fun adsCreditRedeem(adAccountId:kotlin.String?,adsCreditRedeemRequest:AdsCreditRedeemRequest?,context:OperationRequest):Response<AdsCreditRedeemResponse>
    /* adsCreditsDiscountsGet
     * Get ads credit discounts */
    suspend fun adsCreditsDiscountsGet(adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<AdsCreditsDiscountsGet200Response>
    /* billingProfilesGet
     * Get billing profiles */
    suspend fun billingProfilesGet(adAccountId:kotlin.String?,isActive:kotlin.Boolean?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<BillingProfilesGet200Response>
    /* ssioAccountsGet
     * Get Salesforce account details including bill-to information. */
    suspend fun ssioAccountsGet(adAccountId:kotlin.String?,context:OperationRequest):Response<SSIOAccountResponse>
    /* ssioInsertionOrderCreate
     * Create insertion order through SSIO. */
    suspend fun ssioInsertionOrderCreate(adAccountId:kotlin.String?,ssIOCreateInsertionOrderRequest:SSIOCreateInsertionOrderRequest?,context:OperationRequest):Response<SSIOCreateInsertionOrderResponse>
    /* ssioInsertionOrderEdit
     * Edit insertion order through SSIO. */
    suspend fun ssioInsertionOrderEdit(adAccountId:kotlin.String?,ssIOEditInsertionOrderRequest:SSIOEditInsertionOrderRequest?,context:OperationRequest):Response<SSIOEditInsertionOrderResponse>
    /* ssioInsertionOrdersStatusGetByAdAccount
     * Get insertion order status by ad account id. */
    suspend fun ssioInsertionOrdersStatusGetByAdAccount(adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<SsioInsertionOrdersStatusGetByAdAccount200Response>
    /* ssioInsertionOrdersStatusGetByPinOrderId
     * Get insertion order status by pin order id. */
    suspend fun ssioInsertionOrdersStatusGetByPinOrderId(adAccountId:kotlin.String?,pinOrderId:kotlin.String?,context:OperationRequest):Response<SSIOInsertionOrderStatusResponse>
    /* ssioOrderLinesGetByAdAccount
     * Get Salesforce order lines by ad account id. */
    suspend fun ssioOrderLinesGetByAdAccount(adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,pinOrderId:kotlin.String?,context:OperationRequest):Response<SsioOrderLinesGetByAdAccount200Response>
    companion object {
        const val address = "BillingApi-service"
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
            for (m in BillingApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(BillingApi::class.java, address)
            return routerFactory
        }
    }
}
