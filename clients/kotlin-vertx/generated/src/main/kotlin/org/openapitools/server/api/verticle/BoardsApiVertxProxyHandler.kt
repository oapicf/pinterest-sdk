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
import org.openapitools.server.api.model.BoardSection
import org.openapitools.server.api.model.BoardUpdate
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.Paginated

class BoardsApiVertxProxyHandler(private val vertx: Vertx, private val service: BoardsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
    private val timerID: Long
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
                    val boardSectionParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (boardSectionParam == null) {
                        throw IllegalArgumentException("boardSection is required")
                    }
                    val boardSection = Gson().fromJson(boardSectionParam.encode(), BoardSection::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardSectionsCreate(boardId,boardSection,context)
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
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardSectionsDelete(boardId,sectionId,context)
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
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardSectionsList(boardId,bookmark,pageSize,context)
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
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardSectionsListPins(boardId,sectionId,bookmark,pageSize,context)
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
                    val boardSectionParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (boardSectionParam == null) {
                        throw IllegalArgumentException("boardSection is required")
                    }
                    val boardSection = Gson().fromJson(boardSectionParam.encode(), BoardSection::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardSectionsUpdate(boardId,sectionId,boardSection,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "boardsCreate" -> {
                    val params = context.params
                    val boardParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (boardParam == null) {
                        throw IllegalArgumentException("board is required")
                    }
                    val board = Gson().fromJson(boardParam.encode(), Board::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardsCreate(board,context)
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
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardsDelete(boardId,context)
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
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardsGet(boardId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "boardsList" -> {
                    val params = context.params
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val privacy = ApiHandlerUtils.searchStringInJson(params,"privacy")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardsList(bookmark,pageSize,privacy,context)
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
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardsListPins(boardId,bookmark,pageSize,context)
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
                    val boardUpdateParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (boardUpdateParam == null) {
                        throw IllegalArgumentException("boardUpdate is required")
                    }
                    val boardUpdate = Gson().fromJson(boardUpdateParam.encode(), BoardUpdate::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.boardsUpdate(boardId,boardUpdate,context)
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
