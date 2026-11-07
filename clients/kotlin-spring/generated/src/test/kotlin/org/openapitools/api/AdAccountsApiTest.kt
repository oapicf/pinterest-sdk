package org.openapitools.api

import org.openapitools.model.Ad
import org.openapitools.model.AdAccount
import org.openapitools.model.AdAccountAnalyticsItems
import org.openapitools.model.AdAccountCreate
import org.openapitools.model.AdAccountToAdAccountSharedAudience
import org.openapitools.model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
import org.openapitools.model.AdAccountToBusinessSharedAudience
import org.openapitools.model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
import org.openapitools.model.AdAccountsAudience
import org.openapitools.model.AdAccountsAudienceCreate
import org.openapitools.model.AdAccountsAudienceUpdate
import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.model.AdAccountsList200Response
import org.openapitools.model.AdAccountsSubscriptionsGetList200Response
import org.openapitools.model.AdBatchUpdate
import org.openapitools.model.AdBatchWriteResponseModel
import org.openapitools.model.AdCreate
import org.openapitools.model.AdGroup
import org.openapitools.model.AdGroupAudienceSizing
import org.openapitools.model.AdGroupAudienceSizingCreate
import org.openapitools.model.AdGroupCreateCreate
import org.openapitools.model.AdGroupUpdateBatchUpdate
import org.openapitools.model.AdGroupsAnalyticsMetrics
import org.openapitools.model.AdGroupsCreate200Response
import org.openapitools.model.AdGroupsList200Response
import org.openapitools.model.AdPinAnalytics
import org.openapitools.model.AdPreviewRequest
import org.openapitools.model.AdPreviewURLResponse
import org.openapitools.model.AdsAnalytics
import org.openapitools.model.AdsAnalyticsAccountTargetingType
import org.openapitools.model.AdsAnalyticsAdGroupTargetingType
import org.openapitools.model.AdsAnalyticsAdTargetingType
import org.openapitools.model.AdsAnalyticsCampaignTargetingType
import org.openapitools.model.AdsAnalyticsCreateAsyncRequest
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse
import org.openapitools.model.AdsAnalyticsGetAsyncResponse
import org.openapitools.model.AdsCreditRedeem
import org.openapitools.model.AdsCreditRedeemCreate
import org.openapitools.model.AdsCreditsDiscountsGet200Response
import org.openapitools.model.AdsList200Response
import org.openapitools.model.AdvertiserDefinedEventsCreate200Response
import org.openapitools.model.AdvertiserDefinedEventsCreateRequest
import org.openapitools.model.AdvertiserDefinedEventsGet200Response
import org.openapitools.model.AudienceAccountType
import org.openapitools.model.AudienceInsightType
import org.openapitools.model.AudienceInsights
import org.openapitools.model.AudienceInsightsScopeAndTypeGet200Response
import org.openapitools.model.AudienceOwnershipType
import org.openapitools.model.AudiencesList200Response
import org.openapitools.model.BidFloor
import org.openapitools.model.BidFloorCreate
import org.openapitools.model.BillingInvoiceDocumentType
import org.openapitools.model.BillingInvoiceDownloadResponse
import org.openapitools.model.BillingInvoiceSortField
import org.openapitools.model.BillingInvoiceStatus
import org.openapitools.model.BillingInvoicesGet200Response
import org.openapitools.model.BillingProfilesGet200Response
import org.openapitools.model.BulkDownload
import org.openapitools.model.BulkDownloadCreate
import org.openapitools.model.BulkJobData
import org.openapitools.model.BulkUpsertRequest
import org.openapitools.model.BulkUpsertResponse
import org.openapitools.model.Campaign
import org.openapitools.model.CampaignAdPreview
import org.openapitools.model.CampaignAdPreviewCreate
import org.openapitools.model.CampaignAdPreviewCreate200ResponseInner
import org.openapitools.model.CampaignAdPreviewDelete200ResponseInner
import org.openapitools.model.CampaignBatchUpdateItem
import org.openapitools.model.CampaignBatchWriteResponseModel
import org.openapitools.model.CampaignCreateItem
import org.openapitools.model.CampaignDeliveryEstimatesCampaign
import org.openapitools.model.CampaignDeliveryEstimatesResponse
import org.openapitools.model.CampaignsAnalyticsMetrics
import org.openapitools.model.CampaignsList200Response
import org.openapitools.model.ConversionAttributionWindowDays
import org.openapitools.model.ConversionDeletionRequest
import org.openapitools.model.ConversionDeletionRequestCreate
import org.openapitools.model.ConversionDeletionRequestList200Response
import org.openapitools.model.ConversionEventResponse
import org.openapitools.model.ConversionEvents
import org.openapitools.model.ConversionEventsCreate
import org.openapitools.model.ConversionMSOTEventsCreate
import org.openapitools.model.ConversionProductReport
import org.openapitools.model.ConversionProductReportCreate
import org.openapitools.model.ConversionReportAttributionType
import org.openapitools.model.ConversionReportTimeType
import org.openapitools.model.ConversionTag
import org.openapitools.model.ConversionTagCreate
import org.openapitools.model.ConversionTagsList200Response
import org.openapitools.model.CustomerList
import org.openapitools.model.CustomerListCreate
import org.openapitools.model.CustomerListUpdateWithRequiredBody
import org.openapitools.model.CustomerListUpload
import org.openapitools.model.CustomerListUploadCreateRequest
import org.openapitools.model.CustomerListUploadCreateResponse
import org.openapitools.model.CustomerListsList200Response
import org.openapitools.model.CustomerSegment
import org.openapitools.model.CustomerSegmentCreate
import org.openapitools.model.CustomerSegmentList200Response
import org.openapitools.model.CustomerSegmentUpdateRequestUpdateWithRequiredBody
import org.openapitools.model.DetailedError
import org.openapitools.model.DynamicTitlesDownloadCSV
import org.openapitools.model.DynamicTitlesGetStatus
import org.openapitools.model.DynamicTitlesProcessCSV
import org.openapitools.model.DynamicTitlesProcessCSVCreate
import org.openapitools.model.DynamicTitlesUploadURL
import org.openapitools.model.EntityStatus
import org.openapitools.model.EventQualityScore
import org.openapitools.model.Granularity
import org.openapitools.model.IngestionSourceOptions
import org.openapitools.model.Keywords
import org.openapitools.model.KeywordsCreate
import org.openapitools.model.KeywordsGet200Response
import org.openapitools.model.KeywordsMetricsArrayResponse
import org.openapitools.model.KeywordsUpdate
import org.openapitools.model.LabelCreateRequest
import org.openapitools.model.LabelUpdateRequest
import org.openapitools.model.LabeledEntities
import org.openapitools.model.LabeledEntitiesCreate
import org.openapitools.model.LabelsList200Response
import org.openapitools.model.LabelsResponse
import org.openapitools.model.LeadForm
import org.openapitools.model.LeadFormBatchUpdate
import org.openapitools.model.LeadFormCreate
import org.openapitools.model.LeadFormTest
import org.openapitools.model.LeadFormTestCreate
import org.openapitools.model.LeadFormsCreate200Response
import org.openapitools.model.LeadFormsList200Response
import org.openapitools.model.LeadSubscription
import org.openapitools.model.LeadSubscriptionPostParamsCreate
import org.openapitools.model.LeadsExportResponseData
import org.openapitools.model.LeadsExports
import org.openapitools.model.LeadsExportsCreate
import org.openapitools.model.LookbackPeriodOptions
import org.openapitools.model.MMMReport
import org.openapitools.model.MMMReportCreate
import org.openapitools.model.MatchType
import org.openapitools.model.MetricsResponse
import org.openapitools.model.OrderLine
import org.openapitools.model.OrderLinesList200Response
import org.openapitools.model.PageVisitConversionTagsGet200Response
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PinterestLibPaginationOrder
import org.openapitools.model.ProductGroupAnalyticsItems
import org.openapitools.model.ProductGroupPromotion
import org.openapitools.model.ProductGroupPromotions
import org.openapitools.model.ProductGroupPromotionsCreate
import org.openapitools.model.ProductGroupPromotionsList200Response
import org.openapitools.model.ProductGroupPromotionsUpdateWithRequiredBody
import org.openapitools.model.Promotion
import org.openapitools.model.PromotionBatchUpdate
import org.openapitools.model.PromotionCreate
import org.openapitools.model.PromotionsList200Response
import org.openapitools.model.PromotionsResponse
import org.openapitools.model.QueryLabelEntityStatusesItems
import org.openapitools.model.QueryLabelTypesItems
import org.openapitools.model.ReportingColumnSync
import org.openapitools.model.ReportingTimeZone
import org.openapitools.model.SSIOAccount
import org.openapitools.model.SSIOInsertionOrder
import org.openapitools.model.SSIOInsertionOrderCreate
import org.openapitools.model.SSIOInsertionOrderStatusResponse
import org.openapitools.model.SSIOInsertionOrderUpdate
import org.openapitools.model.Schedule
import org.openapitools.model.ScheduleBatchUpdate
import org.openapitools.model.ScheduleCreate
import org.openapitools.model.ScheduleStatus
import org.openapitools.model.ScheduleType
import org.openapitools.model.SchedulesCreate200ResponseInner
import org.openapitools.model.SchedulesList200Response
import org.openapitools.model.SourcePlatformOptions
import org.openapitools.model.SsioInsertionOrdersStatusGetByAdAccount200Response
import org.openapitools.model.SsioOrderLinesGetByAdAccount200Response
import org.openapitools.model.TargetingTemplate
import org.openapitools.model.TargetingTemplateCreate
import org.openapitools.model.TargetingTemplateList200Response
import org.openapitools.model.TargetingTemplateUpdateRequestReadOrUpdate
import org.openapitools.model.TemplateBasedReport
import org.openapitools.model.TemplatesList200Response
import org.openapitools.model.TermsOfService
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class AdAccountsApiTest {

    private val api: AdAccountsApiController = AdAccountsApiController()

    /**
     * To test AdAccountsApiController.adAccountAnalytics
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adAccountAnalyticsTest() {
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val columns: kotlin.collections.List<ReportingColumnSync> = TODO()
        val granularity: Granularity = TODO()
        val adAccountId: kotlin.String = TODO()
        val clickWindowDays: java.math.BigDecimal = TODO()
        val engagementWindowDays: java.math.BigDecimal = TODO()
        val viewWindowDays: java.math.BigDecimal = TODO()
        val conversionReportTime: kotlin.String = TODO()
        val reportingTimezone: ReportingTimeZone? = TODO()
        
        
        val response: ResponseEntity<List<AdAccountAnalyticsItems>> = api.adAccountAnalytics(startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adAccountTargetingAnalyticsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adAccountTargetingAnalyticsGetTest() {
        val adAccountId: kotlin.String = TODO()
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val targetingTypes: kotlin.collections.List<AdsAnalyticsAccountTargetingType> = TODO()
        val columns: kotlin.collections.List<ReportingColumnSync> = TODO()
        val granularity: Granularity = TODO()
        val clickWindowDays: java.math.BigDecimal = TODO()
        val engagementWindowDays: java.math.BigDecimal = TODO()
        val viewWindowDays: java.math.BigDecimal = TODO()
        val conversionReportTime: kotlin.String = TODO()
        val attributionTypes: kotlin.collections.List<ConversionReportAttributionType>? = TODO()
        val reportingTimezone: ReportingTimeZone? = TODO()
        
        
        val response: ResponseEntity<MetricsResponse> = api.adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adAccountsAudiencesSharedAccountsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adAccountsAudiencesSharedAccountsListTest() {
        val audienceId: kotlin.String = TODO()
        val accountType: AudienceAccountType = TODO()
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response> = api.adAccountsAudiencesSharedAccountsList(audienceId, accountType, adAccountId, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adAccountsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adAccountsCreateTest() {
        val adAccountCreate: AdAccountCreate = TODO()
        
        
        val response: ResponseEntity<AdAccount> = api.adAccountsCreate(adAccountCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adAccountsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adAccountsGetTest() {
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<AdAccount> = api.adAccountsGet(adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adAccountsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adAccountsListTest() {
        val includeSharedAccounts: kotlin.Boolean = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<AdAccountsList200Response> = api.adAccountsList(includeSharedAccounts, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adAccountsSubscriptionsDelById
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adAccountsSubscriptionsDelByIdTest() {
        val adAccountId: kotlin.String = TODO()
        val subscriptionId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<LeadSubscription> = api.adAccountsSubscriptionsDelById(adAccountId, subscriptionId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adAccountsSubscriptionsGetById
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adAccountsSubscriptionsGetByIdTest() {
        val adAccountId: kotlin.String = TODO()
        val subscriptionId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<LeadSubscription> = api.adAccountsSubscriptionsGetById(adAccountId, subscriptionId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adAccountsSubscriptionsGetList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adAccountsSubscriptionsGetListTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<AdAccountsSubscriptionsGetList200Response> = api.adAccountsSubscriptionsGetList(adAccountId, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adAccountsSubscriptionsPost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adAccountsSubscriptionsPostTest() {
        val adAccountId: kotlin.String = TODO()
        val leadSubscriptionPostParamsCreate: LeadSubscriptionPostParamsCreate = TODO()
        
        
        val response: ResponseEntity<LeadSubscription> = api.adAccountsSubscriptionsPost(adAccountId, leadSubscriptionPostParamsCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adGroupsAnalytics
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adGroupsAnalyticsTest() {
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val adGroupIds: kotlin.collections.List<kotlin.String> = TODO()
        val columns: kotlin.collections.List<ReportingColumnSync> = TODO()
        val granularity: Granularity = TODO()
        val adAccountId: kotlin.String = TODO()
        val clickWindowDays: java.math.BigDecimal = TODO()
        val engagementWindowDays: java.math.BigDecimal = TODO()
        val viewWindowDays: java.math.BigDecimal = TODO()
        val conversionReportTime: kotlin.String = TODO()
        val aggregateReportRows: kotlin.Boolean = TODO()
        val reportingTimezone: ReportingTimeZone? = TODO()
        
        
        val response: ResponseEntity<List<AdGroupsAnalyticsMetrics>> = api.adGroupsAnalytics(startDate, endDate, adGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adGroupsAudienceSizing
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adGroupsAudienceSizingTest() {
        val adAccountId: kotlin.String = TODO()
        val adGroupAudienceSizingCreate: AdGroupAudienceSizingCreate = TODO()
        
        
        val response: ResponseEntity<AdGroupAudienceSizing> = api.adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adGroupsBidFloorGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adGroupsBidFloorGetTest() {
        val adAccountId: kotlin.String = TODO()
        val bidFloorCreate: BidFloorCreate = TODO()
        
        
        val response: ResponseEntity<BidFloor> = api.adGroupsBidFloorGet(adAccountId, bidFloorCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adGroupsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adGroupsCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val adGroupCreateCreate: kotlin.collections.List<AdGroupCreateCreate> = TODO()
        
        
        val response: ResponseEntity<AdGroupsCreate200Response> = api.adGroupsCreate(adAccountId, adGroupCreateCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adGroupsDynamicTitlesDownloadCsv
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adGroupsDynamicTitlesDownloadCsvTest() {
        val adAccountId: kotlin.String = TODO()
        val adGroupId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<DynamicTitlesDownloadCSV> = api.adGroupsDynamicTitlesDownloadCsv(adAccountId, adGroupId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adGroupsDynamicTitlesGetStatus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adGroupsDynamicTitlesGetStatusTest() {
        val adAccountId: kotlin.String = TODO()
        val adGroupId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<DynamicTitlesGetStatus> = api.adGroupsDynamicTitlesGetStatus(adAccountId, adGroupId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adGroupsDynamicTitlesGetUploadUrl
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adGroupsDynamicTitlesGetUploadUrlTest() {
        val adAccountId: kotlin.String = TODO()
        val adGroupId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<DynamicTitlesUploadURL> = api.adGroupsDynamicTitlesGetUploadUrl(adAccountId, adGroupId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adGroupsDynamicTitlesProcessCsv
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adGroupsDynamicTitlesProcessCsvTest() {
        val adAccountId: kotlin.String = TODO()
        val adGroupId: kotlin.String = TODO()
        val dynamicTitlesProcessCSVCreate: DynamicTitlesProcessCSVCreate = TODO()
        
        
        val response: ResponseEntity<DynamicTitlesProcessCSV> = api.adGroupsDynamicTitlesProcessCsv(adAccountId, adGroupId, dynamicTitlesProcessCSVCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adGroupsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adGroupsGetTest() {
        val adGroupId: kotlin.String = TODO()
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<AdGroup> = api.adGroupsGet(adGroupId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adGroupsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adGroupsListTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: PinterestLibPaginationOrder? = TODO()
        val campaignIds: kotlin.collections.List<kotlin.String>? = TODO()
        val adGroupIds: kotlin.collections.List<kotlin.String>? = TODO()
        val entityStatuses: kotlin.collections.List<EntityStatus> = TODO()
        val translateInterestsToNames: kotlin.Boolean = TODO()
        
        
        val response: ResponseEntity<AdGroupsList200Response> = api.adGroupsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, entityStatuses, translateInterestsToNames)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adGroupsTargetingAnalyticsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adGroupsTargetingAnalyticsGetTest() {
        val adAccountId: kotlin.String = TODO()
        val adGroupIds: kotlin.collections.List<kotlin.String> = TODO()
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val targetingTypes: kotlin.collections.List<AdsAnalyticsAdGroupTargetingType> = TODO()
        val columns: kotlin.collections.List<ReportingColumnSync> = TODO()
        val granularity: Granularity = TODO()
        val clickWindowDays: java.math.BigDecimal = TODO()
        val engagementWindowDays: java.math.BigDecimal = TODO()
        val viewWindowDays: java.math.BigDecimal = TODO()
        val conversionReportTime: kotlin.String = TODO()
        val attributionTypes: kotlin.collections.List<ConversionReportAttributionType>? = TODO()
        val reportingTimezone: ReportingTimeZone? = TODO()
        val sortColumns: kotlin.collections.List<kotlin.String>? = TODO()
        val sortAscending: kotlin.Boolean? = TODO()
        
        
        val response: ResponseEntity<MetricsResponse> = api.adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adGroupsUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adGroupsUpdateTest() {
        val adAccountId: kotlin.String = TODO()
        val adGroupUpdateBatchUpdate: kotlin.collections.List<AdGroupUpdateBatchUpdate> = TODO()
        
        
        val response: ResponseEntity<AdGroupsCreate200Response> = api.adGroupsUpdate(adAccountId, adGroupUpdateBatchUpdate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adPinsAnalytics
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adPinsAnalyticsTest() {
        val campaignId: kotlin.String = TODO()
        val pinIds: kotlin.collections.List<kotlin.String> = TODO()
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val columns: kotlin.collections.List<ReportingColumnSync> = TODO()
        val granularity: Granularity = TODO()
        val adAccountId: kotlin.String = TODO()
        val clickWindowDays: java.math.BigDecimal = TODO()
        val engagementWindowDays: java.math.BigDecimal = TODO()
        val viewWindowDays: java.math.BigDecimal = TODO()
        val conversionReportTime: kotlin.String = TODO()
        
        
        val response: ResponseEntity<List<AdPinAnalytics>> = api.adPinsAnalytics(campaignId, pinIds, startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adPreviewsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adPreviewsCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val adPreviewRequest: AdPreviewRequest = TODO()
        
        
        val response: ResponseEntity<AdPreviewURLResponse> = api.adPreviewsCreate(adAccountId, adPreviewRequest)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adTargetingAnalyticsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adTargetingAnalyticsGetTest() {
        val adAccountId: kotlin.String = TODO()
        val adIds: kotlin.collections.List<kotlin.String> = TODO()
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val targetingTypes: kotlin.collections.List<AdsAnalyticsAdTargetingType> = TODO()
        val columns: kotlin.collections.List<ReportingColumnSync> = TODO()
        val granularity: Granularity = TODO()
        val clickWindowDays: ConversionAttributionWindowDays? = TODO()
        val engagementWindowDays: ConversionAttributionWindowDays? = TODO()
        val viewWindowDays: ConversionAttributionWindowDays? = TODO()
        val conversionReportTime: ConversionReportTimeType? = TODO()
        val attributionTypes: kotlin.collections.List<ConversionReportAttributionType>? = TODO()
        val reportingTimezone: ReportingTimeZone? = TODO()
        val sortColumns: kotlin.collections.List<kotlin.String>? = TODO()
        val sortAscending: kotlin.Boolean? = TODO()
        
        
        val response: ResponseEntity<MetricsResponse> = api.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adsAnalytics
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adsAnalyticsTest() {
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val columns: kotlin.collections.List<ReportingColumnSync> = TODO()
        val granularity: Granularity = TODO()
        val adAccountId: kotlin.String = TODO()
        val pinIds: kotlin.collections.List<kotlin.String>? = TODO()
        val adIds: kotlin.collections.List<kotlin.String>? = TODO()
        val clickWindowDays: java.math.BigDecimal = TODO()
        val engagementWindowDays: java.math.BigDecimal = TODO()
        val viewWindowDays: java.math.BigDecimal = TODO()
        val conversionReportTime: kotlin.String = TODO()
        val campaignIds: kotlin.collections.List<kotlin.String>? = TODO()
        val reportingTimezone: ReportingTimeZone? = TODO()
        
        
        val response: ResponseEntity<List<AdsAnalytics>> = api.adsAnalytics(startDate, endDate, columns, granularity, adAccountId, pinIds, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, campaignIds, reportingTimezone)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adsCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val adCreate: kotlin.collections.List<AdCreate> = TODO()
        
        
        val response: ResponseEntity<AdBatchWriteResponseModel> = api.adsCreate(adAccountId, adCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adsCreditRedeem
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adsCreditRedeemTest() {
        val adAccountId: kotlin.String = TODO()
        val adsCreditRedeemCreate: AdsCreditRedeemCreate = TODO()
        
        
        val response: ResponseEntity<AdsCreditRedeem> = api.adsCreditRedeem(adAccountId, adsCreditRedeemCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adsCreditsDiscountsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adsCreditsDiscountsGetTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<AdsCreditsDiscountsGet200Response> = api.adsCreditsDiscountsGet(adAccountId, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adsGetTest() {
        val adId: kotlin.String = TODO()
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<Ad> = api.adsGet(adId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adsListTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: PinterestLibPaginationOrder? = TODO()
        val campaignIds: kotlin.collections.List<kotlin.String>? = TODO()
        val adGroupIds: kotlin.collections.List<kotlin.String>? = TODO()
        val adIds: kotlin.collections.List<kotlin.String>? = TODO()
        val entityStatuses: kotlin.collections.List<EntityStatus> = TODO()
        
        
        val response: ResponseEntity<AdsList200Response> = api.adsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, adIds, entityStatuses)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adsUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adsUpdateTest() {
        val adAccountId: kotlin.String = TODO()
        val adBatchUpdate: kotlin.collections.List<AdBatchUpdate> = TODO()
        
        
        val response: ResponseEntity<AdBatchWriteResponseModel> = api.adsUpdate(adAccountId, adBatchUpdate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.advertiserDefinedEventsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun advertiserDefinedEventsCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest = TODO()
        
        
        val response: ResponseEntity<AdvertiserDefinedEventsCreate200Response> = api.advertiserDefinedEventsCreate(adAccountId, advertiserDefinedEventsCreateRequest)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.advertiserDefinedEventsDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun advertiserDefinedEventsDeleteTest() {
        val adAccountId: kotlin.String = TODO()
        val eventNames: kotlin.collections.List<kotlin.String> = TODO()
        
        
        val response: ResponseEntity<AdvertiserDefinedEventsCreate200Response> = api.advertiserDefinedEventsDelete(adAccountId, eventNames)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.advertiserDefinedEventsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun advertiserDefinedEventsGetTest() {
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<AdvertiserDefinedEventsGet200Response> = api.advertiserDefinedEventsGet(adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.advertiserDefinedEventsUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun advertiserDefinedEventsUpdateTest() {
        val adAccountId: kotlin.String = TODO()
        val advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest = TODO()
        
        
        val response: ResponseEntity<AdvertiserDefinedEventsCreate200Response> = api.advertiserDefinedEventsUpdate(adAccountId, advertiserDefinedEventsCreateRequest)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.analyticsCreateConversionProductReport
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun analyticsCreateConversionProductReportTest() {
        val adAccountId: kotlin.String = TODO()
        val conversionProductReportCreate: ConversionProductReportCreate = TODO()
        
        
        val response: ResponseEntity<ConversionProductReport> = api.analyticsCreateConversionProductReport(adAccountId, conversionProductReportCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.analyticsCreateMmmReport
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun analyticsCreateMmmReportTest() {
        val adAccountId: kotlin.String = TODO()
        val mmMReportCreate: MMMReportCreate = TODO()
        
        
        val response: ResponseEntity<MMMReport> = api.analyticsCreateMmmReport(adAccountId, mmMReportCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.analyticsCreateReport
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun analyticsCreateReportTest() {
        val adAccountId: kotlin.String = TODO()
        val adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest = TODO()
        
        
        val response: ResponseEntity<AdsAnalyticsCreateAsyncResponse> = api.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.analyticsCreateTemplateReport
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun analyticsCreateTemplateReportTest() {
        val adAccountId: kotlin.String = TODO()
        val templateId: kotlin.String = TODO()
        val startDate: java.time.LocalDate? = TODO()
        val endDate: java.time.LocalDate? = TODO()
        val granularity: Granularity? = TODO()
        
        
        val response: ResponseEntity<TemplateBasedReport> = api.analyticsCreateTemplateReport(adAccountId, templateId, startDate, endDate, granularity)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.analyticsGetConversionProductReport
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun analyticsGetConversionProductReportTest() {
        val adAccountId: kotlin.String = TODO()
        val token: kotlin.String = TODO()
        
        
        val response: ResponseEntity<ConversionProductReport> = api.analyticsGetConversionProductReport(adAccountId, token)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.analyticsGetMmmReport
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun analyticsGetMmmReportTest() {
        val adAccountId: kotlin.String = TODO()
        val token: kotlin.String = TODO()
        
        
        val response: ResponseEntity<MMMReport> = api.analyticsGetMmmReport(adAccountId, token)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.analyticsGetReport
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun analyticsGetReportTest() {
        val adAccountId: kotlin.String = TODO()
        val token: kotlin.String = TODO()
        
        
        val response: ResponseEntity<AdsAnalyticsGetAsyncResponse> = api.analyticsGetReport(adAccountId, token)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.audienceInsightsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun audienceInsightsGetTest() {
        val adAccountId: kotlin.String = TODO()
        val audienceInsightType: AudienceInsightType = TODO()
        
        
        val response: ResponseEntity<AudienceInsights> = api.audienceInsightsGet(adAccountId, audienceInsightType)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.audienceInsightsScopeAndTypeGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun audienceInsightsScopeAndTypeGetTest() {
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<AudienceInsightsScopeAndTypeGet200Response> = api.audienceInsightsScopeAndTypeGet(adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.audiencesCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun audiencesCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val adAccountsAudienceCreate: AdAccountsAudienceCreate = TODO()
        
        
        val response: ResponseEntity<AdAccountsAudience> = api.audiencesCreate(adAccountId, adAccountsAudienceCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.audiencesGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun audiencesGetTest() {
        val audienceId: kotlin.String = TODO()
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<AdAccountsAudience> = api.audiencesGet(audienceId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.audiencesList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun audiencesListTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: PinterestLibPaginationOrder? = TODO()
        val ownershipType: AudienceOwnershipType? = TODO()
        val excludeNca: kotlin.Boolean = TODO()
        
        
        val response: ResponseEntity<AudiencesList200Response> = api.audiencesList(adAccountId, bookmark, pageSize, order, ownershipType, excludeNca)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.audiencesUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun audiencesUpdateTest() {
        val audienceId: kotlin.String = TODO()
        val adAccountId: kotlin.String = TODO()
        val adAccountsAudienceUpdate: AdAccountsAudienceUpdate = TODO()
        
        
        val response: ResponseEntity<AdAccountsAudience> = api.audiencesUpdate(audienceId, adAccountId, adAccountsAudienceUpdate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.billingInvoiceDownloadGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun billingInvoiceDownloadGetTest() {
        val adAccountId: kotlin.String = TODO()
        val billingInvoiceId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<BillingInvoiceDownloadResponse> = api.billingInvoiceDownloadGet(adAccountId, billingInvoiceId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.billingInvoicesGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun billingInvoicesGetTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: PinterestLibPaginationOrder? = TODO()
        val sort: BillingInvoiceSortField = TODO()
        val status: BillingInvoiceStatus? = TODO()
        val documentType: BillingInvoiceDocumentType? = TODO()
        val startDueDate: java.time.LocalDate? = TODO()
        val endDueDate: java.time.LocalDate? = TODO()
        
        
        val response: ResponseEntity<BillingInvoicesGet200Response> = api.billingInvoicesGet(adAccountId, bookmark, pageSize, order, sort, status, documentType, startDueDate, endDueDate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.billingProfilesGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun billingProfilesGetTest() {
        val isActive: kotlin.Boolean = TODO()
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<BillingProfilesGet200Response> = api.billingProfilesGet(isActive, adAccountId, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.bulkDownloadCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun bulkDownloadCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val bulkDownloadCreate: BulkDownloadCreate = TODO()
        
        
        val response: ResponseEntity<BulkDownload> = api.bulkDownloadCreate(adAccountId, bulkDownloadCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.bulkRequestGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun bulkRequestGetTest() {
        val adAccountId: kotlin.String = TODO()
        val bulkRequestId: kotlin.String = TODO()
        val includeDetails: kotlin.Boolean = TODO()
        
        
        val response: ResponseEntity<BulkJobData> = api.bulkRequestGet(adAccountId, bulkRequestId, includeDetails)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.bulkUpsertCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun bulkUpsertCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val bulkUpsertRequest: BulkUpsertRequest = TODO()
        
        
        val response: ResponseEntity<BulkUpsertResponse> = api.bulkUpsertCreate(adAccountId, bulkUpsertRequest)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.campaignAdPreviewCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun campaignAdPreviewCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val campaignAdPreviewCreate: kotlin.collections.List<CampaignAdPreviewCreate> = TODO()
        
        
        val response: ResponseEntity<List<CampaignAdPreviewCreate200ResponseInner>> = api.campaignAdPreviewCreate(adAccountId, campaignAdPreviewCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.campaignAdPreviewDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun campaignAdPreviewDeleteTest() {
        val adGroupIds: kotlin.collections.List<kotlin.String> = TODO()
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<List<CampaignAdPreviewDelete200ResponseInner>> = api.campaignAdPreviewDelete(adGroupIds, adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.campaignAdPreviewRead
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun campaignAdPreviewReadTest() {
        val adGroupIds: kotlin.collections.List<kotlin.String> = TODO()
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<List<CampaignAdPreview>> = api.campaignAdPreviewRead(adGroupIds, adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.campaignTargetingAnalyticsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun campaignTargetingAnalyticsGetTest() {
        val adAccountId: kotlin.String = TODO()
        val campaignIds: kotlin.collections.List<kotlin.String> = TODO()
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val targetingTypes: kotlin.collections.List<AdsAnalyticsCampaignTargetingType> = TODO()
        val columns: kotlin.collections.List<ReportingColumnSync> = TODO()
        val granularity: Granularity = TODO()
        val clickWindowDays: java.math.BigDecimal = TODO()
        val engagementWindowDays: java.math.BigDecimal = TODO()
        val viewWindowDays: java.math.BigDecimal = TODO()
        val conversionReportTime: kotlin.String = TODO()
        val attributionTypes: kotlin.collections.List<ConversionReportAttributionType>? = TODO()
        val reportingTimezone: ReportingTimeZone? = TODO()
        
        
        val response: ResponseEntity<MetricsResponse> = api.campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.campaignsAnalytics
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun campaignsAnalyticsTest() {
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val campaignIds: kotlin.collections.List<kotlin.String> = TODO()
        val columns: kotlin.collections.List<ReportingColumnSync> = TODO()
        val granularity: Granularity = TODO()
        val adAccountId: kotlin.String = TODO()
        val clickWindowDays: java.math.BigDecimal = TODO()
        val engagementWindowDays: java.math.BigDecimal = TODO()
        val viewWindowDays: java.math.BigDecimal = TODO()
        val conversionReportTime: kotlin.String = TODO()
        val aggregateReportRows: kotlin.Boolean = TODO()
        val reportingTimezone: ReportingTimeZone? = TODO()
        
        
        val response: ResponseEntity<List<CampaignsAnalyticsMetrics>> = api.campaignsAnalytics(startDate, endDate, campaignIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.campaignsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun campaignsCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val campaignCreateItem: kotlin.collections.List<CampaignCreateItem> = TODO()
        
        
        val response: ResponseEntity<CampaignBatchWriteResponseModel> = api.campaignsCreate(adAccountId, campaignCreateItem)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.campaignsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun campaignsGetTest() {
        val campaignId: kotlin.String = TODO()
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<Campaign> = api.campaignsGet(campaignId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.campaignsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun campaignsListTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: PinterestLibPaginationOrder? = TODO()
        val campaignIds: kotlin.collections.List<kotlin.String>? = TODO()
        val entityStatuses: kotlin.collections.List<EntityStatus> = TODO()
        
        
        val response: ResponseEntity<CampaignsList200Response> = api.campaignsList(adAccountId, bookmark, pageSize, order, campaignIds, entityStatuses)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.campaignsUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun campaignsUpdateTest() {
        val adAccountId: kotlin.String = TODO()
        val campaignBatchUpdateItem: kotlin.collections.List<CampaignBatchUpdateItem> = TODO()
        
        
        val response: ResponseEntity<CampaignBatchWriteResponseModel> = api.campaignsUpdate(adAccountId, campaignBatchUpdateItem)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.conversionDeletionRequestCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun conversionDeletionRequestCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val conversionDeletionRequestCreate: ConversionDeletionRequestCreate = TODO()
        
        
        val response: ResponseEntity<ConversionDeletionRequest> = api.conversionDeletionRequestCreate(adAccountId, conversionDeletionRequestCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.conversionDeletionRequestDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun conversionDeletionRequestDeleteTest() {
        val requestId: kotlin.String = TODO()
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<ConversionDeletionRequest> = api.conversionDeletionRequestDelete(requestId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.conversionDeletionRequestGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun conversionDeletionRequestGetTest() {
        val requestId: kotlin.String = TODO()
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<ConversionDeletionRequest> = api.conversionDeletionRequestGet(requestId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.conversionDeletionRequestList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun conversionDeletionRequestListTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: PinterestLibPaginationOrder? = TODO()
        
        
        val response: ResponseEntity<ConversionDeletionRequestList200Response> = api.conversionDeletionRequestList(adAccountId, bookmark, pageSize, order)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.conversionEqsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun conversionEqsListTest() {
        val lookbackPeriod: LookbackPeriodOptions = TODO()
        val adAccountId: kotlin.String = TODO()
        val sourcePlatform: SourcePlatformOptions? = TODO()
        val ingestionSource: IngestionSourceOptions? = TODO()
        
        
        val response: ResponseEntity<List<EventQualityScore>> = api.conversionEqsList(lookbackPeriod, adAccountId, sourcePlatform, ingestionSource)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.conversionTagsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun conversionTagsCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val conversionTagCreate: ConversionTagCreate = TODO()
        
        
        val response: ResponseEntity<ConversionTag> = api.conversionTagsCreate(adAccountId, conversionTagCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.conversionTagsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun conversionTagsGetTest() {
        val adAccountId: kotlin.String = TODO()
        val conversionTagId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<ConversionTag> = api.conversionTagsGet(adAccountId, conversionTagId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.conversionTagsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun conversionTagsListTest() {
        val adAccountId: kotlin.String = TODO()
        val filterDeleted: kotlin.Boolean = TODO()
        
        
        val response: ResponseEntity<ConversionTagsList200Response> = api.conversionTagsList(adAccountId, filterDeleted)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.countryKeywordsMetricsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun countryKeywordsMetricsGetTest() {
        val adAccountId: kotlin.String = TODO()
        val countryCode: kotlin.String = TODO()
        val keywords: kotlin.collections.List<kotlin.String> = TODO()
        
        
        val response: ResponseEntity<KeywordsMetricsArrayResponse> = api.countryKeywordsMetricsGet(adAccountId, countryCode, keywords)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.customerListUploadsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun customerListUploadsCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val customerListId: kotlin.String = TODO()
        val customerListUploadCreateRequest: CustomerListUploadCreateRequest = TODO()
        
        
        val response: ResponseEntity<CustomerListUploadCreateResponse> = api.customerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.customerListUploadsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun customerListUploadsGetTest() {
        val adAccountId: kotlin.String = TODO()
        val customerListId: kotlin.String = TODO()
        val customerListUploadId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<CustomerListUpload> = api.customerListUploadsGet(adAccountId, customerListId, customerListUploadId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.customerListUploadsRun
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun customerListUploadsRunTest() {
        val adAccountId: kotlin.String = TODO()
        val customerListId: kotlin.String = TODO()
        val customerListUploadId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<CustomerListUpload> = api.customerListUploadsRun(adAccountId, customerListId, customerListUploadId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.customerListsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun customerListsCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val customerListCreate: CustomerListCreate = TODO()
        
        
        val response: ResponseEntity<CustomerList> = api.customerListsCreate(adAccountId, customerListCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.customerListsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun customerListsGetTest() {
        val adAccountId: kotlin.String = TODO()
        val customerListId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<CustomerList> = api.customerListsGet(adAccountId, customerListId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.customerListsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun customerListsListTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: PinterestLibPaginationOrder? = TODO()
        val excludeNca: kotlin.Boolean = TODO()
        
        
        val response: ResponseEntity<CustomerListsList200Response> = api.customerListsList(adAccountId, bookmark, pageSize, order, excludeNca)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.customerListsUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun customerListsUpdateTest() {
        val adAccountId: kotlin.String = TODO()
        val customerListId: kotlin.String = TODO()
        val customerListUpdateWithRequiredBody: CustomerListUpdateWithRequiredBody = TODO()
        
        
        val response: ResponseEntity<CustomerList> = api.customerListsUpdate(adAccountId, customerListId, customerListUpdateWithRequiredBody)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.customerSegmentCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun customerSegmentCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val customerSegmentCreate: CustomerSegmentCreate = TODO()
        
        
        val response: ResponseEntity<CustomerSegment> = api.customerSegmentCreate(adAccountId, customerSegmentCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.customerSegmentList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun customerSegmentListTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: PinterestLibPaginationOrder? = TODO()
        val includeSizing: kotlin.Boolean = TODO()
        val searchQuery: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<CustomerSegmentList200Response> = api.customerSegmentList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.customerSegmentUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun customerSegmentUpdateTest() {
        val adAccountId: kotlin.String = TODO()
        val customerSegmentUpdateRequestUpdateWithRequiredBody: CustomerSegmentUpdateRequestUpdateWithRequiredBody = TODO()
        
        
        val response: ResponseEntity<Unit> = api.customerSegmentUpdate(adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.eventsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun eventsCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val conversionEventsCreate: ConversionEventsCreate = TODO()
        val test: kotlin.Boolean? = TODO()
        
        
        val response: ResponseEntity<ConversionEvents> = api.eventsCreate(adAccountId, conversionEventsCreate, test)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.getAdGroupsByPromotionIdsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAdGroupsByPromotionIdsListTest() {
        val adAccountId: kotlin.String = TODO()
        val promotionIds: kotlin.collections.List<kotlin.String> = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: PinterestLibPaginationOrder? = TODO()
        
        
        val response: ResponseEntity<AdGroupsList200Response> = api.getAdGroupsByPromotionIdsList(adAccountId, promotionIds, bookmark, pageSize, order)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.getCampaignDeliveryEstimates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignDeliveryEstimatesTest() {
        val adAccountId: kotlin.String = TODO()
        val campaignDeliveryEstimatesCampaign: kotlin.collections.List<CampaignDeliveryEstimatesCampaign> = TODO()
        
        
        val response: ResponseEntity<CampaignDeliveryEstimatesResponse> = api.getCampaignDeliveryEstimates(adAccountId, campaignDeliveryEstimatesCampaign)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.keywordsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun keywordsCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val keywordsCreate: KeywordsCreate = TODO()
        
        
        val response: ResponseEntity<Keywords> = api.keywordsCreate(adAccountId, keywordsCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.keywordsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun keywordsGetTest() {
        val adAccountId: kotlin.String = TODO()
        val campaignId: kotlin.String? = TODO()
        val adGroupId: kotlin.String? = TODO()
        val adGroupIds: kotlin.collections.List<kotlin.String>? = TODO()
        val matchTypes: kotlin.collections.List<MatchType>? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<KeywordsGet200Response> = api.keywordsGet(adAccountId, campaignId, adGroupId, adGroupIds, matchTypes, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.keywordsUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun keywordsUpdateTest() {
        val adAccountId: kotlin.String = TODO()
        val keywordsUpdate: KeywordsUpdate = TODO()
        
        
        val response: ResponseEntity<Keywords> = api.keywordsUpdate(adAccountId, keywordsUpdate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.labelsApply
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun labelsApplyTest() {
        val adAccountId: kotlin.String = TODO()
        val labelId: kotlin.String = TODO()
        val labeledEntitiesCreate: LabeledEntitiesCreate = TODO()
        
        
        val response: ResponseEntity<LabeledEntities> = api.labelsApply(adAccountId, labelId, labeledEntitiesCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.labelsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun labelsCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val labelCreateRequest: LabelCreateRequest = TODO()
        
        
        val response: ResponseEntity<LabelsResponse> = api.labelsCreate(adAccountId, labelCreateRequest)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.labelsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun labelsListTest() {
        val adAccountId: kotlin.String = TODO()
        val campaignIds: kotlin.collections.List<kotlin.String>? = TODO()
        val labelIds: kotlin.collections.List<kotlin.String>? = TODO()
        val entityStatuses: kotlin.collections.List<QueryLabelEntityStatusesItems> = TODO()
        val labelTypes: kotlin.collections.List<QueryLabelTypesItems> = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<LabelsList200Response> = api.labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.labelsRemove
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun labelsRemoveTest() {
        val adAccountId: kotlin.String = TODO()
        val labelId: kotlin.String = TODO()
        val labeledEntitiesCreate: LabeledEntitiesCreate = TODO()
        
        
        val response: ResponseEntity<LabeledEntities> = api.labelsRemove(adAccountId, labelId, labeledEntitiesCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.labelsUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun labelsUpdateTest() {
        val adAccountId: kotlin.String = TODO()
        val labelUpdateRequest: LabelUpdateRequest = TODO()
        
        
        val response: ResponseEntity<LabelsResponse> = api.labelsUpdate(adAccountId, labelUpdateRequest)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.leadFormGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun leadFormGetTest() {
        val leadFormId: kotlin.String = TODO()
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<LeadForm> = api.leadFormGet(leadFormId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.leadFormTestCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun leadFormTestCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val leadFormId: kotlin.String = TODO()
        val leadFormTestCreate: LeadFormTestCreate = TODO()
        
        
        val response: ResponseEntity<LeadFormTest> = api.leadFormTestCreate(adAccountId, leadFormId, leadFormTestCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.leadFormsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun leadFormsCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val leadFormCreate: kotlin.collections.List<LeadFormCreate> = TODO()
        
        
        val response: ResponseEntity<LeadFormsCreate200Response> = api.leadFormsCreate(adAccountId, leadFormCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.leadFormsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun leadFormsListTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: PinterestLibPaginationOrder? = TODO()
        
        
        val response: ResponseEntity<LeadFormsList200Response> = api.leadFormsList(adAccountId, bookmark, pageSize, order)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.leadFormsUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun leadFormsUpdateTest() {
        val adAccountId: kotlin.String = TODO()
        val leadFormBatchUpdate: kotlin.collections.List<LeadFormBatchUpdate> = TODO()
        
        
        val response: ResponseEntity<LeadFormsCreate200Response> = api.leadFormsUpdate(adAccountId, leadFormBatchUpdate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.leadsExportCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun leadsExportCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val leadsExportsCreate: LeadsExportsCreate = TODO()
        
        
        val response: ResponseEntity<LeadsExports> = api.leadsExportCreate(adAccountId, leadsExportsCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.leadsExportGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun leadsExportGetTest() {
        val adAccountId: kotlin.String = TODO()
        val leadsExportId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<LeadsExportResponseData> = api.leadsExportGet(adAccountId, leadsExportId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.msotEventsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun msotEventsCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val conversionMSOTEventsCreate: ConversionMSOTEventsCreate = TODO()
        
        
        val response: ResponseEntity<Unit> = api.msotEventsCreate(adAccountId, conversionMSOTEventsCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.ocpmEligibleConversionTagsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun ocpmEligibleConversionTagsGetTest() {
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<Map<String, kotlin.collections.List<ConversionEventResponse>>> = api.ocpmEligibleConversionTagsGet(adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.orderLinesGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun orderLinesGetTest() {
        val orderLineId: kotlin.String = TODO()
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<OrderLine> = api.orderLinesGet(orderLineId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.orderLinesList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun orderLinesListTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: PinterestLibPaginationOrder? = TODO()
        
        
        val response: ResponseEntity<OrderLinesList200Response> = api.orderLinesList(adAccountId, bookmark, pageSize, order)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.pageVisitConversionTagsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pageVisitConversionTagsGetTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: PinterestLibPaginationOrder? = TODO()
        
        
        val response: ResponseEntity<PageVisitConversionTagsGet200Response> = api.pageVisitConversionTagsGet(adAccountId, bookmark, pageSize, order)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.productGroupPromotionsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun productGroupPromotionsCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val productGroupPromotionsCreate: ProductGroupPromotionsCreate = TODO()
        
        
        val response: ResponseEntity<ProductGroupPromotions> = api.productGroupPromotionsCreate(adAccountId, productGroupPromotionsCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.productGroupPromotionsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun productGroupPromotionsGetTest() {
        val adAccountId: kotlin.String = TODO()
        val productGroupPromotionId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<ProductGroupPromotion> = api.productGroupPromotionsGet(adAccountId, productGroupPromotionId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.productGroupPromotionsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun productGroupPromotionsListTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: PinterestLibPaginationOrder? = TODO()
        val productGroupPromotionIds: kotlin.collections.List<kotlin.String>? = TODO()
        val entityStatuses: kotlin.collections.List<EntityStatus> = TODO()
        val adGroupId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<ProductGroupPromotionsList200Response> = api.productGroupPromotionsList(adAccountId, bookmark, pageSize, order, productGroupPromotionIds, entityStatuses, adGroupId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.productGroupPromotionsUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun productGroupPromotionsUpdateTest() {
        val adAccountId: kotlin.String = TODO()
        val productGroupPromotionsUpdateWithRequiredBody: ProductGroupPromotionsUpdateWithRequiredBody = TODO()
        
        
        val response: ResponseEntity<ProductGroupPromotions> = api.productGroupPromotionsUpdate(adAccountId, productGroupPromotionsUpdateWithRequiredBody)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.productGroupsAnalytics
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun productGroupsAnalyticsTest() {
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val productGroupIds: kotlin.collections.List<kotlin.String> = TODO()
        val columns: kotlin.collections.List<ReportingColumnSync> = TODO()
        val granularity: Granularity = TODO()
        val adAccountId: kotlin.String = TODO()
        val clickWindowDays: java.math.BigDecimal = TODO()
        val engagementWindowDays: java.math.BigDecimal = TODO()
        val viewWindowDays: java.math.BigDecimal = TODO()
        val conversionReportTime: kotlin.String = TODO()
        val reportingTimezone: ReportingTimeZone? = TODO()
        
        
        val response: ResponseEntity<List<ProductGroupAnalyticsItems>> = api.productGroupsAnalytics(startDate, endDate, productGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.promotionsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun promotionsCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val promotionCreate: kotlin.collections.List<PromotionCreate> = TODO()
        
        
        val response: ResponseEntity<PromotionsResponse> = api.promotionsCreate(adAccountId, promotionCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.promotionsDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun promotionsDeleteTest() {
        val promotionId: kotlin.String = TODO()
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<Promotion> = api.promotionsDelete(promotionId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.promotionsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun promotionsGetTest() {
        val promotionId: kotlin.String = TODO()
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<Promotion> = api.promotionsGet(promotionId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.promotionsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun promotionsListTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: PinterestLibPaginationOrder? = TODO()
        
        
        val response: ResponseEntity<PromotionsList200Response> = api.promotionsList(adAccountId, bookmark, pageSize, order)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.promotionsUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun promotionsUpdateTest() {
        val adAccountId: kotlin.String = TODO()
        val promotionBatchUpdate: kotlin.collections.List<PromotionBatchUpdate> = TODO()
        
        
        val response: ResponseEntity<PromotionsResponse> = api.promotionsUpdate(adAccountId, promotionBatchUpdate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.sandboxDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun sandboxDeleteTest() {
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<kotlin.String> = api.sandboxDelete(adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.schedulesCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun schedulesCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val scheduleCreate: kotlin.collections.List<ScheduleCreate> = TODO()
        
        
        val response: ResponseEntity<List<SchedulesCreate200ResponseInner>> = api.schedulesCreate(adAccountId, scheduleCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.schedulesList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun schedulesListTest() {
        val adAccountId: kotlin.String = TODO()
        val entityIds: kotlin.collections.List<kotlin.String> = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: PinterestLibPaginationOrder? = TODO()
        val scheduleStatuses: kotlin.collections.List<ScheduleStatus>? = TODO()
        val scheduleType: ScheduleType? = TODO()
        
        
        val response: ResponseEntity<SchedulesList200Response> = api.schedulesList(adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.schedulesUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun schedulesUpdateTest() {
        val adAccountId: kotlin.String = TODO()
        val scheduleBatchUpdate: kotlin.collections.List<ScheduleBatchUpdate> = TODO()
        
        
        val response: ResponseEntity<List<SchedulesCreate200ResponseInner>> = api.schedulesUpdate(adAccountId, scheduleBatchUpdate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.ssioAccountsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun ssioAccountsGetTest() {
        val adAccountId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<SSIOAccount> = api.ssioAccountsGet(adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.ssioInsertionOrderCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun ssioInsertionOrderCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val ssIOInsertionOrderCreate: SSIOInsertionOrderCreate = TODO()
        
        
        val response: ResponseEntity<SSIOInsertionOrder> = api.ssioInsertionOrderCreate(adAccountId, ssIOInsertionOrderCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.ssioInsertionOrderEdit
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun ssioInsertionOrderEditTest() {
        val adAccountId: kotlin.String = TODO()
        val ssIOInsertionOrderUpdate: SSIOInsertionOrderUpdate = TODO()
        
        
        val response: ResponseEntity<SSIOInsertionOrder> = api.ssioInsertionOrderEdit(adAccountId, ssIOInsertionOrderUpdate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.ssioInsertionOrdersStatusGetByAdAccount
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun ssioInsertionOrdersStatusGetByAdAccountTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<SsioInsertionOrdersStatusGetByAdAccount200Response> = api.ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.ssioInsertionOrdersStatusGetByPinOrderId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun ssioInsertionOrdersStatusGetByPinOrderIdTest() {
        val adAccountId: kotlin.String = TODO()
        val pinOrderId: kotlin.String = TODO()
        
        
        val response: ResponseEntity<SSIOInsertionOrderStatusResponse> = api.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.ssioOrderLinesGetByAdAccount
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun ssioOrderLinesGetByAdAccountTest() {
        val adAccountId: kotlin.String = TODO()
        val pinOrderId: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<SsioOrderLinesGetByAdAccount200Response> = api.ssioOrderLinesGetByAdAccount(adAccountId, pinOrderId, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.targetingTemplateCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun targetingTemplateCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val targetingTemplateCreate: TargetingTemplateCreate = TODO()
        
        
        val response: ResponseEntity<TargetingTemplate> = api.targetingTemplateCreate(adAccountId, targetingTemplateCreate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.targetingTemplateList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun targetingTemplateListTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: PinterestLibPaginationOrder? = TODO()
        val includeSizing: kotlin.Boolean = TODO()
        val searchQuery: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<TargetingTemplateList200Response> = api.targetingTemplateList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.targetingTemplateUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun targetingTemplateUpdateTest() {
        val adAccountId: kotlin.String = TODO()
        val targetingTemplateUpdateRequestReadOrUpdate: TargetingTemplateUpdateRequestReadOrUpdate = TODO()
        
        
        val response: ResponseEntity<Unit> = api.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequestReadOrUpdate)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.templatesList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun templatesListTest() {
        val adAccountId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: PinterestLibPaginationOrder? = TODO()
        
        
        val response: ResponseEntity<TemplatesList200Response> = api.templatesList(adAccountId, bookmark, pageSize, order)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.termsOfServiceGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun termsOfServiceGetTest() {
        val adAccountId: kotlin.String = TODO()
        val includeHtml: kotlin.Boolean = TODO()
        val tosType: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<TermsOfService> = api.termsOfServiceGet(adAccountId, includeHtml, tosType)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.updateAdAccountToAdAccountSharedAudience
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateAdAccountToAdAccountSharedAudienceTest() {
        val adAccountId: kotlin.String = TODO()
        val adAccountToAdAccountSharedAudienceUpdateWithRequiredBody: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody = TODO()
        
        
        val response: ResponseEntity<AdAccountToAdAccountSharedAudience> = api.updateAdAccountToAdAccountSharedAudience(adAccountId, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.updateAdAccountToBusinessSharedAudience
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateAdAccountToBusinessSharedAudienceTest() {
        val adAccountId: kotlin.String = TODO()
        val adAccountToBusinessSharedAudienceUpdateWithRequiredBody: AdAccountToBusinessSharedAudienceUpdateWithRequiredBody = TODO()
        
        
        val response: ResponseEntity<AdAccountToBusinessSharedAudience> = api.updateAdAccountToBusinessSharedAudience(adAccountId, adAccountToBusinessSharedAudienceUpdateWithRequiredBody)

        // TODO: test validations
    }
}
