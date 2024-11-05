package org.openapitools.api;

import org.openapitools.model.AdvancedAuctionItems;
import org.openapitools.model.AdvancedAuctionItemsGetRequest;
import org.openapitools.model.AdvancedAuctionItemsSubmitRequest;
import org.openapitools.model.AdvancedAuctionProcessedItems;
import org.openapitools.model.Error;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/advanced_auction/items")
@Api(description = "the advanced_auction API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionApi {

    @POST
    @Path("/get")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get item bid options (POST)", notes = "Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.", response = AdvancedAuctionItems.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc."),
            @AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data") })
         }, tags={ "advanced_auction" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response containing the bid option values for the requested retail catalog items. Items that don't exist or do not have bid options set won't be present in the response.", response = AdvancedAuctionItems.class),
        @ApiResponse(code = 400, message = "Invalid request parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Not authenticated to get item bid options", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to get item bid options", response = Error.class),
        @ApiResponse(code = 500, message = "Internal error", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response advancedAuctionItemsGetPost(@Valid @NotNull AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest,@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/submit")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Operate on item level bid options", notes = "This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.", response = AdvancedAuctionProcessedItems.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc."),
            @AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data") })
         }, tags={ "advanced_auction" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response containing the results of the item bid options operations", response = AdvancedAuctionProcessedItems.class),
        @ApiResponse(code = 400, message = "Invalid request parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Not authenticated to post item bid options", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to post item bid options", response = Error.class),
        @ApiResponse(code = 500, message = "Internal error", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response advancedAuctionItemsSubmitPost(@Valid @NotNull AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest,@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId) {
        return Response.ok().entity("magic!").build();
    }
}
