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
import org.openapitools.server.api.model.DetailedError
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.IntegrationLogsRequest
import org.openapitools.server.api.model.IntegrationLogsSuccessResponse
import org.openapitools.server.api.model.IntegrationMetadata
import org.openapitools.server.api.model.IntegrationRecord
import org.openapitools.server.api.model.IntegrationRequest
import org.openapitools.server.api.model.IntegrationRequestPatch
import org.openapitools.server.api.model.IntegrationsGetList200Response

class IntegrationsApiVertxProxyHandler(private val vertx: Vertx, private val service: IntegrationsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "integrationsCommerceDel" -> {
                    val params = context.params
                    val externalBusinessId = ApiHandlerUtils.searchStringInJson(params,"external_business_id")
                    if(externalBusinessId == null){
                        throw IllegalArgumentException("externalBusinessId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.integrationsCommerceDel(externalBusinessId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "integrationsCommerceGet" -> {
                    val params = context.params
                    val externalBusinessId = ApiHandlerUtils.searchStringInJson(params,"external_business_id")
                    if(externalBusinessId == null){
                        throw IllegalArgumentException("externalBusinessId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.integrationsCommerceGet(externalBusinessId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "integrationsCommercePatch" -> {
                    val params = context.params
                    val externalBusinessId = ApiHandlerUtils.searchStringInJson(params,"external_business_id")
                    if(externalBusinessId == null){
                        throw IllegalArgumentException("externalBusinessId is required")
                    }
                    val integrationRequestPatchParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    val integrationRequestPatch = if(integrationRequestPatchParam ==null) null else Gson().fromJson(integrationRequestPatchParam.encode(), IntegrationRequestPatch::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.integrationsCommercePatch(externalBusinessId,integrationRequestPatch,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "integrationsCommercePost" -> {
                    val params = context.params
                    val integrationRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    val integrationRequest = if(integrationRequestParam ==null) null else Gson().fromJson(integrationRequestParam.encode(), IntegrationRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.integrationsCommercePost(integrationRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "integrationsGetById" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.integrationsGetById(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "integrationsGetList" -> {
                    val params = context.params
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.integrationsGetList(bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "integrationsLogsPost" -> {
                    val params = context.params
                    val integrationLogsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (integrationLogsRequestParam == null) {
                        throw IllegalArgumentException("integrationLogsRequest is required")
                    }
                    val integrationLogsRequest = Gson().fromJson(integrationLogsRequestParam.encode(), IntegrationLogsRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.integrationsLogsPost(integrationLogsRequest,context)
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
