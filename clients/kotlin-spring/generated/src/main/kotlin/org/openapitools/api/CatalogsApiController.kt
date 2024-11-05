package org.openapitools.api

import org.openapitools.model.Catalog
import org.openapitools.model.CatalogsCreateReportResponse
import org.openapitools.model.CatalogsCreateRequest
import org.openapitools.model.CatalogsFeed
import org.openapitools.model.CatalogsFeedIngestion
import org.openapitools.model.CatalogsItemValidationIssue
import org.openapitools.model.CatalogsItems
import org.openapitools.model.CatalogsItemsBatch
import org.openapitools.model.CatalogsItemsFilters
import org.openapitools.model.CatalogsItemsRequest
import org.openapitools.model.CatalogsList200Response
import org.openapitools.model.CatalogsListProductsByFilterRequest
import org.openapitools.model.CatalogsProductGroupPinsList200Response
import org.openapitools.model.CatalogsProductGroupProductCountsVertical
import org.openapitools.model.CatalogsProductGroupsList200Response
import org.openapitools.model.CatalogsProductGroupsUpdateRequest
import org.openapitools.model.CatalogsReport
import org.openapitools.model.CatalogsReportParameters
import org.openapitools.model.CatalogsVerticalProductGroup
import org.openapitools.model.Error
import org.openapitools.model.FeedProcessingResultsList200Response
import org.openapitools.model.FeedsCreateRequest
import org.openapitools.model.FeedsList200Response
import org.openapitools.model.FeedsUpdateRequest
import org.openapitools.model.ItemsBatchPostRequest
import org.openapitools.model.ItemsIssuesList200Response
import org.openapitools.model.MultipleProductGroupsInner
import org.openapitools.model.ReportsStats200Response
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
class CatalogsApiController() {

    @Operation(
        summary = "Create catalog",
        operationId = "catalogsCreate",
        description = """Create a new catalog owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>

Note: this API only supports the catalog type of HOTEL for now.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = Catalog::class))]),
            ApiResponse(responseCode = "400", description = "Invalid parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized access.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/catalogs"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun catalogsCreate(@Parameter(description = "Request object used to created a feed.", required = true) @Valid @RequestBody catalogsCreateRequest: CatalogsCreateRequest,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<Catalog> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List catalogs",
        operationId = "catalogsList",
        description = """Fetch catalogs owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CatalogsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized access.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs"],
        produces = ["application/json"]
    )
    fun catalogsList(@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<CatalogsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List products by product group",
        operationId = "catalogsProductGroupPinsList",
        description = """Get a list of product pins for a given Catalogs Product Group Id owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CatalogsProductGroupPinsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized access.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Catalogs product group not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "catalogs:read", "pins:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/product_groups/{product_group_id}/products"],
        produces = ["application/json"]
    )
    fun catalogsProductGroupPinsList(@Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a product group", required = true) @PathVariable("product_group_id") productGroupId: kotlin.String,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,@Parameter(description = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "pin_metrics", required = false, defaultValue = "false") pinMetrics: kotlin.Boolean): ResponseEntity<CatalogsProductGroupPinsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create product group",
        operationId = "catalogsProductGroupsCreate",
        description = """Create product group to use in Catalogs owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.""",
        responses = [
            ApiResponse(responseCode = "201", description = "Success", content = [Content(schema = Schema(implementation = CatalogsVerticalProductGroup::class))]),
            ApiResponse(responseCode = "400", description = "Invalid body.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized access.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Forbidden. Account not approved for catalog product group mutations yet.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Conflict. Can't create this catalogs product group with this value.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/catalogs/product_groups"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun catalogsProductGroupsCreate(@Parameter(description = "Request object used to create a single catalogs product groups.", required = true) @Valid @RequestBody multipleProductGroupsInner: MultipleProductGroupsInner,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<CatalogsVerticalProductGroup> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create product groups",
        operationId = "catalogsProductGroupsCreateMany",
        description = """Create product group to use in Catalogs owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.""",
        responses = [
            ApiResponse(responseCode = "201", description = "Success", content = [Content(array = ArraySchema(schema = Schema(implementation = kotlin.String::class)))]),
            ApiResponse(responseCode = "400", description = "Invalid body.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized access.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Forbidden. Account not approved for catalog product group mutations yet.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Conflict. Can't create this catalogs product group with this value.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/catalogs/product_groups/multiple"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun catalogsProductGroupsCreateMany(@Parameter(description = "Request object used to create one or more catalogs product groups.", required = true) @Valid @RequestBody multipleProductGroupsInner: kotlin.collections.List<MultipleProductGroupsInner>,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<List<kotlin.String>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete product group",
        operationId = "catalogsProductGroupsDelete",
        description = """Delete a product group owned by the "operation user_account" from being in use in Catalogs.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>""",
        responses = [
            ApiResponse(responseCode = "204", description = "Catalogs Product Group deleted successfully."),
            ApiResponse(responseCode = "400", description = "Invalid catalogs product group id parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized access.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Forbidden. Account not approved for catalog product group mutations yet.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Catalogs product group not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Conflict. Can't delete this catalogs product group.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/catalogs/product_groups/{product_group_id}"],
        produces = ["application/json"]
    )
    fun catalogsProductGroupsDelete(@Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a product group", required = true) @PathVariable("product_group_id") productGroupId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete product groups",
        operationId = "catalogsProductGroupsDeleteMany",
        description = """Delete product groups owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>""",
        responses = [
            ApiResponse(responseCode = "204", description = "Catalogs Product Groups deleted successfully."),
            ApiResponse(responseCode = "401", description = "Unauthorized access.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Forbidden. Account not approved for catalog product group mutations yet.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Catalogs product group not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Conflict. Can't delete this catalogs product group.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/catalogs/product_groups/multiple"],
        produces = ["application/json"]
    )
    fun catalogsProductGroupsDeleteMany(@NotNull @Size(min=1,max=1000) @Parameter(description = "Comma-separated list of product group ids", required = true) @Valid @RequestParam(value = "id", required = true) id: kotlin.collections.List<kotlin.Int>,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get product group",
        operationId = "catalogsProductGroupsGet",
        description = """Get a singe product group for a given Catalogs Product Group Id owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CatalogsVerticalProductGroup::class))]),
            ApiResponse(responseCode = "400", description = "Invalid catalogs product group id parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized access.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Forbidden. Account not approved for catalog product group mutations yet.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Catalogs product group not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Conflict. Can't get a catalogs product group without an existing catalog.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/product_groups/{product_group_id}"],
        produces = ["application/json"]
    )
    fun catalogsProductGroupsGet(@Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a product group", required = true) @PathVariable("product_group_id") productGroupId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<CatalogsVerticalProductGroup> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List product groups",
        operationId = "catalogsProductGroupsList",
        description = """Get a list of product groups for a given Catalogs Feed Id owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CatalogsProductGroupsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid feed parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized access.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Forbidden. Account not approved for catalog product group mutations yet.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Data feed not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Conflict. Can't create this catalogs product group with this value.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/product_groups"],
        produces = ["application/json"]
    )
    fun catalogsProductGroupsList(@Size(min=1,max=1000) @Parameter(description = "Comma-separated list of product group ids") @Valid @RequestParam(value = "id", required = false) id: kotlin.collections.List<kotlin.Int>?,@Pattern(regexp="^\\d+$") @Parameter(description = "Filter entities for a given feed_id. If not given, all feeds are considered.") @Valid @RequestParam(value = "feed_id", required = false) feedId: kotlin.String?,@Pattern(regexp="^\\d+$") @Parameter(description = "Filter entities for a given catalog_id. If not given, all catalogs are considered.") @Valid @RequestParam(value = "catalog_id", required = false) catalogId: kotlin.String?,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<CatalogsProductGroupsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get product counts",
        operationId = "catalogsProductGroupsProductCountsGet",
        description = """Get a product counts for a given Catalogs Product Group owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CatalogsProductGroupProductCountsVertical::class))]),
            ApiResponse(responseCode = "404", description = "Product Group Not Found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Can't access this feature without an existing catalog.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/product_groups/{product_group_id}/product_counts"],
        produces = ["application/json"]
    )
    fun catalogsProductGroupsProductCountsGet(@Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a product group", required = true) @PathVariable("product_group_id") productGroupId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<CatalogsProductGroupProductCountsVertical> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update single product group",
        operationId = "catalogsProductGroupsUpdate",
        description = """Update product group owned by the "operation user_account" to use in Catalogs.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CatalogsVerticalProductGroup::class))]),
            ApiResponse(responseCode = "400", description = "Invalid parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized access.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Forbidden. Account not approved for catalog product group mutations yet.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Catalogs product group not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Conflict. Can't update this catalogs product group to this value.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/catalogs/product_groups/{product_group_id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun catalogsProductGroupsUpdate(@Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a product group", required = true) @PathVariable("product_group_id") productGroupId: kotlin.String,@Parameter(description = "Request object used to Update a catalogs product group.", required = true) @Valid @RequestBody catalogsProductGroupsUpdateRequest: CatalogsProductGroupsUpdateRequest,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<CatalogsVerticalProductGroup> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List feed processing results",
        operationId = "feedProcessingResultsList",
        description = """Fetch a feed processing results owned by the "operation user_account". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = FeedProcessingResultsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized access.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Feed not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/feeds/{feed_id}/processing_results"],
        produces = ["application/json"]
    )
    fun feedProcessingResultsList(@Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a feed", required = true) @PathVariable("feed_id") feedId: kotlin.String,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<FeedProcessingResultsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create feed",
        operationId = "feedsCreate",
        description = """Create a new feed owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Please, be aware that "default_country"
and "default_locale" are not required in the spec for forward compatibility
but for now the API will not accept requests without those fields.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.""",
        responses = [
            ApiResponse(responseCode = "201", description = "Success", content = [Content(schema = Schema(implementation = CatalogsFeed::class))]),
            ApiResponse(responseCode = "400", description = "Invalid feed parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized access.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Business account required.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "User website required.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "422", description = "Unique feed name is required.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "501", description = "Not implemented (absent \"default_country\" or \"default_locale\").", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read", "catalogs:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "catalogs:read", "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/catalogs/feeds"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun feedsCreate(@Parameter(description = "Request object used to created a feed.", required = true) @Valid @RequestBody feedsCreateRequest: FeedsCreateRequest,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<CatalogsFeed> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete feed",
        operationId = "feedsDelete",
        description = """Delete a feed owned by the "operating user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.""",
        responses = [
            ApiResponse(responseCode = "204", description = "Feed deleted successfully."),
            ApiResponse(responseCode = "400", description = "Invalid feed parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Forbidden. Account not approved for feed mutations yet.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Data feed not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Conflict. Can't delete a feed with active promotions.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read", "catalogs:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "catalogs:read", "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/catalogs/feeds/{feed_id}"],
        produces = ["application/json"]
    )
    fun feedsDelete(@Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a feed", required = true) @PathVariable("feed_id") feedId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get feed",
        operationId = "feedsGet",
        description = """Get a single feed owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CatalogsFeed::class))]),
            ApiResponse(responseCode = "400", description = "Invalid feed parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized access.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Data feed not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/feeds/{feed_id}"],
        produces = ["application/json"]
    )
    fun feedsGet(@Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a feed", required = true) @PathVariable("feed_id") feedId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<CatalogsFeed> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Ingest feed items",
        operationId = "feedsIngest",
        description = """Ingest items for a given feed owned by the "operation user_account".

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>

Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The ingestion process was successfully started.", content = [Content(schema = Schema(implementation = CatalogsFeedIngestion::class))]),
            ApiResponse(responseCode = "400", description = "Invalid feed parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Forbidden. Account not approved for feed mutations yet.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Data feed not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/catalogs/feeds/{feed_id}/ingest"],
        produces = ["application/json"]
    )
    fun feedsIngest(@Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a feed", required = true) @PathVariable("feed_id") feedId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<CatalogsFeedIngestion> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List feeds",
        operationId = "feedsList",
        description = """Fetch feeds owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = FeedsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized access.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/feeds"],
        produces = ["application/json"]
    )
    fun feedsList(@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Pattern(regexp="^\\d+$") @Parameter(description = "Filter entities for a given catalog_id. If not given, all catalogs are considered.") @Valid @RequestParam(value = "catalog_id", required = false) catalogId: kotlin.String?,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<FeedsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update feed",
        operationId = "feedsUpdate",
        description = """Update a feed owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CatalogsFeed::class))]),
            ApiResponse(responseCode = "400", description = "Invalid feed parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Forbidden. Account not approved for feed mutations yet.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Data feed not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read", "catalogs:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "catalogs:read", "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/catalogs/feeds/{feed_id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun feedsUpdate(@Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a feed", required = true) @PathVariable("feed_id") feedId: kotlin.String,@Parameter(description = "Request object used to update a feed.", required = true) @Valid @RequestBody feedsUpdateRequest: FeedsUpdateRequest,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<CatalogsFeed> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get item batch status",
        operationId = "itemsBatchGet",
        description = """Get a single catalogs items batch owned by the "operating user_account". <a href="/docs/api-features/shopping-overview/#Update%20items%20in%20batch" target="_blank">See detailed documentation here.</a>
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Response containing the requested catalogs items batch", content = [Content(schema = Schema(implementation = CatalogsItemsBatch::class))]),
            ApiResponse(responseCode = "401", description = "Not authenticated to access catalogs items batch", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Not authorized to access catalogs items batch", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Catalogs items batch not found", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "405", description = "Method Not Allowed.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/items/batch/{batch_id}"],
        produces = ["application/json"]
    )
    fun itemsBatchGet(@Parameter(description = "Id of a catalogs items batch to fetch", required = true) @PathVariable("batch_id") batchId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<CatalogsItemsBatch> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Operate on item batch",
        operationId = "itemsBatchPost",
        description = """This endpoint supports multiple operations on a set of one or more catalog items owned by the "operation user_account". <a href="/docs/api-features/shopping-overview/#Update%20items%20in%20batch" target="_blank">See detailed documentation here.</a>
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

Note:
- Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.
- The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager to get assistance.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Response containing the requested catalogs items batch", content = [Content(schema = Schema(implementation = CatalogsItemsBatch::class))]),
            ApiResponse(responseCode = "400", description = "Invalid request parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Not authenticated to post catalogs items", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Not authorized to post catalogs items", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read", "catalogs:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "catalogs:read", "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/catalogs/items/batch"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun itemsBatchPost(@Parameter(description = "Request object used to create catalogs items in a batch", required = true) @Valid @RequestBody itemsBatchPostRequest: ItemsBatchPostRequest,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<CatalogsItemsBatch> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get catalogs items",
        operationId = "itemsGet",
        description = """Get the items of the catalog owned by the "operation user_account". <a href="/docs/api-features/shopping-overview/#Update%20items%20in%20batch" target="_blank">See detailed documentation here.</a>
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: this endpoint is deprecated and will be deleted soon. Please use <a href='/docs/api/v5/#operation/items/post'>Get catalogs items (POST)</a> instead.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Response containing the requested catalogs items", content = [Content(schema = Schema(implementation = CatalogsItems::class))]),
            ApiResponse(responseCode = "400", description = "Invalid request parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Not authorized to access catalogs items", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Not authorized to access catalogs items", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/items"],
        produces = ["application/json"]
    )
    fun itemsGet(@NotNull @Parameter(description = "Country for the Catalogs Items", required = true) @Valid @RequestParam(value = "country", required = true) country: kotlin.String,@NotNull @Parameter(description = "Language for the Catalogs Items", required = true) @Valid @RequestParam(value = "language", required = true) language: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,@Parameter(description = "This parameter is deprecated. Use filters instead.") @Valid @RequestParam(value = "item_ids", required = false) itemIds: kotlin.collections.List<kotlin.String>?,@Parameter(description = "Identifies items to be retrieved. This is a required parameter.") @Valid filters: CatalogsItemsFilters?): ResponseEntity<CatalogsItems> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List item issues",
        operationId = "itemsIssuesList",
        description = """List item validation issues for a given feed processing result owned by the "operation user_account". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: To get a list of all affected items instead of sampled issues, please refer to <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a> and <a href='/docs/api/v5/#operation/reports/get'>Get catalogs report</a> endpoints. Moreover, they support multiple types of catalogs.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = ItemsIssuesList200Response::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized access.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Processing Result not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "501", description = "Not implemented.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/processing_results/{processing_result_id}/item_issues"],
        produces = ["application/json"]
    )
    fun itemsIssuesList(@Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).", required = true) @PathVariable("processing_result_id") processingResultId: kotlin.String,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.") @Valid @RequestParam(value = "item_numbers", required = false) itemNumbers: kotlin.collections.List<kotlin.Int>?,@Parameter(description = "Filter item validation issues that have a given type of item validation issue.", schema = Schema(allowableValues = ["AD_LINK_FORMAT_WARNING", "AD_LINK_SAME_AS_LINK", "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", "ADDITIONAL_IMAGE_LINK_WARNING", "ADULT_INVALID", "ADWORDS_FORMAT_INVALID", "ADWORDS_FORMAT_WARNING", "ADWORDS_SAME_AS_LINK", "AGE_GROUP_INVALID", "ANDROID_DEEP_LINK_INVALID", "AVAILABILITY_DATE_INVALID", "AVAILABILITY_INVALID", "BLOCKLISTED_IMAGE_SIGNATURE", "COUNTRY_DOES_NOT_MAP_TO_CURRENCY", "CUSTOM_LABEL_LENGTH_TOO_LONG", "DESCRIPTION_LENGTH_TOO_LONG", "DESCRIPTION_MISSING", "DUPLICATE_PRODUCTS", "EXPIRATION_DATE_INVALID", "GENDER_INVALID", "GTIN_INVALID", "IMAGE_LINK_INVALID", "IMAGE_LINK_LENGTH_TOO_LONG", "IMAGE_LINK_MISSING", "IMAGE_LINK_WARNING", "INVALID_DOMAIN", "IOS_DEEP_LINK_INVALID", "IS_BUNDLE_INVALID", "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", "ITEMID_MISSING", "LINK_FORMAT_INVALID", "LINK_FORMAT_WARNING", "LINK_LENGTH_TOO_LONG", "LIST_PRICE_INVALID", "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", "MIN_AD_PRICE_INVALID", "MPN_INVALID", "MULTIPACK_INVALID", "OPTIONAL_CONDITION_INVALID", "OPTIONAL_CONDITION_MISSING", "OPTIONAL_PRODUCT_CATEGORY_INVALID", "OPTIONAL_PRODUCT_CATEGORY_MISSING", "PARSE_LINE_ERROR", "PINJOIN_CONTENT_UNSAFE", "PRICE_CANNOT_BE_DETERMINED", "PRICE_MISSING", "PRODUCT_CATEGORY_DEPTH_WARNING", "PRODUCT_LINK_MISSING", "PRODUCT_PRICE_INVALID", "PRODUCT_TYPE_LENGTH_TOO_LONG", "SALE_DATE_INVALID", "SALES_PRICE_INVALID", "SALES_PRICE_TOO_HIGH", "SALES_PRICE_TOO_LOW", "SHIPPING_INVALID", "SHIPPING_HEIGHT_INVALID", "SHIPPING_WEIGHT_INVALID", "SHIPPING_WIDTH_INVALID", "SIZE_SYSTEM_INVALID", "SIZE_TYPE_INVALID", "TAX_INVALID", "TITLE_LENGTH_TOO_LONG", "TITLE_MISSING", "TOO_MANY_ADDITIONAL_IMAGE_LINKS", "UTM_SOURCE_AUTO_CORRECTED", "WEIGHT_UNIT_INVALID"])) @Valid @RequestParam(value = "item_validation_issue", required = false) itemValidationIssue: CatalogsItemValidationIssue?,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<ItemsIssuesList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get catalogs items (POST)",
        operationId = "itemsPost",
        description = """Get the items of the catalog owned by the "operation user_account". <a href="/docs/api-features/shopping-overview/#Update%20items%20in%20batch" target="_blank">See detailed documentation here.</a>
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Response containing the requested catalogs items", content = [Content(schema = Schema(implementation = CatalogsItems::class))]),
            ApiResponse(responseCode = "400", description = "Invalid request", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Not authorized to access catalogs items", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Not authorized to access catalogs items", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/catalogs/items"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun itemsPost(@Parameter(description = "Request object used to get catalogs items", required = true) @Valid @RequestBody catalogsItemsRequest: CatalogsItemsRequest,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<CatalogsItems> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List products by filter",
        operationId = "productsByProductGroupFilterList",
        description = """List products Pins owned by the "operation user_account" that meet the criteria specified in the Catalogs Product Group Filter given in the request.
- This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: This endpoint only supports RETAIL catalog at the moment.

<a href='/docs/api-features/shopping-overview/'>Learn more</a>""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CatalogsProductGroupPinsList200Response::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized access.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Conflict. Can't get products.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "catalogs:read", "pins:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/catalogs/products/get_by_product_group_filters"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun productsByProductGroupFilterList(@Parameter(description = "Object holding a group of filters for a catalog product group", required = true) @Valid @RequestBody catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,@Parameter(description = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "pin_metrics", required = false, defaultValue = "false") pinMetrics: kotlin.Boolean): ResponseEntity<CatalogsProductGroupPinsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Build catalogs report",
        operationId = "reportsCreate",
        description = """Async request to create a report of the catalog owned by the "operation user_account". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Response containing the report token", content = [Content(schema = Schema(implementation = CatalogsCreateReportResponse::class))]),
            ApiResponse(responseCode = "404", description = "Entity (e.g., catalog, feed or processing_result) not found", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Can't access this feature without an existing catalog.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/catalogs/reports"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun reportsCreate(@Parameter(description = "Request object to asynchronously create a report.", required = true) @Valid @RequestBody catalogsReportParameters: CatalogsReportParameters,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<CatalogsCreateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get catalogs report",
        operationId = "reportsGet",
        description = """This returns a URL to a report given a token returned from <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a>. You can use the URL to download the report.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Response that contains a link to download the report", content = [Content(schema = Schema(implementation = CatalogsReport::class))]),
            ApiResponse(responseCode = "400", description = "The token you provided is not valid or has expired.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Can't access this feature without an existing catalog.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/reports"],
        produces = ["application/json"]
    )
    fun reportsGet(@NotNull @Parameter(description = "Token returned from async build report call", required = true) @Valid @RequestParam(value = "token", required = true) token: kotlin.String,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<CatalogsReport> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List report stats",
        operationId = "reportsStats",
        description = """List aggregated numbers of issues for a catalog owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Response containing the diagnostics aggregated counters", content = [Content(schema = Schema(implementation = ReportsStats200Response::class))]),
            ApiResponse(responseCode = "401", description = "Not authorized to access catalogs", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/reports/stats"],
        produces = ["application/json"]
    )
    fun reportsStats(@NotNull @Parameter(description = "Contains the parameters for report identification.", required = true) @Valid parameters: CatalogsReportParameters,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<ReportsStats200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
