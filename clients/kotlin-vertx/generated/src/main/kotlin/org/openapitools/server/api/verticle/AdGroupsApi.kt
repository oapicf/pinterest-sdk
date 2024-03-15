package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AdGroupArrayResponse
import org.openapitools.server.api.model.AdGroupAudienceSizingRequest
import org.openapitools.server.api.model.AdGroupAudienceSizingResponse
import org.openapitools.server.api.model.AdGroupCreateRequest
import org.openapitools.server.api.model.AdGroupResponse
import org.openapitools.server.api.model.AdGroupUpdateRequest
import org.openapitools.server.api.model.AdGroupsAnalyticsResponseInner
import org.openapitools.server.api.model.AdGroupsList200Response
import org.openapitools.server.api.model.AdsAnalyticsTargetingType
import org.openapitools.server.api.model.BidFloor
import org.openapitools.server.api.model.BidFloorRequest
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


interface AdGroupsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* adGroupsAnalytics
     * Get ad group analytics */
    suspend fun adGroupsAnalytics(adAccountId:kotlin.String?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,adGroupIds:kotlin.Array<kotlin.String>?,columns:kotlin.Array<kotlin.String>?,granularity:Granularity?,clickWindowDays:kotlin.Int?,engagementWindowDays:kotlin.Int?,viewWindowDays:kotlin.Int?,conversionReportTime:kotlin.String?,context:OperationRequest):Response<kotlin.Array<AdGroupsAnalyticsResponseInner>>
    /* adGroupsAudienceSizing
     * Get audience sizing */
    suspend fun adGroupsAudienceSizing(adAccountId:kotlin.String?,adGroupAudienceSizingRequest:AdGroupAudienceSizingRequest?,context:OperationRequest):Response<AdGroupAudienceSizingResponse>
    /* adGroupsBidFloorGet
     * Get bid floors */
    suspend fun adGroupsBidFloorGet(adAccountId:kotlin.String?,bidFloorRequest:BidFloorRequest?,context:OperationRequest):Response<BidFloor>
    /* adGroupsCreate
     * Create ad groups */
    suspend fun adGroupsCreate(adAccountId:kotlin.String?,adGroupCreateRequest:kotlin.Array<AdGroupCreateRequest>?,context:OperationRequest):Response<AdGroupArrayResponse>
    /* adGroupsGet
     * Get ad group */
    suspend fun adGroupsGet(adAccountId:kotlin.String?,adGroupId:kotlin.String?,context:OperationRequest):Response<AdGroupResponse>
    /* adGroupsList
     * List ad groups */
    suspend fun adGroupsList(adAccountId:kotlin.String?,campaignIds:kotlin.Array<kotlin.String>?,adGroupIds:kotlin.Array<kotlin.String>?,entityStatuses:kotlin.Array<kotlin.String>?,pageSize:kotlin.Int?,order:kotlin.String?,bookmark:kotlin.String?,translateInterestsToNames:kotlin.Boolean?,context:OperationRequest):Response<AdGroupsList200Response>
    /* adGroupsTargetingAnalyticsGet
     * Get targeting analytics for ad groups */
    suspend fun adGroupsTargetingAnalyticsGet(adAccountId:kotlin.String?,adGroupIds:kotlin.Array<kotlin.String>?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,targetingTypes:kotlin.Array<AdsAnalyticsTargetingType>?,columns:kotlin.Array<kotlin.String>?,granularity:Granularity?,clickWindowDays:kotlin.Int?,engagementWindowDays:kotlin.Int?,viewWindowDays:kotlin.Int?,conversionReportTime:kotlin.String?,attributionTypes:ConversionReportAttributionType?,context:OperationRequest):Response<MetricsResponse>
    /* adGroupsUpdate
     * Update ad groups */
    suspend fun adGroupsUpdate(adAccountId:kotlin.String?,adGroupUpdateRequest:kotlin.Array<AdGroupUpdateRequest>?,context:OperationRequest):Response<AdGroupArrayResponse>
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
