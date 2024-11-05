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
import org.openapitools.server.api.model.AdvancedAuctionItems
import org.openapitools.server.api.model.AdvancedAuctionItemsGetRequest
import org.openapitools.server.api.model.AdvancedAuctionItemsSubmitRequest
import org.openapitools.server.api.model.AdvancedAuctionProcessedItems
import org.openapitools.server.api.model.Error

class AdvancedAuctionApiVertxProxyHandler(private val vertx: Vertx, private val service: AdvancedAuctionApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "advancedAuctionItemsGetPost" -> {
                    val params = context.params
                    val advancedAuctionItemsGetRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (advancedAuctionItemsGetRequestParam == null) {
                        throw IllegalArgumentException("advancedAuctionItemsGetRequest is required")
                    }
                    val advancedAuctionItemsGetRequest = Gson().fromJson(advancedAuctionItemsGetRequestParam.encode(), AdvancedAuctionItemsGetRequest::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "advancedAuctionItemsSubmitPost" -> {
                    val params = context.params
                    val advancedAuctionItemsSubmitRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (advancedAuctionItemsSubmitRequestParam == null) {
                        throw IllegalArgumentException("advancedAuctionItemsSubmitRequest is required")
                    }
                    val advancedAuctionItemsSubmitRequest = Gson().fromJson(advancedAuctionItemsSubmitRequestParam.encode(), AdvancedAuctionItemsSubmitRequest::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest,adAccountId,context)
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
