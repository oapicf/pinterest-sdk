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
import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import java.time.LocalDate;
import org.openapitools.model.ProductGroupAnalyticsResponseInner;
import org.openapitools.model.ProductGroupPromotionCreateRequest;
import org.openapitools.model.ProductGroupPromotionResponse;
import org.openapitools.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.model.ProductGroupPromotionsList200Response;
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
@Tag(name = "ProductGroupPromotions", description = "The ProductGroupPromotions API")
public class ProductGroupPromotionsController {
    /**
     * Create product group promotions
     * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param productGroupPromotionCreateRequest List of Product Group Promotions to create, size limit [1, 30]. (required)
     * @return ProductGroupPromotionResponse
     */
    @Operation(
        operationId = "productGroupPromotionsCreate",
        summary = "Create product group promotions",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ProductGroupPromotionResponse.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "adAccountId", description = "Unique identifier of an ad account.", required = true),
            @Parameter(name = "productGroupPromotionCreateRequest", description = "List of Product Group Promotions to create, size limit [1, 30].", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:write" })
        }
    )
    @Post(uri="/ad_accounts/{ad_account_id}/product_group_promotions")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<ProductGroupPromotionResponse> productGroupPromotionsCreate(
        @PathVariable(value="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @Body @NotNull @Valid ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest
    ) {
        // TODO implement productGroupPromotionsCreate();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Get a product group promotion by id
     * Get a product group promotion by id
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param productGroupPromotionId Unique identifier of a product group promotion (required)
     * @return ProductGroupPromotionResponse
     */
    @Operation(
        operationId = "productGroupPromotionsGet",
        summary = "Get a product group promotion by id",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ProductGroupPromotionResponse.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "adAccountId", description = "Unique identifier of an ad account.", required = true),
            @Parameter(name = "productGroupPromotionId", description = "Unique identifier of a product group promotion", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:read" })
        }
    )
    @Get(uri="/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<ProductGroupPromotionResponse> productGroupPromotionsGet(
        @PathVariable(value="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @PathVariable(value="product_group_promotion_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String productGroupPromotionId
    ) {
        // TODO implement productGroupPromotionsGet();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Get product group promotions
     * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  &lt;b&gt;Note:&lt;/b&gt; ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param productGroupPromotionIds List of Product group promotion Ids. (optional)
     * @param entityStatuses Entity status (optional, default to ACTIVE,PAUSED)
     * @param adGroupId Ad group Id. (optional)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @return ProductGroupPromotionsList200Response
     */
    @Operation(
        operationId = "productGroupPromotionsList",
        summary = "Get product group promotions",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ProductGroupPromotionsList200Response.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "adAccountId", description = "Unique identifier of an ad account.", required = true),
            @Parameter(name = "productGroupPromotionIds", description = "List of Product group promotion Ids."),
            @Parameter(name = "entityStatuses", description = "Entity status"),
            @Parameter(name = "adGroupId", description = "Ad group Id."),
            @Parameter(name = "pageSize", description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information."),
            @Parameter(name = "order", description = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items."),
            @Parameter(name = "bookmark", description = "Cursor used to fetch the next page of items")
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:read" })
        }
    )
    @Get(uri="/ad_accounts/{ad_account_id}/product_group_promotions")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<ProductGroupPromotionsList200Response> productGroupPromotionsList(
        @PathVariable(value="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @QueryValue(value="product_group_promotion_ids") @Nullable @Size(min=1, max=100) List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds, 
        @QueryValue(value="entity_statuses", defaultValue="ACTIVE,PAUSED") @Nullable List<String> entityStatuses, 
        @QueryValue(value="ad_group_id") @Nullable @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId, 
        @QueryValue(value="page_size", defaultValue="25") @Nullable @Min(1) @Max(250) Integer pageSize, 
        @QueryValue(value="order") @Nullable String order, 
        @QueryValue(value="bookmark") @Nullable String bookmark
    ) {
        // TODO implement productGroupPromotionsList();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Update product group promotions
     * Update multiple existing Product Group Promotions (by product_group_id)
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param productGroupPromotionUpdateRequest Parameters to update Product group promotions (required)
     * @return ProductGroupPromotionResponse
     */
    @Operation(
        operationId = "productGroupPromotionsUpdate",
        summary = "Update product group promotions",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ProductGroupPromotionResponse.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "adAccountId", description = "Unique identifier of an ad account.", required = true),
            @Parameter(name = "productGroupPromotionUpdateRequest", description = "Parameters to update Product group promotions", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:write" })
        }
    )
    @Patch(uri="/ad_accounts/{ad_account_id}/product_group_promotions")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<ProductGroupPromotionResponse> productGroupPromotionsUpdate(
        @PathVariable(value="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @Body @NotNull @Valid ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest
    ) {
        // TODO implement productGroupPromotionsUpdate();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Get product group analytics
     * Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param productGroupIds List of Product group Ids to use to filter the results. (required)
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned (required)
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly (required)
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
     * @return List&lt;ProductGroupAnalyticsResponseInner&gt;
     */
    @Operation(
        operationId = "productGroupsAnalytics",
        summary = "Get product group analytics",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ProductGroupAnalyticsResponseInner.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ad account ads analytics parameters.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "adAccountId", description = "Unique identifier of an ad account.", required = true),
            @Parameter(name = "startDate", description = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true),
            @Parameter(name = "endDate", description = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true),
            @Parameter(name = "productGroupIds", description = "List of Product group Ids to use to filter the results.", required = true),
            @Parameter(name = "columns", description = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned", required = true),
            @Parameter(name = "granularity", description = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly", required = true),
            @Parameter(name = "clickWindowDays", description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days."),
            @Parameter(name = "engagementWindowDays", description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days."),
            @Parameter(name = "viewWindowDays", description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day."),
            @Parameter(name = "conversionReportTime", description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:read" })
        }
    )
    @Get(uri="/ad_accounts/{ad_account_id}/product_groups/analytics")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<List<ProductGroupAnalyticsResponseInner>> productGroupsAnalytics(
        @PathVariable(value="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @QueryValue(value="start_date") @NotNull @Format("yyyy-MM-dd") LocalDate startDate, 
        @QueryValue(value="end_date") @NotNull @Format("yyyy-MM-dd") LocalDate endDate, 
        @QueryValue(value="product_group_ids") @NotNull @Size(min=1, max=100) List<@Pattern(regexp = "^\\d+$")String> productGroupIds, 
        @QueryValue(value="columns") @NotNull List<String> columns, 
        @QueryValue(value="granularity") @NotNull Granularity granularity, 
        @QueryValue(value="click_window_days", defaultValue="30") @Nullable Integer clickWindowDays, 
        @QueryValue(value="engagement_window_days", defaultValue="30") @Nullable Integer engagementWindowDays, 
        @QueryValue(value="view_window_days", defaultValue="1") @Nullable Integer viewWindowDays, 
        @QueryValue(value="conversion_report_time", defaultValue="TIME_OF_AD_ACTION") @Nullable String conversionReportTime
    ) {
        // TODO implement productGroupsAnalytics();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

}
