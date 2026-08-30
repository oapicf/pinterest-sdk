package org.openapitools.api.consumer;

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
import java.time.LocalDate;
import org.openapitools.model.LookbackPeriodOptions;
import org.openapitools.model.MMMReport;
import org.openapitools.model.MMMReportCreate;
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
import org.openapitools.model.*;
import org.openapitools.api.interfaces.AdAccountsService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/ad_accounts")
public class AdAccountsServiceController {

    @DubboReference
    private AdAccountsService adAccountsService;

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/analytics")
    public List<AdAccountAnalyticsItems> adAccountAnalytics(
        @RequestParam(name = "startDate") LocalDate startDate,
        @RequestParam(name = "endDate") LocalDate endDate,
        @RequestParam(name = "columns") List<ReportingColumnSync> columns,
        @RequestParam(name = "granularity") Granularity granularity,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "clickWindowDays", defaultValue = "30") BigDecimal clickWindowDays,
        @RequestParam(name = "engagementWindowDays", defaultValue = "30") BigDecimal engagementWindowDays,
        @RequestParam(name = "viewWindowDays", defaultValue = "1") BigDecimal viewWindowDays,
        @RequestParam(name = "conversionReportTime", defaultValue = "TIME_OF_AD_ACTION") String conversionReportTime,
        @RequestParam(name = "reportingTimezone") ReportingTimeZone reportingTimezone
    ) {
        return adAccountsService.adAccountAnalytics(startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/targeting_analytics")
    public MetricsResponse adAccountTargetingAnalyticsGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "startDate") LocalDate startDate,
        @RequestParam(name = "endDate") LocalDate endDate,
        @RequestParam(name = "targetingTypes") List<AdsAnalyticsAccountTargetingType> targetingTypes,
        @RequestParam(name = "columns") List<ReportingColumnSync> columns,
        @RequestParam(name = "granularity") Granularity granularity,
        @RequestParam(name = "clickWindowDays", defaultValue = "30") BigDecimal clickWindowDays,
        @RequestParam(name = "engagementWindowDays", defaultValue = "30") BigDecimal engagementWindowDays,
        @RequestParam(name = "viewWindowDays", defaultValue = "1") BigDecimal viewWindowDays,
        @RequestParam(name = "conversionReportTime", defaultValue = "TIME_OF_AD_ACTION") String conversionReportTime,
        @RequestParam(name = "attributionTypes") List<ConversionReportAttributionType> attributionTypes,
        @RequestParam(name = "reportingTimezone") ReportingTimeZone reportingTimezone
    ) {
        return adAccountsService.adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/audiences/shared/accounts")
    public AdAccountsAudiencesSharedAccountsList200Response adAccountsAudiencesSharedAccountsList(
        @RequestParam(name = "audienceId") String audienceId,
        @RequestParam(name = "accountType") AudienceAccountType accountType,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return adAccountsService.adAccountsAudiencesSharedAccountsList(audienceId, accountType, adAccountId, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public AdAccount adAccountsCreate(
        @RequestParam(name = "adAccountCreate") AdAccountCreate adAccountCreate
    ) {
        return adAccountsService.adAccountsCreate(adAccountCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}")
    public AdAccount adAccountsGet(
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.adAccountsGet(adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public AdAccountsList200Response adAccountsList(
        @RequestParam(name = "includeSharedAccounts", defaultValue = "true") Boolean includeSharedAccounts,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return adAccountsService.adAccountsList(includeSharedAccounts, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{ad_account_id}/leads/subscriptions/{subscription_id}")
    public LeadSubscription adAccountsSubscriptionsDelById(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "subscriptionId") String subscriptionId
    ) {
        return adAccountsService.adAccountsSubscriptionsDelById(adAccountId, subscriptionId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/leads/subscriptions/{subscription_id}")
    public LeadSubscription adAccountsSubscriptionsGetById(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "subscriptionId") String subscriptionId
    ) {
        return adAccountsService.adAccountsSubscriptionsGetById(adAccountId, subscriptionId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/leads/subscriptions")
    public AdAccountsSubscriptionsGetList200Response adAccountsSubscriptionsGetList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return adAccountsService.adAccountsSubscriptionsGetList(adAccountId, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/leads/subscriptions")
    public LeadSubscription adAccountsSubscriptionsPost(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "leadSubscriptionPostParamsCreate") LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate
    ) {
        return adAccountsService.adAccountsSubscriptionsPost(adAccountId, leadSubscriptionPostParamsCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/ad_groups/analytics")
    public List<AdGroupsAnalyticsMetrics> adGroupsAnalytics(
        @RequestParam(name = "startDate") LocalDate startDate,
        @RequestParam(name = "endDate") LocalDate endDate,
        @RequestParam(name = "adGroupIds") List<String> adGroupIds,
        @RequestParam(name = "columns") List<ReportingColumnSync> columns,
        @RequestParam(name = "granularity") Granularity granularity,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "clickWindowDays", defaultValue = "30") BigDecimal clickWindowDays,
        @RequestParam(name = "engagementWindowDays", defaultValue = "30") BigDecimal engagementWindowDays,
        @RequestParam(name = "viewWindowDays", defaultValue = "1") BigDecimal viewWindowDays,
        @RequestParam(name = "conversionReportTime", defaultValue = "TIME_OF_AD_ACTION") String conversionReportTime,
        @RequestParam(name = "aggregateReportRows", defaultValue = "false") Boolean aggregateReportRows,
        @RequestParam(name = "reportingTimezone") ReportingTimeZone reportingTimezone
    ) {
        return adAccountsService.adGroupsAnalytics(startDate, endDate, adGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/ad_groups/audience_sizing")
    public AdGroupAudienceSizing adGroupsAudienceSizing(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adGroupAudienceSizingCreate") AdGroupAudienceSizingCreate adGroupAudienceSizingCreate
    ) {
        return adAccountsService.adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingCreate);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/bid_floor")
    public BidFloor adGroupsBidFloorGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bidFloorCreate") BidFloorCreate bidFloorCreate
    ) {
        return adAccountsService.adGroupsBidFloorGet(adAccountId, bidFloorCreate);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/ad_groups")
    public AdGroupsCreate200Response adGroupsCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adGroupCreateCreate") List<AdGroupCreateCreate> adGroupCreateCreate
    ) {
        return adAccountsService.adGroupsCreate(adAccountId, adGroupCreateCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv")
    public DynamicTitlesDownloadCSV adGroupsDynamicTitlesDownloadCsv(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adGroupId") String adGroupId
    ) {
        return adAccountsService.adGroupsDynamicTitlesDownloadCsv(adAccountId, adGroupId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status")
    public DynamicTitlesGetStatus adGroupsDynamicTitlesGetStatus(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adGroupId") String adGroupId
    ) {
        return adAccountsService.adGroupsDynamicTitlesGetStatus(adAccountId, adGroupId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads")
    public DynamicTitlesUploadURL adGroupsDynamicTitlesGetUploadUrl(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adGroupId") String adGroupId
    ) {
        return adAccountsService.adGroupsDynamicTitlesGetUploadUrl(adAccountId, adGroupId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles")
    public DynamicTitlesProcessCSV adGroupsDynamicTitlesProcessCsv(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adGroupId") String adGroupId,
        @RequestParam(name = "dynamicTitlesProcessCSVCreate") DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate
    ) {
        return adAccountsService.adGroupsDynamicTitlesProcessCsv(adAccountId, adGroupId, dynamicTitlesProcessCSVCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/ad_groups/{ad_group_id}")
    public AdGroup adGroupsGet(
        @RequestParam(name = "adGroupId") String adGroupId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.adGroupsGet(adGroupId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/ad_groups")
    public AdGroupsList200Response adGroupsList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "order") PinterestLibPaginationOrder order,
        @RequestParam(name = "campaignIds") List<String> campaignIds,
        @RequestParam(name = "adGroupIds") List<String> adGroupIds,
        @RequestParam(name = "entityStatuses", defaultValue = "ACTIVE,PAUSED") List<EntityStatus> entityStatuses,
        @RequestParam(name = "translateInterestsToNames", defaultValue = "false") Boolean translateInterestsToNames
    ) {
        return adAccountsService.adGroupsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, entityStatuses, translateInterestsToNames);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/ad_groups/targeting_analytics")
    public MetricsResponse adGroupsTargetingAnalyticsGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adGroupIds") List<String> adGroupIds,
        @RequestParam(name = "startDate") LocalDate startDate,
        @RequestParam(name = "endDate") LocalDate endDate,
        @RequestParam(name = "targetingTypes") List<AdsAnalyticsAdGroupTargetingType> targetingTypes,
        @RequestParam(name = "columns") List<ReportingColumnSync> columns,
        @RequestParam(name = "granularity") Granularity granularity,
        @RequestParam(name = "clickWindowDays", defaultValue = "30") BigDecimal clickWindowDays,
        @RequestParam(name = "engagementWindowDays", defaultValue = "30") BigDecimal engagementWindowDays,
        @RequestParam(name = "viewWindowDays", defaultValue = "1") BigDecimal viewWindowDays,
        @RequestParam(name = "conversionReportTime", defaultValue = "TIME_OF_AD_ACTION") String conversionReportTime,
        @RequestParam(name = "attributionTypes") List<ConversionReportAttributionType> attributionTypes,
        @RequestParam(name = "reportingTimezone") ReportingTimeZone reportingTimezone,
        @RequestParam(name = "sortColumns") List<String> sortColumns,
        @RequestParam(name = "sortAscending") Boolean sortAscending
    ) {
        return adAccountsService.adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{ad_account_id}/ad_groups")
    public AdGroupsCreate200Response adGroupsUpdate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adGroupUpdateBatchUpdate") List<AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate
    ) {
        return adAccountsService.adGroupsUpdate(adAccountId, adGroupUpdateBatchUpdate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/pins/analytics")
    public List<AdPinAnalytics> adPinsAnalytics(
        @RequestParam(name = "campaignId") String campaignId,
        @RequestParam(name = "pinIds") List<String> pinIds,
        @RequestParam(name = "startDate") LocalDate startDate,
        @RequestParam(name = "endDate") LocalDate endDate,
        @RequestParam(name = "columns") List<ReportingColumnSync> columns,
        @RequestParam(name = "granularity") Granularity granularity,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "clickWindowDays", defaultValue = "30") BigDecimal clickWindowDays,
        @RequestParam(name = "engagementWindowDays", defaultValue = "30") BigDecimal engagementWindowDays,
        @RequestParam(name = "viewWindowDays", defaultValue = "1") BigDecimal viewWindowDays,
        @RequestParam(name = "conversionReportTime", defaultValue = "TIME_OF_AD_ACTION") String conversionReportTime
    ) {
        return adAccountsService.adPinsAnalytics(campaignId, pinIds, startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/ad_previews")
    public AdPreviewURLResponse adPreviewsCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adPreviewRequest") AdPreviewRequest adPreviewRequest
    ) {
        return adAccountsService.adPreviewsCreate(adAccountId, adPreviewRequest);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/ads/targeting_analytics")
    public MetricsResponse adTargetingAnalyticsGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adIds") List<String> adIds,
        @RequestParam(name = "startDate") LocalDate startDate,
        @RequestParam(name = "endDate") LocalDate endDate,
        @RequestParam(name = "targetingTypes") List<AdsAnalyticsAdTargetingType> targetingTypes,
        @RequestParam(name = "columns") List<ReportingColumnSync> columns,
        @RequestParam(name = "granularity") Granularity granularity,
        @RequestParam(name = "clickWindowDays") ConversionAttributionWindowDays clickWindowDays,
        @RequestParam(name = "engagementWindowDays") ConversionAttributionWindowDays engagementWindowDays,
        @RequestParam(name = "viewWindowDays") ConversionAttributionWindowDays viewWindowDays,
        @RequestParam(name = "conversionReportTime") ConversionReportTimeType conversionReportTime,
        @RequestParam(name = "attributionTypes") List<ConversionReportAttributionType> attributionTypes,
        @RequestParam(name = "reportingTimezone") ReportingTimeZone reportingTimezone,
        @RequestParam(name = "sortColumns") List<String> sortColumns,
        @RequestParam(name = "sortAscending") Boolean sortAscending
    ) {
        return adAccountsService.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/ads/analytics")
    public List<AdsAnalytics> adsAnalytics(
        @RequestParam(name = "startDate") LocalDate startDate,
        @RequestParam(name = "endDate") LocalDate endDate,
        @RequestParam(name = "columns") List<ReportingColumnSync> columns,
        @RequestParam(name = "granularity") Granularity granularity,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "pinIds") List<String> pinIds,
        @RequestParam(name = "adIds") List<String> adIds,
        @RequestParam(name = "clickWindowDays", defaultValue = "30") BigDecimal clickWindowDays,
        @RequestParam(name = "engagementWindowDays", defaultValue = "30") BigDecimal engagementWindowDays,
        @RequestParam(name = "viewWindowDays", defaultValue = "1") BigDecimal viewWindowDays,
        @RequestParam(name = "conversionReportTime", defaultValue = "TIME_OF_AD_ACTION") String conversionReportTime,
        @RequestParam(name = "campaignIds") List<String> campaignIds,
        @RequestParam(name = "reportingTimezone") ReportingTimeZone reportingTimezone
    ) {
        return adAccountsService.adsAnalytics(startDate, endDate, columns, granularity, adAccountId, pinIds, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, campaignIds, reportingTimezone);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/ads")
    public AdBatchWriteResponseModel adsCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adCreate") List<AdCreate> adCreate
    ) {
        return adAccountsService.adsCreate(adAccountId, adCreate);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/ads_credit/redeem")
    public AdsCreditRedeem adsCreditRedeem(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adsCreditRedeemCreate") AdsCreditRedeemCreate adsCreditRedeemCreate
    ) {
        return adAccountsService.adsCreditRedeem(adAccountId, adsCreditRedeemCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/ads_credit/discounts")
    public AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return adAccountsService.adsCreditsDiscountsGet(adAccountId, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/ads/{ad_id}")
    public Ad adsGet(
        @RequestParam(name = "adId") String adId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.adsGet(adId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/ads")
    public AdsList200Response adsList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "order") PinterestLibPaginationOrder order,
        @RequestParam(name = "campaignIds") List<String> campaignIds,
        @RequestParam(name = "adGroupIds") List<String> adGroupIds,
        @RequestParam(name = "adIds") List<String> adIds,
        @RequestParam(name = "entityStatuses", defaultValue = "ACTIVE,PAUSED") List<EntityStatus> entityStatuses
    ) {
        return adAccountsService.adsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, adIds, entityStatuses);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{ad_account_id}/ads")
    public AdBatchWriteResponseModel adsUpdate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adBatchUpdate") List<AdBatchUpdate> adBatchUpdate
    ) {
        return adAccountsService.adsUpdate(adAccountId, adBatchUpdate);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/advertiser_defined_events")
    public AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "advertiserDefinedEventsCreateRequest") AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest
    ) {
        return adAccountsService.advertiserDefinedEventsCreate(adAccountId, advertiserDefinedEventsCreateRequest);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{ad_account_id}/advertiser_defined_events")
    public AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsDelete(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "eventNames") List<String> eventNames
    ) {
        return adAccountsService.advertiserDefinedEventsDelete(adAccountId, eventNames);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/advertiser_defined_events")
    public AdvertiserDefinedEventsGet200Response advertiserDefinedEventsGet(
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.advertiserDefinedEventsGet(adAccountId);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{ad_account_id}/advertiser_defined_events")
    public AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsUpdate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "advertiserDefinedEventsCreateRequest") AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest
    ) {
        return adAccountsService.advertiserDefinedEventsUpdate(adAccountId, advertiserDefinedEventsCreateRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/reports/brand_category_sku")
    public ConversionProductReport analyticsCreateConversionProductReport(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "conversionProductReportCreate") ConversionProductReportCreate conversionProductReportCreate
    ) {
        return adAccountsService.analyticsCreateConversionProductReport(adAccountId, conversionProductReportCreate);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/mmm_reports")
    public MMMReport analyticsCreateMmmReport(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "mmMReportCreate") MMMReportCreate mmMReportCreate
    ) {
        return adAccountsService.analyticsCreateMmmReport(adAccountId, mmMReportCreate);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/reports")
    public AdsAnalyticsCreateAsyncResponse analyticsCreateReport(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adsAnalyticsCreateAsyncRequest") AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest
    ) {
        return adAccountsService.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/templates/{template_id}/reports")
    public TemplateBasedReport analyticsCreateTemplateReport(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "templateId") String templateId,
        @RequestParam(name = "startDate") LocalDate startDate,
        @RequestParam(name = "endDate") LocalDate endDate,
        @RequestParam(name = "granularity") Granularity granularity
    ) {
        return adAccountsService.analyticsCreateTemplateReport(adAccountId, templateId, startDate, endDate, granularity);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/reports/brand_category_sku")
    public ConversionProductReport analyticsGetConversionProductReport(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "token") String token
    ) {
        return adAccountsService.analyticsGetConversionProductReport(adAccountId, token);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/mmm_reports")
    public MMMReport analyticsGetMmmReport(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "token") String token
    ) {
        return adAccountsService.analyticsGetMmmReport(adAccountId, token);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/reports")
    public AdsAnalyticsGetAsyncResponse analyticsGetReport(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "token") String token
    ) {
        return adAccountsService.analyticsGetReport(adAccountId, token);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/audience_insights")
    public AudienceInsights audienceInsightsGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "audienceInsightType") AudienceInsightType audienceInsightType
    ) {
        return adAccountsService.audienceInsightsGet(adAccountId, audienceInsightType);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/insights/audiences")
    public AudienceInsightsScopeAndTypeGet200Response audienceInsightsScopeAndTypeGet(
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.audienceInsightsScopeAndTypeGet(adAccountId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/audiences")
    public AdAccountsAudience audiencesCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adAccountsAudienceCreate") AdAccountsAudienceCreate adAccountsAudienceCreate
    ) {
        return adAccountsService.audiencesCreate(adAccountId, adAccountsAudienceCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/audiences/{audience_id}")
    public AdAccountsAudience audiencesGet(
        @RequestParam(name = "audienceId") String audienceId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.audiencesGet(audienceId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/audiences")
    public AudiencesList200Response audiencesList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "order") PinterestLibPaginationOrder order,
        @RequestParam(name = "ownershipType") AudienceOwnershipType ownershipType,
        @RequestParam(name = "excludeNca", defaultValue = "false") Boolean excludeNca
    ) {
        return adAccountsService.audiencesList(adAccountId, bookmark, pageSize, order, ownershipType, excludeNca);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{ad_account_id}/audiences/{audience_id}")
    public AdAccountsAudience audiencesUpdate(
        @RequestParam(name = "audienceId") String audienceId,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adAccountsAudienceUpdate") AdAccountsAudienceUpdate adAccountsAudienceUpdate
    ) {
        return adAccountsService.audiencesUpdate(audienceId, adAccountId, adAccountsAudienceUpdate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/billing_invoice/{billing_invoice_id}/download")
    public BillingInvoiceDownloadResponse billingInvoiceDownloadGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "billingInvoiceId") String billingInvoiceId
    ) {
        return adAccountsService.billingInvoiceDownloadGet(adAccountId, billingInvoiceId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/billing_invoices")
    public BillingInvoicesGet200Response billingInvoicesGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "order") PinterestLibPaginationOrder order,
        @RequestParam(name = "sort", defaultValue = "DUE_DATE") BillingInvoiceSortField sort,
        @RequestParam(name = "status") BillingInvoiceStatus status,
        @RequestParam(name = "documentType") BillingInvoiceDocumentType documentType,
        @RequestParam(name = "startDueDate") LocalDate startDueDate,
        @RequestParam(name = "endDueDate") LocalDate endDueDate
    ) {
        return adAccountsService.billingInvoicesGet(adAccountId, bookmark, pageSize, order, sort, status, documentType, startDueDate, endDueDate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/billing_profiles")
    public BillingProfilesGet200Response billingProfilesGet(
        @RequestParam(name = "isActive") Boolean isActive,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return adAccountsService.billingProfilesGet(isActive, adAccountId, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/bulk/download")
    public BulkDownload bulkDownloadCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bulkDownloadCreate") BulkDownloadCreate bulkDownloadCreate
    ) {
        return adAccountsService.bulkDownloadCreate(adAccountId, bulkDownloadCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/bulk/{bulk_request_id}")
    public BulkJobData bulkRequestGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bulkRequestId") String bulkRequestId,
        @RequestParam(name = "includeDetails", defaultValue = "false") Boolean includeDetails
    ) {
        return adAccountsService.bulkRequestGet(adAccountId, bulkRequestId, includeDetails);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/bulk/upsert")
    public BulkUpsertResponse bulkUpsertCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bulkUpsertRequest") BulkUpsertRequest bulkUpsertRequest
    ) {
        return adAccountsService.bulkUpsertCreate(adAccountId, bulkUpsertRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/campaign_ad_preview")
    public List<CampaignAdPreviewCreate200ResponseInner> campaignAdPreviewCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "campaignAdPreviewCreate") List<CampaignAdPreviewCreate> campaignAdPreviewCreate
    ) {
        return adAccountsService.campaignAdPreviewCreate(adAccountId, campaignAdPreviewCreate);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{ad_account_id}/campaign_ad_preview")
    public List<CampaignAdPreviewDelete200ResponseInner> campaignAdPreviewDelete(
        @RequestParam(name = "adGroupIds") List<String> adGroupIds,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.campaignAdPreviewDelete(adGroupIds, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/campaign_ad_preview")
    public List<CampaignAdPreview> campaignAdPreviewRead(
        @RequestParam(name = "adGroupIds") List<String> adGroupIds,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.campaignAdPreviewRead(adGroupIds, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/campaigns/targeting_analytics")
    public MetricsResponse campaignTargetingAnalyticsGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "campaignIds") List<String> campaignIds,
        @RequestParam(name = "startDate") LocalDate startDate,
        @RequestParam(name = "endDate") LocalDate endDate,
        @RequestParam(name = "targetingTypes") List<AdsAnalyticsCampaignTargetingType> targetingTypes,
        @RequestParam(name = "columns") List<ReportingColumnSync> columns,
        @RequestParam(name = "granularity") Granularity granularity,
        @RequestParam(name = "clickWindowDays", defaultValue = "30") BigDecimal clickWindowDays,
        @RequestParam(name = "engagementWindowDays", defaultValue = "30") BigDecimal engagementWindowDays,
        @RequestParam(name = "viewWindowDays", defaultValue = "1") BigDecimal viewWindowDays,
        @RequestParam(name = "conversionReportTime", defaultValue = "TIME_OF_AD_ACTION") String conversionReportTime,
        @RequestParam(name = "attributionTypes") List<ConversionReportAttributionType> attributionTypes,
        @RequestParam(name = "reportingTimezone") ReportingTimeZone reportingTimezone
    ) {
        return adAccountsService.campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/campaigns/analytics")
    public List<CampaignsAnalyticsMetrics> campaignsAnalytics(
        @RequestParam(name = "startDate") LocalDate startDate,
        @RequestParam(name = "endDate") LocalDate endDate,
        @RequestParam(name = "campaignIds") List<String> campaignIds,
        @RequestParam(name = "columns") List<ReportingColumnSync> columns,
        @RequestParam(name = "granularity") Granularity granularity,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "clickWindowDays", defaultValue = "30") BigDecimal clickWindowDays,
        @RequestParam(name = "engagementWindowDays", defaultValue = "30") BigDecimal engagementWindowDays,
        @RequestParam(name = "viewWindowDays", defaultValue = "1") BigDecimal viewWindowDays,
        @RequestParam(name = "conversionReportTime", defaultValue = "TIME_OF_AD_ACTION") String conversionReportTime,
        @RequestParam(name = "aggregateReportRows", defaultValue = "false") Boolean aggregateReportRows,
        @RequestParam(name = "reportingTimezone") ReportingTimeZone reportingTimezone
    ) {
        return adAccountsService.campaignsAnalytics(startDate, endDate, campaignIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/campaigns")
    public CampaignBatchWriteResponseModel campaignsCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "campaignCreateItem") List<CampaignCreateItem> campaignCreateItem
    ) {
        return adAccountsService.campaignsCreate(adAccountId, campaignCreateItem);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/campaigns/{campaign_id}")
    public Campaign campaignsGet(
        @RequestParam(name = "campaignId") String campaignId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.campaignsGet(campaignId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/campaigns")
    public CampaignsList200Response campaignsList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "order") PinterestLibPaginationOrder order,
        @RequestParam(name = "campaignIds") List<String> campaignIds,
        @RequestParam(name = "entityStatuses", defaultValue = "ACTIVE,PAUSED") List<EntityStatus> entityStatuses
    ) {
        return adAccountsService.campaignsList(adAccountId, bookmark, pageSize, order, campaignIds, entityStatuses);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{ad_account_id}/campaigns")
    public CampaignBatchWriteResponseModel campaignsUpdate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "campaignBatchUpdateItem") List<CampaignBatchUpdateItem> campaignBatchUpdateItem
    ) {
        return adAccountsService.campaignsUpdate(adAccountId, campaignBatchUpdateItem);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/conversion_deletion_requests")
    public ConversionDeletionRequest conversionDeletionRequestCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "conversionDeletionRequestCreate") ConversionDeletionRequestCreate conversionDeletionRequestCreate
    ) {
        return adAccountsService.conversionDeletionRequestCreate(adAccountId, conversionDeletionRequestCreate);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{ad_account_id}/conversion_deletion_requests/{request_id}")
    public ConversionDeletionRequest conversionDeletionRequestDelete(
        @RequestParam(name = "requestId") String requestId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.conversionDeletionRequestDelete(requestId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/conversion_deletion_requests/{request_id}")
    public ConversionDeletionRequest conversionDeletionRequestGet(
        @RequestParam(name = "requestId") String requestId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.conversionDeletionRequestGet(requestId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/conversion_deletion_requests")
    public ConversionDeletionRequestList200Response conversionDeletionRequestList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "order") PinterestLibPaginationOrder order
    ) {
        return adAccountsService.conversionDeletionRequestList(adAccountId, bookmark, pageSize, order);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/conversion_eqs")
    public List<EventQualityScore> conversionEqsList(
        @RequestParam(name = "lookbackPeriod") LookbackPeriodOptions lookbackPeriod,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "sourcePlatform") SourcePlatformOptions sourcePlatform,
        @RequestParam(name = "ingestionSource") IngestionSourceOptions ingestionSource
    ) {
        return adAccountsService.conversionEqsList(lookbackPeriod, adAccountId, sourcePlatform, ingestionSource);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/conversion_tags")
    public ConversionTag conversionTagsCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "conversionTagCreate") ConversionTagCreate conversionTagCreate
    ) {
        return adAccountsService.conversionTagsCreate(adAccountId, conversionTagCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/conversion_tags/{conversion_tag_id}")
    public ConversionTag conversionTagsGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "conversionTagId") String conversionTagId
    ) {
        return adAccountsService.conversionTagsGet(adAccountId, conversionTagId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/conversion_tags")
    public ConversionTagsList200Response conversionTagsList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "filterDeleted", defaultValue = "false") Boolean filterDeleted
    ) {
        return adAccountsService.conversionTagsList(adAccountId, filterDeleted);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/keywords/metrics")
    public KeywordsMetricsArrayResponse countryKeywordsMetricsGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "countryCode") String countryCode,
        @RequestParam(name = "keywords") List<String> keywords
    ) {
        return adAccountsService.countryKeywordsMetricsGet(adAccountId, countryCode, keywords);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/customer_lists/{customer_list_id}/uploads")
    public CustomerListUploadCreateResponse customerListUploadsCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "customerListId") String customerListId,
        @RequestParam(name = "customerListUploadCreateRequest") CustomerListUploadCreateRequest customerListUploadCreateRequest
    ) {
        return adAccountsService.customerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}")
    public CustomerListUpload customerListUploadsGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "customerListId") String customerListId,
        @RequestParam(name = "customerListUploadId") String customerListUploadId
    ) {
        return adAccountsService.customerListUploadsGet(adAccountId, customerListId, customerListUploadId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run")
    public CustomerListUpload customerListUploadsRun(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "customerListId") String customerListId,
        @RequestParam(name = "customerListUploadId") String customerListUploadId
    ) {
        return adAccountsService.customerListUploadsRun(adAccountId, customerListId, customerListUploadId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/customer_lists")
    public CustomerList customerListsCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "customerListCreate") CustomerListCreate customerListCreate
    ) {
        return adAccountsService.customerListsCreate(adAccountId, customerListCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/customer_lists/{customer_list_id}")
    public CustomerList customerListsGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "customerListId") String customerListId
    ) {
        return adAccountsService.customerListsGet(adAccountId, customerListId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/customer_lists")
    public CustomerListsList200Response customerListsList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "order") PinterestLibPaginationOrder order,
        @RequestParam(name = "excludeNca", defaultValue = "false") Boolean excludeNca
    ) {
        return adAccountsService.customerListsList(adAccountId, bookmark, pageSize, order, excludeNca);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{ad_account_id}/customer_lists/{customer_list_id}")
    public CustomerList customerListsUpdate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "customerListId") String customerListId,
        @RequestParam(name = "customerListUpdateWithRequiredBody") CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody
    ) {
        return adAccountsService.customerListsUpdate(adAccountId, customerListId, customerListUpdateWithRequiredBody);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/customer_segments")
    public CustomerSegment customerSegmentCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "customerSegmentCreate") CustomerSegmentCreate customerSegmentCreate
    ) {
        return adAccountsService.customerSegmentCreate(adAccountId, customerSegmentCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/customer_segments")
    public CustomerSegmentList200Response customerSegmentList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "order") PinterestLibPaginationOrder order,
        @RequestParam(name = "includeSizing", defaultValue = "false") Boolean includeSizing,
        @RequestParam(name = "searchQuery") String searchQuery
    ) {
        return adAccountsService.customerSegmentList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{ad_account_id}/customer_segments")
    public void customerSegmentUpdate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "customerSegmentUpdateRequestUpdateWithRequiredBody") CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody
    ) {
        adAccountsService.customerSegmentUpdate(adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/events")
    public ConversionEvents eventsCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "conversionEventsCreate") ConversionEventsCreate conversionEventsCreate,
        @RequestParam(name = "test") Boolean test
    ) {
        return adAccountsService.eventsCreate(adAccountId, conversionEventsCreate, test);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/promotion_applied_entities")
    public AdGroupsList200Response getAdGroupsByPromotionIdsList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "promotionIds") List<String> promotionIds,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "order") PinterestLibPaginationOrder order
    ) {
        return adAccountsService.getAdGroupsByPromotionIdsList(adAccountId, promotionIds, bookmark, pageSize, order);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/campaigns/delivery_estimates")
    public CampaignDeliveryEstimatesResponse getCampaignDeliveryEstimates(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "campaignDeliveryEstimatesCampaign") List<CampaignDeliveryEstimatesCampaign> campaignDeliveryEstimatesCampaign
    ) {
        return adAccountsService.getCampaignDeliveryEstimates(adAccountId, campaignDeliveryEstimatesCampaign);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/keywords")
    public Keywords keywordsCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "keywordsCreate") KeywordsCreate keywordsCreate
    ) {
        return adAccountsService.keywordsCreate(adAccountId, keywordsCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/keywords")
    public KeywordsGet200Response keywordsGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "campaignId") String campaignId,
        @RequestParam(name = "adGroupId") String adGroupId,
        @RequestParam(name = "adGroupIds") List<String> adGroupIds,
        @RequestParam(name = "matchTypes") List<MatchType> matchTypes,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return adAccountsService.keywordsGet(adAccountId, campaignId, adGroupId, adGroupIds, matchTypes, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{ad_account_id}/keywords")
    public Keywords keywordsUpdate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "keywordsUpdate") KeywordsUpdate keywordsUpdate
    ) {
        return adAccountsService.keywordsUpdate(adAccountId, keywordsUpdate);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/labels/{label_id}/apply")
    public LabeledEntities labelsApply(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "labelId") String labelId,
        @RequestParam(name = "labeledEntitiesCreate") LabeledEntitiesCreate labeledEntitiesCreate
    ) {
        return adAccountsService.labelsApply(adAccountId, labelId, labeledEntitiesCreate);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/labels")
    public LabelsResponse labelsCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "labelCreateRequest") LabelCreateRequest labelCreateRequest
    ) {
        return adAccountsService.labelsCreate(adAccountId, labelCreateRequest);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/labels")
    public LabelsList200Response labelsList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "campaignIds") List<String> campaignIds,
        @RequestParam(name = "labelIds") List<String> labelIds,
        @RequestParam(name = "entityStatuses", defaultValue = "ACTIVE") List<QueryLabelEntityStatusesItems> entityStatuses,
        @RequestParam(name = "labelTypes", defaultValue = "BRAND,CUSTOM") List<QueryLabelTypesItems> labelTypes,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return adAccountsService.labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/labels/{label_id}/remove")
    public LabeledEntities labelsRemove(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "labelId") String labelId,
        @RequestParam(name = "labeledEntitiesCreate") LabeledEntitiesCreate labeledEntitiesCreate
    ) {
        return adAccountsService.labelsRemove(adAccountId, labelId, labeledEntitiesCreate);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{ad_account_id}/labels")
    public LabelsResponse labelsUpdate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "labelUpdateRequest") LabelUpdateRequest labelUpdateRequest
    ) {
        return adAccountsService.labelsUpdate(adAccountId, labelUpdateRequest);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/lead_forms/{lead_form_id}")
    public LeadForm leadFormGet(
        @RequestParam(name = "leadFormId") String leadFormId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.leadFormGet(leadFormId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/lead_forms/{lead_form_id}/test")
    public LeadFormTest leadFormTestCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "leadFormId") String leadFormId,
        @RequestParam(name = "leadFormTestCreate") LeadFormTestCreate leadFormTestCreate
    ) {
        return adAccountsService.leadFormTestCreate(adAccountId, leadFormId, leadFormTestCreate);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/lead_forms")
    public LeadFormsCreate200Response leadFormsCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "leadFormCreate") List<LeadFormCreate> leadFormCreate
    ) {
        return adAccountsService.leadFormsCreate(adAccountId, leadFormCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/lead_forms")
    public LeadFormsList200Response leadFormsList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "order") PinterestLibPaginationOrder order
    ) {
        return adAccountsService.leadFormsList(adAccountId, bookmark, pageSize, order);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{ad_account_id}/lead_forms")
    public LeadFormsCreate200Response leadFormsUpdate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "leadFormBatchUpdate") List<LeadFormBatchUpdate> leadFormBatchUpdate
    ) {
        return adAccountsService.leadFormsUpdate(adAccountId, leadFormBatchUpdate);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/leads_export")
    public LeadsExports leadsExportCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "leadsExportsCreate") LeadsExportsCreate leadsExportsCreate
    ) {
        return adAccountsService.leadsExportCreate(adAccountId, leadsExportsCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/leads_export/{leads_export_id}")
    public LeadsExportResponseData leadsExportGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "leadsExportId") String leadsExportId
    ) {
        return adAccountsService.leadsExportGet(adAccountId, leadsExportId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/msot/events")
    public void msotEventsCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "conversionMSOTEventsCreate") ConversionMSOTEventsCreate conversionMSOTEventsCreate
    ) {
        adAccountsService.msotEventsCreate(adAccountId, conversionMSOTEventsCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/conversion_tags/ocpm_eligible")
    public Map<String, List<ConversionEventResponse>> ocpmEligibleConversionTagsGet(
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.ocpmEligibleConversionTagsGet(adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/order_lines/{order_line_id}")
    public OrderLine orderLinesGet(
        @RequestParam(name = "orderLineId") String orderLineId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.orderLinesGet(orderLineId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/order_lines")
    public OrderLinesList200Response orderLinesList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "order") PinterestLibPaginationOrder order
    ) {
        return adAccountsService.orderLinesList(adAccountId, bookmark, pageSize, order);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/conversion_tags/page_visit")
    public PageVisitConversionTagsGet200Response pageVisitConversionTagsGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "order") PinterestLibPaginationOrder order
    ) {
        return adAccountsService.pageVisitConversionTagsGet(adAccountId, bookmark, pageSize, order);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/product_group_promotions")
    public ProductGroupPromotions productGroupPromotionsCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "productGroupPromotionsCreate") ProductGroupPromotionsCreate productGroupPromotionsCreate
    ) {
        return adAccountsService.productGroupPromotionsCreate(adAccountId, productGroupPromotionsCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/product_group_promotions/{product_group_promotion_id}")
    public ProductGroupPromotion productGroupPromotionsGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "productGroupPromotionId") String productGroupPromotionId
    ) {
        return adAccountsService.productGroupPromotionsGet(adAccountId, productGroupPromotionId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/product_group_promotions")
    public ProductGroupPromotionsList200Response productGroupPromotionsList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "order") PinterestLibPaginationOrder order,
        @RequestParam(name = "productGroupPromotionIds") List<String> productGroupPromotionIds,
        @RequestParam(name = "entityStatuses", defaultValue = "ACTIVE,PAUSED") List<EntityStatus> entityStatuses,
        @RequestParam(name = "adGroupId") String adGroupId
    ) {
        return adAccountsService.productGroupPromotionsList(adAccountId, bookmark, pageSize, order, productGroupPromotionIds, entityStatuses, adGroupId);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{ad_account_id}/product_group_promotions")
    public ProductGroupPromotions productGroupPromotionsUpdate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "productGroupPromotionsUpdateWithRequiredBody") ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody
    ) {
        return adAccountsService.productGroupPromotionsUpdate(adAccountId, productGroupPromotionsUpdateWithRequiredBody);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/product_groups/analytics")
    public List<ProductGroupAnalyticsItems> productGroupsAnalytics(
        @RequestParam(name = "startDate") LocalDate startDate,
        @RequestParam(name = "endDate") LocalDate endDate,
        @RequestParam(name = "productGroupIds") List<String> productGroupIds,
        @RequestParam(name = "columns") List<ReportingColumnSync> columns,
        @RequestParam(name = "granularity") Granularity granularity,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "clickWindowDays", defaultValue = "30") BigDecimal clickWindowDays,
        @RequestParam(name = "engagementWindowDays", defaultValue = "30") BigDecimal engagementWindowDays,
        @RequestParam(name = "viewWindowDays", defaultValue = "1") BigDecimal viewWindowDays,
        @RequestParam(name = "conversionReportTime", defaultValue = "TIME_OF_AD_ACTION") String conversionReportTime,
        @RequestParam(name = "reportingTimezone") ReportingTimeZone reportingTimezone
    ) {
        return adAccountsService.productGroupsAnalytics(startDate, endDate, productGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/promotions")
    public PromotionsResponse promotionsCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "promotionCreate") List<PromotionCreate> promotionCreate
    ) {
        return adAccountsService.promotionsCreate(adAccountId, promotionCreate);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{ad_account_id}/promotions/{promotion_id}")
    public Promotion promotionsDelete(
        @RequestParam(name = "promotionId") String promotionId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.promotionsDelete(promotionId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/promotions/{promotion_id}")
    public Promotion promotionsGet(
        @RequestParam(name = "promotionId") String promotionId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.promotionsGet(promotionId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/promotions")
    public PromotionsList200Response promotionsList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "order") PinterestLibPaginationOrder order
    ) {
        return adAccountsService.promotionsList(adAccountId, bookmark, pageSize, order);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{ad_account_id}/promotions")
    public PromotionsResponse promotionsUpdate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "promotionBatchUpdate") List<PromotionBatchUpdate> promotionBatchUpdate
    ) {
        return adAccountsService.promotionsUpdate(adAccountId, promotionBatchUpdate);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{ad_account_id}/sandbox")
    public String sandboxDelete(
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.sandboxDelete(adAccountId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/schedules")
    public List<SchedulesCreate200ResponseInner> schedulesCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "scheduleCreate") List<ScheduleCreate> scheduleCreate
    ) {
        return adAccountsService.schedulesCreate(adAccountId, scheduleCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/schedules")
    public SchedulesList200Response schedulesList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "entityIds") List<String> entityIds,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "order") PinterestLibPaginationOrder order,
        @RequestParam(name = "scheduleStatuses") List<ScheduleStatus> scheduleStatuses,
        @RequestParam(name = "scheduleType") ScheduleType scheduleType
    ) {
        return adAccountsService.schedulesList(adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{ad_account_id}/schedules")
    public List<SchedulesCreate200ResponseInner> schedulesUpdate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "scheduleBatchUpdate") List<ScheduleBatchUpdate> scheduleBatchUpdate
    ) {
        return adAccountsService.schedulesUpdate(adAccountId, scheduleBatchUpdate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/ssio/accounts")
    public SSIOAccount ssioAccountsGet(
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return adAccountsService.ssioAccountsGet(adAccountId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/ssio/insertion_orders")
    public SSIOInsertionOrder ssioInsertionOrderCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "ssIOInsertionOrderCreate") SSIOInsertionOrderCreate ssIOInsertionOrderCreate
    ) {
        return adAccountsService.ssioInsertionOrderCreate(adAccountId, ssIOInsertionOrderCreate);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{ad_account_id}/ssio/insertion_orders")
    public SSIOInsertionOrder ssioInsertionOrderEdit(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "ssIOInsertionOrderUpdate") SSIOInsertionOrderUpdate ssIOInsertionOrderUpdate
    ) {
        return adAccountsService.ssioInsertionOrderEdit(adAccountId, ssIOInsertionOrderUpdate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/ssio/insertion_orders/status")
    public SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return adAccountsService.ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status")
    public SSIOInsertionOrderStatusResponse ssioInsertionOrdersStatusGetByPinOrderId(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "pinOrderId") String pinOrderId
    ) {
        return adAccountsService.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/ssio/order_lines")
    public SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "pinOrderId") String pinOrderId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return adAccountsService.ssioOrderLinesGetByAdAccount(adAccountId, pinOrderId, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{ad_account_id}/targeting_templates")
    public TargetingTemplate targetingTemplateCreate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "targetingTemplateCreate") TargetingTemplateCreate targetingTemplateCreate
    ) {
        return adAccountsService.targetingTemplateCreate(adAccountId, targetingTemplateCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/targeting_templates")
    public TargetingTemplateList200Response targetingTemplateList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "order") PinterestLibPaginationOrder order,
        @RequestParam(name = "includeSizing", defaultValue = "false") Boolean includeSizing,
        @RequestParam(name = "searchQuery") String searchQuery
    ) {
        return adAccountsService.targetingTemplateList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{ad_account_id}/targeting_templates")
    public void targetingTemplateUpdate(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "targetingTemplateUpdateRequestReadOrUpdate") TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate
    ) {
        adAccountsService.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequestReadOrUpdate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/templates")
    public TemplatesList200Response templatesList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "order") PinterestLibPaginationOrder order
    ) {
        return adAccountsService.templatesList(adAccountId, bookmark, pageSize, order);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ad_account_id}/terms_of_service")
    public TermsOfService termsOfServiceGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "includeHtml", defaultValue = "false") Boolean includeHtml,
        @RequestParam(name = "tosType") String tosType
    ) {
        return adAccountsService.termsOfServiceGet(adAccountId, includeHtml, tosType);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{ad_account_id}/audiences/ad_accounts/shared")
    public AdAccountToAdAccountSharedAudience updateAdAccountToAdAccountSharedAudience(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adAccountToAdAccountSharedAudienceUpdateWithRequiredBody") AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody
    ) {
        return adAccountsService.updateAdAccountToAdAccountSharedAudience(adAccountId, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{ad_account_id}/audiences/businesses/shared")
    public AdAccountToBusinessSharedAudience updateAdAccountToBusinessSharedAudience(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "adAccountToBusinessSharedAudienceUpdateWithRequiredBody") AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody
    ) {
        return adAccountsService.updateAdAccountToBusinessSharedAudience(adAccountId, adAccountToBusinessSharedAudienceUpdateWithRequiredBody);
    }
}
