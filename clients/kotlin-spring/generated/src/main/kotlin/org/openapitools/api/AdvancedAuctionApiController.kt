package org.openapitools.api

import org.openapitools.model.AdvancedAuctionItems
import org.openapitools.model.AdvancedAuctionItemsGetRequest
import org.openapitools.model.AdvancedAuctionItemsSubmitRequest
import org.openapitools.model.AdvancedAuctionProcessedItems
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
class AdvancedAuctionApiController() {

    @Operation(
        summary = "Get item bid options (POST)",
        operationId = "advancedAuctionItemsGetPost",
        description = """Get the bid options for a batch of retail catalog items.

The catalog must be owned by the "operation user_account". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: `Owner`, `Admin`.

This endpoint is not available to all users.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdvancedAuctionItems::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "500", description = "The server encountered an unexpected condition that prevented it from fulfilling the request.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:read", "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/advanced_auction/items/get"
        value = [PATH_ADVANCED_AUCTION_ITEMS_GET_POST],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun advancedAuctionItemsGetPost(
        @Parameter(description = "", required = true) @Valid @RequestBody advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<AdvancedAuctionItems> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Operate on item level bid options",
        operationId = "advancedAuctionItemsSubmitPost",
        description = """This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.

The catalog must be owned by the "operation user_account". [See detailed documentation here.](/docs/api-features/modify-items-in-batch/) By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: `Owner`, `Admin`.

This endpoint is not available to all users.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = AdvancedAuctionProcessedItems::class))]),
            ApiResponse(responseCode = "206", description = "Successful", content = [Content(schema = Schema(implementation = AdvancedAuctionProcessedItems::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "500", description = "The server encountered an unexpected condition that prevented it from fulfilling the request.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "default", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "ads:write", "catalogs:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/advanced_auction/items/submit"
        value = [PATH_ADVANCED_AUCTION_ITEMS_SUBMIT_POST],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun advancedAuctionItemsSubmitPost(
        @Parameter(description = "", required = true) @Valid @RequestBody advancedAuctionItemsSubmitRequest: AdvancedAuctionItemsSubmitRequest,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<AdvancedAuctionProcessedItems> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v5"
        const val PATH_ADVANCED_AUCTION_ITEMS_GET_POST: String = "/advanced_auction/items/get"
        const val PATH_ADVANCED_AUCTION_ITEMS_SUBMIT_POST: String = "/advanced_auction/items/submit"
    }
}
