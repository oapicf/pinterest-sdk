package org.openapitools.api

import org.openapitools.model.AdAccountCountriesGet200Response
import org.openapitools.model.BookClosed
import org.openapitools.model.DeliveryMetricsGet200Response
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PublicTargetingType
import org.openapitools.model.ReportType
import org.openapitools.model.SingleInterestTargetingOption
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
class ResourcesApiController() {

    @Operation(
        summary = "Get ad accounts countries",
        operationId = "adAccountCountriesGet",
        description = """Get Ad Accounts countries""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdAccountCountriesGet200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/resources/ad_account_countries"
        value = [PATH_AD_ACCOUNT_COUNTRIES_GET],
        produces = ["application/json"]
    )
    fun adAccountCountriesGet(): ResponseEntity<AdAccountCountriesGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get available metrics' definitions",
        operationId = "deliveryMetricsGet",
        description = """Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints.
The `display_name` attribute will match how the metric is named in our native tools like Ads Manager.
See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = DeliveryMetricsGet200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read", "pins:read", "user_accounts:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read", "pins:read", "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/resources/delivery_metrics"
        value = [PATH_DELIVERY_METRICS_GET],
        produces = ["application/json"]
    )
    fun deliveryMetricsGet(
        @Parameter(description = "Report type.", schema = Schema(allowableValues = ["SYNC", "ASYNC"])) @Valid @RequestParam(value = "report_type", required = false) reportType: ReportType?
    ): ResponseEntity<DeliveryMetricsGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get interest details",
        operationId = "interestTargetingOptionsGet",
        description = """Get details of a specific interest given interest ID.

Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = SingleInterestTargetingOption::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/resources/targeting/interests/{interest_id}"
        value = [PATH_INTEREST_TARGETING_OPTIONS_GET],
        produces = ["application/json"]
    )
    fun interestTargetingOptionsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an interest.", required = true) @PathVariable("interest_id") interestId: kotlin.String
    ): ResponseEntity<SingleInterestTargetingOption> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get lead form questions",
        operationId = "leadFormQuestionsGet",
        description = """Get a list of all lead form question type names. Some questions might not be used.

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded."),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/resources/lead_form_questions"
        value = [PATH_LEAD_FORM_QUESTIONS_GET],
        produces = ["application/json"]
    )
    fun leadFormQuestionsGet(): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get metrics ready state",
        operationId = "metricsReadyStateGet",
        description = """Learn whether conversion or non-conversion metrics are finalized and ready to query.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = BookClosed::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/resources/metrics_ready_state"
        value = [PATH_METRICS_READY_STATE_GET],
        produces = ["application/json"]
    )
    fun metricsReadyStateGet(
        @NotNull @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$") @Parameter(description = "Analytics reports request date (UTC). Format: YYYY-MM-DD", required = true) @Valid @RequestParam(value = "date", required = true) date: kotlin.String
    ): ResponseEntity<BookClosed> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get targeting options",
        operationId = "targetingOptionsGet",
        description = """    You can use targeting values in ads placement to define your intended audience.

    Targeting metrics are organized around targeting specifications.

    For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).

    **Sample return:**

    ```
    [{"36313": "Australia: Moreton Bay - North", "124735": "Canada: North Battleford", "36109": "Australia: Murray", "36108": "Australia: Mid North Coast", "36101": "Australia: Capital Region", "811": "U.S.: Reno", "36103": "Australia: Central West", "36102": "Australia: Central Coast", "36105": "Australia: Far West and Orana", "36104": "Australia: Coffs Harbour - Grafton", "36107": "Australia: Illawarra", "36106": "Australia: Hunter Valley Exc Newcastle", "554017": "New Zealand: Wanganui", "554016": "New Zealand: Marlborough", "554015": "New Zealand: Gisborne", "554014": "New Zealand: Tararua", "554013": "New Zealand: Invercargill", "GR": "Greece", "554011": "New Zealand: Whangarei", "554010": "New Zealand: Far North", "717": "U.S.: Quincy-Hannibal-Keokuk", "716": "U.S.: Baton Rouge",...}]
    ```""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = kotlin.Any::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/resources/targeting/{targeting_type}"
        value = [PATH_TARGETING_OPTIONS_GET],
        produces = ["application/json"]
    )
    fun targetingOptionsGet(
        @Parameter(description = "Public targeting type", required = true, schema = Schema(allowableValues = ["APPTYPE", "GENDER", "LOCALE", "AGE_BUCKET", "LOCATION", "GEO", "INTEREST", "KEYWORD", "AUDIENCE_INCLUDE", "AUDIENCE_EXCLUDE"])) @PathVariable("targeting_type") targetingType: PublicTargetingType,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Client ID") @Valid @RequestParam(value = "client_id", required = false) clientId: kotlin.String?,
        @Parameter(description = "Oauth signature") @Valid @RequestParam(value = "oauth_signature", required = false) oauthSignature: kotlin.String?,
        @Pattern(regexp="\\d+") @Parameter(description = "Timestamp.") @Valid @RequestParam(value = "timestamp", required = false) timestamp: kotlin.String?
    ): ResponseEntity<List<kotlin.Any>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v5"
        const val PATH_AD_ACCOUNT_COUNTRIES_GET: String = "/resources/ad_account_countries"
        const val PATH_DELIVERY_METRICS_GET: String = "/resources/delivery_metrics"
        const val PATH_INTEREST_TARGETING_OPTIONS_GET: String = "/resources/targeting/interests/{interest_id}"
        const val PATH_LEAD_FORM_QUESTIONS_GET: String = "/resources/lead_form_questions"
        const val PATH_METRICS_READY_STATE_GET: String = "/resources/metrics_ready_state"
        const val PATH_TARGETING_OPTIONS_GET: String = "/resources/targeting/{targeting_type}"
    }
}
