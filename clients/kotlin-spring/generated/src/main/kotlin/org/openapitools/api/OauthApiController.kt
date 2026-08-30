package org.openapitools.api

import org.openapitools.model.ConversionAccessToken
import org.openapitools.model.OauthAccessToken
import org.openapitools.model.PinterestLibError
import org.openapitools.model.TokenGrantType
import org.openapitools.model.TokenTypeHint
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
class OauthApiController() {

    @Operation(
        summary = "Generate OAuth access token for conversion API",
        operationId = "oauthConversionToken",
        description = """Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ConversionAccessToken::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/oauth/conversion_token"
        value = [PATH_OAUTH_CONVERSION_TOKEN],
        produces = ["application/json"]
    )
    fun oauthConversionToken(): ResponseEntity<ConversionAccessToken> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Generate OAuth access token",
        operationId = "oauthToken",
        description = """Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.

Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).

**Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).

Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.

Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token.
""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = OauthAccessToken::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = OauthAccessToken::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "basic") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/oauth/token"
        value = [PATH_OAUTH_TOKEN],
        produces = ["application/json"],
        consumes = ["application/x-www-form-urlencoded"]
    )
    fun oauthToken(
        @Parameter(description = "", required = true, schema = Schema(allowableValues = ["authorization_code", "refresh_token", "client_credentials"])) @Valid @RequestParam(value = "grant_type", required = true) grantType: TokenGrantType,
        @Parameter(description = "") @Valid @RequestParam(value = "code", required = false) code: kotlin.String?,
        @Parameter(description = "  If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.") @Valid @RequestParam(value = "continuous_refresh", required = false) continuousRefresh: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "redirect_uri", required = false) redirectUri: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "refresh_token", required = false) refreshToken: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "scope", required = false) scope: kotlin.String?
    ): ResponseEntity<OauthAccessToken> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Revoke a token",
        operationId = "tokenRevoke",
        description = """Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded."),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "basic") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/oauth/token/revoke"
        value = [PATH_TOKEN_REVOKE],
        produces = ["application/json"],
        consumes = ["application/x-www-form-urlencoded"]
    )
    fun tokenRevoke(
        @Parameter(description = "The token to revoke.", required = true) @Valid @RequestParam(value = "token", required = true) token: kotlin.String,
        @Parameter(description = "The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.", schema = Schema(allowableValues = ["access_token", "refresh_token"])) @Valid @RequestParam(value = "token_type_hint", required = false) tokenTypeHint: TokenTypeHint?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v5"
        const val PATH_OAUTH_CONVERSION_TOKEN: String = "/oauth/conversion_token"
        const val PATH_OAUTH_TOKEN: String = "/oauth/token"
        const val PATH_TOKEN_REVOKE: String = "/oauth/token/revoke"
    }
}
