package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import org.joda.time.LocalDate;
import org.openapitools.model.ProductGroupAnalyticsResponseInner;
import org.openapitools.model.ProductGroupPromotionCreateRequest;
import org.openapitools.model.ProductGroupPromotionResponse;
import org.openapitools.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.model.ProductGroupPromotionsList200Response;

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

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
@Path("/ad_accounts/{ad_account_id}")
@Api(value = "/", description = "")
public interface ProductGroupPromotionsApi  {

    /**
     * Create product group promotions
     *
     * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)
     *
     */
    @POST
    @Path("/product_group_promotions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create product group promotions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ProductGroupPromotionResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public ProductGroupPromotionResponse productGroupPromotionsCreate(@PathParam("ad_account_id") String adAccountId, ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest);

    /**
     * Get a product group promotion by id
     *
     * Get a product group promotion by id
     *
     */
    @GET
    @Path("/product_group_promotions/{product_group_promotion_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a product group promotion by id", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ProductGroupPromotionResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public ProductGroupPromotionResponse productGroupPromotionsGet(@PathParam("ad_account_id") String adAccountId, @PathParam("product_group_promotion_id") String productGroupPromotionId);

    /**
     * Get product group promotions
     *
     * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  &lt;b&gt;Note:&lt;/b&gt; ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
     *
     */
    @GET
    @Path("/product_group_promotions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get product group promotions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ProductGroupPromotionsList200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public ProductGroupPromotionsList200Response productGroupPromotionsList(@PathParam("ad_account_id") String adAccountId, @QueryParam("product_group_promotion_ids") List<String> productGroupPromotionIds, @QueryParam("entity_statuses") List<String> entityStatuses, @QueryParam("ad_group_id") String adGroupId, @QueryParam("page_size") @DefaultValue("25")Integer pageSize, @QueryParam("order") String order, @QueryParam("bookmark") String bookmark);

    /**
     * Update product group promotions
     *
     * Update multiple existing Product Group Promotions (by product_group_id)
     *
     */
    @PATCH
    @Path("/product_group_promotions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update product group promotions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ProductGroupPromotionResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public ProductGroupPromotionResponse productGroupPromotionsUpdate(@PathParam("ad_account_id") String adAccountId, ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest);

    /**
     * Get product group analytics
     *
     * Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     *
     */
    @GET
    @Path("/product_groups/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get product group analytics", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ProductGroupAnalyticsResponseInner.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public List<ProductGroupAnalyticsResponseInner> productGroupsAnalytics(@PathParam("ad_account_id") String adAccountId, @QueryParam("start_date") LocalDate startDate, @QueryParam("end_date") LocalDate endDate, @QueryParam("product_group_ids") List<String> productGroupIds, @QueryParam("columns") List<String> columns, @QueryParam("granularity") Granularity granularity, @QueryParam("click_window_days") @DefaultValue("30")Integer clickWindowDays, @QueryParam("engagement_window_days") @DefaultValue("30")Integer engagementWindowDays, @QueryParam("view_window_days") @DefaultValue("1")Integer viewWindowDays, @QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")String conversionReportTime);
}
