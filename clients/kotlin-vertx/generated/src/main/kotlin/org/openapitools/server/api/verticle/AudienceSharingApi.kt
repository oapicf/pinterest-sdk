package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AdAccountToAdAccountSharedAudience
import org.openapitools.server.api.model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
import org.openapitools.server.api.model.AdAccountToBusinessSharedAudience
import org.openapitools.server.api.model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
import org.openapitools.server.api.model.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.server.api.model.AudienceAccountType
import org.openapitools.server.api.model.BusinessToAdAccountSharedAudience
import org.openapitools.server.api.model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
import org.openapitools.server.api.model.BusinessToBusinessSharedAudience
import org.openapitools.server.api.model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody
import org.openapitools.server.api.model.Order
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.SharedAudiencesForBusinessList200Response
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


interface AudienceSharingApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* adAccountsAudiencesSharedAccountsList
     * List accounts with access to an audience owned by an ad account */
    suspend fun adAccountsAudiencesSharedAccountsList(audienceId:kotlin.String?,accountType:AudienceAccountType?,adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<AdAccountsAudiencesSharedAccountsList200Response>
    /* businessAccountAudiencesSharedAccountsList
     * List accounts with access to an audience owned by a business */
    suspend fun businessAccountAudiencesSharedAccountsList(businessId:kotlin.String?,audienceId:kotlin.String?,accountType:AudienceAccountType?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<AdAccountsAudiencesSharedAccountsList200Response>
    /* sharedAudiencesForBusinessList
     * List received audiences for a business */
    suspend fun sharedAudiencesForBusinessList(businessId:kotlin.String?,order:Order?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<SharedAudiencesForBusinessList200Response>
    /* updateAdAccountToAdAccountSharedAudience
     * Update audience sharing between ad accounts */
    suspend fun updateAdAccountToAdAccountSharedAudience(adAccountId:kotlin.String?,adAccountToAdAccountSharedAudienceUpdateWithRequiredBody:AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody?,context:OperationRequest):Response<AdAccountToAdAccountSharedAudience>
    /* updateAdAccountToBusinessSharedAudience
     * Update audience sharing from an ad account to businesses */
    suspend fun updateAdAccountToBusinessSharedAudience(adAccountId:kotlin.String?,adAccountToBusinessSharedAudienceUpdateWithRequiredBody:AdAccountToBusinessSharedAudienceUpdateWithRequiredBody?,context:OperationRequest):Response<AdAccountToBusinessSharedAudience>
    /* updateBusinessToAdAccountSharedAudience
     * Update audience sharing from a business to ad accounts */
    suspend fun updateBusinessToAdAccountSharedAudience(businessId:kotlin.String?,businessToAdAccountSharedAudienceUpdateWithRequiredBody:BusinessToAdAccountSharedAudienceUpdateWithRequiredBody?,context:OperationRequest):Response<BusinessToAdAccountSharedAudience>
    /* updateBusinessToBusinessSharedAudience
     * Update audience sharing between businesses */
    suspend fun updateBusinessToBusinessSharedAudience(businessId:kotlin.String?,businessToBusinessSharedAudienceUpdateWithRequiredBody:BusinessToBusinessSharedAudienceUpdateWithRequiredBody?,context:OperationRequest):Response<BusinessToBusinessSharedAudience>
    companion object {
        const val address = "AudienceSharingApi-service"
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
            for (m in AudienceSharingApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(AudienceSharingApi::class.java, address)
            return routerFactory
        }
    }
}
