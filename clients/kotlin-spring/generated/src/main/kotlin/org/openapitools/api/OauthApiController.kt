package org.openapitools.api

import org.openapitools.model.ConversionAccessTokenResponse
import org.openapitools.model.Error
import org.openapitools.model.OauthAccessTokenResponse
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
import org.openapitools.api.OauthApiController.Companion.BASE_PATH

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
@RequestMapping("\${openapi.pinterestREST.base-path:\${api.base-path:$BASE_PATH}}")
class OauthApiController() {

    @Operation(
        summary = "Generate OAuth access token for conversion API",
        operationId = "oauthConversionToken",
        description = """Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = ConversionAccessTokenResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_OAUTH_CONVERSION_TOKEN /* "/oauth/conversion_token" */],
        produces = ["application/json"]
    )
    fun oauthConversionToken(): ResponseEntity<ConversionAccessTokenResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Generate OAuth access token",
        operationId = "oauthToken",
        description = """Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.

Follow the complete steps for <a href='/docs/getting-started/set-up-authentication-and-authorization/' target='blank'>requesting and refreshing tokens</a>.

<strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).

Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.

Use <a href='/docs/developer-tools/token-debugger/' target='blank'>Token Debugger</a> to validate and inspect your access token.""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = OauthAccessTokenResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "basic") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_OAUTH_TOKEN /* "/oauth/token" */],
        produces = ["application/json"],
        consumes = ["application/x-www-form-urlencoded"]
    )
    fun oauthToken(
        @Parameter(description = "", required = true, schema = Schema(allowableValues = ["authorization_code", "refresh_token", "client_credentials"])) @Valid @RequestParam(value = "grant_type", required = true) grantType: kotlin.String
    ): ResponseEntity<OauthAccessTokenResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Revoke a token",
        operationId = "tokenRevoke",
        description = """Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Successful token revocation. No content is returned."),
            ApiResponse(responseCode = "401", description = "Client authentication error.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Client is not allowed to revoke token.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "basic") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_TOKEN_REVOKE /* "/oauth/token/revoke" */],
        produces = ["application/json"],
        consumes = ["application/x-www-form-urlencoded"]
    )
    fun tokenRevoke(
        @Parameter(description = "The token to revoke.", required = true) @Valid @RequestParam(value = "token", required = true) token: kotlin.String,
        @Parameter(description = "The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.", schema = Schema(allowableValues = ["access_token", "refresh_token"])) @Valid @RequestParam(value = "token_type_hint", required = false) tokenTypeHint: kotlin.String?
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
