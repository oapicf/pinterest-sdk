package org.openapitools.api

import org.openapitools.model.AdAccount
import org.openapitools.model.AdAccountAnalyticsResponseInner
import org.openapitools.model.AdAccountCreateRequest
import org.openapitools.model.AdAccountCreateSubscriptionRequest
import org.openapitools.model.AdAccountCreateSubscriptionResponse
import org.openapitools.model.AdAccountGetSubscriptionResponse
import org.openapitools.model.AdAccountsCatalogsProductGroupsList200Response
import org.openapitools.model.AdAccountsList200Response
import org.openapitools.model.AdAccountsSubscriptionsGetList200Response
import org.openapitools.model.AdArrayResponse
import org.openapitools.model.AdCreateRequest
import org.openapitools.model.AdGroupArrayResponse
import org.openapitools.model.AdGroupAudienceSizingRequest
import org.openapitools.model.AdGroupAudienceSizingResponse
import org.openapitools.model.AdGroupCreateRequest
import org.openapitools.model.AdGroupResponse
import org.openapitools.model.AdGroupUpdateRequest
import org.openapitools.model.AdGroupsAnalyticsResponseInner
import org.openapitools.model.AdGroupsList200Response
import org.openapitools.model.AdPreviewRequest
import org.openapitools.model.AdPreviewURLResponse
import org.openapitools.model.AdResponse
import org.openapitools.model.AdUpdateRequest
import org.openapitools.model.AdsAnalyticsCreateAsyncRequest
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse
import org.openapitools.model.AdsAnalyticsGetAsyncResponse
import org.openapitools.model.AdsAnalyticsResponseInner
import org.openapitools.model.AdsAnalyticsTargetingType
import org.openapitools.model.AdsCreditRedeemRequest
import org.openapitools.model.AdsCreditRedeemResponse
import org.openapitools.model.AdsCreditsDiscountsGet200Response
import org.openapitools.model.AdsList200Response
import org.openapitools.model.Audience
import org.openapitools.model.AudienceCreateCustomRequest
import org.openapitools.model.AudienceCreateRequest
import org.openapitools.model.AudienceDefinitionResponse
import org.openapitools.model.AudienceInsightType
import org.openapitools.model.AudienceInsightsResponse
import org.openapitools.model.AudienceUpdateRequest
import org.openapitools.model.AudiencesList200Response
import org.openapitools.model.BidFloor
import org.openapitools.model.BidFloorRequest
import org.openapitools.model.BillingProfilesGet200Response
import org.openapitools.model.BulkDownloadRequest
import org.openapitools.model.BulkDownloadResponse
import org.openapitools.model.BulkUpsertRequest
import org.openapitools.model.BulkUpsertResponse
import org.openapitools.model.BulkUpsertStatusResponse
import org.openapitools.model.CampaignCreateRequest
import org.openapitools.model.CampaignCreateResponse
import org.openapitools.model.CampaignResponse
import org.openapitools.model.CampaignUpdateRequest
import org.openapitools.model.CampaignUpdateResponse
import org.openapitools.model.CampaignsAnalyticsResponseInner
import org.openapitools.model.CampaignsList200Response
import org.openapitools.model.ConversionApiResponse
import org.openapitools.model.ConversionEventResponse
import org.openapitools.model.ConversionEvents
import org.openapitools.model.ConversionReportAttributionType
import org.openapitools.model.ConversionTagCreate
import org.openapitools.model.ConversionTagListResponse
import org.openapitools.model.ConversionTagResponse
import org.openapitools.model.CreateMMMReportRequest
import org.openapitools.model.CreateMMMReportResponse
import org.openapitools.model.CustomerList
import org.openapitools.model.CustomerListRequest
import org.openapitools.model.CustomerListUpdateRequest
import org.openapitools.model.CustomerListsList200Response
import org.openapitools.model.DetailedError
import org.openapitools.model.Error
import org.openapitools.model.GetMMMReportResponse
import org.openapitools.model.Granularity
import org.openapitools.model.KeywordUpdateBody
import org.openapitools.model.KeywordsGet200Response
import org.openapitools.model.KeywordsMetricsArrayResponse
import org.openapitools.model.KeywordsRequest
import org.openapitools.model.KeywordsResponse
import org.openapitools.model.LeadFormResponse
import org.openapitools.model.LeadFormTestRequest
import org.openapitools.model.LeadFormTestResponse
import org.openapitools.model.LeadFormsList200Response
import org.openapitools.model.MatchType
import org.openapitools.model.MetricsResponse
import org.openapitools.model.OrderLine
import org.openapitools.model.OrderLinesList200Response
import org.openapitools.model.PageVisitConversionTagsGet200Response
import org.openapitools.model.ProductGroupAnalyticsResponseInner
import org.openapitools.model.ProductGroupPromotionCreateRequest
import org.openapitools.model.ProductGroupPromotionResponse
import org.openapitools.model.ProductGroupPromotionUpdateRequest
import org.openapitools.model.ProductGroupPromotionsList200Response
import org.openapitools.model.SSIOAccountResponse
import org.openapitools.model.SSIOCreateInsertionOrderRequest
import org.openapitools.model.SSIOCreateInsertionOrderResponse
import org.openapitools.model.SSIOEditInsertionOrderRequest
import org.openapitools.model.SSIOEditInsertionOrderResponse
import org.openapitools.model.SSIOInsertionOrderStatusResponse
import org.openapitools.model.SsioInsertionOrdersStatusGetByAdAccount200Response
import org.openapitools.model.SsioOrderLinesGetByAdAccount200Response
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
        val adAccountId: kotlin.String = TODO()
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val columns: kotlin.collections.List<kotlin.String> = TODO()
        val granularity: Granularity = TODO()
        val clickWindowDays: kotlin.Int = TODO()
        val engagementWindowDays: kotlin.Int = TODO()
        val viewWindowDays: kotlin.Int = TODO()
        val conversionReportTime: kotlin.String = TODO()
        val response: ResponseEntity<List<AdAccountAnalyticsResponseInner>> = api.adAccountAnalytics(adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)

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
        val targetingTypes: kotlin.collections.List<AdsAnalyticsTargetingType> = TODO()
        val columns: kotlin.collections.List<kotlin.String> = TODO()
        val granularity: Granularity = TODO()
        val clickWindowDays: kotlin.Int = TODO()
        val engagementWindowDays: kotlin.Int = TODO()
        val viewWindowDays: kotlin.Int = TODO()
        val conversionReportTime: kotlin.String = TODO()
        val attributionTypes: ConversionReportAttributionType? = TODO()
        val response: ResponseEntity<MetricsResponse> = api.adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adAccountsCatalogsProductGroupsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adAccountsCatalogsProductGroupsListTest() {
        val adAccountId: kotlin.String = TODO()
        val feedProfileId: kotlin.String? = TODO()
        val response: ResponseEntity<AdAccountsCatalogsProductGroupsList200Response> = api.adAccountsCatalogsProductGroupsList(adAccountId, feedProfileId)

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
        val adAccountCreateRequest: AdAccountCreateRequest = TODO()
        val response: ResponseEntity<AdAccount> = api.adAccountsCreate(adAccountCreateRequest)

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
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val includeSharedAccounts: kotlin.Boolean = TODO()
        val response: ResponseEntity<AdAccountsList200Response> = api.adAccountsList(bookmark, pageSize, includeSharedAccounts)

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
        val response: ResponseEntity<Unit> = api.adAccountsSubscriptionsDelById(adAccountId, subscriptionId)

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
        val response: ResponseEntity<AdAccountGetSubscriptionResponse> = api.adAccountsSubscriptionsGetById(adAccountId, subscriptionId)

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
        val pageSize: kotlin.Int = TODO()
        val bookmark: kotlin.String? = TODO()
        val response: ResponseEntity<AdAccountsSubscriptionsGetList200Response> = api.adAccountsSubscriptionsGetList(adAccountId, pageSize, bookmark)

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
        val adAccountCreateSubscriptionRequest: AdAccountCreateSubscriptionRequest = TODO()
        val response: ResponseEntity<AdAccountCreateSubscriptionResponse> = api.adAccountsSubscriptionsPost(adAccountId, adAccountCreateSubscriptionRequest)

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
        val adAccountId: kotlin.String = TODO()
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val adGroupIds: kotlin.collections.List<kotlin.String> = TODO()
        val columns: kotlin.collections.List<kotlin.String> = TODO()
        val granularity: Granularity = TODO()
        val clickWindowDays: kotlin.Int = TODO()
        val engagementWindowDays: kotlin.Int = TODO()
        val viewWindowDays: kotlin.Int = TODO()
        val conversionReportTime: kotlin.String = TODO()
        val response: ResponseEntity<List<AdGroupsAnalyticsResponseInner>> = api.adGroupsAnalytics(adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)

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
        val adGroupAudienceSizingRequest: AdGroupAudienceSizingRequest? = TODO()
        val response: ResponseEntity<AdGroupAudienceSizingResponse> = api.adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingRequest)

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
        val bidFloorRequest: BidFloorRequest = TODO()
        val response: ResponseEntity<BidFloor> = api.adGroupsBidFloorGet(adAccountId, bidFloorRequest)

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
        val adGroupCreateRequest: kotlin.collections.List<AdGroupCreateRequest> = TODO()
        val response: ResponseEntity<AdGroupArrayResponse> = api.adGroupsCreate(adAccountId, adGroupCreateRequest)

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
        val adAccountId: kotlin.String = TODO()
        val adGroupId: kotlin.String = TODO()
        val response: ResponseEntity<AdGroupResponse> = api.adGroupsGet(adAccountId, adGroupId)

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
        val campaignIds: kotlin.collections.List<kotlin.String>? = TODO()
        val adGroupIds: kotlin.collections.List<kotlin.String>? = TODO()
        val entityStatuses: kotlin.collections.List<kotlin.String> = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val translateInterestsToNames: kotlin.Boolean = TODO()
        val response: ResponseEntity<AdGroupsList200Response> = api.adGroupsList(adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames)

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
        val targetingTypes: kotlin.collections.List<AdsAnalyticsTargetingType> = TODO()
        val columns: kotlin.collections.List<kotlin.String> = TODO()
        val granularity: Granularity = TODO()
        val clickWindowDays: kotlin.Int = TODO()
        val engagementWindowDays: kotlin.Int = TODO()
        val viewWindowDays: kotlin.Int = TODO()
        val conversionReportTime: kotlin.String = TODO()
        val attributionTypes: ConversionReportAttributionType? = TODO()
        val response: ResponseEntity<MetricsResponse> = api.adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes)

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
        val adGroupUpdateRequest: kotlin.collections.List<AdGroupUpdateRequest> = TODO()
        val response: ResponseEntity<AdGroupArrayResponse> = api.adGroupsUpdate(adAccountId, adGroupUpdateRequest)

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
        val targetingTypes: kotlin.collections.List<AdsAnalyticsTargetingType> = TODO()
        val columns: kotlin.collections.List<kotlin.String> = TODO()
        val granularity: Granularity = TODO()
        val clickWindowDays: kotlin.Int = TODO()
        val engagementWindowDays: kotlin.Int = TODO()
        val viewWindowDays: kotlin.Int = TODO()
        val conversionReportTime: kotlin.String = TODO()
        val attributionTypes: ConversionReportAttributionType? = TODO()
        val response: ResponseEntity<MetricsResponse> = api.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes)

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
        val adAccountId: kotlin.String = TODO()
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val adIds: kotlin.collections.List<kotlin.String> = TODO()
        val columns: kotlin.collections.List<kotlin.String> = TODO()
        val granularity: Granularity = TODO()
        val clickWindowDays: kotlin.Int = TODO()
        val engagementWindowDays: kotlin.Int = TODO()
        val viewWindowDays: kotlin.Int = TODO()
        val conversionReportTime: kotlin.String = TODO()
        val response: ResponseEntity<List<AdsAnalyticsResponseInner>> = api.adsAnalytics(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)

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
        val adCreateRequest: kotlin.collections.List<AdCreateRequest> = TODO()
        val response: ResponseEntity<AdArrayResponse> = api.adsCreate(adAccountId, adCreateRequest)

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
        val adsCreditRedeemRequest: AdsCreditRedeemRequest = TODO()
        val response: ResponseEntity<AdsCreditRedeemResponse> = api.adsCreditRedeem(adAccountId, adsCreditRedeemRequest)

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
        val adAccountId: kotlin.String = TODO()
        val adId: kotlin.String = TODO()
        val response: ResponseEntity<AdResponse> = api.adsGet(adAccountId, adId)

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
        val campaignIds: kotlin.collections.List<kotlin.String>? = TODO()
        val adGroupIds: kotlin.collections.List<kotlin.String>? = TODO()
        val adIds: kotlin.collections.List<kotlin.String>? = TODO()
        val entityStatuses: kotlin.collections.List<kotlin.String> = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val response: ResponseEntity<AdsList200Response> = api.adsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark)

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
        val adUpdateRequest: kotlin.collections.List<AdUpdateRequest> = TODO()
        val response: ResponseEntity<AdArrayResponse> = api.adsUpdate(adAccountId, adUpdateRequest)

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
        val createMMMReportRequest: CreateMMMReportRequest = TODO()
        val response: ResponseEntity<CreateMMMReportResponse> = api.analyticsCreateMmmReport(adAccountId, createMMMReportRequest)

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
        val response: ResponseEntity<AdsAnalyticsCreateAsyncResponse> = api.analyticsCreateTemplateReport(adAccountId, templateId, startDate, endDate, granularity)

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
        val response: ResponseEntity<GetMMMReportResponse> = api.analyticsGetMmmReport(adAccountId, token)

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
        val response: ResponseEntity<AudienceInsightsResponse> = api.audienceInsightsGet(adAccountId, audienceInsightType)

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
        val response: ResponseEntity<AudienceDefinitionResponse> = api.audienceInsightsScopeAndTypeGet(adAccountId)

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
        val audienceCreateRequest: AudienceCreateRequest = TODO()
        val response: ResponseEntity<Audience> = api.audiencesCreate(adAccountId, audienceCreateRequest)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.audiencesCreateCustom
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun audiencesCreateCustomTest() {
        val adAccountId: kotlin.String = TODO()
        val audienceCreateCustomRequest: AudienceCreateCustomRequest = TODO()
        val response: ResponseEntity<Audience> = api.audiencesCreateCustom(adAccountId, audienceCreateCustomRequest)

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
        val adAccountId: kotlin.String = TODO()
        val audienceId: kotlin.String = TODO()
        val response: ResponseEntity<Audience> = api.audiencesGet(adAccountId, audienceId)

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
        val order: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val ownershipType: kotlin.String = TODO()
        val response: ResponseEntity<AudiencesList200Response> = api.audiencesList(adAccountId, bookmark, order, pageSize, ownershipType)

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
        val adAccountId: kotlin.String = TODO()
        val audienceId: kotlin.String = TODO()
        val audienceUpdateRequest: AudienceUpdateRequest? = TODO()
        val response: ResponseEntity<Audience> = api.audiencesUpdate(adAccountId, audienceId, audienceUpdateRequest)

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
        val adAccountId: kotlin.String = TODO()
        val isActive: kotlin.Boolean = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val response: ResponseEntity<BillingProfilesGet200Response> = api.billingProfilesGet(adAccountId, isActive, bookmark, pageSize)

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
        val bulkDownloadRequest: BulkDownloadRequest = TODO()
        val response: ResponseEntity<BulkDownloadResponse> = api.bulkDownloadCreate(adAccountId, bulkDownloadRequest)

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
        val response: ResponseEntity<BulkUpsertStatusResponse> = api.bulkRequestGet(adAccountId, bulkRequestId, includeDetails)

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
        val targetingTypes: kotlin.collections.List<AdsAnalyticsTargetingType> = TODO()
        val columns: kotlin.collections.List<kotlin.String> = TODO()
        val granularity: Granularity = TODO()
        val clickWindowDays: kotlin.Int = TODO()
        val engagementWindowDays: kotlin.Int = TODO()
        val viewWindowDays: kotlin.Int = TODO()
        val conversionReportTime: kotlin.String = TODO()
        val attributionTypes: ConversionReportAttributionType? = TODO()
        val response: ResponseEntity<MetricsResponse> = api.campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes)

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
        val adAccountId: kotlin.String = TODO()
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val campaignIds: kotlin.collections.List<kotlin.String> = TODO()
        val columns: kotlin.collections.List<kotlin.String> = TODO()
        val granularity: Granularity = TODO()
        val clickWindowDays: kotlin.Int = TODO()
        val engagementWindowDays: kotlin.Int = TODO()
        val viewWindowDays: kotlin.Int = TODO()
        val conversionReportTime: kotlin.String = TODO()
        val response: ResponseEntity<List<CampaignsAnalyticsResponseInner>> = api.campaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)

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
        val campaignCreateRequest: kotlin.collections.List<CampaignCreateRequest> = TODO()
        val response: ResponseEntity<CampaignCreateResponse> = api.campaignsCreate(adAccountId, campaignCreateRequest)

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
        val adAccountId: kotlin.String = TODO()
        val campaignId: kotlin.String = TODO()
        val response: ResponseEntity<CampaignResponse> = api.campaignsGet(adAccountId, campaignId)

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
        val campaignIds: kotlin.collections.List<kotlin.String>? = TODO()
        val entityStatuses: kotlin.collections.List<kotlin.String> = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val response: ResponseEntity<CampaignsList200Response> = api.campaignsList(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark)

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
        val campaignUpdateRequest: kotlin.collections.List<CampaignUpdateRequest> = TODO()
        val response: ResponseEntity<CampaignUpdateResponse> = api.campaignsUpdate(adAccountId, campaignUpdateRequest)

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
        val response: ResponseEntity<ConversionTagResponse> = api.conversionTagsCreate(adAccountId, conversionTagCreate)

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
        val response: ResponseEntity<ConversionTagResponse> = api.conversionTagsGet(adAccountId, conversionTagId)

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
        val response: ResponseEntity<ConversionTagListResponse> = api.conversionTagsList(adAccountId, filterDeleted)

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
     * To test AdAccountsApiController.customerListsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun customerListsCreateTest() {
        val adAccountId: kotlin.String = TODO()
        val customerListRequest: CustomerListRequest = TODO()
        val response: ResponseEntity<CustomerList> = api.customerListsCreate(adAccountId, customerListRequest)

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
        val pageSize: kotlin.Int = TODO()
        val order: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val response: ResponseEntity<CustomerListsList200Response> = api.customerListsList(adAccountId, pageSize, order, bookmark)

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
        val customerListUpdateRequest: CustomerListUpdateRequest = TODO()
        val response: ResponseEntity<CustomerList> = api.customerListsUpdate(adAccountId, customerListId, customerListUpdateRequest)

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
        val conversionEvents: ConversionEvents = TODO()
        val test: kotlin.Boolean? = TODO()
        val response: ResponseEntity<ConversionApiResponse> = api.eventsCreate(adAccountId, conversionEvents, test)

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
        val keywordsRequest: KeywordsRequest = TODO()
        val response: ResponseEntity<KeywordsResponse> = api.keywordsCreate(adAccountId, keywordsRequest)

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
        val matchTypes: kotlin.collections.List<MatchType>? = TODO()
        val pageSize: kotlin.Int = TODO()
        val bookmark: kotlin.String? = TODO()
        val response: ResponseEntity<KeywordsGet200Response> = api.keywordsGet(adAccountId, campaignId, adGroupId, matchTypes, pageSize, bookmark)

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
        val keywordUpdateBody: KeywordUpdateBody = TODO()
        val response: ResponseEntity<KeywordsResponse> = api.keywordsUpdate(adAccountId, keywordUpdateBody)

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
        val adAccountId: kotlin.String = TODO()
        val leadFormId: kotlin.String = TODO()
        val response: ResponseEntity<LeadFormResponse> = api.leadFormGet(adAccountId, leadFormId)

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
        val leadFormTestRequest: LeadFormTestRequest = TODO()
        val response: ResponseEntity<LeadFormTestResponse> = api.leadFormTestCreate(adAccountId, leadFormId, leadFormTestRequest)

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
        val pageSize: kotlin.Int = TODO()
        val order: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val response: ResponseEntity<LeadFormsList200Response> = api.leadFormsList(adAccountId, pageSize, order, bookmark)

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
        val adAccountId: kotlin.String = TODO()
        val orderLineId: kotlin.String = TODO()
        val response: ResponseEntity<OrderLine> = api.orderLinesGet(adAccountId, orderLineId)

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
        val pageSize: kotlin.Int = TODO()
        val order: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val response: ResponseEntity<OrderLinesList200Response> = api.orderLinesList(adAccountId, pageSize, order, bookmark)

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
        val pageSize: kotlin.Int = TODO()
        val order: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val response: ResponseEntity<PageVisitConversionTagsGet200Response> = api.pageVisitConversionTagsGet(adAccountId, pageSize, order, bookmark)

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
        val productGroupPromotionCreateRequest: ProductGroupPromotionCreateRequest = TODO()
        val response: ResponseEntity<ProductGroupPromotionResponse> = api.productGroupPromotionsCreate(adAccountId, productGroupPromotionCreateRequest)

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
        val response: ResponseEntity<ProductGroupPromotionResponse> = api.productGroupPromotionsGet(adAccountId, productGroupPromotionId)

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
        val productGroupPromotionIds: kotlin.collections.List<kotlin.String>? = TODO()
        val entityStatuses: kotlin.collections.List<kotlin.String> = TODO()
        val adGroupId: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val order: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val response: ResponseEntity<ProductGroupPromotionsList200Response> = api.productGroupPromotionsList(adAccountId, productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark)

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
        val productGroupPromotionUpdateRequest: ProductGroupPromotionUpdateRequest = TODO()
        val response: ResponseEntity<ProductGroupPromotionResponse> = api.productGroupPromotionsUpdate(adAccountId, productGroupPromotionUpdateRequest)

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
        val adAccountId: kotlin.String = TODO()
        val startDate: java.time.LocalDate = TODO()
        val endDate: java.time.LocalDate = TODO()
        val productGroupIds: kotlin.collections.List<kotlin.String> = TODO()
        val columns: kotlin.collections.List<kotlin.String> = TODO()
        val granularity: Granularity = TODO()
        val clickWindowDays: kotlin.Int = TODO()
        val engagementWindowDays: kotlin.Int = TODO()
        val viewWindowDays: kotlin.Int = TODO()
        val conversionReportTime: kotlin.String = TODO()
        val response: ResponseEntity<List<ProductGroupAnalyticsResponseInner>> = api.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)

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
     * To test AdAccountsApiController.ssioAccountsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun ssioAccountsGetTest() {
        val adAccountId: kotlin.String = TODO()
        val response: ResponseEntity<SSIOAccountResponse> = api.ssioAccountsGet(adAccountId)

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
        val ssIOCreateInsertionOrderRequest: SSIOCreateInsertionOrderRequest = TODO()
        val response: ResponseEntity<SSIOCreateInsertionOrderResponse> = api.ssioInsertionOrderCreate(adAccountId, ssIOCreateInsertionOrderRequest)

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
        val ssIOEditInsertionOrderRequest: SSIOEditInsertionOrderRequest = TODO()
        val response: ResponseEntity<SSIOEditInsertionOrderResponse> = api.ssioInsertionOrderEdit(adAccountId, ssIOEditInsertionOrderRequest)

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
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val pinOrderId: kotlin.String? = TODO()
        val response: ResponseEntity<SsioOrderLinesGetByAdAccount200Response> = api.ssioOrderLinesGetByAdAccount(adAccountId, bookmark, pageSize, pinOrderId)

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
        val pageSize: kotlin.Int = TODO()
        val order: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val response: ResponseEntity<TemplatesList200Response> = api.templatesList(adAccountId, pageSize, order, bookmark)

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
}
