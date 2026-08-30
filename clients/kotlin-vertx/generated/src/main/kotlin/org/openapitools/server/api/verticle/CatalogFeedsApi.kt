package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.CatalogsFeed
import org.openapitools.server.api.model.CatalogsFeedCreateRequestSchema
import org.openapitools.server.api.model.CatalogsFeedIngestion
import org.openapitools.server.api.model.CatalogsFeedUpdateRequestSchema
import org.openapitools.server.api.model.CatalogsItemValidationIssue
import org.openapitools.server.api.model.FeedProcessingResultsList200Response
import org.openapitools.server.api.model.FeedsList200Response
import org.openapitools.server.api.model.ItemsIssuesList200Response
import org.openapitools.server.api.model.PinterestLibError
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


interface CatalogFeedsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* feedProcessingResultsList
     * List feed processing results */
    suspend fun feedProcessingResultsList(feedId:kotlin.String?,adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<FeedProcessingResultsList200Response>
    /* feedsCreate
     * Create feed */
    suspend fun feedsCreate(catalogsFeedCreateRequestSchema:CatalogsFeedCreateRequestSchema?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsFeed>
    /* feedsDelete
     * Delete feed */
    suspend fun feedsDelete(feedId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsFeed>
    /* feedsGet
     * Get feed */
    suspend fun feedsGet(feedId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsFeed>
    /* feedsIngest
     * Ingest feed items */
    suspend fun feedsIngest(feedId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsFeedIngestion>
    /* feedsList
     * List feeds */
    suspend fun feedsList(catalogId:kotlin.String?,adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<FeedsList200Response>
    /* feedsUpdate
     * Update feed */
    suspend fun feedsUpdate(feedId:kotlin.String?,catalogsFeedUpdateRequestSchema:CatalogsFeedUpdateRequestSchema?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsFeed>
    /* itemsIssuesList
     * List item issues */
    suspend fun itemsIssuesList(processingResultId:kotlin.String?,itemNumbers:kotlin.Array<kotlin.Int>?,itemValidationIssue:CatalogsItemValidationIssue?,adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<ItemsIssuesList200Response>
    companion object {
        const val address = "CatalogFeedsApi-service"
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
            for (m in CatalogFeedsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(CatalogFeedsApi::class.java, address)
            return routerFactory
        }
    }
}
