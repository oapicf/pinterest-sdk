package org.openapitools.api;

import org.openapitools.model.AdvancedAuctionItems;
import org.openapitools.model.AdvancedAuctionItemsGetRequest;
import org.openapitools.model.AdvancedAuctionItemsSubmitRequest;
import org.openapitools.model.AdvancedAuctionProcessedItems;
import org.openapitools.model.Error;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
@Path("/advanced_auction/items")
@Api(value = "/", description = "")
public interface AdvancedAuctionApi  {

    /**
     * Get item bid options (POST)
     *
     * Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
     *
     */
    @POST
    @Path("/get")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get item bid options (POST)", tags={ "advanced_auction" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response containing the bid option values for the requested retail catalog items. Items that don't exist or do not have bid options set won't be present in the response.", response = AdvancedAuctionItems.class),
        @ApiResponse(code = 400, message = "Invalid request parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Not authenticated to get item bid options", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to get item bid options", response = Error.class),
        @ApiResponse(code = 500, message = "Internal error", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdvancedAuctionItems advancedAuctionItemsGetPost(@Valid @NotNull AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);

    /**
     * Operate on item level bid options
     *
     * This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/modify-items-in-batch/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
     *
     */
    @POST
    @Path("/submit")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Operate on item level bid options", tags={ "advanced_auction" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response containing the results of the item bid options operations", response = AdvancedAuctionProcessedItems.class),
        @ApiResponse(code = 400, message = "Invalid request parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Not authenticated to post item bid options", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to post item bid options", response = Error.class),
        @ApiResponse(code = 500, message = "Internal error", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdvancedAuctionProcessedItems advancedAuctionItemsSubmitPost(@Valid @NotNull AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);
}
