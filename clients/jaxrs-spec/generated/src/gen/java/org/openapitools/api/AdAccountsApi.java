package org.openapitools.api;

import org.openapitools.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import org.joda.time.LocalDate;
import org.openapitools.model.Paginated;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/ad_accounts")
@Api(description = "the ad_accounts API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class AdAccountsApi {

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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adAccountAnalytics(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD")  LocalDate endDate,@QueryParam("columns") @NotNull  @ApiParam("Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned")  List<String> columns,@QueryParam("granularity") @NotNull  @ApiParam("Granularity")  Granularity granularity,@QueryParam("click_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer clickWindowDays,@QueryParam("engagement_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer engagementWindowDays,@QueryParam("view_window_days") @DefaultValue("1")  @ApiParam("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.")  Integer viewWindowDays,@QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")  @ApiParam("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")  String conversionReportTime) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "List ad accounts", notes = "Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.", response = Paginated.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Paginated.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adAccountsList(@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("include_shared_accounts") @DefaultValue("true")  @ApiParam("Include shared ad accounts")  Boolean includeSharedAccounts) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adGroupsAnalytics(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD")  LocalDate endDate,@QueryParam("ad_group_ids") @NotNull @Size(min=1,max=100)  @ApiParam("List of Ad group Ids to use to filter the results.")  List<String> adGroupIds,@QueryParam("columns") @NotNull  @ApiParam("Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned")  List<String> columns,@QueryParam("granularity") @NotNull  @ApiParam("Granularity")  Granularity granularity,@QueryParam("click_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer clickWindowDays,@QueryParam("engagement_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer engagementWindowDays,@QueryParam("view_window_days") @DefaultValue("1")  @ApiParam("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.")  Integer viewWindowDays,@QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")  @ApiParam("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")  String conversionReportTime) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adGroupsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("campaign_ids") @Size(min=1,max=100)  @ApiParam("List of Campaign Ids to use to filter the results.")  List<String> campaignIds,@QueryParam("ad_group_ids") @Size(min=1,max=100)  @ApiParam("List of Ad group Ids to use to filter the results.")  List<String> adGroupIds,@QueryParam("entity_statuses")  @ApiParam("Entity status")  List<String> entityStatuses,@QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("order")  @ApiParam("The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")  String order,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("translate_interests_to_names") @DefaultValue("false")  @ApiParam("Return interests as text names (if value is true) rather than topic IDs.")  Boolean translateInterestsToNames) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adsAnalytics(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD")  LocalDate endDate,@QueryParam("ad_ids") @NotNull @Size(min=1,max=100)  @ApiParam("List of Ad Ids to use to filter the results.")  List<String> adIds,@QueryParam("columns") @NotNull  @ApiParam("Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned")  List<String> columns,@QueryParam("granularity") @NotNull  @ApiParam("Granularity")  Granularity granularity,@QueryParam("click_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer clickWindowDays,@QueryParam("engagement_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer engagementWindowDays,@QueryParam("view_window_days") @DefaultValue("1")  @ApiParam("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.")  Integer viewWindowDays,@QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")  @ApiParam("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")  String conversionReportTime) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("campaign_ids") @Size(min=1,max=100)  @ApiParam("List of Campaign Ids to use to filter the results.")  List<String> campaignIds,@QueryParam("ad_group_ids") @Size(min=1,max=100)  @ApiParam("List of Ad group Ids to use to filter the results.")  List<String> adGroupIds,@QueryParam("ad_ids") @Size(min=1,max=100)  @ApiParam("List of Ad Ids to use to filter the results.")  List<String> adIds,@QueryParam("entity_statuses")  @ApiParam("Entity status")  List<String> entityStatuses,@QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("order")  @ApiParam("The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")  String order,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response analyticsCreateReport(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response analyticsGetReport(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("token") @NotNull  @ApiParam("Token returned from the post request creation call")  String token) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response campaignsAnalytics(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD")  LocalDate endDate,@QueryParam("campaign_ids") @NotNull @Size(min=1,max=100)  @ApiParam("List of Campaign Ids to use to filter the results.")  List<String> campaignIds,@QueryParam("columns") @NotNull  @ApiParam("Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned")  List<String> columns,@QueryParam("granularity") @NotNull  @ApiParam("Granularity")  Granularity granularity,@QueryParam("click_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer clickWindowDays,@QueryParam("engagement_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer engagementWindowDays,@QueryParam("view_window_days") @DefaultValue("1")  @ApiParam("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.")  Integer viewWindowDays,@QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")  @ApiParam("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")  String conversionReportTime) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response campaignsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("campaign_ids") @Size(min=1,max=100)  @ApiParam("List of Campaign Ids to use to filter the results.")  List<String> campaignIds,@QueryParam("entity_statuses")  @ApiParam("Entity status")  List<String> entityStatuses,@QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("order")  @ApiParam("The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")  String order,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response productGroupsAnalytics(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD")  LocalDate endDate,@QueryParam("product_group_ids") @NotNull @Size(min=1,max=100)  @ApiParam("List of Product group Ids to use to filter the results.")  List<String> productGroupIds,@QueryParam("columns") @NotNull  @ApiParam("Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned")  List<String> columns,@QueryParam("granularity") @NotNull  @ApiParam("Granularity")  Granularity granularity,@QueryParam("click_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer clickWindowDays,@QueryParam("engagement_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer engagementWindowDays,@QueryParam("view_window_days") @DefaultValue("1")  @ApiParam("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.")  Integer viewWindowDays,@QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")  @ApiParam("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")  String conversionReportTime) {
        return Response.ok().entity("magic!").build();
    }
}
