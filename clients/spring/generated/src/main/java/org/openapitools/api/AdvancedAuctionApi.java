/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.AdvancedAuctionItems;
import org.openapitools.model.AdvancedAuctionItemsGetRequest;
import org.openapitools.model.AdvancedAuctionItemsSubmitRequest;
import org.openapitools.model.AdvancedAuctionProcessedItems;
import org.openapitools.model.Error;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Validated
@Tag(name = "advanced_auction", description = "View, create, or update advanced auction item bid options.")
public interface AdvancedAuctionApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /advanced_auction/items/get : Get item bid options (POST)
     * Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
     *
     * @param advancedAuctionItemsGetRequest Request object used to get bid options values for a batch of retail catalog items (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Response containing the bid option values for the requested retail catalog items. Items that don&#39;t exist or do not have bid options set won&#39;t be present in the response. (status code 200)
     *         or Invalid request parameters. (status code 400)
     *         or Not authenticated to get item bid options (status code 401)
     *         or Not authorized to get item bid options (status code 403)
     *         or Internal error (status code 500)
     *         or Unexpected error (status code 200)
     */
    @Operation(
        operationId = "advancedAuctionItemsGetPost",
        summary = "Get item bid options (POST)",
        description = "Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.",
        tags = { "advanced_auction" },
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
            @ApiResponse(responseCode = "default", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes={ "ads:read", "catalogs:read" })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/advanced_auction/items/get",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<AdvancedAuctionItems> advancedAuctionItemsGetPost(
        @Parameter(name = "AdvancedAuctionItemsGetRequest", description = "Request object used to get bid options values for a batch of retail catalog items", required = true) @Valid @RequestBody AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest,
        @Pattern(regexp = "^\\d+$") @Size(max = 18) @Parameter(name = "ad_account_id", description = "Unique identifier of an ad account.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "ad_account_id", required = false) String adAccountId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"catalog_id\" : \"2680059592705\", \"items\" : [ { \"country\" : \"US\", \"bid_options\" : { \"bid_in_micro_currency\" : 5000000, \"placement_multipliers\" : { \"browse\" : 0.9, \"search\" : 1.2 }, \"app_type_multipliers\" : { \"android_mobile\" : 1.1, \"android_tablet\" : 1.1, \"ipad\" : 1.2, \"iphone\" : 1.2, \"web\" : 0.9, \"web_mobile\" : 0.8 } }, \"item_id\" : \"DS0294-M\", \"language\" : \"EN\" }, { \"country\" : \"US\", \"bid_options\" : { \"bid_in_micro_currency\" : 5000000, \"placement_multipliers\" : { \"browse\" : 0.9, \"search\" : 1.2 }, \"app_type_multipliers\" : { \"android_mobile\" : 1.1, \"android_tablet\" : 1.1, \"ipad\" : 1.2, \"iphone\" : 1.2, \"web\" : 0.9, \"web_mobile\" : 0.8 } }, \"item_id\" : \"DS0294-M\", \"language\" : \"EN\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /advanced_auction/items/submit : Operate on item level bid options
     * This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/modify-items-in-batch/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
     *
     * @param advancedAuctionItemsSubmitRequest Request object used to upsert or delete bid options for a batch of retail catalog items (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Response containing the results of the item bid options operations (status code 200)
     *         or Invalid request parameters. (status code 400)
     *         or Not authenticated to post item bid options (status code 401)
     *         or Not authorized to post item bid options (status code 403)
     *         or Internal error (status code 500)
     *         or Unexpected error (status code 200)
     */
    @Operation(
        operationId = "advancedAuctionItemsSubmitPost",
        summary = "Operate on item level bid options",
        description = "This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.",
        tags = { "advanced_auction" },
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
            @ApiResponse(responseCode = "default", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes={ "ads:write", "catalogs:read" })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/advanced_auction/items/submit",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<AdvancedAuctionProcessedItems> advancedAuctionItemsSubmitPost(
        @Parameter(name = "AdvancedAuctionItemsSubmitRequest", description = "Request object used to upsert or delete bid options for a batch of retail catalog items", required = true) @Valid @RequestBody AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest,
        @Pattern(regexp = "^\\d+$") @Size(max = 18) @Parameter(name = "ad_account_id", description = "Unique identifier of an ad account.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "ad_account_id", required = false) String adAccountId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"catalog_id\" : \"2680059592705\", \"items\" : [ { \"operation\" : \"UPSERT\", \"errors\" : [ { \"code\" : 6, \"message\" : \"Bid in micro currency should be non-negative\" }, { \"code\" : 6, \"message\" : \"Bid in micro currency should be non-negative\" } ] }, { \"operation\" : \"UPSERT\", \"errors\" : [ { \"code\" : 6, \"message\" : \"Bid in micro currency should be non-negative\" }, { \"code\" : 6, \"message\" : \"Bid in micro currency should be non-negative\" } ] } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
