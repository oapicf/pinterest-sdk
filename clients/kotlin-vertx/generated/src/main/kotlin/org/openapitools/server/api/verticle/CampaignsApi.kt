package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AdsAnalyticsTargetingType
import org.openapitools.server.api.model.CampaignCreateRequest
import org.openapitools.server.api.model.CampaignCreateResponse
import org.openapitools.server.api.model.CampaignResponse
import org.openapitools.server.api.model.CampaignUpdateRequest
import org.openapitools.server.api.model.CampaignUpdateResponse
import org.openapitools.server.api.model.CampaignsAnalyticsResponseInner
import org.openapitools.server.api.model.CampaignsList200Response
import org.openapitools.server.api.model.ConversionReportAttributionType
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.Granularity
import org.openapitools.server.api.model.MetricsResponse
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


interface CampaignsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* campaignTargetingAnalyticsGet
     * Get targeting analytics for campaigns */
    suspend fun campaignTargetingAnalyticsGet(adAccountId:kotlin.String?,campaignIds:kotlin.Array<kotlin.String>?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,targetingTypes:kotlin.Array<AdsAnalyticsTargetingType>?,columns:kotlin.Array<kotlin.String>?,granularity:Granularity?,clickWindowDays:kotlin.Int?,engagementWindowDays:kotlin.Int?,viewWindowDays:kotlin.Int?,conversionReportTime:kotlin.String?,attributionTypes:ConversionReportAttributionType?,context:OperationRequest):Response<MetricsResponse>
    /* campaignsAnalytics
     * Get campaign analytics */
    suspend fun campaignsAnalytics(adAccountId:kotlin.String?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,campaignIds:kotlin.Array<kotlin.String>?,columns:kotlin.Array<kotlin.String>?,granularity:Granularity?,clickWindowDays:kotlin.Int?,engagementWindowDays:kotlin.Int?,viewWindowDays:kotlin.Int?,conversionReportTime:kotlin.String?,context:OperationRequest):Response<kotlin.Array<CampaignsAnalyticsResponseInner>>
    /* campaignsCreate
     * Create campaigns */
    suspend fun campaignsCreate(adAccountId:kotlin.String?,campaignCreateRequest:kotlin.Array<CampaignCreateRequest>?,context:OperationRequest):Response<CampaignCreateResponse>
    /* campaignsGet
     * Get campaign */
    suspend fun campaignsGet(adAccountId:kotlin.String?,campaignId:kotlin.String?,context:OperationRequest):Response<CampaignResponse>
    /* campaignsList
     * List campaigns */
    suspend fun campaignsList(adAccountId:kotlin.String?,campaignIds:kotlin.Array<kotlin.String>?,entityStatuses:kotlin.Array<kotlin.String>?,pageSize:kotlin.Int?,order:kotlin.String?,bookmark:kotlin.String?,context:OperationRequest):Response<CampaignsList200Response>
    /* campaignsUpdate
     * Update campaigns */
    suspend fun campaignsUpdate(adAccountId:kotlin.String?,campaignUpdateRequest:kotlin.Array<CampaignUpdateRequest>?,context:OperationRequest):Response<CampaignUpdateResponse>
    companion object {
        const val address = "CampaignsApi-service"
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
            for (m in CampaignsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(CampaignsApi::class.java, address)
            return routerFactory
        }
    }
}
