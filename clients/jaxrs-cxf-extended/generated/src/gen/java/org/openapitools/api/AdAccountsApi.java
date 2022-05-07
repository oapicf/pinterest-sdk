package org.openapitools.api;

import org.openapitools.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import org.joda.time.LocalDate;
import org.openapitools.model.Paginated;

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
@Path("/ad_accounts")
@Api(value = "/", description = "")
public interface AdAccountsApi  {

    /**
     * Get ad account analytics
     *
     * Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     *
     */
    @GET
    @Path("/{ad_account_id}/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad account analytics", tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public List<Map<String, Object>> adAccountAnalytics(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") String adAccountId, @QueryParam("start_date") @NotNull LocalDate startDate, @QueryParam("end_date") @NotNull LocalDate endDate, @QueryParam("columns") @NotNull List<String> columns, @QueryParam("granularity") @NotNull Granularity granularity, @QueryParam("click_window_days") @DefaultValue("30") Integer clickWindowDays, @QueryParam("engagement_window_days") @DefaultValue("30") Integer engagementWindowDays, @QueryParam("view_window_days") @DefaultValue("1") Integer viewWindowDays, @QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION") String conversionReportTime);

    /**
     * List ad accounts
     *
     * Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List ad accounts", tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Paginated.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Paginated adAccountsList(@QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25") Integer pageSize, @QueryParam("include_shared_accounts") @DefaultValue("true") Boolean includeSharedAccounts);

    /**
     * Get ad group analytics
     *
     * Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     *
     */
    @GET
    @Path("/{ad_account_id}/ad_groups/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad group analytics", tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account group analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public List<Map<String, Object>> adGroupsAnalytics(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") String adAccountId, @QueryParam("start_date") @NotNull LocalDate startDate, @QueryParam("end_date") @NotNull LocalDate endDate, @QueryParam("ad_group_ids") @NotNull @Size(min=1,max=100) List<String> adGroupIds, @QueryParam("columns") @NotNull List<String> columns, @QueryParam("granularity") @NotNull Granularity granularity, @QueryParam("click_window_days") @DefaultValue("30") Integer clickWindowDays, @QueryParam("engagement_window_days") @DefaultValue("30") Integer engagementWindowDays, @QueryParam("view_window_days") @DefaultValue("1") Integer viewWindowDays, @QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION") String conversionReportTime);

    /**
     * List ad groups
     *
     * Get a list of the ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     *
     */
    @GET
    @Path("/{ad_account_id}/ad_groups")
    @Produces({ "application/json" })
    @ApiOperation(value = "List ad groups", tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Paginated.class),
        @ApiResponse(code = 400, message = "Invalid ad account group parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Paginated adGroupsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") String adAccountId, @QueryParam("campaign_ids") @Size(min=1,max=100) List<String> campaignIds, @QueryParam("ad_group_ids") @Size(min=1,max=100) List<String> adGroupIds, @QueryParam("entity_statuses") List<String> entityStatuses, @QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25") Integer pageSize, @QueryParam("order") String order, @QueryParam("bookmark") String bookmark, @QueryParam("translate_interests_to_names") @DefaultValue("false") Boolean translateInterestsToNames);

    /**
     * Get ad analytics
     *
     * Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     *
     */
    @GET
    @Path("/{ad_account_id}/ads/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad analytics", tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public List<Map<String, Object>> adsAnalytics(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") String adAccountId, @QueryParam("start_date") @NotNull LocalDate startDate, @QueryParam("end_date") @NotNull LocalDate endDate, @QueryParam("ad_ids") @NotNull @Size(min=1,max=100) List<String> adIds, @QueryParam("columns") @NotNull List<String> columns, @QueryParam("granularity") @NotNull Granularity granularity, @QueryParam("click_window_days") @DefaultValue("30") Integer clickWindowDays, @QueryParam("engagement_window_days") @DefaultValue("30") Integer engagementWindowDays, @QueryParam("view_window_days") @DefaultValue("1") Integer viewWindowDays, @QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION") String conversionReportTime);

    /**
     * List ads
     *
     * Get a list of the ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     *
     */
    @GET
    @Path("/{ad_account_id}/ads")
    @Produces({ "application/json" })
    @ApiOperation(value = "List ads", tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Paginated.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Paginated adsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") String adAccountId, @QueryParam("campaign_ids") @Size(min=1,max=100) List<String> campaignIds, @QueryParam("ad_group_ids") @Size(min=1,max=100) List<String> adGroupIds, @QueryParam("ad_ids") @Size(min=1,max=100) List<String> adIds, @QueryParam("entity_statuses") List<String> entityStatuses, @QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25") Integer pageSize, @QueryParam("order") String order, @QueryParam("bookmark") String bookmark);

    /**
     * Create async request for an account analytics report
     *
     * This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     *
     */
    @POST
    @Path("/{ad_account_id}/reports")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create async request for an account analytics report", tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdsAnalyticsCreateAsyncResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdsAnalyticsCreateAsyncResponse analyticsCreateReport(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") String adAccountId, @Valid AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest);

    /**
     * Get the account analytics report created by the async call
     *
     * This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it&#39;s valid for an hour. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     *
     */
    @GET
    @Path("/{ad_account_id}/reports")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get the account analytics report created by the async call", tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdsAnalyticsGetAsyncResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdsAnalyticsGetAsyncResponse analyticsGetReport(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") String adAccountId, @QueryParam("token") @NotNull String token);

    /**
     * Get campaign analytics
     *
     * Get analytics for the specified campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     *
     */
    @GET
    @Path("/{ad_account_id}/campaigns/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get campaign analytics", tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account campaign analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public List<Map<String, Object>> campaignsAnalytics(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") String adAccountId, @QueryParam("start_date") @NotNull LocalDate startDate, @QueryParam("end_date") @NotNull LocalDate endDate, @QueryParam("campaign_ids") @NotNull @Size(min=1,max=100) List<String> campaignIds, @QueryParam("columns") @NotNull List<String> columns, @QueryParam("granularity") @NotNull Granularity granularity, @QueryParam("click_window_days") @DefaultValue("30") Integer clickWindowDays, @QueryParam("engagement_window_days") @DefaultValue("30") Integer engagementWindowDays, @QueryParam("view_window_days") @DefaultValue("1") Integer viewWindowDays, @QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION") String conversionReportTime);

    /**
     * List campaigns
     *
     * Get a list of the campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     *
     */
    @GET
    @Path("/{ad_account_id}/campaigns")
    @Produces({ "application/json" })
    @ApiOperation(value = "List campaigns", tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Paginated.class),
        @ApiResponse(code = 400, message = "Invalid ad account campaign parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Paginated campaignsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") String adAccountId, @QueryParam("campaign_ids") @Size(min=1,max=100) List<String> campaignIds, @QueryParam("entity_statuses") List<String> entityStatuses, @QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25") Integer pageSize, @QueryParam("order") String order, @QueryParam("bookmark") String bookmark);

    /**
     * Get product group analytics
     *
     * Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     *
     */
    @GET
    @Path("/{ad_account_id}/product_groups/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get product group analytics", tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public List<Map<String, Object>> productGroupsAnalytics(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") String adAccountId, @QueryParam("start_date") @NotNull LocalDate startDate, @QueryParam("end_date") @NotNull LocalDate endDate, @QueryParam("product_group_ids") @NotNull @Size(min=1,max=100) List<String> productGroupIds, @QueryParam("columns") @NotNull List<String> columns, @QueryParam("granularity") @NotNull Granularity granularity, @QueryParam("click_window_days") @DefaultValue("30") Integer clickWindowDays, @QueryParam("engagement_window_days") @DefaultValue("30") Integer engagementWindowDays, @QueryParam("view_window_days") @DefaultValue("1") Integer viewWindowDays, @QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION") String conversionReportTime);
}
