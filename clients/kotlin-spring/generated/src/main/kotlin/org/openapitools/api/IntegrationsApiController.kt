package org.openapitools.api

import org.openapitools.model.DetailedError
import org.openapitools.model.Error
import org.openapitools.model.IntegrationLogsRequest
import org.openapitools.model.IntegrationLogsSuccessResponse
import org.openapitools.model.IntegrationMetadata
import org.openapitools.model.IntegrationRecord
import org.openapitools.model.IntegrationRequest
import org.openapitools.model.IntegrationRequestPatch
import org.openapitools.model.IntegrationsGetList200Response
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
        description = """Delete commerce integration metadata for the given external business ID.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.""",
        responses = [
            ApiResponse(responseCode = "204", description = "Commerce Integration deleted successfully"),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/integrations/commerce/{external_business_id}"],
        produces = ["application/json"]
    )
    fun integrationsCommerceDel(@Parameter(description = "External business ID for the integration.", required = true) @PathVariable("external_business_id") externalBusinessId: kotlin.String): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get commerce integration",
        operationId = "integrationsCommerceGet",
        description = """Get commerce integration metadata associated with the given external business ID.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = IntegrationMetadata::class))]),
            ApiResponse(responseCode = "404", description = "Integration not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Can't access this integration metadata.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/integrations/commerce/{external_business_id}"],
        produces = ["application/json"]
    )
    fun integrationsCommerceGet(@Parameter(description = "External business ID for the integration.", required = true) @PathVariable("external_business_id") externalBusinessId: kotlin.String): ResponseEntity<IntegrationMetadata> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update commerce integration",
        operationId = "integrationsCommercePatch",
        description = """Update commerce integration metadata for the given external business ID.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = IntegrationMetadata::class))]),
            ApiResponse(responseCode = "404", description = "Integration not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Can't access this integration metadata.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/integrations/commerce/{external_business_id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun integrationsCommercePatch(@Parameter(description = "External business ID for the integration.", required = true) @PathVariable("external_business_id") externalBusinessId: kotlin.String,@Parameter(description = "Parameters to get create/update the Integration Metadata") @Valid @RequestBody(required = false) integrationRequestPatch: IntegrationRequestPatch?): ResponseEntity<IntegrationMetadata> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create commerce integration",
        operationId = "integrationsCommercePost",
        description = """Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = IntegrationMetadata::class))]),
            ApiResponse(responseCode = "404", description = "Integration not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Can't access this integration metadata.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/integrations/commerce"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun integrationsCommercePost(@Parameter(description = "Parameters to get create/update the Integration Metadata") @Valid @RequestBody(required = false) integrationRequest: IntegrationRequest?): ResponseEntity<IntegrationMetadata> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get integration metadata",
        operationId = "integrationsGetById",
        description = """Get integration metadata by ID.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = IntegrationRecord::class))]),
            ApiResponse(responseCode = "404", description = "Integration not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/integrations/{id}"],
        produces = ["application/json"]
    )
    fun integrationsGetById(@Parameter(description = "Integration ID.", required = true) @PathVariable("id") id: kotlin.String): ResponseEntity<IntegrationRecord> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get integration metadata list",
        operationId = "integrationsGetList",
        description = """Get integration metadata list.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = IntegrationsGetList200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/integrations"],
        produces = ["application/json"]
    )
    fun integrationsGetList(@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int): ResponseEntity<IntegrationsGetList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Receives batched logs from integration applications.",
        operationId = "integrationsLogsPost",
        description = """This endpoint receives batched logs from integration applications on partner platforms.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success.", content = [Content(schema = Schema(implementation = IntegrationLogsSuccessResponse::class))]),
            ApiResponse(responseCode = "400", description = "Bad request.", content = [Content(schema = Schema(implementation = DetailedError::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/integrations/logs"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun integrationsLogsPost(@Parameter(description = "Ingest log information from external integration application.", required = true) @Valid @RequestBody integrationLogsRequest: IntegrationLogsRequest): ResponseEntity<IntegrationLogsSuccessResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
