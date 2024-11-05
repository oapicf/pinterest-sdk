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
import org.openapitools.server.api.model.BusinessAssetMembersGet200Response
import org.openapitools.server.api.model.BusinessAssetPartnersGet200Response
import org.openapitools.server.api.model.BusinessAssetsGet200Response
import org.openapitools.server.api.model.BusinessMemberAssetsGet200Response
import org.openapitools.server.api.model.BusinessMembersAssetAccessDeleteRequest
import org.openapitools.server.api.model.BusinessPartnerAssetAccessGet200Response
import org.openapitools.server.api.model.CreateAssetGroupBody
import org.openapitools.server.api.model.CreateAssetGroupResponse
import org.openapitools.server.api.model.DeleteAssetGroupBody
import org.openapitools.server.api.model.DeleteAssetGroupResponse
import org.openapitools.server.api.model.DeleteMemberAccessResultsResponseArray
import org.openapitools.server.api.model.DeletePartnerAssetAccessBody
import org.openapitools.server.api.model.DeletePartnerAssetsResultsResponseArray
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.PartnerType
import org.openapitools.server.api.model.PermissionsWithOwner
import org.openapitools.server.api.model.UpdateAssetGroupBody
import org.openapitools.server.api.model.UpdateAssetGroupResponse
import org.openapitools.server.api.model.UpdateMemberAssetAccessBody
import org.openapitools.server.api.model.UpdateMemberAssetsResultsResponseArray
import org.openapitools.server.api.model.UpdatePartnerAssetAccessBody
import org.openapitools.server.api.model.UpdatePartnerAssetsResultsResponseArray

class BusinessAccessAssetsApiVertxProxyHandler(private val vertx: Vertx, private val service: BusinessAccessAssetsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "assetGroupCreate" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val createAssetGroupBodyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createAssetGroupBodyParam == null) {
                        throw IllegalArgumentException("createAssetGroupBody is required")
                    }
                    val createAssetGroupBody = Gson().fromJson(createAssetGroupBodyParam.encode(), CreateAssetGroupBody::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.assetGroupCreate(businessId,createAssetGroupBody,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "assetGroupDelete" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val deleteAssetGroupBodyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (deleteAssetGroupBodyParam == null) {
                        throw IllegalArgumentException("deleteAssetGroupBody is required")
                    }
                    val deleteAssetGroupBody = Gson().fromJson(deleteAssetGroupBodyParam.encode(), DeleteAssetGroupBody::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.assetGroupDelete(businessId,deleteAssetGroupBody,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "assetGroupUpdate" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val updateAssetGroupBodyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (updateAssetGroupBodyParam == null) {
                        throw IllegalArgumentException("updateAssetGroupBody is required")
                    }
                    val updateAssetGroupBody = Gson().fromJson(updateAssetGroupBodyParam.encode(), UpdateAssetGroupBody::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.assetGroupUpdate(businessId,updateAssetGroupBody,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "businessAssetMembersGet" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val assetId = ApiHandlerUtils.searchStringInJson(params,"asset_id")
                    if(assetId == null){
                        throw IllegalArgumentException("assetId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val startIndex = ApiHandlerUtils.searchIntegerInJson(params,"start_index")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.businessAssetMembersGet(businessId,assetId,bookmark,pageSize,startIndex,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "businessAssetPartnersGet" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val assetId = ApiHandlerUtils.searchStringInJson(params,"asset_id")
                    if(assetId == null){
                        throw IllegalArgumentException("assetId is required")
                    }
                    val startIndex = ApiHandlerUtils.searchIntegerInJson(params,"start_index")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.businessAssetPartnersGet(businessId,assetId,startIndex,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "businessAssetsGet" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val permissionsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"permissions")
                    val permissions:kotlin.Array<PermissionsWithOwner>? = if(permissionsParam == null) null
                            else Gson().fromJson(permissionsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<PermissionsWithOwner>>(){}.type)
                    val childAssetId = ApiHandlerUtils.searchStringInJson(params,"child_asset_id")
                    val assetGroupId = ApiHandlerUtils.searchStringInJson(params,"asset_group_id")
                    val assetType = ApiHandlerUtils.searchStringInJson(params,"asset_type")
                    val startIndex = ApiHandlerUtils.searchIntegerInJson(params,"start_index")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.businessAssetsGet(businessId,permissions,childAssetId,assetGroupId,assetType,startIndex,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "businessMemberAssetsGet" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val memberId = ApiHandlerUtils.searchStringInJson(params,"member_id")
                    if(memberId == null){
                        throw IllegalArgumentException("memberId is required")
                    }
                    val assetType = ApiHandlerUtils.searchStringInJson(params,"asset_type")
                    val startIndex = ApiHandlerUtils.searchIntegerInJson(params,"start_index")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.businessMemberAssetsGet(businessId,memberId,assetType,startIndex,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "businessMembersAssetAccessDelete" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val businessMembersAssetAccessDeleteRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (businessMembersAssetAccessDeleteRequestParam == null) {
                        throw IllegalArgumentException("businessMembersAssetAccessDeleteRequest is required")
                    }
                    val businessMembersAssetAccessDeleteRequest = Gson().fromJson(businessMembersAssetAccessDeleteRequestParam.encode(), BusinessMembersAssetAccessDeleteRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.businessMembersAssetAccessDelete(businessId,businessMembersAssetAccessDeleteRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "businessMembersAssetAccessUpdate" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val updateMemberAssetAccessBodyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (updateMemberAssetAccessBodyParam == null) {
                        throw IllegalArgumentException("updateMemberAssetAccessBody is required")
                    }
                    val updateMemberAssetAccessBody = Gson().fromJson(updateMemberAssetAccessBodyParam.encode(), UpdateMemberAssetAccessBody::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.businessMembersAssetAccessUpdate(businessId,updateMemberAssetAccessBody,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "businessPartnerAssetAccessGet" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val partnerId = ApiHandlerUtils.searchStringInJson(params,"partner_id")
                    if(partnerId == null){
                        throw IllegalArgumentException("partnerId is required")
                    }
                    val partnerTypeParam = ApiHandlerUtils.searchJsonObjectInJson(params,"partner_type")
                    val partnerType = if(partnerTypeParam ==null) null else Gson().fromJson(partnerTypeParam.encode(), PartnerType::class.java)
                    val assetType = ApiHandlerUtils.searchStringInJson(params,"asset_type")
                    val startIndex = ApiHandlerUtils.searchIntegerInJson(params,"start_index")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.businessPartnerAssetAccessGet(businessId,partnerId,partnerType,assetType,startIndex,pageSize,bookmark,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deletePartnerAssetAccessHandlerImpl" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val deletePartnerAssetAccessBodyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (deletePartnerAssetAccessBodyParam == null) {
                        throw IllegalArgumentException("deletePartnerAssetAccessBody is required")
                    }
                    val deletePartnerAssetAccessBody = Gson().fromJson(deletePartnerAssetAccessBodyParam.encode(), DeletePartnerAssetAccessBody::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deletePartnerAssetAccessHandlerImpl(businessId,deletePartnerAssetAccessBody,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updatePartnerAssetAccessHandlerImpl" -> {
                    val params = context.params
                    val businessId = ApiHandlerUtils.searchStringInJson(params,"business_id")
                    if(businessId == null){
                        throw IllegalArgumentException("businessId is required")
                    }
                    val updatePartnerAssetAccessBodyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (updatePartnerAssetAccessBodyParam == null) {
                        throw IllegalArgumentException("updatePartnerAssetAccessBody is required")
                    }
                    val updatePartnerAssetAccessBody = Gson().fromJson(updatePartnerAssetAccessBodyParam.encode(), UpdatePartnerAssetAccessBody::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updatePartnerAssetAccessHandlerImpl(businessId,updatePartnerAssetAccessBody,context)
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
