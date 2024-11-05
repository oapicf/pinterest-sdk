package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AuthRespondInvitesBody
import org.openapitools.server.api.model.CancelInvitesBody
import org.openapitools.server.api.model.CreateAssetAccessRequestBody
import org.openapitools.server.api.model.CreateAssetAccessRequestResponse
import org.openapitools.server.api.model.CreateAssetInvitesRequest
import org.openapitools.server.api.model.CreateInvitesResultsResponseArray
import org.openapitools.server.api.model.CreateMembershipOrPartnershipInvitesBody
import org.openapitools.server.api.model.DeleteInvitesResultsResponseArray
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.GetInvites200Response
import org.openapitools.server.api.model.InviteType
import org.openapitools.server.api.model.RespondToInvitesResponseArray
import org.openapitools.server.api.model.UpdateInvitesResultsResponseArray
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


interface BusinessAccessInviteApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* assetAccessRequestsCreate
     * Create a request to access an existing partner&#39;s assets. */
    suspend fun assetAccessRequestsCreate(businessId:kotlin.String?,createAssetAccessRequestBody:CreateAssetAccessRequestBody?,context:OperationRequest):Response<CreateAssetAccessRequestResponse>
    /* cancelInvitesOrRequests
     * Cancel invites/requests */
    suspend fun cancelInvitesOrRequests(businessId:kotlin.String?,cancelInvitesBody:CancelInvitesBody?,context:OperationRequest):Response<DeleteInvitesResultsResponseArray>
    /* createAssetInvites
     * Update invite/request with an asset permission */
    suspend fun createAssetInvites(businessId:kotlin.String?,createAssetInvitesRequest:CreateAssetInvitesRequest?,context:OperationRequest):Response<UpdateInvitesResultsResponseArray>
    /* createMembershipOrPartnershipInvites
     * Create invites or requests */
    suspend fun createMembershipOrPartnershipInvites(businessId:kotlin.String?,createMembershipOrPartnershipInvitesBody:CreateMembershipOrPartnershipInvitesBody?,context:OperationRequest):Response<CreateInvitesResultsResponseArray>
    /* getInvites
     * Get invites/requests */
    suspend fun getInvites(businessId:kotlin.String?,isMember:kotlin.Boolean?,inviteStatus:kotlin.Array<kotlin.String>?,inviteType:InviteType?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<GetInvites200Response>
    /* respondBusinessAccessInvites
     * Accept or decline an invite/request */
    suspend fun respondBusinessAccessInvites(authRespondInvitesBody:AuthRespondInvitesBody?,context:OperationRequest):Response<RespondToInvitesResponseArray>
    companion object {
        const val address = "BusinessAccessInviteApi-service"
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
            for (m in BusinessAccessInviteApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(BusinessAccessInviteApi::class.java, address)
            return routerFactory
        }
    }
}
