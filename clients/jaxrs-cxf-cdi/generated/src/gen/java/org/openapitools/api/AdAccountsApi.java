package org.openapitools.api;

import org.openapitools.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import org.joda.time.LocalDate;
import org.openapitools.model.Paginated;
import org.openapitools.api.AdAccountsApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/ad_accounts")
@RequestScoped

@Api(description = "the ad_accounts API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-05-07T06:41:45.100230Z[Etc/UTC]")

public class AdAccountsApi  {

  @Context SecurityContext securityContext;

  @Inject AdAccountsApiService delegate;


    @GET
    @Path("/{ad_account_id}/analytics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad account analytics", notes = "Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Map.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adAccountAnalytics( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull @ApiParam(value = "Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true)  @QueryParam("columns") List<String> columns,  @NotNull @ApiParam(value = "Granularity",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH")  @QueryParam("granularity") Granularity granularity, @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("click_window_days") Integer clickWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("engagement_window_days") Integer engagementWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="1, 7, 30, 60", defaultValue="1") @DefaultValue("1")  @QueryParam("view_window_days") Integer viewWindowDays, @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION")  @QueryParam("conversion_report_time") String conversionReportTime) {
        return delegate.adAccountAnalytics(adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List ad accounts", notes = "Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.", response = Paginated.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Paginated.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adAccountsList(@ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(100)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "Include shared ad accounts", defaultValue="true") @DefaultValue("true")  @QueryParam("include_shared_accounts") Boolean includeSharedAccounts) {
        return delegate.adAccountsList(bookmark, pageSize, includeSharedAccounts, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/ad_groups/analytics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad group analytics", notes = "Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Map.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account group analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adGroupsAnalytics( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull  @Size(min=1,max=100)@ApiParam(value = "List of Ad group Ids to use to filter the results.",required=true)  @QueryParam("ad_group_ids") List<String> adGroupIds,  @NotNull @ApiParam(value = "Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true)  @QueryParam("columns") List<String> columns,  @NotNull @ApiParam(value = "Granularity",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH")  @QueryParam("granularity") Granularity granularity, @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("click_window_days") Integer clickWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("engagement_window_days") Integer engagementWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="1, 7, 30, 60", defaultValue="1") @DefaultValue("1")  @QueryParam("view_window_days") Integer viewWindowDays, @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION")  @QueryParam("conversion_report_time") String conversionReportTime) {
        return delegate.adGroupsAnalytics(adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/ad_groups")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List ad groups", notes = "Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Paginated.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Paginated.class),
        @ApiResponse(code = 400, message = "Invalid ad account group parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adGroupsList( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Size(min=1,max=100)@ApiParam(value = "List of Campaign Ids to use to filter the results.")  @QueryParam("campaign_ids") List<String> campaignIds,  @Size(min=1,max=100)@ApiParam(value = "List of Ad group Ids to use to filter the results.")  @QueryParam("ad_group_ids") List<String> adGroupIds, @ApiParam(value = "Entity status")  @QueryParam("entity_statuses") List<String> entityStatuses,  @Min(1) @Max(100)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING")  @QueryParam("order") String order, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark, @ApiParam(value = "Return interests as text names (if value is true) rather than topic IDs.", defaultValue="false") @DefaultValue("false")  @QueryParam("translate_interests_to_names") Boolean translateInterestsToNames) {
        return delegate.adGroupsList(adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/ads/analytics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad analytics", notes = "Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Map.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adsAnalytics( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull  @Size(min=1,max=100)@ApiParam(value = "List of Ad Ids to use to filter the results.",required=true)  @QueryParam("ad_ids") List<String> adIds,  @NotNull @ApiParam(value = "Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true)  @QueryParam("columns") List<String> columns,  @NotNull @ApiParam(value = "Granularity",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH")  @QueryParam("granularity") Granularity granularity, @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("click_window_days") Integer clickWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("engagement_window_days") Integer engagementWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="1, 7, 30, 60", defaultValue="1") @DefaultValue("1")  @QueryParam("view_window_days") Integer viewWindowDays, @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION")  @QueryParam("conversion_report_time") String conversionReportTime) {
        return delegate.adsAnalytics(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/ads")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List ads", notes = "Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Paginated.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Paginated.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adsList( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Size(min=1,max=100)@ApiParam(value = "List of Campaign Ids to use to filter the results.")  @QueryParam("campaign_ids") List<String> campaignIds,  @Size(min=1,max=100)@ApiParam(value = "List of Ad group Ids to use to filter the results.")  @QueryParam("ad_group_ids") List<String> adGroupIds,  @Size(min=1,max=100)@ApiParam(value = "List of Ad Ids to use to filter the results.")  @QueryParam("ad_ids") List<String> adIds, @ApiParam(value = "Entity status")  @QueryParam("entity_statuses") List<String> entityStatuses,  @Min(1) @Max(100)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING")  @QueryParam("order") String order, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark) {
        return delegate.adsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/reports")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create async request for an account analytics report", notes = "This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = AdsAnalyticsCreateAsyncResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdsAnalyticsCreateAsyncResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response analyticsCreateReport( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "" ,required=true) AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest) {
        return delegate.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/reports")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get the account analytics report created by the async call", notes = "This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = AdsAnalyticsGetAsyncResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdsAnalyticsGetAsyncResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response analyticsGetReport( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Token returned from the post request creation call",required=true)  @QueryParam("token") String token) {
        return delegate.analyticsGetReport(adAccountId, token, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/campaigns/analytics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get campaign analytics", notes = "Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Map.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account campaign analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response campaignsAnalytics( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull  @Size(min=1,max=100)@ApiParam(value = "List of Campaign Ids to use to filter the results.",required=true)  @QueryParam("campaign_ids") List<String> campaignIds,  @NotNull @ApiParam(value = "Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true)  @QueryParam("columns") List<String> columns,  @NotNull @ApiParam(value = "Granularity",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH")  @QueryParam("granularity") Granularity granularity, @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("click_window_days") Integer clickWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("engagement_window_days") Integer engagementWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="1, 7, 30, 60", defaultValue="1") @DefaultValue("1")  @QueryParam("view_window_days") Integer viewWindowDays, @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION")  @QueryParam("conversion_report_time") String conversionReportTime) {
        return delegate.campaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/campaigns")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List campaigns", notes = "Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Paginated.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Paginated.class),
        @ApiResponse(code = 400, message = "Invalid ad account campaign parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response campaignsList( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Size(min=1,max=100)@ApiParam(value = "List of Campaign Ids to use to filter the results.")  @QueryParam("campaign_ids") List<String> campaignIds, @ApiParam(value = "Entity status")  @QueryParam("entity_statuses") List<String> entityStatuses,  @Min(1) @Max(100)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING")  @QueryParam("order") String order, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark) {
        return delegate.campaignsList(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/product_groups/analytics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get product group analytics", notes = "Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = Map.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response productGroupsAnalytics( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull  @Size(min=1,max=100)@ApiParam(value = "List of Product group Ids to use to filter the results.",required=true)  @QueryParam("product_group_ids") List<String> productGroupIds,  @NotNull @ApiParam(value = "Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true)  @QueryParam("columns") List<String> columns,  @NotNull @ApiParam(value = "Granularity",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH")  @QueryParam("granularity") Granularity granularity, @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("click_window_days") Integer clickWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="1, 7, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("engagement_window_days") Integer engagementWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="1, 7, 30, 60", defaultValue="1") @DefaultValue("1")  @QueryParam("view_window_days") Integer viewWindowDays, @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION")  @QueryParam("conversion_report_time") String conversionReportTime) {
        return delegate.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, securityContext);
    }
}
