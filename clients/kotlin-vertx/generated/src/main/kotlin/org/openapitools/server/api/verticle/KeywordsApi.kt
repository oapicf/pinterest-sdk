package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.Keywords
import org.openapitools.server.api.model.KeywordsCreate
import org.openapitools.server.api.model.KeywordsGet200Response
import org.openapitools.server.api.model.KeywordsMetricsArrayResponse
import org.openapitools.server.api.model.KeywordsUpdate
import org.openapitools.server.api.model.MatchType
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.TrendType
import org.openapitools.server.api.model.TrendingKeywordsResponse
import org.openapitools.server.api.model.TrendsAgeBucket
import org.openapitools.server.api.model.TrendsGenderFilter
import org.openapitools.server.api.model.TrendsL1Interest
import org.openapitools.server.api.model.TrendsSupportedRegion
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import io.vertx.core.json.JsonArray
import com.github.wooyme.openapi.Response
import io.vertx.ext.web.api.OperationRequest
import io.vertx.kotlin.ext.web.api.contract.openapi3.OpenAPI3RouterFactory
import io.vertx.serviceproxy.ServiceBinder
import io.vertx.ext.web.handler.CookieHandler
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.ext.web.sstore.LocalSessionStore
import java.util.List
import java.util.Map


interface KeywordsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* countryKeywordsMetricsGet
     * Get country&#39;s keyword metrics */
    suspend fun countryKeywordsMetricsGet(adAccountId:kotlin.String?,countryCode:kotlin.String?,keywords:kotlin.Array<kotlin.String>?,context:OperationRequest):Response<KeywordsMetricsArrayResponse>
    /* keywordsCreate
     * Create keywords */
    suspend fun keywordsCreate(adAccountId:kotlin.String?,keywordsCreate:KeywordsCreate?,context:OperationRequest):Response<Keywords>
    /* keywordsGet
     * Get keywords */
    suspend fun keywordsGet(adAccountId:kotlin.String?,campaignId:kotlin.String?,adGroupId:kotlin.String?,adGroupIds:kotlin.Array<kotlin.String>?,matchTypes:kotlin.Array<MatchType>?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<KeywordsGet200Response>
    /* keywordsUpdate
     * Update keywords */
    suspend fun keywordsUpdate(adAccountId:kotlin.String?,keywordsUpdate:KeywordsUpdate?,context:OperationRequest):Response<Keywords>
    /* trendingKeywordsList
     * List trending keywords */
    suspend fun trendingKeywordsList(region:TrendsSupportedRegion?,trendType:TrendType?,interests:kotlin.Array<TrendsL1Interest>?,genders:kotlin.Array<TrendsGenderFilter>?,ages:kotlin.Array<TrendsAgeBucket>?,includeKeywords:kotlin.Array<kotlin.String>?,normalizeAgainstGroup:kotlin.Boolean?,limit:kotlin.Int?,includeDemographics:kotlin.Boolean?,context:OperationRequest):Response<TrendingKeywordsResponse>
    companion object {
        const val address = "KeywordsApi-service"
        suspend fun createRouterFactory(vertx: Vertx,path:String): io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory {
            val routerFactory = OpenAPI3RouterFactory.createAwait(vertx,path)
            routerFactory.addGlobalHandler(CookieHandler.create())
            routerFactory.addGlobalHandler(SessionHandler.create(LocalSessionStore.create(vertx)))
            routerFactory.setExtraOperationContextPayloadMapper{
                JsonObject().put("files",JsonArray(it.fileUploads().map { it.uploadedFileName() }))
            }
            val opf = routerFactory::class.java.getDeclaredField("operations")
            opf.isAccessible = true
            val operations = opf.get(routerFactory) as Map<String, Any>
            for (m in KeywordsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(KeywordsApi::class.java, address)
            return routerFactory
        }
    }
}
