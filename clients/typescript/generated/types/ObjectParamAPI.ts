import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'

import { Account } from '../models/Account';
import { ActionType } from '../models/ActionType';
import { AdAccount } from '../models/AdAccount';
import { AdAccountAnalyticsResponseInner } from '../models/AdAccountAnalyticsResponseInner';
import { AdAccountCreateRequest } from '../models/AdAccountCreateRequest';
import { AdAccountCreateSubscriptionRequest } from '../models/AdAccountCreateSubscriptionRequest';
import { AdAccountCreateSubscriptionResponse } from '../models/AdAccountCreateSubscriptionResponse';
import { AdAccountGetSubscriptionResponse } from '../models/AdAccountGetSubscriptionResponse';
import { AdAccountOwner } from '../models/AdAccountOwner';
import { AdAccountsCatalogsProductGroupsList200Response } from '../models/AdAccountsCatalogsProductGroupsList200Response';
import { AdAccountsCountryResponse } from '../models/AdAccountsCountryResponse';
import { AdAccountsCountryResponseData } from '../models/AdAccountsCountryResponseData';
import { AdAccountsList200Response } from '../models/AdAccountsList200Response';
import { AdAccountsSubscriptionsGetList200Response } from '../models/AdAccountsSubscriptionsGetList200Response';
import { AdArrayResponse } from '../models/AdArrayResponse';
import { AdArrayResponseElement } from '../models/AdArrayResponseElement';
import { AdCommon } from '../models/AdCommon';
import { AdCommonQuizPinData } from '../models/AdCommonQuizPinData';
import { AdCommonTrackingUrls } from '../models/AdCommonTrackingUrls';
import { AdCountry } from '../models/AdCountry';
import { AdCreateRequest } from '../models/AdCreateRequest';
import { AdGroupArrayResponse } from '../models/AdGroupArrayResponse';
import { AdGroupArrayResponseElement } from '../models/AdGroupArrayResponseElement';
import { AdGroupAudienceSizingRequest } from '../models/AdGroupAudienceSizingRequest';
import { AdGroupAudienceSizingRequestKeywordsInner } from '../models/AdGroupAudienceSizingRequestKeywordsInner';
import { AdGroupAudienceSizingResponse } from '../models/AdGroupAudienceSizingResponse';
import { AdGroupCommon } from '../models/AdGroupCommon';
import { AdGroupCommonOptimizationGoalMetadata } from '../models/AdGroupCommonOptimizationGoalMetadata';
import { AdGroupCommonTrackingUrls } from '../models/AdGroupCommonTrackingUrls';
import { AdGroupCreateRequest } from '../models/AdGroupCreateRequest';
import { AdGroupResponse } from '../models/AdGroupResponse';
import { AdGroupSummaryStatus } from '../models/AdGroupSummaryStatus';
import { AdGroupUpdateRequest } from '../models/AdGroupUpdateRequest';
import { AdGroupsAnalyticsResponseInner } from '../models/AdGroupsAnalyticsResponseInner';
import { AdGroupsList200Response } from '../models/AdGroupsList200Response';
import { AdPinId } from '../models/AdPinId';
import { AdPreviewCreateFromImage } from '../models/AdPreviewCreateFromImage';
import { AdPreviewCreateFromPin } from '../models/AdPreviewCreateFromPin';
import { AdPreviewRequest } from '../models/AdPreviewRequest';
import { AdPreviewURLResponse } from '../models/AdPreviewURLResponse';
import { AdResponse } from '../models/AdResponse';
import { AdUpdateRequest } from '../models/AdUpdateRequest';
import { AdsAnalyticsCreateAsyncRequest } from '../models/AdsAnalyticsCreateAsyncRequest';
import { AdsAnalyticsCreateAsyncResponse } from '../models/AdsAnalyticsCreateAsyncResponse';
import { AdsAnalyticsFilterColumn } from '../models/AdsAnalyticsFilterColumn';
import { AdsAnalyticsFilterOperator } from '../models/AdsAnalyticsFilterOperator';
import { AdsAnalyticsGetAsyncResponse } from '../models/AdsAnalyticsGetAsyncResponse';
import { AdsAnalyticsMetricsFilter } from '../models/AdsAnalyticsMetricsFilter';
import { AdsAnalyticsResponseInner } from '../models/AdsAnalyticsResponseInner';
import { AdsAnalyticsTargetingType } from '../models/AdsAnalyticsTargetingType';
import { AdsCreditDiscountsResponse } from '../models/AdsCreditDiscountsResponse';
import { AdsCreditRedeemRequest } from '../models/AdsCreditRedeemRequest';
import { AdsCreditRedeemResponse } from '../models/AdsCreditRedeemResponse';
import { AdsCreditsDiscountsGet200Response } from '../models/AdsCreditsDiscountsGet200Response';
import { AdsList200Response } from '../models/AdsList200Response';
import { AnalyticsDailyMetrics } from '../models/AnalyticsDailyMetrics';
import { AnalyticsMetricsResponse } from '../models/AnalyticsMetricsResponse';
import { Audience } from '../models/Audience';
import { AudienceCategory } from '../models/AudienceCategory';
import { AudienceCommon } from '../models/AudienceCommon';
import { AudienceCreateCustomRequest } from '../models/AudienceCreateCustomRequest';
import { AudienceCreateRequest } from '../models/AudienceCreateRequest';
import { AudienceCreateRequest1AudienceType } from '../models/AudienceCreateRequest1AudienceType';
import { AudienceDataParty } from '../models/AudienceDataParty';
import { AudienceDefinition } from '../models/AudienceDefinition';
import { AudienceDefinitionResponse } from '../models/AudienceDefinitionResponse';
import { AudienceDemographicValue } from '../models/AudienceDemographicValue';
import { AudienceDemographics } from '../models/AudienceDemographics';
import { AudienceInsightCategoryArrayResponse } from '../models/AudienceInsightCategoryArrayResponse';
import { AudienceInsightCategoryCommon } from '../models/AudienceInsightCategoryCommon';
import { AudienceInsightType } from '../models/AudienceInsightType';
import { AudienceInsightsResponse } from '../models/AudienceInsightsResponse';
import { AudienceRule } from '../models/AudienceRule';
import { AudienceSharingType } from '../models/AudienceSharingType';
import { AudienceSubcategory } from '../models/AudienceSubcategory';
import { AudienceType } from '../models/AudienceType';
import { AudienceUpdateOperationType } from '../models/AudienceUpdateOperationType';
import { AudienceUpdateRequest } from '../models/AudienceUpdateRequest';
import { AudiencesList200Response } from '../models/AudiencesList200Response';
import { AvailabilityFilter } from '../models/AvailabilityFilter';
import { BatchOperation } from '../models/BatchOperation';
import { BatchOperationStatus } from '../models/BatchOperationStatus';
import { BidFloor } from '../models/BidFloor';
import { BidFloorRequest } from '../models/BidFloorRequest';
import { BidFloorSpec } from '../models/BidFloorSpec';
import { BillingProfilesGet200Response } from '../models/BillingProfilesGet200Response';
import { BillingProfilesResponse } from '../models/BillingProfilesResponse';
import { Board } from '../models/Board';
import { BoardMedia } from '../models/BoardMedia';
import { BoardOwner } from '../models/BoardOwner';
import { BoardSection } from '../models/BoardSection';
import { BoardSectionsList200Response } from '../models/BoardSectionsList200Response';
import { BoardUpdate } from '../models/BoardUpdate';
import { BoardsList200Response } from '../models/BoardsList200Response';
import { BoardsListPins200Response } from '../models/BoardsListPins200Response';
import { BoardsUserFollowsList200Response } from '../models/BoardsUserFollowsList200Response';
import { BookClosedResponse } from '../models/BookClosedResponse';
import { BrandFilter } from '../models/BrandFilter';
import { BudgetType } from '../models/BudgetType';
import { BulkDownloadRequest } from '../models/BulkDownloadRequest';
import { BulkDownloadRequestCampaignFilter } from '../models/BulkDownloadRequestCampaignFilter';
import { BulkDownloadResponse } from '../models/BulkDownloadResponse';
import { BulkEntityType } from '../models/BulkEntityType';
import { BulkOutputFormat } from '../models/BulkOutputFormat';
import { BulkReportingJobStatus } from '../models/BulkReportingJobStatus';
import { BulkUpsertRequest } from '../models/BulkUpsertRequest';
import { BulkUpsertRequestCreate } from '../models/BulkUpsertRequestCreate';
import { BulkUpsertRequestUpdate } from '../models/BulkUpsertRequestUpdate';
import { BulkUpsertResponse } from '../models/BulkUpsertResponse';
import { BulkUpsertStatus } from '../models/BulkUpsertStatus';
import { BulkUpsertStatusResponse } from '../models/BulkUpsertStatusResponse';
import { BusinessAccessRole } from '../models/BusinessAccessRole';
import { CampaignCommon } from '../models/CampaignCommon';
import { CampaignCreateCommon } from '../models/CampaignCreateCommon';
import { CampaignCreateRequest } from '../models/CampaignCreateRequest';
import { CampaignCreateResponse } from '../models/CampaignCreateResponse';
import { CampaignCreateResponseData } from '../models/CampaignCreateResponseData';
import { CampaignCreateResponseItem } from '../models/CampaignCreateResponseItem';
import { CampaignId } from '../models/CampaignId';
import { CampaignResponse } from '../models/CampaignResponse';
import { CampaignSummaryStatus } from '../models/CampaignSummaryStatus';
import { CampaignUpdateRequest } from '../models/CampaignUpdateRequest';
import { CampaignUpdateResponse } from '../models/CampaignUpdateResponse';
import { CampaignsAnalyticsResponseInner } from '../models/CampaignsAnalyticsResponseInner';
import { CampaignsList200Response } from '../models/CampaignsList200Response';
import { Catalog } from '../models/Catalog';
import { CatalogProductGroup } from '../models/CatalogProductGroup';
import { CatalogsCreateHotelItem } from '../models/CatalogsCreateHotelItem';
import { CatalogsCreateRetailItem } from '../models/CatalogsCreateRetailItem';
import { CatalogsDbItem } from '../models/CatalogsDbItem';
import { CatalogsDeleteHotelItem } from '../models/CatalogsDeleteHotelItem';
import { CatalogsDeleteRetailItem } from '../models/CatalogsDeleteRetailItem';
import { CatalogsFeed } from '../models/CatalogsFeed';
import { CatalogsFeedCredentials } from '../models/CatalogsFeedCredentials';
import { CatalogsFeedIngestionDetails } from '../models/CatalogsFeedIngestionDetails';
import { CatalogsFeedIngestionErrors } from '../models/CatalogsFeedIngestionErrors';
import { CatalogsFeedIngestionInfo } from '../models/CatalogsFeedIngestionInfo';
import { CatalogsFeedIngestionWarnings } from '../models/CatalogsFeedIngestionWarnings';
import { CatalogsFeedProcessingResult } from '../models/CatalogsFeedProcessingResult';
import { CatalogsFeedProcessingSchedule } from '../models/CatalogsFeedProcessingSchedule';
import { CatalogsFeedProcessingStatus } from '../models/CatalogsFeedProcessingStatus';
import { CatalogsFeedProductCounts } from '../models/CatalogsFeedProductCounts';
import { CatalogsFeedValidationDetails } from '../models/CatalogsFeedValidationDetails';
import { CatalogsFeedValidationErrors } from '../models/CatalogsFeedValidationErrors';
import { CatalogsFeedValidationWarnings } from '../models/CatalogsFeedValidationWarnings';
import { CatalogsFeedsCreateRequest } from '../models/CatalogsFeedsCreateRequest';
import { CatalogsFeedsCreateRequestDefaultLocale } from '../models/CatalogsFeedsCreateRequestDefaultLocale';
import { CatalogsFeedsUpdateRequest } from '../models/CatalogsFeedsUpdateRequest';
import { CatalogsFormat } from '../models/CatalogsFormat';
import { CatalogsHotelAddress } from '../models/CatalogsHotelAddress';
import { CatalogsHotelAttributes } from '../models/CatalogsHotelAttributes';
import { CatalogsHotelAttributesAllOfMainImage } from '../models/CatalogsHotelAttributesAllOfMainImage';
import { CatalogsHotelBatchItem } from '../models/CatalogsHotelBatchItem';
import { CatalogsHotelBatchRequest } from '../models/CatalogsHotelBatchRequest';
import { CatalogsHotelFeed } from '../models/CatalogsHotelFeed';
import { CatalogsHotelFeedsCreateRequest } from '../models/CatalogsHotelFeedsCreateRequest';
import { CatalogsHotelFeedsUpdateRequest } from '../models/CatalogsHotelFeedsUpdateRequest';
import { CatalogsHotelGuestRatings } from '../models/CatalogsHotelGuestRatings';
import { CatalogsHotelItemErrorResponse } from '../models/CatalogsHotelItemErrorResponse';
import { CatalogsHotelItemResponse } from '../models/CatalogsHotelItemResponse';
import { CatalogsHotelItemsBatch } from '../models/CatalogsHotelItemsBatch';
import { CatalogsHotelItemsFilter } from '../models/CatalogsHotelItemsFilter';
import { CatalogsHotelProductGroup } from '../models/CatalogsHotelProductGroup';
import { CatalogsHotelProductGroupCreateRequest } from '../models/CatalogsHotelProductGroupCreateRequest';
import { CatalogsHotelProductGroupFilterKeys } from '../models/CatalogsHotelProductGroupFilterKeys';
import { CatalogsHotelProductGroupFilters } from '../models/CatalogsHotelProductGroupFilters';
import { CatalogsHotelProductGroupFiltersAllOf } from '../models/CatalogsHotelProductGroupFiltersAllOf';
import { CatalogsHotelProductGroupFiltersAnyOf } from '../models/CatalogsHotelProductGroupFiltersAnyOf';
import { CatalogsHotelProductGroupUpdateRequest } from '../models/CatalogsHotelProductGroupUpdateRequest';
import { CatalogsItemValidationDetails } from '../models/CatalogsItemValidationDetails';
import { CatalogsItemValidationErrors } from '../models/CatalogsItemValidationErrors';
import { CatalogsItemValidationIssue } from '../models/CatalogsItemValidationIssue';
import { CatalogsItemValidationIssues } from '../models/CatalogsItemValidationIssues';
import { CatalogsItemValidationWarnings } from '../models/CatalogsItemValidationWarnings';
import { CatalogsItems } from '../models/CatalogsItems';
import { CatalogsItemsBatch } from '../models/CatalogsItemsBatch';
import { CatalogsItemsBatchRequest } from '../models/CatalogsItemsBatchRequest';
import { CatalogsItemsCreateBatchRequest } from '../models/CatalogsItemsCreateBatchRequest';
import { CatalogsItemsDeleteBatchRequest } from '../models/CatalogsItemsDeleteBatchRequest';
import { CatalogsItemsDeleteDiscontinuedBatchRequest } from '../models/CatalogsItemsDeleteDiscontinuedBatchRequest';
import { CatalogsItemsFilters } from '../models/CatalogsItemsFilters';
import { CatalogsItemsUpdateBatchRequest } from '../models/CatalogsItemsUpdateBatchRequest';
import { CatalogsItemsUpsertBatchRequest } from '../models/CatalogsItemsUpsertBatchRequest';
import { CatalogsList200Response } from '../models/CatalogsList200Response';
import { CatalogsListProductsByFilterRequest } from '../models/CatalogsListProductsByFilterRequest';
import { CatalogsListProductsByFilterRequestOneOf } from '../models/CatalogsListProductsByFilterRequestOneOf';
import { CatalogsLocale } from '../models/CatalogsLocale';
import { CatalogsProduct } from '../models/CatalogsProduct';
import { CatalogsProductGroup } from '../models/CatalogsProductGroup';
import { CatalogsProductGroupCreateRequest } from '../models/CatalogsProductGroupCreateRequest';
import { CatalogsProductGroupCurrencyCriteria } from '../models/CatalogsProductGroupCurrencyCriteria';
import { CatalogsProductGroupFilterKeys } from '../models/CatalogsProductGroupFilterKeys';
import { CatalogsProductGroupFilters } from '../models/CatalogsProductGroupFilters';
import { CatalogsProductGroupFiltersAllOf } from '../models/CatalogsProductGroupFiltersAllOf';
import { CatalogsProductGroupFiltersAnyOf } from '../models/CatalogsProductGroupFiltersAnyOf';
import { CatalogsProductGroupFiltersRequest } from '../models/CatalogsProductGroupFiltersRequest';
import { CatalogsProductGroupFiltersRequestAnyOf } from '../models/CatalogsProductGroupFiltersRequestAnyOf';
import { CatalogsProductGroupFiltersRequestAnyOf1 } from '../models/CatalogsProductGroupFiltersRequestAnyOf1';
import { CatalogsProductGroupMultipleCountriesCriteria } from '../models/CatalogsProductGroupMultipleCountriesCriteria';
import { CatalogsProductGroupMultipleGenderCriteria } from '../models/CatalogsProductGroupMultipleGenderCriteria';
import { CatalogsProductGroupMultipleStringCriteria } from '../models/CatalogsProductGroupMultipleStringCriteria';
import { CatalogsProductGroupMultipleStringListCriteria } from '../models/CatalogsProductGroupMultipleStringListCriteria';
import { CatalogsProductGroupPinsList200Response } from '../models/CatalogsProductGroupPinsList200Response';
import { CatalogsProductGroupPricingCriteria } from '../models/CatalogsProductGroupPricingCriteria';
import { CatalogsProductGroupPricingCurrencyCriteria } from '../models/CatalogsProductGroupPricingCurrencyCriteria';
import { CatalogsProductGroupProductCounts } from '../models/CatalogsProductGroupProductCounts';
import { CatalogsProductGroupStatus } from '../models/CatalogsProductGroupStatus';
import { CatalogsProductGroupType } from '../models/CatalogsProductGroupType';
import { CatalogsProductGroupUpdateRequest } from '../models/CatalogsProductGroupUpdateRequest';
import { CatalogsProductGroupsCreate201Response } from '../models/CatalogsProductGroupsCreate201Response';
import { CatalogsProductGroupsCreateRequest } from '../models/CatalogsProductGroupsCreateRequest';
import { CatalogsProductGroupsList200Response } from '../models/CatalogsProductGroupsList200Response';
import { CatalogsProductGroupsList200ResponseAllOfItemsInner } from '../models/CatalogsProductGroupsList200ResponseAllOfItemsInner';
import { CatalogsProductGroupsUpdateRequest } from '../models/CatalogsProductGroupsUpdateRequest';
import { CatalogsProductMetadata } from '../models/CatalogsProductMetadata';
import { CatalogsRetailBatchRequest } from '../models/CatalogsRetailBatchRequest';
import { CatalogsRetailBatchRequestItemsInner } from '../models/CatalogsRetailBatchRequestItemsInner';
import { CatalogsRetailFeed } from '../models/CatalogsRetailFeed';
import { CatalogsRetailFeedsCreateRequest } from '../models/CatalogsRetailFeedsCreateRequest';
import { CatalogsRetailFeedsUpdateRequest } from '../models/CatalogsRetailFeedsUpdateRequest';
import { CatalogsRetailItemErrorResponse } from '../models/CatalogsRetailItemErrorResponse';
import { CatalogsRetailItemResponse } from '../models/CatalogsRetailItemResponse';
import { CatalogsRetailItemsBatch } from '../models/CatalogsRetailItemsBatch';
import { CatalogsRetailItemsFilter } from '../models/CatalogsRetailItemsFilter';
import { CatalogsRetailProductGroup } from '../models/CatalogsRetailProductGroup';
import { CatalogsStatus } from '../models/CatalogsStatus';
import { CatalogsType } from '../models/CatalogsType';
import { CatalogsUpdatableHotelAttributes } from '../models/CatalogsUpdatableHotelAttributes';
import { CatalogsUpdateHotelItem } from '../models/CatalogsUpdateHotelItem';
import { CatalogsUpdateRetailItem } from '../models/CatalogsUpdateRetailItem';
import { CatalogsUpsertHotelItem } from '../models/CatalogsUpsertHotelItem';
import { CatalogsUpsertRetailItem } from '../models/CatalogsUpsertRetailItem';
import { CatalogsVerticalBatchRequest } from '../models/CatalogsVerticalBatchRequest';
import { CatalogsVerticalFeedsCreateRequest } from '../models/CatalogsVerticalFeedsCreateRequest';
import { CatalogsVerticalFeedsUpdateRequest } from '../models/CatalogsVerticalFeedsUpdateRequest';
import { CatalogsVerticalProductGroup } from '../models/CatalogsVerticalProductGroup';
import { CatalogsVerticalProductGroupCreateRequest } from '../models/CatalogsVerticalProductGroupCreateRequest';
import { CatalogsVerticalProductGroupUpdateRequest } from '../models/CatalogsVerticalProductGroupUpdateRequest';
import { ConditionFilter } from '../models/ConditionFilter';
import { ConversionApiResponse } from '../models/ConversionApiResponse';
import { ConversionApiResponseEventsInner } from '../models/ConversionApiResponseEventsInner';
import { ConversionAttributionWindowDays } from '../models/ConversionAttributionWindowDays';
import { ConversionEventResponse } from '../models/ConversionEventResponse';
import { ConversionEvents } from '../models/ConversionEvents';
import { ConversionEventsDataInner } from '../models/ConversionEventsDataInner';
import { ConversionEventsDataInnerCustomData } from '../models/ConversionEventsDataInnerCustomData';
import { ConversionEventsDataInnerCustomDataContentsInner } from '../models/ConversionEventsDataInnerCustomDataContentsInner';
import { ConversionEventsUserData } from '../models/ConversionEventsUserData';
import { ConversionReportAttributionType } from '../models/ConversionReportAttributionType';
import { ConversionReportTimeType } from '../models/ConversionReportTimeType';
import { ConversionTagCommon } from '../models/ConversionTagCommon';
import { ConversionTagConfigs } from '../models/ConversionTagConfigs';
import { ConversionTagCreate } from '../models/ConversionTagCreate';
import { ConversionTagListResponse } from '../models/ConversionTagListResponse';
import { ConversionTagResponse } from '../models/ConversionTagResponse';
import { ConversionTagType } from '../models/ConversionTagType';
import { Country } from '../models/Country';
import { CountryFilter } from '../models/CountryFilter';
import { CreateMMMReportRequest } from '../models/CreateMMMReportRequest';
import { CreateMMMReportResponse } from '../models/CreateMMMReportResponse';
import { CreateMMMReportResponseData } from '../models/CreateMMMReportResponseData';
import { CreativeType } from '../models/CreativeType';
import { Currency } from '../models/Currency';
import { CurrencyFilter } from '../models/CurrencyFilter';
import { CustomLabel0Filter } from '../models/CustomLabel0Filter';
import { CustomLabel1Filter } from '../models/CustomLabel1Filter';
import { CustomLabel2Filter } from '../models/CustomLabel2Filter';
import { CustomLabel3Filter } from '../models/CustomLabel3Filter';
import { CustomLabel4Filter } from '../models/CustomLabel4Filter';
import { CustomerList } from '../models/CustomerList';
import { CustomerListRequest } from '../models/CustomerListRequest';
import { CustomerListUpdateRequest } from '../models/CustomerListUpdateRequest';
import { CustomerListsList200Response } from '../models/CustomerListsList200Response';
import { DataOutputFormat } from '../models/DataOutputFormat';
import { DataStatus } from '../models/DataStatus';
import { DeliveryMetricsResponse } from '../models/DeliveryMetricsResponse';
import { DeliveryMetricsResponseItemsInner } from '../models/DeliveryMetricsResponseItemsInner';
import { DetailedError } from '../models/DetailedError';
import { EnhancedMatchStatusType } from '../models/EnhancedMatchStatusType';
import { EntityStatus } from '../models/EntityStatus';
import { Exception } from '../models/Exception';
import { FeedProcessingResultsList200Response } from '../models/FeedProcessingResultsList200Response';
import { FeedsCreateRequest } from '../models/FeedsCreateRequest';
import { FeedsList200Response } from '../models/FeedsList200Response';
import { FeedsUpdateRequest } from '../models/FeedsUpdateRequest';
import { FollowUserRequest } from '../models/FollowUserRequest';
import { FollowersList200Response } from '../models/FollowersList200Response';
import { Gender } from '../models/Gender';
import { GenderFilter } from '../models/GenderFilter';
import { GetAudiencesOrderBy } from '../models/GetAudiencesOrderBy';
import { GetMMMReportResponse } from '../models/GetMMMReportResponse';
import { GetMMMReportResponseData } from '../models/GetMMMReportResponseData';
import { GoogleProductCategory0Filter } from '../models/GoogleProductCategory0Filter';
import { GoogleProductCategory1Filter } from '../models/GoogleProductCategory1Filter';
import { GoogleProductCategory2Filter } from '../models/GoogleProductCategory2Filter';
import { GoogleProductCategory3Filter } from '../models/GoogleProductCategory3Filter';
import { GoogleProductCategory4Filter } from '../models/GoogleProductCategory4Filter';
import { GoogleProductCategory5Filter } from '../models/GoogleProductCategory5Filter';
import { GoogleProductCategory6Filter } from '../models/GoogleProductCategory6Filter';
import { Granularity } from '../models/Granularity';
import { GridClickType } from '../models/GridClickType';
import { HotelIdFilter } from '../models/HotelIdFilter';
import { HotelProcessingRecord } from '../models/HotelProcessingRecord';
import { ImageDetails } from '../models/ImageDetails';
import { ImageMetadata } from '../models/ImageMetadata';
import { ImageMetadataImages } from '../models/ImageMetadataImages';
import { IntegrationLog } from '../models/IntegrationLog';
import { IntegrationLogClientError } from '../models/IntegrationLogClientError';
import { IntegrationLogClientRequest } from '../models/IntegrationLogClientRequest';
import { IntegrationLogsInvalidLogResponse } from '../models/IntegrationLogsInvalidLogResponse';
import { IntegrationLogsInvalidLogResponseRejectedLogsInner } from '../models/IntegrationLogsInvalidLogResponseRejectedLogsInner';
import { IntegrationLogsRequest } from '../models/IntegrationLogsRequest';
import { IntegrationLogsSuccessResponse } from '../models/IntegrationLogsSuccessResponse';
import { IntegrationMetadata } from '../models/IntegrationMetadata';
import { IntegrationRecord } from '../models/IntegrationRecord';
import { IntegrationRequest } from '../models/IntegrationRequest';
import { IntegrationRequestPatch } from '../models/IntegrationRequestPatch';
import { IntegrationsGetList200Response } from '../models/IntegrationsGetList200Response';
import { Interest } from '../models/Interest';
import { ItemAttributes } from '../models/ItemAttributes';
import { ItemBatchRecord } from '../models/ItemBatchRecord';
import { ItemCreateBatchRecord } from '../models/ItemCreateBatchRecord';
import { ItemDeleteBatchRecord } from '../models/ItemDeleteBatchRecord';
import { ItemDeleteDiscontinuedBatchRecord } from '../models/ItemDeleteDiscontinuedBatchRecord';
import { ItemGroupIdFilter } from '../models/ItemGroupIdFilter';
import { ItemIdFilter } from '../models/ItemIdFilter';
import { ItemProcessingRecord } from '../models/ItemProcessingRecord';
import { ItemProcessingStatus } from '../models/ItemProcessingStatus';
import { ItemResponse } from '../models/ItemResponse';
import { ItemResponseAnyOf } from '../models/ItemResponseAnyOf';
import { ItemResponseAnyOf1 } from '../models/ItemResponseAnyOf1';
import { ItemUpdateBatchRecord } from '../models/ItemUpdateBatchRecord';
import { ItemUpsertBatchRecord } from '../models/ItemUpsertBatchRecord';
import { ItemValidationEvent } from '../models/ItemValidationEvent';
import { ItemsBatchPostRequest } from '../models/ItemsBatchPostRequest';
import { ItemsIssuesList200Response } from '../models/ItemsIssuesList200Response';
import { Keyword } from '../models/Keyword';
import { KeywordError } from '../models/KeywordError';
import { KeywordMetrics } from '../models/KeywordMetrics';
import { KeywordMetricsResponse } from '../models/KeywordMetricsResponse';
import { KeywordUpdate } from '../models/KeywordUpdate';
import { KeywordUpdateBody } from '../models/KeywordUpdateBody';
import { KeywordsCommon } from '../models/KeywordsCommon';
import { KeywordsGet200Response } from '../models/KeywordsGet200Response';
import { KeywordsMetricsArrayResponse } from '../models/KeywordsMetricsArrayResponse';
import { KeywordsRequest } from '../models/KeywordsRequest';
import { KeywordsResponse } from '../models/KeywordsResponse';
import { Language } from '../models/Language';
import { LeadFormCommon } from '../models/LeadFormCommon';
import { LeadFormQuestion } from '../models/LeadFormQuestion';
import { LeadFormQuestionFieldType } from '../models/LeadFormQuestionFieldType';
import { LeadFormQuestionType } from '../models/LeadFormQuestionType';
import { LeadFormResponse } from '../models/LeadFormResponse';
import { LeadFormStatus } from '../models/LeadFormStatus';
import { LeadFormTestRequest } from '../models/LeadFormTestRequest';
import { LeadFormTestResponse } from '../models/LeadFormTestResponse';
import { LeadFormsList200Response } from '../models/LeadFormsList200Response';
import { LineItem } from '../models/LineItem';
import { LinkedBusiness } from '../models/LinkedBusiness';
import { MMMReportingColumn } from '../models/MMMReportingColumn';
import { MMMReportingTargetingType } from '../models/MMMReportingTargetingType';
import { MatchType } from '../models/MatchType';
import { MatchTypeResponse } from '../models/MatchTypeResponse';
import { MaxPriceFilter } from '../models/MaxPriceFilter';
import { MediaList200Response } from '../models/MediaList200Response';
import { MediaUpload } from '../models/MediaUpload';
import { MediaUploadAllOfUploadParameters } from '../models/MediaUploadAllOfUploadParameters';
import { MediaUploadDetails } from '../models/MediaUploadDetails';
import { MediaUploadRequest } from '../models/MediaUploadRequest';
import { MediaUploadStatus } from '../models/MediaUploadStatus';
import { MediaUploadType } from '../models/MediaUploadType';
import { MetricsReportingLevel } from '../models/MetricsReportingLevel';
import { MetricsResponse } from '../models/MetricsResponse';
import { MinPriceFilter } from '../models/MinPriceFilter';
import { ModelError } from '../models/ModelError';
import { NonNullableCatalogsCurrency } from '../models/NonNullableCatalogsCurrency';
import { NonNullableProductAvailabilityType } from '../models/NonNullableProductAvailabilityType';
import { NullableCatalogsItemFieldType } from '../models/NullableCatalogsItemFieldType';
import { NullableCurrency } from '../models/NullableCurrency';
import { OauthAccessTokenRequestCode } from '../models/OauthAccessTokenRequestCode';
import { OauthAccessTokenRequestRefresh } from '../models/OauthAccessTokenRequestRefresh';
import { OauthAccessTokenResponse } from '../models/OauthAccessTokenResponse';
import { OauthAccessTokenResponseCode } from '../models/OauthAccessTokenResponseCode';
import { OauthAccessTokenResponseEverlastingRefresh } from '../models/OauthAccessTokenResponseEverlastingRefresh';
import { OauthAccessTokenResponseIntegrationRefresh } from '../models/OauthAccessTokenResponseIntegrationRefresh';
import { OauthAccessTokenResponseRefresh } from '../models/OauthAccessTokenResponseRefresh';
import { ObjectiveType } from '../models/ObjectiveType';
import { OptimizationGoalMetadata } from '../models/OptimizationGoalMetadata';
import { OptimizationGoalMetadataConversionTagV3GoalMetadata } from '../models/OptimizationGoalMetadataConversionTagV3GoalMetadata';
import { OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows } from '../models/OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows';
import { OptimizationGoalMetadataFrequencyGoalMetadata } from '../models/OptimizationGoalMetadataFrequencyGoalMetadata';
import { OptimizationGoalMetadataScrollupGoalMetadata } from '../models/OptimizationGoalMetadataScrollupGoalMetadata';
import { OrderLine } from '../models/OrderLine';
import { OrderLineError } from '../models/OrderLineError';
import { OrderLinePaidType } from '../models/OrderLinePaidType';
import { OrderLineResponse } from '../models/OrderLineResponse';
import { OrderLineSingleResponse } from '../models/OrderLineSingleResponse';
import { OrderLineStatus } from '../models/OrderLineStatus';
import { OrderLines } from '../models/OrderLines';
import { OrderLinesArrayResponse } from '../models/OrderLinesArrayResponse';
import { OrderLinesList200Response } from '../models/OrderLinesList200Response';
import { PacingDeliveryType } from '../models/PacingDeliveryType';
import { PageVisitConversionTagsGet200Response } from '../models/PageVisitConversionTagsGet200Response';
import { Paginated } from '../models/Paginated';
import { PartnerType } from '../models/PartnerType';
import { Pin } from '../models/Pin';
import { PinAnalyticsMetricsResponse } from '../models/PinAnalyticsMetricsResponse';
import { PinAnalyticsMetricsResponseDailyMetricsInner } from '../models/PinAnalyticsMetricsResponseDailyMetricsInner';
import { PinCreate } from '../models/PinCreate';
import { PinMedia } from '../models/PinMedia';
import { PinMediaMetadata } from '../models/PinMediaMetadata';
import { PinMediaSource } from '../models/PinMediaSource';
import { PinMediaSourceImageBase64 } from '../models/PinMediaSourceImageBase64';
import { PinMediaSourceImageURL } from '../models/PinMediaSourceImageURL';
import { PinMediaSourceImagesBase64 } from '../models/PinMediaSourceImagesBase64';
import { PinMediaSourceImagesBase64ItemsInner } from '../models/PinMediaSourceImagesBase64ItemsInner';
import { PinMediaSourceImagesURL } from '../models/PinMediaSourceImagesURL';
import { PinMediaSourceImagesURLItemsInner } from '../models/PinMediaSourceImagesURLItemsInner';
import { PinMediaSourcePinURL } from '../models/PinMediaSourcePinURL';
import { PinMediaSourceVideoID } from '../models/PinMediaSourceVideoID';
import { PinMediaWithImage } from '../models/PinMediaWithImage';
import { PinMediaWithImageAndVideo } from '../models/PinMediaWithImageAndVideo';
import { PinMediaWithImages } from '../models/PinMediaWithImages';
import { PinMediaWithVideo } from '../models/PinMediaWithVideo';
import { PinMediaWithVideos } from '../models/PinMediaWithVideos';
import { PinPromotionSummaryStatus } from '../models/PinPromotionSummaryStatus';
import { PinUpdate } from '../models/PinUpdate';
import { PinUpdateCarouselSlotsInner } from '../models/PinUpdateCarouselSlotsInner';
import { PinsAnalyticsMetricTypesParameterInner } from '../models/PinsAnalyticsMetricTypesParameterInner';
import { PinsList200Response } from '../models/PinsList200Response';
import { PinsSaveRequest } from '../models/PinsSaveRequest';
import { PinterestTagEventData } from '../models/PinterestTagEventData';
import { PlacementGroupType } from '../models/PlacementGroupType';
import { PriceFilter } from '../models/PriceFilter';
import { ProductAvailabilityType } from '../models/ProductAvailabilityType';
import { ProductGroupAnalyticsResponseInner } from '../models/ProductGroupAnalyticsResponseInner';
import { ProductGroupPromotion } from '../models/ProductGroupPromotion';
import { ProductGroupPromotionCreateRequest } from '../models/ProductGroupPromotionCreateRequest';
import { ProductGroupPromotionResponse } from '../models/ProductGroupPromotionResponse';
import { ProductGroupPromotionResponseItem } from '../models/ProductGroupPromotionResponseItem';
import { ProductGroupPromotionUpdateRequest } from '../models/ProductGroupPromotionUpdateRequest';
import { ProductGroupPromotionsList200Response } from '../models/ProductGroupPromotionsList200Response';
import { ProductGroupSummaryStatus } from '../models/ProductGroupSummaryStatus';
import { ProductType0Filter } from '../models/ProductType0Filter';
import { ProductType1Filter } from '../models/ProductType1Filter';
import { ProductType2Filter } from '../models/ProductType2Filter';
import { ProductType3Filter } from '../models/ProductType3Filter';
import { ProductType4Filter } from '../models/ProductType4Filter';
import { QuizPinData } from '../models/QuizPinData';
import { QuizPinOption } from '../models/QuizPinOption';
import { QuizPinQuestion } from '../models/QuizPinQuestion';
import { QuizPinResult } from '../models/QuizPinResult';
import { RelatedTerms } from '../models/RelatedTerms';
import { RelatedTermsRelatedTermsListInner } from '../models/RelatedTermsRelatedTermsListInner';
import { ReportingColumnAsync } from '../models/ReportingColumnAsync';
import { Role } from '../models/Role';
import { SSIOAccountAddress } from '../models/SSIOAccountAddress';
import { SSIOAccountItem } from '../models/SSIOAccountItem';
import { SSIOAccountPMPName } from '../models/SSIOAccountPMPName';
import { SSIOAccountResponse } from '../models/SSIOAccountResponse';
import { SSIOCreateInsertionOrderRequest } from '../models/SSIOCreateInsertionOrderRequest';
import { SSIOCreateInsertionOrderResponse } from '../models/SSIOCreateInsertionOrderResponse';
import { SSIOEditInsertionOrderRequest } from '../models/SSIOEditInsertionOrderRequest';
import { SSIOEditInsertionOrderResponse } from '../models/SSIOEditInsertionOrderResponse';
import { SSIOInsertionOrderCommon } from '../models/SSIOInsertionOrderCommon';
import { SSIOInsertionOrderStatus } from '../models/SSIOInsertionOrderStatus';
import { SSIOInsertionOrderStatusResponse } from '../models/SSIOInsertionOrderStatusResponse';
import { SSIOOrderLine } from '../models/SSIOOrderLine';
import { SearchPartnerPins200Response } from '../models/SearchPartnerPins200Response';
import { SearchUserBoardsGet200Response } from '../models/SearchUserBoardsGet200Response';
import { SingleInterestTargetingOptionResponse } from '../models/SingleInterestTargetingOptionResponse';
import { SsioInsertionOrdersStatusGetByAdAccount200Response } from '../models/SsioInsertionOrdersStatusGetByAdAccount200Response';
import { SsioOrderLinesGetByAdAccount200Response } from '../models/SsioOrderLinesGetByAdAccount200Response';
import { SummaryPin } from '../models/SummaryPin';
import { SummaryPinMedia } from '../models/SummaryPinMedia';
import { TargetingAdvertiserCountry } from '../models/TargetingAdvertiserCountry';
import { TargetingSpec } from '../models/TargetingSpec';
import { TargetingSpecSHOPPINGRETARGETING } from '../models/TargetingSpecSHOPPINGRETARGETING';
import { TargetingTypeFilter } from '../models/TargetingTypeFilter';
import { TemplateResponse } from '../models/TemplateResponse';
import { TemplateResponseDateRange } from '../models/TemplateResponseDateRange';
import { TemplateResponseDateRangeAbsoluteDateRange } from '../models/TemplateResponseDateRangeAbsoluteDateRange';
import { TemplateResponseDateRangeDynamicDateRange } from '../models/TemplateResponseDateRangeDynamicDateRange';
import { TemplateResponseDateRangeRelativeDateRange } from '../models/TemplateResponseDateRangeRelativeDateRange';
import { TemplatesList200Response } from '../models/TemplatesList200Response';
import { TermsOfService } from '../models/TermsOfService';
import { TopPinsAnalyticsResponse } from '../models/TopPinsAnalyticsResponse';
import { TopPinsAnalyticsResponseDateAvailability } from '../models/TopPinsAnalyticsResponseDateAvailability';
import { TopPinsAnalyticsResponsePinsInner } from '../models/TopPinsAnalyticsResponsePinsInner';
import { TopVideoPinsAnalyticsResponse } from '../models/TopVideoPinsAnalyticsResponse';
import { TopVideoPinsAnalyticsResponsePinsInner } from '../models/TopVideoPinsAnalyticsResponsePinsInner';
import { TrackingUrls } from '../models/TrackingUrls';
import { TrendType } from '../models/TrendType';
import { TrendingKeywordsResponse } from '../models/TrendingKeywordsResponse';
import { TrendingKeywordsResponseTrendsInner } from '../models/TrendingKeywordsResponseTrendsInner';
import { TrendingKeywordsResponseTrendsInnerTimeSeries } from '../models/TrendingKeywordsResponseTrendsInnerTimeSeries';
import { TrendsSupportedRegion } from '../models/TrendsSupportedRegion';
import { UpdatableItemAttributes } from '../models/UpdatableItemAttributes';
import { UpdateMaskFieldType } from '../models/UpdateMaskFieldType';
import { UserAccountFollowedInterests200Response } from '../models/UserAccountFollowedInterests200Response';
import { UserFollowingFeedType } from '../models/UserFollowingFeedType';
import { UserFollowingGet200Response } from '../models/UserFollowingGet200Response';
import { UserListOperationType } from '../models/UserListOperationType';
import { UserListType } from '../models/UserListType';
import { UserSummary } from '../models/UserSummary';
import { UserWebsiteSummary } from '../models/UserWebsiteSummary';
import { UserWebsiteVerificationCode } from '../models/UserWebsiteVerificationCode';
import { UserWebsiteVerifyRequest } from '../models/UserWebsiteVerifyRequest';
import { UserWebsitesGet200Response } from '../models/UserWebsitesGet200Response';
import { VideoMetadata } from '../models/VideoMetadata';

import { ObservableAdAccountsApi } from "./ObservableAPI";
import { AdAccountsApiRequestFactory, AdAccountsApiResponseProcessor} from "../apis/AdAccountsApi";

export interface AdAccountsApiAdAccountAnalyticsRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdAccountsApiadAccountAnalytics
     */
    adAccountId: string
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @type string
     * @memberof AdAccountsApiadAccountAnalytics
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @type string
     * @memberof AdAccountsApiadAccountAnalytics
     */
    endDate: string
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;VIDEO_LENGTH&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof AdAccountsApiadAccountAnalytics
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @type Granularity
     * @memberof AdAccountsApiadAccountAnalytics
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdAccountsApiadAccountAnalytics
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdAccountsApiadAccountAnalytics
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdAccountsApiadAccountAnalytics
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof AdAccountsApiadAccountAnalytics
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
}

export interface AdAccountsApiAdAccountTargetingAnalyticsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    adAccountId: string
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @type string
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @type string
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    endDate: string
    /**
     * Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.
     * @type Array&lt;AdsAnalyticsTargetingType&gt;
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    targetingTypes: Array<AdsAnalyticsTargetingType>
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;VIDEO_LENGTH&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @type Granularity
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
    /**
     * List of types of attribution for the conversion report
     * @type ConversionReportAttributionType
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    attributionTypes?: ConversionReportAttributionType
}

export interface AdAccountsApiAdAccountsCreateRequest {
    /**
     * Ad account to create.
     * @type AdAccountCreateRequest
     * @memberof AdAccountsApiadAccountsCreate
     */
    adAccountCreateRequest: AdAccountCreateRequest
}

export interface AdAccountsApiAdAccountsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdAccountsApiadAccountsGet
     */
    adAccountId: string
}

export interface AdAccountsApiAdAccountsListRequest {
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof AdAccountsApiadAccountsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof AdAccountsApiadAccountsList
     */
    pageSize?: number
    /**
     * Include shared ad accounts
     * @type boolean
     * @memberof AdAccountsApiadAccountsList
     */
    includeSharedAccounts?: boolean
}

export interface AdAccountsApiAnalyticsCreateMmmReportRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdAccountsApianalyticsCreateMmmReport
     */
    adAccountId: string
    /**
     * 
     * @type CreateMMMReportRequest
     * @memberof AdAccountsApianalyticsCreateMmmReport
     */
    createMMMReportRequest: CreateMMMReportRequest
}

export interface AdAccountsApiAnalyticsCreateReportRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdAccountsApianalyticsCreateReport
     */
    adAccountId: string
    /**
     * 
     * @type AdsAnalyticsCreateAsyncRequest
     * @memberof AdAccountsApianalyticsCreateReport
     */
    adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest
}

export interface AdAccountsApiAnalyticsCreateTemplateReportRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdAccountsApianalyticsCreateTemplateReport
     */
    adAccountId: string
    /**
     * Unique identifier of a template.
     * @type string
     * @memberof AdAccountsApianalyticsCreateTemplateReport
     */
    templateId: string
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.
     * @type string
     * @memberof AdAccountsApianalyticsCreateTemplateReport
     */
    startDate?: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.
     * @type string
     * @memberof AdAccountsApianalyticsCreateTemplateReport
     */
    endDate?: string
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @type Granularity
     * @memberof AdAccountsApianalyticsCreateTemplateReport
     */
    granularity?: Granularity
}

export interface AdAccountsApiAnalyticsGetMmmReportRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdAccountsApianalyticsGetMmmReport
     */
    adAccountId: string
    /**
     * Token returned from the post request creation call
     * @type string
     * @memberof AdAccountsApianalyticsGetMmmReport
     */
    token: string
}

export interface AdAccountsApiAnalyticsGetReportRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdAccountsApianalyticsGetReport
     */
    adAccountId: string
    /**
     * Token returned from the post request creation call
     * @type string
     * @memberof AdAccountsApianalyticsGetReport
     */
    token: string
}

export interface AdAccountsApiSandboxDeleteRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdAccountsApisandboxDelete
     */
    adAccountId: string
}

export interface AdAccountsApiTemplatesListRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdAccountsApitemplatesList
     */
    adAccountId: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof AdAccountsApitemplatesList
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof AdAccountsApitemplatesList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof AdAccountsApitemplatesList
     */
    bookmark?: string
}

export class ObjectAdAccountsApi {
    private api: ObservableAdAccountsApi

    public constructor(configuration: Configuration, requestFactory?: AdAccountsApiRequestFactory, responseProcessor?: AdAccountsApiResponseProcessor) {
        this.api = new ObservableAdAccountsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.
     * Get ad account analytics
     * @param param the request object
     */
    public adAccountAnalyticsWithHttpInfo(param: AdAccountsApiAdAccountAnalyticsRequest, options?: Configuration): Promise<HttpInfo<Array<AdAccountAnalyticsResponseInner>>> {
        return this.api.adAccountAnalyticsWithHttpInfo(param.adAccountId, param.startDate, param.endDate, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime,  options).toPromise();
    }

    /**
     * Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.
     * Get ad account analytics
     * @param param the request object
     */
    public adAccountAnalytics(param: AdAccountsApiAdAccountAnalyticsRequest, options?: Configuration): Promise<Array<AdAccountAnalyticsResponseInner>> {
        return this.api.adAccountAnalytics(param.adAccountId, param.startDate, param.endDate, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime,  options).toPromise();
    }

    /**
     * Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get targeting analytics for an ad account
     * @param param the request object
     */
    public adAccountTargetingAnalyticsGetWithHttpInfo(param: AdAccountsApiAdAccountTargetingAnalyticsGetRequest, options?: Configuration): Promise<HttpInfo<MetricsResponse>> {
        return this.api.adAccountTargetingAnalyticsGetWithHttpInfo(param.adAccountId, param.startDate, param.endDate, param.targetingTypes, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.attributionTypes,  options).toPromise();
    }

    /**
     * Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get targeting analytics for an ad account
     * @param param the request object
     */
    public adAccountTargetingAnalyticsGet(param: AdAccountsApiAdAccountTargetingAnalyticsGetRequest, options?: Configuration): Promise<MetricsResponse> {
        return this.api.adAccountTargetingAnalyticsGet(param.adAccountId, param.startDate, param.endDate, param.targetingTypes, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.attributionTypes,  options).toPromise();
    }

    /**
     * Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/> You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>.
     * Create ad account
     * @param param the request object
     */
    public adAccountsCreateWithHttpInfo(param: AdAccountsApiAdAccountsCreateRequest, options?: Configuration): Promise<HttpInfo<AdAccount>> {
        return this.api.adAccountsCreateWithHttpInfo(param.adAccountCreateRequest,  options).toPromise();
    }

    /**
     * Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/> You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>.
     * Create ad account
     * @param param the request object
     */
    public adAccountsCreate(param: AdAccountsApiAdAccountsCreateRequest, options?: Configuration): Promise<AdAccount> {
        return this.api.adAccountsCreate(param.adAccountCreateRequest,  options).toPromise();
    }

    /**
     * Get an ad account
     * Get ad account
     * @param param the request object
     */
    public adAccountsGetWithHttpInfo(param: AdAccountsApiAdAccountsGetRequest, options?: Configuration): Promise<HttpInfo<AdAccount>> {
        return this.api.adAccountsGetWithHttpInfo(param.adAccountId,  options).toPromise();
    }

    /**
     * Get an ad account
     * Get ad account
     * @param param the request object
     */
    public adAccountsGet(param: AdAccountsApiAdAccountsGetRequest, options?: Configuration): Promise<AdAccount> {
        return this.api.adAccountsGet(param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.
     * List ad accounts
     * @param param the request object
     */
    public adAccountsListWithHttpInfo(param: AdAccountsApiAdAccountsListRequest = {}, options?: Configuration): Promise<HttpInfo<AdAccountsList200Response>> {
        return this.api.adAccountsListWithHttpInfo(param.bookmark, param.pageSize, param.includeSharedAccounts,  options).toPromise();
    }

    /**
     * Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.
     * List ad accounts
     * @param param the request object
     */
    public adAccountsList(param: AdAccountsApiAdAccountsListRequest = {}, options?: Configuration): Promise<AdAccountsList200Response> {
        return this.api.adAccountsList(param.bookmark, param.pageSize, param.includeSharedAccounts,  options).toPromise();
    }

    /**
     * This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it\'s in beta release.
     * Create a request for a Marketing Mix Modeling (MMM) report
     * @param param the request object
     */
    public analyticsCreateMmmReportWithHttpInfo(param: AdAccountsApiAnalyticsCreateMmmReportRequest, options?: Configuration): Promise<HttpInfo<CreateMMMReportResponse>> {
        return this.api.analyticsCreateMmmReportWithHttpInfo(param.adAccountId, param.createMMMReportRequest,  options).toPromise();
    }

    /**
     * This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it\'s in beta release.
     * Create a request for a Marketing Mix Modeling (MMM) report
     * @param param the request object
     */
    public analyticsCreateMmmReport(param: AdAccountsApiAnalyticsCreateMmmReportRequest, options?: Configuration): Promise<CreateMMMReportResponse> {
        return this.api.analyticsCreateMmmReport(param.adAccountId, param.createMMMReportRequest,  options).toPromise();
    }

    /**
     * This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
     * Create async request for an account analytics report
     * @param param the request object
     */
    public analyticsCreateReportWithHttpInfo(param: AdAccountsApiAnalyticsCreateReportRequest, options?: Configuration): Promise<HttpInfo<AdsAnalyticsCreateAsyncResponse>> {
        return this.api.analyticsCreateReportWithHttpInfo(param.adAccountId, param.adsAnalyticsCreateAsyncRequest,  options).toPromise();
    }

    /**
     * This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
     * Create async request for an account analytics report
     * @param param the request object
     */
    public analyticsCreateReport(param: AdAccountsApiAnalyticsCreateReportRequest, options?: Configuration): Promise<AdsAnalyticsCreateAsyncResponse> {
        return this.api.analyticsCreateReport(param.adAccountId, param.adsAnalyticsCreateAsyncRequest,  options).toPromise();
    }

    /**
     * This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.
     * Create async request for an analytics report using a template
     * @param param the request object
     */
    public analyticsCreateTemplateReportWithHttpInfo(param: AdAccountsApiAnalyticsCreateTemplateReportRequest, options?: Configuration): Promise<HttpInfo<AdsAnalyticsCreateAsyncResponse>> {
        return this.api.analyticsCreateTemplateReportWithHttpInfo(param.adAccountId, param.templateId, param.startDate, param.endDate, param.granularity,  options).toPromise();
    }

    /**
     * This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.
     * Create async request for an analytics report using a template
     * @param param the request object
     */
    public analyticsCreateTemplateReport(param: AdAccountsApiAnalyticsCreateTemplateReportRequest, options?: Configuration): Promise<AdsAnalyticsCreateAsyncResponse> {
        return this.api.analyticsCreateTemplateReport(param.adAccountId, param.templateId, param.startDate, param.endDate, param.granularity,  options).toPromise();
    }

    /**
     * Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
     * Get advertiser Marketing Mix Modeling (MMM) report.
     * @param param the request object
     */
    public analyticsGetMmmReportWithHttpInfo(param: AdAccountsApiAnalyticsGetMmmReportRequest, options?: Configuration): Promise<HttpInfo<GetMMMReportResponse>> {
        return this.api.analyticsGetMmmReportWithHttpInfo(param.adAccountId, param.token,  options).toPromise();
    }

    /**
     * Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
     * Get advertiser Marketing Mix Modeling (MMM) report.
     * @param param the request object
     */
    public analyticsGetMmmReport(param: AdAccountsApiAnalyticsGetMmmReportRequest, options?: Configuration): Promise<GetMMMReportResponse> {
        return this.api.analyticsGetMmmReport(param.adAccountId, param.token,  options).toPromise();
    }

    /**
     * This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
     * Get the account analytics report created by the async call
     * @param param the request object
     */
    public analyticsGetReportWithHttpInfo(param: AdAccountsApiAnalyticsGetReportRequest, options?: Configuration): Promise<HttpInfo<AdsAnalyticsGetAsyncResponse>> {
        return this.api.analyticsGetReportWithHttpInfo(param.adAccountId, param.token,  options).toPromise();
    }

    /**
     * This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
     * Get the account analytics report created by the async call
     * @param param the request object
     */
    public analyticsGetReport(param: AdAccountsApiAnalyticsGetReportRequest, options?: Configuration): Promise<AdsAnalyticsGetAsyncResponse> {
        return this.api.analyticsGetReport(param.adAccountId, param.token,  options).toPromise();
    }

    /**
     * Delete an ad account and all the ads data associated with that account.  A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).  Go to https://developers.pinterest.com/docs/dev-tools/sandbox/ for more information.
     * Delete ads data for ad account in API Sandbox
     * @param param the request object
     */
    public sandboxDeleteWithHttpInfo(param: AdAccountsApiSandboxDeleteRequest, options?: Configuration): Promise<HttpInfo<string>> {
        return this.api.sandboxDeleteWithHttpInfo(param.adAccountId,  options).toPromise();
    }

    /**
     * Delete an ad account and all the ads data associated with that account.  A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).  Go to https://developers.pinterest.com/docs/dev-tools/sandbox/ for more information.
     * Delete ads data for ad account in API Sandbox
     * @param param the request object
     */
    public sandboxDelete(param: AdAccountsApiSandboxDeleteRequest, options?: Configuration): Promise<string> {
        return this.api.sandboxDelete(param.adAccountId,  options).toPromise();
    }

    /**
     * Gets all Templates associated with an ad account ID.
     * List templates
     * @param param the request object
     */
    public templatesListWithHttpInfo(param: AdAccountsApiTemplatesListRequest, options?: Configuration): Promise<HttpInfo<TemplatesList200Response>> {
        return this.api.templatesListWithHttpInfo(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * Gets all Templates associated with an ad account ID.
     * List templates
     * @param param the request object
     */
    public templatesList(param: AdAccountsApiTemplatesListRequest, options?: Configuration): Promise<TemplatesList200Response> {
        return this.api.templatesList(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

}

import { ObservableAdGroupsApi } from "./ObservableAPI";
import { AdGroupsApiRequestFactory, AdGroupsApiResponseProcessor} from "../apis/AdGroupsApi";

export interface AdGroupsApiAdGroupsAnalyticsRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    adAccountId: string
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @type string
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @type string
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    endDate: string
    /**
     * List of Ad group Ids to use to filter the results.
     * @type Array&lt;string&gt;
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    adGroupIds: Array<string>
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;VIDEO_LENGTH&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @type Granularity
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
}

export interface AdGroupsApiAdGroupsAudienceSizingRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdGroupsApiadGroupsAudienceSizing
     */
    adAccountId: string
    /**
     * 
     * @type AdGroupAudienceSizingRequest
     * @memberof AdGroupsApiadGroupsAudienceSizing
     */
    adGroupAudienceSizingRequest?: AdGroupAudienceSizingRequest
}

export interface AdGroupsApiAdGroupsBidFloorGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdGroupsApiadGroupsBidFloorGet
     */
    adAccountId: string
    /**
     * Parameters to get bid_floor info
     * @type BidFloorRequest
     * @memberof AdGroupsApiadGroupsBidFloorGet
     */
    bidFloorRequest: BidFloorRequest
}

export interface AdGroupsApiAdGroupsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdGroupsApiadGroupsCreate
     */
    adAccountId: string
    /**
     * List of ad groups to create, size limit [1, 30].
     * @type Array&lt;AdGroupCreateRequest&gt;
     * @memberof AdGroupsApiadGroupsCreate
     */
    adGroupCreateRequest: Array<AdGroupCreateRequest>
}

export interface AdGroupsApiAdGroupsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdGroupsApiadGroupsGet
     */
    adAccountId: string
    /**
     * Unique identifier of an ad group.
     * @type string
     * @memberof AdGroupsApiadGroupsGet
     */
    adGroupId: string
}

export interface AdGroupsApiAdGroupsListRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdGroupsApiadGroupsList
     */
    adAccountId: string
    /**
     * List of Campaign Ids to use to filter the results.
     * @type Array&lt;string&gt;
     * @memberof AdGroupsApiadGroupsList
     */
    campaignIds?: Array<string>
    /**
     * List of Ad group Ids to use to filter the results.
     * @type Array&lt;string&gt;
     * @memberof AdGroupsApiadGroupsList
     */
    adGroupIds?: Array<string>
    /**
     * Entity status
     * @type Array&lt;&#39;ACTIVE&#39; | &#39;PAUSED&#39; | &#39;ARCHIVED&#39; | &#39;DRAFT&#39; | &#39;DELETED_DRAFT&#39;&gt;
     * @memberof AdGroupsApiadGroupsList
     */
    entityStatuses?: Array<'ACTIVE' | 'PAUSED' | 'ARCHIVED' | 'DRAFT' | 'DELETED_DRAFT'>
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof AdGroupsApiadGroupsList
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof AdGroupsApiadGroupsList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof AdGroupsApiadGroupsList
     */
    bookmark?: string
    /**
     * Return interests as text names (if value is true) rather than topic IDs.
     * @type boolean
     * @memberof AdGroupsApiadGroupsList
     */
    translateInterestsToNames?: boolean
}

export interface AdGroupsApiAdGroupsTargetingAnalyticsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    adAccountId: string
    /**
     * List of Ad group Ids to use to filter the results.
     * @type Array&lt;string&gt;
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    adGroupIds: Array<string>
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @type string
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @type string
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    endDate: string
    /**
     * Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.
     * @type Array&lt;AdsAnalyticsTargetingType&gt;
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    targetingTypes: Array<AdsAnalyticsTargetingType>
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;VIDEO_LENGTH&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @type Granularity
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
    /**
     * List of types of attribution for the conversion report
     * @type ConversionReportAttributionType
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    attributionTypes?: ConversionReportAttributionType
}

export interface AdGroupsApiAdGroupsUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdGroupsApiadGroupsUpdate
     */
    adAccountId: string
    /**
     * List of ad groups to update, size limit [1, 30].
     * @type Array&lt;AdGroupUpdateRequest&gt;
     * @memberof AdGroupsApiadGroupsUpdate
     */
    adGroupUpdateRequest: Array<AdGroupUpdateRequest>
}

export class ObjectAdGroupsApi {
    private api: ObservableAdGroupsApi

    public constructor(configuration: Configuration, requestFactory?: AdGroupsApiRequestFactory, responseProcessor?: AdGroupsApiResponseProcessor) {
        this.api = new ObservableAdGroupsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get ad group analytics
     * @param param the request object
     */
    public adGroupsAnalyticsWithHttpInfo(param: AdGroupsApiAdGroupsAnalyticsRequest, options?: Configuration): Promise<HttpInfo<Array<AdGroupsAnalyticsResponseInner>>> {
        return this.api.adGroupsAnalyticsWithHttpInfo(param.adAccountId, param.startDate, param.endDate, param.adGroupIds, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime,  options).toPromise();
    }

    /**
     * Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get ad group analytics
     * @param param the request object
     */
    public adGroupsAnalytics(param: AdGroupsApiAdGroupsAnalyticsRequest, options?: Configuration): Promise<Array<AdGroupsAnalyticsResponseInner>> {
        return this.api.adGroupsAnalytics(param.adAccountId, param.startDate, param.endDate, param.adGroupIds, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime,  options).toPromise();
    }

    /**
     * Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     * Get audience sizing
     * @param param the request object
     */
    public adGroupsAudienceSizingWithHttpInfo(param: AdGroupsApiAdGroupsAudienceSizingRequest, options?: Configuration): Promise<HttpInfo<AdGroupAudienceSizingResponse>> {
        return this.api.adGroupsAudienceSizingWithHttpInfo(param.adAccountId, param.adGroupAudienceSizingRequest,  options).toPromise();
    }

    /**
     * Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     * Get audience sizing
     * @param param the request object
     */
    public adGroupsAudienceSizing(param: AdGroupsApiAdGroupsAudienceSizingRequest, options?: Configuration): Promise<AdGroupAudienceSizingResponse> {
        return this.api.adGroupsAudienceSizing(param.adAccountId, param.adGroupAudienceSizingRequest,  options).toPromise();
    }

    /**
     * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.
     * Get bid floors
     * @param param the request object
     */
    public adGroupsBidFloorGetWithHttpInfo(param: AdGroupsApiAdGroupsBidFloorGetRequest, options?: Configuration): Promise<HttpInfo<BidFloor>> {
        return this.api.adGroupsBidFloorGetWithHttpInfo(param.adAccountId, param.bidFloorRequest,  options).toPromise();
    }

    /**
     * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.
     * Get bid floors
     * @param param the request object
     */
    public adGroupsBidFloorGet(param: AdGroupsApiAdGroupsBidFloorGetRequest, options?: Configuration): Promise<BidFloor> {
        return this.api.adGroupsBidFloorGet(param.adAccountId, param.bidFloorRequest,  options).toPromise();
    }

    /**
     * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>.</p> <strong>Note:</strong> - \'bid_in_micro_currency\' and \'budget_in_micro_currency\' should be expressed in microcurrency amounts based on the currency field set in the advertiser\'s profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.
     * Create ad groups
     * @param param the request object
     */
    public adGroupsCreateWithHttpInfo(param: AdGroupsApiAdGroupsCreateRequest, options?: Configuration): Promise<HttpInfo<AdGroupArrayResponse>> {
        return this.api.adGroupsCreateWithHttpInfo(param.adAccountId, param.adGroupCreateRequest,  options).toPromise();
    }

    /**
     * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>.</p> <strong>Note:</strong> - \'bid_in_micro_currency\' and \'budget_in_micro_currency\' should be expressed in microcurrency amounts based on the currency field set in the advertiser\'s profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.
     * Create ad groups
     * @param param the request object
     */
    public adGroupsCreate(param: AdGroupsApiAdGroupsCreateRequest, options?: Configuration): Promise<AdGroupArrayResponse> {
        return this.api.adGroupsCreate(param.adAccountId, param.adGroupCreateRequest,  options).toPromise();
    }

    /**
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
     * Get ad group
     * @param param the request object
     */
    public adGroupsGetWithHttpInfo(param: AdGroupsApiAdGroupsGetRequest, options?: Configuration): Promise<HttpInfo<AdGroupResponse>> {
        return this.api.adGroupsGetWithHttpInfo(param.adAccountId, param.adGroupId,  options).toPromise();
    }

    /**
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
     * Get ad group
     * @param param the request object
     */
    public adGroupsGet(param: AdGroupsApiAdGroupsGetRequest, options?: Configuration): Promise<AdGroupResponse> {
        return this.api.adGroupsGet(param.adAccountId, param.adGroupId,  options).toPromise();
    }

    /**
     * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.
     * List ad groups
     * @param param the request object
     */
    public adGroupsListWithHttpInfo(param: AdGroupsApiAdGroupsListRequest, options?: Configuration): Promise<HttpInfo<AdGroupsList200Response>> {
        return this.api.adGroupsListWithHttpInfo(param.adAccountId, param.campaignIds, param.adGroupIds, param.entityStatuses, param.pageSize, param.order, param.bookmark, param.translateInterestsToNames,  options).toPromise();
    }

    /**
     * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.
     * List ad groups
     * @param param the request object
     */
    public adGroupsList(param: AdGroupsApiAdGroupsListRequest, options?: Configuration): Promise<AdGroupsList200Response> {
        return this.api.adGroupsList(param.adAccountId, param.campaignIds, param.adGroupIds, param.entityStatuses, param.pageSize, param.order, param.bookmark, param.translateInterestsToNames,  options).toPromise();
    }

    /**
     * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get targeting analytics for ad groups
     * @param param the request object
     */
    public adGroupsTargetingAnalyticsGetWithHttpInfo(param: AdGroupsApiAdGroupsTargetingAnalyticsGetRequest, options?: Configuration): Promise<HttpInfo<MetricsResponse>> {
        return this.api.adGroupsTargetingAnalyticsGetWithHttpInfo(param.adAccountId, param.adGroupIds, param.startDate, param.endDate, param.targetingTypes, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.attributionTypes,  options).toPromise();
    }

    /**
     * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get targeting analytics for ad groups
     * @param param the request object
     */
    public adGroupsTargetingAnalyticsGet(param: AdGroupsApiAdGroupsTargetingAnalyticsGetRequest, options?: Configuration): Promise<MetricsResponse> {
        return this.api.adGroupsTargetingAnalyticsGet(param.adAccountId, param.adGroupIds, param.startDate, param.endDate, param.targetingTypes, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.attributionTypes,  options).toPromise();
    }

    /**
     * Update multiple existing ad groups.
     * Update ad groups
     * @param param the request object
     */
    public adGroupsUpdateWithHttpInfo(param: AdGroupsApiAdGroupsUpdateRequest, options?: Configuration): Promise<HttpInfo<AdGroupArrayResponse>> {
        return this.api.adGroupsUpdateWithHttpInfo(param.adAccountId, param.adGroupUpdateRequest,  options).toPromise();
    }

    /**
     * Update multiple existing ad groups.
     * Update ad groups
     * @param param the request object
     */
    public adGroupsUpdate(param: AdGroupsApiAdGroupsUpdateRequest, options?: Configuration): Promise<AdGroupArrayResponse> {
        return this.api.adGroupsUpdate(param.adAccountId, param.adGroupUpdateRequest,  options).toPromise();
    }

}

import { ObservableAdsApi } from "./ObservableAPI";
import { AdsApiRequestFactory, AdsApiResponseProcessor} from "../apis/AdsApi";

export interface AdsApiAdPreviewsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdsApiadPreviewsCreate
     */
    adAccountId: string
    /**
     * Create ad preview with pin or image.
     * @type AdPreviewRequest
     * @memberof AdsApiadPreviewsCreate
     */
    adPreviewRequest: AdPreviewRequest
}

export interface AdsApiAdTargetingAnalyticsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    adAccountId: string
    /**
     * List of Ad Ids to use to filter the results.
     * @type Array&lt;string&gt;
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    adIds: Array<string>
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @type string
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @type string
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    endDate: string
    /**
     * Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.
     * @type Array&lt;AdsAnalyticsTargetingType&gt;
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    targetingTypes: Array<AdsAnalyticsTargetingType>
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;VIDEO_LENGTH&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @type Granularity
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
    /**
     * List of types of attribution for the conversion report
     * @type ConversionReportAttributionType
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    attributionTypes?: ConversionReportAttributionType
}

export interface AdsApiAdsAnalyticsRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdsApiadsAnalytics
     */
    adAccountId: string
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @type string
     * @memberof AdsApiadsAnalytics
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @type string
     * @memberof AdsApiadsAnalytics
     */
    endDate: string
    /**
     * List of Ad Ids to use to filter the results.
     * @type Array&lt;string&gt;
     * @memberof AdsApiadsAnalytics
     */
    adIds: Array<string>
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;VIDEO_LENGTH&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof AdsApiadsAnalytics
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @type Granularity
     * @memberof AdsApiadsAnalytics
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdsApiadsAnalytics
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdsApiadsAnalytics
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdsApiadsAnalytics
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof AdsApiadsAnalytics
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
}

export interface AdsApiAdsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdsApiadsCreate
     */
    adAccountId: string
    /**
     * List of ads to create, size limit [1, 30].
     * @type Array&lt;AdCreateRequest&gt;
     * @memberof AdsApiadsCreate
     */
    adCreateRequest: Array<AdCreateRequest>
}

export interface AdsApiAdsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdsApiadsGet
     */
    adAccountId: string
    /**
     * Unique identifier of an ad.
     * @type string
     * @memberof AdsApiadsGet
     */
    adId: string
}

export interface AdsApiAdsListRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdsApiadsList
     */
    adAccountId: string
    /**
     * List of Campaign Ids to use to filter the results.
     * @type Array&lt;string&gt;
     * @memberof AdsApiadsList
     */
    campaignIds?: Array<string>
    /**
     * List of Ad group Ids to use to filter the results.
     * @type Array&lt;string&gt;
     * @memberof AdsApiadsList
     */
    adGroupIds?: Array<string>
    /**
     * List of Ad Ids to use to filter the results.
     * @type Array&lt;string&gt;
     * @memberof AdsApiadsList
     */
    adIds?: Array<string>
    /**
     * Entity status
     * @type Array&lt;&#39;ACTIVE&#39; | &#39;PAUSED&#39; | &#39;ARCHIVED&#39; | &#39;DRAFT&#39; | &#39;DELETED_DRAFT&#39;&gt;
     * @memberof AdsApiadsList
     */
    entityStatuses?: Array<'ACTIVE' | 'PAUSED' | 'ARCHIVED' | 'DRAFT' | 'DELETED_DRAFT'>
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof AdsApiadsList
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof AdsApiadsList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof AdsApiadsList
     */
    bookmark?: string
}

export interface AdsApiAdsUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AdsApiadsUpdate
     */
    adAccountId: string
    /**
     * List of ads to update, size limit [1, 30]
     * @type Array&lt;AdUpdateRequest&gt;
     * @memberof AdsApiadsUpdate
     */
    adUpdateRequest: Array<AdUpdateRequest>
}

export class ObjectAdsApi {
    private api: ObservableAdsApi

    public constructor(configuration: Configuration, requestFactory?: AdsApiRequestFactory, responseProcessor?: AdsApiResponseProcessor) {
        this.api = new ObservableAdsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.
     * Create ad preview with pin or image
     * @param param the request object
     */
    public adPreviewsCreateWithHttpInfo(param: AdsApiAdPreviewsCreateRequest, options?: Configuration): Promise<HttpInfo<AdPreviewURLResponse>> {
        return this.api.adPreviewsCreateWithHttpInfo(param.adAccountId, param.adPreviewRequest,  options).toPromise();
    }

    /**
     * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.
     * Create ad preview with pin or image
     * @param param the request object
     */
    public adPreviewsCreate(param: AdsApiAdPreviewsCreateRequest, options?: Configuration): Promise<AdPreviewURLResponse> {
        return this.api.adPreviewsCreate(param.adAccountId, param.adPreviewRequest,  options).toPromise();
    }

    /**
     * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get targeting analytics for ads
     * @param param the request object
     */
    public adTargetingAnalyticsGetWithHttpInfo(param: AdsApiAdTargetingAnalyticsGetRequest, options?: Configuration): Promise<HttpInfo<MetricsResponse>> {
        return this.api.adTargetingAnalyticsGetWithHttpInfo(param.adAccountId, param.adIds, param.startDate, param.endDate, param.targetingTypes, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.attributionTypes,  options).toPromise();
    }

    /**
     * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get targeting analytics for ads
     * @param param the request object
     */
    public adTargetingAnalyticsGet(param: AdsApiAdTargetingAnalyticsGetRequest, options?: Configuration): Promise<MetricsResponse> {
        return this.api.adTargetingAnalyticsGet(param.adAccountId, param.adIds, param.startDate, param.endDate, param.targetingTypes, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.attributionTypes,  options).toPromise();
    }

    /**
     * Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get ad analytics
     * @param param the request object
     */
    public adsAnalyticsWithHttpInfo(param: AdsApiAdsAnalyticsRequest, options?: Configuration): Promise<HttpInfo<Array<AdsAnalyticsResponseInner>>> {
        return this.api.adsAnalyticsWithHttpInfo(param.adAccountId, param.startDate, param.endDate, param.adIds, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime,  options).toPromise();
    }

    /**
     * Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get ad analytics
     * @param param the request object
     */
    public adsAnalytics(param: AdsApiAdsAnalyticsRequest, options?: Configuration): Promise<Array<AdsAnalyticsResponseInner>> {
        return this.api.adsAnalytics(param.adAccountId, param.startDate, param.endDate, param.adIds, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime,  options).toPromise();
    }

    /**
     * Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
     * Create ads
     * @param param the request object
     */
    public adsCreateWithHttpInfo(param: AdsApiAdsCreateRequest, options?: Configuration): Promise<HttpInfo<AdArrayResponse>> {
        return this.api.adsCreateWithHttpInfo(param.adAccountId, param.adCreateRequest,  options).toPromise();
    }

    /**
     * Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
     * Create ads
     * @param param the request object
     */
    public adsCreate(param: AdsApiAdsCreateRequest, options?: Configuration): Promise<AdArrayResponse> {
        return this.api.adsCreate(param.adAccountId, param.adCreateRequest,  options).toPromise();
    }

    /**
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
     * Get ad
     * @param param the request object
     */
    public adsGetWithHttpInfo(param: AdsApiAdsGetRequest, options?: Configuration): Promise<HttpInfo<AdResponse>> {
        return this.api.adsGetWithHttpInfo(param.adAccountId, param.adId,  options).toPromise();
    }

    /**
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
     * Get ad
     * @param param the request object
     */
    public adsGet(param: AdsApiAdsGetRequest, options?: Configuration): Promise<AdResponse> {
        return this.api.adsGet(param.adAccountId, param.adId,  options).toPromise();
    }

    /**
     * List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.
     * List ads
     * @param param the request object
     */
    public adsListWithHttpInfo(param: AdsApiAdsListRequest, options?: Configuration): Promise<HttpInfo<AdsList200Response>> {
        return this.api.adsListWithHttpInfo(param.adAccountId, param.campaignIds, param.adGroupIds, param.adIds, param.entityStatuses, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.
     * List ads
     * @param param the request object
     */
    public adsList(param: AdsApiAdsListRequest, options?: Configuration): Promise<AdsList200Response> {
        return this.api.adsList(param.adAccountId, param.campaignIds, param.adGroupIds, param.adIds, param.entityStatuses, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * Update multiple existing ads
     * Update ads
     * @param param the request object
     */
    public adsUpdateWithHttpInfo(param: AdsApiAdsUpdateRequest, options?: Configuration): Promise<HttpInfo<AdArrayResponse>> {
        return this.api.adsUpdateWithHttpInfo(param.adAccountId, param.adUpdateRequest,  options).toPromise();
    }

    /**
     * Update multiple existing ads
     * Update ads
     * @param param the request object
     */
    public adsUpdate(param: AdsApiAdsUpdateRequest, options?: Configuration): Promise<AdArrayResponse> {
        return this.api.adsUpdate(param.adAccountId, param.adUpdateRequest,  options).toPromise();
    }

}

import { ObservableAudienceInsightsApi } from "./ObservableAPI";
import { AudienceInsightsApiRequestFactory, AudienceInsightsApiResponseProcessor} from "../apis/AudienceInsightsApi";

export interface AudienceInsightsApiAudienceInsightsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AudienceInsightsApiaudienceInsightsGet
     */
    adAccountId: string
    /**
     * Type of audience insights.
     * @type AudienceInsightType
     * @memberof AudienceInsightsApiaudienceInsightsGet
     */
    audienceInsightType: AudienceInsightType
}

export interface AudienceInsightsApiAudienceInsightsScopeAndTypeGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AudienceInsightsApiaudienceInsightsScopeAndTypeGet
     */
    adAccountId: string
}

export class ObjectAudienceInsightsApi {
    private api: ObservableAudienceInsightsApi

    public constructor(configuration: Configuration, requestFactory?: AudienceInsightsApiRequestFactory, responseProcessor?: AudienceInsightsApiResponseProcessor) {
        this.api = new ObservableAudienceInsightsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account\'s engaged audience on Pinterest, the ad account\'s total audience on Pinterest and Pinterest\'s total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
     * Get audience insights
     * @param param the request object
     */
    public audienceInsightsGetWithHttpInfo(param: AudienceInsightsApiAudienceInsightsGetRequest, options?: Configuration): Promise<HttpInfo<AudienceInsightsResponse>> {
        return this.api.audienceInsightsGetWithHttpInfo(param.adAccountId, param.audienceInsightType,  options).toPromise();
    }

    /**
     * Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account\'s engaged audience on Pinterest, the ad account\'s total audience on Pinterest and Pinterest\'s total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
     * Get audience insights
     * @param param the request object
     */
    public audienceInsightsGet(param: AudienceInsightsApiAudienceInsightsGetRequest, options?: Configuration): Promise<AudienceInsightsResponse> {
        return this.api.audienceInsightsGet(param.adAccountId, param.audienceInsightType,  options).toPromise();
    }

    /**
     * Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
     * Get audience insights scope and type
     * @param param the request object
     */
    public audienceInsightsScopeAndTypeGetWithHttpInfo(param: AudienceInsightsApiAudienceInsightsScopeAndTypeGetRequest, options?: Configuration): Promise<HttpInfo<AudienceDefinitionResponse>> {
        return this.api.audienceInsightsScopeAndTypeGetWithHttpInfo(param.adAccountId,  options).toPromise();
    }

    /**
     * Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
     * Get audience insights scope and type
     * @param param the request object
     */
    public audienceInsightsScopeAndTypeGet(param: AudienceInsightsApiAudienceInsightsScopeAndTypeGetRequest, options?: Configuration): Promise<AudienceDefinitionResponse> {
        return this.api.audienceInsightsScopeAndTypeGet(param.adAccountId,  options).toPromise();
    }

}

import { ObservableAudiencesApi } from "./ObservableAPI";
import { AudiencesApiRequestFactory, AudiencesApiResponseProcessor} from "../apis/AudiencesApi";

export interface AudiencesApiAudiencesCreateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AudiencesApiaudiencesCreate
     */
    adAccountId: string
    /**
     * List of ads to create, size limit [1, 30]
     * @type AudienceCreateRequest
     * @memberof AudiencesApiaudiencesCreate
     */
    audienceCreateRequest: AudienceCreateRequest
}

export interface AudiencesApiAudiencesCreateCustomRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AudiencesApiaudiencesCreateCustom
     */
    adAccountId: string
    /**
     * Custom audience to create.
     * @type AudienceCreateCustomRequest
     * @memberof AudiencesApiaudiencesCreateCustom
     */
    audienceCreateCustomRequest: AudienceCreateCustomRequest
}

export interface AudiencesApiAudiencesGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AudiencesApiaudiencesGet
     */
    adAccountId: string
    /**
     * Unique identifier of an audience
     * @type string
     * @memberof AudiencesApiaudiencesGet
     */
    audienceId: string
}

export interface AudiencesApiAudiencesListRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AudiencesApiaudiencesList
     */
    adAccountId: string
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof AudiencesApiaudiencesList
     */
    bookmark?: string
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof AudiencesApiaudiencesList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof AudiencesApiaudiencesList
     */
    pageSize?: number
    /**
     * &lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type.
     * @type &#39;OWNED&#39; | &#39;RECEIVED&#39;
     * @memberof AudiencesApiaudiencesList
     */
    ownershipType?: 'OWNED' | 'RECEIVED'
}

export interface AudiencesApiAudiencesUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof AudiencesApiaudiencesUpdate
     */
    adAccountId: string
    /**
     * Unique identifier of an audience
     * @type string
     * @memberof AudiencesApiaudiencesUpdate
     */
    audienceId: string
    /**
     * The audience to be updated.
     * @type AudienceUpdateRequest
     * @memberof AudiencesApiaudiencesUpdate
     */
    audienceUpdateRequest?: AudienceUpdateRequest
}

export class ObjectAudiencesApi {
    private api: ObservableAudiencesApi

    public constructor(configuration: Configuration, requestFactory?: AudiencesApiRequestFactory, responseProcessor?: AudiencesApiResponseProcessor) {
        this.api = new ObservableAudiencesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.
     * Create audience
     * @param param the request object
     */
    public audiencesCreateWithHttpInfo(param: AudiencesApiAudiencesCreateRequest, options?: Configuration): Promise<HttpInfo<Audience>> {
        return this.api.audiencesCreateWithHttpInfo(param.adAccountId, param.audienceCreateRequest,  options).toPromise();
    }

    /**
     * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.
     * Create audience
     * @param param the request object
     */
    public audiencesCreate(param: AudiencesApiAudiencesCreateRequest, options?: Configuration): Promise<Audience> {
        return this.api.audiencesCreate(param.adAccountId, param.audienceCreateRequest,  options).toPromise();
    }

    /**
     * Create a custom audience and find the audiences you want your ads to reach.
     * Create custom audience
     * @param param the request object
     */
    public audiencesCreateCustomWithHttpInfo(param: AudiencesApiAudiencesCreateCustomRequest, options?: Configuration): Promise<HttpInfo<Audience>> {
        return this.api.audiencesCreateCustomWithHttpInfo(param.adAccountId, param.audienceCreateCustomRequest,  options).toPromise();
    }

    /**
     * Create a custom audience and find the audiences you want your ads to reach.
     * Create custom audience
     * @param param the request object
     */
    public audiencesCreateCustom(param: AudiencesApiAudiencesCreateCustomRequest, options?: Configuration): Promise<Audience> {
        return this.api.audiencesCreateCustom(param.adAccountId, param.audienceCreateCustomRequest,  options).toPromise();
    }

    /**
     * Get a specific audience given the audience ID.
     * Get audience
     * @param param the request object
     */
    public audiencesGetWithHttpInfo(param: AudiencesApiAudiencesGetRequest, options?: Configuration): Promise<HttpInfo<Audience>> {
        return this.api.audiencesGetWithHttpInfo(param.adAccountId, param.audienceId,  options).toPromise();
    }

    /**
     * Get a specific audience given the audience ID.
     * Get audience
     * @param param the request object
     */
    public audiencesGet(param: AudiencesApiAudiencesGetRequest, options?: Configuration): Promise<Audience> {
        return this.api.audiencesGet(param.adAccountId, param.audienceId,  options).toPromise();
    }

    /**
     * Get list of audiences for the ad account.
     * List audiences
     * @param param the request object
     */
    public audiencesListWithHttpInfo(param: AudiencesApiAudiencesListRequest, options?: Configuration): Promise<HttpInfo<AudiencesList200Response>> {
        return this.api.audiencesListWithHttpInfo(param.adAccountId, param.bookmark, param.order, param.pageSize, param.ownershipType,  options).toPromise();
    }

    /**
     * Get list of audiences for the ad account.
     * List audiences
     * @param param the request object
     */
    public audiencesList(param: AudiencesApiAudiencesListRequest, options?: Configuration): Promise<AudiencesList200Response> {
        return this.api.audiencesList(param.adAccountId, param.bookmark, param.order, param.pageSize, param.ownershipType,  options).toPromise();
    }

    /**
     * Update (edit or remove) an existing targeting audience.
     * Update audience
     * @param param the request object
     */
    public audiencesUpdateWithHttpInfo(param: AudiencesApiAudiencesUpdateRequest, options?: Configuration): Promise<HttpInfo<Audience>> {
        return this.api.audiencesUpdateWithHttpInfo(param.adAccountId, param.audienceId, param.audienceUpdateRequest,  options).toPromise();
    }

    /**
     * Update (edit or remove) an existing targeting audience.
     * Update audience
     * @param param the request object
     */
    public audiencesUpdate(param: AudiencesApiAudiencesUpdateRequest, options?: Configuration): Promise<Audience> {
        return this.api.audiencesUpdate(param.adAccountId, param.audienceId, param.audienceUpdateRequest,  options).toPromise();
    }

}

import { ObservableBillingApi } from "./ObservableAPI";
import { BillingApiRequestFactory, BillingApiResponseProcessor} from "../apis/BillingApi";

export interface BillingApiAdsCreditRedeemRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BillingApiadsCreditRedeem
     */
    adAccountId: string
    /**
     * Redeem ad credits request.
     * @type AdsCreditRedeemRequest
     * @memberof BillingApiadsCreditRedeem
     */
    adsCreditRedeemRequest: AdsCreditRedeemRequest
}

export interface BillingApiAdsCreditsDiscountsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BillingApiadsCreditsDiscountsGet
     */
    adAccountId: string
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof BillingApiadsCreditsDiscountsGet
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof BillingApiadsCreditsDiscountsGet
     */
    pageSize?: number
}

export interface BillingApiBillingProfilesGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BillingApibillingProfilesGet
     */
    adAccountId: string
    /**
     * Return active billing profiles, if false return all billing profiles.
     * @type boolean
     * @memberof BillingApibillingProfilesGet
     */
    isActive: boolean
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof BillingApibillingProfilesGet
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof BillingApibillingProfilesGet
     */
    pageSize?: number
}

export interface BillingApiSsioAccountsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BillingApissioAccountsGet
     */
    adAccountId: string
}

export interface BillingApiSsioInsertionOrderCreateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BillingApissioInsertionOrderCreate
     */
    adAccountId: string
    /**
     * Order line to create.
     * @type SSIOCreateInsertionOrderRequest
     * @memberof BillingApissioInsertionOrderCreate
     */
    sSIOCreateInsertionOrderRequest: SSIOCreateInsertionOrderRequest
}

export interface BillingApiSsioInsertionOrderEditRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BillingApissioInsertionOrderEdit
     */
    adAccountId: string
    /**
     * Order line to create.
     * @type SSIOEditInsertionOrderRequest
     * @memberof BillingApissioInsertionOrderEdit
     */
    sSIOEditInsertionOrderRequest: SSIOEditInsertionOrderRequest
}

export interface BillingApiSsioInsertionOrdersStatusGetByAdAccountRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BillingApissioInsertionOrdersStatusGetByAdAccount
     */
    adAccountId: string
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof BillingApissioInsertionOrdersStatusGetByAdAccount
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof BillingApissioInsertionOrdersStatusGetByAdAccount
     */
    pageSize?: number
}

export interface BillingApiSsioInsertionOrdersStatusGetByPinOrderIdRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BillingApissioInsertionOrdersStatusGetByPinOrderId
     */
    adAccountId: string
    /**
     * The pin order id associated with the ssio insertion order
     * @type string
     * @memberof BillingApissioInsertionOrdersStatusGetByPinOrderId
     */
    pinOrderId: string
}

export interface BillingApiSsioOrderLinesGetByAdAccountRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BillingApissioOrderLinesGetByAdAccount
     */
    adAccountId: string
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof BillingApissioOrderLinesGetByAdAccount
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof BillingApissioOrderLinesGetByAdAccount
     */
    pageSize?: number
    /**
     * The pin order id associated with the ssio insertino order
     * @type string
     * @memberof BillingApissioOrderLinesGetByAdAccount
     */
    pinOrderId?: string
}

export class ObjectBillingApi {
    private api: ObservableBillingApi

    public constructor(configuration: Configuration, requestFactory?: BillingApiRequestFactory, responseProcessor?: BillingApiResponseProcessor) {
        this.api = new ObservableBillingApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Redeem ad credits
     * @param param the request object
     */
    public adsCreditRedeemWithHttpInfo(param: BillingApiAdsCreditRedeemRequest, options?: Configuration): Promise<HttpInfo<AdsCreditRedeemResponse>> {
        return this.api.adsCreditRedeemWithHttpInfo(param.adAccountId, param.adsCreditRedeemRequest,  options).toPromise();
    }

    /**
     * Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Redeem ad credits
     * @param param the request object
     */
    public adsCreditRedeem(param: BillingApiAdsCreditRedeemRequest, options?: Configuration): Promise<AdsCreditRedeemResponse> {
        return this.api.adsCreditRedeem(param.adAccountId, param.adsCreditRedeemRequest,  options).toPromise();
    }

    /**
     * Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get ads credit discounts
     * @param param the request object
     */
    public adsCreditsDiscountsGetWithHttpInfo(param: BillingApiAdsCreditsDiscountsGetRequest, options?: Configuration): Promise<HttpInfo<AdsCreditsDiscountsGet200Response>> {
        return this.api.adsCreditsDiscountsGetWithHttpInfo(param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get ads credit discounts
     * @param param the request object
     */
    public adsCreditsDiscountsGet(param: BillingApiAdsCreditsDiscountsGetRequest, options?: Configuration): Promise<AdsCreditsDiscountsGet200Response> {
        return this.api.adsCreditsDiscountsGet(param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get billing profiles
     * @param param the request object
     */
    public billingProfilesGetWithHttpInfo(param: BillingApiBillingProfilesGetRequest, options?: Configuration): Promise<HttpInfo<BillingProfilesGet200Response>> {
        return this.api.billingProfilesGetWithHttpInfo(param.adAccountId, param.isActive, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get billing profiles
     * @param param the request object
     */
    public billingProfilesGet(param: BillingApiBillingProfilesGetRequest, options?: Configuration): Promise<BillingProfilesGet200Response> {
        return this.api.billingProfilesGet(param.adAccountId, param.isActive, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get Salesforce account details including bill-to information.
     * @param param the request object
     */
    public ssioAccountsGetWithHttpInfo(param: BillingApiSsioAccountsGetRequest, options?: Configuration): Promise<HttpInfo<SSIOAccountResponse>> {
        return this.api.ssioAccountsGetWithHttpInfo(param.adAccountId,  options).toPromise();
    }

    /**
     * Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get Salesforce account details including bill-to information.
     * @param param the request object
     */
    public ssioAccountsGet(param: BillingApiSsioAccountsGetRequest, options?: Configuration): Promise<SSIOAccountResponse> {
        return this.api.ssioAccountsGet(param.adAccountId,  options).toPromise();
    }

    /**
     * Create insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Create insertion order through SSIO.
     * @param param the request object
     */
    public ssioInsertionOrderCreateWithHttpInfo(param: BillingApiSsioInsertionOrderCreateRequest, options?: Configuration): Promise<HttpInfo<SSIOCreateInsertionOrderResponse>> {
        return this.api.ssioInsertionOrderCreateWithHttpInfo(param.adAccountId, param.sSIOCreateInsertionOrderRequest,  options).toPromise();
    }

    /**
     * Create insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Create insertion order through SSIO.
     * @param param the request object
     */
    public ssioInsertionOrderCreate(param: BillingApiSsioInsertionOrderCreateRequest, options?: Configuration): Promise<SSIOCreateInsertionOrderResponse> {
        return this.api.ssioInsertionOrderCreate(param.adAccountId, param.sSIOCreateInsertionOrderRequest,  options).toPromise();
    }

    /**
     * Edit insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Edit insertion order through SSIO.
     * @param param the request object
     */
    public ssioInsertionOrderEditWithHttpInfo(param: BillingApiSsioInsertionOrderEditRequest, options?: Configuration): Promise<HttpInfo<SSIOEditInsertionOrderResponse>> {
        return this.api.ssioInsertionOrderEditWithHttpInfo(param.adAccountId, param.sSIOEditInsertionOrderRequest,  options).toPromise();
    }

    /**
     * Edit insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Edit insertion order through SSIO.
     * @param param the request object
     */
    public ssioInsertionOrderEdit(param: BillingApiSsioInsertionOrderEditRequest, options?: Configuration): Promise<SSIOEditInsertionOrderResponse> {
        return this.api.ssioInsertionOrderEdit(param.adAccountId, param.sSIOEditInsertionOrderRequest,  options).toPromise();
    }

    /**
     * Get insertion order status for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get insertion order status by ad account id.
     * @param param the request object
     */
    public ssioInsertionOrdersStatusGetByAdAccountWithHttpInfo(param: BillingApiSsioInsertionOrdersStatusGetByAdAccountRequest, options?: Configuration): Promise<HttpInfo<SsioInsertionOrdersStatusGetByAdAccount200Response>> {
        return this.api.ssioInsertionOrdersStatusGetByAdAccountWithHttpInfo(param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get insertion order status for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get insertion order status by ad account id.
     * @param param the request object
     */
    public ssioInsertionOrdersStatusGetByAdAccount(param: BillingApiSsioInsertionOrdersStatusGetByAdAccountRequest, options?: Configuration): Promise<SsioInsertionOrdersStatusGetByAdAccount200Response> {
        return this.api.ssioInsertionOrdersStatusGetByAdAccount(param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get insertion order status for pin order id <code>pin_order_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get insertion order status by pin order id.
     * @param param the request object
     */
    public ssioInsertionOrdersStatusGetByPinOrderIdWithHttpInfo(param: BillingApiSsioInsertionOrdersStatusGetByPinOrderIdRequest, options?: Configuration): Promise<HttpInfo<SSIOInsertionOrderStatusResponse>> {
        return this.api.ssioInsertionOrdersStatusGetByPinOrderIdWithHttpInfo(param.adAccountId, param.pinOrderId,  options).toPromise();
    }

    /**
     * Get insertion order status for pin order id <code>pin_order_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get insertion order status by pin order id.
     * @param param the request object
     */
    public ssioInsertionOrdersStatusGetByPinOrderId(param: BillingApiSsioInsertionOrdersStatusGetByPinOrderIdRequest, options?: Configuration): Promise<SSIOInsertionOrderStatusResponse> {
        return this.api.ssioInsertionOrdersStatusGetByPinOrderId(param.adAccountId, param.pinOrderId,  options).toPromise();
    }

    /**
     * Get Salesforce order lines for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get Salesforce order lines by ad account id.
     * @param param the request object
     */
    public ssioOrderLinesGetByAdAccountWithHttpInfo(param: BillingApiSsioOrderLinesGetByAdAccountRequest, options?: Configuration): Promise<HttpInfo<SsioOrderLinesGetByAdAccount200Response>> {
        return this.api.ssioOrderLinesGetByAdAccountWithHttpInfo(param.adAccountId, param.bookmark, param.pageSize, param.pinOrderId,  options).toPromise();
    }

    /**
     * Get Salesforce order lines for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get Salesforce order lines by ad account id.
     * @param param the request object
     */
    public ssioOrderLinesGetByAdAccount(param: BillingApiSsioOrderLinesGetByAdAccountRequest, options?: Configuration): Promise<SsioOrderLinesGetByAdAccount200Response> {
        return this.api.ssioOrderLinesGetByAdAccount(param.adAccountId, param.bookmark, param.pageSize, param.pinOrderId,  options).toPromise();
    }

}

import { ObservableBoardsApi } from "./ObservableAPI";
import { BoardsApiRequestFactory, BoardsApiResponseProcessor} from "../apis/BoardsApi";

export interface BoardsApiBoardSectionsCreateRequest {
    /**
     * Unique identifier of a board.
     * @type string
     * @memberof BoardsApiboardSectionsCreate
     */
    boardId: string
    /**
     * Create a board section.
     * @type BoardSection
     * @memberof BoardsApiboardSectionsCreate
     */
    boardSection: BoardSection
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BoardsApiboardSectionsCreate
     */
    adAccountId?: string
}

export interface BoardsApiBoardSectionsDeleteRequest {
    /**
     * Unique identifier of a board.
     * @type string
     * @memberof BoardsApiboardSectionsDelete
     */
    boardId: string
    /**
     * Unique identifier of a board section.
     * @type string
     * @memberof BoardsApiboardSectionsDelete
     */
    sectionId: string
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BoardsApiboardSectionsDelete
     */
    adAccountId?: string
}

export interface BoardsApiBoardSectionsListRequest {
    /**
     * Unique identifier of a board.
     * @type string
     * @memberof BoardsApiboardSectionsList
     */
    boardId: string
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BoardsApiboardSectionsList
     */
    adAccountId?: string
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof BoardsApiboardSectionsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof BoardsApiboardSectionsList
     */
    pageSize?: number
}

export interface BoardsApiBoardSectionsListPinsRequest {
    /**
     * Unique identifier of a board.
     * @type string
     * @memberof BoardsApiboardSectionsListPins
     */
    boardId: string
    /**
     * Unique identifier of a board section.
     * @type string
     * @memberof BoardsApiboardSectionsListPins
     */
    sectionId: string
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BoardsApiboardSectionsListPins
     */
    adAccountId?: string
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof BoardsApiboardSectionsListPins
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof BoardsApiboardSectionsListPins
     */
    pageSize?: number
}

export interface BoardsApiBoardSectionsUpdateRequest {
    /**
     * Unique identifier of a board.
     * @type string
     * @memberof BoardsApiboardSectionsUpdate
     */
    boardId: string
    /**
     * Unique identifier of a board section.
     * @type string
     * @memberof BoardsApiboardSectionsUpdate
     */
    sectionId: string
    /**
     * Update a board section.
     * @type BoardSection
     * @memberof BoardsApiboardSectionsUpdate
     */
    boardSection: BoardSection
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BoardsApiboardSectionsUpdate
     */
    adAccountId?: string
}

export interface BoardsApiBoardsCreateRequest {
    /**
     * Create a board using a single board json object.
     * @type Board
     * @memberof BoardsApiboardsCreate
     */
    board: Board
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BoardsApiboardsCreate
     */
    adAccountId?: string
}

export interface BoardsApiBoardsDeleteRequest {
    /**
     * Unique identifier of a board.
     * @type string
     * @memberof BoardsApiboardsDelete
     */
    boardId: string
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BoardsApiboardsDelete
     */
    adAccountId?: string
}

export interface BoardsApiBoardsGetRequest {
    /**
     * Unique identifier of a board.
     * @type string
     * @memberof BoardsApiboardsGet
     */
    boardId: string
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BoardsApiboardsGet
     */
    adAccountId?: string
}

export interface BoardsApiBoardsListRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BoardsApiboardsList
     */
    adAccountId?: string
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof BoardsApiboardsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof BoardsApiboardsList
     */
    pageSize?: number
    /**
     * Privacy setting for a board.
     * @type &#39;ALL&#39; | &#39;PROTECTED&#39; | &#39;PUBLIC&#39; | &#39;SECRET&#39; | &#39;PUBLIC_AND_SECRET&#39;
     * @memberof BoardsApiboardsList
     */
    privacy?: 'ALL' | 'PROTECTED' | 'PUBLIC' | 'SECRET' | 'PUBLIC_AND_SECRET'
}

export interface BoardsApiBoardsListPinsRequest {
    /**
     * Unique identifier of a board.
     * @type string
     * @memberof BoardsApiboardsListPins
     */
    boardId: string
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof BoardsApiboardsListPins
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof BoardsApiboardsListPins
     */
    pageSize?: number
    /**
     * Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
     * @type Array&lt;&#39;REGULAR&#39; | &#39;VIDEO&#39; | &#39;SHOPPING&#39; | &#39;CAROUSEL&#39; | &#39;MAX_VIDEO&#39; | &#39;SHOP_THE_PIN&#39; | &#39;COLLECTION&#39; | &#39;IDEA&#39;&gt;
     * @memberof BoardsApiboardsListPins
     */
    creativeTypes?: Array<'REGULAR' | 'VIDEO' | 'SHOPPING' | 'CAROUSEL' | 'MAX_VIDEO' | 'SHOP_THE_PIN' | 'COLLECTION' | 'IDEA'>
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BoardsApiboardsListPins
     */
    adAccountId?: string
    /**
     * Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * @type boolean
     * @memberof BoardsApiboardsListPins
     */
    pinMetrics?: boolean
}

export interface BoardsApiBoardsUpdateRequest {
    /**
     * Unique identifier of a board.
     * @type string
     * @memberof BoardsApiboardsUpdate
     */
    boardId: string
    /**
     * Update a board.
     * @type BoardUpdate
     * @memberof BoardsApiboardsUpdate
     */
    boardUpdate: BoardUpdate
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BoardsApiboardsUpdate
     */
    adAccountId?: string
}

export class ObjectBoardsApi {
    private api: ObservableBoardsApi

    public constructor(configuration: Configuration, requestFactory?: BoardsApiRequestFactory, responseProcessor?: BoardsApiResponseProcessor) {
        this.api = new ObservableBoardsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Create board section
     * @param param the request object
     */
    public boardSectionsCreateWithHttpInfo(param: BoardsApiBoardSectionsCreateRequest, options?: Configuration): Promise<HttpInfo<BoardSection>> {
        return this.api.boardSectionsCreateWithHttpInfo(param.boardId, param.boardSection, param.adAccountId,  options).toPromise();
    }

    /**
     * Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Create board section
     * @param param the request object
     */
    public boardSectionsCreate(param: BoardsApiBoardSectionsCreateRequest, options?: Configuration): Promise<BoardSection> {
        return this.api.boardSectionsCreate(param.boardId, param.boardSection, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Delete board section
     * @param param the request object
     */
    public boardSectionsDeleteWithHttpInfo(param: BoardsApiBoardSectionsDeleteRequest, options?: Configuration): Promise<HttpInfo<void>> {
        return this.api.boardSectionsDeleteWithHttpInfo(param.boardId, param.sectionId, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Delete board section
     * @param param the request object
     */
    public boardSectionsDelete(param: BoardsApiBoardSectionsDeleteRequest, options?: Configuration): Promise<void> {
        return this.api.boardSectionsDelete(param.boardId, param.sectionId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List board sections
     * @param param the request object
     */
    public boardSectionsListWithHttpInfo(param: BoardsApiBoardSectionsListRequest, options?: Configuration): Promise<HttpInfo<BoardSectionsList200Response>> {
        return this.api.boardSectionsListWithHttpInfo(param.boardId, param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List board sections
     * @param param the request object
     */
    public boardSectionsList(param: BoardsApiBoardSectionsListRequest, options?: Configuration): Promise<BoardSectionsList200Response> {
        return this.api.boardSectionsList(param.boardId, param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List Pins on board section
     * @param param the request object
     */
    public boardSectionsListPinsWithHttpInfo(param: BoardsApiBoardSectionsListPinsRequest, options?: Configuration): Promise<HttpInfo<BoardsListPins200Response>> {
        return this.api.boardSectionsListPinsWithHttpInfo(param.boardId, param.sectionId, param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List Pins on board section
     * @param param the request object
     */
    public boardSectionsListPins(param: BoardsApiBoardSectionsListPinsRequest, options?: Configuration): Promise<BoardsListPins200Response> {
        return this.api.boardSectionsListPins(param.boardId, param.sectionId, param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Update board section
     * @param param the request object
     */
    public boardSectionsUpdateWithHttpInfo(param: BoardsApiBoardSectionsUpdateRequest, options?: Configuration): Promise<HttpInfo<BoardSection>> {
        return this.api.boardSectionsUpdateWithHttpInfo(param.boardId, param.sectionId, param.boardSection, param.adAccountId,  options).toPromise();
    }

    /**
     * Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Update board section
     * @param param the request object
     */
    public boardSectionsUpdate(param: BoardsApiBoardSectionsUpdateRequest, options?: Configuration): Promise<BoardSection> {
        return this.api.boardSectionsUpdate(param.boardId, param.sectionId, param.boardSection, param.adAccountId,  options).toPromise();
    }

    /**
     * Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Create board
     * @param param the request object
     */
    public boardsCreateWithHttpInfo(param: BoardsApiBoardsCreateRequest, options?: Configuration): Promise<HttpInfo<Board>> {
        return this.api.boardsCreateWithHttpInfo(param.board, param.adAccountId,  options).toPromise();
    }

    /**
     * Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Create board
     * @param param the request object
     */
    public boardsCreate(param: BoardsApiBoardsCreateRequest, options?: Configuration): Promise<Board> {
        return this.api.boardsCreate(param.board, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Delete board
     * @param param the request object
     */
    public boardsDeleteWithHttpInfo(param: BoardsApiBoardsDeleteRequest, options?: Configuration): Promise<HttpInfo<void>> {
        return this.api.boardsDeleteWithHttpInfo(param.boardId, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Delete board
     * @param param the request object
     */
    public boardsDelete(param: BoardsApiBoardsDeleteRequest, options?: Configuration): Promise<void> {
        return this.api.boardsDelete(param.boardId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Get board
     * @param param the request object
     */
    public boardsGetWithHttpInfo(param: BoardsApiBoardsGetRequest, options?: Configuration): Promise<HttpInfo<Board>> {
        return this.api.boardsGetWithHttpInfo(param.boardId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Get board
     * @param param the request object
     */
    public boardsGet(param: BoardsApiBoardsGetRequest, options?: Configuration): Promise<Board> {
        return this.api.boardsGet(param.boardId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
     * List boards
     * @param param the request object
     */
    public boardsListWithHttpInfo(param: BoardsApiBoardsListRequest = {}, options?: Configuration): Promise<HttpInfo<BoardsList200Response>> {
        return this.api.boardsListWithHttpInfo(param.adAccountId, param.bookmark, param.pageSize, param.privacy,  options).toPromise();
    }

    /**
     * Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
     * List boards
     * @param param the request object
     */
    public boardsList(param: BoardsApiBoardsListRequest = {}, options?: Configuration): Promise<BoardsList200Response> {
        return this.api.boardsList(param.adAccountId, param.bookmark, param.pageSize, param.privacy,  options).toPromise();
    }

    /**
     * Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List Pins on board
     * @param param the request object
     */
    public boardsListPinsWithHttpInfo(param: BoardsApiBoardsListPinsRequest, options?: Configuration): Promise<HttpInfo<BoardsListPins200Response>> {
        return this.api.boardsListPinsWithHttpInfo(param.boardId, param.bookmark, param.pageSize, param.creativeTypes, param.adAccountId, param.pinMetrics,  options).toPromise();
    }

    /**
     * Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List Pins on board
     * @param param the request object
     */
    public boardsListPins(param: BoardsApiBoardsListPinsRequest, options?: Configuration): Promise<BoardsListPins200Response> {
        return this.api.boardsListPins(param.boardId, param.bookmark, param.pageSize, param.creativeTypes, param.adAccountId, param.pinMetrics,  options).toPromise();
    }

    /**
     * Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Update board
     * @param param the request object
     */
    public boardsUpdateWithHttpInfo(param: BoardsApiBoardsUpdateRequest, options?: Configuration): Promise<HttpInfo<Board>> {
        return this.api.boardsUpdateWithHttpInfo(param.boardId, param.boardUpdate, param.adAccountId,  options).toPromise();
    }

    /**
     * Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Update board
     * @param param the request object
     */
    public boardsUpdate(param: BoardsApiBoardsUpdateRequest, options?: Configuration): Promise<Board> {
        return this.api.boardsUpdate(param.boardId, param.boardUpdate, param.adAccountId,  options).toPromise();
    }

}

import { ObservableBulkApi } from "./ObservableAPI";
import { BulkApiRequestFactory, BulkApiResponseProcessor} from "../apis/BulkApi";

export interface BulkApiBulkDownloadCreateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BulkApibulkDownloadCreate
     */
    adAccountId: string
    /**
     * Parameters to get ad entities in bulk
     * @type BulkDownloadRequest
     * @memberof BulkApibulkDownloadCreate
     */
    bulkDownloadRequest: BulkDownloadRequest
}

export interface BulkApiBulkRequestGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BulkApibulkRequestGet
     */
    adAccountId: string
    /**
     * Unique identifier of a bulk upsert request.
     * @type string
     * @memberof BulkApibulkRequestGet
     */
    bulkRequestId: string
    /**
     * if set to True then attach the errors/details to all the requests
     * @type boolean
     * @memberof BulkApibulkRequestGet
     */
    includeDetails?: boolean
}

export interface BulkApiBulkUpsertCreateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof BulkApibulkUpsertCreate
     */
    adAccountId: string
    /**
     * Parameters to get create/update ad entities in bulk
     * @type BulkUpsertRequest
     * @memberof BulkApibulkUpsertCreate
     */
    bulkUpsertRequest: BulkUpsertRequest
}

export class ObjectBulkApi {
    private api: ObservableBulkApi

    public constructor(configuration: Configuration, requestFactory?: BulkApiRequestFactory, responseProcessor?: BulkApiResponseProcessor) {
        this.api = new ObservableBulkApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
     * Get advertiser entities in bulk
     * @param param the request object
     */
    public bulkDownloadCreateWithHttpInfo(param: BulkApiBulkDownloadCreateRequest, options?: Configuration): Promise<HttpInfo<BulkDownloadResponse>> {
        return this.api.bulkDownloadCreateWithHttpInfo(param.adAccountId, param.bulkDownloadRequest,  options).toPromise();
    }

    /**
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
     * Get advertiser entities in bulk
     * @param param the request object
     */
    public bulkDownloadCreate(param: BulkApiBulkDownloadCreateRequest, options?: Configuration): Promise<BulkDownloadResponse> {
        return this.api.bulkDownloadCreate(param.adAccountId, param.bulkDownloadRequest,  options).toPromise();
    }

    /**
     * Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
     * Download advertiser entities in bulk
     * @param param the request object
     */
    public bulkRequestGetWithHttpInfo(param: BulkApiBulkRequestGetRequest, options?: Configuration): Promise<HttpInfo<BulkUpsertStatusResponse>> {
        return this.api.bulkRequestGetWithHttpInfo(param.adAccountId, param.bulkRequestId, param.includeDetails,  options).toPromise();
    }

    /**
     * Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
     * Download advertiser entities in bulk
     * @param param the request object
     */
    public bulkRequestGet(param: BulkApiBulkRequestGetRequest, options?: Configuration): Promise<BulkUpsertStatusResponse> {
        return this.api.bulkRequestGet(param.adAccountId, param.bulkRequestId, param.includeDetails,  options).toPromise();
    }

    /**
     * Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
     * Create/update ad entities in bulk
     * @param param the request object
     */
    public bulkUpsertCreateWithHttpInfo(param: BulkApiBulkUpsertCreateRequest, options?: Configuration): Promise<HttpInfo<BulkUpsertResponse>> {
        return this.api.bulkUpsertCreateWithHttpInfo(param.adAccountId, param.bulkUpsertRequest,  options).toPromise();
    }

    /**
     * Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
     * Create/update ad entities in bulk
     * @param param the request object
     */
    public bulkUpsertCreate(param: BulkApiBulkUpsertCreateRequest, options?: Configuration): Promise<BulkUpsertResponse> {
        return this.api.bulkUpsertCreate(param.adAccountId, param.bulkUpsertRequest,  options).toPromise();
    }

}

import { ObservableCampaignsApi } from "./ObservableAPI";
import { CampaignsApiRequestFactory, CampaignsApiResponseProcessor} from "../apis/CampaignsApi";

export interface CampaignsApiCampaignTargetingAnalyticsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    adAccountId: string
    /**
     * List of Campaign Ids to use to filter the results.
     * @type Array&lt;string&gt;
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    campaignIds: Array<string>
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @type string
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @type string
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    endDate: string
    /**
     * Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.
     * @type Array&lt;AdsAnalyticsTargetingType&gt;
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    targetingTypes: Array<AdsAnalyticsTargetingType>
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;VIDEO_LENGTH&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @type Granularity
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
    /**
     * List of types of attribution for the conversion report
     * @type ConversionReportAttributionType
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    attributionTypes?: ConversionReportAttributionType
}

export interface CampaignsApiCampaignsAnalyticsRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CampaignsApicampaignsAnalytics
     */
    adAccountId: string
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @type string
     * @memberof CampaignsApicampaignsAnalytics
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @type string
     * @memberof CampaignsApicampaignsAnalytics
     */
    endDate: string
    /**
     * List of Campaign Ids to use to filter the results.
     * @type Array&lt;string&gt;
     * @memberof CampaignsApicampaignsAnalytics
     */
    campaignIds: Array<string>
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;VIDEO_LENGTH&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof CampaignsApicampaignsAnalytics
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @type Granularity
     * @memberof CampaignsApicampaignsAnalytics
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof CampaignsApicampaignsAnalytics
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof CampaignsApicampaignsAnalytics
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof CampaignsApicampaignsAnalytics
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof CampaignsApicampaignsAnalytics
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
}

export interface CampaignsApiCampaignsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CampaignsApicampaignsCreate
     */
    adAccountId: string
    /**
     * Array of campaigns.
     * @type Array&lt;CampaignCreateRequest&gt;
     * @memberof CampaignsApicampaignsCreate
     */
    campaignCreateRequest: Array<CampaignCreateRequest>
}

export interface CampaignsApiCampaignsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CampaignsApicampaignsGet
     */
    adAccountId: string
    /**
     * Campaign ID, must be associated with the ad account ID provided in the path.
     * @type string
     * @memberof CampaignsApicampaignsGet
     */
    campaignId: string
}

export interface CampaignsApiCampaignsListRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CampaignsApicampaignsList
     */
    adAccountId: string
    /**
     * List of Campaign Ids to use to filter the results.
     * @type Array&lt;string&gt;
     * @memberof CampaignsApicampaignsList
     */
    campaignIds?: Array<string>
    /**
     * Entity status
     * @type Array&lt;&#39;ACTIVE&#39; | &#39;PAUSED&#39; | &#39;ARCHIVED&#39; | &#39;DRAFT&#39; | &#39;DELETED_DRAFT&#39;&gt;
     * @memberof CampaignsApicampaignsList
     */
    entityStatuses?: Array<'ACTIVE' | 'PAUSED' | 'ARCHIVED' | 'DRAFT' | 'DELETED_DRAFT'>
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof CampaignsApicampaignsList
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof CampaignsApicampaignsList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof CampaignsApicampaignsList
     */
    bookmark?: string
}

export interface CampaignsApiCampaignsUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CampaignsApicampaignsUpdate
     */
    adAccountId: string
    /**
     * Array of campaigns.
     * @type Array&lt;CampaignUpdateRequest&gt;
     * @memberof CampaignsApicampaignsUpdate
     */
    campaignUpdateRequest: Array<CampaignUpdateRequest>
}

export class ObjectCampaignsApi {
    private api: ObservableCampaignsApi

    public constructor(configuration: Configuration, requestFactory?: CampaignsApiRequestFactory, responseProcessor?: CampaignsApiResponseProcessor) {
        this.api = new ObservableCampaignsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get targeting analytics for campaigns
     * @param param the request object
     */
    public campaignTargetingAnalyticsGetWithHttpInfo(param: CampaignsApiCampaignTargetingAnalyticsGetRequest, options?: Configuration): Promise<HttpInfo<MetricsResponse>> {
        return this.api.campaignTargetingAnalyticsGetWithHttpInfo(param.adAccountId, param.campaignIds, param.startDate, param.endDate, param.targetingTypes, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.attributionTypes,  options).toPromise();
    }

    /**
     * Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get targeting analytics for campaigns
     * @param param the request object
     */
    public campaignTargetingAnalyticsGet(param: CampaignsApiCampaignTargetingAnalyticsGetRequest, options?: Configuration): Promise<MetricsResponse> {
        return this.api.campaignTargetingAnalyticsGet(param.adAccountId, param.campaignIds, param.startDate, param.endDate, param.targetingTypes, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.attributionTypes,  options).toPromise();
    }

    /**
     * Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get campaign analytics
     * @param param the request object
     */
    public campaignsAnalyticsWithHttpInfo(param: CampaignsApiCampaignsAnalyticsRequest, options?: Configuration): Promise<HttpInfo<Array<CampaignsAnalyticsResponseInner>>> {
        return this.api.campaignsAnalyticsWithHttpInfo(param.adAccountId, param.startDate, param.endDate, param.campaignIds, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime,  options).toPromise();
    }

    /**
     * Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get campaign analytics
     * @param param the request object
     */
    public campaignsAnalytics(param: CampaignsApiCampaignsAnalyticsRequest, options?: Configuration): Promise<Array<CampaignsAnalyticsResponseInner>> {
        return this.api.campaignsAnalytics(param.adAccountId, param.startDate, param.endDate, param.campaignIds, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime,  options).toPromise();
    }

    /**
     * Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for \'lifetime_spend_cap\' and \'daily_spend_cap\' are microcurrency amounts based on the currency field set in the advertiser\'s profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
     * Create campaigns
     * @param param the request object
     */
    public campaignsCreateWithHttpInfo(param: CampaignsApiCampaignsCreateRequest, options?: Configuration): Promise<HttpInfo<CampaignCreateResponse>> {
        return this.api.campaignsCreateWithHttpInfo(param.adAccountId, param.campaignCreateRequest,  options).toPromise();
    }

    /**
     * Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for \'lifetime_spend_cap\' and \'daily_spend_cap\' are microcurrency amounts based on the currency field set in the advertiser\'s profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
     * Create campaigns
     * @param param the request object
     */
    public campaignsCreate(param: CampaignsApiCampaignsCreateRequest, options?: Configuration): Promise<CampaignCreateResponse> {
        return this.api.campaignsCreate(param.adAccountId, param.campaignCreateRequest,  options).toPromise();
    }

    /**
     * Get a specific campaign given the campaign ID.
     * Get campaign
     * @param param the request object
     */
    public campaignsGetWithHttpInfo(param: CampaignsApiCampaignsGetRequest, options?: Configuration): Promise<HttpInfo<CampaignResponse>> {
        return this.api.campaignsGetWithHttpInfo(param.adAccountId, param.campaignId,  options).toPromise();
    }

    /**
     * Get a specific campaign given the campaign ID.
     * Get campaign
     * @param param the request object
     */
    public campaignsGet(param: CampaignsApiCampaignsGetRequest, options?: Configuration): Promise<CampaignResponse> {
        return this.api.campaignsGet(param.adAccountId, param.campaignId,  options).toPromise();
    }

    /**
     * Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
     * List campaigns
     * @param param the request object
     */
    public campaignsListWithHttpInfo(param: CampaignsApiCampaignsListRequest, options?: Configuration): Promise<HttpInfo<CampaignsList200Response>> {
        return this.api.campaignsListWithHttpInfo(param.adAccountId, param.campaignIds, param.entityStatuses, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
     * List campaigns
     * @param param the request object
     */
    public campaignsList(param: CampaignsApiCampaignsListRequest, options?: Configuration): Promise<CampaignsList200Response> {
        return this.api.campaignsList(param.adAccountId, param.campaignIds, param.entityStatuses, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/> - <p>The values for \'lifetime_spend_cap\' and \'daily_spend_cap\' are microcurrency amounts based on the currency field set in the advertiser\'s profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
     * Update campaigns
     * @param param the request object
     */
    public campaignsUpdateWithHttpInfo(param: CampaignsApiCampaignsUpdateRequest, options?: Configuration): Promise<HttpInfo<CampaignUpdateResponse>> {
        return this.api.campaignsUpdateWithHttpInfo(param.adAccountId, param.campaignUpdateRequest,  options).toPromise();
    }

    /**
     * Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/> - <p>The values for \'lifetime_spend_cap\' and \'daily_spend_cap\' are microcurrency amounts based on the currency field set in the advertiser\'s profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
     * Update campaigns
     * @param param the request object
     */
    public campaignsUpdate(param: CampaignsApiCampaignsUpdateRequest, options?: Configuration): Promise<CampaignUpdateResponse> {
        return this.api.campaignsUpdate(param.adAccountId, param.campaignUpdateRequest,  options).toPromise();
    }

}

import { ObservableCatalogsApi } from "./ObservableAPI";
import { CatalogsApiRequestFactory, CatalogsApiResponseProcessor} from "../apis/CatalogsApi";

export interface CatalogsApiCatalogsListRequest {
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof CatalogsApicatalogsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof CatalogsApicatalogsList
     */
    pageSize?: number
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApicatalogsList
     */
    adAccountId?: string
}

export interface CatalogsApiCatalogsProductGroupPinsListRequest {
    /**
     * Unique identifier of a product group
     * @type string
     * @memberof CatalogsApicatalogsProductGroupPinsList
     */
    productGroupId: string
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof CatalogsApicatalogsProductGroupPinsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof CatalogsApicatalogsProductGroupPinsList
     */
    pageSize?: number
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApicatalogsProductGroupPinsList
     */
    adAccountId?: string
}

export interface CatalogsApiCatalogsProductGroupsCreateRequest {
    /**
     * Request object used to created a catalogs product group.
     * @type CatalogsProductGroupsCreateRequest
     * @memberof CatalogsApicatalogsProductGroupsCreate
     */
    catalogsProductGroupsCreateRequest: CatalogsProductGroupsCreateRequest
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApicatalogsProductGroupsCreate
     */
    adAccountId?: string
}

export interface CatalogsApiCatalogsProductGroupsDeleteRequest {
    /**
     * Unique identifier of a product group
     * @type string
     * @memberof CatalogsApicatalogsProductGroupsDelete
     */
    productGroupId: string
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApicatalogsProductGroupsDelete
     */
    adAccountId?: string
}

export interface CatalogsApiCatalogsProductGroupsGetRequest {
    /**
     * Unique identifier of a product group
     * @type string
     * @memberof CatalogsApicatalogsProductGroupsGet
     */
    productGroupId: string
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApicatalogsProductGroupsGet
     */
    adAccountId?: string
}

export interface CatalogsApiCatalogsProductGroupsListRequest {
    /**
     * Filter entities for a given feed_id. If not given, all feeds are considered.
     * @type string
     * @memberof CatalogsApicatalogsProductGroupsList
     */
    feedId?: string
    /**
     * Filter entities for a given catalog_id. If not given, all catalogs are considered.
     * @type string
     * @memberof CatalogsApicatalogsProductGroupsList
     */
    catalogId?: string
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof CatalogsApicatalogsProductGroupsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof CatalogsApicatalogsProductGroupsList
     */
    pageSize?: number
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApicatalogsProductGroupsList
     */
    adAccountId?: string
}

export interface CatalogsApiCatalogsProductGroupsProductCountsGetRequest {
    /**
     * Unique identifier of a product group
     * @type string
     * @memberof CatalogsApicatalogsProductGroupsProductCountsGet
     */
    productGroupId: string
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApicatalogsProductGroupsProductCountsGet
     */
    adAccountId?: string
}

export interface CatalogsApiCatalogsProductGroupsUpdateRequest {
    /**
     * Unique identifier of a product group
     * @type string
     * @memberof CatalogsApicatalogsProductGroupsUpdate
     */
    productGroupId: string
    /**
     * Request object used to Update a catalogs product group.
     * @type CatalogsProductGroupsUpdateRequest
     * @memberof CatalogsApicatalogsProductGroupsUpdate
     */
    catalogsProductGroupsUpdateRequest: CatalogsProductGroupsUpdateRequest
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApicatalogsProductGroupsUpdate
     */
    adAccountId?: string
}

export interface CatalogsApiFeedProcessingResultsListRequest {
    /**
     * Unique identifier of a feed
     * @type string
     * @memberof CatalogsApifeedProcessingResultsList
     */
    feedId: string
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof CatalogsApifeedProcessingResultsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof CatalogsApifeedProcessingResultsList
     */
    pageSize?: number
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApifeedProcessingResultsList
     */
    adAccountId?: string
}

export interface CatalogsApiFeedsCreateRequest {
    /**
     * Request object used to created a feed.
     * @type FeedsCreateRequest
     * @memberof CatalogsApifeedsCreate
     */
    feedsCreateRequest: FeedsCreateRequest
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApifeedsCreate
     */
    adAccountId?: string
}

export interface CatalogsApiFeedsDeleteRequest {
    /**
     * Unique identifier of a feed
     * @type string
     * @memberof CatalogsApifeedsDelete
     */
    feedId: string
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApifeedsDelete
     */
    adAccountId?: string
}

export interface CatalogsApiFeedsGetRequest {
    /**
     * Unique identifier of a feed
     * @type string
     * @memberof CatalogsApifeedsGet
     */
    feedId: string
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApifeedsGet
     */
    adAccountId?: string
}

export interface CatalogsApiFeedsListRequest {
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof CatalogsApifeedsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof CatalogsApifeedsList
     */
    pageSize?: number
    /**
     * Filter entities for a given catalog_id. If not given, all catalogs are considered.
     * @type string
     * @memberof CatalogsApifeedsList
     */
    catalogId?: string
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApifeedsList
     */
    adAccountId?: string
}

export interface CatalogsApiFeedsUpdateRequest {
    /**
     * Unique identifier of a feed
     * @type string
     * @memberof CatalogsApifeedsUpdate
     */
    feedId: string
    /**
     * Request object used to update a feed.
     * @type FeedsUpdateRequest
     * @memberof CatalogsApifeedsUpdate
     */
    feedsUpdateRequest: FeedsUpdateRequest
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApifeedsUpdate
     */
    adAccountId?: string
}

export interface CatalogsApiItemsBatchGetRequest {
    /**
     * Id of a catalogs items batch to fetch
     * @type string
     * @memberof CatalogsApiitemsBatchGet
     */
    batchId: string
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApiitemsBatchGet
     */
    adAccountId?: string
}

export interface CatalogsApiItemsBatchPostRequest {
    /**
     * Request object used to create catalogs items in a batch
     * @type ItemsBatchPostRequest
     * @memberof CatalogsApiitemsBatchPost
     */
    itemsBatchPostRequest: ItemsBatchPostRequest
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApiitemsBatchPost
     */
    adAccountId?: string
}

export interface CatalogsApiItemsGetRequest {
    /**
     * Country for the Catalogs Items
     * @type string
     * @memberof CatalogsApiitemsGet
     */
    country: string
    /**
     * Language for the Catalogs Items
     * @type string
     * @memberof CatalogsApiitemsGet
     */
    language: string
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApiitemsGet
     */
    adAccountId?: string
    /**
     * This parameter is deprecated. Use filters instead.
     * @type Array&lt;string&gt;
     * @memberof CatalogsApiitemsGet
     */
    itemIds?: Array<string>
    /**
     * Identifies items to be retrieved. This is a required parameter.
     * @type CatalogsItemsFilters
     * @memberof CatalogsApiitemsGet
     */
    filters?: CatalogsItemsFilters
}

export interface CatalogsApiItemsIssuesListRequest {
    /**
     * Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list).
     * @type string
     * @memberof CatalogsApiitemsIssuesList
     */
    processingResultId: string
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof CatalogsApiitemsIssuesList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof CatalogsApiitemsIssuesList
     */
    pageSize?: number
    /**
     * Item number based on order of appearance in the Catalogs Feed. For example, \&#39;0\&#39; refers to first item found in a feed that was downloaded from a \&#39;location\&#39; specified during feed creation.
     * @type Array&lt;number&gt;
     * @memberof CatalogsApiitemsIssuesList
     */
    itemNumbers?: Array<number>
    /**
     * Filter item validation issues that have a given type of item validation issue.
     * @type CatalogsItemValidationIssue
     * @memberof CatalogsApiitemsIssuesList
     */
    itemValidationIssue?: CatalogsItemValidationIssue
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApiitemsIssuesList
     */
    adAccountId?: string
}

export interface CatalogsApiProductsByProductGroupFilterListRequest {
    /**
     * Object holding a group of filters for a catalog product group
     * @type CatalogsListProductsByFilterRequest
     * @memberof CatalogsApiproductsByProductGroupFilterList
     */
    catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof CatalogsApiproductsByProductGroupFilterList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof CatalogsApiproductsByProductGroupFilterList
     */
    pageSize?: number
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CatalogsApiproductsByProductGroupFilterList
     */
    adAccountId?: string
}

export class ObjectCatalogsApi {
    private api: ObservableCatalogsApi

    public constructor(configuration: Configuration, requestFactory?: CatalogsApiRequestFactory, responseProcessor?: CatalogsApiResponseProcessor) {
        this.api = new ObservableCatalogsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List catalogs
     * @param param the request object
     */
    public catalogsListWithHttpInfo(param: CatalogsApiCatalogsListRequest = {}, options?: Configuration): Promise<HttpInfo<CatalogsList200Response>> {
        return this.api.catalogsListWithHttpInfo(param.bookmark, param.pageSize, param.adAccountId,  options).toPromise();
    }

    /**
     * Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List catalogs
     * @param param the request object
     */
    public catalogsList(param: CatalogsApiCatalogsListRequest = {}, options?: Configuration): Promise<CatalogsList200Response> {
        return this.api.catalogsList(param.bookmark, param.pageSize, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List products for a Product Group
     * @param param the request object
     */
    public catalogsProductGroupPinsListWithHttpInfo(param: CatalogsApiCatalogsProductGroupPinsListRequest, options?: Configuration): Promise<HttpInfo<CatalogsProductGroupPinsList200Response>> {
        return this.api.catalogsProductGroupPinsListWithHttpInfo(param.productGroupId, param.bookmark, param.pageSize, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List products for a Product Group
     * @param param the request object
     */
    public catalogsProductGroupPinsList(param: CatalogsApiCatalogsProductGroupPinsListRequest, options?: Configuration): Promise<CatalogsProductGroupPinsList200Response> {
        return this.api.catalogsProductGroupPinsList(param.productGroupId, param.bookmark, param.pageSize, param.adAccountId,  options).toPromise();
    }

    /**
     * Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Create product group
     * @param param the request object
     */
    public catalogsProductGroupsCreateWithHttpInfo(param: CatalogsApiCatalogsProductGroupsCreateRequest, options?: Configuration): Promise<HttpInfo<CatalogsProductGroupsCreate201Response>> {
        return this.api.catalogsProductGroupsCreateWithHttpInfo(param.catalogsProductGroupsCreateRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Create product group
     * @param param the request object
     */
    public catalogsProductGroupsCreate(param: CatalogsApiCatalogsProductGroupsCreateRequest, options?: Configuration): Promise<CatalogsProductGroupsCreate201Response> {
        return this.api.catalogsProductGroupsCreate(param.catalogsProductGroupsCreateRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Delete product group
     * @param param the request object
     */
    public catalogsProductGroupsDeleteWithHttpInfo(param: CatalogsApiCatalogsProductGroupsDeleteRequest, options?: Configuration): Promise<HttpInfo<void>> {
        return this.api.catalogsProductGroupsDeleteWithHttpInfo(param.productGroupId, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Delete product group
     * @param param the request object
     */
    public catalogsProductGroupsDelete(param: CatalogsApiCatalogsProductGroupsDeleteRequest, options?: Configuration): Promise<void> {
        return this.api.catalogsProductGroupsDelete(param.productGroupId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Get product group
     * @param param the request object
     */
    public catalogsProductGroupsGetWithHttpInfo(param: CatalogsApiCatalogsProductGroupsGetRequest, options?: Configuration): Promise<HttpInfo<CatalogsProductGroupsCreate201Response>> {
        return this.api.catalogsProductGroupsGetWithHttpInfo(param.productGroupId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Get product group
     * @param param the request object
     */
    public catalogsProductGroupsGet(param: CatalogsApiCatalogsProductGroupsGetRequest, options?: Configuration): Promise<CatalogsProductGroupsCreate201Response> {
        return this.api.catalogsProductGroupsGet(param.productGroupId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List product groups
     * @param param the request object
     */
    public catalogsProductGroupsListWithHttpInfo(param: CatalogsApiCatalogsProductGroupsListRequest = {}, options?: Configuration): Promise<HttpInfo<CatalogsProductGroupsList200Response>> {
        return this.api.catalogsProductGroupsListWithHttpInfo(param.feedId, param.catalogId, param.bookmark, param.pageSize, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List product groups
     * @param param the request object
     */
    public catalogsProductGroupsList(param: CatalogsApiCatalogsProductGroupsListRequest = {}, options?: Configuration): Promise<CatalogsProductGroupsList200Response> {
        return this.api.catalogsProductGroupsList(param.feedId, param.catalogId, param.bookmark, param.pageSize, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Get product counts for a Product Group
     * @param param the request object
     */
    public catalogsProductGroupsProductCountsGetWithHttpInfo(param: CatalogsApiCatalogsProductGroupsProductCountsGetRequest, options?: Configuration): Promise<HttpInfo<CatalogsProductGroupProductCounts>> {
        return this.api.catalogsProductGroupsProductCountsGetWithHttpInfo(param.productGroupId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Get product counts for a Product Group
     * @param param the request object
     */
    public catalogsProductGroupsProductCountsGet(param: CatalogsApiCatalogsProductGroupsProductCountsGetRequest, options?: Configuration): Promise<CatalogsProductGroupProductCounts> {
        return this.api.catalogsProductGroupsProductCountsGet(param.productGroupId, param.adAccountId,  options).toPromise();
    }

    /**
     * Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Update product group
     * @param param the request object
     */
    public catalogsProductGroupsUpdateWithHttpInfo(param: CatalogsApiCatalogsProductGroupsUpdateRequest, options?: Configuration): Promise<HttpInfo<CatalogsProductGroupsCreate201Response>> {
        return this.api.catalogsProductGroupsUpdateWithHttpInfo(param.productGroupId, param.catalogsProductGroupsUpdateRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Update product group
     * @param param the request object
     */
    public catalogsProductGroupsUpdate(param: CatalogsApiCatalogsProductGroupsUpdateRequest, options?: Configuration): Promise<CatalogsProductGroupsCreate201Response> {
        return this.api.catalogsProductGroupsUpdate(param.productGroupId, param.catalogsProductGroupsUpdateRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List processing results for a given feed
     * @param param the request object
     */
    public feedProcessingResultsListWithHttpInfo(param: CatalogsApiFeedProcessingResultsListRequest, options?: Configuration): Promise<HttpInfo<FeedProcessingResultsList200Response>> {
        return this.api.feedProcessingResultsListWithHttpInfo(param.feedId, param.bookmark, param.pageSize, param.adAccountId,  options).toPromise();
    }

    /**
     * Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List processing results for a given feed
     * @param param the request object
     */
    public feedProcessingResultsList(param: CatalogsApiFeedProcessingResultsListRequest, options?: Configuration): Promise<FeedProcessingResultsList200Response> {
        return this.api.feedProcessingResultsList(param.feedId, param.bookmark, param.pageSize, param.adAccountId,  options).toPromise();
    }

    /**
     * Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * Create feed
     * @param param the request object
     */
    public feedsCreateWithHttpInfo(param: CatalogsApiFeedsCreateRequest, options?: Configuration): Promise<HttpInfo<CatalogsFeed>> {
        return this.api.feedsCreateWithHttpInfo(param.feedsCreateRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * Create feed
     * @param param the request object
     */
    public feedsCreate(param: CatalogsApiFeedsCreateRequest, options?: Configuration): Promise<CatalogsFeed> {
        return this.api.feedsCreate(param.feedsCreateRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * Delete feed
     * @param param the request object
     */
    public feedsDeleteWithHttpInfo(param: CatalogsApiFeedsDeleteRequest, options?: Configuration): Promise<HttpInfo<void>> {
        return this.api.feedsDeleteWithHttpInfo(param.feedId, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * Delete feed
     * @param param the request object
     */
    public feedsDelete(param: CatalogsApiFeedsDeleteRequest, options?: Configuration): Promise<void> {
        return this.api.feedsDelete(param.feedId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * Get feed
     * @param param the request object
     */
    public feedsGetWithHttpInfo(param: CatalogsApiFeedsGetRequest, options?: Configuration): Promise<HttpInfo<CatalogsFeed>> {
        return this.api.feedsGetWithHttpInfo(param.feedId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * Get feed
     * @param param the request object
     */
    public feedsGet(param: CatalogsApiFeedsGetRequest, options?: Configuration): Promise<CatalogsFeed> {
        return this.api.feedsGet(param.feedId, param.adAccountId,  options).toPromise();
    }

    /**
     * Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * List feeds
     * @param param the request object
     */
    public feedsListWithHttpInfo(param: CatalogsApiFeedsListRequest = {}, options?: Configuration): Promise<HttpInfo<FeedsList200Response>> {
        return this.api.feedsListWithHttpInfo(param.bookmark, param.pageSize, param.catalogId, param.adAccountId,  options).toPromise();
    }

    /**
     * Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * List feeds
     * @param param the request object
     */
    public feedsList(param: CatalogsApiFeedsListRequest = {}, options?: Configuration): Promise<FeedsList200Response> {
        return this.api.feedsList(param.bookmark, param.pageSize, param.catalogId, param.adAccountId,  options).toPromise();
    }

    /**
     * Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * Update feed
     * @param param the request object
     */
    public feedsUpdateWithHttpInfo(param: CatalogsApiFeedsUpdateRequest, options?: Configuration): Promise<HttpInfo<CatalogsFeed>> {
        return this.api.feedsUpdateWithHttpInfo(param.feedId, param.feedsUpdateRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * Update feed
     * @param param the request object
     */
    public feedsUpdate(param: CatalogsApiFeedsUpdateRequest, options?: Configuration): Promise<CatalogsFeed> {
        return this.api.feedsUpdate(param.feedId, param.feedsUpdateRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * Get catalogs item batch status
     * @param param the request object
     */
    public itemsBatchGetWithHttpInfo(param: CatalogsApiItemsBatchGetRequest, options?: Configuration): Promise<HttpInfo<CatalogsItemsBatch>> {
        return this.api.itemsBatchGetWithHttpInfo(param.batchId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * Get catalogs item batch status
     * @param param the request object
     */
    public itemsBatchGet(param: CatalogsApiItemsBatchGetRequest, options?: Configuration): Promise<CatalogsItemsBatch> {
        return this.api.itemsBatchGet(param.batchId, param.adAccountId,  options).toPromise();
    }

    /**
     * This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * Operate on item batch
     * @param param the request object
     */
    public itemsBatchPostWithHttpInfo(param: CatalogsApiItemsBatchPostRequest, options?: Configuration): Promise<HttpInfo<CatalogsItemsBatch>> {
        return this.api.itemsBatchPostWithHttpInfo(param.itemsBatchPostRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * Operate on item batch
     * @param param the request object
     */
    public itemsBatchPost(param: CatalogsApiItemsBatchPostRequest, options?: Configuration): Promise<CatalogsItemsBatch> {
        return this.api.itemsBatchPost(param.itemsBatchPostRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * Get catalogs items
     * @param param the request object
     */
    public itemsGetWithHttpInfo(param: CatalogsApiItemsGetRequest, options?: Configuration): Promise<HttpInfo<CatalogsItems>> {
        return this.api.itemsGetWithHttpInfo(param.country, param.language, param.adAccountId, param.itemIds, param.filters,  options).toPromise();
    }

    /**
     * Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * Get catalogs items
     * @param param the request object
     */
    public itemsGet(param: CatalogsApiItemsGetRequest, options?: Configuration): Promise<CatalogsItems> {
        return this.api.itemsGet(param.country, param.language, param.adAccountId, param.itemIds, param.filters,  options).toPromise();
    }

    /**
     * List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters \'item_numbers\' and \'item_validation_issue\' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List item issues for a given processing result
     * @param param the request object
     */
    public itemsIssuesListWithHttpInfo(param: CatalogsApiItemsIssuesListRequest, options?: Configuration): Promise<HttpInfo<ItemsIssuesList200Response>> {
        return this.api.itemsIssuesListWithHttpInfo(param.processingResultId, param.bookmark, param.pageSize, param.itemNumbers, param.itemValidationIssue, param.adAccountId,  options).toPromise();
    }

    /**
     * List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters \'item_numbers\' and \'item_validation_issue\' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List item issues for a given processing result
     * @param param the request object
     */
    public itemsIssuesList(param: CatalogsApiItemsIssuesListRequest, options?: Configuration): Promise<ItemsIssuesList200Response> {
        return this.api.itemsIssuesList(param.processingResultId, param.bookmark, param.pageSize, param.itemNumbers, param.itemValidationIssue, param.adAccountId,  options).toPromise();
    }

    /**
     * List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List filtered products
     * @param param the request object
     */
    public productsByProductGroupFilterListWithHttpInfo(param: CatalogsApiProductsByProductGroupFilterListRequest, options?: Configuration): Promise<HttpInfo<CatalogsProductGroupPinsList200Response>> {
        return this.api.productsByProductGroupFilterListWithHttpInfo(param.catalogsListProductsByFilterRequest, param.bookmark, param.pageSize, param.adAccountId,  options).toPromise();
    }

    /**
     * List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List filtered products
     * @param param the request object
     */
    public productsByProductGroupFilterList(param: CatalogsApiProductsByProductGroupFilterListRequest, options?: Configuration): Promise<CatalogsProductGroupPinsList200Response> {
        return this.api.productsByProductGroupFilterList(param.catalogsListProductsByFilterRequest, param.bookmark, param.pageSize, param.adAccountId,  options).toPromise();
    }

}

import { ObservableConversionEventsApi } from "./ObservableAPI";
import { ConversionEventsApiRequestFactory, ConversionEventsApiResponseProcessor} from "../apis/ConversionEventsApi";

export interface ConversionEventsApiEventsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof ConversionEventsApieventsCreate
     */
    adAccountId: string
    /**
     * Conversion events.
     * @type ConversionEvents
     * @memberof ConversionEventsApieventsCreate
     */
    conversionEvents: ConversionEvents
    /**
     * Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.
     * @type boolean
     * @memberof ConversionEventsApieventsCreate
     */
    test?: boolean
}

export class ObjectConversionEventsApi {
    private api: ObservableConversionEventsApi

    public constructor(configuration: Configuration, requestFactory?: ConversionEventsApiRequestFactory, responseProcessor?: ConversionEventsApiResponseProcessor) {
        this.api = new ObservableConversionEventsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/conversions/conversions/\">Conversions Guide</a> for more details. - The token\'s <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
     * Send conversions
     * @param param the request object
     */
    public eventsCreateWithHttpInfo(param: ConversionEventsApiEventsCreateRequest, options?: Configuration): Promise<HttpInfo<ConversionApiResponse>> {
        return this.api.eventsCreateWithHttpInfo(param.adAccountId, param.conversionEvents, param.test,  options).toPromise();
    }

    /**
     * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/conversions/conversions/\">Conversions Guide</a> for more details. - The token\'s <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
     * Send conversions
     * @param param the request object
     */
    public eventsCreate(param: ConversionEventsApiEventsCreateRequest, options?: Configuration): Promise<ConversionApiResponse> {
        return this.api.eventsCreate(param.adAccountId, param.conversionEvents, param.test,  options).toPromise();
    }

}

import { ObservableConversionTagsApi } from "./ObservableAPI";
import { ConversionTagsApiRequestFactory, ConversionTagsApiResponseProcessor} from "../apis/ConversionTagsApi";

export interface ConversionTagsApiConversionTagsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof ConversionTagsApiconversionTagsCreate
     */
    adAccountId: string
    /**
     * Conversion Tag to create
     * @type ConversionTagCreate
     * @memberof ConversionTagsApiconversionTagsCreate
     */
    conversionTagCreate: ConversionTagCreate
}

export interface ConversionTagsApiConversionTagsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof ConversionTagsApiconversionTagsGet
     */
    adAccountId: string
    /**
     * Id of the conversion tag.
     * @type string
     * @memberof ConversionTagsApiconversionTagsGet
     */
    conversionTagId: string
}

export interface ConversionTagsApiConversionTagsListRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof ConversionTagsApiconversionTagsList
     */
    adAccountId: string
    /**
     * Filter out deleted tags.
     * @type boolean
     * @memberof ConversionTagsApiconversionTagsList
     */
    filterDeleted?: boolean
}

export interface ConversionTagsApiOcpmEligibleConversionTagsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof ConversionTagsApiocpmEligibleConversionTagsGet
     */
    adAccountId: string
}

export interface ConversionTagsApiPageVisitConversionTagsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof ConversionTagsApipageVisitConversionTagsGet
     */
    adAccountId: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof ConversionTagsApipageVisitConversionTagsGet
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof ConversionTagsApipageVisitConversionTagsGet
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof ConversionTagsApipageVisitConversionTagsGet
     */
    bookmark?: string
}

export class ObjectConversionTagsApi {
    private api: ObservableConversionTagsApi

    public constructor(configuration: Configuration, requestFactory?: ConversionTagsApiRequestFactory, responseProcessor?: ConversionTagsApiResponseProcessor) {
        this.api = new ObservableConversionTagsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account\'s ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/enhanced-match/\">Enhanced match</a>
     * Create conversion tag
     * @param param the request object
     */
    public conversionTagsCreateWithHttpInfo(param: ConversionTagsApiConversionTagsCreateRequest, options?: Configuration): Promise<HttpInfo<ConversionTagResponse>> {
        return this.api.conversionTagsCreateWithHttpInfo(param.adAccountId, param.conversionTagCreate,  options).toPromise();
    }

    /**
     * Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account\'s ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/enhanced-match/\">Enhanced match</a>
     * Create conversion tag
     * @param param the request object
     */
    public conversionTagsCreate(param: ConversionTagsApiConversionTagsCreateRequest, options?: Configuration): Promise<ConversionTagResponse> {
        return this.api.conversionTagsCreate(param.adAccountId, param.conversionTagCreate,  options).toPromise();
    }

    /**
     * Get information about an existing conversion tag.
     * Get conversion tag
     * @param param the request object
     */
    public conversionTagsGetWithHttpInfo(param: ConversionTagsApiConversionTagsGetRequest, options?: Configuration): Promise<HttpInfo<ConversionTagResponse>> {
        return this.api.conversionTagsGetWithHttpInfo(param.adAccountId, param.conversionTagId,  options).toPromise();
    }

    /**
     * Get information about an existing conversion tag.
     * Get conversion tag
     * @param param the request object
     */
    public conversionTagsGet(param: ConversionTagsApiConversionTagsGetRequest, options?: Configuration): Promise<ConversionTagResponse> {
        return this.api.conversionTagsGet(param.adAccountId, param.conversionTagId,  options).toPromise();
    }

    /**
     * List conversion tags associated with an ad account.
     * Get conversion tags
     * @param param the request object
     */
    public conversionTagsListWithHttpInfo(param: ConversionTagsApiConversionTagsListRequest, options?: Configuration): Promise<HttpInfo<ConversionTagListResponse>> {
        return this.api.conversionTagsListWithHttpInfo(param.adAccountId, param.filterDeleted,  options).toPromise();
    }

    /**
     * List conversion tags associated with an ad account.
     * Get conversion tags
     * @param param the request object
     */
    public conversionTagsList(param: ConversionTagsApiConversionTagsListRequest, options?: Configuration): Promise<ConversionTagListResponse> {
        return this.api.conversionTagsList(param.adAccountId, param.filterDeleted,  options).toPromise();
    }

    /**
     * Get Ocpm eligible conversion tag events for an ad account.
     * Get Ocpm eligible conversion tags
     * @param param the request object
     */
    public ocpmEligibleConversionTagsGetWithHttpInfo(param: ConversionTagsApiOcpmEligibleConversionTagsGetRequest, options?: Configuration): Promise<HttpInfo<{ [key: string]: Array<ConversionEventResponse>; }>> {
        return this.api.ocpmEligibleConversionTagsGetWithHttpInfo(param.adAccountId,  options).toPromise();
    }

    /**
     * Get Ocpm eligible conversion tag events for an ad account.
     * Get Ocpm eligible conversion tags
     * @param param the request object
     */
    public ocpmEligibleConversionTagsGet(param: ConversionTagsApiOcpmEligibleConversionTagsGetRequest, options?: Configuration): Promise<{ [key: string]: Array<ConversionEventResponse>; }> {
        return this.api.ocpmEligibleConversionTagsGet(param.adAccountId,  options).toPromise();
    }

    /**
     * Get all page visit conversion tag events for an ad account.
     * Get page visit conversion tags
     * @param param the request object
     */
    public pageVisitConversionTagsGetWithHttpInfo(param: ConversionTagsApiPageVisitConversionTagsGetRequest, options?: Configuration): Promise<HttpInfo<PageVisitConversionTagsGet200Response>> {
        return this.api.pageVisitConversionTagsGetWithHttpInfo(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * Get all page visit conversion tag events for an ad account.
     * Get page visit conversion tags
     * @param param the request object
     */
    public pageVisitConversionTagsGet(param: ConversionTagsApiPageVisitConversionTagsGetRequest, options?: Configuration): Promise<PageVisitConversionTagsGet200Response> {
        return this.api.pageVisitConversionTagsGet(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

}

import { ObservableCustomerListsApi } from "./ObservableAPI";
import { CustomerListsApiRequestFactory, CustomerListsApiResponseProcessor} from "../apis/CustomerListsApi";

export interface CustomerListsApiCustomerListsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CustomerListsApicustomerListsCreate
     */
    adAccountId: string
    /**
     * Parameters to get Customer lists info
     * @type CustomerListRequest
     * @memberof CustomerListsApicustomerListsCreate
     */
    customerListRequest: CustomerListRequest
}

export interface CustomerListsApiCustomerListsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CustomerListsApicustomerListsGet
     */
    adAccountId: string
    /**
     * Unique identifier of a customer list
     * @type string
     * @memberof CustomerListsApicustomerListsGet
     */
    customerListId: string
}

export interface CustomerListsApiCustomerListsListRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CustomerListsApicustomerListsList
     */
    adAccountId: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof CustomerListsApicustomerListsList
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof CustomerListsApicustomerListsList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof CustomerListsApicustomerListsList
     */
    bookmark?: string
}

export interface CustomerListsApiCustomerListsUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof CustomerListsApicustomerListsUpdate
     */
    adAccountId: string
    /**
     * Unique identifier of a customer list
     * @type string
     * @memberof CustomerListsApicustomerListsUpdate
     */
    customerListId: string
    /**
     * 
     * @type CustomerListUpdateRequest
     * @memberof CustomerListsApicustomerListsUpdate
     */
    customerListUpdateRequest: CustomerListUpdateRequest
}

export class ObjectCustomerListsApi {
    private api: ObservableCustomerListsApi

    public constructor(configuration: Configuration, requestFactory?: CustomerListsApiRequestFactory, responseProcessor?: CustomerListsApiResponseProcessor) {
        this.api = new ObservableCustomerListsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>
     * Create customer lists
     * @param param the request object
     */
    public customerListsCreateWithHttpInfo(param: CustomerListsApiCustomerListsCreateRequest, options?: Configuration): Promise<HttpInfo<CustomerList>> {
        return this.api.customerListsCreateWithHttpInfo(param.adAccountId, param.customerListRequest,  options).toPromise();
    }

    /**
     * <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>
     * Create customer lists
     * @param param the request object
     */
    public customerListsCreate(param: CustomerListsApiCustomerListsCreateRequest, options?: Configuration): Promise<CustomerList> {
        return this.api.customerListsCreate(param.adAccountId, param.customerListRequest,  options).toPromise();
    }

    /**
     * Gets a specific customer list given the customer list ID.
     * Get customer list
     * @param param the request object
     */
    public customerListsGetWithHttpInfo(param: CustomerListsApiCustomerListsGetRequest, options?: Configuration): Promise<HttpInfo<CustomerList>> {
        return this.api.customerListsGetWithHttpInfo(param.adAccountId, param.customerListId,  options).toPromise();
    }

    /**
     * Gets a specific customer list given the customer list ID.
     * Get customer list
     * @param param the request object
     */
    public customerListsGet(param: CustomerListsApiCustomerListsGetRequest, options?: Configuration): Promise<CustomerList> {
        return this.api.customerListsGet(param.adAccountId, param.customerListId,  options).toPromise();
    }

    /**
     * <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
     * Get customer lists
     * @param param the request object
     */
    public customerListsListWithHttpInfo(param: CustomerListsApiCustomerListsListRequest, options?: Configuration): Promise<HttpInfo<CustomerListsList200Response>> {
        return this.api.customerListsListWithHttpInfo(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
     * Get customer lists
     * @param param the request object
     */
    public customerListsList(param: CustomerListsApiCustomerListsListRequest, options?: Configuration): Promise<CustomerListsList200Response> {
        return this.api.customerListsList(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
     * Update customer list
     * @param param the request object
     */
    public customerListsUpdateWithHttpInfo(param: CustomerListsApiCustomerListsUpdateRequest, options?: Configuration): Promise<HttpInfo<CustomerList>> {
        return this.api.customerListsUpdateWithHttpInfo(param.adAccountId, param.customerListId, param.customerListUpdateRequest,  options).toPromise();
    }

    /**
     * <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
     * Update customer list
     * @param param the request object
     */
    public customerListsUpdate(param: CustomerListsApiCustomerListsUpdateRequest, options?: Configuration): Promise<CustomerList> {
        return this.api.customerListsUpdate(param.adAccountId, param.customerListId, param.customerListUpdateRequest,  options).toPromise();
    }

}

import { ObservableIntegrationsApi } from "./ObservableAPI";
import { IntegrationsApiRequestFactory, IntegrationsApiResponseProcessor} from "../apis/IntegrationsApi";

export interface IntegrationsApiIntegrationsCommerceDelRequest {
    /**
     * External business ID for the integration.
     * @type string
     * @memberof IntegrationsApiintegrationsCommerceDel
     */
    externalBusinessId: string
}

export interface IntegrationsApiIntegrationsCommerceGetRequest {
    /**
     * External business ID for the integration.
     * @type string
     * @memberof IntegrationsApiintegrationsCommerceGet
     */
    externalBusinessId: string
}

export interface IntegrationsApiIntegrationsCommercePatchRequest {
    /**
     * External business ID for the integration.
     * @type string
     * @memberof IntegrationsApiintegrationsCommercePatch
     */
    externalBusinessId: string
    /**
     * Parameters to get create/update the Integration Metadata
     * @type IntegrationRequestPatch
     * @memberof IntegrationsApiintegrationsCommercePatch
     */
    integrationRequestPatch?: IntegrationRequestPatch
}

export interface IntegrationsApiIntegrationsCommercePostRequest {
    /**
     * Parameters to get create/update the Integration Metadata
     * @type IntegrationRequest
     * @memberof IntegrationsApiintegrationsCommercePost
     */
    integrationRequest?: IntegrationRequest
}

export interface IntegrationsApiIntegrationsGetByIdRequest {
    /**
     * Integration ID.
     * @type string
     * @memberof IntegrationsApiintegrationsGetById
     */
    id: string
}

export interface IntegrationsApiIntegrationsGetListRequest {
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof IntegrationsApiintegrationsGetList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof IntegrationsApiintegrationsGetList
     */
    pageSize?: number
}

export interface IntegrationsApiIntegrationsLogsPostRequest {
    /**
     * Ingest log information from external integration application.
     * @type IntegrationLogsRequest
     * @memberof IntegrationsApiintegrationsLogsPost
     */
    integrationLogsRequest: IntegrationLogsRequest
}

export class ObjectIntegrationsApi {
    private api: ObservableIntegrationsApi

    public constructor(configuration: Configuration, requestFactory?: IntegrationsApiRequestFactory, responseProcessor?: IntegrationsApiResponseProcessor) {
        this.api = new ObservableIntegrationsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Delete commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Delete commerce integration
     * @param param the request object
     */
    public integrationsCommerceDelWithHttpInfo(param: IntegrationsApiIntegrationsCommerceDelRequest, options?: Configuration): Promise<HttpInfo<void>> {
        return this.api.integrationsCommerceDelWithHttpInfo(param.externalBusinessId,  options).toPromise();
    }

    /**
     * Delete commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Delete commerce integration
     * @param param the request object
     */
    public integrationsCommerceDel(param: IntegrationsApiIntegrationsCommerceDelRequest, options?: Configuration): Promise<void> {
        return this.api.integrationsCommerceDel(param.externalBusinessId,  options).toPromise();
    }

    /**
     * Get commerce integration metadata associated with the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get commerce integration
     * @param param the request object
     */
    public integrationsCommerceGetWithHttpInfo(param: IntegrationsApiIntegrationsCommerceGetRequest, options?: Configuration): Promise<HttpInfo<IntegrationMetadata>> {
        return this.api.integrationsCommerceGetWithHttpInfo(param.externalBusinessId,  options).toPromise();
    }

    /**
     * Get commerce integration metadata associated with the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get commerce integration
     * @param param the request object
     */
    public integrationsCommerceGet(param: IntegrationsApiIntegrationsCommerceGetRequest, options?: Configuration): Promise<IntegrationMetadata> {
        return this.api.integrationsCommerceGet(param.externalBusinessId,  options).toPromise();
    }

    /**
     * Update commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Update commerce integration
     * @param param the request object
     */
    public integrationsCommercePatchWithHttpInfo(param: IntegrationsApiIntegrationsCommercePatchRequest, options?: Configuration): Promise<HttpInfo<IntegrationMetadata>> {
        return this.api.integrationsCommercePatchWithHttpInfo(param.externalBusinessId, param.integrationRequestPatch,  options).toPromise();
    }

    /**
     * Update commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Update commerce integration
     * @param param the request object
     */
    public integrationsCommercePatch(param: IntegrationsApiIntegrationsCommercePatchRequest, options?: Configuration): Promise<IntegrationMetadata> {
        return this.api.integrationsCommercePatch(param.externalBusinessId, param.integrationRequestPatch,  options).toPromise();
    }

    /**
     * Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Create commerce integration
     * @param param the request object
     */
    public integrationsCommercePostWithHttpInfo(param: IntegrationsApiIntegrationsCommercePostRequest = {}, options?: Configuration): Promise<HttpInfo<IntegrationMetadata>> {
        return this.api.integrationsCommercePostWithHttpInfo(param.integrationRequest,  options).toPromise();
    }

    /**
     * Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Create commerce integration
     * @param param the request object
     */
    public integrationsCommercePost(param: IntegrationsApiIntegrationsCommercePostRequest = {}, options?: Configuration): Promise<IntegrationMetadata> {
        return this.api.integrationsCommercePost(param.integrationRequest,  options).toPromise();
    }

    /**
     * Get integration metadata by ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get integration metadata
     * @param param the request object
     */
    public integrationsGetByIdWithHttpInfo(param: IntegrationsApiIntegrationsGetByIdRequest, options?: Configuration): Promise<HttpInfo<IntegrationRecord>> {
        return this.api.integrationsGetByIdWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Get integration metadata by ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get integration metadata
     * @param param the request object
     */
    public integrationsGetById(param: IntegrationsApiIntegrationsGetByIdRequest, options?: Configuration): Promise<IntegrationRecord> {
        return this.api.integrationsGetById(param.id,  options).toPromise();
    }

    /**
     * Get integration metadata list. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get integration metadata list
     * @param param the request object
     */
    public integrationsGetListWithHttpInfo(param: IntegrationsApiIntegrationsGetListRequest = {}, options?: Configuration): Promise<HttpInfo<IntegrationsGetList200Response>> {
        return this.api.integrationsGetListWithHttpInfo(param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get integration metadata list. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get integration metadata list
     * @param param the request object
     */
    public integrationsGetList(param: IntegrationsApiIntegrationsGetListRequest = {}, options?: Configuration): Promise<IntegrationsGetList200Response> {
        return this.api.integrationsGetList(param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * This endpoint receives batched logs from integration applications on partner platforms. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Receives batched logs from integration applications.
     * @param param the request object
     */
    public integrationsLogsPostWithHttpInfo(param: IntegrationsApiIntegrationsLogsPostRequest, options?: Configuration): Promise<HttpInfo<IntegrationLogsSuccessResponse>> {
        return this.api.integrationsLogsPostWithHttpInfo(param.integrationLogsRequest,  options).toPromise();
    }

    /**
     * This endpoint receives batched logs from integration applications on partner platforms. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Receives batched logs from integration applications.
     * @param param the request object
     */
    public integrationsLogsPost(param: IntegrationsApiIntegrationsLogsPostRequest, options?: Configuration): Promise<IntegrationLogsSuccessResponse> {
        return this.api.integrationsLogsPost(param.integrationLogsRequest,  options).toPromise();
    }

}

import { ObservableKeywordsApi } from "./ObservableAPI";
import { KeywordsApiRequestFactory, KeywordsApiResponseProcessor} from "../apis/KeywordsApi";

export interface KeywordsApiCountryKeywordsMetricsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof KeywordsApicountryKeywordsMetricsGet
     */
    adAccountId: string
    /**
     * Two letter country code (ISO 3166-1 alpha-2)
     * @type string
     * @memberof KeywordsApicountryKeywordsMetricsGet
     */
    countryCode: string
    /**
     * Comma-separated keywords
     * @type Array&lt;string&gt;
     * @memberof KeywordsApicountryKeywordsMetricsGet
     */
    keywords: Array<string>
}

export interface KeywordsApiKeywordsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof KeywordsApikeywordsCreate
     */
    adAccountId: string
    /**
     * 
     * @type KeywordsRequest
     * @memberof KeywordsApikeywordsCreate
     */
    keywordsRequest: KeywordsRequest
}

export interface KeywordsApiKeywordsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof KeywordsApikeywordsGet
     */
    adAccountId: string
    /**
     * Campaign Id to use to filter the results.
     * @type string
     * @memberof KeywordsApikeywordsGet
     */
    campaignId?: string
    /**
     * Ad group Id.
     * @type string
     * @memberof KeywordsApikeywordsGet
     */
    adGroupId?: string
    /**
     * Keyword &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/ads/targeting/#Match%20type%20and%20targeting%20level\&quot;&gt;match type&lt;/a&gt;
     * @type Array&lt;MatchType&gt;
     * @memberof KeywordsApikeywordsGet
     */
    matchTypes?: Array<MatchType>
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof KeywordsApikeywordsGet
     */
    pageSize?: number
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof KeywordsApikeywordsGet
     */
    bookmark?: string
}

export interface KeywordsApiKeywordsUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof KeywordsApikeywordsUpdate
     */
    adAccountId: string
    /**
     * 
     * @type KeywordUpdateBody
     * @memberof KeywordsApikeywordsUpdate
     */
    keywordUpdateBody: KeywordUpdateBody
}

export interface KeywordsApiTrendingKeywordsListRequest {
    /**
     * The geographic region of interest. Only top trends within the specified region will be returned.&lt;br /&gt; The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas: - &#x60;US&#x60; - United States - &#x60;CA&#x60; - Canada - &#x60;DE&#x60; - Germany - &#x60;FR&#x60; - France - &#x60;ES&#x60; - Spain - &#x60;IT&#x60; - Italy - &#x60;DE+AT+CH&#x60; - Germanic countries - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe - &#x60;SE+DK+FI+NO&#x60; - Nordic countries - &#x60;NL+BE+LU&#x60; - Benelux - &#x60;AR&#x60; - Argentina - &#x60;BR&#x60; - Brazil - &#x60;CO&#x60; - Colombia - &#x60;MX&#x60; - Mexico - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm - &#x60;AU+NZ&#x60; - Australasia
     * @type TrendsSupportedRegion
     * @memberof KeywordsApitrendingKeywordsList
     */
    region: TrendsSupportedRegion
    /**
     * The methodology used to rank how trendy a keyword is. - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter - &#x60;monthly&#x60; trends have high search volume in the last month - &#x60;yearly&#x60; trends have high search volume in the last year - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
     * @type TrendType
     * @memberof KeywordsApitrendingKeywordsList
     */
    trendType: TrendType
    /**
     * If set, filters the results to trends associated with the specified interests.&lt;br /&gt; If unset, trends for all interests will be returned.&lt;br /&gt; The list of supported interests is: - &#x60;animals&#x60; - Animals - &#x60;architecture&#x60; - Architecture - &#x60;art&#x60; - Art - &#x60;beauty&#x60; - Beauty - &#x60;childrens_fashion&#x60; - Children\&#39;s Fashion - &#x60;design&#x60; - Design - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts - &#x60;education&#x60; - Education - &#x60;electronics&#x60; - Electronics - &#x60;entertainment&#x60; - Entertainment - &#x60;event_planning&#x60; - Event Planning - &#x60;finance&#x60; - Finance - &#x60;food_and_drinks&#x60; - Food &amp; Drink - &#x60;gardening&#x60; - Gardening - &#x60;health&#x60; - Health - &#x60;home_decor&#x60; - Home Decor - &#x60;mens_fashion&#x60; - Men\&#39;s Fashion - &#x60;parenting&#x60; - Parenting - &#x60;quotes&#x60; - Quotes - &#x60;sport&#x60; - Sports - &#x60;travel&#x60; - Travel - &#x60;vehicles&#x60; - Vehicles - &#x60;wedding&#x60; - Wedding - &#x60;womens_fashion&#x60; - Women\&#39;s Fashion
     * @type Array&lt;&#39;animals&#39; | &#39;architecture&#39; | &#39;art&#39; | &#39;beauty&#39; | &#39;childrens_fashion&#39; | &#39;design&#39; | &#39;diy_and_crafts&#39; | &#39;education&#39; | &#39;electronics&#39; | &#39;entertainment&#39; | &#39;event_planning&#39; | &#39;finance&#39; | &#39;food_and_drinks&#39; | &#39;gardening&#39; | &#39;health&#39; | &#39;home_decor&#39; | &#39;mens_fashion&#39; | &#39;parenting&#39; | &#39;quotes&#39; | &#39;sport&#39; | &#39;travel&#39; | &#39;vehicles&#39; | &#39;wedding&#39; | &#39;womens_fashion&#39;&gt;
     * @memberof KeywordsApitrendingKeywordsList
     */
    interests?: Array<'animals' | 'architecture' | 'art' | 'beauty' | 'childrens_fashion' | 'design' | 'diy_and_crafts' | 'education' | 'electronics' | 'entertainment' | 'event_planning' | 'finance' | 'food_and_drinks' | 'gardening' | 'health' | 'home_decor' | 'mens_fashion' | 'parenting' | 'quotes' | 'sport' | 'travel' | 'vehicles' | 'wedding' | 'womens_fashion'>
    /**
     * If set, filters the results to trends among users who identify with the specified gender(s).&lt;br /&gt; If unset, trends among all genders will be returned.&lt;br /&gt; The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings.
     * @type Array&lt;&#39;female&#39; | &#39;male&#39; | &#39;unknown&#39;&gt;
     * @memberof KeywordsApitrendingKeywordsList
     */
    genders?: Array<'female' | 'male' | 'unknown'>
    /**
     * If set, filters the results to trends among users in the specified age range(s).&lt;br /&gt; If unset, trends among all age groups will be returned.
     * @type Array&lt;&#39;18-24&#39; | &#39;25-34&#39; | &#39;35-44&#39; | &#39;45-49&#39; | &#39;50-54&#39; | &#39;55-64&#39; | &#39;65+&#39;&gt;
     * @memberof KeywordsApitrendingKeywordsList
     */
    ages?: Array<'18-24' | '25-34' | '35-44' | '45-49' | '50-54' | '55-64' | '65+'>
    /**
     * Governs how the resulting time series data will be normalized to a [0-100] scale.&lt;br /&gt; By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword\&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.&lt;br /&gt; If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.
     * @type boolean
     * @memberof KeywordsApitrendingKeywordsList
     */
    normalizeAgainstGroup?: boolean
    /**
     * The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends.
     * @type number
     * @memberof KeywordsApitrendingKeywordsList
     */
    limit?: number
}

export class ObjectKeywordsApi {
    private api: ObservableKeywordsApi

    public constructor(configuration: Configuration, requestFactory?: KeywordsApiRequestFactory, responseProcessor?: KeywordsApiResponseProcessor) {
        this.api = new ObservableKeywordsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).
     * Get country\'s keyword metrics
     * @param param the request object
     */
    public countryKeywordsMetricsGetWithHttpInfo(param: KeywordsApiCountryKeywordsMetricsGetRequest, options?: Configuration): Promise<HttpInfo<KeywordsMetricsArrayResponse>> {
        return this.api.countryKeywordsMetricsGetWithHttpInfo(param.adAccountId, param.countryCode, param.keywords,  options).toPromise();
    }

    /**
     * See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).
     * Get country\'s keyword metrics
     * @param param the request object
     */
    public countryKeywordsMetricsGet(param: KeywordsApiCountryKeywordsMetricsGetRequest, options?: Configuration): Promise<KeywordsMetricsArrayResponse> {
        return this.api.countryKeywordsMetricsGet(param.adAccountId, param.countryCode, param.keywords,  options).toPromise();
    }

    /**
     * <p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding (\'_NEGATIVE\').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/redoc/#tag/Rate-Limits\">WRITE</a>.</p>
     * Create keywords
     * @param param the request object
     */
    public keywordsCreateWithHttpInfo(param: KeywordsApiKeywordsCreateRequest, options?: Configuration): Promise<HttpInfo<KeywordsResponse>> {
        return this.api.keywordsCreateWithHttpInfo(param.adAccountId, param.keywordsRequest,  options).toPromise();
    }

    /**
     * <p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding (\'_NEGATIVE\').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/redoc/#tag/Rate-Limits\">WRITE</a>.</p>
     * Create keywords
     * @param param the request object
     */
    public keywordsCreate(param: KeywordsApiKeywordsCreateRequest, options?: Configuration): Promise<KeywordsResponse> {
        return this.api.keywordsCreate(param.adAccountId, param.keywordsRequest,  options).toPromise();
    }

    /**
     * <p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding (\'_NEGATIVE\').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>
     * Get keywords
     * @param param the request object
     */
    public keywordsGetWithHttpInfo(param: KeywordsApiKeywordsGetRequest, options?: Configuration): Promise<HttpInfo<KeywordsGet200Response>> {
        return this.api.keywordsGetWithHttpInfo(param.adAccountId, param.campaignId, param.adGroupId, param.matchTypes, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * <p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding (\'_NEGATIVE\').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>
     * Get keywords
     * @param param the request object
     */
    public keywordsGet(param: KeywordsApiKeywordsGetRequest, options?: Configuration): Promise<KeywordsGet200Response> {
        return this.api.keywordsGet(param.adAccountId, param.campaignId, param.adGroupId, param.matchTypes, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * <p>Update one or more keywords\' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity\'s keywords list.</p>
     * Update keywords
     * @param param the request object
     */
    public keywordsUpdateWithHttpInfo(param: KeywordsApiKeywordsUpdateRequest, options?: Configuration): Promise<HttpInfo<KeywordsResponse>> {
        return this.api.keywordsUpdateWithHttpInfo(param.adAccountId, param.keywordUpdateBody,  options).toPromise();
    }

    /**
     * <p>Update one or more keywords\' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity\'s keywords list.</p>
     * Update keywords
     * @param param the request object
     */
    public keywordsUpdate(param: KeywordsApiKeywordsUpdateRequest, options?: Configuration): Promise<KeywordsResponse> {
        return this.api.keywordsUpdate(param.adAccountId, param.keywordUpdateBody,  options).toPromise();
    }

    /**
     * <p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>.
     * List trending keywords
     * @param param the request object
     */
    public trendingKeywordsListWithHttpInfo(param: KeywordsApiTrendingKeywordsListRequest, options?: Configuration): Promise<HttpInfo<TrendingKeywordsResponse>> {
        return this.api.trendingKeywordsListWithHttpInfo(param.region, param.trendType, param.interests, param.genders, param.ages, param.normalizeAgainstGroup, param.limit,  options).toPromise();
    }

    /**
     * <p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>.
     * List trending keywords
     * @param param the request object
     */
    public trendingKeywordsList(param: KeywordsApiTrendingKeywordsListRequest, options?: Configuration): Promise<TrendingKeywordsResponse> {
        return this.api.trendingKeywordsList(param.region, param.trendType, param.interests, param.genders, param.ages, param.normalizeAgainstGroup, param.limit,  options).toPromise();
    }

}

import { ObservableLeadAdsApi } from "./ObservableAPI";
import { LeadAdsApiRequestFactory, LeadAdsApiResponseProcessor} from "../apis/LeadAdsApi";

export interface LeadAdsApiAdAccountsSubscriptionsDelByIdRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof LeadAdsApiadAccountsSubscriptionsDelById
     */
    adAccountId: string
    /**
     * Unique identifier of a subscription.
     * @type string
     * @memberof LeadAdsApiadAccountsSubscriptionsDelById
     */
    subscriptionId: string
}

export interface LeadAdsApiAdAccountsSubscriptionsGetByIdRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof LeadAdsApiadAccountsSubscriptionsGetById
     */
    adAccountId: string
    /**
     * Unique identifier of a subscription.
     * @type string
     * @memberof LeadAdsApiadAccountsSubscriptionsGetById
     */
    subscriptionId: string
}

export interface LeadAdsApiAdAccountsSubscriptionsGetListRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof LeadAdsApiadAccountsSubscriptionsGetList
     */
    adAccountId: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof LeadAdsApiadAccountsSubscriptionsGetList
     */
    pageSize?: number
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof LeadAdsApiadAccountsSubscriptionsGetList
     */
    bookmark?: string
}

export interface LeadAdsApiAdAccountsSubscriptionsPostRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof LeadAdsApiadAccountsSubscriptionsPost
     */
    adAccountId: string
    /**
     * Subscription to create.
     * @type AdAccountCreateSubscriptionRequest
     * @memberof LeadAdsApiadAccountsSubscriptionsPost
     */
    adAccountCreateSubscriptionRequest: AdAccountCreateSubscriptionRequest
}

export class ObjectLeadAdsApi {
    private api: ObservableLeadAdsApi

    public constructor(configuration: Configuration, requestFactory?: LeadAdsApiRequestFactory, responseProcessor?: LeadAdsApiResponseProcessor) {
        this.api = new ObservableLeadAdsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Delete lead ads subscription
     * @param param the request object
     */
    public adAccountsSubscriptionsDelByIdWithHttpInfo(param: LeadAdsApiAdAccountsSubscriptionsDelByIdRequest, options?: Configuration): Promise<HttpInfo<void>> {
        return this.api.adAccountsSubscriptionsDelByIdWithHttpInfo(param.adAccountId, param.subscriptionId,  options).toPromise();
    }

    /**
     * Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Delete lead ads subscription
     * @param param the request object
     */
    public adAccountsSubscriptionsDelById(param: LeadAdsApiAdAccountsSubscriptionsDelByIdRequest, options?: Configuration): Promise<void> {
        return this.api.adAccountsSubscriptionsDelById(param.adAccountId, param.subscriptionId,  options).toPromise();
    }

    /**
     * Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get lead ads subscription
     * @param param the request object
     */
    public adAccountsSubscriptionsGetByIdWithHttpInfo(param: LeadAdsApiAdAccountsSubscriptionsGetByIdRequest, options?: Configuration): Promise<HttpInfo<AdAccountGetSubscriptionResponse>> {
        return this.api.adAccountsSubscriptionsGetByIdWithHttpInfo(param.adAccountId, param.subscriptionId,  options).toPromise();
    }

    /**
     * Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get lead ads subscription
     * @param param the request object
     */
    public adAccountsSubscriptionsGetById(param: LeadAdsApiAdAccountsSubscriptionsGetByIdRequest, options?: Configuration): Promise<AdAccountGetSubscriptionResponse> {
        return this.api.adAccountsSubscriptionsGetById(param.adAccountId, param.subscriptionId,  options).toPromise();
    }

    /**
     * Get the advertiser\'s list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get lead ads subscriptions
     * @param param the request object
     */
    public adAccountsSubscriptionsGetListWithHttpInfo(param: LeadAdsApiAdAccountsSubscriptionsGetListRequest, options?: Configuration): Promise<HttpInfo<AdAccountsSubscriptionsGetList200Response>> {
        return this.api.adAccountsSubscriptionsGetListWithHttpInfo(param.adAccountId, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * Get the advertiser\'s list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get lead ads subscriptions
     * @param param the request object
     */
    public adAccountsSubscriptionsGetList(param: LeadAdsApiAdAccountsSubscriptionsGetListRequest, options?: Configuration): Promise<AdAccountsSubscriptionsGetList200Response> {
        return this.api.adAccountsSubscriptionsGetList(param.adAccountId, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Create lead ads subscription
     * @param param the request object
     */
    public adAccountsSubscriptionsPostWithHttpInfo(param: LeadAdsApiAdAccountsSubscriptionsPostRequest, options?: Configuration): Promise<HttpInfo<AdAccountCreateSubscriptionResponse>> {
        return this.api.adAccountsSubscriptionsPostWithHttpInfo(param.adAccountId, param.adAccountCreateSubscriptionRequest,  options).toPromise();
    }

    /**
     * Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Create lead ads subscription
     * @param param the request object
     */
    public adAccountsSubscriptionsPost(param: LeadAdsApiAdAccountsSubscriptionsPostRequest, options?: Configuration): Promise<AdAccountCreateSubscriptionResponse> {
        return this.api.adAccountsSubscriptionsPost(param.adAccountId, param.adAccountCreateSubscriptionRequest,  options).toPromise();
    }

}

import { ObservableLeadFormsApi } from "./ObservableAPI";
import { LeadFormsApiRequestFactory, LeadFormsApiResponseProcessor} from "../apis/LeadFormsApi";

export interface LeadFormsApiLeadFormGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof LeadFormsApileadFormGet
     */
    adAccountId: string
    /**
     * Unique identifier of a lead form.
     * @type string
     * @memberof LeadFormsApileadFormGet
     */
    leadFormId: string
}

export interface LeadFormsApiLeadFormTestCreateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof LeadFormsApileadFormTestCreate
     */
    adAccountId: string
    /**
     * Unique identifier of a lead form.
     * @type string
     * @memberof LeadFormsApileadFormTestCreate
     */
    leadFormId: string
    /**
     * Subscription to create.
     * @type LeadFormTestRequest
     * @memberof LeadFormsApileadFormTestCreate
     */
    leadFormTestRequest: LeadFormTestRequest
}

export interface LeadFormsApiLeadFormsListRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof LeadFormsApileadFormsList
     */
    adAccountId: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof LeadFormsApileadFormsList
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof LeadFormsApileadFormsList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof LeadFormsApileadFormsList
     */
    bookmark?: string
}

export class ObjectLeadFormsApi {
    private api: ObservableLeadFormsApi

    public constructor(configuration: Configuration, requestFactory?: LeadFormsApiRequestFactory, responseProcessor?: LeadFormsApiResponseProcessor) {
        this.api = new ObservableLeadFormsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Gets a lead form given it\'s ID. It must also be associated with the provided ad account ID. Retrieving an advertiser\'s lead form will only contain results if you\'re a part of the Lead ads beta. If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get lead form by id
     * @param param the request object
     */
    public leadFormGetWithHttpInfo(param: LeadFormsApiLeadFormGetRequest, options?: Configuration): Promise<HttpInfo<LeadFormResponse>> {
        return this.api.leadFormGetWithHttpInfo(param.adAccountId, param.leadFormId,  options).toPromise();
    }

    /**
     * Gets a lead form given it\'s ID. It must also be associated with the provided ad account ID. Retrieving an advertiser\'s lead form will only contain results if you\'re a part of the Lead ads beta. If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get lead form by id
     * @param param the request object
     */
    public leadFormGet(param: LeadFormsApiLeadFormGetRequest, options?: Configuration): Promise<LeadFormResponse> {
        return this.api.leadFormGet(param.adAccountId, param.leadFormId,  options).toPromise();
    }

    /**
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Create lead form test data
     * @param param the request object
     */
    public leadFormTestCreateWithHttpInfo(param: LeadFormsApiLeadFormTestCreateRequest, options?: Configuration): Promise<HttpInfo<LeadFormTestResponse>> {
        return this.api.leadFormTestCreateWithHttpInfo(param.adAccountId, param.leadFormId, param.leadFormTestRequest,  options).toPromise();
    }

    /**
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Create lead form test data
     * @param param the request object
     */
    public leadFormTestCreate(param: LeadFormsApiLeadFormTestCreateRequest, options?: Configuration): Promise<LeadFormTestResponse> {
        return this.api.leadFormTestCreate(param.adAccountId, param.leadFormId, param.leadFormTestRequest,  options).toPromise();
    }

    /**
     * Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser\'s list of lead forms will only contain results if you\'re a part of the Lead ads beta.  If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get lead forms
     * @param param the request object
     */
    public leadFormsListWithHttpInfo(param: LeadFormsApiLeadFormsListRequest, options?: Configuration): Promise<HttpInfo<LeadFormsList200Response>> {
        return this.api.leadFormsListWithHttpInfo(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser\'s list of lead forms will only contain results if you\'re a part of the Lead ads beta.  If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get lead forms
     * @param param the request object
     */
    public leadFormsList(param: LeadFormsApiLeadFormsListRequest, options?: Configuration): Promise<LeadFormsList200Response> {
        return this.api.leadFormsList(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

}

import { ObservableMediaApi } from "./ObservableAPI";
import { MediaApiRequestFactory, MediaApiResponseProcessor} from "../apis/MediaApi";

export interface MediaApiMediaCreateRequest {
    /**
     * Create a media upload request
     * @type MediaUploadRequest
     * @memberof MediaApimediaCreate
     */
    mediaUploadRequest: MediaUploadRequest
}

export interface MediaApiMediaGetRequest {
    /**
     * Media identifier
     * @type string
     * @memberof MediaApimediaGet
     */
    mediaId: string
}

export interface MediaApiMediaListRequest {
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof MediaApimediaList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof MediaApimediaList
     */
    pageSize?: number
}

export class ObjectMediaApi {
    private api: ObservableMediaApi

    public constructor(configuration: Configuration, requestFactory?: MediaApiRequestFactory, responseProcessor?: MediaApiResponseProcessor) {
        this.api = new ObservableMediaApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file\'s contents as the request\'s <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href=\'/docs/content/content-creation/#Creating%20video%20Pins\'>Learn more</a></strong> about video Pin creation.
     * Register media upload
     * @param param the request object
     */
    public mediaCreateWithHttpInfo(param: MediaApiMediaCreateRequest, options?: Configuration): Promise<HttpInfo<MediaUpload>> {
        return this.api.mediaCreateWithHttpInfo(param.mediaUploadRequest,  options).toPromise();
    }

    /**
     * Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file\'s contents as the request\'s <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href=\'/docs/content/content-creation/#Creating%20video%20Pins\'>Learn more</a></strong> about video Pin creation.
     * Register media upload
     * @param param the request object
     */
    public mediaCreate(param: MediaApiMediaCreateRequest, options?: Configuration): Promise<MediaUpload> {
        return this.api.mediaCreate(param.mediaUploadRequest,  options).toPromise();
    }

    /**
     * Get details for a registered media upload, including its current status.  <strong><a href=\'/docs/content/content-creation/#Creating%20video%20Pins\'>Learn more</a></strong> about video Pin creation.
     * Get media upload details
     * @param param the request object
     */
    public mediaGetWithHttpInfo(param: MediaApiMediaGetRequest, options?: Configuration): Promise<HttpInfo<MediaUploadDetails>> {
        return this.api.mediaGetWithHttpInfo(param.mediaId,  options).toPromise();
    }

    /**
     * Get details for a registered media upload, including its current status.  <strong><a href=\'/docs/content/content-creation/#Creating%20video%20Pins\'>Learn more</a></strong> about video Pin creation.
     * Get media upload details
     * @param param the request object
     */
    public mediaGet(param: MediaApiMediaGetRequest, options?: Configuration): Promise<MediaUploadDetails> {
        return this.api.mediaGet(param.mediaId,  options).toPromise();
    }

    /**
     * List media uploads filtered by given parameters.  <strong><a href=\'/docs/content/content-creation/#Creating%20video%20Pins\'>Learn more</a></strong> about video Pin creation.
     * List media uploads
     * @param param the request object
     */
    public mediaListWithHttpInfo(param: MediaApiMediaListRequest = {}, options?: Configuration): Promise<HttpInfo<MediaList200Response>> {
        return this.api.mediaListWithHttpInfo(param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * List media uploads filtered by given parameters.  <strong><a href=\'/docs/content/content-creation/#Creating%20video%20Pins\'>Learn more</a></strong> about video Pin creation.
     * List media uploads
     * @param param the request object
     */
    public mediaList(param: MediaApiMediaListRequest = {}, options?: Configuration): Promise<MediaList200Response> {
        return this.api.mediaList(param.bookmark, param.pageSize,  options).toPromise();
    }

}

import { ObservableOauthApi } from "./ObservableAPI";
import { OauthApiRequestFactory, OauthApiResponseProcessor} from "../apis/OauthApi";

export interface OauthApiOauthTokenRequest {
    /**
     * 
     * @type string
     * @memberof OauthApioauthToken
     */
    grantType: string
}

export class ObjectOauthApi {
    private api: ObservableOauthApi

    public constructor(configuration: Configuration, requestFactory?: OauthApiRequestFactory, responseProcessor?: OauthApiResponseProcessor) {
        this.api = new ObservableOauthApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See <a href=\'/docs/getting-started/authentication/\'>Authentication</a> for more.  <strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Generate OAuth access token
     * @param param the request object
     */
    public oauthTokenWithHttpInfo(param: OauthApiOauthTokenRequest, options?: Configuration): Promise<HttpInfo<OauthAccessTokenResponse>> {
        return this.api.oauthTokenWithHttpInfo(param.grantType,  options).toPromise();
    }

    /**
     * Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See <a href=\'/docs/getting-started/authentication/\'>Authentication</a> for more.  <strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Generate OAuth access token
     * @param param the request object
     */
    public oauthToken(param: OauthApiOauthTokenRequest, options?: Configuration): Promise<OauthAccessTokenResponse> {
        return this.api.oauthToken(param.grantType,  options).toPromise();
    }

}

import { ObservableOrderLinesApi } from "./ObservableAPI";
import { OrderLinesApiRequestFactory, OrderLinesApiResponseProcessor} from "../apis/OrderLinesApi";

export interface OrderLinesApiOrderLinesGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof OrderLinesApiorderLinesGet
     */
    adAccountId: string
    /**
     * Unique identifier of an order line.
     * @type string
     * @memberof OrderLinesApiorderLinesGet
     */
    orderLineId: string
}

export interface OrderLinesApiOrderLinesListRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof OrderLinesApiorderLinesList
     */
    adAccountId: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof OrderLinesApiorderLinesList
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof OrderLinesApiorderLinesList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof OrderLinesApiorderLinesList
     */
    bookmark?: string
}

export class ObjectOrderLinesApi {
    private api: ObservableOrderLinesApi

    public constructor(configuration: Configuration, requestFactory?: OrderLinesApiRequestFactory, responseProcessor?: OrderLinesApiResponseProcessor) {
        this.api = new ObservableOrderLinesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get a specific existing order line associated with an ad account.
     * Get order line
     * @param param the request object
     */
    public orderLinesGetWithHttpInfo(param: OrderLinesApiOrderLinesGetRequest, options?: Configuration): Promise<HttpInfo<OrderLine>> {
        return this.api.orderLinesGetWithHttpInfo(param.adAccountId, param.orderLineId,  options).toPromise();
    }

    /**
     * Get a specific existing order line associated with an ad account.
     * Get order line
     * @param param the request object
     */
    public orderLinesGet(param: OrderLinesApiOrderLinesGetRequest, options?: Configuration): Promise<OrderLine> {
        return this.api.orderLinesGet(param.adAccountId, param.orderLineId,  options).toPromise();
    }

    /**
     * List existing order lines associated with an ad account.
     * Get order lines
     * @param param the request object
     */
    public orderLinesListWithHttpInfo(param: OrderLinesApiOrderLinesListRequest, options?: Configuration): Promise<HttpInfo<OrderLinesList200Response>> {
        return this.api.orderLinesListWithHttpInfo(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * List existing order lines associated with an ad account.
     * Get order lines
     * @param param the request object
     */
    public orderLinesList(param: OrderLinesApiOrderLinesListRequest, options?: Configuration): Promise<OrderLinesList200Response> {
        return this.api.orderLinesList(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

}

import { ObservablePinsApi } from "./ObservableAPI";
import { PinsApiRequestFactory, PinsApiResponseProcessor} from "../apis/PinsApi";

export interface PinsApiPinsAnalyticsRequest {
    /**
     * Unique identifier of a Pin.
     * @type string
     * @memberof PinsApipinsAnalytics
     */
    pinId: string
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @type string
     * @memberof PinsApipinsAnalytics
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @type string
     * @memberof PinsApipinsAnalytics
     */
    endDate: string
    /**
     * Pin metric types to get data for, default is all.
     * @type Array&lt;PinsAnalyticsMetricTypesParameterInner&gt;
     * @memberof PinsApipinsAnalytics
     */
    metricTypes: Array<PinsAnalyticsMetricTypesParameterInner>
    /**
     * Apps or devices to get data for, default is all.
     * @type &#39;ALL&#39; | &#39;MOBILE&#39; | &#39;TABLET&#39; | &#39;WEB&#39;
     * @memberof PinsApipinsAnalytics
     */
    appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB'
    /**
     * How to split the data into groups. Not including this param means data won\&#39;t be split.
     * @type &#39;NO_SPLIT&#39; | &#39;APP_TYPE&#39;
     * @memberof PinsApipinsAnalytics
     */
    splitField?: 'NO_SPLIT' | 'APP_TYPE'
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof PinsApipinsAnalytics
     */
    adAccountId?: string
}

export interface PinsApiPinsCreateRequest {
    /**
     * Create a new Pin.
     * @type PinCreate
     * @memberof PinsApipinsCreate
     */
    pinCreate: PinCreate
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof PinsApipinsCreate
     */
    adAccountId?: string
}

export interface PinsApiPinsDeleteRequest {
    /**
     * Unique identifier of a Pin.
     * @type string
     * @memberof PinsApipinsDelete
     */
    pinId: string
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof PinsApipinsDelete
     */
    adAccountId?: string
}

export interface PinsApiPinsGetRequest {
    /**
     * Unique identifier of a Pin.
     * @type string
     * @memberof PinsApipinsGet
     */
    pinId: string
    /**
     * Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * @type boolean
     * @memberof PinsApipinsGet
     */
    pinMetrics?: boolean
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof PinsApipinsGet
     */
    adAccountId?: string
}

export interface PinsApiPinsListRequest {
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof PinsApipinsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof PinsApipinsList
     */
    pageSize?: number
    /**
     * Pin filter.
     * @type &#39;exclude_native&#39; | &#39;exclude_repins&#39; | &#39;has_been_promoted&#39;
     * @memberof PinsApipinsList
     */
    pinFilter?: 'exclude_native' | 'exclude_repins' | 'has_been_promoted'
    /**
     * Specify if return pins from protected boards
     * @type boolean
     * @memberof PinsApipinsList
     */
    includeProtectedPins?: boolean
    /**
     * The type of pins to return, currently only enabled for private pins
     * @type &#39;PRIVATE&#39;
     * @memberof PinsApipinsList
     */
    pinType?: 'PRIVATE'
    /**
     * Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
     * @type Array&lt;&#39;REGULAR&#39; | &#39;VIDEO&#39; | &#39;SHOPPING&#39; | &#39;CAROUSEL&#39; | &#39;MAX_VIDEO&#39; | &#39;SHOP_THE_PIN&#39; | &#39;COLLECTION&#39; | &#39;IDEA&#39;&gt;
     * @memberof PinsApipinsList
     */
    creativeTypes?: Array<'REGULAR' | 'VIDEO' | 'SHOPPING' | 'CAROUSEL' | 'MAX_VIDEO' | 'SHOP_THE_PIN' | 'COLLECTION' | 'IDEA'>
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof PinsApipinsList
     */
    adAccountId?: string
    /**
     * Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * @type boolean
     * @memberof PinsApipinsList
     */
    pinMetrics?: boolean
}

export interface PinsApiPinsSaveRequest {
    /**
     * Unique identifier of a Pin.
     * @type string
     * @memberof PinsApipinsSave
     */
    pinId: string
    /**
     * Request object used to save an existing pin
     * @type PinsSaveRequest
     * @memberof PinsApipinsSave
     */
    pinsSaveRequest: PinsSaveRequest
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof PinsApipinsSave
     */
    adAccountId?: string
}

export interface PinsApiPinsUpdateRequest {
    /**
     * Unique identifier of a Pin.
     * @type string
     * @memberof PinsApipinsUpdate
     */
    pinId: string
    /**
     * 
     * @type PinUpdate
     * @memberof PinsApipinsUpdate
     */
    pinUpdate: PinUpdate
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof PinsApipinsUpdate
     */
    adAccountId?: string
}

export class ObjectPinsApi {
    private api: ObservablePinsApi

    public constructor(configuration: Configuration, requestFactory?: PinsApiRequestFactory, responseProcessor?: PinsApiResponseProcessor) {
        this.api = new ObservablePinsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Get Pin analytics
     * @param param the request object
     */
    public pinsAnalyticsWithHttpInfo(param: PinsApiPinsAnalyticsRequest, options?: Configuration): Promise<HttpInfo<{ [key: string]: PinAnalyticsMetricsResponse; }>> {
        return this.api.pinsAnalyticsWithHttpInfo(param.pinId, param.startDate, param.endDate, param.metricTypes, param.appTypes, param.splitField, param.adAccountId,  options).toPromise();
    }

    /**
     * Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Get Pin analytics
     * @param param the request object
     */
    public pinsAnalytics(param: PinsApiPinsAnalyticsRequest, options?: Configuration): Promise<{ [key: string]: PinAnalyticsMetricsResponse; }> {
        return this.api.pinsAnalytics(param.pinId, param.startDate, param.endDate, param.metricTypes, param.appTypes, param.splitField, param.adAccountId,  options).toPromise();
    }

    /**
     * Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user\'s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account\'s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called \'curated content\', please use our <a href=\'/docs/add-ons/save-button\'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href=\'/docs/content/content-creation/\'>Content App Solutions Guide</a>.  <strong><a href=\'/docs/content/content-creation/#Creating%20video%20Pins\'>Learn more</a></strong> about video Pin creation.
     * Create Pin
     * @param param the request object
     */
    public pinsCreateWithHttpInfo(param: PinsApiPinsCreateRequest, options?: Configuration): Promise<HttpInfo<Pin>> {
        return this.api.pinsCreateWithHttpInfo(param.pinCreate, param.adAccountId,  options).toPromise();
    }

    /**
     * Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user\'s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account\'s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called \'curated content\', please use our <a href=\'/docs/add-ons/save-button\'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href=\'/docs/content/content-creation/\'>Content App Solutions Guide</a>.  <strong><a href=\'/docs/content/content-creation/#Creating%20video%20Pins\'>Learn more</a></strong> about video Pin creation.
     * Create Pin
     * @param param the request object
     */
    public pinsCreate(param: PinsApiPinsCreateRequest, options?: Configuration): Promise<Pin> {
        return this.api.pinsCreate(param.pinCreate, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     * Delete Pin
     * @param param the request object
     */
    public pinsDeleteWithHttpInfo(param: PinsApiPinsDeleteRequest, options?: Configuration): Promise<HttpInfo<void>> {
        return this.api.pinsDeleteWithHttpInfo(param.pinId, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     * Delete Pin
     * @param param the request object
     */
    public pinsDelete(param: PinsApiPinsDeleteRequest, options?: Configuration): Promise<void> {
        return this.api.pinsDelete(param.pinId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     * Get Pin
     * @param param the request object
     */
    public pinsGetWithHttpInfo(param: PinsApiPinsGetRequest, options?: Configuration): Promise<HttpInfo<Pin>> {
        return this.api.pinsGetWithHttpInfo(param.pinId, param.pinMetrics, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     * Get Pin
     * @param param the request object
     */
    public pinsGet(param: PinsApiPinsGetRequest, options?: Configuration): Promise<Pin> {
        return this.api.pinsGet(param.pinId, param.pinMetrics, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of the Pins owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * List Pins
     * @param param the request object
     */
    public pinsListWithHttpInfo(param: PinsApiPinsListRequest = {}, options?: Configuration): Promise<HttpInfo<PinsList200Response>> {
        return this.api.pinsListWithHttpInfo(param.bookmark, param.pageSize, param.pinFilter, param.includeProtectedPins, param.pinType, param.creativeTypes, param.adAccountId, param.pinMetrics,  options).toPromise();
    }

    /**
     * Get a list of the Pins owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * List Pins
     * @param param the request object
     */
    public pinsList(param: PinsApiPinsListRequest = {}, options?: Configuration): Promise<PinsList200Response> {
        return this.api.pinsList(param.bookmark, param.pageSize, param.pinFilter, param.includeProtectedPins, param.pinType, param.creativeTypes, param.adAccountId, param.pinMetrics,  options).toPromise();
    }

    /**
     * Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
     * Save Pin
     * @param param the request object
     */
    public pinsSaveWithHttpInfo(param: PinsApiPinsSaveRequest, options?: Configuration): Promise<HttpInfo<Pin>> {
        return this.api.pinsSaveWithHttpInfo(param.pinId, param.pinsSaveRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
     * Save Pin
     * @param param the request object
     */
    public pinsSave(param: PinsApiPinsSaveRequest, options?: Configuration): Promise<Pin> {
        return this.api.pinsSave(param.pinId, param.pinsSaveRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Update Pin
     * @param param the request object
     */
    public pinsUpdateWithHttpInfo(param: PinsApiPinsUpdateRequest, options?: Configuration): Promise<HttpInfo<Pin>> {
        return this.api.pinsUpdateWithHttpInfo(param.pinId, param.pinUpdate, param.adAccountId,  options).toPromise();
    }

    /**
     * Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Update Pin
     * @param param the request object
     */
    public pinsUpdate(param: PinsApiPinsUpdateRequest, options?: Configuration): Promise<Pin> {
        return this.api.pinsUpdate(param.pinId, param.pinUpdate, param.adAccountId,  options).toPromise();
    }

}

import { ObservableProductGroupPromotionsApi } from "./ObservableAPI";
import { ProductGroupPromotionsApiRequestFactory, ProductGroupPromotionsApiResponseProcessor} from "../apis/ProductGroupPromotionsApi";

export interface ProductGroupPromotionsApiProductGroupPromotionsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsCreate
     */
    adAccountId: string
    /**
     * List of Product Group Promotions to create, size limit [1, 30].
     * @type ProductGroupPromotionCreateRequest
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsCreate
     */
    productGroupPromotionCreateRequest: ProductGroupPromotionCreateRequest
}

export interface ProductGroupPromotionsApiProductGroupPromotionsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsGet
     */
    adAccountId: string
    /**
     * Unique identifier of a product group promotion
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsGet
     */
    productGroupPromotionId: string
}

export interface ProductGroupPromotionsApiProductGroupPromotionsListRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsList
     */
    adAccountId: string
    /**
     * List of Product group promotion Ids.
     * @type Array&lt;string&gt;
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsList
     */
    productGroupPromotionIds?: Array<string>
    /**
     * Entity status
     * @type Array&lt;&#39;ACTIVE&#39; | &#39;PAUSED&#39; | &#39;ARCHIVED&#39; | &#39;DRAFT&#39; | &#39;DELETED_DRAFT&#39;&gt;
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsList
     */
    entityStatuses?: Array<'ACTIVE' | 'PAUSED' | 'ARCHIVED' | 'DRAFT' | 'DELETED_DRAFT'>
    /**
     * Ad group Id.
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsList
     */
    adGroupId?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsList
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsList
     */
    bookmark?: string
}

export interface ProductGroupPromotionsApiProductGroupPromotionsUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsUpdate
     */
    adAccountId: string
    /**
     * Parameters to update Product group promotions
     * @type ProductGroupPromotionUpdateRequest
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsUpdate
     */
    productGroupPromotionUpdateRequest: ProductGroupPromotionUpdateRequest
}

export interface ProductGroupPromotionsApiProductGroupsAnalyticsRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    adAccountId: string
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    endDate: string
    /**
     * List of Product group Ids to use to filter the results.
     * @type Array&lt;string&gt;
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    productGroupIds: Array<string>
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;VIDEO_LENGTH&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @type Granularity
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
}

export class ObjectProductGroupPromotionsApi {
    private api: ObservableProductGroupPromotionsApi

    public constructor(configuration: Configuration, requestFactory?: ProductGroupPromotionsApiRequestFactory, responseProcessor?: ProductGroupPromotionsApiResponseProcessor) {
        this.api = new ObservableProductGroupPromotionsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a \'product group promotion.\')
     * Create product group promotions
     * @param param the request object
     */
    public productGroupPromotionsCreateWithHttpInfo(param: ProductGroupPromotionsApiProductGroupPromotionsCreateRequest, options?: Configuration): Promise<HttpInfo<ProductGroupPromotionResponse>> {
        return this.api.productGroupPromotionsCreateWithHttpInfo(param.adAccountId, param.productGroupPromotionCreateRequest,  options).toPromise();
    }

    /**
     * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a \'product group promotion.\')
     * Create product group promotions
     * @param param the request object
     */
    public productGroupPromotionsCreate(param: ProductGroupPromotionsApiProductGroupPromotionsCreateRequest, options?: Configuration): Promise<ProductGroupPromotionResponse> {
        return this.api.productGroupPromotionsCreate(param.adAccountId, param.productGroupPromotionCreateRequest,  options).toPromise();
    }

    /**
     * Get a product group promotion by id
     * Get a product group promotion by id
     * @param param the request object
     */
    public productGroupPromotionsGetWithHttpInfo(param: ProductGroupPromotionsApiProductGroupPromotionsGetRequest, options?: Configuration): Promise<HttpInfo<ProductGroupPromotionResponse>> {
        return this.api.productGroupPromotionsGetWithHttpInfo(param.adAccountId, param.productGroupPromotionId,  options).toPromise();
    }

    /**
     * Get a product group promotion by id
     * Get a product group promotion by id
     * @param param the request object
     */
    public productGroupPromotionsGet(param: ProductGroupPromotionsApiProductGroupPromotionsGetRequest, options?: Configuration): Promise<ProductGroupPromotionResponse> {
        return this.api.productGroupPromotionsGet(param.adAccountId, param.productGroupPromotionId,  options).toPromise();
    }

    /**
     * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
     * Get product group promotions
     * @param param the request object
     */
    public productGroupPromotionsListWithHttpInfo(param: ProductGroupPromotionsApiProductGroupPromotionsListRequest, options?: Configuration): Promise<HttpInfo<ProductGroupPromotionsList200Response>> {
        return this.api.productGroupPromotionsListWithHttpInfo(param.adAccountId, param.productGroupPromotionIds, param.entityStatuses, param.adGroupId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
     * Get product group promotions
     * @param param the request object
     */
    public productGroupPromotionsList(param: ProductGroupPromotionsApiProductGroupPromotionsListRequest, options?: Configuration): Promise<ProductGroupPromotionsList200Response> {
        return this.api.productGroupPromotionsList(param.adAccountId, param.productGroupPromotionIds, param.entityStatuses, param.adGroupId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * Update multiple existing Product Group Promotions (by product_group_id)
     * Update product group promotions
     * @param param the request object
     */
    public productGroupPromotionsUpdateWithHttpInfo(param: ProductGroupPromotionsApiProductGroupPromotionsUpdateRequest, options?: Configuration): Promise<HttpInfo<ProductGroupPromotionResponse>> {
        return this.api.productGroupPromotionsUpdateWithHttpInfo(param.adAccountId, param.productGroupPromotionUpdateRequest,  options).toPromise();
    }

    /**
     * Update multiple existing Product Group Promotions (by product_group_id)
     * Update product group promotions
     * @param param the request object
     */
    public productGroupPromotionsUpdate(param: ProductGroupPromotionsApiProductGroupPromotionsUpdateRequest, options?: Configuration): Promise<ProductGroupPromotionResponse> {
        return this.api.productGroupPromotionsUpdate(param.adAccountId, param.productGroupPromotionUpdateRequest,  options).toPromise();
    }

    /**
     * Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get product group analytics
     * @param param the request object
     */
    public productGroupsAnalyticsWithHttpInfo(param: ProductGroupPromotionsApiProductGroupsAnalyticsRequest, options?: Configuration): Promise<HttpInfo<Array<ProductGroupAnalyticsResponseInner>>> {
        return this.api.productGroupsAnalyticsWithHttpInfo(param.adAccountId, param.startDate, param.endDate, param.productGroupIds, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime,  options).toPromise();
    }

    /**
     * Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get product group analytics
     * @param param the request object
     */
    public productGroupsAnalytics(param: ProductGroupPromotionsApiProductGroupsAnalyticsRequest, options?: Configuration): Promise<Array<ProductGroupAnalyticsResponseInner>> {
        return this.api.productGroupsAnalytics(param.adAccountId, param.startDate, param.endDate, param.productGroupIds, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime,  options).toPromise();
    }

}

import { ObservableProductGroupsApi } from "./ObservableAPI";
import { ProductGroupsApiRequestFactory, ProductGroupsApiResponseProcessor} from "../apis/ProductGroupsApi";

export interface ProductGroupsApiAdAccountsCatalogsProductGroupsListRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof ProductGroupsApiadAccountsCatalogsProductGroupsList
     */
    adAccountId: string
    /**
     * The feed profile id whose catalog product groups we want to return.
     * @type string
     * @memberof ProductGroupsApiadAccountsCatalogsProductGroupsList
     */
    feedProfileId?: string
}

export class ObjectProductGroupsApi {
    private api: ObservableProductGroupsApi

    public constructor(configuration: Configuration, requestFactory?: ProductGroupsApiRequestFactory, responseProcessor?: ProductGroupsApiResponseProcessor) {
        this.api = new ObservableProductGroupsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * This endpoint is completely deprecated. Please use <a href=\'/docs/api/v5/#operation/catalogs_product_groups/list\'>List product groups</a> from Catalogs API instead.
     * Get catalog product groups
     * @param param the request object
     */
    public adAccountsCatalogsProductGroupsListWithHttpInfo(param: ProductGroupsApiAdAccountsCatalogsProductGroupsListRequest, options?: Configuration): Promise<HttpInfo<AdAccountsCatalogsProductGroupsList200Response>> {
        return this.api.adAccountsCatalogsProductGroupsListWithHttpInfo(param.adAccountId, param.feedProfileId,  options).toPromise();
    }

    /**
     * This endpoint is completely deprecated. Please use <a href=\'/docs/api/v5/#operation/catalogs_product_groups/list\'>List product groups</a> from Catalogs API instead.
     * Get catalog product groups
     * @param param the request object
     */
    public adAccountsCatalogsProductGroupsList(param: ProductGroupsApiAdAccountsCatalogsProductGroupsListRequest, options?: Configuration): Promise<AdAccountsCatalogsProductGroupsList200Response> {
        return this.api.adAccountsCatalogsProductGroupsList(param.adAccountId, param.feedProfileId,  options).toPromise();
    }

}

import { ObservableResourcesApi } from "./ObservableAPI";
import { ResourcesApiRequestFactory, ResourcesApiResponseProcessor} from "../apis/ResourcesApi";

export interface ResourcesApiAdAccountCountriesGetRequest {
}

export interface ResourcesApiDeliveryMetricsGetRequest {
    /**
     * Report type.
     * @type &#39;SYNC&#39; | &#39;ASYNC&#39;
     * @memberof ResourcesApideliveryMetricsGet
     */
    reportType?: 'SYNC' | 'ASYNC'
}

export interface ResourcesApiInterestTargetingOptionsGetRequest {
    /**
     * Unique identifier of an interest.
     * @type string
     * @memberof ResourcesApiinterestTargetingOptionsGet
     */
    interestId: string
}

export interface ResourcesApiLeadFormQuestionsGetRequest {
}

export interface ResourcesApiMetricsReadyStateGetRequest {
    /**
     * Analytics reports request date (UTC). Format: YYYY-MM-DD
     * @type string
     * @memberof ResourcesApimetricsReadyStateGet
     */
    date: string
}

export interface ResourcesApiTargetingOptionsGetRequest {
    /**
     * Public targeting type.
     * @type &#39;APPTYPE&#39; | &#39;GENDER&#39; | &#39;LOCALE&#39; | &#39;AGE_BUCKET&#39; | &#39;LOCATION&#39; | &#39;GEO&#39; | &#39;INTEREST&#39; | &#39;KEYWORD&#39; | &#39;AUDIENCE_INCLUDE&#39; | &#39;AUDIENCE_EXCLUDE&#39;
     * @memberof ResourcesApitargetingOptionsGet
     */
    targetingType: 'APPTYPE' | 'GENDER' | 'LOCALE' | 'AGE_BUCKET' | 'LOCATION' | 'GEO' | 'INTEREST' | 'KEYWORD' | 'AUDIENCE_INCLUDE' | 'AUDIENCE_EXCLUDE'
    /**
     * Client ID.
     * @type string
     * @memberof ResourcesApitargetingOptionsGet
     */
    clientId?: string
    /**
     * Oauth signature
     * @type string
     * @memberof ResourcesApitargetingOptionsGet
     */
    oauthSignature?: string
    /**
     * Timestamp
     * @type string
     * @memberof ResourcesApitargetingOptionsGet
     */
    timestamp?: string
}

export class ObjectResourcesApi {
    private api: ObservableResourcesApi

    public constructor(configuration: Configuration, requestFactory?: ResourcesApiRequestFactory, responseProcessor?: ResourcesApiResponseProcessor) {
        this.api = new ObservableResourcesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get Ad Accounts countries
     * Get ad accounts countries
     * @param param the request object
     */
    public adAccountCountriesGetWithHttpInfo(param: ResourcesApiAdAccountCountriesGetRequest = {}, options?: Configuration): Promise<HttpInfo<AdAccountsCountryResponse>> {
        return this.api.adAccountCountriesGetWithHttpInfo( options).toPromise();
    }

    /**
     * Get Ad Accounts countries
     * Get ad accounts countries
     * @param param the request object
     */
    public adAccountCountriesGet(param: ResourcesApiAdAccountCountriesGetRequest = {}, options?: Configuration): Promise<AdAccountsCountryResponse> {
        return this.api.adAccountCountriesGet( options).toPromise();
    }

    /**
     * Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href=\'/docs/content/analytics/\'>Organic Analytics</a> and <a href=\'/docs/ads/ad-analytics-reporting/\'>Ads Analytics</a> for more information.
     * Get available metrics\' definitions
     * @param param the request object
     */
    public deliveryMetricsGetWithHttpInfo(param: ResourcesApiDeliveryMetricsGetRequest = {}, options?: Configuration): Promise<HttpInfo<DeliveryMetricsResponse>> {
        return this.api.deliveryMetricsGetWithHttpInfo(param.reportType,  options).toPromise();
    }

    /**
     * Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href=\'/docs/content/analytics/\'>Organic Analytics</a> and <a href=\'/docs/ads/ad-analytics-reporting/\'>Ads Analytics</a> for more information.
     * Get available metrics\' definitions
     * @param param the request object
     */
    public deliveryMetricsGet(param: ResourcesApiDeliveryMetricsGetRequest = {}, options?: Configuration): Promise<DeliveryMetricsResponse> {
        return this.api.deliveryMetricsGet(param.reportType,  options).toPromise();
    }

    /**
     * <p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>
     * Get interest details
     * @param param the request object
     */
    public interestTargetingOptionsGetWithHttpInfo(param: ResourcesApiInterestTargetingOptionsGetRequest, options?: Configuration): Promise<HttpInfo<SingleInterestTargetingOptionResponse>> {
        return this.api.interestTargetingOptionsGetWithHttpInfo(param.interestId,  options).toPromise();
    }

    /**
     * <p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>
     * Get interest details
     * @param param the request object
     */
    public interestTargetingOptionsGet(param: ResourcesApiInterestTargetingOptionsGetRequest, options?: Configuration): Promise<SingleInterestTargetingOptionResponse> {
        return this.api.interestTargetingOptionsGet(param.interestId,  options).toPromise();
    }

    /**
     * Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get lead form questions
     * @param param the request object
     */
    public leadFormQuestionsGetWithHttpInfo(param: ResourcesApiLeadFormQuestionsGetRequest = {}, options?: Configuration): Promise<HttpInfo<void>> {
        return this.api.leadFormQuestionsGetWithHttpInfo( options).toPromise();
    }

    /**
     * Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get lead form questions
     * @param param the request object
     */
    public leadFormQuestionsGet(param: ResourcesApiLeadFormQuestionsGetRequest = {}, options?: Configuration): Promise<void> {
        return this.api.leadFormQuestionsGet( options).toPromise();
    }

    /**
     * Learn whether conversion or non-conversion metrics are finalized and ready to query.
     * Get metrics ready state
     * @param param the request object
     */
    public metricsReadyStateGetWithHttpInfo(param: ResourcesApiMetricsReadyStateGetRequest, options?: Configuration): Promise<HttpInfo<BookClosedResponse>> {
        return this.api.metricsReadyStateGetWithHttpInfo(param.date,  options).toPromise();
    }

    /**
     * Learn whether conversion or non-conversion metrics are finalized and ready to query.
     * Get metrics ready state
     * @param param the request object
     */
    public metricsReadyStateGet(param: ResourcesApiMetricsReadyStateGetRequest, options?: Configuration): Promise<BookClosedResponse> {
        return this.api.metricsReadyStateGet(param.date,  options).toPromise();
    }

    /**
     * <p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>
     * Get targeting options
     * @param param the request object
     */
    public targetingOptionsGetWithHttpInfo(param: ResourcesApiTargetingOptionsGetRequest, options?: Configuration): Promise<HttpInfo<Array<any>>> {
        return this.api.targetingOptionsGetWithHttpInfo(param.targetingType, param.clientId, param.oauthSignature, param.timestamp,  options).toPromise();
    }

    /**
     * <p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>
     * Get targeting options
     * @param param the request object
     */
    public targetingOptionsGet(param: ResourcesApiTargetingOptionsGetRequest, options?: Configuration): Promise<Array<any>> {
        return this.api.targetingOptionsGet(param.targetingType, param.clientId, param.oauthSignature, param.timestamp,  options).toPromise();
    }

}

import { ObservableSearchApi } from "./ObservableAPI";
import { SearchApiRequestFactory, SearchApiResponseProcessor} from "../apis/SearchApi";

export interface SearchApiSearchPartnerPinsRequest {
    /**
     * Search term to look up pins.
     * @type string
     * @memberof SearchApisearchPartnerPins
     */
    term: string
    /**
     * Two letter country code (ISO 3166-1 alpha-2)
     * @type string
     * @memberof SearchApisearchPartnerPins
     */
    countryCode: string
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof SearchApisearchPartnerPins
     */
    bookmark?: string
    /**
     * Search locale.
     * @type string
     * @memberof SearchApisearchPartnerPins
     */
    locale?: string
    /**
     * Max search result size
     * @type number
     * @memberof SearchApisearchPartnerPins
     */
    limit?: number
}

export interface SearchApiSearchUserBoardsGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof SearchApisearchUserBoardsGet
     */
    adAccountId?: string
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof SearchApisearchUserBoardsGet
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof SearchApisearchUserBoardsGet
     */
    pageSize?: number
    /**
     * Search query. Can contain pin description keywords or comma-separated pin IDs.
     * @type string
     * @memberof SearchApisearchUserBoardsGet
     */
    query?: string
}

export interface SearchApiSearchUserPinsListRequest {
    /**
     * Search query. Can contain pin description keywords or comma-separated pin IDs.
     * @type string
     * @memberof SearchApisearchUserPinsList
     */
    query: string
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof SearchApisearchUserPinsList
     */
    adAccountId?: string
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof SearchApisearchUserPinsList
     */
    bookmark?: string
}

export class ObjectSearchApi {
    private api: ObservableSearchApi

    public constructor(configuration: Configuration, requestFactory?: SearchApiRequestFactory, responseProcessor?: SearchApiResponseProcessor) {
        this.api = new ObservableSearchApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
     * Search pins by a given search term
     * @param param the request object
     */
    public searchPartnerPinsWithHttpInfo(param: SearchApiSearchPartnerPinsRequest, options?: Configuration): Promise<HttpInfo<SearchPartnerPins200Response>> {
        return this.api.searchPartnerPinsWithHttpInfo(param.term, param.countryCode, param.bookmark, param.locale, param.limit,  options).toPromise();
    }

    /**
     * <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
     * Search pins by a given search term
     * @param param the request object
     */
    public searchPartnerPins(param: SearchApiSearchPartnerPinsRequest, options?: Configuration): Promise<SearchPartnerPins200Response> {
        return this.api.searchPartnerPins(param.term, param.countryCode, param.bookmark, param.locale, param.limit,  options).toPromise();
    }

    /**
     * Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/reference/business-access/\'>Understanding Business Access</a> for more information.
     * Search user\'s boards
     * @param param the request object
     */
    public searchUserBoardsGetWithHttpInfo(param: SearchApiSearchUserBoardsGetRequest = {}, options?: Configuration): Promise<HttpInfo<SearchUserBoardsGet200Response>> {
        return this.api.searchUserBoardsGetWithHttpInfo(param.adAccountId, param.bookmark, param.pageSize, param.query,  options).toPromise();
    }

    /**
     * Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/reference/business-access/\'>Understanding Business Access</a> for more information.
     * Search user\'s boards
     * @param param the request object
     */
    public searchUserBoardsGet(param: SearchApiSearchUserBoardsGetRequest = {}, options?: Configuration): Promise<SearchUserBoardsGet200Response> {
        return this.api.searchUserBoardsGet(param.adAccountId, param.bookmark, param.pageSize, param.query,  options).toPromise();
    }

    /**
     * Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/reference/business-access/\'>Understanding Business Access</a> for more information.
     * Search user\'s Pins
     * @param param the request object
     */
    public searchUserPinsListWithHttpInfo(param: SearchApiSearchUserPinsListRequest, options?: Configuration): Promise<HttpInfo<PinsList200Response>> {
        return this.api.searchUserPinsListWithHttpInfo(param.query, param.adAccountId, param.bookmark,  options).toPromise();
    }

    /**
     * Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/reference/business-access/\'>Understanding Business Access</a> for more information.
     * Search user\'s Pins
     * @param param the request object
     */
    public searchUserPinsList(param: SearchApiSearchUserPinsListRequest, options?: Configuration): Promise<PinsList200Response> {
        return this.api.searchUserPinsList(param.query, param.adAccountId, param.bookmark,  options).toPromise();
    }

}

import { ObservableTermsApi } from "./ObservableAPI";
import { TermsApiRequestFactory, TermsApiResponseProcessor} from "../apis/TermsApi";

export interface TermsApiTermsRelatedListRequest {
    /**
     * List of input terms.
     * @type Array&lt;string&gt;
     * @memberof TermsApitermsRelatedList
     */
    terms: Array<string>
}

export interface TermsApiTermsSuggestedListRequest {
    /**
     * Input term.
     * @type string
     * @memberof TermsApitermsSuggestedList
     */
    term: string
    /**
     * Max suggested terms to return.
     * @type number
     * @memberof TermsApitermsSuggestedList
     */
    limit?: number
}

export class ObjectTermsApi {
    private api: ObservableTermsApi

    public constructor(configuration: Configuration, requestFactory?: TermsApiRequestFactory, responseProcessor?: TermsApiResponseProcessor) {
        this.api = new ObservableTermsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get a list of terms logically related to each input term. <p/> Example: the term \'workout\' would list related terms like \'one song workout\', \'yoga workout\', \'workout motivation\', etc.
     * List related terms
     * @param param the request object
     */
    public termsRelatedListWithHttpInfo(param: TermsApiTermsRelatedListRequest, options?: Configuration): Promise<HttpInfo<RelatedTerms>> {
        return this.api.termsRelatedListWithHttpInfo(param.terms,  options).toPromise();
    }

    /**
     * Get a list of terms logically related to each input term. <p/> Example: the term \'workout\' would list related terms like \'one song workout\', \'yoga workout\', \'workout motivation\', etc.
     * List related terms
     * @param param the request object
     */
    public termsRelatedList(param: TermsApiTermsRelatedListRequest, options?: Configuration): Promise<RelatedTerms> {
        return this.api.termsRelatedList(param.terms,  options).toPromise();
    }

    /**
     * Get popular search terms that begin with your input term. <p/> Example: \'sport\' would return popular terms like \'sports bar\' and \'sportswear\', but not \'motor sports\' since the phrase does not begin with the given term.
     * List suggested terms
     * @param param the request object
     */
    public termsSuggestedListWithHttpInfo(param: TermsApiTermsSuggestedListRequest, options?: Configuration): Promise<HttpInfo<Array<string>>> {
        return this.api.termsSuggestedListWithHttpInfo(param.term, param.limit,  options).toPromise();
    }

    /**
     * Get popular search terms that begin with your input term. <p/> Example: \'sport\' would return popular terms like \'sports bar\' and \'sportswear\', but not \'motor sports\' since the phrase does not begin with the given term.
     * List suggested terms
     * @param param the request object
     */
    public termsSuggestedList(param: TermsApiTermsSuggestedListRequest, options?: Configuration): Promise<Array<string>> {
        return this.api.termsSuggestedList(param.term, param.limit,  options).toPromise();
    }

}

import { ObservableTermsOfServiceApi } from "./ObservableAPI";
import { TermsOfServiceApiRequestFactory, TermsOfServiceApiResponseProcessor} from "../apis/TermsOfServiceApi";

export interface TermsOfServiceApiTermsOfServiceGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof TermsOfServiceApitermsOfServiceGet
     */
    adAccountId: string
    /**
     * Return HTML in TOS text.
     * @type boolean
     * @memberof TermsOfServiceApitermsOfServiceGet
     */
    includeHtml?: boolean
    /**
     * Request type.
     * @type string
     * @memberof TermsOfServiceApitermsOfServiceGet
     */
    tosType?: string
}

export class ObjectTermsOfServiceApi {
    private api: ObservableTermsOfServiceApi

    public constructor(configuration: Configuration, requestFactory?: TermsOfServiceApiRequestFactory, responseProcessor?: TermsOfServiceApiResponseProcessor) {
        this.api = new ObservableTermsOfServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
     * Get terms of service
     * @param param the request object
     */
    public termsOfServiceGetWithHttpInfo(param: TermsOfServiceApiTermsOfServiceGetRequest, options?: Configuration): Promise<HttpInfo<TermsOfService>> {
        return this.api.termsOfServiceGetWithHttpInfo(param.adAccountId, param.includeHtml, param.tosType,  options).toPromise();
    }

    /**
     * Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
     * Get terms of service
     * @param param the request object
     */
    public termsOfServiceGet(param: TermsOfServiceApiTermsOfServiceGetRequest, options?: Configuration): Promise<TermsOfService> {
        return this.api.termsOfServiceGet(param.adAccountId, param.includeHtml, param.tosType,  options).toPromise();
    }

}

import { ObservableUserAccountApi } from "./ObservableAPI";
import { UserAccountApiRequestFactory, UserAccountApiResponseProcessor} from "../apis/UserAccountApi";

export interface UserAccountApiBoardsUserFollowsListRequest {
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof UserAccountApiboardsUserFollowsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof UserAccountApiboardsUserFollowsList
     */
    pageSize?: number
    /**
     * Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
     * @type boolean
     * @memberof UserAccountApiboardsUserFollowsList
     */
    explicitFollowing?: boolean
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof UserAccountApiboardsUserFollowsList
     */
    adAccountId?: string
}

export interface UserAccountApiFollowUserUpdateRequest {
    /**
     * A valid username
     * @type string
     * @memberof UserAccountApifollowUserUpdate
     */
    username: string
    /**
     * Follow a user.
     * @type FollowUserRequest
     * @memberof UserAccountApifollowUserUpdate
     */
    followUserRequest: FollowUserRequest
}

export interface UserAccountApiFollowersListRequest {
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof UserAccountApifollowersList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof UserAccountApifollowersList
     */
    pageSize?: number
}

export interface UserAccountApiLinkedBusinessAccountsGetRequest {
}

export interface UserAccountApiUnverifyWebsiteDeleteRequest {
    /**
     * Website with path or domain only
     * @type string
     * @memberof UserAccountApiunverifyWebsiteDelete
     */
    website: string
}

export interface UserAccountApiUserAccountAnalyticsRequest {
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @type string
     * @memberof UserAccountApiuserAccountAnalytics
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @type string
     * @memberof UserAccountApiuserAccountAnalytics
     */
    endDate: string
    /**
     * Filter on Pins that match your claimed domain.
     * @type &#39;OTHER&#39; | &#39;CLAIMED&#39; | &#39;BOTH&#39;
     * @memberof UserAccountApiuserAccountAnalytics
     */
    fromClaimedContent?: 'OTHER' | 'CLAIMED' | 'BOTH'
    /**
     * Pin formats to get data for, default is all.
     * @type &#39;ALL&#39; | &#39;ORGANIC_IMAGE&#39; | &#39;ORGANIC_PRODUCT&#39; | &#39;ORGANIC_VIDEO&#39; | &#39;ADS_STANDARD&#39; | &#39;ADS_PRODUCT&#39; | &#39;ADS_VIDEO&#39; | &#39;ADS_IDEA&#39; | &#39;PRODUCT&#39; | &#39;REGULAR&#39; | &#39;VIDEO&#39;
     * @memberof UserAccountApiuserAccountAnalytics
     */
    pinFormat?: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | 'PRODUCT' | 'REGULAR' | 'VIDEO'
    /**
     * Apps or devices to get data for, default is all.
     * @type &#39;ALL&#39; | &#39;MOBILE&#39; | &#39;TABLET&#39; | &#39;WEB&#39;
     * @memberof UserAccountApiuserAccountAnalytics
     */
    appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB'
    /**
     * Filter to paid or organic data. Default is all.
     * @type &#39;ALL&#39; | &#39;PAID&#39; | &#39;ORGANIC&#39;
     * @memberof UserAccountApiuserAccountAnalytics
     */
    contentType?: 'ALL' | 'PAID' | 'ORGANIC'
    /**
     * Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
     * @type &#39;ALL&#39; | &#39;YOUR_PINS&#39; | &#39;OTHER_PINS&#39;
     * @memberof UserAccountApiuserAccountAnalytics
     */
    source?: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS'
    /**
     * Metric types to get data for, default is all. 
     * @type Array&lt;&#39;ENGAGEMENT&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;IMPRESSION&#39; | &#39;OUTBOUND_CLICK&#39; | &#39;OUTBOUND_CLICK_RATE&#39; | &#39;PIN_CLICK&#39; | &#39;PIN_CLICK_RATE&#39; | &#39;SAVE&#39; | &#39;SAVE_RATE&#39;&gt;
     * @memberof UserAccountApiuserAccountAnalytics
     */
    metricTypes?: Array<'ENGAGEMENT' | 'ENGAGEMENT_RATE' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'OUTBOUND_CLICK_RATE' | 'PIN_CLICK' | 'PIN_CLICK_RATE' | 'SAVE' | 'SAVE_RATE'>
    /**
     * How to split the data into groups. Not including this param means data won\&#39;t be split.
     * @type &#39;NO_SPLIT&#39; | &#39;APP_TYPE&#39; | &#39;OWNED_CONTENT&#39; | &#39;SOURCE&#39; | &#39;PIN_FORMAT&#39;
     * @memberof UserAccountApiuserAccountAnalytics
     */
    splitField?: 'NO_SPLIT' | 'APP_TYPE' | 'OWNED_CONTENT' | 'SOURCE' | 'PIN_FORMAT'
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof UserAccountApiuserAccountAnalytics
     */
    adAccountId?: string
}

export interface UserAccountApiUserAccountAnalyticsTopPinsRequest {
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @type string
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @type string
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    endDate: string
    /**
     * Specify sorting order for metrics
     * @type &#39;ENGAGEMENT&#39; | &#39;IMPRESSION&#39; | &#39;OUTBOUND_CLICK&#39; | &#39;PIN_CLICK&#39; | &#39;SAVE&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    sortBy: 'ENGAGEMENT' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'PIN_CLICK' | 'SAVE'
    /**
     * Filter on Pins that match your claimed domain.
     * @type &#39;OTHER&#39; | &#39;CLAIMED&#39; | &#39;BOTH&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    fromClaimedContent?: 'OTHER' | 'CLAIMED' | 'BOTH'
    /**
     * Pin formats to get data for, default is all.
     * @type &#39;ALL&#39; | &#39;ORGANIC_IMAGE&#39; | &#39;ORGANIC_PRODUCT&#39; | &#39;ORGANIC_VIDEO&#39; | &#39;ADS_STANDARD&#39; | &#39;ADS_PRODUCT&#39; | &#39;ADS_VIDEO&#39; | &#39;ADS_IDEA&#39; | &#39;PRODUCT&#39; | &#39;REGULAR&#39; | &#39;VIDEO&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    pinFormat?: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | 'PRODUCT' | 'REGULAR' | 'VIDEO'
    /**
     * Apps or devices to get data for, default is all.
     * @type &#39;ALL&#39; | &#39;MOBILE&#39; | &#39;TABLET&#39; | &#39;WEB&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB'
    /**
     * Filter to paid or organic data. Default is all.
     * @type &#39;ALL&#39; | &#39;PAID&#39; | &#39;ORGANIC&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    contentType?: 'ALL' | 'PAID' | 'ORGANIC'
    /**
     * Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
     * @type &#39;ALL&#39; | &#39;YOUR_PINS&#39; | &#39;OTHER_PINS&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    source?: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS'
    /**
     * Metric types to get data for, default is all. 
     * @type Array&lt;&#39;ENGAGEMENT&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;IMPRESSION&#39; | &#39;OUTBOUND_CLICK&#39; | &#39;OUTBOUND_CLICK_RATE&#39; | &#39;PIN_CLICK&#39; | &#39;PIN_CLICK_RATE&#39; | &#39;SAVE&#39; | &#39;SAVE_RATE&#39;&gt;
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    metricTypes?: Array<'ENGAGEMENT' | 'ENGAGEMENT_RATE' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'OUTBOUND_CLICK_RATE' | 'PIN_CLICK' | 'PIN_CLICK_RATE' | 'SAVE' | 'SAVE_RATE'>
    /**
     * Number of pins to include, default is 10. Max is 50.
     * @type number
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    numOfPins?: number
    /**
     * Get metrics for pins created in the last \&quot;n\&quot; days.
     * @type 30
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    createdInLastNDays?: 30
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    adAccountId?: string
}

export interface UserAccountApiUserAccountAnalyticsTopVideoPinsRequest {
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @type string
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @type string
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    endDate: string
    /**
     * Specify sorting order for video metrics
     * @type &#39;IMPRESSION&#39; | &#39;SAVE&#39; | &#39;OUTBOUND_CLICK&#39; | &#39;VIDEO_MRC_VIEW&#39; | &#39;VIDEO_AVG_WATCH_TIME&#39; | &#39;VIDEO_V50_WATCH_TIME&#39; | &#39;QUARTILE_95_PERCENT_VIEW&#39; | &#39;VIDEO_10S_VIEW&#39; | &#39;VIDEO_START&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    sortBy: 'IMPRESSION' | 'SAVE' | 'OUTBOUND_CLICK' | 'VIDEO_MRC_VIEW' | 'VIDEO_AVG_WATCH_TIME' | 'VIDEO_V50_WATCH_TIME' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_10S_VIEW' | 'VIDEO_START'
    /**
     * Filter on Pins that match your claimed domain.
     * @type &#39;OTHER&#39; | &#39;CLAIMED&#39; | &#39;BOTH&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    fromClaimedContent?: 'OTHER' | 'CLAIMED' | 'BOTH'
    /**
     * Pin formats to get data for, default is all.
     * @type &#39;ALL&#39; | &#39;ORGANIC_IMAGE&#39; | &#39;ORGANIC_PRODUCT&#39; | &#39;ORGANIC_VIDEO&#39; | &#39;ADS_STANDARD&#39; | &#39;ADS_PRODUCT&#39; | &#39;ADS_VIDEO&#39; | &#39;ADS_IDEA&#39; | &#39;PRODUCT&#39; | &#39;REGULAR&#39; | &#39;VIDEO&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    pinFormat?: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | 'PRODUCT' | 'REGULAR' | 'VIDEO'
    /**
     * Apps or devices to get data for, default is all.
     * @type &#39;ALL&#39; | &#39;MOBILE&#39; | &#39;TABLET&#39; | &#39;WEB&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB'
    /**
     * Filter to paid or organic data. Default is all.
     * @type &#39;ALL&#39; | &#39;PAID&#39; | &#39;ORGANIC&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    contentType?: 'ALL' | 'PAID' | 'ORGANIC'
    /**
     * Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
     * @type &#39;ALL&#39; | &#39;YOUR_PINS&#39; | &#39;OTHER_PINS&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    source?: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS'
    /**
     * Metric types to get video data for, default is all. 
     * @type Array&lt;&#39;IMPRESSION&#39; | &#39;SAVE&#39; | &#39;VIDEO_MRC_VIEW&#39; | &#39;VIDEO_AVG_WATCH_TIME&#39; | &#39;VIDEO_V50_WATCH_TIME&#39; | &#39;QUARTILE_95_PERCENT_VIEW&#39; | &#39;VIDEO_10S_VIEW&#39; | &#39;VIDEO_START&#39; | &#39;OUTBOUND_CLICK&#39;&gt;
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    metricTypes?: Array<'IMPRESSION' | 'SAVE' | 'VIDEO_MRC_VIEW' | 'VIDEO_AVG_WATCH_TIME' | 'VIDEO_V50_WATCH_TIME' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_10S_VIEW' | 'VIDEO_START' | 'OUTBOUND_CLICK'>
    /**
     * Number of pins to include, default is 10. Max is 50.
     * @type number
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    numOfPins?: number
    /**
     * Get metrics for pins created in the last \&quot;n\&quot; days.
     * @type 30
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    createdInLastNDays?: 30
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    adAccountId?: string
}

export interface UserAccountApiUserAccountFollowedInterestsRequest {
    /**
     * A valid username
     * @type string
     * @memberof UserAccountApiuserAccountFollowedInterests
     */
    username: string
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof UserAccountApiuserAccountFollowedInterests
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof UserAccountApiuserAccountFollowedInterests
     */
    pageSize?: number
}

export interface UserAccountApiUserAccountGetRequest {
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof UserAccountApiuserAccountGet
     */
    adAccountId?: string
}

export interface UserAccountApiUserFollowingGetRequest {
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof UserAccountApiuserFollowingGet
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof UserAccountApiuserFollowingGet
     */
    pageSize?: number
    /**
     * Thrift param specifying what type of followees will be kept. Default to include all followees.
     * @type UserFollowingFeedType
     * @memberof UserAccountApiuserFollowingGet
     */
    feedType?: UserFollowingFeedType
    /**
     * Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
     * @type boolean
     * @memberof UserAccountApiuserFollowingGet
     */
    explicitFollowing?: boolean
    /**
     * Unique identifier of an ad account.
     * @type string
     * @memberof UserAccountApiuserFollowingGet
     */
    adAccountId?: string
}

export interface UserAccountApiUserWebsitesGetRequest {
    /**
     * Cursor used to fetch the next page of items
     * @type string
     * @memberof UserAccountApiuserWebsitesGet
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @type number
     * @memberof UserAccountApiuserWebsitesGet
     */
    pageSize?: number
}

export interface UserAccountApiVerifyWebsiteUpdateRequest {
    /**
     * Verify a website.
     * @type UserWebsiteVerifyRequest
     * @memberof UserAccountApiverifyWebsiteUpdate
     */
    userWebsiteVerifyRequest: UserWebsiteVerifyRequest
}

export interface UserAccountApiWebsiteVerificationGetRequest {
}

export class ObjectUserAccountApi {
    private api: ObservableUserAccountApi

    public constructor(configuration: Configuration, requestFactory?: UserAccountApiRequestFactory, responseProcessor?: UserAccountApiResponseProcessor) {
        this.api = new ObservableUserAccountApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get a list of the boards a user follows. The request returns a board summary object array.
     * List following boards
     * @param param the request object
     */
    public boardsUserFollowsListWithHttpInfo(param: UserAccountApiBoardsUserFollowsListRequest = {}, options?: Configuration): Promise<HttpInfo<BoardsUserFollowsList200Response>> {
        return this.api.boardsUserFollowsListWithHttpInfo(param.bookmark, param.pageSize, param.explicitFollowing, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of the boards a user follows. The request returns a board summary object array.
     * List following boards
     * @param param the request object
     */
    public boardsUserFollowsList(param: UserAccountApiBoardsUserFollowsListRequest = {}, options?: Configuration): Promise<BoardsUserFollowsList200Response> {
        return this.api.boardsUserFollowsList(param.bookmark, param.pageSize, param.explicitFollowing, param.adAccountId,  options).toPromise();
    }

    /**
     * <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.
     * Follow user
     * @param param the request object
     */
    public followUserUpdateWithHttpInfo(param: UserAccountApiFollowUserUpdateRequest, options?: Configuration): Promise<HttpInfo<UserSummary>> {
        return this.api.followUserUpdateWithHttpInfo(param.username, param.followUserRequest,  options).toPromise();
    }

    /**
     * <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.
     * Follow user
     * @param param the request object
     */
    public followUserUpdate(param: UserAccountApiFollowUserUpdateRequest, options?: Configuration): Promise<UserSummary> {
        return this.api.followUserUpdate(param.username, param.followUserRequest,  options).toPromise();
    }

    /**
     * Get a list of your followers.
     * List followers
     * @param param the request object
     */
    public followersListWithHttpInfo(param: UserAccountApiFollowersListRequest = {}, options?: Configuration): Promise<HttpInfo<FollowersList200Response>> {
        return this.api.followersListWithHttpInfo(param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get a list of your followers.
     * List followers
     * @param param the request object
     */
    public followersList(param: UserAccountApiFollowersListRequest = {}, options?: Configuration): Promise<FollowersList200Response> {
        return this.api.followersList(param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get a list of your linked business accounts.
     * List linked businesses
     * @param param the request object
     */
    public linkedBusinessAccountsGetWithHttpInfo(param: UserAccountApiLinkedBusinessAccountsGetRequest = {}, options?: Configuration): Promise<HttpInfo<Array<LinkedBusiness>>> {
        return this.api.linkedBusinessAccountsGetWithHttpInfo( options).toPromise();
    }

    /**
     * Get a list of your linked business accounts.
     * List linked businesses
     * @param param the request object
     */
    public linkedBusinessAccountsGet(param: UserAccountApiLinkedBusinessAccountsGetRequest = {}, options?: Configuration): Promise<Array<LinkedBusiness>> {
        return this.api.linkedBusinessAccountsGet( options).toPromise();
    }

    /**
     * Unverifu a website verified by the signed-in user.
     * Unverify website
     * @param param the request object
     */
    public unverifyWebsiteDeleteWithHttpInfo(param: UserAccountApiUnverifyWebsiteDeleteRequest, options?: Configuration): Promise<HttpInfo<void>> {
        return this.api.unverifyWebsiteDeleteWithHttpInfo(param.website,  options).toPromise();
    }

    /**
     * Unverifu a website verified by the signed-in user.
     * Unverify website
     * @param param the request object
     */
    public unverifyWebsiteDelete(param: UserAccountApiUnverifyWebsiteDeleteRequest, options?: Configuration): Promise<void> {
        return this.api.unverifyWebsiteDelete(param.website,  options).toPromise();
    }

    /**
     * Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account analytics
     * @param param the request object
     */
    public userAccountAnalyticsWithHttpInfo(param: UserAccountApiUserAccountAnalyticsRequest, options?: Configuration): Promise<HttpInfo<{ [key: string]: AnalyticsMetricsResponse; }>> {
        return this.api.userAccountAnalyticsWithHttpInfo(param.startDate, param.endDate, param.fromClaimedContent, param.pinFormat, param.appTypes, param.contentType, param.source, param.metricTypes, param.splitField, param.adAccountId,  options).toPromise();
    }

    /**
     * Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account analytics
     * @param param the request object
     */
    public userAccountAnalytics(param: UserAccountApiUserAccountAnalyticsRequest, options?: Configuration): Promise<{ [key: string]: AnalyticsMetricsResponse; }> {
        return this.api.userAccountAnalytics(param.startDate, param.endDate, param.fromClaimedContent, param.pinFormat, param.appTypes, param.contentType, param.source, param.metricTypes, param.splitField, param.adAccountId,  options).toPromise();
    }

    /**
     * Gets analytics data about a user\'s top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account top pins analytics
     * @param param the request object
     */
    public userAccountAnalyticsTopPinsWithHttpInfo(param: UserAccountApiUserAccountAnalyticsTopPinsRequest, options?: Configuration): Promise<HttpInfo<TopPinsAnalyticsResponse>> {
        return this.api.userAccountAnalyticsTopPinsWithHttpInfo(param.startDate, param.endDate, param.sortBy, param.fromClaimedContent, param.pinFormat, param.appTypes, param.contentType, param.source, param.metricTypes, param.numOfPins, param.createdInLastNDays, param.adAccountId,  options).toPromise();
    }

    /**
     * Gets analytics data about a user\'s top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account top pins analytics
     * @param param the request object
     */
    public userAccountAnalyticsTopPins(param: UserAccountApiUserAccountAnalyticsTopPinsRequest, options?: Configuration): Promise<TopPinsAnalyticsResponse> {
        return this.api.userAccountAnalyticsTopPins(param.startDate, param.endDate, param.sortBy, param.fromClaimedContent, param.pinFormat, param.appTypes, param.contentType, param.source, param.metricTypes, param.numOfPins, param.createdInLastNDays, param.adAccountId,  options).toPromise();
    }

    /**
     * Gets analytics data about a user\'s top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account top video pins analytics
     * @param param the request object
     */
    public userAccountAnalyticsTopVideoPinsWithHttpInfo(param: UserAccountApiUserAccountAnalyticsTopVideoPinsRequest, options?: Configuration): Promise<HttpInfo<TopVideoPinsAnalyticsResponse>> {
        return this.api.userAccountAnalyticsTopVideoPinsWithHttpInfo(param.startDate, param.endDate, param.sortBy, param.fromClaimedContent, param.pinFormat, param.appTypes, param.contentType, param.source, param.metricTypes, param.numOfPins, param.createdInLastNDays, param.adAccountId,  options).toPromise();
    }

    /**
     * Gets analytics data about a user\'s top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account top video pins analytics
     * @param param the request object
     */
    public userAccountAnalyticsTopVideoPins(param: UserAccountApiUserAccountAnalyticsTopVideoPinsRequest, options?: Configuration): Promise<TopVideoPinsAnalyticsResponse> {
        return this.api.userAccountAnalyticsTopVideoPins(param.startDate, param.endDate, param.sortBy, param.fromClaimedContent, param.pinFormat, param.appTypes, param.contentType, param.source, param.metricTypes, param.numOfPins, param.createdInLastNDays, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of a user\'s following interests in one place.
     * List following interests
     * @param param the request object
     */
    public userAccountFollowedInterestsWithHttpInfo(param: UserAccountApiUserAccountFollowedInterestsRequest, options?: Configuration): Promise<HttpInfo<UserAccountFollowedInterests200Response>> {
        return this.api.userAccountFollowedInterestsWithHttpInfo(param.username, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get a list of a user\'s following interests in one place.
     * List following interests
     * @param param the request object
     */
    public userAccountFollowedInterests(param: UserAccountApiUserAccountFollowedInterestsRequest, options?: Configuration): Promise<UserAccountFollowedInterests200Response> {
        return this.api.userAccountFollowedInterests(param.username, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/reference/business-access/\'>Understanding Business Access</a> for more information.
     * Get user account
     * @param param the request object
     */
    public userAccountGetWithHttpInfo(param: UserAccountApiUserAccountGetRequest = {}, options?: Configuration): Promise<HttpInfo<Account>> {
        return this.api.userAccountGetWithHttpInfo(param.adAccountId,  options).toPromise();
    }

    /**
     * Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/reference/business-access/\'>Understanding Business Access</a> for more information.
     * Get user account
     * @param param the request object
     */
    public userAccountGet(param: UserAccountApiUserAccountGetRequest = {}, options?: Configuration): Promise<Account> {
        return this.api.userAccountGet(param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of who a certain user follows.
     * List following
     * @param param the request object
     */
    public userFollowingGetWithHttpInfo(param: UserAccountApiUserFollowingGetRequest = {}, options?: Configuration): Promise<HttpInfo<UserFollowingGet200Response>> {
        return this.api.userFollowingGetWithHttpInfo(param.bookmark, param.pageSize, param.feedType, param.explicitFollowing, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of who a certain user follows.
     * List following
     * @param param the request object
     */
    public userFollowingGet(param: UserAccountApiUserFollowingGetRequest = {}, options?: Configuration): Promise<UserFollowingGet200Response> {
        return this.api.userFollowingGet(param.bookmark, param.pageSize, param.feedType, param.explicitFollowing, param.adAccountId,  options).toPromise();
    }

    /**
     * Get user websites, claimed or not
     * Get user websites
     * @param param the request object
     */
    public userWebsitesGetWithHttpInfo(param: UserAccountApiUserWebsitesGetRequest = {}, options?: Configuration): Promise<HttpInfo<UserWebsitesGet200Response>> {
        return this.api.userWebsitesGetWithHttpInfo(param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get user websites, claimed or not
     * Get user websites
     * @param param the request object
     */
    public userWebsitesGet(param: UserAccountApiUserWebsitesGetRequest = {}, options?: Configuration): Promise<UserWebsitesGet200Response> {
        return this.api.userWebsitesGet(param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Verify a website as a signed-in user.
     * Verify website
     * @param param the request object
     */
    public verifyWebsiteUpdateWithHttpInfo(param: UserAccountApiVerifyWebsiteUpdateRequest, options?: Configuration): Promise<HttpInfo<UserWebsiteSummary>> {
        return this.api.verifyWebsiteUpdateWithHttpInfo(param.userWebsiteVerifyRequest,  options).toPromise();
    }

    /**
     * Verify a website as a signed-in user.
     * Verify website
     * @param param the request object
     */
    public verifyWebsiteUpdate(param: UserAccountApiVerifyWebsiteUpdateRequest, options?: Configuration): Promise<UserWebsiteSummary> {
        return this.api.verifyWebsiteUpdate(param.userWebsiteVerifyRequest,  options).toPromise();
    }

    /**
     * Get verification code for user to install on the website to claim it.
     * Get user verification code for website claiming
     * @param param the request object
     */
    public websiteVerificationGetWithHttpInfo(param: UserAccountApiWebsiteVerificationGetRequest = {}, options?: Configuration): Promise<HttpInfo<UserWebsiteVerificationCode>> {
        return this.api.websiteVerificationGetWithHttpInfo( options).toPromise();
    }

    /**
     * Get verification code for user to install on the website to claim it.
     * Get user verification code for website claiming
     * @param param the request object
     */
    public websiteVerificationGet(param: UserAccountApiWebsiteVerificationGetRequest = {}, options?: Configuration): Promise<UserWebsiteVerificationCode> {
        return this.api.websiteVerificationGet( options).toPromise();
    }

}
