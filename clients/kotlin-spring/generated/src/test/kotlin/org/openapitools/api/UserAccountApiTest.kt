package org.openapitools.api

import org.openapitools.model.Account
import org.openapitools.model.AnalyticsMetricsResponse
import org.openapitools.model.BoardsUserFollowsList200Response
import org.openapitools.model.Error
import org.openapitools.model.FollowUserRequest
import org.openapitools.model.FollowersList200Response
import org.openapitools.model.LinkedBusiness
import org.openapitools.model.TopPinsAnalyticsResponse
import org.openapitools.model.TopVideoPinsAnalyticsResponse
import org.openapitools.model.UserFollowingFeedType
import org.openapitools.model.UserFollowingGet200Response
import org.openapitools.model.UserSummary
import org.openapitools.model.UserWebsiteSummary
import org.openapitools.model.UserWebsiteVerificationCode
import org.openapitools.model.UserWebsiteVerifyRequest
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
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val explicitFollowing: kotlin.Boolean = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<BoardsUserFollowsList200Response> = api.boardsUserFollowsList(bookmark, pageSize, explicitFollowing, adAccountId)

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
        val followUserRequest: FollowUserRequest = TODO()
        val response: ResponseEntity<UserSummary> = api.followUserUpdate(username, followUserRequest)

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
        val response: ResponseEntity<Unit> = api.unverifyWebsiteDelete(website)

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
        val metricTypes: kotlin.collections.List<kotlin.String>? = TODO()
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
        val sortBy: kotlin.String = TODO()
        val fromClaimedContent: kotlin.String = TODO()
        val pinFormat: kotlin.String = TODO()
        val appTypes: kotlin.String = TODO()
        val contentType: kotlin.String = TODO()
        val source: kotlin.String = TODO()
        val metricTypes: kotlin.collections.List<kotlin.String>? = TODO()
        val numOfPins: kotlin.Int = TODO()
        val createdInLastNDays: kotlin.Int? = TODO()
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
        val sortBy: kotlin.String = TODO()
        val fromClaimedContent: kotlin.String = TODO()
        val pinFormat: kotlin.String = TODO()
        val appTypes: kotlin.String = TODO()
        val contentType: kotlin.String = TODO()
        val source: kotlin.String = TODO()
        val metricTypes: kotlin.collections.List<kotlin.String>? = TODO()
        val numOfPins: kotlin.Int = TODO()
        val createdInLastNDays: kotlin.Int? = TODO()
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
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val feedType: UserFollowingFeedType = TODO()
        val explicitFollowing: kotlin.Boolean = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<UserFollowingGet200Response> = api.userFollowingGet(bookmark, pageSize, feedType, explicitFollowing, adAccountId)

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
        val userWebsiteVerifyRequest: UserWebsiteVerifyRequest = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<UserWebsiteSummary> = api.verifyWebsiteUpdate(userWebsiteVerifyRequest, adAccountId)

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
        val response: ResponseEntity<UserWebsiteVerificationCode> = api.websiteVerificationGet(adAccountId)

        // TODO: test validations
    }
}
