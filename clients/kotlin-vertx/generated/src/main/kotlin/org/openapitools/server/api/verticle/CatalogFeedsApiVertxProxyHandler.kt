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
import org.openapitools.server.api.model.CatalogsFeed
import org.openapitools.server.api.model.CatalogsFeedIngestion
import org.openapitools.server.api.model.CatalogsItemValidationIssue
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.FeedProcessingResultsList200Response
import org.openapitools.server.api.model.FeedsCreateRequest
import org.openapitools.server.api.model.FeedsList200Response
import org.openapitools.server.api.model.FeedsUpdateRequest
import org.openapitools.server.api.model.ItemsIssuesList200Response

class CatalogFeedsApiVertxProxyHandler(private val vertx: Vertx, private val service: CatalogFeedsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "feedProcessingResultsList" -> {
                    val params = context.params
                    val feedId = ApiHandlerUtils.searchStringInJson(params,"feed_id")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedProcessingResultsList(feedId,bookmark,pageSize,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "feedsCreate" -> {
                    val params = context.params
                    val feedsCreateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (feedsCreateRequestParam == null) {
                        throw IllegalArgumentException("feedsCreateRequest is required")
                    }
                    val feedsCreateRequest = Gson().fromJson(feedsCreateRequestParam.encode(), FeedsCreateRequest::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedsCreate(feedsCreateRequest,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "feedsDelete" -> {
                    val params = context.params
                    val feedId = ApiHandlerUtils.searchStringInJson(params,"feed_id")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedsDelete(feedId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "feedsGet" -> {
                    val params = context.params
                    val feedId = ApiHandlerUtils.searchStringInJson(params,"feed_id")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedsGet(feedId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "feedsIngest" -> {
                    val params = context.params
                    val feedId = ApiHandlerUtils.searchStringInJson(params,"feed_id")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedsIngest(feedId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "feedsList" -> {
                    val params = context.params
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val catalogId = ApiHandlerUtils.searchStringInJson(params,"catalog_id")
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedsList(bookmark,pageSize,catalogId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "feedsUpdate" -> {
                    val params = context.params
                    val feedId = ApiHandlerUtils.searchStringInJson(params,"feed_id")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    val feedsUpdateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (feedsUpdateRequestParam == null) {
                        throw IllegalArgumentException("feedsUpdateRequest is required")
                    }
                    val feedsUpdateRequest = Gson().fromJson(feedsUpdateRequestParam.encode(), FeedsUpdateRequest::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedsUpdate(feedId,feedsUpdateRequest,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "itemsIssuesList" -> {
                    val params = context.params
                    val processingResultId = ApiHandlerUtils.searchStringInJson(params,"processing_result_id")
                    if(processingResultId == null){
                        throw IllegalArgumentException("processingResultId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val itemNumbersParam = ApiHandlerUtils.searchJsonArrayInJson(params,"item_numbers")
                    val itemNumbers:kotlin.Array<kotlin.Int>? = if(itemNumbersParam == null) null
                            else Gson().fromJson(itemNumbersParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.Int>>(){}.type)
                    val itemValidationIssueParam = ApiHandlerUtils.searchJsonObjectInJson(params,"item_validation_issue")
                    val itemValidationIssue = if(itemValidationIssueParam ==null) null else Gson().fromJson(itemValidationIssueParam.encode(), CatalogsItemValidationIssue::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.itemsIssuesList(processingResultId,bookmark,pageSize,itemNumbers,itemValidationIssue,adAccountId,context)
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
