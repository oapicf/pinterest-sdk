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
import { ObservableAdAccountsApi } from './ObservableAPI';

import { AdAccountsApiRequestFactory, AdAccountsApiResponseProcessor} from "../apis/AdAccountsApi";
export class PromiseAdAccountsApi {
    private api: ObservableAdAccountsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AdAccountsApiRequestFactory,
        responseProcessor?: AdAccountsApiResponseProcessor
    ) {
        this.api = new ObservableAdAccountsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.
     * Get ad account analytics
     * @param adAccountId Unique identifier of an ad account.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     */
    public adAccountAnalyticsWithHttpInfo(adAccountId: string, startDate: string, endDate: string, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', _options?: Configuration): Promise<HttpInfo<Array<AdAccountAnalyticsResponseInner>>> {
        const result = this.api.adAccountAnalyticsWithHttpInfo(adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, _options);
        return result.toPromise();
    }

    /**
     * Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.
     * Get ad account analytics
     * @param adAccountId Unique identifier of an ad account.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     */
    public adAccountAnalytics(adAccountId: string, startDate: string, endDate: string, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', _options?: Configuration): Promise<Array<AdAccountAnalyticsResponseInner>> {
        const result = this.api.adAccountAnalytics(adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, _options);
        return result.toPromise();
    }

    /**
     * Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get targeting analytics for an ad account
     * @param adAccountId Unique identifier of an ad account.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @param attributionTypes List of types of attribution for the conversion report
     */
    public adAccountTargetingAnalyticsGetWithHttpInfo(adAccountId: string, startDate: string, endDate: string, targetingTypes: Array<AdsAnalyticsTargetingType>, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', attributionTypes?: ConversionReportAttributionType, _options?: Configuration): Promise<HttpInfo<MetricsResponse>> {
        const result = this.api.adAccountTargetingAnalyticsGetWithHttpInfo(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, _options);
        return result.toPromise();
    }

    /**
     * Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get targeting analytics for an ad account
     * @param adAccountId Unique identifier of an ad account.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @param attributionTypes List of types of attribution for the conversion report
     */
    public adAccountTargetingAnalyticsGet(adAccountId: string, startDate: string, endDate: string, targetingTypes: Array<AdsAnalyticsTargetingType>, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', attributionTypes?: ConversionReportAttributionType, _options?: Configuration): Promise<MetricsResponse> {
        const result = this.api.adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, _options);
        return result.toPromise();
    }

    /**
     * Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/> You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>.
     * Create ad account
     * @param adAccountCreateRequest Ad account to create.
     */
    public adAccountsCreateWithHttpInfo(adAccountCreateRequest: AdAccountCreateRequest, _options?: Configuration): Promise<HttpInfo<AdAccount>> {
        const result = this.api.adAccountsCreateWithHttpInfo(adAccountCreateRequest, _options);
        return result.toPromise();
    }

    /**
     * Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/> You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>.
     * Create ad account
     * @param adAccountCreateRequest Ad account to create.
     */
    public adAccountsCreate(adAccountCreateRequest: AdAccountCreateRequest, _options?: Configuration): Promise<AdAccount> {
        const result = this.api.adAccountsCreate(adAccountCreateRequest, _options);
        return result.toPromise();
    }

    /**
     * Get an ad account
     * Get ad account
     * @param adAccountId Unique identifier of an ad account.
     */
    public adAccountsGetWithHttpInfo(adAccountId: string, _options?: Configuration): Promise<HttpInfo<AdAccount>> {
        const result = this.api.adAccountsGetWithHttpInfo(adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get an ad account
     * Get ad account
     * @param adAccountId Unique identifier of an ad account.
     */
    public adAccountsGet(adAccountId: string, _options?: Configuration): Promise<AdAccount> {
        const result = this.api.adAccountsGet(adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.
     * List ad accounts
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param includeSharedAccounts Include shared ad accounts
     */
    public adAccountsListWithHttpInfo(bookmark?: string, pageSize?: number, includeSharedAccounts?: boolean, _options?: Configuration): Promise<HttpInfo<AdAccountsList200Response>> {
        const result = this.api.adAccountsListWithHttpInfo(bookmark, pageSize, includeSharedAccounts, _options);
        return result.toPromise();
    }

    /**
     * Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.
     * List ad accounts
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param includeSharedAccounts Include shared ad accounts
     */
    public adAccountsList(bookmark?: string, pageSize?: number, includeSharedAccounts?: boolean, _options?: Configuration): Promise<AdAccountsList200Response> {
        const result = this.api.adAccountsList(bookmark, pageSize, includeSharedAccounts, _options);
        return result.toPromise();
    }

    /**
     * This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it\'s in beta release.
     * Create a request for a Marketing Mix Modeling (MMM) report
     * @param adAccountId Unique identifier of an ad account.
     * @param createMMMReportRequest 
     */
    public analyticsCreateMmmReportWithHttpInfo(adAccountId: string, createMMMReportRequest: CreateMMMReportRequest, _options?: Configuration): Promise<HttpInfo<CreateMMMReportResponse>> {
        const result = this.api.analyticsCreateMmmReportWithHttpInfo(adAccountId, createMMMReportRequest, _options);
        return result.toPromise();
    }

    /**
     * This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it\'s in beta release.
     * Create a request for a Marketing Mix Modeling (MMM) report
     * @param adAccountId Unique identifier of an ad account.
     * @param createMMMReportRequest 
     */
    public analyticsCreateMmmReport(adAccountId: string, createMMMReportRequest: CreateMMMReportRequest, _options?: Configuration): Promise<CreateMMMReportResponse> {
        const result = this.api.analyticsCreateMmmReport(adAccountId, createMMMReportRequest, _options);
        return result.toPromise();
    }

    /**
     * This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
     * Create async request for an account analytics report
     * @param adAccountId Unique identifier of an ad account.
     * @param adsAnalyticsCreateAsyncRequest 
     */
    public analyticsCreateReportWithHttpInfo(adAccountId: string, adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest, _options?: Configuration): Promise<HttpInfo<AdsAnalyticsCreateAsyncResponse>> {
        const result = this.api.analyticsCreateReportWithHttpInfo(adAccountId, adsAnalyticsCreateAsyncRequest, _options);
        return result.toPromise();
    }

    /**
     * This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
     * Create async request for an account analytics report
     * @param adAccountId Unique identifier of an ad account.
     * @param adsAnalyticsCreateAsyncRequest 
     */
    public analyticsCreateReport(adAccountId: string, adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest, _options?: Configuration): Promise<AdsAnalyticsCreateAsyncResponse> {
        const result = this.api.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest, _options);
        return result.toPromise();
    }

    /**
     * This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.
     * Create async request for an analytics report using a template
     * @param adAccountId Unique identifier of an ad account.
     * @param templateId Unique identifier of a template.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     */
    public analyticsCreateTemplateReportWithHttpInfo(adAccountId: string, templateId: string, startDate?: string, endDate?: string, granularity?: Granularity, _options?: Configuration): Promise<HttpInfo<AdsAnalyticsCreateAsyncResponse>> {
        const result = this.api.analyticsCreateTemplateReportWithHttpInfo(adAccountId, templateId, startDate, endDate, granularity, _options);
        return result.toPromise();
    }

    /**
     * This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.
     * Create async request for an analytics report using a template
     * @param adAccountId Unique identifier of an ad account.
     * @param templateId Unique identifier of a template.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     */
    public analyticsCreateTemplateReport(adAccountId: string, templateId: string, startDate?: string, endDate?: string, granularity?: Granularity, _options?: Configuration): Promise<AdsAnalyticsCreateAsyncResponse> {
        const result = this.api.analyticsCreateTemplateReport(adAccountId, templateId, startDate, endDate, granularity, _options);
        return result.toPromise();
    }

    /**
     * Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
     * Get advertiser Marketing Mix Modeling (MMM) report.
     * @param adAccountId Unique identifier of an ad account.
     * @param token Token returned from the post request creation call
     */
    public analyticsGetMmmReportWithHttpInfo(adAccountId: string, token: string, _options?: Configuration): Promise<HttpInfo<GetMMMReportResponse>> {
        const result = this.api.analyticsGetMmmReportWithHttpInfo(adAccountId, token, _options);
        return result.toPromise();
    }

    /**
     * Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
     * Get advertiser Marketing Mix Modeling (MMM) report.
     * @param adAccountId Unique identifier of an ad account.
     * @param token Token returned from the post request creation call
     */
    public analyticsGetMmmReport(adAccountId: string, token: string, _options?: Configuration): Promise<GetMMMReportResponse> {
        const result = this.api.analyticsGetMmmReport(adAccountId, token, _options);
        return result.toPromise();
    }

    /**
     * This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
     * Get the account analytics report created by the async call
     * @param adAccountId Unique identifier of an ad account.
     * @param token Token returned from the post request creation call
     */
    public analyticsGetReportWithHttpInfo(adAccountId: string, token: string, _options?: Configuration): Promise<HttpInfo<AdsAnalyticsGetAsyncResponse>> {
        const result = this.api.analyticsGetReportWithHttpInfo(adAccountId, token, _options);
        return result.toPromise();
    }

    /**
     * This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
     * Get the account analytics report created by the async call
     * @param adAccountId Unique identifier of an ad account.
     * @param token Token returned from the post request creation call
     */
    public analyticsGetReport(adAccountId: string, token: string, _options?: Configuration): Promise<AdsAnalyticsGetAsyncResponse> {
        const result = this.api.analyticsGetReport(adAccountId, token, _options);
        return result.toPromise();
    }

    /**
     * Delete an ad account and all the ads data associated with that account.  A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).  Go to https://developers.pinterest.com/docs/dev-tools/sandbox/ for more information.
     * Delete ads data for ad account in API Sandbox
     * @param adAccountId Unique identifier of an ad account.
     */
    public sandboxDeleteWithHttpInfo(adAccountId: string, _options?: Configuration): Promise<HttpInfo<string>> {
        const result = this.api.sandboxDeleteWithHttpInfo(adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Delete an ad account and all the ads data associated with that account.  A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).  Go to https://developers.pinterest.com/docs/dev-tools/sandbox/ for more information.
     * Delete ads data for ad account in API Sandbox
     * @param adAccountId Unique identifier of an ad account.
     */
    public sandboxDelete(adAccountId: string, _options?: Configuration): Promise<string> {
        const result = this.api.sandboxDelete(adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Gets all Templates associated with an ad account ID.
     * List templates
     * @param adAccountId Unique identifier of an ad account.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public templatesListWithHttpInfo(adAccountId: string, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<HttpInfo<TemplatesList200Response>> {
        const result = this.api.templatesListWithHttpInfo(adAccountId, pageSize, order, bookmark, _options);
        return result.toPromise();
    }

    /**
     * Gets all Templates associated with an ad account ID.
     * List templates
     * @param adAccountId Unique identifier of an ad account.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public templatesList(adAccountId: string, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<TemplatesList200Response> {
        const result = this.api.templatesList(adAccountId, pageSize, order, bookmark, _options);
        return result.toPromise();
    }


}



import { ObservableAdGroupsApi } from './ObservableAPI';

import { AdGroupsApiRequestFactory, AdGroupsApiResponseProcessor} from "../apis/AdGroupsApi";
export class PromiseAdGroupsApi {
    private api: ObservableAdGroupsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AdGroupsApiRequestFactory,
        responseProcessor?: AdGroupsApiResponseProcessor
    ) {
        this.api = new ObservableAdGroupsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get ad group analytics
     * @param adAccountId Unique identifier of an ad account.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param adGroupIds List of Ad group Ids to use to filter the results.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     */
    public adGroupsAnalyticsWithHttpInfo(adAccountId: string, startDate: string, endDate: string, adGroupIds: Array<string>, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', _options?: Configuration): Promise<HttpInfo<Array<AdGroupsAnalyticsResponseInner>>> {
        const result = this.api.adGroupsAnalyticsWithHttpInfo(adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, _options);
        return result.toPromise();
    }

    /**
     * Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get ad group analytics
     * @param adAccountId Unique identifier of an ad account.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param adGroupIds List of Ad group Ids to use to filter the results.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     */
    public adGroupsAnalytics(adAccountId: string, startDate: string, endDate: string, adGroupIds: Array<string>, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', _options?: Configuration): Promise<Array<AdGroupsAnalyticsResponseInner>> {
        const result = this.api.adGroupsAnalytics(adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, _options);
        return result.toPromise();
    }

    /**
     * Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     * Get audience sizing
     * @param adAccountId Unique identifier of an ad account.
     * @param adGroupAudienceSizingRequest 
     */
    public adGroupsAudienceSizingWithHttpInfo(adAccountId: string, adGroupAudienceSizingRequest?: AdGroupAudienceSizingRequest, _options?: Configuration): Promise<HttpInfo<AdGroupAudienceSizingResponse>> {
        const result = this.api.adGroupsAudienceSizingWithHttpInfo(adAccountId, adGroupAudienceSizingRequest, _options);
        return result.toPromise();
    }

    /**
     * Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     * Get audience sizing
     * @param adAccountId Unique identifier of an ad account.
     * @param adGroupAudienceSizingRequest 
     */
    public adGroupsAudienceSizing(adAccountId: string, adGroupAudienceSizingRequest?: AdGroupAudienceSizingRequest, _options?: Configuration): Promise<AdGroupAudienceSizingResponse> {
        const result = this.api.adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingRequest, _options);
        return result.toPromise();
    }

    /**
     * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.
     * Get bid floors
     * @param adAccountId Unique identifier of an ad account.
     * @param bidFloorRequest Parameters to get bid_floor info
     */
    public adGroupsBidFloorGetWithHttpInfo(adAccountId: string, bidFloorRequest: BidFloorRequest, _options?: Configuration): Promise<HttpInfo<BidFloor>> {
        const result = this.api.adGroupsBidFloorGetWithHttpInfo(adAccountId, bidFloorRequest, _options);
        return result.toPromise();
    }

    /**
     * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.
     * Get bid floors
     * @param adAccountId Unique identifier of an ad account.
     * @param bidFloorRequest Parameters to get bid_floor info
     */
    public adGroupsBidFloorGet(adAccountId: string, bidFloorRequest: BidFloorRequest, _options?: Configuration): Promise<BidFloor> {
        const result = this.api.adGroupsBidFloorGet(adAccountId, bidFloorRequest, _options);
        return result.toPromise();
    }

    /**
     * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>.</p> <strong>Note:</strong> - \'bid_in_micro_currency\' and \'budget_in_micro_currency\' should be expressed in microcurrency amounts based on the currency field set in the advertiser\'s profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.
     * Create ad groups
     * @param adAccountId Unique identifier of an ad account.
     * @param adGroupCreateRequest List of ad groups to create, size limit [1, 30].
     */
    public adGroupsCreateWithHttpInfo(adAccountId: string, adGroupCreateRequest: Array<AdGroupCreateRequest>, _options?: Configuration): Promise<HttpInfo<AdGroupArrayResponse>> {
        const result = this.api.adGroupsCreateWithHttpInfo(adAccountId, adGroupCreateRequest, _options);
        return result.toPromise();
    }

    /**
     * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>.</p> <strong>Note:</strong> - \'bid_in_micro_currency\' and \'budget_in_micro_currency\' should be expressed in microcurrency amounts based on the currency field set in the advertiser\'s profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.
     * Create ad groups
     * @param adAccountId Unique identifier of an ad account.
     * @param adGroupCreateRequest List of ad groups to create, size limit [1, 30].
     */
    public adGroupsCreate(adAccountId: string, adGroupCreateRequest: Array<AdGroupCreateRequest>, _options?: Configuration): Promise<AdGroupArrayResponse> {
        const result = this.api.adGroupsCreate(adAccountId, adGroupCreateRequest, _options);
        return result.toPromise();
    }

    /**
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
     * Get ad group
     * @param adAccountId Unique identifier of an ad account.
     * @param adGroupId Unique identifier of an ad group.
     */
    public adGroupsGetWithHttpInfo(adAccountId: string, adGroupId: string, _options?: Configuration): Promise<HttpInfo<AdGroupResponse>> {
        const result = this.api.adGroupsGetWithHttpInfo(adAccountId, adGroupId, _options);
        return result.toPromise();
    }

    /**
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
     * Get ad group
     * @param adAccountId Unique identifier of an ad account.
     * @param adGroupId Unique identifier of an ad group.
     */
    public adGroupsGet(adAccountId: string, adGroupId: string, _options?: Configuration): Promise<AdGroupResponse> {
        const result = this.api.adGroupsGet(adAccountId, adGroupId, _options);
        return result.toPromise();
    }

    /**
     * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.
     * List ad groups
     * @param adAccountId Unique identifier of an ad account.
     * @param campaignIds List of Campaign Ids to use to filter the results.
     * @param adGroupIds List of Ad group Ids to use to filter the results.
     * @param entityStatuses Entity status
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     * @param translateInterestsToNames Return interests as text names (if value is true) rather than topic IDs.
     */
    public adGroupsListWithHttpInfo(adAccountId: string, campaignIds?: Array<string>, adGroupIds?: Array<string>, entityStatuses?: Array<'ACTIVE' | 'PAUSED' | 'ARCHIVED' | 'DRAFT' | 'DELETED_DRAFT'>, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, translateInterestsToNames?: boolean, _options?: Configuration): Promise<HttpInfo<AdGroupsList200Response>> {
        const result = this.api.adGroupsListWithHttpInfo(adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames, _options);
        return result.toPromise();
    }

    /**
     * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.
     * List ad groups
     * @param adAccountId Unique identifier of an ad account.
     * @param campaignIds List of Campaign Ids to use to filter the results.
     * @param adGroupIds List of Ad group Ids to use to filter the results.
     * @param entityStatuses Entity status
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     * @param translateInterestsToNames Return interests as text names (if value is true) rather than topic IDs.
     */
    public adGroupsList(adAccountId: string, campaignIds?: Array<string>, adGroupIds?: Array<string>, entityStatuses?: Array<'ACTIVE' | 'PAUSED' | 'ARCHIVED' | 'DRAFT' | 'DELETED_DRAFT'>, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, translateInterestsToNames?: boolean, _options?: Configuration): Promise<AdGroupsList200Response> {
        const result = this.api.adGroupsList(adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames, _options);
        return result.toPromise();
    }

    /**
     * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get targeting analytics for ad groups
     * @param adAccountId Unique identifier of an ad account.
     * @param adGroupIds List of Ad group Ids to use to filter the results.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @param attributionTypes List of types of attribution for the conversion report
     */
    public adGroupsTargetingAnalyticsGetWithHttpInfo(adAccountId: string, adGroupIds: Array<string>, startDate: string, endDate: string, targetingTypes: Array<AdsAnalyticsTargetingType>, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', attributionTypes?: ConversionReportAttributionType, _options?: Configuration): Promise<HttpInfo<MetricsResponse>> {
        const result = this.api.adGroupsTargetingAnalyticsGetWithHttpInfo(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, _options);
        return result.toPromise();
    }

    /**
     * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get targeting analytics for ad groups
     * @param adAccountId Unique identifier of an ad account.
     * @param adGroupIds List of Ad group Ids to use to filter the results.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @param attributionTypes List of types of attribution for the conversion report
     */
    public adGroupsTargetingAnalyticsGet(adAccountId: string, adGroupIds: Array<string>, startDate: string, endDate: string, targetingTypes: Array<AdsAnalyticsTargetingType>, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', attributionTypes?: ConversionReportAttributionType, _options?: Configuration): Promise<MetricsResponse> {
        const result = this.api.adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, _options);
        return result.toPromise();
    }

    /**
     * Update multiple existing ad groups.
     * Update ad groups
     * @param adAccountId Unique identifier of an ad account.
     * @param adGroupUpdateRequest List of ad groups to update, size limit [1, 30].
     */
    public adGroupsUpdateWithHttpInfo(adAccountId: string, adGroupUpdateRequest: Array<AdGroupUpdateRequest>, _options?: Configuration): Promise<HttpInfo<AdGroupArrayResponse>> {
        const result = this.api.adGroupsUpdateWithHttpInfo(adAccountId, adGroupUpdateRequest, _options);
        return result.toPromise();
    }

    /**
     * Update multiple existing ad groups.
     * Update ad groups
     * @param adAccountId Unique identifier of an ad account.
     * @param adGroupUpdateRequest List of ad groups to update, size limit [1, 30].
     */
    public adGroupsUpdate(adAccountId: string, adGroupUpdateRequest: Array<AdGroupUpdateRequest>, _options?: Configuration): Promise<AdGroupArrayResponse> {
        const result = this.api.adGroupsUpdate(adAccountId, adGroupUpdateRequest, _options);
        return result.toPromise();
    }


}



import { ObservableAdsApi } from './ObservableAPI';

import { AdsApiRequestFactory, AdsApiResponseProcessor} from "../apis/AdsApi";
export class PromiseAdsApi {
    private api: ObservableAdsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AdsApiRequestFactory,
        responseProcessor?: AdsApiResponseProcessor
    ) {
        this.api = new ObservableAdsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.
     * Create ad preview with pin or image
     * @param adAccountId Unique identifier of an ad account.
     * @param adPreviewRequest Create ad preview with pin or image.
     */
    public adPreviewsCreateWithHttpInfo(adAccountId: string, adPreviewRequest: AdPreviewRequest, _options?: Configuration): Promise<HttpInfo<AdPreviewURLResponse>> {
        const result = this.api.adPreviewsCreateWithHttpInfo(adAccountId, adPreviewRequest, _options);
        return result.toPromise();
    }

    /**
     * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.
     * Create ad preview with pin or image
     * @param adAccountId Unique identifier of an ad account.
     * @param adPreviewRequest Create ad preview with pin or image.
     */
    public adPreviewsCreate(adAccountId: string, adPreviewRequest: AdPreviewRequest, _options?: Configuration): Promise<AdPreviewURLResponse> {
        const result = this.api.adPreviewsCreate(adAccountId, adPreviewRequest, _options);
        return result.toPromise();
    }

    /**
     * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get targeting analytics for ads
     * @param adAccountId Unique identifier of an ad account.
     * @param adIds List of Ad Ids to use to filter the results.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @param attributionTypes List of types of attribution for the conversion report
     */
    public adTargetingAnalyticsGetWithHttpInfo(adAccountId: string, adIds: Array<string>, startDate: string, endDate: string, targetingTypes: Array<AdsAnalyticsTargetingType>, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', attributionTypes?: ConversionReportAttributionType, _options?: Configuration): Promise<HttpInfo<MetricsResponse>> {
        const result = this.api.adTargetingAnalyticsGetWithHttpInfo(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, _options);
        return result.toPromise();
    }

    /**
     * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get targeting analytics for ads
     * @param adAccountId Unique identifier of an ad account.
     * @param adIds List of Ad Ids to use to filter the results.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @param attributionTypes List of types of attribution for the conversion report
     */
    public adTargetingAnalyticsGet(adAccountId: string, adIds: Array<string>, startDate: string, endDate: string, targetingTypes: Array<AdsAnalyticsTargetingType>, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', attributionTypes?: ConversionReportAttributionType, _options?: Configuration): Promise<MetricsResponse> {
        const result = this.api.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, _options);
        return result.toPromise();
    }

    /**
     * Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get ad analytics
     * @param adAccountId Unique identifier of an ad account.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param adIds List of Ad Ids to use to filter the results.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     */
    public adsAnalyticsWithHttpInfo(adAccountId: string, startDate: string, endDate: string, adIds: Array<string>, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', _options?: Configuration): Promise<HttpInfo<Array<AdsAnalyticsResponseInner>>> {
        const result = this.api.adsAnalyticsWithHttpInfo(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, _options);
        return result.toPromise();
    }

    /**
     * Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get ad analytics
     * @param adAccountId Unique identifier of an ad account.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param adIds List of Ad Ids to use to filter the results.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     */
    public adsAnalytics(adAccountId: string, startDate: string, endDate: string, adIds: Array<string>, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', _options?: Configuration): Promise<Array<AdsAnalyticsResponseInner>> {
        const result = this.api.adsAnalytics(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, _options);
        return result.toPromise();
    }

    /**
     * Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
     * Create ads
     * @param adAccountId Unique identifier of an ad account.
     * @param adCreateRequest List of ads to create, size limit [1, 30].
     */
    public adsCreateWithHttpInfo(adAccountId: string, adCreateRequest: Array<AdCreateRequest>, _options?: Configuration): Promise<HttpInfo<AdArrayResponse>> {
        const result = this.api.adsCreateWithHttpInfo(adAccountId, adCreateRequest, _options);
        return result.toPromise();
    }

    /**
     * Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
     * Create ads
     * @param adAccountId Unique identifier of an ad account.
     * @param adCreateRequest List of ads to create, size limit [1, 30].
     */
    public adsCreate(adAccountId: string, adCreateRequest: Array<AdCreateRequest>, _options?: Configuration): Promise<AdArrayResponse> {
        const result = this.api.adsCreate(adAccountId, adCreateRequest, _options);
        return result.toPromise();
    }

    /**
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
     * Get ad
     * @param adAccountId Unique identifier of an ad account.
     * @param adId Unique identifier of an ad.
     */
    public adsGetWithHttpInfo(adAccountId: string, adId: string, _options?: Configuration): Promise<HttpInfo<AdResponse>> {
        const result = this.api.adsGetWithHttpInfo(adAccountId, adId, _options);
        return result.toPromise();
    }

    /**
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
     * Get ad
     * @param adAccountId Unique identifier of an ad account.
     * @param adId Unique identifier of an ad.
     */
    public adsGet(adAccountId: string, adId: string, _options?: Configuration): Promise<AdResponse> {
        const result = this.api.adsGet(adAccountId, adId, _options);
        return result.toPromise();
    }

    /**
     * List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.
     * List ads
     * @param adAccountId Unique identifier of an ad account.
     * @param campaignIds List of Campaign Ids to use to filter the results.
     * @param adGroupIds List of Ad group Ids to use to filter the results.
     * @param adIds List of Ad Ids to use to filter the results.
     * @param entityStatuses Entity status
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public adsListWithHttpInfo(adAccountId: string, campaignIds?: Array<string>, adGroupIds?: Array<string>, adIds?: Array<string>, entityStatuses?: Array<'ACTIVE' | 'PAUSED' | 'ARCHIVED' | 'DRAFT' | 'DELETED_DRAFT'>, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<HttpInfo<AdsList200Response>> {
        const result = this.api.adsListWithHttpInfo(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark, _options);
        return result.toPromise();
    }

    /**
     * List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.
     * List ads
     * @param adAccountId Unique identifier of an ad account.
     * @param campaignIds List of Campaign Ids to use to filter the results.
     * @param adGroupIds List of Ad group Ids to use to filter the results.
     * @param adIds List of Ad Ids to use to filter the results.
     * @param entityStatuses Entity status
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public adsList(adAccountId: string, campaignIds?: Array<string>, adGroupIds?: Array<string>, adIds?: Array<string>, entityStatuses?: Array<'ACTIVE' | 'PAUSED' | 'ARCHIVED' | 'DRAFT' | 'DELETED_DRAFT'>, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<AdsList200Response> {
        const result = this.api.adsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark, _options);
        return result.toPromise();
    }

    /**
     * Update multiple existing ads
     * Update ads
     * @param adAccountId Unique identifier of an ad account.
     * @param adUpdateRequest List of ads to update, size limit [1, 30]
     */
    public adsUpdateWithHttpInfo(adAccountId: string, adUpdateRequest: Array<AdUpdateRequest>, _options?: Configuration): Promise<HttpInfo<AdArrayResponse>> {
        const result = this.api.adsUpdateWithHttpInfo(adAccountId, adUpdateRequest, _options);
        return result.toPromise();
    }

    /**
     * Update multiple existing ads
     * Update ads
     * @param adAccountId Unique identifier of an ad account.
     * @param adUpdateRequest List of ads to update, size limit [1, 30]
     */
    public adsUpdate(adAccountId: string, adUpdateRequest: Array<AdUpdateRequest>, _options?: Configuration): Promise<AdArrayResponse> {
        const result = this.api.adsUpdate(adAccountId, adUpdateRequest, _options);
        return result.toPromise();
    }


}



import { ObservableAudienceInsightsApi } from './ObservableAPI';

import { AudienceInsightsApiRequestFactory, AudienceInsightsApiResponseProcessor} from "../apis/AudienceInsightsApi";
export class PromiseAudienceInsightsApi {
    private api: ObservableAudienceInsightsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AudienceInsightsApiRequestFactory,
        responseProcessor?: AudienceInsightsApiResponseProcessor
    ) {
        this.api = new ObservableAudienceInsightsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account\'s engaged audience on Pinterest, the ad account\'s total audience on Pinterest and Pinterest\'s total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
     * Get audience insights
     * @param adAccountId Unique identifier of an ad account.
     * @param audienceInsightType Type of audience insights.
     */
    public audienceInsightsGetWithHttpInfo(adAccountId: string, audienceInsightType: AudienceInsightType, _options?: Configuration): Promise<HttpInfo<AudienceInsightsResponse>> {
        const result = this.api.audienceInsightsGetWithHttpInfo(adAccountId, audienceInsightType, _options);
        return result.toPromise();
    }

    /**
     * Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account\'s engaged audience on Pinterest, the ad account\'s total audience on Pinterest and Pinterest\'s total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
     * Get audience insights
     * @param adAccountId Unique identifier of an ad account.
     * @param audienceInsightType Type of audience insights.
     */
    public audienceInsightsGet(adAccountId: string, audienceInsightType: AudienceInsightType, _options?: Configuration): Promise<AudienceInsightsResponse> {
        const result = this.api.audienceInsightsGet(adAccountId, audienceInsightType, _options);
        return result.toPromise();
    }

    /**
     * Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
     * Get audience insights scope and type
     * @param adAccountId Unique identifier of an ad account.
     */
    public audienceInsightsScopeAndTypeGetWithHttpInfo(adAccountId: string, _options?: Configuration): Promise<HttpInfo<AudienceDefinitionResponse>> {
        const result = this.api.audienceInsightsScopeAndTypeGetWithHttpInfo(adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
     * Get audience insights scope and type
     * @param adAccountId Unique identifier of an ad account.
     */
    public audienceInsightsScopeAndTypeGet(adAccountId: string, _options?: Configuration): Promise<AudienceDefinitionResponse> {
        const result = this.api.audienceInsightsScopeAndTypeGet(adAccountId, _options);
        return result.toPromise();
    }


}



import { ObservableAudiencesApi } from './ObservableAPI';

import { AudiencesApiRequestFactory, AudiencesApiResponseProcessor} from "../apis/AudiencesApi";
export class PromiseAudiencesApi {
    private api: ObservableAudiencesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AudiencesApiRequestFactory,
        responseProcessor?: AudiencesApiResponseProcessor
    ) {
        this.api = new ObservableAudiencesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.
     * Create audience
     * @param adAccountId Unique identifier of an ad account.
     * @param audienceCreateRequest List of ads to create, size limit [1, 30]
     */
    public audiencesCreateWithHttpInfo(adAccountId: string, audienceCreateRequest: AudienceCreateRequest, _options?: Configuration): Promise<HttpInfo<Audience>> {
        const result = this.api.audiencesCreateWithHttpInfo(adAccountId, audienceCreateRequest, _options);
        return result.toPromise();
    }

    /**
     * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.
     * Create audience
     * @param adAccountId Unique identifier of an ad account.
     * @param audienceCreateRequest List of ads to create, size limit [1, 30]
     */
    public audiencesCreate(adAccountId: string, audienceCreateRequest: AudienceCreateRequest, _options?: Configuration): Promise<Audience> {
        const result = this.api.audiencesCreate(adAccountId, audienceCreateRequest, _options);
        return result.toPromise();
    }

    /**
     * Create a custom audience and find the audiences you want your ads to reach.
     * Create custom audience
     * @param adAccountId Unique identifier of an ad account.
     * @param audienceCreateCustomRequest Custom audience to create.
     */
    public audiencesCreateCustomWithHttpInfo(adAccountId: string, audienceCreateCustomRequest: AudienceCreateCustomRequest, _options?: Configuration): Promise<HttpInfo<Audience>> {
        const result = this.api.audiencesCreateCustomWithHttpInfo(adAccountId, audienceCreateCustomRequest, _options);
        return result.toPromise();
    }

    /**
     * Create a custom audience and find the audiences you want your ads to reach.
     * Create custom audience
     * @param adAccountId Unique identifier of an ad account.
     * @param audienceCreateCustomRequest Custom audience to create.
     */
    public audiencesCreateCustom(adAccountId: string, audienceCreateCustomRequest: AudienceCreateCustomRequest, _options?: Configuration): Promise<Audience> {
        const result = this.api.audiencesCreateCustom(adAccountId, audienceCreateCustomRequest, _options);
        return result.toPromise();
    }

    /**
     * Get a specific audience given the audience ID.
     * Get audience
     * @param adAccountId Unique identifier of an ad account.
     * @param audienceId Unique identifier of an audience
     */
    public audiencesGetWithHttpInfo(adAccountId: string, audienceId: string, _options?: Configuration): Promise<HttpInfo<Audience>> {
        const result = this.api.audiencesGetWithHttpInfo(adAccountId, audienceId, _options);
        return result.toPromise();
    }

    /**
     * Get a specific audience given the audience ID.
     * Get audience
     * @param adAccountId Unique identifier of an ad account.
     * @param audienceId Unique identifier of an audience
     */
    public audiencesGet(adAccountId: string, audienceId: string, _options?: Configuration): Promise<Audience> {
        const result = this.api.audiencesGet(adAccountId, audienceId, _options);
        return result.toPromise();
    }

    /**
     * Get list of audiences for the ad account.
     * List audiences
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param ownershipType &lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type.
     */
    public audiencesListWithHttpInfo(adAccountId: string, bookmark?: string, order?: 'ASCENDING' | 'DESCENDING', pageSize?: number, ownershipType?: 'OWNED' | 'RECEIVED', _options?: Configuration): Promise<HttpInfo<AudiencesList200Response>> {
        const result = this.api.audiencesListWithHttpInfo(adAccountId, bookmark, order, pageSize, ownershipType, _options);
        return result.toPromise();
    }

    /**
     * Get list of audiences for the ad account.
     * List audiences
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param ownershipType &lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type.
     */
    public audiencesList(adAccountId: string, bookmark?: string, order?: 'ASCENDING' | 'DESCENDING', pageSize?: number, ownershipType?: 'OWNED' | 'RECEIVED', _options?: Configuration): Promise<AudiencesList200Response> {
        const result = this.api.audiencesList(adAccountId, bookmark, order, pageSize, ownershipType, _options);
        return result.toPromise();
    }

    /**
     * Update (edit or remove) an existing targeting audience.
     * Update audience
     * @param adAccountId Unique identifier of an ad account.
     * @param audienceId Unique identifier of an audience
     * @param audienceUpdateRequest The audience to be updated.
     */
    public audiencesUpdateWithHttpInfo(adAccountId: string, audienceId: string, audienceUpdateRequest?: AudienceUpdateRequest, _options?: Configuration): Promise<HttpInfo<Audience>> {
        const result = this.api.audiencesUpdateWithHttpInfo(adAccountId, audienceId, audienceUpdateRequest, _options);
        return result.toPromise();
    }

    /**
     * Update (edit or remove) an existing targeting audience.
     * Update audience
     * @param adAccountId Unique identifier of an ad account.
     * @param audienceId Unique identifier of an audience
     * @param audienceUpdateRequest The audience to be updated.
     */
    public audiencesUpdate(adAccountId: string, audienceId: string, audienceUpdateRequest?: AudienceUpdateRequest, _options?: Configuration): Promise<Audience> {
        const result = this.api.audiencesUpdate(adAccountId, audienceId, audienceUpdateRequest, _options);
        return result.toPromise();
    }


}



import { ObservableBillingApi } from './ObservableAPI';

import { BillingApiRequestFactory, BillingApiResponseProcessor} from "../apis/BillingApi";
export class PromiseBillingApi {
    private api: ObservableBillingApi

    public constructor(
        configuration: Configuration,
        requestFactory?: BillingApiRequestFactory,
        responseProcessor?: BillingApiResponseProcessor
    ) {
        this.api = new ObservableBillingApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Redeem ad credits
     * @param adAccountId Unique identifier of an ad account.
     * @param adsCreditRedeemRequest Redeem ad credits request.
     */
    public adsCreditRedeemWithHttpInfo(adAccountId: string, adsCreditRedeemRequest: AdsCreditRedeemRequest, _options?: Configuration): Promise<HttpInfo<AdsCreditRedeemResponse>> {
        const result = this.api.adsCreditRedeemWithHttpInfo(adAccountId, adsCreditRedeemRequest, _options);
        return result.toPromise();
    }

    /**
     * Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Redeem ad credits
     * @param adAccountId Unique identifier of an ad account.
     * @param adsCreditRedeemRequest Redeem ad credits request.
     */
    public adsCreditRedeem(adAccountId: string, adsCreditRedeemRequest: AdsCreditRedeemRequest, _options?: Configuration): Promise<AdsCreditRedeemResponse> {
        const result = this.api.adsCreditRedeem(adAccountId, adsCreditRedeemRequest, _options);
        return result.toPromise();
    }

    /**
     * Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get ads credit discounts
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public adsCreditsDiscountsGetWithHttpInfo(adAccountId: string, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<HttpInfo<AdsCreditsDiscountsGet200Response>> {
        const result = this.api.adsCreditsDiscountsGetWithHttpInfo(adAccountId, bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get ads credit discounts
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public adsCreditsDiscountsGet(adAccountId: string, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<AdsCreditsDiscountsGet200Response> {
        const result = this.api.adsCreditsDiscountsGet(adAccountId, bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get billing profiles
     * @param adAccountId Unique identifier of an ad account.
     * @param isActive Return active billing profiles, if false return all billing profiles.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public billingProfilesGetWithHttpInfo(adAccountId: string, isActive: boolean, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<HttpInfo<BillingProfilesGet200Response>> {
        const result = this.api.billingProfilesGetWithHttpInfo(adAccountId, isActive, bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get billing profiles
     * @param adAccountId Unique identifier of an ad account.
     * @param isActive Return active billing profiles, if false return all billing profiles.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public billingProfilesGet(adAccountId: string, isActive: boolean, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<BillingProfilesGet200Response> {
        const result = this.api.billingProfilesGet(adAccountId, isActive, bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get Salesforce account details including bill-to information.
     * @param adAccountId Unique identifier of an ad account.
     */
    public ssioAccountsGetWithHttpInfo(adAccountId: string, _options?: Configuration): Promise<HttpInfo<SSIOAccountResponse>> {
        const result = this.api.ssioAccountsGetWithHttpInfo(adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get Salesforce account details including bill-to information.
     * @param adAccountId Unique identifier of an ad account.
     */
    public ssioAccountsGet(adAccountId: string, _options?: Configuration): Promise<SSIOAccountResponse> {
        const result = this.api.ssioAccountsGet(adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Create insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Create insertion order through SSIO.
     * @param adAccountId Unique identifier of an ad account.
     * @param sSIOCreateInsertionOrderRequest Order line to create.
     */
    public ssioInsertionOrderCreateWithHttpInfo(adAccountId: string, sSIOCreateInsertionOrderRequest: SSIOCreateInsertionOrderRequest, _options?: Configuration): Promise<HttpInfo<SSIOCreateInsertionOrderResponse>> {
        const result = this.api.ssioInsertionOrderCreateWithHttpInfo(adAccountId, sSIOCreateInsertionOrderRequest, _options);
        return result.toPromise();
    }

    /**
     * Create insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Create insertion order through SSIO.
     * @param adAccountId Unique identifier of an ad account.
     * @param sSIOCreateInsertionOrderRequest Order line to create.
     */
    public ssioInsertionOrderCreate(adAccountId: string, sSIOCreateInsertionOrderRequest: SSIOCreateInsertionOrderRequest, _options?: Configuration): Promise<SSIOCreateInsertionOrderResponse> {
        const result = this.api.ssioInsertionOrderCreate(adAccountId, sSIOCreateInsertionOrderRequest, _options);
        return result.toPromise();
    }

    /**
     * Edit insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Edit insertion order through SSIO.
     * @param adAccountId Unique identifier of an ad account.
     * @param sSIOEditInsertionOrderRequest Order line to create.
     */
    public ssioInsertionOrderEditWithHttpInfo(adAccountId: string, sSIOEditInsertionOrderRequest: SSIOEditInsertionOrderRequest, _options?: Configuration): Promise<HttpInfo<SSIOEditInsertionOrderResponse>> {
        const result = this.api.ssioInsertionOrderEditWithHttpInfo(adAccountId, sSIOEditInsertionOrderRequest, _options);
        return result.toPromise();
    }

    /**
     * Edit insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Edit insertion order through SSIO.
     * @param adAccountId Unique identifier of an ad account.
     * @param sSIOEditInsertionOrderRequest Order line to create.
     */
    public ssioInsertionOrderEdit(adAccountId: string, sSIOEditInsertionOrderRequest: SSIOEditInsertionOrderRequest, _options?: Configuration): Promise<SSIOEditInsertionOrderResponse> {
        const result = this.api.ssioInsertionOrderEdit(adAccountId, sSIOEditInsertionOrderRequest, _options);
        return result.toPromise();
    }

    /**
     * Get insertion order status for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get insertion order status by ad account id.
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public ssioInsertionOrdersStatusGetByAdAccountWithHttpInfo(adAccountId: string, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<HttpInfo<SsioInsertionOrdersStatusGetByAdAccount200Response>> {
        const result = this.api.ssioInsertionOrdersStatusGetByAdAccountWithHttpInfo(adAccountId, bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * Get insertion order status for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get insertion order status by ad account id.
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public ssioInsertionOrdersStatusGetByAdAccount(adAccountId: string, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<SsioInsertionOrdersStatusGetByAdAccount200Response> {
        const result = this.api.ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * Get insertion order status for pin order id <code>pin_order_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get insertion order status by pin order id.
     * @param adAccountId Unique identifier of an ad account.
     * @param pinOrderId The pin order id associated with the ssio insertion order
     */
    public ssioInsertionOrdersStatusGetByPinOrderIdWithHttpInfo(adAccountId: string, pinOrderId: string, _options?: Configuration): Promise<HttpInfo<SSIOInsertionOrderStatusResponse>> {
        const result = this.api.ssioInsertionOrdersStatusGetByPinOrderIdWithHttpInfo(adAccountId, pinOrderId, _options);
        return result.toPromise();
    }

    /**
     * Get insertion order status for pin order id <code>pin_order_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get insertion order status by pin order id.
     * @param adAccountId Unique identifier of an ad account.
     * @param pinOrderId The pin order id associated with the ssio insertion order
     */
    public ssioInsertionOrdersStatusGetByPinOrderId(adAccountId: string, pinOrderId: string, _options?: Configuration): Promise<SSIOInsertionOrderStatusResponse> {
        const result = this.api.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId, _options);
        return result.toPromise();
    }

    /**
     * Get Salesforce order lines for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get Salesforce order lines by ad account id.
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param pinOrderId The pin order id associated with the ssio insertino order
     */
    public ssioOrderLinesGetByAdAccountWithHttpInfo(adAccountId: string, bookmark?: string, pageSize?: number, pinOrderId?: string, _options?: Configuration): Promise<HttpInfo<SsioOrderLinesGetByAdAccount200Response>> {
        const result = this.api.ssioOrderLinesGetByAdAccountWithHttpInfo(adAccountId, bookmark, pageSize, pinOrderId, _options);
        return result.toPromise();
    }

    /**
     * Get Salesforce order lines for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get Salesforce order lines by ad account id.
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param pinOrderId The pin order id associated with the ssio insertino order
     */
    public ssioOrderLinesGetByAdAccount(adAccountId: string, bookmark?: string, pageSize?: number, pinOrderId?: string, _options?: Configuration): Promise<SsioOrderLinesGetByAdAccount200Response> {
        const result = this.api.ssioOrderLinesGetByAdAccount(adAccountId, bookmark, pageSize, pinOrderId, _options);
        return result.toPromise();
    }


}



import { ObservableBoardsApi } from './ObservableAPI';

import { BoardsApiRequestFactory, BoardsApiResponseProcessor} from "../apis/BoardsApi";
export class PromiseBoardsApi {
    private api: ObservableBoardsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: BoardsApiRequestFactory,
        responseProcessor?: BoardsApiResponseProcessor
    ) {
        this.api = new ObservableBoardsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Create board section
     * @param boardId Unique identifier of a board.
     * @param boardSection Create a board section.
     * @param adAccountId Unique identifier of an ad account.
     */
    public boardSectionsCreateWithHttpInfo(boardId: string, boardSection: BoardSection, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<BoardSection>> {
        const result = this.api.boardSectionsCreateWithHttpInfo(boardId, boardSection, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Create board section
     * @param boardId Unique identifier of a board.
     * @param boardSection Create a board section.
     * @param adAccountId Unique identifier of an ad account.
     */
    public boardSectionsCreate(boardId: string, boardSection: BoardSection, adAccountId?: string, _options?: Configuration): Promise<BoardSection> {
        const result = this.api.boardSectionsCreate(boardId, boardSection, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Delete board section
     * @param boardId Unique identifier of a board.
     * @param sectionId Unique identifier of a board section.
     * @param adAccountId Unique identifier of an ad account.
     */
    public boardSectionsDeleteWithHttpInfo(boardId: string, sectionId: string, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<void>> {
        const result = this.api.boardSectionsDeleteWithHttpInfo(boardId, sectionId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Delete board section
     * @param boardId Unique identifier of a board.
     * @param sectionId Unique identifier of a board section.
     * @param adAccountId Unique identifier of an ad account.
     */
    public boardSectionsDelete(boardId: string, sectionId: string, adAccountId?: string, _options?: Configuration): Promise<void> {
        const result = this.api.boardSectionsDelete(boardId, sectionId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List board sections
     * @param boardId Unique identifier of a board.
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public boardSectionsListWithHttpInfo(boardId: string, adAccountId?: string, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<HttpInfo<BoardSectionsList200Response>> {
        const result = this.api.boardSectionsListWithHttpInfo(boardId, adAccountId, bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List board sections
     * @param boardId Unique identifier of a board.
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public boardSectionsList(boardId: string, adAccountId?: string, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<BoardSectionsList200Response> {
        const result = this.api.boardSectionsList(boardId, adAccountId, bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List Pins on board section
     * @param boardId Unique identifier of a board.
     * @param sectionId Unique identifier of a board section.
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public boardSectionsListPinsWithHttpInfo(boardId: string, sectionId: string, adAccountId?: string, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<HttpInfo<BoardsListPins200Response>> {
        const result = this.api.boardSectionsListPinsWithHttpInfo(boardId, sectionId, adAccountId, bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List Pins on board section
     * @param boardId Unique identifier of a board.
     * @param sectionId Unique identifier of a board section.
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public boardSectionsListPins(boardId: string, sectionId: string, adAccountId?: string, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<BoardsListPins200Response> {
        const result = this.api.boardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Update board section
     * @param boardId Unique identifier of a board.
     * @param sectionId Unique identifier of a board section.
     * @param boardSection Update a board section.
     * @param adAccountId Unique identifier of an ad account.
     */
    public boardSectionsUpdateWithHttpInfo(boardId: string, sectionId: string, boardSection: BoardSection, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<BoardSection>> {
        const result = this.api.boardSectionsUpdateWithHttpInfo(boardId, sectionId, boardSection, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Update board section
     * @param boardId Unique identifier of a board.
     * @param sectionId Unique identifier of a board section.
     * @param boardSection Update a board section.
     * @param adAccountId Unique identifier of an ad account.
     */
    public boardSectionsUpdate(boardId: string, sectionId: string, boardSection: BoardSection, adAccountId?: string, _options?: Configuration): Promise<BoardSection> {
        const result = this.api.boardSectionsUpdate(boardId, sectionId, boardSection, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Create board
     * @param board Create a board using a single board json object.
     * @param adAccountId Unique identifier of an ad account.
     */
    public boardsCreateWithHttpInfo(board: Board, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<Board>> {
        const result = this.api.boardsCreateWithHttpInfo(board, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Create board
     * @param board Create a board using a single board json object.
     * @param adAccountId Unique identifier of an ad account.
     */
    public boardsCreate(board: Board, adAccountId?: string, _options?: Configuration): Promise<Board> {
        const result = this.api.boardsCreate(board, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Delete board
     * @param boardId Unique identifier of a board.
     * @param adAccountId Unique identifier of an ad account.
     */
    public boardsDeleteWithHttpInfo(boardId: string, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<void>> {
        const result = this.api.boardsDeleteWithHttpInfo(boardId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Delete board
     * @param boardId Unique identifier of a board.
     * @param adAccountId Unique identifier of an ad account.
     */
    public boardsDelete(boardId: string, adAccountId?: string, _options?: Configuration): Promise<void> {
        const result = this.api.boardsDelete(boardId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Get board
     * @param boardId Unique identifier of a board.
     * @param adAccountId Unique identifier of an ad account.
     */
    public boardsGetWithHttpInfo(boardId: string, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<Board>> {
        const result = this.api.boardsGetWithHttpInfo(boardId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Get board
     * @param boardId Unique identifier of a board.
     * @param adAccountId Unique identifier of an ad account.
     */
    public boardsGet(boardId: string, adAccountId?: string, _options?: Configuration): Promise<Board> {
        const result = this.api.boardsGet(boardId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
     * List boards
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param privacy Privacy setting for a board.
     */
    public boardsListWithHttpInfo(adAccountId?: string, bookmark?: string, pageSize?: number, privacy?: 'ALL' | 'PROTECTED' | 'PUBLIC' | 'SECRET' | 'PUBLIC_AND_SECRET', _options?: Configuration): Promise<HttpInfo<BoardsList200Response>> {
        const result = this.api.boardsListWithHttpInfo(adAccountId, bookmark, pageSize, privacy, _options);
        return result.toPromise();
    }

    /**
     * Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
     * List boards
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param privacy Privacy setting for a board.
     */
    public boardsList(adAccountId?: string, bookmark?: string, pageSize?: number, privacy?: 'ALL' | 'PROTECTED' | 'PUBLIC' | 'SECRET' | 'PUBLIC_AND_SECRET', _options?: Configuration): Promise<BoardsList200Response> {
        const result = this.api.boardsList(adAccountId, bookmark, pageSize, privacy, _options);
        return result.toPromise();
    }

    /**
     * Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List Pins on board
     * @param boardId Unique identifier of a board.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param creativeTypes Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
     * @param adAccountId Unique identifier of an ad account.
     * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     */
    public boardsListPinsWithHttpInfo(boardId: string, bookmark?: string, pageSize?: number, creativeTypes?: Array<'REGULAR' | 'VIDEO' | 'SHOPPING' | 'CAROUSEL' | 'MAX_VIDEO' | 'SHOP_THE_PIN' | 'COLLECTION' | 'IDEA'>, adAccountId?: string, pinMetrics?: boolean, _options?: Configuration): Promise<HttpInfo<BoardsListPins200Response>> {
        const result = this.api.boardsListPinsWithHttpInfo(boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics, _options);
        return result.toPromise();
    }

    /**
     * Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List Pins on board
     * @param boardId Unique identifier of a board.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param creativeTypes Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
     * @param adAccountId Unique identifier of an ad account.
     * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     */
    public boardsListPins(boardId: string, bookmark?: string, pageSize?: number, creativeTypes?: Array<'REGULAR' | 'VIDEO' | 'SHOPPING' | 'CAROUSEL' | 'MAX_VIDEO' | 'SHOP_THE_PIN' | 'COLLECTION' | 'IDEA'>, adAccountId?: string, pinMetrics?: boolean, _options?: Configuration): Promise<BoardsListPins200Response> {
        const result = this.api.boardsListPins(boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics, _options);
        return result.toPromise();
    }

    /**
     * Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Update board
     * @param boardId Unique identifier of a board.
     * @param boardUpdate Update a board.
     * @param adAccountId Unique identifier of an ad account.
     */
    public boardsUpdateWithHttpInfo(boardId: string, boardUpdate: BoardUpdate, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<Board>> {
        const result = this.api.boardsUpdateWithHttpInfo(boardId, boardUpdate, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Update board
     * @param boardId Unique identifier of a board.
     * @param boardUpdate Update a board.
     * @param adAccountId Unique identifier of an ad account.
     */
    public boardsUpdate(boardId: string, boardUpdate: BoardUpdate, adAccountId?: string, _options?: Configuration): Promise<Board> {
        const result = this.api.boardsUpdate(boardId, boardUpdate, adAccountId, _options);
        return result.toPromise();
    }


}



import { ObservableBulkApi } from './ObservableAPI';

import { BulkApiRequestFactory, BulkApiResponseProcessor} from "../apis/BulkApi";
export class PromiseBulkApi {
    private api: ObservableBulkApi

    public constructor(
        configuration: Configuration,
        requestFactory?: BulkApiRequestFactory,
        responseProcessor?: BulkApiResponseProcessor
    ) {
        this.api = new ObservableBulkApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
     * Get advertiser entities in bulk
     * @param adAccountId Unique identifier of an ad account.
     * @param bulkDownloadRequest Parameters to get ad entities in bulk
     */
    public bulkDownloadCreateWithHttpInfo(adAccountId: string, bulkDownloadRequest: BulkDownloadRequest, _options?: Configuration): Promise<HttpInfo<BulkDownloadResponse>> {
        const result = this.api.bulkDownloadCreateWithHttpInfo(adAccountId, bulkDownloadRequest, _options);
        return result.toPromise();
    }

    /**
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
     * Get advertiser entities in bulk
     * @param adAccountId Unique identifier of an ad account.
     * @param bulkDownloadRequest Parameters to get ad entities in bulk
     */
    public bulkDownloadCreate(adAccountId: string, bulkDownloadRequest: BulkDownloadRequest, _options?: Configuration): Promise<BulkDownloadResponse> {
        const result = this.api.bulkDownloadCreate(adAccountId, bulkDownloadRequest, _options);
        return result.toPromise();
    }

    /**
     * Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
     * Download advertiser entities in bulk
     * @param adAccountId Unique identifier of an ad account.
     * @param bulkRequestId Unique identifier of a bulk upsert request.
     * @param includeDetails if set to True then attach the errors/details to all the requests
     */
    public bulkRequestGetWithHttpInfo(adAccountId: string, bulkRequestId: string, includeDetails?: boolean, _options?: Configuration): Promise<HttpInfo<BulkUpsertStatusResponse>> {
        const result = this.api.bulkRequestGetWithHttpInfo(adAccountId, bulkRequestId, includeDetails, _options);
        return result.toPromise();
    }

    /**
     * Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
     * Download advertiser entities in bulk
     * @param adAccountId Unique identifier of an ad account.
     * @param bulkRequestId Unique identifier of a bulk upsert request.
     * @param includeDetails if set to True then attach the errors/details to all the requests
     */
    public bulkRequestGet(adAccountId: string, bulkRequestId: string, includeDetails?: boolean, _options?: Configuration): Promise<BulkUpsertStatusResponse> {
        const result = this.api.bulkRequestGet(adAccountId, bulkRequestId, includeDetails, _options);
        return result.toPromise();
    }

    /**
     * Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
     * Create/update ad entities in bulk
     * @param adAccountId Unique identifier of an ad account.
     * @param bulkUpsertRequest Parameters to get create/update ad entities in bulk
     */
    public bulkUpsertCreateWithHttpInfo(adAccountId: string, bulkUpsertRequest: BulkUpsertRequest, _options?: Configuration): Promise<HttpInfo<BulkUpsertResponse>> {
        const result = this.api.bulkUpsertCreateWithHttpInfo(adAccountId, bulkUpsertRequest, _options);
        return result.toPromise();
    }

    /**
     * Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
     * Create/update ad entities in bulk
     * @param adAccountId Unique identifier of an ad account.
     * @param bulkUpsertRequest Parameters to get create/update ad entities in bulk
     */
    public bulkUpsertCreate(adAccountId: string, bulkUpsertRequest: BulkUpsertRequest, _options?: Configuration): Promise<BulkUpsertResponse> {
        const result = this.api.bulkUpsertCreate(adAccountId, bulkUpsertRequest, _options);
        return result.toPromise();
    }


}



import { ObservableCampaignsApi } from './ObservableAPI';

import { CampaignsApiRequestFactory, CampaignsApiResponseProcessor} from "../apis/CampaignsApi";
export class PromiseCampaignsApi {
    private api: ObservableCampaignsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: CampaignsApiRequestFactory,
        responseProcessor?: CampaignsApiResponseProcessor
    ) {
        this.api = new ObservableCampaignsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get targeting analytics for campaigns
     * @param adAccountId Unique identifier of an ad account.
     * @param campaignIds List of Campaign Ids to use to filter the results.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @param attributionTypes List of types of attribution for the conversion report
     */
    public campaignTargetingAnalyticsGetWithHttpInfo(adAccountId: string, campaignIds: Array<string>, startDate: string, endDate: string, targetingTypes: Array<AdsAnalyticsTargetingType>, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', attributionTypes?: ConversionReportAttributionType, _options?: Configuration): Promise<HttpInfo<MetricsResponse>> {
        const result = this.api.campaignTargetingAnalyticsGetWithHttpInfo(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, _options);
        return result.toPromise();
    }

    /**
     * Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get targeting analytics for campaigns
     * @param adAccountId Unique identifier of an ad account.
     * @param campaignIds List of Campaign Ids to use to filter the results.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @param attributionTypes List of types of attribution for the conversion report
     */
    public campaignTargetingAnalyticsGet(adAccountId: string, campaignIds: Array<string>, startDate: string, endDate: string, targetingTypes: Array<AdsAnalyticsTargetingType>, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', attributionTypes?: ConversionReportAttributionType, _options?: Configuration): Promise<MetricsResponse> {
        const result = this.api.campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, _options);
        return result.toPromise();
    }

    /**
     * Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get campaign analytics
     * @param adAccountId Unique identifier of an ad account.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param campaignIds List of Campaign Ids to use to filter the results.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     */
    public campaignsAnalyticsWithHttpInfo(adAccountId: string, startDate: string, endDate: string, campaignIds: Array<string>, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', _options?: Configuration): Promise<HttpInfo<Array<CampaignsAnalyticsResponseInner>>> {
        const result = this.api.campaignsAnalyticsWithHttpInfo(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, _options);
        return result.toPromise();
    }

    /**
     * Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get campaign analytics
     * @param adAccountId Unique identifier of an ad account.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param campaignIds List of Campaign Ids to use to filter the results.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     */
    public campaignsAnalytics(adAccountId: string, startDate: string, endDate: string, campaignIds: Array<string>, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', _options?: Configuration): Promise<Array<CampaignsAnalyticsResponseInner>> {
        const result = this.api.campaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, _options);
        return result.toPromise();
    }

    /**
     * Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for \'lifetime_spend_cap\' and \'daily_spend_cap\' are microcurrency amounts based on the currency field set in the advertiser\'s profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
     * Create campaigns
     * @param adAccountId Unique identifier of an ad account.
     * @param campaignCreateRequest Array of campaigns.
     */
    public campaignsCreateWithHttpInfo(adAccountId: string, campaignCreateRequest: Array<CampaignCreateRequest>, _options?: Configuration): Promise<HttpInfo<CampaignCreateResponse>> {
        const result = this.api.campaignsCreateWithHttpInfo(adAccountId, campaignCreateRequest, _options);
        return result.toPromise();
    }

    /**
     * Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for \'lifetime_spend_cap\' and \'daily_spend_cap\' are microcurrency amounts based on the currency field set in the advertiser\'s profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
     * Create campaigns
     * @param adAccountId Unique identifier of an ad account.
     * @param campaignCreateRequest Array of campaigns.
     */
    public campaignsCreate(adAccountId: string, campaignCreateRequest: Array<CampaignCreateRequest>, _options?: Configuration): Promise<CampaignCreateResponse> {
        const result = this.api.campaignsCreate(adAccountId, campaignCreateRequest, _options);
        return result.toPromise();
    }

    /**
     * Get a specific campaign given the campaign ID.
     * Get campaign
     * @param adAccountId Unique identifier of an ad account.
     * @param campaignId Campaign ID, must be associated with the ad account ID provided in the path.
     */
    public campaignsGetWithHttpInfo(adAccountId: string, campaignId: string, _options?: Configuration): Promise<HttpInfo<CampaignResponse>> {
        const result = this.api.campaignsGetWithHttpInfo(adAccountId, campaignId, _options);
        return result.toPromise();
    }

    /**
     * Get a specific campaign given the campaign ID.
     * Get campaign
     * @param adAccountId Unique identifier of an ad account.
     * @param campaignId Campaign ID, must be associated with the ad account ID provided in the path.
     */
    public campaignsGet(adAccountId: string, campaignId: string, _options?: Configuration): Promise<CampaignResponse> {
        const result = this.api.campaignsGet(adAccountId, campaignId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
     * List campaigns
     * @param adAccountId Unique identifier of an ad account.
     * @param campaignIds List of Campaign Ids to use to filter the results.
     * @param entityStatuses Entity status
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public campaignsListWithHttpInfo(adAccountId: string, campaignIds?: Array<string>, entityStatuses?: Array<'ACTIVE' | 'PAUSED' | 'ARCHIVED' | 'DRAFT' | 'DELETED_DRAFT'>, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<HttpInfo<CampaignsList200Response>> {
        const result = this.api.campaignsListWithHttpInfo(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark, _options);
        return result.toPromise();
    }

    /**
     * Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
     * List campaigns
     * @param adAccountId Unique identifier of an ad account.
     * @param campaignIds List of Campaign Ids to use to filter the results.
     * @param entityStatuses Entity status
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public campaignsList(adAccountId: string, campaignIds?: Array<string>, entityStatuses?: Array<'ACTIVE' | 'PAUSED' | 'ARCHIVED' | 'DRAFT' | 'DELETED_DRAFT'>, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<CampaignsList200Response> {
        const result = this.api.campaignsList(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark, _options);
        return result.toPromise();
    }

    /**
     * Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/> - <p>The values for \'lifetime_spend_cap\' and \'daily_spend_cap\' are microcurrency amounts based on the currency field set in the advertiser\'s profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
     * Update campaigns
     * @param adAccountId Unique identifier of an ad account.
     * @param campaignUpdateRequest Array of campaigns.
     */
    public campaignsUpdateWithHttpInfo(adAccountId: string, campaignUpdateRequest: Array<CampaignUpdateRequest>, _options?: Configuration): Promise<HttpInfo<CampaignUpdateResponse>> {
        const result = this.api.campaignsUpdateWithHttpInfo(adAccountId, campaignUpdateRequest, _options);
        return result.toPromise();
    }

    /**
     * Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/> - <p>The values for \'lifetime_spend_cap\' and \'daily_spend_cap\' are microcurrency amounts based on the currency field set in the advertiser\'s profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
     * Update campaigns
     * @param adAccountId Unique identifier of an ad account.
     * @param campaignUpdateRequest Array of campaigns.
     */
    public campaignsUpdate(adAccountId: string, campaignUpdateRequest: Array<CampaignUpdateRequest>, _options?: Configuration): Promise<CampaignUpdateResponse> {
        const result = this.api.campaignsUpdate(adAccountId, campaignUpdateRequest, _options);
        return result.toPromise();
    }


}



import { ObservableCatalogsApi } from './ObservableAPI';

import { CatalogsApiRequestFactory, CatalogsApiResponseProcessor} from "../apis/CatalogsApi";
export class PromiseCatalogsApi {
    private api: ObservableCatalogsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: CatalogsApiRequestFactory,
        responseProcessor?: CatalogsApiResponseProcessor
    ) {
        this.api = new ObservableCatalogsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List catalogs
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param adAccountId Unique identifier of an ad account.
     */
    public catalogsListWithHttpInfo(bookmark?: string, pageSize?: number, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<CatalogsList200Response>> {
        const result = this.api.catalogsListWithHttpInfo(bookmark, pageSize, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List catalogs
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param adAccountId Unique identifier of an ad account.
     */
    public catalogsList(bookmark?: string, pageSize?: number, adAccountId?: string, _options?: Configuration): Promise<CatalogsList200Response> {
        const result = this.api.catalogsList(bookmark, pageSize, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List products for a Product Group
     * @param productGroupId Unique identifier of a product group
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param adAccountId Unique identifier of an ad account.
     */
    public catalogsProductGroupPinsListWithHttpInfo(productGroupId: string, bookmark?: string, pageSize?: number, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<CatalogsProductGroupPinsList200Response>> {
        const result = this.api.catalogsProductGroupPinsListWithHttpInfo(productGroupId, bookmark, pageSize, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List products for a Product Group
     * @param productGroupId Unique identifier of a product group
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param adAccountId Unique identifier of an ad account.
     */
    public catalogsProductGroupPinsList(productGroupId: string, bookmark?: string, pageSize?: number, adAccountId?: string, _options?: Configuration): Promise<CatalogsProductGroupPinsList200Response> {
        const result = this.api.catalogsProductGroupPinsList(productGroupId, bookmark, pageSize, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Create product group
     * @param catalogsProductGroupsCreateRequest Request object used to created a catalogs product group.
     * @param adAccountId Unique identifier of an ad account.
     */
    public catalogsProductGroupsCreateWithHttpInfo(catalogsProductGroupsCreateRequest: CatalogsProductGroupsCreateRequest, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<CatalogsProductGroupsCreate201Response>> {
        const result = this.api.catalogsProductGroupsCreateWithHttpInfo(catalogsProductGroupsCreateRequest, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Create product group
     * @param catalogsProductGroupsCreateRequest Request object used to created a catalogs product group.
     * @param adAccountId Unique identifier of an ad account.
     */
    public catalogsProductGroupsCreate(catalogsProductGroupsCreateRequest: CatalogsProductGroupsCreateRequest, adAccountId?: string, _options?: Configuration): Promise<CatalogsProductGroupsCreate201Response> {
        const result = this.api.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequest, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Delete product group
     * @param productGroupId Unique identifier of a product group
     * @param adAccountId Unique identifier of an ad account.
     */
    public catalogsProductGroupsDeleteWithHttpInfo(productGroupId: string, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<void>> {
        const result = this.api.catalogsProductGroupsDeleteWithHttpInfo(productGroupId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Delete product group
     * @param productGroupId Unique identifier of a product group
     * @param adAccountId Unique identifier of an ad account.
     */
    public catalogsProductGroupsDelete(productGroupId: string, adAccountId?: string, _options?: Configuration): Promise<void> {
        const result = this.api.catalogsProductGroupsDelete(productGroupId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Get product group
     * @param productGroupId Unique identifier of a product group
     * @param adAccountId Unique identifier of an ad account.
     */
    public catalogsProductGroupsGetWithHttpInfo(productGroupId: string, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<CatalogsProductGroupsCreate201Response>> {
        const result = this.api.catalogsProductGroupsGetWithHttpInfo(productGroupId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Get product group
     * @param productGroupId Unique identifier of a product group
     * @param adAccountId Unique identifier of an ad account.
     */
    public catalogsProductGroupsGet(productGroupId: string, adAccountId?: string, _options?: Configuration): Promise<CatalogsProductGroupsCreate201Response> {
        const result = this.api.catalogsProductGroupsGet(productGroupId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List product groups
     * @param feedId Filter entities for a given feed_id. If not given, all feeds are considered.
     * @param catalogId Filter entities for a given catalog_id. If not given, all catalogs are considered.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param adAccountId Unique identifier of an ad account.
     */
    public catalogsProductGroupsListWithHttpInfo(feedId?: string, catalogId?: string, bookmark?: string, pageSize?: number, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<CatalogsProductGroupsList200Response>> {
        const result = this.api.catalogsProductGroupsListWithHttpInfo(feedId, catalogId, bookmark, pageSize, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List product groups
     * @param feedId Filter entities for a given feed_id. If not given, all feeds are considered.
     * @param catalogId Filter entities for a given catalog_id. If not given, all catalogs are considered.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param adAccountId Unique identifier of an ad account.
     */
    public catalogsProductGroupsList(feedId?: string, catalogId?: string, bookmark?: string, pageSize?: number, adAccountId?: string, _options?: Configuration): Promise<CatalogsProductGroupsList200Response> {
        const result = this.api.catalogsProductGroupsList(feedId, catalogId, bookmark, pageSize, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Get product counts for a Product Group
     * @param productGroupId Unique identifier of a product group
     * @param adAccountId Unique identifier of an ad account.
     */
    public catalogsProductGroupsProductCountsGetWithHttpInfo(productGroupId: string, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<CatalogsProductGroupProductCounts>> {
        const result = this.api.catalogsProductGroupsProductCountsGetWithHttpInfo(productGroupId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Get product counts for a Product Group
     * @param productGroupId Unique identifier of a product group
     * @param adAccountId Unique identifier of an ad account.
     */
    public catalogsProductGroupsProductCountsGet(productGroupId: string, adAccountId?: string, _options?: Configuration): Promise<CatalogsProductGroupProductCounts> {
        const result = this.api.catalogsProductGroupsProductCountsGet(productGroupId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Update product group
     * @param productGroupId Unique identifier of a product group
     * @param catalogsProductGroupsUpdateRequest Request object used to Update a catalogs product group.
     * @param adAccountId Unique identifier of an ad account.
     */
    public catalogsProductGroupsUpdateWithHttpInfo(productGroupId: string, catalogsProductGroupsUpdateRequest: CatalogsProductGroupsUpdateRequest, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<CatalogsProductGroupsCreate201Response>> {
        const result = this.api.catalogsProductGroupsUpdateWithHttpInfo(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * Update product group
     * @param productGroupId Unique identifier of a product group
     * @param catalogsProductGroupsUpdateRequest Request object used to Update a catalogs product group.
     * @param adAccountId Unique identifier of an ad account.
     */
    public catalogsProductGroupsUpdate(productGroupId: string, catalogsProductGroupsUpdateRequest: CatalogsProductGroupsUpdateRequest, adAccountId?: string, _options?: Configuration): Promise<CatalogsProductGroupsCreate201Response> {
        const result = this.api.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List processing results for a given feed
     * @param feedId Unique identifier of a feed
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param adAccountId Unique identifier of an ad account.
     */
    public feedProcessingResultsListWithHttpInfo(feedId: string, bookmark?: string, pageSize?: number, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<FeedProcessingResultsList200Response>> {
        const result = this.api.feedProcessingResultsListWithHttpInfo(feedId, bookmark, pageSize, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List processing results for a given feed
     * @param feedId Unique identifier of a feed
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param adAccountId Unique identifier of an ad account.
     */
    public feedProcessingResultsList(feedId: string, bookmark?: string, pageSize?: number, adAccountId?: string, _options?: Configuration): Promise<FeedProcessingResultsList200Response> {
        const result = this.api.feedProcessingResultsList(feedId, bookmark, pageSize, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * Create feed
     * @param feedsCreateRequest Request object used to created a feed.
     * @param adAccountId Unique identifier of an ad account.
     */
    public feedsCreateWithHttpInfo(feedsCreateRequest: FeedsCreateRequest, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<CatalogsFeed>> {
        const result = this.api.feedsCreateWithHttpInfo(feedsCreateRequest, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * Create feed
     * @param feedsCreateRequest Request object used to created a feed.
     * @param adAccountId Unique identifier of an ad account.
     */
    public feedsCreate(feedsCreateRequest: FeedsCreateRequest, adAccountId?: string, _options?: Configuration): Promise<CatalogsFeed> {
        const result = this.api.feedsCreate(feedsCreateRequest, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * Delete feed
     * @param feedId Unique identifier of a feed
     * @param adAccountId Unique identifier of an ad account.
     */
    public feedsDeleteWithHttpInfo(feedId: string, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<void>> {
        const result = this.api.feedsDeleteWithHttpInfo(feedId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * Delete feed
     * @param feedId Unique identifier of a feed
     * @param adAccountId Unique identifier of an ad account.
     */
    public feedsDelete(feedId: string, adAccountId?: string, _options?: Configuration): Promise<void> {
        const result = this.api.feedsDelete(feedId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * Get feed
     * @param feedId Unique identifier of a feed
     * @param adAccountId Unique identifier of an ad account.
     */
    public feedsGetWithHttpInfo(feedId: string, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<CatalogsFeed>> {
        const result = this.api.feedsGetWithHttpInfo(feedId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * Get feed
     * @param feedId Unique identifier of a feed
     * @param adAccountId Unique identifier of an ad account.
     */
    public feedsGet(feedId: string, adAccountId?: string, _options?: Configuration): Promise<CatalogsFeed> {
        const result = this.api.feedsGet(feedId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * List feeds
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param catalogId Filter entities for a given catalog_id. If not given, all catalogs are considered.
     * @param adAccountId Unique identifier of an ad account.
     */
    public feedsListWithHttpInfo(bookmark?: string, pageSize?: number, catalogId?: string, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<FeedsList200Response>> {
        const result = this.api.feedsListWithHttpInfo(bookmark, pageSize, catalogId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * List feeds
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param catalogId Filter entities for a given catalog_id. If not given, all catalogs are considered.
     * @param adAccountId Unique identifier of an ad account.
     */
    public feedsList(bookmark?: string, pageSize?: number, catalogId?: string, adAccountId?: string, _options?: Configuration): Promise<FeedsList200Response> {
        const result = this.api.feedsList(bookmark, pageSize, catalogId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * Update feed
     * @param feedId Unique identifier of a feed
     * @param feedsUpdateRequest Request object used to update a feed.
     * @param adAccountId Unique identifier of an ad account.
     */
    public feedsUpdateWithHttpInfo(feedId: string, feedsUpdateRequest: FeedsUpdateRequest, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<CatalogsFeed>> {
        const result = this.api.feedsUpdateWithHttpInfo(feedId, feedsUpdateRequest, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.
     * Update feed
     * @param feedId Unique identifier of a feed
     * @param feedsUpdateRequest Request object used to update a feed.
     * @param adAccountId Unique identifier of an ad account.
     */
    public feedsUpdate(feedId: string, feedsUpdateRequest: FeedsUpdateRequest, adAccountId?: string, _options?: Configuration): Promise<CatalogsFeed> {
        const result = this.api.feedsUpdate(feedId, feedsUpdateRequest, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * Get catalogs item batch status
     * @param batchId Id of a catalogs items batch to fetch
     * @param adAccountId Unique identifier of an ad account.
     */
    public itemsBatchGetWithHttpInfo(batchId: string, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<CatalogsItemsBatch>> {
        const result = this.api.itemsBatchGetWithHttpInfo(batchId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * Get catalogs item batch status
     * @param batchId Id of a catalogs items batch to fetch
     * @param adAccountId Unique identifier of an ad account.
     */
    public itemsBatchGet(batchId: string, adAccountId?: string, _options?: Configuration): Promise<CatalogsItemsBatch> {
        const result = this.api.itemsBatchGet(batchId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * Operate on item batch
     * @param itemsBatchPostRequest Request object used to create catalogs items in a batch
     * @param adAccountId Unique identifier of an ad account.
     */
    public itemsBatchPostWithHttpInfo(itemsBatchPostRequest: ItemsBatchPostRequest, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<CatalogsItemsBatch>> {
        const result = this.api.itemsBatchPostWithHttpInfo(itemsBatchPostRequest, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * Operate on item batch
     * @param itemsBatchPostRequest Request object used to create catalogs items in a batch
     * @param adAccountId Unique identifier of an ad account.
     */
    public itemsBatchPost(itemsBatchPostRequest: ItemsBatchPostRequest, adAccountId?: string, _options?: Configuration): Promise<CatalogsItemsBatch> {
        const result = this.api.itemsBatchPost(itemsBatchPostRequest, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * Get catalogs items
     * @param country Country for the Catalogs Items
     * @param language Language for the Catalogs Items
     * @param adAccountId Unique identifier of an ad account.
     * @param itemIds This parameter is deprecated. Use filters instead.
     * @param filters Identifies items to be retrieved. This is a required parameter.
     */
    public itemsGetWithHttpInfo(country: string, language: string, adAccountId?: string, itemIds?: Array<string>, filters?: CatalogsItemsFilters, _options?: Configuration): Promise<HttpInfo<CatalogsItems>> {
        const result = this.api.itemsGetWithHttpInfo(country, language, adAccountId, itemIds, filters, _options);
        return result.toPromise();
    }

    /**
     * Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * Get catalogs items
     * @param country Country for the Catalogs Items
     * @param language Language for the Catalogs Items
     * @param adAccountId Unique identifier of an ad account.
     * @param itemIds This parameter is deprecated. Use filters instead.
     * @param filters Identifies items to be retrieved. This is a required parameter.
     */
    public itemsGet(country: string, language: string, adAccountId?: string, itemIds?: Array<string>, filters?: CatalogsItemsFilters, _options?: Configuration): Promise<CatalogsItems> {
        const result = this.api.itemsGet(country, language, adAccountId, itemIds, filters, _options);
        return result.toPromise();
    }

    /**
     * List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters \'item_numbers\' and \'item_validation_issue\' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List item issues for a given processing result
     * @param processingResultId Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list).
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param itemNumbers Item number based on order of appearance in the Catalogs Feed. For example, \&#39;0\&#39; refers to first item found in a feed that was downloaded from a \&#39;location\&#39; specified during feed creation.
     * @param itemValidationIssue Filter item validation issues that have a given type of item validation issue.
     * @param adAccountId Unique identifier of an ad account.
     */
    public itemsIssuesListWithHttpInfo(processingResultId: string, bookmark?: string, pageSize?: number, itemNumbers?: Array<number>, itemValidationIssue?: CatalogsItemValidationIssue, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<ItemsIssuesList200Response>> {
        const result = this.api.itemsIssuesListWithHttpInfo(processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters \'item_numbers\' and \'item_validation_issue\' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List item issues for a given processing result
     * @param processingResultId Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list).
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param itemNumbers Item number based on order of appearance in the Catalogs Feed. For example, \&#39;0\&#39; refers to first item found in a feed that was downloaded from a \&#39;location\&#39; specified during feed creation.
     * @param itemValidationIssue Filter item validation issues that have a given type of item validation issue.
     * @param adAccountId Unique identifier of an ad account.
     */
    public itemsIssuesList(processingResultId: string, bookmark?: string, pageSize?: number, itemNumbers?: Array<number>, itemValidationIssue?: CatalogsItemValidationIssue, adAccountId?: string, _options?: Configuration): Promise<ItemsIssuesList200Response> {
        const result = this.api.itemsIssuesList(processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List filtered products
     * @param catalogsListProductsByFilterRequest Object holding a group of filters for a catalog product group
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param adAccountId Unique identifier of an ad account.
     */
    public productsByProductGroupFilterListWithHttpInfo(catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest, bookmark?: string, pageSize?: number, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<CatalogsProductGroupPinsList200Response>> {
        const result = this.api.productsByProductGroupFilterListWithHttpInfo(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>
     * List filtered products
     * @param catalogsListProductsByFilterRequest Object holding a group of filters for a catalog product group
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param adAccountId Unique identifier of an ad account.
     */
    public productsByProductGroupFilterList(catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest, bookmark?: string, pageSize?: number, adAccountId?: string, _options?: Configuration): Promise<CatalogsProductGroupPinsList200Response> {
        const result = this.api.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, _options);
        return result.toPromise();
    }


}



import { ObservableConversionEventsApi } from './ObservableAPI';

import { ConversionEventsApiRequestFactory, ConversionEventsApiResponseProcessor} from "../apis/ConversionEventsApi";
export class PromiseConversionEventsApi {
    private api: ObservableConversionEventsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ConversionEventsApiRequestFactory,
        responseProcessor?: ConversionEventsApiResponseProcessor
    ) {
        this.api = new ObservableConversionEventsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/conversions/conversions/\">Conversions Guide</a> for more details. - The token\'s <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
     * Send conversions
     * @param adAccountId Unique identifier of an ad account.
     * @param conversionEvents Conversion events.
     * @param test Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.
     */
    public eventsCreateWithHttpInfo(adAccountId: string, conversionEvents: ConversionEvents, test?: boolean, _options?: Configuration): Promise<HttpInfo<ConversionApiResponse>> {
        const result = this.api.eventsCreateWithHttpInfo(adAccountId, conversionEvents, test, _options);
        return result.toPromise();
    }

    /**
     * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/conversions/conversions/\">Conversions Guide</a> for more details. - The token\'s <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
     * Send conversions
     * @param adAccountId Unique identifier of an ad account.
     * @param conversionEvents Conversion events.
     * @param test Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.
     */
    public eventsCreate(adAccountId: string, conversionEvents: ConversionEvents, test?: boolean, _options?: Configuration): Promise<ConversionApiResponse> {
        const result = this.api.eventsCreate(adAccountId, conversionEvents, test, _options);
        return result.toPromise();
    }


}



import { ObservableConversionTagsApi } from './ObservableAPI';

import { ConversionTagsApiRequestFactory, ConversionTagsApiResponseProcessor} from "../apis/ConversionTagsApi";
export class PromiseConversionTagsApi {
    private api: ObservableConversionTagsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ConversionTagsApiRequestFactory,
        responseProcessor?: ConversionTagsApiResponseProcessor
    ) {
        this.api = new ObservableConversionTagsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account\'s ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/enhanced-match/\">Enhanced match</a>
     * Create conversion tag
     * @param adAccountId Unique identifier of an ad account.
     * @param conversionTagCreate Conversion Tag to create
     */
    public conversionTagsCreateWithHttpInfo(adAccountId: string, conversionTagCreate: ConversionTagCreate, _options?: Configuration): Promise<HttpInfo<ConversionTagResponse>> {
        const result = this.api.conversionTagsCreateWithHttpInfo(adAccountId, conversionTagCreate, _options);
        return result.toPromise();
    }

    /**
     * Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account\'s ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/enhanced-match/\">Enhanced match</a>
     * Create conversion tag
     * @param adAccountId Unique identifier of an ad account.
     * @param conversionTagCreate Conversion Tag to create
     */
    public conversionTagsCreate(adAccountId: string, conversionTagCreate: ConversionTagCreate, _options?: Configuration): Promise<ConversionTagResponse> {
        const result = this.api.conversionTagsCreate(adAccountId, conversionTagCreate, _options);
        return result.toPromise();
    }

    /**
     * Get information about an existing conversion tag.
     * Get conversion tag
     * @param adAccountId Unique identifier of an ad account.
     * @param conversionTagId Id of the conversion tag.
     */
    public conversionTagsGetWithHttpInfo(adAccountId: string, conversionTagId: string, _options?: Configuration): Promise<HttpInfo<ConversionTagResponse>> {
        const result = this.api.conversionTagsGetWithHttpInfo(adAccountId, conversionTagId, _options);
        return result.toPromise();
    }

    /**
     * Get information about an existing conversion tag.
     * Get conversion tag
     * @param adAccountId Unique identifier of an ad account.
     * @param conversionTagId Id of the conversion tag.
     */
    public conversionTagsGet(adAccountId: string, conversionTagId: string, _options?: Configuration): Promise<ConversionTagResponse> {
        const result = this.api.conversionTagsGet(adAccountId, conversionTagId, _options);
        return result.toPromise();
    }

    /**
     * List conversion tags associated with an ad account.
     * Get conversion tags
     * @param adAccountId Unique identifier of an ad account.
     * @param filterDeleted Filter out deleted tags.
     */
    public conversionTagsListWithHttpInfo(adAccountId: string, filterDeleted?: boolean, _options?: Configuration): Promise<HttpInfo<ConversionTagListResponse>> {
        const result = this.api.conversionTagsListWithHttpInfo(adAccountId, filterDeleted, _options);
        return result.toPromise();
    }

    /**
     * List conversion tags associated with an ad account.
     * Get conversion tags
     * @param adAccountId Unique identifier of an ad account.
     * @param filterDeleted Filter out deleted tags.
     */
    public conversionTagsList(adAccountId: string, filterDeleted?: boolean, _options?: Configuration): Promise<ConversionTagListResponse> {
        const result = this.api.conversionTagsList(adAccountId, filterDeleted, _options);
        return result.toPromise();
    }

    /**
     * Get Ocpm eligible conversion tag events for an ad account.
     * Get Ocpm eligible conversion tags
     * @param adAccountId Unique identifier of an ad account.
     */
    public ocpmEligibleConversionTagsGetWithHttpInfo(adAccountId: string, _options?: Configuration): Promise<HttpInfo<{ [key: string]: Array<ConversionEventResponse>; }>> {
        const result = this.api.ocpmEligibleConversionTagsGetWithHttpInfo(adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get Ocpm eligible conversion tag events for an ad account.
     * Get Ocpm eligible conversion tags
     * @param adAccountId Unique identifier of an ad account.
     */
    public ocpmEligibleConversionTagsGet(adAccountId: string, _options?: Configuration): Promise<{ [key: string]: Array<ConversionEventResponse>; }> {
        const result = this.api.ocpmEligibleConversionTagsGet(adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get all page visit conversion tag events for an ad account.
     * Get page visit conversion tags
     * @param adAccountId Unique identifier of an ad account.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public pageVisitConversionTagsGetWithHttpInfo(adAccountId: string, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<HttpInfo<PageVisitConversionTagsGet200Response>> {
        const result = this.api.pageVisitConversionTagsGetWithHttpInfo(adAccountId, pageSize, order, bookmark, _options);
        return result.toPromise();
    }

    /**
     * Get all page visit conversion tag events for an ad account.
     * Get page visit conversion tags
     * @param adAccountId Unique identifier of an ad account.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public pageVisitConversionTagsGet(adAccountId: string, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<PageVisitConversionTagsGet200Response> {
        const result = this.api.pageVisitConversionTagsGet(adAccountId, pageSize, order, bookmark, _options);
        return result.toPromise();
    }


}



import { ObservableCustomerListsApi } from './ObservableAPI';

import { CustomerListsApiRequestFactory, CustomerListsApiResponseProcessor} from "../apis/CustomerListsApi";
export class PromiseCustomerListsApi {
    private api: ObservableCustomerListsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: CustomerListsApiRequestFactory,
        responseProcessor?: CustomerListsApiResponseProcessor
    ) {
        this.api = new ObservableCustomerListsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>
     * Create customer lists
     * @param adAccountId Unique identifier of an ad account.
     * @param customerListRequest Parameters to get Customer lists info
     */
    public customerListsCreateWithHttpInfo(adAccountId: string, customerListRequest: CustomerListRequest, _options?: Configuration): Promise<HttpInfo<CustomerList>> {
        const result = this.api.customerListsCreateWithHttpInfo(adAccountId, customerListRequest, _options);
        return result.toPromise();
    }

    /**
     * <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>
     * Create customer lists
     * @param adAccountId Unique identifier of an ad account.
     * @param customerListRequest Parameters to get Customer lists info
     */
    public customerListsCreate(adAccountId: string, customerListRequest: CustomerListRequest, _options?: Configuration): Promise<CustomerList> {
        const result = this.api.customerListsCreate(adAccountId, customerListRequest, _options);
        return result.toPromise();
    }

    /**
     * Gets a specific customer list given the customer list ID.
     * Get customer list
     * @param adAccountId Unique identifier of an ad account.
     * @param customerListId Unique identifier of a customer list
     */
    public customerListsGetWithHttpInfo(adAccountId: string, customerListId: string, _options?: Configuration): Promise<HttpInfo<CustomerList>> {
        const result = this.api.customerListsGetWithHttpInfo(adAccountId, customerListId, _options);
        return result.toPromise();
    }

    /**
     * Gets a specific customer list given the customer list ID.
     * Get customer list
     * @param adAccountId Unique identifier of an ad account.
     * @param customerListId Unique identifier of a customer list
     */
    public customerListsGet(adAccountId: string, customerListId: string, _options?: Configuration): Promise<CustomerList> {
        const result = this.api.customerListsGet(adAccountId, customerListId, _options);
        return result.toPromise();
    }

    /**
     * <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
     * Get customer lists
     * @param adAccountId Unique identifier of an ad account.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public customerListsListWithHttpInfo(adAccountId: string, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<HttpInfo<CustomerListsList200Response>> {
        const result = this.api.customerListsListWithHttpInfo(adAccountId, pageSize, order, bookmark, _options);
        return result.toPromise();
    }

    /**
     * <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
     * Get customer lists
     * @param adAccountId Unique identifier of an ad account.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public customerListsList(adAccountId: string, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<CustomerListsList200Response> {
        const result = this.api.customerListsList(adAccountId, pageSize, order, bookmark, _options);
        return result.toPromise();
    }

    /**
     * <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
     * Update customer list
     * @param adAccountId Unique identifier of an ad account.
     * @param customerListId Unique identifier of a customer list
     * @param customerListUpdateRequest 
     */
    public customerListsUpdateWithHttpInfo(adAccountId: string, customerListId: string, customerListUpdateRequest: CustomerListUpdateRequest, _options?: Configuration): Promise<HttpInfo<CustomerList>> {
        const result = this.api.customerListsUpdateWithHttpInfo(adAccountId, customerListId, customerListUpdateRequest, _options);
        return result.toPromise();
    }

    /**
     * <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
     * Update customer list
     * @param adAccountId Unique identifier of an ad account.
     * @param customerListId Unique identifier of a customer list
     * @param customerListUpdateRequest 
     */
    public customerListsUpdate(adAccountId: string, customerListId: string, customerListUpdateRequest: CustomerListUpdateRequest, _options?: Configuration): Promise<CustomerList> {
        const result = this.api.customerListsUpdate(adAccountId, customerListId, customerListUpdateRequest, _options);
        return result.toPromise();
    }


}



import { ObservableIntegrationsApi } from './ObservableAPI';

import { IntegrationsApiRequestFactory, IntegrationsApiResponseProcessor} from "../apis/IntegrationsApi";
export class PromiseIntegrationsApi {
    private api: ObservableIntegrationsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: IntegrationsApiRequestFactory,
        responseProcessor?: IntegrationsApiResponseProcessor
    ) {
        this.api = new ObservableIntegrationsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Delete commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Delete commerce integration
     * @param externalBusinessId External business ID for the integration.
     */
    public integrationsCommerceDelWithHttpInfo(externalBusinessId: string, _options?: Configuration): Promise<HttpInfo<void>> {
        const result = this.api.integrationsCommerceDelWithHttpInfo(externalBusinessId, _options);
        return result.toPromise();
    }

    /**
     * Delete commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Delete commerce integration
     * @param externalBusinessId External business ID for the integration.
     */
    public integrationsCommerceDel(externalBusinessId: string, _options?: Configuration): Promise<void> {
        const result = this.api.integrationsCommerceDel(externalBusinessId, _options);
        return result.toPromise();
    }

    /**
     * Get commerce integration metadata associated with the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get commerce integration
     * @param externalBusinessId External business ID for the integration.
     */
    public integrationsCommerceGetWithHttpInfo(externalBusinessId: string, _options?: Configuration): Promise<HttpInfo<IntegrationMetadata>> {
        const result = this.api.integrationsCommerceGetWithHttpInfo(externalBusinessId, _options);
        return result.toPromise();
    }

    /**
     * Get commerce integration metadata associated with the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get commerce integration
     * @param externalBusinessId External business ID for the integration.
     */
    public integrationsCommerceGet(externalBusinessId: string, _options?: Configuration): Promise<IntegrationMetadata> {
        const result = this.api.integrationsCommerceGet(externalBusinessId, _options);
        return result.toPromise();
    }

    /**
     * Update commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Update commerce integration
     * @param externalBusinessId External business ID for the integration.
     * @param integrationRequestPatch Parameters to get create/update the Integration Metadata
     */
    public integrationsCommercePatchWithHttpInfo(externalBusinessId: string, integrationRequestPatch?: IntegrationRequestPatch, _options?: Configuration): Promise<HttpInfo<IntegrationMetadata>> {
        const result = this.api.integrationsCommercePatchWithHttpInfo(externalBusinessId, integrationRequestPatch, _options);
        return result.toPromise();
    }

    /**
     * Update commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Update commerce integration
     * @param externalBusinessId External business ID for the integration.
     * @param integrationRequestPatch Parameters to get create/update the Integration Metadata
     */
    public integrationsCommercePatch(externalBusinessId: string, integrationRequestPatch?: IntegrationRequestPatch, _options?: Configuration): Promise<IntegrationMetadata> {
        const result = this.api.integrationsCommercePatch(externalBusinessId, integrationRequestPatch, _options);
        return result.toPromise();
    }

    /**
     * Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Create commerce integration
     * @param integrationRequest Parameters to get create/update the Integration Metadata
     */
    public integrationsCommercePostWithHttpInfo(integrationRequest?: IntegrationRequest, _options?: Configuration): Promise<HttpInfo<IntegrationMetadata>> {
        const result = this.api.integrationsCommercePostWithHttpInfo(integrationRequest, _options);
        return result.toPromise();
    }

    /**
     * Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Create commerce integration
     * @param integrationRequest Parameters to get create/update the Integration Metadata
     */
    public integrationsCommercePost(integrationRequest?: IntegrationRequest, _options?: Configuration): Promise<IntegrationMetadata> {
        const result = this.api.integrationsCommercePost(integrationRequest, _options);
        return result.toPromise();
    }

    /**
     * Get integration metadata by ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get integration metadata
     * @param id Integration ID.
     */
    public integrationsGetByIdWithHttpInfo(id: string, _options?: Configuration): Promise<HttpInfo<IntegrationRecord>> {
        const result = this.api.integrationsGetByIdWithHttpInfo(id, _options);
        return result.toPromise();
    }

    /**
     * Get integration metadata by ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get integration metadata
     * @param id Integration ID.
     */
    public integrationsGetById(id: string, _options?: Configuration): Promise<IntegrationRecord> {
        const result = this.api.integrationsGetById(id, _options);
        return result.toPromise();
    }

    /**
     * Get integration metadata list. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get integration metadata list
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public integrationsGetListWithHttpInfo(bookmark?: string, pageSize?: number, _options?: Configuration): Promise<HttpInfo<IntegrationsGetList200Response>> {
        const result = this.api.integrationsGetListWithHttpInfo(bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * Get integration metadata list. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get integration metadata list
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public integrationsGetList(bookmark?: string, pageSize?: number, _options?: Configuration): Promise<IntegrationsGetList200Response> {
        const result = this.api.integrationsGetList(bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * This endpoint receives batched logs from integration applications on partner platforms. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Receives batched logs from integration applications.
     * @param integrationLogsRequest Ingest log information from external integration application.
     */
    public integrationsLogsPostWithHttpInfo(integrationLogsRequest: IntegrationLogsRequest, _options?: Configuration): Promise<HttpInfo<IntegrationLogsSuccessResponse>> {
        const result = this.api.integrationsLogsPostWithHttpInfo(integrationLogsRequest, _options);
        return result.toPromise();
    }

    /**
     * This endpoint receives batched logs from integration applications on partner platforms. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Receives batched logs from integration applications.
     * @param integrationLogsRequest Ingest log information from external integration application.
     */
    public integrationsLogsPost(integrationLogsRequest: IntegrationLogsRequest, _options?: Configuration): Promise<IntegrationLogsSuccessResponse> {
        const result = this.api.integrationsLogsPost(integrationLogsRequest, _options);
        return result.toPromise();
    }


}



import { ObservableKeywordsApi } from './ObservableAPI';

import { KeywordsApiRequestFactory, KeywordsApiResponseProcessor} from "../apis/KeywordsApi";
export class PromiseKeywordsApi {
    private api: ObservableKeywordsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: KeywordsApiRequestFactory,
        responseProcessor?: KeywordsApiResponseProcessor
    ) {
        this.api = new ObservableKeywordsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).
     * Get country\'s keyword metrics
     * @param adAccountId Unique identifier of an ad account.
     * @param countryCode Two letter country code (ISO 3166-1 alpha-2)
     * @param keywords Comma-separated keywords
     */
    public countryKeywordsMetricsGetWithHttpInfo(adAccountId: string, countryCode: string, keywords: Array<string>, _options?: Configuration): Promise<HttpInfo<KeywordsMetricsArrayResponse>> {
        const result = this.api.countryKeywordsMetricsGetWithHttpInfo(adAccountId, countryCode, keywords, _options);
        return result.toPromise();
    }

    /**
     * See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).
     * Get country\'s keyword metrics
     * @param adAccountId Unique identifier of an ad account.
     * @param countryCode Two letter country code (ISO 3166-1 alpha-2)
     * @param keywords Comma-separated keywords
     */
    public countryKeywordsMetricsGet(adAccountId: string, countryCode: string, keywords: Array<string>, _options?: Configuration): Promise<KeywordsMetricsArrayResponse> {
        const result = this.api.countryKeywordsMetricsGet(adAccountId, countryCode, keywords, _options);
        return result.toPromise();
    }

    /**
     * <p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding (\'_NEGATIVE\').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/redoc/#tag/Rate-Limits\">WRITE</a>.</p>
     * Create keywords
     * @param adAccountId Unique identifier of an ad account.
     * @param keywordsRequest 
     */
    public keywordsCreateWithHttpInfo(adAccountId: string, keywordsRequest: KeywordsRequest, _options?: Configuration): Promise<HttpInfo<KeywordsResponse>> {
        const result = this.api.keywordsCreateWithHttpInfo(adAccountId, keywordsRequest, _options);
        return result.toPromise();
    }

    /**
     * <p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding (\'_NEGATIVE\').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/redoc/#tag/Rate-Limits\">WRITE</a>.</p>
     * Create keywords
     * @param adAccountId Unique identifier of an ad account.
     * @param keywordsRequest 
     */
    public keywordsCreate(adAccountId: string, keywordsRequest: KeywordsRequest, _options?: Configuration): Promise<KeywordsResponse> {
        const result = this.api.keywordsCreate(adAccountId, keywordsRequest, _options);
        return result.toPromise();
    }

    /**
     * <p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding (\'_NEGATIVE\').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>
     * Get keywords
     * @param adAccountId Unique identifier of an ad account.
     * @param campaignId Campaign Id to use to filter the results.
     * @param adGroupId Ad group Id.
     * @param matchTypes Keyword &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/ads/targeting/#Match%20type%20and%20targeting%20level\&quot;&gt;match type&lt;/a&gt;
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public keywordsGetWithHttpInfo(adAccountId: string, campaignId?: string, adGroupId?: string, matchTypes?: Array<MatchType>, pageSize?: number, bookmark?: string, _options?: Configuration): Promise<HttpInfo<KeywordsGet200Response>> {
        const result = this.api.keywordsGetWithHttpInfo(adAccountId, campaignId, adGroupId, matchTypes, pageSize, bookmark, _options);
        return result.toPromise();
    }

    /**
     * <p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding (\'_NEGATIVE\').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>
     * Get keywords
     * @param adAccountId Unique identifier of an ad account.
     * @param campaignId Campaign Id to use to filter the results.
     * @param adGroupId Ad group Id.
     * @param matchTypes Keyword &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/ads/targeting/#Match%20type%20and%20targeting%20level\&quot;&gt;match type&lt;/a&gt;
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public keywordsGet(adAccountId: string, campaignId?: string, adGroupId?: string, matchTypes?: Array<MatchType>, pageSize?: number, bookmark?: string, _options?: Configuration): Promise<KeywordsGet200Response> {
        const result = this.api.keywordsGet(adAccountId, campaignId, adGroupId, matchTypes, pageSize, bookmark, _options);
        return result.toPromise();
    }

    /**
     * <p>Update one or more keywords\' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity\'s keywords list.</p>
     * Update keywords
     * @param adAccountId Unique identifier of an ad account.
     * @param keywordUpdateBody 
     */
    public keywordsUpdateWithHttpInfo(adAccountId: string, keywordUpdateBody: KeywordUpdateBody, _options?: Configuration): Promise<HttpInfo<KeywordsResponse>> {
        const result = this.api.keywordsUpdateWithHttpInfo(adAccountId, keywordUpdateBody, _options);
        return result.toPromise();
    }

    /**
     * <p>Update one or more keywords\' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity\'s keywords list.</p>
     * Update keywords
     * @param adAccountId Unique identifier of an ad account.
     * @param keywordUpdateBody 
     */
    public keywordsUpdate(adAccountId: string, keywordUpdateBody: KeywordUpdateBody, _options?: Configuration): Promise<KeywordsResponse> {
        const result = this.api.keywordsUpdate(adAccountId, keywordUpdateBody, _options);
        return result.toPromise();
    }

    /**
     * <p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>.
     * List trending keywords
     * @param region The geographic region of interest. Only top trends within the specified region will be returned.&lt;br /&gt; The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas: - &#x60;US&#x60; - United States - &#x60;CA&#x60; - Canada - &#x60;DE&#x60; - Germany - &#x60;FR&#x60; - France - &#x60;ES&#x60; - Spain - &#x60;IT&#x60; - Italy - &#x60;DE+AT+CH&#x60; - Germanic countries - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe - &#x60;SE+DK+FI+NO&#x60; - Nordic countries - &#x60;NL+BE+LU&#x60; - Benelux - &#x60;AR&#x60; - Argentina - &#x60;BR&#x60; - Brazil - &#x60;CO&#x60; - Colombia - &#x60;MX&#x60; - Mexico - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm - &#x60;AU+NZ&#x60; - Australasia
     * @param trendType The methodology used to rank how trendy a keyword is. - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter - &#x60;monthly&#x60; trends have high search volume in the last month - &#x60;yearly&#x60; trends have high search volume in the last year - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
     * @param interests If set, filters the results to trends associated with the specified interests.&lt;br /&gt; If unset, trends for all interests will be returned.&lt;br /&gt; The list of supported interests is: - &#x60;animals&#x60; - Animals - &#x60;architecture&#x60; - Architecture - &#x60;art&#x60; - Art - &#x60;beauty&#x60; - Beauty - &#x60;childrens_fashion&#x60; - Children\&#39;s Fashion - &#x60;design&#x60; - Design - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts - &#x60;education&#x60; - Education - &#x60;electronics&#x60; - Electronics - &#x60;entertainment&#x60; - Entertainment - &#x60;event_planning&#x60; - Event Planning - &#x60;finance&#x60; - Finance - &#x60;food_and_drinks&#x60; - Food &amp; Drink - &#x60;gardening&#x60; - Gardening - &#x60;health&#x60; - Health - &#x60;home_decor&#x60; - Home Decor - &#x60;mens_fashion&#x60; - Men\&#39;s Fashion - &#x60;parenting&#x60; - Parenting - &#x60;quotes&#x60; - Quotes - &#x60;sport&#x60; - Sports - &#x60;travel&#x60; - Travel - &#x60;vehicles&#x60; - Vehicles - &#x60;wedding&#x60; - Wedding - &#x60;womens_fashion&#x60; - Women\&#39;s Fashion
     * @param genders If set, filters the results to trends among users who identify with the specified gender(s).&lt;br /&gt; If unset, trends among all genders will be returned.&lt;br /&gt; The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings.
     * @param ages If set, filters the results to trends among users in the specified age range(s).&lt;br /&gt; If unset, trends among all age groups will be returned.
     * @param normalizeAgainstGroup Governs how the resulting time series data will be normalized to a [0-100] scale.&lt;br /&gt; By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword\&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.&lt;br /&gt; If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.
     * @param limit The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends.
     */
    public trendingKeywordsListWithHttpInfo(region: TrendsSupportedRegion, trendType: TrendType, interests?: Array<'animals' | 'architecture' | 'art' | 'beauty' | 'childrens_fashion' | 'design' | 'diy_and_crafts' | 'education' | 'electronics' | 'entertainment' | 'event_planning' | 'finance' | 'food_and_drinks' | 'gardening' | 'health' | 'home_decor' | 'mens_fashion' | 'parenting' | 'quotes' | 'sport' | 'travel' | 'vehicles' | 'wedding' | 'womens_fashion'>, genders?: Array<'female' | 'male' | 'unknown'>, ages?: Array<'18-24' | '25-34' | '35-44' | '45-49' | '50-54' | '55-64' | '65+'>, normalizeAgainstGroup?: boolean, limit?: number, _options?: Configuration): Promise<HttpInfo<TrendingKeywordsResponse>> {
        const result = this.api.trendingKeywordsListWithHttpInfo(region, trendType, interests, genders, ages, normalizeAgainstGroup, limit, _options);
        return result.toPromise();
    }

    /**
     * <p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>.
     * List trending keywords
     * @param region The geographic region of interest. Only top trends within the specified region will be returned.&lt;br /&gt; The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas: - &#x60;US&#x60; - United States - &#x60;CA&#x60; - Canada - &#x60;DE&#x60; - Germany - &#x60;FR&#x60; - France - &#x60;ES&#x60; - Spain - &#x60;IT&#x60; - Italy - &#x60;DE+AT+CH&#x60; - Germanic countries - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe - &#x60;SE+DK+FI+NO&#x60; - Nordic countries - &#x60;NL+BE+LU&#x60; - Benelux - &#x60;AR&#x60; - Argentina - &#x60;BR&#x60; - Brazil - &#x60;CO&#x60; - Colombia - &#x60;MX&#x60; - Mexico - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm - &#x60;AU+NZ&#x60; - Australasia
     * @param trendType The methodology used to rank how trendy a keyword is. - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter - &#x60;monthly&#x60; trends have high search volume in the last month - &#x60;yearly&#x60; trends have high search volume in the last year - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
     * @param interests If set, filters the results to trends associated with the specified interests.&lt;br /&gt; If unset, trends for all interests will be returned.&lt;br /&gt; The list of supported interests is: - &#x60;animals&#x60; - Animals - &#x60;architecture&#x60; - Architecture - &#x60;art&#x60; - Art - &#x60;beauty&#x60; - Beauty - &#x60;childrens_fashion&#x60; - Children\&#39;s Fashion - &#x60;design&#x60; - Design - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts - &#x60;education&#x60; - Education - &#x60;electronics&#x60; - Electronics - &#x60;entertainment&#x60; - Entertainment - &#x60;event_planning&#x60; - Event Planning - &#x60;finance&#x60; - Finance - &#x60;food_and_drinks&#x60; - Food &amp; Drink - &#x60;gardening&#x60; - Gardening - &#x60;health&#x60; - Health - &#x60;home_decor&#x60; - Home Decor - &#x60;mens_fashion&#x60; - Men\&#39;s Fashion - &#x60;parenting&#x60; - Parenting - &#x60;quotes&#x60; - Quotes - &#x60;sport&#x60; - Sports - &#x60;travel&#x60; - Travel - &#x60;vehicles&#x60; - Vehicles - &#x60;wedding&#x60; - Wedding - &#x60;womens_fashion&#x60; - Women\&#39;s Fashion
     * @param genders If set, filters the results to trends among users who identify with the specified gender(s).&lt;br /&gt; If unset, trends among all genders will be returned.&lt;br /&gt; The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings.
     * @param ages If set, filters the results to trends among users in the specified age range(s).&lt;br /&gt; If unset, trends among all age groups will be returned.
     * @param normalizeAgainstGroup Governs how the resulting time series data will be normalized to a [0-100] scale.&lt;br /&gt; By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword\&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.&lt;br /&gt; If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.
     * @param limit The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends.
     */
    public trendingKeywordsList(region: TrendsSupportedRegion, trendType: TrendType, interests?: Array<'animals' | 'architecture' | 'art' | 'beauty' | 'childrens_fashion' | 'design' | 'diy_and_crafts' | 'education' | 'electronics' | 'entertainment' | 'event_planning' | 'finance' | 'food_and_drinks' | 'gardening' | 'health' | 'home_decor' | 'mens_fashion' | 'parenting' | 'quotes' | 'sport' | 'travel' | 'vehicles' | 'wedding' | 'womens_fashion'>, genders?: Array<'female' | 'male' | 'unknown'>, ages?: Array<'18-24' | '25-34' | '35-44' | '45-49' | '50-54' | '55-64' | '65+'>, normalizeAgainstGroup?: boolean, limit?: number, _options?: Configuration): Promise<TrendingKeywordsResponse> {
        const result = this.api.trendingKeywordsList(region, trendType, interests, genders, ages, normalizeAgainstGroup, limit, _options);
        return result.toPromise();
    }


}



import { ObservableLeadAdsApi } from './ObservableAPI';

import { LeadAdsApiRequestFactory, LeadAdsApiResponseProcessor} from "../apis/LeadAdsApi";
export class PromiseLeadAdsApi {
    private api: ObservableLeadAdsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: LeadAdsApiRequestFactory,
        responseProcessor?: LeadAdsApiResponseProcessor
    ) {
        this.api = new ObservableLeadAdsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Delete lead ads subscription
     * @param adAccountId Unique identifier of an ad account.
     * @param subscriptionId Unique identifier of a subscription.
     */
    public adAccountsSubscriptionsDelByIdWithHttpInfo(adAccountId: string, subscriptionId: string, _options?: Configuration): Promise<HttpInfo<void>> {
        const result = this.api.adAccountsSubscriptionsDelByIdWithHttpInfo(adAccountId, subscriptionId, _options);
        return result.toPromise();
    }

    /**
     * Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Delete lead ads subscription
     * @param adAccountId Unique identifier of an ad account.
     * @param subscriptionId Unique identifier of a subscription.
     */
    public adAccountsSubscriptionsDelById(adAccountId: string, subscriptionId: string, _options?: Configuration): Promise<void> {
        const result = this.api.adAccountsSubscriptionsDelById(adAccountId, subscriptionId, _options);
        return result.toPromise();
    }

    /**
     * Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get lead ads subscription
     * @param adAccountId Unique identifier of an ad account.
     * @param subscriptionId Unique identifier of a subscription.
     */
    public adAccountsSubscriptionsGetByIdWithHttpInfo(adAccountId: string, subscriptionId: string, _options?: Configuration): Promise<HttpInfo<AdAccountGetSubscriptionResponse>> {
        const result = this.api.adAccountsSubscriptionsGetByIdWithHttpInfo(adAccountId, subscriptionId, _options);
        return result.toPromise();
    }

    /**
     * Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get lead ads subscription
     * @param adAccountId Unique identifier of an ad account.
     * @param subscriptionId Unique identifier of a subscription.
     */
    public adAccountsSubscriptionsGetById(adAccountId: string, subscriptionId: string, _options?: Configuration): Promise<AdAccountGetSubscriptionResponse> {
        const result = this.api.adAccountsSubscriptionsGetById(adAccountId, subscriptionId, _options);
        return result.toPromise();
    }

    /**
     * Get the advertiser\'s list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get lead ads subscriptions
     * @param adAccountId Unique identifier of an ad account.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public adAccountsSubscriptionsGetListWithHttpInfo(adAccountId: string, pageSize?: number, bookmark?: string, _options?: Configuration): Promise<HttpInfo<AdAccountsSubscriptionsGetList200Response>> {
        const result = this.api.adAccountsSubscriptionsGetListWithHttpInfo(adAccountId, pageSize, bookmark, _options);
        return result.toPromise();
    }

    /**
     * Get the advertiser\'s list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get lead ads subscriptions
     * @param adAccountId Unique identifier of an ad account.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public adAccountsSubscriptionsGetList(adAccountId: string, pageSize?: number, bookmark?: string, _options?: Configuration): Promise<AdAccountsSubscriptionsGetList200Response> {
        const result = this.api.adAccountsSubscriptionsGetList(adAccountId, pageSize, bookmark, _options);
        return result.toPromise();
    }

    /**
     * Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Create lead ads subscription
     * @param adAccountId Unique identifier of an ad account.
     * @param adAccountCreateSubscriptionRequest Subscription to create.
     */
    public adAccountsSubscriptionsPostWithHttpInfo(adAccountId: string, adAccountCreateSubscriptionRequest: AdAccountCreateSubscriptionRequest, _options?: Configuration): Promise<HttpInfo<AdAccountCreateSubscriptionResponse>> {
        const result = this.api.adAccountsSubscriptionsPostWithHttpInfo(adAccountId, adAccountCreateSubscriptionRequest, _options);
        return result.toPromise();
    }

    /**
     * Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Create lead ads subscription
     * @param adAccountId Unique identifier of an ad account.
     * @param adAccountCreateSubscriptionRequest Subscription to create.
     */
    public adAccountsSubscriptionsPost(adAccountId: string, adAccountCreateSubscriptionRequest: AdAccountCreateSubscriptionRequest, _options?: Configuration): Promise<AdAccountCreateSubscriptionResponse> {
        const result = this.api.adAccountsSubscriptionsPost(adAccountId, adAccountCreateSubscriptionRequest, _options);
        return result.toPromise();
    }


}



import { ObservableLeadFormsApi } from './ObservableAPI';

import { LeadFormsApiRequestFactory, LeadFormsApiResponseProcessor} from "../apis/LeadFormsApi";
export class PromiseLeadFormsApi {
    private api: ObservableLeadFormsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: LeadFormsApiRequestFactory,
        responseProcessor?: LeadFormsApiResponseProcessor
    ) {
        this.api = new ObservableLeadFormsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Gets a lead form given it\'s ID. It must also be associated with the provided ad account ID. Retrieving an advertiser\'s lead form will only contain results if you\'re a part of the Lead ads beta. If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get lead form by id
     * @param adAccountId Unique identifier of an ad account.
     * @param leadFormId Unique identifier of a lead form.
     */
    public leadFormGetWithHttpInfo(adAccountId: string, leadFormId: string, _options?: Configuration): Promise<HttpInfo<LeadFormResponse>> {
        const result = this.api.leadFormGetWithHttpInfo(adAccountId, leadFormId, _options);
        return result.toPromise();
    }

    /**
     * Gets a lead form given it\'s ID. It must also be associated with the provided ad account ID. Retrieving an advertiser\'s lead form will only contain results if you\'re a part of the Lead ads beta. If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get lead form by id
     * @param adAccountId Unique identifier of an ad account.
     * @param leadFormId Unique identifier of a lead form.
     */
    public leadFormGet(adAccountId: string, leadFormId: string, _options?: Configuration): Promise<LeadFormResponse> {
        const result = this.api.leadFormGet(adAccountId, leadFormId, _options);
        return result.toPromise();
    }

    /**
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Create lead form test data
     * @param adAccountId Unique identifier of an ad account.
     * @param leadFormId Unique identifier of a lead form.
     * @param leadFormTestRequest Subscription to create.
     */
    public leadFormTestCreateWithHttpInfo(adAccountId: string, leadFormId: string, leadFormTestRequest: LeadFormTestRequest, _options?: Configuration): Promise<HttpInfo<LeadFormTestResponse>> {
        const result = this.api.leadFormTestCreateWithHttpInfo(adAccountId, leadFormId, leadFormTestRequest, _options);
        return result.toPromise();
    }

    /**
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Create lead form test data
     * @param adAccountId Unique identifier of an ad account.
     * @param leadFormId Unique identifier of a lead form.
     * @param leadFormTestRequest Subscription to create.
     */
    public leadFormTestCreate(adAccountId: string, leadFormId: string, leadFormTestRequest: LeadFormTestRequest, _options?: Configuration): Promise<LeadFormTestResponse> {
        const result = this.api.leadFormTestCreate(adAccountId, leadFormId, leadFormTestRequest, _options);
        return result.toPromise();
    }

    /**
     * Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser\'s list of lead forms will only contain results if you\'re a part of the Lead ads beta.  If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get lead forms
     * @param adAccountId Unique identifier of an ad account.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public leadFormsListWithHttpInfo(adAccountId: string, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<HttpInfo<LeadFormsList200Response>> {
        const result = this.api.leadFormsListWithHttpInfo(adAccountId, pageSize, order, bookmark, _options);
        return result.toPromise();
    }

    /**
     * Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser\'s list of lead forms will only contain results if you\'re a part of the Lead ads beta.  If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get lead forms
     * @param adAccountId Unique identifier of an ad account.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public leadFormsList(adAccountId: string, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<LeadFormsList200Response> {
        const result = this.api.leadFormsList(adAccountId, pageSize, order, bookmark, _options);
        return result.toPromise();
    }


}



import { ObservableMediaApi } from './ObservableAPI';

import { MediaApiRequestFactory, MediaApiResponseProcessor} from "../apis/MediaApi";
export class PromiseMediaApi {
    private api: ObservableMediaApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MediaApiRequestFactory,
        responseProcessor?: MediaApiResponseProcessor
    ) {
        this.api = new ObservableMediaApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file\'s contents as the request\'s <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href=\'/docs/content/content-creation/#Creating%20video%20Pins\'>Learn more</a></strong> about video Pin creation.
     * Register media upload
     * @param mediaUploadRequest Create a media upload request
     */
    public mediaCreateWithHttpInfo(mediaUploadRequest: MediaUploadRequest, _options?: Configuration): Promise<HttpInfo<MediaUpload>> {
        const result = this.api.mediaCreateWithHttpInfo(mediaUploadRequest, _options);
        return result.toPromise();
    }

    /**
     * Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file\'s contents as the request\'s <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href=\'/docs/content/content-creation/#Creating%20video%20Pins\'>Learn more</a></strong> about video Pin creation.
     * Register media upload
     * @param mediaUploadRequest Create a media upload request
     */
    public mediaCreate(mediaUploadRequest: MediaUploadRequest, _options?: Configuration): Promise<MediaUpload> {
        const result = this.api.mediaCreate(mediaUploadRequest, _options);
        return result.toPromise();
    }

    /**
     * Get details for a registered media upload, including its current status.  <strong><a href=\'/docs/content/content-creation/#Creating%20video%20Pins\'>Learn more</a></strong> about video Pin creation.
     * Get media upload details
     * @param mediaId Media identifier
     */
    public mediaGetWithHttpInfo(mediaId: string, _options?: Configuration): Promise<HttpInfo<MediaUploadDetails>> {
        const result = this.api.mediaGetWithHttpInfo(mediaId, _options);
        return result.toPromise();
    }

    /**
     * Get details for a registered media upload, including its current status.  <strong><a href=\'/docs/content/content-creation/#Creating%20video%20Pins\'>Learn more</a></strong> about video Pin creation.
     * Get media upload details
     * @param mediaId Media identifier
     */
    public mediaGet(mediaId: string, _options?: Configuration): Promise<MediaUploadDetails> {
        const result = this.api.mediaGet(mediaId, _options);
        return result.toPromise();
    }

    /**
     * List media uploads filtered by given parameters.  <strong><a href=\'/docs/content/content-creation/#Creating%20video%20Pins\'>Learn more</a></strong> about video Pin creation.
     * List media uploads
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public mediaListWithHttpInfo(bookmark?: string, pageSize?: number, _options?: Configuration): Promise<HttpInfo<MediaList200Response>> {
        const result = this.api.mediaListWithHttpInfo(bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * List media uploads filtered by given parameters.  <strong><a href=\'/docs/content/content-creation/#Creating%20video%20Pins\'>Learn more</a></strong> about video Pin creation.
     * List media uploads
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public mediaList(bookmark?: string, pageSize?: number, _options?: Configuration): Promise<MediaList200Response> {
        const result = this.api.mediaList(bookmark, pageSize, _options);
        return result.toPromise();
    }


}



import { ObservableOauthApi } from './ObservableAPI';

import { OauthApiRequestFactory, OauthApiResponseProcessor} from "../apis/OauthApi";
export class PromiseOauthApi {
    private api: ObservableOauthApi

    public constructor(
        configuration: Configuration,
        requestFactory?: OauthApiRequestFactory,
        responseProcessor?: OauthApiResponseProcessor
    ) {
        this.api = new ObservableOauthApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See <a href=\'/docs/getting-started/authentication/\'>Authentication</a> for more.  <strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Generate OAuth access token
     * @param grantType 
     */
    public oauthTokenWithHttpInfo(grantType: string, _options?: Configuration): Promise<HttpInfo<OauthAccessTokenResponse>> {
        const result = this.api.oauthTokenWithHttpInfo(grantType, _options);
        return result.toPromise();
    }

    /**
     * Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See <a href=\'/docs/getting-started/authentication/\'>Authentication</a> for more.  <strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Generate OAuth access token
     * @param grantType 
     */
    public oauthToken(grantType: string, _options?: Configuration): Promise<OauthAccessTokenResponse> {
        const result = this.api.oauthToken(grantType, _options);
        return result.toPromise();
    }


}



import { ObservableOrderLinesApi } from './ObservableAPI';

import { OrderLinesApiRequestFactory, OrderLinesApiResponseProcessor} from "../apis/OrderLinesApi";
export class PromiseOrderLinesApi {
    private api: ObservableOrderLinesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: OrderLinesApiRequestFactory,
        responseProcessor?: OrderLinesApiResponseProcessor
    ) {
        this.api = new ObservableOrderLinesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get a specific existing order line associated with an ad account.
     * Get order line
     * @param adAccountId Unique identifier of an ad account.
     * @param orderLineId Unique identifier of an order line.
     */
    public orderLinesGetWithHttpInfo(adAccountId: string, orderLineId: string, _options?: Configuration): Promise<HttpInfo<OrderLine>> {
        const result = this.api.orderLinesGetWithHttpInfo(adAccountId, orderLineId, _options);
        return result.toPromise();
    }

    /**
     * Get a specific existing order line associated with an ad account.
     * Get order line
     * @param adAccountId Unique identifier of an ad account.
     * @param orderLineId Unique identifier of an order line.
     */
    public orderLinesGet(adAccountId: string, orderLineId: string, _options?: Configuration): Promise<OrderLine> {
        const result = this.api.orderLinesGet(adAccountId, orderLineId, _options);
        return result.toPromise();
    }

    /**
     * List existing order lines associated with an ad account.
     * Get order lines
     * @param adAccountId Unique identifier of an ad account.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public orderLinesListWithHttpInfo(adAccountId: string, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<HttpInfo<OrderLinesList200Response>> {
        const result = this.api.orderLinesListWithHttpInfo(adAccountId, pageSize, order, bookmark, _options);
        return result.toPromise();
    }

    /**
     * List existing order lines associated with an ad account.
     * Get order lines
     * @param adAccountId Unique identifier of an ad account.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public orderLinesList(adAccountId: string, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<OrderLinesList200Response> {
        const result = this.api.orderLinesList(adAccountId, pageSize, order, bookmark, _options);
        return result.toPromise();
    }


}



import { ObservablePinsApi } from './ObservableAPI';

import { PinsApiRequestFactory, PinsApiResponseProcessor} from "../apis/PinsApi";
export class PromisePinsApi {
    private api: ObservablePinsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: PinsApiRequestFactory,
        responseProcessor?: PinsApiResponseProcessor
    ) {
        this.api = new ObservablePinsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Get Pin analytics
     * @param pinId Unique identifier of a Pin.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param metricTypes Pin metric types to get data for, default is all.
     * @param appTypes Apps or devices to get data for, default is all.
     * @param splitField How to split the data into groups. Not including this param means data won\&#39;t be split.
     * @param adAccountId Unique identifier of an ad account.
     */
    public pinsAnalyticsWithHttpInfo(pinId: string, startDate: string, endDate: string, metricTypes: Array<PinsAnalyticsMetricTypesParameterInner>, appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB', splitField?: 'NO_SPLIT' | 'APP_TYPE', adAccountId?: string, _options?: Configuration): Promise<HttpInfo<{ [key: string]: PinAnalyticsMetricsResponse; }>> {
        const result = this.api.pinsAnalyticsWithHttpInfo(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Get Pin analytics
     * @param pinId Unique identifier of a Pin.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param metricTypes Pin metric types to get data for, default is all.
     * @param appTypes Apps or devices to get data for, default is all.
     * @param splitField How to split the data into groups. Not including this param means data won\&#39;t be split.
     * @param adAccountId Unique identifier of an ad account.
     */
    public pinsAnalytics(pinId: string, startDate: string, endDate: string, metricTypes: Array<PinsAnalyticsMetricTypesParameterInner>, appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB', splitField?: 'NO_SPLIT' | 'APP_TYPE', adAccountId?: string, _options?: Configuration): Promise<{ [key: string]: PinAnalyticsMetricsResponse; }> {
        const result = this.api.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user\'s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account\'s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called \'curated content\', please use our <a href=\'/docs/add-ons/save-button\'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href=\'/docs/content/content-creation/\'>Content App Solutions Guide</a>.  <strong><a href=\'/docs/content/content-creation/#Creating%20video%20Pins\'>Learn more</a></strong> about video Pin creation.
     * Create Pin
     * @param pinCreate Create a new Pin.
     * @param adAccountId Unique identifier of an ad account.
     */
    public pinsCreateWithHttpInfo(pinCreate: PinCreate, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<Pin>> {
        const result = this.api.pinsCreateWithHttpInfo(pinCreate, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user\'s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account\'s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called \'curated content\', please use our <a href=\'/docs/add-ons/save-button\'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href=\'/docs/content/content-creation/\'>Content App Solutions Guide</a>.  <strong><a href=\'/docs/content/content-creation/#Creating%20video%20Pins\'>Learn more</a></strong> about video Pin creation.
     * Create Pin
     * @param pinCreate Create a new Pin.
     * @param adAccountId Unique identifier of an ad account.
     */
    public pinsCreate(pinCreate: PinCreate, adAccountId?: string, _options?: Configuration): Promise<Pin> {
        const result = this.api.pinsCreate(pinCreate, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     * Delete Pin
     * @param pinId Unique identifier of a Pin.
     * @param adAccountId Unique identifier of an ad account.
     */
    public pinsDeleteWithHttpInfo(pinId: string, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<void>> {
        const result = this.api.pinsDeleteWithHttpInfo(pinId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     * Delete Pin
     * @param pinId Unique identifier of a Pin.
     * @param adAccountId Unique identifier of an ad account.
     */
    public pinsDelete(pinId: string, adAccountId?: string, _options?: Configuration): Promise<void> {
        const result = this.api.pinsDelete(pinId, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     * Get Pin
     * @param pinId Unique identifier of a Pin.
     * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * @param adAccountId Unique identifier of an ad account.
     */
    public pinsGetWithHttpInfo(pinId: string, pinMetrics?: boolean, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<Pin>> {
        const result = this.api.pinsGetWithHttpInfo(pinId, pinMetrics, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     * Get Pin
     * @param pinId Unique identifier of a Pin.
     * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * @param adAccountId Unique identifier of an ad account.
     */
    public pinsGet(pinId: string, pinMetrics?: boolean, adAccountId?: string, _options?: Configuration): Promise<Pin> {
        const result = this.api.pinsGet(pinId, pinMetrics, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of the Pins owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * List Pins
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param pinFilter Pin filter.
     * @param includeProtectedPins Specify if return pins from protected boards
     * @param pinType The type of pins to return, currently only enabled for private pins
     * @param creativeTypes Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
     * @param adAccountId Unique identifier of an ad account.
     * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     */
    public pinsListWithHttpInfo(bookmark?: string, pageSize?: number, pinFilter?: 'exclude_native' | 'exclude_repins' | 'has_been_promoted', includeProtectedPins?: boolean, pinType?: 'PRIVATE', creativeTypes?: Array<'REGULAR' | 'VIDEO' | 'SHOPPING' | 'CAROUSEL' | 'MAX_VIDEO' | 'SHOP_THE_PIN' | 'COLLECTION' | 'IDEA'>, adAccountId?: string, pinMetrics?: boolean, _options?: Configuration): Promise<HttpInfo<PinsList200Response>> {
        const result = this.api.pinsListWithHttpInfo(bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics, _options);
        return result.toPromise();
    }

    /**
     * Get a list of the Pins owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * List Pins
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param pinFilter Pin filter.
     * @param includeProtectedPins Specify if return pins from protected boards
     * @param pinType The type of pins to return, currently only enabled for private pins
     * @param creativeTypes Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
     * @param adAccountId Unique identifier of an ad account.
     * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     */
    public pinsList(bookmark?: string, pageSize?: number, pinFilter?: 'exclude_native' | 'exclude_repins' | 'has_been_promoted', includeProtectedPins?: boolean, pinType?: 'PRIVATE', creativeTypes?: Array<'REGULAR' | 'VIDEO' | 'SHOPPING' | 'CAROUSEL' | 'MAX_VIDEO' | 'SHOP_THE_PIN' | 'COLLECTION' | 'IDEA'>, adAccountId?: string, pinMetrics?: boolean, _options?: Configuration): Promise<PinsList200Response> {
        const result = this.api.pinsList(bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics, _options);
        return result.toPromise();
    }

    /**
     * Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
     * Save Pin
     * @param pinId Unique identifier of a Pin.
     * @param pinsSaveRequest Request object used to save an existing pin
     * @param adAccountId Unique identifier of an ad account.
     */
    public pinsSaveWithHttpInfo(pinId: string, pinsSaveRequest: PinsSaveRequest, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<Pin>> {
        const result = this.api.pinsSaveWithHttpInfo(pinId, pinsSaveRequest, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
     * Save Pin
     * @param pinId Unique identifier of a Pin.
     * @param pinsSaveRequest Request object used to save an existing pin
     * @param adAccountId Unique identifier of an ad account.
     */
    public pinsSave(pinId: string, pinsSaveRequest: PinsSaveRequest, adAccountId?: string, _options?: Configuration): Promise<Pin> {
        const result = this.api.pinsSave(pinId, pinsSaveRequest, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Update Pin
     * @param pinId Unique identifier of a Pin.
     * @param pinUpdate 
     * @param adAccountId Unique identifier of an ad account.
     */
    public pinsUpdateWithHttpInfo(pinId: string, pinUpdate: PinUpdate, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<Pin>> {
        const result = this.api.pinsUpdateWithHttpInfo(pinId, pinUpdate, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Update Pin
     * @param pinId Unique identifier of a Pin.
     * @param pinUpdate 
     * @param adAccountId Unique identifier of an ad account.
     */
    public pinsUpdate(pinId: string, pinUpdate: PinUpdate, adAccountId?: string, _options?: Configuration): Promise<Pin> {
        const result = this.api.pinsUpdate(pinId, pinUpdate, adAccountId, _options);
        return result.toPromise();
    }


}



import { ObservableProductGroupPromotionsApi } from './ObservableAPI';

import { ProductGroupPromotionsApiRequestFactory, ProductGroupPromotionsApiResponseProcessor} from "../apis/ProductGroupPromotionsApi";
export class PromiseProductGroupPromotionsApi {
    private api: ObservableProductGroupPromotionsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ProductGroupPromotionsApiRequestFactory,
        responseProcessor?: ProductGroupPromotionsApiResponseProcessor
    ) {
        this.api = new ObservableProductGroupPromotionsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a \'product group promotion.\')
     * Create product group promotions
     * @param adAccountId Unique identifier of an ad account.
     * @param productGroupPromotionCreateRequest List of Product Group Promotions to create, size limit [1, 30].
     */
    public productGroupPromotionsCreateWithHttpInfo(adAccountId: string, productGroupPromotionCreateRequest: ProductGroupPromotionCreateRequest, _options?: Configuration): Promise<HttpInfo<ProductGroupPromotionResponse>> {
        const result = this.api.productGroupPromotionsCreateWithHttpInfo(adAccountId, productGroupPromotionCreateRequest, _options);
        return result.toPromise();
    }

    /**
     * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a \'product group promotion.\')
     * Create product group promotions
     * @param adAccountId Unique identifier of an ad account.
     * @param productGroupPromotionCreateRequest List of Product Group Promotions to create, size limit [1, 30].
     */
    public productGroupPromotionsCreate(adAccountId: string, productGroupPromotionCreateRequest: ProductGroupPromotionCreateRequest, _options?: Configuration): Promise<ProductGroupPromotionResponse> {
        const result = this.api.productGroupPromotionsCreate(adAccountId, productGroupPromotionCreateRequest, _options);
        return result.toPromise();
    }

    /**
     * Get a product group promotion by id
     * Get a product group promotion by id
     * @param adAccountId Unique identifier of an ad account.
     * @param productGroupPromotionId Unique identifier of a product group promotion
     */
    public productGroupPromotionsGetWithHttpInfo(adAccountId: string, productGroupPromotionId: string, _options?: Configuration): Promise<HttpInfo<ProductGroupPromotionResponse>> {
        const result = this.api.productGroupPromotionsGetWithHttpInfo(adAccountId, productGroupPromotionId, _options);
        return result.toPromise();
    }

    /**
     * Get a product group promotion by id
     * Get a product group promotion by id
     * @param adAccountId Unique identifier of an ad account.
     * @param productGroupPromotionId Unique identifier of a product group promotion
     */
    public productGroupPromotionsGet(adAccountId: string, productGroupPromotionId: string, _options?: Configuration): Promise<ProductGroupPromotionResponse> {
        const result = this.api.productGroupPromotionsGet(adAccountId, productGroupPromotionId, _options);
        return result.toPromise();
    }

    /**
     * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
     * Get product group promotions
     * @param adAccountId Unique identifier of an ad account.
     * @param productGroupPromotionIds List of Product group promotion Ids.
     * @param entityStatuses Entity status
     * @param adGroupId Ad group Id.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public productGroupPromotionsListWithHttpInfo(adAccountId: string, productGroupPromotionIds?: Array<string>, entityStatuses?: Array<'ACTIVE' | 'PAUSED' | 'ARCHIVED' | 'DRAFT' | 'DELETED_DRAFT'>, adGroupId?: string, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<HttpInfo<ProductGroupPromotionsList200Response>> {
        const result = this.api.productGroupPromotionsListWithHttpInfo(adAccountId, productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark, _options);
        return result.toPromise();
    }

    /**
     * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
     * Get product group promotions
     * @param adAccountId Unique identifier of an ad account.
     * @param productGroupPromotionIds List of Product group promotion Ids.
     * @param entityStatuses Entity status
     * @param adGroupId Ad group Id.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public productGroupPromotionsList(adAccountId: string, productGroupPromotionIds?: Array<string>, entityStatuses?: Array<'ACTIVE' | 'PAUSED' | 'ARCHIVED' | 'DRAFT' | 'DELETED_DRAFT'>, adGroupId?: string, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<ProductGroupPromotionsList200Response> {
        const result = this.api.productGroupPromotionsList(adAccountId, productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark, _options);
        return result.toPromise();
    }

    /**
     * Update multiple existing Product Group Promotions (by product_group_id)
     * Update product group promotions
     * @param adAccountId Unique identifier of an ad account.
     * @param productGroupPromotionUpdateRequest Parameters to update Product group promotions
     */
    public productGroupPromotionsUpdateWithHttpInfo(adAccountId: string, productGroupPromotionUpdateRequest: ProductGroupPromotionUpdateRequest, _options?: Configuration): Promise<HttpInfo<ProductGroupPromotionResponse>> {
        const result = this.api.productGroupPromotionsUpdateWithHttpInfo(adAccountId, productGroupPromotionUpdateRequest, _options);
        return result.toPromise();
    }

    /**
     * Update multiple existing Product Group Promotions (by product_group_id)
     * Update product group promotions
     * @param adAccountId Unique identifier of an ad account.
     * @param productGroupPromotionUpdateRequest Parameters to update Product group promotions
     */
    public productGroupPromotionsUpdate(adAccountId: string, productGroupPromotionUpdateRequest: ProductGroupPromotionUpdateRequest, _options?: Configuration): Promise<ProductGroupPromotionResponse> {
        const result = this.api.productGroupPromotionsUpdate(adAccountId, productGroupPromotionUpdateRequest, _options);
        return result.toPromise();
    }

    /**
     * Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get product group analytics
     * @param adAccountId Unique identifier of an ad account.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param productGroupIds List of Product group Ids to use to filter the results.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     */
    public productGroupsAnalyticsWithHttpInfo(adAccountId: string, startDate: string, endDate: string, productGroupIds: Array<string>, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', _options?: Configuration): Promise<HttpInfo<Array<ProductGroupAnalyticsResponseInner>>> {
        const result = this.api.productGroupsAnalyticsWithHttpInfo(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, _options);
        return result.toPromise();
    }

    /**
     * Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get product group analytics
     * @param adAccountId Unique identifier of an ad account.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param productGroupIds List of Product group Ids to use to filter the results.
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     */
    public productGroupsAnalytics(adAccountId: string, startDate: string, endDate: string, productGroupIds: Array<string>, columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'CAMPAIGN_NAME' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_ENTITY_STATUS' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'VIDEO_LENGTH' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>, granularity: Granularity, clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60, conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION', _options?: Configuration): Promise<Array<ProductGroupAnalyticsResponseInner>> {
        const result = this.api.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, _options);
        return result.toPromise();
    }


}



import { ObservableProductGroupsApi } from './ObservableAPI';

import { ProductGroupsApiRequestFactory, ProductGroupsApiResponseProcessor} from "../apis/ProductGroupsApi";
export class PromiseProductGroupsApi {
    private api: ObservableProductGroupsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ProductGroupsApiRequestFactory,
        responseProcessor?: ProductGroupsApiResponseProcessor
    ) {
        this.api = new ObservableProductGroupsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * This endpoint is completely deprecated. Please use <a href=\'/docs/api/v5/#operation/catalogs_product_groups/list\'>List product groups</a> from Catalogs API instead.
     * Get catalog product groups
     * @param adAccountId Unique identifier of an ad account.
     * @param feedProfileId The feed profile id whose catalog product groups we want to return.
     */
    public adAccountsCatalogsProductGroupsListWithHttpInfo(adAccountId: string, feedProfileId?: string, _options?: Configuration): Promise<HttpInfo<AdAccountsCatalogsProductGroupsList200Response>> {
        const result = this.api.adAccountsCatalogsProductGroupsListWithHttpInfo(adAccountId, feedProfileId, _options);
        return result.toPromise();
    }

    /**
     * This endpoint is completely deprecated. Please use <a href=\'/docs/api/v5/#operation/catalogs_product_groups/list\'>List product groups</a> from Catalogs API instead.
     * Get catalog product groups
     * @param adAccountId Unique identifier of an ad account.
     * @param feedProfileId The feed profile id whose catalog product groups we want to return.
     */
    public adAccountsCatalogsProductGroupsList(adAccountId: string, feedProfileId?: string, _options?: Configuration): Promise<AdAccountsCatalogsProductGroupsList200Response> {
        const result = this.api.adAccountsCatalogsProductGroupsList(adAccountId, feedProfileId, _options);
        return result.toPromise();
    }


}



import { ObservableResourcesApi } from './ObservableAPI';

import { ResourcesApiRequestFactory, ResourcesApiResponseProcessor} from "../apis/ResourcesApi";
export class PromiseResourcesApi {
    private api: ObservableResourcesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ResourcesApiRequestFactory,
        responseProcessor?: ResourcesApiResponseProcessor
    ) {
        this.api = new ObservableResourcesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get Ad Accounts countries
     * Get ad accounts countries
     */
    public adAccountCountriesGetWithHttpInfo(_options?: Configuration): Promise<HttpInfo<AdAccountsCountryResponse>> {
        const result = this.api.adAccountCountriesGetWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Get Ad Accounts countries
     * Get ad accounts countries
     */
    public adAccountCountriesGet(_options?: Configuration): Promise<AdAccountsCountryResponse> {
        const result = this.api.adAccountCountriesGet(_options);
        return result.toPromise();
    }

    /**
     * Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href=\'/docs/content/analytics/\'>Organic Analytics</a> and <a href=\'/docs/ads/ad-analytics-reporting/\'>Ads Analytics</a> for more information.
     * Get available metrics\' definitions
     * @param reportType Report type.
     */
    public deliveryMetricsGetWithHttpInfo(reportType?: 'SYNC' | 'ASYNC', _options?: Configuration): Promise<HttpInfo<DeliveryMetricsResponse>> {
        const result = this.api.deliveryMetricsGetWithHttpInfo(reportType, _options);
        return result.toPromise();
    }

    /**
     * Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href=\'/docs/content/analytics/\'>Organic Analytics</a> and <a href=\'/docs/ads/ad-analytics-reporting/\'>Ads Analytics</a> for more information.
     * Get available metrics\' definitions
     * @param reportType Report type.
     */
    public deliveryMetricsGet(reportType?: 'SYNC' | 'ASYNC', _options?: Configuration): Promise<DeliveryMetricsResponse> {
        const result = this.api.deliveryMetricsGet(reportType, _options);
        return result.toPromise();
    }

    /**
     * <p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>
     * Get interest details
     * @param interestId Unique identifier of an interest.
     */
    public interestTargetingOptionsGetWithHttpInfo(interestId: string, _options?: Configuration): Promise<HttpInfo<SingleInterestTargetingOptionResponse>> {
        const result = this.api.interestTargetingOptionsGetWithHttpInfo(interestId, _options);
        return result.toPromise();
    }

    /**
     * <p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>
     * Get interest details
     * @param interestId Unique identifier of an interest.
     */
    public interestTargetingOptionsGet(interestId: string, _options?: Configuration): Promise<SingleInterestTargetingOptionResponse> {
        const result = this.api.interestTargetingOptionsGet(interestId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get lead form questions
     */
    public leadFormQuestionsGetWithHttpInfo(_options?: Configuration): Promise<HttpInfo<void>> {
        const result = this.api.leadFormQuestionsGetWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Get lead form questions
     */
    public leadFormQuestionsGet(_options?: Configuration): Promise<void> {
        const result = this.api.leadFormQuestionsGet(_options);
        return result.toPromise();
    }

    /**
     * Learn whether conversion or non-conversion metrics are finalized and ready to query.
     * Get metrics ready state
     * @param date Analytics reports request date (UTC). Format: YYYY-MM-DD
     */
    public metricsReadyStateGetWithHttpInfo(date: string, _options?: Configuration): Promise<HttpInfo<BookClosedResponse>> {
        const result = this.api.metricsReadyStateGetWithHttpInfo(date, _options);
        return result.toPromise();
    }

    /**
     * Learn whether conversion or non-conversion metrics are finalized and ready to query.
     * Get metrics ready state
     * @param date Analytics reports request date (UTC). Format: YYYY-MM-DD
     */
    public metricsReadyStateGet(date: string, _options?: Configuration): Promise<BookClosedResponse> {
        const result = this.api.metricsReadyStateGet(date, _options);
        return result.toPromise();
    }

    /**
     * <p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>
     * Get targeting options
     * @param targetingType Public targeting type.
     * @param clientId Client ID.
     * @param oauthSignature Oauth signature
     * @param timestamp Timestamp
     */
    public targetingOptionsGetWithHttpInfo(targetingType: 'APPTYPE' | 'GENDER' | 'LOCALE' | 'AGE_BUCKET' | 'LOCATION' | 'GEO' | 'INTEREST' | 'KEYWORD' | 'AUDIENCE_INCLUDE' | 'AUDIENCE_EXCLUDE', clientId?: string, oauthSignature?: string, timestamp?: string, _options?: Configuration): Promise<HttpInfo<Array<any>>> {
        const result = this.api.targetingOptionsGetWithHttpInfo(targetingType, clientId, oauthSignature, timestamp, _options);
        return result.toPromise();
    }

    /**
     * <p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>
     * Get targeting options
     * @param targetingType Public targeting type.
     * @param clientId Client ID.
     * @param oauthSignature Oauth signature
     * @param timestamp Timestamp
     */
    public targetingOptionsGet(targetingType: 'APPTYPE' | 'GENDER' | 'LOCALE' | 'AGE_BUCKET' | 'LOCATION' | 'GEO' | 'INTEREST' | 'KEYWORD' | 'AUDIENCE_INCLUDE' | 'AUDIENCE_EXCLUDE', clientId?: string, oauthSignature?: string, timestamp?: string, _options?: Configuration): Promise<Array<any>> {
        const result = this.api.targetingOptionsGet(targetingType, clientId, oauthSignature, timestamp, _options);
        return result.toPromise();
    }


}



import { ObservableSearchApi } from './ObservableAPI';

import { SearchApiRequestFactory, SearchApiResponseProcessor} from "../apis/SearchApi";
export class PromiseSearchApi {
    private api: ObservableSearchApi

    public constructor(
        configuration: Configuration,
        requestFactory?: SearchApiRequestFactory,
        responseProcessor?: SearchApiResponseProcessor
    ) {
        this.api = new ObservableSearchApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
     * Search pins by a given search term
     * @param term Search term to look up pins.
     * @param countryCode Two letter country code (ISO 3166-1 alpha-2)
     * @param bookmark Cursor used to fetch the next page of items
     * @param locale Search locale.
     * @param limit Max search result size
     */
    public searchPartnerPinsWithHttpInfo(term: string, countryCode: string, bookmark?: string, locale?: string, limit?: number, _options?: Configuration): Promise<HttpInfo<SearchPartnerPins200Response>> {
        const result = this.api.searchPartnerPinsWithHttpInfo(term, countryCode, bookmark, locale, limit, _options);
        return result.toPromise();
    }

    /**
     * <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
     * Search pins by a given search term
     * @param term Search term to look up pins.
     * @param countryCode Two letter country code (ISO 3166-1 alpha-2)
     * @param bookmark Cursor used to fetch the next page of items
     * @param locale Search locale.
     * @param limit Max search result size
     */
    public searchPartnerPins(term: string, countryCode: string, bookmark?: string, locale?: string, limit?: number, _options?: Configuration): Promise<SearchPartnerPins200Response> {
        const result = this.api.searchPartnerPins(term, countryCode, bookmark, locale, limit, _options);
        return result.toPromise();
    }

    /**
     * Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/reference/business-access/\'>Understanding Business Access</a> for more information.
     * Search user\'s boards
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param query Search query. Can contain pin description keywords or comma-separated pin IDs.
     */
    public searchUserBoardsGetWithHttpInfo(adAccountId?: string, bookmark?: string, pageSize?: number, query?: string, _options?: Configuration): Promise<HttpInfo<SearchUserBoardsGet200Response>> {
        const result = this.api.searchUserBoardsGetWithHttpInfo(adAccountId, bookmark, pageSize, query, _options);
        return result.toPromise();
    }

    /**
     * Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/reference/business-access/\'>Understanding Business Access</a> for more information.
     * Search user\'s boards
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param query Search query. Can contain pin description keywords or comma-separated pin IDs.
     */
    public searchUserBoardsGet(adAccountId?: string, bookmark?: string, pageSize?: number, query?: string, _options?: Configuration): Promise<SearchUserBoardsGet200Response> {
        const result = this.api.searchUserBoardsGet(adAccountId, bookmark, pageSize, query, _options);
        return result.toPromise();
    }

    /**
     * Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/reference/business-access/\'>Understanding Business Access</a> for more information.
     * Search user\'s Pins
     * @param query Search query. Can contain pin description keywords or comma-separated pin IDs.
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public searchUserPinsListWithHttpInfo(query: string, adAccountId?: string, bookmark?: string, _options?: Configuration): Promise<HttpInfo<PinsList200Response>> {
        const result = this.api.searchUserPinsListWithHttpInfo(query, adAccountId, bookmark, _options);
        return result.toPromise();
    }

    /**
     * Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/reference/business-access/\'>Understanding Business Access</a> for more information.
     * Search user\'s Pins
     * @param query Search query. Can contain pin description keywords or comma-separated pin IDs.
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public searchUserPinsList(query: string, adAccountId?: string, bookmark?: string, _options?: Configuration): Promise<PinsList200Response> {
        const result = this.api.searchUserPinsList(query, adAccountId, bookmark, _options);
        return result.toPromise();
    }


}



import { ObservableTermsApi } from './ObservableAPI';

import { TermsApiRequestFactory, TermsApiResponseProcessor} from "../apis/TermsApi";
export class PromiseTermsApi {
    private api: ObservableTermsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: TermsApiRequestFactory,
        responseProcessor?: TermsApiResponseProcessor
    ) {
        this.api = new ObservableTermsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get a list of terms logically related to each input term. <p/> Example: the term \'workout\' would list related terms like \'one song workout\', \'yoga workout\', \'workout motivation\', etc.
     * List related terms
     * @param terms List of input terms.
     */
    public termsRelatedListWithHttpInfo(terms: Array<string>, _options?: Configuration): Promise<HttpInfo<RelatedTerms>> {
        const result = this.api.termsRelatedListWithHttpInfo(terms, _options);
        return result.toPromise();
    }

    /**
     * Get a list of terms logically related to each input term. <p/> Example: the term \'workout\' would list related terms like \'one song workout\', \'yoga workout\', \'workout motivation\', etc.
     * List related terms
     * @param terms List of input terms.
     */
    public termsRelatedList(terms: Array<string>, _options?: Configuration): Promise<RelatedTerms> {
        const result = this.api.termsRelatedList(terms, _options);
        return result.toPromise();
    }

    /**
     * Get popular search terms that begin with your input term. <p/> Example: \'sport\' would return popular terms like \'sports bar\' and \'sportswear\', but not \'motor sports\' since the phrase does not begin with the given term.
     * List suggested terms
     * @param term Input term.
     * @param limit Max suggested terms to return.
     */
    public termsSuggestedListWithHttpInfo(term: string, limit?: number, _options?: Configuration): Promise<HttpInfo<Array<string>>> {
        const result = this.api.termsSuggestedListWithHttpInfo(term, limit, _options);
        return result.toPromise();
    }

    /**
     * Get popular search terms that begin with your input term. <p/> Example: \'sport\' would return popular terms like \'sports bar\' and \'sportswear\', but not \'motor sports\' since the phrase does not begin with the given term.
     * List suggested terms
     * @param term Input term.
     * @param limit Max suggested terms to return.
     */
    public termsSuggestedList(term: string, limit?: number, _options?: Configuration): Promise<Array<string>> {
        const result = this.api.termsSuggestedList(term, limit, _options);
        return result.toPromise();
    }


}



import { ObservableTermsOfServiceApi } from './ObservableAPI';

import { TermsOfServiceApiRequestFactory, TermsOfServiceApiResponseProcessor} from "../apis/TermsOfServiceApi";
export class PromiseTermsOfServiceApi {
    private api: ObservableTermsOfServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: TermsOfServiceApiRequestFactory,
        responseProcessor?: TermsOfServiceApiResponseProcessor
    ) {
        this.api = new ObservableTermsOfServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
     * Get terms of service
     * @param adAccountId Unique identifier of an ad account.
     * @param includeHtml Return HTML in TOS text.
     * @param tosType Request type.
     */
    public termsOfServiceGetWithHttpInfo(adAccountId: string, includeHtml?: boolean, tosType?: string, _options?: Configuration): Promise<HttpInfo<TermsOfService>> {
        const result = this.api.termsOfServiceGetWithHttpInfo(adAccountId, includeHtml, tosType, _options);
        return result.toPromise();
    }

    /**
     * Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
     * Get terms of service
     * @param adAccountId Unique identifier of an ad account.
     * @param includeHtml Return HTML in TOS text.
     * @param tosType Request type.
     */
    public termsOfServiceGet(adAccountId: string, includeHtml?: boolean, tosType?: string, _options?: Configuration): Promise<TermsOfService> {
        const result = this.api.termsOfServiceGet(adAccountId, includeHtml, tosType, _options);
        return result.toPromise();
    }


}



import { ObservableUserAccountApi } from './ObservableAPI';

import { UserAccountApiRequestFactory, UserAccountApiResponseProcessor} from "../apis/UserAccountApi";
export class PromiseUserAccountApi {
    private api: ObservableUserAccountApi

    public constructor(
        configuration: Configuration,
        requestFactory?: UserAccountApiRequestFactory,
        responseProcessor?: UserAccountApiResponseProcessor
    ) {
        this.api = new ObservableUserAccountApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get a list of the boards a user follows. The request returns a board summary object array.
     * List following boards
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
     * @param adAccountId Unique identifier of an ad account.
     */
    public boardsUserFollowsListWithHttpInfo(bookmark?: string, pageSize?: number, explicitFollowing?: boolean, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<BoardsUserFollowsList200Response>> {
        const result = this.api.boardsUserFollowsListWithHttpInfo(bookmark, pageSize, explicitFollowing, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of the boards a user follows. The request returns a board summary object array.
     * List following boards
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
     * @param adAccountId Unique identifier of an ad account.
     */
    public boardsUserFollowsList(bookmark?: string, pageSize?: number, explicitFollowing?: boolean, adAccountId?: string, _options?: Configuration): Promise<BoardsUserFollowsList200Response> {
        const result = this.api.boardsUserFollowsList(bookmark, pageSize, explicitFollowing, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.
     * Follow user
     * @param username A valid username
     * @param followUserRequest Follow a user.
     */
    public followUserUpdateWithHttpInfo(username: string, followUserRequest: FollowUserRequest, _options?: Configuration): Promise<HttpInfo<UserSummary>> {
        const result = this.api.followUserUpdateWithHttpInfo(username, followUserRequest, _options);
        return result.toPromise();
    }

    /**
     * <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.
     * Follow user
     * @param username A valid username
     * @param followUserRequest Follow a user.
     */
    public followUserUpdate(username: string, followUserRequest: FollowUserRequest, _options?: Configuration): Promise<UserSummary> {
        const result = this.api.followUserUpdate(username, followUserRequest, _options);
        return result.toPromise();
    }

    /**
     * Get a list of your followers.
     * List followers
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public followersListWithHttpInfo(bookmark?: string, pageSize?: number, _options?: Configuration): Promise<HttpInfo<FollowersList200Response>> {
        const result = this.api.followersListWithHttpInfo(bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * Get a list of your followers.
     * List followers
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public followersList(bookmark?: string, pageSize?: number, _options?: Configuration): Promise<FollowersList200Response> {
        const result = this.api.followersList(bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * Get a list of your linked business accounts.
     * List linked businesses
     */
    public linkedBusinessAccountsGetWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Array<LinkedBusiness>>> {
        const result = this.api.linkedBusinessAccountsGetWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Get a list of your linked business accounts.
     * List linked businesses
     */
    public linkedBusinessAccountsGet(_options?: Configuration): Promise<Array<LinkedBusiness>> {
        const result = this.api.linkedBusinessAccountsGet(_options);
        return result.toPromise();
    }

    /**
     * Unverifu a website verified by the signed-in user.
     * Unverify website
     * @param website Website with path or domain only
     */
    public unverifyWebsiteDeleteWithHttpInfo(website: string, _options?: Configuration): Promise<HttpInfo<void>> {
        const result = this.api.unverifyWebsiteDeleteWithHttpInfo(website, _options);
        return result.toPromise();
    }

    /**
     * Unverifu a website verified by the signed-in user.
     * Unverify website
     * @param website Website with path or domain only
     */
    public unverifyWebsiteDelete(website: string, _options?: Configuration): Promise<void> {
        const result = this.api.unverifyWebsiteDelete(website, _options);
        return result.toPromise();
    }

    /**
     * Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account analytics
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param fromClaimedContent Filter on Pins that match your claimed domain.
     * @param pinFormat Pin formats to get data for, default is all.
     * @param appTypes Apps or devices to get data for, default is all.
     * @param contentType Filter to paid or organic data. Default is all.
     * @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
     * @param metricTypes Metric types to get data for, default is all. 
     * @param splitField How to split the data into groups. Not including this param means data won\&#39;t be split.
     * @param adAccountId Unique identifier of an ad account.
     */
    public userAccountAnalyticsWithHttpInfo(startDate: string, endDate: string, fromClaimedContent?: 'OTHER' | 'CLAIMED' | 'BOTH', pinFormat?: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | 'PRODUCT' | 'REGULAR' | 'VIDEO', appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB', contentType?: 'ALL' | 'PAID' | 'ORGANIC', source?: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS', metricTypes?: Array<'ENGAGEMENT' | 'ENGAGEMENT_RATE' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'OUTBOUND_CLICK_RATE' | 'PIN_CLICK' | 'PIN_CLICK_RATE' | 'SAVE' | 'SAVE_RATE'>, splitField?: 'NO_SPLIT' | 'APP_TYPE' | 'OWNED_CONTENT' | 'SOURCE' | 'PIN_FORMAT', adAccountId?: string, _options?: Configuration): Promise<HttpInfo<{ [key: string]: AnalyticsMetricsResponse; }>> {
        const result = this.api.userAccountAnalyticsWithHttpInfo(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account analytics
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param fromClaimedContent Filter on Pins that match your claimed domain.
     * @param pinFormat Pin formats to get data for, default is all.
     * @param appTypes Apps or devices to get data for, default is all.
     * @param contentType Filter to paid or organic data. Default is all.
     * @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
     * @param metricTypes Metric types to get data for, default is all. 
     * @param splitField How to split the data into groups. Not including this param means data won\&#39;t be split.
     * @param adAccountId Unique identifier of an ad account.
     */
    public userAccountAnalytics(startDate: string, endDate: string, fromClaimedContent?: 'OTHER' | 'CLAIMED' | 'BOTH', pinFormat?: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | 'PRODUCT' | 'REGULAR' | 'VIDEO', appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB', contentType?: 'ALL' | 'PAID' | 'ORGANIC', source?: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS', metricTypes?: Array<'ENGAGEMENT' | 'ENGAGEMENT_RATE' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'OUTBOUND_CLICK_RATE' | 'PIN_CLICK' | 'PIN_CLICK_RATE' | 'SAVE' | 'SAVE_RATE'>, splitField?: 'NO_SPLIT' | 'APP_TYPE' | 'OWNED_CONTENT' | 'SOURCE' | 'PIN_FORMAT', adAccountId?: string, _options?: Configuration): Promise<{ [key: string]: AnalyticsMetricsResponse; }> {
        const result = this.api.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Gets analytics data about a user\'s top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account top pins analytics
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param sortBy Specify sorting order for metrics
     * @param fromClaimedContent Filter on Pins that match your claimed domain.
     * @param pinFormat Pin formats to get data for, default is all.
     * @param appTypes Apps or devices to get data for, default is all.
     * @param contentType Filter to paid or organic data. Default is all.
     * @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
     * @param metricTypes Metric types to get data for, default is all. 
     * @param numOfPins Number of pins to include, default is 10. Max is 50.
     * @param createdInLastNDays Get metrics for pins created in the last \&quot;n\&quot; days.
     * @param adAccountId Unique identifier of an ad account.
     */
    public userAccountAnalyticsTopPinsWithHttpInfo(startDate: string, endDate: string, sortBy: 'ENGAGEMENT' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'PIN_CLICK' | 'SAVE', fromClaimedContent?: 'OTHER' | 'CLAIMED' | 'BOTH', pinFormat?: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | 'PRODUCT' | 'REGULAR' | 'VIDEO', appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB', contentType?: 'ALL' | 'PAID' | 'ORGANIC', source?: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS', metricTypes?: Array<'ENGAGEMENT' | 'ENGAGEMENT_RATE' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'OUTBOUND_CLICK_RATE' | 'PIN_CLICK' | 'PIN_CLICK_RATE' | 'SAVE' | 'SAVE_RATE'>, numOfPins?: number, createdInLastNDays?: 30, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<TopPinsAnalyticsResponse>> {
        const result = this.api.userAccountAnalyticsTopPinsWithHttpInfo(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Gets analytics data about a user\'s top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account top pins analytics
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param sortBy Specify sorting order for metrics
     * @param fromClaimedContent Filter on Pins that match your claimed domain.
     * @param pinFormat Pin formats to get data for, default is all.
     * @param appTypes Apps or devices to get data for, default is all.
     * @param contentType Filter to paid or organic data. Default is all.
     * @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
     * @param metricTypes Metric types to get data for, default is all. 
     * @param numOfPins Number of pins to include, default is 10. Max is 50.
     * @param createdInLastNDays Get metrics for pins created in the last \&quot;n\&quot; days.
     * @param adAccountId Unique identifier of an ad account.
     */
    public userAccountAnalyticsTopPins(startDate: string, endDate: string, sortBy: 'ENGAGEMENT' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'PIN_CLICK' | 'SAVE', fromClaimedContent?: 'OTHER' | 'CLAIMED' | 'BOTH', pinFormat?: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | 'PRODUCT' | 'REGULAR' | 'VIDEO', appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB', contentType?: 'ALL' | 'PAID' | 'ORGANIC', source?: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS', metricTypes?: Array<'ENGAGEMENT' | 'ENGAGEMENT_RATE' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'OUTBOUND_CLICK_RATE' | 'PIN_CLICK' | 'PIN_CLICK_RATE' | 'SAVE' | 'SAVE_RATE'>, numOfPins?: number, createdInLastNDays?: 30, adAccountId?: string, _options?: Configuration): Promise<TopPinsAnalyticsResponse> {
        const result = this.api.userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Gets analytics data about a user\'s top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account top video pins analytics
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param sortBy Specify sorting order for video metrics
     * @param fromClaimedContent Filter on Pins that match your claimed domain.
     * @param pinFormat Pin formats to get data for, default is all.
     * @param appTypes Apps or devices to get data for, default is all.
     * @param contentType Filter to paid or organic data. Default is all.
     * @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
     * @param metricTypes Metric types to get video data for, default is all. 
     * @param numOfPins Number of pins to include, default is 10. Max is 50.
     * @param createdInLastNDays Get metrics for pins created in the last \&quot;n\&quot; days.
     * @param adAccountId Unique identifier of an ad account.
     */
    public userAccountAnalyticsTopVideoPinsWithHttpInfo(startDate: string, endDate: string, sortBy: 'IMPRESSION' | 'SAVE' | 'OUTBOUND_CLICK' | 'VIDEO_MRC_VIEW' | 'VIDEO_AVG_WATCH_TIME' | 'VIDEO_V50_WATCH_TIME' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_10S_VIEW' | 'VIDEO_START', fromClaimedContent?: 'OTHER' | 'CLAIMED' | 'BOTH', pinFormat?: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | 'PRODUCT' | 'REGULAR' | 'VIDEO', appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB', contentType?: 'ALL' | 'PAID' | 'ORGANIC', source?: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS', metricTypes?: Array<'IMPRESSION' | 'SAVE' | 'VIDEO_MRC_VIEW' | 'VIDEO_AVG_WATCH_TIME' | 'VIDEO_V50_WATCH_TIME' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_10S_VIEW' | 'VIDEO_START' | 'OUTBOUND_CLICK'>, numOfPins?: number, createdInLastNDays?: 30, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<TopVideoPinsAnalyticsResponse>> {
        const result = this.api.userAccountAnalyticsTopVideoPinsWithHttpInfo(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Gets analytics data about a user\'s top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account top video pins analytics
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param sortBy Specify sorting order for video metrics
     * @param fromClaimedContent Filter on Pins that match your claimed domain.
     * @param pinFormat Pin formats to get data for, default is all.
     * @param appTypes Apps or devices to get data for, default is all.
     * @param contentType Filter to paid or organic data. Default is all.
     * @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
     * @param metricTypes Metric types to get video data for, default is all. 
     * @param numOfPins Number of pins to include, default is 10. Max is 50.
     * @param createdInLastNDays Get metrics for pins created in the last \&quot;n\&quot; days.
     * @param adAccountId Unique identifier of an ad account.
     */
    public userAccountAnalyticsTopVideoPins(startDate: string, endDate: string, sortBy: 'IMPRESSION' | 'SAVE' | 'OUTBOUND_CLICK' | 'VIDEO_MRC_VIEW' | 'VIDEO_AVG_WATCH_TIME' | 'VIDEO_V50_WATCH_TIME' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_10S_VIEW' | 'VIDEO_START', fromClaimedContent?: 'OTHER' | 'CLAIMED' | 'BOTH', pinFormat?: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | 'PRODUCT' | 'REGULAR' | 'VIDEO', appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB', contentType?: 'ALL' | 'PAID' | 'ORGANIC', source?: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS', metricTypes?: Array<'IMPRESSION' | 'SAVE' | 'VIDEO_MRC_VIEW' | 'VIDEO_AVG_WATCH_TIME' | 'VIDEO_V50_WATCH_TIME' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_10S_VIEW' | 'VIDEO_START' | 'OUTBOUND_CLICK'>, numOfPins?: number, createdInLastNDays?: 30, adAccountId?: string, _options?: Configuration): Promise<TopVideoPinsAnalyticsResponse> {
        const result = this.api.userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of a user\'s following interests in one place.
     * List following interests
     * @param username A valid username
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public userAccountFollowedInterestsWithHttpInfo(username: string, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<HttpInfo<UserAccountFollowedInterests200Response>> {
        const result = this.api.userAccountFollowedInterestsWithHttpInfo(username, bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * Get a list of a user\'s following interests in one place.
     * List following interests
     * @param username A valid username
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public userAccountFollowedInterests(username: string, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<UserAccountFollowedInterests200Response> {
        const result = this.api.userAccountFollowedInterests(username, bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/reference/business-access/\'>Understanding Business Access</a> for more information.
     * Get user account
     * @param adAccountId Unique identifier of an ad account.
     */
    public userAccountGetWithHttpInfo(adAccountId?: string, _options?: Configuration): Promise<HttpInfo<Account>> {
        const result = this.api.userAccountGetWithHttpInfo(adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/reference/business-access/\'>Understanding Business Access</a> for more information.
     * Get user account
     * @param adAccountId Unique identifier of an ad account.
     */
    public userAccountGet(adAccountId?: string, _options?: Configuration): Promise<Account> {
        const result = this.api.userAccountGet(adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of who a certain user follows.
     * List following
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param feedType Thrift param specifying what type of followees will be kept. Default to include all followees.
     * @param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
     * @param adAccountId Unique identifier of an ad account.
     */
    public userFollowingGetWithHttpInfo(bookmark?: string, pageSize?: number, feedType?: UserFollowingFeedType, explicitFollowing?: boolean, adAccountId?: string, _options?: Configuration): Promise<HttpInfo<UserFollowingGet200Response>> {
        const result = this.api.userFollowingGetWithHttpInfo(bookmark, pageSize, feedType, explicitFollowing, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of who a certain user follows.
     * List following
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param feedType Thrift param specifying what type of followees will be kept. Default to include all followees.
     * @param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
     * @param adAccountId Unique identifier of an ad account.
     */
    public userFollowingGet(bookmark?: string, pageSize?: number, feedType?: UserFollowingFeedType, explicitFollowing?: boolean, adAccountId?: string, _options?: Configuration): Promise<UserFollowingGet200Response> {
        const result = this.api.userFollowingGet(bookmark, pageSize, feedType, explicitFollowing, adAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get user websites, claimed or not
     * Get user websites
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public userWebsitesGetWithHttpInfo(bookmark?: string, pageSize?: number, _options?: Configuration): Promise<HttpInfo<UserWebsitesGet200Response>> {
        const result = this.api.userWebsitesGetWithHttpInfo(bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * Get user websites, claimed or not
     * Get user websites
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public userWebsitesGet(bookmark?: string, pageSize?: number, _options?: Configuration): Promise<UserWebsitesGet200Response> {
        const result = this.api.userWebsitesGet(bookmark, pageSize, _options);
        return result.toPromise();
    }

    /**
     * Verify a website as a signed-in user.
     * Verify website
     * @param userWebsiteVerifyRequest Verify a website.
     */
    public verifyWebsiteUpdateWithHttpInfo(userWebsiteVerifyRequest: UserWebsiteVerifyRequest, _options?: Configuration): Promise<HttpInfo<UserWebsiteSummary>> {
        const result = this.api.verifyWebsiteUpdateWithHttpInfo(userWebsiteVerifyRequest, _options);
        return result.toPromise();
    }

    /**
     * Verify a website as a signed-in user.
     * Verify website
     * @param userWebsiteVerifyRequest Verify a website.
     */
    public verifyWebsiteUpdate(userWebsiteVerifyRequest: UserWebsiteVerifyRequest, _options?: Configuration): Promise<UserWebsiteSummary> {
        const result = this.api.verifyWebsiteUpdate(userWebsiteVerifyRequest, _options);
        return result.toPromise();
    }

    /**
     * Get verification code for user to install on the website to claim it.
     * Get user verification code for website claiming
     */
    public websiteVerificationGetWithHttpInfo(_options?: Configuration): Promise<HttpInfo<UserWebsiteVerificationCode>> {
        const result = this.api.websiteVerificationGetWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Get verification code for user to install on the website to claim it.
     * Get user verification code for website claiming
     */
    public websiteVerificationGet(_options?: Configuration): Promise<UserWebsiteVerificationCode> {
        const result = this.api.websiteVerificationGet(_options);
        return result.toPromise();
    }


}



