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
import org.openapitools.server.api.model.BrandAccount
import org.openapitools.server.api.model.BrandAccountCreate
import org.openapitools.server.api.model.BrandAccountUpdate
import org.openapitools.server.api.model.BusinessMembershipMember
import org.openapitools.server.api.model.DeleteBusinessMembership200Response
import org.openapitools.server.api.model.DeleteBusinessMembershipBody
import org.openapitools.server.api.model.DeleteBusinessPartners
import org.openapitools.server.api.model.DeleteBusinessPartnersDelete
import org.openapitools.server.api.model.GetBusinessEmployers200Response
import org.openapitools.server.api.model.MemberBusinessRole
import org.openapitools.server.api.model.PartnerType
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.SystemUserUpdateWithRequiredBody
import org.openapitools.server.api.model.UpdateBusinessMembershipsResponse

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
        
                "brandAccountsCreate" -> {
                    val params = context.params
                    val businessHierarchyId = ApiHandlerUtils.searchStringInJson(params,"business_hierarchy_id")
                    if(businessHierarchyId == null){
                        throw IllegalArgumentException("businessHierarchyId is required")
                    }
                    val brandAccountCreateParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (brandAccountCreateParam == null) {
                        throw IllegalArgumentException("brandAccountCreate is required")
                    }
                    val brandAccountCreate = Gson().fromJson(brandAccountCreateParam.encode(), BrandAccountCreate::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.brandAccountsCreate(businessHierarchyId,brandAccountCreate,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "brandAccountsUpdate" -> {
                    val params = context.params
                    val brandAccountId = ApiHandlerUtils.searchStringInJson(params,"brand_account_id")
                    if(brandAccountId == null){
                        throw IllegalArgumentException("brandAccountId is required")
                    }
                    val businessHierarchyId = ApiHandlerUtils.searchStringInJson(params,"business_hierarchy_id")
                    if(businessHierarchyId == null){
                        throw IllegalArgumentException("businessHierarchyId is required")
                    }
                    val brandAccountUpdateParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (brandAccountUpdateParam == null) {
                        throw IllegalArgumentException("brandAccountUpdate is required")
                    }
                    val brandAccountUpdate = Gson().fromJson(brandAccountUpdateParam.encode(), BrandAccountUpdate::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.brandAccountsUpdate(brandAccountId,businessHierarchyId,brandAccountUpdate,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteBusinessMembership" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val deleteBusinessMembershipBodyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (deleteBusinessMembershipBodyParam == null) {
                        throw IllegalArgumentException("deleteBusinessMembershipBody is required")
                    }
                    val deleteBusinessMembershipBody = Gson().fromJson(deleteBusinessMembershipBodyParam.encode(), DeleteBusinessMembershipBody::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteBusinessMembership(businessId,deleteBusinessMembershipBody,context)
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
                    val deleteBusinessPartnersDeleteParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (deleteBusinessPartnersDeleteParam == null) {
                        throw IllegalArgumentException("deleteBusinessPartnersDelete is required")
                    }
                    val deleteBusinessPartnersDelete = Gson().fromJson(deleteBusinessPartnersDeleteParam.encode(), DeleteBusinessPartnersDelete::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteBusinessPartners(businessId,deleteBusinessPartnersDelete,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getBusinessEmployers" -> {
                    val params = context.params
                    val assetsSummary = ApiHandlerUtils.searchStringInJson(params,"assets_summary")?.toBoolean()
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getBusinessEmployers(assetsSummary,bookmark,pageSize,context)
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
                    val fetchSystemUsers = ApiHandlerUtils.searchStringInJson(params,"fetch_system_users")?.toBoolean()
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
                        val result = service.getBusinessMembers(businessId,fetchSystemUsers,assetsSummary,businessRoles,memberIds,startIndex,bookmark,pageSize,context)
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
                    val sortAscending = ApiHandlerUtils.searchStringInJson(params,"sort_ascending")?.toBoolean()
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getBusinessPartners(businessId,assetsSummary,partnerType,partnerIds,startIndex,sortAscending,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "systemUserUpdate" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val systemUserId = ApiHandlerUtils.searchStringInJson(params,"system_user_id")
                    if(systemUserId == null){
                        throw IllegalArgumentException("systemUserId is required")
                    }
                    val systemUserUpdateWithRequiredBodyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (systemUserUpdateWithRequiredBodyParam == null) {
                        throw IllegalArgumentException("systemUserUpdateWithRequiredBody is required")
                    }
                    val systemUserUpdateWithRequiredBody = Gson().fromJson(systemUserUpdateWithRequiredBodyParam.encode(), SystemUserUpdateWithRequiredBody::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.systemUserUpdate(businessId,systemUserId,systemUserUpdateWithRequiredBody,context)
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
                    val businessMembershipMemberParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(businessMembershipMemberParam == null){
                         throw IllegalArgumentException("businessMembershipMember is required")
                    }
                    val businessMembershipMember:kotlin.Array<BusinessMembershipMember> = Gson().fromJson(businessMembershipMemberParam.encode()
                            , object : TypeToken<kotlin.collections.List<BusinessMembershipMember>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateBusinessMemberships(businessId,businessMembershipMember,context)
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
