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
import org.openapitools.server.api.model.CatalogsLocalStoresCreate200ResponseInner
import org.openapitools.server.api.model.CatalogsLocalStoresDelete200ResponseInner
import org.openapitools.server.api.model.CatalogsLocalStoresList200Response
import org.openapitools.server.api.model.LocalInventoryItemsBatch
import org.openapitools.server.api.model.LocalInventoryItemsBatchCreate
import org.openapitools.server.api.model.LocalInventoryItemsGet
import org.openapitools.server.api.model.LocalInventoryItemsGetCreate
import org.openapitools.server.api.model.LocalStore
import org.openapitools.server.api.model.LocalStoreBatchUpdate
import org.openapitools.server.api.model.LocalStoreCreate
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.SupplementalItemsBatchResponse

class CatalogSupplementalApiVertxProxyHandler(private val vertx: Vertx, private val service: CatalogSupplementalApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "catalogsLocalInventoryItemsBatchOperate" -> {
                    val params = context.params
                    val catalogId = ApiHandlerUtils.searchStringInJson(params,"catalog_id")
                    if(catalogId == null){
                        throw IllegalArgumentException("catalogId is required")
                    }
                    val localInventoryItemsBatchCreateParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (localInventoryItemsBatchCreateParam == null) {
                        throw IllegalArgumentException("localInventoryItemsBatchCreate is required")
                    }
                    val localInventoryItemsBatchCreate = Gson().fromJson(localInventoryItemsBatchCreateParam.encode(), LocalInventoryItemsBatchCreate::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsLocalInventoryItemsBatchOperate(catalogId,localInventoryItemsBatchCreate,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsLocalInventoryItemsPost" -> {
                    val params = context.params
                    val catalogId = ApiHandlerUtils.searchStringInJson(params,"catalog_id")
                    if(catalogId == null){
                        throw IllegalArgumentException("catalogId is required")
                    }
                    val localInventoryItemsGetCreateParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (localInventoryItemsGetCreateParam == null) {
                        throw IllegalArgumentException("localInventoryItemsGetCreate is required")
                    }
                    val localInventoryItemsGetCreate = Gson().fromJson(localInventoryItemsGetCreateParam.encode(), LocalInventoryItemsGetCreate::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsLocalInventoryItemsPost(catalogId,localInventoryItemsGetCreate,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsLocalStoresCreate" -> {
                    val params = context.params
                    val catalogId = ApiHandlerUtils.searchStringInJson(params,"catalog_id")
                    if(catalogId == null){
                        throw IllegalArgumentException("catalogId is required")
                    }
                    val localStoreCreateParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(localStoreCreateParam == null){
                         throw IllegalArgumentException("localStoreCreate is required")
                    }
                    val localStoreCreate:kotlin.Array<LocalStoreCreate> = Gson().fromJson(localStoreCreateParam.encode()
                            , object : TypeToken<kotlin.collections.List<LocalStoreCreate>>(){}.type)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsLocalStoresCreate(catalogId,localStoreCreate,adAccountId,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsLocalStoresDelete" -> {
                    val params = context.params
                    val catalogId = ApiHandlerUtils.searchStringInJson(params,"catalog_id")
                    if(catalogId == null){
                        throw IllegalArgumentException("catalogId is required")
                    }
                    val idsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"ids")
                    if(idsParam == null){
                         throw IllegalArgumentException("ids is required")
                    }
                    val ids:kotlin.Array<kotlin.String> = Gson().fromJson(idsParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsLocalStoresDelete(catalogId,ids,adAccountId,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsLocalStoresList" -> {
                    val params = context.params
                    val catalogId = ApiHandlerUtils.searchStringInJson(params,"catalog_id")
                    if(catalogId == null){
                        throw IllegalArgumentException("catalogId is required")
                    }
                    val idsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"ids")
                    val ids:kotlin.Array<kotlin.String>? = if(idsParam == null) null
                            else Gson().fromJson(idsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsLocalStoresList(catalogId,ids,adAccountId,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsLocalStoresUpdate" -> {
                    val params = context.params
                    val catalogId = ApiHandlerUtils.searchStringInJson(params,"catalog_id")
                    if(catalogId == null){
                        throw IllegalArgumentException("catalogId is required")
                    }
                    val localStoreBatchUpdateParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(localStoreBatchUpdateParam == null){
                         throw IllegalArgumentException("localStoreBatchUpdate is required")
                    }
                    val localStoreBatchUpdate:kotlin.Array<LocalStoreBatchUpdate> = Gson().fromJson(localStoreBatchUpdateParam.encode()
                            , object : TypeToken<kotlin.collections.List<LocalStoreBatchUpdate>>(){}.type)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsLocalStoresUpdate(catalogId,localStoreBatchUpdate,adAccountId,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsSupplementalItemsBatchGet" -> {
                    val params = context.params
                    val catalogId = ApiHandlerUtils.searchStringInJson(params,"catalog_id")
                    if(catalogId == null){
                        throw IllegalArgumentException("catalogId is required")
                    }
                    val batchId = ApiHandlerUtils.searchStringInJson(params,"batch_id")
                    if(batchId == null){
                        throw IllegalArgumentException("batchId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsSupplementalItemsBatchGet(catalogId,batchId,adAccountId,context)
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
