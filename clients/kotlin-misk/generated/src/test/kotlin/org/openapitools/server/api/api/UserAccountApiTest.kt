package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
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

@MiskTest(startService = true)
internal class UserAccountApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var userAccountApi: UserAccountApiAction

    /**
     * To test UserAccountApiAction.boardsUserFollowsList
     */
    @Test
    fun `should handle boardsUserFollowsList`() {
        val adAccountId = TODO()
        val explicitFollowing = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: BoardsList200Response = userAccountApi.boardsUserFollowsList(adAccountId, explicitFollowing, bookmark, pageSize)
    }

    /**
     * To test UserAccountApiAction.followUserUpdate
     */
    @Test
    fun `should handle followUserUpdate`() {
        val username = TODO()
        val followUserCreate = TODO()
        val response: FollowUser = userAccountApi.followUserUpdate(username, followUserCreate)
    }

    /**
     * To test UserAccountApiAction.followersList
     */
    @Test
    fun `should handle followersList`() {
        val bookmark = TODO()
        val pageSize = TODO()
        val response: FollowersList200Response = userAccountApi.followersList(bookmark, pageSize)
    }

    /**
     * To test UserAccountApiAction.linkedBusinessAccountsGet
     */
    @Test
    fun `should handle linkedBusinessAccountsGet`() {
        val response: kotlin.collections.List<LinkedBusiness> = userAccountApi.linkedBusinessAccountsGet()
    }

    /**
     * To test UserAccountApiAction.unverifyWebsiteDelete
     */
    @Test
    fun `should handle unverifyWebsiteDelete`() {
        val website = TODO()
        val response: UserWebsite = userAccountApi.unverifyWebsiteDelete(website)
    }

    /**
     * To test UserAccountApiAction.userAccountAnalytics
     */
    @Test
    fun `should handle userAccountAnalytics`() {
        val startDate = TODO()
        val endDate = TODO()
        val fromClaimedContent = TODO()
        val pinFormat = TODO()
        val appTypes = TODO()
        val contentType = TODO()
        val source = TODO()
        val metricTypes = TODO()
        val splitField = TODO()
        val adAccountId = TODO()
        val response: kotlin.collections.Map<kotlin.String, AnalyticsMetricsResponse> = userAccountApi.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId)
    }

    /**
     * To test UserAccountApiAction.userAccountAnalyticsTopPins
     */
    @Test
    fun `should handle userAccountAnalyticsTopPins`() {
        val startDate = TODO()
        val endDate = TODO()
        val sortBy = TODO()
        val fromClaimedContent = TODO()
        val pinFormat = TODO()
        val appTypes = TODO()
        val contentType = TODO()
        val source = TODO()
        val metricTypes = TODO()
        val numOfPins = TODO()
        val createdInLastNDays = TODO()
        val adAccountId = TODO()
        val response: TopPinsAnalyticsResponse = userAccountApi.userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)
    }

    /**
     * To test UserAccountApiAction.userAccountAnalyticsTopVideoPins
     */
    @Test
    fun `should handle userAccountAnalyticsTopVideoPins`() {
        val startDate = TODO()
        val endDate = TODO()
        val sortBy = TODO()
        val fromClaimedContent = TODO()
        val pinFormat = TODO()
        val appTypes = TODO()
        val contentType = TODO()
        val source = TODO()
        val metricTypes = TODO()
        val numOfPins = TODO()
        val createdInLastNDays = TODO()
        val adAccountId = TODO()
        val response: TopVideoPinsAnalyticsResponse = userAccountApi.userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)
    }

    /**
     * To test UserAccountApiAction.userAccountFollowedInterests
     */
    @Test
    fun `should handle userAccountFollowedInterests`() {
        val username = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: UserAccountFollowedInterests200Response = userAccountApi.userAccountFollowedInterests(username, bookmark, pageSize)
    }

    /**
     * To test UserAccountApiAction.userAccountGet
     */
    @Test
    fun `should handle userAccountGet`() {
        val adAccountId = TODO()
        val response: Account = userAccountApi.userAccountGet(adAccountId)
    }

    /**
     * To test UserAccountApiAction.userFollowingGet
     */
    @Test
    fun `should handle userFollowingGet`() {
        val adAccountId = TODO()
        val explicitFollowing = TODO()
        val feedType = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: FollowersList200Response = userAccountApi.userFollowingGet(adAccountId, explicitFollowing, feedType, bookmark, pageSize)
    }

    /**
     * To test UserAccountApiAction.userWebsitesGet
     */
    @Test
    fun `should handle userWebsitesGet`() {
        val bookmark = TODO()
        val pageSize = TODO()
        val response: UserWebsitesGet200Response = userAccountApi.userWebsitesGet(bookmark, pageSize)
    }

    /**
     * To test UserAccountApiAction.verifyWebsiteUpdate
     */
    @Test
    fun `should handle verifyWebsiteUpdate`() {
        val userWebsiteCreate = TODO()
        val adAccountId = TODO()
        val response: UserWebsite = userAccountApi.verifyWebsiteUpdate(userWebsiteCreate, adAccountId)
    }

    /**
     * To test UserAccountApiAction.websiteVerificationGet
     */
    @Test
    fun `should handle websiteVerificationGet`() {
        val adAccountId = TODO()
        val response: UserWebsiteVerification = userAccountApi.websiteVerificationGet(adAccountId)
    }
}
