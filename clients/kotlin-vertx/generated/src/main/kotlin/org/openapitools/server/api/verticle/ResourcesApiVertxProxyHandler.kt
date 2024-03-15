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
import org.openapitools.server.api.model.AdAccountsCountryResponse
import org.openapitools.server.api.model.BookClosedResponse
import org.openapitools.server.api.model.DeliveryMetricsResponse
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.SingleInterestTargetingOptionResponse

class ResourcesApiVertxProxyHandler(private val vertx: Vertx, private val service: ResourcesApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "adAccountCountriesGet" -> {
                }
        
                "deliveryMetricsGet" -> {
                    val params = context.params
                    val reportType = ApiHandlerUtils.searchStringInJson(params,"report_type")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deliveryMetricsGet(reportType,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "interestTargetingOptionsGet" -> {
                    val params = context.params
                    val interestId = ApiHandlerUtils.searchStringInJson(params,"interest_id")
                    if(interestId == null){
                        throw IllegalArgumentException("interestId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.interestTargetingOptionsGet(interestId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "leadFormQuestionsGet" -> {
                }
        
                "metricsReadyStateGet" -> {
                    val params = context.params
                    val date = ApiHandlerUtils.searchStringInJson(params,"date")
                    if(date == null){
                        throw IllegalArgumentException("date is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.metricsReadyStateGet(date,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "targetingOptionsGet" -> {
                    val params = context.params
                    val targetingType = ApiHandlerUtils.searchStringInJson(params,"targeting_type")
                    if(targetingType == null){
                        throw IllegalArgumentException("targetingType is required")
                    }
                    val clientId = ApiHandlerUtils.searchStringInJson(params,"client_id")
                    val oauthSignature = ApiHandlerUtils.searchStringInJson(params,"oauth_signature")
                    val timestamp = ApiHandlerUtils.searchStringInJson(params,"timestamp")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.targetingOptionsGet(targetingType,clientId,oauthSignature,timestamp,context)
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
