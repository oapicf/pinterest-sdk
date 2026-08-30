@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class UserAccountApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation boardsUserFollowsList.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param explicitFollowing query parameter explicitFollowing pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BoardsUserFollowsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun boardsUserFollowsList(adAccountId: StringValuePattern? = null, explicitFollowing: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BoardsUserFollowsListStubBuilder =
        BoardsUserFollowsListStubBuilder(objectMapper, get(urlPathTemplate("/user_account/following/boards"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { explicitFollowing?.let { withQueryParam("explicit_following", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation followUserUpdate.
     *
     * @param username path parameter username pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [FollowUserUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun followUserUpdate(username: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): FollowUserUpdateStubBuilder =
        FollowUserUpdateStubBuilder(objectMapper, post(urlPathTemplate("/user_account/following/{username}"))
            .withPathParam("username", username)
            .configurer()
        )

    /**
     * Construct a stub for the operation followersList.
     *
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [FollowersListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun followersList(bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): FollowersListStubBuilder =
        FollowersListStubBuilder(objectMapper, get(urlPathTemplate("/user_account/followers"))
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation linkedBusinessAccountsGet.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LinkedBusinessAccountsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun linkedBusinessAccountsGet(configurer: MappingBuilder.() -> MappingBuilder = { this }): LinkedBusinessAccountsGetStubBuilder =
        LinkedBusinessAccountsGetStubBuilder(objectMapper, get(urlPathTemplate("/user_account/businesses"))
            .configurer()
        )

    /**
     * Construct a stub for the operation unverifyWebsiteDelete.
     *
     * @param website query parameter website pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UnverifyWebsiteDeleteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun unverifyWebsiteDelete(website: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): UnverifyWebsiteDeleteStubBuilder =
        UnverifyWebsiteDeleteStubBuilder(objectMapper, delete(urlPathTemplate("/user_account/websites"))
            .apply { website?.let { withQueryParam("website", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation userAccountAnalytics.
     *
     * @param startDate query parameter startDate pattern.
     * @param endDate query parameter endDate pattern.
     * @param fromClaimedContent query parameter fromClaimedContent pattern.
     * @param pinFormat query parameter pinFormat pattern.
     * @param appTypes query parameter appTypes pattern.
     * @param contentType query parameter contentType pattern.
     * @param source query parameter source pattern.
     * @param metricTypes query parameter metricTypes pattern.
     * @param splitField query parameter splitField pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UserAccountAnalyticsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun userAccountAnalytics(startDate: StringValuePattern? = null, endDate: StringValuePattern? = null, fromClaimedContent: StringValuePattern? = null, pinFormat: StringValuePattern? = null, appTypes: StringValuePattern? = null, contentType: StringValuePattern? = null, source: StringValuePattern? = null, metricTypes: StringValuePattern? = null, splitField: StringValuePattern? = null, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): UserAccountAnalyticsStubBuilder =
        UserAccountAnalyticsStubBuilder(objectMapper, get(urlPathTemplate("/user_account/analytics"))
            .apply { startDate?.let { withQueryParam("start_date", it) } }
            .apply { endDate?.let { withQueryParam("end_date", it) } }
            .apply { fromClaimedContent?.let { withQueryParam("from_claimed_content", it) } }
            .apply { pinFormat?.let { withQueryParam("pin_format", it) } }
            .apply { appTypes?.let { withQueryParam("app_types", it) } }
            .apply { contentType?.let { withQueryParam("content_type", it) } }
            .apply { source?.let { withQueryParam("source", it) } }
            .apply { metricTypes?.let { withQueryParam("metric_types", it) } }
            .apply { splitField?.let { withQueryParam("split_field", it) } }
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation userAccountAnalyticsTopPins.
     *
     * @param startDate query parameter startDate pattern.
     * @param endDate query parameter endDate pattern.
     * @param sortBy query parameter sortBy pattern.
     * @param fromClaimedContent query parameter fromClaimedContent pattern.
     * @param pinFormat query parameter pinFormat pattern.
     * @param appTypes query parameter appTypes pattern.
     * @param contentType query parameter contentType pattern.
     * @param source query parameter source pattern.
     * @param metricTypes query parameter metricTypes pattern.
     * @param numOfPins query parameter numOfPins pattern.
     * @param createdInLastNDays query parameter createdInLastNDays pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UserAccountAnalyticsTopPinsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun userAccountAnalyticsTopPins(startDate: StringValuePattern? = null, endDate: StringValuePattern? = null, sortBy: StringValuePattern? = null, fromClaimedContent: StringValuePattern? = null, pinFormat: StringValuePattern? = null, appTypes: StringValuePattern? = null, contentType: StringValuePattern? = null, source: StringValuePattern? = null, metricTypes: StringValuePattern? = null, numOfPins: StringValuePattern? = null, createdInLastNDays: StringValuePattern? = null, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): UserAccountAnalyticsTopPinsStubBuilder =
        UserAccountAnalyticsTopPinsStubBuilder(objectMapper, get(urlPathTemplate("/user_account/analytics/top_pins"))
            .apply { startDate?.let { withQueryParam("start_date", it) } }
            .apply { endDate?.let { withQueryParam("end_date", it) } }
            .apply { sortBy?.let { withQueryParam("sort_by", it) } }
            .apply { fromClaimedContent?.let { withQueryParam("from_claimed_content", it) } }
            .apply { pinFormat?.let { withQueryParam("pin_format", it) } }
            .apply { appTypes?.let { withQueryParam("app_types", it) } }
            .apply { contentType?.let { withQueryParam("content_type", it) } }
            .apply { source?.let { withQueryParam("source", it) } }
            .apply { metricTypes?.let { withQueryParam("metric_types", it) } }
            .apply { numOfPins?.let { withQueryParam("num_of_pins", it) } }
            .apply { createdInLastNDays?.let { withQueryParam("created_in_last_n_days", it) } }
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation userAccountAnalyticsTopVideoPins.
     *
     * @param startDate query parameter startDate pattern.
     * @param endDate query parameter endDate pattern.
     * @param sortBy query parameter sortBy pattern.
     * @param fromClaimedContent query parameter fromClaimedContent pattern.
     * @param pinFormat query parameter pinFormat pattern.
     * @param appTypes query parameter appTypes pattern.
     * @param contentType query parameter contentType pattern.
     * @param source query parameter source pattern.
     * @param metricTypes query parameter metricTypes pattern.
     * @param numOfPins query parameter numOfPins pattern.
     * @param createdInLastNDays query parameter createdInLastNDays pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UserAccountAnalyticsTopVideoPinsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun userAccountAnalyticsTopVideoPins(startDate: StringValuePattern? = null, endDate: StringValuePattern? = null, sortBy: StringValuePattern? = null, fromClaimedContent: StringValuePattern? = null, pinFormat: StringValuePattern? = null, appTypes: StringValuePattern? = null, contentType: StringValuePattern? = null, source: StringValuePattern? = null, metricTypes: StringValuePattern? = null, numOfPins: StringValuePattern? = null, createdInLastNDays: StringValuePattern? = null, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): UserAccountAnalyticsTopVideoPinsStubBuilder =
        UserAccountAnalyticsTopVideoPinsStubBuilder(objectMapper, get(urlPathTemplate("/user_account/analytics/top_video_pins"))
            .apply { startDate?.let { withQueryParam("start_date", it) } }
            .apply { endDate?.let { withQueryParam("end_date", it) } }
            .apply { sortBy?.let { withQueryParam("sort_by", it) } }
            .apply { fromClaimedContent?.let { withQueryParam("from_claimed_content", it) } }
            .apply { pinFormat?.let { withQueryParam("pin_format", it) } }
            .apply { appTypes?.let { withQueryParam("app_types", it) } }
            .apply { contentType?.let { withQueryParam("content_type", it) } }
            .apply { source?.let { withQueryParam("source", it) } }
            .apply { metricTypes?.let { withQueryParam("metric_types", it) } }
            .apply { numOfPins?.let { withQueryParam("num_of_pins", it) } }
            .apply { createdInLastNDays?.let { withQueryParam("created_in_last_n_days", it) } }
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation userAccountFollowedInterests.
     *
     * @param username path parameter username pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UserAccountFollowedInterestsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun userAccountFollowedInterests(username: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): UserAccountFollowedInterestsStubBuilder =
        UserAccountFollowedInterestsStubBuilder(objectMapper, get(urlPathTemplate("/users/{username}/interests/follow"))
            .withPathParam("username", username)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation userAccountGet.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UserAccountGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun userAccountGet(adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): UserAccountGetStubBuilder =
        UserAccountGetStubBuilder(objectMapper, get(urlPathTemplate("/user_account"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation userFollowingGet.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param explicitFollowing query parameter explicitFollowing pattern.
     * @param feedType query parameter feedType pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UserFollowingGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun userFollowingGet(adAccountId: StringValuePattern? = null, explicitFollowing: StringValuePattern? = null, feedType: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): UserFollowingGetStubBuilder =
        UserFollowingGetStubBuilder(objectMapper, get(urlPathTemplate("/user_account/following"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { explicitFollowing?.let { withQueryParam("explicit_following", it) } }
            .apply { feedType?.let { withQueryParam("feed_type", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation userWebsitesGet.
     *
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UserWebsitesGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun userWebsitesGet(bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): UserWebsitesGetStubBuilder =
        UserWebsitesGetStubBuilder(objectMapper, get(urlPathTemplate("/user_account/websites"))
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation verifyWebsiteUpdate.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [VerifyWebsiteUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun verifyWebsiteUpdate(adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): VerifyWebsiteUpdateStubBuilder =
        VerifyWebsiteUpdateStubBuilder(objectMapper, post(urlPathTemplate("/user_account/websites"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation websiteVerificationGet.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [WebsiteVerificationGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun websiteVerificationGet(adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): WebsiteVerificationGetStubBuilder =
        WebsiteVerificationGetStubBuilder(objectMapper, get(urlPathTemplate("/user_account/websites/verification"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )
}
