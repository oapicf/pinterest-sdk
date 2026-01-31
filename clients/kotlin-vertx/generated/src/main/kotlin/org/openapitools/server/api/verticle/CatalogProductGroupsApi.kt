package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.CatalogsListProductsByFilterRequest
import org.openapitools.server.api.model.CatalogsProductGroupPinsList200Response
import org.openapitools.server.api.model.CatalogsProductGroupProductCountsVertical
import org.openapitools.server.api.model.CatalogsProductGroupsList200Response
import org.openapitools.server.api.model.CatalogsProductGroupsUpdateRequest
import org.openapitools.server.api.model.CatalogsVerticalProductGroup
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.MultipleProductGroupsInner
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


interface CatalogProductGroupsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* catalogsProductGroupPinsList
     * List products by product group */
    suspend fun catalogsProductGroupPinsList(productGroupId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,adAccountId:kotlin.String?,pinMetrics:kotlin.Boolean?,context:OperationRequest):Response<CatalogsProductGroupPinsList200Response>
    /* catalogsProductGroupsCreate
     * Create product group */
    suspend fun catalogsProductGroupsCreate(multipleProductGroupsInner:MultipleProductGroupsInner?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsVerticalProductGroup>
    /* catalogsProductGroupsCreateMany
     * Create product groups */
    suspend fun catalogsProductGroupsCreateMany(multipleProductGroupsInner:kotlin.Array<MultipleProductGroupsInner>?,adAccountId:kotlin.String?,context:OperationRequest):Response<kotlin.Array<kotlin.String>>
    /* catalogsProductGroupsDelete
     * Delete product group */
    suspend fun catalogsProductGroupsDelete(productGroupId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<Void>
    /* catalogsProductGroupsDeleteMany
     * Delete product groups */
    suspend fun catalogsProductGroupsDeleteMany(id:kotlin.Array<kotlin.Int>?,adAccountId:kotlin.String?,context:OperationRequest):Response<Void>
    /* catalogsProductGroupsGet
     * Get product group */
    suspend fun catalogsProductGroupsGet(productGroupId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsVerticalProductGroup>
    /* catalogsProductGroupsList
     * List product groups */
    suspend fun catalogsProductGroupsList(id:kotlin.Array<kotlin.Int>?,feedId:kotlin.String?,catalogId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsProductGroupsList200Response>
    /* catalogsProductGroupsProductCountsGet
     * Get product counts */
    suspend fun catalogsProductGroupsProductCountsGet(productGroupId:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsProductGroupProductCountsVertical>
    /* catalogsProductGroupsUpdate
     * Update single product group */
    suspend fun catalogsProductGroupsUpdate(productGroupId:kotlin.String?,catalogsProductGroupsUpdateRequest:CatalogsProductGroupsUpdateRequest?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsVerticalProductGroup>
    /* productsByProductGroupFilterList
     * List products by filter */
    suspend fun productsByProductGroupFilterList(catalogsListProductsByFilterRequest:CatalogsListProductsByFilterRequest?,bookmark:kotlin.String?,pageSize:kotlin.Int?,adAccountId:kotlin.String?,pinMetrics:kotlin.Boolean?,context:OperationRequest):Response<CatalogsProductGroupPinsList200Response>
    companion object {
        const val address = "CatalogProductGroupsApi-service"
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
            for (m in CatalogProductGroupsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(CatalogProductGroupsApi::class.java, address)
            return routerFactory
        }
    }
}
