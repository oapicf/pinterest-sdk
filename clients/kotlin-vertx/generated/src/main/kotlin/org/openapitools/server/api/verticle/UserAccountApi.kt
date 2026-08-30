package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.Account
import org.openapitools.server.api.model.AnalyticsMetricsResponse
import org.openapitools.server.api.model.BoardsList200Response
import org.openapitools.server.api.model.FollowUser
import org.openapitools.server.api.model.FollowUserCreate
import org.openapitools.server.api.model.FollowersList200Response
import org.openapitools.server.api.model.LinkedBusiness
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.QuerymetrictypesItems
import org.openapitools.server.api.model.QueryvideopinmetrictypesItems
import org.openapitools.server.api.model.TopPinsAnalyticsResponse
import org.openapitools.server.api.model.TopPinsSortBy
import org.openapitools.server.api.model.TopVideoPinsAnalyticsResponse
import org.openapitools.server.api.model.TopVideoPinsSortBy
import org.openapitools.server.api.model.UserAccountFollowedInterests200Response
import org.openapitools.server.api.model.UserFollowingFeedType
import org.openapitools.server.api.model.UserWebsite
import org.openapitools.server.api.model.UserWebsiteCreate
import org.openapitools.server.api.model.UserWebsiteVerification
import org.openapitools.server.api.model.UserWebsitesGet200Response
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


interface UserAccountApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* boardsUserFollowsList
     * List following boards */
    suspend fun boardsUserFollowsList(adAccountId:kotlin.String?,explicitFollowing:kotlin.Boolean?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<BoardsList200Response>
    /* followUserUpdate
     * Follow user */
    suspend fun followUserUpdate(username:kotlin.String?,followUserCreate:FollowUserCreate?,context:OperationRequest):Response<FollowUser>
    /* followersList
     * List followers */
    suspend fun followersList(bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<FollowersList200Response>
    /* linkedBusinessAccountsGet
     * List linked businesses */
    suspend fun linkedBusinessAccountsGet(context:OperationRequest):Response<kotlin.Array<LinkedBusiness>>
    /* unverifyWebsiteDelete
     * Unverify website */
    suspend fun unverifyWebsiteDelete(website:kotlin.String?,context:OperationRequest):Response<UserWebsite>
    /* userAccountAnalytics
     * Get user account analytics */
    suspend fun userAccountAnalytics(startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,fromClaimedContent:kotlin.String?,pinFormat:kotlin.String?,appTypes:kotlin.String?,contentType:kotlin.String?,source:kotlin.String?,metricTypes:kotlin.Array<QuerymetrictypesItems>?,splitField:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<kotlin.collections.Map<kotlin.String, AnalyticsMetricsResponse>>
    /* userAccountAnalyticsTopPins
     * Get user account top pins analytics */
    suspend fun userAccountAnalyticsTopPins(startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,sortBy:TopPinsSortBy?,fromClaimedContent:kotlin.String?,pinFormat:kotlin.String?,appTypes:kotlin.String?,contentType:kotlin.String?,source:kotlin.String?,metricTypes:kotlin.Array<QuerymetrictypesItems>?,numOfPins:kotlin.Int?,createdInLastNDays:java.math.BigDecimal?,adAccountId:kotlin.String?,context:OperationRequest):Response<TopPinsAnalyticsResponse>
    /* userAccountAnalyticsTopVideoPins
     * Get user account top video pins analytics */
    suspend fun userAccountAnalyticsTopVideoPins(startDate:java.time.LocalDate?,endDate:java.time.LocalDate?,sortBy:TopVideoPinsSortBy?,fromClaimedContent:kotlin.String?,pinFormat:kotlin.String?,appTypes:kotlin.String?,contentType:kotlin.String?,source:kotlin.String?,metricTypes:kotlin.Array<QueryvideopinmetrictypesItems>?,numOfPins:kotlin.Int?,createdInLastNDays:java.math.BigDecimal?,adAccountId:kotlin.String?,context:OperationRequest):Response<TopVideoPinsAnalyticsResponse>
    /* userAccountFollowedInterests
     * List following interests */
    suspend fun userAccountFollowedInterests(username:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<UserAccountFollowedInterests200Response>
    /* userAccountGet
     * Get user account */
    suspend fun userAccountGet(adAccountId:kotlin.String?,context:OperationRequest):Response<Account>
    /* userFollowingGet
     * List following */
    suspend fun userFollowingGet(adAccountId:kotlin.String?,explicitFollowing:kotlin.Boolean?,feedType:UserFollowingFeedType?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<FollowersList200Response>
    /* userWebsitesGet
     * Get user websites */
    suspend fun userWebsitesGet(bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<UserWebsitesGet200Response>
    /* verifyWebsiteUpdate
     * Verify website */
    suspend fun verifyWebsiteUpdate(userWebsiteCreate:UserWebsiteCreate?,adAccountId:kotlin.String?,context:OperationRequest):Response<UserWebsite>
    /* websiteVerificationGet
     * Get user verification code for website claiming */
    suspend fun websiteVerificationGet(adAccountId:kotlin.String?,context:OperationRequest):Response<UserWebsiteVerification>
    companion object {
        const val address = "UserAccountApi-service"
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
            for (m in UserAccountApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(UserAccountApi::class.java, address)
            return routerFactory
        }
    }
}
