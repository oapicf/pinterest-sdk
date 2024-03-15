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
import org.openapitools.server.api.model.Audience
import org.openapitools.server.api.model.AudienceCreateCustomRequest
import org.openapitools.server.api.model.AudienceCreateRequest
import org.openapitools.server.api.model.AudienceUpdateRequest
import org.openapitools.server.api.model.AudiencesList200Response
import org.openapitools.server.api.model.Error

class AudiencesApiVertxProxyHandler(private val vertx: Vertx, private val service: AudiencesApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "audiencesCreate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val audienceCreateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (audienceCreateRequestParam == null) {
                        throw IllegalArgumentException("audienceCreateRequest is required")
                    }
                    val audienceCreateRequest = Gson().fromJson(audienceCreateRequestParam.encode(), AudienceCreateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.audiencesCreate(adAccountId,audienceCreateRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "audiencesCreateCustom" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val audienceCreateCustomRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (audienceCreateCustomRequestParam == null) {
                        throw IllegalArgumentException("audienceCreateCustomRequest is required")
                    }
                    val audienceCreateCustomRequest = Gson().fromJson(audienceCreateCustomRequestParam.encode(), AudienceCreateCustomRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.audiencesCreateCustom(adAccountId,audienceCreateCustomRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "audiencesGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val audienceId = ApiHandlerUtils.searchStringInJson(params,"audience_id")
                    if(audienceId == null){
                        throw IllegalArgumentException("audienceId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.audiencesGet(adAccountId,audienceId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "audiencesList" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val order = ApiHandlerUtils.searchStringInJson(params,"order")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val ownershipType = ApiHandlerUtils.searchStringInJson(params,"ownership_type")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.audiencesList(adAccountId,bookmark,order,pageSize,ownershipType,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "audiencesUpdate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val audienceId = ApiHandlerUtils.searchStringInJson(params,"audience_id")
                    if(audienceId == null){
                        throw IllegalArgumentException("audienceId is required")
                    }
                    val audienceUpdateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    val audienceUpdateRequest = if(audienceUpdateRequestParam ==null) null else Gson().fromJson(audienceUpdateRequestParam.encode(), AudienceUpdateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.audiencesUpdate(adAccountId,audienceId,audienceUpdateRequest,context)
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
