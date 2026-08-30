package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.Ad
import org.openapitools.server.api.model.AdBatchUpdate
import org.openapitools.server.api.model.AdBatchWriteResponseModel
import org.openapitools.server.api.model.AdCreate
import org.openapitools.server.api.model.AdPreviewRequest
import org.openapitools.server.api.model.AdPreviewURLResponse
import org.openapitools.server.api.model.AdsAnalytics
import org.openapitools.server.api.model.AdsAnalyticsAdTargetingType
import org.openapitools.server.api.model.AdsList200Response
import org.openapitools.server.api.model.CampaignAdPreview
import org.openapitools.server.api.model.CampaignAdPreviewCreate
import org.openapitools.server.api.model.CampaignAdPreviewCreate200ResponseInner
import org.openapitools.server.api.model.CampaignAdPreviewDelete200ResponseInner
import org.openapitools.server.api.model.ConversionAttributionWindowDays
import org.openapitools.server.api.model.ConversionReportAttributionType
import org.openapitools.server.api.model.ConversionReportTimeType
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


interface AdsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* adPreviewsCreate
     * Create ad preview with pin or image */
    suspend fun adPreviewsCreate(adAccountId:kotlin.String?,adPreviewRequest:AdPreviewRequest?,context:OperationRequest):Response<AdPreviewURLResponse>
    /* adTargetingAnalyticsGet
     * Get targeting analytics for ads */
    suspend fun adTargetingAnalyticsGet(adAccountId:kotlin.String?,adIds:kotlin.Array<kotlin.String>?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,targetingTypes:kotlin.Array<AdsAnalyticsAdTargetingType>?,columns:kotlin.Array<ReportingColumnSync>?,granularity:Granularity?,clickWindowDays:ConversionAttributionWindowDays?,engagementWindowDays:ConversionAttributionWindowDays?,viewWindowDays:ConversionAttributionWindowDays?,conversionReportTime:ConversionReportTimeType?,attributionTypes:kotlin.Array<ConversionReportAttributionType>?,reportingTimezone:ReportingTimeZone?,sortColumns:kotlin.Array<kotlin.String>?,sortAscending:kotlin.Boolean?,context:OperationRequest):Response<MetricsResponse>
    /* adsAnalytics
     * Get ad analytics */
    suspend fun adsAnalytics(startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,columns:kotlin.Array<ReportingColumnSync>?,granularity:Granularity?,adAccountId:kotlin.String?,pinIds:kotlin.Array<kotlin.String>?,adIds:kotlin.Array<kotlin.String>?,clickWindowDays:java.math.BigDecimal?,engagementWindowDays:java.math.BigDecimal?,viewWindowDays:java.math.BigDecimal?,conversionReportTime:kotlin.String?,campaignIds:kotlin.Array<kotlin.String>?,reportingTimezone:ReportingTimeZone?,context:OperationRequest):Response<kotlin.Array<AdsAnalytics>>
    /* adsCreate
     * Create ads */
    suspend fun adsCreate(adAccountId:kotlin.String?,adCreate:kotlin.Array<AdCreate>?,context:OperationRequest):Response<AdBatchWriteResponseModel>
    /* adsGet
     * Get ad */
    suspend fun adsGet(adId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<Ad>
    /* adsList
     * List ads */
    suspend fun adsList(adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,order:PinterestLibPaginationOrder?,campaignIds:kotlin.Array<kotlin.String>?,adGroupIds:kotlin.Array<kotlin.String>?,adIds:kotlin.Array<kotlin.String>?,entityStatuses:kotlin.Array<EntityStatus>?,context:OperationRequest):Response<AdsList200Response>
    /* adsUpdate
     * Update ads */
    suspend fun adsUpdate(adAccountId:kotlin.String?,adBatchUpdate:kotlin.Array<AdBatchUpdate>?,context:OperationRequest):Response<AdBatchWriteResponseModel>
    /* campaignAdPreviewCreate
     * Create ad preview records for one or more ad groups */
    suspend fun campaignAdPreviewCreate(adAccountId:kotlin.String?,campaignAdPreviewCreate:kotlin.Array<CampaignAdPreviewCreate>?,context:OperationRequest):Response<kotlin.Array<CampaignAdPreviewCreate200ResponseInner>>
    /* campaignAdPreviewDelete
     * Delete ad preview records for one or more ad groups */
    suspend fun campaignAdPreviewDelete(adGroupIds:kotlin.Array<kotlin.String>?,adAccountId:kotlin.String?,context:OperationRequest):Response<kotlin.Array<CampaignAdPreviewDelete200ResponseInner>>
    /* campaignAdPreviewRead
     * Fetch ad preview records for one or more ad groups */
    suspend fun campaignAdPreviewRead(adGroupIds:kotlin.Array<kotlin.String>?,adAccountId:kotlin.String?,context:OperationRequest):Response<kotlin.Array<CampaignAdPreview>>
    companion object {
        const val address = "AdsApi-service"
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
            for (m in AdsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(AdsApi::class.java, address)
            return routerFactory
        }
    }
}
