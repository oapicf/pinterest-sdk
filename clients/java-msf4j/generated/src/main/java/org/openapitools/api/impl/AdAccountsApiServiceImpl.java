package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

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
import java.util.List;
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

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountsApiServiceImpl extends AdAccountsApiService {
    @Override
    public Response adAccountAnalytics(Date startDate
, Date endDate
, List<ReportingColumnSync> columns
, Granularity granularity
, String adAccountId
, BigDecimal clickWindowDays
, BigDecimal engagementWindowDays
, BigDecimal viewWindowDays
, String conversionReportTime
, ReportingTimeZone reportingTimezone
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adAccountTargetingAnalyticsGet(String adAccountId
, Date startDate
, Date endDate
, List<AdsAnalyticsAccountTargetingType> targetingTypes
, List<ReportingColumnSync> columns
, Granularity granularity
, BigDecimal clickWindowDays
, BigDecimal engagementWindowDays
, BigDecimal viewWindowDays
, String conversionReportTime
, List<ConversionReportAttributionType> attributionTypes
, ReportingTimeZone reportingTimezone
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adAccountsAudiencesSharedAccountsList(String audienceId
, AudienceAccountType accountType
, String adAccountId
, String bookmark
, Integer pageSize
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adAccountsCreate(AdAccountCreate adAccountCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adAccountsGet(String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adAccountsList(Boolean includeSharedAccounts
, String bookmark
, Integer pageSize
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adAccountsSubscriptionsDelById(String adAccountId
, String subscriptionId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adAccountsSubscriptionsGetById(String adAccountId
, String subscriptionId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adAccountsSubscriptionsGetList(String adAccountId
, String bookmark
, Integer pageSize
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adAccountsSubscriptionsPost(String adAccountId
, LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adGroupsAnalytics(Date startDate
, Date endDate
, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds
, List<ReportingColumnSync> columns
, Granularity granularity
, String adAccountId
, BigDecimal clickWindowDays
, BigDecimal engagementWindowDays
, BigDecimal viewWindowDays
, String conversionReportTime
, Boolean aggregateReportRows
, ReportingTimeZone reportingTimezone
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adGroupsAudienceSizing(String adAccountId
, AdGroupAudienceSizingCreate adGroupAudienceSizingCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adGroupsBidFloorGet(String adAccountId
, BidFloorCreate bidFloorCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adGroupsCreate(String adAccountId
, List<@Valid AdGroupCreateCreate> adGroupCreateCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adGroupsDynamicTitlesDownloadCsv(String adAccountId
, String adGroupId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adGroupsDynamicTitlesGetStatus(String adAccountId
, String adGroupId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adGroupsDynamicTitlesGetUploadUrl(String adAccountId
, String adGroupId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adGroupsDynamicTitlesProcessCsv(String adAccountId
, String adGroupId
, DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adGroupsGet(String adGroupId
, String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adGroupsList(String adAccountId
, String bookmark
, Integer pageSize
, PinterestLibPaginationOrder order
, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds
, List<@Pattern(regexp = "^\\d+$")String> adGroupIds
, List<EntityStatus> entityStatuses
, Boolean translateInterestsToNames
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adGroupsTargetingAnalyticsGet(String adAccountId
, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds
, Date startDate
, Date endDate
, List<AdsAnalyticsAdGroupTargetingType> targetingTypes
, List<ReportingColumnSync> columns
, Granularity granularity
, BigDecimal clickWindowDays
, BigDecimal engagementWindowDays
, BigDecimal viewWindowDays
, String conversionReportTime
, List<ConversionReportAttributionType> attributionTypes
, ReportingTimeZone reportingTimezone
, List<String> sortColumns
, Boolean sortAscending
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adGroupsUpdate(String adAccountId
, List<@Valid AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adPinsAnalytics(String campaignId
, List<@Pattern(regexp = "^\\d+$")String> pinIds
, Date startDate
, Date endDate
, List<ReportingColumnSync> columns
, Granularity granularity
, String adAccountId
, BigDecimal clickWindowDays
, BigDecimal engagementWindowDays
, BigDecimal viewWindowDays
, String conversionReportTime
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adPreviewsCreate(String adAccountId
, AdPreviewRequest adPreviewRequest
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adTargetingAnalyticsGet(String adAccountId
, List<@Pattern(regexp = "^\\d+$")String> adIds
, Date startDate
, Date endDate
, List<AdsAnalyticsAdTargetingType> targetingTypes
, List<ReportingColumnSync> columns
, Granularity granularity
, ConversionAttributionWindowDays clickWindowDays
, ConversionAttributionWindowDays engagementWindowDays
, ConversionAttributionWindowDays viewWindowDays
, ConversionReportTimeType conversionReportTime
, List<ConversionReportAttributionType> attributionTypes
, ReportingTimeZone reportingTimezone
, List<String> sortColumns
, Boolean sortAscending
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adsAnalytics(Date startDate
, Date endDate
, List<ReportingColumnSync> columns
, Granularity granularity
, String adAccountId
, List<String> pinIds
, List<@Pattern(regexp = "^\\d+$")String> adIds
, BigDecimal clickWindowDays
, BigDecimal engagementWindowDays
, BigDecimal viewWindowDays
, String conversionReportTime
, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds
, ReportingTimeZone reportingTimezone
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adsCreate(String adAccountId
, List<@Valid AdCreate> adCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adsCreditRedeem(String adAccountId
, AdsCreditRedeemCreate adsCreditRedeemCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adsCreditsDiscountsGet(String adAccountId
, String bookmark
, Integer pageSize
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adsGet(String adId
, String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adsList(String adAccountId
, String bookmark
, Integer pageSize
, PinterestLibPaginationOrder order
, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds
, List<@Pattern(regexp = "^\\d+$")String> adGroupIds
, List<@Pattern(regexp = "^\\d+$")String> adIds
, List<EntityStatus> entityStatuses
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adsUpdate(String adAccountId
, List<@Valid AdBatchUpdate> adBatchUpdate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response advertiserDefinedEventsCreate(String adAccountId
, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response advertiserDefinedEventsDelete(String adAccountId
, List<String> eventNames
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response advertiserDefinedEventsGet(String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response advertiserDefinedEventsUpdate(String adAccountId
, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analyticsCreateConversionProductReport(String adAccountId
, ConversionProductReportCreate conversionProductReportCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analyticsCreateMmmReport(String adAccountId
, MMMReportCreate mmMReportCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analyticsCreateReport(String adAccountId
, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analyticsCreateTemplateReport(String adAccountId
, String templateId
, Date startDate
, Date endDate
, Granularity granularity
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analyticsGetConversionProductReport(String adAccountId
, String token
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analyticsGetMmmReport(String adAccountId
, String token
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analyticsGetReport(String adAccountId
, String token
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response audienceInsightsGet(String adAccountId
, AudienceInsightType audienceInsightType
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response audienceInsightsScopeAndTypeGet(String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response audiencesCreate(String adAccountId
, AdAccountsAudienceCreate adAccountsAudienceCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response audiencesGet(String audienceId
, String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response audiencesList(String adAccountId
, String bookmark
, Integer pageSize
, PinterestLibPaginationOrder order
, AudienceOwnershipType ownershipType
, Boolean excludeNca
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response audiencesUpdate(String audienceId
, String adAccountId
, AdAccountsAudienceUpdate adAccountsAudienceUpdate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response billingInvoiceDownloadGet(String adAccountId
, String billingInvoiceId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response billingInvoicesGet(String adAccountId
, String bookmark
, Integer pageSize
, PinterestLibPaginationOrder order
, BillingInvoiceSortField sort
, BillingInvoiceStatus status
, BillingInvoiceDocumentType documentType
, Date startDueDate
, Date endDueDate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response billingProfilesGet(Boolean isActive
, String adAccountId
, String bookmark
, Integer pageSize
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response bulkDownloadCreate(String adAccountId
, BulkDownloadCreate bulkDownloadCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response bulkRequestGet(String adAccountId
, String bulkRequestId
, Boolean includeDetails
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response bulkUpsertCreate(String adAccountId
, BulkUpsertRequest bulkUpsertRequest
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response campaignAdPreviewCreate(String adAccountId
, List<@Valid CampaignAdPreviewCreate> campaignAdPreviewCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response campaignAdPreviewDelete(List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds
, String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response campaignAdPreviewRead(List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds
, String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response campaignTargetingAnalyticsGet(String adAccountId
, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds
, Date startDate
, Date endDate
, List<AdsAnalyticsCampaignTargetingType> targetingTypes
, List<ReportingColumnSync> columns
, Granularity granularity
, BigDecimal clickWindowDays
, BigDecimal engagementWindowDays
, BigDecimal viewWindowDays
, String conversionReportTime
, List<ConversionReportAttributionType> attributionTypes
, ReportingTimeZone reportingTimezone
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response campaignsAnalytics(Date startDate
, Date endDate
, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds
, List<ReportingColumnSync> columns
, Granularity granularity
, String adAccountId
, BigDecimal clickWindowDays
, BigDecimal engagementWindowDays
, BigDecimal viewWindowDays
, String conversionReportTime
, Boolean aggregateReportRows
, ReportingTimeZone reportingTimezone
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response campaignsCreate(String adAccountId
, List<@Valid CampaignCreateItem> campaignCreateItem
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response campaignsGet(String campaignId
, String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response campaignsList(String adAccountId
, String bookmark
, Integer pageSize
, PinterestLibPaginationOrder order
, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds
, List<EntityStatus> entityStatuses
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response campaignsUpdate(String adAccountId
, List<@Valid CampaignBatchUpdateItem> campaignBatchUpdateItem
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response conversionDeletionRequestCreate(String adAccountId
, ConversionDeletionRequestCreate conversionDeletionRequestCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response conversionDeletionRequestDelete(String requestId
, String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response conversionDeletionRequestGet(String requestId
, String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response conversionDeletionRequestList(String adAccountId
, String bookmark
, Integer pageSize
, PinterestLibPaginationOrder order
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response conversionEqsList(LookbackPeriodOptions lookbackPeriod
, String adAccountId
, SourcePlatformOptions sourcePlatform
, IngestionSourceOptions ingestionSource
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response conversionTagsCreate(String adAccountId
, ConversionTagCreate conversionTagCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response conversionTagsGet(String adAccountId
, String conversionTagId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response conversionTagsList(String adAccountId
, Boolean filterDeleted
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response countryKeywordsMetricsGet(String adAccountId
, String countryCode
, List<String> keywords
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response customerListUploadsCreate(String adAccountId
, String customerListId
, CustomerListUploadCreateRequest customerListUploadCreateRequest
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response customerListUploadsGet(String adAccountId
, String customerListId
, String customerListUploadId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response customerListUploadsRun(String adAccountId
, String customerListId
, String customerListUploadId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response customerListsCreate(String adAccountId
, CustomerListCreate customerListCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response customerListsGet(String adAccountId
, String customerListId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response customerListsList(String adAccountId
, String bookmark
, Integer pageSize
, PinterestLibPaginationOrder order
, Boolean excludeNca
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response customerListsUpdate(String adAccountId
, String customerListId
, CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response customerSegmentCreate(String adAccountId
, CustomerSegmentCreate customerSegmentCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response customerSegmentList(String adAccountId
, String bookmark
, Integer pageSize
, PinterestLibPaginationOrder order
, Boolean includeSizing
, String searchQuery
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response customerSegmentUpdate(String adAccountId
, CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response eventsCreate(String adAccountId
, ConversionEventsCreate conversionEventsCreate
, Boolean test
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getAdGroupsByPromotionIdsList(String adAccountId
, List<String> promotionIds
, String bookmark
, Integer pageSize
, PinterestLibPaginationOrder order
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getCampaignDeliveryEstimates(String adAccountId
, List<@Valid CampaignDeliveryEstimatesCampaign> campaignDeliveryEstimatesCampaign
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response keywordsCreate(String adAccountId
, KeywordsCreate keywordsCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response keywordsGet(String adAccountId
, String campaignId
, String adGroupId
, List<@Pattern(regexp = "^\\d+$")String> adGroupIds
, List<MatchType> matchTypes
, String bookmark
, Integer pageSize
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response keywordsUpdate(String adAccountId
, KeywordsUpdate keywordsUpdate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response labelsApply(String adAccountId
, String labelId
, LabeledEntitiesCreate labeledEntitiesCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response labelsCreate(String adAccountId
, LabelCreateRequest labelCreateRequest
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response labelsList(String adAccountId
, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds
, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> labelIds
, List<QueryLabelEntityStatusesItems> entityStatuses
, List<QueryLabelTypesItems> labelTypes
, String bookmark
, Integer pageSize
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response labelsRemove(String adAccountId
, String labelId
, LabeledEntitiesCreate labeledEntitiesCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response labelsUpdate(String adAccountId
, LabelUpdateRequest labelUpdateRequest
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response leadFormGet(String leadFormId
, String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response leadFormTestCreate(String adAccountId
, String leadFormId
, LeadFormTestCreate leadFormTestCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response leadFormsCreate(String adAccountId
, List<@Valid LeadFormCreate> leadFormCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response leadFormsList(String adAccountId
, String bookmark
, Integer pageSize
, PinterestLibPaginationOrder order
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response leadFormsUpdate(String adAccountId
, List<@Valid LeadFormBatchUpdate> leadFormBatchUpdate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response leadsExportCreate(String adAccountId
, LeadsExportsCreate leadsExportsCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response leadsExportGet(String adAccountId
, String leadsExportId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response msotEventsCreate(String adAccountId
, ConversionMSOTEventsCreate conversionMSOTEventsCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response ocpmEligibleConversionTagsGet(String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response orderLinesGet(String orderLineId
, String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response orderLinesList(String adAccountId
, String bookmark
, Integer pageSize
, PinterestLibPaginationOrder order
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response pageVisitConversionTagsGet(String adAccountId
, String bookmark
, Integer pageSize
, PinterestLibPaginationOrder order
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response productGroupPromotionsCreate(String adAccountId
, ProductGroupPromotionsCreate productGroupPromotionsCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response productGroupPromotionsGet(String adAccountId
, String productGroupPromotionId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response productGroupPromotionsList(String adAccountId
, String bookmark
, Integer pageSize
, PinterestLibPaginationOrder order
, List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds
, List<EntityStatus> entityStatuses
, String adGroupId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response productGroupPromotionsUpdate(String adAccountId
, ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response productGroupsAnalytics(Date startDate
, Date endDate
, List<@Pattern(regexp = "^\\d+$")String> productGroupIds
, List<ReportingColumnSync> columns
, Granularity granularity
, String adAccountId
, BigDecimal clickWindowDays
, BigDecimal engagementWindowDays
, BigDecimal viewWindowDays
, String conversionReportTime
, ReportingTimeZone reportingTimezone
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response promotionsCreate(String adAccountId
, List<@Valid PromotionCreate> promotionCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response promotionsDelete(String promotionId
, String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response promotionsGet(String promotionId
, String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response promotionsList(String adAccountId
, String bookmark
, Integer pageSize
, PinterestLibPaginationOrder order
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response promotionsUpdate(String adAccountId
, List<@Valid PromotionBatchUpdate> promotionBatchUpdate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response sandboxDelete(String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response schedulesCreate(String adAccountId
, List<@Valid ScheduleCreate> scheduleCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response schedulesList(String adAccountId
, List<@Pattern(regexp = "^\\d+$")String> entityIds
, String bookmark
, Integer pageSize
, PinterestLibPaginationOrder order
, List<ScheduleStatus> scheduleStatuses
, ScheduleType scheduleType
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response schedulesUpdate(String adAccountId
, List<@Valid ScheduleBatchUpdate> scheduleBatchUpdate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response ssioAccountsGet(String adAccountId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response ssioInsertionOrderCreate(String adAccountId
, SSIOInsertionOrderCreate ssIOInsertionOrderCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response ssioInsertionOrderEdit(String adAccountId
, SSIOInsertionOrderUpdate ssIOInsertionOrderUpdate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response ssioInsertionOrdersStatusGetByAdAccount(String adAccountId
, String bookmark
, Integer pageSize
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response ssioInsertionOrdersStatusGetByPinOrderId(String adAccountId
, String pinOrderId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response ssioOrderLinesGetByAdAccount(String adAccountId
, String pinOrderId
, String bookmark
, Integer pageSize
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response targetingTemplateCreate(String adAccountId
, TargetingTemplateCreate targetingTemplateCreate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response targetingTemplateList(String adAccountId
, String bookmark
, Integer pageSize
, PinterestLibPaginationOrder order
, Boolean includeSizing
, String searchQuery
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response targetingTemplateUpdate(String adAccountId
, TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response templatesList(String adAccountId
, String bookmark
, Integer pageSize
, PinterestLibPaginationOrder order
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response termsOfServiceGet(String adAccountId
, Boolean includeHtml
, String tosType
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateAdAccountToAdAccountSharedAudience(String adAccountId
, AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateAdAccountToBusinessSharedAudience(String adAccountId
, AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
