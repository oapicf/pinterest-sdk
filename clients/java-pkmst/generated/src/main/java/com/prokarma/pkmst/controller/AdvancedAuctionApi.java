/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AdvancedAuctionItems;
import com.prokarma.pkmst.model.AdvancedAuctionItemsGetRequest;
import com.prokarma.pkmst.model.AdvancedAuctionItemsSubmitRequest;
import com.prokarma.pkmst.model.AdvancedAuctionProcessedItems;
import com.prokarma.pkmst.model.Error;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Api(value = "AdvancedAuction", description = "the AdvancedAuction API")
public interface AdvancedAuctionApi {

    @ApiOperation(value = "Get item bid options (POST)", notes = "Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.", response = AdvancedAuctionItems.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc."),
            @AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data") })
         }, tags={ "advanced_auction", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response containing the bid option values for the requested retail catalog items. Items that don't exist or do not have bid options set won't be present in the response.", response = AdvancedAuctionItems.class),
        @ApiResponse(code = 400, message = "Invalid request parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Not authenticated to get item bid options", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to get item bid options", response = Error.class),
        @ApiResponse(code = 500, message = "Internal error", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/advanced_auction/items/get",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<AdvancedAuctionItems> advancedAuctionItemsGetPost(@ApiParam(value = "Request object used to get bid options values for a batch of retail catalog items" ,required=true )   @RequestBody AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest,@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Operate on item level bid options", notes = "This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.", response = AdvancedAuctionProcessedItems.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc."),
            @AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data") })
         }, tags={ "advanced_auction", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response containing the results of the item bid options operations", response = AdvancedAuctionProcessedItems.class),
        @ApiResponse(code = 400, message = "Invalid request parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Not authenticated to post item bid options", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to post item bid options", response = Error.class),
        @ApiResponse(code = 500, message = "Internal error", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/advanced_auction/items/submit",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<AdvancedAuctionProcessedItems> advancedAuctionItemsSubmitPost(@ApiParam(value = "Request object used to upsert or delete bid options for a batch of retail catalog items" ,required=true )   @RequestBody AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest,@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
