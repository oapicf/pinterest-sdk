package org.openapitools.server.api.verticle

import io.vertx.core.Vertx
import io.vertx.core.eventbus.Message
import io.vertx.core.json.JsonObject
import io.vertx.ext.web.api.OperationRequest
import io.vertx.ext.web.api.OperationResponse
import io.vertx.ext.web.api.generator.ApiHandlerUtils
import io.vertx.serviceproxy.ProxyHandler
import io.vertx.serviceproxy.ServiceException
import io.vertx.serviceproxy.ServiceExceptionMessageCodec
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import io.vertx.kotlin.coroutines.dispatcher
import io.vertx.core.json.Json
import io.vertx.core.json.JsonArray
import com.google.gson.reflect.TypeToken
import com.google.gson.Gson
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

class CampaignsApiVertxProxyHandler(private val vertx: Vertx, private val service: CampaignsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
    private lateinit var timerID: Long
    private var lastAccessed: Long = 0
    init {
        try {
            this.vertx.eventBus().registerDefaultCodec(ServiceException::class.java,
            ServiceExceptionMessageCodec())
        } catch (ex: IllegalStateException) {}

        if (timeoutSeconds != (-1).toLong() && !topLevel) {
            var period = timeoutSeconds * 1000 / 2
            if (period > 10000) {
                period = 10000
            }
            this.timerID = vertx.setPeriodic(period) { this.checkTimedOut(it) }
        } else {
            this.timerID = -1
        }
        accessed()
    }
    private fun checkTimedOut(id: Long) {
        val now = System.nanoTime()
        if (now - lastAccessed > timeoutSeconds * 1000000000) {
            close()
        }
    }

    override fun close() {
        if (timerID != (-1).toLong()) {
            vertx.cancelTimer(timerID)
        }
        super.close()
    }

    private fun accessed() {
        this.lastAccessed = System.nanoTime()
    }
    override fun handle(msg: Message<JsonObject>) {
        try {
            val json = msg.body()
            val action = msg.headers().get("action") ?: throw IllegalStateException("action not specified")
            accessed()
            val contextSerialized = json.getJsonObject("context") ?: throw IllegalStateException("Received action $action without OperationRequest \"context\"")
            val context = OperationRequest(contextSerialized)
            when (action) {
        
                "adPinsAnalytics" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchStringInJson(params,"campaign_id")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val pinIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"pin_ids")
                    if(pinIdsParam == null){
                         throw IllegalArgumentException("pinIds is required")
                    }
                    val pinIds:kotlin.Array<kotlin.String> = Gson().fromJson(pinIdsParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val startDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"start_date"))
                    if(startDate == null){
                        throw IllegalArgumentException("startDate is required")
                    }
                    val endDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"end_date"))
                    if(endDate == null){
                        throw IllegalArgumentException("endDate is required")
                    }
                    val columnsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"columns")
                    if(columnsParam == null){
                         throw IllegalArgumentException("columns is required")
                    }
                    val columns:kotlin.Array<ReportingColumnSync> = Gson().fromJson(columnsParam.encode()
                            , object : TypeToken<kotlin.collections.List<ReportingColumnSync>>(){}.type)
                    val granularityParam = ApiHandlerUtils.searchJsonObjectInJson(params,"granularity")
                    if (granularityParam == null) {
                        throw IllegalArgumentException("granularity is required")
                    }
                    val granularity = Gson().fromJson(granularityParam.encode(), Granularity::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val clickWindowDays = ApiHandlerUtils.searchDoubleInJson(params,"click_window_days")
                    val engagementWindowDays = ApiHandlerUtils.searchDoubleInJson(params,"engagement_window_days")
                    val viewWindowDays = ApiHandlerUtils.searchDoubleInJson(params,"view_window_days")
                    val conversionReportTime = ApiHandlerUtils.searchStringInJson(params,"conversion_report_time")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adPinsAnalytics(campaignId,pinIds,startDate,endDate,columns,granularity,adAccountId,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "campaignTargetingAnalyticsGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val campaignIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"campaign_ids")
                    if(campaignIdsParam == null){
                         throw IllegalArgumentException("campaignIds is required")
                    }
                    val campaignIds:kotlin.Array<kotlin.String> = Gson().fromJson(campaignIdsParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val startDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"start_date"))
                    if(startDate == null){
                        throw IllegalArgumentException("startDate is required")
                    }
                    val endDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"end_date"))
                    if(endDate == null){
                        throw IllegalArgumentException("endDate is required")
                    }
                    val targetingTypesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"targeting_types")
                    if(targetingTypesParam == null){
                         throw IllegalArgumentException("targetingTypes is required")
                    }
                    val targetingTypes:kotlin.Array<AdsAnalyticsCampaignTargetingType> = Gson().fromJson(targetingTypesParam.encode()
                            , object : TypeToken<kotlin.collections.List<AdsAnalyticsCampaignTargetingType>>(){}.type)
                    val columnsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"columns")
                    if(columnsParam == null){
                         throw IllegalArgumentException("columns is required")
                    }
                    val columns:kotlin.Array<ReportingColumnSync> = Gson().fromJson(columnsParam.encode()
                            , object : TypeToken<kotlin.collections.List<ReportingColumnSync>>(){}.type)
                    val granularityParam = ApiHandlerUtils.searchJsonObjectInJson(params,"granularity")
                    if (granularityParam == null) {
                        throw IllegalArgumentException("granularity is required")
                    }
                    val granularity = Gson().fromJson(granularityParam.encode(), Granularity::class.java)
                    val clickWindowDays = ApiHandlerUtils.searchDoubleInJson(params,"click_window_days")
                    val engagementWindowDays = ApiHandlerUtils.searchDoubleInJson(params,"engagement_window_days")
                    val viewWindowDays = ApiHandlerUtils.searchDoubleInJson(params,"view_window_days")
                    val conversionReportTime = ApiHandlerUtils.searchStringInJson(params,"conversion_report_time")
                    val attributionTypesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"attribution_types")
                    val attributionTypes:kotlin.Array<ConversionReportAttributionType>? = if(attributionTypesParam == null) null
                            else Gson().fromJson(attributionTypesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<ConversionReportAttributionType>>(){}.type)
                    val reportingTimezoneParam = ApiHandlerUtils.searchJsonObjectInJson(params,"reporting_timezone")
                    val reportingTimezone = if(reportingTimezoneParam ==null) null else Gson().fromJson(reportingTimezoneParam.encode(), ReportingTimeZone::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.campaignTargetingAnalyticsGet(adAccountId,campaignIds,startDate,endDate,targetingTypes,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime,attributionTypes,reportingTimezone,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "campaignsAnalytics" -> {
                    val params = context.params
                    val startDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"start_date"))
                    if(startDate == null){
                        throw IllegalArgumentException("startDate is required")
                    }
                    val endDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"end_date"))
                    if(endDate == null){
                        throw IllegalArgumentException("endDate is required")
                    }
                    val campaignIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"campaign_ids")
                    if(campaignIdsParam == null){
                         throw IllegalArgumentException("campaignIds is required")
                    }
                    val campaignIds:kotlin.Array<kotlin.String> = Gson().fromJson(campaignIdsParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val columnsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"columns")
                    if(columnsParam == null){
                         throw IllegalArgumentException("columns is required")
                    }
                    val columns:kotlin.Array<ReportingColumnSync> = Gson().fromJson(columnsParam.encode()
                            , object : TypeToken<kotlin.collections.List<ReportingColumnSync>>(){}.type)
                    val granularityParam = ApiHandlerUtils.searchJsonObjectInJson(params,"granularity")
                    if (granularityParam == null) {
                        throw IllegalArgumentException("granularity is required")
                    }
                    val granularity = Gson().fromJson(granularityParam.encode(), Granularity::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val clickWindowDays = ApiHandlerUtils.searchDoubleInJson(params,"click_window_days")
                    val engagementWindowDays = ApiHandlerUtils.searchDoubleInJson(params,"engagement_window_days")
                    val viewWindowDays = ApiHandlerUtils.searchDoubleInJson(params,"view_window_days")
                    val conversionReportTime = ApiHandlerUtils.searchStringInJson(params,"conversion_report_time")
                    val aggregateReportRows = ApiHandlerUtils.searchStringInJson(params,"aggregate_report_rows")?.toBoolean()
                    val reportingTimezoneParam = ApiHandlerUtils.searchJsonObjectInJson(params,"reporting_timezone")
                    val reportingTimezone = if(reportingTimezoneParam ==null) null else Gson().fromJson(reportingTimezoneParam.encode(), ReportingTimeZone::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.campaignsAnalytics(startDate,endDate,campaignIds,columns,granularity,adAccountId,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime,aggregateReportRows,reportingTimezone,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "campaignsCreate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val campaignCreateItemParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(campaignCreateItemParam == null){
                         throw IllegalArgumentException("campaignCreateItem is required")
                    }
                    val campaignCreateItem:kotlin.Array<CampaignCreateItem> = Gson().fromJson(campaignCreateItemParam.encode()
                            , object : TypeToken<kotlin.collections.List<CampaignCreateItem>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.campaignsCreate(adAccountId,campaignCreateItem,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "campaignsGet" -> {
                    val params = context.params
                    val campaignId = ApiHandlerUtils.searchStringInJson(params,"campaign_id")
                    if(campaignId == null){
                        throw IllegalArgumentException("campaignId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.campaignsGet(campaignId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "campaignsList" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val orderParam = ApiHandlerUtils.searchJsonObjectInJson(params,"order")
                    val order = if(orderParam ==null) null else Gson().fromJson(orderParam.encode(), PinterestLibPaginationOrder::class.java)
                    val campaignIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"campaign_ids")
                    val campaignIds:kotlin.Array<kotlin.String>? = if(campaignIdsParam == null) null
                            else Gson().fromJson(campaignIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val entityStatusesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"entity_statuses")
                    val entityStatuses:kotlin.Array<EntityStatus>? = if(entityStatusesParam == null) arrayListOf(EntityStatus.ACTIVE,EntityStatus.PAUSED)
                            else Gson().fromJson(entityStatusesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<EntityStatus>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.campaignsList(adAccountId,bookmark,pageSize,order,campaignIds,entityStatuses,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "campaignsUpdate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val campaignBatchUpdateItemParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(campaignBatchUpdateItemParam == null){
                         throw IllegalArgumentException("campaignBatchUpdateItem is required")
                    }
                    val campaignBatchUpdateItem:kotlin.Array<CampaignBatchUpdateItem> = Gson().fromJson(campaignBatchUpdateItemParam.encode()
                            , object : TypeToken<kotlin.collections.List<CampaignBatchUpdateItem>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.campaignsUpdate(adAccountId,campaignBatchUpdateItem,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getCampaignDeliveryEstimates" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val campaignDeliveryEstimatesCampaignParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(campaignDeliveryEstimatesCampaignParam == null){
                         throw IllegalArgumentException("campaignDeliveryEstimatesCampaign is required")
                    }
                    val campaignDeliveryEstimatesCampaign:kotlin.Array<CampaignDeliveryEstimatesCampaign> = Gson().fromJson(campaignDeliveryEstimatesCampaignParam.encode()
                            , object : TypeToken<kotlin.collections.List<CampaignDeliveryEstimatesCampaign>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getCampaignDeliveryEstimates(adAccountId,campaignDeliveryEstimatesCampaign,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
            }
        }catch (t: Throwable) {
            msg.reply(ServiceException(500, t.message))
            throw t
        }
    }
}
