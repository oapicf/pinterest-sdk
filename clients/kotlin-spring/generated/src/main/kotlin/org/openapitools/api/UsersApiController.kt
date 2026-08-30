package org.openapitools.api

import org.openapitools.model.PinterestLibError
import org.openapitools.model.UserAccountFollowedInterests200Response
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
class UsersApiController() {

    @Operation(
        summary = "List following interests",
        operationId = "userAccountFollowedInterests",
        description = """Get a list of a user's following interests in one place.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = UserAccountFollowedInterests200Response::class))]),
            ApiResponse(responseCode = "400", description = "The server could not understand the request due to invalid syntax.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Access is unauthorized.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The server cannot find the requested resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "Unexpected error", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/users/{username}/interests/follow"
        value = [PATH_USER_ACCOUNT_FOLLOWED_INTERESTS],
        produces = ["application/json"]
    )
    fun userAccountFollowedInterests(
        @Pattern(regexp="(?!^\\d+$)^.+$") @Parameter(description = "A valid username", required = true) @PathVariable("username") username: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<UserAccountFollowedInterests200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v5"
        const val PATH_USER_ACCOUNT_FOLLOWED_INTERESTS: String = "/users/{username}/interests/follow"
    }
}
