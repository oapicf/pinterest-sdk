package org.openapitools.api

import org.openapitools.model.Account
import org.openapitools.model.AnalyticsMetricsResponse
import org.openapitools.model.BoardsList200Response
import org.openapitools.model.FollowUser
import org.openapitools.model.FollowUserCreate
import org.openapitools.model.FollowersList200Response
import org.openapitools.model.LinkedBusiness
import org.openapitools.model.PinterestLibError
import org.openapitools.model.QuerymetrictypesItems
import org.openapitools.model.QueryvideopinmetrictypesItems
import org.openapitools.model.TopPinsAnalyticsResponse
import org.openapitools.model.TopPinsSortBy
import org.openapitools.model.TopVideoPinsAnalyticsResponse
import org.openapitools.model.TopVideoPinsSortBy
import org.openapitools.model.UserFollowingFeedType
import org.openapitools.model.UserWebsite
import org.openapitools.model.UserWebsiteCreate
import org.openapitools.model.UserWebsiteVerification
import org.openapitools.model.UserWebsitesGet200Response
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class UserAccountApiTest {

    private val api: UserAccountApiController = UserAccountApiController()

    /**
     * To test UserAccountApiController.boardsUserFollowsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun boardsUserFollowsListTest() {
        val adAccountId: kotlin.String? = TODO()
        val explicitFollowing: kotlin.Boolean = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<BoardsList200Response> = api.boardsUserFollowsList(adAccountId, explicitFollowing, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test UserAccountApiController.followUserUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun followUserUpdateTest() {
        val username: kotlin.String = TODO()
        val followUserCreate: FollowUserCreate = TODO()
        
        
        val response: ResponseEntity<FollowUser> = api.followUserUpdate(username, followUserCreate)

        // TODO: test validations
    }

    /**
     * To test UserAccountApiController.followersList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun followersListTest() {
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<FollowersList200Response> = api.followersList(bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test UserAccountApiController.linkedBusinessAccountsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun linkedBusinessAccountsGetTest() {
        
        
        val response: ResponseEntity<List<LinkedBusiness>> = api.linkedBusinessAccountsGet()

        // TODO: test validations
    }

    /**
     * To test UserAccountApiController.unverifyWebsiteDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun unverifyWebsiteDeleteTest() {
        val website: kotlin.String = TODO()
        
        
        val response: ResponseEntity<UserWebsite> = api.unverifyWebsiteDelete(website)

        // TODO: test validations
    }

    /**
     * To test UserAccountApiController.userAccountAnalytics
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun userAccountAnalyticsTest() {
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val fromClaimedContent: kotlin.String = TODO()
        val pinFormat: kotlin.String = TODO()
        val appTypes: kotlin.String = TODO()
        val contentType: kotlin.String = TODO()
        val source: kotlin.String = TODO()
        val metricTypes: kotlin.collections.List<QuerymetrictypesItems>? = TODO()
        val splitField: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<Map<String, AnalyticsMetricsResponse>> = api.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId)

        // TODO: test validations
    }

    /**
     * To test UserAccountApiController.userAccountAnalyticsTopPins
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun userAccountAnalyticsTopPinsTest() {
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val sortBy: TopPinsSortBy = TODO()
        val fromClaimedContent: kotlin.String = TODO()
        val pinFormat: kotlin.String = TODO()
        val appTypes: kotlin.String = TODO()
        val contentType: kotlin.String = TODO()
        val source: kotlin.String = TODO()
        val metricTypes: kotlin.collections.List<QuerymetrictypesItems>? = TODO()
        val numOfPins: kotlin.Int = TODO()
        val createdInLastNDays: java.math.BigDecimal? = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<TopPinsAnalyticsResponse> = api.userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)

        // TODO: test validations
    }

    /**
     * To test UserAccountApiController.userAccountAnalyticsTopVideoPins
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun userAccountAnalyticsTopVideoPinsTest() {
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val sortBy: TopVideoPinsSortBy = TODO()
        val fromClaimedContent: kotlin.String = TODO()
        val pinFormat: kotlin.String = TODO()
        val appTypes: kotlin.String = TODO()
        val contentType: kotlin.String = TODO()
        val source: kotlin.String = TODO()
        val metricTypes: kotlin.collections.List<QueryvideopinmetrictypesItems>? = TODO()
        val numOfPins: kotlin.Int = TODO()
        val createdInLastNDays: java.math.BigDecimal? = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<TopVideoPinsAnalyticsResponse> = api.userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)

        // TODO: test validations
    }

    /**
     * To test UserAccountApiController.userAccountGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun userAccountGetTest() {
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<Account> = api.userAccountGet(adAccountId)

        // TODO: test validations
    }

    /**
     * To test UserAccountApiController.userFollowingGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun userFollowingGetTest() {
        val adAccountId: kotlin.String? = TODO()
        val explicitFollowing: kotlin.Boolean = TODO()
        val feedType: UserFollowingFeedType = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<FollowersList200Response> = api.userFollowingGet(adAccountId, explicitFollowing, feedType, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test UserAccountApiController.userWebsitesGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun userWebsitesGetTest() {
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<UserWebsitesGet200Response> = api.userWebsitesGet(bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test UserAccountApiController.verifyWebsiteUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun verifyWebsiteUpdateTest() {
        val userWebsiteCreate: UserWebsiteCreate = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<UserWebsite> = api.verifyWebsiteUpdate(userWebsiteCreate, adAccountId)

        // TODO: test validations
    }

    /**
     * To test UserAccountApiController.websiteVerificationGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun websiteVerificationGetTest() {
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<UserWebsiteVerification> = api.websiteVerificationGet(adAccountId)

        // TODO: test validations
    }
}
