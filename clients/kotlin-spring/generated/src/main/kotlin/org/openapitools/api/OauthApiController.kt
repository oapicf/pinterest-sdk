package org.openapitools.api

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
        summary = "Generate OAuth access token",
        operationId = "oauthToken",
        description = """Generate an OAuth access token by using an authorization code or a refresh token.

IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).

See <a href='/docs/getting-started/authentication/'>Authentication</a> for more.

<strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = OauthAccessTokenResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "basic") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/oauth/token"],
        produces = ["application/json"],
        consumes = ["application/x-www-form-urlencoded"]
    )
    fun oauthToken(@Parameter(description = "", required = true, schema = Schema(allowableValues = ["authorization_code", "refresh_token"])) @RequestParam(value = "grant_type", required = true) grantType: kotlin.String ): ResponseEntity<OauthAccessTokenResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
