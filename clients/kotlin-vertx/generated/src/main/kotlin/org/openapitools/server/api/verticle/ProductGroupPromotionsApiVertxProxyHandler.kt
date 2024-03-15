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
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.Granularity
import org.openapitools.server.api.model.ProductGroupAnalyticsResponseInner
import org.openapitools.server.api.model.ProductGroupPromotionCreateRequest
import org.openapitools.server.api.model.ProductGroupPromotionResponse
import org.openapitools.server.api.model.ProductGroupPromotionUpdateRequest
import org.openapitools.server.api.model.ProductGroupPromotionsList200Response

class ProductGroupPromotionsApiVertxProxyHandler(private val vertx: Vertx, private val service: ProductGroupPromotionsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "productGroupPromotionsCreate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val productGroupPromotionCreateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (productGroupPromotionCreateRequestParam == null) {
                        throw IllegalArgumentException("productGroupPromotionCreateRequest is required")
                    }
                    val productGroupPromotionCreateRequest = Gson().fromJson(productGroupPromotionCreateRequestParam.encode(), ProductGroupPromotionCreateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.productGroupPromotionsCreate(adAccountId,productGroupPromotionCreateRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "productGroupPromotionsGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val productGroupPromotionId = ApiHandlerUtils.searchStringInJson(params,"product_group_promotion_id")
                    if(productGroupPromotionId == null){
                        throw IllegalArgumentException("productGroupPromotionId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.productGroupPromotionsGet(adAccountId,productGroupPromotionId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "productGroupPromotionsList" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val productGroupPromotionIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"product_group_promotion_ids")
                    val productGroupPromotionIds:kotlin.Array<kotlin.String>? = if(productGroupPromotionIdsParam == null) null
                            else Gson().fromJson(productGroupPromotionIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val entityStatusesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"entity_statuses")
                    val entityStatuses:kotlin.Array<kotlin.String>? = if(entityStatusesParam == null) arrayListOf(EntityStatuses.ACTIVE,EntityStatuses.PAUSED)
                            else Gson().fromJson(entityStatusesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val adGroupId = ApiHandlerUtils.searchStringInJson(params,"ad_group_id")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val order = ApiHandlerUtils.searchStringInJson(params,"order")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.productGroupPromotionsList(adAccountId,productGroupPromotionIds,entityStatuses,adGroupId,pageSize,order,bookmark,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "productGroupPromotionsUpdate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val productGroupPromotionUpdateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (productGroupPromotionUpdateRequestParam == null) {
                        throw IllegalArgumentException("productGroupPromotionUpdateRequest is required")
                    }
                    val productGroupPromotionUpdateRequest = Gson().fromJson(productGroupPromotionUpdateRequestParam.encode(), ProductGroupPromotionUpdateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.productGroupPromotionsUpdate(adAccountId,productGroupPromotionUpdateRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "productGroupsAnalytics" -> {
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
                    val productGroupIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"product_group_ids")
                    if(productGroupIdsParam == null){
                         throw IllegalArgumentException("productGroupIds is required")
                    }
                    val productGroupIds:kotlin.Array<kotlin.String> = Gson().fromJson(productGroupIdsParam.encode()
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
                        val result = service.productGroupsAnalytics(adAccountId,startDate,endDate,productGroupIds,columns,granularity,clickWindowDays,engagementWindowDays,viewWindowDays,conversionReportTime,context)
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
