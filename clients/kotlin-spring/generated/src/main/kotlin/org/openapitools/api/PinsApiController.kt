package org.openapitools.api

import org.openapitools.model.CreativeType
import org.openapitools.model.MultiPinsAnalyticsMetricTypesItem
import org.openapitools.model.Pin
import org.openapitools.model.PinAnalyticsMetricsResponse
import org.openapitools.model.PinCreate
import org.openapitools.model.PinFilter
import org.openapitools.model.PinType
import org.openapitools.model.PinUpdate
import org.openapitools.model.PinsList200Response
import org.openapitools.model.PinsSaveRequestCreate
import org.openapitools.model.PinterestLibError
import org.openapitools.model.ProductTagsBulkAddRequest
import org.openapitools.model.ProductTagsBulkDeleteRequest
import org.openapitools.model.ProductTagsError
import org.openapitools.model.ProductTagsResponse
import org.openapitools.model.QuerypinanalyticsmetrictypesItems
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
class PinsApiController() {

    @Operation(
        summary = "Get multiple Pin analytics",
        operationId = "multiPinsAnalytics",
        description = """**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

Get analytics for multiple pins owned by the "operation user_account" - or on a group board that has been shared with this account.
- The maximum number of pins supported in a single request is 100.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:

- For Pins on public or protected boards: Admin, Analyst.
- For Pins on secret boards: Admin.

If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = kotlin.collections.Map::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "pins:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "boards:read", "pins:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/pins/analytics"
        value = [PATH_MULTI_PINS_ANALYTICS],
        produces = ["application/json"]
    )
    fun multiPinsAnalytics(
        @NotNull @Size(min=1,max=100) @Parameter(description = "List of Pin IDs.", required = true) @Valid @RequestParam(value = "pin_ids", required = true) pinIds: kotlin.collections.List<kotlin.String>,
        @NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Pin metric types to get data for.", required = true) @Valid @RequestParam(value = "metric_types", required = true) metricTypes: kotlin.collections.List<MultiPinsAnalyticsMetricTypesItem>,
        @Parameter(description = "Apps or devices to get data for, default is all.", schema = Schema(allowableValues = ["ALL", "MOBILE", "TABLET", "WEB"], defaultValue = "ALL")) @Valid @RequestParam(value = "app_types", required = false, defaultValue = "ALL") appTypes: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<Map<String, kotlin.collections.Map<kotlin.String>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Pin analytics",
        operationId = "pinsAnalytics",
        description = """Get analytics for a Pin owned by the "operation user_account" - or on a group board that has been shared with this account.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:

- For Pins on public or protected boards: Admin, Analyst.
- For Pins on secret boards: Admin.

If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = PinAnalyticsMetricsResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "pins:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "boards:read", "pins:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/pins/{pin_id}/analytics"
        value = [PATH_PINS_ANALYTICS],
        produces = ["application/json"]
    )
    fun pinsAnalytics(
        @Parameter(description = "Unique identifier of a Pin.", required = true) @PathVariable("pin_id") pinId: kotlin.String,
        @NotNull @Parameter(description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @Valid @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @Valid @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate,
        @NotNull @Parameter(description = "Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before `2023-03-20`, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than `NO_SPLIT`.", required = true) @Valid @RequestParam(value = "metric_types", required = true) metricTypes: kotlin.collections.List<QuerypinanalyticsmetrictypesItems>,
        @Parameter(description = "Apps or devices to get data for, default is all.", schema = Schema(allowableValues = ["ALL", "MOBILE", "TABLET", "WEB"], defaultValue = "ALL")) @Valid @RequestParam(value = "app_types", required = false, defaultValue = "ALL") appTypes: kotlin.String,
        @Parameter(description = "How to split the data into groups. Not including this param means data won't be split.", schema = Schema(allowableValues = ["NO_SPLIT", "APP_TYPE"], defaultValue = "NO_SPLIT")) @Valid @RequestParam(value = "split_field", required = false, defaultValue = "NO_SPLIT") splitField: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<Map<String, PinAnalyticsMetricsResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Pin",
        operationId = "pinsCreate",
        description = """ Create a Pin on a board or board section owned by the "operation user_account".

 Note: If the current "operation user_account" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).

- This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).

**[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

**[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = Pin::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = Pin::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "boards:write", "pins:read", "pins:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "boards:read", "boards:write", "pins:read", "pins:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/pins"
        value = [PATH_PINS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun pinsCreate(
        @Parameter(description = "", required = true) @Valid @RequestBody pinCreate: PinCreate,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<Pin> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Pin",
        operationId = "pinsDelete",
        description = """  Delete a Pins owned by the "operation user_account" - or on a group board that has been shared with this account.
  - By default, the "operation user_account" is the token user_account.

  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:

  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.
  - For Pins on secret boards: Owner, Admin.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = Pin::class))]),
            ApiResponse(responseCode = "204", description = "Resource deleted successfully."),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "boards:write", "pins:read", "pins:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "boards:read", "boards:write", "pins:read", "pins:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/pins/{pin_id}"
        value = [PATH_PINS_DELETE],
        produces = ["application/json"]
    )
    fun pinsDelete(
        @Pattern(regexp="^\\d+$") @Parameter(description = "", required = true) @PathVariable("pin_id") pinId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<Pin> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Pin",
        operationId = "pinsGet",
        description = """  Get a Pin owned by the "operation user_account" - or on a group board that has been shared with this account.
  - By default, the "operation user_account" is the token user_account.

  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:

  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.
  - For Pins on secret boards: Owner, Admin.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = Pin::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "pins:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "boards:read", "pins:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/pins/{pin_id}"
        value = [PATH_PINS_GET],
        produces = ["application/json"]
    )
    fun pinsGet(
        @Pattern(regexp="^\\d+$") @Parameter(description = "", required = true) @PathVariable("pin_id") pinId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Parameter(description = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "pin_metrics", required = false, defaultValue = "false") pinMetrics: kotlin.Boolean
    ): ResponseEntity<Pin> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List Pins",
        operationId = "pinsList",
        description = """    Get a list of the Pins owned by the "operation user_account".
    - By default, the "operation user_account" is the token user_account.
    - All Pins owned by the "operation user_account" are included, regardless of who owns the board they are on.

    Optional: Business Access: Specify an `ad_account_id` to use the owner of that ad_account as the "operation user_account".

    Disclaimer: There are known performance issues when filtering by field `creative_type` and including protected pins.
    If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = PinsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "pins:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "boards:read", "pins:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/pins"
        value = [PATH_PINS_LIST],
        produces = ["application/json"]
    )
    fun pinsList(
        @Parameter(description = "The filter to apply to the pins", schema = Schema(allowableValues = ["exclude_native", "exclude_repins", "has_been_promoted"])) @Valid @RequestParam(value = "pin_filter", required = false) pinFilter: PinFilter?,
        @Parameter(description = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "pin_metrics", required = false, defaultValue = "false") pinMetrics: kotlin.Boolean,
        @Parameter(description = "Whether to include protected pins in the results", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "include_protected_pins", required = false, defaultValue = "false") includeProtectedPins: kotlin.Boolean,
        @Parameter(description = "The type of pins to return, currently only enabled for private pins", schema = Schema(allowableValues = ["PRIVATE"])) @Valid @RequestParam(value = "pin_type", required = false) pinType: PinType?,
        @Parameter(description = "Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.") @Valid @RequestParam(value = "creative_types", required = false) creativeTypes: kotlin.collections.List<CreativeType>?,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Parameter(description = "Only return pins with links that match the exact domain. Domain should not include 'www.' prefix. For example, 'pinterest.com' is a valid domain, but 'www.pinterest.com' is not (will not match any pins).") @Valid @RequestParam(value = "domain", required = false) domain: kotlin.String?,
        @Size(min=1,max=100) @Parameter(description = "Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. `?domains=instagram.com,jcpenney.com`).") @Valid @RequestParam(value = "domains", required = false) domains: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Include product tag objects in the response with their associated links.") @Valid @RequestParam(value = "include_product_tag_obj", required = false) includeProductTagObj: kotlin.Boolean?,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<PinsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Save Pin",
        operationId = "pinsSave",
        description = """Save a Pin on a board or board section owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.
Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:

- For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.
- For Pins on secret boards: Owner, Admin.

- Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc.
- Any public Pin can be saved given a pin ID.""",
        responses = [
            ApiResponse(responseCode = "201", description = "The request has succeeded and a new resource has been created as a result.", content = [Content(schema = Schema(implementation = Pin::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "boards:write", "pins:read", "pins:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/pins/{pin_id}/save"
        value = [PATH_PINS_SAVE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun pinsSave(
        @Parameter(description = "Unique identifier of a Pin.", required = true) @PathVariable("pin_id") pinId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody pinsSaveRequestCreate: PinsSaveRequestCreate,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<Pin> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Pin",
        operationId = "pinsUpdate",
        description = """Update a pin owned by the "operating user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:

- For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.
- For Pins on secret boards: Owner, Admin.

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = Pin::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "boards:write", "pins:read", "pins:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "boards:read", "boards:write", "pins:read", "pins:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/pins/{pin_id}"
        value = [PATH_PINS_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun pinsUpdate(
        @Pattern(regexp="^\\d+$") @Parameter(description = "", required = true) @PathVariable("pin_id") pinId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody pinUpdate: PinUpdate,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<Pin> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Add product tags to pin",
        operationId = "productTagsBulkAdd",
        description = """Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin.
- Maximum 24 product tags can be added in a single request.
- Duplicate pin_ids in the request will result in an error.
- If any product tag fails eligibility check, the entire request fails (all-or-nothing).
- If a product tag is already tagged on the pin, it is treated as a no-op success.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ProductTagsResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request contains ineligible product tags.", content = [Content(schema = Schema(implementation = ProductTagsError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "boards:write", "pins:read", "pins:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/pins/{pin_id}/product_tags"
        value = [PATH_PRODUCT_TAGS_BULK_ADD],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun productTagsBulkAdd(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of the hero pin that will receive product tags.", required = true) @PathVariable("pin_id") pinId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody productTagsBulkAddRequest: ProductTagsBulkAddRequest
    ): ResponseEntity<ProductTagsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete product tags from pin",
        operationId = "productTagsBulkDelete",
        description = """Delete product tags from a pin.
- If a product tag is not found on the pin, it is treated as a no-op success.""",
        responses = [
            ApiResponse(responseCode = "204", description = "Resource deleted successfully."),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "boards:write", "pins:read", "pins:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/pins/{pin_id}/product_tags/bulk-delete"
        value = [PATH_PRODUCT_TAGS_BULK_DELETE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun productTagsBulkDelete(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of the hero pin that will receive product tags.", required = true) @PathVariable("pin_id") pinId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody productTagsBulkDeleteRequest: ProductTagsBulkDeleteRequest
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get product tags for pin",
        operationId = "productTagsList",
        description = """Retrieve all product tags for a pin.
- Returns an empty array if the pin has no product tags.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ProductTagsResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "pins:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/pins/{pin_id}/product_tags"
        value = [PATH_PRODUCT_TAGS_LIST],
        produces = ["application/json"]
    )
    fun productTagsList(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of the hero pin that will receive product tags.", required = true) @PathVariable("pin_id") pinId: kotlin.String
    ): ResponseEntity<ProductTagsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v5"
        const val PATH_MULTI_PINS_ANALYTICS: String = "/pins/analytics"
        const val PATH_PINS_ANALYTICS: String = "/pins/{pin_id}/analytics"
        const val PATH_PINS_CREATE: String = "/pins"
        const val PATH_PINS_DELETE: String = "/pins/{pin_id}"
        const val PATH_PINS_GET: String = "/pins/{pin_id}"
        const val PATH_PINS_LIST: String = "/pins"
        const val PATH_PINS_SAVE: String = "/pins/{pin_id}/save"
        const val PATH_PINS_UPDATE: String = "/pins/{pin_id}"
        const val PATH_PRODUCT_TAGS_BULK_ADD: String = "/pins/{pin_id}/product_tags"
        const val PATH_PRODUCT_TAGS_BULK_DELETE: String = "/pins/{pin_id}/product_tags/bulk-delete"
        const val PATH_PRODUCT_TAGS_LIST: String = "/pins/{pin_id}/product_tags"
    }
}
