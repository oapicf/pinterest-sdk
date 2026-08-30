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
import org.openapitools.server.api.model.AdsCreditRedeem
import org.openapitools.server.api.model.AdsCreditRedeemCreate
import org.openapitools.server.api.model.AdsCreditsDiscountsGet200Response
import org.openapitools.server.api.model.BillingInvoiceDocumentType
import org.openapitools.server.api.model.BillingInvoiceDownloadResponse
import org.openapitools.server.api.model.BillingInvoiceSortField
import org.openapitools.server.api.model.BillingInvoiceStatus
import org.openapitools.server.api.model.BillingInvoicesGet200Response
import org.openapitools.server.api.model.BillingProfilesGet200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.SSIOAccount
import org.openapitools.server.api.model.SSIOInsertionOrder
import org.openapitools.server.api.model.SSIOInsertionOrderCreate
import org.openapitools.server.api.model.SSIOInsertionOrderStatusResponse
import org.openapitools.server.api.model.SSIOInsertionOrderUpdate
import org.openapitools.server.api.model.SsioInsertionOrdersStatusGetByAdAccount200Response
import org.openapitools.server.api.model.SsioOrderLinesGetByAdAccount200Response

class BillingApiVertxProxyHandler(private val vertx: Vertx, private val service: BillingApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "adsCreditRedeem" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val adsCreditRedeemCreateParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (adsCreditRedeemCreateParam == null) {
                        throw IllegalArgumentException("adsCreditRedeemCreate is required")
                    }
                    val adsCreditRedeemCreate = Gson().fromJson(adsCreditRedeemCreateParam.encode(), AdsCreditRedeemCreate::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adsCreditRedeem(adAccountId,adsCreditRedeemCreate,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "adsCreditsDiscountsGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.adsCreditsDiscountsGet(adAccountId,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "billingInvoiceDownloadGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val billingInvoiceId = ApiHandlerUtils.searchStringInJson(params,"billing_invoice_id")
                    if(billingInvoiceId == null){
                        throw IllegalArgumentException("billingInvoiceId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.billingInvoiceDownloadGet(adAccountId,billingInvoiceId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "billingInvoicesGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val orderParam = ApiHandlerUtils.searchJsonObjectInJson(params,"order")
                    val order = if(orderParam ==null) null else Gson().fromJson(orderParam.encode(), PinterestLibPaginationOrder::class.java)
                    val sortParam = ApiHandlerUtils.searchJsonObjectInJson(params,"sort")
                    val sort = if(sortParam ==null) null else Gson().fromJson(sortParam.encode(), BillingInvoiceSortField::class.java)
                    val statusParam = ApiHandlerUtils.searchJsonObjectInJson(params,"status")
                    val status = if(statusParam ==null) null else Gson().fromJson(statusParam.encode(), BillingInvoiceStatus::class.java)
                    val documentTypeParam = ApiHandlerUtils.searchJsonObjectInJson(params,"document_type")
                    val documentType = if(documentTypeParam ==null) null else Gson().fromJson(documentTypeParam.encode(), BillingInvoiceDocumentType::class.java)
                    val startDueDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"start_due_date"))
                    val endDueDate = java.time.LocalDate.parse(ApiHandlerUtils.searchStringInJson(params,"end_due_date"))
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.billingInvoicesGet(adAccountId,bookmark,pageSize,order,sort,status,documentType,startDueDate,endDueDate,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "billingProfilesGet" -> {
                    val params = context.params
                    val isActive = ApiHandlerUtils.searchStringInJson(params,"is_active")?.toBoolean()
                    if(isActive == null){
                        throw IllegalArgumentException("isActive is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.billingProfilesGet(isActive,adAccountId,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "ssioAccountsGet" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.ssioAccountsGet(adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "ssioInsertionOrderCreate" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val ssIOInsertionOrderCreateParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (ssIOInsertionOrderCreateParam == null) {
                        throw IllegalArgumentException("ssIOInsertionOrderCreate is required")
                    }
                    val ssIOInsertionOrderCreate = Gson().fromJson(ssIOInsertionOrderCreateParam.encode(), SSIOInsertionOrderCreate::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.ssioInsertionOrderCreate(adAccountId,ssIOInsertionOrderCreate,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "ssioInsertionOrderEdit" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val ssIOInsertionOrderUpdateParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (ssIOInsertionOrderUpdateParam == null) {
                        throw IllegalArgumentException("ssIOInsertionOrderUpdate is required")
                    }
                    val ssIOInsertionOrderUpdate = Gson().fromJson(ssIOInsertionOrderUpdateParam.encode(), SSIOInsertionOrderUpdate::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.ssioInsertionOrderEdit(adAccountId,ssIOInsertionOrderUpdate,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "ssioInsertionOrdersStatusGetByAdAccount" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.ssioInsertionOrdersStatusGetByAdAccount(adAccountId,bookmark,pageSize,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "ssioInsertionOrdersStatusGetByPinOrderId" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val pinOrderId = ApiHandlerUtils.searchStringInJson(params,"pin_order_id")
                    if(pinOrderId == null){
                        throw IllegalArgumentException("pinOrderId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId,pinOrderId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "ssioOrderLinesGetByAdAccount" -> {
                    val params = context.params
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    if(adAccountId == null){
                        throw IllegalArgumentException("adAccountId is required")
                    }
                    val pinOrderId = ApiHandlerUtils.searchStringInJson(params,"pin_order_id")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.ssioOrderLinesGetByAdAccount(adAccountId,pinOrderId,bookmark,pageSize,context)
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
