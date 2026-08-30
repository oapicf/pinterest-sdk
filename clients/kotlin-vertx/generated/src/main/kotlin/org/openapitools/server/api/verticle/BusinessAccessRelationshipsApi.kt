package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.BrandAccount
import org.openapitools.server.api.model.BrandAccountCreate
import org.openapitools.server.api.model.BrandAccountUpdate
import org.openapitools.server.api.model.BusinessMembershipMember
import org.openapitools.server.api.model.DeleteBusinessMembership200Response
import org.openapitools.server.api.model.DeleteBusinessMembershipBody
import org.openapitools.server.api.model.DeleteBusinessPartners
import org.openapitools.server.api.model.DeleteBusinessPartnersDelete
import org.openapitools.server.api.model.GetBusinessEmployers200Response
import org.openapitools.server.api.model.MemberBusinessRole
import org.openapitools.server.api.model.PartnerType
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.SystemUserUpdateWithRequiredBody
import org.openapitools.server.api.model.UpdateBusinessMembershipsResponse
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


interface BusinessAccessRelationshipsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* brandAccountsCreate
     * Create a Brand Account */
    suspend fun brandAccountsCreate(businessHierarchyId:kotlin.String?,brandAccountCreate:BrandAccountCreate?,context:OperationRequest):Response<BrandAccount>
    /* brandAccountsUpdate
     * Update a Brand Account */
    suspend fun brandAccountsUpdate(brandAccountId:kotlin.String?,businessHierarchyId:kotlin.String?,brandAccountUpdate:BrandAccountUpdate?,context:OperationRequest):Response<BrandAccount>
    /* deleteBusinessMembership
     * Terminate business memberships */
    suspend fun deleteBusinessMembership(businessId:kotlin.String?,deleteBusinessMembershipBody:DeleteBusinessMembershipBody?,context:OperationRequest):Response<DeleteBusinessMembership200Response>
    /* deleteBusinessPartners
     * Terminate business partnerships */
    suspend fun deleteBusinessPartners(businessId:kotlin.String?,deleteBusinessPartnersDelete:DeleteBusinessPartnersDelete?,context:OperationRequest):Response<DeleteBusinessPartners>
    /* getBusinessEmployers
     * List business employers for user */
    suspend fun getBusinessEmployers(assetsSummary:kotlin.Boolean?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<GetBusinessEmployers200Response>
    /* getBusinessMembers
     * Get business members */
    suspend fun getBusinessMembers(businessId:kotlin.String?,fetchSystemUsers:kotlin.Boolean?,assetsSummary:kotlin.Boolean?,businessRoles:kotlin.Array<MemberBusinessRole>?,memberIds:kotlin.String?,startIndex:kotlin.Int?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<GetBusinessEmployers200Response>
    /* getBusinessPartners
     * Get business partners */
    suspend fun getBusinessPartners(businessId:kotlin.String?,assetsSummary:kotlin.Boolean?,partnerType:PartnerType?,partnerIds:kotlin.String?,startIndex:kotlin.Int?,sortAscending:kotlin.Boolean?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<GetBusinessEmployers200Response>
    /* systemUserUpdate
     * Update a system user information. */
    suspend fun systemUserUpdate(businessId:kotlin.String?,systemUserId:kotlin.String?,systemUserUpdateWithRequiredBody:SystemUserUpdateWithRequiredBody?,context:OperationRequest):Response<Void>
    /* updateBusinessMemberships
     * Update member&#39;s business role */
    suspend fun updateBusinessMemberships(businessId:kotlin.String?,businessMembershipMember:kotlin.Array<BusinessMembershipMember>?,context:OperationRequest):Response<UpdateBusinessMembershipsResponse>
    companion object {
        const val address = "BusinessAccessRelationshipsApi-service"
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
            for (m in BusinessAccessRelationshipsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(BusinessAccessRelationshipsApi::class.java, address)
            return routerFactory
        }
    }
}
