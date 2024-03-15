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
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
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
                    val columns:kotlin.Array<kotlin.String> = Gson().fromJson(columnsParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val granularityParam = ApiHandlerUtils.searchJsonObjectInJson(params,"granularity")
                    if (granularityParam == null) {
                        throw IllegalArgumentException("granularity is required")
                    }
                    val granularity = Gson().fromJson(granularityParam.encode(), Granularity::class.java)
                    val clickWindowDays = ApiHandlerUtils.searchIntegerInJson(params,"click_window_days")
                    val engagementWindowDays = ApiHandlerUtils.searchIntegerInJson(params,"engagement_window_days")
                    val viewWindowDays = ApiHandlerUtils.searchIntegerInJson(params,"view_window_days")
                    val conversionReportTime = ApiHandlerUtils.searchStringInJson(params,"conversion_report_time")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsAnalytics(adAccountId,startDate,endDate,adGroupIds,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime,context)
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
                    val adGroupAudienceSizingRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    val adGroupAudienceSizingRequest = if(adGroupAudienceSizingRequestParam ==null) null else Gson().fromJson(adGroupAudienceSizingRequestParam.encode(), AdGroupAudienceSizingRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsAudienceSizing(adAccountId,adGroupAudienceSizingRequest,context)
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
                    val bidFloorRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (bidFloorRequestParam == null) {
                        throw IllegalArgumentException("bidFloorRequest is required")
                    }
                    val bidFloorRequest = Gson().fromJson(bidFloorRequestParam.encode(), BidFloorRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsBidFloorGet(adAccountId,bidFloorRequest,context)
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
                    val adGroupCreateRequestParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(adGroupCreateRequestParam == null){
                         throw IllegalArgumentException("adGroupCreateRequest is required")
                    }
                    val adGroupCreateRequest:kotlin.Array<AdGroupCreateRequest> = Gson().fromJson(adGroupCreateRequestParam.encode()
                            , object : TypeToken<kotlin.collections.List<AdGroupCreateRequest>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsCreate(adAccountId,adGroupCreateRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adGroupsGet" -> {
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
                        val result = service.adGroupsGet(adAccountId,adGroupId,context)
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
                    val campaignIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"campaign_ids")
                    val campaignIds:kotlin.Array<kotlin.String>? = if(campaignIdsParam == null) null
                            else Gson().fromJson(campaignIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val adGroupIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"ad_group_ids")
                    val adGroupIds:kotlin.Array<kotlin.String>? = if(adGroupIdsParam == null) null
                            else Gson().fromJson(adGroupIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val entityStatusesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"entity_statuses")
                    val entityStatuses:kotlin.Array<kotlin.String>? = if(entityStatusesParam == null) arrayListOf(EntityStatuses.ACTIVE,EntityStatuses.PAUSED)
                            else Gson().fromJson(entityStatusesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val order = ApiHandlerUtils.searchStringInJson(params,"order")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val translateInterestsToNames = ApiHandlerUtils.searchStringInJson(params,"translate_interests_to_names")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsList(adAccountId,campaignIds,adGroupIds,entityStatuses,pageSize,order,bookmark,translateInterestsToNames,context)
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
                    val targetingTypes:kotlin.Array<AdsAnalyticsTargetingType> = Gson().fromJson(targetingTypesParam.encode()
                            , object : TypeToken<kotlin.collections.List<AdsAnalyticsTargetingType>>(){}.type)
                    val columnsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"columns")
                    if(columnsParam == null){
                         throw IllegalArgumentException("columns is required")
                    }
                    val columns:kotlin.Array<kotlin.String> = Gson().fromJson(columnsParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val granularityParam = ApiHandlerUtils.searchJsonObjectInJson(params,"granularity")
                    if (granularityParam == null) {
                        throw IllegalArgumentException("granularity is required")
                    }
                    val granularity = Gson().fromJson(granularityParam.encode(), Granularity::class.java)
                    val clickWindowDays = ApiHandlerUtils.searchIntegerInJson(params,"click_window_days")
                    val engagementWindowDays = ApiHandlerUtils.searchIntegerInJson(params,"engagement_window_days")
                    val viewWindowDays = ApiHandlerUtils.searchIntegerInJson(params,"view_window_days")
                    val conversionReportTime = ApiHandlerUtils.searchStringInJson(params,"conversion_report_time")
                    val attributionTypesParam = ApiHandlerUtils.searchJsonObjectInJson(params,"attribution_types")
                    val attributionTypes = if(attributionTypesParam ==null) null else Gson().fromJson(attributionTypesParam.encode(), ConversionReportAttributionType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsTargetingAnalyticsGet(adAccountId,adGroupIds,startDate,endDate,targetingTypes,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime,attributionTypes,context)
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
                    val adGroupUpdateRequestParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(adGroupUpdateRequestParam == null){
                         throw IllegalArgumentException("adGroupUpdateRequest is required")
                    }
                    val adGroupUpdateRequest:kotlin.Array<AdGroupUpdateRequest> = Gson().fromJson(adGroupUpdateRequestParam.encode()
                            , object : TypeToken<kotlin.collections.List<AdGroupUpdateRequest>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adGroupsUpdate(adAccountId,adGroupUpdateRequest,context)
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
