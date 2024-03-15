package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.CatalogsFeed
import org.openapitools.server.api.model.CatalogsItemValidationIssue
import org.openapitools.server.api.model.CatalogsItems
import org.openapitools.server.api.model.CatalogsItemsBatch
import org.openapitools.server.api.model.CatalogsItemsFilters
import org.openapitools.server.api.model.CatalogsList200Response
import org.openapitools.server.api.model.CatalogsListProductsByFilterRequest
import org.openapitools.server.api.model.CatalogsProductGroupPinsList200Response
import org.openapitools.server.api.model.CatalogsProductGroupProductCounts
import org.openapitools.server.api.model.CatalogsProductGroupsCreate201Response
import org.openapitools.server.api.model.CatalogsProductGroupsCreateRequest
import org.openapitools.server.api.model.CatalogsProductGroupsList200Response
import org.openapitools.server.api.model.CatalogsProductGroupsUpdateRequest
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.FeedProcessingResultsList200Response
import org.openapitools.server.api.model.FeedsCreateRequest
import org.openapitools.server.api.model.FeedsList200Response
import org.openapitools.server.api.model.FeedsUpdateRequest
import org.openapitools.server.api.model.ItemsBatchPostRequest
import org.openapitools.server.api.model.ItemsIssuesList200Response
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


interface CatalogsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* catalogsList
     * List catalogs */
    suspend fun catalogsList(bookmark:kotlin.String?,pageSize:kotlin.Int?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsList200Response>
    /* catalogsProductGroupPinsList
     * List products for a Product Group */
    suspend fun catalogsProductGroupPinsList(productGroupId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsProductGroupPinsList200Response>
    /* catalogsProductGroupsCreate
     * Create product group */
    suspend fun catalogsProductGroupsCreate(catalogsProductGroupsCreateRequest:CatalogsProductGroupsCreateRequest?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsProductGroupsCreate201Response>
    /* catalogsProductGroupsDelete
     * Delete product group */
    suspend fun catalogsProductGroupsDelete(productGroupId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<Void>
    /* catalogsProductGroupsGet
     * Get product group */
    suspend fun catalogsProductGroupsGet(productGroupId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsProductGroupsCreate201Response>
    /* catalogsProductGroupsList
     * List product groups */
    suspend fun catalogsProductGroupsList(feedId:kotlin.String?,catalogId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsProductGroupsList200Response>
    /* catalogsProductGroupsProductCountsGet
     * Get product counts for a Product Group */
    suspend fun catalogsProductGroupsProductCountsGet(productGroupId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsProductGroupProductCounts>
    /* catalogsProductGroupsUpdate
     * Update product group */
    suspend fun catalogsProductGroupsUpdate(productGroupId:kotlin.String?,catalogsProductGroupsUpdateRequest:CatalogsProductGroupsUpdateRequest?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsProductGroupsCreate201Response>
    /* feedProcessingResultsList
     * List processing results for a given feed */
    suspend fun feedProcessingResultsList(feedId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,adAccountId:kotlin.String?,context:OperationRequest):Response<FeedProcessingResultsList200Response>
    /* feedsCreate
     * Create feed */
    suspend fun feedsCreate(feedsCreateRequest:FeedsCreateRequest?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsFeed>
    /* feedsDelete
     * Delete feed */
    suspend fun feedsDelete(feedId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<Void>
    /* feedsGet
     * Get feed */
    suspend fun feedsGet(feedId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsFeed>
    /* feedsList
     * List feeds */
    suspend fun feedsList(bookmark:kotlin.String?,pageSize:kotlin.Int?,catalogId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<FeedsList200Response>
    /* feedsUpdate
     * Update feed */
    suspend fun feedsUpdate(feedId:kotlin.String?,feedsUpdateRequest:FeedsUpdateRequest?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsFeed>
    /* itemsBatchGet
     * Get catalogs item batch status */
    suspend fun itemsBatchGet(batchId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsItemsBatch>
    /* itemsBatchPost
     * Operate on item batch */
    suspend fun itemsBatchPost(itemsBatchPostRequest:ItemsBatchPostRequest?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsItemsBatch>
    /* itemsGet
     * Get catalogs items */
    suspend fun itemsGet(country:kotlin.String?,language:kotlin.String?,adAccountId:kotlin.String?,itemIds:kotlin.Array<kotlin.String>?,filters:CatalogsItemsFilters?,context:OperationRequest):Response<CatalogsItems>
    /* itemsIssuesList
     * List item issues for a given processing result */
    suspend fun itemsIssuesList(processingResultId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,itemNumbers:kotlin.Array<kotlin.Int>?,itemValidationIssue:CatalogsItemValidationIssue?,adAccountId:kotlin.String?,context:OperationRequest):Response<ItemsIssuesList200Response>
    /* productsByProductGroupFilterList
     * List filtered products */
    suspend fun productsByProductGroupFilterList(catalogsListProductsByFilterRequest:CatalogsListProductsByFilterRequest?,bookmark:kotlin.String?,pageSize:kotlin.Int?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsProductGroupPinsList200Response>
    companion object {
        const val address = "CatalogsApi-service"
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
            for (m in CatalogsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(CatalogsApi::class.java, address)
            return routerFactory
        }
    }
}
