package org.openapitools.api

import org.openapitools.model.BrandAccountsCreate200Response
import org.openapitools.model.BrandAccountsCreateRequest
import org.openapitools.model.BrandAccountsUpdateRequest
import org.openapitools.model.Error
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
import org.openapitools.api.BusinessAccessApiController.Companion.BASE_PATH

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
class BusinessAccessApiController() {

    @Operation(
        summary = "Create a Brand Account",
        operationId = "brandAccountsCreate",
        description = """Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = BrandAccountsCreate200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read", "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_BRAND_ACCOUNTS_CREATE /* "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun brandAccountsCreate(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "business hierarchy node id", required = true) @PathVariable("business_hierarchy_id") businessHierarchyId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody brandAccountsCreateRequest: BrandAccountsCreateRequest
    ): ResponseEntity<BrandAccountsCreate200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update a Brand Account",
        operationId = "brandAccountsUpdate",
        description = """Update an existing Brand Account""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = BrandAccountsCreate200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Not authenticated to update Brand Account", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Not authorized to update Brand Account", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Brand account not found", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "This account is not a brand account.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "429", description = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read", "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = [PATH_BRAND_ACCOUNTS_UPDATE /* "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun brandAccountsUpdate(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "business hierarchy node id", required = true) @PathVariable("business_hierarchy_id") businessHierarchyId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of a brand account.", required = true) @PathVariable("brand_account_id") brandAccountId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody brandAccountsUpdateRequest: BrandAccountsUpdateRequest
    ): ResponseEntity<BrandAccountsCreate200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v5"
        const val PATH_BRAND_ACCOUNTS_CREATE: String = "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts"
        const val PATH_BRAND_ACCOUNTS_UPDATE: String = "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}"
    }
}
