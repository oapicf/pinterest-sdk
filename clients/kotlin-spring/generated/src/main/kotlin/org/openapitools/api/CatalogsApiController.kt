package org.openapitools.api

import org.openapitools.model.Catalog
import org.openapitools.model.CatalogCreate
import org.openapitools.model.CatalogsAvailableFilterValues
import org.openapitools.model.CatalogsCreateReportResponse
import org.openapitools.model.CatalogsFeed
import org.openapitools.model.CatalogsFeedCreateRequestSchema
import org.openapitools.model.CatalogsFeedIngestion
import org.openapitools.model.CatalogsFeedUpdateRequestSchema
import org.openapitools.model.CatalogsItemValidationIssue
import org.openapitools.model.CatalogsItemsBatch
import org.openapitools.model.CatalogsItemsBatchPostRequest
import org.openapitools.model.CatalogsItemsRequest
import org.openapitools.model.CatalogsList200Response
import org.openapitools.model.CatalogsListProductsByFilterRequest
import org.openapitools.model.CatalogsLocalStoresCreate200ResponseInner
import org.openapitools.model.CatalogsLocalStoresDelete200ResponseInner
import org.openapitools.model.CatalogsLocalStoresList200Response
import org.openapitools.model.CatalogsLocale
import org.openapitools.model.CatalogsProductGroupPinsList200Response
import org.openapitools.model.CatalogsProductGroupProductCountsVertical
import org.openapitools.model.CatalogsProductGroupsCreateManyRequestItems
import org.openapitools.model.CatalogsProductGroupsCreateRequestSchema
import org.openapitools.model.CatalogsProductGroupsList200Response
import org.openapitools.model.CatalogsProductGroupsUpdateRequestSchema
import org.openapitools.model.CatalogsReport
import org.openapitools.model.CatalogsReportParameters
import org.openapitools.model.CatalogsReportStatsParameters
import org.openapitools.model.CatalogsVerticalProductGroup
import org.openapitools.model.Country
import org.openapitools.model.FeedProcessingResultsList200Response
import org.openapitools.model.FeedsList200Response
import org.openapitools.model.ItemsIssuesList200Response
import org.openapitools.model.ItemsPost200Response
import org.openapitools.model.LocalInventoryItemsBatch
import org.openapitools.model.LocalInventoryItemsBatchCreate
import org.openapitools.model.LocalInventoryItemsGet
import org.openapitools.model.LocalInventoryItemsGetCreate
import org.openapitools.model.LocalStore
import org.openapitools.model.LocalStoreBatchUpdate
import org.openapitools.model.LocalStoreCreate
import org.openapitools.model.PinterestLibError
import org.openapitools.model.ReportsStats200Response
import org.openapitools.model.SupplementalItemsBatchResponse
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
        summary = "List available filter values",
        operationId = "catalogsAvailableFilterValues",
        description = """Get the available filter attributes and values associated with a given feed or catalog owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.
- `country`, `language`, and `feed_id` are only used in retail catalogs.
- Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsAvailableFilterValues::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/catalogs/available_filter_values"
        value = [PATH_CATALOGS_AVAILABLE_FILTER_VALUES],
        produces = ["application/json"]
    )
    fun catalogsAvailableFilterValues(
        @NotNull @Pattern(regexp="^\\d+$") @Parameter(description = "Filter entities for a given catalog_id.", required = true) @Valid @RequestParam(value = "catalog_id", required = true) catalogId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Parameter(description = "Filter entities for a given feed_id. If not given, all feeds are considered.") @Valid @RequestParam(value = "feed_id", required = false) feedId: kotlin.String?,
        @Parameter(description = "Country for the Catalogs Items", schema = Schema(allowableValues = ["AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "false", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW"])) @Valid @RequestParam(value = "country", required = false) country: Country?,
        @Parameter(description = "Language for the Catalogs Items", schema = Schema(allowableValues = ["af-ZA", "ar-SA", "bg-BG", "bn-IN", "cs-CZ", "da-DK", "de", "el-GR", "en-AU", "en-CA", "en-GB", "en-IN", "en-US", "es-419", "es-AR", "es-ES", "es-MX", "fi-FI", "fr", "fr-CA", "he-IL", "hi-IN", "hr-HR", "hu-HU", "id-ID", "it", "ja", "ko-KR", "ms-MY", "nb-NO", "nl", "pl-PL", "pt-BR", "pt-PT", "ro-RO", "ru-RU", "sk-SK", "sv-SE", "te-IN", "th-TH", "tl-PH", "tr", "uk-UA", "vi-VN", "zh-CN", "zh-TW"])) @Valid @RequestParam(value = "language", required = false) language: CatalogsLocale?,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<CatalogsAvailableFilterValues> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create catalog",
        operationId = "catalogsCreate",
        description = """Create a new catalog owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = Catalog::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = Catalog::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/catalogs"
        value = [PATH_CATALOGS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun catalogsCreate(
        @Parameter(description = "", required = true) @Valid @RequestBody catalogCreate: CatalogCreate,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<Catalog> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List catalogs",
        operationId = "catalogsList",
        description = """Fetch catalogs owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/catalogs"
        value = [PATH_CATALOGS_LIST],
        produces = ["application/json"]
    )
    fun catalogsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<CatalogsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Operate on local inventory item batch",
        operationId = "catalogsLocalInventoryItemsBatchOperate",
        description = """Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations.
Up to 1000 items per request to match catalogs/items.

- Must provide both item_id and store_code to identify a local inventory item.

- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = SupplementalItemsBatchResponse::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = LocalInventoryItemsBatch::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/catalogs/{catalog_id}/local_inventory_items/batch"
        value = [PATH_CATALOGS_LOCAL_INVENTORY_ITEMS_BATCH_OPERATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun catalogsLocalInventoryItemsBatchOperate(
        @Pattern(regexp="^\\d+$") @Size(max=19) @Parameter(description = "Unique identifier of a catalog.", required = true) @PathVariable("catalog_id") catalogId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody localInventoryItemsBatchCreate: LocalInventoryItemsBatchCreate,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<SupplementalItemsBatchResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get local inventory items (POST)",
        operationId = "catalogsLocalInventoryItemsPost",
        description = """Get local inventory items for a catalog owned by the "operation user_account".

- Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.

- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = LocalInventoryItemsGet::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = LocalInventoryItemsGet::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/catalogs/{catalog_id}/local_inventory_items/query"
        value = [PATH_CATALOGS_LOCAL_INVENTORY_ITEMS_POST],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun catalogsLocalInventoryItemsPost(
        @Pattern(regexp="^\\d+$") @Size(max=19) @Parameter(description = "Unique identifier of a catalog.", required = true) @PathVariable("catalog_id") catalogId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody localInventoryItemsGetCreate: LocalInventoryItemsGetCreate,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<LocalInventoryItemsGet> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create local stores",
        operationId = "catalogsLocalStoresCreate",
        description = """Create a local store for a catalog owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.
- Supports optional filtering by store codes.

Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = CatalogsLocalStoresCreate200ResponseInner::class)))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(array = ArraySchema(schema = Schema(implementation = LocalStore::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/catalogs/{catalog_id}/local_stores"
        value = [PATH_CATALOGS_LOCAL_STORES_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun catalogsLocalStoresCreate(
        @Pattern(regexp="^\\d+$") @Size(max=19) @Parameter(description = "Unique identifier of a catalog.", required = true) @PathVariable("catalog_id") catalogId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody localStoreCreate: kotlin.collections.List<LocalStoreCreate>,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete local stores",
        operationId = "catalogsLocalStoresDelete",
        description = """  Delete multiple local stores for a catalog owned by the "operation user_account".
  - By default, the "operation user_account" is the token user_account.
  - Supports optional filtering by store codes.

  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

  [Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = CatalogsLocalStoresDelete200ResponseInner::class)))]),
            ApiResponse(responseCode = "204", description = "Resource deleted successfully."),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/catalogs/{catalog_id}/local_stores"
        value = [PATH_CATALOGS_LOCAL_STORES_DELETE],
        produces = ["application/json"]
    )
    fun catalogsLocalStoresDelete(
        @Pattern(regexp="^\\d+$") @Size(max=19) @Parameter(description = "Unique identifier of a catalog.", required = true) @PathVariable("catalog_id") catalogId: kotlin.String,
        @NotNull @Parameter(description = "List of local store IDs to filter by.", required = true) @Valid @RequestParam(value = "ids", required = true) ids: kotlin.collections.List<kotlin.String>,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<List<CatalogsLocalStoresDelete200ResponseInner>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List local stores",
        operationId = "catalogsLocalStoresList",
        description = """Fetch local stores for a catalog owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.
- Supports optional filtering by store codes.

Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsLocalStoresList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/catalogs/{catalog_id}/local_stores"
        value = [PATH_CATALOGS_LOCAL_STORES_LIST],
        produces = ["application/json"]
    )
    fun catalogsLocalStoresList(
        @Pattern(regexp="^\\d+$") @Size(max=19) @Parameter(description = "Unique identifier of a catalog.", required = true) @PathVariable("catalog_id") catalogId: kotlin.String,
        @Parameter(description = "List of local store IDs to filter by.") @Valid @RequestParam(value = "ids", required = false) ids: kotlin.collections.List<kotlin.String>?,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<CatalogsLocalStoresList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update local stores",
        operationId = "catalogsLocalStoresUpdate",
        description = """  Update a local store for a catalog owned by the "operation user_account".
  - By default, the "operation user_account" is the token user_account.
  - Supports optional filtering by store codes.

  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

  [Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(array = ArraySchema(schema = Schema(implementation = CatalogsLocalStoresCreate200ResponseInner::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/catalogs/{catalog_id}/local_stores"
        value = [PATH_CATALOGS_LOCAL_STORES_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun catalogsLocalStoresUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=19) @Parameter(description = "Unique identifier of a catalog.", required = true) @PathVariable("catalog_id") catalogId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody localStoreBatchUpdate: kotlin.collections.List<LocalStoreBatchUpdate>,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List products by product group",
        operationId = "catalogsProductGroupPinsList",
        description = """Get a list of product pins for a given Catalogs Product Group Id owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsProductGroupPinsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "catalogs:read", "pins:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "boards:read", "catalogs:read", "pins:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/catalogs/product_groups/{product_group_id}/products"
        value = [PATH_CATALOGS_PRODUCT_GROUP_PINS_LIST],
        produces = ["application/json"]
    )
    fun catalogsProductGroupPinsList(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a product group", required = true) @PathVariable("product_group_id") productGroupId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Parameter(description = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "pin_metrics", required = false, defaultValue = "false") pinMetrics: kotlin.Boolean,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<CatalogsProductGroupPinsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create product group",
        operationId = "catalogsProductGroupsCreate",
        description = """Create product group to use in Catalogs owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
"Catalog-based product groups" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the "retail feed-based" option.
[Learn more](/docs/api-features/shopping-overview/)

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsVerticalProductGroup::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = CatalogsVerticalProductGroup::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/catalogs/product_groups"
        value = [PATH_CATALOGS_PRODUCT_GROUPS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun catalogsProductGroupsCreate(
        @Parameter(description = "", required = true) @Valid @RequestBody catalogsProductGroupsCreateRequestSchema: CatalogsProductGroupsCreateRequestSchema,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<CatalogsVerticalProductGroup> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create product groups",
        operationId = "catalogsProductGroupsCreateMany",
        description = """Create product group to use in Catalogs owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.""",
        responses = [
            ApiResponse(responseCode = "201", description = "The request has succeeded and a new resource has been created as a result.", content = [Content(array = ArraySchema(schema = Schema(implementation = kotlin.String::class)))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/catalogs/product_groups/multiple"
        value = [PATH_CATALOGS_PRODUCT_GROUPS_CREATE_MANY],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun catalogsProductGroupsCreateMany(
        @Parameter(description = "", required = true) @Valid@Size(min=1,max=1000)  @RequestBody catalogsProductGroupsCreateManyRequestItems: kotlin.collections.List<CatalogsProductGroupsCreateManyRequestItems>,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<List<kotlin.String>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete product group",
        operationId = "catalogsProductGroupsDelete",
        description = """Delete a product group owned by the "operation user_account" from being in use in Catalogs.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsVerticalProductGroup::class))]),
            ApiResponse(responseCode = "204", description = "Resource deleted successfully."),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/catalogs/product_groups/{product_group_id}"
        value = [PATH_CATALOGS_PRODUCT_GROUPS_DELETE],
        produces = ["application/json"]
    )
    fun catalogsProductGroupsDelete(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a product group", required = true) @PathVariable("product_group_id") productGroupId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<CatalogsVerticalProductGroup> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete product groups",
        operationId = "catalogsProductGroupsDeleteMany",
        description = """Delete product groups owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "204", description = "Resource deleted successfully."),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/catalogs/product_groups/multiple"
        value = [PATH_CATALOGS_PRODUCT_GROUPS_DELETE_MANY],
        produces = ["application/json"]
    )
    fun catalogsProductGroupsDeleteMany(
        @NotNull @Size(min=1,max=1000) @Parameter(description = "Comma-separated list of product group ids", required = true) @Valid @RequestParam(value = "id", required = true) id: kotlin.collections.List<kotlin.Int>,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get product group",
        operationId = "catalogsProductGroupsGet",
        description = """Get a single product group for a given Catalogs Product Group Id owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsVerticalProductGroup::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/catalogs/product_groups/{product_group_id}"
        value = [PATH_CATALOGS_PRODUCT_GROUPS_GET],
        produces = ["application/json"]
    )
    fun catalogsProductGroupsGet(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a product group", required = true) @PathVariable("product_group_id") productGroupId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<CatalogsVerticalProductGroup> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List product groups",
        operationId = "catalogsProductGroupsList",
        description = """Get a list of product groups for a given Catalogs Feed Id owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsProductGroupsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/catalogs/product_groups"
        value = [PATH_CATALOGS_PRODUCT_GROUPS_LIST],
        produces = ["application/json"]
    )
    fun catalogsProductGroupsList(
        @Size(min=1,max=1000) @Parameter(description = "Comma-separated list of product group ids") @Valid @RequestParam(value = "id", required = false) id: kotlin.collections.List<kotlin.Int>?,
        @Pattern(regexp="^\\d+$") @Parameter(description = "Filter entities for a given feed_id. If not given, all feeds are considered.") @Valid @RequestParam(value = "feed_id", required = false) feedId: kotlin.String?,
        @Pattern(regexp="^\\d+$") @Parameter(description = "Filter entities for a given catalog_id. If not given, all catalogs are considered.") @Valid @RequestParam(value = "catalog_id", required = false) catalogId: kotlin.String?,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<CatalogsProductGroupsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get product counts",
        operationId = "catalogsProductGroupsProductCountsGet",
        description = """Get a product counts for a given Catalogs Product Group owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsProductGroupProductCountsVertical::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/catalogs/product_groups/{product_group_id}/product_counts"
        value = [PATH_CATALOGS_PRODUCT_GROUPS_PRODUCT_COUNTS_GET],
        produces = ["application/json"]
    )
    fun catalogsProductGroupsProductCountsGet(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a product group", required = true) @PathVariable("product_group_id") productGroupId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<CatalogsProductGroupProductCountsVertical> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update single product group",
        operationId = "catalogsProductGroupsUpdate",
        description = """Update product group owned by the "operation user_account" to use in Catalogs.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
"Catalog-based product groups" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the "retail feed-based" option.
[Learn more](/docs/api-features/shopping-overview/)

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsVerticalProductGroup::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/catalogs/product_groups/{product_group_id}"
        value = [PATH_CATALOGS_PRODUCT_GROUPS_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun catalogsProductGroupsUpdate(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a product group", required = true) @PathVariable("product_group_id") productGroupId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody catalogsProductGroupsUpdateRequestSchema: CatalogsProductGroupsUpdateRequestSchema,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<CatalogsVerticalProductGroup> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get supplemental items batch status",
        operationId = "catalogsSupplementalItemsBatchGet",
        description = """Fetch the status and results of a supplemental items batch operation.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = SupplementalItemsBatchResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}"
        value = [PATH_CATALOGS_SUPPLEMENTAL_ITEMS_BATCH_GET],
        produces = ["application/json"]
    )
    fun catalogsSupplementalItemsBatchGet(
        @Pattern(regexp="^\\d+$") @Size(max=19) @Parameter(description = "Unique identifier of a catalog.", required = true) @PathVariable("catalog_id") catalogId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of an items batch operation.", required = true) @PathVariable("batch_id") batchId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<SupplementalItemsBatchResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List feed processing results",
        operationId = "feedProcessingResultsList",
        description = """Fetch a feed processing results owned by the "operation user_account". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = FeedProcessingResultsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/catalogs/feeds/{feed_id}/processing_results"
        value = [PATH_FEED_PROCESSING_RESULTS_LIST],
        produces = ["application/json"]
    )
    fun feedProcessingResultsList(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a feed.", required = true) @PathVariable("feed_id") feedId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<FeedProcessingResultsList200Response> {
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

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsFeed::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = CatalogsFeed::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read", "catalogs:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "catalogs:read", "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/catalogs/feeds"
        value = [PATH_FEEDS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun feedsCreate(
        @Parameter(description = "", required = true) @Valid @RequestBody catalogsFeedCreateRequestSchema: CatalogsFeedCreateRequestSchema,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<CatalogsFeed> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete feed",
        operationId = "feedsDelete",
        description = """Delete a feed owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsFeed::class))]),
            ApiResponse(responseCode = "204", description = "Resource deleted successfully."),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read", "catalogs:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "catalogs:read", "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/catalogs/feeds/{feed_id}"
        value = [PATH_FEEDS_DELETE],
        produces = ["application/json"]
    )
    fun feedsDelete(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a feed.", required = true) @PathVariable("feed_id") feedId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<CatalogsFeed> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get feed",
        operationId = "feedsGet",
        description = """Get a single feed owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsFeed::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/catalogs/feeds/{feed_id}"
        value = [PATH_FEEDS_GET],
        produces = ["application/json"]
    )
    fun feedsGet(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a feed.", required = true) @PathVariable("feed_id") feedId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<CatalogsFeed> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Ingest feed items",
        operationId = "feedsIngest",
        description = """Ingest items for a given feed owned by the "operation user_account".

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsFeedIngestion::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/catalogs/feeds/{feed_id}/ingest"
        value = [PATH_FEEDS_INGEST],
        produces = ["application/json"]
    )
    fun feedsIngest(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a feed.", required = true) @PathVariable("feed_id") feedId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<CatalogsFeedIngestion> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List feeds",
        operationId = "feedsList",
        description = """Fetch feeds owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = FeedsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/catalogs/feeds"
        value = [PATH_FEEDS_LIST],
        produces = ["application/json"]
    )
    fun feedsList(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Filter entities for a given catalog_id. If not given, all catalogs are considered.") @Valid @RequestParam(value = "catalog_id", required = false) catalogId: kotlin.String?,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<FeedsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update feed",
        operationId = "feedsUpdate",
        description = """Update a feed owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsFeed::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read", "catalogs:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "catalogs:read", "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/catalogs/feeds/{feed_id}"
        value = [PATH_FEEDS_UPDATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun feedsUpdate(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a feed.", required = true) @PathVariable("feed_id") feedId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody catalogsFeedUpdateRequestSchema: CatalogsFeedUpdateRequestSchema,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<CatalogsFeed> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get item batch status",
        operationId = "itemsBatchGet",
        description = """Get a single catalogs items batch owned by the "operating user_account". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch)
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsItemsBatch::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/catalogs/items/batch/{batch_id}"
        value = [PATH_ITEMS_BATCH_GET],
        produces = ["application/json"]
    )
    fun itemsBatchGet(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Id of a catalogs items batch to fetch", required = true) @PathVariable("batch_id") batchId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<CatalogsItemsBatch> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Operate on item batch",
        operationId = "itemsBatchPost",
        description = """This endpoint supports multiple operations on a set of one or more catalog items owned by the "operation user_account". [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/)
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

Note:
- Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.
- The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsItemsBatch::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read", "catalogs:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "catalogs:read", "catalogs:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/catalogs/items/batch"
        value = [PATH_ITEMS_BATCH_POST],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun itemsBatchPost(
        @Parameter(description = "", required = true) @Valid @RequestBody catalogsItemsBatchPostRequest: CatalogsItemsBatchPostRequest,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<CatalogsItemsBatch> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List item issues",
        operationId = "itemsIssuesList",
        description = """List item validation issues for a given feed processing result owned by the "operation user_account". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: To get a list of all affected items instead of sampled issues, please refer to [Build catalogs report](/docs/api/v5/#operation/reports/create) and [Get catalogs report](/docs/api/v5/#operation/reports/get) endpoints. Moreover, they support multiple types of catalogs.

[Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ItemsIssuesList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/catalogs/processing_results/{processing_result_id}/item_issues"
        value = [PATH_ITEMS_ISSUES_LIST],
        produces = ["application/json"]
    )
    fun itemsIssuesList(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).", required = true) @PathVariable("processing_result_id") processingResultId: kotlin.String,
        @Parameter(description = "Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.") @Valid @RequestParam(value = "item_numbers", required = false) itemNumbers: kotlin.collections.List<kotlin.Int>?,
        @Parameter(description = "Filter item validation issues that have a given type of item validation issue.", schema = Schema(allowableValues = ["AD_IMAGE_0_LINK_LENGTH_TOO_LONG", "AD_IMAGE_1_LINK_LENGTH_TOO_LONG", "AD_IMAGE_2_LINK_LENGTH_TOO_LONG", "AD_IMAGE_3_LINK_LENGTH_TOO_LONG", "AD_IMAGE_4_LINK_LENGTH_TOO_LONG", "AD_IMAGE_5_LINK_LENGTH_TOO_LONG", "AD_IMAGE_6_LINK_LENGTH_TOO_LONG", "AD_IMAGE_7_LINK_LENGTH_TOO_LONG", "AD_IMAGE_8_LINK_LENGTH_TOO_LONG", "AD_IMAGE_9_LINK_LENGTH_TOO_LONG", "AD_IMAGE_10_LINK_LENGTH_TOO_LONG", "AD_IMAGE_11_LINK_LENGTH_TOO_LONG", "AD_IMAGE_12_LINK_LENGTH_TOO_LONG", "AD_IMAGE_13_LINK_LENGTH_TOO_LONG", "AD_IMAGE_14_LINK_LENGTH_TOO_LONG", "AD_IMAGE_15_LINK_LENGTH_TOO_LONG", "AD_IMAGE_16_LINK_LENGTH_TOO_LONG", "AD_IMAGE_17_LINK_LENGTH_TOO_LONG", "AD_IMAGE_18_LINK_LENGTH_TOO_LONG", "AD_IMAGE_19_LINK_LENGTH_TOO_LONG", "AD_IMAGE_0_LINK_WARNING", "AD_IMAGE_1_LINK_WARNING", "AD_IMAGE_2_LINK_WARNING", "AD_IMAGE_3_LINK_WARNING", "AD_IMAGE_4_LINK_WARNING", "AD_IMAGE_5_LINK_WARNING", "AD_IMAGE_6_LINK_WARNING", "AD_IMAGE_7_LINK_WARNING", "AD_IMAGE_8_LINK_WARNING", "AD_IMAGE_9_LINK_WARNING", "AD_IMAGE_10_LINK_WARNING", "AD_IMAGE_11_LINK_WARNING", "AD_IMAGE_12_LINK_WARNING", "AD_IMAGE_13_LINK_WARNING", "AD_IMAGE_14_LINK_WARNING", "AD_IMAGE_15_LINK_WARNING", "AD_IMAGE_16_LINK_WARNING", "AD_IMAGE_17_LINK_WARNING", "AD_IMAGE_18_LINK_WARNING", "AD_IMAGE_19_LINK_WARNING", "AD_IMAGE_0_LINK_REQUIRED", "AD_IMAGE_1_LINK_REQUIRED", "AD_IMAGE_2_LINK_REQUIRED", "AD_IMAGE_3_LINK_REQUIRED", "AD_IMAGE_4_LINK_REQUIRED", "AD_IMAGE_5_LINK_REQUIRED", "AD_IMAGE_6_LINK_REQUIRED", "AD_IMAGE_7_LINK_REQUIRED", "AD_IMAGE_8_LINK_REQUIRED", "AD_IMAGE_9_LINK_REQUIRED", "AD_IMAGE_10_LINK_REQUIRED", "AD_IMAGE_11_LINK_REQUIRED", "AD_IMAGE_12_LINK_REQUIRED", "AD_IMAGE_13_LINK_REQUIRED", "AD_IMAGE_14_LINK_REQUIRED", "AD_IMAGE_15_LINK_REQUIRED", "AD_IMAGE_16_LINK_REQUIRED", "AD_IMAGE_17_LINK_REQUIRED", "AD_IMAGE_18_LINK_REQUIRED", "AD_IMAGE_19_LINK_REQUIRED", "AD_IMAGE_0_TAG_LENGTH_TOO_LONG", "AD_IMAGE_1_TAG_LENGTH_TOO_LONG", "AD_IMAGE_2_TAG_LENGTH_TOO_LONG", "AD_IMAGE_3_TAG_LENGTH_TOO_LONG", "AD_IMAGE_4_TAG_LENGTH_TOO_LONG", "AD_IMAGE_5_TAG_LENGTH_TOO_LONG", "AD_IMAGE_6_TAG_LENGTH_TOO_LONG", "AD_IMAGE_7_TAG_LENGTH_TOO_LONG", "AD_IMAGE_8_TAG_LENGTH_TOO_LONG", "AD_IMAGE_9_TAG_LENGTH_TOO_LONG", "AD_IMAGE_10_TAG_LENGTH_TOO_LONG", "AD_IMAGE_11_TAG_LENGTH_TOO_LONG", "AD_IMAGE_12_TAG_LENGTH_TOO_LONG", "AD_IMAGE_13_TAG_LENGTH_TOO_LONG", "AD_IMAGE_14_TAG_LENGTH_TOO_LONG", "AD_IMAGE_15_TAG_LENGTH_TOO_LONG", "AD_IMAGE_16_TAG_LENGTH_TOO_LONG", "AD_IMAGE_17_TAG_LENGTH_TOO_LONG", "AD_IMAGE_18_TAG_LENGTH_TOO_LONG", "AD_IMAGE_19_TAG_LENGTH_TOO_LONG", "AD_IMAGE_0_TAG_REQUIRED", "AD_IMAGE_1_TAG_REQUIRED", "AD_IMAGE_2_TAG_REQUIRED", "AD_IMAGE_3_TAG_REQUIRED", "AD_IMAGE_4_TAG_REQUIRED", "AD_IMAGE_5_TAG_REQUIRED", "AD_IMAGE_6_TAG_REQUIRED", "AD_IMAGE_7_TAG_REQUIRED", "AD_IMAGE_8_TAG_REQUIRED", "AD_IMAGE_9_TAG_REQUIRED", "AD_IMAGE_10_TAG_REQUIRED", "AD_IMAGE_11_TAG_REQUIRED", "AD_IMAGE_12_TAG_REQUIRED", "AD_IMAGE_13_TAG_REQUIRED", "AD_IMAGE_14_TAG_REQUIRED", "AD_IMAGE_15_TAG_REQUIRED", "AD_IMAGE_16_TAG_REQUIRED", "AD_IMAGE_17_TAG_REQUIRED", "AD_IMAGE_18_TAG_REQUIRED", "AD_IMAGE_19_TAG_REQUIRED", "AD_IMAGE_0_LINK_DUPLICATED", "AD_IMAGE_1_LINK_DUPLICATED", "AD_IMAGE_2_LINK_DUPLICATED", "AD_IMAGE_3_LINK_DUPLICATED", "AD_IMAGE_4_LINK_DUPLICATED", "AD_IMAGE_5_LINK_DUPLICATED", "AD_IMAGE_6_LINK_DUPLICATED", "AD_IMAGE_7_LINK_DUPLICATED", "AD_IMAGE_8_LINK_DUPLICATED", "AD_IMAGE_9_LINK_DUPLICATED", "AD_IMAGE_10_LINK_DUPLICATED", "AD_IMAGE_11_LINK_DUPLICATED", "AD_IMAGE_12_LINK_DUPLICATED", "AD_IMAGE_13_LINK_DUPLICATED", "AD_IMAGE_14_LINK_DUPLICATED", "AD_IMAGE_15_LINK_DUPLICATED", "AD_IMAGE_16_LINK_DUPLICATED", "AD_IMAGE_17_LINK_DUPLICATED", "AD_IMAGE_18_LINK_DUPLICATED", "AD_IMAGE_19_LINK_DUPLICATED", "AD_IMAGE_0_TAG_DUPLICATED", "AD_IMAGE_1_TAG_DUPLICATED", "AD_IMAGE_2_TAG_DUPLICATED", "AD_IMAGE_3_TAG_DUPLICATED", "AD_IMAGE_4_TAG_DUPLICATED", "AD_IMAGE_5_TAG_DUPLICATED", "AD_IMAGE_6_TAG_DUPLICATED", "AD_IMAGE_7_TAG_DUPLICATED", "AD_IMAGE_8_TAG_DUPLICATED", "AD_IMAGE_9_TAG_DUPLICATED", "AD_IMAGE_10_TAG_DUPLICATED", "AD_IMAGE_11_TAG_DUPLICATED", "AD_IMAGE_12_TAG_DUPLICATED", "AD_IMAGE_13_TAG_DUPLICATED", "AD_IMAGE_14_TAG_DUPLICATED", "AD_IMAGE_15_TAG_DUPLICATED", "AD_IMAGE_16_TAG_DUPLICATED", "AD_IMAGE_17_TAG_DUPLICATED", "AD_IMAGE_18_TAG_DUPLICATED", "AD_IMAGE_19_TAG_DUPLICATED", "AD_VIDEO_0_LINK_LENGTH_TOO_LONG", "AD_VIDEO_1_LINK_LENGTH_TOO_LONG", "AD_VIDEO_2_LINK_LENGTH_TOO_LONG", "AD_VIDEO_0_LINK_WARNING", "AD_VIDEO_1_LINK_WARNING", "AD_VIDEO_2_LINK_WARNING", "AD_VIDEO_0_LINK_REQUIRED", "AD_VIDEO_1_LINK_REQUIRED", "AD_VIDEO_2_LINK_REQUIRED", "AD_VIDEO_0_LINK_DUPLICATED", "AD_VIDEO_1_LINK_DUPLICATED", "AD_VIDEO_2_LINK_DUPLICATED", "AD_VIDEO_0_TAG_LENGTH_TOO_LONG", "AD_VIDEO_1_TAG_LENGTH_TOO_LONG", "AD_VIDEO_2_TAG_LENGTH_TOO_LONG", "AD_VIDEO_0_TAG_REQUIRED", "AD_VIDEO_1_TAG_REQUIRED", "AD_VIDEO_2_TAG_REQUIRED", "AD_VIDEO_0_TAG_DUPLICATED", "AD_VIDEO_1_TAG_DUPLICATED", "AD_VIDEO_2_TAG_DUPLICATED", "VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED", "AD_LINK_FORMAT_WARNING", "AD_LINK_SAME_AS_LINK", "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", "ADDITIONAL_IMAGE_LINK_WARNING", "ADULT_INVALID", "ADWORDS_FORMAT_INVALID", "ADWORDS_FORMAT_WARNING", "ADWORDS_SAME_AS_LINK", "AGE_GROUP_INVALID", "ANDROID_DEEP_LINK_INVALID", "AVAILABILITY_DATE_INVALID", "AVAILABILITY_INVALID", "BLOCKLISTED_IMAGE_SIGNATURE", "COUNTRY_DOES_NOT_MAP_TO_CURRENCY", "CUSTOM_LABEL_LENGTH_TOO_LONG", "DESCRIPTION_LENGTH_TOO_LONG", "DESCRIPTION_MISSING", "DUPLICATE_PRODUCTS", "EXPIRATION_DATE_INVALID", "GENDER_INVALID", "GTIN_INVALID", "IMAGE_LINK_INVALID", "IMAGE_LINK_LENGTH_TOO_LONG", "IMAGE_LINK_MISSING", "IMAGE_LINK_WARNING", "INVALID_DOMAIN", "IOS_DEEP_LINK_INVALID", "IS_BUNDLE_INVALID", "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", "ITEMID_MISSING", "LINK_FORMAT_INVALID", "LINK_FORMAT_WARNING", "LINK_LENGTH_TOO_LONG", "LIST_PRICE_INVALID", "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", "MIN_AD_PRICE_INVALID", "MPN_INVALID", "MULTIPACK_INVALID", "OPTIONAL_CONDITION_INVALID", "OPTIONAL_CONDITION_MISSING", "OPTIONAL_PRODUCT_CATEGORY_INVALID", "OPTIONAL_PRODUCT_CATEGORY_MISSING", "PARSE_LINE_ERROR", "PINJOIN_CONTENT_UNSAFE", "PRICE_CANNOT_BE_DETERMINED", "PRICE_MISSING", "PRODUCT_CATEGORY_DEPTH_WARNING", "PRODUCT_LINK_MISSING", "PRODUCT_PRICE_INVALID", "PRODUCT_TYPE_LENGTH_TOO_LONG", "SALE_DATE_INVALID", "SALES_PRICE_INVALID", "SALES_PRICE_TOO_HIGH", "SALES_PRICE_TOO_LOW", "SHIPPING_INVALID", "SHIPPING_HEIGHT_INVALID", "SHIPPING_WEIGHT_INVALID", "SHIPPING_WIDTH_INVALID", "SIZE_SYSTEM_INVALID", "SIZE_TYPE_INVALID", "TAX_INVALID", "TITLE_LENGTH_TOO_LONG", "TITLE_MISSING", "TOO_MANY_ADDITIONAL_IMAGE_LINKS", "UTM_SOURCE_AUTO_CORRECTED", "WEIGHT_UNIT_INVALID"])) @Valid @RequestParam(value = "item_validation_issue", required = false) itemValidationIssue: CatalogsItemValidationIssue?,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<ItemsIssuesList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get catalogs items (POST)",
        operationId = "itemsPost",
        description = """Get the items of the catalog owned by the "operation user_account". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch)
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ItemsPost200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/catalogs/items"
        value = [PATH_ITEMS_POST],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun itemsPost(
        @Parameter(description = "", required = true) @Valid @RequestBody catalogsItemsRequest: CatalogsItemsRequest,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<ItemsPost200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List products by filter",
        operationId = "productsByProductGroupFilterList",
        description = """List products Pins owned by the "operation user_account" that meet the criteria specified in the Catalogs Product Group Filter given in the request.
- This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: This endpoint only supports RETAIL catalog at the moment.

[Learn more](/docs/api-features/shopping-overview/)""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsProductGroupPinsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "catalogs:read", "pins:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/catalogs/products/get_by_product_group_filters"
        value = [PATH_PRODUCTS_BY_PRODUCT_GROUP_FILTER_LIST],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun productsByProductGroupFilterList(
        @Parameter(description = "", required = true) @Valid @RequestBody catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Parameter(description = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "pin_metrics", required = false, defaultValue = "false") pinMetrics: kotlin.Boolean
    ): ResponseEntity<CatalogsProductGroupPinsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Build catalogs report",
        operationId = "reportsCreate",
        description = """Async request to create a report of the catalog owned by the "operation user_account". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: The All Items report is limited to 25 million items per catalog.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsCreateReportResponse::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = CatalogsCreateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/catalogs/reports"
        value = [PATH_REPORTS_CREATE],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun reportsCreate(
        @Parameter(description = "", required = true) @Valid @RequestBody catalogsReportParameters: CatalogsReportParameters,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<CatalogsCreateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get catalogs report",
        operationId = "reportsGet",
        description = """This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = CatalogsReport::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/catalogs/reports"
        value = [PATH_REPORTS_GET],
        produces = ["application/json"]
    )
    fun reportsGet(
        @NotNull @Parameter(description = "Token returned from the post request creation call", required = true) @Valid @RequestParam(value = "token", required = true) token: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<CatalogsReport> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List report stats",
        operationId = "reportsStats",
        description = """List aggregated numbers of issues for a catalog owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = ReportsStats200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/catalogs/reports/stats"
        value = [PATH_REPORTS_STATS],
        produces = ["application/json"]
    )
    fun reportsStats(
        @NotNull @Parameter(description = "Contains the parameters for report identification.", required = true) @Valid parameters: CatalogsReportStatsParameters,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<ReportsStats200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v5"
        const val PATH_CATALOGS_AVAILABLE_FILTER_VALUES: String = "/catalogs/available_filter_values"
        const val PATH_CATALOGS_CREATE: String = "/catalogs"
        const val PATH_CATALOGS_LIST: String = "/catalogs"
        const val PATH_CATALOGS_LOCAL_INVENTORY_ITEMS_BATCH_OPERATE: String = "/catalogs/{catalog_id}/local_inventory_items/batch"
        const val PATH_CATALOGS_LOCAL_INVENTORY_ITEMS_POST: String = "/catalogs/{catalog_id}/local_inventory_items/query"
        const val PATH_CATALOGS_LOCAL_STORES_CREATE: String = "/catalogs/{catalog_id}/local_stores"
        const val PATH_CATALOGS_LOCAL_STORES_DELETE: String = "/catalogs/{catalog_id}/local_stores"
        const val PATH_CATALOGS_LOCAL_STORES_LIST: String = "/catalogs/{catalog_id}/local_stores"
        const val PATH_CATALOGS_LOCAL_STORES_UPDATE: String = "/catalogs/{catalog_id}/local_stores"
        const val PATH_CATALOGS_PRODUCT_GROUP_PINS_LIST: String = "/catalogs/product_groups/{product_group_id}/products"
        const val PATH_CATALOGS_PRODUCT_GROUPS_CREATE: String = "/catalogs/product_groups"
        const val PATH_CATALOGS_PRODUCT_GROUPS_CREATE_MANY: String = "/catalogs/product_groups/multiple"
        const val PATH_CATALOGS_PRODUCT_GROUPS_DELETE: String = "/catalogs/product_groups/{product_group_id}"
        const val PATH_CATALOGS_PRODUCT_GROUPS_DELETE_MANY: String = "/catalogs/product_groups/multiple"
        const val PATH_CATALOGS_PRODUCT_GROUPS_GET: String = "/catalogs/product_groups/{product_group_id}"
        const val PATH_CATALOGS_PRODUCT_GROUPS_LIST: String = "/catalogs/product_groups"
        const val PATH_CATALOGS_PRODUCT_GROUPS_PRODUCT_COUNTS_GET: String = "/catalogs/product_groups/{product_group_id}/product_counts"
        const val PATH_CATALOGS_PRODUCT_GROUPS_UPDATE: String = "/catalogs/product_groups/{product_group_id}"
        const val PATH_CATALOGS_SUPPLEMENTAL_ITEMS_BATCH_GET: String = "/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}"
        const val PATH_FEED_PROCESSING_RESULTS_LIST: String = "/catalogs/feeds/{feed_id}/processing_results"
        const val PATH_FEEDS_CREATE: String = "/catalogs/feeds"
        const val PATH_FEEDS_DELETE: String = "/catalogs/feeds/{feed_id}"
        const val PATH_FEEDS_GET: String = "/catalogs/feeds/{feed_id}"
        const val PATH_FEEDS_INGEST: String = "/catalogs/feeds/{feed_id}/ingest"
        const val PATH_FEEDS_LIST: String = "/catalogs/feeds"
        const val PATH_FEEDS_UPDATE: String = "/catalogs/feeds/{feed_id}"
        const val PATH_ITEMS_BATCH_GET: String = "/catalogs/items/batch/{batch_id}"
        const val PATH_ITEMS_BATCH_POST: String = "/catalogs/items/batch"
        const val PATH_ITEMS_ISSUES_LIST: String = "/catalogs/processing_results/{processing_result_id}/item_issues"
        const val PATH_ITEMS_POST: String = "/catalogs/items"
        const val PATH_PRODUCTS_BY_PRODUCT_GROUP_FILTER_LIST: String = "/catalogs/products/get_by_product_group_filters"
        const val PATH_REPORTS_CREATE: String = "/catalogs/reports"
        const val PATH_REPORTS_GET: String = "/catalogs/reports"
        const val PATH_REPORTS_STATS: String = "/catalogs/reports/stats"
    }
}
