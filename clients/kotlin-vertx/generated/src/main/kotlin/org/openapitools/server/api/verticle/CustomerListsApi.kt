package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.CustomerList
import org.openapitools.server.api.model.CustomerListRequest
import org.openapitools.server.api.model.CustomerListUpdateRequest
import org.openapitools.server.api.model.CustomerListsList200Response
import org.openapitools.server.api.model.Error
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


interface CustomerListsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* customerListsCreate
     * Create customer lists */
    suspend fun customerListsCreate(adAccountId:kotlin.String?,customerListRequest:CustomerListRequest?,context:OperationRequest):Response<CustomerList>
    /* customerListsGet
     * Get customer list */
    suspend fun customerListsGet(adAccountId:kotlin.String?,customerListId:kotlin.String?,context:OperationRequest):Response<CustomerList>
    /* customerListsList
     * Get customer lists */
    suspend fun customerListsList(adAccountId:kotlin.String?,pageSize:kotlin.Int?,order:kotlin.String?,bookmark:kotlin.String?,context:OperationRequest):Response<CustomerListsList200Response>
    /* customerListsUpdate
     * Update customer list */
    suspend fun customerListsUpdate(adAccountId:kotlin.String?,customerListId:kotlin.String?,customerListUpdateRequest:CustomerListUpdateRequest?,context:OperationRequest):Response<CustomerList>
    companion object {
        const val address = "CustomerListsApi-service"
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
            for (m in CustomerListsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(CustomerListsApi::class.java, address)
            return routerFactory
        }
    }
}
