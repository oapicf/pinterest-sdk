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
import org.openapitools.server.api.model.AnalyticsMetricsResponse
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.Pin

class PinsApiVertxProxyHandler(private val vertx: Vertx, private val service: PinsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
    private val timerID: Long
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
        
                "pinsAnalytics" -> {
                    val params = context.params
                    val pinId = ApiHandlerUtils.searchStringInJson(params,"pin_id")
                    if(pinId == null){
                        throw IllegalArgumentException("pinId is required")
                    }
                    val startDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"start_date"))
                    if(startDate == null){
                        throw IllegalArgumentException("startDate is required")
                    }
                    val endDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"end_date"))
                    if(endDate == null){
                        throw IllegalArgumentException("endDate is required")
                    }
                    val metricTypesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"metric_types")
                    if(metricTypesParam == null){
                         throw IllegalArgumentException("metricTypes is required")
                    }
                    val metricTypes:kotlin.Array<kotlin.String> = Gson().fromJson(metricTypesParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val appTypes = ApiHandlerUtils.searchStringInJson(params,"app_types")
                    val splitField = ApiHandlerUtils.searchStringInJson(params,"split_field")
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pinsAnalytics(pinId,startDate,endDate,metricTypes,appTypes,splitField,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pinsCreate" -> {
                    val params = context.params
                    val pinParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (pinParam == null) {
                        throw IllegalArgumentException("pin is required")
                    }
                    val pin = Gson().fromJson(pinParam.encode(), Pin::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pinsCreate(pin,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pinsDelete" -> {
                    val params = context.params
                    val pinId = ApiHandlerUtils.searchStringInJson(params,"pin_id")
                    if(pinId == null){
                        throw IllegalArgumentException("pinId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pinsDelete(pinId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pinsGet" -> {
                    val params = context.params
                    val pinId = ApiHandlerUtils.searchStringInJson(params,"pin_id")
                    if(pinId == null){
                        throw IllegalArgumentException("pinId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pinsGet(pinId,adAccountId,context)
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
