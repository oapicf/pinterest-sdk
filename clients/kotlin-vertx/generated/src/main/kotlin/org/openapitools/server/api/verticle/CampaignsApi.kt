package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AdPinAnalytics
import org.openapitools.server.api.model.AdsAnalyticsCampaignTargetingType
import org.openapitools.server.api.model.Campaign
import org.openapitools.server.api.model.CampaignBatchUpdateItem
import org.openapitools.server.api.model.CampaignBatchWriteResponseModel
import org.openapitools.server.api.model.CampaignCreateItem
import org.openapitools.server.api.model.CampaignDeliveryEstimatesCampaign
import org.openapitools.server.api.model.CampaignDeliveryEstimatesResponse
import org.openapitools.server.api.model.CampaignsAnalyticsMetrics
import org.openapitools.server.api.model.CampaignsList200Response
import org.openapitools.server.api.model.ConversionReportAttributionType
import org.openapitools.server.api.model.EntityStatus
import org.openapitools.server.api.model.Granularity
import org.openapitools.server.api.model.MetricsResponse
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.ReportingColumnSync
import org.openapitools.server.api.model.ReportingTimeZone
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
    /* adPinsAnalytics
     * Get pins analytics */
    suspend fun adPinsAnalytics(campaignId:kotlin.String?,pinIds:kotlin.Array<kotlin.String>?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,columns:kotlin.Array<ReportingColumnSync>?,granularity:Granularity?,adAccountId:kotlin.String?,clickWindowDays:java.math.BigDecimal?,engagementWindowDays:java.math.BigDecimal?,viewWindowDays:java.math.BigDecimal?,conversionReportTime:kotlin.String?,context:OperationRequest):Response<kotlin.Array<AdPinAnalytics>>
    /* campaignTargetingAnalyticsGet
     * Get targeting analytics for campaigns */
    suspend fun campaignTargetingAnalyticsGet(adAccountId:kotlin.String?,campaignIds:kotlin.Array<kotlin.String>?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,targetingTypes:kotlin.Array<AdsAnalyticsCampaignTargetingType>?,columns:kotlin.Array<ReportingColumnSync>?,granularity:Granularity?,clickWindowDays:java.math.BigDecimal?,engagementWindowDays:java.math.BigDecimal?,viewWindowDays:java.math.BigDecimal?,conversionReportTime:kotlin.String?,attributionTypes:kotlin.Array<ConversionReportAttributionType>?,reportingTimezone:ReportingTimeZone?,context:OperationRequest):Response<MetricsResponse>
    /* campaignsAnalytics
     * Get campaign analytics */
    suspend fun campaignsAnalytics(startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,campaignIds:kotlin.Array<kotlin.String>?,columns:kotlin.Array<ReportingColumnSync>?,granularity:Granularity?,adAccountId:kotlin.String?,clickWindowDays:java.math.BigDecimal?,engagementWindowDays:java.math.BigDecimal?,viewWindowDays:java.math.BigDecimal?,conversionReportTime:kotlin.String?,aggregateReportRows:kotlin.Boolean?,reportingTimezone:ReportingTimeZone?,context:OperationRequest):Response<kotlin.Array<CampaignsAnalyticsMetrics>>
    /* campaignsCreate
     * Create campaigns */
    suspend fun campaignsCreate(adAccountId:kotlin.String?,campaignCreateItem:kotlin.Array<CampaignCreateItem>?,context:OperationRequest):Response<CampaignBatchWriteResponseModel>
    /* campaignsGet
     * Get campaign */
    suspend fun campaignsGet(campaignId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<Campaign>
    /* campaignsList
     * List campaigns */
    suspend fun campaignsList(adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,order:PinterestLibPaginationOrder?,campaignIds:kotlin.Array<kotlin.String>?,entityStatuses:kotlin.Array<EntityStatus>?,context:OperationRequest):Response<CampaignsList200Response>
    /* campaignsUpdate
     * Update campaigns */
    suspend fun campaignsUpdate(adAccountId:kotlin.String?,campaignBatchUpdateItem:kotlin.Array<CampaignBatchUpdateItem>?,context:OperationRequest):Response<CampaignBatchWriteResponseModel>
    /* getCampaignDeliveryEstimates
     * Get campaign delivery estimates */
    suspend fun getCampaignDeliveryEstimates(adAccountId:kotlin.String?,campaignDeliveryEstimatesCampaign:kotlin.Array<CampaignDeliveryEstimatesCampaign>?,context:OperationRequest):Response<CampaignDeliveryEstimatesResponse>
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
