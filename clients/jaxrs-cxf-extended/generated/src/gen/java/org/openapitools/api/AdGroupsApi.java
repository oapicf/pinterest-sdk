package org.openapitools.api;

import org.openapitools.model.AdGroup;
import org.openapitools.model.AdGroupAudienceSizing;
import org.openapitools.model.AdGroupAudienceSizingCreate;
import org.openapitools.model.AdGroupCreateCreate;
import org.openapitools.model.AdGroupUpdateBatchUpdate;
import org.openapitools.model.AdGroupsAnalyticsMetrics;
import org.openapitools.model.AdGroupsCreate200Response;
import org.openapitools.model.AdGroupsList200Response;
import org.openapitools.model.AdsAnalyticsAdGroupTargetingType;
import org.openapitools.model.BidFloor;
import org.openapitools.model.BidFloorCreate;
import java.math.BigDecimal;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.DynamicTitlesDownloadCSV;
import org.openapitools.model.DynamicTitlesGetStatus;
import org.openapitools.model.DynamicTitlesProcessCSV;
import org.openapitools.model.DynamicTitlesProcessCSVCreate;
import org.openapitools.model.DynamicTitlesUploadURL;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.Granularity;
import org.joda.time.LocalDate;
import org.openapitools.model.MetricsResponse;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.ReportingColumnSync;
import org.openapitools.model.ReportingTimeZone;

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
@Path("")
@Api(value = "/", description = "")
public interface AdGroupsApi  {

    /**
     * Get ad group analytics
     *
     * Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     */
    @GET
    @Path("/ad_accounts/{ad_account_id}/ad_groups/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad group analytics", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdGroupsAnalyticsMetrics.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public List<AdGroupsAnalyticsMetrics> adGroupsAnalytics(@QueryParam("start_date") @NotNull LocalDate startDate, @QueryParam("end_date") @NotNull LocalDate endDate, @QueryParam("ad_group_ids") @NotNull @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, @QueryParam("columns") @NotNull List<ReportingColumnSync> columns, @QueryParam("granularity") @NotNull Granularity granularity, @PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("click_window_days") @DefaultValue("30") BigDecimal clickWindowDays, @QueryParam("engagement_window_days") @DefaultValue("30") BigDecimal engagementWindowDays, @QueryParam("view_window_days") @DefaultValue("1") BigDecimal viewWindowDays, @QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION") String conversionReportTime, @QueryParam("aggregate_report_rows") @DefaultValue("false") Boolean aggregateReportRows, @QueryParam("reporting_timezone") ReportingTimeZone reportingTimezone);

    /**
     * Get audience sizing
     *
     * Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     *
     */
    @POST
    @Path("/ad_accounts/{ad_account_id}/ad_groups/audience_sizing")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audience sizing", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdGroupAudienceSizing.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = AdGroupAudienceSizing.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public AdGroupAudienceSizing adGroupsAudienceSizing(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid AdGroupAudienceSizingCreate adGroupAudienceSizingCreate);

    /**
     * Get bid floors
     *
     * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 &#x3D; 1,000,000 microdollars * 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
     *
     */
    @POST
    @Path("/ad_accounts/{ad_account_id}/bid_floor")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get bid floors", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BidFloor.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = BidFloor.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public BidFloor adGroupsBidFloorGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid BidFloorCreate bidFloorCreate);

    /**
     * Create ad groups
     *
     * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency: - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
     *
     */
    @POST
    @Path("/ad_accounts/{ad_account_id}/ad_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create ad groups", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdGroupsCreate200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public AdGroupsCreate200Response adGroupsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid List<@Valid AdGroupCreateCreate> adGroupCreateCreate);

    /**
     * Get dynamic titles CSV download URL
     *
     * Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
     *
     */
    @GET
    @Path("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get dynamic titles CSV download URL", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = DynamicTitlesDownloadCSV.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public DynamicTitlesDownloadCSV adGroupsDynamicTitlesDownloadCsv(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("ad_group_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId);

    /**
     * Get dynamic titles status
     *
     * Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
     *
     */
    @GET
    @Path("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get dynamic titles status", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = DynamicTitlesGetStatus.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public DynamicTitlesGetStatus adGroupsDynamicTitlesGetStatus(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("ad_group_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId);

    /**
     * Get dynamic titles upload URL
     *
     * Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
     *
     */
    @GET
    @Path("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get dynamic titles upload URL", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = DynamicTitlesUploadURL.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public DynamicTitlesUploadURL adGroupsDynamicTitlesGetUploadUrl(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("ad_group_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId);

    /**
     * Process dynamic titles CSV
     *
     * Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
     *
     */
    @POST
    @Path("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Process dynamic titles CSV", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = DynamicTitlesProcessCSV.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = DynamicTitlesProcessCSV.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public DynamicTitlesProcessCSV adGroupsDynamicTitlesProcessCsv(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("ad_group_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId, @Valid DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate);

    /**
     * Get ad group
     *
     * Get a specific ad group given the ad group ID.
     *
     */
    @GET
    @Path("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad group", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdGroup.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public AdGroup adGroupsGet(@PathParam("ad_group_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId, @PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);

    /**
     * List ad groups
     *
     * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
     *
     */
    @GET
    @Path("/ad_accounts/{ad_account_id}/ad_groups")
    @Produces({ "application/json" })
    @ApiOperation(value = "List ad groups", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdGroupsList200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public AdGroupsList200Response adGroupsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize, @QueryParam("order") PinterestLibPaginationOrder order, @QueryParam("campaign_ids") @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, @QueryParam("ad_group_ids") @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")String> adGroupIds, @QueryParam("entity_statuses") List<EntityStatus> entityStatuses, @QueryParam("translate_interests_to_names") @DefaultValue("false") Boolean translateInterestsToNames);

    /**
     * Get targeting analytics for ad groups
     *
     * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     */
    @GET
    @Path("/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get targeting analytics for ad groups", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = MetricsResponse.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public MetricsResponse adGroupsTargetingAnalyticsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("ad_group_ids") @NotNull @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, @QueryParam("start_date") @NotNull LocalDate startDate, @QueryParam("end_date") @NotNull LocalDate endDate, @QueryParam("targeting_types") @NotNull @Size(min=1,max=14) List<AdsAnalyticsAdGroupTargetingType> targetingTypes, @QueryParam("columns") @NotNull List<ReportingColumnSync> columns, @QueryParam("granularity") @NotNull Granularity granularity, @QueryParam("click_window_days") @DefaultValue("30") BigDecimal clickWindowDays, @QueryParam("engagement_window_days") @DefaultValue("30") BigDecimal engagementWindowDays, @QueryParam("view_window_days") @DefaultValue("1") BigDecimal viewWindowDays, @QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION") String conversionReportTime, @QueryParam("attribution_types") @Size(max=2) List<ConversionReportAttributionType> attributionTypes, @QueryParam("reporting_timezone") ReportingTimeZone reportingTimezone, @QueryParam("sort_columns") @Size(min=1,max=2) List<String> sortColumns, @QueryParam("sort_ascending") Boolean sortAscending);

    /**
     * Update ad groups
     *
     * Update multiple existing ad groups.
     *
     */
    @PATCH
    @Path("/ad_accounts/{ad_account_id}/ad_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update ad groups", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdGroupsCreate200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public AdGroupsCreate200Response adGroupsUpdate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid List<@Valid AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate);

    /**
     * List of ad groups using promotions IDs.
     *
     *   Get a list of ad groups that are associated with those promotion ids
     *
     */
    @GET
    @Path("/ad_accounts/{ad_account_id}/promotion_applied_entities")
    @Produces({ "application/json" })
    @ApiOperation(value = "List of ad groups using promotions IDs.", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdGroupsList200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public AdGroupsList200Response getAdGroupsByPromotionIdsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("promotion_ids") @NotNull @Size(min=1,max=50) List<String> promotionIds, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize, @QueryParam("order") PinterestLibPaginationOrder order);
}
