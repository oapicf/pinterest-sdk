package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AdsCreditRedeem
import org.openapitools.server.api.model.AdsCreditRedeemCreate
import org.openapitools.server.api.model.AdsCreditsDiscountsGet200Response
import org.openapitools.server.api.model.BillingInvoiceDocumentType
import org.openapitools.server.api.model.BillingInvoiceDownloadResponse
import org.openapitools.server.api.model.BillingInvoiceSortField
import org.openapitools.server.api.model.BillingInvoiceStatus
import org.openapitools.server.api.model.BillingInvoicesGet200Response
import org.openapitools.server.api.model.BillingProfilesGet200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.SSIOAccount
import org.openapitools.server.api.model.SSIOInsertionOrder
import org.openapitools.server.api.model.SSIOInsertionOrderCreate
import org.openapitools.server.api.model.SSIOInsertionOrderStatusResponse
import org.openapitools.server.api.model.SSIOInsertionOrderUpdate
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
    suspend fun adsCreditRedeem(adAccountId:kotlin.String?,adsCreditRedeemCreate:AdsCreditRedeemCreate?,context:OperationRequest):Response<AdsCreditRedeem>
    /* adsCreditsDiscountsGet
     * Get ads credit discounts */
    suspend fun adsCreditsDiscountsGet(adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<AdsCreditsDiscountsGet200Response>
    /* billingInvoiceDownloadGet
     * Get download url for a billing invoice */
    suspend fun billingInvoiceDownloadGet(adAccountId:kotlin.String?,billingInvoiceId:kotlin.String?,context:OperationRequest):Response<BillingInvoiceDownloadResponse>
    /* billingInvoicesGet
     * Get billing invoices */
    suspend fun billingInvoicesGet(adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,order:PinterestLibPaginationOrder?,sort:BillingInvoiceSortField?,status:BillingInvoiceStatus?,documentType:BillingInvoiceDocumentType?,startDueDate:java.time.LocalDate?,endDueDate:java.time.LocalDate?,context:OperationRequest):Response<BillingInvoicesGet200Response>
    /* billingProfilesGet
     * Get billing profiles */
    suspend fun billingProfilesGet(isActive:kotlin.Boolean?,adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<BillingProfilesGet200Response>
    /* ssioAccountsGet
     * Get Salesforce account details including bill-to information. */
    suspend fun ssioAccountsGet(adAccountId:kotlin.String?,context:OperationRequest):Response<SSIOAccount>
    /* ssioInsertionOrderCreate
     * Create insertion order through SSIO. */
    suspend fun ssioInsertionOrderCreate(adAccountId:kotlin.String?,ssIOInsertionOrderCreate:SSIOInsertionOrderCreate?,context:OperationRequest):Response<SSIOInsertionOrder>
    /* ssioInsertionOrderEdit
     * Edit insertion order through SSIO. */
    suspend fun ssioInsertionOrderEdit(adAccountId:kotlin.String?,ssIOInsertionOrderUpdate:SSIOInsertionOrderUpdate?,context:OperationRequest):Response<SSIOInsertionOrder>
    /* ssioInsertionOrdersStatusGetByAdAccount
     * Get insertion order status by ad account id. */
    suspend fun ssioInsertionOrdersStatusGetByAdAccount(adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<SsioInsertionOrdersStatusGetByAdAccount200Response>
    /* ssioInsertionOrdersStatusGetByPinOrderId
     * Get insertion order status by pin order id. */
    suspend fun ssioInsertionOrdersStatusGetByPinOrderId(adAccountId:kotlin.String?,pinOrderId:kotlin.String?,context:OperationRequest):Response<SSIOInsertionOrderStatusResponse>
    /* ssioOrderLinesGetByAdAccount
     * Get Salesforce order lines by ad account id. */
    suspend fun ssioOrderLinesGetByAdAccount(adAccountId:kotlin.String?,pinOrderId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<SsioOrderLinesGetByAdAccount200Response>
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
