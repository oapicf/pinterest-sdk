package org.openapitools.api

import org.openapitools.model.Error
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
        description = """Get a list of terms logically related to each input term. <p/>
Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = RelatedTerms::class))]),
            ApiResponse(responseCode = "400", description = "Invalid terms related parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/terms/related"],
        produces = ["application/json"]
    )
    fun termsRelatedList(@NotNull @Parameter(description = "List of input terms.", required = true) @Valid @RequestParam(value = "terms", required = true) terms: kotlin.collections.List<kotlin.String>): ResponseEntity<RelatedTerms> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List suggested terms",
        operationId = "termsSuggestedList",
        description = """Get popular search terms that begin with your input term. <p/>
Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(array = ArraySchema(schema = Schema(implementation = kotlin.String::class)))]),
            ApiResponse(responseCode = "400", description = "Invalid terms suggested parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/terms/suggested"],
        produces = ["application/json"]
    )
    fun termsSuggestedList(@NotNull @Parameter(description = "Input term.", required = true) @Valid @RequestParam(value = "term", required = true) term: kotlin.String,@Min(1) @Max(10) @Parameter(description = "Max suggested terms to return.", schema = Schema(defaultValue = "4")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "4") limit: kotlin.Int): ResponseEntity<List<kotlin.String>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
