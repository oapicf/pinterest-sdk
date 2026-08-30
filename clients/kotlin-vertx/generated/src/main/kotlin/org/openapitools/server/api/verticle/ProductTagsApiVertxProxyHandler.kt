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
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.ProductTagsBulkAddRequest
import org.openapitools.server.api.model.ProductTagsBulkDeleteRequest
import org.openapitools.server.api.model.ProductTagsError
import org.openapitools.server.api.model.ProductTagsResponse

class ProductTagsApiVertxProxyHandler(private val vertx: Vertx, private val service: ProductTagsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "productTagsBulkAdd" -> {
                    val params = context.params
                    val pinId = ApiHandlerUtils.searchStringInJson(params,"pin_id")
                    if(pinId == null){
                        throw IllegalArgumentException("pinId is required")
                    }
                    val productTagsBulkAddRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (productTagsBulkAddRequestParam == null) {
                        throw IllegalArgumentException("productTagsBulkAddRequest is required")
                    }
                    val productTagsBulkAddRequest = Gson().fromJson(productTagsBulkAddRequestParam.encode(), ProductTagsBulkAddRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.productTagsBulkAdd(pinId,productTagsBulkAddRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "productTagsBulkDelete" -> {
                    val params = context.params
                    val pinId = ApiHandlerUtils.searchStringInJson(params,"pin_id")
                    if(pinId == null){
                        throw IllegalArgumentException("pinId is required")
                    }
                    val productTagsBulkDeleteRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (productTagsBulkDeleteRequestParam == null) {
                        throw IllegalArgumentException("productTagsBulkDeleteRequest is required")
                    }
                    val productTagsBulkDeleteRequest = Gson().fromJson(productTagsBulkDeleteRequestParam.encode(), ProductTagsBulkDeleteRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.productTagsBulkDelete(pinId,productTagsBulkDeleteRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "productTagsList" -> {
                    val params = context.params
                    val pinId = ApiHandlerUtils.searchStringInJson(params,"pin_id")
                    if(pinId == null){
                        throw IllegalArgumentException("pinId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.productTagsList(pinId,context)
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
