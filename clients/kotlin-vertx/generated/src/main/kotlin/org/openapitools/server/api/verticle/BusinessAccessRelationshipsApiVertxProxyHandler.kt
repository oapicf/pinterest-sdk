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
import org.openapitools.server.api.model.DeletePartnersRequest
import org.openapitools.server.api.model.DeletePartnersResponse
import org.openapitools.server.api.model.DeletedMembersResponse
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.GetBusinessEmployers200Response
import org.openapitools.server.api.model.GetBusinessMembers200Response
import org.openapitools.server.api.model.GetBusinessPartners200Response
import org.openapitools.server.api.model.MemberBusinessRole
import org.openapitools.server.api.model.MembersToDeleteBody
import org.openapitools.server.api.model.PartnerType
import org.openapitools.server.api.model.UpdateMemberBusinessRoleBody
import org.openapitools.server.api.model.UpdateMemberResultsResponseArray

class BusinessAccessRelationshipsApiVertxProxyHandler(private val vertx: Vertx, private val service: BusinessAccessRelationshipsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "deleteBusinessMembership" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val membersToDeleteBodyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (membersToDeleteBodyParam == null) {
                        throw IllegalArgumentException("membersToDeleteBody is required")
                    }
                    val membersToDeleteBody = Gson().fromJson(membersToDeleteBodyParam.encode(), MembersToDeleteBody::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteBusinessMembership(businessId,membersToDeleteBody,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteBusinessPartners" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val deletePartnersRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (deletePartnersRequestParam == null) {
                        throw IllegalArgumentException("deletePartnersRequest is required")
                    }
                    val deletePartnersRequest = Gson().fromJson(deletePartnersRequestParam.encode(), DeletePartnersRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteBusinessPartners(businessId,deletePartnersRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getBusinessEmployers" -> {
                    val params = context.params
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getBusinessEmployers(pageSize,bookmark,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getBusinessMembers" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val assetsSummary = ApiHandlerUtils.searchStringInJson(params,"assets_summary")?.toBoolean()
                    val businessRolesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"business_roles")
                    val businessRoles:kotlin.Array<MemberBusinessRole>? = if(businessRolesParam == null) null
                            else Gson().fromJson(businessRolesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<MemberBusinessRole>>(){}.type)
                    val memberIds = ApiHandlerUtils.searchStringInJson(params,"member_ids")
                    val startIndex = ApiHandlerUtils.searchIntegerInJson(params,"start_index")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getBusinessMembers(businessId,assetsSummary,businessRoles,memberIds,startIndex,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getBusinessPartners" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val assetsSummary = ApiHandlerUtils.searchStringInJson(params,"assets_summary")?.toBoolean()
                    val partnerTypeParam = ApiHandlerUtils.searchJsonObjectInJson(params,"partner_type")
                    val partnerType = if(partnerTypeParam ==null) null else Gson().fromJson(partnerTypeParam.encode(), PartnerType::class.java)
                    val partnerIds = ApiHandlerUtils.searchStringInJson(params,"partner_ids")
                    val startIndex = ApiHandlerUtils.searchIntegerInJson(params,"start_index")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getBusinessPartners(businessId,assetsSummary,partnerType,partnerIds,startIndex,pageSize,bookmark,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateBusinessMemberships" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val updateMemberBusinessRoleBodyParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(updateMemberBusinessRoleBodyParam == null){
                         throw IllegalArgumentException("updateMemberBusinessRoleBody is required")
                    }
                    val updateMemberBusinessRoleBody:kotlin.Array<UpdateMemberBusinessRoleBody> = Gson().fromJson(updateMemberBusinessRoleBodyParam.encode()
                            , object : TypeToken<kotlin.collections.List<UpdateMemberBusinessRoleBody>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateBusinessMemberships(businessId,updateMemberBusinessRoleBody,context)
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
