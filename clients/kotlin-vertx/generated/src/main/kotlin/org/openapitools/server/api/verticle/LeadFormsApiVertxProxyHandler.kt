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
import org.openapitools.server.api.model.LeadFormArrayResponse
import org.openapitools.server.api.model.LeadFormCreateRequest
import org.openapitools.server.api.model.LeadFormResponse
import org.openapitools.server.api.model.LeadFormTestRequest
import org.openapitools.server.api.model.LeadFormTestResponse
import org.openapitools.server.api.model.LeadFormUpdateRequest
import org.openapitools.server.api.model.LeadFormsList200Response

class LeadFormsApiVertxProxyHandler(private val vertx: Vertx, private val service: LeadFormsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "leadFormGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val leadFormId = ApiHandlerUtils.searchStringInJson(params,"lead_form_id")
                    if(leadFormId == null){
                        throw IllegalArgumentException("leadFormId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.leadFormGet(adAccountId,leadFormId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "leadFormTestCreate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val leadFormId = ApiHandlerUtils.searchStringInJson(params,"lead_form_id")
                    if(leadFormId == null){
                        throw IllegalArgumentException("leadFormId is required")
                    }
                    val leadFormTestRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (leadFormTestRequestParam == null) {
                        throw IllegalArgumentException("leadFormTestRequest is required")
                    }
                    val leadFormTestRequest = Gson().fromJson(leadFormTestRequestParam.encode(), LeadFormTestRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.leadFormTestCreate(adAccountId,leadFormId,leadFormTestRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "leadFormsCreate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val leadFormCreateRequestParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(leadFormCreateRequestParam == null){
                         throw IllegalArgumentException("leadFormCreateRequest is required")
                    }
                    val leadFormCreateRequest:kotlin.Array<LeadFormCreateRequest> = Gson().fromJson(leadFormCreateRequestParam.encode()
                            , object : TypeToken<kotlin.collections.List<LeadFormCreateRequest>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.leadFormsCreate(adAccountId,leadFormCreateRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "leadFormsList" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val order = ApiHandlerUtils.searchStringInJson(params,"order")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.leadFormsList(adAccountId,pageSize,order,bookmark,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "leadFormsUpdate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val leadFormUpdateRequestParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(leadFormUpdateRequestParam == null){
                         throw IllegalArgumentException("leadFormUpdateRequest is required")
                    }
                    val leadFormUpdateRequest:kotlin.Array<LeadFormUpdateRequest> = Gson().fromJson(leadFormUpdateRequestParam.encode()
                            , object : TypeToken<kotlin.collections.List<LeadFormUpdateRequest>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.leadFormsUpdate(adAccountId,leadFormUpdateRequest,context)
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
