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

class AdsApiVertxProxyHandler(private val vertx: Vertx, private val service: AdsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "adPreviewsCreate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val adPreviewRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (adPreviewRequestParam == null) {
                        throw IllegalArgumentException("adPreviewRequest is required")
                    }
                    val adPreviewRequest = Gson().fromJson(adPreviewRequestParam.encode(), AdPreviewRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adPreviewsCreate(adAccountId,adPreviewRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adTargetingAnalyticsGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val adIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"ad_ids")
                    if(adIdsParam == null){
                         throw IllegalArgumentException("adIds is required")
                    }
                    val adIds:kotlin.Array<kotlin.String> = Gson().fromJson(adIdsParam.encode()
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
                    val targetingTypes:kotlin.Array<AdsAnalyticsAdTargetingType> = Gson().fromJson(targetingTypesParam.encode()
                            , object : TypeToken<kotlin.collections.List<AdsAnalyticsAdTargetingType>>(){}.type)
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
                    val clickWindowDaysParam = ApiHandlerUtils.searchJsonObjectInJson(params,"click_window_days")
                    val clickWindowDays = if(clickWindowDaysParam ==null) null else Gson().fromJson(clickWindowDaysParam.encode(), ConversionAttributionWindowDays::class.java)
                    val engagementWindowDaysParam = ApiHandlerUtils.searchJsonObjectInJson(params,"engagement_window_days")
                    val engagementWindowDays = if(engagementWindowDaysParam ==null) null else Gson().fromJson(engagementWindowDaysParam.encode(), ConversionAttributionWindowDays::class.java)
                    val viewWindowDaysParam = ApiHandlerUtils.searchJsonObjectInJson(params,"view_window_days")
                    val viewWindowDays = if(viewWindowDaysParam ==null) null else Gson().fromJson(viewWindowDaysParam.encode(), ConversionAttributionWindowDays::class.java)
                    val conversionReportTimeParam = ApiHandlerUtils.searchJsonObjectInJson(params,"conversion_report_time")
                    val conversionReportTime = if(conversionReportTimeParam ==null) null else Gson().fromJson(conversionReportTimeParam.encode(), ConversionReportTimeType::class.java)
                    val attributionTypesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"attribution_types")
                    val attributionTypes:kotlin.Array<ConversionReportAttributionType>? = if(attributionTypesParam == null) null
                            else Gson().fromJson(attributionTypesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<ConversionReportAttributionType>>(){}.type)
                    val reportingTimezoneParam = ApiHandlerUtils.searchJsonObjectInJson(params,"reporting_timezone")
                    val reportingTimezone = if(reportingTimezoneParam ==null) null else Gson().fromJson(reportingTimezoneParam.encode(), ReportingTimeZone::class.java)
                    val sortColumnsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"sort_columns")
                    val sortColumns:kotlin.Array<kotlin.String>? = if(sortColumnsParam == null) null
                            else Gson().fromJson(sortColumnsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val sortAscending = ApiHandlerUtils.searchStringInJson(params,"sort_ascending")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adTargetingAnalyticsGet(adAccountId,adIds,startDate,endDate,targetingTypes,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime,attributionTypes,reportingTimezone,sortColumns,sortAscending,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adsAnalytics" -> {
                    val params = context.params
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
                    val pinIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"pin_ids")
                    val pinIds:kotlin.Array<kotlin.String>? = if(pinIdsParam == null) null
                            else Gson().fromJson(pinIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val adIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"ad_ids")
                    val adIds:kotlin.Array<kotlin.String>? = if(adIdsParam == null) null
                            else Gson().fromJson(adIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val clickWindowDays = ApiHandlerUtils.searchDoubleInJson(params,"click_window_days")
                    val engagementWindowDays = ApiHandlerUtils.searchDoubleInJson(params,"engagement_window_days")
                    val viewWindowDays = ApiHandlerUtils.searchDoubleInJson(params,"view_window_days")
                    val conversionReportTime = ApiHandlerUtils.searchStringInJson(params,"conversion_report_time")
                    val campaignIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"campaign_ids")
                    val campaignIds:kotlin.Array<kotlin.String>? = if(campaignIdsParam == null) null
                            else Gson().fromJson(campaignIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val reportingTimezoneParam = ApiHandlerUtils.searchJsonObjectInJson(params,"reporting_timezone")
                    val reportingTimezone = if(reportingTimezoneParam ==null) null else Gson().fromJson(reportingTimezoneParam.encode(), ReportingTimeZone::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adsAnalytics(startDate,endDate,columns,granularity,adAccountId,pinIds,adIds,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime,campaignIds,reportingTimezone,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adsCreate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val adCreateParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(adCreateParam == null){
                         throw IllegalArgumentException("adCreate is required")
                    }
                    val adCreate:kotlin.Array<AdCreate> = Gson().fromJson(adCreateParam.encode()
                            , object : TypeToken<kotlin.collections.List<AdCreate>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adsCreate(adAccountId,adCreate,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adsGet" -> {
                    val params = context.params
                    val adId = ApiHandlerUtils.searchStringInJson(params,"ad_id")
                    if(adId == null){
                        throw IllegalArgumentException("adId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adsGet(adId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adsList" -> {
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
                    val adGroupIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"ad_group_ids")
                    val adGroupIds:kotlin.Array<kotlin.String>? = if(adGroupIdsParam == null) null
                            else Gson().fromJson(adGroupIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val adIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"ad_ids")
                    val adIds:kotlin.Array<kotlin.String>? = if(adIdsParam == null) null
                            else Gson().fromJson(adIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val entityStatusesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"entity_statuses")
                    val entityStatuses:kotlin.Array<EntityStatus>? = if(entityStatusesParam == null) arrayListOf(EntityStatus.ACTIVE,EntityStatus.PAUSED)
                            else Gson().fromJson(entityStatusesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<EntityStatus>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adsList(adAccountId,bookmark,pageSize,order,campaignIds,adGroupIds,adIds,entityStatuses,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adsUpdate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val adBatchUpdateParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(adBatchUpdateParam == null){
                         throw IllegalArgumentException("adBatchUpdate is required")
                    }
                    val adBatchUpdate:kotlin.Array<AdBatchUpdate> = Gson().fromJson(adBatchUpdateParam.encode()
                            , object : TypeToken<kotlin.collections.List<AdBatchUpdate>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adsUpdate(adAccountId,adBatchUpdate,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "campaignAdPreviewCreate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val campaignAdPreviewCreateParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(campaignAdPreviewCreateParam == null){
                         throw IllegalArgumentException("campaignAdPreviewCreate is required")
                    }
                    val campaignAdPreviewCreate:kotlin.Array<CampaignAdPreviewCreate> = Gson().fromJson(campaignAdPreviewCreateParam.encode()
                            , object : TypeToken<kotlin.collections.List<CampaignAdPreviewCreate>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.campaignAdPreviewCreate(adAccountId,campaignAdPreviewCreate,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "campaignAdPreviewDelete" -> {
                    val params = context.params
                    val adGroupIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"ad_group_ids")
                    if(adGroupIdsParam == null){
                         throw IllegalArgumentException("adGroupIds is required")
                    }
                    val adGroupIds:kotlin.Array<kotlin.String> = Gson().fromJson(adGroupIdsParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.campaignAdPreviewDelete(adGroupIds,adAccountId,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "campaignAdPreviewRead" -> {
                    val params = context.params
                    val adGroupIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"ad_group_ids")
                    if(adGroupIdsParam == null){
                         throw IllegalArgumentException("adGroupIds is required")
                    }
                    val adGroupIds:kotlin.Array<kotlin.String> = Gson().fromJson(adGroupIdsParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.campaignAdPreviewRead(adGroupIds,adAccountId,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
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
