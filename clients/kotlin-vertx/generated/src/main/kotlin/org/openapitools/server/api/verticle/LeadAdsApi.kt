package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AdAccountsSubscriptionsGetList200Response
import org.openapitools.server.api.model.LeadSubscription
import org.openapitools.server.api.model.LeadSubscriptionPostParamsCreate
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


interface LeadAdsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* adAccountsSubscriptionsDelById
     * Delete lead ads subscription */
    suspend fun adAccountsSubscriptionsDelById(adAccountId:kotlin.String?,subscriptionId:kotlin.String?,context:OperationRequest):Response<LeadSubscription>
    /* adAccountsSubscriptionsGetById
     * Get lead ads subscription by ID */
    suspend fun adAccountsSubscriptionsGetById(adAccountId:kotlin.String?,subscriptionId:kotlin.String?,context:OperationRequest):Response<LeadSubscription>
    /* adAccountsSubscriptionsGetList
     * Get lead ads subscriptions */
    suspend fun adAccountsSubscriptionsGetList(adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<AdAccountsSubscriptionsGetList200Response>
    /* adAccountsSubscriptionsPost
     * Create lead ads subscription */
    suspend fun adAccountsSubscriptionsPost(adAccountId:kotlin.String?,leadSubscriptionPostParamsCreate:LeadSubscriptionPostParamsCreate?,context:OperationRequest):Response<LeadSubscription>
    companion object {
        const val address = "LeadAdsApi-service"
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
            for (m in LeadAdsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(LeadAdsApi::class.java, address)
            return routerFactory
        }
    }
}
