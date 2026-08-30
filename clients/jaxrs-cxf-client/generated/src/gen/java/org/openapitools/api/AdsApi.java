package org.openapitools.api;

import org.openapitools.model.Ad;
import org.openapitools.model.AdBatchUpdate;
import org.openapitools.model.AdBatchWriteResponseModel;
import org.openapitools.model.AdCreate;
import org.openapitools.model.AdPreviewRequest;
import org.openapitools.model.AdPreviewURLResponse;
import org.openapitools.model.AdsAnalytics;
import org.openapitools.model.AdsAnalyticsAdTargetingType;
import org.openapitools.model.AdsList200Response;
import java.math.BigDecimal;
import org.openapitools.model.CampaignAdPreview;
import org.openapitools.model.CampaignAdPreviewCreate;
import org.openapitools.model.CampaignAdPreviewCreate200ResponseInner;
import org.openapitools.model.CampaignAdPreviewDelete200ResponseInner;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.Granularity;
import org.joda.time.LocalDate;
import org.openapitools.model.MetricsResponse;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
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

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
@Path("/ad_accounts/{ad_account_id}")
@Api(value = "/", description = "")
public interface AdsApi  {

    /**
     * Create ad preview with pin or image
     *
     * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
     *
     */
    @POST
    @Path("/ad_previews")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create ad preview with pin or image", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdPreviewURLResponse.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = AdPreviewURLResponse.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public AdPreviewURLResponse adPreviewsCreate(@PathParam("ad_account_id") String adAccountId, AdPreviewRequest adPreviewRequest);

    /**
     * Get targeting analytics for ads
     *
     * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     */
    @GET
    @Path("/ads/targeting_analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get targeting analytics for ads", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = MetricsResponse.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public MetricsResponse adTargetingAnalyticsGet(@PathParam("ad_account_id") String adAccountId, @QueryParam("ad_ids") List<String> adIds, @QueryParam("start_date") LocalDate startDate, @QueryParam("end_date") LocalDate endDate, @QueryParam("targeting_types") List<AdsAnalyticsAdTargetingType> targetingTypes, @QueryParam("columns") List<ReportingColumnSync> columns, @QueryParam("granularity") Granularity granularity, @QueryParam("click_window_days") ConversionAttributionWindowDays clickWindowDays, @QueryParam("engagement_window_days") ConversionAttributionWindowDays engagementWindowDays, @QueryParam("view_window_days") ConversionAttributionWindowDays viewWindowDays, @QueryParam("conversion_report_time") ConversionReportTimeType conversionReportTime, @QueryParam("attribution_types") List<ConversionReportAttributionType> attributionTypes, @QueryParam("reporting_timezone") ReportingTimeZone reportingTimezone, @QueryParam("sort_columns") List<String> sortColumns, @QueryParam("sort_ascending") Boolean sortAscending);

    /**
     * Get ad analytics
     *
     *     Get analytics for the specified ads in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.     - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     */
    @GET
    @Path("/ads/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad analytics", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdsAnalytics.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public List<AdsAnalytics> adsAnalytics(@QueryParam("start_date") LocalDate startDate, @QueryParam("end_date") LocalDate endDate, @QueryParam("columns") List<ReportingColumnSync> columns, @QueryParam("granularity") Granularity granularity, @PathParam("ad_account_id") String adAccountId, @QueryParam("pin_ids") List<String> pinIds, @QueryParam("ad_ids") List<String> adIds, @QueryParam("click_window_days") @DefaultValue("30")BigDecimal clickWindowDays, @QueryParam("engagement_window_days") @DefaultValue("30")BigDecimal engagementWindowDays, @QueryParam("view_window_days") @DefaultValue("1")BigDecimal viewWindowDays, @QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")String conversionReportTime, @QueryParam("campaign_ids") List<String> campaignIds, @QueryParam("reporting_timezone") ReportingTimeZone reportingTimezone);

    /**
     * Create ads
     *
     * Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
     *
     */
    @POST
    @Path("/ads")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create ads", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdBatchWriteResponseModel.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public AdBatchWriteResponseModel adsCreate(@PathParam("ad_account_id") String adAccountId, List<AdCreate> adCreate);

    /**
     * Get ad
     *
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
     *
     */
    @GET
    @Path("/ads/{ad_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = Ad.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Ad adsGet(@PathParam("ad_id") String adId, @PathParam("ad_account_id") String adAccountId);

    /**
     * List ads
     *
     * List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only &#x60;campaign_id&#x60; or &#x60;ad_group_id&#x60; or &#x60;ad_id&#x60;. Do not provide more than one type.  Review status is provided for each ad; if &#x60;review_status&#x60; is &#x60;REJECTED&#x60;, the &#x60;rejected_reasons&#x60; field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
     *
     */
    @GET
    @Path("/ads")
    @Produces({ "application/json" })
    @ApiOperation(value = "List ads", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdsList200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public AdsList200Response adsList(@PathParam("ad_account_id") String adAccountId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize, @QueryParam("order") PinterestLibPaginationOrder order, @QueryParam("campaign_ids") List<String> campaignIds, @QueryParam("ad_group_ids") List<String> adGroupIds, @QueryParam("ad_ids") List<String> adIds, @QueryParam("entity_statuses") List<EntityStatus> entityStatuses);

    /**
     * Update ads
     *
     * Update multiple existing ads
     *
     */
    @PATCH
    @Path("/ads")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update ads", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdBatchWriteResponseModel.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public AdBatchWriteResponseModel adsUpdate(@PathParam("ad_account_id") String adAccountId, List<AdBatchUpdate> adBatchUpdate);

    /**
     * Create ad preview records for one or more ad groups
     *
     * Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
     *
     */
    @POST
    @Path("/campaign_ad_preview")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create ad preview records for one or more ad groups", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = CampaignAdPreviewCreate200ResponseInner.class, responseContainer = "List"),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = CampaignAdPreview.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public List<CampaignAdPreviewCreate200ResponseInner> campaignAdPreviewCreate(@PathParam("ad_account_id") String adAccountId, List<CampaignAdPreviewCreate> campaignAdPreviewCreate);

    /**
     * Delete ad preview records for one or more ad groups
     *
     * Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
     *
     */
    @DELETE
    @Path("/campaign_ad_preview")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete ad preview records for one or more ad groups", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = CampaignAdPreviewDelete200ResponseInner.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "Resource deleted successfully."),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public List<CampaignAdPreviewDelete200ResponseInner> campaignAdPreviewDelete(@QueryParam("ad_group_ids") List<String> adGroupIds, @PathParam("ad_account_id") String adAccountId);

    /**
     * Fetch ad preview records for one or more ad groups
     *
     * Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
     *
     */
    @GET
    @Path("/campaign_ad_preview")
    @Produces({ "application/json" })
    @ApiOperation(value = "Fetch ad preview records for one or more ad groups", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = CampaignAdPreview.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public List<CampaignAdPreview> campaignAdPreviewRead(@QueryParam("ad_group_ids") List<String> adGroupIds, @PathParam("ad_account_id") String adAccountId);
}
