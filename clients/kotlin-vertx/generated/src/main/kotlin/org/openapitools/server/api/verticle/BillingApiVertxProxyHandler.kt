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
import org.openapitools.server.api.model.AdsCreditRedeemRequest
import org.openapitools.server.api.model.AdsCreditRedeemResponse
import org.openapitools.server.api.model.AdsCreditsDiscountsGet200Response
import org.openapitools.server.api.model.BillingProfilesGet200Response
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.SSIOAccountResponse
import org.openapitools.server.api.model.SSIOCreateInsertionOrderRequest
import org.openapitools.server.api.model.SSIOCreateInsertionOrderResponse
import org.openapitools.server.api.model.SSIOEditInsertionOrderRequest
import org.openapitools.server.api.model.SSIOEditInsertionOrderResponse
import org.openapitools.server.api.model.SSIOInsertionOrderStatusResponse
import org.openapitools.server.api.model.SsioInsertionOrdersStatusGetByAdAccount200Response
import org.openapitools.server.api.model.SsioOrderLinesGetByAdAccount200Response

class BillingApiVertxProxyHandler(private val vertx: Vertx, private val service: BillingApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "adsCreditRedeem" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val adsCreditRedeemRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (adsCreditRedeemRequestParam == null) {
                        throw IllegalArgumentException("adsCreditRedeemRequest is required")
                    }
                    val adsCreditRedeemRequest = Gson().fromJson(adsCreditRedeemRequestParam.encode(), AdsCreditRedeemRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adsCreditRedeem(adAccountId,adsCreditRedeemRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adsCreditsDiscountsGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adsCreditsDiscountsGet(adAccountId,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "billingProfilesGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val isActive = ApiHandlerUtils.searchStringInJson(params,"is_active")?.toBoolean()
                    if(isActive == null){
                        throw IllegalArgumentException("isActive is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.billingProfilesGet(adAccountId,isActive,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "ssioAccountsGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.ssioAccountsGet(adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "ssioInsertionOrderCreate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val ssIOCreateInsertionOrderRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (ssIOCreateInsertionOrderRequestParam == null) {
                        throw IllegalArgumentException("ssIOCreateInsertionOrderRequest is required")
                    }
                    val ssIOCreateInsertionOrderRequest = Gson().fromJson(ssIOCreateInsertionOrderRequestParam.encode(), SSIOCreateInsertionOrderRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.ssioInsertionOrderCreate(adAccountId,ssIOCreateInsertionOrderRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "ssioInsertionOrderEdit" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val ssIOEditInsertionOrderRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (ssIOEditInsertionOrderRequestParam == null) {
                        throw IllegalArgumentException("ssIOEditInsertionOrderRequest is required")
                    }
                    val ssIOEditInsertionOrderRequest = Gson().fromJson(ssIOEditInsertionOrderRequestParam.encode(), SSIOEditInsertionOrderRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.ssioInsertionOrderEdit(adAccountId,ssIOEditInsertionOrderRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "ssioInsertionOrdersStatusGetByAdAccount" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.ssioInsertionOrdersStatusGetByAdAccount(adAccountId,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "ssioInsertionOrdersStatusGetByPinOrderId" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val pinOrderId = ApiHandlerUtils.searchStringInJson(params,"pin_order_id")
                    if(pinOrderId == null){
                        throw IllegalArgumentException("pinOrderId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId,pinOrderId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "ssioOrderLinesGetByAdAccount" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val pinOrderId = ApiHandlerUtils.searchStringInJson(params,"pin_order_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.ssioOrderLinesGetByAdAccount(adAccountId,bookmark,pageSize,pinOrderId,context)
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
