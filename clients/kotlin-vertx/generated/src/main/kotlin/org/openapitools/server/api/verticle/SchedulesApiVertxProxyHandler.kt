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
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.Schedule
import org.openapitools.server.api.model.ScheduleBatchUpdate
import org.openapitools.server.api.model.ScheduleCreate
import org.openapitools.server.api.model.ScheduleStatus
import org.openapitools.server.api.model.ScheduleType
import org.openapitools.server.api.model.SchedulesCreate200ResponseInner
import org.openapitools.server.api.model.SchedulesList200Response

class SchedulesApiVertxProxyHandler(private val vertx: Vertx, private val service: SchedulesApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "schedulesCreate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val scheduleCreateParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(scheduleCreateParam == null){
                         throw IllegalArgumentException("scheduleCreate is required")
                    }
                    val scheduleCreate:kotlin.Array<ScheduleCreate> = Gson().fromJson(scheduleCreateParam.encode()
                            , object : TypeToken<kotlin.collections.List<ScheduleCreate>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.schedulesCreate(adAccountId,scheduleCreate,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "schedulesList" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val entityIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"entity_ids")
                    if(entityIdsParam == null){
                         throw IllegalArgumentException("entityIds is required")
                    }
                    val entityIds:kotlin.Array<kotlin.String> = Gson().fromJson(entityIdsParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val orderParam = ApiHandlerUtils.searchJsonObjectInJson(params,"order")
                    val order = if(orderParam ==null) null else Gson().fromJson(orderParam.encode(), PinterestLibPaginationOrder::class.java)
                    val scheduleStatusesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"schedule_statuses")
                    val scheduleStatuses:kotlin.Array<ScheduleStatus>? = if(scheduleStatusesParam == null) null
                            else Gson().fromJson(scheduleStatusesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<ScheduleStatus>>(){}.type)
                    val scheduleTypeParam = ApiHandlerUtils.searchJsonObjectInJson(params,"schedule_type")
                    val scheduleType = if(scheduleTypeParam ==null) null else Gson().fromJson(scheduleTypeParam.encode(), ScheduleType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.schedulesList(adAccountId,entityIds,bookmark,pageSize,order,scheduleStatuses,scheduleType,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "schedulesUpdate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val scheduleBatchUpdateParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(scheduleBatchUpdateParam == null){
                         throw IllegalArgumentException("scheduleBatchUpdate is required")
                    }
                    val scheduleBatchUpdate:kotlin.Array<ScheduleBatchUpdate> = Gson().fromJson(scheduleBatchUpdateParam.encode()
                            , object : TypeToken<kotlin.collections.List<ScheduleBatchUpdate>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.schedulesUpdate(adAccountId,scheduleBatchUpdate,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
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
