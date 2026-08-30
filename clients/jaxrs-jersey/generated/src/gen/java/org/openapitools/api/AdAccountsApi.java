package org.openapitools.api;

import org.openapitools.api.AdAccountsApiService;
import org.openapitools.api.factories.AdAccountsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Ad;
import org.openapitools.model.AdAccount;
import org.openapitools.model.AdAccountAnalyticsItems;
import org.openapitools.model.AdAccountCreate;
import org.openapitools.model.AdAccountToAdAccountSharedAudience;
import org.openapitools.model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody;
import org.openapitools.model.AdAccountToBusinessSharedAudience;
import org.openapitools.model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody;
import org.openapitools.model.AdAccountsAudience;
import org.openapitools.model.AdAccountsAudienceCreate;
import org.openapitools.model.AdAccountsAudienceUpdate;
import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.model.AdAccountsList200Response;
import org.openapitools.model.AdAccountsSubscriptionsGetList200Response;
import org.openapitools.model.AdBatchUpdate;
import org.openapitools.model.AdBatchWriteResponseModel;
import org.openapitools.model.AdCreate;
import org.openapitools.model.AdGroup;
import org.openapitools.model.AdGroupAudienceSizing;
import org.openapitools.model.AdGroupAudienceSizingCreate;
import org.openapitools.model.AdGroupCreateCreate;
import org.openapitools.model.AdGroupUpdateBatchUpdate;
import org.openapitools.model.AdGroupsAnalyticsMetrics;
import org.openapitools.model.AdGroupsCreate200Response;
import org.openapitools.model.AdGroupsList200Response;
import org.openapitools.model.AdPinAnalytics;
import org.openapitools.model.AdPreviewRequest;
import org.openapitools.model.AdPreviewURLResponse;
import org.openapitools.model.AdsAnalytics;
import org.openapitools.model.AdsAnalyticsAccountTargetingType;
import org.openapitools.model.AdsAnalyticsAdGroupTargetingType;
import org.openapitools.model.AdsAnalyticsAdTargetingType;
import org.openapitools.model.AdsAnalyticsCampaignTargetingType;
import org.openapitools.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.model.AdsCreditRedeem;
import org.openapitools.model.AdsCreditRedeemCreate;
import org.openapitools.model.AdsCreditsDiscountsGet200Response;
import org.openapitools.model.AdsList200Response;
import org.openapitools.model.AdvertiserDefinedEventsCreate200Response;
import org.openapitools.model.AdvertiserDefinedEventsCreateRequest;
import org.openapitools.model.AdvertiserDefinedEventsGet200Response;
import org.openapitools.model.AudienceAccountType;
import org.openapitools.model.AudienceInsightType;
import org.openapitools.model.AudienceInsights;
import org.openapitools.model.AudienceInsightsScopeAndTypeGet200Response;
import org.openapitools.model.AudienceOwnershipType;
import org.openapitools.model.AudiencesList200Response;
import org.openapitools.model.BidFloor;
import org.openapitools.model.BidFloorCreate;
import java.math.BigDecimal;
import org.openapitools.model.BillingInvoiceDocumentType;
import org.openapitools.model.BillingInvoiceDownloadResponse;
import org.openapitools.model.BillingInvoiceSortField;
import org.openapitools.model.BillingInvoiceStatus;
import org.openapitools.model.BillingInvoicesGet200Response;
import org.openapitools.model.BillingProfilesGet200Response;
import org.openapitools.model.BulkDownload;
import org.openapitools.model.BulkDownloadCreate;
import org.openapitools.model.BulkJobData;
import org.openapitools.model.BulkUpsertRequest;
import org.openapitools.model.BulkUpsertResponse;
import org.openapitools.model.Campaign;
import org.openapitools.model.CampaignAdPreview;
import org.openapitools.model.CampaignAdPreviewCreate;
import org.openapitools.model.CampaignAdPreviewCreate200ResponseInner;
import org.openapitools.model.CampaignAdPreviewDelete200ResponseInner;
import org.openapitools.model.CampaignBatchUpdateItem;
import org.openapitools.model.CampaignBatchWriteResponseModel;
import org.openapitools.model.CampaignCreateItem;
import org.openapitools.model.CampaignDeliveryEstimatesCampaign;
import org.openapitools.model.CampaignDeliveryEstimatesResponse;
import org.openapitools.model.CampaignsAnalyticsMetrics;
import org.openapitools.model.CampaignsList200Response;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionDeletionRequest;
import org.openapitools.model.ConversionDeletionRequestCreate;
import org.openapitools.model.ConversionDeletionRequestList200Response;
import org.openapitools.model.ConversionEventResponse;
import org.openapitools.model.ConversionEvents;
import org.openapitools.model.ConversionEventsCreate;
import org.openapitools.model.ConversionMSOTEventsCreate;
import org.openapitools.model.ConversionProductReport;
import org.openapitools.model.ConversionProductReportCreate;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.ConversionTag;
import org.openapitools.model.ConversionTagCreate;
import org.openapitools.model.ConversionTagsList200Response;
import org.openapitools.model.CustomerList;
import org.openapitools.model.CustomerListCreate;
import org.openapitools.model.CustomerListUpdateWithRequiredBody;
import org.openapitools.model.CustomerListUpload;
import org.openapitools.model.CustomerListUploadCreateRequest;
import org.openapitools.model.CustomerListUploadCreateResponse;
import org.openapitools.model.CustomerListsList200Response;
import org.openapitools.model.CustomerSegment;
import org.openapitools.model.CustomerSegmentCreate;
import org.openapitools.model.CustomerSegmentList200Response;
import org.openapitools.model.CustomerSegmentUpdateRequestUpdateWithRequiredBody;
import java.util.Date;
import org.openapitools.model.DetailedError;
import org.openapitools.model.DynamicTitlesDownloadCSV;
import org.openapitools.model.DynamicTitlesGetStatus;
import org.openapitools.model.DynamicTitlesProcessCSV;
import org.openapitools.model.DynamicTitlesProcessCSVCreate;
import org.openapitools.model.DynamicTitlesUploadURL;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.EventQualityScore;
import org.openapitools.model.Granularity;
import org.openapitools.model.IngestionSourceOptions;
import org.openapitools.model.Keywords;
import org.openapitools.model.KeywordsCreate;
import org.openapitools.model.KeywordsGet200Response;
import org.openapitools.model.KeywordsMetricsArrayResponse;
import org.openapitools.model.KeywordsUpdate;
import org.openapitools.model.LabelCreateRequest;
import org.openapitools.model.LabelUpdateRequest;
import org.openapitools.model.LabeledEntities;
import org.openapitools.model.LabeledEntitiesCreate;
import org.openapitools.model.LabelsList200Response;
import org.openapitools.model.LabelsResponse;
import org.openapitools.model.LeadForm;
import org.openapitools.model.LeadFormBatchUpdate;
import org.openapitools.model.LeadFormCreate;
import org.openapitools.model.LeadFormTest;
import org.openapitools.model.LeadFormTestCreate;
import org.openapitools.model.LeadFormsCreate200Response;
import org.openapitools.model.LeadFormsList200Response;
import org.openapitools.model.LeadSubscription;
import org.openapitools.model.LeadSubscriptionPostParamsCreate;
import org.openapitools.model.LeadsExportResponseData;
import org.openapitools.model.LeadsExports;
import org.openapitools.model.LeadsExportsCreate;
import org.openapitools.model.LookbackPeriodOptions;
import org.openapitools.model.MMMReport;
import org.openapitools.model.MMMReportCreate;
import java.util.Map;
import org.openapitools.model.MatchType;
import org.openapitools.model.MetricsResponse;
import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLinesList200Response;
import org.openapitools.model.PageVisitConversionTagsGet200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.ProductGroupAnalyticsItems;
import org.openapitools.model.ProductGroupPromotion;
import org.openapitools.model.ProductGroupPromotions;
import org.openapitools.model.ProductGroupPromotionsCreate;
import org.openapitools.model.ProductGroupPromotionsList200Response;
import org.openapitools.model.ProductGroupPromotionsUpdateWithRequiredBody;
import org.openapitools.model.Promotion;
import org.openapitools.model.PromotionBatchUpdate;
import org.openapitools.model.PromotionCreate;
import org.openapitools.model.PromotionsList200Response;
import org.openapitools.model.PromotionsResponse;
import org.openapitools.model.QueryLabelEntityStatusesItems;
import org.openapitools.model.QueryLabelTypesItems;
import org.openapitools.model.ReportingColumnSync;
import org.openapitools.model.ReportingTimeZone;
import org.openapitools.model.SSIOAccount;
import org.openapitools.model.SSIOInsertionOrder;
import org.openapitools.model.SSIOInsertionOrderCreate;
import org.openapitools.model.SSIOInsertionOrderStatusResponse;
import org.openapitools.model.SSIOInsertionOrderUpdate;
import org.openapitools.model.Schedule;
import org.openapitools.model.ScheduleBatchUpdate;
import org.openapitools.model.ScheduleCreate;
import org.openapitools.model.ScheduleStatus;
import org.openapitools.model.ScheduleType;
import org.openapitools.model.SchedulesCreate200ResponseInner;
import org.openapitools.model.SchedulesList200Response;
import org.openapitools.model.SourcePlatformOptions;
import org.openapitools.model.SsioInsertionOrdersStatusGetByAdAccount200Response;
import org.openapitools.model.SsioOrderLinesGetByAdAccount200Response;
import org.openapitools.model.TargetingTemplate;
import org.openapitools.model.TargetingTemplateCreate;
import org.openapitools.model.TargetingTemplateList200Response;
import org.openapitools.model.TargetingTemplateUpdateRequestReadOrUpdate;
import org.openapitools.model.TemplateBasedReport;
import org.openapitools.model.TemplatesList200Response;
import org.openapitools.model.TermsOfService;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/ad_accounts")


@io.swagger.annotations.Api(description = "the ad_accounts API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-30T09:54:14.357431345Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountsApi  {
   private final AdAccountsApiService delegate;

   public AdAccountsApi(@Context ServletConfig servletContext) {
      AdAccountsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AdAccountsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AdAccountsApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = AdAccountsApiServiceFactory.getAdAccountsApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    @Path("/{ad_account_id}/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad account analytics", notes = "  Get analytics for the specified `ad_account_id`, filtered by the specified options.    - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.", response = AdAccountAnalyticsItems.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdAccountAnalyticsItems.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adAccountAnalytics(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @QueryParam("start_date") @NotNull  Date startDate,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @QueryParam("end_date") @NotNull  Date endDate,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @QueryParam("columns") @NotNull  List<ReportingColumnSync> columns,@ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") @NotNull  Granularity granularity,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("click_window_days")  BigDecimal clickWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("engagement_window_days")  BigDecimal engagementWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "1") @DefaultValue("1") @QueryParam("view_window_days")  BigDecimal viewWindowDays,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue = "TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time")  String conversionReportTime,@ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE") @QueryParam("reporting_timezone")  ReportingTimeZone reportingTimezone,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adAccountAnalytics(startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/targeting_analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get targeting analytics for an ad account", notes = "Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/>  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.", response = MetricsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = MetricsResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adAccountTargetingAnalyticsGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @QueryParam("start_date") @NotNull  Date startDate,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @QueryParam("end_date") @NotNull  Date endDate,@ApiParam(value = "Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.", required = true) @QueryParam("targeting_types") @NotNull  @Size(min=1,max=15) List<AdsAnalyticsAccountTargetingType> targetingTypes,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @QueryParam("columns") @NotNull  List<ReportingColumnSync> columns,@ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") @NotNull  Granularity granularity,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("click_window_days")  BigDecimal clickWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("engagement_window_days")  BigDecimal engagementWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "1") @DefaultValue("1") @QueryParam("view_window_days")  BigDecimal viewWindowDays,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue = "TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time")  String conversionReportTime,@ApiParam(value = "List of types of attribution for the conversion report") @QueryParam("attribution_types")  @Size(max=2) List<ConversionReportAttributionType> attributionTypes,@ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE") @QueryParam("reporting_timezone")  ReportingTimeZone reportingTimezone,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/audiences/shared/accounts")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List accounts with access to an audience owned by an ad account", notes = "List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.", response = AdAccountsAudiencesSharedAccountsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "audience_sharing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdAccountsAudiencesSharedAccountsList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adAccountsAudiencesSharedAccountsList(@ApiParam(value = "Unique identifier of the audience to use to filter the results.", required = true) @QueryParam("audience_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String audienceId,@ApiParam(value = "Filter accounts by account type.", required = true, allowableValues="AD_ACCOUNT, BUSINESS_ACCOUNT") @QueryParam("account_type") @NotNull  AudienceAccountType accountType,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adAccountsAudiencesSharedAccountsList(audienceId, accountType, adAccountId, bookmark, pageSize, securityContext);
    }
    @javax.ws.rs.POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create ad account", notes = "Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).", response = AdAccount.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdAccount.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = AdAccount.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adAccountsCreate(@ApiParam(value = "", required = true) @NotNull @Valid  AdAccountCreate adAccountCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adAccountsCreate(adAccountCreate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad account", notes = "Get an ad account", response = AdAccount.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdAccount.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adAccountsGet(@ApiParam(value = "", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adAccountsGet(adAccountId, securityContext);
    }
    @javax.ws.rs.GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List ad accounts", notes = "Get a list of the ad_accounts that the \"operation user_account\" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).", response = AdAccountsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdAccountsList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adAccountsList(@ApiParam(value = "Include shared ad accounts", defaultValue = "true") @DefaultValue("true") @QueryParam("include_shared_accounts")  Boolean includeSharedAccounts,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adAccountsList(includeSharedAccounts, bookmark, pageSize, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{ad_account_id}/leads/subscriptions/{subscription_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete lead ads subscription", notes = "Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'", response = LeadSubscription.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "lead_ads", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = LeadSubscription.class),
        @io.swagger.annotations.ApiResponse(code = 204, message = "Resource deleted successfully.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adAccountsSubscriptionsDelById(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Unique identifier of a subscription.", required = true) @PathParam("subscription_id") @NotNull  @Pattern(regexp="^\\d+$") String subscriptionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adAccountsSubscriptionsDelById(adAccountId, subscriptionId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/leads/subscriptions/{subscription_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get lead ads subscription by ID", notes = "Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'", response = LeadSubscription.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "lead_ads", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = LeadSubscription.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adAccountsSubscriptionsGetById(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Unique identifier of a subscription.", required = true) @PathParam("subscription_id") @NotNull  @Pattern(regexp="^\\d+$") String subscriptionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adAccountsSubscriptionsGetById(adAccountId, subscriptionId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/leads/subscriptions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get lead ads subscriptions", notes = "Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.", response = AdAccountsSubscriptionsGetList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "lead_ads", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdAccountsSubscriptionsGetList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adAccountsSubscriptionsGetList(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adAccountsSubscriptionsGetList(adAccountId, bookmark, pageSize, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/leads/subscriptions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create lead ads subscription", notes = "Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.", response = LeadSubscription.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "lead_ads", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = LeadSubscription.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adAccountsSubscriptionsPost(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adAccountsSubscriptionsPost(adAccountId, leadSubscriptionPostParamsCreate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/ad_groups/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad group analytics", notes = "Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.", response = AdGroupsAnalyticsMetrics.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdGroupsAnalyticsMetrics.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adGroupsAnalytics(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @QueryParam("start_date") @NotNull  Date startDate,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @QueryParam("end_date") @NotNull  Date endDate,@ApiParam(value = "List of Ad group Ids to use to filter the results.", required = true) @QueryParam("ad_group_ids") @NotNull  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @QueryParam("columns") @NotNull  List<ReportingColumnSync> columns,@ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") @NotNull  Granularity granularity,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("click_window_days")  BigDecimal clickWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("engagement_window_days")  BigDecimal engagementWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "1") @DefaultValue("1") @QueryParam("view_window_days")  BigDecimal viewWindowDays,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue = "TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time")  String conversionReportTime,@ApiParam(value = "Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.", defaultValue = "false") @DefaultValue("false") @QueryParam("aggregate_report_rows")  Boolean aggregateReportRows,@ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE") @QueryParam("reporting_timezone")  ReportingTimeZone reportingTimezone,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adGroupsAnalytics(startDate, endDate, adGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/ad_groups/audience_sizing")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get audience sizing", notes = "Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.", response = AdGroupAudienceSizing.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdGroupAudienceSizing.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = AdGroupAudienceSizing.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adGroupsAudienceSizing(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  AdGroupAudienceSizingCreate adGroupAudienceSizingCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingCreate, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/bid_floor")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get bid floors", notes = "List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).", response = BidFloor.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BidFloor.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = BidFloor.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adGroupsBidFloorGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  BidFloorCreate bidFloorCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adGroupsBidFloorGet(adAccountId, bidFloorCreate, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/ad_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create ad groups", notes = "Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.", response = AdGroupsCreate200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdGroupsCreate200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adGroupsCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  @Size(min=1,max=30) List<@Valid AdGroupCreateCreate> adGroupCreateCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adGroupsCreate(adAccountId, adGroupCreateCreate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get dynamic titles CSV download URL", notes = "Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.", response = DynamicTitlesDownloadCSV.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = DynamicTitlesDownloadCSV.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adGroupsDynamicTitlesDownloadCsv(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Ad group ID.", required = true) @PathParam("ad_group_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adGroupsDynamicTitlesDownloadCsv(adAccountId, adGroupId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get dynamic titles status", notes = "Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.", response = DynamicTitlesGetStatus.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = DynamicTitlesGetStatus.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adGroupsDynamicTitlesGetStatus(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Ad group ID.", required = true) @PathParam("ad_group_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adGroupsDynamicTitlesGetStatus(adAccountId, adGroupId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get dynamic titles upload URL", notes = "Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.", response = DynamicTitlesUploadURL.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = DynamicTitlesUploadURL.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adGroupsDynamicTitlesGetUploadUrl(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Ad group ID.", required = true) @PathParam("ad_group_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adGroupsDynamicTitlesGetUploadUrl(adAccountId, adGroupId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Process dynamic titles CSV", notes = "Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.", response = DynamicTitlesProcessCSV.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = DynamicTitlesProcessCSV.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = DynamicTitlesProcessCSV.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adGroupsDynamicTitlesProcessCsv(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Ad group ID.", required = true) @PathParam("ad_group_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId,@ApiParam(value = "", required = true) @NotNull @Valid  DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adGroupsDynamicTitlesProcessCsv(adAccountId, adGroupId, dynamicTitlesProcessCSVCreate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/ad_groups/{ad_group_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad group", notes = "Get a specific ad group given the ad group ID.", response = AdGroup.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdGroup.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adGroupsGet(@ApiParam(value = "Ad group ID.", required = true) @PathParam("ad_group_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adGroupsGet(adGroupId, adAccountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/ad_groups")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List ad groups", notes = "List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.", response = AdGroupsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdGroupsList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adGroupsList(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order")  PinterestLibPaginationOrder order,@ApiParam(value = "List of Campaign Ids to use to filter the results.") @QueryParam("campaign_ids")  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,@ApiParam(value = "List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.") @QueryParam("ad_group_ids")  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")String> adGroupIds,@ApiParam(value = "Entity status") @QueryParam("entity_statuses")  List<EntityStatus> entityStatuses,@ApiParam(value = "Return interests as text names (if value is true) rather than topic IDs.", defaultValue = "false") @DefaultValue("false") @QueryParam("translate_interests_to_names")  Boolean translateInterestsToNames,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adGroupsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, entityStatuses, translateInterestsToNames, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/ad_groups/targeting_analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get targeting analytics for ad groups", notes = "Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.", response = MetricsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = MetricsResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adGroupsTargetingAnalyticsGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "List of Ad group Ids to use to filter the results.", required = true) @QueryParam("ad_group_ids") @NotNull  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @QueryParam("start_date") @NotNull  Date startDate,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @QueryParam("end_date") @NotNull  Date endDate,@ApiParam(value = "Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.", required = true) @QueryParam("targeting_types") @NotNull  @Size(min=1,max=14) List<AdsAnalyticsAdGroupTargetingType> targetingTypes,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @QueryParam("columns") @NotNull  List<ReportingColumnSync> columns,@ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") @NotNull  Granularity granularity,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("click_window_days")  BigDecimal clickWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("engagement_window_days")  BigDecimal engagementWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "1") @DefaultValue("1") @QueryParam("view_window_days")  BigDecimal viewWindowDays,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue = "TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time")  String conversionReportTime,@ApiParam(value = "List of types of attribution for the conversion report") @QueryParam("attribution_types")  @Size(max=2) List<ConversionReportAttributionType> attributionTypes,@ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE") @QueryParam("reporting_timezone")  ReportingTimeZone reportingTimezone,@ApiParam(value = "Sort Columns.") @QueryParam("sort_columns")  @Size(min=1,max=2) List<String> sortColumns,@ApiParam(value = "Sort ascending.") @QueryParam("sort_ascending")  Boolean sortAscending,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{ad_account_id}/ad_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update ad groups", notes = "Update multiple existing ad groups.", response = AdGroupsCreate200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdGroupsCreate200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adGroupsUpdate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  @Size(min=1,max=30) List<@Valid AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adGroupsUpdate(adAccountId, adGroupUpdateBatchUpdate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/pins/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get pins analytics", notes = "Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.", response = AdPinAnalytics.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "campaigns", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdPinAnalytics.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adPinsAnalytics(@ApiParam(value = "Campaign Id to use to filter the results.", required = true) @QueryParam("campaign_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String campaignId,@ApiParam(value = "List of Pin IDs.", required = true) @QueryParam("pin_ids") @NotNull  @Size(min=1,max=100) List<@Pattern(regexp = "^\\d+$")String> pinIds,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @QueryParam("start_date") @NotNull  Date startDate,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @QueryParam("end_date") @NotNull  Date endDate,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @QueryParam("columns") @NotNull  List<ReportingColumnSync> columns,@ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") @NotNull  Granularity granularity,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("click_window_days")  BigDecimal clickWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("engagement_window_days")  BigDecimal engagementWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "1") @DefaultValue("1") @QueryParam("view_window_days")  BigDecimal viewWindowDays,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue = "TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time")  String conversionReportTime,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adPinsAnalytics(campaignId, pinIds, startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/ad_previews")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create ad preview with pin or image", notes = "Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.", response = AdPreviewURLResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "ads", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdPreviewURLResponse.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = AdPreviewURLResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adPreviewsCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  AdPreviewRequest adPreviewRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adPreviewsCreate(adAccountId, adPreviewRequest, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/ads/targeting_analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get targeting analytics for ads", notes = "Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.", response = MetricsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ads", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = MetricsResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adTargetingAnalyticsGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "List of Ad Ids to use to filter the results.", required = true) @QueryParam("ad_ids") @NotNull  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")String> adIds,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @QueryParam("start_date") @NotNull  Date startDate,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @QueryParam("end_date") @NotNull  Date endDate,@ApiParam(value = "Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.", required = true) @QueryParam("targeting_types") @NotNull  @Size(min=1,max=14) List<AdsAnalyticsAdTargetingType> targetingTypes,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @QueryParam("columns") @NotNull  List<ReportingColumnSync> columns,@ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") @NotNull  Granularity granularity,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60") @QueryParam("click_window_days")  ConversionAttributionWindowDays clickWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", allowableValues="0, 1, 7, 14, 30, 60") @QueryParam("engagement_window_days")  ConversionAttributionWindowDays engagementWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60") @QueryParam("view_window_days")  ConversionAttributionWindowDays viewWindowDays,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION") @QueryParam("conversion_report_time")  ConversionReportTimeType conversionReportTime,@ApiParam(value = "List of types of attribution for the conversion report") @QueryParam("attribution_types")  @Size(max=2) List<ConversionReportAttributionType> attributionTypes,@ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE") @QueryParam("reporting_timezone")  ReportingTimeZone reportingTimezone,@ApiParam(value = "Sort Columns.") @QueryParam("sort_columns")  @Size(min=1,max=2) List<String> sortColumns,@ApiParam(value = "Sort ascending.") @QueryParam("sort_ascending")  Boolean sortAscending,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/ads/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad analytics", notes = "    Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.", response = AdsAnalytics.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ads", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdsAnalytics.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adsAnalytics(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @QueryParam("start_date") @NotNull  Date startDate,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @QueryParam("end_date") @NotNull  Date endDate,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @QueryParam("columns") @NotNull  List<ReportingColumnSync> columns,@ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") @NotNull  Granularity granularity,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "List of Pin IDs.") @QueryParam("pin_ids")  @Size(min=1,max=100) List<String> pinIds,@ApiParam(value = "List of Ad Ids to use to filter the results.") @QueryParam("ad_ids")  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")String> adIds,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("click_window_days")  BigDecimal clickWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("engagement_window_days")  BigDecimal engagementWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "1") @DefaultValue("1") @QueryParam("view_window_days")  BigDecimal viewWindowDays,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue = "TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time")  String conversionReportTime,@ApiParam(value = "List of Campaign Ids to use to filter the results.") @QueryParam("campaign_ids")  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,@ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE") @QueryParam("reporting_timezone")  ReportingTimeZone reportingTimezone,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adsAnalytics(startDate, endDate, columns, granularity, adAccountId, pinIds, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, campaignIds, reportingTimezone, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/ads")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create ads", notes = "Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.", response = AdBatchWriteResponseModel.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "ads", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdBatchWriteResponseModel.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adsCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  @Size(min=1,max=30) List<@Valid AdCreate> adCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adsCreate(adAccountId, adCreate, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/ads_credit/redeem")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Redeem ad credits", notes = "Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**", response = AdsCreditRedeem.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc."),
            @io.swagger.annotations.AuthorizationScope(scope = "billing:write", description = "Create, update, or delete billing data, billing profiles, etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdsCreditRedeem.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = AdsCreditRedeem.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adsCreditRedeem(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  AdsCreditRedeemCreate adsCreditRedeemCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adsCreditRedeem(adAccountId, adsCreditRedeemCreate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/ads_credit/discounts")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ads credit discounts", notes = "Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**", response = AdsCreditsDiscountsGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc."),
            @io.swagger.annotations.AuthorizationScope(scope = "billing:read", description = "See all of your billing data, billing profile, etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdsCreditsDiscountsGet200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adsCreditsDiscountsGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adsCreditsDiscountsGet(adAccountId, bookmark, pageSize, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/ads/{ad_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ad", notes = "Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).", response = Ad.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ads", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = Ad.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adsGet(@ApiParam(value = "The ID of this ad.", required = true) @PathParam("ad_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adId,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adsGet(adId, adAccountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/ads")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List ads", notes = "List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).", response = AdsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ads", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdsList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adsList(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order")  PinterestLibPaginationOrder order,@ApiParam(value = "List of Campaign Ids to use to filter the results.") @QueryParam("campaign_ids")  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,@ApiParam(value = "List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.") @QueryParam("ad_group_ids")  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")String> adGroupIds,@ApiParam(value = "List of Ad Ids to use to filter the results.") @QueryParam("ad_ids")  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")String> adIds,@ApiParam(value = "Entity status") @QueryParam("entity_statuses")  List<EntityStatus> entityStatuses,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, adIds, entityStatuses, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{ad_account_id}/ads")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update ads", notes = "Update multiple existing ads", response = AdBatchWriteResponseModel.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "ads", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdBatchWriteResponseModel.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response adsUpdate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  @Size(min=1,max=30) List<@Valid AdBatchUpdate> adBatchUpdate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adsUpdate(adAccountId, adBatchUpdate, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/advertiser_defined_events")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create advertiser defined events", notes = "Map advertiser defined events to standard events for the given ad account.", response = AdvertiserDefinedEventsCreate200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdvertiserDefinedEventsCreate200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response advertiserDefinedEventsCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.advertiserDefinedEventsCreate(adAccountId, advertiserDefinedEventsCreateRequest, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{ad_account_id}/advertiser_defined_events")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete advertiser defined events", notes = "Untrack advertiser defined events for the given ad account.", response = AdvertiserDefinedEventsCreate200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdvertiserDefinedEventsCreate200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response advertiserDefinedEventsDelete(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "List of event names to delete", required = true) @QueryParam("event_names") @NotNull  List<String> eventNames,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.advertiserDefinedEventsDelete(adAccountId, eventNames, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/advertiser_defined_events")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get advertiser defined events", notes = "Get advertiser defined events for the given ad account.", response = AdvertiserDefinedEventsGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdvertiserDefinedEventsGet200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response advertiserDefinedEventsGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.advertiserDefinedEventsGet(adAccountId, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{ad_account_id}/advertiser_defined_events")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update advertiser defined events", notes = "Update advertiser defined event names or mappings for the given ad account.", response = AdvertiserDefinedEventsCreate200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdvertiserDefinedEventsCreate200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response advertiserDefinedEventsUpdate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.advertiserDefinedEventsUpdate(adAccountId, advertiserDefinedEventsCreateRequest, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/reports/brand_category_sku")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a request for a brand, category, SKU report", notes = "  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.", response = ConversionProductReport.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ConversionProductReport.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = ConversionProductReport.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response analyticsCreateConversionProductReport(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  ConversionProductReportCreate conversionProductReportCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.analyticsCreateConversionProductReport(adAccountId, conversionProductReportCreate, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/mmm_reports")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a request for a Marketing Mix Modeling (MMM) report", notes = "    This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it's in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we'll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.", response = MMMReport.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = MMMReport.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = MMMReport.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response analyticsCreateMmmReport(@ApiParam(value = "", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  MMMReportCreate mmMReportCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.analyticsCreateMmmReport(adAccountId, mmMReportCreate, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/reports")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create async request for an account analytics report", notes = "  This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.", response = AdsAnalyticsCreateAsyncResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdsAnalyticsCreateAsyncResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response analyticsCreateReport(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/templates/{template_id}/reports")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create async request for an analytics report using a template", notes = "  This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.", response = TemplateBasedReport.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = TemplateBasedReport.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = TemplateBasedReport.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response analyticsCreateTemplateReport(@ApiParam(value = "", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Unique identifier of a template.", required = true) @PathParam("template_id") @NotNull  @Size(max=18) String templateId,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.") @QueryParam("start_date")  Date startDate,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.") @QueryParam("end_date")  Date endDate,@ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity")  Granularity granularity,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.analyticsCreateTemplateReport(adAccountId, templateId, startDate, endDate, granularity, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/reports/brand_category_sku")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get advertiser brand, category, SKU report", notes = "  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.", response = ConversionProductReport.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ConversionProductReport.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response analyticsGetConversionProductReport(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Token returned from the post request creation call", required = true) @QueryParam("token") @NotNull  String token,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.analyticsGetConversionProductReport(adAccountId, token, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/mmm_reports")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get advertiser Marketing Mix Modeling (MMM) report.", notes = "    Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.", response = MMMReport.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = MMMReport.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response analyticsGetMmmReport(@ApiParam(value = "", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Token returned from the post request creation call", required = true) @QueryParam("token") @NotNull  String token,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.analyticsGetMmmReport(adAccountId, token, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/reports")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get the account analytics report created by the async call", notes = "  This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.", response = AdsAnalyticsGetAsyncResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdsAnalyticsGetAsyncResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response analyticsGetReport(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Token returned from the post request creation call", required = true) @QueryParam("token") @NotNull  String token,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.analyticsGetReport(adAccountId, token, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/audience_insights")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get audience insights", notes = "Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.  [Learn more about Audience Insights](https://help.pinterest.com/en/business/article/audience-insights).", response = AudienceInsights.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "audience_insights", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AudienceInsights.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response audienceInsightsGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Type of audience insights.", required = true, allowableValues="YOUR_TOTAL_AUDIENCE, YOUR_ENGAGED_AUDIENCE, PINTEREST_TOTAL_AUDIENCE") @QueryParam("audience_insight_type") @NotNull  AudienceInsightType audienceInsightType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.audienceInsightsGet(adAccountId, audienceInsightType, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/insights/audiences")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get audience insights scope and type", notes = "Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.", response = AudienceInsightsScopeAndTypeGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "audience_insights", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AudienceInsightsScopeAndTypeGet200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response audienceInsightsScopeAndTypeGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.audienceInsightsScopeAndTypeGet(adAccountId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/audiences")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create audience", notes = "Create a new audience for the ad account.", response = AdAccountsAudience.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "audiences", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdAccountsAudience.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = AdAccountsAudience.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response audiencesCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  AdAccountsAudienceCreate adAccountsAudienceCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.audiencesCreate(adAccountId, adAccountsAudienceCreate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/audiences/{audience_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get audience", notes = "Get a specific audience given the audience ID.", response = AdAccountsAudience.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "audiences", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdAccountsAudience.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response audiencesGet(@ApiParam(value = "Audience ID.", required = true) @PathParam("audience_id") @NotNull  @Pattern(regexp="^\\d+$") String audienceId,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.audiencesGet(audienceId, adAccountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/audiences")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List audiences", notes = "Get list of audiences for the ad account.", response = AudiencesList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "audiences", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AudiencesList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response audiencesList(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order")  PinterestLibPaginationOrder order,@ApiParam(value = "", allowableValues="OWNED, RECEIVED") @QueryParam("ownership_type")  AudienceOwnershipType ownershipType,@ApiParam(value = "When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).", defaultValue = "false") @DefaultValue("false") @QueryParam("exclude_nca")  Boolean excludeNca,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.audiencesList(adAccountId, bookmark, pageSize, order, ownershipType, excludeNca, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{ad_account_id}/audiences/{audience_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update audience", notes = "Update an existing audience for the ad account.", response = AdAccountsAudience.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "audiences", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdAccountsAudience.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response audiencesUpdate(@ApiParam(value = "Audience ID.", required = true) @PathParam("audience_id") @NotNull  @Pattern(regexp="^\\d+$") String audienceId,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  AdAccountsAudienceUpdate adAccountsAudienceUpdate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.audiencesUpdate(audienceId, adAccountId, adAccountsAudienceUpdate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/billing_invoice/{billing_invoice_id}/download")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get download url for a billing invoice", notes = "Get download url for a billing invoice.", response = BillingInvoiceDownloadResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc."),
            @io.swagger.annotations.AuthorizationScope(scope = "billing:read", description = "See all of your billing data, billing profile, etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BillingInvoiceDownloadResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response billingInvoiceDownloadGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Unique identifier of a billing invoice.", required = true) @PathParam("billing_invoice_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String billingInvoiceId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.billingInvoiceDownloadGet(adAccountId, billingInvoiceId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/billing_invoices")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get billing invoices", notes = "Get billing invoices in the advertiser account.", response = BillingInvoicesGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc."),
            @io.swagger.annotations.AuthorizationScope(scope = "billing:read", description = "See all of your billing data, billing profile, etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BillingInvoicesGet200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response billingInvoicesGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order")  PinterestLibPaginationOrder order,@ApiParam(value = "Field of which to sort billing invoices", allowableValues="DUE_DATE, BILLING_PERIOD, DOCUMENT_TYPE, TOTAL_AMOUNT, INVOICE_NUMBER", defaultValue = "DUE_DATE") @DefaultValue("DUE_DATE") @QueryParam("sort")  BillingInvoiceSortField sort,@ApiParam(value = "Status of billing invoices to filter by", allowableValues="OPEN, CLOSED") @QueryParam("status")  BillingInvoiceStatus status,@ApiParam(value = "Document type of billing invoices to filter by", allowableValues="INVOICE, CREDIT_MEMO") @QueryParam("document_type")  BillingInvoiceDocumentType documentType,@ApiParam(value = "Starting point for due dates when searching for invoices. Format: YYYY-MM-DD") @QueryParam("start_due_date")  Date startDueDate,@ApiParam(value = "Ending point for due dates when searching for invoices. Format: YYYY-MM-DD") @QueryParam("end_due_date")  Date endDueDate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.billingInvoicesGet(adAccountId, bookmark, pageSize, order, sort, status, documentType, startDueDate, endDueDate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/billing_profiles")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get billing profiles", notes = "Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**", response = BillingProfilesGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc."),
            @io.swagger.annotations.AuthorizationScope(scope = "billing:read", description = "See all of your billing data, billing profile, etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BillingProfilesGet200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response billingProfilesGet(@ApiParam(value = "Return active billing profiles, if false return all billing profiles.", required = true) @QueryParam("is_active") @NotNull  Boolean isActive,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.billingProfilesGet(isActive, adAccountId, bookmark, pageSize, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/bulk/download")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get advertiser entities in bulk", notes = "Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.", response = BulkDownload.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "bulk", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BulkDownload.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = BulkDownload.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response bulkDownloadCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  BulkDownloadCreate bulkDownloadCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.bulkDownloadCreate(adAccountId, bulkDownloadCreate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/bulk/{bulk_request_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Download advertiser entities in bulk", notes = "Get the status of a bulk request by `request_id`, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).", response = BulkJobData.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "bulk", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BulkJobData.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response bulkRequestGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Bulk request ID that is from one of the entities bulk endpoints", required = true) @PathParam("bulk_request_id") @NotNull  String bulkRequestId,@ApiParam(value = "If set to True then attach the errors/details to all the requests", defaultValue = "false") @DefaultValue("false") @QueryParam("include_details")  Boolean includeDetails,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.bulkRequestGet(adAccountId, bulkRequestId, includeDetails, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/bulk/upsert")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create/update ad entities in bulk", notes = "Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.", response = BulkUpsertResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "bulk", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BulkUpsertResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = PinterestLibError.class)
    })
    public Response bulkUpsertCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Parameters to get create/update ad entities in bulk", required = true) @NotNull @Valid  BulkUpsertRequest bulkUpsertRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.bulkUpsertCreate(adAccountId, bulkUpsertRequest, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/campaign_ad_preview")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create ad preview records for one or more ad groups", notes = "Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.", response = CampaignAdPreviewCreate200ResponseInner.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "ads", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CampaignAdPreviewCreate200ResponseInner.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = CampaignAdPreview.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response campaignAdPreviewCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  List<@Valid CampaignAdPreviewCreate> campaignAdPreviewCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.campaignAdPreviewCreate(adAccountId, campaignAdPreviewCreate, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{ad_account_id}/campaign_ad_preview")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete ad preview records for one or more ad groups", notes = "Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.", response = CampaignAdPreviewDelete200ResponseInner.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "ads", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CampaignAdPreviewDelete200ResponseInner.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 204, message = "Resource deleted successfully.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response campaignAdPreviewDelete(@ApiParam(value = "List of Ad group Ids to use to filter the results.", required = true) @QueryParam("ad_group_ids") @NotNull  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.campaignAdPreviewDelete(adGroupIds, adAccountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/campaign_ad_preview")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Fetch ad preview records for one or more ad groups", notes = "Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.", response = CampaignAdPreview.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ads", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CampaignAdPreview.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response campaignAdPreviewRead(@ApiParam(value = "List of Ad group Ids to use to filter the results.", required = true) @QueryParam("ad_group_ids") @NotNull  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.campaignAdPreviewRead(adGroupIds, adAccountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/campaigns/targeting_analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get targeting analytics for campaigns", notes = "Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.", response = MetricsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "campaigns", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = MetricsResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response campaignTargetingAnalyticsGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "List of Campaign Ids to use to filter the results.", required = true) @QueryParam("campaign_ids") @NotNull  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @QueryParam("start_date") @NotNull  Date startDate,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @QueryParam("end_date") @NotNull  Date endDate,@ApiParam(value = "Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.", required = true) @QueryParam("targeting_types") @NotNull  @Size(min=1,max=14) List<AdsAnalyticsCampaignTargetingType> targetingTypes,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @QueryParam("columns") @NotNull  List<ReportingColumnSync> columns,@ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") @NotNull  Granularity granularity,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("click_window_days")  BigDecimal clickWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("engagement_window_days")  BigDecimal engagementWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "1") @DefaultValue("1") @QueryParam("view_window_days")  BigDecimal viewWindowDays,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue = "TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time")  String conversionReportTime,@ApiParam(value = "List of types of attribution for the conversion report") @QueryParam("attribution_types")  @Size(max=2) List<ConversionReportAttributionType> attributionTypes,@ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE") @QueryParam("reporting_timezone")  ReportingTimeZone reportingTimezone,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/campaigns/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get campaign analytics", notes = "Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.", response = CampaignsAnalyticsMetrics.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "campaigns", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CampaignsAnalyticsMetrics.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response campaignsAnalytics(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @QueryParam("start_date") @NotNull  Date startDate,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @QueryParam("end_date") @NotNull  Date endDate,@ApiParam(value = "List of Campaign Ids to use to filter the results.", required = true) @QueryParam("campaign_ids") @NotNull  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @QueryParam("columns") @NotNull  List<ReportingColumnSync> columns,@ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") @NotNull  Granularity granularity,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("click_window_days")  BigDecimal clickWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("engagement_window_days")  BigDecimal engagementWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "1") @DefaultValue("1") @QueryParam("view_window_days")  BigDecimal viewWindowDays,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue = "TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time")  String conversionReportTime,@ApiParam(value = "Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.", defaultValue = "false") @DefaultValue("false") @QueryParam("aggregate_report_rows")  Boolean aggregateReportRows,@ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE") @QueryParam("reporting_timezone")  ReportingTimeZone reportingTimezone,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.campaignsAnalytics(startDate, endDate, campaignIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/campaigns")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create campaigns", notes = "Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000", response = CampaignBatchWriteResponseModel.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "campaigns", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CampaignBatchWriteResponseModel.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response campaignsCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  @Size(min=1,max=30) List<@Valid CampaignCreateItem> campaignCreateItem,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.campaignsCreate(adAccountId, campaignCreateItem, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/campaigns/{campaign_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get campaign", notes = "Get a specific campaign given the campaign ID.", response = Campaign.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "campaigns", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = Campaign.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response campaignsGet(@ApiParam(value = "Campaign ID, must be associated with the ad account ID provided in the path.", required = true) @PathParam("campaign_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String campaignId,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.campaignsGet(campaignId, adAccountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/campaigns")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List campaigns", notes = "Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.", response = CampaignsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "campaigns", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CampaignsList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response campaignsList(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order")  PinterestLibPaginationOrder order,@ApiParam(value = "List of Campaign Ids to use to filter the results.") @QueryParam("campaign_ids")  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,@ApiParam(value = "Entity status") @QueryParam("entity_statuses")  List<EntityStatus> entityStatuses,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.campaignsList(adAccountId, bookmark, pageSize, order, campaignIds, entityStatuses, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{ad_account_id}/campaigns")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update campaigns", notes = "Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000", response = CampaignBatchWriteResponseModel.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "campaigns", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CampaignBatchWriteResponseModel.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response campaignsUpdate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  @Size(min=1,max=30) List<@Valid CampaignBatchUpdateItem> campaignBatchUpdateItem,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.campaignsUpdate(adAccountId, campaignBatchUpdateItem, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/conversion_deletion_requests")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a conversion deletion request", notes = "**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.", response = ConversionDeletionRequest.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversion_deletion_requests", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ConversionDeletionRequest.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = ConversionDeletionRequest.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response conversionDeletionRequestCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  ConversionDeletionRequestCreate conversionDeletionRequestCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.conversionDeletionRequestCreate(adAccountId, conversionDeletionRequestCreate, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{ad_account_id}/conversion_deletion_requests/{request_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a conversion deletion request", notes = "**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.", response = ConversionDeletionRequest.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversion_deletion_requests", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ConversionDeletionRequest.class),
        @io.swagger.annotations.ApiResponse(code = 204, message = "Resource deleted successfully.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response conversionDeletionRequestDelete(@ApiParam(value = "Unique identifier of the conversion deletion request", required = true) @PathParam("request_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String requestId,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.conversionDeletionRequestDelete(requestId, adAccountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/conversion_deletion_requests/{request_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a single conversion deletion request", notes = "**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.", response = ConversionDeletionRequest.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversion_deletion_requests", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ConversionDeletionRequest.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response conversionDeletionRequestGet(@ApiParam(value = "Unique identifier of the conversion deletion request", required = true) @PathParam("request_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String requestId,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.conversionDeletionRequestGet(requestId, adAccountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/conversion_deletion_requests")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List conversion deletion requests", notes = "**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.", response = ConversionDeletionRequestList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversion_deletion_requests", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ConversionDeletionRequestList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response conversionDeletionRequestList(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order")  PinterestLibPaginationOrder order,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.conversionDeletionRequestList(adAccountId, bookmark, pageSize, order, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/conversion_eqs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get event quality score (EQS)", notes = "Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.", response = EventQualityScore.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversion_eqs", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = EventQualityScore.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response conversionEqsList(@ApiParam(value = "Lookback window (number of days).", required = true, allowableValues="1d, 14d") @QueryParam("lookback_period") @NotNull  LookbackPeriodOptions lookbackPeriod,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Source platform of event.", allowableValues="WEB, MOBILE, MOBILE_ANDROID, MOBILE_IOS, OFFLINE, PINTEREST_WEB, PINTEREST_ANDROID, PINTEREST_IOS, POINT_OF_SALE") @QueryParam("source_platform")  SourcePlatformOptions sourcePlatform,@ApiParam(value = "Ingestion source of event.", allowableValues="TAG, MMP, FILE_UPLOAD, CONVERSIONS_API, NATIVE") @QueryParam("ingestion_source")  IngestionSourceOptions ingestionSource,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.conversionEqsList(lookbackPeriod, adAccountId, sourcePlatform, ingestionSource, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/conversion_tags")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create conversion tag", notes = "Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account's website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)", response = ConversionTag.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversion_tags", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ConversionTag.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = ConversionTag.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response conversionTagsCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  ConversionTagCreate conversionTagCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.conversionTagsCreate(adAccountId, conversionTagCreate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/conversion_tags/{conversion_tag_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get conversion tag", notes = "Get information about an existing conversion tag.", response = ConversionTag.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversion_tags", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ConversionTag.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response conversionTagsGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Id of the conversion tag.", required = true) @PathParam("conversion_tag_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String conversionTagId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.conversionTagsGet(adAccountId, conversionTagId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/conversion_tags")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List conversion tags", notes = "List conversion tags associated with an ad account.", response = ConversionTagsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversion_tags", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ConversionTagsList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response conversionTagsList(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Filter by deleted status", defaultValue = "false") @DefaultValue("false") @QueryParam("filter_deleted")  Boolean filterDeleted,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.conversionTagsList(adAccountId, filterDeleted, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/keywords/metrics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get country's keyword metrics", notes = "  See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \"Get delivery metrics definitions\"   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).", response = KeywordsMetricsArrayResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "keywords", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = KeywordsMetricsArrayResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response countryKeywordsMetricsGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Two letter country code (ISO 3166-1 alpha-2)", required = true) @QueryParam("country_code") @NotNull  String countryCode,@ApiParam(value = "Comma-separated keywords", required = true) @QueryParam("keywords") @NotNull  @Size(min=1,max=2000) List<String> keywords,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.countryKeywordsMetricsGet(adAccountId, countryCode, keywords, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/customer_lists/{customer_list_id}/uploads")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create customer list upload", notes = "Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**", response = CustomerListUploadCreateResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "customer_list_uploads", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CustomerListUploadCreateResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response customerListUploadsCreate(@ApiParam(value = "", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Customer list ID.", required = true) @PathParam("customer_list_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String customerListId,@ApiParam(value = "", required = true) @NotNull @Valid  CustomerListUploadCreateRequest customerListUploadCreateRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.customerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get customer list upload", notes = "Get the metadata for a given upload by its ID.", response = CustomerListUpload.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "customer_list_uploads", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CustomerListUpload.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response customerListUploadsGet(@ApiParam(value = "", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Customer list ID.", required = true) @PathParam("customer_list_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String customerListId,@ApiParam(value = "Customer List Upload ID.", required = true) @PathParam("customer_list_upload_id") @NotNull  @Pattern(regexp="^\\d+$") String customerListUploadId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.customerListUploadsGet(adAccountId, customerListId, customerListUploadId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Run customer list upload", notes = "Begin processing a customer list upload.", response = CustomerListUpload.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "customer_list_uploads", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CustomerListUpload.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response customerListUploadsRun(@ApiParam(value = "", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Customer list ID.", required = true) @PathParam("customer_list_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String customerListId,@ApiParam(value = "Customer List Upload ID.", required = true) @PathParam("customer_list_upload_id") @NotNull  @Pattern(regexp="^\\d+$") String customerListUploadId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.customerListUploadsRun(adAccountId, customerListId, customerListUploadId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/customer_lists")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create customer lists", notes = "Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).", response = CustomerList.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "customer_lists", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CustomerList.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = CustomerList.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response customerListsCreate(@ApiParam(value = "", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  CustomerListCreate customerListCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.customerListsCreate(adAccountId, customerListCreate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/customer_lists/{customer_list_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get customer list", notes = "Gets a specific customer list given the customer list ID.", response = CustomerList.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "customer_lists", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CustomerList.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response customerListsGet(@ApiParam(value = "", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Customer list ID.", required = true) @PathParam("customer_list_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String customerListId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.customerListsGet(adAccountId, customerListId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/customer_lists")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get customer lists", notes = "Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.", response = CustomerListsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "customer_lists", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CustomerListsList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response customerListsList(@ApiParam(value = "", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order")  PinterestLibPaginationOrder order,@ApiParam(value = "When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).", defaultValue = "false") @DefaultValue("false") @QueryParam("exclude_nca")  Boolean excludeNca,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.customerListsList(adAccountId, bookmark, pageSize, order, excludeNca, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{ad_account_id}/customer_lists/{customer_list_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update customer list", notes = "Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \"CUSTOMER_LIST\" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.", response = CustomerList.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "customer_lists", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CustomerList.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response customerListsUpdate(@ApiParam(value = "", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Customer list ID.", required = true) @PathParam("customer_list_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String customerListId,@ApiParam(value = "", required = true) @NotNull @Valid  CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.customerListsUpdate(adAccountId, customerListId, customerListUpdateWithRequiredBody, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/customer_segments")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create customer segments", notes = "Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.", response = CustomerSegment.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "customer_segment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CustomerSegment.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = CustomerSegment.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response customerSegmentCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  CustomerSegmentCreate customerSegmentCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.customerSegmentCreate(adAccountId, customerSegmentCreate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/customer_segments")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List customer segments", notes = "Get a list of the customer segments in the specified `ad_account_id`.", response = CustomerSegmentList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "customer_segment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CustomerSegmentList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response customerSegmentList(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order")  PinterestLibPaginationOrder order,@ApiParam(value = "Include audience sizing in result or not", defaultValue = "false") @DefaultValue("false") @QueryParam("include_sizing")  Boolean includeSizing,@ApiParam(value = "Search query. Can contain pin description keywords or comma-separated pin IDs.") @QueryParam("search_query")  String searchQuery,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.customerSegmentList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{ad_account_id}/customer_segments")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update customer segments", notes = "Update the customer segment given advertiser ID and customer segment ID", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "customer_segment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response customerSegmentUpdate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.customerSegmentUpdate(adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/events")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Send conversions", notes = "The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their `ad_account_id`. The request body should be a JSON object. - This endpoint requires an `access_token` be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is `Authorization: Bearer <access_token>`). - The token's `user_account` must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)", response = ConversionEvents.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "conversion_token")
    }, tags={ "conversion_events", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ConversionEvents.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 422, message = "The request was well-formed but was unable to be followed due to semantic errors.", response = DetailedError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 503, message = "The server is currently unable to handle the request due to a temporary overload or scheduled maintenance.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response eventsCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  ConversionEventsCreate conversionEventsCreate,@ApiParam(value = "Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.") @QueryParam("test")  Boolean test,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.eventsCreate(adAccountId, conversionEventsCreate, test, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/promotion_applied_entities")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List of ad groups using promotions IDs.", notes = "  Get a list of ad groups that are associated with those promotion ids", response = AdGroupsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_groups", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdGroupsList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response getAdGroupsByPromotionIdsList(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "List of Promotion IDs to use to filter the results.", required = true) @QueryParam("promotion_ids") @NotNull  @Size(min=1,max=50) List<String> promotionIds,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order")  PinterestLibPaginationOrder order,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAdGroupsByPromotionIdsList(adAccountId, promotionIds, bookmark, pageSize, order, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/campaigns/delivery_estimates")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get campaign delivery estimates", notes = "Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**", response = CampaignDeliveryEstimatesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "campaigns", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CampaignDeliveryEstimatesResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 503, message = "The service is temporarily unavailable.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response getCampaignDeliveryEstimates(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  @Size(min=1,max=1) List<@Valid CampaignDeliveryEstimatesCampaign> campaignDeliveryEstimatesCampaign,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCampaignDeliveryEstimates(adAccountId, campaignDeliveryEstimatesCampaign, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/keywords")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create keywords", notes = "  Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:     ```json     {       \"keywords\": [],       \"errors\": [         {           \"data\": {             \"archived\": null,             \"match_type\": \"EXACT\",             \"parent_type\": null,             \"value\": \"foobar\",             \"parent_id\": null,             \"type\": \"keyword\",             \"id\": null           },           \"error_messages\": [             \"Advertisers and Campaigns only accept excluded targeting attributes.\"           ]         }       ]     }", response = Keywords.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "keywords", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = Keywords.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = Keywords.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response keywordsCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  KeywordsCreate keywordsCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.keywordsCreate(adAccountId, keywordsCreate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/keywords")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get keywords", notes = "    Get a list of keywords based on the filters provided. If no filter is provided, it will default to the `ad_account_id` filter, which means it will only return keywords that specifically have `parent_id` set to the `ad_account_id`. Note: Keywords can have `ad_account_ids`, `campaign_ids`, and `ad_group_ids` set as their `parent_ids`. Keywords created through Ads Manager will have their `parent_id` set to an `ad_group_id`, not `ad_account_id`.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:       ```json       {         \"keywords\": [],         \"errors\": [           {             \"data\": {               \"archived\": null,               \"match_type\": \"EXACT\",               \"parent_type\": null,               \"value\": \"foobar\",               \"parent_id\": null,               \"type\": \"keyword\",               \"id\": null             },             \"error_messages\": [               \"Advertisers and Campaigns only accept excluded targeting attributes.\"             ]           }         ]       }", response = KeywordsGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "keywords", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = KeywordsGet200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response keywordsGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Campaign Id to use to filter the results.") @QueryParam("campaign_id")  @Pattern(regexp="^\\d+$") @Size(max=18) String campaignId,@ApiParam(value = "Ad group Id.") @QueryParam("ad_group_id")  @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId,@ApiParam(value = "List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.") @QueryParam("ad_group_ids")  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")String> adGroupIds,@ApiParam(value = "Keyword [match type](/docs/api-features/targeting-overview/)") @QueryParam("match_types")  @Size(min=1,max=5) List<MatchType> matchTypes,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.keywordsGet(adAccountId, campaignId, adGroupId, adGroupIds, matchTypes, bookmark, pageSize, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{ad_account_id}/keywords")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update keywords", notes = "  Update one or more keywords' bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity's keywords list.", response = Keywords.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "keywords", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = Keywords.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response keywordsUpdate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  KeywordsUpdate keywordsUpdate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.keywordsUpdate(adAccountId, keywordsUpdate, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/labels/{label_id}/apply")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Apply label to entity", notes = "  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.", response = LabeledEntities.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "labels", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = LabeledEntities.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = LabeledEntities.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response labelsApply(@ApiParam(value = "", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Label ID.", required = true) @PathParam("label_id") @NotNull  String labelId,@ApiParam(value = "", required = true) @NotNull @Valid  LabeledEntitiesCreate labeledEntitiesCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.labelsApply(adAccountId, labelId, labeledEntitiesCreate, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/labels")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create labels", notes = "[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.", response = LabelsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "labels", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = LabelsResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response labelsCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  LabelCreateRequest labelCreateRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.labelsCreate(adAccountId, labelCreateRequest, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/labels")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List labels", notes = "[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.", response = LabelsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "labels", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = LabelsList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response labelsList(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "List of Campaign Ids to use to filter the results.") @QueryParam("campaign_ids")  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,@ApiParam(value = "List of Label Ids to use to filter the results.") @QueryParam("label_ids")  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> labelIds,@ApiParam(value = "Label entity status") @QueryParam("entity_statuses")  List<QueryLabelEntityStatusesItems> entityStatuses,@ApiParam(value = "Label type.") @QueryParam("label_types")  List<QueryLabelTypesItems> labelTypes,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, bookmark, pageSize, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/labels/{label_id}/remove")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Remove label from entities", notes = "  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.", response = LabeledEntities.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "labels", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = LabeledEntities.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = LabeledEntities.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response labelsRemove(@ApiParam(value = "", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Label ID.", required = true) @PathParam("label_id") @NotNull  String labelId,@ApiParam(value = "", required = true) @NotNull @Valid  LabeledEntitiesCreate labeledEntitiesCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.labelsRemove(adAccountId, labelId, labeledEntitiesCreate, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{ad_account_id}/labels")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update labels", notes = "[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.", response = LabelsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "labels", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = LabelsResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response labelsUpdate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  LabelUpdateRequest labelUpdateRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.labelsUpdate(adAccountId, labelUpdateRequest, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/lead_forms/{lead_form_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get lead form by id", notes = "**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).", response = LeadForm.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "lead_forms", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = LeadForm.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response leadFormGet(@ApiParam(value = "The ID of this lead form", required = true) @PathParam("lead_form_id") @NotNull  @Pattern(regexp="^\\d+$") String leadFormId,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.leadFormGet(leadFormId, adAccountId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/lead_forms/{lead_form_id}/test")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create lead form test data", notes = "Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.", response = LeadFormTest.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "lead_forms", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = LeadFormTest.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response leadFormTestCreate(@ApiParam(value = "", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Unique identifier of a lead form.", required = true) @PathParam("lead_form_id") @NotNull  @Pattern(regexp="^\\d+$") String leadFormId,@ApiParam(value = "", required = true) @NotNull @Valid  LeadFormTestCreate leadFormTestCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.leadFormTestCreate(adAccountId, leadFormId, leadFormTestCreate, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/lead_forms")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create lead forms", notes = "**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).", response = LeadFormsCreate200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "lead_forms", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = LeadFormsCreate200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response leadFormsCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  @Size(min=1,max=30) List<@Valid LeadFormCreate> leadFormCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.leadFormsCreate(adAccountId, leadFormCreate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/lead_forms")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List lead forms", notes = "**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).", response = LeadFormsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "lead_forms", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = LeadFormsList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response leadFormsList(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order")  PinterestLibPaginationOrder order,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.leadFormsList(adAccountId, bookmark, pageSize, order, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{ad_account_id}/lead_forms")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update lead forms", notes = "**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).", response = LeadFormsCreate200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "lead_forms", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = LeadFormsCreate200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response leadFormsUpdate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  @Size(min=1,max=30) List<@Valid LeadFormBatchUpdate> leadFormBatchUpdate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.leadFormsUpdate(adAccountId, leadFormBatchUpdate, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/leads_export")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a request to export leads collected from a lead ad", notes = "**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a `leads_export_id` token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).", response = LeadsExports.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "leads_export", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = LeadsExports.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = LeadsExports.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response leadsExportCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  LeadsExportsCreate leadsExportsCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.leadsExportCreate(adAccountId, leadsExportsCreate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/leads_export/{leads_export_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get the lead export from the lead export create call", notes = "**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).", response = LeadsExportResponseData.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "leads_export", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = LeadsExportResponseData.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response leadsExportGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "lead_export_id token returned from the create a lead export endpoint", required = true) @PathParam("leads_export_id") @NotNull  @Pattern(regexp="^\\d+$") String leadsExportId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.leadsExportGet(adAccountId, leadsExportId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/msot/events")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Send Measurement Source Of Truth (MSOT) attributed conversion events", notes = "**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "msot:write", description = "Create measurement source of truth events")
        })
    }, tags={ "msot_events", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = Object.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response msotEventsCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  ConversionMSOTEventsCreate conversionMSOTEventsCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.msotEventsCreate(adAccountId, conversionMSOTEventsCreate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/conversion_tags/ocpm_eligible")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Ocpm eligible conversion tags", notes = "Get Ocpm eligible conversion tag events for an ad account.", response = List.class, responseContainer = "Map", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversion_tags", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ConversionEventResponse.class, responseContainer = "Map"),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response ocpmEligibleConversionTagsGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.ocpmEligibleConversionTagsGet(adAccountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/order_lines/{order_line_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get order line", notes = "Get a specific existing order line associated with an ad account.", response = OrderLine.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "order_lines", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = OrderLine.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response orderLinesGet(@ApiParam(value = "Order line ID.", required = true) @PathParam("order_line_id") @NotNull  @Pattern(regexp="^\\d+$") String orderLineId,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.orderLinesGet(orderLineId, adAccountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/order_lines")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get order lines.", notes = "List existing order lines associated with an ad account.", response = OrderLinesList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "order_lines", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = OrderLinesList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response orderLinesList(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order")  PinterestLibPaginationOrder order,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.orderLinesList(adAccountId, bookmark, pageSize, order, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/conversion_tags/page_visit")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get page visit conversion tags", notes = "Get all page visit conversion tag events for an ad account.", response = PageVisitConversionTagsGet200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "conversion_tags", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = PageVisitConversionTagsGet200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response pageVisitConversionTagsGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order")  PinterestLibPaginationOrder order,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pageVisitConversionTagsGet(adAccountId, bookmark, pageSize, order, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/product_group_promotions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create product group promotions", notes = "Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')", response = ProductGroupPromotions.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "product_group_promotions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ProductGroupPromotions.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = ProductGroupPromotions.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response productGroupPromotionsCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  ProductGroupPromotionsCreate productGroupPromotionsCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.productGroupPromotionsCreate(adAccountId, productGroupPromotionsCreate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/product_group_promotions/{product_group_promotion_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a product group promotion by id", notes = "Get a product group promotion by id", response = ProductGroupPromotion.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "product_group_promotions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ProductGroupPromotion.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response productGroupPromotionsGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Unique identifier of a product group promotion", required = true) @PathParam("product_group_promotion_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String productGroupPromotionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.productGroupPromotionsGet(adAccountId, productGroupPromotionId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/product_group_promotions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get product group promotions", notes = "List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.", response = ProductGroupPromotionsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "product_group_promotions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ProductGroupPromotionsList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response productGroupPromotionsList(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order")  PinterestLibPaginationOrder order,@ApiParam(value = "List of Product group promotion Ids.") @QueryParam("product_group_promotion_ids")  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds,@ApiParam(value = "Entity status") @QueryParam("entity_statuses")  List<EntityStatus> entityStatuses,@ApiParam(value = "Ad group Id.") @QueryParam("ad_group_id")  @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.productGroupPromotionsList(adAccountId, bookmark, pageSize, order, productGroupPromotionIds, entityStatuses, adGroupId, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{ad_account_id}/product_group_promotions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update product group promotions", notes = "Update multiple existing Product Group Promotions (by product_group_id)", response = ProductGroupPromotions.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "product_group_promotions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ProductGroupPromotions.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response productGroupPromotionsUpdate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.productGroupPromotionsUpdate(adAccountId, productGroupPromotionsUpdateWithRequiredBody, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/product_groups/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get product group analytics", notes = "Get analytics for the specified product groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.", response = ProductGroupAnalyticsItems.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "product_group_promotions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ProductGroupAnalyticsItems.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response productGroupsAnalytics(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.", required = true) @QueryParam("start_date") @NotNull  Date startDate,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.", required = true) @QueryParam("end_date") @NotNull  Date endDate,@ApiParam(value = "List of Product group Ids to use to filter the results.", required = true) @QueryParam("product_group_ids") @NotNull  @Size(min=1,max=250) List<@Pattern(regexp = "^\\d+$")String> productGroupIds,@ApiParam(value = "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.", required = true) @QueryParam("columns") @NotNull  List<ReportingColumnSync> columns,@ApiParam(value = "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly", required = true, allowableValues="TOTAL, DAY, HOUR, WEEK, MONTH") @QueryParam("granularity") @NotNull  Granularity granularity,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("click_window_days")  BigDecimal clickWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "30") @DefaultValue("30") @QueryParam("engagement_window_days")  BigDecimal engagementWindowDays,@ApiParam(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", allowableValues="0, 1, 7, 14, 30, 60", defaultValue = "1") @DefaultValue("1") @QueryParam("view_window_days")  BigDecimal viewWindowDays,@ApiParam(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", allowableValues="TIME_OF_AD_ACTION, TIME_OF_CONVERSION", defaultValue = "TIME_OF_AD_ACTION") @DefaultValue("TIME_OF_AD_ACTION") @QueryParam("conversion_report_time")  String conversionReportTime,@ApiParam(value = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.", allowableValues="PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE") @QueryParam("reporting_timezone")  ReportingTimeZone reportingTimezone,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.productGroupsAnalytics(startDate, endDate, productGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/promotions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create promotions", notes = "Create multiple new promotions.", response = PromotionsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "promotions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = PromotionsResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response promotionsCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  @Size(min=1,max=30) List<@Valid PromotionCreate> promotionCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.promotionsCreate(adAccountId, promotionCreate, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{ad_account_id}/promotions/{promotion_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete promotion by id", notes = "Delete a promotion within Pinterest.", response = Promotion.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "promotions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = Promotion.class),
        @io.swagger.annotations.ApiResponse(code = 204, message = "Resource deleted successfully.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response promotionsDelete(@ApiParam(value = "Promotion ID", required = true) @PathParam("promotion_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String promotionId,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.promotionsDelete(promotionId, adAccountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/promotions/{promotion_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get promotion by id", notes = "Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.", response = Promotion.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "promotions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = Promotion.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response promotionsGet(@ApiParam(value = "Promotion ID", required = true) @PathParam("promotion_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String promotionId,@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.promotionsGet(promotionId, adAccountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/promotions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get promotions", notes = "Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.", response = PromotionsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "promotions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = PromotionsList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response promotionsList(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order")  PinterestLibPaginationOrder order,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.promotionsList(adAccountId, bookmark, pageSize, order, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{ad_account_id}/promotions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update promotions", notes = "Update multiple promotions.", response = PromotionsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "promotions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = PromotionsResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response promotionsUpdate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  @Size(min=1,max=30) List<@Valid PromotionBatchUpdate> promotionBatchUpdate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.promotionsUpdate(adAccountId, promotionBatchUpdate, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{ad_account_id}/sandbox")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete ads data for ad account in API Sandbox", notes = "Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = String.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response sandboxDelete(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sandboxDelete(adAccountId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/schedules")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create schedules", notes = "Batch create schedules", response = SchedulesCreate200ResponseInner.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "schedules", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = SchedulesCreate200ResponseInner.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = Schedule.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response schedulesCreate(@ApiParam(value = "", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  List<@Valid ScheduleCreate> scheduleCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.schedulesCreate(adAccountId, scheduleCreate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/schedules")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Schedules", notes = "Get schedules for a specific advertiser", response = SchedulesList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "schedules", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = SchedulesList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response schedulesList(@ApiParam(value = "", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "List of Entity IDs, must be associated with the Ad Accound ID provided in the path.", required = true) @QueryParam("entity_ids") @NotNull  @Size(min=1) List<@Pattern(regexp = "^\\d+$")String> entityIds,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order")  PinterestLibPaginationOrder order,@ApiParam(value = "Filter schedules by status (one or more)") @QueryParam("schedule_statuses")  List<ScheduleStatus> scheduleStatuses,@ApiParam(value = "Filter schedules by a type", allowableValues="CAMPAIGN_BUDGET_CHANGE, CAMPAIGN_BID_MULTIPLIERS") @QueryParam("schedule_type")  ScheduleType scheduleType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.schedulesList(adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{ad_account_id}/schedules")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update schedules", notes = "Update one or more schedules", response = SchedulesCreate200ResponseInner.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "schedules", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = SchedulesCreate200ResponseInner.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response schedulesUpdate(@ApiParam(value = "", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  List<@Valid ScheduleBatchUpdate> scheduleBatchUpdate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.schedulesUpdate(adAccountId, scheduleBatchUpdate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/ssio/accounts")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Salesforce account details including bill-to information.", notes = "  Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.", response = SSIOAccount.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = SSIOAccount.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response ssioAccountsGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.ssioAccountsGet(adAccountId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/ssio/insertion_orders")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create insertion order through SSIO.", notes = "  Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.", response = SSIOInsertionOrder.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = SSIOInsertionOrder.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = SSIOInsertionOrder.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response ssioInsertionOrderCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  SSIOInsertionOrderCreate ssIOInsertionOrderCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.ssioInsertionOrderCreate(adAccountId, ssIOInsertionOrderCreate, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{ad_account_id}/ssio/insertion_orders")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Edit insertion order through SSIO.", notes = "  Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.", response = SSIOInsertionOrder.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = SSIOInsertionOrder.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response ssioInsertionOrderEdit(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  SSIOInsertionOrderUpdate ssIOInsertionOrderUpdate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.ssioInsertionOrderEdit(adAccountId, ssIOInsertionOrderUpdate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/ssio/insertion_orders/status")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get insertion order status by ad account id.", notes = "  Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.", response = SsioInsertionOrdersStatusGetByAdAccount200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = SsioInsertionOrdersStatusGetByAdAccount200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response ssioInsertionOrdersStatusGetByAdAccount(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get insertion order status by pin order id.", notes = "  Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.", response = SSIOInsertionOrderStatusResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = SSIOInsertionOrderStatusResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response ssioInsertionOrdersStatusGetByPinOrderId(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "The pin order id associated with the ssio insertion order", required = true) @PathParam("pin_order_id") @NotNull  String pinOrderId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/ssio/order_lines")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Salesforce order lines by ad account id.", notes = "  Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.", response = SsioOrderLinesGetByAdAccount200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "billing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = SsioOrderLinesGetByAdAccount200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response ssioOrderLinesGetByAdAccount(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "The pin order id associated with the SSIO insertion order") @QueryParam("pin_order_id")  String pinOrderId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.ssioOrderLinesGetByAdAccount(adAccountId, pinOrderId, bookmark, pageSize, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{ad_account_id}/targeting_templates")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create targeting templates", notes = "Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.", response = TargetingTemplate.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "targeting_template", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = TargetingTemplate.class),
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = TargetingTemplate.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response targetingTemplateCreate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  TargetingTemplateCreate targetingTemplateCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.targetingTemplateCreate(adAccountId, targetingTemplateCreate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/targeting_templates")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List targeting templates", notes = "Get a list of the targeting templates in the specified `ad_account_id`", response = TargetingTemplateList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "targeting_template", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = TargetingTemplateList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response targetingTemplateList(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order")  PinterestLibPaginationOrder order,@ApiParam(value = "Include audience sizing in result or not", defaultValue = "false") @DefaultValue("false") @QueryParam("include_sizing")  Boolean includeSizing,@ApiParam(value = "Search query. Can contain pin description keywords or comma-separated pin IDs.") @QueryParam("search_query")  String searchQuery,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.targetingTemplateList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{ad_account_id}/targeting_templates")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update targeting templates", notes = "Update the targeting template given advertiser ID and targeting template ID", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "targeting_template", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response targetingTemplateUpdate(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequestReadOrUpdate, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/templates")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List templates", notes = "Gets all Templates associated with an ad account ID.", response = TemplatesList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "ad_accounts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = TemplatesList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response templatesList(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues="ASCENDING, DESCENDING") @QueryParam("order")  PinterestLibPaginationOrder order,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.templatesList(adAccountId, bookmark, pageSize, order, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{ad_account_id}/terms_of_service")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get terms of service", notes = "Get the text of the terms of service and see whether the advertiser has accepted the terms of service.", response = TermsOfService.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "terms_of_service", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = TermsOfService.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response termsOfServiceGet(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Return HTML in TOS text.", defaultValue = "false") @DefaultValue("false") @QueryParam("include_html")  Boolean includeHtml,@ApiParam(value = "Request type.") @QueryParam("tos_type")  String tosType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.termsOfServiceGet(adAccountId, includeHtml, tosType, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{ad_account_id}/audiences/ad_accounts/shared")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update audience sharing between ad accounts", notes = "From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).", response = AdAccountToAdAccountSharedAudience.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "audience_sharing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdAccountToAdAccountSharedAudience.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response updateAdAccountToAdAccountSharedAudience(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateAdAccountToAdAccountSharedAudience(adAccountId, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{ad_account_id}/audiences/businesses/shared")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update audience sharing from an ad account to businesses", notes = "From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).", response = AdAccountToBusinessSharedAudience.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "audience_sharing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = AdAccountToBusinessSharedAudience.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response updateAdAccountToBusinessSharedAudience(@ApiParam(value = "Unique identifier of an ad account.", required = true) @PathParam("ad_account_id") @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "", required = true) @NotNull @Valid  AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateAdAccountToBusinessSharedAudience(adAccountId, adAccountToBusinessSharedAudienceUpdateWithRequiredBody, securityContext);
    }
}
