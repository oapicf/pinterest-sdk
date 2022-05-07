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
import org.openapitools.server.api.model.CatalogsFeedsCreateRequest
import org.openapitools.server.api.model.CatalogsFeedsUpdateRequest
import org.openapitools.server.api.model.CatalogsItems
import org.openapitools.server.api.model.CatalogsItemsBatch
import org.openapitools.server.api.model.CatalogsItemsBatchRequest
import org.openapitools.server.api.model.CatalogsProductGroup
import org.openapitools.server.api.model.CatalogsProductGroupCreateRequest
import org.openapitools.server.api.model.CatalogsProductGroupUpdateRequest
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.Paginated

class CatalogsApiVertxProxyHandler(private val vertx: Vertx, private val service: CatalogsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "catalogsProductGroupsCreate" -> {
                    val params = context.params
                    val catalogsProductGroupCreateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (catalogsProductGroupCreateRequestParam == null) {
                        throw IllegalArgumentException("catalogsProductGroupCreateRequest is required")
                    }
                    val catalogsProductGroupCreateRequest = Gson().fromJson(catalogsProductGroupCreateRequestParam.encode(), CatalogsProductGroupCreateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsCreate(catalogsProductGroupCreateRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupsDelete" -> {
                    val params = context.params
                    val productGroupId = ApiHandlerUtils.searchStringInJson(params,"product_group_id")
                    if(productGroupId == null){
                        throw IllegalArgumentException("productGroupId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsDelete(productGroupId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupsList" -> {
                    val params = context.params
                    val feedId = ApiHandlerUtils.searchStringInJson(params,"feed_id")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsList(feedId,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupsUpdate" -> {
                    val params = context.params
                    val productGroupId = ApiHandlerUtils.searchStringInJson(params,"product_group_id")
                    if(productGroupId == null){
                        throw IllegalArgumentException("productGroupId is required")
                    }
                    val catalogsProductGroupUpdateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (catalogsProductGroupUpdateRequestParam == null) {
                        throw IllegalArgumentException("catalogsProductGroupUpdateRequest is required")
                    }
                    val catalogsProductGroupUpdateRequest = Gson().fromJson(catalogsProductGroupUpdateRequestParam.encode(), CatalogsProductGroupUpdateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsUpdate(productGroupId,catalogsProductGroupUpdateRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "feedProcessingResultsList" -> {
                    val params = context.params
                    val feedId = ApiHandlerUtils.searchStringInJson(params,"feed_id")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedProcessingResultsList(feedId,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "feedsCreate" -> {
                    val params = context.params
                    val catalogsFeedsCreateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (catalogsFeedsCreateRequestParam == null) {
                        throw IllegalArgumentException("catalogsFeedsCreateRequest is required")
                    }
                    val catalogsFeedsCreateRequest = Gson().fromJson(catalogsFeedsCreateRequestParam.encode(), CatalogsFeedsCreateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedsCreate(catalogsFeedsCreateRequest,context)
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
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedsDelete(feedId,context)
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
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedsGet(feedId,context)
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
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedsList(bookmark,pageSize,context)
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
                    val catalogsFeedsUpdateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (catalogsFeedsUpdateRequestParam == null) {
                        throw IllegalArgumentException("catalogsFeedsUpdateRequest is required")
                    }
                    val catalogsFeedsUpdateRequest = Gson().fromJson(catalogsFeedsUpdateRequestParam.encode(), CatalogsFeedsUpdateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedsUpdate(feedId,catalogsFeedsUpdateRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "itemsBatchGet" -> {
                    val params = context.params
                    val batchId = ApiHandlerUtils.searchStringInJson(params,"batch_id")
                    if(batchId == null){
                        throw IllegalArgumentException("batchId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.itemsBatchGet(batchId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "itemsBatchPost" -> {
                    val params = context.params
                    val catalogsItemsBatchRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (catalogsItemsBatchRequestParam == null) {
                        throw IllegalArgumentException("catalogsItemsBatchRequest is required")
                    }
                    val catalogsItemsBatchRequest = Gson().fromJson(catalogsItemsBatchRequestParam.encode(), CatalogsItemsBatchRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.itemsBatchPost(catalogsItemsBatchRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "itemsGet" -> {
                    val params = context.params
                    val country = ApiHandlerUtils.searchStringInJson(params,"country")
                    if(country == null){
                        throw IllegalArgumentException("country is required")
                    }
                    val itemIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"item_ids")
                    if(itemIdsParam == null){
                         throw IllegalArgumentException("itemIds is required")
                    }
                    val itemIds:kotlin.Array<kotlin.String> = Gson().fromJson(itemIdsParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val language = ApiHandlerUtils.searchStringInJson(params,"language")
                    if(language == null){
                        throw IllegalArgumentException("language is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.itemsGet(country,itemIds,language,context)
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
