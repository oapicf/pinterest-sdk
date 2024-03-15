import localVarRequest from 'request';

export * from './account';
export * from './actionType';
export * from './adAccount';
export * from './adAccountAnalyticsResponseInner';
export * from './adAccountCreateRequest';
export * from './adAccountCreateSubscriptionRequest';
export * from './adAccountCreateSubscriptionResponse';
export * from './adAccountGetSubscriptionResponse';
export * from './adAccountOwner';
export * from './adAccountsCatalogsProductGroupsList200Response';
export * from './adAccountsCountryResponse';
export * from './adAccountsCountryResponseData';
export * from './adAccountsList200Response';
export * from './adAccountsSubscriptionsGetList200Response';
export * from './adArrayResponse';
export * from './adArrayResponseElement';
export * from './adCommon';
export * from './adCommonQuizPinData';
export * from './adCommonTrackingUrls';
export * from './adCountry';
export * from './adCreateRequest';
export * from './adGroupArrayResponse';
export * from './adGroupArrayResponseElement';
export * from './adGroupAudienceSizingRequest';
export * from './adGroupAudienceSizingRequestKeywordsInner';
export * from './adGroupAudienceSizingResponse';
export * from './adGroupCommon';
export * from './adGroupCommonOptimizationGoalMetadata';
export * from './adGroupCommonTrackingUrls';
export * from './adGroupCreateRequest';
export * from './adGroupResponse';
export * from './adGroupSummaryStatus';
export * from './adGroupUpdateRequest';
export * from './adGroupsAnalyticsResponseInner';
export * from './adGroupsList200Response';
export * from './adPinId';
export * from './adPreviewCreateFromImage';
export * from './adPreviewCreateFromPin';
export * from './adPreviewRequest';
export * from './adPreviewURLResponse';
export * from './adResponse';
export * from './adUpdateRequest';
export * from './adsAnalyticsCreateAsyncRequest';
export * from './adsAnalyticsCreateAsyncResponse';
export * from './adsAnalyticsFilterColumn';
export * from './adsAnalyticsFilterOperator';
export * from './adsAnalyticsGetAsyncResponse';
export * from './adsAnalyticsMetricsFilter';
export * from './adsAnalyticsResponseInner';
export * from './adsAnalyticsTargetingType';
export * from './adsCreditDiscountsResponse';
export * from './adsCreditRedeemRequest';
export * from './adsCreditRedeemResponse';
export * from './adsCreditsDiscountsGet200Response';
export * from './adsList200Response';
export * from './analyticsDailyMetrics';
export * from './analyticsMetricsResponse';
export * from './audience';
export * from './audienceCategory';
export * from './audienceCommon';
export * from './audienceCreateCustomRequest';
export * from './audienceCreateRequest';
export * from './audienceCreateRequest1AudienceType';
export * from './audienceDataParty';
export * from './audienceDefinition';
export * from './audienceDefinitionResponse';
export * from './audienceDemographicValue';
export * from './audienceDemographics';
export * from './audienceInsightCategoryArrayResponse';
export * from './audienceInsightCategoryCommon';
export * from './audienceInsightType';
export * from './audienceInsightsResponse';
export * from './audienceRule';
export * from './audienceSharingType';
export * from './audienceSubcategory';
export * from './audienceType';
export * from './audienceUpdateOperationType';
export * from './audienceUpdateRequest';
export * from './audiencesList200Response';
export * from './availabilityFilter';
export * from './batchOperation';
export * from './batchOperationStatus';
export * from './bidFloor';
export * from './bidFloorRequest';
export * from './bidFloorSpec';
export * from './billingProfilesGet200Response';
export * from './billingProfilesResponse';
export * from './board';
export * from './boardMedia';
export * from './boardOwner';
export * from './boardSection';
export * from './boardSectionsList200Response';
export * from './boardUpdate';
export * from './boardsList200Response';
export * from './boardsListPins200Response';
export * from './boardsUserFollowsList200Response';
export * from './bookClosedResponse';
export * from './brandFilter';
export * from './budgetType';
export * from './bulkDownloadRequest';
export * from './bulkDownloadRequestCampaignFilter';
export * from './bulkDownloadResponse';
export * from './bulkEntityType';
export * from './bulkOutputFormat';
export * from './bulkReportingJobStatus';
export * from './bulkUpsertRequest';
export * from './bulkUpsertRequestCreate';
export * from './bulkUpsertRequestUpdate';
export * from './bulkUpsertResponse';
export * from './bulkUpsertStatus';
export * from './bulkUpsertStatusResponse';
export * from './businessAccessRole';
export * from './campaignCommon';
export * from './campaignCreateCommon';
export * from './campaignCreateRequest';
export * from './campaignCreateResponse';
export * from './campaignCreateResponseData';
export * from './campaignCreateResponseItem';
export * from './campaignId';
export * from './campaignResponse';
export * from './campaignSummaryStatus';
export * from './campaignUpdateRequest';
export * from './campaignUpdateResponse';
export * from './campaignsAnalyticsResponseInner';
export * from './campaignsList200Response';
export * from './catalog';
export * from './catalogProductGroup';
export * from './catalogsCreateHotelItem';
export * from './catalogsCreateRetailItem';
export * from './catalogsDbItem';
export * from './catalogsDeleteHotelItem';
export * from './catalogsDeleteRetailItem';
export * from './catalogsFeed';
export * from './catalogsFeedCredentials';
export * from './catalogsFeedIngestionDetails';
export * from './catalogsFeedIngestionErrors';
export * from './catalogsFeedIngestionInfo';
export * from './catalogsFeedIngestionWarnings';
export * from './catalogsFeedProcessingResult';
export * from './catalogsFeedProcessingSchedule';
export * from './catalogsFeedProcessingStatus';
export * from './catalogsFeedProductCounts';
export * from './catalogsFeedValidationDetails';
export * from './catalogsFeedValidationErrors';
export * from './catalogsFeedValidationWarnings';
export * from './catalogsFeedsCreateRequest';
export * from './catalogsFeedsCreateRequestDefaultLocale';
export * from './catalogsFeedsUpdateRequest';
export * from './catalogsFormat';
export * from './catalogsHotelAddress';
export * from './catalogsHotelAttributes';
export * from './catalogsHotelAttributesAllOfMainImage';
export * from './catalogsHotelBatchItem';
export * from './catalogsHotelBatchRequest';
export * from './catalogsHotelFeed';
export * from './catalogsHotelFeedsCreateRequest';
export * from './catalogsHotelFeedsUpdateRequest';
export * from './catalogsHotelGuestRatings';
export * from './catalogsHotelItemErrorResponse';
export * from './catalogsHotelItemResponse';
export * from './catalogsHotelItemsBatch';
export * from './catalogsHotelItemsFilter';
export * from './catalogsHotelProductGroup';
export * from './catalogsHotelProductGroupCreateRequest';
export * from './catalogsHotelProductGroupFilterKeys';
export * from './catalogsHotelProductGroupFilters';
export * from './catalogsHotelProductGroupFiltersAllOf';
export * from './catalogsHotelProductGroupFiltersAnyOf';
export * from './catalogsHotelProductGroupUpdateRequest';
export * from './catalogsItemValidationDetails';
export * from './catalogsItemValidationErrors';
export * from './catalogsItemValidationIssue';
export * from './catalogsItemValidationIssues';
export * from './catalogsItemValidationWarnings';
export * from './catalogsItems';
export * from './catalogsItemsBatch';
export * from './catalogsItemsBatchRequest';
export * from './catalogsItemsCreateBatchRequest';
export * from './catalogsItemsDeleteBatchRequest';
export * from './catalogsItemsDeleteDiscontinuedBatchRequest';
export * from './catalogsItemsFilters';
export * from './catalogsItemsUpdateBatchRequest';
export * from './catalogsItemsUpsertBatchRequest';
export * from './catalogsList200Response';
export * from './catalogsListProductsByFilterRequest';
export * from './catalogsListProductsByFilterRequestOneOf';
export * from './catalogsLocale';
export * from './catalogsProduct';
export * from './catalogsProductGroup';
export * from './catalogsProductGroupCreateRequest';
export * from './catalogsProductGroupCurrencyCriteria';
export * from './catalogsProductGroupFilterKeys';
export * from './catalogsProductGroupFilters';
export * from './catalogsProductGroupFiltersAllOf';
export * from './catalogsProductGroupFiltersAnyOf';
export * from './catalogsProductGroupFiltersRequest';
export * from './catalogsProductGroupFiltersRequestAnyOf';
export * from './catalogsProductGroupFiltersRequestAnyOf1';
export * from './catalogsProductGroupMultipleCountriesCriteria';
export * from './catalogsProductGroupMultipleGenderCriteria';
export * from './catalogsProductGroupMultipleStringCriteria';
export * from './catalogsProductGroupMultipleStringListCriteria';
export * from './catalogsProductGroupPinsList200Response';
export * from './catalogsProductGroupPricingCriteria';
export * from './catalogsProductGroupPricingCurrencyCriteria';
export * from './catalogsProductGroupProductCounts';
export * from './catalogsProductGroupStatus';
export * from './catalogsProductGroupType';
export * from './catalogsProductGroupUpdateRequest';
export * from './catalogsProductGroupsCreate201Response';
export * from './catalogsProductGroupsCreateRequest';
export * from './catalogsProductGroupsList200Response';
export * from './catalogsProductGroupsList200ResponseAllOfItemsInner';
export * from './catalogsProductGroupsUpdateRequest';
export * from './catalogsProductMetadata';
export * from './catalogsRetailBatchRequest';
export * from './catalogsRetailBatchRequestItemsInner';
export * from './catalogsRetailFeed';
export * from './catalogsRetailFeedsCreateRequest';
export * from './catalogsRetailFeedsUpdateRequest';
export * from './catalogsRetailItemErrorResponse';
export * from './catalogsRetailItemResponse';
export * from './catalogsRetailItemsBatch';
export * from './catalogsRetailItemsFilter';
export * from './catalogsRetailProductGroup';
export * from './catalogsStatus';
export * from './catalogsType';
export * from './catalogsUpdatableHotelAttributes';
export * from './catalogsUpdateHotelItem';
export * from './catalogsUpdateRetailItem';
export * from './catalogsUpsertHotelItem';
export * from './catalogsUpsertRetailItem';
export * from './catalogsVerticalBatchRequest';
export * from './catalogsVerticalFeedsCreateRequest';
export * from './catalogsVerticalFeedsUpdateRequest';
export * from './catalogsVerticalProductGroup';
export * from './catalogsVerticalProductGroupCreateRequest';
export * from './catalogsVerticalProductGroupUpdateRequest';
export * from './conditionFilter';
export * from './conversionApiResponse';
export * from './conversionApiResponseEventsInner';
export * from './conversionAttributionWindowDays';
export * from './conversionEventResponse';
export * from './conversionEvents';
export * from './conversionEventsDataInner';
export * from './conversionEventsDataInnerCustomData';
export * from './conversionEventsDataInnerCustomDataContentsInner';
export * from './conversionEventsUserData';
export * from './conversionReportAttributionType';
export * from './conversionReportTimeType';
export * from './conversionTagCommon';
export * from './conversionTagConfigs';
export * from './conversionTagCreate';
export * from './conversionTagListResponse';
export * from './conversionTagResponse';
export * from './conversionTagType';
export * from './country';
export * from './countryFilter';
export * from './createMMMReportRequest';
export * from './createMMMReportResponse';
export * from './createMMMReportResponseData';
export * from './creativeType';
export * from './currency';
export * from './currencyFilter';
export * from './customLabel0Filter';
export * from './customLabel1Filter';
export * from './customLabel2Filter';
export * from './customLabel3Filter';
export * from './customLabel4Filter';
export * from './customerList';
export * from './customerListRequest';
export * from './customerListUpdateRequest';
export * from './customerListsList200Response';
export * from './dataOutputFormat';
export * from './dataStatus';
export * from './deliveryMetricsResponse';
export * from './deliveryMetricsResponseItemsInner';
export * from './detailedError';
export * from './enhancedMatchStatusType';
export * from './entityStatus';
export * from './exception';
export * from './feedProcessingResultsList200Response';
export * from './feedsCreateRequest';
export * from './feedsList200Response';
export * from './feedsUpdateRequest';
export * from './followUserRequest';
export * from './followersList200Response';
export * from './gender';
export * from './genderFilter';
export * from './getAudiencesOrderBy';
export * from './getMMMReportResponse';
export * from './getMMMReportResponseData';
export * from './googleProductCategory0Filter';
export * from './googleProductCategory1Filter';
export * from './googleProductCategory2Filter';
export * from './googleProductCategory3Filter';
export * from './googleProductCategory4Filter';
export * from './googleProductCategory5Filter';
export * from './googleProductCategory6Filter';
export * from './granularity';
export * from './gridClickType';
export * from './hotelIdFilter';
export * from './hotelProcessingRecord';
export * from './imageDetails';
export * from './imageMetadata';
export * from './imageMetadataImages';
export * from './integrationLog';
export * from './integrationLogClientError';
export * from './integrationLogClientRequest';
export * from './integrationLogsInvalidLogResponse';
export * from './integrationLogsInvalidLogResponseRejectedLogsInner';
export * from './integrationLogsRequest';
export * from './integrationLogsSuccessResponse';
export * from './integrationMetadata';
export * from './integrationRecord';
export * from './integrationRequest';
export * from './integrationRequestPatch';
export * from './integrationsGetList200Response';
export * from './interest';
export * from './itemAttributes';
export * from './itemBatchRecord';
export * from './itemCreateBatchRecord';
export * from './itemDeleteBatchRecord';
export * from './itemDeleteDiscontinuedBatchRecord';
export * from './itemGroupIdFilter';
export * from './itemIdFilter';
export * from './itemProcessingRecord';
export * from './itemProcessingStatus';
export * from './itemResponse';
export * from './itemResponseAnyOf';
export * from './itemResponseAnyOf1';
export * from './itemUpdateBatchRecord';
export * from './itemUpsertBatchRecord';
export * from './itemValidationEvent';
export * from './itemsBatchPostRequest';
export * from './itemsIssuesList200Response';
export * from './keyword';
export * from './keywordError';
export * from './keywordMetrics';
export * from './keywordMetricsResponse';
export * from './keywordUpdate';
export * from './keywordUpdateBody';
export * from './keywordsCommon';
export * from './keywordsGet200Response';
export * from './keywordsMetricsArrayResponse';
export * from './keywordsRequest';
export * from './keywordsResponse';
export * from './language';
export * from './leadFormCommon';
export * from './leadFormQuestion';
export * from './leadFormQuestionFieldType';
export * from './leadFormQuestionType';
export * from './leadFormResponse';
export * from './leadFormStatus';
export * from './leadFormTestRequest';
export * from './leadFormTestResponse';
export * from './leadFormsList200Response';
export * from './lineItem';
export * from './linkedBusiness';
export * from './mMMReportingColumn';
export * from './mMMReportingTargetingType';
export * from './matchType';
export * from './matchTypeResponse';
export * from './maxPriceFilter';
export * from './mediaList200Response';
export * from './mediaUpload';
export * from './mediaUploadAllOfUploadParameters';
export * from './mediaUploadDetails';
export * from './mediaUploadRequest';
export * from './mediaUploadStatus';
export * from './mediaUploadType';
export * from './metricsReportingLevel';
export * from './metricsResponse';
export * from './minPriceFilter';
export * from './modelError';
export * from './nonNullableCatalogsCurrency';
export * from './nonNullableProductAvailabilityType';
export * from './nullableCatalogsItemFieldType';
export * from './nullableCurrency';
export * from './oauthAccessTokenRequestCode';
export * from './oauthAccessTokenRequestRefresh';
export * from './oauthAccessTokenResponse';
export * from './oauthAccessTokenResponseCode';
export * from './oauthAccessTokenResponseEverlastingRefresh';
export * from './oauthAccessTokenResponseIntegrationRefresh';
export * from './oauthAccessTokenResponseRefresh';
export * from './objectiveType';
export * from './optimizationGoalMetadata';
export * from './optimizationGoalMetadataConversionTagV3GoalMetadata';
export * from './optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows';
export * from './optimizationGoalMetadataFrequencyGoalMetadata';
export * from './optimizationGoalMetadataScrollupGoalMetadata';
export * from './orderLine';
export * from './orderLineError';
export * from './orderLinePaidType';
export * from './orderLineResponse';
export * from './orderLineSingleResponse';
export * from './orderLineStatus';
export * from './orderLines';
export * from './orderLinesArrayResponse';
export * from './orderLinesList200Response';
export * from './pacingDeliveryType';
export * from './pageVisitConversionTagsGet200Response';
export * from './paginated';
export * from './partnerType';
export * from './pin';
export * from './pinAnalyticsMetricsResponse';
export * from './pinAnalyticsMetricsResponseDailyMetricsInner';
export * from './pinCreate';
export * from './pinMedia';
export * from './pinMediaMetadata';
export * from './pinMediaSource';
export * from './pinMediaSourceImageBase64';
export * from './pinMediaSourceImageURL';
export * from './pinMediaSourceImagesBase64';
export * from './pinMediaSourceImagesBase64ItemsInner';
export * from './pinMediaSourceImagesURL';
export * from './pinMediaSourceImagesURLItemsInner';
export * from './pinMediaSourcePinURL';
export * from './pinMediaSourceVideoID';
export * from './pinMediaWithImage';
export * from './pinMediaWithImageAndVideo';
export * from './pinMediaWithImages';
export * from './pinMediaWithVideo';
export * from './pinMediaWithVideos';
export * from './pinPromotionSummaryStatus';
export * from './pinUpdate';
export * from './pinUpdateCarouselSlotsInner';
export * from './pinsAnalyticsMetricTypesParameterInner';
export * from './pinsList200Response';
export * from './pinsSaveRequest';
export * from './pinterestTagEventData';
export * from './placementGroupType';
export * from './priceFilter';
export * from './productAvailabilityType';
export * from './productGroupAnalyticsResponseInner';
export * from './productGroupPromotion';
export * from './productGroupPromotionCreateRequest';
export * from './productGroupPromotionResponse';
export * from './productGroupPromotionResponseItem';
export * from './productGroupPromotionUpdateRequest';
export * from './productGroupPromotionsList200Response';
export * from './productGroupSummaryStatus';
export * from './productType0Filter';
export * from './productType1Filter';
export * from './productType2Filter';
export * from './productType3Filter';
export * from './productType4Filter';
export * from './quizPinData';
export * from './quizPinOption';
export * from './quizPinQuestion';
export * from './quizPinResult';
export * from './relatedTerms';
export * from './relatedTermsRelatedTermsListInner';
export * from './reportingColumnAsync';
export * from './role';
export * from './sSIOAccountAddress';
export * from './sSIOAccountItem';
export * from './sSIOAccountPMPName';
export * from './sSIOAccountResponse';
export * from './sSIOCreateInsertionOrderRequest';
export * from './sSIOCreateInsertionOrderResponse';
export * from './sSIOEditInsertionOrderRequest';
export * from './sSIOEditInsertionOrderResponse';
export * from './sSIOInsertionOrderCommon';
export * from './sSIOInsertionOrderStatus';
export * from './sSIOInsertionOrderStatusResponse';
export * from './sSIOOrderLine';
export * from './searchPartnerPins200Response';
export * from './searchUserBoardsGet200Response';
export * from './singleInterestTargetingOptionResponse';
export * from './ssioInsertionOrdersStatusGetByAdAccount200Response';
export * from './ssioOrderLinesGetByAdAccount200Response';
export * from './summaryPin';
export * from './summaryPinMedia';
export * from './targetingAdvertiserCountry';
export * from './targetingSpec';
export * from './targetingSpecSHOPPINGRETARGETING';
export * from './targetingTypeFilter';
export * from './templateResponse';
export * from './templateResponseDateRange';
export * from './templateResponseDateRangeAbsoluteDateRange';
export * from './templateResponseDateRangeDynamicDateRange';
export * from './templateResponseDateRangeRelativeDateRange';
export * from './templatesList200Response';
export * from './termsOfService';
export * from './topPinsAnalyticsResponse';
export * from './topPinsAnalyticsResponseDateAvailability';
export * from './topPinsAnalyticsResponsePinsInner';
export * from './topVideoPinsAnalyticsResponse';
export * from './topVideoPinsAnalyticsResponsePinsInner';
export * from './trackingUrls';
export * from './trendType';
export * from './trendingKeywordsResponse';
export * from './trendingKeywordsResponseTrendsInner';
export * from './trendingKeywordsResponseTrendsInnerTimeSeries';
export * from './trendsSupportedRegion';
export * from './updatableItemAttributes';
export * from './updateMaskFieldType';
export * from './userAccountFollowedInterests200Response';
export * from './userFollowingFeedType';
export * from './userFollowingGet200Response';
export * from './userListOperationType';
export * from './userListType';
export * from './userSummary';
export * from './userWebsiteSummary';
export * from './userWebsiteVerificationCode';
export * from './userWebsiteVerifyRequest';
export * from './userWebsitesGet200Response';
export * from './videoMetadata';

import * as fs from 'fs';

export interface RequestDetailedFile {
    value: Buffer;
    options?: {
        filename?: string;
        contentType?: string;
    }
}

export type RequestFile = string | Buffer | fs.ReadStream | RequestDetailedFile;


import { Account } from './account';
import { ActionType } from './actionType';
import { AdAccount } from './adAccount';
import { AdAccountAnalyticsResponseInner } from './adAccountAnalyticsResponseInner';
import { AdAccountCreateRequest } from './adAccountCreateRequest';
import { AdAccountCreateSubscriptionRequest } from './adAccountCreateSubscriptionRequest';
import { AdAccountCreateSubscriptionResponse } from './adAccountCreateSubscriptionResponse';
import { AdAccountGetSubscriptionResponse } from './adAccountGetSubscriptionResponse';
import { AdAccountOwner } from './adAccountOwner';
import { AdAccountsCatalogsProductGroupsList200Response } from './adAccountsCatalogsProductGroupsList200Response';
import { AdAccountsCountryResponse } from './adAccountsCountryResponse';
import { AdAccountsCountryResponseData } from './adAccountsCountryResponseData';
import { AdAccountsList200Response } from './adAccountsList200Response';
import { AdAccountsSubscriptionsGetList200Response } from './adAccountsSubscriptionsGetList200Response';
import { AdArrayResponse } from './adArrayResponse';
import { AdArrayResponseElement } from './adArrayResponseElement';
import { AdCommon } from './adCommon';
import { AdCommonQuizPinData } from './adCommonQuizPinData';
import { AdCommonTrackingUrls } from './adCommonTrackingUrls';
import { AdCountry } from './adCountry';
import { AdCreateRequest } from './adCreateRequest';
import { AdGroupArrayResponse } from './adGroupArrayResponse';
import { AdGroupArrayResponseElement } from './adGroupArrayResponseElement';
import { AdGroupAudienceSizingRequest } from './adGroupAudienceSizingRequest';
import { AdGroupAudienceSizingRequestKeywordsInner } from './adGroupAudienceSizingRequestKeywordsInner';
import { AdGroupAudienceSizingResponse } from './adGroupAudienceSizingResponse';
import { AdGroupCommon } from './adGroupCommon';
import { AdGroupCommonOptimizationGoalMetadata } from './adGroupCommonOptimizationGoalMetadata';
import { AdGroupCommonTrackingUrls } from './adGroupCommonTrackingUrls';
import { AdGroupCreateRequest } from './adGroupCreateRequest';
import { AdGroupResponse } from './adGroupResponse';
import { AdGroupSummaryStatus } from './adGroupSummaryStatus';
import { AdGroupUpdateRequest } from './adGroupUpdateRequest';
import { AdGroupsAnalyticsResponseInner } from './adGroupsAnalyticsResponseInner';
import { AdGroupsList200Response } from './adGroupsList200Response';
import { AdPinId } from './adPinId';
import { AdPreviewCreateFromImage } from './adPreviewCreateFromImage';
import { AdPreviewCreateFromPin } from './adPreviewCreateFromPin';
import { AdPreviewRequest } from './adPreviewRequest';
import { AdPreviewURLResponse } from './adPreviewURLResponse';
import { AdResponse } from './adResponse';
import { AdUpdateRequest } from './adUpdateRequest';
import { AdsAnalyticsCreateAsyncRequest } from './adsAnalyticsCreateAsyncRequest';
import { AdsAnalyticsCreateAsyncResponse } from './adsAnalyticsCreateAsyncResponse';
import { AdsAnalyticsFilterColumn } from './adsAnalyticsFilterColumn';
import { AdsAnalyticsFilterOperator } from './adsAnalyticsFilterOperator';
import { AdsAnalyticsGetAsyncResponse } from './adsAnalyticsGetAsyncResponse';
import { AdsAnalyticsMetricsFilter } from './adsAnalyticsMetricsFilter';
import { AdsAnalyticsResponseInner } from './adsAnalyticsResponseInner';
import { AdsAnalyticsTargetingType } from './adsAnalyticsTargetingType';
import { AdsCreditDiscountsResponse } from './adsCreditDiscountsResponse';
import { AdsCreditRedeemRequest } from './adsCreditRedeemRequest';
import { AdsCreditRedeemResponse } from './adsCreditRedeemResponse';
import { AdsCreditsDiscountsGet200Response } from './adsCreditsDiscountsGet200Response';
import { AdsList200Response } from './adsList200Response';
import { AnalyticsDailyMetrics } from './analyticsDailyMetrics';
import { AnalyticsMetricsResponse } from './analyticsMetricsResponse';
import { Audience } from './audience';
import { AudienceCategory } from './audienceCategory';
import { AudienceCommon } from './audienceCommon';
import { AudienceCreateCustomRequest } from './audienceCreateCustomRequest';
import { AudienceCreateRequest } from './audienceCreateRequest';
import { AudienceCreateRequest1AudienceType } from './audienceCreateRequest1AudienceType';
import { AudienceDataParty } from './audienceDataParty';
import { AudienceDefinition } from './audienceDefinition';
import { AudienceDefinitionResponse } from './audienceDefinitionResponse';
import { AudienceDemographicValue } from './audienceDemographicValue';
import { AudienceDemographics } from './audienceDemographics';
import { AudienceInsightCategoryArrayResponse } from './audienceInsightCategoryArrayResponse';
import { AudienceInsightCategoryCommon } from './audienceInsightCategoryCommon';
import { AudienceInsightType } from './audienceInsightType';
import { AudienceInsightsResponse } from './audienceInsightsResponse';
import { AudienceRule } from './audienceRule';
import { AudienceSharingType } from './audienceSharingType';
import { AudienceSubcategory } from './audienceSubcategory';
import { AudienceType } from './audienceType';
import { AudienceUpdateOperationType } from './audienceUpdateOperationType';
import { AudienceUpdateRequest } from './audienceUpdateRequest';
import { AudiencesList200Response } from './audiencesList200Response';
import { AvailabilityFilter } from './availabilityFilter';
import { BatchOperation } from './batchOperation';
import { BatchOperationStatus } from './batchOperationStatus';
import { BidFloor } from './bidFloor';
import { BidFloorRequest } from './bidFloorRequest';
import { BidFloorSpec } from './bidFloorSpec';
import { BillingProfilesGet200Response } from './billingProfilesGet200Response';
import { BillingProfilesResponse } from './billingProfilesResponse';
import { Board } from './board';
import { BoardMedia } from './boardMedia';
import { BoardOwner } from './boardOwner';
import { BoardSection } from './boardSection';
import { BoardSectionsList200Response } from './boardSectionsList200Response';
import { BoardUpdate } from './boardUpdate';
import { BoardsList200Response } from './boardsList200Response';
import { BoardsListPins200Response } from './boardsListPins200Response';
import { BoardsUserFollowsList200Response } from './boardsUserFollowsList200Response';
import { BookClosedResponse } from './bookClosedResponse';
import { BrandFilter } from './brandFilter';
import { BudgetType } from './budgetType';
import { BulkDownloadRequest } from './bulkDownloadRequest';
import { BulkDownloadRequestCampaignFilter } from './bulkDownloadRequestCampaignFilter';
import { BulkDownloadResponse } from './bulkDownloadResponse';
import { BulkEntityType } from './bulkEntityType';
import { BulkOutputFormat } from './bulkOutputFormat';
import { BulkReportingJobStatus } from './bulkReportingJobStatus';
import { BulkUpsertRequest } from './bulkUpsertRequest';
import { BulkUpsertRequestCreate } from './bulkUpsertRequestCreate';
import { BulkUpsertRequestUpdate } from './bulkUpsertRequestUpdate';
import { BulkUpsertResponse } from './bulkUpsertResponse';
import { BulkUpsertStatus } from './bulkUpsertStatus';
import { BulkUpsertStatusResponse } from './bulkUpsertStatusResponse';
import { BusinessAccessRole } from './businessAccessRole';
import { CampaignCommon } from './campaignCommon';
import { CampaignCreateCommon } from './campaignCreateCommon';
import { CampaignCreateRequest } from './campaignCreateRequest';
import { CampaignCreateResponse } from './campaignCreateResponse';
import { CampaignCreateResponseData } from './campaignCreateResponseData';
import { CampaignCreateResponseItem } from './campaignCreateResponseItem';
import { CampaignId } from './campaignId';
import { CampaignResponse } from './campaignResponse';
import { CampaignSummaryStatus } from './campaignSummaryStatus';
import { CampaignUpdateRequest } from './campaignUpdateRequest';
import { CampaignUpdateResponse } from './campaignUpdateResponse';
import { CampaignsAnalyticsResponseInner } from './campaignsAnalyticsResponseInner';
import { CampaignsList200Response } from './campaignsList200Response';
import { Catalog } from './catalog';
import { CatalogProductGroup } from './catalogProductGroup';
import { CatalogsCreateHotelItem } from './catalogsCreateHotelItem';
import { CatalogsCreateRetailItem } from './catalogsCreateRetailItem';
import { CatalogsDbItem } from './catalogsDbItem';
import { CatalogsDeleteHotelItem } from './catalogsDeleteHotelItem';
import { CatalogsDeleteRetailItem } from './catalogsDeleteRetailItem';
import { CatalogsFeed } from './catalogsFeed';
import { CatalogsFeedCredentials } from './catalogsFeedCredentials';
import { CatalogsFeedIngestionDetails } from './catalogsFeedIngestionDetails';
import { CatalogsFeedIngestionErrors } from './catalogsFeedIngestionErrors';
import { CatalogsFeedIngestionInfo } from './catalogsFeedIngestionInfo';
import { CatalogsFeedIngestionWarnings } from './catalogsFeedIngestionWarnings';
import { CatalogsFeedProcessingResult } from './catalogsFeedProcessingResult';
import { CatalogsFeedProcessingSchedule } from './catalogsFeedProcessingSchedule';
import { CatalogsFeedProcessingStatus } from './catalogsFeedProcessingStatus';
import { CatalogsFeedProductCounts } from './catalogsFeedProductCounts';
import { CatalogsFeedValidationDetails } from './catalogsFeedValidationDetails';
import { CatalogsFeedValidationErrors } from './catalogsFeedValidationErrors';
import { CatalogsFeedValidationWarnings } from './catalogsFeedValidationWarnings';
import { CatalogsFeedsCreateRequest } from './catalogsFeedsCreateRequest';
import { CatalogsFeedsCreateRequestDefaultLocale } from './catalogsFeedsCreateRequestDefaultLocale';
import { CatalogsFeedsUpdateRequest } from './catalogsFeedsUpdateRequest';
import { CatalogsFormat } from './catalogsFormat';
import { CatalogsHotelAddress } from './catalogsHotelAddress';
import { CatalogsHotelAttributes } from './catalogsHotelAttributes';
import { CatalogsHotelAttributesAllOfMainImage } from './catalogsHotelAttributesAllOfMainImage';
import { CatalogsHotelBatchItem } from './catalogsHotelBatchItem';
import { CatalogsHotelBatchRequest } from './catalogsHotelBatchRequest';
import { CatalogsHotelFeed } from './catalogsHotelFeed';
import { CatalogsHotelFeedsCreateRequest } from './catalogsHotelFeedsCreateRequest';
import { CatalogsHotelFeedsUpdateRequest } from './catalogsHotelFeedsUpdateRequest';
import { CatalogsHotelGuestRatings } from './catalogsHotelGuestRatings';
import { CatalogsHotelItemErrorResponse } from './catalogsHotelItemErrorResponse';
import { CatalogsHotelItemResponse } from './catalogsHotelItemResponse';
import { CatalogsHotelItemsBatch } from './catalogsHotelItemsBatch';
import { CatalogsHotelItemsFilter } from './catalogsHotelItemsFilter';
import { CatalogsHotelProductGroup } from './catalogsHotelProductGroup';
import { CatalogsHotelProductGroupCreateRequest } from './catalogsHotelProductGroupCreateRequest';
import { CatalogsHotelProductGroupFilterKeys } from './catalogsHotelProductGroupFilterKeys';
import { CatalogsHotelProductGroupFilters } from './catalogsHotelProductGroupFilters';
import { CatalogsHotelProductGroupFiltersAllOf } from './catalogsHotelProductGroupFiltersAllOf';
import { CatalogsHotelProductGroupFiltersAnyOf } from './catalogsHotelProductGroupFiltersAnyOf';
import { CatalogsHotelProductGroupUpdateRequest } from './catalogsHotelProductGroupUpdateRequest';
import { CatalogsItemValidationDetails } from './catalogsItemValidationDetails';
import { CatalogsItemValidationErrors } from './catalogsItemValidationErrors';
import { CatalogsItemValidationIssue } from './catalogsItemValidationIssue';
import { CatalogsItemValidationIssues } from './catalogsItemValidationIssues';
import { CatalogsItemValidationWarnings } from './catalogsItemValidationWarnings';
import { CatalogsItems } from './catalogsItems';
import { CatalogsItemsBatch } from './catalogsItemsBatch';
import { CatalogsItemsBatchRequest } from './catalogsItemsBatchRequest';
import { CatalogsItemsCreateBatchRequest } from './catalogsItemsCreateBatchRequest';
import { CatalogsItemsDeleteBatchRequest } from './catalogsItemsDeleteBatchRequest';
import { CatalogsItemsDeleteDiscontinuedBatchRequest } from './catalogsItemsDeleteDiscontinuedBatchRequest';
import { CatalogsItemsFilters } from './catalogsItemsFilters';
import { CatalogsItemsUpdateBatchRequest } from './catalogsItemsUpdateBatchRequest';
import { CatalogsItemsUpsertBatchRequest } from './catalogsItemsUpsertBatchRequest';
import { CatalogsList200Response } from './catalogsList200Response';
import { CatalogsListProductsByFilterRequest } from './catalogsListProductsByFilterRequest';
import { CatalogsListProductsByFilterRequestOneOf } from './catalogsListProductsByFilterRequestOneOf';
import { CatalogsLocale } from './catalogsLocale';
import { CatalogsProduct } from './catalogsProduct';
import { CatalogsProductGroup } from './catalogsProductGroup';
import { CatalogsProductGroupCreateRequest } from './catalogsProductGroupCreateRequest';
import { CatalogsProductGroupCurrencyCriteria } from './catalogsProductGroupCurrencyCriteria';
import { CatalogsProductGroupFilterKeys } from './catalogsProductGroupFilterKeys';
import { CatalogsProductGroupFilters } from './catalogsProductGroupFilters';
import { CatalogsProductGroupFiltersAllOf } from './catalogsProductGroupFiltersAllOf';
import { CatalogsProductGroupFiltersAnyOf } from './catalogsProductGroupFiltersAnyOf';
import { CatalogsProductGroupFiltersRequest } from './catalogsProductGroupFiltersRequest';
import { CatalogsProductGroupFiltersRequestAnyOf } from './catalogsProductGroupFiltersRequestAnyOf';
import { CatalogsProductGroupFiltersRequestAnyOf1 } from './catalogsProductGroupFiltersRequestAnyOf1';
import { CatalogsProductGroupMultipleCountriesCriteria } from './catalogsProductGroupMultipleCountriesCriteria';
import { CatalogsProductGroupMultipleGenderCriteria } from './catalogsProductGroupMultipleGenderCriteria';
import { CatalogsProductGroupMultipleStringCriteria } from './catalogsProductGroupMultipleStringCriteria';
import { CatalogsProductGroupMultipleStringListCriteria } from './catalogsProductGroupMultipleStringListCriteria';
import { CatalogsProductGroupPinsList200Response } from './catalogsProductGroupPinsList200Response';
import { CatalogsProductGroupPricingCriteria } from './catalogsProductGroupPricingCriteria';
import { CatalogsProductGroupPricingCurrencyCriteria } from './catalogsProductGroupPricingCurrencyCriteria';
import { CatalogsProductGroupProductCounts } from './catalogsProductGroupProductCounts';
import { CatalogsProductGroupStatus } from './catalogsProductGroupStatus';
import { CatalogsProductGroupType } from './catalogsProductGroupType';
import { CatalogsProductGroupUpdateRequest } from './catalogsProductGroupUpdateRequest';
import { CatalogsProductGroupsCreate201Response } from './catalogsProductGroupsCreate201Response';
import { CatalogsProductGroupsCreateRequest } from './catalogsProductGroupsCreateRequest';
import { CatalogsProductGroupsList200Response } from './catalogsProductGroupsList200Response';
import { CatalogsProductGroupsList200ResponseAllOfItemsInner } from './catalogsProductGroupsList200ResponseAllOfItemsInner';
import { CatalogsProductGroupsUpdateRequest } from './catalogsProductGroupsUpdateRequest';
import { CatalogsProductMetadata } from './catalogsProductMetadata';
import { CatalogsRetailBatchRequest } from './catalogsRetailBatchRequest';
import { CatalogsRetailBatchRequestItemsInner } from './catalogsRetailBatchRequestItemsInner';
import { CatalogsRetailFeed } from './catalogsRetailFeed';
import { CatalogsRetailFeedsCreateRequest } from './catalogsRetailFeedsCreateRequest';
import { CatalogsRetailFeedsUpdateRequest } from './catalogsRetailFeedsUpdateRequest';
import { CatalogsRetailItemErrorResponse } from './catalogsRetailItemErrorResponse';
import { CatalogsRetailItemResponse } from './catalogsRetailItemResponse';
import { CatalogsRetailItemsBatch } from './catalogsRetailItemsBatch';
import { CatalogsRetailItemsFilter } from './catalogsRetailItemsFilter';
import { CatalogsRetailProductGroup } from './catalogsRetailProductGroup';
import { CatalogsStatus } from './catalogsStatus';
import { CatalogsType } from './catalogsType';
import { CatalogsUpdatableHotelAttributes } from './catalogsUpdatableHotelAttributes';
import { CatalogsUpdateHotelItem } from './catalogsUpdateHotelItem';
import { CatalogsUpdateRetailItem } from './catalogsUpdateRetailItem';
import { CatalogsUpsertHotelItem } from './catalogsUpsertHotelItem';
import { CatalogsUpsertRetailItem } from './catalogsUpsertRetailItem';
import { CatalogsVerticalBatchRequest } from './catalogsVerticalBatchRequest';
import { CatalogsVerticalFeedsCreateRequest } from './catalogsVerticalFeedsCreateRequest';
import { CatalogsVerticalFeedsUpdateRequest } from './catalogsVerticalFeedsUpdateRequest';
import { CatalogsVerticalProductGroup } from './catalogsVerticalProductGroup';
import { CatalogsVerticalProductGroupCreateRequest } from './catalogsVerticalProductGroupCreateRequest';
import { CatalogsVerticalProductGroupUpdateRequest } from './catalogsVerticalProductGroupUpdateRequest';
import { ConditionFilter } from './conditionFilter';
import { ConversionApiResponse } from './conversionApiResponse';
import { ConversionApiResponseEventsInner } from './conversionApiResponseEventsInner';
import { ConversionAttributionWindowDays } from './conversionAttributionWindowDays';
import { ConversionEventResponse } from './conversionEventResponse';
import { ConversionEvents } from './conversionEvents';
import { ConversionEventsDataInner } from './conversionEventsDataInner';
import { ConversionEventsDataInnerCustomData } from './conversionEventsDataInnerCustomData';
import { ConversionEventsDataInnerCustomDataContentsInner } from './conversionEventsDataInnerCustomDataContentsInner';
import { ConversionEventsUserData } from './conversionEventsUserData';
import { ConversionReportAttributionType } from './conversionReportAttributionType';
import { ConversionReportTimeType } from './conversionReportTimeType';
import { ConversionTagCommon } from './conversionTagCommon';
import { ConversionTagConfigs } from './conversionTagConfigs';
import { ConversionTagCreate } from './conversionTagCreate';
import { ConversionTagListResponse } from './conversionTagListResponse';
import { ConversionTagResponse } from './conversionTagResponse';
import { ConversionTagType } from './conversionTagType';
import { Country } from './country';
import { CountryFilter } from './countryFilter';
import { CreateMMMReportRequest } from './createMMMReportRequest';
import { CreateMMMReportResponse } from './createMMMReportResponse';
import { CreateMMMReportResponseData } from './createMMMReportResponseData';
import { CreativeType } from './creativeType';
import { Currency } from './currency';
import { CurrencyFilter } from './currencyFilter';
import { CustomLabel0Filter } from './customLabel0Filter';
import { CustomLabel1Filter } from './customLabel1Filter';
import { CustomLabel2Filter } from './customLabel2Filter';
import { CustomLabel3Filter } from './customLabel3Filter';
import { CustomLabel4Filter } from './customLabel4Filter';
import { CustomerList } from './customerList';
import { CustomerListRequest } from './customerListRequest';
import { CustomerListUpdateRequest } from './customerListUpdateRequest';
import { CustomerListsList200Response } from './customerListsList200Response';
import { DataOutputFormat } from './dataOutputFormat';
import { DataStatus } from './dataStatus';
import { DeliveryMetricsResponse } from './deliveryMetricsResponse';
import { DeliveryMetricsResponseItemsInner } from './deliveryMetricsResponseItemsInner';
import { DetailedError } from './detailedError';
import { EnhancedMatchStatusType } from './enhancedMatchStatusType';
import { EntityStatus } from './entityStatus';
import { Exception } from './exception';
import { FeedProcessingResultsList200Response } from './feedProcessingResultsList200Response';
import { FeedsCreateRequest } from './feedsCreateRequest';
import { FeedsList200Response } from './feedsList200Response';
import { FeedsUpdateRequest } from './feedsUpdateRequest';
import { FollowUserRequest } from './followUserRequest';
import { FollowersList200Response } from './followersList200Response';
import { Gender } from './gender';
import { GenderFilter } from './genderFilter';
import { GetAudiencesOrderBy } from './getAudiencesOrderBy';
import { GetMMMReportResponse } from './getMMMReportResponse';
import { GetMMMReportResponseData } from './getMMMReportResponseData';
import { GoogleProductCategory0Filter } from './googleProductCategory0Filter';
import { GoogleProductCategory1Filter } from './googleProductCategory1Filter';
import { GoogleProductCategory2Filter } from './googleProductCategory2Filter';
import { GoogleProductCategory3Filter } from './googleProductCategory3Filter';
import { GoogleProductCategory4Filter } from './googleProductCategory4Filter';
import { GoogleProductCategory5Filter } from './googleProductCategory5Filter';
import { GoogleProductCategory6Filter } from './googleProductCategory6Filter';
import { Granularity } from './granularity';
import { GridClickType } from './gridClickType';
import { HotelIdFilter } from './hotelIdFilter';
import { HotelProcessingRecord } from './hotelProcessingRecord';
import { ImageDetails } from './imageDetails';
import { ImageMetadata } from './imageMetadata';
import { ImageMetadataImages } from './imageMetadataImages';
import { IntegrationLog } from './integrationLog';
import { IntegrationLogClientError } from './integrationLogClientError';
import { IntegrationLogClientRequest } from './integrationLogClientRequest';
import { IntegrationLogsInvalidLogResponse } from './integrationLogsInvalidLogResponse';
import { IntegrationLogsInvalidLogResponseRejectedLogsInner } from './integrationLogsInvalidLogResponseRejectedLogsInner';
import { IntegrationLogsRequest } from './integrationLogsRequest';
import { IntegrationLogsSuccessResponse } from './integrationLogsSuccessResponse';
import { IntegrationMetadata } from './integrationMetadata';
import { IntegrationRecord } from './integrationRecord';
import { IntegrationRequest } from './integrationRequest';
import { IntegrationRequestPatch } from './integrationRequestPatch';
import { IntegrationsGetList200Response } from './integrationsGetList200Response';
import { Interest } from './interest';
import { ItemAttributes } from './itemAttributes';
import { ItemBatchRecord } from './itemBatchRecord';
import { ItemCreateBatchRecord } from './itemCreateBatchRecord';
import { ItemDeleteBatchRecord } from './itemDeleteBatchRecord';
import { ItemDeleteDiscontinuedBatchRecord } from './itemDeleteDiscontinuedBatchRecord';
import { ItemGroupIdFilter } from './itemGroupIdFilter';
import { ItemIdFilter } from './itemIdFilter';
import { ItemProcessingRecord } from './itemProcessingRecord';
import { ItemProcessingStatus } from './itemProcessingStatus';
import { ItemResponse } from './itemResponse';
import { ItemResponseAnyOf } from './itemResponseAnyOf';
import { ItemResponseAnyOf1 } from './itemResponseAnyOf1';
import { ItemUpdateBatchRecord } from './itemUpdateBatchRecord';
import { ItemUpsertBatchRecord } from './itemUpsertBatchRecord';
import { ItemValidationEvent } from './itemValidationEvent';
import { ItemsBatchPostRequest } from './itemsBatchPostRequest';
import { ItemsIssuesList200Response } from './itemsIssuesList200Response';
import { Keyword } from './keyword';
import { KeywordError } from './keywordError';
import { KeywordMetrics } from './keywordMetrics';
import { KeywordMetricsResponse } from './keywordMetricsResponse';
import { KeywordUpdate } from './keywordUpdate';
import { KeywordUpdateBody } from './keywordUpdateBody';
import { KeywordsCommon } from './keywordsCommon';
import { KeywordsGet200Response } from './keywordsGet200Response';
import { KeywordsMetricsArrayResponse } from './keywordsMetricsArrayResponse';
import { KeywordsRequest } from './keywordsRequest';
import { KeywordsResponse } from './keywordsResponse';
import { Language } from './language';
import { LeadFormCommon } from './leadFormCommon';
import { LeadFormQuestion } from './leadFormQuestion';
import { LeadFormQuestionFieldType } from './leadFormQuestionFieldType';
import { LeadFormQuestionType } from './leadFormQuestionType';
import { LeadFormResponse } from './leadFormResponse';
import { LeadFormStatus } from './leadFormStatus';
import { LeadFormTestRequest } from './leadFormTestRequest';
import { LeadFormTestResponse } from './leadFormTestResponse';
import { LeadFormsList200Response } from './leadFormsList200Response';
import { LineItem } from './lineItem';
import { LinkedBusiness } from './linkedBusiness';
import { MMMReportingColumn } from './mMMReportingColumn';
import { MMMReportingTargetingType } from './mMMReportingTargetingType';
import { MatchType } from './matchType';
import { MatchTypeResponse } from './matchTypeResponse';
import { MaxPriceFilter } from './maxPriceFilter';
import { MediaList200Response } from './mediaList200Response';
import { MediaUpload } from './mediaUpload';
import { MediaUploadAllOfUploadParameters } from './mediaUploadAllOfUploadParameters';
import { MediaUploadDetails } from './mediaUploadDetails';
import { MediaUploadRequest } from './mediaUploadRequest';
import { MediaUploadStatus } from './mediaUploadStatus';
import { MediaUploadType } from './mediaUploadType';
import { MetricsReportingLevel } from './metricsReportingLevel';
import { MetricsResponse } from './metricsResponse';
import { MinPriceFilter } from './minPriceFilter';
import { ModelError } from './modelError';
import { NonNullableCatalogsCurrency } from './nonNullableCatalogsCurrency';
import { NonNullableProductAvailabilityType } from './nonNullableProductAvailabilityType';
import { NullableCatalogsItemFieldType } from './nullableCatalogsItemFieldType';
import { NullableCurrency } from './nullableCurrency';
import { OauthAccessTokenRequestCode } from './oauthAccessTokenRequestCode';
import { OauthAccessTokenRequestRefresh } from './oauthAccessTokenRequestRefresh';
import { OauthAccessTokenResponse } from './oauthAccessTokenResponse';
import { OauthAccessTokenResponseCode } from './oauthAccessTokenResponseCode';
import { OauthAccessTokenResponseEverlastingRefresh } from './oauthAccessTokenResponseEverlastingRefresh';
import { OauthAccessTokenResponseIntegrationRefresh } from './oauthAccessTokenResponseIntegrationRefresh';
import { OauthAccessTokenResponseRefresh } from './oauthAccessTokenResponseRefresh';
import { ObjectiveType } from './objectiveType';
import { OptimizationGoalMetadata } from './optimizationGoalMetadata';
import { OptimizationGoalMetadataConversionTagV3GoalMetadata } from './optimizationGoalMetadataConversionTagV3GoalMetadata';
import { OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows } from './optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows';
import { OptimizationGoalMetadataFrequencyGoalMetadata } from './optimizationGoalMetadataFrequencyGoalMetadata';
import { OptimizationGoalMetadataScrollupGoalMetadata } from './optimizationGoalMetadataScrollupGoalMetadata';
import { OrderLine } from './orderLine';
import { OrderLineError } from './orderLineError';
import { OrderLinePaidType } from './orderLinePaidType';
import { OrderLineResponse } from './orderLineResponse';
import { OrderLineSingleResponse } from './orderLineSingleResponse';
import { OrderLineStatus } from './orderLineStatus';
import { OrderLines } from './orderLines';
import { OrderLinesArrayResponse } from './orderLinesArrayResponse';
import { OrderLinesList200Response } from './orderLinesList200Response';
import { PacingDeliveryType } from './pacingDeliveryType';
import { PageVisitConversionTagsGet200Response } from './pageVisitConversionTagsGet200Response';
import { Paginated } from './paginated';
import { PartnerType } from './partnerType';
import { Pin } from './pin';
import { PinAnalyticsMetricsResponse } from './pinAnalyticsMetricsResponse';
import { PinAnalyticsMetricsResponseDailyMetricsInner } from './pinAnalyticsMetricsResponseDailyMetricsInner';
import { PinCreate } from './pinCreate';
import { PinMedia } from './pinMedia';
import { PinMediaMetadata } from './pinMediaMetadata';
import { PinMediaSource } from './pinMediaSource';
import { PinMediaSourceImageBase64 } from './pinMediaSourceImageBase64';
import { PinMediaSourceImageURL } from './pinMediaSourceImageURL';
import { PinMediaSourceImagesBase64 } from './pinMediaSourceImagesBase64';
import { PinMediaSourceImagesBase64ItemsInner } from './pinMediaSourceImagesBase64ItemsInner';
import { PinMediaSourceImagesURL } from './pinMediaSourceImagesURL';
import { PinMediaSourceImagesURLItemsInner } from './pinMediaSourceImagesURLItemsInner';
import { PinMediaSourcePinURL } from './pinMediaSourcePinURL';
import { PinMediaSourceVideoID } from './pinMediaSourceVideoID';
import { PinMediaWithImage } from './pinMediaWithImage';
import { PinMediaWithImageAndVideo } from './pinMediaWithImageAndVideo';
import { PinMediaWithImages } from './pinMediaWithImages';
import { PinMediaWithVideo } from './pinMediaWithVideo';
import { PinMediaWithVideos } from './pinMediaWithVideos';
import { PinPromotionSummaryStatus } from './pinPromotionSummaryStatus';
import { PinUpdate } from './pinUpdate';
import { PinUpdateCarouselSlotsInner } from './pinUpdateCarouselSlotsInner';
import { PinsAnalyticsMetricTypesParameterInner } from './pinsAnalyticsMetricTypesParameterInner';
import { PinsList200Response } from './pinsList200Response';
import { PinsSaveRequest } from './pinsSaveRequest';
import { PinterestTagEventData } from './pinterestTagEventData';
import { PlacementGroupType } from './placementGroupType';
import { PriceFilter } from './priceFilter';
import { ProductAvailabilityType } from './productAvailabilityType';
import { ProductGroupAnalyticsResponseInner } from './productGroupAnalyticsResponseInner';
import { ProductGroupPromotion } from './productGroupPromotion';
import { ProductGroupPromotionCreateRequest } from './productGroupPromotionCreateRequest';
import { ProductGroupPromotionResponse } from './productGroupPromotionResponse';
import { ProductGroupPromotionResponseItem } from './productGroupPromotionResponseItem';
import { ProductGroupPromotionUpdateRequest } from './productGroupPromotionUpdateRequest';
import { ProductGroupPromotionsList200Response } from './productGroupPromotionsList200Response';
import { ProductGroupSummaryStatus } from './productGroupSummaryStatus';
import { ProductType0Filter } from './productType0Filter';
import { ProductType1Filter } from './productType1Filter';
import { ProductType2Filter } from './productType2Filter';
import { ProductType3Filter } from './productType3Filter';
import { ProductType4Filter } from './productType4Filter';
import { QuizPinData } from './quizPinData';
import { QuizPinOption } from './quizPinOption';
import { QuizPinQuestion } from './quizPinQuestion';
import { QuizPinResult } from './quizPinResult';
import { RelatedTerms } from './relatedTerms';
import { RelatedTermsRelatedTermsListInner } from './relatedTermsRelatedTermsListInner';
import { ReportingColumnAsync } from './reportingColumnAsync';
import { Role } from './role';
import { SSIOAccountAddress } from './sSIOAccountAddress';
import { SSIOAccountItem } from './sSIOAccountItem';
import { SSIOAccountPMPName } from './sSIOAccountPMPName';
import { SSIOAccountResponse } from './sSIOAccountResponse';
import { SSIOCreateInsertionOrderRequest } from './sSIOCreateInsertionOrderRequest';
import { SSIOCreateInsertionOrderResponse } from './sSIOCreateInsertionOrderResponse';
import { SSIOEditInsertionOrderRequest } from './sSIOEditInsertionOrderRequest';
import { SSIOEditInsertionOrderResponse } from './sSIOEditInsertionOrderResponse';
import { SSIOInsertionOrderCommon } from './sSIOInsertionOrderCommon';
import { SSIOInsertionOrderStatus } from './sSIOInsertionOrderStatus';
import { SSIOInsertionOrderStatusResponse } from './sSIOInsertionOrderStatusResponse';
import { SSIOOrderLine } from './sSIOOrderLine';
import { SearchPartnerPins200Response } from './searchPartnerPins200Response';
import { SearchUserBoardsGet200Response } from './searchUserBoardsGet200Response';
import { SingleInterestTargetingOptionResponse } from './singleInterestTargetingOptionResponse';
import { SsioInsertionOrdersStatusGetByAdAccount200Response } from './ssioInsertionOrdersStatusGetByAdAccount200Response';
import { SsioOrderLinesGetByAdAccount200Response } from './ssioOrderLinesGetByAdAccount200Response';
import { SummaryPin } from './summaryPin';
import { SummaryPinMedia } from './summaryPinMedia';
import { TargetingAdvertiserCountry } from './targetingAdvertiserCountry';
import { TargetingSpec } from './targetingSpec';
import { TargetingSpecSHOPPINGRETARGETING } from './targetingSpecSHOPPINGRETARGETING';
import { TargetingTypeFilter } from './targetingTypeFilter';
import { TemplateResponse } from './templateResponse';
import { TemplateResponseDateRange } from './templateResponseDateRange';
import { TemplateResponseDateRangeAbsoluteDateRange } from './templateResponseDateRangeAbsoluteDateRange';
import { TemplateResponseDateRangeDynamicDateRange } from './templateResponseDateRangeDynamicDateRange';
import { TemplateResponseDateRangeRelativeDateRange } from './templateResponseDateRangeRelativeDateRange';
import { TemplatesList200Response } from './templatesList200Response';
import { TermsOfService } from './termsOfService';
import { TopPinsAnalyticsResponse } from './topPinsAnalyticsResponse';
import { TopPinsAnalyticsResponseDateAvailability } from './topPinsAnalyticsResponseDateAvailability';
import { TopPinsAnalyticsResponsePinsInner } from './topPinsAnalyticsResponsePinsInner';
import { TopVideoPinsAnalyticsResponse } from './topVideoPinsAnalyticsResponse';
import { TopVideoPinsAnalyticsResponsePinsInner } from './topVideoPinsAnalyticsResponsePinsInner';
import { TrackingUrls } from './trackingUrls';
import { TrendType } from './trendType';
import { TrendingKeywordsResponse } from './trendingKeywordsResponse';
import { TrendingKeywordsResponseTrendsInner } from './trendingKeywordsResponseTrendsInner';
import { TrendingKeywordsResponseTrendsInnerTimeSeries } from './trendingKeywordsResponseTrendsInnerTimeSeries';
import { TrendsSupportedRegion } from './trendsSupportedRegion';
import { UpdatableItemAttributes } from './updatableItemAttributes';
import { UpdateMaskFieldType } from './updateMaskFieldType';
import { UserAccountFollowedInterests200Response } from './userAccountFollowedInterests200Response';
import { UserFollowingFeedType } from './userFollowingFeedType';
import { UserFollowingGet200Response } from './userFollowingGet200Response';
import { UserListOperationType } from './userListOperationType';
import { UserListType } from './userListType';
import { UserSummary } from './userSummary';
import { UserWebsiteSummary } from './userWebsiteSummary';
import { UserWebsiteVerificationCode } from './userWebsiteVerificationCode';
import { UserWebsiteVerifyRequest } from './userWebsiteVerifyRequest';
import { UserWebsitesGet200Response } from './userWebsitesGet200Response';
import { VideoMetadata } from './videoMetadata';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

let enumsMap: {[index: string]: any} = {
        "Account.AccountTypeEnum": Account.AccountTypeEnum,
        "ActionType": ActionType,
        "AdCommon.CustomizableCtaTypeEnum": AdCommon.CustomizableCtaTypeEnum,
        "AdCountry": AdCountry,
        "AdCreateRequest.CustomizableCtaTypeEnum": AdCreateRequest.CustomizableCtaTypeEnum,
        "AdGroupAudienceSizingRequest.CreativeTypesEnum": AdGroupAudienceSizingRequest.CreativeTypesEnum,
        "AdGroupCommon.BidStrategyTypeEnum": AdGroupCommon.BidStrategyTypeEnum,
        "AdGroupCreateRequest.BidStrategyTypeEnum": AdGroupCreateRequest.BidStrategyTypeEnum,
        "AdGroupResponse.BidStrategyTypeEnum": AdGroupResponse.BidStrategyTypeEnum,
        "AdGroupResponse.ConversionLearningModeTypeEnum": AdGroupResponse.ConversionLearningModeTypeEnum,
        "AdGroupSummaryStatus": AdGroupSummaryStatus,
        "AdGroupUpdateRequest.BidStrategyTypeEnum": AdGroupUpdateRequest.BidStrategyTypeEnum,
        "AdResponse.CustomizableCtaTypeEnum": AdResponse.CustomizableCtaTypeEnum,
        "AdResponse.RejectedReasonsEnum": AdResponse.RejectedReasonsEnum,
        "AdResponse.ReviewStatusEnum": AdResponse.ReviewStatusEnum,
        "AdUpdateRequest.CustomizableCtaTypeEnum": AdUpdateRequest.CustomizableCtaTypeEnum,
        "AdsAnalyticsFilterColumn": AdsAnalyticsFilterColumn,
        "AdsAnalyticsFilterOperator": AdsAnalyticsFilterOperator,
        "AdsAnalyticsTargetingType": AdsAnalyticsTargetingType,
        "AdsCreditDiscountsResponse.DiscountTypeEnum": AdsCreditDiscountsResponse.DiscountTypeEnum,
        "AudienceDataParty": AudienceDataParty,
        "AudienceInsightType": AudienceInsightType,
        "AudienceSharingType": AudienceSharingType,
        "AudienceType": AudienceType,
        "AudienceUpdateOperationType": AudienceUpdateOperationType,
        "BatchOperation": BatchOperation,
        "BatchOperationStatus": BatchOperationStatus,
        "BillingProfilesResponse.CardTypeEnum": BillingProfilesResponse.CardTypeEnum,
        "BillingProfilesResponse.StatusEnum": BillingProfilesResponse.StatusEnum,
        "BillingProfilesResponse.PaymentMethodBrandEnum": BillingProfilesResponse.PaymentMethodBrandEnum,
        "Board.PrivacyEnum": Board.PrivacyEnum,
        "BoardUpdate.PrivacyEnum": BoardUpdate.PrivacyEnum,
        "BudgetType": BudgetType,
        "BulkEntityType": BulkEntityType,
        "BulkOutputFormat": BulkOutputFormat,
        "BulkReportingJobStatus": BulkReportingJobStatus,
        "BulkUpsertStatus": BulkUpsertStatus,
        "BusinessAccessRole": BusinessAccessRole,
        "CampaignSummaryStatus": CampaignSummaryStatus,
        "CatalogsCreateHotelItem.OperationEnum": CatalogsCreateHotelItem.OperationEnum,
        "CatalogsCreateRetailItem.OperationEnum": CatalogsCreateRetailItem.OperationEnum,
        "CatalogsDeleteHotelItem.OperationEnum": CatalogsDeleteHotelItem.OperationEnum,
        "CatalogsDeleteRetailItem.OperationEnum": CatalogsDeleteRetailItem.OperationEnum,
        "CatalogsFeedIngestionErrors.LARGEPRODUCTCOUNTDECREASEEnum": CatalogsFeedIngestionErrors.LARGEPRODUCTCOUNTDECREASEEnum,
        "CatalogsFeedProcessingSchedule.TimezoneEnum": CatalogsFeedProcessingSchedule.TimezoneEnum,
        "CatalogsFeedProcessingStatus": CatalogsFeedProcessingStatus,
        "CatalogsFeedValidationWarnings.FETCHSAMESIGNATUREEnum": CatalogsFeedValidationWarnings.FETCHSAMESIGNATUREEnum,
        "CatalogsFormat": CatalogsFormat,
        "CatalogsHotelBatchItem.OperationEnum": CatalogsHotelBatchItem.OperationEnum,
        "CatalogsHotelItemsFilter.CatalogTypeEnum": CatalogsHotelItemsFilter.CatalogTypeEnum,
        "CatalogsHotelProductGroup.CatalogTypeEnum": CatalogsHotelProductGroup.CatalogTypeEnum,
        "CatalogsHotelProductGroupCreateRequest.CatalogTypeEnum": CatalogsHotelProductGroupCreateRequest.CatalogTypeEnum,
        "CatalogsHotelProductGroupUpdateRequest.CatalogTypeEnum": CatalogsHotelProductGroupUpdateRequest.CatalogTypeEnum,
        "CatalogsItemValidationIssue": CatalogsItemValidationIssue,
        "CatalogsLocale": CatalogsLocale,
        "CatalogsProductGroup.CatalogTypeEnum": CatalogsProductGroup.CatalogTypeEnum,
        "CatalogsProductGroupPricingCurrencyCriteria.OperatorEnum": CatalogsProductGroupPricingCurrencyCriteria.OperatorEnum,
        "CatalogsProductGroupStatus": CatalogsProductGroupStatus,
        "CatalogsProductGroupType": CatalogsProductGroupType,
        "CatalogsProductGroupsCreate201Response.CatalogTypeEnum": CatalogsProductGroupsCreate201Response.CatalogTypeEnum,
        "CatalogsProductGroupsList200ResponseAllOfItemsInner.CatalogTypeEnum": CatalogsProductGroupsList200ResponseAllOfItemsInner.CatalogTypeEnum,
        "CatalogsRetailBatchRequestItemsInner.OperationEnum": CatalogsRetailBatchRequestItemsInner.OperationEnum,
        "CatalogsRetailItemsFilter.CatalogTypeEnum": CatalogsRetailItemsFilter.CatalogTypeEnum,
        "CatalogsRetailProductGroup.CatalogTypeEnum": CatalogsRetailProductGroup.CatalogTypeEnum,
        "CatalogsRetailProductGroup.FeedIdEnum": CatalogsRetailProductGroup.FeedIdEnum,
        "CatalogsStatus": CatalogsStatus,
        "CatalogsType": CatalogsType,
        "CatalogsUpdateHotelItem.OperationEnum": CatalogsUpdateHotelItem.OperationEnum,
        "CatalogsUpdateRetailItem.OperationEnum": CatalogsUpdateRetailItem.OperationEnum,
        "CatalogsUpsertHotelItem.OperationEnum": CatalogsUpsertHotelItem.OperationEnum,
        "CatalogsUpsertRetailItem.OperationEnum": CatalogsUpsertRetailItem.OperationEnum,
        "CatalogsVerticalProductGroup.CatalogTypeEnum": CatalogsVerticalProductGroup.CatalogTypeEnum,
        "CatalogsVerticalProductGroup.FeedIdEnum": CatalogsVerticalProductGroup.FeedIdEnum,
        "CatalogsVerticalProductGroupCreateRequest.CatalogTypeEnum": CatalogsVerticalProductGroupCreateRequest.CatalogTypeEnum,
        "CatalogsVerticalProductGroupUpdateRequest.CatalogTypeEnum": CatalogsVerticalProductGroupUpdateRequest.CatalogTypeEnum,
        "ConversionApiResponseEventsInner.StatusEnum": ConversionApiResponseEventsInner.StatusEnum,
        "ConversionAttributionWindowDays": ConversionAttributionWindowDays,
        "ConversionReportAttributionType": ConversionReportAttributionType,
        "ConversionReportTimeType": ConversionReportTimeType,
        "ConversionTagType": ConversionTagType,
        "Country": Country,
        "CreateMMMReportRequest.GranularityEnum": CreateMMMReportRequest.GranularityEnum,
        "CreateMMMReportRequest.LevelEnum": CreateMMMReportRequest.LevelEnum,
        "CreativeType": CreativeType,
        "Currency": Currency,
        "CustomerList.StatusEnum": CustomerList.StatusEnum,
        "DataOutputFormat": DataOutputFormat,
        "DataStatus": DataStatus,
        "DeliveryMetricsResponseItemsInner.CategoryEnum": DeliveryMetricsResponseItemsInner.CategoryEnum,
        "EnhancedMatchStatusType": EnhancedMatchStatusType,
        "EntityStatus": EntityStatus,
        "Gender": Gender,
        "GetAudiencesOrderBy": GetAudiencesOrderBy,
        "GetMMMReportResponseData.ReportStatusEnum": GetMMMReportResponseData.ReportStatusEnum,
        "Granularity": Granularity,
        "GridClickType": GridClickType,
        "IntegrationLog.EventTypeEnum": IntegrationLog.EventTypeEnum,
        "IntegrationLog.LogLevelEnum": IntegrationLog.LogLevelEnum,
        "IntegrationLogClientRequest.MethodEnum": IntegrationLogClientRequest.MethodEnum,
        "ItemProcessingStatus": ItemProcessingStatus,
        "Language": Language,
        "LeadFormQuestionFieldType": LeadFormQuestionFieldType,
        "LeadFormQuestionType": LeadFormQuestionType,
        "LeadFormStatus": LeadFormStatus,
        "MMMReportingColumn": MMMReportingColumn,
        "MMMReportingTargetingType": MMMReportingTargetingType,
        "MatchType": MatchType,
        "MatchTypeResponse": MatchTypeResponse,
        "MediaUploadStatus": MediaUploadStatus,
        "MediaUploadType": MediaUploadType,
        "MetricsReportingLevel": MetricsReportingLevel,
        "NonNullableCatalogsCurrency": NonNullableCatalogsCurrency,
        "NonNullableProductAvailabilityType": NonNullableProductAvailabilityType,
        "NullableCatalogsItemFieldType": NullableCatalogsItemFieldType,
        "NullableCurrency": NullableCurrency,
        "OauthAccessTokenResponse.ResponseTypeEnum": OauthAccessTokenResponse.ResponseTypeEnum,
        "ObjectiveType": ObjectiveType,
        "OptimizationGoalMetadataConversionTagV3GoalMetadata.ConversionEventEnum": OptimizationGoalMetadataConversionTagV3GoalMetadata.ConversionEventEnum,
        "OptimizationGoalMetadataConversionTagV3GoalMetadata.LearningModeTypeEnum": OptimizationGoalMetadataConversionTagV3GoalMetadata.LearningModeTypeEnum,
        "OptimizationGoalMetadataFrequencyGoalMetadata.TimerangeEnum": OptimizationGoalMetadataFrequencyGoalMetadata.TimerangeEnum,
        "OrderLinePaidType": OrderLinePaidType,
        "OrderLineStatus": OrderLineStatus,
        "PacingDeliveryType": PacingDeliveryType,
        "PartnerType": PartnerType,
        "PinMediaSource.SourceTypeEnum": PinMediaSource.SourceTypeEnum,
        "PinMediaSource.ContentTypeEnum": PinMediaSource.ContentTypeEnum,
        "PinMediaSource.CoverImageContentTypeEnum": PinMediaSource.CoverImageContentTypeEnum,
        "PinMediaSourceImageBase64.SourceTypeEnum": PinMediaSourceImageBase64.SourceTypeEnum,
        "PinMediaSourceImageBase64.ContentTypeEnum": PinMediaSourceImageBase64.ContentTypeEnum,
        "PinMediaSourceImageURL.SourceTypeEnum": PinMediaSourceImageURL.SourceTypeEnum,
        "PinMediaSourceImagesBase64.SourceTypeEnum": PinMediaSourceImagesBase64.SourceTypeEnum,
        "PinMediaSourceImagesBase64ItemsInner.ContentTypeEnum": PinMediaSourceImagesBase64ItemsInner.ContentTypeEnum,
        "PinMediaSourceImagesURL.SourceTypeEnum": PinMediaSourceImagesURL.SourceTypeEnum,
        "PinMediaSourcePinURL.SourceTypeEnum": PinMediaSourcePinURL.SourceTypeEnum,
        "PinMediaSourceVideoID.SourceTypeEnum": PinMediaSourceVideoID.SourceTypeEnum,
        "PinMediaSourceVideoID.CoverImageContentTypeEnum": PinMediaSourceVideoID.CoverImageContentTypeEnum,
        "PinPromotionSummaryStatus": PinPromotionSummaryStatus,
        "PlacementGroupType": PlacementGroupType,
        "ProductAvailabilityType": ProductAvailabilityType,
        "ProductGroupSummaryStatus": ProductGroupSummaryStatus,
        "ReportingColumnAsync": ReportingColumnAsync,
        "Role": Role,
        "SSIOCreateInsertionOrderRequest.OrderLineTypeEnum": SSIOCreateInsertionOrderRequest.OrderLineTypeEnum,
        "TargetingAdvertiserCountry": TargetingAdvertiserCountry,
        "TargetingSpec.AGEBUCKETEnum": TargetingSpec.AGEBUCKETEnum,
        "TargetingSpec.APPTYPEEnum": TargetingSpec.APPTYPEEnum,
        "TargetingSpec.GENDEREnum": TargetingSpec.GENDEREnum,
        "TargetingSpec.TARGETINGSTRATEGYEnum": TargetingSpec.TARGETINGSTRATEGYEnum,
        "TemplateResponse.ColumnsEnum": TemplateResponse.ColumnsEnum,
        "TemplateResponse.ConversionReportTimeTypeEnum": TemplateResponse.ConversionReportTimeTypeEnum,
        "TemplateResponse.CreationSourceEnum": TemplateResponse.CreationSourceEnum,
        "TemplateResponse.TypeEnum": TemplateResponse.TypeEnum,
        "TemplateResponse.IngestionSourcesEnum": TemplateResponse.IngestionSourcesEnum,
        "TemplateResponseDateRangeDynamicDateRange.RangeEnum": TemplateResponseDateRangeDynamicDateRange.RangeEnum,
        "TopPinsAnalyticsResponse.SortByEnum": TopPinsAnalyticsResponse.SortByEnum,
        "TopVideoPinsAnalyticsResponse.SortByEnum": TopVideoPinsAnalyticsResponse.SortByEnum,
        "TrendType": TrendType,
        "TrendsSupportedRegion": TrendsSupportedRegion,
        "UpdateMaskFieldType": UpdateMaskFieldType,
        "UserFollowingFeedType": UserFollowingFeedType,
        "UserListOperationType": UserListOperationType,
        "UserListType": UserListType,
        "UserWebsiteVerifyRequest.VerificationMethodEnum": UserWebsiteVerifyRequest.VerificationMethodEnum,
}

let typeMap: {[index: string]: any} = {
    "Account": Account,
    "AdAccount": AdAccount,
    "AdAccountAnalyticsResponseInner": AdAccountAnalyticsResponseInner,
    "AdAccountCreateRequest": AdAccountCreateRequest,
    "AdAccountCreateSubscriptionRequest": AdAccountCreateSubscriptionRequest,
    "AdAccountCreateSubscriptionResponse": AdAccountCreateSubscriptionResponse,
    "AdAccountGetSubscriptionResponse": AdAccountGetSubscriptionResponse,
    "AdAccountOwner": AdAccountOwner,
    "AdAccountsCatalogsProductGroupsList200Response": AdAccountsCatalogsProductGroupsList200Response,
    "AdAccountsCountryResponse": AdAccountsCountryResponse,
    "AdAccountsCountryResponseData": AdAccountsCountryResponseData,
    "AdAccountsList200Response": AdAccountsList200Response,
    "AdAccountsSubscriptionsGetList200Response": AdAccountsSubscriptionsGetList200Response,
    "AdArrayResponse": AdArrayResponse,
    "AdArrayResponseElement": AdArrayResponseElement,
    "AdCommon": AdCommon,
    "AdCommonQuizPinData": AdCommonQuizPinData,
    "AdCommonTrackingUrls": AdCommonTrackingUrls,
    "AdCreateRequest": AdCreateRequest,
    "AdGroupArrayResponse": AdGroupArrayResponse,
    "AdGroupArrayResponseElement": AdGroupArrayResponseElement,
    "AdGroupAudienceSizingRequest": AdGroupAudienceSizingRequest,
    "AdGroupAudienceSizingRequestKeywordsInner": AdGroupAudienceSizingRequestKeywordsInner,
    "AdGroupAudienceSizingResponse": AdGroupAudienceSizingResponse,
    "AdGroupCommon": AdGroupCommon,
    "AdGroupCommonOptimizationGoalMetadata": AdGroupCommonOptimizationGoalMetadata,
    "AdGroupCommonTrackingUrls": AdGroupCommonTrackingUrls,
    "AdGroupCreateRequest": AdGroupCreateRequest,
    "AdGroupResponse": AdGroupResponse,
    "AdGroupUpdateRequest": AdGroupUpdateRequest,
    "AdGroupsAnalyticsResponseInner": AdGroupsAnalyticsResponseInner,
    "AdGroupsList200Response": AdGroupsList200Response,
    "AdPinId": AdPinId,
    "AdPreviewCreateFromImage": AdPreviewCreateFromImage,
    "AdPreviewCreateFromPin": AdPreviewCreateFromPin,
    "AdPreviewRequest": AdPreviewRequest,
    "AdPreviewURLResponse": AdPreviewURLResponse,
    "AdResponse": AdResponse,
    "AdUpdateRequest": AdUpdateRequest,
    "AdsAnalyticsCreateAsyncRequest": AdsAnalyticsCreateAsyncRequest,
    "AdsAnalyticsCreateAsyncResponse": AdsAnalyticsCreateAsyncResponse,
    "AdsAnalyticsGetAsyncResponse": AdsAnalyticsGetAsyncResponse,
    "AdsAnalyticsMetricsFilter": AdsAnalyticsMetricsFilter,
    "AdsAnalyticsResponseInner": AdsAnalyticsResponseInner,
    "AdsCreditDiscountsResponse": AdsCreditDiscountsResponse,
    "AdsCreditRedeemRequest": AdsCreditRedeemRequest,
    "AdsCreditRedeemResponse": AdsCreditRedeemResponse,
    "AdsCreditsDiscountsGet200Response": AdsCreditsDiscountsGet200Response,
    "AdsList200Response": AdsList200Response,
    "AnalyticsDailyMetrics": AnalyticsDailyMetrics,
    "AnalyticsMetricsResponse": AnalyticsMetricsResponse,
    "Audience": Audience,
    "AudienceCategory": AudienceCategory,
    "AudienceCommon": AudienceCommon,
    "AudienceCreateCustomRequest": AudienceCreateCustomRequest,
    "AudienceCreateRequest": AudienceCreateRequest,
    "AudienceCreateRequest1AudienceType": AudienceCreateRequest1AudienceType,
    "AudienceDefinition": AudienceDefinition,
    "AudienceDefinitionResponse": AudienceDefinitionResponse,
    "AudienceDemographicValue": AudienceDemographicValue,
    "AudienceDemographics": AudienceDemographics,
    "AudienceInsightCategoryArrayResponse": AudienceInsightCategoryArrayResponse,
    "AudienceInsightCategoryCommon": AudienceInsightCategoryCommon,
    "AudienceInsightsResponse": AudienceInsightsResponse,
    "AudienceRule": AudienceRule,
    "AudienceSubcategory": AudienceSubcategory,
    "AudienceUpdateRequest": AudienceUpdateRequest,
    "AudiencesList200Response": AudiencesList200Response,
    "AvailabilityFilter": AvailabilityFilter,
    "BidFloor": BidFloor,
    "BidFloorRequest": BidFloorRequest,
    "BidFloorSpec": BidFloorSpec,
    "BillingProfilesGet200Response": BillingProfilesGet200Response,
    "BillingProfilesResponse": BillingProfilesResponse,
    "Board": Board,
    "BoardMedia": BoardMedia,
    "BoardOwner": BoardOwner,
    "BoardSection": BoardSection,
    "BoardSectionsList200Response": BoardSectionsList200Response,
    "BoardUpdate": BoardUpdate,
    "BoardsList200Response": BoardsList200Response,
    "BoardsListPins200Response": BoardsListPins200Response,
    "BoardsUserFollowsList200Response": BoardsUserFollowsList200Response,
    "BookClosedResponse": BookClosedResponse,
    "BrandFilter": BrandFilter,
    "BulkDownloadRequest": BulkDownloadRequest,
    "BulkDownloadRequestCampaignFilter": BulkDownloadRequestCampaignFilter,
    "BulkDownloadResponse": BulkDownloadResponse,
    "BulkUpsertRequest": BulkUpsertRequest,
    "BulkUpsertRequestCreate": BulkUpsertRequestCreate,
    "BulkUpsertRequestUpdate": BulkUpsertRequestUpdate,
    "BulkUpsertResponse": BulkUpsertResponse,
    "BulkUpsertStatusResponse": BulkUpsertStatusResponse,
    "CampaignCommon": CampaignCommon,
    "CampaignCreateCommon": CampaignCreateCommon,
    "CampaignCreateRequest": CampaignCreateRequest,
    "CampaignCreateResponse": CampaignCreateResponse,
    "CampaignCreateResponseData": CampaignCreateResponseData,
    "CampaignCreateResponseItem": CampaignCreateResponseItem,
    "CampaignId": CampaignId,
    "CampaignResponse": CampaignResponse,
    "CampaignUpdateRequest": CampaignUpdateRequest,
    "CampaignUpdateResponse": CampaignUpdateResponse,
    "CampaignsAnalyticsResponseInner": CampaignsAnalyticsResponseInner,
    "CampaignsList200Response": CampaignsList200Response,
    "Catalog": Catalog,
    "CatalogProductGroup": CatalogProductGroup,
    "CatalogsCreateHotelItem": CatalogsCreateHotelItem,
    "CatalogsCreateRetailItem": CatalogsCreateRetailItem,
    "CatalogsDbItem": CatalogsDbItem,
    "CatalogsDeleteHotelItem": CatalogsDeleteHotelItem,
    "CatalogsDeleteRetailItem": CatalogsDeleteRetailItem,
    "CatalogsFeed": CatalogsFeed,
    "CatalogsFeedCredentials": CatalogsFeedCredentials,
    "CatalogsFeedIngestionDetails": CatalogsFeedIngestionDetails,
    "CatalogsFeedIngestionErrors": CatalogsFeedIngestionErrors,
    "CatalogsFeedIngestionInfo": CatalogsFeedIngestionInfo,
    "CatalogsFeedIngestionWarnings": CatalogsFeedIngestionWarnings,
    "CatalogsFeedProcessingResult": CatalogsFeedProcessingResult,
    "CatalogsFeedProcessingSchedule": CatalogsFeedProcessingSchedule,
    "CatalogsFeedProductCounts": CatalogsFeedProductCounts,
    "CatalogsFeedValidationDetails": CatalogsFeedValidationDetails,
    "CatalogsFeedValidationErrors": CatalogsFeedValidationErrors,
    "CatalogsFeedValidationWarnings": CatalogsFeedValidationWarnings,
    "CatalogsFeedsCreateRequest": CatalogsFeedsCreateRequest,
    "CatalogsFeedsCreateRequestDefaultLocale": CatalogsFeedsCreateRequestDefaultLocale,
    "CatalogsFeedsUpdateRequest": CatalogsFeedsUpdateRequest,
    "CatalogsHotelAddress": CatalogsHotelAddress,
    "CatalogsHotelAttributes": CatalogsHotelAttributes,
    "CatalogsHotelAttributesAllOfMainImage": CatalogsHotelAttributesAllOfMainImage,
    "CatalogsHotelBatchItem": CatalogsHotelBatchItem,
    "CatalogsHotelBatchRequest": CatalogsHotelBatchRequest,
    "CatalogsHotelFeed": CatalogsHotelFeed,
    "CatalogsHotelFeedsCreateRequest": CatalogsHotelFeedsCreateRequest,
    "CatalogsHotelFeedsUpdateRequest": CatalogsHotelFeedsUpdateRequest,
    "CatalogsHotelGuestRatings": CatalogsHotelGuestRatings,
    "CatalogsHotelItemErrorResponse": CatalogsHotelItemErrorResponse,
    "CatalogsHotelItemResponse": CatalogsHotelItemResponse,
    "CatalogsHotelItemsBatch": CatalogsHotelItemsBatch,
    "CatalogsHotelItemsFilter": CatalogsHotelItemsFilter,
    "CatalogsHotelProductGroup": CatalogsHotelProductGroup,
    "CatalogsHotelProductGroupCreateRequest": CatalogsHotelProductGroupCreateRequest,
    "CatalogsHotelProductGroupFilterKeys": CatalogsHotelProductGroupFilterKeys,
    "CatalogsHotelProductGroupFilters": CatalogsHotelProductGroupFilters,
    "CatalogsHotelProductGroupFiltersAllOf": CatalogsHotelProductGroupFiltersAllOf,
    "CatalogsHotelProductGroupFiltersAnyOf": CatalogsHotelProductGroupFiltersAnyOf,
    "CatalogsHotelProductGroupUpdateRequest": CatalogsHotelProductGroupUpdateRequest,
    "CatalogsItemValidationDetails": CatalogsItemValidationDetails,
    "CatalogsItemValidationErrors": CatalogsItemValidationErrors,
    "CatalogsItemValidationIssues": CatalogsItemValidationIssues,
    "CatalogsItemValidationWarnings": CatalogsItemValidationWarnings,
    "CatalogsItems": CatalogsItems,
    "CatalogsItemsBatch": CatalogsItemsBatch,
    "CatalogsItemsBatchRequest": CatalogsItemsBatchRequest,
    "CatalogsItemsCreateBatchRequest": CatalogsItemsCreateBatchRequest,
    "CatalogsItemsDeleteBatchRequest": CatalogsItemsDeleteBatchRequest,
    "CatalogsItemsDeleteDiscontinuedBatchRequest": CatalogsItemsDeleteDiscontinuedBatchRequest,
    "CatalogsItemsFilters": CatalogsItemsFilters,
    "CatalogsItemsUpdateBatchRequest": CatalogsItemsUpdateBatchRequest,
    "CatalogsItemsUpsertBatchRequest": CatalogsItemsUpsertBatchRequest,
    "CatalogsList200Response": CatalogsList200Response,
    "CatalogsListProductsByFilterRequest": CatalogsListProductsByFilterRequest,
    "CatalogsListProductsByFilterRequestOneOf": CatalogsListProductsByFilterRequestOneOf,
    "CatalogsProduct": CatalogsProduct,
    "CatalogsProductGroup": CatalogsProductGroup,
    "CatalogsProductGroupCreateRequest": CatalogsProductGroupCreateRequest,
    "CatalogsProductGroupCurrencyCriteria": CatalogsProductGroupCurrencyCriteria,
    "CatalogsProductGroupFilterKeys": CatalogsProductGroupFilterKeys,
    "CatalogsProductGroupFilters": CatalogsProductGroupFilters,
    "CatalogsProductGroupFiltersAllOf": CatalogsProductGroupFiltersAllOf,
    "CatalogsProductGroupFiltersAnyOf": CatalogsProductGroupFiltersAnyOf,
    "CatalogsProductGroupFiltersRequest": CatalogsProductGroupFiltersRequest,
    "CatalogsProductGroupFiltersRequestAnyOf": CatalogsProductGroupFiltersRequestAnyOf,
    "CatalogsProductGroupFiltersRequestAnyOf1": CatalogsProductGroupFiltersRequestAnyOf1,
    "CatalogsProductGroupMultipleCountriesCriteria": CatalogsProductGroupMultipleCountriesCriteria,
    "CatalogsProductGroupMultipleGenderCriteria": CatalogsProductGroupMultipleGenderCriteria,
    "CatalogsProductGroupMultipleStringCriteria": CatalogsProductGroupMultipleStringCriteria,
    "CatalogsProductGroupMultipleStringListCriteria": CatalogsProductGroupMultipleStringListCriteria,
    "CatalogsProductGroupPinsList200Response": CatalogsProductGroupPinsList200Response,
    "CatalogsProductGroupPricingCriteria": CatalogsProductGroupPricingCriteria,
    "CatalogsProductGroupPricingCurrencyCriteria": CatalogsProductGroupPricingCurrencyCriteria,
    "CatalogsProductGroupProductCounts": CatalogsProductGroupProductCounts,
    "CatalogsProductGroupUpdateRequest": CatalogsProductGroupUpdateRequest,
    "CatalogsProductGroupsCreate201Response": CatalogsProductGroupsCreate201Response,
    "CatalogsProductGroupsCreateRequest": CatalogsProductGroupsCreateRequest,
    "CatalogsProductGroupsList200Response": CatalogsProductGroupsList200Response,
    "CatalogsProductGroupsList200ResponseAllOfItemsInner": CatalogsProductGroupsList200ResponseAllOfItemsInner,
    "CatalogsProductGroupsUpdateRequest": CatalogsProductGroupsUpdateRequest,
    "CatalogsProductMetadata": CatalogsProductMetadata,
    "CatalogsRetailBatchRequest": CatalogsRetailBatchRequest,
    "CatalogsRetailBatchRequestItemsInner": CatalogsRetailBatchRequestItemsInner,
    "CatalogsRetailFeed": CatalogsRetailFeed,
    "CatalogsRetailFeedsCreateRequest": CatalogsRetailFeedsCreateRequest,
    "CatalogsRetailFeedsUpdateRequest": CatalogsRetailFeedsUpdateRequest,
    "CatalogsRetailItemErrorResponse": CatalogsRetailItemErrorResponse,
    "CatalogsRetailItemResponse": CatalogsRetailItemResponse,
    "CatalogsRetailItemsBatch": CatalogsRetailItemsBatch,
    "CatalogsRetailItemsFilter": CatalogsRetailItemsFilter,
    "CatalogsRetailProductGroup": CatalogsRetailProductGroup,
    "CatalogsUpdatableHotelAttributes": CatalogsUpdatableHotelAttributes,
    "CatalogsUpdateHotelItem": CatalogsUpdateHotelItem,
    "CatalogsUpdateRetailItem": CatalogsUpdateRetailItem,
    "CatalogsUpsertHotelItem": CatalogsUpsertHotelItem,
    "CatalogsUpsertRetailItem": CatalogsUpsertRetailItem,
    "CatalogsVerticalBatchRequest": CatalogsVerticalBatchRequest,
    "CatalogsVerticalFeedsCreateRequest": CatalogsVerticalFeedsCreateRequest,
    "CatalogsVerticalFeedsUpdateRequest": CatalogsVerticalFeedsUpdateRequest,
    "CatalogsVerticalProductGroup": CatalogsVerticalProductGroup,
    "CatalogsVerticalProductGroupCreateRequest": CatalogsVerticalProductGroupCreateRequest,
    "CatalogsVerticalProductGroupUpdateRequest": CatalogsVerticalProductGroupUpdateRequest,
    "ConditionFilter": ConditionFilter,
    "ConversionApiResponse": ConversionApiResponse,
    "ConversionApiResponseEventsInner": ConversionApiResponseEventsInner,
    "ConversionEventResponse": ConversionEventResponse,
    "ConversionEvents": ConversionEvents,
    "ConversionEventsDataInner": ConversionEventsDataInner,
    "ConversionEventsDataInnerCustomData": ConversionEventsDataInnerCustomData,
    "ConversionEventsDataInnerCustomDataContentsInner": ConversionEventsDataInnerCustomDataContentsInner,
    "ConversionEventsUserData": ConversionEventsUserData,
    "ConversionTagCommon": ConversionTagCommon,
    "ConversionTagConfigs": ConversionTagConfigs,
    "ConversionTagCreate": ConversionTagCreate,
    "ConversionTagListResponse": ConversionTagListResponse,
    "ConversionTagResponse": ConversionTagResponse,
    "CountryFilter": CountryFilter,
    "CreateMMMReportRequest": CreateMMMReportRequest,
    "CreateMMMReportResponse": CreateMMMReportResponse,
    "CreateMMMReportResponseData": CreateMMMReportResponseData,
    "CurrencyFilter": CurrencyFilter,
    "CustomLabel0Filter": CustomLabel0Filter,
    "CustomLabel1Filter": CustomLabel1Filter,
    "CustomLabel2Filter": CustomLabel2Filter,
    "CustomLabel3Filter": CustomLabel3Filter,
    "CustomLabel4Filter": CustomLabel4Filter,
    "CustomerList": CustomerList,
    "CustomerListRequest": CustomerListRequest,
    "CustomerListUpdateRequest": CustomerListUpdateRequest,
    "CustomerListsList200Response": CustomerListsList200Response,
    "DeliveryMetricsResponse": DeliveryMetricsResponse,
    "DeliveryMetricsResponseItemsInner": DeliveryMetricsResponseItemsInner,
    "DetailedError": DetailedError,
    "Exception": Exception,
    "FeedProcessingResultsList200Response": FeedProcessingResultsList200Response,
    "FeedsCreateRequest": FeedsCreateRequest,
    "FeedsList200Response": FeedsList200Response,
    "FeedsUpdateRequest": FeedsUpdateRequest,
    "FollowUserRequest": FollowUserRequest,
    "FollowersList200Response": FollowersList200Response,
    "GenderFilter": GenderFilter,
    "GetMMMReportResponse": GetMMMReportResponse,
    "GetMMMReportResponseData": GetMMMReportResponseData,
    "GoogleProductCategory0Filter": GoogleProductCategory0Filter,
    "GoogleProductCategory1Filter": GoogleProductCategory1Filter,
    "GoogleProductCategory2Filter": GoogleProductCategory2Filter,
    "GoogleProductCategory3Filter": GoogleProductCategory3Filter,
    "GoogleProductCategory4Filter": GoogleProductCategory4Filter,
    "GoogleProductCategory5Filter": GoogleProductCategory5Filter,
    "GoogleProductCategory6Filter": GoogleProductCategory6Filter,
    "HotelIdFilter": HotelIdFilter,
    "HotelProcessingRecord": HotelProcessingRecord,
    "ImageDetails": ImageDetails,
    "ImageMetadata": ImageMetadata,
    "ImageMetadataImages": ImageMetadataImages,
    "IntegrationLog": IntegrationLog,
    "IntegrationLogClientError": IntegrationLogClientError,
    "IntegrationLogClientRequest": IntegrationLogClientRequest,
    "IntegrationLogsInvalidLogResponse": IntegrationLogsInvalidLogResponse,
    "IntegrationLogsInvalidLogResponseRejectedLogsInner": IntegrationLogsInvalidLogResponseRejectedLogsInner,
    "IntegrationLogsRequest": IntegrationLogsRequest,
    "IntegrationLogsSuccessResponse": IntegrationLogsSuccessResponse,
    "IntegrationMetadata": IntegrationMetadata,
    "IntegrationRecord": IntegrationRecord,
    "IntegrationRequest": IntegrationRequest,
    "IntegrationRequestPatch": IntegrationRequestPatch,
    "IntegrationsGetList200Response": IntegrationsGetList200Response,
    "Interest": Interest,
    "ItemAttributes": ItemAttributes,
    "ItemBatchRecord": ItemBatchRecord,
    "ItemCreateBatchRecord": ItemCreateBatchRecord,
    "ItemDeleteBatchRecord": ItemDeleteBatchRecord,
    "ItemDeleteDiscontinuedBatchRecord": ItemDeleteDiscontinuedBatchRecord,
    "ItemGroupIdFilter": ItemGroupIdFilter,
    "ItemIdFilter": ItemIdFilter,
    "ItemProcessingRecord": ItemProcessingRecord,
    "ItemResponse": ItemResponse,
    "ItemResponseAnyOf": ItemResponseAnyOf,
    "ItemResponseAnyOf1": ItemResponseAnyOf1,
    "ItemUpdateBatchRecord": ItemUpdateBatchRecord,
    "ItemUpsertBatchRecord": ItemUpsertBatchRecord,
    "ItemValidationEvent": ItemValidationEvent,
    "ItemsBatchPostRequest": ItemsBatchPostRequest,
    "ItemsIssuesList200Response": ItemsIssuesList200Response,
    "Keyword": Keyword,
    "KeywordError": KeywordError,
    "KeywordMetrics": KeywordMetrics,
    "KeywordMetricsResponse": KeywordMetricsResponse,
    "KeywordUpdate": KeywordUpdate,
    "KeywordUpdateBody": KeywordUpdateBody,
    "KeywordsCommon": KeywordsCommon,
    "KeywordsGet200Response": KeywordsGet200Response,
    "KeywordsMetricsArrayResponse": KeywordsMetricsArrayResponse,
    "KeywordsRequest": KeywordsRequest,
    "KeywordsResponse": KeywordsResponse,
    "LeadFormCommon": LeadFormCommon,
    "LeadFormQuestion": LeadFormQuestion,
    "LeadFormResponse": LeadFormResponse,
    "LeadFormTestRequest": LeadFormTestRequest,
    "LeadFormTestResponse": LeadFormTestResponse,
    "LeadFormsList200Response": LeadFormsList200Response,
    "LineItem": LineItem,
    "LinkedBusiness": LinkedBusiness,
    "MaxPriceFilter": MaxPriceFilter,
    "MediaList200Response": MediaList200Response,
    "MediaUpload": MediaUpload,
    "MediaUploadAllOfUploadParameters": MediaUploadAllOfUploadParameters,
    "MediaUploadDetails": MediaUploadDetails,
    "MediaUploadRequest": MediaUploadRequest,
    "MetricsResponse": MetricsResponse,
    "MinPriceFilter": MinPriceFilter,
    "ModelError": ModelError,
    "OauthAccessTokenRequestCode": OauthAccessTokenRequestCode,
    "OauthAccessTokenRequestRefresh": OauthAccessTokenRequestRefresh,
    "OauthAccessTokenResponse": OauthAccessTokenResponse,
    "OauthAccessTokenResponseCode": OauthAccessTokenResponseCode,
    "OauthAccessTokenResponseEverlastingRefresh": OauthAccessTokenResponseEverlastingRefresh,
    "OauthAccessTokenResponseIntegrationRefresh": OauthAccessTokenResponseIntegrationRefresh,
    "OauthAccessTokenResponseRefresh": OauthAccessTokenResponseRefresh,
    "OptimizationGoalMetadata": OptimizationGoalMetadata,
    "OptimizationGoalMetadataConversionTagV3GoalMetadata": OptimizationGoalMetadataConversionTagV3GoalMetadata,
    "OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows": OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows,
    "OptimizationGoalMetadataFrequencyGoalMetadata": OptimizationGoalMetadataFrequencyGoalMetadata,
    "OptimizationGoalMetadataScrollupGoalMetadata": OptimizationGoalMetadataScrollupGoalMetadata,
    "OrderLine": OrderLine,
    "OrderLineError": OrderLineError,
    "OrderLineResponse": OrderLineResponse,
    "OrderLineSingleResponse": OrderLineSingleResponse,
    "OrderLines": OrderLines,
    "OrderLinesArrayResponse": OrderLinesArrayResponse,
    "OrderLinesList200Response": OrderLinesList200Response,
    "PageVisitConversionTagsGet200Response": PageVisitConversionTagsGet200Response,
    "Paginated": Paginated,
    "Pin": Pin,
    "PinAnalyticsMetricsResponse": PinAnalyticsMetricsResponse,
    "PinAnalyticsMetricsResponseDailyMetricsInner": PinAnalyticsMetricsResponseDailyMetricsInner,
    "PinCreate": PinCreate,
    "PinMedia": PinMedia,
    "PinMediaMetadata": PinMediaMetadata,
    "PinMediaSource": PinMediaSource,
    "PinMediaSourceImageBase64": PinMediaSourceImageBase64,
    "PinMediaSourceImageURL": PinMediaSourceImageURL,
    "PinMediaSourceImagesBase64": PinMediaSourceImagesBase64,
    "PinMediaSourceImagesBase64ItemsInner": PinMediaSourceImagesBase64ItemsInner,
    "PinMediaSourceImagesURL": PinMediaSourceImagesURL,
    "PinMediaSourceImagesURLItemsInner": PinMediaSourceImagesURLItemsInner,
    "PinMediaSourcePinURL": PinMediaSourcePinURL,
    "PinMediaSourceVideoID": PinMediaSourceVideoID,
    "PinMediaWithImage": PinMediaWithImage,
    "PinMediaWithImageAndVideo": PinMediaWithImageAndVideo,
    "PinMediaWithImages": PinMediaWithImages,
    "PinMediaWithVideo": PinMediaWithVideo,
    "PinMediaWithVideos": PinMediaWithVideos,
    "PinUpdate": PinUpdate,
    "PinUpdateCarouselSlotsInner": PinUpdateCarouselSlotsInner,
    "PinsAnalyticsMetricTypesParameterInner": PinsAnalyticsMetricTypesParameterInner,
    "PinsList200Response": PinsList200Response,
    "PinsSaveRequest": PinsSaveRequest,
    "PinterestTagEventData": PinterestTagEventData,
    "PriceFilter": PriceFilter,
    "ProductGroupAnalyticsResponseInner": ProductGroupAnalyticsResponseInner,
    "ProductGroupPromotion": ProductGroupPromotion,
    "ProductGroupPromotionCreateRequest": ProductGroupPromotionCreateRequest,
    "ProductGroupPromotionResponse": ProductGroupPromotionResponse,
    "ProductGroupPromotionResponseItem": ProductGroupPromotionResponseItem,
    "ProductGroupPromotionUpdateRequest": ProductGroupPromotionUpdateRequest,
    "ProductGroupPromotionsList200Response": ProductGroupPromotionsList200Response,
    "ProductType0Filter": ProductType0Filter,
    "ProductType1Filter": ProductType1Filter,
    "ProductType2Filter": ProductType2Filter,
    "ProductType3Filter": ProductType3Filter,
    "ProductType4Filter": ProductType4Filter,
    "QuizPinData": QuizPinData,
    "QuizPinOption": QuizPinOption,
    "QuizPinQuestion": QuizPinQuestion,
    "QuizPinResult": QuizPinResult,
    "RelatedTerms": RelatedTerms,
    "RelatedTermsRelatedTermsListInner": RelatedTermsRelatedTermsListInner,
    "SSIOAccountAddress": SSIOAccountAddress,
    "SSIOAccountItem": SSIOAccountItem,
    "SSIOAccountPMPName": SSIOAccountPMPName,
    "SSIOAccountResponse": SSIOAccountResponse,
    "SSIOCreateInsertionOrderRequest": SSIOCreateInsertionOrderRequest,
    "SSIOCreateInsertionOrderResponse": SSIOCreateInsertionOrderResponse,
    "SSIOEditInsertionOrderRequest": SSIOEditInsertionOrderRequest,
    "SSIOEditInsertionOrderResponse": SSIOEditInsertionOrderResponse,
    "SSIOInsertionOrderCommon": SSIOInsertionOrderCommon,
    "SSIOInsertionOrderStatus": SSIOInsertionOrderStatus,
    "SSIOInsertionOrderStatusResponse": SSIOInsertionOrderStatusResponse,
    "SSIOOrderLine": SSIOOrderLine,
    "SearchPartnerPins200Response": SearchPartnerPins200Response,
    "SearchUserBoardsGet200Response": SearchUserBoardsGet200Response,
    "SingleInterestTargetingOptionResponse": SingleInterestTargetingOptionResponse,
    "SsioInsertionOrdersStatusGetByAdAccount200Response": SsioInsertionOrdersStatusGetByAdAccount200Response,
    "SsioOrderLinesGetByAdAccount200Response": SsioOrderLinesGetByAdAccount200Response,
    "SummaryPin": SummaryPin,
    "SummaryPinMedia": SummaryPinMedia,
    "TargetingSpec": TargetingSpec,
    "TargetingSpecSHOPPINGRETARGETING": TargetingSpecSHOPPINGRETARGETING,
    "TargetingTypeFilter": TargetingTypeFilter,
    "TemplateResponse": TemplateResponse,
    "TemplateResponseDateRange": TemplateResponseDateRange,
    "TemplateResponseDateRangeAbsoluteDateRange": TemplateResponseDateRangeAbsoluteDateRange,
    "TemplateResponseDateRangeDynamicDateRange": TemplateResponseDateRangeDynamicDateRange,
    "TemplateResponseDateRangeRelativeDateRange": TemplateResponseDateRangeRelativeDateRange,
    "TemplatesList200Response": TemplatesList200Response,
    "TermsOfService": TermsOfService,
    "TopPinsAnalyticsResponse": TopPinsAnalyticsResponse,
    "TopPinsAnalyticsResponseDateAvailability": TopPinsAnalyticsResponseDateAvailability,
    "TopPinsAnalyticsResponsePinsInner": TopPinsAnalyticsResponsePinsInner,
    "TopVideoPinsAnalyticsResponse": TopVideoPinsAnalyticsResponse,
    "TopVideoPinsAnalyticsResponsePinsInner": TopVideoPinsAnalyticsResponsePinsInner,
    "TrackingUrls": TrackingUrls,
    "TrendingKeywordsResponse": TrendingKeywordsResponse,
    "TrendingKeywordsResponseTrendsInner": TrendingKeywordsResponseTrendsInner,
    "TrendingKeywordsResponseTrendsInnerTimeSeries": TrendingKeywordsResponseTrendsInnerTimeSeries,
    "UpdatableItemAttributes": UpdatableItemAttributes,
    "UserAccountFollowedInterests200Response": UserAccountFollowedInterests200Response,
    "UserFollowingGet200Response": UserFollowingGet200Response,
    "UserSummary": UserSummary,
    "UserWebsiteSummary": UserWebsiteSummary,
    "UserWebsiteVerificationCode": UserWebsiteVerificationCode,
    "UserWebsiteVerifyRequest": UserWebsiteVerifyRequest,
    "UserWebsitesGet200Response": UserWebsitesGet200Response,
    "VideoMetadata": VideoMetadata,
}

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap[expectedType]) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.serialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return data.toISOString();
        } else {
            if (enumsMap[type]) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }

            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.deserialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap[type]) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type);
            }
            return instance;
        }
    }
}

export interface Authentication {
    /**
    * Apply authentication settings to header and query params.
    */
    applyToRequest(requestOptions: localVarRequest.Options): Promise<void> | void;
}

export class HttpBasicAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        requestOptions.auth = {
            username: this.username, password: this.password
        }
    }
}

export class HttpBearerAuth implements Authentication {
    public accessToken: string | (() => string) = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            const accessToken = typeof this.accessToken === 'function'
                            ? this.accessToken()
                            : this.accessToken;
            requestOptions.headers["Authorization"] = "Bearer " + accessToken;
        }
    }
}

export class ApiKeyAuth implements Authentication {
    public apiKey: string = '';

    constructor(private location: string, private paramName: string) {
    }

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (this.location == "query") {
            (<any>requestOptions.qs)[this.paramName] = this.apiKey;
        } else if (this.location == "header" && requestOptions && requestOptions.headers) {
            requestOptions.headers[this.paramName] = this.apiKey;
        } else if (this.location == 'cookie' && requestOptions && requestOptions.headers) {
            if (requestOptions.headers['Cookie']) {
                requestOptions.headers['Cookie'] += '; ' + this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
            else {
                requestOptions.headers['Cookie'] = this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
        }
    }
}

export class OAuth implements Authentication {
    public accessToken: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            requestOptions.headers["Authorization"] = "Bearer " + this.accessToken;
        }
    }
}

export class VoidAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(_: localVarRequest.Options): void {
        // Do nothing
    }
}

export type Interceptor = (requestOptions: localVarRequest.Options) => (Promise<void> | void);
