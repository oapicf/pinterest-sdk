package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.CatalogsLocalStoresCreate200ResponseInner
import org.openapitools.server.api.model.CatalogsLocalStoresDelete200ResponseInner
import org.openapitools.server.api.model.CatalogsLocalStoresList200Response
import org.openapitools.server.api.model.LocalInventoryItemsBatch
import org.openapitools.server.api.model.LocalInventoryItemsBatchCreate
import org.openapitools.server.api.model.LocalInventoryItemsGet
import org.openapitools.server.api.model.LocalInventoryItemsGetCreate
import org.openapitools.server.api.model.LocalStore
import org.openapitools.server.api.model.LocalStoreBatchUpdate
import org.openapitools.server.api.model.LocalStoreCreate
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.SupplementalItemsBatchResponse
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


interface CatalogSupplementalApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* catalogsLocalInventoryItemsBatchOperate
     * Operate on local inventory item batch */
    suspend fun catalogsLocalInventoryItemsBatchOperate(catalogId:kotlin.String?,localInventoryItemsBatchCreate:LocalInventoryItemsBatchCreate?,adAccountId:kotlin.String?,context:OperationRequest):Response<SupplementalItemsBatchResponse>
    /* catalogsLocalInventoryItemsPost
     * Get local inventory items (POST) */
    suspend fun catalogsLocalInventoryItemsPost(catalogId:kotlin.String?,localInventoryItemsGetCreate:LocalInventoryItemsGetCreate?,adAccountId:kotlin.String?,context:OperationRequest):Response<LocalInventoryItemsGet>
    /* catalogsLocalStoresCreate
     * Create local stores */
    suspend fun catalogsLocalStoresCreate(catalogId:kotlin.String?,localStoreCreate:kotlin.Array<LocalStoreCreate>?,adAccountId:kotlin.String?,context:OperationRequest):Response<kotlin.Array<CatalogsLocalStoresCreate200ResponseInner>>
    /* catalogsLocalStoresDelete
     * Delete local stores */
    suspend fun catalogsLocalStoresDelete(catalogId:kotlin.String?,ids:kotlin.Array<kotlin.String>?,adAccountId:kotlin.String?,context:OperationRequest):Response<kotlin.Array<CatalogsLocalStoresDelete200ResponseInner>>
    /* catalogsLocalStoresList
     * List local stores */
    suspend fun catalogsLocalStoresList(catalogId:kotlin.String?,ids:kotlin.Array<kotlin.String>?,adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<CatalogsLocalStoresList200Response>
    /* catalogsLocalStoresUpdate
     * Update local stores */
    suspend fun catalogsLocalStoresUpdate(catalogId:kotlin.String?,localStoreBatchUpdate:kotlin.Array<LocalStoreBatchUpdate>?,adAccountId:kotlin.String?,context:OperationRequest):Response<kotlin.Array<CatalogsLocalStoresCreate200ResponseInner>>
    /* catalogsSupplementalItemsBatchGet
     * Get supplemental items batch status */
    suspend fun catalogsSupplementalItemsBatchGet(catalogId:kotlin.String?,batchId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<SupplementalItemsBatchResponse>
    companion object {
        const val address = "CatalogSupplementalApi-service"
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
            for (m in CatalogSupplementalApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(CatalogSupplementalApi::class.java, address)
            return routerFactory
        }
    }
}
