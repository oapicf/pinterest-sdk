package org.openapitools.api

import org.openapitools.model.AdvancedAuctionItems
import org.openapitools.model.AdvancedAuctionItemsGetRequest
import org.openapitools.model.AdvancedAuctionItemsSubmitRequest
import org.openapitools.model.AdvancedAuctionProcessedItems
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
class AdvancedAuctionApiController() {

    @Operation(
        summary = "Get item bid options (POST)",
        operationId = "advancedAuctionItemsGetPost",
        description = """Get the bid options for a batch of retail catalog items.

The catalog must be owned by the "operation user_account". <a href="/docs/api-features/shopping-overview/#Update%20items%20in%20batch" target="_blank">See detailed documentation here.</a> By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: `Owner`, `Admin`.

This endpoint is not available to all users.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Response containing the bid option values for the requested retail catalog items. Items that don't exist or do not have bid options set won't be present in the response.", content = [Content(schema = Schema(implementation = AdvancedAuctionItems::class))]),
            ApiResponse(responseCode = "400", description = "Invalid request parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Not authenticated to get item bid options", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Not authorized to get item bid options", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "500", description = "Internal error", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read", "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/advanced_auction/items/get"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun advancedAuctionItemsGetPost(@Parameter(description = "Request object used to get bid options values for a batch of retail catalog items", required = true) @Valid @RequestBody advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<AdvancedAuctionItems> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Operate on item level bid options",
        operationId = "advancedAuctionItemsSubmitPost",
        description = """This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.

The catalog must be owned by the "operation user_account". <a href="/docs/api-features/modify-items-in-batch/" target="_blank">See detailed documentation here.</a> By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: `Owner`, `Admin`.

This endpoint is not available to all users.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Response containing the results of the item bid options operations", content = [Content(schema = Schema(implementation = AdvancedAuctionProcessedItems::class))]),
            ApiResponse(responseCode = "400", description = "Invalid request parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "401", description = "Not authenticated to post item bid options", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Not authorized to post item bid options", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "500", description = "Internal error", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write", "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/advanced_auction/items/submit"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun advancedAuctionItemsSubmitPost(@Parameter(description = "Request object used to upsert or delete bid options for a batch of retail catalog items", required = true) @Valid @RequestBody advancedAuctionItemsSubmitRequest: AdvancedAuctionItemsSubmitRequest,@Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?): ResponseEntity<AdvancedAuctionProcessedItems> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
