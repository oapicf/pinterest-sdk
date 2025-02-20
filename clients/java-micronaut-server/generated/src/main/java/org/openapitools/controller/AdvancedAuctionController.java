/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.controller;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.core.convert.format.Format;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import reactor.core.publisher.Mono;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import org.openapitools.model.AdvancedAuctionItems;
import org.openapitools.model.AdvancedAuctionItemsGetRequest;
import org.openapitools.model.AdvancedAuctionItemsSubmitRequest;
import org.openapitools.model.AdvancedAuctionProcessedItems;
import org.openapitools.model.Error;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Controller
@Tag(name = "AdvancedAuction", description = "The AdvancedAuction API")
public class AdvancedAuctionController {
    /**
     * Get item bid options (POST)
     * Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
     *
     * @param advancedAuctionItemsGetRequest Request object used to get bid options values for a batch of retail catalog items (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return AdvancedAuctionItems
     */
    @Operation(
        operationId = "advancedAuctionItemsGetPost",
        summary = "Get item bid options (POST)",
        responses = {
            @ApiResponse(responseCode = "200", description = "Response containing the bid option values for the requested retail catalog items. Items that don't exist or do not have bid options set won't be present in the response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AdvancedAuctionItems.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid request parameters.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "401", description = "Not authenticated to get item bid options", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "403", description = "Not authorized to get item bid options", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "advancedAuctionItemsGetRequest", description = "Request object used to get bid options values for a batch of retail catalog items", required = true),
            @Parameter(name = "adAccountId", description = "Unique identifier of an ad account.")
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:read", "catalogs:read" })
        }
    )
    @Post(uri="/advanced_auction/items/get")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<AdvancedAuctionItems> advancedAuctionItemsGetPost(
        @Body @NotNull @Valid AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest, 
        @QueryValue(value="ad_account_id") @Nullable @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId
    ) {
        // TODO implement advancedAuctionItemsGetPost();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Operate on item level bid options
     * This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/modify-items-in-batch/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
     *
     * @param advancedAuctionItemsSubmitRequest Request object used to upsert or delete bid options for a batch of retail catalog items (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return AdvancedAuctionProcessedItems
     */
    @Operation(
        operationId = "advancedAuctionItemsSubmitPost",
        summary = "Operate on item level bid options",
        responses = {
            @ApiResponse(responseCode = "200", description = "Response containing the results of the item bid options operations", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AdvancedAuctionProcessedItems.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid request parameters.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "401", description = "Not authenticated to post item bid options", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "403", description = "Not authorized to post item bid options", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "advancedAuctionItemsSubmitRequest", description = "Request object used to upsert or delete bid options for a batch of retail catalog items", required = true),
            @Parameter(name = "adAccountId", description = "Unique identifier of an ad account.")
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:write", "catalogs:read" })
        }
    )
    @Post(uri="/advanced_auction/items/submit")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<AdvancedAuctionProcessedItems> advancedAuctionItemsSubmitPost(
        @Body @NotNull @Valid AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest, 
        @QueryValue(value="ad_account_id") @Nullable @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId
    ) {
        // TODO implement advancedAuctionItemsSubmitPost();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

}
