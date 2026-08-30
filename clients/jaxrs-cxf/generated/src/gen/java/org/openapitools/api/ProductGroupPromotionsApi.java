package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.Granularity;
import org.joda.time.LocalDate;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.ProductGroupAnalyticsItems;
import org.openapitools.model.ProductGroupPromotion;
import org.openapitools.model.ProductGroupPromotions;
import org.openapitools.model.ProductGroupPromotionsCreate;
import org.openapitools.model.ProductGroupPromotionsList200Response;
import org.openapitools.model.ProductGroupPromotionsUpdateWithRequiredBody;
import org.openapitools.model.ReportingColumnSync;
import org.openapitools.model.ReportingTimeZone;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
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
@Path("")
@Api(value = "/", description = "")
public interface ProductGroupPromotionsApi  {

    /**
     * Create product group promotions
     *
     * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)
     *
     */
    @POST
    @Path("/ad_accounts/{ad_account_id}/product_group_promotions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create product group promotions", tags={ "product_group_promotions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = ProductGroupPromotions.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = ProductGroupPromotions.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public ProductGroupPromotions productGroupPromotionsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid @NotNull ProductGroupPromotionsCreate productGroupPromotionsCreate);

    /**
     * Get a product group promotion by id
     *
     * Get a product group promotion by id
     *
     */
    @GET
    @Path("/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a product group promotion by id", tags={ "product_group_promotions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = ProductGroupPromotion.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public ProductGroupPromotion productGroupPromotionsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("product_group_promotion_id") @Pattern(regexp="^\\d+$") @Size(max=18) String productGroupPromotionId);

    /**
     * Get product group promotions
     *
     * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
     *
     */
    @GET
    @Path("/ad_accounts/{ad_account_id}/product_group_promotions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get product group promotions", tags={ "product_group_promotions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = ProductGroupPromotionsList200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public ProductGroupPromotionsList200Response productGroupPromotionsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")Integer pageSize, @QueryParam("order") PinterestLibPaginationOrder order, @QueryParam("product_group_promotion_ids") @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds, @QueryParam("entity_statuses") List<EntityStatus> entityStatuses, @QueryParam("ad_group_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId);

    /**
     * Update product group promotions
     *
     * Update multiple existing Product Group Promotions (by product_group_id)
     *
     */
    @PATCH
    @Path("/ad_accounts/{ad_account_id}/product_group_promotions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update product group promotions", tags={ "product_group_promotions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = ProductGroupPromotions.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public ProductGroupPromotions productGroupPromotionsUpdate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid @NotNull ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody);

    /**
     * Get product group analytics
     *
     * Get analytics for the specified product groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     */
    @GET
    @Path("/ad_accounts/{ad_account_id}/product_groups/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get product group analytics", tags={ "product_group_promotions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = ProductGroupAnalyticsItems.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public List<ProductGroupAnalyticsItems> productGroupsAnalytics(@QueryParam("start_date") @NotNull LocalDate startDate, @QueryParam("end_date") @NotNull LocalDate endDate, @QueryParam("product_group_ids") @NotNull @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")String> productGroupIds, @QueryParam("columns") @NotNull List<ReportingColumnSync> columns, @QueryParam("granularity") @NotNull Granularity granularity, @PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("click_window_days") @DefaultValue("30")BigDecimal clickWindowDays, @QueryParam("engagement_window_days") @DefaultValue("30")BigDecimal engagementWindowDays, @QueryParam("view_window_days") @DefaultValue("1")BigDecimal viewWindowDays, @QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")String conversionReportTime, @QueryParam("reporting_timezone") ReportingTimeZone reportingTimezone);
}
