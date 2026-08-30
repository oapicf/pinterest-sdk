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
import org.openapitools.server.api.model.AdAccountsAudience
import org.openapitools.server.api.model.AdAccountsAudienceCreate
import org.openapitools.server.api.model.AdAccountsAudienceUpdate
import org.openapitools.server.api.model.AudienceOwnershipType
import org.openapitools.server.api.model.AudiencesList200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder

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
                    val adAccountsAudienceCreateParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (adAccountsAudienceCreateParam == null) {
                        throw IllegalArgumentException("adAccountsAudienceCreate is required")
                    }
                    val adAccountsAudienceCreate = Gson().fromJson(adAccountsAudienceCreateParam.encode(), AdAccountsAudienceCreate::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.audiencesCreate(adAccountId,adAccountsAudienceCreate,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "audiencesGet" -> {
                    val params = context.params
                    val audienceId = ApiHandlerUtils.searchStringInJson(params,"audience_id")
                    if(audienceId == null){
                        throw IllegalArgumentException("audienceId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.audiencesGet(audienceId,adAccountId,context)
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
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val orderParam = ApiHandlerUtils.searchJsonObjectInJson(params,"order")
                    val order = if(orderParam ==null) null else Gson().fromJson(orderParam.encode(), PinterestLibPaginationOrder::class.java)
                    val ownershipTypeParam = ApiHandlerUtils.searchJsonObjectInJson(params,"ownership_type")
                    val ownershipType = if(ownershipTypeParam ==null) null else Gson().fromJson(ownershipTypeParam.encode(), AudienceOwnershipType::class.java)
                    val excludeNca = ApiHandlerUtils.searchStringInJson(params,"exclude_nca")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.audiencesList(adAccountId,bookmark,pageSize,order,ownershipType,excludeNca,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "audiencesUpdate" -> {
                    val params = context.params
                    val audienceId = ApiHandlerUtils.searchStringInJson(params,"audience_id")
                    if(audienceId == null){
                        throw IllegalArgumentException("audienceId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val adAccountsAudienceUpdateParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (adAccountsAudienceUpdateParam == null) {
                        throw IllegalArgumentException("adAccountsAudienceUpdate is required")
                    }
                    val adAccountsAudienceUpdate = Gson().fromJson(adAccountsAudienceUpdateParam.encode(), AdAccountsAudienceUpdate::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.audiencesUpdate(audienceId,adAccountId,adAccountsAudienceUpdate,context)
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
