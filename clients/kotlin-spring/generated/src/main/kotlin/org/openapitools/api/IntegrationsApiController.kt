package org.openapitools.api

import org.openapitools.model.IntegrationLogsInvalidLogResponse
import org.openapitools.model.IntegrationLogsRequestCreate
import org.openapitools.model.IntegrationLogsSuccessResponse
import org.openapitools.model.IntegrationMetadata
import org.openapitools.model.IntegrationMetadataCreate
import org.openapitools.model.IntegrationMetadataUpdate
import org.openapitools.model.IntegrationRecord
import org.openapitools.model.IntegrationsGetList200Response
import org.openapitools.model.PinterestLibError
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
class IntegrationsApiController() {

    @Operation(
        summary = "Delete commerce integration",
        operationId = "integrationsCommerceDel",
        description = """Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = IntegrationMetadata::class))]),
            ApiResponse(responseCode = "204", description = "Resource deleted successfully."),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/integrations/commerce/{external_business_id}"
        value = [PATH_INTEGRATIONS_COMMERCE_DEL],
        produces = ["application/json"]
    )
    fun integrationsCommerceDel(
        @Parameter(description = "External business ID for the integration.", required = true) @PathVariable("external_business_id") externalBusinessId: kotlin.String
    ): ResponseEntity<IntegrationMetadata> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get commerce integration",
        operationId = "integrationsCommerceGet",
        description = """Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = IntegrationMetadata::class))]),
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
        // "/integrations/commerce/{external_business_id}"
        value = [PATH_INTEGRATIONS_COMMERCE_GET],
        produces = ["application/json"]
    )
    fun integrationsCommerceGet(
        @Parameter(description = "External business ID for the integration.", required = true) @PathVariable("external_business_id") externalBusinessId: kotlin.String
    ): ResponseEntity<IntegrationMetadata> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update commerce integration",
        operationId = "integrationsCommercePatch",
        description = """Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = IntegrationMetadata::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/integrations/commerce/{external_business_id}"
        value = [PATH_INTEGRATIONS_COMMERCE_PATCH],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun integrationsCommercePatch(
        @Parameter(description = "External business ID for the integration.", required = true) @PathVariable("external_business_id") externalBusinessId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody integrationMetadataUpdate: IntegrationMetadataUpdate
    ): ResponseEntity<IntegrationMetadata> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create commerce integration",
        operationId = "integrationsCommercePost",
        description = """Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = IntegrationMetadata::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = IntegrationMetadata::class))]),
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
        // "/integrations/commerce"
        value = [PATH_INTEGRATIONS_COMMERCE_POST],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun integrationsCommercePost(
        @Parameter(description = "", required = true) @Valid @RequestBody integrationMetadataCreate: IntegrationMetadataCreate
    ): ResponseEntity<IntegrationMetadata> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get integration metadata",
        operationId = "integrationsGetById",
        description = """Get integration metadata by ID.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = IntegrationRecord::class))]),
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
        // "/integrations/{id}"
        value = [PATH_INTEGRATIONS_GET_BY_ID],
        produces = ["application/json"]
    )
    fun integrationsGetById(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Integration record ID.", required = true) @PathVariable("id") id: kotlin.String
    ): ResponseEntity<IntegrationRecord> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get integration metadata list",
        operationId = "integrationsGetList",
        description = """Get integration metadata list.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = IntegrationsGetList200Response::class))]),
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
        // "/integrations"
        value = [PATH_INTEGRATIONS_GET_LIST],
        produces = ["application/json"]
    )
    fun integrationsGetList(
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<IntegrationsGetList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Receives batched logs from integration applications.",
        operationId = "integrationsLogsPost",
        description = """This endpoint receives batched logs from integration applications on partner platforms.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = IntegrationLogsSuccessResponse::class))]),
            ApiResponse(responseCode = "400", description = "The server could not understand the request due to invalid syntax.", content = [Content(schema = Schema(implementation = IntegrationLogsInvalidLogResponse::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/integrations/logs"
        value = [PATH_INTEGRATIONS_LOGS_POST],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun integrationsLogsPost(
        @Parameter(description = "", required = true) @Valid @RequestBody integrationLogsRequestCreate: IntegrationLogsRequestCreate
    ): ResponseEntity<IntegrationLogsSuccessResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v5"
        const val PATH_INTEGRATIONS_COMMERCE_DEL: String = "/integrations/commerce/{external_business_id}"
        const val PATH_INTEGRATIONS_COMMERCE_GET: String = "/integrations/commerce/{external_business_id}"
        const val PATH_INTEGRATIONS_COMMERCE_PATCH: String = "/integrations/commerce/{external_business_id}"
        const val PATH_INTEGRATIONS_COMMERCE_POST: String = "/integrations/commerce"
        const val PATH_INTEGRATIONS_GET_BY_ID: String = "/integrations/{id}"
        const val PATH_INTEGRATIONS_GET_LIST: String = "/integrations"
        const val PATH_INTEGRATIONS_LOGS_POST: String = "/integrations/logs"
    }
}
