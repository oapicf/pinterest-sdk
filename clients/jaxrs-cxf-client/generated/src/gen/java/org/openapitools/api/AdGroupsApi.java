package org.openapitools.api;

import org.openapitools.model.AdGroupArrayResponse;
import org.openapitools.model.AdGroupAudienceSizingRequest;
import org.openapitools.model.AdGroupAudienceSizingResponse;
import org.openapitools.model.AdGroupCreateRequest;
import org.openapitools.model.AdGroupResponse;
import org.openapitools.model.AdGroupUpdateRequest;
import org.openapitools.model.AdGroupsAnalyticsResponseInner;
import org.openapitools.model.AdGroupsList200Response;
import org.openapitools.model.AdsAnalyticsAdGroupTargetingType;
import org.openapitools.model.BidFloor;
import org.openapitools.model.BidFloorRequest;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import org.joda.time.LocalDate;
import org.openapitools.model.MetricsResponse;
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
public interface AdGroupsApi  {

    /**
     * Get ad group analytics
     *
     * Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     */
    @GET
    @Path("/ad_groups/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad group analytics", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupsAnalyticsResponseInner.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account group analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public List<AdGroupsAnalyticsResponseInner> adGroupsAnalytics(@PathParam("ad_account_id") String adAccountId, @QueryParam("start_date") LocalDate startDate, @QueryParam("end_date") LocalDate endDate, @QueryParam("ad_group_ids") List<String> adGroupIds, @QueryParam("columns") List<String> columns, @QueryParam("granularity") Granularity granularity, @QueryParam("click_window_days") @DefaultValue("30")Integer clickWindowDays, @QueryParam("engagement_window_days") @DefaultValue("30")Integer engagementWindowDays, @QueryParam("view_window_days") @DefaultValue("1")Integer viewWindowDays, @QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")String conversionReportTime, @QueryParam("aggregate_report_rows") @DefaultValue("false")Boolean aggregateReportRows, @QueryParam("reporting_timezone") ReportingTimeZone reportingTimezone);

    /**
     * Get audience sizing
     *
     * Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     *
     */
    @POST
    @Path("/ad_groups/audience_sizing")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audience sizing", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupAudienceSizingResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad group audience sizing parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "No access to requested audience list or product group.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdGroupAudienceSizingResponse adGroupsAudienceSizing(@PathParam("ad_account_id") String adAccountId, AdGroupAudienceSizingRequest adGroupAudienceSizingRequest);

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
    @ApiOperation(value = "Get bid floors", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BidFloor.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BidFloor adGroupsBidFloorGet(@PathParam("ad_account_id") String adAccountId, BidFloorRequest bidFloorRequest);

    /**
     * Create ad groups
     *
     * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/campaign-structure\&quot; target&#x3D;\&quot;_blank\&quot;&gt; click here&lt;/a&gt;. &lt;strong&gt;Notes:&lt;/strong&gt; - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.&lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt; - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;closed beta&lt;/a&gt; access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule. 
     *
     */
    @POST
    @Path("/ad_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create ad groups", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupArrayResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdGroupArrayResponse adGroupsCreate(@PathParam("ad_account_id") String adAccountId, List<AdGroupCreateRequest> adGroupCreateRequest);

    /**
     * Get ad group
     *
     * Get a specific ad group given the ad group ID.
     *
     */
    @GET
    @Path("/ad_groups/{ad_group_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad group", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdGroupResponse adGroupsGet(@PathParam("ad_account_id") String adAccountId, @PathParam("ad_group_id") String adGroupId);

    /**
     * List ad groups
     *
     * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; Provide only campaign_id or ad_group_id. Do not provide both.
     *
     */
    @GET
    @Path("/ad_groups")
    @Produces({ "application/json" })
    @ApiOperation(value = "List ad groups", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account group parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdGroupsList200Response adGroupsList(@PathParam("ad_account_id") String adAccountId, @QueryParam("campaign_ids") List<String> campaignIds, @QueryParam("ad_group_ids") List<String> adGroupIds, @QueryParam("entity_statuses") List<String> entityStatuses, @QueryParam("page_size") @DefaultValue("25")Integer pageSize, @QueryParam("order") String order, @QueryParam("bookmark") String bookmark, @QueryParam("translate_interests_to_names") @DefaultValue("false")Boolean translateInterestsToNames);

    /**
     * Get targeting analytics for ad groups
     *
     * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     */
    @GET
    @Path("/ad_groups/targeting_analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get targeting analytics for ad groups", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = MetricsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public MetricsResponse adGroupsTargetingAnalyticsGet(@PathParam("ad_account_id") String adAccountId, @QueryParam("ad_group_ids") List<String> adGroupIds, @QueryParam("start_date") LocalDate startDate, @QueryParam("end_date") LocalDate endDate, @QueryParam("targeting_types") List<AdsAnalyticsAdGroupTargetingType> targetingTypes, @QueryParam("columns") List<String> columns, @QueryParam("granularity") Granularity granularity, @QueryParam("click_window_days") @DefaultValue("30")Integer clickWindowDays, @QueryParam("engagement_window_days") @DefaultValue("30")Integer engagementWindowDays, @QueryParam("view_window_days") @DefaultValue("1")Integer viewWindowDays, @QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")String conversionReportTime, @QueryParam("attribution_types") List<ConversionReportAttributionType> attributionTypes, @QueryParam("reporting_timezone") ReportingTimeZone reportingTimezone);

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
    @ApiOperation(value = "Update ad groups", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupArrayResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdGroupArrayResponse adGroupsUpdate(@PathParam("ad_account_id") String adAccountId, List<AdGroupUpdateRequest> adGroupUpdateRequest);
}
