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
import org.openapitools.server.api.model.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.server.api.model.AudienceAccountType
import org.openapitools.server.api.model.AudiencesList200Response
import org.openapitools.server.api.model.BusinessSharedAudience
import org.openapitools.server.api.model.BusinessSharedAudienceResponse
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.SharedAudience
import org.openapitools.server.api.model.SharedAudienceResponse

class AudienceSharingApiVertxProxyHandler(private val vertx: Vertx, private val service: AudienceSharingApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "adAccountsAudiencesSharedAccountsList" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val audienceId = ApiHandlerUtils.searchStringInJson(params,"audience_id")
                    if(audienceId == null){
                        throw IllegalArgumentException("audienceId is required")
                    }
                    val accountTypeParam = ApiHandlerUtils.searchJsonObjectInJson(params,"account_type")
                    if (accountTypeParam == null) {
                        throw IllegalArgumentException("accountType is required")
                    }
                    val accountType = Gson().fromJson(accountTypeParam.encode(), AudienceAccountType::class.java)
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adAccountsAudiencesSharedAccountsList(adAccountId,audienceId,accountType,pageSize,bookmark,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "businessAccountAudiencesSharedAccountsList" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val audienceId = ApiHandlerUtils.searchStringInJson(params,"audience_id")
                    if(audienceId == null){
                        throw IllegalArgumentException("audienceId is required")
                    }
                    val accountTypeParam = ApiHandlerUtils.searchJsonObjectInJson(params,"account_type")
                    if (accountTypeParam == null) {
                        throw IllegalArgumentException("accountType is required")
                    }
                    val accountType = Gson().fromJson(accountTypeParam.encode(), AudienceAccountType::class.java)
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.businessAccountAudiencesSharedAccountsList(businessId,audienceId,accountType,pageSize,bookmark,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "sharedAudiencesForBusinessList" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val order = ApiHandlerUtils.searchStringInJson(params,"order")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.sharedAudiencesForBusinessList(businessId,bookmark,order,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateAdAccountToAdAccountSharedAudience" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val sharedAudienceParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (sharedAudienceParam == null) {
                        throw IllegalArgumentException("sharedAudience is required")
                    }
                    val sharedAudience = Gson().fromJson(sharedAudienceParam.encode(), SharedAudience::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateAdAccountToAdAccountSharedAudience(adAccountId,sharedAudience,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateAdAccountToBusinessSharedAudience" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val businessSharedAudienceParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (businessSharedAudienceParam == null) {
                        throw IllegalArgumentException("businessSharedAudience is required")
                    }
                    val businessSharedAudience = Gson().fromJson(businessSharedAudienceParam.encode(), BusinessSharedAudience::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateAdAccountToBusinessSharedAudience(adAccountId,businessSharedAudience,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateBusinessToAdAccountSharedAudience" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val sharedAudienceParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (sharedAudienceParam == null) {
                        throw IllegalArgumentException("sharedAudience is required")
                    }
                    val sharedAudience = Gson().fromJson(sharedAudienceParam.encode(), SharedAudience::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateBusinessToAdAccountSharedAudience(businessId,sharedAudience,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateBusinessToBusinessSharedAudience" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val businessSharedAudienceParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (businessSharedAudienceParam == null) {
                        throw IllegalArgumentException("businessSharedAudience is required")
                    }
                    val businessSharedAudience = Gson().fromJson(businessSharedAudienceParam.encode(), BusinessSharedAudience::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateBusinessToBusinessSharedAudience(businessId,businessSharedAudience,context)
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
