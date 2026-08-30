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
import org.openapitools.server.api.model.AgeTrendsBucket
import org.openapitools.server.api.model.FeaturedTrend
import org.openapitools.server.api.model.GenderBucket
import org.openapitools.server.api.model.InterestsEnum
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.ProductCategoriesEngagementType
import org.openapitools.server.api.model.ProductCategoryDetailLookbackWindow
import org.openapitools.server.api.model.ProductCategoryDetails
import org.openapitools.server.api.model.ProductCategoryEnum
import org.openapitools.server.api.model.ProductCategoryRegion
import org.openapitools.server.api.model.TrendingProductCategory
import org.openapitools.server.api.model.TrendsEditorial
import org.openapitools.server.api.model.VerticalProductCategory

class TrendsApiVertxProxyHandler(private val vertx: Vertx, private val service: TrendsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "trendsEditorialArticlesList" -> {
                    val params = context.params
                    val regionParam = ApiHandlerUtils.searchJsonObjectInJson(params,"region")
                    if (regionParam == null) {
                        throw IllegalArgumentException("region is required")
                    }
                    val region = Gson().fromJson(regionParam.encode(), ProductCategoryRegion::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.trendsEditorialArticlesList(region,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "trendsFeaturedTopicsList" -> {
                    val params = context.params
                    val regionParam = ApiHandlerUtils.searchJsonObjectInJson(params,"region")
                    if (regionParam == null) {
                        throw IllegalArgumentException("region is required")
                    }
                    val region = Gson().fromJson(regionParam.encode(), ProductCategoryRegion::class.java)
                    val interestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"interest")
                    val interest = if(interestParam ==null) null else Gson().fromJson(interestParam.encode(), InterestsEnum::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.trendsFeaturedTopicsList(region,interest,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "trendsProductCategoriesDetailsList" -> {
                    val params = context.params
                    val productCategoriesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"product_categories")
                    if(productCategoriesParam == null){
                         throw IllegalArgumentException("productCategories is required")
                    }
                    val productCategories:kotlin.Array<ProductCategoryEnum> = Gson().fromJson(productCategoriesParam.encode()
                            , object : TypeToken<kotlin.collections.List<ProductCategoryEnum>>(){}.type)
                    val regionParam = ApiHandlerUtils.searchJsonObjectInJson(params,"region")
                    if (regionParam == null) {
                        throw IllegalArgumentException("region is required")
                    }
                    val region = Gson().fromJson(regionParam.encode(), ProductCategoryRegion::class.java)
                    val lookbackWindowParam = ApiHandlerUtils.searchJsonObjectInJson(params,"lookback_window")
                    val lookbackWindow = if(lookbackWindowParam ==null) null else Gson().fromJson(lookbackWindowParam.encode(), ProductCategoryDetailLookbackWindow::class.java)
                    val engagementTypeParam = ApiHandlerUtils.searchJsonObjectInJson(params,"engagement_type")
                    val engagementType = if(engagementTypeParam ==null) null else Gson().fromJson(engagementTypeParam.encode(), ProductCategoriesEngagementType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.trendsProductCategoriesDetailsList(productCategories,region,lookbackWindow,engagementType,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "trendsProductCategoriesTrendingList" -> {
                    val params = context.params
                    val regionParam = ApiHandlerUtils.searchJsonObjectInJson(params,"region")
                    if (regionParam == null) {
                        throw IllegalArgumentException("region is required")
                    }
                    val region = Gson().fromJson(regionParam.encode(), ProductCategoryRegion::class.java)
                    val verticalsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"verticals")
                    val verticals:kotlin.Array<VerticalProductCategory>? = if(verticalsParam == null) null
                            else Gson().fromJson(verticalsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<VerticalProductCategory>>(){}.type)
                    val agesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"ages")
                    val ages:kotlin.Array<AgeTrendsBucket>? = if(agesParam == null) null
                            else Gson().fromJson(agesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<AgeTrendsBucket>>(){}.type)
                    val gendersParam = ApiHandlerUtils.searchJsonArrayInJson(params,"genders")
                    val genders:kotlin.Array<GenderBucket>? = if(gendersParam == null) null
                            else Gson().fromJson(gendersParam.encode(),
                            , object : TypeToken<kotlin.collections.List<GenderBucket>>(){}.type)
                    val engagementTypeParam = ApiHandlerUtils.searchJsonObjectInJson(params,"engagement_type")
                    val engagementType = if(engagementTypeParam ==null) null else Gson().fromJson(engagementTypeParam.encode(), ProductCategoriesEngagementType::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.trendsProductCategoriesTrendingList(region,verticals,ages,genders,engagementType,context)
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
