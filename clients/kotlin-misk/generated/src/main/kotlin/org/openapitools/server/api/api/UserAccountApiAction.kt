package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
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

/**
* @TODO("Fill out implementation")
*/
@Singleton
class UserAccountApiAction @Inject constructor(
) : WebAction {

    @Get("/user_account/following/boards")
    @Description("List following boards")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun boardsUserFollowsList(
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "explicit_following") explicitFollowing: kotlin.Boolean, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): BoardsList200Response {
        TODO()
    }

    @Post("/user_account/following/{username}")
    @Description("Follow user")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun followUserUpdate(
        @Pattern(regexp="(?!^\\d+$)^.+$") @PathParam("username") username: kotlin.String, 
        @Valid @RequestBody followUserCreate: FollowUserCreate
    ): FollowUser {
        TODO()
    }

    @Get("/user_account/followers")
    @Description("List followers")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun followersList(
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): FollowersList200Response {
        TODO()
    }

    @Get("/user_account/businesses")
    @Description("List linked businesses")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun linkedBusinessAccountsGet(
    ): kotlin.collections.List<LinkedBusiness> {
        TODO()
    }

    @Delete("/user_account/websites")
    @Description("Unverify website")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun unverifyWebsiteDelete(
         @QueryParam(value = "website") website: kotlin.String
    ): UserWebsite {
        TODO()
    }

    @Get("/user_account/analytics")
    @Description("Get user account analytics")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun userAccountAnalytics(
         @QueryParam(value = "start_date") startDate: java.time.LocalDate, 
         @QueryParam(value = "end_date") endDate: java.time.LocalDate, 
         @QueryParam(value = "from_claimed_content") fromClaimedContent: kotlin.String, 
         @QueryParam(value = "pin_format") pinFormat: kotlin.String, 
         @QueryParam(value = "app_types") appTypes: kotlin.String, 
         @QueryParam(value = "content_type") contentType: kotlin.String, 
         @QueryParam(value = "source") source: kotlin.String, 
         @QueryParam(value = "metric_types") metricTypes: kotlin.collections.List<QuerymetrictypesItems>?, 
         @QueryParam(value = "split_field") splitField: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): kotlin.collections.Map<kotlin.String, AnalyticsMetricsResponse> {
        TODO()
    }

    @Get("/user_account/analytics/top_pins")
    @Description("Get user account top pins analytics")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun userAccountAnalyticsTopPins(
         @QueryParam(value = "start_date") startDate: java.time.LocalDate, 
         @QueryParam(value = "end_date") endDate: java.time.LocalDate, 
         @QueryParam(value = "sort_by") sortBy: TopPinsSortBy, 
         @QueryParam(value = "from_claimed_content") fromClaimedContent: kotlin.String, 
         @QueryParam(value = "pin_format") pinFormat: kotlin.String, 
         @QueryParam(value = "app_types") appTypes: kotlin.String, 
         @QueryParam(value = "content_type") contentType: kotlin.String, 
         @QueryParam(value = "source") source: kotlin.String, 
         @QueryParam(value = "metric_types") metricTypes: kotlin.collections.List<QuerymetrictypesItems>?, 
         @QueryParam(value = "num_of_pins") numOfPins: kotlin.Int, 
         @QueryParam(value = "created_in_last_n_days") createdInLastNDays: java.math.BigDecimal?, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): TopPinsAnalyticsResponse {
        TODO()
    }

    @Get("/user_account/analytics/top_video_pins")
    @Description("Get user account top video pins analytics")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun userAccountAnalyticsTopVideoPins(
         @QueryParam(value = "start_date") startDate: java.time.LocalDate, 
         @QueryParam(value = "end_date") endDate: java.time.LocalDate, 
         @QueryParam(value = "sort_by") sortBy: TopVideoPinsSortBy, 
         @QueryParam(value = "from_claimed_content") fromClaimedContent: kotlin.String, 
         @QueryParam(value = "pin_format") pinFormat: kotlin.String, 
         @QueryParam(value = "app_types") appTypes: kotlin.String, 
         @QueryParam(value = "content_type") contentType: kotlin.String, 
         @QueryParam(value = "source") source: kotlin.String, 
         @QueryParam(value = "metric_types") metricTypes: kotlin.collections.List<QueryvideopinmetrictypesItems>?, 
         @QueryParam(value = "num_of_pins") numOfPins: kotlin.Int, 
         @QueryParam(value = "created_in_last_n_days") createdInLastNDays: java.math.BigDecimal?, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): TopVideoPinsAnalyticsResponse {
        TODO()
    }

    @Get("/users/{username}/interests/follow")
    @Description("List following interests")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun userAccountFollowedInterests(
        @Pattern(regexp="(?!^\\d+$)^.+$") @PathParam("username") username: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): UserAccountFollowedInterests200Response {
        TODO()
    }

    @Get("/user_account")
    @Description("Get user account")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun userAccountGet(
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): Account {
        TODO()
    }

    @Get("/user_account/following")
    @Description("List following")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun userFollowingGet(
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "explicit_following") explicitFollowing: kotlin.Boolean, 
         @QueryParam(value = "feed_type") feedType: UserFollowingFeedType, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): FollowersList200Response {
        TODO()
    }

    @Get("/user_account/websites")
    @Description("Get user websites")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun userWebsitesGet(
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): UserWebsitesGet200Response {
        TODO()
    }

    @Post("/user_account/websites")
    @Description("Verify website")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun verifyWebsiteUpdate(
        @Valid @RequestBody userWebsiteCreate: UserWebsiteCreate, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): UserWebsite {
        TODO()
    }

    @Get("/user_account/websites/verification")
    @Description("Get user verification code for website claiming")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun websiteVerificationGet(
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): UserWebsiteVerification {
        TODO()
    }
}
