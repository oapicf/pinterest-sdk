package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.CatalogsFeed
import org.openapitools.server.api.model.CatalogsFeedsCreateRequest
import org.openapitools.server.api.model.CatalogsFeedsUpdateRequest
import org.openapitools.server.api.model.CatalogsItems
import org.openapitools.server.api.model.CatalogsItemsBatch
import org.openapitools.server.api.model.CatalogsItemsBatchRequest
import org.openapitools.server.api.model.CatalogsProductGroup
import org.openapitools.server.api.model.CatalogsProductGroupCreateRequest
import org.openapitools.server.api.model.CatalogsProductGroupUpdateRequest
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.Paginated
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
    /* catalogsProductGroupsCreate
     * Create product group */
    suspend fun catalogsProductGroupsCreate(catalogsProductGroupCreateRequest:CatalogsProductGroupCreateRequest?,context:OperationRequest):Response<kotlin.Any>
    /* catalogsProductGroupsDelete
     * Delete product group */
    suspend fun catalogsProductGroupsDelete(productGroupId:kotlin.String?,context:OperationRequest):Response<Void>
    /* catalogsProductGroupsList
     * Get product groups list */
    suspend fun catalogsProductGroupsList(feedId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<Paginated>
    /* catalogsProductGroupsUpdate
     * Update product group */
    suspend fun catalogsProductGroupsUpdate(productGroupId:kotlin.String?,catalogsProductGroupUpdateRequest:CatalogsProductGroupUpdateRequest?,context:OperationRequest):Response<CatalogsProductGroup>
    /* feedProcessingResultsList
     * List processing results for a given feed */
    suspend fun feedProcessingResultsList(feedId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<Paginated>
    /* feedsCreate
     * Create feed */
    suspend fun feedsCreate(catalogsFeedsCreateRequest:CatalogsFeedsCreateRequest?,context:OperationRequest):Response<CatalogsFeed>
    /* feedsDelete
     * Delete feed */
    suspend fun feedsDelete(feedId:kotlin.String?,context:OperationRequest):Response<Void>
    /* feedsGet
     * Get feed */
    suspend fun feedsGet(feedId:kotlin.String?,context:OperationRequest):Response<CatalogsFeed>
    /* feedsList
     * List feeds */
    suspend fun feedsList(bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<Paginated>
    /* feedsUpdate
     * Update feed */
    suspend fun feedsUpdate(feedId:kotlin.String?,catalogsFeedsUpdateRequest:CatalogsFeedsUpdateRequest?,context:OperationRequest):Response<CatalogsFeed>
    /* itemsBatchGet
     * Get catalogs items batch */
    suspend fun itemsBatchGet(batchId:kotlin.String?,context:OperationRequest):Response<CatalogsItemsBatch>
    /* itemsBatchPost
     * Perform an operation on an item batch */
    suspend fun itemsBatchPost(catalogsItemsBatchRequest:CatalogsItemsBatchRequest?,context:OperationRequest):Response<CatalogsItemsBatch>
    /* itemsGet
     * Get catalogs items */
    suspend fun itemsGet(country:kotlin.String?,itemIds:kotlin.Array<kotlin.String>?,language:kotlin.String?,context:OperationRequest):Response<CatalogsItems>
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
