package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.BusinessAssetMembersGet200Response
import org.openapitools.server.api.model.BusinessAssetPartnersGet200Response
import org.openapitools.server.api.model.BusinessAssetsGet200Response
import org.openapitools.server.api.model.BusinessMemberAssetsGet200Response
import org.openapitools.server.api.model.BusinessMembersAssetAccessDeleteRequest
import org.openapitools.server.api.model.BusinessPartnerAssetAccessGet200Response
import org.openapitools.server.api.model.CreateAssetGroupBody
import org.openapitools.server.api.model.CreateAssetGroupResponse
import org.openapitools.server.api.model.DeleteAssetGroupBody
import org.openapitools.server.api.model.DeleteAssetGroupResponse
import org.openapitools.server.api.model.DeleteMemberAccessResultsResponseArray
import org.openapitools.server.api.model.DeletePartnerAssetAccessBody
import org.openapitools.server.api.model.DeletePartnerAssetsResultsResponseArray
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.PartnerType
import org.openapitools.server.api.model.PermissionsWithOwner
import org.openapitools.server.api.model.UpdateAssetGroupBody
import org.openapitools.server.api.model.UpdateAssetGroupResponse
import org.openapitools.server.api.model.UpdateMemberAssetAccessBody
import org.openapitools.server.api.model.UpdateMemberAssetsResultsResponseArray
import org.openapitools.server.api.model.UpdatePartnerAssetAccessBody
import org.openapitools.server.api.model.UpdatePartnerAssetsResultsResponseArray
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


interface BusinessAccessAssetsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* assetGroupCreate
     * Create a new asset group. */
    suspend fun assetGroupCreate(businessId:kotlin.String?,createAssetGroupBody:CreateAssetGroupBody?,context:OperationRequest):Response<CreateAssetGroupResponse>
    /* assetGroupDelete
     * Delete asset groups. */
    suspend fun assetGroupDelete(businessId:kotlin.String?,deleteAssetGroupBody:DeleteAssetGroupBody?,context:OperationRequest):Response<DeleteAssetGroupResponse>
    /* assetGroupUpdate
     * Update asset groups. */
    suspend fun assetGroupUpdate(businessId:kotlin.String?,updateAssetGroupBody:UpdateAssetGroupBody?,context:OperationRequest):Response<UpdateAssetGroupResponse>
    /* businessAssetMembersGet
     * Get members with access to asset */
    suspend fun businessAssetMembersGet(businessId:kotlin.String?,assetId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,startIndex:kotlin.Int?,context:OperationRequest):Response<BusinessAssetMembersGet200Response>
    /* businessAssetPartnersGet
     * Get partners with access to asset */
    suspend fun businessAssetPartnersGet(businessId:kotlin.String?,assetId:kotlin.String?,startIndex:kotlin.Int?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<BusinessAssetPartnersGet200Response>
    /* businessAssetsGet
     * List business assets */
    suspend fun businessAssetsGet(businessId:kotlin.String?,permissions:kotlin.Array<PermissionsWithOwner>?,childAssetId:kotlin.String?,assetGroupId:kotlin.String?,assetType:kotlin.String?,startIndex:kotlin.Int?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<BusinessAssetsGet200Response>
    /* businessMemberAssetsGet
     * Get assets assigned to a member */
    suspend fun businessMemberAssetsGet(businessId:kotlin.String?,memberId:kotlin.String?,assetType:kotlin.String?,startIndex:kotlin.Int?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<BusinessMemberAssetsGet200Response>
    /* businessMembersAssetAccessDelete
     * Delete member access to asset */
    suspend fun businessMembersAssetAccessDelete(businessId:kotlin.String?,businessMembersAssetAccessDeleteRequest:BusinessMembersAssetAccessDeleteRequest?,context:OperationRequest):Response<DeleteMemberAccessResultsResponseArray>
    /* businessMembersAssetAccessUpdate
     * Assign/Update member asset permissions */
    suspend fun businessMembersAssetAccessUpdate(businessId:kotlin.String?,updateMemberAssetAccessBody:UpdateMemberAssetAccessBody?,context:OperationRequest):Response<UpdateMemberAssetsResultsResponseArray>
    /* businessPartnerAssetAccessGet
     * Get assets assigned to a partner or assets assigned by a partner */
    suspend fun businessPartnerAssetAccessGet(businessId:kotlin.String?,partnerId:kotlin.String?,partnerType:PartnerType?,assetType:kotlin.String?,startIndex:kotlin.Int?,pageSize:kotlin.Int?,bookmark:kotlin.String?,context:OperationRequest):Response<BusinessPartnerAssetAccessGet200Response>
    /* deletePartnerAssetAccessHandlerImpl
     * Delete partner access to asset */
    suspend fun deletePartnerAssetAccessHandlerImpl(businessId:kotlin.String?,deletePartnerAssetAccessBody:DeletePartnerAssetAccessBody?,context:OperationRequest):Response<DeletePartnerAssetsResultsResponseArray>
    /* updatePartnerAssetAccessHandlerImpl
     * Assign/Update partner asset permissions */
    suspend fun updatePartnerAssetAccessHandlerImpl(businessId:kotlin.String?,updatePartnerAssetAccessBody:UpdatePartnerAssetAccessBody?,context:OperationRequest):Response<UpdatePartnerAssetsResultsResponseArray>
    companion object {
        const val address = "BusinessAccessAssetsApi-service"
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
            for (m in BusinessAccessAssetsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(BusinessAccessAssetsApi::class.java, address)
            return routerFactory
        }
    }
}
