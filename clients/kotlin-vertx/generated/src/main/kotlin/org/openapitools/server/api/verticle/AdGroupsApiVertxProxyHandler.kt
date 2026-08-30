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

class AdGroupsApiVertxProxyHandler(private val vertx: Vertx, private val service: AdGroupsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "adGroupsAnalytics" -> {
                    val params = context.params
                    val startDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"start_date"))
                    if(startDate == null){
                        throw IllegalArgumentException("startDate is required")
                    }
                    val endDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"end_date"))
                    if(endDate == null){
                        throw IllegalArgumentException("endDate is required")
                    }
                    val adGroupIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"ad_group_ids")
                    if(adGroupIdsParam == null){
                         throw IllegalArgumentException("adGroupIds is required")
                    }
                    val adGroupIds:kotlin.Array<kotlin.String> = Gson().fromJson(adGroupIdsParam.encode()
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
                        val result = service.adGroupsAnalytics(startDate,endDate,adGroupIds,columns,granularity,adAccountId,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime,aggregateReportRows,reportingTimezone,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adGroupsAudienceSizing" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val adGroupAudienceSizingCreateParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (adGroupAudienceSizingCreateParam == null) {
                        throw IllegalArgumentException("adGroupAudienceSizingCreate is required")
                    }
                    val adGroupAudienceSizingCreate = Gson().fromJson(adGroupAudienceSizingCreateParam.encode(), AdGroupAudienceSizingCreate::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsAudienceSizing(adAccountId,adGroupAudienceSizingCreate,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adGroupsBidFloorGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val bidFloorCreateParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (bidFloorCreateParam == null) {
                        throw IllegalArgumentException("bidFloorCreate is required")
                    }
                    val bidFloorCreate = Gson().fromJson(bidFloorCreateParam.encode(), BidFloorCreate::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsBidFloorGet(adAccountId,bidFloorCreate,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adGroupsCreate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val adGroupCreateCreateParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(adGroupCreateCreateParam == null){
                         throw IllegalArgumentException("adGroupCreateCreate is required")
                    }
                    val adGroupCreateCreate:kotlin.Array<AdGroupCreateCreate> = Gson().fromJson(adGroupCreateCreateParam.encode()
                            , object : TypeToken<kotlin.collections.List<AdGroupCreateCreate>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsCreate(adAccountId,adGroupCreateCreate,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adGroupsDynamicTitlesDownloadCsv" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val adGroupId = ApiHandlerUtils.searchStringInJson(params,"ad_group_id")
                    if(adGroupId == null){
                        throw IllegalArgumentException("adGroupId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsDynamicTitlesDownloadCsv(adAccountId,adGroupId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adGroupsDynamicTitlesGetStatus" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val adGroupId = ApiHandlerUtils.searchStringInJson(params,"ad_group_id")
                    if(adGroupId == null){
                        throw IllegalArgumentException("adGroupId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsDynamicTitlesGetStatus(adAccountId,adGroupId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adGroupsDynamicTitlesGetUploadUrl" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val adGroupId = ApiHandlerUtils.searchStringInJson(params,"ad_group_id")
                    if(adGroupId == null){
                        throw IllegalArgumentException("adGroupId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsDynamicTitlesGetUploadUrl(adAccountId,adGroupId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adGroupsDynamicTitlesProcessCsv" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val adGroupId = ApiHandlerUtils.searchStringInJson(params,"ad_group_id")
                    if(adGroupId == null){
                        throw IllegalArgumentException("adGroupId is required")
                    }
                    val dynamicTitlesProcessCSVCreateParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (dynamicTitlesProcessCSVCreateParam == null) {
                        throw IllegalArgumentException("dynamicTitlesProcessCSVCreate is required")
                    }
                    val dynamicTitlesProcessCSVCreate = Gson().fromJson(dynamicTitlesProcessCSVCreateParam.encode(), DynamicTitlesProcessCSVCreate::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsDynamicTitlesProcessCsv(adAccountId,adGroupId,dynamicTitlesProcessCSVCreate,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adGroupsGet" -> {
                    val params = context.params
                    val adGroupId = ApiHandlerUtils.searchStringInJson(params,"ad_group_id")
                    if(adGroupId == null){
                        throw IllegalArgumentException("adGroupId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsGet(adGroupId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adGroupsList" -> {
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
                    val entityStatusesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"entity_statuses")
                    val entityStatuses:kotlin.Array<EntityStatus>? = if(entityStatusesParam == null) arrayListOf(EntityStatus.ACTIVE,EntityStatus.PAUSED)
                            else Gson().fromJson(entityStatusesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<EntityStatus>>(){}.type)
                    val translateInterestsToNames = ApiHandlerUtils.searchStringInJson(params,"translate_interests_to_names")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsList(adAccountId,bookmark,pageSize,order,campaignIds,adGroupIds,entityStatuses,translateInterestsToNames,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adGroupsTargetingAnalyticsGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val adGroupIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"ad_group_ids")
                    if(adGroupIdsParam == null){
                         throw IllegalArgumentException("adGroupIds is required")
                    }
                    val adGroupIds:kotlin.Array<kotlin.String> = Gson().fromJson(adGroupIdsParam.encode()
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
                    val targetingTypes:kotlin.Array<AdsAnalyticsAdGroupTargetingType> = Gson().fromJson(targetingTypesParam.encode()
                            , object : TypeToken<kotlin.collections.List<AdsAnalyticsAdGroupTargetingType>>(){}.type)
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
                    val sortColumnsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"sort_columns")
                    val sortColumns:kotlin.Array<kotlin.String>? = if(sortColumnsParam == null) null
                            else Gson().fromJson(sortColumnsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val sortAscending = ApiHandlerUtils.searchStringInJson(params,"sort_ascending")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsTargetingAnalyticsGet(adAccountId,adGroupIds,startDate,endDate,targetingTypes,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime,attributionTypes,reportingTimezone,sortColumns,sortAscending,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adGroupsUpdate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val adGroupUpdateBatchUpdateParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(adGroupUpdateBatchUpdateParam == null){
                         throw IllegalArgumentException("adGroupUpdateBatchUpdate is required")
                    }
                    val adGroupUpdateBatchUpdate:kotlin.Array<AdGroupUpdateBatchUpdate> = Gson().fromJson(adGroupUpdateBatchUpdateParam.encode()
                            , object : TypeToken<kotlin.collections.List<AdGroupUpdateBatchUpdate>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsUpdate(adAccountId,adGroupUpdateBatchUpdate,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getAdGroupsByPromotionIdsList" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val promotionIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"promotion_ids")
                    if(promotionIdsParam == null){
                         throw IllegalArgumentException("promotionIds is required")
                    }
                    val promotionIds:kotlin.Array<kotlin.String> = Gson().fromJson(promotionIdsParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val orderParam = ApiHandlerUtils.searchJsonObjectInJson(params,"order")
                    val order = if(orderParam ==null) null else Gson().fromJson(orderParam.encode(), PinterestLibPaginationOrder::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getAdGroupsByPromotionIdsList(adAccountId,promotionIds,bookmark,pageSize,order,context)
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
