package org.openapitools.api;

import org.openapitools.model.AdAccount;
import org.openapitools.model.AdAccountAnalyticsResponseInner;
import org.openapitools.model.AdAccountCreate;
import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response;
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
import org.openapitools.model.AdPinAnalytics;
import org.openapitools.model.AdPreviewRequest;
import org.openapitools.model.AdPreviewURLResponse;
import org.openapitools.model.AdResponse;
import org.openapitools.model.AdUpdateRequest;
import org.openapitools.model.AdsAnalyticsAdGroupTargetingType;
import org.openapitools.model.AdsAnalyticsAdTargetingType;
import org.openapitools.model.AdsAnalyticsCampaignTargetingType;
import org.openapitools.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.model.AdsAnalyticsResponseInner;
import org.openapitools.model.AdsAnalyticsTargetingType;
import org.openapitools.model.AdsCreditRedeemRequest;
import org.openapitools.model.AdsCreditRedeemResponse;
import org.openapitools.model.AdsCreditsDiscountsGet200Response;
import org.openapitools.model.AdsList200Response;
import org.openapitools.model.AdvertiserDefinedEventsResponse;
import org.openapitools.model.Audience;
import org.openapitools.model.AudienceAccountType;
import org.openapitools.model.AudienceCreateRequest;
import org.openapitools.model.AudienceDefinitionResponse;
import org.openapitools.model.AudienceInsightType;
import org.openapitools.model.AudienceInsightsResponse;
import org.openapitools.model.AudienceUpdateRequest;
import org.openapitools.model.AudiencesList200Response;
import org.openapitools.model.BidFloor;
import org.openapitools.model.BidFloorRequest;
import org.openapitools.model.BillingInvoiceDownloadResponse;
import org.openapitools.model.BillingInvoicesGet200Response;
import org.openapitools.model.BillingProfilesGet200Response;
import org.openapitools.model.BulkDownloadRequest;
import org.openapitools.model.BulkDownloadResponse;
import org.openapitools.model.BulkUpsertRequest;
import org.openapitools.model.BulkUpsertResponse;
import org.openapitools.model.BulkUpsertStatusResponse;
import org.openapitools.model.BusinessSharedAudience;
import org.openapitools.model.BusinessSharedAudienceResponse;
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
import org.openapitools.model.ConversionMSOTEvents;
import org.openapitools.model.ConversionProductReportRequest;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionTag;
import org.openapitools.model.ConversionTagCreate;
import org.openapitools.model.ConversionTagsList200Response;
import org.openapitools.model.CreateMMMReportRequest;
import org.openapitools.model.CreateMMMReportResponse;
import org.openapitools.model.CustomerList;
import org.openapitools.model.CustomerListRequest;
import org.openapitools.model.CustomerListUpdateRequest;
import org.openapitools.model.CustomerListUploadCreateRequest;
import org.openapitools.model.CustomerListUploadCreateResponse;
import org.openapitools.model.CustomerListUploadResponse;
import org.openapitools.model.CustomerListsList200Response;
import org.openapitools.model.DetailedError;
import org.openapitools.model.Error;
import org.openapitools.model.EventQualityScore;
import org.openapitools.model.GetMMMReportResponse;
import org.openapitools.model.Granularity;
import org.openapitools.model.IngestionSourceOptions;
import org.openapitools.model.KeywordUpdateBody;
import org.openapitools.model.KeywordsGet200Response;
import org.openapitools.model.KeywordsMetricsArrayResponse;
import org.openapitools.model.KeywordsRequest;
import org.openapitools.model.KeywordsResponse;
import org.openapitools.model.LabelCreateRequest;
import org.openapitools.model.LabelUpdateRequest;
import org.openapitools.model.LabelsList200Response;
import org.openapitools.model.LabelsResponse;
import org.openapitools.model.LeadFormArrayResponse;
import org.openapitools.model.LeadFormCreateRequest;
import org.openapitools.model.LeadFormResponse;
import org.openapitools.model.LeadFormTestRequest;
import org.openapitools.model.LeadFormTestResponse;
import org.openapitools.model.LeadFormUpdateRequest;
import org.openapitools.model.LeadFormsList200Response;
import org.openapitools.model.LeadSubscription;
import org.openapitools.model.LeadSubscriptionPostParamsCreate;
import org.openapitools.model.LeadsExportCreateRequest;
import org.openapitools.model.LeadsExportCreateResponse;
import org.openapitools.model.LeadsExportResponseData;
import org.joda.time.LocalDate;
import org.openapitools.model.LookbackPeriodOptions;
import java.util.Map;
import org.openapitools.model.MatchType;
import org.openapitools.model.MetricsResponse;
import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLinesList200Response;
import org.openapitools.model.PageVisitConversionTagsGet200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.ProductGroupAnalyticsResponseInner;
import org.openapitools.model.ProductGroupPromotion;
import org.openapitools.model.ProductGroupPromotionCreateRequest;
import org.openapitools.model.ProductGroupPromotionResponse;
import org.openapitools.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.model.ProductGroupPromotionsList200Response;
import org.openapitools.model.PromotionCreateRequest;
import org.openapitools.model.PromotionResponse;
import org.openapitools.model.PromotionUpdateRequest;
import org.openapitools.model.PromotionsList200Response;
import org.openapitools.model.PromotionsResponse;
import org.openapitools.model.ReportingTimeZone;
import org.openapitools.model.SSIOAccountResponse;
import org.openapitools.model.SSIOCreateInsertionOrderRequest;
import org.openapitools.model.SSIOCreateInsertionOrderResponse;
import org.openapitools.model.SSIOEditInsertionOrderRequest;
import org.openapitools.model.SSIOEditInsertionOrderResponse;
import org.openapitools.model.SSIOInsertionOrderStatusResponse;
import org.openapitools.model.SharedAudience;
import org.openapitools.model.SharedAudienceResponse;
import org.openapitools.model.SourcePlatformOptions;
import org.openapitools.model.SsioInsertionOrdersStatusGetByAdAccount200Response;
import org.openapitools.model.SsioOrderLinesGetByAdAccount200Response;
import org.openapitools.model.TargetingTemplateCreate;
import org.openapitools.model.TargetingTemplateGetResponseData;
import org.openapitools.model.TargetingTemplateList200Response;
import org.openapitools.model.TargetingTemplateUpdateRequest;
import org.openapitools.model.TemplateBasedReport;
import org.openapitools.model.TemplatesList200Response;
import org.openapitools.model.TermsOfService;
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
import javax.validation.Valid;
@Path("/ad_accounts")
@RequestScoped

@Api


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-31T04:54:28.741368951Z[Etc/UTC]", comments = "Generator version: 7.18.0")

public class AdAccountsApi  {

  @Context SecurityContext securityContext;

  @Inject AdAccountsApiService delegate;


    @GET
    @Path("/{ad_account_id}/analytics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad account analytics", notes = "Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.", response = AdAccountAnalyticsResponseInner.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccountAnalyticsResponseInner.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adAccountAnalytics( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull @ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true)  @QueryParam("columns") List<String> columns,  @NotNull @ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH")  @QueryParam("granularity") Granularity granularity, @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("click_window_days") Integer clickWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("engagement_window_days") Integer engagementWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1")  @QueryParam("view_window_days") Integer viewWindowDays, @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION")  @QueryParam("conversion_report_time") String conversionReportTime, @ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE")  @QueryParam("reporting_timezone") ReportingTimeZone reportingTimezone) {
        return delegate.adAccountAnalytics(adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/targeting_analytics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get targeting analytics for an ad account", notes = "Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.", response = MetricsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = MetricsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adAccountTargetingAnalyticsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull  @Size(min=1,max=15)@ApiParam(value = "Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.",required=true)  @QueryParam("targeting_types") List<AdsAnalyticsTargetingType> targetingTypes,  @NotNull @ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true)  @QueryParam("columns") List<String> columns,  @NotNull @ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH")  @QueryParam("granularity") Granularity granularity, @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("click_window_days") Integer clickWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("engagement_window_days") Integer engagementWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1")  @QueryParam("view_window_days") Integer viewWindowDays, @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION")  @QueryParam("conversion_report_time") String conversionReportTime,  @Size(max=2)@ApiParam(value = "List of types of attribution for the conversion report")  @QueryParam("attribution_types") List<ConversionReportAttributionType> attributionTypes, @ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE")  @QueryParam("reporting_timezone") ReportingTimeZone reportingTimezone) {
        return delegate.adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/audiences/shared/accounts")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List accounts with access to an audience owned by an ad account", notes = "List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.", response = AdAccountsAudiencesSharedAccountsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccountsAudiencesSharedAccountsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account audiences shared accounts parameters.", response = Error.class),
        @ApiResponse(code = 404, message = "Shared accounts not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response adAccountsAudiencesSharedAccountsList( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of the audience to use to filter the results.",required=true)  @QueryParam("audience_id") String audienceId,  @NotNull @ApiParam(value = "Filter accounts by account type.",required=true, allowableValues="AD_ACCOUNT, BUSINESS_ACCOUNT", defaultValue="AD_ACCOUNT") @DefaultValue("AD_ACCOUNT")  @QueryParam("account_type") AudienceAccountType accountType,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark) {
        return delegate.adAccountsAudiencesSharedAccountsList(adAccountId, audienceId, accountType, pageSize, bookmark, securityContext);
    }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create ad account", notes = "Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).", response = AdAccount.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdAccount.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = AdAccount.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response adAccountsCreate(@ApiParam(value = "" ,required=true) AdAccountCreate adAccountCreate) {
        return delegate.adAccountsCreate(adAccountCreate, securityContext);
    }

    @GET
    @Path("/{ad_account_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad account", notes = "Get an ad account", response = AdAccount.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdAccount.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response adAccountsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "",required=true) @PathParam("ad_account_id") String adAccountId) {
        return delegate.adAccountsGet(adAccountId, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List ad accounts", notes = "Get a list of the ad_accounts that the \"operation user_account\" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).", response = AdAccountsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdAccountsList200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response adAccountsList(@ApiParam(value = "Include shared ad accounts", defaultValue="true") @DefaultValue("true")  @QueryParam("include_shared_accounts") Boolean includeSharedAccounts, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.adAccountsList(includeSharedAccounts, bookmark, pageSize, securityContext);
    }

    @DELETE
    @Path("/{ad_account_id}/leads/subscriptions/{subscription_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete lead ads subscription", notes = "Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "lead_ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Resource deleted successfully.", response = Void.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response adAccountsSubscriptionsDelById( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a subscription.",required=true) @PathParam("subscription_id") String subscriptionId) {
        return delegate.adAccountsSubscriptionsDelById(adAccountId, subscriptionId, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/leads/subscriptions/{subscription_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get lead ads subscription by ID", notes = "Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'", response = LeadSubscription.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "lead_ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = LeadSubscription.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response adAccountsSubscriptionsGetById( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a subscription.",required=true) @PathParam("subscription_id") String subscriptionId) {
        return delegate.adAccountsSubscriptionsGetById(adAccountId, subscriptionId, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/leads/subscriptions")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get lead ads subscriptions", notes = "Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.", response = AdAccountsSubscriptionsGetList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "lead_ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdAccountsSubscriptionsGetList200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response adAccountsSubscriptionsGetList( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.adAccountsSubscriptionsGetList(adAccountId, bookmark, pageSize, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/leads/subscriptions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create lead ads subscription", notes = "Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.", response = LeadSubscription.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "lead_ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = LeadSubscription.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response adAccountsSubscriptionsPost( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "" ,required=true) LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate) {
        return delegate.adAccountsSubscriptionsPost(adAccountId, leadSubscriptionPostParamsCreate, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/ad_groups/analytics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad group analytics", notes = "Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.", response = AdGroupsAnalyticsResponseInner.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupsAnalyticsResponseInner.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account group analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adGroupsAnalytics( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull  @Size(min=1,max=250)@ApiParam(value = "List of Ad group Ids to use to filter the results.",required=true)  @QueryParam("ad_group_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds,  @NotNull @ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true)  @QueryParam("columns") List<String> columns,  @NotNull @ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH")  @QueryParam("granularity") Granularity granularity, @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("click_window_days") Integer clickWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("engagement_window_days") Integer engagementWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1")  @QueryParam("view_window_days") Integer viewWindowDays, @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION")  @QueryParam("conversion_report_time") String conversionReportTime, @ApiParam(value = "Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.", defaultValue="false") @DefaultValue("false")  @QueryParam("aggregate_report_rows") Boolean aggregateReportRows, @ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE")  @QueryParam("reporting_timezone") ReportingTimeZone reportingTimezone) {
        return delegate.adGroupsAnalytics(adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/ad_groups/audience_sizing")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audience sizing", notes = "Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.", response = AdGroupAudienceSizingResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupAudienceSizingResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad group audience sizing parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "No access to requested audience list or product group.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adGroupsAudienceSizing( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "" ,required=true) AdGroupAudienceSizingRequest adGroupAudienceSizingRequest) {
        return delegate.adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingRequest, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/bid_floor")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get bid floors", notes = "List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.", response = BidFloor.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BidFloor.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adGroupsBidFloorGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Parameters to get bid_floor info" ,required=true) BidFloorRequest bidFloorRequest) {
        return delegate.adGroupsBidFloorGet(adAccountId, bidFloorRequest, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/ad_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create ad groups", notes = "Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>. <strong>Notes:</strong> - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">closed beta</a> access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule. ", response = AdGroupArrayResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupArrayResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adGroupsCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "List of ad groups to create, size limit [1, 30]." ,required=true) List<@Valid AdGroupCreateRequest> adGroupCreateRequest) {
        return delegate.adGroupsCreate(adAccountId, adGroupCreateRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/ad_groups/{ad_group_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad group", notes = "Get a specific ad group given the ad group ID.", response = AdGroupResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adGroupsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad group.",required=true) @PathParam("ad_group_id") String adGroupId) {
        return delegate.adGroupsGet(adAccountId, adGroupId, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/ad_groups")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List ad groups", notes = "List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.", response = AdGroupsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdGroupsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account group parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adGroupsList( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Size(min=1,max=250)@ApiParam(value = "List of Campaign Ids to use to filter the results.")  @QueryParam("campaign_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,  @Size(min=1,max=250)@ApiParam(value = "List of Ad group Ids to use to filter the results.")  @QueryParam("ad_group_ids") List<@Pattern(regexp = "^\\d+$")String> adGroupIds, @ApiParam(value = "Entity status")  @QueryParam("entity_statuses") List<String> entityStatuses,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING")  @QueryParam("order") String order, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark, @ApiParam(value = "Return interests as text names (if value is true) rather than topic IDs.", defaultValue="false") @DefaultValue("false")  @QueryParam("translate_interests_to_names") Boolean translateInterestsToNames) {
        return delegate.adGroupsList(adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/ad_groups/targeting_analytics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get targeting analytics for ad groups", notes = "Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.", response = MetricsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = MetricsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adGroupsTargetingAnalyticsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull  @Size(min=1,max=250)@ApiParam(value = "List of Ad group Ids to use to filter the results.",required=true)  @QueryParam("ad_group_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds,  @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull  @Size(min=1,max=14)@ApiParam(value = "Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.",required=true)  @QueryParam("targeting_types") List<AdsAnalyticsAdGroupTargetingType> targetingTypes,  @NotNull @ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true)  @QueryParam("columns") List<String> columns,  @NotNull @ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH")  @QueryParam("granularity") Granularity granularity, @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("click_window_days") Integer clickWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("engagement_window_days") Integer engagementWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1")  @QueryParam("view_window_days") Integer viewWindowDays, @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION")  @QueryParam("conversion_report_time") String conversionReportTime,  @Size(max=2)@ApiParam(value = "List of types of attribution for the conversion report")  @QueryParam("attribution_types") List<ConversionReportAttributionType> attributionTypes, @ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE")  @QueryParam("reporting_timezone") ReportingTimeZone reportingTimezone) {
        return delegate.adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adGroupsUpdate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "List of ad groups to update, size limit [1, 30]." ,required=true) List<@Valid AdGroupUpdateRequest> adGroupUpdateRequest) {
        return delegate.adGroupsUpdate(adAccountId, adGroupUpdateRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/pins/analytics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pins analytics", notes = "Get analytics for the pins given a campaign and pins in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.", response = AdPinAnalytics.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "campaigns" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdPinAnalytics.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account pins analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adPinsAnalytics( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Campaign Id to use to filter the results.",required=true)  @QueryParam("campaign_id") String campaignId,  @NotNull  @Size(min=1,max=100)@ApiParam(value = "List of Pin IDs.",required=true)  @QueryParam("pin_ids") List<@Pattern(regexp = "^\\d+$")String> pinIds,  @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull @ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true)  @QueryParam("columns") List<String> columns,  @NotNull @ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH")  @QueryParam("granularity") Granularity granularity, @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("click_window_days") Integer clickWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("engagement_window_days") Integer engagementWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1")  @QueryParam("view_window_days") Integer viewWindowDays, @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION")  @QueryParam("conversion_report_time") String conversionReportTime) {
        return delegate.adPinsAnalytics(adAccountId, campaignId, pinIds, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/ad_previews")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create ad preview with pin or image", notes = "Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.  Creating ad preview from catalog product group is currently in BETA and is not available to all users.", response = AdPreviewURLResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful ad preview creation.", response = AdPreviewURLResponse.class),
        @ApiResponse(code = 400, message = "Invalid Pin parameters response", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adPreviewsCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Create ad preview with pin or image." ,required=true) AdPreviewRequest adPreviewRequest) {
        return delegate.adPreviewsCreate(adAccountId, adPreviewRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/ads/targeting_analytics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get targeting analytics for ads", notes = "Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.", response = MetricsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = MetricsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adTargetingAnalyticsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull  @Size(min=1,max=250)@ApiParam(value = "List of Ad Ids to use to filter the results.",required=true)  @QueryParam("ad_ids") List<@Pattern(regexp = "^\\d+$")String> adIds,  @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull  @Size(min=1,max=14)@ApiParam(value = "Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.",required=true)  @QueryParam("targeting_types") List<AdsAnalyticsAdTargetingType> targetingTypes,  @NotNull @ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true)  @QueryParam("columns") List<String> columns,  @NotNull @ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH")  @QueryParam("granularity") Granularity granularity, @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("click_window_days") Integer clickWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("engagement_window_days") Integer engagementWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1")  @QueryParam("view_window_days") Integer viewWindowDays, @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION")  @QueryParam("conversion_report_time") String conversionReportTime,  @Size(max=2)@ApiParam(value = "List of types of attribution for the conversion report")  @QueryParam("attribution_types") List<ConversionReportAttributionType> attributionTypes, @ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE")  @QueryParam("reporting_timezone") ReportingTimeZone reportingTimezone) {
        return delegate.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/ads/analytics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad analytics", notes = "Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - The request must contain either ad_ids or both campaign_ids and pin_ids. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.", response = AdsAnalyticsResponseInner.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdsAnalyticsResponseInner.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adsAnalytics( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull @ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true)  @QueryParam("columns") List<String> columns,  @NotNull @ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH")  @QueryParam("granularity") Granularity granularity,  @Size(min=1,max=250)@ApiParam(value = "List of Ad Ids to use to filter the results.")  @QueryParam("ad_ids") List<@Pattern(regexp = "^\\d+$")String> adIds, @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("click_window_days") Integer clickWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("engagement_window_days") Integer engagementWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1")  @QueryParam("view_window_days") Integer viewWindowDays, @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION")  @QueryParam("conversion_report_time") String conversionReportTime,  @Size(min=1,max=100)@ApiParam(value = "List of Pin IDs.")  @QueryParam("pin_ids") List<@Pattern(regexp = "^\\d+$")String> pinIds,  @Size(min=1,max=250)@ApiParam(value = "List of Campaign Ids to use to filter the results.")  @QueryParam("campaign_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, @ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE")  @QueryParam("reporting_timezone") ReportingTimeZone reportingTimezone) {
        return delegate.adsAnalytics(adAccountId, startDate, endDate, columns, granularity, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, pinIds, campaignIds, reportingTimezone, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/ads")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create ads", notes = "Create multiple new ads. Request must contain `ad_group_id`, `creative_type`, and the source Pin `pin_id`.", response = AdArrayResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdArrayResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adsCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "List of ads to create, size limit [1, 30]." ,required=true) List<@Valid AdCreateRequest> adCreateRequest) {
        return delegate.adsCreate(adAccountId, adCreateRequest, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/ads_credit/redeem")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Redeem ad credits", notes = "Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>", response = AdsCreditRedeemResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc."),
            @AuthorizationScope(scope = "billing:write", description = "Create, update, or delete billing data, billing profiles, etc.") })
         }, tags={ "billing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully redeemed ad credits.", response = AdsCreditRedeemResponse.class),
        @ApiResponse(code = 400, message = "Error thrown when unable to redeem offer code.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adsCreditRedeem( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Redeem ad credits request." ,required=true) AdsCreditRedeemRequest adsCreditRedeemRequest) {
        return delegate.adsCreditRedeem(adAccountId, adsCreditRedeemRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/ads_credit/discounts")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ads credit discounts", notes = "Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>", response = AdsCreditsDiscountsGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc."),
            @AuthorizationScope(scope = "billing:read", description = "See all of your billing data, billing profile, etc.") })
         }, tags={ "billing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdsCreditsDiscountsGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response adsCreditsDiscountsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.adsCreditsDiscountsGet(adAccountId, bookmark, pageSize, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/ads/{ad_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad", notes = "Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.", response = AdResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad.",required=true) @PathParam("ad_id") String adId) {
        return delegate.adsGet(adAccountId, adId, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/ads")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List ads", notes = "List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.", response = AdsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adsList( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Size(min=1,max=250)@ApiParam(value = "List of Campaign Ids to use to filter the results.")  @QueryParam("campaign_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,  @Size(min=1,max=250)@ApiParam(value = "List of Ad group Ids to use to filter the results.")  @QueryParam("ad_group_ids") List<@Pattern(regexp = "^\\d+$")String> adGroupIds,  @Size(min=1,max=250)@ApiParam(value = "List of Ad Ids to use to filter the results.")  @QueryParam("ad_ids") List<@Pattern(regexp = "^\\d+$")String> adIds, @ApiParam(value = "Entity status")  @QueryParam("entity_statuses") List<String> entityStatuses,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING")  @QueryParam("order") String order, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark) {
        return delegate.adsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response adsUpdate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "List of ads to update, size limit [1, 30]" ,required=true) List<@Valid AdUpdateRequest> adUpdateRequest) {
        return delegate.adsUpdate(adAccountId, adUpdateRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/advertiser_defined_events")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get advertiser defined events", notes = "<p>Get advertiser defined events for the given ad account.</p>", response = AdvertiserDefinedEventsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "conversions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdvertiserDefinedEventsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response advertiserDefinedEventsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId) {
        return delegate.advertiserDefinedEventsGet(adAccountId, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/reports/brand_category_sku")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a request for a brand, category, SKU report", notes = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.", response = AdsAnalyticsCreateAsyncResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdsAnalyticsCreateAsyncResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics brand, category, SKU parameters", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response analyticsCreateConversionProductReport( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "" ,required=true) ConversionProductReportRequest conversionProductReportRequest) {
        return delegate.analyticsCreateConversionProductReport(adAccountId, conversionProductReportRequest, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response analyticsCreateMmmReport( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "" ,required=true) CreateMMMReportRequest createMMMReportRequest) {
        return delegate.analyticsCreateMmmReport(adAccountId, createMMMReportRequest, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/reports")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create async request for an account analytics report", notes = "This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.", response = AdsAnalyticsCreateAsyncResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdsAnalyticsCreateAsyncResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response analyticsCreateReport( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "" ,required=true) AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest) {
        return delegate.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/templates/{template_id}/reports")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Create async request for an analytics report using a template", notes = "   This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.", response = TemplateBasedReport.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = TemplateBasedReport.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = TemplateBasedReport.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response analyticsCreateTemplateReport( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "",required=true) @PathParam("ad_account_id") String adAccountId,  @Size(max=18)@ApiParam(value = "Unique identifier of a template.",required=true) @PathParam("template_id") String templateId, @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.")  @QueryParam("start_date") LocalDate startDate, @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.")  @QueryParam("end_date") LocalDate endDate, @ApiParam(value = "   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEKLY - metrics are broken down weekly.    MONTHLY - metrics are broken down monthly", allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH")  @QueryParam("granularity") Granularity granularity) {
        return delegate.analyticsCreateTemplateReport(adAccountId, templateId, startDate, endDate, granularity, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/reports/brand_category_sku")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get advertiser brand, category, SKU report", notes = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.", response = AdsAnalyticsGetAsyncResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdsAnalyticsGetAsyncResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response analyticsGetConversionProductReport( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Token returned from the post request creation call",required=true)  @QueryParam("token") String token) {
        return delegate.analyticsGetConversionProductReport(adAccountId, token, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response analyticsGetMmmReport( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Token returned from the post request creation call",required=true)  @QueryParam("token") String token) {
        return delegate.analyticsGetMmmReport(adAccountId, token, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response analyticsGetReport( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Token returned from the post request creation call",required=true)  @QueryParam("token") String token) {
        return delegate.analyticsGetReport(adAccountId, token, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/audience_insights")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audience insights", notes = "Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.", response = AudienceInsightsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "audience_insights" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AudienceInsightsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response audienceInsightsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Type of audience insights.",required=true, allowableValues="YOUR_TOTAL_AUDIENCE, YOUR_ENGAGED_AUDIENCE, PINTEREST_TOTAL_AUDIENCE", defaultValue="YOUR_TOTAL_AUDIENCE") @DefaultValue("YOUR_TOTAL_AUDIENCE")  @QueryParam("audience_insight_type") AudienceInsightType audienceInsightType) {
        return delegate.audienceInsightsGet(adAccountId, audienceInsightType, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/insights/audiences")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audience insights scope and type", notes = "Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.", response = AudienceDefinitionResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "audience_insights" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AudienceDefinitionResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response audienceInsightsScopeAndTypeGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId) {
        return delegate.audienceInsightsScopeAndTypeGet(adAccountId, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/audiences")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create audience", notes = "Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific `audience_ids` when you create an ad group. <p/> Learn about <a href=\"/docs/work-with-targets-and-audiences/create-audiences/\" target=\"_blank\">creating different kinds of audiences</a>.", response = Audience.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "audiences" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Audience.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response audiencesCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "List of ads to create, size limit [1, 30]" ,required=true) AudienceCreateRequest audienceCreateRequest) {
        return delegate.audiencesCreate(adAccountId, audienceCreateRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/audiences/{audience_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audience", notes = "Get a specific audience given the audience ID.", response = Audience.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "audiences" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Audience.class),
        @ApiResponse(code = 404, message = "Audience not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response audiencesGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an audience",required=true) @PathParam("audience_id") String audienceId) {
        return delegate.audiencesGet(adAccountId, audienceId, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/audiences")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List audiences", notes = "Get list of audiences for the ad account.", response = AudiencesList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "audiences" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AudiencesList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account audience parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response audiencesList( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark, @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING")  @QueryParam("order") String order,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "Filter audiences by ownership type.", allowableValues="OWNED, RECEIVED", defaultValue="OWNED") @DefaultValue("OWNED")  @QueryParam("ownership_type") String ownershipType) {
        return delegate.audiencesList(adAccountId, bookmark, order, pageSize, ownershipType, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response audiencesUpdate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an audience",required=true) @PathParam("audience_id") String audienceId, @ApiParam(value = "The audience to be updated." ,required=true) AudienceUpdateRequest audienceUpdateRequest) {
        return delegate.audiencesUpdate(adAccountId, audienceId, audienceUpdateRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/billing_invoice/{billing_invoice_id}/download")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get download url for a billing invoice", notes = "Get download url for a billing invoice.", response = BillingInvoiceDownloadResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc."),
            @AuthorizationScope(scope = "billing:read", description = "See all of your billing data, billing profile, etc.") })
         }, tags={ "billing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully fetched Billing invoice information for a given ad account", response = BillingInvoiceDownloadResponse.class),
        @ApiResponse(code = 400, message = "Invalid request parameter.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response billingInvoiceDownloadGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of a billing invoice.",required=true) @PathParam("billing_invoice_id") String billingInvoiceId) {
        return delegate.billingInvoiceDownloadGet(adAccountId, billingInvoiceId, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/billing_invoices")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get billing invoices", notes = "Get billing invoices in the advertiser account.", response = BillingInvoicesGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc."),
            @AuthorizationScope(scope = "billing:read", description = "See all of your billing data, billing profile, etc.") })
         }, tags={ "billing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BillingInvoicesGet200Response.class),
        @ApiResponse(code = 400, message = "Invalid request parameter.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response billingInvoicesGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "Field of which to sort billing invoices", allowableValues="DUE_DATE, BILLING_PERIOD, DOCUMENT_TYPE, TOTAL_AMOUNT, INVOICE_NUMBER", defaultValue="DUE_DATE") @DefaultValue("DUE_DATE")  @QueryParam("sort") String sort, @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING")  @QueryParam("order") String order, @ApiParam(value = "Status of billing invoices to filter by", allowableValues="OPEN, CLOSED")  @QueryParam("status") String status, @ApiParam(value = "Document type of billing invoices to filter by", allowableValues="INVOICE, CREDIT_MEMO")  @QueryParam("document_type") String documentType,  @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")@ApiParam(value = "Starting point for due dates when searching for invoices. Format: YYYY-MM-DD")  @QueryParam("start_due_date") LocalDate startDueDate,  @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")@ApiParam(value = "Ending point for due dates when searching for invoices. Format: YYYY-MM-DD")  @QueryParam("end_due_date") LocalDate endDueDate) {
        return delegate.billingInvoicesGet(adAccountId, bookmark, pageSize, sort, order, status, documentType, startDueDate, endDueDate, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/billing_profiles")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get billing profiles", notes = "Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>", response = BillingProfilesGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc."),
            @AuthorizationScope(scope = "billing:read", description = "See all of your billing data, billing profile, etc.") })
         }, tags={ "billing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BillingProfilesGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response billingProfilesGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Return active billing profiles, if false return all billing profiles.",required=true)  @QueryParam("is_active") Boolean isActive, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.billingProfilesGet(adAccountId, isActive, bookmark, pageSize, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/bulk/download")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get advertiser entities in bulk", notes = "Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.", response = BulkDownloadResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "bulk" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BulkDownloadResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response bulkDownloadCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Parameters to get ad entities in bulk" ,required=true) BulkDownloadRequest bulkDownloadRequest) {
        return delegate.bulkDownloadCreate(adAccountId, bulkDownloadRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/bulk/{bulk_request_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Download advertiser entities in bulk", notes = "Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).", response = BulkUpsertStatusResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "bulk" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BulkUpsertStatusResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response bulkRequestGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Unique identifier of a bulk upsert request.",required=true) @PathParam("bulk_request_id") String bulkRequestId, @ApiParam(value = "if set to True then attach the errors/details to all the requests", defaultValue="false") @DefaultValue("false")  @QueryParam("include_details") Boolean includeDetails) {
        return delegate.bulkRequestGet(adAccountId, bulkRequestId, includeDetails, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/bulk/upsert")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create/update ad entities in bulk", notes = "Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.", response = BulkUpsertResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "bulk" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BulkUpsertResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response bulkUpsertCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Parameters to get create/update ad entities in bulk" ,required=true) BulkUpsertRequest bulkUpsertRequest) {
        return delegate.bulkUpsertCreate(adAccountId, bulkUpsertRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/campaigns/targeting_analytics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get targeting analytics for campaigns", notes = "Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.", response = MetricsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "campaigns" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = MetricsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response campaignTargetingAnalyticsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull  @Size(min=1,max=250)@ApiParam(value = "List of Campaign Ids to use to filter the results.",required=true)  @QueryParam("campaign_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,  @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull  @Size(min=1,max=14)@ApiParam(value = "Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.",required=true)  @QueryParam("targeting_types") List<AdsAnalyticsCampaignTargetingType> targetingTypes,  @NotNull @ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true)  @QueryParam("columns") List<String> columns,  @NotNull @ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH")  @QueryParam("granularity") Granularity granularity, @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("click_window_days") Integer clickWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("engagement_window_days") Integer engagementWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1")  @QueryParam("view_window_days") Integer viewWindowDays, @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION")  @QueryParam("conversion_report_time") String conversionReportTime,  @Size(max=2)@ApiParam(value = "List of types of attribution for the conversion report")  @QueryParam("attribution_types") List<ConversionReportAttributionType> attributionTypes, @ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE")  @QueryParam("reporting_timezone") ReportingTimeZone reportingTimezone) {
        return delegate.campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/campaigns/analytics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get campaign analytics", notes = "Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.", response = CampaignsAnalyticsResponseInner.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "campaigns" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CampaignsAnalyticsResponseInner.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account campaign analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response campaignsAnalytics( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull  @Size(min=1,max=250)@ApiParam(value = "List of Campaign Ids to use to filter the results.",required=true)  @QueryParam("campaign_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,  @NotNull @ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true)  @QueryParam("columns") List<String> columns,  @NotNull @ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH")  @QueryParam("granularity") Granularity granularity, @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("click_window_days") Integer clickWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("engagement_window_days") Integer engagementWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1")  @QueryParam("view_window_days") Integer viewWindowDays, @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION")  @QueryParam("conversion_report_time") String conversionReportTime, @ApiParam(value = "Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.", defaultValue="false") @DefaultValue("false")  @QueryParam("aggregate_report_rows") Boolean aggregateReportRows, @ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE")  @QueryParam("reporting_timezone") ReportingTimeZone reportingTimezone) {
        return delegate.campaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response campaignsCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Array of campaigns." ,required=true) List<@Valid CampaignCreateRequest> campaignCreateRequest) {
        return delegate.campaignsCreate(adAccountId, campaignCreateRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/campaigns/{campaign_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get campaign", notes = "Get a specific campaign given the campaign ID.", response = CampaignResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "campaigns" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CampaignResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response campaignsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Campaign ID, must be associated with the ad account ID provided in the path.",required=true) @PathParam("campaign_id") String campaignId) {
        return delegate.campaignsGet(adAccountId, campaignId, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/campaigns")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List campaigns", notes = "Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.", response = CampaignsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "campaigns" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CampaignsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account campaign parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response campaignsList( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Size(min=1,max=250)@ApiParam(value = "List of Campaign Ids to use to filter the results.")  @QueryParam("campaign_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, @ApiParam(value = "Entity status")  @QueryParam("entity_statuses") List<String> entityStatuses,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING")  @QueryParam("order") String order, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark) {
        return delegate.campaignsList(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark, securityContext);
    }

    @PATCH
    @Path("/{ad_account_id}/campaigns")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update campaigns", notes = "<p>Update multiple ad campaigns based on campaign_ids. </p> <p><strong>Note:</strong></p> - <p>The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>", response = CampaignUpdateResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "campaigns" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = CampaignUpdateResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response campaignsUpdate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Array of campaigns." ,required=true) List<@Valid CampaignUpdateRequest> campaignUpdateRequest) {
        return delegate.campaignsUpdate(adAccountId, campaignUpdateRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/conversion_eqs")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get event quality score (EQS)", notes = "Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.", response = EventQualityScore.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "conversion_eqs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = EventQualityScore.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response conversionEqsList( @NotNull @ApiParam(value = "Lookback window (number of days).",required=true, allowableValues="1d, 14d")  @QueryParam("lookback_period") LookbackPeriodOptions lookbackPeriod,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Source platform of event.", allowableValues="WEB, MOBILE, MOBILE_ANDROID, MOBILE_IOS, OFFLINE, PINTEREST_WEB, PINTEREST_ANDROID, PINTEREST_IOS, POINT_OF_SALE")  @QueryParam("source_platform") SourcePlatformOptions sourcePlatform, @ApiParam(value = "Ingestion source of event.", allowableValues="TAG, MMP, FILE_UPLOAD, CONVERSIONS_API, NATIVE")  @QueryParam("ingestion_source") IngestionSourceOptions ingestionSource) {
        return delegate.conversionEqsList(lookbackPeriod, adAccountId, sourcePlatform, ingestionSource, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/conversion_tags")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create conversion tag", notes = "Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account's website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)", response = ConversionTag.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "conversion_tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = ConversionTag.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = ConversionTag.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response conversionTagsCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "" ,required=true) ConversionTagCreate conversionTagCreate) {
        return delegate.conversionTagsCreate(adAccountId, conversionTagCreate, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/conversion_tags/{conversion_tag_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get conversion tag", notes = "Get information about an existing conversion tag.", response = ConversionTag.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "conversion_tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ConversionTag.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response conversionTagsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Id of the conversion tag.",required=true) @PathParam("conversion_tag_id") String conversionTagId) {
        return delegate.conversionTagsGet(adAccountId, conversionTagId, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/conversion_tags")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List conversion tags", notes = "List conversion tags associated with an ad account.", response = ConversionTagsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "conversion_tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = ConversionTagsList200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response conversionTagsList( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Filter by deleted status", defaultValue="false") @DefaultValue("false")  @QueryParam("filter_deleted") Boolean filterDeleted) {
        return delegate.conversionTagsList(adAccountId, filterDeleted, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/keywords/metrics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get country's keyword metrics", notes = "See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).", response = KeywordsMetricsArrayResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "keywords" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = KeywordsMetricsArrayResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response countryKeywordsMetricsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Two letter country code (ISO 3166-1 alpha-2)",required=true)  @QueryParam("country_code") String countryCode,  @NotNull  @Size(min=1,max=2000)@ApiParam(value = "Comma-separated keywords",required=true)  @QueryParam("keywords") List<String> keywords) {
        return delegate.countryKeywordsMetricsGet(adAccountId, countryCode, keywords, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/customer_lists/{customer_list_id}/uploads")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create customer list upload", notes = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>", response = CustomerListUploadCreateResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "customer_list_uploads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerListUploadCreateResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response customerListUploadsCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of a customer list",required=true) @PathParam("customer_list_id") String customerListId, @ApiParam(value = "Parameters to create a customer list upload request" ,required=true) CustomerListUploadCreateRequest customerListUploadCreateRequest) {
        return delegate.customerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get customer list upload", notes = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>", response = CustomerListUploadResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "customer_list_uploads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerListUploadResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response customerListUploadsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of a customer list",required=true) @PathParam("customer_list_id") String customerListId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of a customer list upload",required=true) @PathParam("customer_list_upload_id") String customerListUploadId) {
        return delegate.customerListUploadsGet(adAccountId, customerListId, customerListUploadId, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Run customer list upload", notes = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>", response = CustomerListUploadResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "customer_list_uploads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerListUploadResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response customerListUploadsRun( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of a customer list",required=true) @PathParam("customer_list_id") String customerListId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of a customer list upload",required=true) @PathParam("customer_list_upload_id") String customerListUploadId) {
        return delegate.customerListUploadsRun(adAccountId, customerListId, customerListUploadId, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/customer_lists")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create customer lists", notes = "<p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the <a href=\"https://developer.pinterest.com/docs/api/v5/audiences-create\" target=\"blank\">create audience endpoint</a>.</p>", response = CustomerList.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "customer_lists" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerList.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response customerListsCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Parameters to get Customer lists info" ,required=true) CustomerListRequest customerListRequest) {
        return delegate.customerListsCreate(adAccountId, customerListRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/customer_lists/{customer_list_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get customer list", notes = "Gets a specific customer list given the customer list ID.", response = CustomerList.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "customer_lists" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerList.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response customerListsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of a customer list",required=true) @PathParam("customer_list_id") String customerListId) {
        return delegate.customerListsGet(adAccountId, customerListId, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/customer_lists")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get customer lists", notes = "<p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>", response = CustomerListsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "customer_lists" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerListsList200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response customerListsList( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING")  @QueryParam("order") String order, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark) {
        return delegate.customerListsList(adAccountId, pageSize, order, bookmark, securityContext);
    }

    @PATCH
    @Path("/{ad_account_id}/customer_lists/{customer_list_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update customer list", notes = "<p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>", response = CustomerList.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "customer_lists" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerList.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response customerListsUpdate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of a customer list",required=true) @PathParam("customer_list_id") String customerListId, @ApiParam(value = "" ,required=true) CustomerListUpdateRequest customerListUpdateRequest) {
        return delegate.customerListsUpdate(adAccountId, customerListId, customerListUpdateRequest, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/events")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Send conversions", notes = "The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/api-features/conversion-overview/\">Conversions Guide</a> for more details. (Note that the authorization header required is <code>Authorization: Bearer &lt;access_token&gt;</code>). - The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)", response = ConversionApiResponse.class, authorizations = {
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
        @ApiResponse(code = 200, message = "Unexpected errors", response = Error.class) })
    public Response eventsCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Conversion events." ,required=true) ConversionEvents conversionEvents, @ApiParam(value = "Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.")  @QueryParam("test") Boolean test) {
        return delegate.eventsCreate(adAccountId, conversionEvents, test, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/keywords")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create keywords", notes = "<p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/reference/rate-limits/\">WRITE</a>.</p>", response = KeywordsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "keywords" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = KeywordsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response keywordsCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "" ,required=true) KeywordsRequest keywordsRequest) {
        return delegate.keywordsCreate(adAccountId, keywordsRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/keywords")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get keywords", notes = "<p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>", response = KeywordsGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "keywords" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = KeywordsGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response keywordsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Campaign Id to use to filter the results.")  @QueryParam("campaign_id") String campaignId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Ad group Id.")  @QueryParam("ad_group_id") String adGroupId,  @Size(min=1,max=250)@ApiParam(value = "List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.")  @QueryParam("ad_group_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds,  @Size(min=1,max=5)@ApiParam(value = "Keyword <a target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type</a>")  @QueryParam("match_types") List<MatchType> matchTypes,  @Min(1)@ApiParam(value = "Maximum number of items to include in a single page of the response. Default maximum of 250. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark) {
        return delegate.keywordsGet(adAccountId, campaignId, adGroupId, adGroupIds, matchTypes, pageSize, bookmark, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response keywordsUpdate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "" ,required=true) KeywordUpdateBody keywordUpdateBody) {
        return delegate.keywordsUpdate(adAccountId, keywordUpdateBody, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/labels")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create labels", notes = "<p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>", response = LabelsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "labels" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LabelsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response labelsCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "" ,required=true) LabelCreateRequest labelCreateRequest) {
        return delegate.labelsCreate(adAccountId, labelCreateRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/labels")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List labels", notes = "<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>", response = LabelsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "labels" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LabelsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response labelsList( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Size(min=1,max=250)@ApiParam(value = "List of Campaign Ids to use to filter the results.")  @QueryParam("campaign_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,  @Size(min=1,max=250)@ApiParam(value = "List of Label Ids to use to filter the results.")  @QueryParam("label_ids") List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> labelIds, @ApiParam(value = "Label entity status")  @QueryParam("entity_statuses") List<String> entityStatuses, @ApiParam(value = "Label type.")  @QueryParam("label_types") List<String> labelTypes,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark) {
        return delegate.labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, pageSize, bookmark, securityContext);
    }

    @PATCH
    @Path("/{ad_account_id}/labels")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update labels", notes = "<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>", response = LabelsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "labels" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LabelsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response labelsUpdate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "" ,required=true) LabelUpdateRequest labelUpdateRequest) {
        return delegate.labelsUpdate(adAccountId, labelUpdateRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/lead_forms/{lead_form_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get lead form by id", notes = "<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.", response = LeadFormResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "lead_forms" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadFormResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account lead forms parameters.", response = Error.class),
        @ApiResponse(code = 404, message = "The lead form ID for the given ad account ID does not exist.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response leadFormGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a lead form.",required=true) @PathParam("lead_form_id") String leadFormId) {
        return delegate.leadFormGet(adAccountId, leadFormId, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/lead_forms/{lead_form_id}/test")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create lead form test data", notes = "Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.", response = LeadFormTestResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "lead_forms" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadFormTestResponse.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 404, message = "Lead not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response leadFormTestCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a lead form.",required=true) @PathParam("lead_form_id") String leadFormId, @ApiParam(value = "Subscription to create." ,required=true) LeadFormTestRequest leadFormTestRequest) {
        return delegate.leadFormTestCreate(adAccountId, leadFormId, leadFormTestRequest, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/lead_forms")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create lead forms", notes = "<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.", response = LeadFormArrayResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "lead_forms" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadFormArrayResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account lead forms parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response leadFormsCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "List of lead forms to create, size limit [1, 30]." ,required=true) List<@Valid LeadFormCreateRequest> leadFormCreateRequest) {
        return delegate.leadFormsCreate(adAccountId, leadFormCreateRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/lead_forms")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List lead forms", notes = "<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.", response = LeadFormsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "lead_forms" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadFormsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account lead forms parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response leadFormsList( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING")  @QueryParam("order") String order, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark) {
        return delegate.leadFormsList(adAccountId, pageSize, order, bookmark, securityContext);
    }

    @PATCH
    @Path("/{ad_account_id}/lead_forms")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update lead forms", notes = "<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.", response = LeadFormArrayResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "lead_forms" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadFormArrayResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account lead forms parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response leadFormsUpdate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "List of lead forms to update, size limit [1, 30]." ,required=true) List<@Valid LeadFormUpdateRequest> leadFormUpdateRequest) {
        return delegate.leadFormsUpdate(adAccountId, leadFormUpdateRequest, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/leads_export")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a request to export leads collected from a lead ad", notes = "<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.", response = LeadsExportCreateResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "leads_export" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadsExportCreateResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account parameter.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response leadsExportCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "" ,required=true) LeadsExportCreateRequest leadsExportCreateRequest) {
        return delegate.leadsExportCreate(adAccountId, leadsExportCreateRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/leads_export/{leads_export_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get the lead export from the lead export create call", notes = "<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.", response = LeadsExportResponseData.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "leads_export" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadsExportResponseData.class),
        @ApiResponse(code = 400, message = "Invalid ad account parameter.", response = Error.class),
        @ApiResponse(code = 404, message = "Invalid leads export id parameter.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response leadsExportGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$")@ApiParam(value = "lead_export_id token returned from the create a lead export endpoint",required=true) @PathParam("leads_export_id") String leadsExportId) {
        return delegate.leadsExportGet(adAccountId, leadsExportId, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/msot/events")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Send Measurement Source Of Truth (MSOT) attributed conversion events", notes = "<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting.", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "msot:write", description = "Create measurement source of truth events") })
         }, tags={ "msot_events" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Void.class),
        @ApiResponse(code = 400, message = "The request was invalid", response = Error.class),
        @ApiResponse(code = 401, message = "Not authorized to send MSOT conversion events", response = Error.class),
        @ApiResponse(code = 403, message = "Unauthorized access", response = Error.class),
        @ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected errors", response = Error.class) })
    public Response msotEventsCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Attributed MSOT conversion events" ,required=true) ConversionMSOTEvents conversionMSOTEvents) {
        return delegate.msotEventsCreate(adAccountId, conversionMSOTEvents, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/conversion_tags/ocpm_eligible")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Ocpm eligible conversion tags", notes = "Get Ocpm eligible conversion tag events for an ad account.", response = List.class, responseContainer = "Map", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "conversion_tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ConversionEventResponse.class, responseContainer = "Map"),
        @ApiResponse(code = 200, message = "Unexpected errors", response = Error.class) })
    public Response ocpmEligibleConversionTagsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId) {
        return delegate.ocpmEligibleConversionTagsGet(adAccountId, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response orderLinesGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an order line.",required=true) @PathParam("order_line_id") String orderLineId) {
        return delegate.orderLinesGet(adAccountId, orderLineId, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response orderLinesList( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING")  @QueryParam("order") String order, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark) {
        return delegate.orderLinesList(adAccountId, pageSize, order, bookmark, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/conversion_tags/page_visit")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get page visit conversion tags", notes = "Get all page visit conversion tag events for an ad account.", response = PageVisitConversionTagsGet200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "conversion_tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PageVisitConversionTagsGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response pageVisitConversionTagsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING")  @QueryParam("order") String order, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark) {
        return delegate.pageVisitConversionTagsGet(adAccountId, pageSize, order, bookmark, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response productGroupPromotionsCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "List of Product Group Promotions to create, size limit [1, 30]." ,required=true) ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest) {
        return delegate.productGroupPromotionsCreate(adAccountId, productGroupPromotionCreateRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/product_group_promotions/{product_group_promotion_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a product group promotion by id", notes = "Get a product group promotion by id", response = ProductGroupPromotion.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "product_group_promotions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ProductGroupPromotion.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response productGroupPromotionsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of a product group promotion",required=true) @PathParam("product_group_promotion_id") String productGroupPromotionId) {
        return delegate.productGroupPromotionsGet(adAccountId, productGroupPromotionId, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response productGroupPromotionsList( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Size(min=1,max=250)@ApiParam(value = "List of Product group promotion Ids.")  @QueryParam("product_group_promotion_ids") List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds, @ApiParam(value = "Entity status")  @QueryParam("entity_statuses") List<String> entityStatuses,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Ad group Id.")  @QueryParam("ad_group_id") String adGroupId,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING")  @QueryParam("order") String order, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark) {
        return delegate.productGroupPromotionsList(adAccountId, productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response productGroupPromotionsUpdate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Parameters to update Product group promotions" ,required=true) ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest) {
        return delegate.productGroupPromotionsUpdate(adAccountId, productGroupPromotionUpdateRequest, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/product_groups/analytics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get product group analytics", notes = "Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.", response = ProductGroupAnalyticsResponseInner.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "product_group_promotions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ProductGroupAnalyticsResponseInner.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ad account ads analytics parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response productGroupsAnalytics( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull  @Size(min=1,max=250)@ApiParam(value = "List of Product group Ids to use to filter the results.",required=true)  @QueryParam("product_group_ids") List<@Pattern(regexp = "^\\d+$")String> productGroupIds,  @NotNull @ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned",required=true)  @QueryParam("columns") List<String> columns,  @NotNull @ApiParam(value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly",required=true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH")  @QueryParam("granularity") Granularity granularity, @ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("click_window_days") Integer clickWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="30") @DefaultValue("30")  @QueryParam("engagement_window_days") Integer engagementWindowDays, @ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue="1") @DefaultValue("1")  @QueryParam("view_window_days") Integer viewWindowDays, @ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue="TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION")  @QueryParam("conversion_report_time") String conversionReportTime, @ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE")  @QueryParam("reporting_timezone") ReportingTimeZone reportingTimezone) {
        return delegate.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/promotions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create promotions", notes = "Create multiple new promotions.", response = PromotionsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "promotions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PromotionsResponse.class),
        @ApiResponse(code = 400, message = "Invalid create promotions request parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response promotionsCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "List of promotions to create, size limit [1, 30]." ,required=true) List<@Valid PromotionCreateRequest> promotionCreateRequest) {
        return delegate.promotionsCreate(adAccountId, promotionCreateRequest, securityContext);
    }

    @DELETE
    @Path("/{ad_account_id}/promotions/{promotion_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete promotion by id", notes = "Delete a promotion within Pinterest.", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "promotions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Promotion deleted successfully", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response promotionsDelete( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of a promotion",required=true) @PathParam("promotion_id") String promotionId) {
        return delegate.promotionsDelete(adAccountId, promotionId, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/promotions/{promotion_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get promotion by id", notes = "Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.", response = PromotionResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "promotions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PromotionResponse.class),
        @ApiResponse(code = 404, message = "The promotion ID for the given ad account ID was not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response promotionsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of a promotion",required=true) @PathParam("promotion_id") String promotionId) {
        return delegate.promotionsGet(adAccountId, promotionId, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/promotions")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get promotions", notes = "Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.", response = PromotionsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "promotions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PromotionsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account promotions parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response promotionsList( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING")  @QueryParam("order") String order, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark) {
        return delegate.promotionsList(adAccountId, pageSize, order, bookmark, securityContext);
    }

    @PATCH
    @Path("/{ad_account_id}/promotions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update promotions", notes = "Update multiple promotions.", response = PromotionsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "promotions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PromotionsResponse.class),
        @ApiResponse(code = 400, message = "Invalid create promotions request parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response promotionsUpdate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "List of promotions to create, size limit [1, 30]." ,required=true) List<@Valid PromotionUpdateRequest> promotionUpdateRequest) {
        return delegate.promotionsUpdate(adAccountId, promotionUpdateRequest, securityContext);
    }

    @DELETE
    @Path("/{ad_account_id}/sandbox")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete ads data for ad account in API Sandbox", notes = "Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.", response = String.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "ad_accounts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 400, message = "Invalid ad account id.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response sandboxDelete( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId) {
        return delegate.sandboxDelete(adAccountId, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response ssioAccountsGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId) {
        return delegate.ssioAccountsGet(adAccountId, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response ssioInsertionOrderCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Order line to create." ,required=true) SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest) {
        return delegate.ssioInsertionOrderCreate(adAccountId, ssIOCreateInsertionOrderRequest, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response ssioInsertionOrderEdit( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Order line to create." ,required=true) SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest) {
        return delegate.ssioInsertionOrderEdit(adAccountId, ssIOEditInsertionOrderRequest, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response ssioInsertionOrdersStatusGetByAdAccount( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response ssioInsertionOrdersStatusGetByPinOrderId( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "The pin order id associated with the ssio insertion order",required=true) @PathParam("pin_order_id") String pinOrderId) {
        return delegate.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response ssioOrderLinesGetByAdAccount( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "The pin order id associated with the ssio insertino order")  @QueryParam("pin_order_id") String pinOrderId) {
        return delegate.ssioOrderLinesGetByAdAccount(adAccountId, bookmark, pageSize, pinOrderId, securityContext);
    }

    @POST
    @Path("/{ad_account_id}/targeting_templates")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create targeting templates", notes = "<p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>", response = TargetingTemplateGetResponseData.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "targeting_template" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = TargetingTemplateGetResponseData.class),
        @ApiResponse(code = 400, message = "Invalid ad account id.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response targetingTemplateCreate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "targeting template creation entity" ,required=true) TargetingTemplateCreate targetingTemplateCreate) {
        return delegate.targetingTemplateCreate(adAccountId, targetingTemplateCreate, securityContext);
    }

    @GET
    @Path("/{ad_account_id}/targeting_templates")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List targeting templates", notes = "Get a list of the targeting templates in the specified <code>ad_account_id</code>", response = TargetingTemplateList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "targeting_template" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = TargetingTemplateList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account id.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response targetingTemplateList( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING")  @QueryParam("order") String order, @ApiParam(value = "Include audience sizing in result or not", defaultValue="false") @DefaultValue("false")  @QueryParam("include_sizing") Boolean includeSizing, @ApiParam(value = "Search keyword for targeting templates")  @QueryParam("search_query") String searchQuery,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark) {
        return delegate.targetingTemplateList(adAccountId, order, includeSizing, searchQuery, pageSize, bookmark, securityContext);
    }

    @PATCH
    @Path("/{ad_account_id}/targeting_templates")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update targeting templates", notes = "<p>Update the targeting template given advertiser ID and targeting template ID</p>", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "targeting_template" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid ad account id.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response targetingTemplateUpdate( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Operation type and targeting template ID" ,required=true) TargetingTemplateUpdateRequest targetingTemplateUpdateRequest) {
        return delegate.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequest, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response templatesList( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING")  @QueryParam("order") String order, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark) {
        return delegate.templatesList(adAccountId, pageSize, order, bookmark, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response termsOfServiceGet( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "Return HTML in TOS text.", defaultValue="false") @DefaultValue("false")  @QueryParam("include_html") Boolean includeHtml, @ApiParam(value = "Request type.")  @QueryParam("tos_type") String tosType) {
        return delegate.termsOfServiceGet(adAccountId, includeHtml, tosType, securityContext);
    }

    @PATCH
    @Path("/{ad_account_id}/audiences/ad_accounts/shared")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update audience sharing between ad accounts", notes = "From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.", response = SharedAudienceResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SharedAudienceResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account id.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response updateAdAccountToAdAccountSharedAudience( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "" ,required=true) SharedAudience sharedAudience) {
        return delegate.updateAdAccountToAdAccountSharedAudience(adAccountId, sharedAudience, securityContext);
    }

    @PATCH
    @Path("/{ad_account_id}/audiences/businesses/shared")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update audience sharing from an ad account to businesses", notes = "From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.", response = BusinessSharedAudienceResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BusinessSharedAudienceResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account id.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response updateAdAccountToBusinessSharedAudience( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.",required=true) @PathParam("ad_account_id") String adAccountId, @ApiParam(value = "" ,required=true) BusinessSharedAudience businessSharedAudience) {
        return delegate.updateAdAccountToBusinessSharedAudience(adAccountId, businessSharedAudience, securityContext);
    }
}
