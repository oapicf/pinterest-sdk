package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.PinsList200Response
import org.openapitools.model.SearchPartnerPins200Response
import org.openapitools.model.SearchUserBoardsGet200Response
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
class SearchApiController() {

    @Operation(
        summary = "Search pins by a given search term",
        operationId = "searchPartnerPins",
        description = """<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

Get the top 10 Pins by a given search term.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = SearchPartnerPins200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid pins", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "pins:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/search/partner/pins"],
        produces = ["application/json"]
    )
    fun searchPartnerPins(@NotNull @Parameter(description = "Search term to look up pins.", required = true) @Valid @RequestParam(value = "term", required = true) term: kotlin.String,@NotNull @Parameter(description = "Two letter country code (ISO 3166-1 alpha-2)", required = true) @Valid @RequestParam(value = "country_code", required = true) countryCode: kotlin.String,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Parameter(description = "Search locale.") @Valid @RequestParam(value = "locale", required = false) locale: kotlin.String?,@Min(1) @Max(50) @Parameter(description = "Max search result size", schema = Schema(defaultValue = "10")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "10") limit: kotlin.Int): ResponseEntity<SearchPartnerPins200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search user's boards",
        operationId = "searchUserBoardsGet",
        description = """Search for boards for the "operation user_account". This includes boards of all board types.
- By default, the "operation user_account" is the token user_account.

If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = SearchUserBoardsGet200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "boards:read_secret" ]),SecurityRequirement(name = "client_credentials", scopes = [ "boards:read", "boards:read_secret" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/search/boards"],
        produces = ["application/json"]
    )
    fun searchUserBoardsGet(@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "Search query. Can contain pin description keywords or comma-separated pin IDs.") @Valid @RequestParam(value = "query", required = false) query: kotlin.String?): ResponseEntity<SearchUserBoardsGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search user's Pins",
        operationId = "searchUserPinsList",
        description = """Search for pins for the "operation user_account".
- By default, the "operation user_account" is the token user_account.

If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = PinsList200Response::class))]),
            ApiResponse(responseCode = "404", description = "User not found", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "boards:read_secret", "pins:read", "pins:read_secret" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/search/pins"],
        produces = ["application/json"]
    )
    fun searchUserPinsList(@NotNull @Parameter(description = "Search query. Can contain pin description keywords or comma-separated pin IDs.", required = true) @Valid @RequestParam(value = "query", required = true) query: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<PinsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
