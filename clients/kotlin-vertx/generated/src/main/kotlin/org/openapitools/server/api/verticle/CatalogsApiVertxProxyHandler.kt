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
import org.openapitools.server.api.model.Catalog
import org.openapitools.server.api.model.CatalogsCreateReportResponse
import org.openapitools.server.api.model.CatalogsCreateRequest
import org.openapitools.server.api.model.CatalogsFeed
import org.openapitools.server.api.model.CatalogsFeedIngestion
import org.openapitools.server.api.model.CatalogsItemValidationIssue
import org.openapitools.server.api.model.CatalogsItems
import org.openapitools.server.api.model.CatalogsItemsBatch
import org.openapitools.server.api.model.CatalogsItemsFilters
import org.openapitools.server.api.model.CatalogsItemsRequest
import org.openapitools.server.api.model.CatalogsList200Response
import org.openapitools.server.api.model.CatalogsListProductsByFilterRequest
import org.openapitools.server.api.model.CatalogsProductGroupPinsList200Response
import org.openapitools.server.api.model.CatalogsProductGroupProductCountsVertical
import org.openapitools.server.api.model.CatalogsProductGroupsList200Response
import org.openapitools.server.api.model.CatalogsProductGroupsUpdateRequest
import org.openapitools.server.api.model.CatalogsReport
import org.openapitools.server.api.model.CatalogsReportParameters
import org.openapitools.server.api.model.CatalogsVerticalProductGroup
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.FeedProcessingResultsList200Response
import org.openapitools.server.api.model.FeedsCreateRequest
import org.openapitools.server.api.model.FeedsList200Response
import org.openapitools.server.api.model.FeedsUpdateRequest
import org.openapitools.server.api.model.ItemsBatchPostRequest
import org.openapitools.server.api.model.ItemsIssuesList200Response
import org.openapitools.server.api.model.MultipleProductGroupsInner
import org.openapitools.server.api.model.ReportsStats200Response

class CatalogsApiVertxProxyHandler(private val vertx: Vertx, private val service: CatalogsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "catalogsCreate" -> {
                    val params = context.params
                    val catalogsCreateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (catalogsCreateRequestParam == null) {
                        throw IllegalArgumentException("catalogsCreateRequest is required")
                    }
                    val catalogsCreateRequest = Gson().fromJson(catalogsCreateRequestParam.encode(), CatalogsCreateRequest::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsCreate(catalogsCreateRequest,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsList" -> {
                    val params = context.params
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsList(bookmark,pageSize,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupPinsList" -> {
                    val params = context.params
                    val productGroupId = ApiHandlerUtils.searchStringInJson(params,"product_group_id")
                    if(productGroupId == null){
                        throw IllegalArgumentException("productGroupId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    val pinMetrics = ApiHandlerUtils.searchStringInJson(params,"pin_metrics")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupPinsList(productGroupId,bookmark,pageSize,adAccountId,pinMetrics,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupsCreate" -> {
                    val params = context.params
                    val multipleProductGroupsInnerParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (multipleProductGroupsInnerParam == null) {
                        throw IllegalArgumentException("multipleProductGroupsInner is required")
                    }
                    val multipleProductGroupsInner = Gson().fromJson(multipleProductGroupsInnerParam.encode(), MultipleProductGroupsInner::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsCreate(multipleProductGroupsInner,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupsCreateMany" -> {
                    val params = context.params
                    val multipleProductGroupsInnerParam = ApiHandlerUtils.searchJsonArrayInJson(params,"body")
                    if(multipleProductGroupsInnerParam == null){
                         throw IllegalArgumentException("multipleProductGroupsInner is required")
                    }
                    val multipleProductGroupsInner:kotlin.Array<MultipleProductGroupsInner> = Gson().fromJson(multipleProductGroupsInnerParam.encode()
                            , object : TypeToken<kotlin.collections.List<MultipleProductGroupsInner>>(){}.type)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsCreateMany(multipleProductGroupsInner,adAccountId,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupsDelete" -> {
                    val params = context.params
                    val productGroupId = ApiHandlerUtils.searchStringInJson(params,"product_group_id")
                    if(productGroupId == null){
                        throw IllegalArgumentException("productGroupId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsDelete(productGroupId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupsDeleteMany" -> {
                    val params = context.params
                    val idParam = ApiHandlerUtils.searchJsonArrayInJson(params,"id")
                    if(idParam == null){
                         throw IllegalArgumentException("id is required")
                    }
                    val id:kotlin.Array<kotlin.Int> = Gson().fromJson(idParam.encode()
                            , object : TypeToken<kotlin.collections.List<kotlin.Int>>(){}.type)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsDeleteMany(id,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupsGet" -> {
                    val params = context.params
                    val productGroupId = ApiHandlerUtils.searchStringInJson(params,"product_group_id")
                    if(productGroupId == null){
                        throw IllegalArgumentException("productGroupId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsGet(productGroupId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupsList" -> {
                    val params = context.params
                    val idParam = ApiHandlerUtils.searchJsonArrayInJson(params,"id")
                    val id:kotlin.Array<kotlin.Int>? = if(idParam == null) null
                            else Gson().fromJson(idParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.Int>>(){}.type)
                    val feedId = ApiHandlerUtils.searchStringInJson(params,"feed_id")
                    val catalogId = ApiHandlerUtils.searchStringInJson(params,"catalog_id")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsList(id,feedId,catalogId,bookmark,pageSize,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupsProductCountsGet" -> {
                    val params = context.params
                    val productGroupId = ApiHandlerUtils.searchStringInJson(params,"product_group_id")
                    if(productGroupId == null){
                        throw IllegalArgumentException("productGroupId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsProductCountsGet(productGroupId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "catalogsProductGroupsUpdate" -> {
                    val params = context.params
                    val productGroupId = ApiHandlerUtils.searchStringInJson(params,"product_group_id")
                    if(productGroupId == null){
                        throw IllegalArgumentException("productGroupId is required")
                    }
                    val catalogsProductGroupsUpdateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (catalogsProductGroupsUpdateRequestParam == null) {
                        throw IllegalArgumentException("catalogsProductGroupsUpdateRequest is required")
                    }
                    val catalogsProductGroupsUpdateRequest = Gson().fromJson(catalogsProductGroupsUpdateRequestParam.encode(), CatalogsProductGroupsUpdateRequest::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.catalogsProductGroupsUpdate(productGroupId,catalogsProductGroupsUpdateRequest,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "feedProcessingResultsList" -> {
                    val params = context.params
                    val feedId = ApiHandlerUtils.searchStringInJson(params,"feed_id")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedProcessingResultsList(feedId,bookmark,pageSize,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "feedsCreate" -> {
                    val params = context.params
                    val feedsCreateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (feedsCreateRequestParam == null) {
                        throw IllegalArgumentException("feedsCreateRequest is required")
                    }
                    val feedsCreateRequest = Gson().fromJson(feedsCreateRequestParam.encode(), FeedsCreateRequest::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedsCreate(feedsCreateRequest,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "feedsDelete" -> {
                    val params = context.params
                    val feedId = ApiHandlerUtils.searchStringInJson(params,"feed_id")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedsDelete(feedId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "feedsGet" -> {
                    val params = context.params
                    val feedId = ApiHandlerUtils.searchStringInJson(params,"feed_id")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedsGet(feedId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "feedsIngest" -> {
                    val params = context.params
                    val feedId = ApiHandlerUtils.searchStringInJson(params,"feed_id")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedsIngest(feedId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "feedsList" -> {
                    val params = context.params
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val catalogId = ApiHandlerUtils.searchStringInJson(params,"catalog_id")
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedsList(bookmark,pageSize,catalogId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "feedsUpdate" -> {
                    val params = context.params
                    val feedId = ApiHandlerUtils.searchStringInJson(params,"feed_id")
                    if(feedId == null){
                        throw IllegalArgumentException("feedId is required")
                    }
                    val feedsUpdateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (feedsUpdateRequestParam == null) {
                        throw IllegalArgumentException("feedsUpdateRequest is required")
                    }
                    val feedsUpdateRequest = Gson().fromJson(feedsUpdateRequestParam.encode(), FeedsUpdateRequest::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.feedsUpdate(feedId,feedsUpdateRequest,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "itemsBatchGet" -> {
                    val params = context.params
                    val batchId = ApiHandlerUtils.searchStringInJson(params,"batch_id")
                    if(batchId == null){
                        throw IllegalArgumentException("batchId is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.itemsBatchGet(batchId,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "itemsBatchPost" -> {
                    val params = context.params
                    val itemsBatchPostRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (itemsBatchPostRequestParam == null) {
                        throw IllegalArgumentException("itemsBatchPostRequest is required")
                    }
                    val itemsBatchPostRequest = Gson().fromJson(itemsBatchPostRequestParam.encode(), ItemsBatchPostRequest::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.itemsBatchPost(itemsBatchPostRequest,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "itemsGet" -> {
                    val params = context.params
                    val country = ApiHandlerUtils.searchStringInJson(params,"country")
                    if(country == null){
                        throw IllegalArgumentException("country is required")
                    }
                    val language = ApiHandlerUtils.searchStringInJson(params,"language")
                    if(language == null){
                        throw IllegalArgumentException("language is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    val itemIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"item_ids")
                    val itemIds:kotlin.Array<kotlin.String>? = if(itemIdsParam == null) null
                            else Gson().fromJson(itemIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val filtersParam = ApiHandlerUtils.searchJsonObjectInJson(params,"filters")
                    val filters = if(filtersParam ==null) null else Gson().fromJson(filtersParam.encode(), CatalogsItemsFilters::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.itemsGet(country,language,adAccountId,itemIds,filters,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "itemsIssuesList" -> {
                    val params = context.params
                    val processingResultId = ApiHandlerUtils.searchStringInJson(params,"processing_result_id")
                    if(processingResultId == null){
                        throw IllegalArgumentException("processingResultId is required")
                    }
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val itemNumbersParam = ApiHandlerUtils.searchJsonArrayInJson(params,"item_numbers")
                    val itemNumbers:kotlin.Array<kotlin.Int>? = if(itemNumbersParam == null) null
                            else Gson().fromJson(itemNumbersParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.Int>>(){}.type)
                    val itemValidationIssueParam = ApiHandlerUtils.searchJsonObjectInJson(params,"item_validation_issue")
                    val itemValidationIssue = if(itemValidationIssueParam ==null) null else Gson().fromJson(itemValidationIssueParam.encode(), CatalogsItemValidationIssue::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.itemsIssuesList(processingResultId,bookmark,pageSize,itemNumbers,itemValidationIssue,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "itemsPost" -> {
                    val params = context.params
                    val catalogsItemsRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (catalogsItemsRequestParam == null) {
                        throw IllegalArgumentException("catalogsItemsRequest is required")
                    }
                    val catalogsItemsRequest = Gson().fromJson(catalogsItemsRequestParam.encode(), CatalogsItemsRequest::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.itemsPost(catalogsItemsRequest,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "productsByProductGroupFilterList" -> {
                    val params = context.params
                    val catalogsListProductsByFilterRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (catalogsListProductsByFilterRequestParam == null) {
                        throw IllegalArgumentException("catalogsListProductsByFilterRequest is required")
                    }
                    val catalogsListProductsByFilterRequest = Gson().fromJson(catalogsListProductsByFilterRequestParam.encode(), CatalogsListProductsByFilterRequest::class.java)
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    val pinMetrics = ApiHandlerUtils.searchStringInJson(params,"pin_metrics")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.productsByProductGroupFilterList(catalogsListProductsByFilterRequest,bookmark,pageSize,adAccountId,pinMetrics,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "reportsCreate" -> {
                    val params = context.params
                    val catalogsReportParametersParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (catalogsReportParametersParam == null) {
                        throw IllegalArgumentException("catalogsReportParameters is required")
                    }
                    val catalogsReportParameters = Gson().fromJson(catalogsReportParametersParam.encode(), CatalogsReportParameters::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.reportsCreate(catalogsReportParameters,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "reportsGet" -> {
                    val params = context.params
                    val token = ApiHandlerUtils.searchStringInJson(params,"token")
                    if(token == null){
                        throw IllegalArgumentException("token is required")
                    }
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.reportsGet(token,adAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "reportsStats" -> {
                    val params = context.params
                    val parametersParam = ApiHandlerUtils.searchJsonObjectInJson(params,"parameters")
                    if (parametersParam == null) {
                        throw IllegalArgumentException("parameters is required")
                    }
                    val parameters = Gson().fromJson(parametersParam.encode(), CatalogsReportParameters::class.java)
                    val adAccountId = ApiHandlerUtils.searchStringInJson(params,"ad_account_id")
                    val pageSize = ApiHandlerUtils.searchIntegerInJson(params,"page_size")
                    val bookmark = ApiHandlerUtils.searchStringInJson(params,"bookmark")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.reportsStats(parameters,adAccountId,pageSize,bookmark,context)
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
