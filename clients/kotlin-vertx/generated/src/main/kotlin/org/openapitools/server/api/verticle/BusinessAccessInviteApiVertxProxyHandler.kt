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
import org.openapitools.server.api.model.AuthRespondInvitesBody
import org.openapitools.server.api.model.CancelInvitesBody
import org.openapitools.server.api.model.CreateAssetAccessRequestBody
import org.openapitools.server.api.model.CreateAssetAccessRequestResponse
import org.openapitools.server.api.model.CreateAssetInvitesRequest
import org.openapitools.server.api.model.CreateInvitesResultsResponseArray
import org.openapitools.server.api.model.CreateMembershipOrPartnershipInvitesBody
import org.openapitools.server.api.model.DeleteInvitesResultsResponseArray
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.GetInvites200Response
import org.openapitools.server.api.model.InviteType
import org.openapitools.server.api.model.RespondToInvitesResponseArray
import org.openapitools.server.api.model.UpdateInvitesResultsResponseArray

class BusinessAccessInviteApiVertxProxyHandler(private val vertx: Vertx, private val service: BusinessAccessInviteApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "assetAccessRequestsCreate" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val createAssetAccessRequestBodyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createAssetAccessRequestBodyParam == null) {
                        throw IllegalArgumentException("createAssetAccessRequestBody is required")
                    }
                    val createAssetAccessRequestBody = Gson().fromJson(createAssetAccessRequestBodyParam.encode(), CreateAssetAccessRequestBody::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.assetAccessRequestsCreate(businessId,createAssetAccessRequestBody,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "cancelInvitesOrRequests" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val cancelInvitesBodyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (cancelInvitesBodyParam == null) {
                        throw IllegalArgumentException("cancelInvitesBody is required")
                    }
                    val cancelInvitesBody = Gson().fromJson(cancelInvitesBodyParam.encode(), CancelInvitesBody::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.cancelInvitesOrRequests(businessId,cancelInvitesBody,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createAssetInvites" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val createAssetInvitesRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createAssetInvitesRequestParam == null) {
                        throw IllegalArgumentException("createAssetInvitesRequest is required")
                    }
                    val createAssetInvitesRequest = Gson().fromJson(createAssetInvitesRequestParam.encode(), CreateAssetInvitesRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createAssetInvites(businessId,createAssetInvitesRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createMembershipOrPartnershipInvites" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val createMembershipOrPartnershipInvitesBodyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createMembershipOrPartnershipInvitesBodyParam == null) {
                        throw IllegalArgumentException("createMembershipOrPartnershipInvitesBody is required")
                    }
                    val createMembershipOrPartnershipInvitesBody = Gson().fromJson(createMembershipOrPartnershipInvitesBodyParam.encode(), CreateMembershipOrPartnershipInvitesBody::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createMembershipOrPartnershipInvites(businessId,createMembershipOrPartnershipInvitesBody,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getInvites" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val isMember = ApiHandlerUtils.searchStringInJson(params,"is_member")?.toBoolean()
                    val inviteStatusParam = ApiHandlerUtils.searchJsonArrayInJson(params,"invite_status")
                    val inviteStatus:kotlin.Array<kotlin.String>? = if(inviteStatusParam == null) null
                            else Gson().fromJson(inviteStatusParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val inviteTypeParam = ApiHandlerUtils.searchJsonObjectInJson(params,"invite_type")
                    val inviteType = if(inviteTypeParam ==null) null else Gson().fromJson(inviteTypeParam.encode(), InviteType::class.java)
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getInvites(businessId,isMember,inviteStatus,inviteType,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "respondBusinessAccessInvites" -> {
                    val params = context.params
                    val authRespondInvitesBodyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (authRespondInvitesBodyParam == null) {
                        throw IllegalArgumentException("authRespondInvitesBody is required")
                    }
                    val authRespondInvitesBody = Gson().fromJson(authRespondInvitesBodyParam.encode(), AuthRespondInvitesBody::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.respondBusinessAccessInvites(authRespondInvitesBody,context)
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
