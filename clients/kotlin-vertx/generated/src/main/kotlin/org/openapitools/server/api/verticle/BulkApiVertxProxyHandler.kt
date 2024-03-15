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
import org.openapitools.server.api.model.BulkDownloadRequest
import org.openapitools.server.api.model.BulkDownloadResponse
import org.openapitools.server.api.model.BulkUpsertRequest
import org.openapitools.server.api.model.BulkUpsertResponse
import org.openapitools.server.api.model.BulkUpsertStatusResponse
import org.openapitools.server.api.model.Error

class BulkApiVertxProxyHandler(private val vertx: Vertx, private val service: BulkApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "bulkDownloadCreate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val bulkDownloadRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (bulkDownloadRequestParam == null) {
                        throw IllegalArgumentException("bulkDownloadRequest is required")
                    }
                    val bulkDownloadRequest = Gson().fromJson(bulkDownloadRequestParam.encode(), BulkDownloadRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.bulkDownloadCreate(adAccountId,bulkDownloadRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "bulkRequestGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val bulkRequestId = ApiHandlerUtils.searchStringInJson(params,"bulk_request_id")
                    if(bulkRequestId == null){
                        throw IllegalArgumentException("bulkRequestId is required")
                    }
                    val includeDetails = ApiHandlerUtils.searchStringInJson(params,"include_details")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.bulkRequestGet(adAccountId,bulkRequestId,includeDetails,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "bulkUpsertCreate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val bulkUpsertRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (bulkUpsertRequestParam == null) {
                        throw IllegalArgumentException("bulkUpsertRequest is required")
                    }
                    val bulkUpsertRequest = Gson().fromJson(bulkUpsertRequestParam.encode(), BulkUpsertRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.bulkUpsertCreate(adAccountId,bulkUpsertRequest,context)
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
