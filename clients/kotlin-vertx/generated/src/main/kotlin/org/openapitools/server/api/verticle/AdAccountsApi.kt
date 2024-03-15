package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AdAccount
import org.openapitools.server.api.model.AdAccountAnalyticsResponseInner
import org.openapitools.server.api.model.AdAccountCreateRequest
import org.openapitools.server.api.model.AdAccountsList200Response
import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncRequest
import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncResponse
import org.openapitools.server.api.model.AdsAnalyticsGetAsyncResponse
import org.openapitools.server.api.model.AdsAnalyticsTargetingType
import org.openapitools.server.api.model.ConversionReportAttributionType
import org.openapitools.server.api.model.CreateMMMReportRequest
import org.openapitools.server.api.model.CreateMMMReportResponse
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.GetMMMReportResponse
import org.openapitools.server.api.model.Granularity
import org.openapitools.server.api.model.MetricsResponse
import org.openapitools.server.api.model.TemplatesList200Response
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


interface AdAccountsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* adAccountAnalytics
     * Get ad account analytics */
    suspend fun adAccountAnalytics(adAccountId:kotlin.String?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,columns:kotlin.Array<kotlin.String>?,granularity:Granularity?,clickWindowDays:kotlin.Int?,engagementWindowDays:kotlin.Int?,viewWindowDays:kotlin.Int?,conversionReportTime:kotlin.String?,context:OperationRequest):Response<kotlin.Array<AdAccountAnalyticsResponseInner>>
    /* adAccountTargetingAnalyticsGet
     * Get targeting analytics for an ad account */
    suspend fun adAccountTargetingAnalyticsGet(adAccountId:kotlin.String?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,targetingTypes:kotlin.Array<AdsAnalyticsTargetingType>?,columns:kotlin.Array<kotlin.String>?,granularity:Granularity?,clickWindowDays:kotlin.Int?,engagementWindowDays:kotlin.Int?,viewWindowDays:kotlin.Int?,conversionReportTime:kotlin.String?,attributionTypes:ConversionReportAttributionType?,context:OperationRequest):Response<MetricsResponse>
    /* adAccountsCreate
     * Create ad account */
    suspend fun adAccountsCreate(adAccountCreateRequest:AdAccountCreateRequest?,context:OperationRequest):Response<AdAccount>
    /* adAccountsGet
     * Get ad account */
    suspend fun adAccountsGet(adAccountId:kotlin.String?,context:OperationRequest):Response<AdAccount>
    /* adAccountsList
     * List ad accounts */
    suspend fun adAccountsList(bookmark:kotlin.String?,pageSize:kotlin.Int?,includeSharedAccounts:kotlin.Boolean?,context:OperationRequest):Response<AdAccountsList200Response>
    /* analyticsCreateMmmReport
     * Create a request for a Marketing Mix Modeling (MMM) report */
    suspend fun analyticsCreateMmmReport(adAccountId:kotlin.String?,createMMMReportRequest:CreateMMMReportRequest?,context:OperationRequest):Response<CreateMMMReportResponse>
    /* analyticsCreateReport
     * Create async request for an account analytics report */
    suspend fun analyticsCreateReport(adAccountId:kotlin.String?,adsAnalyticsCreateAsyncRequest:AdsAnalyticsCreateAsyncRequest?,context:OperationRequest):Response<AdsAnalyticsCreateAsyncResponse>
    /* analyticsCreateTemplateReport
     * Create async request for an analytics report using a template */
    suspend fun analyticsCreateTemplateReport(adAccountId:kotlin.String?,templateId:kotlin.String?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,granularity:Granularity?,context:OperationRequest):Response<AdsAnalyticsCreateAsyncResponse>
    /* analyticsGetMmmReport
     * Get advertiser Marketing Mix Modeling (MMM) report. */
    suspend fun analyticsGetMmmReport(adAccountId:kotlin.String?,token:kotlin.String?,context:OperationRequest):Response<GetMMMReportResponse>
    /* analyticsGetReport
     * Get the account analytics report created by the async call */
    suspend fun analyticsGetReport(adAccountId:kotlin.String?,token:kotlin.String?,context:OperationRequest):Response<AdsAnalyticsGetAsyncResponse>
    /* sandboxDelete
     * Delete ads data for ad account in API Sandbox */
    suspend fun sandboxDelete(adAccountId:kotlin.String?,context:OperationRequest):Response<kotlin.String>
    /* templatesList
     * List templates */
    suspend fun templatesList(adAccountId:kotlin.String?,pageSize:kotlin.Int?,order:kotlin.String?,bookmark:kotlin.String?,context:OperationRequest):Response<TemplatesList200Response>
    companion object {
        const val address = "AdAccountsApi-service"
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
            for (m in AdAccountsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(AdAccountsApi::class.java, address)
            return routerFactory
        }
    }
}
