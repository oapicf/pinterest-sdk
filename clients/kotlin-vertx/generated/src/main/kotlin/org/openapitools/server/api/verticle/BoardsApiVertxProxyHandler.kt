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
import org.openapitools.server.api.model.Board
import org.openapitools.server.api.model.BoardCreate
import org.openapitools.server.api.model.BoardPrivacyFilter
import org.openapitools.server.api.model.BoardSection
import org.openapitools.server.api.model.BoardSectionCreate
import org.openapitools.server.api.model.BoardSectionUpdateWithRequiredBody
import org.openapitools.server.api.model.BoardSectionsList200Response
import org.openapitools.server.api.model.BoardWithUpdatePrivacy
import org.openapitools.server.api.model.BoardWithUpdatePrivacyUpdate
import org.openapitools.server.api.model.BoardsList200Response
import org.openapitools.server.api.model.BoardsListPins200Response
import org.openapitools.server.api.model.CreativeType
import org.openapitools.server.api.model.PinterestLibError

class BoardsApiVertxProxyHandler(private val vertx: Vertx, private val service: BoardsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "boardSectionsCreate" -> {
                    val params = context.params
                    val boardId = ApiHandlerUtils.searchStringInJson(params,"board_id")
                    if(boardId == null){
                        throw IllegalArgumentException("boardId is required")
                    }
                    val boardSectionCreateParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (boardSectionCreateParam == null) {
                        throw IllegalArgumentException("boardSectionCreate is required")
                    }
                    val boardSectionCreate = Gson().fromJson(boardSectionCreateParam.encode(), BoardSectionCreate::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardSectionsCreate(boardId,boardSectionCreate,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "boardSectionsDelete" -> {
                    val params = context.params
                    val boardId = ApiHandlerUtils.searchStringInJson(params,"board_id")
                    if(boardId == null){
                        throw IllegalArgumentException("boardId is required")
                    }
                    val sectionId = ApiHandlerUtils.searchStringInJson(params,"section_id")
                    if(sectionId == null){
                        throw IllegalArgumentException("sectionId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardSectionsDelete(boardId,sectionId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "boardSectionsList" -> {
                    val params = context.params
                    val boardId = ApiHandlerUtils.searchStringInJson(params,"board_id")
                    if(boardId == null){
                        throw IllegalArgumentException("boardId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardSectionsList(boardId,adAccountId,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "boardSectionsListPins" -> {
                    val params = context.params
                    val boardId = ApiHandlerUtils.searchStringInJson(params,"board_id")
                    if(boardId == null){
                        throw IllegalArgumentException("boardId is required")
                    }
                    val sectionId = ApiHandlerUtils.searchStringInJson(params,"section_id")
                    if(sectionId == null){
                        throw IllegalArgumentException("sectionId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardSectionsListPins(boardId,sectionId,adAccountId,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "boardSectionsUpdate" -> {
                    val params = context.params
                    val boardId = ApiHandlerUtils.searchStringInJson(params,"board_id")
                    if(boardId == null){
                        throw IllegalArgumentException("boardId is required")
                    }
                    val sectionId = ApiHandlerUtils.searchStringInJson(params,"section_id")
                    if(sectionId == null){
                        throw IllegalArgumentException("sectionId is required")
                    }
                    val boardSectionUpdateWithRequiredBodyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (boardSectionUpdateWithRequiredBodyParam == null) {
                        throw IllegalArgumentException("boardSectionUpdateWithRequiredBody is required")
                    }
                    val boardSectionUpdateWithRequiredBody = Gson().fromJson(boardSectionUpdateWithRequiredBodyParam.encode(), BoardSectionUpdateWithRequiredBody::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardSectionsUpdate(boardId,sectionId,boardSectionUpdateWithRequiredBody,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "boardsCreate" -> {
                    val params = context.params
                    val boardCreateParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (boardCreateParam == null) {
                        throw IllegalArgumentException("boardCreate is required")
                    }
                    val boardCreate = Gson().fromJson(boardCreateParam.encode(), BoardCreate::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardsCreate(boardCreate,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "boardsDelete" -> {
                    val params = context.params
                    val boardId = ApiHandlerUtils.searchStringInJson(params,"board_id")
                    if(boardId == null){
                        throw IllegalArgumentException("boardId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardsDelete(boardId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "boardsGet" -> {
                    val params = context.params
                    val boardId = ApiHandlerUtils.searchStringInJson(params,"board_id")
                    if(boardId == null){
                        throw IllegalArgumentException("boardId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardsGet(boardId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "boardsList" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    val privacyParam = ApiHandlerUtils.searchJsonObjectInJson(params,"privacy")
                    val privacy = if(privacyParam ==null) null else Gson().fromJson(privacyParam.encode(), BoardPrivacyFilter::class.java)
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardsList(adAccountId,privacy,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "boardsListPins" -> {
                    val params = context.params
                    val boardId = ApiHandlerUtils.searchStringInJson(params,"board_id")
                    if(boardId == null){
                        throw IllegalArgumentException("boardId is required")
                    }
                    val creativeTypesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"creative_types")
                    val creativeTypes:kotlin.Array<CreativeType>? = if(creativeTypesParam == null) null
                            else Gson().fromJson(creativeTypesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<CreativeType>>(){}.type)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    val pinMetrics = ApiHandlerUtils.searchStringInJson(params,"pin_metrics")?.toBoolean()
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardsListPins(boardId,creativeTypes,adAccountId,pinMetrics,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "boardsUpdate" -> {
                    val params = context.params
                    val boardId = ApiHandlerUtils.searchStringInJson(params,"board_id")
                    if(boardId == null){
                        throw IllegalArgumentException("boardId is required")
                    }
                    val boardWithUpdatePrivacyUpdateParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (boardWithUpdatePrivacyUpdateParam == null) {
                        throw IllegalArgumentException("boardWithUpdatePrivacyUpdate is required")
                    }
                    val boardWithUpdatePrivacyUpdate = Gson().fromJson(boardWithUpdatePrivacyUpdateParam.encode(), BoardWithUpdatePrivacyUpdate::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardsUpdate(boardId,boardWithUpdatePrivacyUpdate,adAccountId,context)
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
