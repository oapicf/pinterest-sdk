package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.CustomerSegment
import org.openapitools.server.api.model.CustomerSegmentCreate
import org.openapitools.server.api.model.CustomerSegmentList200Response
import org.openapitools.server.api.model.CustomerSegmentUpdateRequestUpdateWithRequiredBody
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
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


interface CustomerSegmentApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* customerSegmentCreate
     * Create customer segments */
    suspend fun customerSegmentCreate(adAccountId:kotlin.String?,customerSegmentCreate:CustomerSegmentCreate?,context:OperationRequest):Response<CustomerSegment>
    /* customerSegmentList
     * List customer segments */
    suspend fun customerSegmentList(adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,order:PinterestLibPaginationOrder?,includeSizing:kotlin.Boolean?,searchQuery:kotlin.String?,context:OperationRequest):Response<CustomerSegmentList200Response>
    /* customerSegmentUpdate
     * Update customer segments */
    suspend fun customerSegmentUpdate(adAccountId:kotlin.String?,customerSegmentUpdateRequestUpdateWithRequiredBody:CustomerSegmentUpdateRequestUpdateWithRequiredBody?,context:OperationRequest):Response<Void>
    companion object {
        const val address = "CustomerSegmentApi-service"
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
            for (m in CustomerSegmentApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(CustomerSegmentApi::class.java, address)
            return routerFactory
        }
    }
}
