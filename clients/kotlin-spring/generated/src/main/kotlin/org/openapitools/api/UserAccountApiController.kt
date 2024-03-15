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
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = BoardsUserFollowsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid user id", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/user_account/following/boards"],
        produces = ["application/json"]
    )
    fun boardsUserFollowsList(@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "explicit_following", required = false, defaultValue = "false") explicitFollowing: kotlin.Boolean,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<BoardsUserFollowsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Follow user",
        operationId = "followUserUpdate",
        description = """<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

Use this request, as a signed-in user, to follow another user.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = UserSummary::class))]),
            ApiResponse(responseCode = "404", description = "User not found", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/user_account/following/{username}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun followUserUpdate(@Pattern(regexp="(?!^\\d+$)^.+$") @Parameter(description = "A valid username", required = true) @PathVariable("username") username: kotlin.String,@Parameter(description = "Follow a user.", required = true) @Valid @RequestBody followUserRequest: FollowUserRequest): ResponseEntity<UserSummary> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List followers",
        operationId = "followersList",
        description = """Get a list of your followers.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = FollowersList200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid user id", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/user_account/followers"],
        produces = ["application/json"]
    )
    fun followersList(@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int): ResponseEntity<FollowersList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List linked businesses",
        operationId = "linkedBusinessAccountsGet",
        description = """Get a list of your linked business accounts.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(array = ArraySchema(schema = Schema(implementation = LinkedBusiness::class)))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/user_account/businesses"],
        produces = ["application/json"]
    )
    fun linkedBusinessAccountsGet(): ResponseEntity<List<LinkedBusiness>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Unverify website",
        operationId = "unverifyWebsiteDelete",
        description = """Unverifu a website verified by the signed-in user.""",
        responses = [
            ApiResponse(responseCode = "204", description = "Successfully unverified website"),
            ApiResponse(responseCode = "404", description = "Website not in user list.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/user_account/websites"],
        produces = ["application/json"]
    )
    fun unverifyWebsiteDelete(@NotNull @Parameter(description = "Website with path or domain only", required = true) @Valid @RequestParam(value = "website", required = true) website: kotlin.String): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get user account analytics",
        operationId = "userAccountAnalytics",
        description = """Get analytics for the "operation user_account"
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AnalyticsMetricsResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid user accounts analytics parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Not authorized to access the user account analytics.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/user_account/analytics"],
        produces = ["application/json"]
    )
    fun userAccountAnalytics(@NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,@NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,@Parameter(description = "Filter on Pins that match your claimed domain.", schema = Schema(allowableValues = ["OTHER", "CLAIMED", "BOTH"], defaultValue = "BOTH")) @Valid @RequestParam(value = "from_claimed_content", required = false, defaultValue = "BOTH") fromClaimedContent: kotlin.String,@Parameter(description = "Pin formats to get data for, default is all.", schema = Schema(allowableValues = ["ALL", "ORGANIC_IMAGE", "ORGANIC_PRODUCT", "ORGANIC_VIDEO", "ADS_STANDARD", "ADS_PRODUCT", "ADS_VIDEO", "ADS_IDEA", "PRODUCT", "REGULAR", "VIDEO"], defaultValue = "ALL")) @Valid @RequestParam(value = "pin_format", required = false, defaultValue = "ALL") pinFormat: kotlin.String,@Parameter(description = "Apps or devices to get data for, default is all.", schema = Schema(allowableValues = ["ALL", "MOBILE", "TABLET", "WEB"], defaultValue = "ALL")) @Valid @RequestParam(value = "app_types", required = false, defaultValue = "ALL") appTypes: kotlin.String,@Parameter(description = "Filter to paid or organic data. Default is all.", schema = Schema(allowableValues = ["ALL", "PAID", "ORGANIC"], defaultValue = "ALL")) @Valid @RequestParam(value = "content_type", required = false, defaultValue = "ALL") contentType: kotlin.String,@Parameter(description = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", schema = Schema(allowableValues = ["ALL", "YOUR_PINS", "OTHER_PINS"], defaultValue = "ALL")) @Valid @RequestParam(value = "source", required = false, defaultValue = "ALL") source: kotlin.String,@Parameter(description = "Metric types to get data for, default is all. ", schema = Schema(allowableValues = ["ENGAGEMENT", "ENGAGEMENT_RATE", "IMPRESSION", "OUTBOUND_CLICK", "OUTBOUND_CLICK_RATE", "PIN_CLICK", "PIN_CLICK_RATE", "SAVE", "SAVE_RATE"])) @Valid @RequestParam(value = "metric_types", required = false) metricTypes: kotlin.collections.List<kotlin.String>?,@Parameter(description = "How to split the data into groups. Not including this param means data won't be split.", schema = Schema(allowableValues = ["NO_SPLIT", "APP_TYPE", "OWNED_CONTENT", "SOURCE", "PIN_FORMAT"], defaultValue = "NO_SPLIT")) @Valid @RequestParam(value = "split_field", required = false, defaultValue = "NO_SPLIT") splitField: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<Map<String, AnalyticsMetricsResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get user account top pins analytics",
        operationId = "userAccountAnalyticsTopPins",
        description = """Gets analytics data about a user's top pins (limited to the top 50).
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = TopPinsAnalyticsResponse::class))]),
            ApiResponse(responseCode = "403", description = "Not authorized to access the user account analytics.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "pins:read", "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/user_account/analytics/top_pins"],
        produces = ["application/json"]
    )
    fun userAccountAnalyticsTopPins(@NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,@NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,@NotNull @Parameter(description = "Specify sorting order for metrics", required = true, schema = Schema(allowableValues = ["ENGAGEMENT", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK", "SAVE"])) @Valid @RequestParam(value = "sort_by", required = true) sortBy: kotlin.String,@Parameter(description = "Filter on Pins that match your claimed domain.", schema = Schema(allowableValues = ["OTHER", "CLAIMED", "BOTH"], defaultValue = "BOTH")) @Valid @RequestParam(value = "from_claimed_content", required = false, defaultValue = "BOTH") fromClaimedContent: kotlin.String,@Parameter(description = "Pin formats to get data for, default is all.", schema = Schema(allowableValues = ["ALL", "ORGANIC_IMAGE", "ORGANIC_PRODUCT", "ORGANIC_VIDEO", "ADS_STANDARD", "ADS_PRODUCT", "ADS_VIDEO", "ADS_IDEA", "PRODUCT", "REGULAR", "VIDEO"], defaultValue = "ALL")) @Valid @RequestParam(value = "pin_format", required = false, defaultValue = "ALL") pinFormat: kotlin.String,@Parameter(description = "Apps or devices to get data for, default is all.", schema = Schema(allowableValues = ["ALL", "MOBILE", "TABLET", "WEB"], defaultValue = "ALL")) @Valid @RequestParam(value = "app_types", required = false, defaultValue = "ALL") appTypes: kotlin.String,@Parameter(description = "Filter to paid or organic data. Default is all.", schema = Schema(allowableValues = ["ALL", "PAID", "ORGANIC"], defaultValue = "ALL")) @Valid @RequestParam(value = "content_type", required = false, defaultValue = "ALL") contentType: kotlin.String,@Parameter(description = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", schema = Schema(allowableValues = ["ALL", "YOUR_PINS", "OTHER_PINS"], defaultValue = "ALL")) @Valid @RequestParam(value = "source", required = false, defaultValue = "ALL") source: kotlin.String,@Parameter(description = "Metric types to get data for, default is all. ", schema = Schema(allowableValues = ["ENGAGEMENT", "ENGAGEMENT_RATE", "IMPRESSION", "OUTBOUND_CLICK", "OUTBOUND_CLICK_RATE", "PIN_CLICK", "PIN_CLICK_RATE", "SAVE", "SAVE_RATE"])) @Valid @RequestParam(value = "metric_types", required = false) metricTypes: kotlin.collections.List<kotlin.String>?,@Min(1) @Max(50) @Parameter(description = "Number of pins to include, default is 10. Max is 50.", schema = Schema(defaultValue = "10")) @Valid @RequestParam(value = "num_of_pins", required = false, defaultValue = "10") numOfPins: kotlin.Int,@Parameter(description = "Get metrics for pins created in the last \"n\" days.", schema = Schema(allowableValues = ["30"])) @Valid @RequestParam(value = "created_in_last_n_days", required = false) createdInLastNDays: kotlin.Int?,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<TopPinsAnalyticsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get user account top video pins analytics",
        operationId = "userAccountAnalyticsTopVideoPins",
        description = """Gets analytics data about a user's top video pins (limited to the top 50).
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = TopVideoPinsAnalyticsResponse::class))]),
            ApiResponse(responseCode = "403", description = "Not authorized to access the user account analytics.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "pins:read", "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/user_account/analytics/top_video_pins"],
        produces = ["application/json"]
    )
    fun userAccountAnalyticsTopVideoPins(@NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,@NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,@NotNull @Parameter(description = "Specify sorting order for video metrics", required = true, schema = Schema(allowableValues = ["IMPRESSION", "SAVE", "OUTBOUND_CLICK", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START"])) @Valid @RequestParam(value = "sort_by", required = true) sortBy: kotlin.String,@Parameter(description = "Filter on Pins that match your claimed domain.", schema = Schema(allowableValues = ["OTHER", "CLAIMED", "BOTH"], defaultValue = "BOTH")) @Valid @RequestParam(value = "from_claimed_content", required = false, defaultValue = "BOTH") fromClaimedContent: kotlin.String,@Parameter(description = "Pin formats to get data for, default is all.", schema = Schema(allowableValues = ["ALL", "ORGANIC_IMAGE", "ORGANIC_PRODUCT", "ORGANIC_VIDEO", "ADS_STANDARD", "ADS_PRODUCT", "ADS_VIDEO", "ADS_IDEA", "PRODUCT", "REGULAR", "VIDEO"], defaultValue = "ALL")) @Valid @RequestParam(value = "pin_format", required = false, defaultValue = "ALL") pinFormat: kotlin.String,@Parameter(description = "Apps or devices to get data for, default is all.", schema = Schema(allowableValues = ["ALL", "MOBILE", "TABLET", "WEB"], defaultValue = "ALL")) @Valid @RequestParam(value = "app_types", required = false, defaultValue = "ALL") appTypes: kotlin.String,@Parameter(description = "Filter to paid or organic data. Default is all.", schema = Schema(allowableValues = ["ALL", "PAID", "ORGANIC"], defaultValue = "ALL")) @Valid @RequestParam(value = "content_type", required = false, defaultValue = "ALL") contentType: kotlin.String,@Parameter(description = "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts", schema = Schema(allowableValues = ["ALL", "YOUR_PINS", "OTHER_PINS"], defaultValue = "ALL")) @Valid @RequestParam(value = "source", required = false, defaultValue = "ALL") source: kotlin.String,@Parameter(description = "Metric types to get video data for, default is all. ", schema = Schema(allowableValues = ["IMPRESSION", "SAVE", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START", "OUTBOUND_CLICK"])) @Valid @RequestParam(value = "metric_types", required = false) metricTypes: kotlin.collections.List<kotlin.String>?,@Min(1) @Max(50) @Parameter(description = "Number of pins to include, default is 10. Max is 50.", schema = Schema(defaultValue = "10")) @Valid @RequestParam(value = "num_of_pins", required = false, defaultValue = "10") numOfPins: kotlin.Int,@Parameter(description = "Get metrics for pins created in the last \"n\" days.", schema = Schema(allowableValues = ["30"])) @Valid @RequestParam(value = "created_in_last_n_days", required = false) createdInLastNDays: kotlin.Int?,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<TopVideoPinsAnalyticsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get user account",
        operationId = "userAccountGet",
        description = """Get account information for the "operation user_account"
- By default, the "operation user_account" is the token user_account.

If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = Account::class))]),
            ApiResponse(responseCode = "403", description = "Not authorized to access the user account.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/user_account"],
        produces = ["application/json"]
    )
    fun userAccountGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<Account> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List following",
        operationId = "userFollowingGet",
        description = """Get a list of who a certain user follows.""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = UserFollowingGet200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/user_account/following"],
        produces = ["application/json"]
    )
    fun userFollowingGet(@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "Thrift param specifying what type of followees will be kept. Default to include all followees.", schema = Schema(allowableValues = ["ALL", "RANKED", "CREATOR_ONLY", "RANKED_CREATOR_ONLY"], defaultValue = ALL)) @Valid @RequestParam(value = "feed_type", required = false, defaultValue = ALL) feedType: UserFollowingFeedType,@Parameter(description = "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "explicit_following", required = false, defaultValue = "false") explicitFollowing: kotlin.Boolean,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<UserFollowingGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get user websites",
        operationId = "userWebsitesGet",
        description = """Get user websites, claimed or not""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = UserWebsitesGet200Response::class))]),
            ApiResponse(responseCode = "403", description = "Not authorized to access the user website list.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/user_account/websites"],
        produces = ["application/json"]
    )
    fun userWebsitesGet(@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int): ResponseEntity<UserWebsitesGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Verify website",
        operationId = "verifyWebsiteUpdate",
        description = """Verify a website as a signed-in user.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = UserWebsiteSummary::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/user_account/websites"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun verifyWebsiteUpdate(@Parameter(description = "Verify a website.", required = true) @Valid @RequestBody userWebsiteVerifyRequest: UserWebsiteVerifyRequest): ResponseEntity<UserWebsiteSummary> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get user verification code for website claiming",
        operationId = "websiteVerificationGet",
        description = """Get verification code for user to install on the website to claim it.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = UserWebsiteVerificationCode::class))]),
            ApiResponse(responseCode = "403", description = "Not authorized to access the user verification code for website claiming.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/user_account/websites/verification"],
        produces = ["application/json"]
    )
    fun websiteVerificationGet(): ResponseEntity<UserWebsiteVerificationCode> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
