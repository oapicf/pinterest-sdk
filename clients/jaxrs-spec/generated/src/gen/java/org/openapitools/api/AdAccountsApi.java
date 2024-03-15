package org.openapitools.api;

import org.openapitools.model.AdAccount;
import org.openapitools.model.AdAccountAnalyticsResponseInner;
import org.openapitools.model.AdAccountCreateRequest;
import org.openapitools.model.AdAccountCreateSubscriptionRequest;
import org.openapitools.model.AdAccountCreateSubscriptionResponse;
import org.openapitools.model.AdAccountGetSubscriptionResponse;
import org.openapitools.model.AdAccountsCatalogsProductGroupsList200Response;
import org.openapitools.model.AdAccountsList200Response;
import org.openapitools.model.AdAccountsSubscriptionsGetList200Response;
import org.openapitools.model.AdArrayResponse;
import org.openapitools.model.AdCreateRequest;
import org.openapitools.model.AdGroupArrayResponse;
import org.openapitools.model.AdGroupAudienceSizingRequest;
import org.openapitools.model.AdGroupAudienceSizingResponse;
import org.openapitools.model.AdGroupCreateRequest;
import org.openapitools.model.AdGroupResponse;
import org.openapitools.model.AdGroupUpdateRequest;
import org.openapitools.model.AdGroupsAnalyticsResponseInner;
import org.openapitools.model.AdGroupsList200Response;
import org.openapitools.model.AdPreviewRequest;
import org.openapitools.model.AdPreviewURLResponse;
import org.openapitools.model.AdResponse;
import org.openapitools.model.AdUpdateRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.model.AdsAnalyticsResponseInner;
import org.openapitools.model.AdsAnalyticsTargetingType;
import org.openapitools.model.AdsCreditRedeemRequest;
import org.openapitools.model.AdsCreditRedeemResponse;
import org.openapitools.model.AdsCreditsDiscountsGet200Response;
import org.openapitools.model.AdsList200Response;
import org.openapitools.model.Audience;
import org.openapitools.model.AudienceCreateCustomRequest;
import org.openapitools.model.AudienceCreateRequest;
import org.openapitools.model.AudienceDefinitionResponse;
import org.openapitools.model.AudienceInsightType;
import org.openapitools.model.AudienceInsightsResponse;
import org.openapitools.model.AudienceUpdateRequest;
import org.openapitools.model.AudiencesList200Response;
import org.openapitools.model.BidFloor;
import org.openapitools.model.BidFloorRequest;
import org.openapitools.model.BillingProfilesGet200Response;
import org.openapitools.model.BulkDownloadRequest;
import org.openapitools.model.BulkDownloadResponse;
import org.openapitools.model.BulkUpsertRequest;
import org.openapitools.model.BulkUpsertResponse;
import org.openapitools.model.BulkUpsertStatusResponse;
import org.openapitools.model.CampaignCreateRequest;
import org.openapitools.model.CampaignCreateResponse;
import org.openapitools.model.CampaignResponse;
import org.openapitools.model.CampaignUpdateRequest;
import org.openapitools.model.CampaignUpdateResponse;
import org.openapitools.model.CampaignsAnalyticsResponseInner;
import org.openapitools.model.CampaignsList200Response;
import org.openapitools.model.ConversionApiResponse;
import org.openapitools.model.ConversionEventResponse;
import org.openapitools.model.ConversionEvents;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionTagCreate;
import org.openapitools.model.ConversionTagListResponse;
import org.openapitools.model.ConversionTagResponse;
import org.openapitools.model.CreateMMMReportRequest;
import org.openapitools.model.CreateMMMReportResponse;
import org.openapitools.model.CustomerList;
import org.openapitools.model.CustomerListRequest;
import org.openapitools.model.CustomerListUpdateRequest;
import org.openapitools.model.CustomerListsList200Response;
import org.openapitools.model.DetailedError;
import org.openapitools.model.Error;
import org.openapitools.model.GetMMMReportResponse;
import org.openapitools.model.Granularity;
import org.openapitools.model.KeywordUpdateBody;
import org.openapitools.model.KeywordsGet200Response;
import org.openapitools.model.KeywordsMetricsArrayResponse;
import org.openapitools.model.KeywordsRequest;
import org.openapitools.model.KeywordsResponse;
import org.openapitools.model.LeadFormResponse;
import org.openapitools.model.LeadFormTestRequest;
import org.openapitools.model.LeadFormTestResponse;
import org.openapitools.model.LeadFormsList200Response;
import org.joda.time.LocalDate;
import java.util.Map;
import org.openapitools.model.MatchType;
import org.openapitools.model.MetricsResponse;
import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLinesList200Response;
import org.openapitools.model.PageVisitConversionTagsGet200Response;
import org.openapitools.model.ProductGroupAnalyticsResponseInner;
import org.openapitools.model.ProductGroupPromotionCreateRequest;
import org.openapitools.model.ProductGroupPromotionResponse;
import org.openapitools.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.model.ProductGroupPromotionsList200Response;
import org.openapitools.model.SSIOAccountResponse;
import org.openapitools.model.SSIOCreateInsertionOrderRequest;
import org.openapitools.model.SSIOCreateInsertionOrderResponse;
import org.openapitools.model.SSIOEditInsertionOrderRequest;
import org.openapitools.model.SSIOEditInsertionOrderResponse;
import org.openapitools.model.SSIOInsertionOrderStatusResponse;
import org.openapitools.model.SsioInsertionOrdersStatusGetByAdAccount200Response;
import org.openapitools.model.SsioOrderLinesGetByAdAccount200Response;
import org.openapitools.model.TemplatesList200Response;
import org.openapitools.model.TermsOfService;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/ad_accounts")
@Api(description = "the ad_accounts API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdAccountsApi {

    @GET
    @Path("/{ad_account_id}/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad account analytics", notes = "Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.", response = AdAccountAnalyticsResponseInner.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccountAnalyticsResponseInner.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adAccountAnalytics(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")  LocalDate endDate,@QueryParam("columns") @NotNull  @ApiParam("Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned")  List<String> columns,@QueryParam("granularity") @NotNull  @ApiParam("TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly")  Granularity granularity,@QueryParam("click_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer clickWindowDays,@QueryParam("engagement_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer engagementWindowDays,@QueryParam("view_window_days") @DefaultValue("1")  @ApiParam("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.")  Integer viewWindowDays,@QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")  @ApiParam("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")  String conversionReportTime) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/targeting_analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get targeting analytics for an ad account", notes = "Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.", response = MetricsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = MetricsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adAccountTargetingAnalyticsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")  LocalDate endDate,@QueryParam("targeting_types") @NotNull @Size(min=1,max=15)  @ApiParam("Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.")  List<AdsAnalyticsTargetingType> targetingTypes,@QueryParam("columns") @NotNull  @ApiParam("Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned")  List<String> columns,@QueryParam("granularity") @NotNull  @ApiParam("TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly")  Granularity granularity,@QueryParam("click_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer clickWindowDays,@QueryParam("engagement_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer engagementWindowDays,@QueryParam("view_window_days") @DefaultValue("1")  @ApiParam("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.")  Integer viewWindowDays,@QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")  @ApiParam("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")  String conversionReportTime,@QueryParam("attribution_types")  @ApiParam("List of types of attribution for the conversion report")  ConversionReportAttributionType attributionTypes) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/product_groups/catalogs")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get catalog product groups", notes = "This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.", response = AdAccountsCatalogsProductGroupsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "product_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccountsCatalogsProductGroupsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Access Denied. This can happen if account is not yet approved to operate as Merchant on Pinterest.", response = Error.class),
        @ApiResponse(code = 404, message = "Merchant data not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adAccountsCatalogsProductGroupsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("feed_profile_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("The feed profile id whose catalog product groups we want to return.")  String feedProfileId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create ad account", notes = "Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/> You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>.", response = AdAccount.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccount.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adAccountsCreate(@Valid @NotNull AdAccountCreateRequest adAccountCreateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad account", notes = "Get an ad account", response = AdAccount.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccount.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adAccountsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "List ad accounts", notes = "Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.", response = AdAccountsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = AdAccountsList200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adAccountsList(@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("include_shared_accounts") @DefaultValue("true")  @ApiParam("Include shared ad accounts")  Boolean includeSharedAccounts) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{ad_account_id}/leads/subscriptions/{subscription_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete lead ads subscription", notes = "Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "lead_ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Subscription deleted successfully", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid input parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "You are not authorized to delete this subscription.", response = Error.class),
        @ApiResponse(code = 404, message = "Subscription not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response adAccountsSubscriptionsDelById(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@PathParam("subscription_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a subscription.") String subscriptionId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/leads/subscriptions/{subscription_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get lead ads subscription", notes = "Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = AdAccountGetSubscriptionResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "lead_ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccountGetSubscriptionResponse.class),
        @ApiResponse(code = 400, message = "Invalid input parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Can't access this subscription.", response = Error.class),
        @ApiResponse(code = 404, message = "Subscription not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response adAccountsSubscriptionsGetById(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@PathParam("subscription_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a subscription.") String subscriptionId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/leads/subscriptions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get lead ads subscriptions", notes = "Get the advertiser's list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = AdAccountsSubscriptionsGetList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "lead_ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccountsSubscriptionsGetList200Response.class),
        @ApiResponse(code = 403, message = "Can't access this subscription.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response adAccountsSubscriptionsGetList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/leads/subscriptions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create lead ads subscription", notes = "Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = AdAccountCreateSubscriptionResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "lead_ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccountCreateSubscriptionResponse.class),
        @ApiResponse(code = 400, message = "Invalid input parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Can't access this subscription.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response adAccountsSubscriptionsPost(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/ad_groups/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad group analytics", notes = "Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.", response = AdGroupsAnalyticsResponseInner.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupsAnalyticsResponseInner.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account group analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adGroupsAnalytics(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")  LocalDate endDate,@QueryParam("ad_group_ids") @NotNull @Size(min=1,max=100)  @ApiParam("List of Ad group Ids to use to filter the results.")  List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds,@QueryParam("columns") @NotNull  @ApiParam("Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned")  List<String> columns,@QueryParam("granularity") @NotNull  @ApiParam("TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly")  Granularity granularity,@QueryParam("click_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer clickWindowDays,@QueryParam("engagement_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer engagementWindowDays,@QueryParam("view_window_days") @DefaultValue("1")  @ApiParam("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.")  Integer viewWindowDays,@QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")  @ApiParam("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")  String conversionReportTime) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/ad_groups/audience_sizing")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audience sizing", notes = "Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.", response = AdGroupAudienceSizingResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupAudienceSizingResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad group audience sizing parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "No access to requested audience list or product group.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adGroupsAudienceSizing(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid AdGroupAudienceSizingRequest adGroupAudienceSizingRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/bid_floor")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get bid floors", notes = "List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.", response = BidFloor.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BidFloor.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adGroupsBidFloorGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull BidFloorRequest bidFloorRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/ad_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create ad groups", notes = "Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>.</p> <strong>Note:</strong> - 'bid_in_micro_currency' and 'budget_in_micro_currency' should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.", response = AdGroupArrayResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupArrayResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adGroupsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull List<AdGroupCreateRequest> adGroupCreateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/ad_groups/{ad_group_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad group", notes = "Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.", response = AdGroupResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adGroupsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@PathParam("ad_group_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad group.") String adGroupId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/ad_groups")
    @Produces({ "application/json" })
    @ApiOperation(value = "List ad groups", notes = "List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.", response = AdGroupsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account group parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adGroupsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("campaign_ids") @Size(min=1,max=100)  @ApiParam("List of Campaign Ids to use to filter the results.")  List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,@QueryParam("ad_group_ids") @Size(min=1,max=100)  @ApiParam("List of Ad group Ids to use to filter the results.")  List<@Pattern(regexp = "^\\d+$")String> adGroupIds,@QueryParam("entity_statuses")  @ApiParam("Entity status")  List<String> entityStatuses,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("order")  @ApiParam("The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")  String order,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("translate_interests_to_names") @DefaultValue("false")  @ApiParam("Return interests as text names (if value is true) rather than topic IDs.")  Boolean translateInterestsToNames) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/ad_groups/targeting_analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get targeting analytics for ad groups", notes = "Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.", response = MetricsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = MetricsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adGroupsTargetingAnalyticsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("ad_group_ids") @NotNull @Size(min=1,max=100)  @ApiParam("List of Ad group Ids to use to filter the results.")  List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds,@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")  LocalDate endDate,@QueryParam("targeting_types") @NotNull @Size(min=1,max=15)  @ApiParam("Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.")  List<AdsAnalyticsTargetingType> targetingTypes,@QueryParam("columns") @NotNull  @ApiParam("Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned")  List<String> columns,@QueryParam("granularity") @NotNull  @ApiParam("TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly")  Granularity granularity,@QueryParam("click_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer clickWindowDays,@QueryParam("engagement_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer engagementWindowDays,@QueryParam("view_window_days") @DefaultValue("1")  @ApiParam("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.")  Integer viewWindowDays,@QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")  @ApiParam("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")  String conversionReportTime,@QueryParam("attribution_types")  @ApiParam("List of types of attribution for the conversion report")  ConversionReportAttributionType attributionTypes) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{ad_account_id}/ad_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update ad groups", notes = "Update multiple existing ad groups.", response = AdGroupArrayResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupArrayResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adGroupsUpdate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull List<AdGroupUpdateRequest> adGroupUpdateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/ad_previews")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create ad preview with pin or image", notes = "Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.", response = AdPreviewURLResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful ad preview creation.", response = AdPreviewURLResponse.class),
        @ApiResponse(code = 400, message = "Invalid Pin parameters response", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adPreviewsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull AdPreviewRequest adPreviewRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/ads/targeting_analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get targeting analytics for ads", notes = "Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.", response = MetricsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = MetricsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adTargetingAnalyticsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("ad_ids") @NotNull @Size(min=1,max=100)  @ApiParam("List of Ad Ids to use to filter the results.")  List<@Pattern(regexp = "^\\d+$")String> adIds,@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")  LocalDate endDate,@QueryParam("targeting_types") @NotNull @Size(min=1,max=15)  @ApiParam("Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.")  List<AdsAnalyticsTargetingType> targetingTypes,@QueryParam("columns") @NotNull  @ApiParam("Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned")  List<String> columns,@QueryParam("granularity") @NotNull  @ApiParam("TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly")  Granularity granularity,@QueryParam("click_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer clickWindowDays,@QueryParam("engagement_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer engagementWindowDays,@QueryParam("view_window_days") @DefaultValue("1")  @ApiParam("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.")  Integer viewWindowDays,@QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")  @ApiParam("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")  String conversionReportTime,@QueryParam("attribution_types")  @ApiParam("List of types of attribution for the conversion report")  ConversionReportAttributionType attributionTypes) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/ads/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad analytics", notes = "Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.", response = AdsAnalyticsResponseInner.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdsAnalyticsResponseInner.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adsAnalytics(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")  LocalDate endDate,@QueryParam("ad_ids") @NotNull @Size(min=1,max=100)  @ApiParam("List of Ad Ids to use to filter the results.")  List<@Pattern(regexp = "^\\d+$")String> adIds,@QueryParam("columns") @NotNull  @ApiParam("Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned")  List<String> columns,@QueryParam("granularity") @NotNull  @ApiParam("TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly")  Granularity granularity,@QueryParam("click_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer clickWindowDays,@QueryParam("engagement_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer engagementWindowDays,@QueryParam("view_window_days") @DefaultValue("1")  @ApiParam("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.")  Integer viewWindowDays,@QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")  @ApiParam("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")  String conversionReportTime) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/ads")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create ads", notes = "Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.", response = AdArrayResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdArrayResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull List<AdCreateRequest> adCreateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/ads_credit/redeem")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Redeem ad credits", notes = "Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = AdsCreditRedeemResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc."),
            @AuthorizationScope(scope = "billing:write", description = "Create, update, or delete billing data, billing profiles, etc.") })
         }, tags={ "billing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully redeemed ad credits.", response = AdsCreditRedeemResponse.class),
        @ApiResponse(code = 400, message = "Error thrown when unable to redeem offer code.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adsCreditRedeem(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull AdsCreditRedeemRequest adsCreditRedeemRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/ads_credit/discounts")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ads credit discounts", notes = "Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = AdsCreditsDiscountsGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc."),
            @AuthorizationScope(scope = "billing:read", description = "See all of your billing data, billing profile, etc.") })
         }, tags={ "billing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdsCreditsDiscountsGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response adsCreditsDiscountsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/ads/{ad_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad", notes = "Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.", response = AdResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@PathParam("ad_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad.") String adId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/ads")
    @Produces({ "application/json" })
    @ApiOperation(value = "List ads", notes = "List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.", response = AdsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("campaign_ids") @Size(min=1,max=100)  @ApiParam("List of Campaign Ids to use to filter the results.")  List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,@QueryParam("ad_group_ids") @Size(min=1,max=100)  @ApiParam("List of Ad group Ids to use to filter the results.")  List<@Pattern(regexp = "^\\d+$")String> adGroupIds,@QueryParam("ad_ids") @Size(min=1,max=100)  @ApiParam("List of Ad Ids to use to filter the results.")  List<@Pattern(regexp = "^\\d+$")String> adIds,@QueryParam("entity_statuses")  @ApiParam("Entity status")  List<String> entityStatuses,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("order")  @ApiParam("The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")  String order,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{ad_account_id}/ads")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update ads", notes = "Update multiple existing ads", response = AdArrayResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdArrayResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adsUpdate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull List<AdUpdateRequest> adUpdateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/mmm_reports")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a request for a Marketing Mix Modeling (MMM) report", notes = "This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release.", response = CreateMMMReportResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CreateMMMReportResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics mmm parameters", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response analyticsCreateMmmReport(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull CreateMMMReportRequest createMMMReportRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/reports")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create async request for an account analytics report", notes = "This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.", response = AdsAnalyticsCreateAsyncResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdsAnalyticsCreateAsyncResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response analyticsCreateReport(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/templates/{template_id}/reports")
    @Produces({ "application/json" })
    @ApiOperation(value = "Create async request for an analytics report using a template", notes = "This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.", response = AdsAnalyticsCreateAsyncResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdsAnalyticsCreateAsyncResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics template parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response analyticsCreateTemplateReport(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@PathParam("template_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of a template.") String templateId,@QueryParam("start_date")  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.")  LocalDate startDate,@QueryParam("end_date")  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.")  LocalDate endDate,@QueryParam("granularity")  @ApiParam("TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly")  Granularity granularity) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/mmm_reports")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get advertiser Marketing Mix Modeling (MMM) report.", notes = "Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.", response = GetMMMReportResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = GetMMMReportResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response analyticsGetMmmReport(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("token") @NotNull  @ApiParam("Token returned from the post request creation call")  String token) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/reports")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get the account analytics report created by the async call", notes = "This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = AdsAnalyticsGetAsyncResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdsAnalyticsGetAsyncResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response analyticsGetReport(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("token") @NotNull  @ApiParam("Token returned from the post request creation call")  String token) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/audience_insights")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audience insights", notes = "Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.", response = AudienceInsightsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "audience_insights" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AudienceInsightsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response audienceInsightsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("audience_insight_type") @NotNull @DefaultValue("YOUR_TOTAL_AUDIENCE")  @ApiParam("Type of audience insights.")  AudienceInsightType audienceInsightType) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/insights/audiences")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audience insights scope and type", notes = "Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.", response = AudienceDefinitionResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "audience_insights" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AudienceDefinitionResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response audienceInsightsScopeAndTypeGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/audiences")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create audience", notes = "Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.", response = Audience.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "audiences" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Audience.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response audiencesCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull AudienceCreateRequest audienceCreateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/audiences/custom")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create custom audience", notes = "Create a custom audience and find the audiences you want your ads to reach.", response = Audience.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "audiences" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Audience.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response audiencesCreateCustom(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull AudienceCreateCustomRequest audienceCreateCustomRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/audiences/{audience_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audience", notes = "Get a specific audience given the audience ID.", response = Audience.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "audiences" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Audience.class),
        @ApiResponse(code = 404, message = "Audience not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response audiencesGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@PathParam("audience_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an audience") String audienceId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/audiences")
    @Produces({ "application/json" })
    @ApiOperation(value = "List audiences", notes = "Get list of audiences for the ad account.", response = AudiencesList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "audiences" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AudiencesList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account audience parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response audiencesList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("order")  @ApiParam("The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.")  String order,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("ownership_type") @DefaultValue("OWNED")  @ApiParam("&lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type.")  String ownershipType) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{ad_account_id}/audiences/{audience_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update audience", notes = "Update (edit or remove) an existing targeting audience.", response = Audience.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "audiences" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Audience.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response audiencesUpdate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@PathParam("audience_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an audience") String audienceId,@Valid AudienceUpdateRequest audienceUpdateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/billing_profiles")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get billing profiles", notes = "Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = BillingProfilesGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc."),
            @AuthorizationScope(scope = "billing:read", description = "See all of your billing data, billing profile, etc.") })
         }, tags={ "billing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BillingProfilesGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response billingProfilesGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("is_active") @NotNull  @ApiParam("Return active billing profiles, if false return all billing profiles.")  Boolean isActive,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/bulk/download")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get advertiser entities in bulk", notes = "Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.", response = BulkDownloadResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "bulk" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BulkDownloadResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response bulkDownloadCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull BulkDownloadRequest bulkDownloadRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/bulk/{bulk_request_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Download advertiser entities in bulk", notes = "Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).", response = BulkUpsertStatusResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "bulk" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BulkUpsertStatusResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response bulkRequestGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@PathParam("bulk_request_id") @ApiParam("Unique identifier of a bulk upsert request.") String bulkRequestId,@QueryParam("include_details") @DefaultValue("false")  @ApiParam("if set to True then attach the errors/details to all the requests")  Boolean includeDetails) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/bulk/upsert")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create/update ad entities in bulk", notes = "Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.", response = BulkUpsertResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "bulk" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BulkUpsertResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response bulkUpsertCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull BulkUpsertRequest bulkUpsertRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/campaigns/targeting_analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get targeting analytics for campaigns", notes = "Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.", response = MetricsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "campaigns" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = MetricsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response campaignTargetingAnalyticsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("campaign_ids") @NotNull @Size(min=1,max=100)  @ApiParam("List of Campaign Ids to use to filter the results.")  List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")  LocalDate endDate,@QueryParam("targeting_types") @NotNull @Size(min=1,max=15)  @ApiParam("Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.")  List<AdsAnalyticsTargetingType> targetingTypes,@QueryParam("columns") @NotNull  @ApiParam("Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned")  List<String> columns,@QueryParam("granularity") @NotNull  @ApiParam("TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly")  Granularity granularity,@QueryParam("click_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer clickWindowDays,@QueryParam("engagement_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer engagementWindowDays,@QueryParam("view_window_days") @DefaultValue("1")  @ApiParam("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.")  Integer viewWindowDays,@QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")  @ApiParam("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")  String conversionReportTime,@QueryParam("attribution_types")  @ApiParam("List of types of attribution for the conversion report")  ConversionReportAttributionType attributionTypes) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/campaigns/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get campaign analytics", notes = "Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.", response = CampaignsAnalyticsResponseInner.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "campaigns" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CampaignsAnalyticsResponseInner.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account campaign analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response campaignsAnalytics(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")  LocalDate endDate,@QueryParam("campaign_ids") @NotNull @Size(min=1,max=100)  @ApiParam("List of Campaign Ids to use to filter the results.")  List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,@QueryParam("columns") @NotNull  @ApiParam("Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned")  List<String> columns,@QueryParam("granularity") @NotNull  @ApiParam("TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly")  Granularity granularity,@QueryParam("click_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer clickWindowDays,@QueryParam("engagement_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer engagementWindowDays,@QueryParam("view_window_days") @DefaultValue("1")  @ApiParam("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.")  Integer viewWindowDays,@QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")  @ApiParam("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")  String conversionReportTime) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/campaigns")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create campaigns", notes = "Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>", response = CampaignCreateResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "campaigns" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = CampaignCreateResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response campaignsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull List<@Valid CampaignCreateRequest> campaignCreateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/campaigns/{campaign_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get campaign", notes = "Get a specific campaign given the campaign ID.", response = CampaignResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "campaigns" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CampaignResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response campaignsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@PathParam("campaign_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Campaign ID, must be associated with the ad account ID provided in the path.") String campaignId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/campaigns")
    @Produces({ "application/json" })
    @ApiOperation(value = "List campaigns", notes = "Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = CampaignsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "campaigns" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CampaignsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account campaign parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response campaignsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("campaign_ids") @Size(min=1,max=100)  @ApiParam("List of Campaign Ids to use to filter the results.")  List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,@QueryParam("entity_statuses")  @ApiParam("Entity status")  List<String> entityStatuses,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("order")  @ApiParam("The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")  String order,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{ad_account_id}/campaigns")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update campaigns", notes = "Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/> - <p>The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>", response = CampaignUpdateResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "campaigns" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = CampaignUpdateResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response campaignsUpdate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull List<@Valid CampaignUpdateRequest> campaignUpdateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/conversion_tags")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create conversion tag", notes = "Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/enhanced-match/\">Enhanced match</a>", response = ConversionTagResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "conversion_tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ConversionTagResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response conversionTagsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull ConversionTagCreate conversionTagCreate) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/conversion_tags/{conversion_tag_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get conversion tag", notes = "Get information about an existing conversion tag.", response = ConversionTagResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "conversion_tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ConversionTagResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response conversionTagsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@PathParam("conversion_tag_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Id of the conversion tag.") String conversionTagId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/conversion_tags")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get conversion tags", notes = "List conversion tags associated with an ad account.", response = ConversionTagListResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "conversion_tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ConversionTagListResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response conversionTagsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("filter_deleted") @DefaultValue("false")  @ApiParam("Filter out deleted tags.")  Boolean filterDeleted) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/keywords/metrics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get country's keyword metrics", notes = "See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).", response = KeywordsMetricsArrayResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "keywords" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = KeywordsMetricsArrayResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response countryKeywordsMetricsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("country_code") @NotNull  @ApiParam("Two letter country code (ISO 3166-1 alpha-2)")  String countryCode,@QueryParam("keywords") @NotNull @Size(min=1,max=2000)  @ApiParam("Comma-separated keywords")  List<String> keywords) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/customer_lists")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create customer lists", notes = "<p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>", response = CustomerList.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "customer_lists" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerList.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response customerListsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull CustomerListRequest customerListRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/customer_lists/{customer_list_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get customer list", notes = "Gets a specific customer list given the customer list ID.", response = CustomerList.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "customer_lists" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerList.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response customerListsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@PathParam("customer_list_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of a customer list") String customerListId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/customer_lists")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get customer lists", notes = "<p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>", response = CustomerListsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "customer_lists" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerListsList200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response customerListsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("order")  @ApiParam("The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")  String order,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{ad_account_id}/customer_lists/{customer_list_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update customer list", notes = "<p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>", response = CustomerList.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "customer_lists" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerList.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response customerListsUpdate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@PathParam("customer_list_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of a customer list") String customerListId,@Valid @NotNull CustomerListUpdateRequest customerListUpdateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/events")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Send conversions", notes = "The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/conversions/conversions/\">Conversions Guide</a> for more details. - The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)", response = ConversionApiResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") }),
        
        @Authorization(value = "conversion_token")
         }, tags={ "conversion_events" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ConversionApiResponse.class),
        @ApiResponse(code = 400, message = "The request was invalid.", response = Error.class),
        @ApiResponse(code = 401, message = "Not authorized to send conversion events", response = Error.class),
        @ApiResponse(code = 403, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 422, message = "Not all events were successfully processed.", response = DetailedError.class),
        @ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window.", response = Error.class),
        @ApiResponse(code = 503, message = "The endpoint has been ramped down and is currently not accepting any traffic.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected errors", response = Error.class)
    })
    public Response eventsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull ConversionEvents conversionEvents,@QueryParam("test")  @ApiParam("Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.")  Boolean test) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/keywords")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create keywords", notes = "<p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/redoc/#tag/Rate-Limits\">WRITE</a>.</p>", response = KeywordsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "keywords" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = KeywordsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response keywordsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull KeywordsRequest keywordsRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/keywords")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get keywords", notes = "<p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>", response = KeywordsGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "keywords" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = KeywordsGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response keywordsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("campaign_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Campaign Id to use to filter the results.")  String campaignId,@QueryParam("ad_group_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Ad group Id.")  String adGroupId,@QueryParam("match_types") @Size(min=1,max=5)  @ApiParam("Keyword &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/ads/targeting/#Match%20type%20and%20targeting%20level\&quot;&gt;match type&lt;/a&gt;")  List<MatchType> matchTypes,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{ad_account_id}/keywords")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update keywords", notes = "<p>Update one or more keywords' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity's keywords list.</p>", response = KeywordsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "keywords" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = KeywordsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response keywordsUpdate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull KeywordUpdateBody keywordUpdateBody) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/lead_forms/{lead_form_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get lead form by id", notes = "Gets a lead form given it's ID. It must also be associated with the provided ad account ID. Retrieving an advertiser's lead form will only contain results if you're a part of the Lead ads beta. If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = LeadFormResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "lead_forms" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadFormResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account lead forms parameters.", response = Error.class),
        @ApiResponse(code = 404, message = "The lead form ID for the given ad account ID does not exist.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response leadFormGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@PathParam("lead_form_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a lead form.") String leadFormId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/lead_forms/{lead_form_id}/test")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create lead form test data", notes = "Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = LeadFormTestResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "lead_forms" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadFormTestResponse.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 404, message = "Lead not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response leadFormTestCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@PathParam("lead_form_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a lead form.") String leadFormId,@Valid @NotNull LeadFormTestRequest leadFormTestRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/lead_forms")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get lead forms", notes = "Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser's list of lead forms will only contain results if you're a part of the Lead ads beta.  If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = LeadFormsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "lead_forms" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadFormsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account lead forms parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response leadFormsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("order")  @ApiParam("The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")  String order,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/conversion_tags/ocpm_eligible")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Ocpm eligible conversion tags", notes = "Get Ocpm eligible conversion tag events for an ad account.", response = List.class, responseContainer = "Map", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "conversion_tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ConversionEventResponse.class, responseContainer = "Map"),
        @ApiResponse(code = 200, message = "Unexpected errors", response = Error.class)
    })
    public Response ocpmEligibleConversionTagsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/order_lines/{order_line_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get order line", notes = "Get a specific existing order line associated with an ad account.", response = OrderLine.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "order_lines" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = OrderLine.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response orderLinesGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@PathParam("order_line_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an order line.") String orderLineId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/order_lines")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get order lines", notes = "List existing order lines associated with an ad account.", response = OrderLinesList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "order_lines" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = OrderLinesList200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response orderLinesList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("order")  @ApiParam("The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")  String order,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/conversion_tags/page_visit")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get page visit conversion tags", notes = "Get all page visit conversion tag events for an ad account.", response = PageVisitConversionTagsGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "conversion_tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PageVisitConversionTagsGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response pageVisitConversionTagsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("order")  @ApiParam("The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")  String order,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/product_group_promotions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create product group promotions", notes = "Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')", response = ProductGroupPromotionResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "product_group_promotions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ProductGroupPromotionResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response productGroupPromotionsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/product_group_promotions/{product_group_promotion_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a product group promotion by id", notes = "Get a product group promotion by id", response = ProductGroupPromotionResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "product_group_promotions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ProductGroupPromotionResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response productGroupPromotionsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@PathParam("product_group_promotion_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of a product group promotion") String productGroupPromotionId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/product_group_promotions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get product group promotions", notes = "List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.", response = ProductGroupPromotionsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "product_group_promotions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ProductGroupPromotionsList200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response productGroupPromotionsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("product_group_promotion_ids") @Size(min=1,max=100)  @ApiParam("List of Product group promotion Ids.")  List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds,@QueryParam("entity_statuses")  @ApiParam("Entity status")  List<String> entityStatuses,@QueryParam("ad_group_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Ad group Id.")  String adGroupId,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("order")  @ApiParam("The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")  String order,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{ad_account_id}/product_group_promotions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update product group promotions", notes = "Update multiple existing Product Group Promotions (by product_group_id)", response = ProductGroupPromotionResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "product_group_promotions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ProductGroupPromotionResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response productGroupPromotionsUpdate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/product_groups/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get product group analytics", notes = "Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.", response = ProductGroupAnalyticsResponseInner.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "product_group_promotions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ProductGroupAnalyticsResponseInner.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response productGroupsAnalytics(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")  LocalDate endDate,@QueryParam("product_group_ids") @NotNull @Size(min=1,max=100)  @ApiParam("List of Product group Ids to use to filter the results.")  List<@Pattern(regexp = "^\\d+$")String> productGroupIds,@QueryParam("columns") @NotNull  @ApiParam("Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned")  List<String> columns,@QueryParam("granularity") @NotNull  @ApiParam("TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly")  Granularity granularity,@QueryParam("click_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer clickWindowDays,@QueryParam("engagement_window_days") @DefaultValue("30")  @ApiParam("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.")  Integer engagementWindowDays,@QueryParam("view_window_days") @DefaultValue("1")  @ApiParam("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.")  Integer viewWindowDays,@QueryParam("conversion_report_time") @DefaultValue("TIME_OF_AD_ACTION")  @ApiParam("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")  String conversionReportTime) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{ad_account_id}/sandbox")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete ads data for ad account in API Sandbox", notes = "Delete an ad account and all the ads data associated with that account.  A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).  Go to https://developers.pinterest.com/docs/dev-tools/sandbox/ for more information.", response = String.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Invalid ad account id.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response sandboxDelete(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/ssio/accounts")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Salesforce account details including bill-to information.", notes = "Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.", response = SSIOAccountResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "billing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SSIOAccountResponse.class),
        @ApiResponse(code = 400, message = "Invalid request parameter.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response ssioAccountsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{ad_account_id}/ssio/insertion_orders")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create insertion order through SSIO.", notes = "Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.", response = SSIOCreateInsertionOrderResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "billing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SSIOCreateInsertionOrderResponse.class),
        @ApiResponse(code = 400, message = "Invalid request.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response ssioInsertionOrderCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{ad_account_id}/ssio/insertion_orders")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Edit insertion order through SSIO.", notes = "Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.", response = SSIOEditInsertionOrderResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "billing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SSIOEditInsertionOrderResponse.class),
        @ApiResponse(code = 400, message = "Invalid request.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response ssioInsertionOrderEdit(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@Valid @NotNull SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/ssio/insertion_orders/status")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get insertion order status by ad account id.", notes = "Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.", response = SsioInsertionOrdersStatusGetByAdAccount200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "billing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SsioInsertionOrdersStatusGetByAdAccount200Response.class),
        @ApiResponse(code = 400, message = "Invalid request parameter.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response ssioInsertionOrdersStatusGetByAdAccount(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get insertion order status by pin order id.", notes = "Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.", response = SSIOInsertionOrderStatusResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "billing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SSIOInsertionOrderStatusResponse.class),
        @ApiResponse(code = 400, message = "Invalid request parameter.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response ssioInsertionOrdersStatusGetByPinOrderId(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@PathParam("pin_order_id") @ApiParam("The pin order id associated with the ssio insertion order") String pinOrderId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/ssio/order_lines")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Salesforce order lines by ad account id.", notes = "Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.", response = SsioOrderLinesGetByAdAccount200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "billing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SsioOrderLinesGetByAdAccount200Response.class),
        @ApiResponse(code = 400, message = "Invalid request parameter.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response ssioOrderLinesGetByAdAccount(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("pin_order_id")  @ApiParam("The pin order id associated with the ssio insertino order")  String pinOrderId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/templates")
    @Produces({ "application/json" })
    @ApiOperation(value = "List templates", notes = "Gets all Templates associated with an ad account ID.", response = TemplatesList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = TemplatesList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account template parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response templatesList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("order")  @ApiParam("The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")  String order,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{ad_account_id}/terms_of_service")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get terms of service", notes = "Get the text of the terms of service and see whether the advertiser has accepted the terms of service.", response = TermsOfService.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "terms_of_service" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = TermsOfService.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response termsOfServiceGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an ad account.") String adAccountId,@QueryParam("include_html") @DefaultValue("false")  @ApiParam("Return HTML in TOS text.")  Boolean includeHtml,@QueryParam("tos_type")  @ApiParam("Request type.")  String tosType) {
        return Response.ok().entity("magic!").build();
    }
}
