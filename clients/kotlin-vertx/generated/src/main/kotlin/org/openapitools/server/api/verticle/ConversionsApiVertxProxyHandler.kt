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
import org.openapitools.server.api.model.AdvertiserDefinedEventsCreate200Response
import org.openapitools.server.api.model.AdvertiserDefinedEventsCreateRequest
import org.openapitools.server.api.model.AdvertiserDefinedEventsGet200Response
import org.openapitools.server.api.model.PinterestLibError

class ConversionsApiVertxProxyHandler(private val vertx: Vertx, private val service: ConversionsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "advertiserDefinedEventsCreate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val advertiserDefinedEventsCreateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (advertiserDefinedEventsCreateRequestParam == null) {
                        throw IllegalArgumentException("advertiserDefinedEventsCreateRequest is required")
                    }
                    val advertiserDefinedEventsCreateRequest = Gson().fromJson(advertiserDefinedEventsCreateRequestParam.encode(), AdvertiserDefinedEventsCreateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.advertiserDefinedEventsCreate(adAccountId,advertiserDefinedEventsCreateRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "advertiserDefinedEventsDelete" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val eventNamesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"event_names")
                    if(eventNamesParam == null){
                         throw IllegalArgumentException("eventNames is required")
                    }
                    val eventNames:kotlin.Array<kotlin.String> = Gson().fromJson(eventNamesParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.advertiserDefinedEventsDelete(adAccountId,eventNames,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "advertiserDefinedEventsGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.advertiserDefinedEventsGet(adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "advertiserDefinedEventsUpdate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val advertiserDefinedEventsCreateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (advertiserDefinedEventsCreateRequestParam == null) {
                        throw IllegalArgumentException("advertiserDefinedEventsCreateRequest is required")
                    }
                    val advertiserDefinedEventsCreateRequest = Gson().fromJson(advertiserDefinedEventsCreateRequestParam.encode(), AdvertiserDefinedEventsCreateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.advertiserDefinedEventsUpdate(adAccountId,advertiserDefinedEventsCreateRequest,context)
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
