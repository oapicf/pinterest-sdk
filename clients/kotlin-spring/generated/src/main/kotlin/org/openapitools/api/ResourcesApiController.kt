package org.openapitools.api

import org.openapitools.model.AdAccountsCountryResponse
import org.openapitools.model.BookClosedResponse
import org.openapitools.model.DeliveryMetricsResponse
import org.openapitools.model.Error
import org.openapitools.model.SingleInterestTargetingOptionResponse
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
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdAccountsCountryResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/resources/ad_account_countries"],
        produces = ["application/json"]
    )
    fun adAccountCountriesGet(): ResponseEntity<AdAccountsCountryResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get available metrics' definitions",
        operationId = "deliveryMetricsGet",
        description = """Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints.
The `display_name` attribute will match how the metric is named in our native tools like Ads Manager.
See <a href='/docs/content/analytics/'>Organic Analytics</a> and <a href='/docs/ads/ad-analytics-reporting/'>Ads Analytics</a> for more information.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = DeliveryMetricsResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read", "pins:read", "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/resources/delivery_metrics"],
        produces = ["application/json"]
    )
    fun deliveryMetricsGet(@Parameter(description = "Report type.", schema = Schema(allowableValues = ["SYNC", "ASYNC"])) @Valid @RequestParam(value = "report_type", required = false) reportType: kotlin.String?): ResponseEntity<DeliveryMetricsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get interest details",
        operationId = "interestTargetingOptionsGet",
        description = """<p>Get details of a specific interest given interest ID.</p> <p>Click <a href="https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875" target="_blank">here</a> for a spreadsheet listing interests and their IDs.</p>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = SingleInterestTargetingOptionResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/resources/targeting/interests/{interest_id}"],
        produces = ["application/json"]
    )
    fun interestTargetingOptionsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an interest.", required = true) @PathVariable("interest_id") interestId: kotlin.String): ResponseEntity<SingleInterestTargetingOptionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get lead form questions",
        operationId = "leadFormQuestionsGet",
        description = """Get a list of all lead form question type names. Some questions might not be used.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success"),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/resources/lead_form_questions"],
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
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = BookClosedResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/resources/metrics_ready_state"],
        produces = ["application/json"]
    )
    fun metricsReadyStateGet(@NotNull @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$") @Parameter(description = "Analytics reports request date (UTC). Format: YYYY-MM-DD", required = true) @Valid @RequestParam(value = "date", required = true) date: kotlin.String): ResponseEntity<BookClosedResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get targeting options",
        operationId = "targetingOptionsGet",
        description = """<p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class="reference external" href="https://help.pinterest.com/en/business/article/audience-targeting" target="_blank">Audience targeting</a>.</p>
<p><b>Sample return:</b></p> <pre class="literal-block"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(array = ArraySchema(schema = Schema(implementation = kotlin.Any::class)))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/resources/targeting/{targeting_type}"],
        produces = ["application/json"]
    )
    fun targetingOptionsGet(@Parameter(description = "Public targeting type.", required = true, schema = Schema(allowableValues = ["\"APPTYPE\"", "\"GENDER\"", "\"LOCALE\"", "\"AGE_BUCKET\"", "\"LOCATION\"", "\"GEO\"", "\"INTEREST\"", "\"KEYWORD\"", "\"AUDIENCE_INCLUDE\"", "\"AUDIENCE_EXCLUDE\""])) @PathVariable("targeting_type") targetingType: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Client ID.") @Valid @RequestParam(value = "client_id", required = false) clientId: kotlin.String?,@Parameter(description = "Oauth signature") @Valid @RequestParam(value = "oauth_signature", required = false) oauthSignature: kotlin.String?,@Pattern(regexp="\\d+") @Parameter(description = "Timestamp") @Valid @RequestParam(value = "timestamp", required = false) timestamp: kotlin.String?): ResponseEntity<List<kotlin.Any>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
