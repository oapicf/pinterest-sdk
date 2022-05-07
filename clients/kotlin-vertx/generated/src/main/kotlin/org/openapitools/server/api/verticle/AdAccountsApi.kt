package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncRequest
import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncResponse
import org.openapitools.server.api.model.AdsAnalyticsGetAsyncResponse
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.Granularity
import org.openapitools.server.api.model.Paginated
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
    suspend fun adAccountAnalytics(adAccountId:kotlin.String?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,columns:kotlin.Array<kotlin.String>?,granularity:Granularity?,clickWindowDays:kotlin.Int?,engagementWindowDays:kotlin.Int?,viewWindowDays:kotlin.Int?,conversionReportTime:kotlin.String?,context:OperationRequest):Response<kotlin.Array<kotlin.collections.Map<kotlin.String, kotlin.Any>>>
    /* adAccountsList
     * List ad accounts */
    suspend fun adAccountsList(bookmark:kotlin.String?,pageSize:kotlin.Int?,includeSharedAccounts:kotlin.Boolean?,context:OperationRequest):Response<Paginated>
    /* adGroupsAnalytics
     * Get ad group analytics */
    suspend fun adGroupsAnalytics(adAccountId:kotlin.String?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,adGroupIds:kotlin.Array<kotlin.String>?,columns:kotlin.Array<kotlin.String>?,granularity:Granularity?,clickWindowDays:kotlin.Int?,engagementWindowDays:kotlin.Int?,viewWindowDays:kotlin.Int?,conversionReportTime:kotlin.String?,context:OperationRequest):Response<kotlin.Array<kotlin.collections.Map<kotlin.String, kotlin.Any>>>
    /* adGroupsList
     * List ad groups */
    suspend fun adGroupsList(adAccountId:kotlin.String?,campaignIds:kotlin.Array<kotlin.String>?,adGroupIds:kotlin.Array<kotlin.String>?,entityStatuses:kotlin.Array<kotlin.String>?,pageSize:kotlin.Int?,order:kotlin.String?,bookmark:kotlin.String?,translateInterestsToNames:kotlin.Boolean?,context:OperationRequest):Response<Paginated>
    /* adsAnalytics
     * Get ad analytics */
    suspend fun adsAnalytics(adAccountId:kotlin.String?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,adIds:kotlin.Array<kotlin.String>?,columns:kotlin.Array<kotlin.String>?,granularity:Granularity?,clickWindowDays:kotlin.Int?,engagementWindowDays:kotlin.Int?,viewWindowDays:kotlin.Int?,conversionReportTime:kotlin.String?,context:OperationRequest):Response<kotlin.Array<kotlin.collections.Map<kotlin.String, kotlin.Any>>>
    /* adsList
     * List ads */
    suspend fun adsList(adAccountId:kotlin.String?,campaignIds:kotlin.Array<kotlin.String>?,adGroupIds:kotlin.Array<kotlin.String>?,adIds:kotlin.Array<kotlin.String>?,entityStatuses:kotlin.Array<kotlin.String>?,pageSize:kotlin.Int?,order:kotlin.String?,bookmark:kotlin.String?,context:OperationRequest):Response<Paginated>
    /* analyticsCreateReport
     * Create async request for an account analytics report */
    suspend fun analyticsCreateReport(adAccountId:kotlin.String?,adsAnalyticsCreateAsyncRequest:AdsAnalyticsCreateAsyncRequest?,context:OperationRequest):Response<AdsAnalyticsCreateAsyncResponse>
    /* analyticsGetReport
     * Get the account analytics report created by the async call */
    suspend fun analyticsGetReport(adAccountId:kotlin.String?,token:kotlin.String?,context:OperationRequest):Response<AdsAnalyticsGetAsyncResponse>
    /* campaignsAnalytics
     * Get campaign analytics */
    suspend fun campaignsAnalytics(adAccountId:kotlin.String?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,campaignIds:kotlin.Array<kotlin.String>?,columns:kotlin.Array<kotlin.String>?,granularity:Granularity?,clickWindowDays:kotlin.Int?,engagementWindowDays:kotlin.Int?,viewWindowDays:kotlin.Int?,conversionReportTime:kotlin.String?,context:OperationRequest):Response<kotlin.Array<kotlin.collections.Map<kotlin.String, kotlin.Any>>>
    /* campaignsList
     * List campaigns */
    suspend fun campaignsList(adAccountId:kotlin.String?,campaignIds:kotlin.Array<kotlin.String>?,entityStatuses:kotlin.Array<kotlin.String>?,pageSize:kotlin.Int?,order:kotlin.String?,bookmark:kotlin.String?,context:OperationRequest):Response<Paginated>
    /* productGroupsAnalytics
     * Get product group analytics */
    suspend fun productGroupsAnalytics(adAccountId:kotlin.String?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,productGroupIds:kotlin.Array<kotlin.String>?,columns:kotlin.Array<kotlin.String>?,granularity:Granularity?,clickWindowDays:kotlin.Int?,engagementWindowDays:kotlin.Int?,viewWindowDays:kotlin.Int?,conversionReportTime:kotlin.String?,context:OperationRequest):Response<kotlin.Array<kotlin.collections.Map<kotlin.String, kotlin.Any>>>
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
