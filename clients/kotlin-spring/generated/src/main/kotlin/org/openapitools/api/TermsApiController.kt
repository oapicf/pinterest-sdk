package org.openapitools.api

import org.openapitools.model.PinterestLibError
import org.openapitools.model.RelatedTerms
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
class TermsApiController() {

    @Operation(
        summary = "List related terms",
        operationId = "termsRelatedList",
        description = """Get a list of terms logically related to each input term.

Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = RelatedTerms::class))]),
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
        // "/terms/related"
        value = [PATH_TERMS_RELATED_LIST],
        produces = ["application/json"]
    )
    fun termsRelatedList(
        @NotNull @Parameter(description = "List of input terms.", required = true) @Valid @RequestParam(value = "terms", required = true) terms: kotlin.collections.List<kotlin.String>
    ): ResponseEntity<RelatedTerms> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List suggested terms",
        operationId = "termsSuggestedList",
        description = """Get popular search terms that begin with your input term.

Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = kotlin.String::class)))]),
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
        // "/terms/suggested"
        value = [PATH_TERMS_SUGGESTED_LIST],
        produces = ["application/json"]
    )
    fun termsSuggestedList(
        @NotNull @Parameter(description = "Input term.", required = true) @Valid @RequestParam(value = "term", required = true) term: kotlin.String,
        @Min(value=1) @Max(value=10) @Parameter(description = "Max suggested terms to return.", schema = Schema(defaultValue = "4")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "4") limit: kotlin.Int
    ): ResponseEntity<List<kotlin.String>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v5"
        const val PATH_TERMS_RELATED_LIST: String = "/terms/related"
        const val PATH_TERMS_SUGGESTED_LIST: String = "/terms/suggested"
    }
}
