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
import org.openapitools.server.api.model.CatalogsListProductsByFilterRequest
import org.openapitools.server.api.model.CatalogsProductGroupPinsList200Response
import org.openapitools.server.api.model.CatalogsProductGroupProductCountsVertical
import org.openapitools.server.api.model.CatalogsProductGroupsList200Response
import org.openapitools.server.api.model.CatalogsProductGroupsUpdateRequest
import org.openapitools.server.api.model.CatalogsVerticalProductGroup
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.MultipleProductGroupsInner

class CatalogProductGroupsApiVertxProxyHandler(private val vertx: Vertx, private val service: CatalogProductGroupsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "catalogsProductGroupPinsList" -> {
                    val params = context.params
                    val productGroupId = ApiHandlerUtils.searchStringInJson(params,"product_group_id")
                    if(productGroupId == null){
                        throw IllegalArgumentException("productGroupId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    val pinMetrics = ApiHandlerUtils.searchStringInJson(params,"pin_metrics")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupPinsList(productGroupId,bookmark,pageSize,adAccountId,pinMetrics,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupsCreate" -> {
                    val params = context.params
                    val multipleProductGroupsInnerParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (multipleProductGroupsInnerParam == null) {
                        throw IllegalArgumentException("multipleProductGroupsInner is required")
                    }
                    val multipleProductGroupsInner = Gson().fromJson(multipleProductGroupsInnerParam.encode(), MultipleProductGroupsInner::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsCreate(multipleProductGroupsInner,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupsCreateMany" -> {
                    val params = context.params
                    val multipleProductGroupsInnerParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(multipleProductGroupsInnerParam == null){
                         throw IllegalArgumentException("multipleProductGroupsInner is required")
                    }
                    val multipleProductGroupsInner:kotlin.Array<MultipleProductGroupsInner> = Gson().fromJson(multipleProductGroupsInnerParam.encode()
                            , object : TypeToken<kotlin.collections.List<MultipleProductGroupsInner>>(){}.type)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsCreateMany(multipleProductGroupsInner,adAccountId,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
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
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsDelete(productGroupId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupsDeleteMany" -> {
                    val params = context.params
                    val idParam = ApiHandlerUtils.searchJsonArrayInJson(params,"id")
                    if(idParam == null){
                         throw IllegalArgumentException("id is required")
                    }
                    val id:kotlin.Array<kotlin.Int> = Gson().fromJson(idParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.Int>>(){}.type)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsDeleteMany(id,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupsGet" -> {
                    val params = context.params
                    val productGroupId = ApiHandlerUtils.searchStringInJson(params,"product_group_id")
                    if(productGroupId == null){
                        throw IllegalArgumentException("productGroupId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsGet(productGroupId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupsList" -> {
                    val params = context.params
                    val idParam = ApiHandlerUtils.searchJsonArrayInJson(params,"id")
                    val id:kotlin.Array<kotlin.Int>? = if(idParam == null) null
                            else Gson().fromJson(idParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.Int>>(){}.type)
                    val feedId = ApiHandlerUtils.searchStringInJson(params,"feed_id")
                    val catalogId = ApiHandlerUtils.searchStringInJson(params,"catalog_id")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsList(id,feedId,catalogId,bookmark,pageSize,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupsProductCountsGet" -> {
                    val params = context.params
                    val productGroupId = ApiHandlerUtils.searchStringInJson(params,"product_group_id")
                    if(productGroupId == null){
                        throw IllegalArgumentException("productGroupId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsProductCountsGet(productGroupId,adAccountId,context)
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
                    val catalogsProductGroupsUpdateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (catalogsProductGroupsUpdateRequestParam == null) {
                        throw IllegalArgumentException("catalogsProductGroupsUpdateRequest is required")
                    }
                    val catalogsProductGroupsUpdateRequest = Gson().fromJson(catalogsProductGroupsUpdateRequestParam.encode(), CatalogsProductGroupsUpdateRequest::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsUpdate(productGroupId,catalogsProductGroupsUpdateRequest,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "productsByProductGroupFilterList" -> {
                    val params = context.params
                    val catalogsListProductsByFilterRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (catalogsListProductsByFilterRequestParam == null) {
                        throw IllegalArgumentException("catalogsListProductsByFilterRequest is required")
                    }
                    val catalogsListProductsByFilterRequest = Gson().fromJson(catalogsListProductsByFilterRequestParam.encode(), CatalogsListProductsByFilterRequest::class.java)
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    val pinMetrics = ApiHandlerUtils.searchStringInJson(params,"pin_metrics")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.productsByProductGroupFilterList(catalogsListProductsByFilterRequest,bookmark,pageSize,adAccountId,pinMetrics,context)
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
