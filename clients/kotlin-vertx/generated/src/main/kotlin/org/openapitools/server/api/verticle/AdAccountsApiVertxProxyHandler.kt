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
import org.openapitools.server.api.model.AdAccount
import org.openapitools.server.api.model.AdAccountAnalyticsResponseInner
import org.openapitools.server.api.model.AdAccountCreateRequest
import org.openapitools.server.api.model.AdAccountsList200Response
import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncRequest
import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncResponse
import org.openapitools.server.api.model.AdsAnalyticsGetAsyncResponse
import org.openapitools.server.api.model.AdsAnalyticsTargetingType
import org.openapitools.server.api.model.ConversionReportAttributionType
import org.openapitools.server.api.model.CreateMMMReportRequest
import org.openapitools.server.api.model.CreateMMMReportResponse
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.GetMMMReportResponse
import org.openapitools.server.api.model.Granularity
import org.openapitools.server.api.model.MetricsResponse
import org.openapitools.server.api.model.TemplatesList200Response

class AdAccountsApiVertxProxyHandler(private val vertx: Vertx, private val service: AdAccountsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "adAccountAnalytics" -> {
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
                        val result = service.adAccountAnalytics(adAccountId,startDate,endDate,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adAccountTargetingAnalyticsGet" -> {
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
                        val result = service.adAccountTargetingAnalyticsGet(adAccountId,startDate,endDate,targetingTypes,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime,attributionTypes,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adAccountsCreate" -> {
                    val params = context.params
                    val adAccountCreateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (adAccountCreateRequestParam == null) {
                        throw IllegalArgumentException("adAccountCreateRequest is required")
                    }
                    val adAccountCreateRequest = Gson().fromJson(adAccountCreateRequestParam.encode(), AdAccountCreateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adAccountsCreate(adAccountCreateRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adAccountsGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adAccountsGet(adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adAccountsList" -> {
                    val params = context.params
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val includeSharedAccounts = ApiHandlerUtils.searchStringInJson(params,"include_shared_accounts")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adAccountsList(bookmark,pageSize,includeSharedAccounts,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "analyticsCreateMmmReport" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val createMMMReportRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createMMMReportRequestParam == null) {
                        throw IllegalArgumentException("createMMMReportRequest is required")
                    }
                    val createMMMReportRequest = Gson().fromJson(createMMMReportRequestParam.encode(), CreateMMMReportRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.analyticsCreateMmmReport(adAccountId,createMMMReportRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "analyticsCreateReport" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val adsAnalyticsCreateAsyncRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (adsAnalyticsCreateAsyncRequestParam == null) {
                        throw IllegalArgumentException("adsAnalyticsCreateAsyncRequest is required")
                    }
                    val adsAnalyticsCreateAsyncRequest = Gson().fromJson(adsAnalyticsCreateAsyncRequestParam.encode(), AdsAnalyticsCreateAsyncRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.analyticsCreateReport(adAccountId,adsAnalyticsCreateAsyncRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "analyticsCreateTemplateReport" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val templateId = ApiHandlerUtils.searchStringInJson(params,"template_id")
                    if(templateId == null){
                        throw IllegalArgumentException("templateId is required")
                    }
                    val startDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"start_date"))
                    val endDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"end_date"))
                    val granularityParam = ApiHandlerUtils.searchJsonObjectInJson(params,"granularity")
                    val granularity = if(granularityParam ==null) null else Gson().fromJson(granularityParam.encode(), Granularity::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.analyticsCreateTemplateReport(adAccountId,templateId,startDate,endDate,granularity,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "analyticsGetMmmReport" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val token = ApiHandlerUtils.searchStringInJson(params,"token")
                    if(token == null){
                        throw IllegalArgumentException("token is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.analyticsGetMmmReport(adAccountId,token,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "analyticsGetReport" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val token = ApiHandlerUtils.searchStringInJson(params,"token")
                    if(token == null){
                        throw IllegalArgumentException("token is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.analyticsGetReport(adAccountId,token,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "sandboxDelete" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.sandboxDelete(adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "templatesList" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val order = ApiHandlerUtils.searchStringInJson(params,"order")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.templatesList(adAccountId,pageSize,order,bookmark,context)
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
