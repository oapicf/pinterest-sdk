package org.openapitools.api;

import org.openapitools.model.AdGroupArrayResponse;
import org.openapitools.model.AdGroupAudienceSizingRequest;
import org.openapitools.model.AdGroupAudienceSizingResponse;
import org.openapitools.model.AdGroupCreateRequest;
import org.openapitools.model.AdGroupResponse;
import org.openapitools.model.AdGroupUpdateRequest;
import org.openapitools.model.AdGroupsAnalyticsResponseInner;
import org.openapitools.model.AdGroupsList200Response;
import org.openapitools.model.AdsAnalyticsTargetingType;
import org.openapitools.model.BidFloor;
import org.openapitools.model.BidFloorRequest;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import org.joda.time.LocalDate;
import org.openapitools.model.MetricsResponse;

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
@Path("/ad_accounts/{ad_account_id}")
@Api(value = "/", description = "")
public interface AdGroupsApi  {

    /**
     * Get ad group analytics
     *
     * Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     *
     */
    @GET
    @Path("/ad_groups/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad group analytics", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupsAnalyticsResponseInner.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account group analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public List<AdGroupsAnalyticsResponseInner> adGroupsAnalytics(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("start_date") @NotNull LocalDate startDate, @QueryParam("end_date") @NotNull LocalDate endDate, @QueryParam("ad_group_ids") @NotNull @Size(min=1,max=100) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, @QueryParam("columns") @NotNull List<String> columns, @QueryParam("granularity") @NotNull Granularity granularity, @QueryParam("click_window_days") @DefaultValue("30")Integer clickWindowDays, @QueryParam("engagement_window_days") @DefaultValue("30")Integer engagementWindowDays, @QueryParam("view_window_days") @DefaultValue("1")Integer viewWindowDays, @QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")String conversionReportTime);

    /**
     * Get audience sizing
     *
     * Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     *
     */
    @GET
    @Path("/ad_groups/audience_sizing")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audience sizing", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupAudienceSizingResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad group audience sizing parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "No access to requested audience list or product group.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdGroupAudienceSizingResponse adGroupsAudienceSizing(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid AdGroupAudienceSizingRequest adGroupAudienceSizingRequest);

    /**
     * Get bid floors
     *
     * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. &lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt; For more on bid floors see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-your-bid\&quot;&gt; Set your bid&lt;/a&gt;.
     *
     */
    @POST
    @Path("/bid_floor")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get bid floors", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BidFloor.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BidFloor adGroupsBidFloorGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid @NotNull BidFloorRequest bidFloorRequest);

    /**
     * Create ad groups
     *
     * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/campaign-structure\&quot; target&#x3D;\&quot;_blank\&quot;&gt; click here&lt;/a&gt;.&lt;/p&gt; &lt;strong&gt;Note:&lt;/strong&gt; - &#39;bid_in_micro_currency&#39; and &#39;budget_in_micro_currency&#39; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.&lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt; - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.
     *
     */
    @POST
    @Path("/ad_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create ad groups", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupArrayResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdGroupArrayResponse adGroupsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid @NotNull List<AdGroupCreateRequest> adGroupCreateRequest);

    /**
     * Get ad group
     *
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the &lt;a href&#x3D;\&quot;https://www.pinterest.com/_/_/policy/advertising-guidelines/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
     *
     */
    @GET
    @Path("/ad_groups/{ad_group_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad group", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdGroupResponse adGroupsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("ad_group_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId);

    /**
     * List ad groups
     *
     * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; Provide only campaign_id or ad_group_id. Do not provide both.
     *
     */
    @GET
    @Path("/ad_groups")
    @Produces({ "application/json" })
    @ApiOperation(value = "List ad groups", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account group parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdGroupsList200Response adGroupsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("campaign_ids") @Size(min=1,max=100) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, @QueryParam("ad_group_ids") @Size(min=1,max=100) List<@Pattern(regexp = "^\\d+$")String> adGroupIds, @QueryParam("entity_statuses") List<String> entityStatuses, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")Integer pageSize, @QueryParam("order") String order, @QueryParam("bookmark") String bookmark, @QueryParam("translate_interests_to_names") @DefaultValue("false")Boolean translateInterestsToNames);

    /**
     * Get targeting analytics for ad groups
     *
     * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     *
     */
    @GET
    @Path("/ad_groups/targeting_analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get targeting analytics for ad groups", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = MetricsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public MetricsResponse adGroupsTargetingAnalyticsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("ad_group_ids") @NotNull @Size(min=1,max=100) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, @QueryParam("start_date") @NotNull LocalDate startDate, @QueryParam("end_date") @NotNull LocalDate endDate, @QueryParam("targeting_types") @NotNull @Size(min=1,max=15) List<AdsAnalyticsTargetingType> targetingTypes, @QueryParam("columns") @NotNull List<String> columns, @QueryParam("granularity") @NotNull Granularity granularity, @QueryParam("click_window_days") @DefaultValue("30")Integer clickWindowDays, @QueryParam("engagement_window_days") @DefaultValue("30")Integer engagementWindowDays, @QueryParam("view_window_days") @DefaultValue("1")Integer viewWindowDays, @QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")String conversionReportTime, @QueryParam("attribution_types") ConversionReportAttributionType attributionTypes);

    /**
     * Update ad groups
     *
     * Update multiple existing ad groups.
     *
     */
    @PATCH
    @Path("/ad_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update ad groups", tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupArrayResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdGroupArrayResponse adGroupsUpdate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid @NotNull List<AdGroupUpdateRequest> adGroupUpdateRequest);
}
