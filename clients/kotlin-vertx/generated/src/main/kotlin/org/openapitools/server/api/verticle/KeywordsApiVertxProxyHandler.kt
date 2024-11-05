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
import org.openapitools.server.api.model.KeywordUpdateBody
import org.openapitools.server.api.model.KeywordsGet200Response
import org.openapitools.server.api.model.KeywordsMetricsArrayResponse
import org.openapitools.server.api.model.KeywordsRequest
import org.openapitools.server.api.model.KeywordsResponse
import org.openapitools.server.api.model.MatchType
import org.openapitools.server.api.model.TrendType
import org.openapitools.server.api.model.TrendingKeywordsResponse
import org.openapitools.server.api.model.TrendsSupportedRegion

class KeywordsApiVertxProxyHandler(private val vertx: Vertx, private val service: KeywordsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "countryKeywordsMetricsGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val countryCode = ApiHandlerUtils.searchStringInJson(params,"country_code")
                    if(countryCode == null){
                        throw IllegalArgumentException("countryCode is required")
                    }
                    val keywordsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"keywords")
                    if(keywordsParam == null){
                         throw IllegalArgumentException("keywords is required")
                    }
                    val keywords:kotlin.Array<kotlin.String> = Gson().fromJson(keywordsParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.countryKeywordsMetricsGet(adAccountId,countryCode,keywords,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "keywordsCreate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val keywordsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (keywordsRequestParam == null) {
                        throw IllegalArgumentException("keywordsRequest is required")
                    }
                    val keywordsRequest = Gson().fromJson(keywordsRequestParam.encode(), KeywordsRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.keywordsCreate(adAccountId,keywordsRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "keywordsGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val campaignId = ApiHandlerUtils.searchStringInJson(params,"campaign_id")
                    val adGroupId = ApiHandlerUtils.searchStringInJson(params,"ad_group_id")
                    val matchTypesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"match_types")
                    val matchTypes:kotlin.Array<MatchType>? = if(matchTypesParam == null) null
                            else Gson().fromJson(matchTypesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<MatchType>>(){}.type)
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.keywordsGet(adAccountId,campaignId,adGroupId,matchTypes,pageSize,bookmark,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "keywordsUpdate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val keywordUpdateBodyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (keywordUpdateBodyParam == null) {
                        throw IllegalArgumentException("keywordUpdateBody is required")
                    }
                    val keywordUpdateBody = Gson().fromJson(keywordUpdateBodyParam.encode(), KeywordUpdateBody::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.keywordsUpdate(adAccountId,keywordUpdateBody,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "trendingKeywordsList" -> {
                    val params = context.params
                    val regionParam = ApiHandlerUtils.searchJsonObjectInJson(params,"region")
                    if (regionParam == null) {
                        throw IllegalArgumentException("region is required")
                    }
                    val region = Gson().fromJson(regionParam.encode(), TrendsSupportedRegion::class.java)
                    val trendTypeParam = ApiHandlerUtils.searchJsonObjectInJson(params,"trend_type")
                    if (trendTypeParam == null) {
                        throw IllegalArgumentException("trendType is required")
                    }
                    val trendType = Gson().fromJson(trendTypeParam.encode(), TrendType::class.java)
                    val interestsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"interests")
                    val interests:kotlin.Array<kotlin.String>? = if(interestsParam == null) null
                            else Gson().fromJson(interestsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val gendersParam = ApiHandlerUtils.searchJsonArrayInJson(params,"genders")
                    val genders:kotlin.Array<kotlin.String>? = if(gendersParam == null) null
                            else Gson().fromJson(gendersParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val agesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"ages")
                    val ages:kotlin.Array<kotlin.String>? = if(agesParam == null) null
                            else Gson().fromJson(agesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val includeKeywordsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"include_keywords")
                    val includeKeywords:kotlin.Array<kotlin.String>? = if(includeKeywordsParam == null) null
                            else Gson().fromJson(includeKeywordsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val normalizeAgainstGroup = ApiHandlerUtils.searchStringInJson(params,"normalize_against_group")?.toBoolean()
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.trendingKeywordsList(region,trendType,interests,genders,ages,includeKeywords,normalizeAgainstGroup,limit,context)
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
