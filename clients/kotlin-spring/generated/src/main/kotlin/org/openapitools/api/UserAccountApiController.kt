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
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/v5}")
class UserAccountApiController() {

    @Operation(
        summary = "List following boards",
        operationId = "boardsUserFollowsList",
        description = """Get a list of the boards a user follows. The request returns a board summary object array.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = BoardsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/user_account/following/boards"
        value = [PATH_BOARDS_USER_FOLLOWS_LIST],
        produces = ["application/json"]
    )
    fun boardsUserFollowsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Parameter(description = "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "explicit_following", required = false, defaultValue = "false") explicitFollowing: kotlin.Boolean,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<BoardsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Follow user",
        operationId = "followUserUpdate",
        description = """**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

Use this request, as a signed-in user, to follow another user.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = FollowUser::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = FollowUser::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/user_account/following/{username}"
        value = [PATH_FOLLOW_USER_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun followUserUpdate(
        @Pattern(regexp="(?!^\\d+$)^.+$") @Parameter(description = "A valid username", required = true) @PathVariable("username") username: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody followUserCreate: FollowUserCreate
    ): ResponseEntity<FollowUser> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List followers",
        operationId = "followersList",
        description = """Get a list of your followers.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = FollowersList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/user_account/followers"
        value = [PATH_FOLLOWERS_LIST],
        produces = ["application/json"]
    )
    fun followersList(
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<FollowersList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List linked businesses",
        operationId = "linkedBusinessAccountsGet",
        description = """Get a list of your linked business accounts.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = LinkedBusiness::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/user_account/businesses"
        value = [PATH_LINKED_BUSINESS_ACCOUNTS_GET],
        produces = ["application/json"]
    )
    fun linkedBusinessAccountsGet(): ResponseEntity<List<LinkedBusiness>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Unverify website",
        operationId = "unverifyWebsiteDelete",
        description = """Unverify a website verified by the signed-in user.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = UserWebsite::class))]),
            ApiResponse(responseCode = "204", description = "Resource deleted successfully."),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/user_account/websites"
        value = [PATH_UNVERIFY_WEBSITE_DELETE],
        produces = ["application/json"]
    )
    fun unverifyWebsiteDelete(
        @NotNull @Parameter(description = "Website with path or domain only", required = true) @Valid @RequestParam(value = "website", required = true) website: kotlin.String
    ): ResponseEntity<UserWebsite> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get user account analytics",
        operationId = "userAccountAnalytics",
        description = """Get analytics for the "operation user_account"
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AnalyticsMetricsResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/user_account/analytics"
        value = [PATH_USER_ACCOUNT_ANALYTICS],
        produces = ["application/json"]
    )
    fun userAccountAnalytics(
        @NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,
        @Parameter(description = "Filter on Pins that match your claimed domain.", schema = Schema(allowableValues = ["OTHER", "CLAIMED", "BOTH"], defaultValue = "BOTH")) @Valid @RequestParam(value = "from_claimed_content", required = false, defaultValue = "BOTH") fromClaimedContent: kotlin.String,
        @Parameter(description = "Pin formats to get data for, default is all.", schema = Schema(allowableValues = ["ALL", "ORGANIC_IMAGE", "ORGANIC_PRODUCT", "ORGANIC_VIDEO", "ADS_STANDARD", "ADS_PRODUCT", "ADS_VIDEO", "ADS_IDEA"], defaultValue = "ALL")) @Valid @RequestParam(value = "pin_format", required = false, defaultValue = "ALL") pinFormat: kotlin.String,
        @Parameter(description = "Apps or devices to get data for, default is all.", schema = Schema(allowableValues = ["ALL", "MOBILE", "TABLET", "WEB"], defaultValue = "ALL")) @Valid @RequestParam(value = "app_types", required = false, defaultValue = "ALL") appTypes: kotlin.String,
        @Parameter(description = "Filter to paid or organic data. Default is all.", schema = Schema(allowableValues = ["ALL", "PAID", "ORGANIC"], defaultValue = "ALL")) @Valid @RequestParam(value = "content_type", required = false, defaultValue = "ALL") contentType: kotlin.String,
        @Parameter(description = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", schema = Schema(allowableValues = ["ALL", "YOUR_PINS", "OTHER_PINS"], defaultValue = "ALL")) @Valid @RequestParam(value = "source", required = false, defaultValue = "ALL") source: kotlin.String,
        @Parameter(description = "Metric types to get data for, default is all.") @Valid @RequestParam(value = "metric_types", required = false) metricTypes: kotlin.collections.List<QuerymetrictypesItems>?,
        @Parameter(description = "How to split the data into groups. Not including this param means data won't be split.", schema = Schema(allowableValues = ["NO_SPLIT", "APP_TYPE", "OWNED_CONTENT", "SOURCE", "PIN_FORMAT"], defaultValue = "NO_SPLIT")) @Valid @RequestParam(value = "split_field", required = false, defaultValue = "NO_SPLIT") splitField: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<Map<String, AnalyticsMetricsResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get user account top pins analytics",
        operationId = "userAccountAnalyticsTopPins",
        description = """Gets analytics data about a user's top pins (limited to the top 50).
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = TopPinsAnalyticsResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "pins:read", "user_accounts:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "pins:read", "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/user_account/analytics/top_pins"
        value = [PATH_USER_ACCOUNT_ANALYTICS_TOP_PINS],
        produces = ["application/json"]
    )
    fun userAccountAnalyticsTopPins(
        @NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Specify sorting order for metrics", required = true, schema = Schema(allowableValues = ["ENGAGEMENT", "SAVE", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK"])) @Valid @RequestParam(value = "sort_by", required = true) sortBy: TopPinsSortBy,
        @Parameter(description = "Filter on Pins that match your claimed domain.", schema = Schema(allowableValues = ["OTHER", "CLAIMED", "BOTH"], defaultValue = "BOTH")) @Valid @RequestParam(value = "from_claimed_content", required = false, defaultValue = "BOTH") fromClaimedContent: kotlin.String,
        @Parameter(description = "Pin formats to get data for, default is all.", schema = Schema(allowableValues = ["ALL", "ORGANIC_IMAGE", "ORGANIC_PRODUCT", "ORGANIC_VIDEO", "ADS_STANDARD", "ADS_PRODUCT", "ADS_VIDEO", "ADS_IDEA"], defaultValue = "ALL")) @Valid @RequestParam(value = "pin_format", required = false, defaultValue = "ALL") pinFormat: kotlin.String,
        @Parameter(description = "Apps or devices to get data for, default is all.", schema = Schema(allowableValues = ["ALL", "MOBILE", "TABLET", "WEB"], defaultValue = "ALL")) @Valid @RequestParam(value = "app_types", required = false, defaultValue = "ALL") appTypes: kotlin.String,
        @Parameter(description = "Filter to paid or organic data. Default is all.", schema = Schema(allowableValues = ["ALL", "PAID", "ORGANIC"], defaultValue = "ALL")) @Valid @RequestParam(value = "content_type", required = false, defaultValue = "ALL") contentType: kotlin.String,
        @Parameter(description = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", schema = Schema(allowableValues = ["ALL", "YOUR_PINS", "OTHER_PINS"], defaultValue = "ALL")) @Valid @RequestParam(value = "source", required = false, defaultValue = "ALL") source: kotlin.String,
        @Parameter(description = "Metric types to get data for, default is all.") @Valid @RequestParam(value = "metric_types", required = false) metricTypes: kotlin.collections.List<QuerymetrictypesItems>?,
        @Min(value=1) @Max(value=50) @Parameter(description = "Number of pins to include, default is 10. Max is 50.", schema = Schema(defaultValue = "10")) @Valid @RequestParam(value = "num_of_pins", required = false, defaultValue = "10") numOfPins: kotlin.Int,
        @Parameter(description = "Get metrics for pins created in the last \"n\" days.", schema = Schema(allowableValues = ["30"])) @Valid @RequestParam(value = "created_in_last_n_days", required = false) createdInLastNDays: java.math.BigDecimal?,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<TopPinsAnalyticsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get user account top video pins analytics",
        operationId = "userAccountAnalyticsTopVideoPins",
        description = """Gets analytics data about a user's top video pins (limited to the top 50).
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = TopVideoPinsAnalyticsResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "pins:read", "user_accounts:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "pins:read", "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/user_account/analytics/top_video_pins"
        value = [PATH_USER_ACCOUNT_ANALYTICS_TOP_VIDEO_PINS],
        produces = ["application/json"]
    )
    fun userAccountAnalyticsTopVideoPins(
        @NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Specify sorting order for video metrics", required = true, schema = Schema(allowableValues = ["SAVE", "IMPRESSION", "OUTBOUND_CLICK", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START"])) @Valid @RequestParam(value = "sort_by", required = true) sortBy: TopVideoPinsSortBy,
        @Parameter(description = "Filter on Pins that match your claimed domain.", schema = Schema(allowableValues = ["OTHER", "CLAIMED", "BOTH"], defaultValue = "BOTH")) @Valid @RequestParam(value = "from_claimed_content", required = false, defaultValue = "BOTH") fromClaimedContent: kotlin.String,
        @Parameter(description = "Pin formats to get data for, default is all.", schema = Schema(allowableValues = ["ALL", "ORGANIC_IMAGE", "ORGANIC_PRODUCT", "ORGANIC_VIDEO", "ADS_STANDARD", "ADS_PRODUCT", "ADS_VIDEO", "ADS_IDEA"], defaultValue = "ALL")) @Valid @RequestParam(value = "pin_format", required = false, defaultValue = "ALL") pinFormat: kotlin.String,
        @Parameter(description = "Apps or devices to get data for, default is all.", schema = Schema(allowableValues = ["ALL", "MOBILE", "TABLET", "WEB"], defaultValue = "ALL")) @Valid @RequestParam(value = "app_types", required = false, defaultValue = "ALL") appTypes: kotlin.String,
        @Parameter(description = "Filter to paid or organic data. Default is all.", schema = Schema(allowableValues = ["ALL", "PAID", "ORGANIC"], defaultValue = "ALL")) @Valid @RequestParam(value = "content_type", required = false, defaultValue = "ALL") contentType: kotlin.String,
        @Parameter(description = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", schema = Schema(allowableValues = ["ALL", "YOUR_PINS", "OTHER_PINS"], defaultValue = "ALL")) @Valid @RequestParam(value = "source", required = false, defaultValue = "ALL") source: kotlin.String,
        @Parameter(description = "Metric types to get video data for, default is all.") @Valid @RequestParam(value = "metric_types", required = false) metricTypes: kotlin.collections.List<QueryvideopinmetrictypesItems>?,
        @Min(value=1) @Max(value=50) @Parameter(description = "Number of pins to include, default is 10. Max is 50.", schema = Schema(defaultValue = "10")) @Valid @RequestParam(value = "num_of_pins", required = false, defaultValue = "10") numOfPins: kotlin.Int,
        @Parameter(description = "Get metrics for pins created in the last \"n\" days.", schema = Schema(allowableValues = ["30"])) @Valid @RequestParam(value = "created_in_last_n_days", required = false) createdInLastNDays: java.math.BigDecimal?,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<TopVideoPinsAnalyticsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get user account",
        operationId = "userAccountGet",
        description = """Get account information for the "operation user_account"
- By default, the "operation user_account" is the token user_account.

[Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ "Understanding Business Access"
If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". See [Understanding Business Access] for more information.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = Account::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/user_account"
        value = [PATH_USER_ACCOUNT_GET],
        produces = ["application/json"]
    )
    fun userAccountGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<Account> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List following",
        operationId = "userFollowingGet",
        description = """Get a list of who a certain user follows.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = FollowersList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/user_account/following"
        value = [PATH_USER_FOLLOWING_GET],
        produces = ["application/json"]
    )
    fun userFollowingGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Parameter(description = "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "explicit_following", required = false, defaultValue = "false") explicitFollowing: kotlin.Boolean,
        @Parameter(description = "Thrift param specifying what type of followees will be kept. Default to include all followees.", schema = Schema(allowableValues = ["ALL", "RANKED", "CREATOR_ONLY", "RANKED_CREATOR_ONLY"], defaultValue = "ALL")) @Valid @RequestParam(value = "feed_type", required = false, defaultValue = "ALL") feedType: UserFollowingFeedType,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<FollowersList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get user websites",
        operationId = "userWebsitesGet",
        description = """Get user websites, claimed or not""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = UserWebsitesGet200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/user_account/websites"
        value = [PATH_USER_WEBSITES_GET],
        produces = ["application/json"]
    )
    fun userWebsitesGet(
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<UserWebsitesGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Verify website",
        operationId = "verifyWebsiteUpdate",
        description = """Verify a website as a signed-in user.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = UserWebsite::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = UserWebsite::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/user_account/websites"
        value = [PATH_VERIFY_WEBSITE_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun verifyWebsiteUpdate(
        @Parameter(description = "", required = true) @Valid @RequestBody userWebsiteCreate: UserWebsiteCreate,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<UserWebsite> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get user verification code for website claiming",
        operationId = "websiteVerificationGet",
        description = """Get verification code for user to install on the website to claim it.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = UserWebsiteVerification::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/user_account/websites/verification"
        value = [PATH_WEBSITE_VERIFICATION_GET],
        produces = ["application/json"]
    )
    fun websiteVerificationGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<UserWebsiteVerification> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v5"
        const val PATH_BOARDS_USER_FOLLOWS_LIST: String = "/user_account/following/boards"
        const val PATH_FOLLOW_USER_UPDATE: String = "/user_account/following/{username}"
        const val PATH_FOLLOWERS_LIST: String = "/user_account/followers"
        const val PATH_LINKED_BUSINESS_ACCOUNTS_GET: String = "/user_account/businesses"
        const val PATH_UNVERIFY_WEBSITE_DELETE: String = "/user_account/websites"
        const val PATH_USER_ACCOUNT_ANALYTICS: String = "/user_account/analytics"
        const val PATH_USER_ACCOUNT_ANALYTICS_TOP_PINS: String = "/user_account/analytics/top_pins"
        const val PATH_USER_ACCOUNT_ANALYTICS_TOP_VIDEO_PINS: String = "/user_account/analytics/top_video_pins"
        const val PATH_USER_ACCOUNT_GET: String = "/user_account"
        const val PATH_USER_FOLLOWING_GET: String = "/user_account/following"
        const val PATH_USER_WEBSITES_GET: String = "/user_account/websites"
        const val PATH_VERIFY_WEBSITE_UPDATE: String = "/user_account/websites"
        const val PATH_WEBSITE_VERIFICATION_GET: String = "/user_account/websites/verification"
    }
}
