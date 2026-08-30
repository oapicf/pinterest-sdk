package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AdGroup
import org.openapitools.server.api.model.AdGroupAudienceSizing
import org.openapitools.server.api.model.AdGroupAudienceSizingCreate
import org.openapitools.server.api.model.AdGroupCreateCreate
import org.openapitools.server.api.model.AdGroupUpdateBatchUpdate
import org.openapitools.server.api.model.AdGroupsAnalyticsMetrics
import org.openapitools.server.api.model.AdGroupsCreate200Response
import org.openapitools.server.api.model.AdGroupsList200Response
import org.openapitools.server.api.model.AdsAnalyticsAdGroupTargetingType
import org.openapitools.server.api.model.BidFloor
import org.openapitools.server.api.model.BidFloorCreate
import org.openapitools.server.api.model.ConversionReportAttributionType
import org.openapitools.server.api.model.DynamicTitlesDownloadCSV
import org.openapitools.server.api.model.DynamicTitlesGetStatus
import org.openapitools.server.api.model.DynamicTitlesProcessCSV
import org.openapitools.server.api.model.DynamicTitlesProcessCSVCreate
import org.openapitools.server.api.model.DynamicTitlesUploadURL
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


interface AdGroupsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* adGroupsAnalytics
     * Get ad group analytics */
    suspend fun adGroupsAnalytics(startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,adGroupIds:kotlin.Array<kotlin.String>?,columns:kotlin.Array<ReportingColumnSync>?,granularity:Granularity?,adAccountId:kotlin.String?,clickWindowDays:java.math.BigDecimal?,engagementWindowDays:java.math.BigDecimal?,viewWindowDays:java.math.BigDecimal?,conversionReportTime:kotlin.String?,aggregateReportRows:kotlin.Boolean?,reportingTimezone:ReportingTimeZone?,context:OperationRequest):Response<kotlin.Array<AdGroupsAnalyticsMetrics>>
    /* adGroupsAudienceSizing
     * Get audience sizing */
    suspend fun adGroupsAudienceSizing(adAccountId:kotlin.String?,adGroupAudienceSizingCreate:AdGroupAudienceSizingCreate?,context:OperationRequest):Response<AdGroupAudienceSizing>
    /* adGroupsBidFloorGet
     * Get bid floors */
    suspend fun adGroupsBidFloorGet(adAccountId:kotlin.String?,bidFloorCreate:BidFloorCreate?,context:OperationRequest):Response<BidFloor>
    /* adGroupsCreate
     * Create ad groups */
    suspend fun adGroupsCreate(adAccountId:kotlin.String?,adGroupCreateCreate:kotlin.Array<AdGroupCreateCreate>?,context:OperationRequest):Response<AdGroupsCreate200Response>
    /* adGroupsDynamicTitlesDownloadCsv
     * Get dynamic titles CSV download URL */
    suspend fun adGroupsDynamicTitlesDownloadCsv(adAccountId:kotlin.String?,adGroupId:kotlin.String?,context:OperationRequest):Response<DynamicTitlesDownloadCSV>
    /* adGroupsDynamicTitlesGetStatus
     * Get dynamic titles status */
    suspend fun adGroupsDynamicTitlesGetStatus(adAccountId:kotlin.String?,adGroupId:kotlin.String?,context:OperationRequest):Response<DynamicTitlesGetStatus>
    /* adGroupsDynamicTitlesGetUploadUrl
     * Get dynamic titles upload URL */
    suspend fun adGroupsDynamicTitlesGetUploadUrl(adAccountId:kotlin.String?,adGroupId:kotlin.String?,context:OperationRequest):Response<DynamicTitlesUploadURL>
    /* adGroupsDynamicTitlesProcessCsv
     * Process dynamic titles CSV */
    suspend fun adGroupsDynamicTitlesProcessCsv(adAccountId:kotlin.String?,adGroupId:kotlin.String?,dynamicTitlesProcessCSVCreate:DynamicTitlesProcessCSVCreate?,context:OperationRequest):Response<DynamicTitlesProcessCSV>
    /* adGroupsGet
     * Get ad group */
    suspend fun adGroupsGet(adGroupId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<AdGroup>
    /* adGroupsList
     * List ad groups */
    suspend fun adGroupsList(adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,order:PinterestLibPaginationOrder?,campaignIds:kotlin.Array<kotlin.String>?,adGroupIds:kotlin.Array<kotlin.String>?,entityStatuses:kotlin.Array<EntityStatus>?,translateInterestsToNames:kotlin.Boolean?,context:OperationRequest):Response<AdGroupsList200Response>
    /* adGroupsTargetingAnalyticsGet
     * Get targeting analytics for ad groups */
    suspend fun adGroupsTargetingAnalyticsGet(adAccountId:kotlin.String?,adGroupIds:kotlin.Array<kotlin.String>?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,targetingTypes:kotlin.Array<AdsAnalyticsAdGroupTargetingType>?,columns:kotlin.Array<ReportingColumnSync>?,granularity:Granularity?,clickWindowDays:java.math.BigDecimal?,engagementWindowDays:java.math.BigDecimal?,viewWindowDays:java.math.BigDecimal?,conversionReportTime:kotlin.String?,attributionTypes:kotlin.Array<ConversionReportAttributionType>?,reportingTimezone:ReportingTimeZone?,sortColumns:kotlin.Array<kotlin.String>?,sortAscending:kotlin.Boolean?,context:OperationRequest):Response<MetricsResponse>
    /* adGroupsUpdate
     * Update ad groups */
    suspend fun adGroupsUpdate(adAccountId:kotlin.String?,adGroupUpdateBatchUpdate:kotlin.Array<AdGroupUpdateBatchUpdate>?,context:OperationRequest):Response<AdGroupsCreate200Response>
    /* getAdGroupsByPromotionIdsList
     * List of ad groups using promotions IDs. */
    suspend fun getAdGroupsByPromotionIdsList(adAccountId:kotlin.String?,promotionIds:kotlin.Array<kotlin.String>?,bookmark:kotlin.String?,pageSize:kotlin.Int?,order:PinterestLibPaginationOrder?,context:OperationRequest):Response<AdGroupsList200Response>
    companion object {
        const val address = "AdGroupsApi-service"
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
            for (m in AdGroupsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(AdGroupsApi::class.java, address)
            return routerFactory
        }
    }
}
