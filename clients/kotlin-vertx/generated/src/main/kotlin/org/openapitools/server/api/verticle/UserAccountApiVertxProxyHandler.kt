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
import org.openapitools.server.api.model.Account
import org.openapitools.server.api.model.AnalyticsMetricsResponse
import org.openapitools.server.api.model.BoardsUserFollowsList200Response
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.FollowUserRequest
import org.openapitools.server.api.model.FollowersList200Response
import org.openapitools.server.api.model.LinkedBusiness
import org.openapitools.server.api.model.TopPinsAnalyticsResponse
import org.openapitools.server.api.model.TopVideoPinsAnalyticsResponse
import org.openapitools.server.api.model.UserAccountFollowedInterests200Response
import org.openapitools.server.api.model.UserFollowingFeedType
import org.openapitools.server.api.model.UserFollowingGet200Response
import org.openapitools.server.api.model.UserSummary
import org.openapitools.server.api.model.UserWebsiteSummary
import org.openapitools.server.api.model.UserWebsiteVerificationCode
import org.openapitools.server.api.model.UserWebsiteVerifyRequest
import org.openapitools.server.api.model.UserWebsitesGet200Response

class UserAccountApiVertxProxyHandler(private val vertx: Vertx, private val service: UserAccountApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "boardsUserFollowsList" -> {
                    val params = context.params
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val explicitFollowing = ApiHandlerUtils.searchStringInJson(params,"explicit_following")?.toBoolean()
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardsUserFollowsList(bookmark,pageSize,explicitFollowing,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "followUserUpdate" -> {
                    val params = context.params
                    val username = ApiHandlerUtils.searchStringInJson(params,"username")
                    if(username == null){
                        throw IllegalArgumentException("username is required")
                    }
                    val followUserRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (followUserRequestParam == null) {
                        throw IllegalArgumentException("followUserRequest is required")
                    }
                    val followUserRequest = Gson().fromJson(followUserRequestParam.encode(), FollowUserRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.followUserUpdate(username,followUserRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "followersList" -> {
                    val params = context.params
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.followersList(bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "linkedBusinessAccountsGet" -> {
                }
        
                "unverifyWebsiteDelete" -> {
                    val params = context.params
                    val website = ApiHandlerUtils.searchStringInJson(params,"website")
                    if(website == null){
                        throw IllegalArgumentException("website is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.unverifyWebsiteDelete(website,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "userAccountAnalytics" -> {
                    val params = context.params
                    val startDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"start_date"))
                    if(startDate == null){
                        throw IllegalArgumentException("startDate is required")
                    }
                    val endDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"end_date"))
                    if(endDate == null){
                        throw IllegalArgumentException("endDate is required")
                    }
                    val fromClaimedContent = ApiHandlerUtils.searchStringInJson(params,"from_claimed_content")
                    val pinFormat = ApiHandlerUtils.searchStringInJson(params,"pin_format")
                    val appTypes = ApiHandlerUtils.searchStringInJson(params,"app_types")
                    val contentType = ApiHandlerUtils.searchStringInJson(params,"content_type")
                    val source = ApiHandlerUtils.searchStringInJson(params,"source")
                    val metricTypesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"metric_types")
                    val metricTypes:kotlin.Array<kotlin.String>? = if(metricTypesParam == null) null
                            else Gson().fromJson(metricTypesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val splitField = ApiHandlerUtils.searchStringInJson(params,"split_field")
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.userAccountAnalytics(startDate,endDate,fromClaimedContent,pinFormat,appTypes,contentType,source,metricTypes,splitField,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "userAccountAnalyticsTopPins" -> {
                    val params = context.params
                    val startDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"start_date"))
                    if(startDate == null){
                        throw IllegalArgumentException("startDate is required")
                    }
                    val endDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"end_date"))
                    if(endDate == null){
                        throw IllegalArgumentException("endDate is required")
                    }
                    val sortBy = ApiHandlerUtils.searchStringInJson(params,"sort_by")
                    if(sortBy == null){
                        throw IllegalArgumentException("sortBy is required")
                    }
                    val fromClaimedContent = ApiHandlerUtils.searchStringInJson(params,"from_claimed_content")
                    val pinFormat = ApiHandlerUtils.searchStringInJson(params,"pin_format")
                    val appTypes = ApiHandlerUtils.searchStringInJson(params,"app_types")
                    val contentType = ApiHandlerUtils.searchStringInJson(params,"content_type")
                    val source = ApiHandlerUtils.searchStringInJson(params,"source")
                    val metricTypesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"metric_types")
                    val metricTypes:kotlin.Array<kotlin.String>? = if(metricTypesParam == null) null
                            else Gson().fromJson(metricTypesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val numOfPins = ApiHandlerUtils.searchIntegerInJson(params,"num_of_pins")
                    val createdInLastNDays = ApiHandlerUtils.searchIntegerInJson(params,"created_in_last_n_days")
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.userAccountAnalyticsTopPins(startDate,endDate,sortBy,fromClaimedContent,pinFormat,appTypes,contentType,source,metricTypes,numOfPins,createdInLastNDays,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "userAccountAnalyticsTopVideoPins" -> {
                    val params = context.params
                    val startDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"start_date"))
                    if(startDate == null){
                        throw IllegalArgumentException("startDate is required")
                    }
                    val endDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"end_date"))
                    if(endDate == null){
                        throw IllegalArgumentException("endDate is required")
                    }
                    val sortBy = ApiHandlerUtils.searchStringInJson(params,"sort_by")
                    if(sortBy == null){
                        throw IllegalArgumentException("sortBy is required")
                    }
                    val fromClaimedContent = ApiHandlerUtils.searchStringInJson(params,"from_claimed_content")
                    val pinFormat = ApiHandlerUtils.searchStringInJson(params,"pin_format")
                    val appTypes = ApiHandlerUtils.searchStringInJson(params,"app_types")
                    val contentType = ApiHandlerUtils.searchStringInJson(params,"content_type")
                    val source = ApiHandlerUtils.searchStringInJson(params,"source")
                    val metricTypesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"metric_types")
                    val metricTypes:kotlin.Array<kotlin.String>? = if(metricTypesParam == null) null
                            else Gson().fromJson(metricTypesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val numOfPins = ApiHandlerUtils.searchIntegerInJson(params,"num_of_pins")
                    val createdInLastNDays = ApiHandlerUtils.searchIntegerInJson(params,"created_in_last_n_days")
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.userAccountAnalyticsTopVideoPins(startDate,endDate,sortBy,fromClaimedContent,pinFormat,appTypes,contentType,source,metricTypes,numOfPins,createdInLastNDays,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "userAccountFollowedInterests" -> {
                    val params = context.params
                    val username = ApiHandlerUtils.searchStringInJson(params,"username")
                    if(username == null){
                        throw IllegalArgumentException("username is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.userAccountFollowedInterests(username,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "userAccountGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.userAccountGet(adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "userFollowingGet" -> {
                    val params = context.params
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val feedType = ApiHandlerUtils.searchStringInJson(params,"feed_type")
                    val explicitFollowing = ApiHandlerUtils.searchStringInJson(params,"explicit_following")?.toBoolean()
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.userFollowingGet(bookmark,pageSize,feedType,explicitFollowing,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "userWebsitesGet" -> {
                    val params = context.params
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.userWebsitesGet(bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "verifyWebsiteUpdate" -> {
                    val params = context.params
                    val userWebsiteVerifyRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (userWebsiteVerifyRequestParam == null) {
                        throw IllegalArgumentException("userWebsiteVerifyRequest is required")
                    }
                    val userWebsiteVerifyRequest = Gson().fromJson(userWebsiteVerifyRequestParam.encode(), UserWebsiteVerifyRequest::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.verifyWebsiteUpdate(userWebsiteVerifyRequest,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "websiteVerificationGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.websiteVerificationGet(adAccountId,context)
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
