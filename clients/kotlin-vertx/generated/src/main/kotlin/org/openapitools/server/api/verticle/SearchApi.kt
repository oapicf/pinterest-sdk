package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.PinsList200Response
import org.openapitools.server.api.model.SearchPartnerPins200Response
import org.openapitools.server.api.model.SearchUserBoardsGet200Response
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


interface SearchApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* searchPartnerPins
     * Search pins by a given search term */
    suspend fun searchPartnerPins(term:kotlin.String?,countryCode:kotlin.String?,bookmark:kotlin.String?,locale:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<SearchPartnerPins200Response>
    /* searchUserBoardsGet
     * Search user&#39;s boards */
    suspend fun searchUserBoardsGet(adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,query:kotlin.String?,context:OperationRequest):Response<SearchUserBoardsGet200Response>
    /* searchUserPinsList
     * Search user&#39;s Pins */
    suspend fun searchUserPinsList(query:kotlin.String?,adAccountId:kotlin.String?,bookmark:kotlin.String?,context:OperationRequest):Response<PinsList200Response>
    companion object {
        const val address = "SearchApi-service"
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
            for (m in SearchApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(SearchApi::class.java, address)
            return routerFactory
        }
    }
}
