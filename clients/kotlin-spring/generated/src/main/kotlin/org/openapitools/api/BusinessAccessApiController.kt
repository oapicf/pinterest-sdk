package org.openapitools.api

import org.openapitools.model.BrandAccount
import org.openapitools.model.BrandAccountCreate
import org.openapitools.model.BrandAccountUpdate
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
class BusinessAccessApiController() {

    @Operation(
        summary = "Create a Brand Account",
        operationId = "brandAccountsCreate",
        description = """Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = BrandAccount::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = BrandAccount::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read", "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts"
        value = [PATH_BRAND_ACCOUNTS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun brandAccountsCreate(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "business hierarchy node id", required = true) @PathVariable("business_hierarchy_id") businessHierarchyId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody brandAccountCreate: BrandAccountCreate
    ): ResponseEntity<BrandAccount> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update a Brand Account",
        operationId = "brandAccountsUpdate",
        description = """Update an existing Brand Account""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = BrandAccount::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "409", description = "The request could not be processed because of a conflict in the current state of the resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read", "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}"
        value = [PATH_BRAND_ACCOUNTS_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun brandAccountsUpdate(
        @Parameter(description = "", required = true) @PathVariable("brand_account_id") brandAccountId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "business hierarchy node id", required = true) @PathVariable("business_hierarchy_id") businessHierarchyId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody brandAccountUpdate: BrandAccountUpdate
    ): ResponseEntity<BrandAccount> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v5"
        const val PATH_BRAND_ACCOUNTS_CREATE: String = "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts"
        const val PATH_BRAND_ACCOUNTS_UPDATE: String = "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}"
    }
}
