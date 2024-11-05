package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AdArrayResponse
import org.openapitools.server.api.model.AdCreateRequest
import org.openapitools.server.api.model.AdPreviewRequest
import org.openapitools.server.api.model.AdPreviewURLResponse
import org.openapitools.server.api.model.AdResponse
import org.openapitools.server.api.model.AdUpdateRequest
import org.openapitools.server.api.model.AdsAnalyticsAdTargetingType
import org.openapitools.server.api.model.AdsAnalyticsResponseInner
import org.openapitools.server.api.model.AdsList200Response
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


interface AdsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* adPreviewsCreate
     * Create ad preview with pin or image */
    suspend fun adPreviewsCreate(adAccountId:kotlin.String?,adPreviewRequest:AdPreviewRequest?,context:OperationRequest):Response<AdPreviewURLResponse>
    /* adTargetingAnalyticsGet
     * Get targeting analytics for ads */
    suspend fun adTargetingAnalyticsGet(adAccountId:kotlin.String?,adIds:kotlin.Array<kotlin.String>?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,targetingTypes:kotlin.Array<AdsAnalyticsAdTargetingType>?,columns:kotlin.Array<kotlin.String>?,granularity:Granularity?,clickWindowDays:kotlin.Int?,engagementWindowDays:kotlin.Int?,viewWindowDays:kotlin.Int?,conversionReportTime:kotlin.String?,attributionTypes:ConversionReportAttributionType?,context:OperationRequest):Response<MetricsResponse>
    /* adsAnalytics
     * Get ad analytics */
    suspend fun adsAnalytics(adAccountId:kotlin.String?,startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,columns:kotlin.Array<kotlin.String>?,granularity:Granularity?,adIds:kotlin.Array<kotlin.String>?,clickWindowDays:kotlin.Int?,engagementWindowDays:kotlin.Int?,viewWindowDays:kotlin.Int?,conversionReportTime:kotlin.String?,pinIds:kotlin.Array<kotlin.String>?,campaignIds:kotlin.Array<kotlin.String>?,context:OperationRequest):Response<kotlin.Array<AdsAnalyticsResponseInner>>
    /* adsCreate
     * Create ads */
    suspend fun adsCreate(adAccountId:kotlin.String?,adCreateRequest:kotlin.Array<AdCreateRequest>?,context:OperationRequest):Response<AdArrayResponse>
    /* adsGet
     * Get ad */
    suspend fun adsGet(adAccountId:kotlin.String?,adId:kotlin.String?,context:OperationRequest):Response<AdResponse>
    /* adsList
     * List ads */
    suspend fun adsList(adAccountId:kotlin.String?,campaignIds:kotlin.Array<kotlin.String>?,adGroupIds:kotlin.Array<kotlin.String>?,adIds:kotlin.Array<kotlin.String>?,entityStatuses:kotlin.Array<kotlin.String>?,pageSize:kotlin.Int?,order:kotlin.String?,bookmark:kotlin.String?,context:OperationRequest):Response<AdsList200Response>
    /* adsUpdate
     * Update ads */
    suspend fun adsUpdate(adAccountId:kotlin.String?,adUpdateRequest:kotlin.Array<AdUpdateRequest>?,context:OperationRequest):Response<AdArrayResponse>
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
