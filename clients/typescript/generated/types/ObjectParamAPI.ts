import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, ConfigurationOptions } from '../configuration'
import type { Middleware } from '../middleware';

import { Account } from '../models/Account';
import { ActionType } from '../models/ActionType';
import { AdAccount } from '../models/AdAccount';
import { AdAccountAnalyticsResponseInner } from '../models/AdAccountAnalyticsResponseInner';
import { AdAccountCreate } from '../models/AdAccountCreate';
import { AdAccountCreateSubscriptionRequest } from '../models/AdAccountCreateSubscriptionRequest';
import { AdAccountCreateSubscriptionRequestPartnerMetadata } from '../models/AdAccountCreateSubscriptionRequestPartnerMetadata';
import { AdAccountCreateSubscriptionResponse } from '../models/AdAccountCreateSubscriptionResponse';
import { AdAccountGetSubscriptionResponse } from '../models/AdAccountGetSubscriptionResponse';
import { AdAccountOwner } from '../models/AdAccountOwner';
import { AdAccountsAudiencesSharedAccountsList200Response } from '../models/AdAccountsAudiencesSharedAccountsList200Response';
import { AdAccountsCountryResponse } from '../models/AdAccountsCountryResponse';
import { AdAccountsCountryResponseData } from '../models/AdAccountsCountryResponseData';
import { AdAccountsList200Response } from '../models/AdAccountsList200Response';
import { AdAccountsSubscriptionsGetList200Response } from '../models/AdAccountsSubscriptionsGetList200Response';
import { AdArrayResponse } from '../models/AdArrayResponse';
import { AdArrayResponseElement } from '../models/AdArrayResponseElement';
import { AdCommon } from '../models/AdCommon';
import { AdCountry } from '../models/AdCountry';
import { AdCreateRequest } from '../models/AdCreateRequest';
import { AdGroupArrayResponse } from '../models/AdGroupArrayResponse';
import { AdGroupArrayResponseElement } from '../models/AdGroupArrayResponseElement';
import { AdGroupAudienceSizingRequest } from '../models/AdGroupAudienceSizingRequest';
import { AdGroupAudienceSizingRequestKeywordsInner } from '../models/AdGroupAudienceSizingRequestKeywordsInner';
import { AdGroupAudienceSizingResponse } from '../models/AdGroupAudienceSizingResponse';
import { AdGroupCommon } from '../models/AdGroupCommon';
import { AdGroupCreateRequest } from '../models/AdGroupCreateRequest';
import { AdGroupIdFilter } from '../models/AdGroupIdFilter';
import { AdGroupResponse } from '../models/AdGroupResponse';
import { AdGroupSummaryStatus } from '../models/AdGroupSummaryStatus';
import { AdGroupUpdateRequest } from '../models/AdGroupUpdateRequest';
import { AdGroupsAnalyticsResponseInner } from '../models/AdGroupsAnalyticsResponseInner';
import { AdGroupsList200Response } from '../models/AdGroupsList200Response';
import { AdPinAnalytics } from '../models/AdPinAnalytics';
import { AdPinId } from '../models/AdPinId';
import { AdPreviewCreateFromImage } from '../models/AdPreviewCreateFromImage';
import { AdPreviewCreateFromPin } from '../models/AdPreviewCreateFromPin';
import { AdPreviewRequest } from '../models/AdPreviewRequest';
import { AdPreviewShopping } from '../models/AdPreviewShopping';
import { AdPreviewURLResponse } from '../models/AdPreviewURLResponse';
import { AdResponse } from '../models/AdResponse';
import { AdUpdateRequest } from '../models/AdUpdateRequest';
import { AdsAnalyticsAdGroupTargetingType } from '../models/AdsAnalyticsAdGroupTargetingType';
import { AdsAnalyticsAdTargetingType } from '../models/AdsAnalyticsAdTargetingType';
import { AdsAnalyticsCampaignTargetingType } from '../models/AdsAnalyticsCampaignTargetingType';
import { AdsAnalyticsCreateAsyncRequest } from '../models/AdsAnalyticsCreateAsyncRequest';
import { AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics } from '../models/AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics';
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
import { AdvancedAuctionBidOptions } from '../models/AdvancedAuctionBidOptions';
import { AdvancedAuctionItem } from '../models/AdvancedAuctionItem';
import { AdvancedAuctionItems } from '../models/AdvancedAuctionItems';
import { AdvancedAuctionItemsGetRecord } from '../models/AdvancedAuctionItemsGetRecord';
import { AdvancedAuctionItemsGetRequest } from '../models/AdvancedAuctionItemsGetRequest';
import { AdvancedAuctionItemsSubmitDeleteRecord } from '../models/AdvancedAuctionItemsSubmitDeleteRecord';
import { AdvancedAuctionItemsSubmitRecord } from '../models/AdvancedAuctionItemsSubmitRecord';
import { AdvancedAuctionItemsSubmitRequest } from '../models/AdvancedAuctionItemsSubmitRequest';
import { AdvancedAuctionItemsSubmitUpsertRecord } from '../models/AdvancedAuctionItemsSubmitUpsertRecord';
import { AdvancedAuctionKey } from '../models/AdvancedAuctionKey';
import { AdvancedAuctionOperation } from '../models/AdvancedAuctionOperation';
import { AdvancedAuctionOperationError } from '../models/AdvancedAuctionOperationError';
import { AdvancedAuctionProcessedItems } from '../models/AdvancedAuctionProcessedItems';
import { AdvertiserDefinedEvent } from '../models/AdvertiserDefinedEvent';
import { AdvertiserDefinedEventsResponse } from '../models/AdvertiserDefinedEventsResponse';
import { AgeTrendsBucket } from '../models/AgeTrendsBucket';
import { AllOf } from '../models/AllOf';
import { AmazonConnectRequest } from '../models/AmazonConnectRequest';
import { AnalyticsDailyMetrics } from '../models/AnalyticsDailyMetrics';
import { AnalyticsMetricsResponse } from '../models/AnalyticsMetricsResponse';
import { AnyOf } from '../models/AnyOf';
import { AppTypeMultipliers } from '../models/AppTypeMultipliers';
import { AssetGroupBinding } from '../models/AssetGroupBinding';
import { AssetGroupType } from '../models/AssetGroupType';
import { AssetIdPermissions } from '../models/AssetIdPermissions';
import { Audience } from '../models/Audience';
import { AudienceAccountType } from '../models/AudienceAccountType';
import { AudienceCategory } from '../models/AudienceCategory';
import { AudienceCommon } from '../models/AudienceCommon';
import { AudienceCreateRequest } from '../models/AudienceCreateRequest';
import { AudienceDefinition } from '../models/AudienceDefinition';
import { AudienceDefinitionResponse } from '../models/AudienceDefinitionResponse';
import { AudienceDefinitionScope } from '../models/AudienceDefinitionScope';
import { AudienceDefinitionType } from '../models/AudienceDefinitionType';
import { AudienceDemographicValue } from '../models/AudienceDemographicValue';
import { AudienceDemographics } from '../models/AudienceDemographics';
import { AudienceInsightCategoryArrayResponse } from '../models/AudienceInsightCategoryArrayResponse';
import { AudienceInsightCategoryCommon } from '../models/AudienceInsightCategoryCommon';
import { AudienceInsightType } from '../models/AudienceInsightType';
import { AudienceInsightsResponse } from '../models/AudienceInsightsResponse';
import { AudienceRule } from '../models/AudienceRule';
import { AudienceShareType } from '../models/AudienceShareType';
import { AudienceSubcategory } from '../models/AudienceSubcategory';
import { AudienceType } from '../models/AudienceType';
import { AudienceUpdateOperationType } from '../models/AudienceUpdateOperationType';
import { AudienceUpdateRequest } from '../models/AudienceUpdateRequest';
import { AudiencesList200Response } from '../models/AudiencesList200Response';
import { AuthRespondInvitesBody } from '../models/AuthRespondInvitesBody';
import { AuthRespondInvitesBodyInvitesInner } from '../models/AuthRespondInvitesBodyInvitesInner';
import { AuthRespondInvitesBodyInvitesInnerAction } from '../models/AuthRespondInvitesBodyInvitesInnerAction';
import { AvailabilityFilter } from '../models/AvailabilityFilter';
import { BaseInviteDataResponse } from '../models/BaseInviteDataResponse';
import { BaseInviteDataResponseInviteData } from '../models/BaseInviteDataResponseInviteData';
import { BatchOperation } from '../models/BatchOperation';
import { BatchOperationStatus } from '../models/BatchOperationStatus';
import { BidFloor } from '../models/BidFloor';
import { BidFloorRequest } from '../models/BidFloorRequest';
import { BidFloorSpec } from '../models/BidFloorSpec';
import { BillingInvoiceDownloadResponse } from '../models/BillingInvoiceDownloadResponse';
import { BillingInvoiceResponse } from '../models/BillingInvoiceResponse';
import { BillingInvoicesGet200Response } from '../models/BillingInvoicesGet200Response';
import { BillingProfilesGet200Response } from '../models/BillingProfilesGet200Response';
import { BillingProfilesResponse } from '../models/BillingProfilesResponse';
import { Board } from '../models/Board';
import { BoardBase } from '../models/BoardBase';
import { BoardCreate } from '../models/BoardCreate';
import { BoardMedia } from '../models/BoardMedia';
import { BoardOwner } from '../models/BoardOwner';
import { BoardPrivacy } from '../models/BoardPrivacy';
import { BoardPrivacyFilter } from '../models/BoardPrivacyFilter';
import { BoardSection } from '../models/BoardSection';
import { BoardSectionsList200Response } from '../models/BoardSectionsList200Response';
import { BoardUpdatePrivacy } from '../models/BoardUpdatePrivacy';
import { BoardWithUpdatePrivacy } from '../models/BoardWithUpdatePrivacy';
import { BoardWithUpdatePrivacyUpdate } from '../models/BoardWithUpdatePrivacyUpdate';
import { BoardsList200Response } from '../models/BoardsList200Response';
import { BoardsListPins200Response } from '../models/BoardsListPins200Response';
import { BoardsUserFollowsList200Response } from '../models/BoardsUserFollowsList200Response';
import { BookClosedResponse } from '../models/BookClosedResponse';
import { BrandAccountsCreate200Response } from '../models/BrandAccountsCreate200Response';
import { BrandAccountsCreateRequest } from '../models/BrandAccountsCreateRequest';
import { BrandAccountsUpdateRequest } from '../models/BrandAccountsUpdateRequest';
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
import { BusinessAccessError } from '../models/BusinessAccessError';
import { BusinessAccessRole } from '../models/BusinessAccessRole';
import { BusinessAccessUserSummary } from '../models/BusinessAccessUserSummary';
import { BusinessAssetMembersGet200Response } from '../models/BusinessAssetMembersGet200Response';
import { BusinessAssetPartnersGet200Response } from '../models/BusinessAssetPartnersGet200Response';
import { BusinessAssetsGet200Response } from '../models/BusinessAssetsGet200Response';
import { BusinessMemberAssetsGet200Response } from '../models/BusinessMemberAssetsGet200Response';
import { BusinessMemberAssetsSummary } from '../models/BusinessMemberAssetsSummary';
import { BusinessMemberAssetsSummaryAdAccountsInner } from '../models/BusinessMemberAssetsSummaryAdAccountsInner';
import { BusinessMemberAssetsSummaryProfilesInner } from '../models/BusinessMemberAssetsSummaryProfilesInner';
import { BusinessMembersAssetAccessDeleteRequest } from '../models/BusinessMembersAssetAccessDeleteRequest';
import { BusinessMembersAssetAccessDeleteRequestAccessesInner } from '../models/BusinessMembersAssetAccessDeleteRequestAccessesInner';
import { BusinessPartnerAssetAccessGet200Response } from '../models/BusinessPartnerAssetAccessGet200Response';
import { BusinessRole } from '../models/BusinessRole';
import { BusinessRoleCheckMode } from '../models/BusinessRoleCheckMode';
import { BusinessRoleForMembers } from '../models/BusinessRoleForMembers';
import { BusinessSharedAudience } from '../models/BusinessSharedAudience';
import { BusinessSharedAudienceResponse } from '../models/BusinessSharedAudienceResponse';
import { CampaignAudienceMultipliers } from '../models/CampaignAudienceMultipliers';
import { CampaignBidOptions } from '../models/CampaignBidOptions';
import { CampaignBidOptionsCreate } from '../models/CampaignBidOptionsCreate';
import { CampaignBidOptionsUpdate } from '../models/CampaignBidOptionsUpdate';
import { CampaignCommon } from '../models/CampaignCommon';
import { CampaignCreateCommon } from '../models/CampaignCreateCommon';
import { CampaignCreateRequest } from '../models/CampaignCreateRequest';
import { CampaignCreateResponse } from '../models/CampaignCreateResponse';
import { CampaignCreateResponseData } from '../models/CampaignCreateResponseData';
import { CampaignCreateResponseItem } from '../models/CampaignCreateResponseItem';
import { CampaignId } from '../models/CampaignId';
import { CampaignIdFilter } from '../models/CampaignIdFilter';
import { CampaignObjectivesFilter } from '../models/CampaignObjectivesFilter';
import { CampaignResponse } from '../models/CampaignResponse';
import { CampaignSummaryStatus } from '../models/CampaignSummaryStatus';
import { CampaignUpdateRequest } from '../models/CampaignUpdateRequest';
import { CampaignUpdateResponse } from '../models/CampaignUpdateResponse';
import { CampaignsAnalyticsResponseInner } from '../models/CampaignsAnalyticsResponseInner';
import { CampaignsList200Response } from '../models/CampaignsList200Response';
import { CancelInvitesBody } from '../models/CancelInvitesBody';
import { CarouselSlot } from '../models/CarouselSlot';
import { Catalog } from '../models/Catalog';
import { CatalogsAvailableFilterValues } from '../models/CatalogsAvailableFilterValues';
import { CatalogsCreateCreativeAssetsItem } from '../models/CatalogsCreateCreativeAssetsItem';
import { CatalogsCreateHotelItem } from '../models/CatalogsCreateHotelItem';
import { CatalogsCreateReportResponse } from '../models/CatalogsCreateReportResponse';
import { CatalogsCreateRequest } from '../models/CatalogsCreateRequest';
import { CatalogsCreateRetailItem } from '../models/CatalogsCreateRetailItem';
import { CatalogsCreativeAssetsAttributes } from '../models/CatalogsCreativeAssetsAttributes';
import { CatalogsCreativeAssetsAvailableFilterValues } from '../models/CatalogsCreativeAssetsAvailableFilterValues';
import { CatalogsCreativeAssetsBatchItem } from '../models/CatalogsCreativeAssetsBatchItem';
import { CatalogsCreativeAssetsBatchRequest } from '../models/CatalogsCreativeAssetsBatchRequest';
import { CatalogsCreativeAssetsFeed } from '../models/CatalogsCreativeAssetsFeed';
import { CatalogsCreativeAssetsFeedsCreateRequest } from '../models/CatalogsCreativeAssetsFeedsCreateRequest';
import { CatalogsCreativeAssetsFeedsUpdateRequest } from '../models/CatalogsCreativeAssetsFeedsUpdateRequest';
import { CatalogsCreativeAssetsFilterValuesMap } from '../models/CatalogsCreativeAssetsFilterValuesMap';
import { CatalogsCreativeAssetsItemErrorResponse } from '../models/CatalogsCreativeAssetsItemErrorResponse';
import { CatalogsCreativeAssetsItemResponse } from '../models/CatalogsCreativeAssetsItemResponse';
import { CatalogsCreativeAssetsItemsBatch } from '../models/CatalogsCreativeAssetsItemsBatch';
import { CatalogsCreativeAssetsItemsFilter } from '../models/CatalogsCreativeAssetsItemsFilter';
import { CatalogsCreativeAssetsItemsPostFilter } from '../models/CatalogsCreativeAssetsItemsPostFilter';
import { CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest } from '../models/CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest';
import { CatalogsCreativeAssetsProduct } from '../models/CatalogsCreativeAssetsProduct';
import { CatalogsCreativeAssetsProductGroup } from '../models/CatalogsCreativeAssetsProductGroup';
import { CatalogsCreativeAssetsProductGroupCreateRequest } from '../models/CatalogsCreativeAssetsProductGroupCreateRequest';
import { CatalogsCreativeAssetsProductGroupFilterKeys } from '../models/CatalogsCreativeAssetsProductGroupFilterKeys';
import { CatalogsCreativeAssetsProductGroupFilters } from '../models/CatalogsCreativeAssetsProductGroupFilters';
import { CatalogsCreativeAssetsProductGroupFiltersAllOf } from '../models/CatalogsCreativeAssetsProductGroupFiltersAllOf';
import { CatalogsCreativeAssetsProductGroupFiltersAnyOf } from '../models/CatalogsCreativeAssetsProductGroupFiltersAnyOf';
import { CatalogsCreativeAssetsProductGroupProductCounts } from '../models/CatalogsCreativeAssetsProductGroupProductCounts';
import { CatalogsCreativeAssetsProductGroupUpdateRequest } from '../models/CatalogsCreativeAssetsProductGroupUpdateRequest';
import { CatalogsCreativeAssetsProductMetadata } from '../models/CatalogsCreativeAssetsProductMetadata';
import { CatalogsDbItem } from '../models/CatalogsDbItem';
import { CatalogsDeleteCreativeAssetsItem } from '../models/CatalogsDeleteCreativeAssetsItem';
import { CatalogsDeleteHotelItem } from '../models/CatalogsDeleteHotelItem';
import { CatalogsDeleteRetailItem } from '../models/CatalogsDeleteRetailItem';
import { CatalogsFeed } from '../models/CatalogsFeed';
import { CatalogsFeedCredentials } from '../models/CatalogsFeedCredentials';
import { CatalogsFeedIngestion } from '../models/CatalogsFeedIngestion';
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
import { CatalogsFeedVideoCounts } from '../models/CatalogsFeedVideoCounts';
import { CatalogsFeedsCreateRequest } from '../models/CatalogsFeedsCreateRequest';
import { CatalogsFeedsCreateRequestDefaultLocale } from '../models/CatalogsFeedsCreateRequestDefaultLocale';
import { CatalogsFeedsUpdateRequest } from '../models/CatalogsFeedsUpdateRequest';
import { CatalogsFormat } from '../models/CatalogsFormat';
import { CatalogsHotelAddress } from '../models/CatalogsHotelAddress';
import { CatalogsHotelAttributes } from '../models/CatalogsHotelAttributes';
import { CatalogsHotelAttributesAllOfMainImage } from '../models/CatalogsHotelAttributesAllOfMainImage';
import { CatalogsHotelAvailableFilterValues } from '../models/CatalogsHotelAvailableFilterValues';
import { CatalogsHotelBatchItem } from '../models/CatalogsHotelBatchItem';
import { CatalogsHotelBatchRequest } from '../models/CatalogsHotelBatchRequest';
import { CatalogsHotelFeed } from '../models/CatalogsHotelFeed';
import { CatalogsHotelFeedsCreateRequest } from '../models/CatalogsHotelFeedsCreateRequest';
import { CatalogsHotelFeedsUpdateRequest } from '../models/CatalogsHotelFeedsUpdateRequest';
import { CatalogsHotelFilterValuesMap } from '../models/CatalogsHotelFilterValuesMap';
import { CatalogsHotelGuestRatings } from '../models/CatalogsHotelGuestRatings';
import { CatalogsHotelItemErrorResponse } from '../models/CatalogsHotelItemErrorResponse';
import { CatalogsHotelItemResponse } from '../models/CatalogsHotelItemResponse';
import { CatalogsHotelItemsBatch } from '../models/CatalogsHotelItemsBatch';
import { CatalogsHotelItemsFilter } from '../models/CatalogsHotelItemsFilter';
import { CatalogsHotelItemsPostFilter } from '../models/CatalogsHotelItemsPostFilter';
import { CatalogsHotelListProductsByCatalogBasedFilterRequest } from '../models/CatalogsHotelListProductsByCatalogBasedFilterRequest';
import { CatalogsHotelProduct } from '../models/CatalogsHotelProduct';
import { CatalogsHotelProductGroup } from '../models/CatalogsHotelProductGroup';
import { CatalogsHotelProductGroupCreateRequest } from '../models/CatalogsHotelProductGroupCreateRequest';
import { CatalogsHotelProductGroupFilterKeys } from '../models/CatalogsHotelProductGroupFilterKeys';
import { CatalogsHotelProductGroupFilters } from '../models/CatalogsHotelProductGroupFilters';
import { CatalogsHotelProductGroupFiltersAllOf } from '../models/CatalogsHotelProductGroupFiltersAllOf';
import { CatalogsHotelProductGroupFiltersAnyOf } from '../models/CatalogsHotelProductGroupFiltersAnyOf';
import { CatalogsHotelProductGroupProductCounts } from '../models/CatalogsHotelProductGroupProductCounts';
import { CatalogsHotelProductGroupType } from '../models/CatalogsHotelProductGroupType';
import { CatalogsHotelProductGroupUpdateRequest } from '../models/CatalogsHotelProductGroupUpdateRequest';
import { CatalogsHotelProductMetadata } from '../models/CatalogsHotelProductMetadata';
import { CatalogsHotelReportParameters } from '../models/CatalogsHotelReportParameters';
import { CatalogsHotelReportParametersReport } from '../models/CatalogsHotelReportParametersReport';
import { CatalogsHotelReportStatsParameters } from '../models/CatalogsHotelReportStatsParameters';
import { CatalogsHotelReportStatsParametersReport } from '../models/CatalogsHotelReportStatsParametersReport';
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
import { CatalogsItemsPostFilters } from '../models/CatalogsItemsPostFilters';
import { CatalogsItemsRequest } from '../models/CatalogsItemsRequest';
import { CatalogsItemsUpdateBatchRequest } from '../models/CatalogsItemsUpdateBatchRequest';
import { CatalogsItemsUpsertBatchRequest } from '../models/CatalogsItemsUpsertBatchRequest';
import { CatalogsList200Response } from '../models/CatalogsList200Response';
import { CatalogsListProductsByFeedBasedFilter } from '../models/CatalogsListProductsByFeedBasedFilter';
import { CatalogsListProductsByFilterRequest } from '../models/CatalogsListProductsByFilterRequest';
import { CatalogsLocale } from '../models/CatalogsLocale';
import { CatalogsProduct } from '../models/CatalogsProduct';
import { CatalogsProductGroupCreateRequest } from '../models/CatalogsProductGroupCreateRequest';
import { CatalogsProductGroupCurrencyCriteria } from '../models/CatalogsProductGroupCurrencyCriteria';
import { CatalogsProductGroupFilterKeys } from '../models/CatalogsProductGroupFilterKeys';
import { CatalogsProductGroupFilterOperatorTypeCriteria } from '../models/CatalogsProductGroupFilterOperatorTypeCriteria';
import { CatalogsProductGroupFilters } from '../models/CatalogsProductGroupFilters';
import { CatalogsProductGroupFiltersAllOf } from '../models/CatalogsProductGroupFiltersAllOf';
import { CatalogsProductGroupFiltersAnyOf } from '../models/CatalogsProductGroupFiltersAnyOf';
import { CatalogsProductGroupFiltersRequest } from '../models/CatalogsProductGroupFiltersRequest';
import { CatalogsProductGroupMultipleCountriesCriteria } from '../models/CatalogsProductGroupMultipleCountriesCriteria';
import { CatalogsProductGroupMultipleGenderCriteria } from '../models/CatalogsProductGroupMultipleGenderCriteria';
import { CatalogsProductGroupMultipleMediaTypesCriteria } from '../models/CatalogsProductGroupMultipleMediaTypesCriteria';
import { CatalogsProductGroupMultipleStringCriteria } from '../models/CatalogsProductGroupMultipleStringCriteria';
import { CatalogsProductGroupMultipleStringListCriteria } from '../models/CatalogsProductGroupMultipleStringListCriteria';
import { CatalogsProductGroupPinsList200Response } from '../models/CatalogsProductGroupPinsList200Response';
import { CatalogsProductGroupPricingCriteria } from '../models/CatalogsProductGroupPricingCriteria';
import { CatalogsProductGroupPricingCurrencyCriteria } from '../models/CatalogsProductGroupPricingCurrencyCriteria';
import { CatalogsProductGroupProductCountsVertical } from '../models/CatalogsProductGroupProductCountsVertical';
import { CatalogsProductGroupStatus } from '../models/CatalogsProductGroupStatus';
import { CatalogsProductGroupType } from '../models/CatalogsProductGroupType';
import { CatalogsProductGroupUint32Criteria } from '../models/CatalogsProductGroupUint32Criteria';
import { CatalogsProductGroupUpdateRequest } from '../models/CatalogsProductGroupUpdateRequest';
import { CatalogsProductGroupsList200Response } from '../models/CatalogsProductGroupsList200Response';
import { CatalogsProductGroupsUpdateRequest } from '../models/CatalogsProductGroupsUpdateRequest';
import { CatalogsReport } from '../models/CatalogsReport';
import { CatalogsReportAllItemsFilter } from '../models/CatalogsReportAllItemsFilter';
import { CatalogsReportDistributionIssueFilter } from '../models/CatalogsReportDistributionIssueFilter';
import { CatalogsReportDistributionStats } from '../models/CatalogsReportDistributionStats';
import { CatalogsReportFeedIngestionFilter } from '../models/CatalogsReportFeedIngestionFilter';
import { CatalogsReportFeedIngestionStats } from '../models/CatalogsReportFeedIngestionStats';
import { CatalogsReportParameters } from '../models/CatalogsReportParameters';
import { CatalogsReportStats } from '../models/CatalogsReportStats';
import { CatalogsRetailAvailableFilterValues } from '../models/CatalogsRetailAvailableFilterValues';
import { CatalogsRetailBatchRequest } from '../models/CatalogsRetailBatchRequest';
import { CatalogsRetailBatchRequestItemsInner } from '../models/CatalogsRetailBatchRequestItemsInner';
import { CatalogsRetailFeed } from '../models/CatalogsRetailFeed';
import { CatalogsRetailFeedsCreateRequest } from '../models/CatalogsRetailFeedsCreateRequest';
import { CatalogsRetailFeedsUpdateRequest } from '../models/CatalogsRetailFeedsUpdateRequest';
import { CatalogsRetailFilterValuesMap } from '../models/CatalogsRetailFilterValuesMap';
import { CatalogsRetailItemErrorResponse } from '../models/CatalogsRetailItemErrorResponse';
import { CatalogsRetailItemResponse } from '../models/CatalogsRetailItemResponse';
import { CatalogsRetailItemsBatch } from '../models/CatalogsRetailItemsBatch';
import { CatalogsRetailItemsFilter } from '../models/CatalogsRetailItemsFilter';
import { CatalogsRetailItemsPostFilter } from '../models/CatalogsRetailItemsPostFilter';
import { CatalogsRetailListProductsByCatalogBasedFilterRequest } from '../models/CatalogsRetailListProductsByCatalogBasedFilterRequest';
import { CatalogsRetailProduct } from '../models/CatalogsRetailProduct';
import { CatalogsRetailProductGroup } from '../models/CatalogsRetailProductGroup';
import { CatalogsRetailProductGroupCreateRequest } from '../models/CatalogsRetailProductGroupCreateRequest';
import { CatalogsRetailProductGroupProductCounts } from '../models/CatalogsRetailProductGroupProductCounts';
import { CatalogsRetailProductGroupUpdateRequest } from '../models/CatalogsRetailProductGroupUpdateRequest';
import { CatalogsRetailProductMetadata } from '../models/CatalogsRetailProductMetadata';
import { CatalogsRetailReportParameters } from '../models/CatalogsRetailReportParameters';
import { CatalogsRetailReportStatsParameters } from '../models/CatalogsRetailReportStatsParameters';
import { CatalogsStatus } from '../models/CatalogsStatus';
import { CatalogsType } from '../models/CatalogsType';
import { CatalogsUpdatableCreativeAssetsAttributes } from '../models/CatalogsUpdatableCreativeAssetsAttributes';
import { CatalogsUpdatableHotelAttributes } from '../models/CatalogsUpdatableHotelAttributes';
import { CatalogsUpdateCreativeAssetsItem } from '../models/CatalogsUpdateCreativeAssetsItem';
import { CatalogsUpdateHotelItem } from '../models/CatalogsUpdateHotelItem';
import { CatalogsUpdateRetailItem } from '../models/CatalogsUpdateRetailItem';
import { CatalogsUpsertCreativeAssetsItem } from '../models/CatalogsUpsertCreativeAssetsItem';
import { CatalogsUpsertHotelItem } from '../models/CatalogsUpsertHotelItem';
import { CatalogsUpsertRetailItem } from '../models/CatalogsUpsertRetailItem';
import { CatalogsVerticalBatchRequest } from '../models/CatalogsVerticalBatchRequest';
import { CatalogsVerticalFeedsCreateRequest } from '../models/CatalogsVerticalFeedsCreateRequest';
import { CatalogsVerticalFeedsUpdateRequest } from '../models/CatalogsVerticalFeedsUpdateRequest';
import { CatalogsVerticalProductGroup } from '../models/CatalogsVerticalProductGroup';
import { CatalogsVerticalProductGroupCreateRequest } from '../models/CatalogsVerticalProductGroupCreateRequest';
import { CatalogsVerticalProductGroupUpdateRequest } from '../models/CatalogsVerticalProductGroupUpdateRequest';
import { CatalogsVerticalsListProductsByCatalogBasedFilterRequest } from '../models/CatalogsVerticalsListProductsByCatalogBasedFilterRequest';
import { ConditionFilter } from '../models/ConditionFilter';
import { ContentType } from '../models/ContentType';
import { ConversionAccessTokenResponse } from '../models/ConversionAccessTokenResponse';
import { ConversionApiResponse } from '../models/ConversionApiResponse';
import { ConversionApiResponseEventsInner } from '../models/ConversionApiResponseEventsInner';
import { ConversionAttributionWindowDays } from '../models/ConversionAttributionWindowDays';
import { ConversionEventAppInfo } from '../models/ConversionEventAppInfo';
import { ConversionEventDeviceInfo } from '../models/ConversionEventDeviceInfo';
import { ConversionEventResponse } from '../models/ConversionEventResponse';
import { ConversionEvents } from '../models/ConversionEvents';
import { ConversionEventsDataInner } from '../models/ConversionEventsDataInner';
import { ConversionEventsDataInnerCustomData } from '../models/ConversionEventsDataInnerCustomData';
import { ConversionEventsDataInnerCustomDataContentsInner } from '../models/ConversionEventsDataInnerCustomDataContentsInner';
import { ConversionEventsUserData } from '../models/ConversionEventsUserData';
import { ConversionEventsUserDataProperties } from '../models/ConversionEventsUserDataProperties';
import { ConversionHealthSelectionItem } from '../models/ConversionHealthSelectionItem';
import { ConversionMSOTEvents } from '../models/ConversionMSOTEvents';
import { ConversionProductReportRequest } from '../models/ConversionProductReportRequest';
import { ConversionProductReportingColumn } from '../models/ConversionProductReportingColumn';
import { ConversionReportAttributionType } from '../models/ConversionReportAttributionType';
import { ConversionReportTimeType } from '../models/ConversionReportTimeType';
import { ConversionTag } from '../models/ConversionTag';
import { ConversionTagCommon } from '../models/ConversionTagCommon';
import { ConversionTagConfigs } from '../models/ConversionTagConfigs';
import { ConversionTagCreate } from '../models/ConversionTagCreate';
import { ConversionTagListResponse } from '../models/ConversionTagListResponse';
import { ConversionTagResponse } from '../models/ConversionTagResponse';
import { ConversionTagType } from '../models/ConversionTagType';
import { ConversionTagsList200Response } from '../models/ConversionTagsList200Response';
import { Country } from '../models/Country';
import { CountryFilter } from '../models/CountryFilter';
import { CreateAssetAccessRequestBody } from '../models/CreateAssetAccessRequestBody';
import { CreateAssetAccessRequestBodyAssetRequestsInner } from '../models/CreateAssetAccessRequestBodyAssetRequestsInner';
import { CreateAssetAccessRequestErrorMessageInner } from '../models/CreateAssetAccessRequestErrorMessageInner';
import { CreateAssetAccessRequestResponse } from '../models/CreateAssetAccessRequestResponse';
import { CreateAssetGroupBody } from '../models/CreateAssetGroupBody';
import { CreateAssetGroupResponse } from '../models/CreateAssetGroupResponse';
import { CreateAssetInvitesRequest } from '../models/CreateAssetInvitesRequest';
import { CreateAssetInvitesRequestItem } from '../models/CreateAssetInvitesRequestItem';
import { CreateInvitesResultsResponseArray } from '../models/CreateInvitesResultsResponseArray';
import { CreateInvitesResultsResponseArrayItemsInner } from '../models/CreateInvitesResultsResponseArrayItemsInner';
import { CreateInvitesResultsResponseArrayItemsInnerInvite } from '../models/CreateInvitesResultsResponseArrayItemsInnerInvite';
import { CreateMMMReportRequest } from '../models/CreateMMMReportRequest';
import { CreateMMMReportResponse } from '../models/CreateMMMReportResponse';
import { CreateMMMReportResponseData } from '../models/CreateMMMReportResponseData';
import { CreateMembershipOrPartnershipInvitesBody } from '../models/CreateMembershipOrPartnershipInvitesBody';
import { CreativeAssetsIdFilter } from '../models/CreativeAssetsIdFilter';
import { CreativeAssetsProcessingRecord } from '../models/CreativeAssetsProcessingRecord';
import { CreativeAssetsVisibilityType } from '../models/CreativeAssetsVisibilityType';
import { CreativeType } from '../models/CreativeType';
import { Currency } from '../models/Currency';
import { CurrencyFilter } from '../models/CurrencyFilter';
import { CustomLabel0Filter } from '../models/CustomLabel0Filter';
import { CustomLabel1Filter } from '../models/CustomLabel1Filter';
import { CustomLabel2Filter } from '../models/CustomLabel2Filter';
import { CustomLabel3Filter } from '../models/CustomLabel3Filter';
import { CustomLabel4Filter } from '../models/CustomLabel4Filter';
import { CustomNumber0Filter } from '../models/CustomNumber0Filter';
import { CustomNumber1Filter } from '../models/CustomNumber1Filter';
import { CustomNumber2Filter } from '../models/CustomNumber2Filter';
import { CustomNumber3Filter } from '../models/CustomNumber3Filter';
import { CustomNumber4Filter } from '../models/CustomNumber4Filter';
import { CustomerList } from '../models/CustomerList';
import { CustomerListRequest } from '../models/CustomerListRequest';
import { CustomerListUpdateRequest } from '../models/CustomerListUpdateRequest';
import { CustomerListUpload } from '../models/CustomerListUpload';
import { CustomerListUploadCreateRequest } from '../models/CustomerListUploadCreateRequest';
import { CustomerListUploadCreateResponse } from '../models/CustomerListUploadCreateResponse';
import { CustomerListUploadResponse } from '../models/CustomerListUploadResponse';
import { CustomerListsList200Response } from '../models/CustomerListsList200Response';
import { CustomizableCTAType } from '../models/CustomizableCTAType';
import { DataOutputFormat } from '../models/DataOutputFormat';
import { DataStatus } from '../models/DataStatus';
import { DeleteAssetGroupBody } from '../models/DeleteAssetGroupBody';
import { DeleteAssetGroupResponse } from '../models/DeleteAssetGroupResponse';
import { DeleteAssetGroupResponseExceptionsInner } from '../models/DeleteAssetGroupResponseExceptionsInner';
import { DeleteInvitesResultsResponseArray } from '../models/DeleteInvitesResultsResponseArray';
import { DeleteInvitesResultsResponseArrayItemsInner } from '../models/DeleteInvitesResultsResponseArrayItemsInner';
import { DeleteInvitesResultsResponseArrayItemsInnerException } from '../models/DeleteInvitesResultsResponseArrayItemsInnerException';
import { DeleteMemberAccessResult } from '../models/DeleteMemberAccessResult';
import { DeleteMemberAccessResultsResponseArray } from '../models/DeleteMemberAccessResultsResponseArray';
import { DeletePartnerAssetAccessBody } from '../models/DeletePartnerAssetAccessBody';
import { DeletePartnerAssetAccessBodyAccessesInner } from '../models/DeletePartnerAssetAccessBodyAccessesInner';
import { DeletePartnerAssetsResult } from '../models/DeletePartnerAssetsResult';
import { DeletePartnerAssetsResultsResponseArray } from '../models/DeletePartnerAssetsResultsResponseArray';
import { DeletePartnersRequest } from '../models/DeletePartnersRequest';
import { DeletePartnersResponse } from '../models/DeletePartnersResponse';
import { DeletedMembersResponse } from '../models/DeletedMembersResponse';
import { DeliveryMetricsResponse } from '../models/DeliveryMetricsResponse';
import { DeliveryMetricsResponseItemsInner } from '../models/DeliveryMetricsResponseItemsInner';
import { DetailedError } from '../models/DetailedError';
import { DisclosureType } from '../models/DisclosureType';
import { EnhancedMatchStatusType } from '../models/EnhancedMatchStatusType';
import { EntityStatus } from '../models/EntityStatus';
import { ErrorDetail } from '../models/ErrorDetail';
import { EventData } from '../models/EventData';
import { EventQualityScore } from '../models/EventQualityScore';
import { Exception } from '../models/Exception';
import { FeaturedTrend } from '../models/FeaturedTrend';
import { FeedProcessingResultsList200Response } from '../models/FeedProcessingResultsList200Response';
import { FeedsCreateRequest } from '../models/FeedsCreateRequest';
import { FeedsList200Response } from '../models/FeedsList200Response';
import { FeedsUpdateRequest } from '../models/FeedsUpdateRequest';
import { FollowUserRequest } from '../models/FollowUserRequest';
import { FollowersList200Response } from '../models/FollowersList200Response';
import { Gender } from '../models/Gender';
import { GenderBucket } from '../models/GenderBucket';
import { GenderDemographics } from '../models/GenderDemographics';
import { GenderFilter } from '../models/GenderFilter';
import { GetAudiencesOrderBy } from '../models/GetAudiencesOrderBy';
import { GetBusinessAssetTypeResponse } from '../models/GetBusinessAssetTypeResponse';
import { GetBusinessAssetsResponse } from '../models/GetBusinessAssetsResponse';
import { GetBusinessAssetsResponseCatalogInfo } from '../models/GetBusinessAssetsResponseCatalogInfo';
import { GetBusinessEmployers200Response } from '../models/GetBusinessEmployers200Response';
import { GetBusinessMembers200Response } from '../models/GetBusinessMembers200Response';
import { GetBusinessPartners200Response } from '../models/GetBusinessPartners200Response';
import { GetInvites200Response } from '../models/GetInvites200Response';
import { GetMMMReportResponse } from '../models/GetMMMReportResponse';
import { GetMMMReportResponseData } from '../models/GetMMMReportResponseData';
import { GetPartnerAssetsResponse } from '../models/GetPartnerAssetsResponse';
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
import { ImageBase64 } from '../models/ImageBase64';
import { ImageDetails } from '../models/ImageDetails';
import { ImageMetadata } from '../models/ImageMetadata';
import { ImageSize } from '../models/ImageSize';
import { IngestionSourceOptions } from '../models/IngestionSourceOptions';
import { InnerProductCategoriesMetricsHighlights } from '../models/InnerProductCategoriesMetricsHighlights';
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
import { IntegrationsLogsPost400Response } from '../models/IntegrationsLogsPost400Response';
import { Interest } from '../models/Interest';
import { InterestsEnum } from '../models/InterestsEnum';
import { InviteAssetsSummary } from '../models/InviteAssetsSummary';
import { InviteAssetsSummaryAdAccountsInner } from '../models/InviteAssetsSummaryAdAccountsInner';
import { InviteAssetsSummaryProfilesInner } from '../models/InviteAssetsSummaryProfilesInner';
import { InviteBusinessRoleBinding } from '../models/InviteBusinessRoleBinding';
import { InviteExceptionResponse } from '../models/InviteExceptionResponse';
import { InviteResponse } from '../models/InviteResponse';
import { InviteStatus } from '../models/InviteStatus';
import { InviteType } from '../models/InviteType';
import { ItemAttributes } from '../models/ItemAttributes';
import { ItemAttributesRequest } from '../models/ItemAttributesRequest';
import { ItemAttributesRequestAllOfImageLink } from '../models/ItemAttributesRequestAllOfImageLink';
import { ItemBatchRecord } from '../models/ItemBatchRecord';
import { ItemCreateBatchRecord } from '../models/ItemCreateBatchRecord';
import { ItemDeleteBatchRecord } from '../models/ItemDeleteBatchRecord';
import { ItemDeleteDiscontinuedBatchRecord } from '../models/ItemDeleteDiscontinuedBatchRecord';
import { ItemGroupIdFilter } from '../models/ItemGroupIdFilter';
import { ItemIdFilter } from '../models/ItemIdFilter';
import { ItemProcessingRecord } from '../models/ItemProcessingRecord';
import { ItemProcessingStatus } from '../models/ItemProcessingStatus';
import { ItemResponse } from '../models/ItemResponse';
import { ItemResponseOneOf } from '../models/ItemResponseOneOf';
import { ItemResponseOneOf1 } from '../models/ItemResponseOneOf1';
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
import { Label } from '../models/Label';
import { LabelBulkUpdateRequest } from '../models/LabelBulkUpdateRequest';
import { LabelCreateRequest } from '../models/LabelCreateRequest';
import { LabelCreateRequestLabelsInner } from '../models/LabelCreateRequestLabelsInner';
import { LabelError } from '../models/LabelError';
import { LabelParentType } from '../models/LabelParentType';
import { LabelStatus } from '../models/LabelStatus';
import { LabelType } from '../models/LabelType';
import { LabelUpdateRequest } from '../models/LabelUpdateRequest';
import { LabelUpdateRequestLabelsInner } from '../models/LabelUpdateRequestLabelsInner';
import { LabelsList200Response } from '../models/LabelsList200Response';
import { LabelsResponse } from '../models/LabelsResponse';
import { Language } from '../models/Language';
import { LeadFormArrayResponse } from '../models/LeadFormArrayResponse';
import { LeadFormArrayResponseItemsInner } from '../models/LeadFormArrayResponseItemsInner';
import { LeadFormCommon } from '../models/LeadFormCommon';
import { LeadFormCommonPolicyLinksInner } from '../models/LeadFormCommonPolicyLinksInner';
import { LeadFormCreateRequest } from '../models/LeadFormCreateRequest';
import { LeadFormQuestion } from '../models/LeadFormQuestion';
import { LeadFormQuestionFieldType } from '../models/LeadFormQuestionFieldType';
import { LeadFormQuestionType } from '../models/LeadFormQuestionType';
import { LeadFormResponse } from '../models/LeadFormResponse';
import { LeadFormStatus } from '../models/LeadFormStatus';
import { LeadFormTestRequest } from '../models/LeadFormTestRequest';
import { LeadFormTestResponse } from '../models/LeadFormTestResponse';
import { LeadFormUpdateRequest } from '../models/LeadFormUpdateRequest';
import { LeadFormsList200Response } from '../models/LeadFormsList200Response';
import { LeadSubscription } from '../models/LeadSubscription';
import { LeadSubscriptionPostParamsCreate } from '../models/LeadSubscriptionPostParamsCreate';
import { LeadSubscriptionPostParamsCreateAllOfPartnerMetadata } from '../models/LeadSubscriptionPostParamsCreateAllOfPartnerMetadata';
import { LeadsExportCreateRequest } from '../models/LeadsExportCreateRequest';
import { LeadsExportCreateResponse } from '../models/LeadsExportCreateResponse';
import { LeadsExportResponseData } from '../models/LeadsExportResponseData';
import { LeadsExportStatus } from '../models/LeadsExportStatus';
import { LineItem } from '../models/LineItem';
import { LinkedBusiness } from '../models/LinkedBusiness';
import { LocalStoreUpdate } from '../models/LocalStoreUpdate';
import { LookbackPeriodOptions } from '../models/LookbackPeriodOptions';
import { MMMReportingColumn } from '../models/MMMReportingColumn';
import { MMMReportingTargetingType } from '../models/MMMReportingTargetingType';
import { MatchType } from '../models/MatchType';
import { MatchTypeResponse } from '../models/MatchTypeResponse';
import { MaxPriceFilter } from '../models/MaxPriceFilter';
import { Media } from '../models/Media';
import { MediaList200Response } from '../models/MediaList200Response';
import { MediaType } from '../models/MediaType';
import { MediaTypeFilter } from '../models/MediaTypeFilter';
import { MediaUpload } from '../models/MediaUpload';
import { MediaUploadCreate } from '../models/MediaUploadCreate';
import { MediaUploadParameters } from '../models/MediaUploadParameters';
import { MediaUploadStatus } from '../models/MediaUploadStatus';
import { MediaUploadType } from '../models/MediaUploadType';
import { MemberBusinessRole } from '../models/MemberBusinessRole';
import { MembersToDeleteBody } from '../models/MembersToDeleteBody';
import { MembersToDeleteBodyMembersInner } from '../models/MembersToDeleteBodyMembersInner';
import { MetricsReportingLevel } from '../models/MetricsReportingLevel';
import { MetricsResponse } from '../models/MetricsResponse';
import { MinPriceFilter } from '../models/MinPriceFilter';
import { ModelError } from '../models/ModelError';
import { MultipleProductGroupsInner } from '../models/MultipleProductGroupsInner';
import { NonDraftEntityStatus } from '../models/NonDraftEntityStatus';
import { NonNullableCatalogsCurrency } from '../models/NonNullableCatalogsCurrency';
import { NonNullableProductAvailabilityType } from '../models/NonNullableProductAvailabilityType';
import { NotificationPostRequest } from '../models/NotificationPostRequest';
import { NotificationResponse } from '../models/NotificationResponse';
import { NullableCatalogsItemFieldType } from '../models/NullableCatalogsItemFieldType';
import { NullableCurrency } from '../models/NullableCurrency';
import { OauthAccessTokenRequestClientCredentials } from '../models/OauthAccessTokenRequestClientCredentials';
import { OauthAccessTokenRequestCode } from '../models/OauthAccessTokenRequestCode';
import { OauthAccessTokenRequestRefresh } from '../models/OauthAccessTokenRequestRefresh';
import { OauthAccessTokenResponse } from '../models/OauthAccessTokenResponse';
import { OauthAccessTokenResponseClientCredentials } from '../models/OauthAccessTokenResponseClientCredentials';
import { OauthAccessTokenResponseCode } from '../models/OauthAccessTokenResponseCode';
import { OauthAccessTokenResponseIntegrationRefresh } from '../models/OauthAccessTokenResponseIntegrationRefresh';
import { OauthAccessTokenResponseRefresh } from '../models/OauthAccessTokenResponseRefresh';
import { ObjectiveType } from '../models/ObjectiveType';
import { OperationType } from '../models/OperationType';
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
import { OverallStatusOptions } from '../models/OverallStatusOptions';
import { PacingDeliveryType } from '../models/PacingDeliveryType';
import { PageVisitConversionTagsGet200Response } from '../models/PageVisitConversionTagsGet200Response';
import { Paginated } from '../models/Paginated';
import { PartnerType } from '../models/PartnerType';
import { Permissions } from '../models/Permissions';
import { PermissionsWithOwner } from '../models/PermissionsWithOwner';
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
import { PinMediaSourceImagesBase64Item } from '../models/PinMediaSourceImagesBase64Item';
import { PinMediaSourceImagesURL } from '../models/PinMediaSourceImagesURL';
import { PinMediaSourceImagesURLItem } from '../models/PinMediaSourceImagesURLItem';
import { PinMediaSourcePinURL } from '../models/PinMediaSourcePinURL';
import { PinMediaSourceVideoID } from '../models/PinMediaSourceVideoID';
import { PinMediaWithImage } from '../models/PinMediaWithImage';
import { PinMediaWithImageAndVideo } from '../models/PinMediaWithImageAndVideo';
import { PinMediaWithImages } from '../models/PinMediaWithImages';
import { PinMediaWithVideo } from '../models/PinMediaWithVideo';
import { PinMediaWithVideos } from '../models/PinMediaWithVideos';
import { PinPromotionSummaryStatus } from '../models/PinPromotionSummaryStatus';
import { PinUpdate } from '../models/PinUpdate';
import { PinsList200Response } from '../models/PinsList200Response';
import { PinsSaveRequest } from '../models/PinsSaveRequest';
import { PinterestLibError } from '../models/PinterestLibError';
import { PinterestLibPaginationOrder } from '../models/PinterestLibPaginationOrder';
import { PinterestLibStatus204 } from '../models/PinterestLibStatus204';
import { PlacementGroupType } from '../models/PlacementGroupType';
import { PlacementMultipliers } from '../models/PlacementMultipliers';
import { PredictedTimeSeries } from '../models/PredictedTimeSeries';
import { PriceFilter } from '../models/PriceFilter';
import { ProductAvailabilityType } from '../models/ProductAvailabilityType';
import { ProductCategoriesDemographic } from '../models/ProductCategoriesDemographic';
import { ProductCategoriesEngagementType } from '../models/ProductCategoriesEngagementType';
import { ProductCategoriesMetricsHighlights } from '../models/ProductCategoriesMetricsHighlights';
import { ProductCategoryDetailLookbackWindow } from '../models/ProductCategoryDetailLookbackWindow';
import { ProductCategoryDetails } from '../models/ProductCategoryDetails';
import { ProductCategoryEnum } from '../models/ProductCategoryEnum';
import { ProductCategoryRegion } from '../models/ProductCategoryRegion';
import { ProductGroupAnalyticsResponseInner } from '../models/ProductGroupAnalyticsResponseInner';
import { ProductGroupPromotion } from '../models/ProductGroupPromotion';
import { ProductGroupPromotionCreateRequest } from '../models/ProductGroupPromotionCreateRequest';
import { ProductGroupPromotionResponse } from '../models/ProductGroupPromotionResponse';
import { ProductGroupPromotionResponseItem } from '../models/ProductGroupPromotionResponseItem';
import { ProductGroupPromotionUpdateRequest } from '../models/ProductGroupPromotionUpdateRequest';
import { ProductGroupPromotionsList200Response } from '../models/ProductGroupPromotionsList200Response';
import { ProductGroupReferenceFilter } from '../models/ProductGroupReferenceFilter';
import { ProductGroupSummaryStatus } from '../models/ProductGroupSummaryStatus';
import { ProductType0Filter } from '../models/ProductType0Filter';
import { ProductType1Filter } from '../models/ProductType1Filter';
import { ProductType2Filter } from '../models/ProductType2Filter';
import { ProductType3Filter } from '../models/ProductType3Filter';
import { ProductType4Filter } from '../models/ProductType4Filter';
import { PromotionArrayElement } from '../models/PromotionArrayElement';
import { PromotionCommon } from '../models/PromotionCommon';
import { PromotionCreateRequest } from '../models/PromotionCreateRequest';
import { PromotionResponse } from '../models/PromotionResponse';
import { PromotionTemplateValue } from '../models/PromotionTemplateValue';
import { PromotionType } from '../models/PromotionType';
import { PromotionUpdateRequest } from '../models/PromotionUpdateRequest';
import { PromotionsList200Response } from '../models/PromotionsList200Response';
import { PromotionsResponse } from '../models/PromotionsResponse';
import { QualityComponentDetails } from '../models/QualityComponentDetails';
import { QualityComponentIssue } from '../models/QualityComponentIssue';
import { QualityComponents } from '../models/QualityComponents';
import { QuizPinData } from '../models/QuizPinData';
import { QuizPinOption } from '../models/QuizPinOption';
import { QuizPinQuestion } from '../models/QuizPinQuestion';
import { QuizPinResult } from '../models/QuizPinResult';
import { RecordCounts } from '../models/RecordCounts';
import { RelatedTerms } from '../models/RelatedTerms';
import { RelatedTermsRelatedTermsListInner } from '../models/RelatedTermsRelatedTermsListInner';
import { ReportingColumnAsync } from '../models/ReportingColumnAsync';
import { ReportingTimeZone } from '../models/ReportingTimeZone';
import { ReportsStats200Response } from '../models/ReportsStats200Response';
import { ReportsStatsParametersParameter } from '../models/ReportsStatsParametersParameter';
import { RespondToInvitesResponseArray } from '../models/RespondToInvitesResponseArray';
import { RespondToInvitesResponseArrayItemsInner } from '../models/RespondToInvitesResponseArrayItemsInner';
import { Role } from '../models/Role';
import { S3FilePart } from '../models/S3FilePart';
import { S3MultipartUploadData } from '../models/S3MultipartUploadData';
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
import { SearchUserPinsList200Response } from '../models/SearchUserPinsList200Response';
import { SharedAudience } from '../models/SharedAudience';
import { SharedAudienceAccount } from '../models/SharedAudienceAccount';
import { SharedAudienceCommon } from '../models/SharedAudienceCommon';
import { SharedAudienceResponse } from '../models/SharedAudienceResponse';
import { SharedAudienceResponseCommon } from '../models/SharedAudienceResponseCommon';
import { SingleInterestTargetingOptionResponse } from '../models/SingleInterestTargetingOptionResponse';
import { SourcePlatformOptions } from '../models/SourcePlatformOptions';
import { SsioInsertionOrdersStatusGetByAdAccount200Response } from '../models/SsioInsertionOrdersStatusGetByAdAccount200Response';
import { SsioOrderLinesGetByAdAccount200Response } from '../models/SsioOrderLinesGetByAdAccount200Response';
import { SummaryPin } from '../models/SummaryPin';
import { SystemUserUpdateRequest } from '../models/SystemUserUpdateRequest';
import { TargetingAdvertiserCountry } from '../models/TargetingAdvertiserCountry';
import { TargetingSpec } from '../models/TargetingSpec';
import { TargetingSpecAgeBucket } from '../models/TargetingSpecAgeBucket';
import { TargetingSpecAppType } from '../models/TargetingSpecAppType';
import { TargetingSpecGender } from '../models/TargetingSpecGender';
import { TargetingSpecOperationAgeBucket } from '../models/TargetingSpecOperationAgeBucket';
import { TargetingSpecOperationAppType } from '../models/TargetingSpecOperationAppType';
import { TargetingSpecOperationGender } from '../models/TargetingSpecOperationGender';
import { TargetingSpecOperationList } from '../models/TargetingSpecOperationList';
import { TargetingSpecOperationMinMaxAge } from '../models/TargetingSpecOperationMinMaxAge';
import { TargetingSpecOperationShoppingRetargeting } from '../models/TargetingSpecOperationShoppingRetargeting';
import { TargetingSpecOperationString } from '../models/TargetingSpecOperationString';
import { TargetingSpecShoppingRetargeting } from '../models/TargetingSpecShoppingRetargeting';
import { TargetingTemplateAudienceSizing } from '../models/TargetingTemplateAudienceSizing';
import { TargetingTemplateAudienceSizingReachEstimate } from '../models/TargetingTemplateAudienceSizingReachEstimate';
import { TargetingTemplateCommon } from '../models/TargetingTemplateCommon';
import { TargetingTemplateCreate } from '../models/TargetingTemplateCreate';
import { TargetingTemplateGetResponseData } from '../models/TargetingTemplateGetResponseData';
import { TargetingTemplateKeyword } from '../models/TargetingTemplateKeyword';
import { TargetingTemplateList200Response } from '../models/TargetingTemplateList200Response';
import { TargetingTemplateResponseData } from '../models/TargetingTemplateResponseData';
import { TargetingTemplateUpdateRequest } from '../models/TargetingTemplateUpdateRequest';
import { TargetingTypeFilter } from '../models/TargetingTypeFilter';
import { TemplateBasedReport } from '../models/TemplateBasedReport';
import { TemplateResponse } from '../models/TemplateResponse';
import { TemplateResponseDateRange } from '../models/TemplateResponseDateRange';
import { TemplateResponseDateRangeAbsoluteDateRange } from '../models/TemplateResponseDateRangeAbsoluteDateRange';
import { TemplateResponseDateRangeDynamicDateRange } from '../models/TemplateResponseDateRangeDynamicDateRange';
import { TemplateResponseDateRangeRelativeDateRange } from '../models/TemplateResponseDateRangeRelativeDateRange';
import { TemplatesList200Response } from '../models/TemplatesList200Response';
import { TermsOfService } from '../models/TermsOfService';
import { TimeSeries } from '../models/TimeSeries';
import { TitleKeywordsFilter } from '../models/TitleKeywordsFilter';
import { TopPinsAnalyticsResponse } from '../models/TopPinsAnalyticsResponse';
import { TopPinsAnalyticsResponseDateAvailability } from '../models/TopPinsAnalyticsResponseDateAvailability';
import { TopPinsAnalyticsResponsePinsInner } from '../models/TopPinsAnalyticsResponsePinsInner';
import { TopVideoPinsAnalyticsResponse } from '../models/TopVideoPinsAnalyticsResponse';
import { TopVideoPinsAnalyticsResponsePinsInner } from '../models/TopVideoPinsAnalyticsResponsePinsInner';
import { TrackingUrls } from '../models/TrackingUrls';
import { TrendType } from '../models/TrendType';
import { TrendingKeyword } from '../models/TrendingKeyword';
import { TrendingKeywordDemographics } from '../models/TrendingKeywordDemographics';
import { TrendingKeywordDemographicsAgeDistribution } from '../models/TrendingKeywordDemographicsAgeDistribution';
import { TrendingKeywordDemographicsGenderDistribution } from '../models/TrendingKeywordDemographicsGenderDistribution';
import { TrendingKeywordsResponse } from '../models/TrendingKeywordsResponse';
import { TrendingPin } from '../models/TrendingPin';
import { TrendingProductCategory } from '../models/TrendingProductCategory';
import { TrendingTopic } from '../models/TrendingTopic';
import { TrendsSupportedRegion } from '../models/TrendsSupportedRegion';
import { UpdatableItemAttributes } from '../models/UpdatableItemAttributes';
import { UpdatableItemAttributesGtin } from '../models/UpdatableItemAttributesGtin';
import { UpdateAssetGroupBody } from '../models/UpdateAssetGroupBody';
import { UpdateAssetGroupBodyAssetGroupsToUpdateInner } from '../models/UpdateAssetGroupBodyAssetGroupsToUpdateInner';
import { UpdateAssetGroupResponse } from '../models/UpdateAssetGroupResponse';
import { UpdateAssetGroupResponseExceptionsInner } from '../models/UpdateAssetGroupResponseExceptionsInner';
import { UpdateInvitesResultsResponseArray } from '../models/UpdateInvitesResultsResponseArray';
import { UpdateInvitesResultsResponseArrayItemsInner } from '../models/UpdateInvitesResultsResponseArrayItemsInner';
import { UpdateMaskBidOptionField } from '../models/UpdateMaskBidOptionField';
import { UpdateMaskFieldType } from '../models/UpdateMaskFieldType';
import { UpdateMemberAssetAccessBody } from '../models/UpdateMemberAssetAccessBody';
import { UpdateMemberAssetAccessBodyAccessesInner } from '../models/UpdateMemberAssetAccessBodyAccessesInner';
import { UpdateMemberAssetsResultsResponseArray } from '../models/UpdateMemberAssetsResultsResponseArray';
import { UpdateMemberAssetsResultsResponseArrayItemsInner } from '../models/UpdateMemberAssetsResultsResponseArrayItemsInner';
import { UpdateMemberBusinessRoleBody } from '../models/UpdateMemberBusinessRoleBody';
import { UpdateMemberResult } from '../models/UpdateMemberResult';
import { UpdateMemberResultsResponseArray } from '../models/UpdateMemberResultsResponseArray';
import { UpdatePartnerAssetAccessBody } from '../models/UpdatePartnerAssetAccessBody';
import { UpdatePartnerAssetAccessBodyAccessesInner } from '../models/UpdatePartnerAssetAccessBodyAccessesInner';
import { UpdatePartnerAssetsResult } from '../models/UpdatePartnerAssetsResult';
import { UpdatePartnerAssetsResultsResponseArray } from '../models/UpdatePartnerAssetsResultsResponseArray';
import { UpdatePartnerResultsResponseArray } from '../models/UpdatePartnerResultsResponseArray';
import { UpdatePartnerResultsResponseArrayItemsInner } from '../models/UpdatePartnerResultsResponseArrayItemsInner';
import { UserAccountFollowedInterests200Response } from '../models/UserAccountFollowedInterests200Response';
import { UserBusinessRoleBinding } from '../models/UserBusinessRoleBinding';
import { UserFollowingFeedType } from '../models/UserFollowingFeedType';
import { UserFollowingGet200Response } from '../models/UserFollowingGet200Response';
import { UserListOperationType } from '../models/UserListOperationType';
import { UserListType } from '../models/UserListType';
import { UserSingleAssetBinding } from '../models/UserSingleAssetBinding';
import { UserSummary } from '../models/UserSummary';
import { UserWebsiteSummary } from '../models/UserWebsiteSummary';
import { UserWebsiteVerificationCode } from '../models/UserWebsiteVerificationCode';
import { UserWebsiteVerifyRequest } from '../models/UserWebsiteVerifyRequest';
import { UserWebsitesGet200Response } from '../models/UserWebsitesGet200Response';
import { UsersForIndividualAssetResponse } from '../models/UsersForIndividualAssetResponse';
import { VerticalProductCategory } from '../models/VerticalProductCategory';
import { VideoMetadataWithItemType } from '../models/VideoMetadataWithItemType';

import { ObservableAdAccountsApi } from "./ObservableAPI";
import { AdAccountsApiRequestFactory, AdAccountsApiResponseProcessor} from "../apis/AdAccountsApi";

export interface AdAccountsApiAdAccountAnalyticsRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApiadAccountAnalytics
     */
    adAccountId: string
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApiadAccountAnalytics
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApiadAccountAnalytics
     */
    endDate: string
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * Defaults to: undefined
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;OUTBOUND_CTR_1&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;CAMPAIGN_BRAND_LABEL&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_NAME&#39; | &#39;AD_GROUP_BUDGET_TYPE&#39; | &#39;AD_GROUP_BUDGET_IN_LOCAL_CURRENCY&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;AD_GROUP_BID_MULTIPLIER&#39; | &#39;PROMO_ID&#39; | &#39;PROMO_NAME&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;AD_NAME&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;AD_GROUP_OPTIMIZATION&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;CAMPAIGN_BUDGET_OPTIMIZATION&#39; | &#39;IS_PREMIERE_CAMPAIGN&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_ADD_TO_WISHLIST&#39; | &#39;TOTAL_SUBSCRIBE&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;PRODUCT_GROUP_AD_IMAGE_TAG&#39; | &#39;PRODUCT_GROUP_AD_VIDEO_TAG&#39; | &#39;VIDEO_3SEC_VIEWS_1&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_1&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;PAID_VIDEO_VIEWABLE_RATE&#39; | &#39;VIDEO_LENGTH&#39; | &#39;VIDEO_SPEND_IN_DOLLAR&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_15SEC_UNIQUE_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;TOTAL_APP_INSTALL_CONVERSION_RATE&#39; | &#39;TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_PIN_RESULT_OPEN&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof AdAccountsApiadAccountAnalytics
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'OUTBOUND_CTR_1' | 'CAMPAIGN_NAME' | 'CAMPAIGN_BRAND_LABEL' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_NAME' | 'AD_GROUP_BUDGET_TYPE' | 'AD_GROUP_BUDGET_IN_LOCAL_CURRENCY' | 'AD_GROUP_ENTITY_STATUS' | 'AD_GROUP_BID_MULTIPLIER' | 'PROMO_ID' | 'PROMO_NAME' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'AD_NAME' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'AD_GROUP_OPTIMIZATION' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'CAMPAIGN_BUDGET_OPTIMIZATION' | 'IS_PREMIERE_CAMPAIGN' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_ADD_TO_WISHLIST' | 'TOTAL_SUBSCRIBE' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'PRODUCT_GROUP_AD_IMAGE_TAG' | 'PRODUCT_GROUP_AD_VIDEO_TAG' | 'VIDEO_3SEC_VIEWS_1' | 'VIDEO_15SEC_UNIQUE_VIEWS_1' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_15SEC_UNIQUE_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'PAID_VIDEO_VIEWABLE_RATE' | 'VIDEO_LENGTH' | 'VIDEO_SPEND_IN_DOLLAR' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_15SEC_UNIQUE_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'TOTAL_APP_INSTALL_CONVERSION_RATE' | 'TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_PIN_RESULT_OPEN' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * Defaults to: undefined
     * @type Granularity
     * @memberof AdAccountsApiadAccountAnalytics
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdAccountsApiadAccountAnalytics
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdAccountsApiadAccountAnalytics
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * Defaults to: 1
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdAccountsApiadAccountAnalytics
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * Defaults to: &#39;TIME_OF_AD_ACTION&#39;
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof AdAccountsApiadAccountAnalytics
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
    /**
     * Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
     * Defaults to: undefined
     * @type ReportingTimeZone
     * @memberof AdAccountsApiadAccountAnalytics
     */
    reportingTimezone?: ReportingTimeZone
}

export interface AdAccountsApiAdAccountTargetingAnalyticsGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    adAccountId: string
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    endDate: string
    /**
     * Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.
     * Defaults to: undefined
     * @type Array&lt;AdsAnalyticsTargetingType&gt;
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    targetingTypes: Array<AdsAnalyticsTargetingType>
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * Defaults to: undefined
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;OUTBOUND_CTR_1&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;CAMPAIGN_BRAND_LABEL&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_NAME&#39; | &#39;AD_GROUP_BUDGET_TYPE&#39; | &#39;AD_GROUP_BUDGET_IN_LOCAL_CURRENCY&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;AD_GROUP_BID_MULTIPLIER&#39; | &#39;PROMO_ID&#39; | &#39;PROMO_NAME&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;AD_NAME&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;AD_GROUP_OPTIMIZATION&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;CAMPAIGN_BUDGET_OPTIMIZATION&#39; | &#39;IS_PREMIERE_CAMPAIGN&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_ADD_TO_WISHLIST&#39; | &#39;TOTAL_SUBSCRIBE&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;PRODUCT_GROUP_AD_IMAGE_TAG&#39; | &#39;PRODUCT_GROUP_AD_VIDEO_TAG&#39; | &#39;VIDEO_3SEC_VIEWS_1&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_1&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;PAID_VIDEO_VIEWABLE_RATE&#39; | &#39;VIDEO_LENGTH&#39; | &#39;VIDEO_SPEND_IN_DOLLAR&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_15SEC_UNIQUE_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;TOTAL_APP_INSTALL_CONVERSION_RATE&#39; | &#39;TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_PIN_RESULT_OPEN&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'OUTBOUND_CTR_1' | 'CAMPAIGN_NAME' | 'CAMPAIGN_BRAND_LABEL' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_NAME' | 'AD_GROUP_BUDGET_TYPE' | 'AD_GROUP_BUDGET_IN_LOCAL_CURRENCY' | 'AD_GROUP_ENTITY_STATUS' | 'AD_GROUP_BID_MULTIPLIER' | 'PROMO_ID' | 'PROMO_NAME' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'AD_NAME' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'AD_GROUP_OPTIMIZATION' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'CAMPAIGN_BUDGET_OPTIMIZATION' | 'IS_PREMIERE_CAMPAIGN' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_ADD_TO_WISHLIST' | 'TOTAL_SUBSCRIBE' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'PRODUCT_GROUP_AD_IMAGE_TAG' | 'PRODUCT_GROUP_AD_VIDEO_TAG' | 'VIDEO_3SEC_VIEWS_1' | 'VIDEO_15SEC_UNIQUE_VIEWS_1' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_15SEC_UNIQUE_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'PAID_VIDEO_VIEWABLE_RATE' | 'VIDEO_LENGTH' | 'VIDEO_SPEND_IN_DOLLAR' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_15SEC_UNIQUE_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'TOTAL_APP_INSTALL_CONVERSION_RATE' | 'TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_PIN_RESULT_OPEN' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * Defaults to: undefined
     * @type Granularity
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * Defaults to: 1
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * Defaults to: &#39;TIME_OF_AD_ACTION&#39;
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
    /**
     * List of types of attribution for the conversion report
     * Defaults to: undefined
     * @type Array&lt;ConversionReportAttributionType&gt;
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    attributionTypes?: Array<ConversionReportAttributionType>
    /**
     * Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
     * Defaults to: undefined
     * @type ReportingTimeZone
     * @memberof AdAccountsApiadAccountTargetingAnalyticsGet
     */
    reportingTimezone?: ReportingTimeZone
}

export interface AdAccountsApiAdAccountsCreateRequest {
    /**
     * 
     * @type AdAccountCreate
     * @memberof AdAccountsApiadAccountsCreate
     */
    adAccountCreate: AdAccountCreate
}

export interface AdAccountsApiAdAccountsGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApiadAccountsGet
     */
    adAccountId: string
}

export interface AdAccountsApiAdAccountsListRequest {
    /**
     * Include shared ad accounts
     * Defaults to: true
     * @type boolean
     * @memberof AdAccountsApiadAccountsList
     */
    includeSharedAccounts?: boolean
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApiadAccountsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof AdAccountsApiadAccountsList
     */
    pageSize?: number
}

export interface AdAccountsApiAnalyticsCreateConversionProductReportRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApianalyticsCreateConversionProductReport
     */
    adAccountId: string
    /**
     * 
     * @type ConversionProductReportRequest
     * @memberof AdAccountsApianalyticsCreateConversionProductReport
     */
    conversionProductReportRequest: ConversionProductReportRequest
}

export interface AdAccountsApiAnalyticsCreateMmmReportRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Defaults to: undefined
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
     * 
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApianalyticsCreateTemplateReport
     */
    adAccountId: string
    /**
     * Unique identifier of a template.
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApianalyticsCreateTemplateReport
     */
    templateId: string
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApianalyticsCreateTemplateReport
     */
    startDate?: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApianalyticsCreateTemplateReport
     */
    endDate?: string
    /**
     *    TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEKLY - metrics are broken down weekly.    MONTHLY - metrics are broken down monthly
     * Defaults to: undefined
     * @type Granularity
     * @memberof AdAccountsApianalyticsCreateTemplateReport
     */
    granularity?: Granularity
}

export interface AdAccountsApiAnalyticsGetConversionProductReportRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApianalyticsGetConversionProductReport
     */
    adAccountId: string
    /**
     * Token returned from the post request creation call
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApianalyticsGetConversionProductReport
     */
    token: string
}

export interface AdAccountsApiAnalyticsGetMmmReportRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApianalyticsGetMmmReport
     */
    adAccountId: string
    /**
     * Token returned from the post request creation call
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApianalyticsGetMmmReport
     */
    token: string
}

export interface AdAccountsApiAnalyticsGetReportRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApianalyticsGetReport
     */
    adAccountId: string
    /**
     * Token returned from the post request creation call
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApianalyticsGetReport
     */
    token: string
}

export interface AdAccountsApiSandboxDeleteRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApisandboxDelete
     */
    adAccountId: string
}

export interface AdAccountsApiTemplatesListRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AdAccountsApitemplatesList
     */
    adAccountId: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof AdAccountsApitemplatesList
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * Defaults to: undefined
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof AdAccountsApitemplatesList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
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
     * Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.
     * Get ad account analytics
     * @param param the request object
     */
    public adAccountAnalyticsWithHttpInfo(param: AdAccountsApiAdAccountAnalyticsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<AdAccountAnalyticsResponseInner>>> {
        return this.api.adAccountAnalyticsWithHttpInfo(param.adAccountId, param.startDate, param.endDate, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.reportingTimezone,  options).toPromise();
    }

    /**
     * Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.
     * Get ad account analytics
     * @param param the request object
     */
    public adAccountAnalytics(param: AdAccountsApiAdAccountAnalyticsRequest, options?: ConfigurationOptions): Promise<Array<AdAccountAnalyticsResponseInner>> {
        return this.api.adAccountAnalytics(param.adAccountId, param.startDate, param.endDate, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.reportingTimezone,  options).toPromise();
    }

    /**
     * Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     * Get targeting analytics for an ad account
     * @param param the request object
     */
    public adAccountTargetingAnalyticsGetWithHttpInfo(param: AdAccountsApiAdAccountTargetingAnalyticsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<MetricsResponse>> {
        return this.api.adAccountTargetingAnalyticsGetWithHttpInfo(param.adAccountId, param.startDate, param.endDate, param.targetingTypes, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.attributionTypes, param.reportingTimezone,  options).toPromise();
    }

    /**
     * Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     * Get targeting analytics for an ad account
     * @param param the request object
     */
    public adAccountTargetingAnalyticsGet(param: AdAccountsApiAdAccountTargetingAnalyticsGetRequest, options?: ConfigurationOptions): Promise<MetricsResponse> {
        return this.api.adAccountTargetingAnalyticsGet(param.adAccountId, param.startDate, param.endDate, param.targetingTypes, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.attributionTypes, param.reportingTimezone,  options).toPromise();
    }

    /**
     * Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).
     * Create ad account
     * @param param the request object
     */
    public adAccountsCreateWithHttpInfo(param: AdAccountsApiAdAccountsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdAccount>> {
        return this.api.adAccountsCreateWithHttpInfo(param.adAccountCreate,  options).toPromise();
    }

    /**
     * Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).
     * Create ad account
     * @param param the request object
     */
    public adAccountsCreate(param: AdAccountsApiAdAccountsCreateRequest, options?: ConfigurationOptions): Promise<AdAccount> {
        return this.api.adAccountsCreate(param.adAccountCreate,  options).toPromise();
    }

    /**
     * Get an ad account
     * Get ad account
     * @param param the request object
     */
    public adAccountsGetWithHttpInfo(param: AdAccountsApiAdAccountsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdAccount>> {
        return this.api.adAccountsGetWithHttpInfo(param.adAccountId,  options).toPromise();
    }

    /**
     * Get an ad account
     * Get ad account
     * @param param the request object
     */
    public adAccountsGet(param: AdAccountsApiAdAccountsGetRequest, options?: ConfigurationOptions): Promise<AdAccount> {
        return this.api.adAccountsGet(param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of the ad_accounts that the \"operation user_account\" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).
     * List ad accounts
     * @param param the request object
     */
    public adAccountsListWithHttpInfo(param: AdAccountsApiAdAccountsListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<AdAccountsList200Response>> {
        return this.api.adAccountsListWithHttpInfo(param.includeSharedAccounts, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get a list of the ad_accounts that the \"operation user_account\" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).
     * List ad accounts
     * @param param the request object
     */
    public adAccountsList(param: AdAccountsApiAdAccountsListRequest = {}, options?: ConfigurationOptions): Promise<AdAccountsList200Response> {
        return this.api.adAccountsList(param.includeSharedAccounts, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.
     * Create a request for a brand, category, SKU report
     * @param param the request object
     */
    public analyticsCreateConversionProductReportWithHttpInfo(param: AdAccountsApiAnalyticsCreateConversionProductReportRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdsAnalyticsCreateAsyncResponse>> {
        return this.api.analyticsCreateConversionProductReportWithHttpInfo(param.adAccountId, param.conversionProductReportRequest,  options).toPromise();
    }

    /**
     * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.
     * Create a request for a brand, category, SKU report
     * @param param the request object
     */
    public analyticsCreateConversionProductReport(param: AdAccountsApiAnalyticsCreateConversionProductReportRequest, options?: ConfigurationOptions): Promise<AdsAnalyticsCreateAsyncResponse> {
        return this.api.analyticsCreateConversionProductReport(param.adAccountId, param.conversionProductReportRequest,  options).toPromise();
    }

    /**
     * This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it\'s in beta release.
     * Create a request for a Marketing Mix Modeling (MMM) report
     * @param param the request object
     */
    public analyticsCreateMmmReportWithHttpInfo(param: AdAccountsApiAnalyticsCreateMmmReportRequest, options?: ConfigurationOptions): Promise<HttpInfo<CreateMMMReportResponse>> {
        return this.api.analyticsCreateMmmReportWithHttpInfo(param.adAccountId, param.createMMMReportRequest,  options).toPromise();
    }

    /**
     * This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it\'s in beta release.
     * Create a request for a Marketing Mix Modeling (MMM) report
     * @param param the request object
     */
    public analyticsCreateMmmReport(param: AdAccountsApiAnalyticsCreateMmmReportRequest, options?: ConfigurationOptions): Promise<CreateMMMReportResponse> {
        return this.api.analyticsCreateMmmReport(param.adAccountId, param.createMMMReportRequest,  options).toPromise();
    }

    /**
     * This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
     * Create async request for an account analytics report
     * @param param the request object
     */
    public analyticsCreateReportWithHttpInfo(param: AdAccountsApiAnalyticsCreateReportRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdsAnalyticsCreateAsyncResponse>> {
        return this.api.analyticsCreateReportWithHttpInfo(param.adAccountId, param.adsAnalyticsCreateAsyncRequest,  options).toPromise();
    }

    /**
     * This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
     * Create async request for an account analytics report
     * @param param the request object
     */
    public analyticsCreateReport(param: AdAccountsApiAnalyticsCreateReportRequest, options?: ConfigurationOptions): Promise<AdsAnalyticsCreateAsyncResponse> {
        return this.api.analyticsCreateReport(param.adAccountId, param.adsAnalyticsCreateAsyncRequest,  options).toPromise();
    }

    /**
     *    This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.
     * Create async request for an analytics report using a template
     * @param param the request object
     */
    public analyticsCreateTemplateReportWithHttpInfo(param: AdAccountsApiAnalyticsCreateTemplateReportRequest, options?: ConfigurationOptions): Promise<HttpInfo<TemplateBasedReport>> {
        return this.api.analyticsCreateTemplateReportWithHttpInfo(param.adAccountId, param.templateId, param.startDate, param.endDate, param.granularity,  options).toPromise();
    }

    /**
     *    This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.
     * Create async request for an analytics report using a template
     * @param param the request object
     */
    public analyticsCreateTemplateReport(param: AdAccountsApiAnalyticsCreateTemplateReportRequest, options?: ConfigurationOptions): Promise<TemplateBasedReport> {
        return this.api.analyticsCreateTemplateReport(param.adAccountId, param.templateId, param.startDate, param.endDate, param.granularity,  options).toPromise();
    }

    /**
     * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.
     * Get advertiser brand, category, SKU report
     * @param param the request object
     */
    public analyticsGetConversionProductReportWithHttpInfo(param: AdAccountsApiAnalyticsGetConversionProductReportRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdsAnalyticsGetAsyncResponse>> {
        return this.api.analyticsGetConversionProductReportWithHttpInfo(param.adAccountId, param.token,  options).toPromise();
    }

    /**
     * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.
     * Get advertiser brand, category, SKU report
     * @param param the request object
     */
    public analyticsGetConversionProductReport(param: AdAccountsApiAnalyticsGetConversionProductReportRequest, options?: ConfigurationOptions): Promise<AdsAnalyticsGetAsyncResponse> {
        return this.api.analyticsGetConversionProductReport(param.adAccountId, param.token,  options).toPromise();
    }

    /**
     * Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
     * Get advertiser Marketing Mix Modeling (MMM) report.
     * @param param the request object
     */
    public analyticsGetMmmReportWithHttpInfo(param: AdAccountsApiAnalyticsGetMmmReportRequest, options?: ConfigurationOptions): Promise<HttpInfo<GetMMMReportResponse>> {
        return this.api.analyticsGetMmmReportWithHttpInfo(param.adAccountId, param.token,  options).toPromise();
    }

    /**
     * Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
     * Get advertiser Marketing Mix Modeling (MMM) report.
     * @param param the request object
     */
    public analyticsGetMmmReport(param: AdAccountsApiAnalyticsGetMmmReportRequest, options?: ConfigurationOptions): Promise<GetMMMReportResponse> {
        return this.api.analyticsGetMmmReport(param.adAccountId, param.token,  options).toPromise();
    }

    /**
     * This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
     * Get the account analytics report created by the async call
     * @param param the request object
     */
    public analyticsGetReportWithHttpInfo(param: AdAccountsApiAnalyticsGetReportRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdsAnalyticsGetAsyncResponse>> {
        return this.api.analyticsGetReportWithHttpInfo(param.adAccountId, param.token,  options).toPromise();
    }

    /**
     * This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
     * Get the account analytics report created by the async call
     * @param param the request object
     */
    public analyticsGetReport(param: AdAccountsApiAnalyticsGetReportRequest, options?: ConfigurationOptions): Promise<AdsAnalyticsGetAsyncResponse> {
        return this.api.analyticsGetReport(param.adAccountId, param.token,  options).toPromise();
    }

    /**
     * Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
     * Delete ads data for ad account in API Sandbox
     * @param param the request object
     */
    public sandboxDeleteWithHttpInfo(param: AdAccountsApiSandboxDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<string>> {
        return this.api.sandboxDeleteWithHttpInfo(param.adAccountId,  options).toPromise();
    }

    /**
     * Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
     * Delete ads data for ad account in API Sandbox
     * @param param the request object
     */
    public sandboxDelete(param: AdAccountsApiSandboxDeleteRequest, options?: ConfigurationOptions): Promise<string> {
        return this.api.sandboxDelete(param.adAccountId,  options).toPromise();
    }

    /**
     * Gets all Templates associated with an ad account ID.
     * List templates
     * @param param the request object
     */
    public templatesListWithHttpInfo(param: AdAccountsApiTemplatesListRequest, options?: ConfigurationOptions): Promise<HttpInfo<TemplatesList200Response>> {
        return this.api.templatesListWithHttpInfo(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * Gets all Templates associated with an ad account ID.
     * List templates
     * @param param the request object
     */
    public templatesList(param: AdAccountsApiTemplatesListRequest, options?: ConfigurationOptions): Promise<TemplatesList200Response> {
        return this.api.templatesList(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

}

import { ObservableAdGroupsApi } from "./ObservableAPI";
import { AdGroupsApiRequestFactory, AdGroupsApiResponseProcessor} from "../apis/AdGroupsApi";

export interface AdGroupsApiAdGroupsAnalyticsRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    adAccountId: string
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * Defaults to: undefined
     * @type string
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * Defaults to: undefined
     * @type string
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    endDate: string
    /**
     * List of Ad group Ids to use to filter the results.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    adGroupIds: Array<string>
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * Defaults to: undefined
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;OUTBOUND_CTR_1&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;CAMPAIGN_BRAND_LABEL&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_NAME&#39; | &#39;AD_GROUP_BUDGET_TYPE&#39; | &#39;AD_GROUP_BUDGET_IN_LOCAL_CURRENCY&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;AD_GROUP_BID_MULTIPLIER&#39; | &#39;PROMO_ID&#39; | &#39;PROMO_NAME&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;AD_NAME&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;AD_GROUP_OPTIMIZATION&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;CAMPAIGN_BUDGET_OPTIMIZATION&#39; | &#39;IS_PREMIERE_CAMPAIGN&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_ADD_TO_WISHLIST&#39; | &#39;TOTAL_SUBSCRIBE&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;PRODUCT_GROUP_AD_IMAGE_TAG&#39; | &#39;PRODUCT_GROUP_AD_VIDEO_TAG&#39; | &#39;VIDEO_3SEC_VIEWS_1&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_1&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;PAID_VIDEO_VIEWABLE_RATE&#39; | &#39;VIDEO_LENGTH&#39; | &#39;VIDEO_SPEND_IN_DOLLAR&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_15SEC_UNIQUE_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;TOTAL_APP_INSTALL_CONVERSION_RATE&#39; | &#39;TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_PIN_RESULT_OPEN&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'OUTBOUND_CTR_1' | 'CAMPAIGN_NAME' | 'CAMPAIGN_BRAND_LABEL' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_NAME' | 'AD_GROUP_BUDGET_TYPE' | 'AD_GROUP_BUDGET_IN_LOCAL_CURRENCY' | 'AD_GROUP_ENTITY_STATUS' | 'AD_GROUP_BID_MULTIPLIER' | 'PROMO_ID' | 'PROMO_NAME' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'AD_NAME' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'AD_GROUP_OPTIMIZATION' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'CAMPAIGN_BUDGET_OPTIMIZATION' | 'IS_PREMIERE_CAMPAIGN' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_ADD_TO_WISHLIST' | 'TOTAL_SUBSCRIBE' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'PRODUCT_GROUP_AD_IMAGE_TAG' | 'PRODUCT_GROUP_AD_VIDEO_TAG' | 'VIDEO_3SEC_VIEWS_1' | 'VIDEO_15SEC_UNIQUE_VIEWS_1' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_15SEC_UNIQUE_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'PAID_VIDEO_VIEWABLE_RATE' | 'VIDEO_LENGTH' | 'VIDEO_SPEND_IN_DOLLAR' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_15SEC_UNIQUE_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'TOTAL_APP_INSTALL_CONVERSION_RATE' | 'TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_PIN_RESULT_OPEN' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * Defaults to: undefined
     * @type Granularity
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * Defaults to: 1
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * Defaults to: &#39;TIME_OF_AD_ACTION&#39;
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
    /**
     * Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
     * Defaults to: false
     * @type boolean
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    aggregateReportRows?: boolean
    /**
     * Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
     * Defaults to: undefined
     * @type ReportingTimeZone
     * @memberof AdGroupsApiadGroupsAnalytics
     */
    reportingTimezone?: ReportingTimeZone
}

export interface AdGroupsApiAdGroupsAudienceSizingRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AdGroupsApiadGroupsAudienceSizing
     */
    adAccountId: string
    /**
     * 
     * @type AdGroupAudienceSizingRequest
     * @memberof AdGroupsApiadGroupsAudienceSizing
     */
    adGroupAudienceSizingRequest: AdGroupAudienceSizingRequest
}

export interface AdGroupsApiAdGroupsBidFloorGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Defaults to: undefined
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
     * Defaults to: undefined
     * @type string
     * @memberof AdGroupsApiadGroupsGet
     */
    adAccountId: string
    /**
     * Unique identifier of an ad group.
     * Defaults to: undefined
     * @type string
     * @memberof AdGroupsApiadGroupsGet
     */
    adGroupId: string
}

export interface AdGroupsApiAdGroupsListRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AdGroupsApiadGroupsList
     */
    adAccountId: string
    /**
     * List of Campaign Ids to use to filter the results.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AdGroupsApiadGroupsList
     */
    campaignIds?: Array<string>
    /**
     * List of Ad group Ids to use to filter the results.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AdGroupsApiadGroupsList
     */
    adGroupIds?: Array<string>
    /**
     * Entity status
     * Defaults to: undefined
     * @type Array&lt;&#39;ACTIVE&#39; | &#39;PAUSED&#39; | &#39;ARCHIVED&#39; | &#39;DRAFT&#39; | &#39;DELETED_DRAFT&#39;&gt;
     * @memberof AdGroupsApiadGroupsList
     */
    entityStatuses?: Array<'ACTIVE' | 'PAUSED' | 'ARCHIVED' | 'DRAFT' | 'DELETED_DRAFT'>
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof AdGroupsApiadGroupsList
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * Defaults to: undefined
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof AdGroupsApiadGroupsList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof AdGroupsApiadGroupsList
     */
    bookmark?: string
    /**
     * Return interests as text names (if value is true) rather than topic IDs.
     * Defaults to: false
     * @type boolean
     * @memberof AdGroupsApiadGroupsList
     */
    translateInterestsToNames?: boolean
}

export interface AdGroupsApiAdGroupsTargetingAnalyticsGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    adAccountId: string
    /**
     * List of Ad group Ids to use to filter the results.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    adGroupIds: Array<string>
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * Defaults to: undefined
     * @type string
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * Defaults to: undefined
     * @type string
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    endDate: string
    /**
     * Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users.
     * Defaults to: undefined
     * @type Array&lt;AdsAnalyticsAdGroupTargetingType&gt;
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    targetingTypes: Array<AdsAnalyticsAdGroupTargetingType>
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * Defaults to: undefined
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;OUTBOUND_CTR_1&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;CAMPAIGN_BRAND_LABEL&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_NAME&#39; | &#39;AD_GROUP_BUDGET_TYPE&#39; | &#39;AD_GROUP_BUDGET_IN_LOCAL_CURRENCY&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;AD_GROUP_BID_MULTIPLIER&#39; | &#39;PROMO_ID&#39; | &#39;PROMO_NAME&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;AD_NAME&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;AD_GROUP_OPTIMIZATION&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;CAMPAIGN_BUDGET_OPTIMIZATION&#39; | &#39;IS_PREMIERE_CAMPAIGN&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_ADD_TO_WISHLIST&#39; | &#39;TOTAL_SUBSCRIBE&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;PRODUCT_GROUP_AD_IMAGE_TAG&#39; | &#39;PRODUCT_GROUP_AD_VIDEO_TAG&#39; | &#39;VIDEO_3SEC_VIEWS_1&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_1&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;PAID_VIDEO_VIEWABLE_RATE&#39; | &#39;VIDEO_LENGTH&#39; | &#39;VIDEO_SPEND_IN_DOLLAR&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_15SEC_UNIQUE_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;TOTAL_APP_INSTALL_CONVERSION_RATE&#39; | &#39;TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_PIN_RESULT_OPEN&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'OUTBOUND_CTR_1' | 'CAMPAIGN_NAME' | 'CAMPAIGN_BRAND_LABEL' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_NAME' | 'AD_GROUP_BUDGET_TYPE' | 'AD_GROUP_BUDGET_IN_LOCAL_CURRENCY' | 'AD_GROUP_ENTITY_STATUS' | 'AD_GROUP_BID_MULTIPLIER' | 'PROMO_ID' | 'PROMO_NAME' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'AD_NAME' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'AD_GROUP_OPTIMIZATION' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'CAMPAIGN_BUDGET_OPTIMIZATION' | 'IS_PREMIERE_CAMPAIGN' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_ADD_TO_WISHLIST' | 'TOTAL_SUBSCRIBE' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'PRODUCT_GROUP_AD_IMAGE_TAG' | 'PRODUCT_GROUP_AD_VIDEO_TAG' | 'VIDEO_3SEC_VIEWS_1' | 'VIDEO_15SEC_UNIQUE_VIEWS_1' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_15SEC_UNIQUE_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'PAID_VIDEO_VIEWABLE_RATE' | 'VIDEO_LENGTH' | 'VIDEO_SPEND_IN_DOLLAR' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_15SEC_UNIQUE_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'TOTAL_APP_INSTALL_CONVERSION_RATE' | 'TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_PIN_RESULT_OPEN' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * Defaults to: undefined
     * @type Granularity
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * Defaults to: 1
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * Defaults to: &#39;TIME_OF_AD_ACTION&#39;
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
    /**
     * List of types of attribution for the conversion report
     * Defaults to: undefined
     * @type Array&lt;ConversionReportAttributionType&gt;
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    attributionTypes?: Array<ConversionReportAttributionType>
    /**
     * Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
     * Defaults to: undefined
     * @type ReportingTimeZone
     * @memberof AdGroupsApiadGroupsTargetingAnalyticsGet
     */
    reportingTimezone?: ReportingTimeZone
}

export interface AdGroupsApiAdGroupsUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     * Get ad group analytics
     * @param param the request object
     */
    public adGroupsAnalyticsWithHttpInfo(param: AdGroupsApiAdGroupsAnalyticsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<AdGroupsAnalyticsResponseInner>>> {
        return this.api.adGroupsAnalyticsWithHttpInfo(param.adAccountId, param.startDate, param.endDate, param.adGroupIds, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.aggregateReportRows, param.reportingTimezone,  options).toPromise();
    }

    /**
     * Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     * Get ad group analytics
     * @param param the request object
     */
    public adGroupsAnalytics(param: AdGroupsApiAdGroupsAnalyticsRequest, options?: ConfigurationOptions): Promise<Array<AdGroupsAnalyticsResponseInner>> {
        return this.api.adGroupsAnalytics(param.adAccountId, param.startDate, param.endDate, param.adGroupIds, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.aggregateReportRows, param.reportingTimezone,  options).toPromise();
    }

    /**
     * Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     * Get audience sizing
     * @param param the request object
     */
    public adGroupsAudienceSizingWithHttpInfo(param: AdGroupsApiAdGroupsAudienceSizingRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdGroupAudienceSizingResponse>> {
        return this.api.adGroupsAudienceSizingWithHttpInfo(param.adAccountId, param.adGroupAudienceSizingRequest,  options).toPromise();
    }

    /**
     * Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     * Get audience sizing
     * @param param the request object
     */
    public adGroupsAudienceSizing(param: AdGroupsApiAdGroupsAudienceSizingRequest, options?: ConfigurationOptions): Promise<AdGroupAudienceSizingResponse> {
        return this.api.adGroupsAudienceSizing(param.adAccountId, param.adGroupAudienceSizingRequest,  options).toPromise();
    }

    /**
     * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.
     * Get bid floors
     * @param param the request object
     */
    public adGroupsBidFloorGetWithHttpInfo(param: AdGroupsApiAdGroupsBidFloorGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<BidFloor>> {
        return this.api.adGroupsBidFloorGetWithHttpInfo(param.adAccountId, param.bidFloorRequest,  options).toPromise();
    }

    /**
     * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.
     * Get bid floors
     * @param param the request object
     */
    public adGroupsBidFloorGet(param: AdGroupsApiAdGroupsBidFloorGetRequest, options?: ConfigurationOptions): Promise<BidFloor> {
        return this.api.adGroupsBidFloorGet(param.adAccountId, param.bidFloorRequest,  options).toPromise();
    }

    /**
     * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>. <strong>Notes:</strong> - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser\'s profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">closed beta</a> access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule. 
     * Create ad groups
     * @param param the request object
     */
    public adGroupsCreateWithHttpInfo(param: AdGroupsApiAdGroupsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdGroupArrayResponse>> {
        return this.api.adGroupsCreateWithHttpInfo(param.adAccountId, param.adGroupCreateRequest,  options).toPromise();
    }

    /**
     * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>. <strong>Notes:</strong> - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser\'s profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">closed beta</a> access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule. 
     * Create ad groups
     * @param param the request object
     */
    public adGroupsCreate(param: AdGroupsApiAdGroupsCreateRequest, options?: ConfigurationOptions): Promise<AdGroupArrayResponse> {
        return this.api.adGroupsCreate(param.adAccountId, param.adGroupCreateRequest,  options).toPromise();
    }

    /**
     * Get a specific ad group given the ad group ID.
     * Get ad group
     * @param param the request object
     */
    public adGroupsGetWithHttpInfo(param: AdGroupsApiAdGroupsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdGroupResponse>> {
        return this.api.adGroupsGetWithHttpInfo(param.adAccountId, param.adGroupId,  options).toPromise();
    }

    /**
     * Get a specific ad group given the ad group ID.
     * Get ad group
     * @param param the request object
     */
    public adGroupsGet(param: AdGroupsApiAdGroupsGetRequest, options?: ConfigurationOptions): Promise<AdGroupResponse> {
        return this.api.adGroupsGet(param.adAccountId, param.adGroupId,  options).toPromise();
    }

    /**
     * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.
     * List ad groups
     * @param param the request object
     */
    public adGroupsListWithHttpInfo(param: AdGroupsApiAdGroupsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdGroupsList200Response>> {
        return this.api.adGroupsListWithHttpInfo(param.adAccountId, param.campaignIds, param.adGroupIds, param.entityStatuses, param.pageSize, param.order, param.bookmark, param.translateInterestsToNames,  options).toPromise();
    }

    /**
     * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.
     * List ad groups
     * @param param the request object
     */
    public adGroupsList(param: AdGroupsApiAdGroupsListRequest, options?: ConfigurationOptions): Promise<AdGroupsList200Response> {
        return this.api.adGroupsList(param.adAccountId, param.campaignIds, param.adGroupIds, param.entityStatuses, param.pageSize, param.order, param.bookmark, param.translateInterestsToNames,  options).toPromise();
    }

    /**
     * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     * Get targeting analytics for ad groups
     * @param param the request object
     */
    public adGroupsTargetingAnalyticsGetWithHttpInfo(param: AdGroupsApiAdGroupsTargetingAnalyticsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<MetricsResponse>> {
        return this.api.adGroupsTargetingAnalyticsGetWithHttpInfo(param.adAccountId, param.adGroupIds, param.startDate, param.endDate, param.targetingTypes, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.attributionTypes, param.reportingTimezone,  options).toPromise();
    }

    /**
     * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     * Get targeting analytics for ad groups
     * @param param the request object
     */
    public adGroupsTargetingAnalyticsGet(param: AdGroupsApiAdGroupsTargetingAnalyticsGetRequest, options?: ConfigurationOptions): Promise<MetricsResponse> {
        return this.api.adGroupsTargetingAnalyticsGet(param.adAccountId, param.adGroupIds, param.startDate, param.endDate, param.targetingTypes, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.attributionTypes, param.reportingTimezone,  options).toPromise();
    }

    /**
     * Update multiple existing ad groups.
     * Update ad groups
     * @param param the request object
     */
    public adGroupsUpdateWithHttpInfo(param: AdGroupsApiAdGroupsUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdGroupArrayResponse>> {
        return this.api.adGroupsUpdateWithHttpInfo(param.adAccountId, param.adGroupUpdateRequest,  options).toPromise();
    }

    /**
     * Update multiple existing ad groups.
     * Update ad groups
     * @param param the request object
     */
    public adGroupsUpdate(param: AdGroupsApiAdGroupsUpdateRequest, options?: ConfigurationOptions): Promise<AdGroupArrayResponse> {
        return this.api.adGroupsUpdate(param.adAccountId, param.adGroupUpdateRequest,  options).toPromise();
    }

}

import { ObservableAdsApi } from "./ObservableAPI";
import { AdsApiRequestFactory, AdsApiResponseProcessor} from "../apis/AdsApi";

export interface AdsApiAdPreviewsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Defaults to: undefined
     * @type string
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    adAccountId: string
    /**
     * List of Ad Ids to use to filter the results.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    adIds: Array<string>
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * Defaults to: undefined
     * @type string
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * Defaults to: undefined
     * @type string
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    endDate: string
    /**
     * Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.
     * Defaults to: undefined
     * @type Array&lt;AdsAnalyticsAdTargetingType&gt;
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    targetingTypes: Array<AdsAnalyticsAdTargetingType>
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * Defaults to: undefined
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;OUTBOUND_CTR_1&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;CAMPAIGN_BRAND_LABEL&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_NAME&#39; | &#39;AD_GROUP_BUDGET_TYPE&#39; | &#39;AD_GROUP_BUDGET_IN_LOCAL_CURRENCY&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;AD_GROUP_BID_MULTIPLIER&#39; | &#39;PROMO_ID&#39; | &#39;PROMO_NAME&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;AD_NAME&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;AD_GROUP_OPTIMIZATION&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;CAMPAIGN_BUDGET_OPTIMIZATION&#39; | &#39;IS_PREMIERE_CAMPAIGN&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_ADD_TO_WISHLIST&#39; | &#39;TOTAL_SUBSCRIBE&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;PRODUCT_GROUP_AD_IMAGE_TAG&#39; | &#39;PRODUCT_GROUP_AD_VIDEO_TAG&#39; | &#39;VIDEO_3SEC_VIEWS_1&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_1&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;PAID_VIDEO_VIEWABLE_RATE&#39; | &#39;VIDEO_LENGTH&#39; | &#39;VIDEO_SPEND_IN_DOLLAR&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_15SEC_UNIQUE_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;TOTAL_APP_INSTALL_CONVERSION_RATE&#39; | &#39;TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_PIN_RESULT_OPEN&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'OUTBOUND_CTR_1' | 'CAMPAIGN_NAME' | 'CAMPAIGN_BRAND_LABEL' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_NAME' | 'AD_GROUP_BUDGET_TYPE' | 'AD_GROUP_BUDGET_IN_LOCAL_CURRENCY' | 'AD_GROUP_ENTITY_STATUS' | 'AD_GROUP_BID_MULTIPLIER' | 'PROMO_ID' | 'PROMO_NAME' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'AD_NAME' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'AD_GROUP_OPTIMIZATION' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'CAMPAIGN_BUDGET_OPTIMIZATION' | 'IS_PREMIERE_CAMPAIGN' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_ADD_TO_WISHLIST' | 'TOTAL_SUBSCRIBE' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'PRODUCT_GROUP_AD_IMAGE_TAG' | 'PRODUCT_GROUP_AD_VIDEO_TAG' | 'VIDEO_3SEC_VIEWS_1' | 'VIDEO_15SEC_UNIQUE_VIEWS_1' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_15SEC_UNIQUE_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'PAID_VIDEO_VIEWABLE_RATE' | 'VIDEO_LENGTH' | 'VIDEO_SPEND_IN_DOLLAR' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_15SEC_UNIQUE_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'TOTAL_APP_INSTALL_CONVERSION_RATE' | 'TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_PIN_RESULT_OPEN' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * Defaults to: undefined
     * @type Granularity
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * Defaults to: 1
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * Defaults to: &#39;TIME_OF_AD_ACTION&#39;
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
    /**
     * List of types of attribution for the conversion report
     * Defaults to: undefined
     * @type Array&lt;ConversionReportAttributionType&gt;
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    attributionTypes?: Array<ConversionReportAttributionType>
    /**
     * Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
     * Defaults to: undefined
     * @type ReportingTimeZone
     * @memberof AdsApiadTargetingAnalyticsGet
     */
    reportingTimezone?: ReportingTimeZone
}

export interface AdsApiAdsAnalyticsRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AdsApiadsAnalytics
     */
    adAccountId: string
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * Defaults to: undefined
     * @type string
     * @memberof AdsApiadsAnalytics
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * Defaults to: undefined
     * @type string
     * @memberof AdsApiadsAnalytics
     */
    endDate: string
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * Defaults to: undefined
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;OUTBOUND_CTR_1&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;CAMPAIGN_BRAND_LABEL&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_NAME&#39; | &#39;AD_GROUP_BUDGET_TYPE&#39; | &#39;AD_GROUP_BUDGET_IN_LOCAL_CURRENCY&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;AD_GROUP_BID_MULTIPLIER&#39; | &#39;PROMO_ID&#39; | &#39;PROMO_NAME&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;AD_NAME&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;AD_GROUP_OPTIMIZATION&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;CAMPAIGN_BUDGET_OPTIMIZATION&#39; | &#39;IS_PREMIERE_CAMPAIGN&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_ADD_TO_WISHLIST&#39; | &#39;TOTAL_SUBSCRIBE&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;PRODUCT_GROUP_AD_IMAGE_TAG&#39; | &#39;PRODUCT_GROUP_AD_VIDEO_TAG&#39; | &#39;VIDEO_3SEC_VIEWS_1&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_1&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;PAID_VIDEO_VIEWABLE_RATE&#39; | &#39;VIDEO_LENGTH&#39; | &#39;VIDEO_SPEND_IN_DOLLAR&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_15SEC_UNIQUE_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;TOTAL_APP_INSTALL_CONVERSION_RATE&#39; | &#39;TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_PIN_RESULT_OPEN&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof AdsApiadsAnalytics
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'OUTBOUND_CTR_1' | 'CAMPAIGN_NAME' | 'CAMPAIGN_BRAND_LABEL' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_NAME' | 'AD_GROUP_BUDGET_TYPE' | 'AD_GROUP_BUDGET_IN_LOCAL_CURRENCY' | 'AD_GROUP_ENTITY_STATUS' | 'AD_GROUP_BID_MULTIPLIER' | 'PROMO_ID' | 'PROMO_NAME' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'AD_NAME' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'AD_GROUP_OPTIMIZATION' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'CAMPAIGN_BUDGET_OPTIMIZATION' | 'IS_PREMIERE_CAMPAIGN' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_ADD_TO_WISHLIST' | 'TOTAL_SUBSCRIBE' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'PRODUCT_GROUP_AD_IMAGE_TAG' | 'PRODUCT_GROUP_AD_VIDEO_TAG' | 'VIDEO_3SEC_VIEWS_1' | 'VIDEO_15SEC_UNIQUE_VIEWS_1' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_15SEC_UNIQUE_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'PAID_VIDEO_VIEWABLE_RATE' | 'VIDEO_LENGTH' | 'VIDEO_SPEND_IN_DOLLAR' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_15SEC_UNIQUE_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'TOTAL_APP_INSTALL_CONVERSION_RATE' | 'TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_PIN_RESULT_OPEN' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * Defaults to: undefined
     * @type Granularity
     * @memberof AdsApiadsAnalytics
     */
    granularity: Granularity
    /**
     * List of Ad Ids to use to filter the results.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AdsApiadsAnalytics
     */
    adIds?: Array<string>
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdsApiadsAnalytics
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdsApiadsAnalytics
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * Defaults to: 1
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof AdsApiadsAnalytics
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * Defaults to: &#39;TIME_OF_AD_ACTION&#39;
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof AdsApiadsAnalytics
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
    /**
     * List of Pin IDs.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AdsApiadsAnalytics
     */
    pinIds?: Array<string>
    /**
     * List of Campaign Ids to use to filter the results.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AdsApiadsAnalytics
     */
    campaignIds?: Array<string>
    /**
     * Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
     * Defaults to: undefined
     * @type ReportingTimeZone
     * @memberof AdsApiadsAnalytics
     */
    reportingTimezone?: ReportingTimeZone
}

export interface AdsApiAdsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Defaults to: undefined
     * @type string
     * @memberof AdsApiadsGet
     */
    adAccountId: string
    /**
     * Unique identifier of an ad.
     * Defaults to: undefined
     * @type string
     * @memberof AdsApiadsGet
     */
    adId: string
}

export interface AdsApiAdsListRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AdsApiadsList
     */
    adAccountId: string
    /**
     * List of Campaign Ids to use to filter the results.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AdsApiadsList
     */
    campaignIds?: Array<string>
    /**
     * List of Ad group Ids to use to filter the results.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AdsApiadsList
     */
    adGroupIds?: Array<string>
    /**
     * List of Ad Ids to use to filter the results.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AdsApiadsList
     */
    adIds?: Array<string>
    /**
     * Entity status
     * Defaults to: undefined
     * @type Array&lt;&#39;ACTIVE&#39; | &#39;PAUSED&#39; | &#39;ARCHIVED&#39; | &#39;DRAFT&#39; | &#39;DELETED_DRAFT&#39;&gt;
     * @memberof AdsApiadsList
     */
    entityStatuses?: Array<'ACTIVE' | 'PAUSED' | 'ARCHIVED' | 'DRAFT' | 'DELETED_DRAFT'>
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof AdsApiadsList
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * Defaults to: undefined
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof AdsApiadsList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof AdsApiadsList
     */
    bookmark?: string
}

export interface AdsApiAdsUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.  Creating ad preview from catalog product group is currently in BETA and is not available to all users.
     * Create ad preview with pin or image
     * @param param the request object
     */
    public adPreviewsCreateWithHttpInfo(param: AdsApiAdPreviewsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdPreviewURLResponse>> {
        return this.api.adPreviewsCreateWithHttpInfo(param.adAccountId, param.adPreviewRequest,  options).toPromise();
    }

    /**
     * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.  Creating ad preview from catalog product group is currently in BETA and is not available to all users.
     * Create ad preview with pin or image
     * @param param the request object
     */
    public adPreviewsCreate(param: AdsApiAdPreviewsCreateRequest, options?: ConfigurationOptions): Promise<AdPreviewURLResponse> {
        return this.api.adPreviewsCreate(param.adAccountId, param.adPreviewRequest,  options).toPromise();
    }

    /**
     * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     * Get targeting analytics for ads
     * @param param the request object
     */
    public adTargetingAnalyticsGetWithHttpInfo(param: AdsApiAdTargetingAnalyticsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<MetricsResponse>> {
        return this.api.adTargetingAnalyticsGetWithHttpInfo(param.adAccountId, param.adIds, param.startDate, param.endDate, param.targetingTypes, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.attributionTypes, param.reportingTimezone,  options).toPromise();
    }

    /**
     * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     * Get targeting analytics for ads
     * @param param the request object
     */
    public adTargetingAnalyticsGet(param: AdsApiAdTargetingAnalyticsGetRequest, options?: ConfigurationOptions): Promise<MetricsResponse> {
        return this.api.adTargetingAnalyticsGet(param.adAccountId, param.adIds, param.startDate, param.endDate, param.targetingTypes, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.attributionTypes, param.reportingTimezone,  options).toPromise();
    }

    /**
     * Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - The request must contain either ad_ids or both campaign_ids and pin_ids. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     * Get ad analytics
     * @param param the request object
     */
    public adsAnalyticsWithHttpInfo(param: AdsApiAdsAnalyticsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<AdsAnalyticsResponseInner>>> {
        return this.api.adsAnalyticsWithHttpInfo(param.adAccountId, param.startDate, param.endDate, param.columns, param.granularity, param.adIds, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.pinIds, param.campaignIds, param.reportingTimezone,  options).toPromise();
    }

    /**
     * Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - The request must contain either ad_ids or both campaign_ids and pin_ids. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     * Get ad analytics
     * @param param the request object
     */
    public adsAnalytics(param: AdsApiAdsAnalyticsRequest, options?: ConfigurationOptions): Promise<Array<AdsAnalyticsResponseInner>> {
        return this.api.adsAnalytics(param.adAccountId, param.startDate, param.endDate, param.columns, param.granularity, param.adIds, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.pinIds, param.campaignIds, param.reportingTimezone,  options).toPromise();
    }

    /**
     * Create multiple new ads. Request must contain `ad_group_id`, `creative_type`, and the source Pin `pin_id`.
     * Create ads
     * @param param the request object
     */
    public adsCreateWithHttpInfo(param: AdsApiAdsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdArrayResponse>> {
        return this.api.adsCreateWithHttpInfo(param.adAccountId, param.adCreateRequest,  options).toPromise();
    }

    /**
     * Create multiple new ads. Request must contain `ad_group_id`, `creative_type`, and the source Pin `pin_id`.
     * Create ads
     * @param param the request object
     */
    public adsCreate(param: AdsApiAdsCreateRequest, options?: ConfigurationOptions): Promise<AdArrayResponse> {
        return this.api.adsCreate(param.adAccountId, param.adCreateRequest,  options).toPromise();
    }

    /**
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
     * Get ad
     * @param param the request object
     */
    public adsGetWithHttpInfo(param: AdsApiAdsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdResponse>> {
        return this.api.adsGetWithHttpInfo(param.adAccountId, param.adId,  options).toPromise();
    }

    /**
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
     * Get ad
     * @param param the request object
     */
    public adsGet(param: AdsApiAdsGetRequest, options?: ConfigurationOptions): Promise<AdResponse> {
        return this.api.adsGet(param.adAccountId, param.adId,  options).toPromise();
    }

    /**
     * List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.
     * List ads
     * @param param the request object
     */
    public adsListWithHttpInfo(param: AdsApiAdsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdsList200Response>> {
        return this.api.adsListWithHttpInfo(param.adAccountId, param.campaignIds, param.adGroupIds, param.adIds, param.entityStatuses, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.
     * List ads
     * @param param the request object
     */
    public adsList(param: AdsApiAdsListRequest, options?: ConfigurationOptions): Promise<AdsList200Response> {
        return this.api.adsList(param.adAccountId, param.campaignIds, param.adGroupIds, param.adIds, param.entityStatuses, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * Update multiple existing ads
     * Update ads
     * @param param the request object
     */
    public adsUpdateWithHttpInfo(param: AdsApiAdsUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdArrayResponse>> {
        return this.api.adsUpdateWithHttpInfo(param.adAccountId, param.adUpdateRequest,  options).toPromise();
    }

    /**
     * Update multiple existing ads
     * Update ads
     * @param param the request object
     */
    public adsUpdate(param: AdsApiAdsUpdateRequest, options?: ConfigurationOptions): Promise<AdArrayResponse> {
        return this.api.adsUpdate(param.adAccountId, param.adUpdateRequest,  options).toPromise();
    }

}

import { ObservableAdvancedAuctionApi } from "./ObservableAPI";
import { AdvancedAuctionApiRequestFactory, AdvancedAuctionApiResponseProcessor} from "../apis/AdvancedAuctionApi";

export interface AdvancedAuctionApiAdvancedAuctionItemsGetPostRequest {
    /**
     * Request object used to get bid options values for a batch of retail catalog items
     * @type AdvancedAuctionItemsGetRequest
     * @memberof AdvancedAuctionApiadvancedAuctionItemsGetPost
     */
    advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AdvancedAuctionApiadvancedAuctionItemsGetPost
     */
    adAccountId?: string
}

export interface AdvancedAuctionApiAdvancedAuctionItemsSubmitPostRequest {
    /**
     * Request object used to upsert or delete bid options for a batch of retail catalog items
     * @type AdvancedAuctionItemsSubmitRequest
     * @memberof AdvancedAuctionApiadvancedAuctionItemsSubmitPost
     */
    advancedAuctionItemsSubmitRequest: AdvancedAuctionItemsSubmitRequest
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AdvancedAuctionApiadvancedAuctionItemsSubmitPost
     */
    adAccountId?: string
}

export class ObjectAdvancedAuctionApi {
    private api: ObservableAdvancedAuctionApi

    public constructor(configuration: Configuration, requestFactory?: AdvancedAuctionApiRequestFactory, responseProcessor?: AdvancedAuctionApiResponseProcessor) {
        this.api = new ObservableAdvancedAuctionApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
     * Get item bid options (POST)
     * @param param the request object
     */
    public advancedAuctionItemsGetPostWithHttpInfo(param: AdvancedAuctionApiAdvancedAuctionItemsGetPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdvancedAuctionItems>> {
        return this.api.advancedAuctionItemsGetPostWithHttpInfo(param.advancedAuctionItemsGetRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
     * Get item bid options (POST)
     * @param param the request object
     */
    public advancedAuctionItemsGetPost(param: AdvancedAuctionApiAdvancedAuctionItemsGetPostRequest, options?: ConfigurationOptions): Promise<AdvancedAuctionItems> {
        return this.api.advancedAuctionItemsGetPost(param.advancedAuctionItemsGetRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
     * Operate on item level bid options
     * @param param the request object
     */
    public advancedAuctionItemsSubmitPostWithHttpInfo(param: AdvancedAuctionApiAdvancedAuctionItemsSubmitPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdvancedAuctionProcessedItems>> {
        return this.api.advancedAuctionItemsSubmitPostWithHttpInfo(param.advancedAuctionItemsSubmitRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
     * Operate on item level bid options
     * @param param the request object
     */
    public advancedAuctionItemsSubmitPost(param: AdvancedAuctionApiAdvancedAuctionItemsSubmitPostRequest, options?: ConfigurationOptions): Promise<AdvancedAuctionProcessedItems> {
        return this.api.advancedAuctionItemsSubmitPost(param.advancedAuctionItemsSubmitRequest, param.adAccountId,  options).toPromise();
    }

}

import { ObservableAudienceInsightsApi } from "./ObservableAPI";
import { AudienceInsightsApiRequestFactory, AudienceInsightsApiResponseProcessor} from "../apis/AudienceInsightsApi";

export interface AudienceInsightsApiAudienceInsightsGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AudienceInsightsApiaudienceInsightsGet
     */
    adAccountId: string
    /**
     * Type of audience insights.
     * Defaults to: undefined
     * @type AudienceInsightType
     * @memberof AudienceInsightsApiaudienceInsightsGet
     */
    audienceInsightType: AudienceInsightType
}

export interface AudienceInsightsApiAudienceInsightsScopeAndTypeGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
    public audienceInsightsGetWithHttpInfo(param: AudienceInsightsApiAudienceInsightsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<AudienceInsightsResponse>> {
        return this.api.audienceInsightsGetWithHttpInfo(param.adAccountId, param.audienceInsightType,  options).toPromise();
    }

    /**
     * Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account\'s engaged audience on Pinterest, the ad account\'s total audience on Pinterest and Pinterest\'s total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
     * Get audience insights
     * @param param the request object
     */
    public audienceInsightsGet(param: AudienceInsightsApiAudienceInsightsGetRequest, options?: ConfigurationOptions): Promise<AudienceInsightsResponse> {
        return this.api.audienceInsightsGet(param.adAccountId, param.audienceInsightType,  options).toPromise();
    }

    /**
     * Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
     * Get audience insights scope and type
     * @param param the request object
     */
    public audienceInsightsScopeAndTypeGetWithHttpInfo(param: AudienceInsightsApiAudienceInsightsScopeAndTypeGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<AudienceDefinitionResponse>> {
        return this.api.audienceInsightsScopeAndTypeGetWithHttpInfo(param.adAccountId,  options).toPromise();
    }

    /**
     * Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
     * Get audience insights scope and type
     * @param param the request object
     */
    public audienceInsightsScopeAndTypeGet(param: AudienceInsightsApiAudienceInsightsScopeAndTypeGetRequest, options?: ConfigurationOptions): Promise<AudienceDefinitionResponse> {
        return this.api.audienceInsightsScopeAndTypeGet(param.adAccountId,  options).toPromise();
    }

}

import { ObservableAudienceSharingApi } from "./ObservableAPI";
import { AudienceSharingApiRequestFactory, AudienceSharingApiResponseProcessor} from "../apis/AudienceSharingApi";

export interface AudienceSharingApiAdAccountsAudiencesSharedAccountsListRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AudienceSharingApiadAccountsAudiencesSharedAccountsList
     */
    adAccountId: string
    /**
     * Unique identifier of the audience to use to filter the results.
     * Defaults to: undefined
     * @type string
     * @memberof AudienceSharingApiadAccountsAudiencesSharedAccountsList
     */
    audienceId: string
    /**
     * Filter accounts by account type.
     * Defaults to: undefined
     * @type AudienceAccountType
     * @memberof AudienceSharingApiadAccountsAudiencesSharedAccountsList
     */
    accountType: AudienceAccountType
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof AudienceSharingApiadAccountsAudiencesSharedAccountsList
     */
    pageSize?: number
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof AudienceSharingApiadAccountsAudiencesSharedAccountsList
     */
    bookmark?: string
}

export interface AudienceSharingApiBusinessAccountAudiencesSharedAccountsListRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof AudienceSharingApibusinessAccountAudiencesSharedAccountsList
     */
    businessId: string
    /**
     * Unique identifier of the audience to use to filter the results.
     * Defaults to: undefined
     * @type string
     * @memberof AudienceSharingApibusinessAccountAudiencesSharedAccountsList
     */
    audienceId: string
    /**
     * Filter accounts by account type.
     * Defaults to: undefined
     * @type AudienceAccountType
     * @memberof AudienceSharingApibusinessAccountAudiencesSharedAccountsList
     */
    accountType: AudienceAccountType
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof AudienceSharingApibusinessAccountAudiencesSharedAccountsList
     */
    pageSize?: number
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof AudienceSharingApibusinessAccountAudiencesSharedAccountsList
     */
    bookmark?: string
}

export interface AudienceSharingApiSharedAudiencesForBusinessListRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof AudienceSharingApisharedAudiencesForBusinessList
     */
    businessId: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof AudienceSharingApisharedAudiencesForBusinessList
     */
    bookmark?: string
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * Defaults to: undefined
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof AudienceSharingApisharedAudiencesForBusinessList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof AudienceSharingApisharedAudiencesForBusinessList
     */
    pageSize?: number
}

export interface AudienceSharingApiUpdateAdAccountToAdAccountSharedAudienceRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AudienceSharingApiupdateAdAccountToAdAccountSharedAudience
     */
    adAccountId: string
    /**
     * 
     * @type SharedAudience
     * @memberof AudienceSharingApiupdateAdAccountToAdAccountSharedAudience
     */
    sharedAudience: SharedAudience
}

export interface AudienceSharingApiUpdateAdAccountToBusinessSharedAudienceRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AudienceSharingApiupdateAdAccountToBusinessSharedAudience
     */
    adAccountId: string
    /**
     * 
     * @type BusinessSharedAudience
     * @memberof AudienceSharingApiupdateAdAccountToBusinessSharedAudience
     */
    businessSharedAudience: BusinessSharedAudience
}

export interface AudienceSharingApiUpdateBusinessToAdAccountSharedAudienceRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof AudienceSharingApiupdateBusinessToAdAccountSharedAudience
     */
    businessId: string
    /**
     * 
     * @type SharedAudience
     * @memberof AudienceSharingApiupdateBusinessToAdAccountSharedAudience
     */
    sharedAudience: SharedAudience
}

export interface AudienceSharingApiUpdateBusinessToBusinessSharedAudienceRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof AudienceSharingApiupdateBusinessToBusinessSharedAudience
     */
    businessId: string
    /**
     * 
     * @type BusinessSharedAudience
     * @memberof AudienceSharingApiupdateBusinessToBusinessSharedAudience
     */
    businessSharedAudience: BusinessSharedAudience
}

export class ObjectAudienceSharingApi {
    private api: ObservableAudienceSharingApi

    public constructor(configuration: Configuration, requestFactory?: AudienceSharingApiRequestFactory, responseProcessor?: AudienceSharingApiResponseProcessor) {
        this.api = new ObservableAudienceSharingApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
     * List accounts with access to an audience owned by an ad account
     * @param param the request object
     */
    public adAccountsAudiencesSharedAccountsListWithHttpInfo(param: AudienceSharingApiAdAccountsAudiencesSharedAccountsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdAccountsAudiencesSharedAccountsList200Response>> {
        return this.api.adAccountsAudiencesSharedAccountsListWithHttpInfo(param.adAccountId, param.audienceId, param.accountType, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
     * List accounts with access to an audience owned by an ad account
     * @param param the request object
     */
    public adAccountsAudiencesSharedAccountsList(param: AudienceSharingApiAdAccountsAudiencesSharedAccountsListRequest, options?: ConfigurationOptions): Promise<AdAccountsAudiencesSharedAccountsList200Response> {
        return this.api.adAccountsAudiencesSharedAccountsList(param.adAccountId, param.audienceId, param.accountType, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
     * List accounts with access to an audience owned by a business
     * @param param the request object
     */
    public businessAccountAudiencesSharedAccountsListWithHttpInfo(param: AudienceSharingApiBusinessAccountAudiencesSharedAccountsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdAccountsAudiencesSharedAccountsList200Response>> {
        return this.api.businessAccountAudiencesSharedAccountsListWithHttpInfo(param.businessId, param.audienceId, param.accountType, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
     * List accounts with access to an audience owned by a business
     * @param param the request object
     */
    public businessAccountAudiencesSharedAccountsList(param: AudienceSharingApiBusinessAccountAudiencesSharedAccountsListRequest, options?: ConfigurationOptions): Promise<AdAccountsAudiencesSharedAccountsList200Response> {
        return this.api.businessAccountAudiencesSharedAccountsList(param.businessId, param.audienceId, param.accountType, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * Get a list of received audiences for the given business.
     * List received audiences for a business
     * @param param the request object
     */
    public sharedAudiencesForBusinessListWithHttpInfo(param: AudienceSharingApiSharedAudiencesForBusinessListRequest, options?: ConfigurationOptions): Promise<HttpInfo<AudiencesList200Response>> {
        return this.api.sharedAudiencesForBusinessListWithHttpInfo(param.businessId, param.bookmark, param.order, param.pageSize,  options).toPromise();
    }

    /**
     * Get a list of received audiences for the given business.
     * List received audiences for a business
     * @param param the request object
     */
    public sharedAudiencesForBusinessList(param: AudienceSharingApiSharedAudiencesForBusinessListRequest, options?: ConfigurationOptions): Promise<AudiencesList200Response> {
        return this.api.sharedAudiencesForBusinessList(param.businessId, param.bookmark, param.order, param.pageSize,  options).toPromise();
    }

    /**
     * From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href=\'https://help.pinterest.com/en/business/article/create-and-manage-accounts\'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.
     * Update audience sharing between ad accounts
     * @param param the request object
     */
    public updateAdAccountToAdAccountSharedAudienceWithHttpInfo(param: AudienceSharingApiUpdateAdAccountToAdAccountSharedAudienceRequest, options?: ConfigurationOptions): Promise<HttpInfo<SharedAudienceResponse>> {
        return this.api.updateAdAccountToAdAccountSharedAudienceWithHttpInfo(param.adAccountId, param.sharedAudience,  options).toPromise();
    }

    /**
     * From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href=\'https://help.pinterest.com/en/business/article/create-and-manage-accounts\'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.
     * Update audience sharing between ad accounts
     * @param param the request object
     */
    public updateAdAccountToAdAccountSharedAudience(param: AudienceSharingApiUpdateAdAccountToAdAccountSharedAudienceRequest, options?: ConfigurationOptions): Promise<SharedAudienceResponse> {
        return this.api.updateAdAccountToAdAccountSharedAudience(param.adAccountId, param.sharedAudience,  options).toPromise();
    }

    /**
     * From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.
     * Update audience sharing from an ad account to businesses
     * @param param the request object
     */
    public updateAdAccountToBusinessSharedAudienceWithHttpInfo(param: AudienceSharingApiUpdateAdAccountToBusinessSharedAudienceRequest, options?: ConfigurationOptions): Promise<HttpInfo<BusinessSharedAudienceResponse>> {
        return this.api.updateAdAccountToBusinessSharedAudienceWithHttpInfo(param.adAccountId, param.businessSharedAudience,  options).toPromise();
    }

    /**
     * From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.
     * Update audience sharing from an ad account to businesses
     * @param param the request object
     */
    public updateAdAccountToBusinessSharedAudience(param: AudienceSharingApiUpdateAdAccountToBusinessSharedAudienceRequest, options?: ConfigurationOptions): Promise<BusinessSharedAudienceResponse> {
        return this.api.updateAdAccountToBusinessSharedAudience(param.adAccountId, param.businessSharedAudience,  options).toPromise();
    }

    /**
     * From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.
     * Update audience sharing from a business to ad accounts
     * @param param the request object
     */
    public updateBusinessToAdAccountSharedAudienceWithHttpInfo(param: AudienceSharingApiUpdateBusinessToAdAccountSharedAudienceRequest, options?: ConfigurationOptions): Promise<HttpInfo<SharedAudienceResponse>> {
        return this.api.updateBusinessToAdAccountSharedAudienceWithHttpInfo(param.businessId, param.sharedAudience,  options).toPromise();
    }

    /**
     * From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.
     * Update audience sharing from a business to ad accounts
     * @param param the request object
     */
    public updateBusinessToAdAccountSharedAudience(param: AudienceSharingApiUpdateBusinessToAdAccountSharedAudienceRequest, options?: ConfigurationOptions): Promise<SharedAudienceResponse> {
        return this.api.updateBusinessToAdAccountSharedAudience(param.businessId, param.sharedAudience,  options).toPromise();
    }

    /**
     * From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.
     * Update audience sharing between businesses
     * @param param the request object
     */
    public updateBusinessToBusinessSharedAudienceWithHttpInfo(param: AudienceSharingApiUpdateBusinessToBusinessSharedAudienceRequest, options?: ConfigurationOptions): Promise<HttpInfo<BusinessSharedAudienceResponse>> {
        return this.api.updateBusinessToBusinessSharedAudienceWithHttpInfo(param.businessId, param.businessSharedAudience,  options).toPromise();
    }

    /**
     * From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.
     * Update audience sharing between businesses
     * @param param the request object
     */
    public updateBusinessToBusinessSharedAudience(param: AudienceSharingApiUpdateBusinessToBusinessSharedAudienceRequest, options?: ConfigurationOptions): Promise<BusinessSharedAudienceResponse> {
        return this.api.updateBusinessToBusinessSharedAudience(param.businessId, param.businessSharedAudience,  options).toPromise();
    }

}

import { ObservableAudiencesApi } from "./ObservableAPI";
import { AudiencesApiRequestFactory, AudiencesApiResponseProcessor} from "../apis/AudiencesApi";

export interface AudiencesApiAudiencesCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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

export interface AudiencesApiAudiencesGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AudiencesApiaudiencesGet
     */
    adAccountId: string
    /**
     * Unique identifier of an audience
     * Defaults to: undefined
     * @type string
     * @memberof AudiencesApiaudiencesGet
     */
    audienceId: string
}

export interface AudiencesApiAudiencesListRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AudiencesApiaudiencesList
     */
    adAccountId: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof AudiencesApiaudiencesList
     */
    bookmark?: string
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
     * Defaults to: undefined
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof AudiencesApiaudiencesList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof AudiencesApiaudiencesList
     */
    pageSize?: number
    /**
     * Filter audiences by ownership type.
     * Defaults to: &#39;OWNED&#39;
     * @type &#39;OWNED&#39; | &#39;RECEIVED&#39;
     * @memberof AudiencesApiaudiencesList
     */
    ownershipType?: 'OWNED' | 'RECEIVED'
}

export interface AudiencesApiAudiencesUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof AudiencesApiaudiencesUpdate
     */
    adAccountId: string
    /**
     * Unique identifier of an audience
     * Defaults to: undefined
     * @type string
     * @memberof AudiencesApiaudiencesUpdate
     */
    audienceId: string
    /**
     * The audience to be updated.
     * @type AudienceUpdateRequest
     * @memberof AudiencesApiaudiencesUpdate
     */
    audienceUpdateRequest: AudienceUpdateRequest
}

export class ObjectAudiencesApi {
    private api: ObservableAudiencesApi

    public constructor(configuration: Configuration, requestFactory?: AudiencesApiRequestFactory, responseProcessor?: AudiencesApiResponseProcessor) {
        this.api = new ObservableAudiencesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific `audience_ids` when you create an ad group. <p/> Learn about <a href=\"/docs/work-with-targets-and-audiences/create-audiences/\" target=\"_blank\">creating different kinds of audiences</a>.
     * Create audience
     * @param param the request object
     */
    public audiencesCreateWithHttpInfo(param: AudiencesApiAudiencesCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<Audience>> {
        return this.api.audiencesCreateWithHttpInfo(param.adAccountId, param.audienceCreateRequest,  options).toPromise();
    }

    /**
     * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific `audience_ids` when you create an ad group. <p/> Learn about <a href=\"/docs/work-with-targets-and-audiences/create-audiences/\" target=\"_blank\">creating different kinds of audiences</a>.
     * Create audience
     * @param param the request object
     */
    public audiencesCreate(param: AudiencesApiAudiencesCreateRequest, options?: ConfigurationOptions): Promise<Audience> {
        return this.api.audiencesCreate(param.adAccountId, param.audienceCreateRequest,  options).toPromise();
    }

    /**
     * Get a specific audience given the audience ID.
     * Get audience
     * @param param the request object
     */
    public audiencesGetWithHttpInfo(param: AudiencesApiAudiencesGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<Audience>> {
        return this.api.audiencesGetWithHttpInfo(param.adAccountId, param.audienceId,  options).toPromise();
    }

    /**
     * Get a specific audience given the audience ID.
     * Get audience
     * @param param the request object
     */
    public audiencesGet(param: AudiencesApiAudiencesGetRequest, options?: ConfigurationOptions): Promise<Audience> {
        return this.api.audiencesGet(param.adAccountId, param.audienceId,  options).toPromise();
    }

    /**
     * Get list of audiences for the ad account.
     * List audiences
     * @param param the request object
     */
    public audiencesListWithHttpInfo(param: AudiencesApiAudiencesListRequest, options?: ConfigurationOptions): Promise<HttpInfo<AudiencesList200Response>> {
        return this.api.audiencesListWithHttpInfo(param.adAccountId, param.bookmark, param.order, param.pageSize, param.ownershipType,  options).toPromise();
    }

    /**
     * Get list of audiences for the ad account.
     * List audiences
     * @param param the request object
     */
    public audiencesList(param: AudiencesApiAudiencesListRequest, options?: ConfigurationOptions): Promise<AudiencesList200Response> {
        return this.api.audiencesList(param.adAccountId, param.bookmark, param.order, param.pageSize, param.ownershipType,  options).toPromise();
    }

    /**
     * Update (edit or remove) an existing targeting audience.
     * Update audience
     * @param param the request object
     */
    public audiencesUpdateWithHttpInfo(param: AudiencesApiAudiencesUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<Audience>> {
        return this.api.audiencesUpdateWithHttpInfo(param.adAccountId, param.audienceId, param.audienceUpdateRequest,  options).toPromise();
    }

    /**
     * Update (edit or remove) an existing targeting audience.
     * Update audience
     * @param param the request object
     */
    public audiencesUpdate(param: AudiencesApiAudiencesUpdateRequest, options?: ConfigurationOptions): Promise<Audience> {
        return this.api.audiencesUpdate(param.adAccountId, param.audienceId, param.audienceUpdateRequest,  options).toPromise();
    }

}

import { ObservableBillingApi } from "./ObservableAPI";
import { BillingApiRequestFactory, BillingApiResponseProcessor} from "../apis/BillingApi";

export interface BillingApiAdsCreditRedeemRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Defaults to: undefined
     * @type string
     * @memberof BillingApiadsCreditsDiscountsGet
     */
    adAccountId: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BillingApiadsCreditsDiscountsGet
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BillingApiadsCreditsDiscountsGet
     */
    pageSize?: number
}

export interface BillingApiBillingInvoiceDownloadGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof BillingApibillingInvoiceDownloadGet
     */
    adAccountId: string
    /**
     * Unique identifier of a billing invoice.
     * Defaults to: undefined
     * @type string
     * @memberof BillingApibillingInvoiceDownloadGet
     */
    billingInvoiceId: string
}

export interface BillingApiBillingInvoicesGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof BillingApibillingInvoicesGet
     */
    adAccountId: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BillingApibillingInvoicesGet
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BillingApibillingInvoicesGet
     */
    pageSize?: number
    /**
     * Field of which to sort billing invoices
     * Defaults to: &#39;DUE_DATE&#39;
     * @type &#39;DUE_DATE&#39; | &#39;BILLING_PERIOD&#39; | &#39;DOCUMENT_TYPE&#39; | &#39;TOTAL_AMOUNT&#39; | &#39;INVOICE_NUMBER&#39;
     * @memberof BillingApibillingInvoicesGet
     */
    sort?: 'DUE_DATE' | 'BILLING_PERIOD' | 'DOCUMENT_TYPE' | 'TOTAL_AMOUNT' | 'INVOICE_NUMBER'
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * Defaults to: undefined
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof BillingApibillingInvoicesGet
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Status of billing invoices to filter by
     * Defaults to: undefined
     * @type &#39;OPEN&#39; | &#39;CLOSED&#39;
     * @memberof BillingApibillingInvoicesGet
     */
    status?: 'OPEN' | 'CLOSED'
    /**
     * Document type of billing invoices to filter by
     * Defaults to: undefined
     * @type &#39;INVOICE&#39; | &#39;CREDIT_MEMO&#39;
     * @memberof BillingApibillingInvoicesGet
     */
    documentType?: 'INVOICE' | 'CREDIT_MEMO'
    /**
     * Starting point for due dates when searching for invoices. Format: YYYY-MM-DD
     * Defaults to: undefined
     * @type string
     * @memberof BillingApibillingInvoicesGet
     */
    startDueDate?: string
    /**
     * Ending point for due dates when searching for invoices. Format: YYYY-MM-DD
     * Defaults to: undefined
     * @type string
     * @memberof BillingApibillingInvoicesGet
     */
    endDueDate?: string
}

export interface BillingApiBillingProfilesGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof BillingApibillingProfilesGet
     */
    adAccountId: string
    /**
     * Return active billing profiles, if false return all billing profiles.
     * Defaults to: undefined
     * @type boolean
     * @memberof BillingApibillingProfilesGet
     */
    isActive: boolean
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BillingApibillingProfilesGet
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BillingApibillingProfilesGet
     */
    pageSize?: number
}

export interface BillingApiSsioAccountsGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof BillingApissioAccountsGet
     */
    adAccountId: string
}

export interface BillingApiSsioInsertionOrderCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Defaults to: undefined
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
     * Defaults to: undefined
     * @type string
     * @memberof BillingApissioInsertionOrdersStatusGetByAdAccount
     */
    adAccountId: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BillingApissioInsertionOrdersStatusGetByAdAccount
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BillingApissioInsertionOrdersStatusGetByAdAccount
     */
    pageSize?: number
}

export interface BillingApiSsioInsertionOrdersStatusGetByPinOrderIdRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof BillingApissioInsertionOrdersStatusGetByPinOrderId
     */
    adAccountId: string
    /**
     * The pin order id associated with the ssio insertion order
     * Defaults to: undefined
     * @type string
     * @memberof BillingApissioInsertionOrdersStatusGetByPinOrderId
     */
    pinOrderId: string
}

export interface BillingApiSsioOrderLinesGetByAdAccountRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof BillingApissioOrderLinesGetByAdAccount
     */
    adAccountId: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BillingApissioOrderLinesGetByAdAccount
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BillingApissioOrderLinesGetByAdAccount
     */
    pageSize?: number
    /**
     * The pin order id associated with the ssio insertino order
     * Defaults to: undefined
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
     * Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>
     * Redeem ad credits
     * @param param the request object
     */
    public adsCreditRedeemWithHttpInfo(param: BillingApiAdsCreditRedeemRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdsCreditRedeemResponse>> {
        return this.api.adsCreditRedeemWithHttpInfo(param.adAccountId, param.adsCreditRedeemRequest,  options).toPromise();
    }

    /**
     * Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>
     * Redeem ad credits
     * @param param the request object
     */
    public adsCreditRedeem(param: BillingApiAdsCreditRedeemRequest, options?: ConfigurationOptions): Promise<AdsCreditRedeemResponse> {
        return this.api.adsCreditRedeem(param.adAccountId, param.adsCreditRedeemRequest,  options).toPromise();
    }

    /**
     * Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>
     * Get ads credit discounts
     * @param param the request object
     */
    public adsCreditsDiscountsGetWithHttpInfo(param: BillingApiAdsCreditsDiscountsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdsCreditsDiscountsGet200Response>> {
        return this.api.adsCreditsDiscountsGetWithHttpInfo(param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>
     * Get ads credit discounts
     * @param param the request object
     */
    public adsCreditsDiscountsGet(param: BillingApiAdsCreditsDiscountsGetRequest, options?: ConfigurationOptions): Promise<AdsCreditsDiscountsGet200Response> {
        return this.api.adsCreditsDiscountsGet(param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get download url for a billing invoice.
     * Get download url for a billing invoice
     * @param param the request object
     */
    public billingInvoiceDownloadGetWithHttpInfo(param: BillingApiBillingInvoiceDownloadGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<BillingInvoiceDownloadResponse>> {
        return this.api.billingInvoiceDownloadGetWithHttpInfo(param.adAccountId, param.billingInvoiceId,  options).toPromise();
    }

    /**
     * Get download url for a billing invoice.
     * Get download url for a billing invoice
     * @param param the request object
     */
    public billingInvoiceDownloadGet(param: BillingApiBillingInvoiceDownloadGetRequest, options?: ConfigurationOptions): Promise<BillingInvoiceDownloadResponse> {
        return this.api.billingInvoiceDownloadGet(param.adAccountId, param.billingInvoiceId,  options).toPromise();
    }

    /**
     * Get billing invoices in the advertiser account.
     * Get billing invoices
     * @param param the request object
     */
    public billingInvoicesGetWithHttpInfo(param: BillingApiBillingInvoicesGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<BillingInvoicesGet200Response>> {
        return this.api.billingInvoicesGetWithHttpInfo(param.adAccountId, param.bookmark, param.pageSize, param.sort, param.order, param.status, param.documentType, param.startDueDate, param.endDueDate,  options).toPromise();
    }

    /**
     * Get billing invoices in the advertiser account.
     * Get billing invoices
     * @param param the request object
     */
    public billingInvoicesGet(param: BillingApiBillingInvoicesGetRequest, options?: ConfigurationOptions): Promise<BillingInvoicesGet200Response> {
        return this.api.billingInvoicesGet(param.adAccountId, param.bookmark, param.pageSize, param.sort, param.order, param.status, param.documentType, param.startDueDate, param.endDueDate,  options).toPromise();
    }

    /**
     * Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>
     * Get billing profiles
     * @param param the request object
     */
    public billingProfilesGetWithHttpInfo(param: BillingApiBillingProfilesGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<BillingProfilesGet200Response>> {
        return this.api.billingProfilesGetWithHttpInfo(param.adAccountId, param.isActive, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>
     * Get billing profiles
     * @param param the request object
     */
    public billingProfilesGet(param: BillingApiBillingProfilesGetRequest, options?: ConfigurationOptions): Promise<BillingProfilesGet200Response> {
        return this.api.billingProfilesGet(param.adAccountId, param.isActive, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get Salesforce account details including bill-to information.
     * @param param the request object
     */
    public ssioAccountsGetWithHttpInfo(param: BillingApiSsioAccountsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<SSIOAccountResponse>> {
        return this.api.ssioAccountsGetWithHttpInfo(param.adAccountId,  options).toPromise();
    }

    /**
     * Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get Salesforce account details including bill-to information.
     * @param param the request object
     */
    public ssioAccountsGet(param: BillingApiSsioAccountsGetRequest, options?: ConfigurationOptions): Promise<SSIOAccountResponse> {
        return this.api.ssioAccountsGet(param.adAccountId,  options).toPromise();
    }

    /**
     * Create insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Create insertion order through SSIO.
     * @param param the request object
     */
    public ssioInsertionOrderCreateWithHttpInfo(param: BillingApiSsioInsertionOrderCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<SSIOCreateInsertionOrderResponse>> {
        return this.api.ssioInsertionOrderCreateWithHttpInfo(param.adAccountId, param.sSIOCreateInsertionOrderRequest,  options).toPromise();
    }

    /**
     * Create insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Create insertion order through SSIO.
     * @param param the request object
     */
    public ssioInsertionOrderCreate(param: BillingApiSsioInsertionOrderCreateRequest, options?: ConfigurationOptions): Promise<SSIOCreateInsertionOrderResponse> {
        return this.api.ssioInsertionOrderCreate(param.adAccountId, param.sSIOCreateInsertionOrderRequest,  options).toPromise();
    }

    /**
     * Edit insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Edit insertion order through SSIO.
     * @param param the request object
     */
    public ssioInsertionOrderEditWithHttpInfo(param: BillingApiSsioInsertionOrderEditRequest, options?: ConfigurationOptions): Promise<HttpInfo<SSIOEditInsertionOrderResponse>> {
        return this.api.ssioInsertionOrderEditWithHttpInfo(param.adAccountId, param.sSIOEditInsertionOrderRequest,  options).toPromise();
    }

    /**
     * Edit insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Edit insertion order through SSIO.
     * @param param the request object
     */
    public ssioInsertionOrderEdit(param: BillingApiSsioInsertionOrderEditRequest, options?: ConfigurationOptions): Promise<SSIOEditInsertionOrderResponse> {
        return this.api.ssioInsertionOrderEdit(param.adAccountId, param.sSIOEditInsertionOrderRequest,  options).toPromise();
    }

    /**
     * Get insertion order status for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get insertion order status by ad account id.
     * @param param the request object
     */
    public ssioInsertionOrdersStatusGetByAdAccountWithHttpInfo(param: BillingApiSsioInsertionOrdersStatusGetByAdAccountRequest, options?: ConfigurationOptions): Promise<HttpInfo<SsioInsertionOrdersStatusGetByAdAccount200Response>> {
        return this.api.ssioInsertionOrdersStatusGetByAdAccountWithHttpInfo(param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get insertion order status for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get insertion order status by ad account id.
     * @param param the request object
     */
    public ssioInsertionOrdersStatusGetByAdAccount(param: BillingApiSsioInsertionOrdersStatusGetByAdAccountRequest, options?: ConfigurationOptions): Promise<SsioInsertionOrdersStatusGetByAdAccount200Response> {
        return this.api.ssioInsertionOrdersStatusGetByAdAccount(param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get insertion order status for pin order id <code>pin_order_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get insertion order status by pin order id.
     * @param param the request object
     */
    public ssioInsertionOrdersStatusGetByPinOrderIdWithHttpInfo(param: BillingApiSsioInsertionOrdersStatusGetByPinOrderIdRequest, options?: ConfigurationOptions): Promise<HttpInfo<SSIOInsertionOrderStatusResponse>> {
        return this.api.ssioInsertionOrdersStatusGetByPinOrderIdWithHttpInfo(param.adAccountId, param.pinOrderId,  options).toPromise();
    }

    /**
     * Get insertion order status for pin order id <code>pin_order_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get insertion order status by pin order id.
     * @param param the request object
     */
    public ssioInsertionOrdersStatusGetByPinOrderId(param: BillingApiSsioInsertionOrdersStatusGetByPinOrderIdRequest, options?: ConfigurationOptions): Promise<SSIOInsertionOrderStatusResponse> {
        return this.api.ssioInsertionOrdersStatusGetByPinOrderId(param.adAccountId, param.pinOrderId,  options).toPromise();
    }

    /**
     * Get Salesforce order lines for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get Salesforce order lines by ad account id.
     * @param param the request object
     */
    public ssioOrderLinesGetByAdAccountWithHttpInfo(param: BillingApiSsioOrderLinesGetByAdAccountRequest, options?: ConfigurationOptions): Promise<HttpInfo<SsioOrderLinesGetByAdAccount200Response>> {
        return this.api.ssioOrderLinesGetByAdAccountWithHttpInfo(param.adAccountId, param.bookmark, param.pageSize, param.pinOrderId,  options).toPromise();
    }

    /**
     * Get Salesforce order lines for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     * Get Salesforce order lines by ad account id.
     * @param param the request object
     */
    public ssioOrderLinesGetByAdAccount(param: BillingApiSsioOrderLinesGetByAdAccountRequest, options?: ConfigurationOptions): Promise<SsioOrderLinesGetByAdAccount200Response> {
        return this.api.ssioOrderLinesGetByAdAccount(param.adAccountId, param.bookmark, param.pageSize, param.pinOrderId,  options).toPromise();
    }

}

import { ObservableBoardsApi } from "./ObservableAPI";
import { BoardsApiRequestFactory, BoardsApiResponseProcessor} from "../apis/BoardsApi";

export interface BoardsApiBoardSectionsCreateRequest {
    /**
     * Unique identifier of a board.
     * Defaults to: undefined
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
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardSectionsCreate
     */
    adAccountId?: string
}

export interface BoardsApiBoardSectionsDeleteRequest {
    /**
     * Unique identifier of a board.
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardSectionsDelete
     */
    boardId: string
    /**
     * Unique identifier of a board section.
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardSectionsDelete
     */
    sectionId: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardSectionsDelete
     */
    adAccountId?: string
}

export interface BoardsApiBoardSectionsListRequest {
    /**
     * Unique identifier of a board.
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardSectionsList
     */
    boardId: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardSectionsList
     */
    adAccountId?: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardSectionsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BoardsApiboardSectionsList
     */
    pageSize?: number
}

export interface BoardsApiBoardSectionsListPinsRequest {
    /**
     * Unique identifier of a board.
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardSectionsListPins
     */
    boardId: string
    /**
     * Unique identifier of a board section.
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardSectionsListPins
     */
    sectionId: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardSectionsListPins
     */
    adAccountId?: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardSectionsListPins
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BoardsApiboardSectionsListPins
     */
    pageSize?: number
}

export interface BoardsApiBoardSectionsUpdateRequest {
    /**
     * Unique identifier of a board.
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardSectionsUpdate
     */
    boardId: string
    /**
     * Unique identifier of a board section.
     * Defaults to: undefined
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
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardSectionsUpdate
     */
    adAccountId?: string
}

export interface BoardsApiBoardsCreateRequest {
    /**
     * 
     * @type BoardCreate
     * @memberof BoardsApiboardsCreate
     */
    boardCreate: BoardCreate
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardsCreate
     */
    adAccountId?: string
}

export interface BoardsApiBoardsDeleteRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardsDelete
     */
    boardId: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardsDelete
     */
    adAccountId?: string
}

export interface BoardsApiBoardsGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardsGet
     */
    boardId: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardsGet
     */
    adAccountId?: string
}

export interface BoardsApiBoardsListRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardsList
     */
    adAccountId?: string
    /**
     * The privacy level of the board
     * Defaults to: undefined
     * @type BoardPrivacyFilter
     * @memberof BoardsApiboardsList
     */
    privacy?: BoardPrivacyFilter
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BoardsApiboardsList
     */
    pageSize?: number
}

export interface BoardsApiBoardsListPinsRequest {
    /**
     * Unique identifier of a board.
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardsListPins
     */
    boardId: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardsListPins
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BoardsApiboardsListPins
     */
    pageSize?: number
    /**
     * Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
     * Defaults to: undefined
     * @type Array&lt;CreativeType&gt;
     * @memberof BoardsApiboardsListPins
     */
    creativeTypes?: Array<CreativeType>
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardsListPins
     */
    adAccountId?: string
    /**
     * Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Defaults to: false
     * @type boolean
     * @memberof BoardsApiboardsListPins
     */
    pinMetrics?: boolean
}

export interface BoardsApiBoardsUpdateRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof BoardsApiboardsUpdate
     */
    boardId: string
    /**
     * 
     * @type BoardWithUpdatePrivacyUpdate
     * @memberof BoardsApiboardsUpdate
     */
    boardWithUpdatePrivacyUpdate: BoardWithUpdatePrivacyUpdate
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
    public boardSectionsCreateWithHttpInfo(param: BoardsApiBoardSectionsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<BoardSection>> {
        return this.api.boardSectionsCreateWithHttpInfo(param.boardId, param.boardSection, param.adAccountId,  options).toPromise();
    }

    /**
     * Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Create board section
     * @param param the request object
     */
    public boardSectionsCreate(param: BoardsApiBoardSectionsCreateRequest, options?: ConfigurationOptions): Promise<BoardSection> {
        return this.api.boardSectionsCreate(param.boardId, param.boardSection, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Delete board section
     * @param param the request object
     */
    public boardSectionsDeleteWithHttpInfo(param: BoardsApiBoardSectionsDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.boardSectionsDeleteWithHttpInfo(param.boardId, param.sectionId, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Delete board section
     * @param param the request object
     */
    public boardSectionsDelete(param: BoardsApiBoardSectionsDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.boardSectionsDelete(param.boardId, param.sectionId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List board sections
     * @param param the request object
     */
    public boardSectionsListWithHttpInfo(param: BoardsApiBoardSectionsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<BoardSectionsList200Response>> {
        return this.api.boardSectionsListWithHttpInfo(param.boardId, param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List board sections
     * @param param the request object
     */
    public boardSectionsList(param: BoardsApiBoardSectionsListRequest, options?: ConfigurationOptions): Promise<BoardSectionsList200Response> {
        return this.api.boardSectionsList(param.boardId, param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List Pins on board section
     * @param param the request object
     */
    public boardSectionsListPinsWithHttpInfo(param: BoardsApiBoardSectionsListPinsRequest, options?: ConfigurationOptions): Promise<HttpInfo<BoardsListPins200Response>> {
        return this.api.boardSectionsListPinsWithHttpInfo(param.boardId, param.sectionId, param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List Pins on board section
     * @param param the request object
     */
    public boardSectionsListPins(param: BoardsApiBoardSectionsListPinsRequest, options?: ConfigurationOptions): Promise<BoardsListPins200Response> {
        return this.api.boardSectionsListPins(param.boardId, param.sectionId, param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Update board section
     * @param param the request object
     */
    public boardSectionsUpdateWithHttpInfo(param: BoardsApiBoardSectionsUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<BoardSection>> {
        return this.api.boardSectionsUpdateWithHttpInfo(param.boardId, param.sectionId, param.boardSection, param.adAccountId,  options).toPromise();
    }

    /**
     * Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * Update board section
     * @param param the request object
     */
    public boardSectionsUpdate(param: BoardsApiBoardSectionsUpdateRequest, options?: ConfigurationOptions): Promise<BoardSection> {
        return this.api.boardSectionsUpdate(param.boardId, param.sectionId, param.boardSection, param.adAccountId,  options).toPromise();
    }

    /**
     * Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
     * Create board
     * @param param the request object
     */
    public boardsCreateWithHttpInfo(param: BoardsApiBoardsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<Board>> {
        return this.api.boardsCreateWithHttpInfo(param.boardCreate, param.adAccountId,  options).toPromise();
    }

    /**
     * Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
     * Create board
     * @param param the request object
     */
    public boardsCreate(param: BoardsApiBoardsCreateRequest, options?: ConfigurationOptions): Promise<Board> {
        return this.api.boardsCreate(param.boardCreate, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a board owned by the \"operation user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
     * Delete board
     * @param param the request object
     */
    public boardsDeleteWithHttpInfo(param: BoardsApiBoardsDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.boardsDeleteWithHttpInfo(param.boardId, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a board owned by the \"operation user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
     * Delete board
     * @param param the request object
     */
    public boardsDelete(param: BoardsApiBoardsDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.boardsDelete(param.boardId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
     * Get board
     * @param param the request object
     */
    public boardsGetWithHttpInfo(param: BoardsApiBoardsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<Board>> {
        return this.api.boardsGetWithHttpInfo(param.boardId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
     * Get board
     * @param param the request object
     */
    public boardsGet(param: BoardsApiBoardsGetRequest, options?: ConfigurationOptions): Promise<Board> {
        return this.api.boardsGet(param.boardId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
     * List boards
     * @param param the request object
     */
    public boardsListWithHttpInfo(param: BoardsApiBoardsListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<BoardsList200Response>> {
        return this.api.boardsListWithHttpInfo(param.adAccountId, param.privacy, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
     * List boards
     * @param param the request object
     */
    public boardsList(param: BoardsApiBoardsListRequest = {}, options?: ConfigurationOptions): Promise<BoardsList200Response> {
        return this.api.boardsList(param.adAccountId, param.privacy, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List Pins on board
     * @param param the request object
     */
    public boardsListPinsWithHttpInfo(param: BoardsApiBoardsListPinsRequest, options?: ConfigurationOptions): Promise<HttpInfo<BoardsListPins200Response>> {
        return this.api.boardsListPinsWithHttpInfo(param.boardId, param.bookmark, param.pageSize, param.creativeTypes, param.adAccountId, param.pinMetrics,  options).toPromise();
    }

    /**
     * Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
     * List Pins on board
     * @param param the request object
     */
    public boardsListPins(param: BoardsApiBoardsListPinsRequest, options?: ConfigurationOptions): Promise<BoardsListPins200Response> {
        return this.api.boardsListPins(param.boardId, param.bookmark, param.pageSize, param.creativeTypes, param.adAccountId, param.pinMetrics,  options).toPromise();
    }

    /**
     * Update a board owned by the \"operating user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
     * Update board
     * @param param the request object
     */
    public boardsUpdateWithHttpInfo(param: BoardsApiBoardsUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<BoardWithUpdatePrivacy>> {
        return this.api.boardsUpdateWithHttpInfo(param.boardId, param.boardWithUpdatePrivacyUpdate, param.adAccountId,  options).toPromise();
    }

    /**
     * Update a board owned by the \"operating user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
     * Update board
     * @param param the request object
     */
    public boardsUpdate(param: BoardsApiBoardsUpdateRequest, options?: ConfigurationOptions): Promise<BoardWithUpdatePrivacy> {
        return this.api.boardsUpdate(param.boardId, param.boardWithUpdatePrivacyUpdate, param.adAccountId,  options).toPromise();
    }

}

import { ObservableBulkApi } from "./ObservableAPI";
import { BulkApiRequestFactory, BulkApiResponseProcessor} from "../apis/BulkApi";

export interface BulkApiBulkDownloadCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Defaults to: undefined
     * @type string
     * @memberof BulkApibulkRequestGet
     */
    adAccountId: string
    /**
     * Unique identifier of a bulk upsert request.
     * Defaults to: undefined
     * @type string
     * @memberof BulkApibulkRequestGet
     */
    bulkRequestId: string
    /**
     * if set to True then attach the errors/details to all the requests
     * Defaults to: false
     * @type boolean
     * @memberof BulkApibulkRequestGet
     */
    includeDetails?: boolean
}

export interface BulkApiBulkUpsertCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
     * Get advertiser entities in bulk
     * @param param the request object
     */
    public bulkDownloadCreateWithHttpInfo(param: BulkApiBulkDownloadCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<BulkDownloadResponse>> {
        return this.api.bulkDownloadCreateWithHttpInfo(param.adAccountId, param.bulkDownloadRequest,  options).toPromise();
    }

    /**
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
     * Get advertiser entities in bulk
     * @param param the request object
     */
    public bulkDownloadCreate(param: BulkApiBulkDownloadCreateRequest, options?: ConfigurationOptions): Promise<BulkDownloadResponse> {
        return this.api.bulkDownloadCreate(param.adAccountId, param.bulkDownloadRequest,  options).toPromise();
    }

    /**
     * Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
     * Download advertiser entities in bulk
     * @param param the request object
     */
    public bulkRequestGetWithHttpInfo(param: BulkApiBulkRequestGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<BulkUpsertStatusResponse>> {
        return this.api.bulkRequestGetWithHttpInfo(param.adAccountId, param.bulkRequestId, param.includeDetails,  options).toPromise();
    }

    /**
     * Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
     * Download advertiser entities in bulk
     * @param param the request object
     */
    public bulkRequestGet(param: BulkApiBulkRequestGetRequest, options?: ConfigurationOptions): Promise<BulkUpsertStatusResponse> {
        return this.api.bulkRequestGet(param.adAccountId, param.bulkRequestId, param.includeDetails,  options).toPromise();
    }

    /**
     * Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
     * Create/update ad entities in bulk
     * @param param the request object
     */
    public bulkUpsertCreateWithHttpInfo(param: BulkApiBulkUpsertCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<BulkUpsertResponse>> {
        return this.api.bulkUpsertCreateWithHttpInfo(param.adAccountId, param.bulkUpsertRequest,  options).toPromise();
    }

    /**
     * Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
     * Create/update ad entities in bulk
     * @param param the request object
     */
    public bulkUpsertCreate(param: BulkApiBulkUpsertCreateRequest, options?: ConfigurationOptions): Promise<BulkUpsertResponse> {
        return this.api.bulkUpsertCreate(param.adAccountId, param.bulkUpsertRequest,  options).toPromise();
    }

}

import { ObservableBusinessAccessAssetsApi } from "./ObservableAPI";
import { BusinessAccessAssetsApiRequestFactory, BusinessAccessAssetsApiResponseProcessor} from "../apis/BusinessAccessAssetsApi";

export interface BusinessAccessAssetsApiAssetGroupCreateRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApiassetGroupCreate
     */
    businessId: string
    /**
     * 
     * @type CreateAssetGroupBody
     * @memberof BusinessAccessAssetsApiassetGroupCreate
     */
    createAssetGroupBody: CreateAssetGroupBody
}

export interface BusinessAccessAssetsApiAssetGroupDeleteRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApiassetGroupDelete
     */
    businessId: string
    /**
     * 
     * @type DeleteAssetGroupBody
     * @memberof BusinessAccessAssetsApiassetGroupDelete
     */
    deleteAssetGroupBody: DeleteAssetGroupBody
}

export interface BusinessAccessAssetsApiAssetGroupUpdateRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApiassetGroupUpdate
     */
    businessId: string
    /**
     * 
     * @type UpdateAssetGroupBody
     * @memberof BusinessAccessAssetsApiassetGroupUpdate
     */
    updateAssetGroupBody: UpdateAssetGroupBody
}

export interface BusinessAccessAssetsApiBusinessAssetMembersGetRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessAssetMembersGet
     */
    businessId: string
    /**
     * Unique identifier of a business asset.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessAssetMembersGet
     */
    assetId: string
    /**
     * Fetches system users if True. Fetches regular user employees if False.
     * Defaults to: false
     * @type boolean
     * @memberof BusinessAccessAssetsApibusinessAssetMembersGet
     */
    fetchSystemUsers?: boolean
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessAssetMembersGet
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BusinessAccessAssetsApibusinessAssetMembersGet
     */
    pageSize?: number
    /**
     * An index to start fetching the results from. Only the results starting from this index will be returned.
     * Minimum: 0
     * Defaults to: 0
     * @type number
     * @memberof BusinessAccessAssetsApibusinessAssetMembersGet
     */
    startIndex?: number
}

export interface BusinessAccessAssetsApiBusinessAssetPartnersGetRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessAssetPartnersGet
     */
    businessId: string
    /**
     * Unique identifier of a business asset.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessAssetPartnersGet
     */
    assetId: string
    /**
     * An index to start fetching the results from. Only the results starting from this index will be returned.
     * Minimum: 0
     * Defaults to: 0
     * @type number
     * @memberof BusinessAccessAssetsApibusinessAssetPartnersGet
     */
    startIndex?: number
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessAssetPartnersGet
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BusinessAccessAssetsApibusinessAssetPartnersGet
     */
    pageSize?: number
}

export interface BusinessAccessAssetsApiBusinessAssetsGetRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessAssetsGet
     */
    businessId: string
    /**
     * A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
     * Defaults to: undefined
     * @type Array&lt;PermissionsWithOwner&gt;
     * @memberof BusinessAccessAssetsApibusinessAssetsGet
     */
    permissions?: Array<PermissionsWithOwner>
    /**
     * A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessAssetsGet
     */
    childAssetId?: string
    /**
     * An asset group unique identifier. Used to fetch assets contained within the specified asset group.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessAssetsGet
     */
    assetGroupId?: string
    /**
     * A resource type to filter the assets by. Only assets of the specified type will be returned.
     * Defaults to: &#39;AD_ACCOUNT&#39;
     * @type &#39;AD_ACCOUNT&#39; | &#39;PROFILE&#39; | &#39;ASSET_GROUP&#39; | &#39;CATALOG&#39; | &#39;CONSUMER&#39;
     * @memberof BusinessAccessAssetsApibusinessAssetsGet
     */
    assetType?: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'CATALOG' | 'CONSUMER'
    /**
     * An index to start fetching the results from. Only the results starting from this index will be returned.
     * Minimum: 0
     * Defaults to: 0
     * @type number
     * @memberof BusinessAccessAssetsApibusinessAssetsGet
     */
    startIndex?: number
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessAssetsGet
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BusinessAccessAssetsApibusinessAssetsGet
     */
    pageSize?: number
}

export interface BusinessAccessAssetsApiBusinessMemberAssetsGetRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessMemberAssetsGet
     */
    businessId: string
    /**
     * The member id to fetch assets for.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessMemberAssetsGet
     */
    memberId: string
    /**
     * A resource type to filter the assets by. Only assets of the specified type will be returned.
     * Defaults to: &#39;AD_ACCOUNT&#39;
     * @type &#39;AD_ACCOUNT&#39; | &#39;PROFILE&#39; | &#39;ASSET_GROUP&#39; | &#39;CATALOG&#39; | &#39;CONSUMER&#39;
     * @memberof BusinessAccessAssetsApibusinessMemberAssetsGet
     */
    assetType?: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'CATALOG' | 'CONSUMER'
    /**
     * An index to start fetching the results from. Only the results starting from this index will be returned.
     * Minimum: 0
     * Defaults to: 0
     * @type number
     * @memberof BusinessAccessAssetsApibusinessMemberAssetsGet
     */
    startIndex?: number
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessMemberAssetsGet
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BusinessAccessAssetsApibusinessMemberAssetsGet
     */
    pageSize?: number
}

export interface BusinessAccessAssetsApiBusinessMembersAssetAccessDeleteRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessMembersAssetAccessDelete
     */
    businessId: string
    /**
     * List member assset permissions to delete.
     * @type BusinessMembersAssetAccessDeleteRequest
     * @memberof BusinessAccessAssetsApibusinessMembersAssetAccessDelete
     */
    businessMembersAssetAccessDeleteRequest: BusinessMembersAssetAccessDeleteRequest
}

export interface BusinessAccessAssetsApiBusinessMembersAssetAccessUpdateRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessMembersAssetAccessUpdate
     */
    businessId: string
    /**
     * List of member asset permissions to create or update.
     * @type UpdateMemberAssetAccessBody
     * @memberof BusinessAccessAssetsApibusinessMembersAssetAccessUpdate
     */
    updateMemberAssetAccessBody: UpdateMemberAssetAccessBody
}

export interface BusinessAccessAssetsApiBusinessPartnerAssetAccessGetRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessPartnerAssetAccessGet
     */
    businessId: string
    /**
     * The partner id to be bound to the Business
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessPartnerAssetAccessGet
     */
    partnerId: string
    /**
     * Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner\&#39;s business asset.
     * Defaults to: undefined
     * @type PartnerType
     * @memberof BusinessAccessAssetsApibusinessPartnerAssetAccessGet
     */
    partnerType?: PartnerType
    /**
     * A resource type to filter the assets by. Only assets of the specified type will be returned.
     * Defaults to: &#39;AD_ACCOUNT&#39;
     * @type &#39;AD_ACCOUNT&#39; | &#39;PROFILE&#39; | &#39;ASSET_GROUP&#39; | &#39;CATALOG&#39; | &#39;CONSUMER&#39;
     * @memberof BusinessAccessAssetsApibusinessPartnerAssetAccessGet
     */
    assetType?: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'CATALOG' | 'CONSUMER'
    /**
     * An index to start fetching the results from. Only the results starting from this index will be returned.
     * Minimum: 0
     * Defaults to: 0
     * @type number
     * @memberof BusinessAccessAssetsApibusinessPartnerAssetAccessGet
     */
    startIndex?: number
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BusinessAccessAssetsApibusinessPartnerAssetAccessGet
     */
    pageSize?: number
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApibusinessPartnerAssetAccessGet
     */
    bookmark?: string
}

export interface BusinessAccessAssetsApiDeletePartnerAssetAccessHandlerImplRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApideletePartnerAssetAccessHandlerImpl
     */
    businessId: string
    /**
     * 
     * @type DeletePartnerAssetAccessBody
     * @memberof BusinessAccessAssetsApideletePartnerAssetAccessHandlerImpl
     */
    deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody
}

export interface BusinessAccessAssetsApiUpdatePartnerAssetAccessHandlerImplRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessAssetsApiupdatePartnerAssetAccessHandlerImpl
     */
    businessId: string
    /**
     * A list of assets and permissions to assign to your partners.
     * @type UpdatePartnerAssetAccessBody
     * @memberof BusinessAccessAssetsApiupdatePartnerAssetAccessHandlerImpl
     */
    updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody
}

export class ObjectBusinessAccessAssetsApi {
    private api: ObservableBusinessAccessAssetsApi

    public constructor(configuration: Configuration, requestFactory?: BusinessAccessAssetsApiRequestFactory, responseProcessor?: BusinessAccessAssetsApiResponseProcessor) {
        this.api = new ObservableBusinessAccessAssetsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.
     * Create a new asset group.
     * @param param the request object
     */
    public assetGroupCreateWithHttpInfo(param: BusinessAccessAssetsApiAssetGroupCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<CreateAssetGroupResponse>> {
        return this.api.assetGroupCreateWithHttpInfo(param.businessId, param.createAssetGroupBody,  options).toPromise();
    }

    /**
     * Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.
     * Create a new asset group.
     * @param param the request object
     */
    public assetGroupCreate(param: BusinessAccessAssetsApiAssetGroupCreateRequest, options?: ConfigurationOptions): Promise<CreateAssetGroupResponse> {
        return this.api.assetGroupCreate(param.businessId, param.createAssetGroupBody,  options).toPromise();
    }

    /**
     * Delete a batch of asset groups.
     * Delete asset groups.
     * @param param the request object
     */
    public assetGroupDeleteWithHttpInfo(param: BusinessAccessAssetsApiAssetGroupDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<DeleteAssetGroupResponse>> {
        return this.api.assetGroupDeleteWithHttpInfo(param.businessId, param.deleteAssetGroupBody,  options).toPromise();
    }

    /**
     * Delete a batch of asset groups.
     * Delete asset groups.
     * @param param the request object
     */
    public assetGroupDelete(param: BusinessAccessAssetsApiAssetGroupDeleteRequest, options?: ConfigurationOptions): Promise<DeleteAssetGroupResponse> {
        return this.api.assetGroupDelete(param.businessId, param.deleteAssetGroupBody,  options).toPromise();
    }

    /**
     * Update a batch of asset groups with the specified parameters.
     * Update asset groups.
     * @param param the request object
     */
    public assetGroupUpdateWithHttpInfo(param: BusinessAccessAssetsApiAssetGroupUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<UpdateAssetGroupResponse>> {
        return this.api.assetGroupUpdateWithHttpInfo(param.businessId, param.updateAssetGroupBody,  options).toPromise();
    }

    /**
     * Update a batch of asset groups with the specified parameters.
     * Update asset groups.
     * @param param the request object
     */
    public assetGroupUpdate(param: BusinessAccessAssetsApiAssetGroupUpdateRequest, options?: ConfigurationOptions): Promise<UpdateAssetGroupResponse> {
        return this.api.assetGroupUpdate(param.businessId, param.updateAssetGroupBody,  options).toPromise();
    }

    /**
     * Get all the members the requesting business has granted access to on the given asset.
     * Get members with access to asset
     * @param param the request object
     */
    public businessAssetMembersGetWithHttpInfo(param: BusinessAccessAssetsApiBusinessAssetMembersGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<BusinessAssetMembersGet200Response>> {
        return this.api.businessAssetMembersGetWithHttpInfo(param.businessId, param.assetId, param.fetchSystemUsers, param.bookmark, param.pageSize, param.startIndex,  options).toPromise();
    }

    /**
     * Get all the members the requesting business has granted access to on the given asset.
     * Get members with access to asset
     * @param param the request object
     */
    public businessAssetMembersGet(param: BusinessAccessAssetsApiBusinessAssetMembersGetRequest, options?: ConfigurationOptions): Promise<BusinessAssetMembersGet200Response> {
        return this.api.businessAssetMembersGet(param.businessId, param.assetId, param.fetchSystemUsers, param.bookmark, param.pageSize, param.startIndex,  options).toPromise();
    }

    /**
     * Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
     * Get partners with access to asset
     * @param param the request object
     */
    public businessAssetPartnersGetWithHttpInfo(param: BusinessAccessAssetsApiBusinessAssetPartnersGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<BusinessAssetPartnersGet200Response>> {
        return this.api.businessAssetPartnersGetWithHttpInfo(param.businessId, param.assetId, param.startIndex, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
     * Get partners with access to asset
     * @param param the request object
     */
    public businessAssetPartnersGet(param: BusinessAccessAssetsApiBusinessAssetPartnersGetRequest, options?: ConfigurationOptions): Promise<BusinessAssetPartnersGet200Response> {
        return this.api.businessAssetPartnersGet(param.businessId, param.assetId, param.startIndex, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
     * List business assets
     * @param param the request object
     */
    public businessAssetsGetWithHttpInfo(param: BusinessAccessAssetsApiBusinessAssetsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<BusinessAssetsGet200Response>> {
        return this.api.businessAssetsGetWithHttpInfo(param.businessId, param.permissions, param.childAssetId, param.assetGroupId, param.assetType, param.startIndex, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
     * List business assets
     * @param param the request object
     */
    public businessAssetsGet(param: BusinessAccessAssetsApiBusinessAssetsGetRequest, options?: ConfigurationOptions): Promise<BusinessAssetsGet200Response> {
        return this.api.businessAssetsGet(param.businessId, param.permissions, param.childAssetId, param.assetGroupId, param.assetType, param.startIndex, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
     * Get assets assigned to a member
     * @param param the request object
     */
    public businessMemberAssetsGetWithHttpInfo(param: BusinessAccessAssetsApiBusinessMemberAssetsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<BusinessMemberAssetsGet200Response>> {
        return this.api.businessMemberAssetsGetWithHttpInfo(param.businessId, param.memberId, param.assetType, param.startIndex, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
     * Get assets assigned to a member
     * @param param the request object
     */
    public businessMemberAssetsGet(param: BusinessAccessAssetsApiBusinessMemberAssetsGetRequest, options?: ConfigurationOptions): Promise<BusinessMemberAssetsGet200Response> {
        return this.api.businessMemberAssetsGet(param.businessId, param.memberId, param.assetType, param.startIndex, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Terminate multiple members\' access to an asset.
     * Delete member access to asset
     * @param param the request object
     */
    public businessMembersAssetAccessDeleteWithHttpInfo(param: BusinessAccessAssetsApiBusinessMembersAssetAccessDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<DeleteMemberAccessResultsResponseArray>> {
        return this.api.businessMembersAssetAccessDeleteWithHttpInfo(param.businessId, param.businessMembersAssetAccessDeleteRequest,  options).toPromise();
    }

    /**
     * Terminate multiple members\' access to an asset.
     * Delete member access to asset
     * @param param the request object
     */
    public businessMembersAssetAccessDelete(param: BusinessAccessAssetsApiBusinessMembersAssetAccessDeleteRequest, options?: ConfigurationOptions): Promise<DeleteMemberAccessResultsResponseArray> {
        return this.api.businessMembersAssetAccessDelete(param.businessId, param.businessMembersAssetAccessDeleteRequest,  options).toPromise();
    }

    /**
     * Grant multiple members access to assets and/or update multiple member\'s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
     * Assign/Update member asset permissions
     * @param param the request object
     */
    public businessMembersAssetAccessUpdateWithHttpInfo(param: BusinessAccessAssetsApiBusinessMembersAssetAccessUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<UpdateMemberAssetsResultsResponseArray>> {
        return this.api.businessMembersAssetAccessUpdateWithHttpInfo(param.businessId, param.updateMemberAssetAccessBody,  options).toPromise();
    }

    /**
     * Grant multiple members access to assets and/or update multiple member\'s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
     * Assign/Update member asset permissions
     * @param param the request object
     */
    public businessMembersAssetAccessUpdate(param: BusinessAccessAssetsApiBusinessMembersAssetAccessUpdateRequest, options?: ConfigurationOptions): Promise<UpdateMemberAssetsResultsResponseArray> {
        return this.api.businessMembersAssetAccessUpdate(param.businessId, param.updateMemberAssetAccessBody,  options).toPromise();
    }

    /**
     * Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner\'s business assets that the partner has granted you access to.
     * Get assets assigned to a partner or assets assigned by a partner
     * @param param the request object
     */
    public businessPartnerAssetAccessGetWithHttpInfo(param: BusinessAccessAssetsApiBusinessPartnerAssetAccessGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<BusinessPartnerAssetAccessGet200Response>> {
        return this.api.businessPartnerAssetAccessGetWithHttpInfo(param.businessId, param.partnerId, param.partnerType, param.assetType, param.startIndex, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner\'s business assets that the partner has granted you access to.
     * Get assets assigned to a partner or assets assigned by a partner
     * @param param the request object
     */
    public businessPartnerAssetAccessGet(param: BusinessAccessAssetsApiBusinessPartnerAssetAccessGetRequest, options?: ConfigurationOptions): Promise<BusinessPartnerAssetAccessGet200Response> {
        return this.api.businessPartnerAssetAccessGet(param.businessId, param.partnerId, param.partnerType, param.assetType, param.startIndex, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * Terminate multiple partners\' access to an asset. If - partner_type=INTERNAL: You will terminate a partner\'s asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner\'s business assets.
     * Delete partner access to asset
     * @param param the request object
     */
    public deletePartnerAssetAccessHandlerImplWithHttpInfo(param: BusinessAccessAssetsApiDeletePartnerAssetAccessHandlerImplRequest, options?: ConfigurationOptions): Promise<HttpInfo<DeletePartnerAssetsResultsResponseArray>> {
        return this.api.deletePartnerAssetAccessHandlerImplWithHttpInfo(param.businessId, param.deletePartnerAssetAccessBody,  options).toPromise();
    }

    /**
     * Terminate multiple partners\' access to an asset. If - partner_type=INTERNAL: You will terminate a partner\'s asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner\'s business assets.
     * Delete partner access to asset
     * @param param the request object
     */
    public deletePartnerAssetAccessHandlerImpl(param: BusinessAccessAssetsApiDeletePartnerAssetAccessHandlerImplRequest, options?: ConfigurationOptions): Promise<DeletePartnerAssetsResultsResponseArray> {
        return this.api.deletePartnerAssetAccessHandlerImpl(param.businessId, param.deletePartnerAssetAccessBody,  options).toPromise();
    }

    /**
     * Grant multiple partners access to assets and/or update multiple partner\'s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
     * Assign/Update partner asset permissions
     * @param param the request object
     */
    public updatePartnerAssetAccessHandlerImplWithHttpInfo(param: BusinessAccessAssetsApiUpdatePartnerAssetAccessHandlerImplRequest, options?: ConfigurationOptions): Promise<HttpInfo<UpdatePartnerAssetsResultsResponseArray>> {
        return this.api.updatePartnerAssetAccessHandlerImplWithHttpInfo(param.businessId, param.updatePartnerAssetAccessBody,  options).toPromise();
    }

    /**
     * Grant multiple partners access to assets and/or update multiple partner\'s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
     * Assign/Update partner asset permissions
     * @param param the request object
     */
    public updatePartnerAssetAccessHandlerImpl(param: BusinessAccessAssetsApiUpdatePartnerAssetAccessHandlerImplRequest, options?: ConfigurationOptions): Promise<UpdatePartnerAssetsResultsResponseArray> {
        return this.api.updatePartnerAssetAccessHandlerImpl(param.businessId, param.updatePartnerAssetAccessBody,  options).toPromise();
    }

}

import { ObservableBusinessAccessInviteApi } from "./ObservableAPI";
import { BusinessAccessInviteApiRequestFactory, BusinessAccessInviteApiResponseProcessor} from "../apis/BusinessAccessInviteApi";

export interface BusinessAccessInviteApiAssetAccessRequestsCreateRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessInviteApiassetAccessRequestsCreate
     */
    businessId: string
    /**
     * 
     * @type CreateAssetAccessRequestBody
     * @memberof BusinessAccessInviteApiassetAccessRequestsCreate
     */
    createAssetAccessRequestBody: CreateAssetAccessRequestBody
}

export interface BusinessAccessInviteApiCancelInvitesOrRequestsRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessInviteApicancelInvitesOrRequests
     */
    businessId: string
    /**
     * A list with invite ids
     * @type CancelInvitesBody
     * @memberof BusinessAccessInviteApicancelInvitesOrRequests
     */
    cancelInvitesBody: CancelInvitesBody
}

export interface BusinessAccessInviteApiCreateAssetInvitesRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessInviteApicreateAssetInvites
     */
    businessId: string
    /**
     * A list of invites/requests together with the asset permissions to be assigned to the invite/request. 
     * @type CreateAssetInvitesRequest
     * @memberof BusinessAccessInviteApicreateAssetInvites
     */
    createAssetInvitesRequest: CreateAssetInvitesRequest
}

export interface BusinessAccessInviteApiCreateMembershipOrPartnershipInvitesRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessInviteApicreateMembershipOrPartnershipInvites
     */
    businessId: string
    /**
     * An object with the properties: invite_type, partners, members, business_role
     * @type CreateMembershipOrPartnershipInvitesBody
     * @memberof BusinessAccessInviteApicreateMembershipOrPartnershipInvites
     */
    createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody
}

export interface BusinessAccessInviteApiGetInvitesRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessInviteApigetInvites
     */
    businessId: string
    /**
     * A boolean field to indicate whether the invite is to create a partnership or a membership.
     * Defaults to: true
     * @type boolean
     * @memberof BusinessAccessInviteApigetInvites
     */
    isMember?: boolean
    /**
     * A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
     * Defaults to: undefined
     * @type Array&lt;&#39;PENDING&#39; | &#39;EXPIRED&#39;&gt;
     * @memberof BusinessAccessInviteApigetInvites
     */
    inviteStatus?: Array<'PENDING' | 'EXPIRED'>
    /**
     * Invite type to filter invites by. Only invites of the specified type will be returned.
     * Defaults to: undefined
     * @type InviteType
     * @memberof BusinessAccessInviteApigetInvites
     */
    inviteType?: InviteType
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessInviteApigetInvites
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BusinessAccessInviteApigetInvites
     */
    pageSize?: number
}

export interface BusinessAccessInviteApiRespondBusinessAccessInvitesRequest {
    /**
     * 
     * @type AuthRespondInvitesBody
     * @memberof BusinessAccessInviteApirespondBusinessAccessInvites
     */
    authRespondInvitesBody: AuthRespondInvitesBody
}

export class ObjectBusinessAccessInviteApi {
    private api: ObservableBusinessAccessInviteApi

    public constructor(configuration: Configuration, requestFactory?: BusinessAccessInviteApiRequestFactory, responseProcessor?: BusinessAccessInviteApiResponseProcessor) {
        this.api = new ObservableBusinessAccessInviteApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create a request to access an existing partner\'s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
     * Create a request to access an existing partner\'s assets.
     * @param param the request object
     */
    public assetAccessRequestsCreateWithHttpInfo(param: BusinessAccessInviteApiAssetAccessRequestsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<CreateAssetAccessRequestResponse>> {
        return this.api.assetAccessRequestsCreateWithHttpInfo(param.businessId, param.createAssetAccessRequestBody,  options).toPromise();
    }

    /**
     * Create a request to access an existing partner\'s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
     * Create a request to access an existing partner\'s assets.
     * @param param the request object
     */
    public assetAccessRequestsCreate(param: BusinessAccessInviteApiAssetAccessRequestsCreateRequest, options?: ConfigurationOptions): Promise<CreateAssetAccessRequestResponse> {
        return this.api.assetAccessRequestsCreate(param.businessId, param.createAssetAccessRequestBody,  options).toPromise();
    }

    /**
     * Cancel membership/partnership invites and/or requests.
     * Cancel invites/requests
     * @param param the request object
     */
    public cancelInvitesOrRequestsWithHttpInfo(param: BusinessAccessInviteApiCancelInvitesOrRequestsRequest, options?: ConfigurationOptions): Promise<HttpInfo<DeleteInvitesResultsResponseArray>> {
        return this.api.cancelInvitesOrRequestsWithHttpInfo(param.businessId, param.cancelInvitesBody,  options).toPromise();
    }

    /**
     * Cancel membership/partnership invites and/or requests.
     * Cancel invites/requests
     * @param param the request object
     */
    public cancelInvitesOrRequests(param: BusinessAccessInviteApiCancelInvitesOrRequestsRequest, options?: ConfigurationOptions): Promise<DeleteInvitesResultsResponseArray> {
        return this.api.cancelInvitesOrRequests(param.businessId, param.cancelInvitesBody,  options).toPromise();
    }

    /**
     * Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner\'s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner\'s assets\" to request access to your   partner\'s assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
     * Update invite/request with an asset permission
     * @param param the request object
     */
    public createAssetInvitesWithHttpInfo(param: BusinessAccessInviteApiCreateAssetInvitesRequest, options?: ConfigurationOptions): Promise<HttpInfo<UpdateInvitesResultsResponseArray>> {
        return this.api.createAssetInvitesWithHttpInfo(param.businessId, param.createAssetInvitesRequest,  options).toPromise();
    }

    /**
     * Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner\'s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner\'s assets\" to request access to your   partner\'s assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
     * Update invite/request with an asset permission
     * @param param the request object
     */
    public createAssetInvites(param: BusinessAccessInviteApiCreateAssetInvitesRequest, options?: ConfigurationOptions): Promise<UpdateInvitesResultsResponseArray> {
        return this.api.createAssetInvites(param.businessId, param.createAssetInvitesRequest,  options).toPromise();
    }

    /**
     * Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners
     * Create invites or requests
     * @param param the request object
     */
    public createMembershipOrPartnershipInvitesWithHttpInfo(param: BusinessAccessInviteApiCreateMembershipOrPartnershipInvitesRequest, options?: ConfigurationOptions): Promise<HttpInfo<CreateInvitesResultsResponseArray>> {
        return this.api.createMembershipOrPartnershipInvitesWithHttpInfo(param.businessId, param.createMembershipOrPartnershipInvitesBody,  options).toPromise();
    }

    /**
     * Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners
     * Create invites or requests
     * @param param the request object
     */
    public createMembershipOrPartnershipInvites(param: BusinessAccessInviteApiCreateMembershipOrPartnershipInvitesRequest, options?: ConfigurationOptions): Promise<CreateInvitesResultsResponseArray> {
        return this.api.createMembershipOrPartnershipInvites(param.businessId, param.createMembershipOrPartnershipInvitesBody,  options).toPromise();
    }

    /**
     * Get the membership/partnership invites and/or requests for the authorized user.
     * Get invites/requests
     * @param param the request object
     */
    public getInvitesWithHttpInfo(param: BusinessAccessInviteApiGetInvitesRequest, options?: ConfigurationOptions): Promise<HttpInfo<GetInvites200Response>> {
        return this.api.getInvitesWithHttpInfo(param.businessId, param.isMember, param.inviteStatus, param.inviteType, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get the membership/partnership invites and/or requests for the authorized user.
     * Get invites/requests
     * @param param the request object
     */
    public getInvites(param: BusinessAccessInviteApiGetInvitesRequest, options?: ConfigurationOptions): Promise<GetInvites200Response> {
        return this.api.getInvites(param.businessId, param.isMember, param.inviteStatus, param.inviteType, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Accept or decline invites or requests.
     * Accept or decline an invite/request
     * @param param the request object
     */
    public respondBusinessAccessInvitesWithHttpInfo(param: BusinessAccessInviteApiRespondBusinessAccessInvitesRequest, options?: ConfigurationOptions): Promise<HttpInfo<RespondToInvitesResponseArray>> {
        return this.api.respondBusinessAccessInvitesWithHttpInfo(param.authRespondInvitesBody,  options).toPromise();
    }

    /**
     * Accept or decline invites or requests.
     * Accept or decline an invite/request
     * @param param the request object
     */
    public respondBusinessAccessInvites(param: BusinessAccessInviteApiRespondBusinessAccessInvitesRequest, options?: ConfigurationOptions): Promise<RespondToInvitesResponseArray> {
        return this.api.respondBusinessAccessInvites(param.authRespondInvitesBody,  options).toPromise();
    }

}

import { ObservableBusinessAccessRelationshipsApi } from "./ObservableAPI";
import { BusinessAccessRelationshipsApiRequestFactory, BusinessAccessRelationshipsApiResponseProcessor} from "../apis/BusinessAccessRelationshipsApi";

export interface BusinessAccessRelationshipsApiBrandAccountsCreateRequest {
    /**
     * business hierarchy node id
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessRelationshipsApibrandAccountsCreate
     */
    businessHierarchyId: string
    /**
     * 
     * @type BrandAccountsCreateRequest
     * @memberof BusinessAccessRelationshipsApibrandAccountsCreate
     */
    brandAccountsCreateRequest: BrandAccountsCreateRequest
}

export interface BusinessAccessRelationshipsApiBrandAccountsUpdateRequest {
    /**
     * business hierarchy node id
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessRelationshipsApibrandAccountsUpdate
     */
    businessHierarchyId: string
    /**
     * Unique identifier of a brand account.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessRelationshipsApibrandAccountsUpdate
     */
    brandAccountId: string
    /**
     * 
     * @type BrandAccountsUpdateRequest
     * @memberof BusinessAccessRelationshipsApibrandAccountsUpdate
     */
    brandAccountsUpdateRequest: BrandAccountsUpdateRequest
}

export interface BusinessAccessRelationshipsApiDeleteBusinessMembershipRequest {
    /**
     * Business id
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessRelationshipsApideleteBusinessMembership
     */
    businessId: string
    /**
     * List of members with role to delete.
     * @type MembersToDeleteBody
     * @memberof BusinessAccessRelationshipsApideleteBusinessMembership
     */
    membersToDeleteBody: MembersToDeleteBody
}

export interface BusinessAccessRelationshipsApiDeleteBusinessPartnersRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessRelationshipsApideleteBusinessPartners
     */
    businessId: string
    /**
     * An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete. 
     * @type DeletePartnersRequest
     * @memberof BusinessAccessRelationshipsApideleteBusinessPartners
     */
    deletePartnersRequest: DeletePartnersRequest
}

export interface BusinessAccessRelationshipsApiGetBusinessEmployersRequest {
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BusinessAccessRelationshipsApigetBusinessEmployers
     */
    pageSize?: number
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessRelationshipsApigetBusinessEmployers
     */
    bookmark?: string
}

export interface BusinessAccessRelationshipsApiGetBusinessMembersRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessRelationshipsApigetBusinessMembers
     */
    businessId: string
    /**
     * Fetches system users if True. Fetches regular user employees if False.
     * Defaults to: false
     * @type boolean
     * @memberof BusinessAccessRelationshipsApigetBusinessMembers
     */
    fetchSystemUsers?: boolean
    /**
     * Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
     * Defaults to: false
     * @type boolean
     * @memberof BusinessAccessRelationshipsApigetBusinessMembers
     */
    assetsSummary?: boolean
    /**
     * A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
     * Defaults to: undefined
     * @type Array&lt;MemberBusinessRole&gt;
     * @memberof BusinessAccessRelationshipsApigetBusinessMembers
     */
    businessRoles?: Array<MemberBusinessRole>
    /**
     * A list of business members ids separated by comma.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessRelationshipsApigetBusinessMembers
     */
    memberIds?: string
    /**
     * An index to start fetching the results from. Only the results starting from this index will be returned.
     * Minimum: 0
     * Defaults to: 0
     * @type number
     * @memberof BusinessAccessRelationshipsApigetBusinessMembers
     */
    startIndex?: number
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessRelationshipsApigetBusinessMembers
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BusinessAccessRelationshipsApigetBusinessMembers
     */
    pageSize?: number
}

export interface BusinessAccessRelationshipsApiGetBusinessPartnersRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessRelationshipsApigetBusinessPartners
     */
    businessId: string
    /**
     * Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
     * Defaults to: false
     * @type boolean
     * @memberof BusinessAccessRelationshipsApigetBusinessPartners
     */
    assetsSummary?: boolean
    /**
     * Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner\&#39;s business asset.
     * Defaults to: undefined
     * @type PartnerType
     * @memberof BusinessAccessRelationshipsApigetBusinessPartners
     */
    partnerType?: PartnerType
    /**
     * A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessRelationshipsApigetBusinessPartners
     */
    partnerIds?: string
    /**
     * An index to start fetching the results from. Only the results starting from this index will be returned.
     * Minimum: 0
     * Defaults to: 0
     * @type number
     * @memberof BusinessAccessRelationshipsApigetBusinessPartners
     */
    startIndex?: number
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof BusinessAccessRelationshipsApigetBusinessPartners
     */
    pageSize?: number
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessRelationshipsApigetBusinessPartners
     */
    bookmark?: string
}

export interface BusinessAccessRelationshipsApiSystemUserUpdateRequest {
    /**
     * Unique identifier of the requesting business.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessRelationshipsApisystemUserUpdate
     */
    businessId: string
    /**
     * Unique identifier of a system user.
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessRelationshipsApisystemUserUpdate
     */
    systemUserId: string
    /**
     * 
     * @type SystemUserUpdateRequest
     * @memberof BusinessAccessRelationshipsApisystemUserUpdate
     */
    systemUserUpdateRequest: SystemUserUpdateRequest
}

export interface BusinessAccessRelationshipsApiUpdateBusinessMembershipsRequest {
    /**
     * Business id
     * Defaults to: undefined
     * @type string
     * @memberof BusinessAccessRelationshipsApiupdateBusinessMemberships
     */
    businessId: string
    /**
     * List of objects with the member id and the business_role.
     * @type Array&lt;UpdateMemberBusinessRoleBody&gt;
     * @memberof BusinessAccessRelationshipsApiupdateBusinessMemberships
     */
    updateMemberBusinessRoleBody: Array<UpdateMemberBusinessRoleBody>
}

export class ObjectBusinessAccessRelationshipsApi {
    private api: ObservableBusinessAccessRelationshipsApi

    public constructor(configuration: Configuration, requestFactory?: BusinessAccessRelationshipsApiRequestFactory, responseProcessor?: BusinessAccessRelationshipsApiResponseProcessor) {
        this.api = new ObservableBusinessAccessRelationshipsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
     * Create a Brand Account
     * @param param the request object
     */
    public brandAccountsCreateWithHttpInfo(param: BusinessAccessRelationshipsApiBrandAccountsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<BrandAccountsCreate200Response>> {
        return this.api.brandAccountsCreateWithHttpInfo(param.businessHierarchyId, param.brandAccountsCreateRequest,  options).toPromise();
    }

    /**
     * Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
     * Create a Brand Account
     * @param param the request object
     */
    public brandAccountsCreate(param: BusinessAccessRelationshipsApiBrandAccountsCreateRequest, options?: ConfigurationOptions): Promise<BrandAccountsCreate200Response> {
        return this.api.brandAccountsCreate(param.businessHierarchyId, param.brandAccountsCreateRequest,  options).toPromise();
    }

    /**
     * Update an existing Brand Account
     * Update a Brand Account
     * @param param the request object
     */
    public brandAccountsUpdateWithHttpInfo(param: BusinessAccessRelationshipsApiBrandAccountsUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<BrandAccountsCreate200Response>> {
        return this.api.brandAccountsUpdateWithHttpInfo(param.businessHierarchyId, param.brandAccountId, param.brandAccountsUpdateRequest,  options).toPromise();
    }

    /**
     * Update an existing Brand Account
     * Update a Brand Account
     * @param param the request object
     */
    public brandAccountsUpdate(param: BusinessAccessRelationshipsApiBrandAccountsUpdateRequest, options?: ConfigurationOptions): Promise<BrandAccountsCreate200Response> {
        return this.api.brandAccountsUpdate(param.businessHierarchyId, param.brandAccountId, param.brandAccountsUpdateRequest,  options).toPromise();
    }

    /**
     * Terminate memberships between the specified members and your business.
     * Terminate business memberships
     * @param param the request object
     */
    public deleteBusinessMembershipWithHttpInfo(param: BusinessAccessRelationshipsApiDeleteBusinessMembershipRequest, options?: ConfigurationOptions): Promise<HttpInfo<DeletedMembersResponse>> {
        return this.api.deleteBusinessMembershipWithHttpInfo(param.businessId, param.membersToDeleteBody,  options).toPromise();
    }

    /**
     * Terminate memberships between the specified members and your business.
     * Terminate business memberships
     * @param param the request object
     */
    public deleteBusinessMembership(param: BusinessAccessRelationshipsApiDeleteBusinessMembershipRequest, options?: ConfigurationOptions): Promise<DeletedMembersResponse> {
        return this.api.deleteBusinessMembership(param.businessId, param.membersToDeleteBody,  options).toPromise();
    }

    /**
     * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
     * Terminate business partnerships
     * @param param the request object
     */
    public deleteBusinessPartnersWithHttpInfo(param: BusinessAccessRelationshipsApiDeleteBusinessPartnersRequest, options?: ConfigurationOptions): Promise<HttpInfo<DeletePartnersResponse>> {
        return this.api.deleteBusinessPartnersWithHttpInfo(param.businessId, param.deletePartnersRequest,  options).toPromise();
    }

    /**
     * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
     * Terminate business partnerships
     * @param param the request object
     */
    public deleteBusinessPartners(param: BusinessAccessRelationshipsApiDeleteBusinessPartnersRequest, options?: ConfigurationOptions): Promise<DeletePartnersResponse> {
        return this.api.deleteBusinessPartners(param.businessId, param.deletePartnersRequest,  options).toPromise();
    }

    /**
     * Get all of the viewing user\'s business employers.
     * List business employers for user
     * @param param the request object
     */
    public getBusinessEmployersWithHttpInfo(param: BusinessAccessRelationshipsApiGetBusinessEmployersRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<GetBusinessEmployers200Response>> {
        return this.api.getBusinessEmployersWithHttpInfo(param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * Get all of the viewing user\'s business employers.
     * List business employers for user
     * @param param the request object
     */
    public getBusinessEmployers(param: BusinessAccessRelationshipsApiGetBusinessEmployersRequest = {}, options?: ConfigurationOptions): Promise<GetBusinessEmployers200Response> {
        return this.api.getBusinessEmployers(param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * Get all members of the specified business. The return response will include the member\'s business_role and assets they have access to if assets_summary=TRUE
     * Get business members
     * @param param the request object
     */
    public getBusinessMembersWithHttpInfo(param: BusinessAccessRelationshipsApiGetBusinessMembersRequest, options?: ConfigurationOptions): Promise<HttpInfo<GetBusinessMembers200Response>> {
        return this.api.getBusinessMembersWithHttpInfo(param.businessId, param.fetchSystemUsers, param.assetsSummary, param.businessRoles, param.memberIds, param.startIndex, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get all members of the specified business. The return response will include the member\'s business_role and assets they have access to if assets_summary=TRUE
     * Get business members
     * @param param the request object
     */
    public getBusinessMembers(param: BusinessAccessRelationshipsApiGetBusinessMembersRequest, options?: ConfigurationOptions): Promise<GetBusinessMembers200Response> {
        return this.api.getBusinessMembers(param.businessId, param.fetchSystemUsers, param.assetsSummary, param.businessRoles, param.memberIds, param.startIndex, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner\'s business assets the partner has granted you   access to.
     * Get business partners
     * @param param the request object
     */
    public getBusinessPartnersWithHttpInfo(param: BusinessAccessRelationshipsApiGetBusinessPartnersRequest, options?: ConfigurationOptions): Promise<HttpInfo<GetBusinessPartners200Response>> {
        return this.api.getBusinessPartnersWithHttpInfo(param.businessId, param.assetsSummary, param.partnerType, param.partnerIds, param.startIndex, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner\'s business assets the partner has granted you   access to.
     * Get business partners
     * @param param the request object
     */
    public getBusinessPartners(param: BusinessAccessRelationshipsApiGetBusinessPartnersRequest, options?: ConfigurationOptions): Promise<GetBusinessPartners200Response> {
        return this.api.getBusinessPartners(param.businessId, param.assetsSummary, param.partnerType, param.partnerIds, param.startIndex, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * Update a system user information such as name.
     * Update a system user information.
     * @param param the request object
     */
    public systemUserUpdateWithHttpInfo(param: BusinessAccessRelationshipsApiSystemUserUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.systemUserUpdateWithHttpInfo(param.businessId, param.systemUserId, param.systemUserUpdateRequest,  options).toPromise();
    }

    /**
     * Update a system user information such as name.
     * Update a system user information.
     * @param param the request object
     */
    public systemUserUpdate(param: BusinessAccessRelationshipsApiSystemUserUpdateRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.systemUserUpdate(param.businessId, param.systemUserId, param.systemUserUpdateRequest,  options).toPromise();
    }

    /**
     * Update a member\'s business role within the business.
     * Update member\'s business role
     * @param param the request object
     */
    public updateBusinessMembershipsWithHttpInfo(param: BusinessAccessRelationshipsApiUpdateBusinessMembershipsRequest, options?: ConfigurationOptions): Promise<HttpInfo<UpdateMemberResultsResponseArray>> {
        return this.api.updateBusinessMembershipsWithHttpInfo(param.businessId, param.updateMemberBusinessRoleBody,  options).toPromise();
    }

    /**
     * Update a member\'s business role within the business.
     * Update member\'s business role
     * @param param the request object
     */
    public updateBusinessMemberships(param: BusinessAccessRelationshipsApiUpdateBusinessMembershipsRequest, options?: ConfigurationOptions): Promise<UpdateMemberResultsResponseArray> {
        return this.api.updateBusinessMemberships(param.businessId, param.updateMemberBusinessRoleBody,  options).toPromise();
    }

}

import { ObservableCampaignsApi } from "./ObservableAPI";
import { CampaignsApiRequestFactory, CampaignsApiResponseProcessor} from "../apis/CampaignsApi";

export interface CampaignsApiAdPinsAnalyticsRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CampaignsApiadPinsAnalytics
     */
    adAccountId: string
    /**
     * Campaign Id to use to filter the results.
     * Defaults to: undefined
     * @type string
     * @memberof CampaignsApiadPinsAnalytics
     */
    campaignId: string
    /**
     * List of Pin IDs.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof CampaignsApiadPinsAnalytics
     */
    pinIds: Array<string>
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * Defaults to: undefined
     * @type string
     * @memberof CampaignsApiadPinsAnalytics
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * Defaults to: undefined
     * @type string
     * @memberof CampaignsApiadPinsAnalytics
     */
    endDate: string
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * Defaults to: undefined
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;OUTBOUND_CTR_1&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;CAMPAIGN_BRAND_LABEL&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_NAME&#39; | &#39;AD_GROUP_BUDGET_TYPE&#39; | &#39;AD_GROUP_BUDGET_IN_LOCAL_CURRENCY&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;AD_GROUP_BID_MULTIPLIER&#39; | &#39;PROMO_ID&#39; | &#39;PROMO_NAME&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;AD_NAME&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;AD_GROUP_OPTIMIZATION&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;CAMPAIGN_BUDGET_OPTIMIZATION&#39; | &#39;IS_PREMIERE_CAMPAIGN&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_ADD_TO_WISHLIST&#39; | &#39;TOTAL_SUBSCRIBE&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;PRODUCT_GROUP_AD_IMAGE_TAG&#39; | &#39;PRODUCT_GROUP_AD_VIDEO_TAG&#39; | &#39;VIDEO_3SEC_VIEWS_1&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_1&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;PAID_VIDEO_VIEWABLE_RATE&#39; | &#39;VIDEO_LENGTH&#39; | &#39;VIDEO_SPEND_IN_DOLLAR&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_15SEC_UNIQUE_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;TOTAL_APP_INSTALL_CONVERSION_RATE&#39; | &#39;TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_PIN_RESULT_OPEN&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof CampaignsApiadPinsAnalytics
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'OUTBOUND_CTR_1' | 'CAMPAIGN_NAME' | 'CAMPAIGN_BRAND_LABEL' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_NAME' | 'AD_GROUP_BUDGET_TYPE' | 'AD_GROUP_BUDGET_IN_LOCAL_CURRENCY' | 'AD_GROUP_ENTITY_STATUS' | 'AD_GROUP_BID_MULTIPLIER' | 'PROMO_ID' | 'PROMO_NAME' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'AD_NAME' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'AD_GROUP_OPTIMIZATION' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'CAMPAIGN_BUDGET_OPTIMIZATION' | 'IS_PREMIERE_CAMPAIGN' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_ADD_TO_WISHLIST' | 'TOTAL_SUBSCRIBE' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'PRODUCT_GROUP_AD_IMAGE_TAG' | 'PRODUCT_GROUP_AD_VIDEO_TAG' | 'VIDEO_3SEC_VIEWS_1' | 'VIDEO_15SEC_UNIQUE_VIEWS_1' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_15SEC_UNIQUE_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'PAID_VIDEO_VIEWABLE_RATE' | 'VIDEO_LENGTH' | 'VIDEO_SPEND_IN_DOLLAR' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_15SEC_UNIQUE_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'TOTAL_APP_INSTALL_CONVERSION_RATE' | 'TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_PIN_RESULT_OPEN' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * Defaults to: undefined
     * @type Granularity
     * @memberof CampaignsApiadPinsAnalytics
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof CampaignsApiadPinsAnalytics
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof CampaignsApiadPinsAnalytics
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * Defaults to: 1
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof CampaignsApiadPinsAnalytics
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * Defaults to: &#39;TIME_OF_AD_ACTION&#39;
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof CampaignsApiadPinsAnalytics
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
}

export interface CampaignsApiCampaignTargetingAnalyticsGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    adAccountId: string
    /**
     * List of Campaign Ids to use to filter the results.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    campaignIds: Array<string>
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * Defaults to: undefined
     * @type string
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * Defaults to: undefined
     * @type string
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    endDate: string
    /**
     * Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.
     * Defaults to: undefined
     * @type Array&lt;AdsAnalyticsCampaignTargetingType&gt;
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    targetingTypes: Array<AdsAnalyticsCampaignTargetingType>
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * Defaults to: undefined
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;OUTBOUND_CTR_1&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;CAMPAIGN_BRAND_LABEL&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_NAME&#39; | &#39;AD_GROUP_BUDGET_TYPE&#39; | &#39;AD_GROUP_BUDGET_IN_LOCAL_CURRENCY&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;AD_GROUP_BID_MULTIPLIER&#39; | &#39;PROMO_ID&#39; | &#39;PROMO_NAME&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;AD_NAME&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;AD_GROUP_OPTIMIZATION&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;CAMPAIGN_BUDGET_OPTIMIZATION&#39; | &#39;IS_PREMIERE_CAMPAIGN&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_ADD_TO_WISHLIST&#39; | &#39;TOTAL_SUBSCRIBE&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;PRODUCT_GROUP_AD_IMAGE_TAG&#39; | &#39;PRODUCT_GROUP_AD_VIDEO_TAG&#39; | &#39;VIDEO_3SEC_VIEWS_1&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_1&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;PAID_VIDEO_VIEWABLE_RATE&#39; | &#39;VIDEO_LENGTH&#39; | &#39;VIDEO_SPEND_IN_DOLLAR&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_15SEC_UNIQUE_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;TOTAL_APP_INSTALL_CONVERSION_RATE&#39; | &#39;TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_PIN_RESULT_OPEN&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'OUTBOUND_CTR_1' | 'CAMPAIGN_NAME' | 'CAMPAIGN_BRAND_LABEL' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_NAME' | 'AD_GROUP_BUDGET_TYPE' | 'AD_GROUP_BUDGET_IN_LOCAL_CURRENCY' | 'AD_GROUP_ENTITY_STATUS' | 'AD_GROUP_BID_MULTIPLIER' | 'PROMO_ID' | 'PROMO_NAME' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'AD_NAME' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'AD_GROUP_OPTIMIZATION' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'CAMPAIGN_BUDGET_OPTIMIZATION' | 'IS_PREMIERE_CAMPAIGN' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_ADD_TO_WISHLIST' | 'TOTAL_SUBSCRIBE' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'PRODUCT_GROUP_AD_IMAGE_TAG' | 'PRODUCT_GROUP_AD_VIDEO_TAG' | 'VIDEO_3SEC_VIEWS_1' | 'VIDEO_15SEC_UNIQUE_VIEWS_1' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_15SEC_UNIQUE_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'PAID_VIDEO_VIEWABLE_RATE' | 'VIDEO_LENGTH' | 'VIDEO_SPEND_IN_DOLLAR' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_15SEC_UNIQUE_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'TOTAL_APP_INSTALL_CONVERSION_RATE' | 'TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_PIN_RESULT_OPEN' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * Defaults to: undefined
     * @type Granularity
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * Defaults to: 1
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * Defaults to: &#39;TIME_OF_AD_ACTION&#39;
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
    /**
     * List of types of attribution for the conversion report
     * Defaults to: undefined
     * @type Array&lt;ConversionReportAttributionType&gt;
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    attributionTypes?: Array<ConversionReportAttributionType>
    /**
     * Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
     * Defaults to: undefined
     * @type ReportingTimeZone
     * @memberof CampaignsApicampaignTargetingAnalyticsGet
     */
    reportingTimezone?: ReportingTimeZone
}

export interface CampaignsApiCampaignsAnalyticsRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CampaignsApicampaignsAnalytics
     */
    adAccountId: string
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * Defaults to: undefined
     * @type string
     * @memberof CampaignsApicampaignsAnalytics
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * Defaults to: undefined
     * @type string
     * @memberof CampaignsApicampaignsAnalytics
     */
    endDate: string
    /**
     * List of Campaign Ids to use to filter the results.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof CampaignsApicampaignsAnalytics
     */
    campaignIds: Array<string>
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * Defaults to: undefined
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;OUTBOUND_CTR_1&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;CAMPAIGN_BRAND_LABEL&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_NAME&#39; | &#39;AD_GROUP_BUDGET_TYPE&#39; | &#39;AD_GROUP_BUDGET_IN_LOCAL_CURRENCY&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;AD_GROUP_BID_MULTIPLIER&#39; | &#39;PROMO_ID&#39; | &#39;PROMO_NAME&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;AD_NAME&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;AD_GROUP_OPTIMIZATION&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;CAMPAIGN_BUDGET_OPTIMIZATION&#39; | &#39;IS_PREMIERE_CAMPAIGN&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_ADD_TO_WISHLIST&#39; | &#39;TOTAL_SUBSCRIBE&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;PRODUCT_GROUP_AD_IMAGE_TAG&#39; | &#39;PRODUCT_GROUP_AD_VIDEO_TAG&#39; | &#39;VIDEO_3SEC_VIEWS_1&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_1&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;PAID_VIDEO_VIEWABLE_RATE&#39; | &#39;VIDEO_LENGTH&#39; | &#39;VIDEO_SPEND_IN_DOLLAR&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_15SEC_UNIQUE_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;TOTAL_APP_INSTALL_CONVERSION_RATE&#39; | &#39;TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_PIN_RESULT_OPEN&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof CampaignsApicampaignsAnalytics
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'OUTBOUND_CTR_1' | 'CAMPAIGN_NAME' | 'CAMPAIGN_BRAND_LABEL' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_NAME' | 'AD_GROUP_BUDGET_TYPE' | 'AD_GROUP_BUDGET_IN_LOCAL_CURRENCY' | 'AD_GROUP_ENTITY_STATUS' | 'AD_GROUP_BID_MULTIPLIER' | 'PROMO_ID' | 'PROMO_NAME' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'AD_NAME' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'AD_GROUP_OPTIMIZATION' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'CAMPAIGN_BUDGET_OPTIMIZATION' | 'IS_PREMIERE_CAMPAIGN' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_ADD_TO_WISHLIST' | 'TOTAL_SUBSCRIBE' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'PRODUCT_GROUP_AD_IMAGE_TAG' | 'PRODUCT_GROUP_AD_VIDEO_TAG' | 'VIDEO_3SEC_VIEWS_1' | 'VIDEO_15SEC_UNIQUE_VIEWS_1' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_15SEC_UNIQUE_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'PAID_VIDEO_VIEWABLE_RATE' | 'VIDEO_LENGTH' | 'VIDEO_SPEND_IN_DOLLAR' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_15SEC_UNIQUE_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'TOTAL_APP_INSTALL_CONVERSION_RATE' | 'TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_PIN_RESULT_OPEN' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * Defaults to: undefined
     * @type Granularity
     * @memberof CampaignsApicampaignsAnalytics
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof CampaignsApicampaignsAnalytics
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof CampaignsApicampaignsAnalytics
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * Defaults to: 1
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof CampaignsApicampaignsAnalytics
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * Defaults to: &#39;TIME_OF_AD_ACTION&#39;
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof CampaignsApicampaignsAnalytics
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
    /**
     * Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
     * Defaults to: false
     * @type boolean
     * @memberof CampaignsApicampaignsAnalytics
     */
    aggregateReportRows?: boolean
    /**
     * Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
     * Defaults to: undefined
     * @type ReportingTimeZone
     * @memberof CampaignsApicampaignsAnalytics
     */
    reportingTimezone?: ReportingTimeZone
}

export interface CampaignsApiCampaignsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Defaults to: undefined
     * @type string
     * @memberof CampaignsApicampaignsGet
     */
    adAccountId: string
    /**
     * Campaign ID, must be associated with the ad account ID provided in the path.
     * Defaults to: undefined
     * @type string
     * @memberof CampaignsApicampaignsGet
     */
    campaignId: string
}

export interface CampaignsApiCampaignsListRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CampaignsApicampaignsList
     */
    adAccountId: string
    /**
     * List of Campaign Ids to use to filter the results.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof CampaignsApicampaignsList
     */
    campaignIds?: Array<string>
    /**
     * Entity status
     * Defaults to: undefined
     * @type Array&lt;&#39;ACTIVE&#39; | &#39;PAUSED&#39; | &#39;ARCHIVED&#39; | &#39;DRAFT&#39; | &#39;DELETED_DRAFT&#39;&gt;
     * @memberof CampaignsApicampaignsList
     */
    entityStatuses?: Array<'ACTIVE' | 'PAUSED' | 'ARCHIVED' | 'DRAFT' | 'DELETED_DRAFT'>
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof CampaignsApicampaignsList
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * Defaults to: undefined
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof CampaignsApicampaignsList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof CampaignsApicampaignsList
     */
    bookmark?: string
}

export interface CampaignsApiCampaignsUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Get analytics for the pins given a campaign and pins in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.
     * Get pins analytics
     * @param param the request object
     */
    public adPinsAnalyticsWithHttpInfo(param: CampaignsApiAdPinsAnalyticsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<AdPinAnalytics>>> {
        return this.api.adPinsAnalyticsWithHttpInfo(param.adAccountId, param.campaignId, param.pinIds, param.startDate, param.endDate, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime,  options).toPromise();
    }

    /**
     * Get analytics for the pins given a campaign and pins in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.
     * Get pins analytics
     * @param param the request object
     */
    public adPinsAnalytics(param: CampaignsApiAdPinsAnalyticsRequest, options?: ConfigurationOptions): Promise<Array<AdPinAnalytics>> {
        return this.api.adPinsAnalytics(param.adAccountId, param.campaignId, param.pinIds, param.startDate, param.endDate, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime,  options).toPromise();
    }

    /**
     * Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     * Get targeting analytics for campaigns
     * @param param the request object
     */
    public campaignTargetingAnalyticsGetWithHttpInfo(param: CampaignsApiCampaignTargetingAnalyticsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<MetricsResponse>> {
        return this.api.campaignTargetingAnalyticsGetWithHttpInfo(param.adAccountId, param.campaignIds, param.startDate, param.endDate, param.targetingTypes, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.attributionTypes, param.reportingTimezone,  options).toPromise();
    }

    /**
     * Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     * Get targeting analytics for campaigns
     * @param param the request object
     */
    public campaignTargetingAnalyticsGet(param: CampaignsApiCampaignTargetingAnalyticsGetRequest, options?: ConfigurationOptions): Promise<MetricsResponse> {
        return this.api.campaignTargetingAnalyticsGet(param.adAccountId, param.campaignIds, param.startDate, param.endDate, param.targetingTypes, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.attributionTypes, param.reportingTimezone,  options).toPromise();
    }

    /**
     * Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     * Get campaign analytics
     * @param param the request object
     */
    public campaignsAnalyticsWithHttpInfo(param: CampaignsApiCampaignsAnalyticsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<CampaignsAnalyticsResponseInner>>> {
        return this.api.campaignsAnalyticsWithHttpInfo(param.adAccountId, param.startDate, param.endDate, param.campaignIds, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.aggregateReportRows, param.reportingTimezone,  options).toPromise();
    }

    /**
     * Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     * Get campaign analytics
     * @param param the request object
     */
    public campaignsAnalytics(param: CampaignsApiCampaignsAnalyticsRequest, options?: ConfigurationOptions): Promise<Array<CampaignsAnalyticsResponseInner>> {
        return this.api.campaignsAnalytics(param.adAccountId, param.startDate, param.endDate, param.campaignIds, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.aggregateReportRows, param.reportingTimezone,  options).toPromise();
    }

    /**
     * Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for \'lifetime_spend_cap\' and \'daily_spend_cap\' are microcurrency amounts based on the currency field set in the advertiser\'s profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
     * Create campaigns
     * @param param the request object
     */
    public campaignsCreateWithHttpInfo(param: CampaignsApiCampaignsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<CampaignCreateResponse>> {
        return this.api.campaignsCreateWithHttpInfo(param.adAccountId, param.campaignCreateRequest,  options).toPromise();
    }

    /**
     * Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for \'lifetime_spend_cap\' and \'daily_spend_cap\' are microcurrency amounts based on the currency field set in the advertiser\'s profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
     * Create campaigns
     * @param param the request object
     */
    public campaignsCreate(param: CampaignsApiCampaignsCreateRequest, options?: ConfigurationOptions): Promise<CampaignCreateResponse> {
        return this.api.campaignsCreate(param.adAccountId, param.campaignCreateRequest,  options).toPromise();
    }

    /**
     * Get a specific campaign given the campaign ID.
     * Get campaign
     * @param param the request object
     */
    public campaignsGetWithHttpInfo(param: CampaignsApiCampaignsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<CampaignResponse>> {
        return this.api.campaignsGetWithHttpInfo(param.adAccountId, param.campaignId,  options).toPromise();
    }

    /**
     * Get a specific campaign given the campaign ID.
     * Get campaign
     * @param param the request object
     */
    public campaignsGet(param: CampaignsApiCampaignsGetRequest, options?: ConfigurationOptions): Promise<CampaignResponse> {
        return this.api.campaignsGet(param.adAccountId, param.campaignId,  options).toPromise();
    }

    /**
     * Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
     * List campaigns
     * @param param the request object
     */
    public campaignsListWithHttpInfo(param: CampaignsApiCampaignsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<CampaignsList200Response>> {
        return this.api.campaignsListWithHttpInfo(param.adAccountId, param.campaignIds, param.entityStatuses, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
     * List campaigns
     * @param param the request object
     */
    public campaignsList(param: CampaignsApiCampaignsListRequest, options?: ConfigurationOptions): Promise<CampaignsList200Response> {
        return this.api.campaignsList(param.adAccountId, param.campaignIds, param.entityStatuses, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * <p>Update multiple ad campaigns based on campaign_ids. </p> <p><strong>Note:</strong></p> - <p>The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser\'s profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser\'s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser\'s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
     * Update campaigns
     * @param param the request object
     */
    public campaignsUpdateWithHttpInfo(param: CampaignsApiCampaignsUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<CampaignUpdateResponse>> {
        return this.api.campaignsUpdateWithHttpInfo(param.adAccountId, param.campaignUpdateRequest,  options).toPromise();
    }

    /**
     * <p>Update multiple ad campaigns based on campaign_ids. </p> <p><strong>Note:</strong></p> - <p>The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser\'s profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser\'s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser\'s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
     * Update campaigns
     * @param param the request object
     */
    public campaignsUpdate(param: CampaignsApiCampaignsUpdateRequest, options?: ConfigurationOptions): Promise<CampaignUpdateResponse> {
        return this.api.campaignsUpdate(param.adAccountId, param.campaignUpdateRequest,  options).toPromise();
    }

}

import { ObservableCatalogFeedsApi } from "./ObservableAPI";
import { CatalogFeedsApiRequestFactory, CatalogFeedsApiResponseProcessor} from "../apis/CatalogFeedsApi";

export interface CatalogFeedsApiFeedProcessingResultsListRequest {
    /**
     * Unique identifier of a feed
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApifeedProcessingResultsList
     */
    feedId: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApifeedProcessingResultsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof CatalogFeedsApifeedProcessingResultsList
     */
    pageSize?: number
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApifeedProcessingResultsList
     */
    adAccountId?: string
}

export interface CatalogFeedsApiFeedsCreateRequest {
    /**
     * Request object used to created a feed.
     * @type FeedsCreateRequest
     * @memberof CatalogFeedsApifeedsCreate
     */
    feedsCreateRequest: FeedsCreateRequest
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApifeedsCreate
     */
    adAccountId?: string
}

export interface CatalogFeedsApiFeedsDeleteRequest {
    /**
     * Unique identifier of a feed
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApifeedsDelete
     */
    feedId: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApifeedsDelete
     */
    adAccountId?: string
}

export interface CatalogFeedsApiFeedsGetRequest {
    /**
     * Unique identifier of a feed
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApifeedsGet
     */
    feedId: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApifeedsGet
     */
    adAccountId?: string
}

export interface CatalogFeedsApiFeedsIngestRequest {
    /**
     * Unique identifier of a feed
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApifeedsIngest
     */
    feedId: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApifeedsIngest
     */
    adAccountId?: string
}

export interface CatalogFeedsApiFeedsListRequest {
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApifeedsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof CatalogFeedsApifeedsList
     */
    pageSize?: number
    /**
     * Filter entities for a given catalog_id. If not given, all catalogs are considered.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApifeedsList
     */
    catalogId?: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApifeedsList
     */
    adAccountId?: string
}

export interface CatalogFeedsApiFeedsUpdateRequest {
    /**
     * Unique identifier of a feed
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApifeedsUpdate
     */
    feedId: string
    /**
     * Request object used to update a feed.
     * @type FeedsUpdateRequest
     * @memberof CatalogFeedsApifeedsUpdate
     */
    feedsUpdateRequest: FeedsUpdateRequest
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApifeedsUpdate
     */
    adAccountId?: string
}

export interface CatalogFeedsApiItemsIssuesListRequest {
    /**
     * Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApiitemsIssuesList
     */
    processingResultId: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApiitemsIssuesList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof CatalogFeedsApiitemsIssuesList
     */
    pageSize?: number
    /**
     * Item number based on order of appearance in the Catalogs Feed. For example, \&#39;0\&#39; refers to first item found in a feed that was downloaded from a \&#39;location\&#39; specified during feed creation.
     * Defaults to: undefined
     * @type Array&lt;number&gt;
     * @memberof CatalogFeedsApiitemsIssuesList
     */
    itemNumbers?: Array<number>
    /**
     * Filter item validation issues that have a given type of item validation issue.
     * Defaults to: undefined
     * @type CatalogsItemValidationIssue
     * @memberof CatalogFeedsApiitemsIssuesList
     */
    itemValidationIssue?: CatalogsItemValidationIssue
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogFeedsApiitemsIssuesList
     */
    adAccountId?: string
}

export class ObjectCatalogFeedsApi {
    private api: ObservableCatalogFeedsApi

    public constructor(configuration: Configuration, requestFactory?: CatalogFeedsApiRequestFactory, responseProcessor?: CatalogFeedsApiResponseProcessor) {
        this.api = new ObservableCatalogFeedsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * List feed processing results
     * @param param the request object
     */
    public feedProcessingResultsListWithHttpInfo(param: CatalogFeedsApiFeedProcessingResultsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<FeedProcessingResultsList200Response>> {
        return this.api.feedProcessingResultsListWithHttpInfo(param.feedId, param.bookmark, param.pageSize, param.adAccountId,  options).toPromise();
    }

    /**
     * Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * List feed processing results
     * @param param the request object
     */
    public feedProcessingResultsList(param: CatalogFeedsApiFeedProcessingResultsListRequest, options?: ConfigurationOptions): Promise<FeedProcessingResultsList200Response> {
        return this.api.feedProcessingResultsList(param.feedId, param.bookmark, param.pageSize, param.adAccountId,  options).toPromise();
    }

    /**
     * Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Create feed
     * @param param the request object
     */
    public feedsCreateWithHttpInfo(param: CatalogFeedsApiFeedsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsFeed>> {
        return this.api.feedsCreateWithHttpInfo(param.feedsCreateRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Create feed
     * @param param the request object
     */
    public feedsCreate(param: CatalogFeedsApiFeedsCreateRequest, options?: ConfigurationOptions): Promise<CatalogsFeed> {
        return this.api.feedsCreate(param.feedsCreateRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.
     * Delete feed
     * @param param the request object
     */
    public feedsDeleteWithHttpInfo(param: CatalogFeedsApiFeedsDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.feedsDeleteWithHttpInfo(param.feedId, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.
     * Delete feed
     * @param param the request object
     */
    public feedsDelete(param: CatalogFeedsApiFeedsDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.feedsDelete(param.feedId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.
     * Get feed
     * @param param the request object
     */
    public feedsGetWithHttpInfo(param: CatalogFeedsApiFeedsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsFeed>> {
        return this.api.feedsGetWithHttpInfo(param.feedId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.
     * Get feed
     * @param param the request object
     */
    public feedsGet(param: CatalogFeedsApiFeedsGetRequest, options?: ConfigurationOptions): Promise<CatalogsFeed> {
        return this.api.feedsGet(param.feedId, param.adAccountId,  options).toPromise();
    }

    /**
     * Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Ingest feed items
     * @param param the request object
     */
    public feedsIngestWithHttpInfo(param: CatalogFeedsApiFeedsIngestRequest, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsFeedIngestion>> {
        return this.api.feedsIngestWithHttpInfo(param.feedId, param.adAccountId,  options).toPromise();
    }

    /**
     * Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Ingest feed items
     * @param param the request object
     */
    public feedsIngest(param: CatalogFeedsApiFeedsIngestRequest, options?: ConfigurationOptions): Promise<CatalogsFeedIngestion> {
        return this.api.feedsIngest(param.feedId, param.adAccountId,  options).toPromise();
    }

    /**
     * Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.
     * List feeds
     * @param param the request object
     */
    public feedsListWithHttpInfo(param: CatalogFeedsApiFeedsListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<FeedsList200Response>> {
        return this.api.feedsListWithHttpInfo(param.bookmark, param.pageSize, param.catalogId, param.adAccountId,  options).toPromise();
    }

    /**
     * Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.
     * List feeds
     * @param param the request object
     */
    public feedsList(param: CatalogFeedsApiFeedsListRequest = {}, options?: ConfigurationOptions): Promise<FeedsList200Response> {
        return this.api.feedsList(param.bookmark, param.pageSize, param.catalogId, param.adAccountId,  options).toPromise();
    }

    /**
     * Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Update feed
     * @param param the request object
     */
    public feedsUpdateWithHttpInfo(param: CatalogFeedsApiFeedsUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsFeed>> {
        return this.api.feedsUpdateWithHttpInfo(param.feedId, param.feedsUpdateRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Update feed
     * @param param the request object
     */
    public feedsUpdate(param: CatalogFeedsApiFeedsUpdateRequest, options?: ConfigurationOptions): Promise<CatalogsFeed> {
        return this.api.feedsUpdate(param.feedId, param.feedsUpdateRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters \'item_numbers\' and \'item_validation_issue\' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to <a href=\'/docs/api/v5/#operation/reports/create\'>Build catalogs report</a> and <a href=\'/docs/api/v5/#operation/reports/get\'>Get catalogs report</a> endpoints. Moreover, they support multiple types of catalogs.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * List item issues
     * @param param the request object
     */
    public itemsIssuesListWithHttpInfo(param: CatalogFeedsApiItemsIssuesListRequest, options?: ConfigurationOptions): Promise<HttpInfo<ItemsIssuesList200Response>> {
        return this.api.itemsIssuesListWithHttpInfo(param.processingResultId, param.bookmark, param.pageSize, param.itemNumbers, param.itemValidationIssue, param.adAccountId,  options).toPromise();
    }

    /**
     * List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters \'item_numbers\' and \'item_validation_issue\' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to <a href=\'/docs/api/v5/#operation/reports/create\'>Build catalogs report</a> and <a href=\'/docs/api/v5/#operation/reports/get\'>Get catalogs report</a> endpoints. Moreover, they support multiple types of catalogs.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * List item issues
     * @param param the request object
     */
    public itemsIssuesList(param: CatalogFeedsApiItemsIssuesListRequest, options?: ConfigurationOptions): Promise<ItemsIssuesList200Response> {
        return this.api.itemsIssuesList(param.processingResultId, param.bookmark, param.pageSize, param.itemNumbers, param.itemValidationIssue, param.adAccountId,  options).toPromise();
    }

}

import { ObservableCatalogItemsApi } from "./ObservableAPI";
import { CatalogItemsApiRequestFactory, CatalogItemsApiResponseProcessor} from "../apis/CatalogItemsApi";

export interface CatalogItemsApiItemsBatchGetRequest {
    /**
     * Id of a catalogs items batch to fetch
     * Defaults to: undefined
     * @type string
     * @memberof CatalogItemsApiitemsBatchGet
     */
    batchId: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogItemsApiitemsBatchGet
     */
    adAccountId?: string
}

export interface CatalogItemsApiItemsBatchPostRequest {
    /**
     * Request object used to create catalogs items in a batch
     * @type ItemsBatchPostRequest
     * @memberof CatalogItemsApiitemsBatchPost
     */
    itemsBatchPostRequest: ItemsBatchPostRequest
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogItemsApiitemsBatchPost
     */
    adAccountId?: string
}

export interface CatalogItemsApiItemsPostRequest {
    /**
     * Request object used to get catalogs items
     * @type CatalogsItemsRequest
     * @memberof CatalogItemsApiitemsPost
     */
    catalogsItemsRequest: CatalogsItemsRequest
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogItemsApiitemsPost
     */
    adAccountId?: string
}

export class ObjectCatalogItemsApi {
    private api: ObservableCatalogItemsApi

    public constructor(configuration: Configuration, requestFactory?: CatalogItemsApiRequestFactory, responseProcessor?: CatalogItemsApiResponseProcessor) {
        this.api = new ObservableCatalogItemsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * Get item batch status
     * @param param the request object
     */
    public itemsBatchGetWithHttpInfo(param: CatalogItemsApiItemsBatchGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsItemsBatch>> {
        return this.api.itemsBatchGetWithHttpInfo(param.batchId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * Get item batch status
     * @param param the request object
     */
    public itemsBatchGet(param: CatalogItemsApiItemsBatchGetRequest, options?: ConfigurationOptions): Promise<CatalogsItemsBatch> {
        return this.api.itemsBatchGet(param.batchId, param.adAccountId,  options).toPromise();
    }

    /**
     * This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.
     * Operate on item batch
     * @param param the request object
     */
    public itemsBatchPostWithHttpInfo(param: CatalogItemsApiItemsBatchPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsItemsBatch>> {
        return this.api.itemsBatchPostWithHttpInfo(param.itemsBatchPostRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.
     * Operate on item batch
     * @param param the request object
     */
    public itemsBatchPost(param: CatalogItemsApiItemsBatchPostRequest, options?: ConfigurationOptions): Promise<CatalogsItemsBatch> {
        return this.api.itemsBatchPost(param.itemsBatchPostRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Get catalogs items (POST)
     * @param param the request object
     */
    public itemsPostWithHttpInfo(param: CatalogItemsApiItemsPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsItems>> {
        return this.api.itemsPostWithHttpInfo(param.catalogsItemsRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Get catalogs items (POST)
     * @param param the request object
     */
    public itemsPost(param: CatalogItemsApiItemsPostRequest, options?: ConfigurationOptions): Promise<CatalogsItems> {
        return this.api.itemsPost(param.catalogsItemsRequest, param.adAccountId,  options).toPromise();
    }

}

import { ObservableCatalogProductGroupsApi } from "./ObservableAPI";
import { CatalogProductGroupsApiRequestFactory, CatalogProductGroupsApiResponseProcessor} from "../apis/CatalogProductGroupsApi";

export interface CatalogProductGroupsApiCatalogsProductGroupPinsListRequest {
    /**
     * Unique identifier of a product group
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupPinsList
     */
    productGroupId: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupPinsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof CatalogProductGroupsApicatalogsProductGroupPinsList
     */
    pageSize?: number
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupPinsList
     */
    adAccountId?: string
    /**
     * Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Defaults to: false
     * @type boolean
     * @memberof CatalogProductGroupsApicatalogsProductGroupPinsList
     */
    pinMetrics?: boolean
}

export interface CatalogProductGroupsApiCatalogsProductGroupsCreateRequest {
    /**
     * Request object used to create a single catalogs product groups.
     * @type MultipleProductGroupsInner
     * @memberof CatalogProductGroupsApicatalogsProductGroupsCreate
     */
    multipleProductGroupsInner: MultipleProductGroupsInner
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupsCreate
     */
    adAccountId?: string
}

export interface CatalogProductGroupsApiCatalogsProductGroupsCreateManyRequest {
    /**
     * Request object used to create one or more catalogs product groups.
     * @type Array&lt;MultipleProductGroupsInner&gt;
     * @memberof CatalogProductGroupsApicatalogsProductGroupsCreateMany
     */
    multipleProductGroupsInner: Array<MultipleProductGroupsInner>
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupsCreateMany
     */
    adAccountId?: string
}

export interface CatalogProductGroupsApiCatalogsProductGroupsDeleteRequest {
    /**
     * Unique identifier of a product group
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupsDelete
     */
    productGroupId: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupsDelete
     */
    adAccountId?: string
}

export interface CatalogProductGroupsApiCatalogsProductGroupsDeleteManyRequest {
    /**
     * Comma-separated list of product group ids
     * Defaults to: undefined
     * @type Array&lt;number&gt;
     * @memberof CatalogProductGroupsApicatalogsProductGroupsDeleteMany
     */
    id: Array<number>
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupsDeleteMany
     */
    adAccountId?: string
}

export interface CatalogProductGroupsApiCatalogsProductGroupsGetRequest {
    /**
     * Unique identifier of a product group
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupsGet
     */
    productGroupId: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupsGet
     */
    adAccountId?: string
}

export interface CatalogProductGroupsApiCatalogsProductGroupsListRequest {
    /**
     * Comma-separated list of product group ids
     * Defaults to: undefined
     * @type Array&lt;number&gt;
     * @memberof CatalogProductGroupsApicatalogsProductGroupsList
     */
    id?: Array<number>
    /**
     * Filter entities for a given feed_id. If not given, all feeds are considered.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupsList
     */
    feedId?: string
    /**
     * Filter entities for a given catalog_id. If not given, all catalogs are considered.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupsList
     */
    catalogId?: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof CatalogProductGroupsApicatalogsProductGroupsList
     */
    pageSize?: number
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupsList
     */
    adAccountId?: string
}

export interface CatalogProductGroupsApiCatalogsProductGroupsProductCountsGetRequest {
    /**
     * Unique identifier of a product group
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupsProductCountsGet
     */
    productGroupId: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupsProductCountsGet
     */
    adAccountId?: string
}

export interface CatalogProductGroupsApiCatalogsProductGroupsUpdateRequest {
    /**
     * Unique identifier of a product group
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupsUpdate
     */
    productGroupId: string
    /**
     * Request object used to Update a catalogs product group.
     * @type CatalogsProductGroupsUpdateRequest
     * @memberof CatalogProductGroupsApicatalogsProductGroupsUpdate
     */
    catalogsProductGroupsUpdateRequest: CatalogsProductGroupsUpdateRequest
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApicatalogsProductGroupsUpdate
     */
    adAccountId?: string
}

export interface CatalogProductGroupsApiProductsByProductGroupFilterListRequest {
    /**
     * Object holding a group of filters for a catalog product group
     * @type CatalogsListProductsByFilterRequest
     * @memberof CatalogProductGroupsApiproductsByProductGroupFilterList
     */
    catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApiproductsByProductGroupFilterList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof CatalogProductGroupsApiproductsByProductGroupFilterList
     */
    pageSize?: number
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogProductGroupsApiproductsByProductGroupFilterList
     */
    adAccountId?: string
    /**
     * Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Defaults to: false
     * @type boolean
     * @memberof CatalogProductGroupsApiproductsByProductGroupFilterList
     */
    pinMetrics?: boolean
}

export class ObjectCatalogProductGroupsApi {
    private api: ObservableCatalogProductGroupsApi

    public constructor(configuration: Configuration, requestFactory?: CatalogProductGroupsApiRequestFactory, responseProcessor?: CatalogProductGroupsApiResponseProcessor) {
        this.api = new ObservableCatalogProductGroupsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * List products by product group
     * @param param the request object
     */
    public catalogsProductGroupPinsListWithHttpInfo(param: CatalogProductGroupsApiCatalogsProductGroupPinsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsProductGroupPinsList200Response>> {
        return this.api.catalogsProductGroupPinsListWithHttpInfo(param.productGroupId, param.bookmark, param.pageSize, param.adAccountId, param.pinMetrics,  options).toPromise();
    }

    /**
     * Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * List products by product group
     * @param param the request object
     */
    public catalogsProductGroupPinsList(param: CatalogProductGroupsApiCatalogsProductGroupPinsListRequest, options?: ConfigurationOptions): Promise<CatalogsProductGroupPinsList200Response> {
        return this.api.catalogsProductGroupPinsList(param.productGroupId, param.bookmark, param.pageSize, param.adAccountId, param.pinMetrics,  options).toPromise();
    }

    /**
     * Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Create product group
     * @param param the request object
     */
    public catalogsProductGroupsCreateWithHttpInfo(param: CatalogProductGroupsApiCatalogsProductGroupsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsVerticalProductGroup>> {
        return this.api.catalogsProductGroupsCreateWithHttpInfo(param.multipleProductGroupsInner, param.adAccountId,  options).toPromise();
    }

    /**
     * Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Create product group
     * @param param the request object
     */
    public catalogsProductGroupsCreate(param: CatalogProductGroupsApiCatalogsProductGroupsCreateRequest, options?: ConfigurationOptions): Promise<CatalogsVerticalProductGroup> {
        return this.api.catalogsProductGroupsCreate(param.multipleProductGroupsInner, param.adAccountId,  options).toPromise();
    }

    /**
     * Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Create product groups
     * @param param the request object
     */
    public catalogsProductGroupsCreateManyWithHttpInfo(param: CatalogProductGroupsApiCatalogsProductGroupsCreateManyRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<string>>> {
        return this.api.catalogsProductGroupsCreateManyWithHttpInfo(param.multipleProductGroupsInner, param.adAccountId,  options).toPromise();
    }

    /**
     * Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Create product groups
     * @param param the request object
     */
    public catalogsProductGroupsCreateMany(param: CatalogProductGroupsApiCatalogsProductGroupsCreateManyRequest, options?: ConfigurationOptions): Promise<Array<string>> {
        return this.api.catalogsProductGroupsCreateMany(param.multipleProductGroupsInner, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * Delete product group
     * @param param the request object
     */
    public catalogsProductGroupsDeleteWithHttpInfo(param: CatalogProductGroupsApiCatalogsProductGroupsDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.catalogsProductGroupsDeleteWithHttpInfo(param.productGroupId, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * Delete product group
     * @param param the request object
     */
    public catalogsProductGroupsDelete(param: CatalogProductGroupsApiCatalogsProductGroupsDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.catalogsProductGroupsDelete(param.productGroupId, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * Delete product groups
     * @param param the request object
     */
    public catalogsProductGroupsDeleteManyWithHttpInfo(param: CatalogProductGroupsApiCatalogsProductGroupsDeleteManyRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.catalogsProductGroupsDeleteManyWithHttpInfo(param.id, param.adAccountId,  options).toPromise();
    }

    /**
     * Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * Delete product groups
     * @param param the request object
     */
    public catalogsProductGroupsDeleteMany(param: CatalogProductGroupsApiCatalogsProductGroupsDeleteManyRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.catalogsProductGroupsDeleteMany(param.id, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * Get product group
     * @param param the request object
     */
    public catalogsProductGroupsGetWithHttpInfo(param: CatalogProductGroupsApiCatalogsProductGroupsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsVerticalProductGroup>> {
        return this.api.catalogsProductGroupsGetWithHttpInfo(param.productGroupId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * Get product group
     * @param param the request object
     */
    public catalogsProductGroupsGet(param: CatalogProductGroupsApiCatalogsProductGroupsGetRequest, options?: ConfigurationOptions): Promise<CatalogsVerticalProductGroup> {
        return this.api.catalogsProductGroupsGet(param.productGroupId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * List product groups
     * @param param the request object
     */
    public catalogsProductGroupsListWithHttpInfo(param: CatalogProductGroupsApiCatalogsProductGroupsListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsProductGroupsList200Response>> {
        return this.api.catalogsProductGroupsListWithHttpInfo(param.id, param.feedId, param.catalogId, param.bookmark, param.pageSize, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * List product groups
     * @param param the request object
     */
    public catalogsProductGroupsList(param: CatalogProductGroupsApiCatalogsProductGroupsListRequest = {}, options?: ConfigurationOptions): Promise<CatalogsProductGroupsList200Response> {
        return this.api.catalogsProductGroupsList(param.id, param.feedId, param.catalogId, param.bookmark, param.pageSize, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * Get product counts
     * @param param the request object
     */
    public catalogsProductGroupsProductCountsGetWithHttpInfo(param: CatalogProductGroupsApiCatalogsProductGroupsProductCountsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsProductGroupProductCountsVertical>> {
        return this.api.catalogsProductGroupsProductCountsGetWithHttpInfo(param.productGroupId, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * Get product counts
     * @param param the request object
     */
    public catalogsProductGroupsProductCountsGet(param: CatalogProductGroupsApiCatalogsProductGroupsProductCountsGetRequest, options?: ConfigurationOptions): Promise<CatalogsProductGroupProductCountsVertical> {
        return this.api.catalogsProductGroupsProductCountsGet(param.productGroupId, param.adAccountId,  options).toPromise();
    }

    /**
     * Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Update single product group
     * @param param the request object
     */
    public catalogsProductGroupsUpdateWithHttpInfo(param: CatalogProductGroupsApiCatalogsProductGroupsUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsVerticalProductGroup>> {
        return this.api.catalogsProductGroupsUpdateWithHttpInfo(param.productGroupId, param.catalogsProductGroupsUpdateRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Update single product group
     * @param param the request object
     */
    public catalogsProductGroupsUpdate(param: CatalogProductGroupsApiCatalogsProductGroupsUpdateRequest, options?: ConfigurationOptions): Promise<CatalogsVerticalProductGroup> {
        return this.api.catalogsProductGroupsUpdate(param.productGroupId, param.catalogsProductGroupsUpdateRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * List products by filter
     * @param param the request object
     */
    public productsByProductGroupFilterListWithHttpInfo(param: CatalogProductGroupsApiProductsByProductGroupFilterListRequest, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsProductGroupPinsList200Response>> {
        return this.api.productsByProductGroupFilterListWithHttpInfo(param.catalogsListProductsByFilterRequest, param.bookmark, param.pageSize, param.adAccountId, param.pinMetrics,  options).toPromise();
    }

    /**
     * List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * List products by filter
     * @param param the request object
     */
    public productsByProductGroupFilterList(param: CatalogProductGroupsApiProductsByProductGroupFilterListRequest, options?: ConfigurationOptions): Promise<CatalogsProductGroupPinsList200Response> {
        return this.api.productsByProductGroupFilterList(param.catalogsListProductsByFilterRequest, param.bookmark, param.pageSize, param.adAccountId, param.pinMetrics,  options).toPromise();
    }

}

import { ObservableCatalogReportsApi } from "./ObservableAPI";
import { CatalogReportsApiRequestFactory, CatalogReportsApiResponseProcessor} from "../apis/CatalogReportsApi";

export interface CatalogReportsApiReportsCreateRequest {
    /**
     * Request object to asynchronously create a report.
     * @type CatalogsReportParameters
     * @memberof CatalogReportsApireportsCreate
     */
    catalogsReportParameters: CatalogsReportParameters
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogReportsApireportsCreate
     */
    adAccountId?: string
}

export interface CatalogReportsApiReportsGetRequest {
    /**
     * Token returned from async build report call
     * Defaults to: undefined
     * @type string
     * @memberof CatalogReportsApireportsGet
     */
    token: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogReportsApireportsGet
     */
    adAccountId?: string
}

export interface CatalogReportsApiReportsStatsRequest {
    /**
     * Contains the parameters for report identification.
     * Defaults to: undefined
     * @type ReportsStatsParametersParameter
     * @memberof CatalogReportsApireportsStats
     */
    parameters: ReportsStatsParametersParameter
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogReportsApireportsStats
     */
    adAccountId?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof CatalogReportsApireportsStats
     */
    pageSize?: number
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof CatalogReportsApireportsStats
     */
    bookmark?: string
}

export class ObjectCatalogReportsApi {
    private api: ObservableCatalogReportsApi

    public constructor(configuration: Configuration, requestFactory?: CatalogReportsApiRequestFactory, responseProcessor?: CatalogReportsApiResponseProcessor) {
        this.api = new ObservableCatalogReportsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the All Items report type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Build catalogs report
     * @param param the request object
     */
    public reportsCreateWithHttpInfo(param: CatalogReportsApiReportsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsCreateReportResponse>> {
        return this.api.reportsCreateWithHttpInfo(param.catalogsReportParameters, param.adAccountId,  options).toPromise();
    }

    /**
     * Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the All Items report type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Build catalogs report
     * @param param the request object
     */
    public reportsCreate(param: CatalogReportsApiReportsCreateRequest, options?: ConfigurationOptions): Promise<CatalogsCreateReportResponse> {
        return this.api.reportsCreate(param.catalogsReportParameters, param.adAccountId,  options).toPromise();
    }

    /**
     * This returns a URL to a report given a token returned from <a href=\'/docs/api/v5/#operation/reports/create\'>Build catalogs report</a>. You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * Get catalogs report
     * @param param the request object
     */
    public reportsGetWithHttpInfo(param: CatalogReportsApiReportsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsReport>> {
        return this.api.reportsGetWithHttpInfo(param.token, param.adAccountId,  options).toPromise();
    }

    /**
     * This returns a URL to a report given a token returned from <a href=\'/docs/api/v5/#operation/reports/create\'>Build catalogs report</a>. You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * Get catalogs report
     * @param param the request object
     */
    public reportsGet(param: CatalogReportsApiReportsGetRequest, options?: ConfigurationOptions): Promise<CatalogsReport> {
        return this.api.reportsGet(param.token, param.adAccountId,  options).toPromise();
    }

    /**
     * List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * List report stats
     * @param param the request object
     */
    public reportsStatsWithHttpInfo(param: CatalogReportsApiReportsStatsRequest, options?: ConfigurationOptions): Promise<HttpInfo<ReportsStats200Response>> {
        return this.api.reportsStatsWithHttpInfo(param.parameters, param.adAccountId, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
     * List report stats
     * @param param the request object
     */
    public reportsStats(param: CatalogReportsApiReportsStatsRequest, options?: ConfigurationOptions): Promise<ReportsStats200Response> {
        return this.api.reportsStats(param.parameters, param.adAccountId, param.pageSize, param.bookmark,  options).toPromise();
    }

}

import { ObservableCatalogsApi } from "./ObservableAPI";
import { CatalogsApiRequestFactory, CatalogsApiResponseProcessor} from "../apis/CatalogsApi";

export interface CatalogsApiCatalogsAvailableFilterValuesRequest {
    /**
     * Filter entities for a given catalog_id.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogsApicatalogsAvailableFilterValues
     */
    catalogId: string
    /**
     * Filter entities for a given feed_id. If not given, all feeds are considered.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogsApicatalogsAvailableFilterValues
     */
    feedId?: string
    /**
     * Country for the Catalogs Items
     * Defaults to: undefined
     * @type Country
     * @memberof CatalogsApicatalogsAvailableFilterValues
     */
    country?: Country
    /**
     * Language for the Catalogs Items
     * Defaults to: undefined
     * @type CatalogsLocale
     * @memberof CatalogsApicatalogsAvailableFilterValues
     */
    language?: CatalogsLocale
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogsApicatalogsAvailableFilterValues
     */
    adAccountId?: string
}

export interface CatalogsApiCatalogsCreateRequest {
    /**
     * Request object used to created a feed.
     * @type CatalogsCreateRequest
     * @memberof CatalogsApicatalogsCreate
     */
    catalogsCreateRequest: CatalogsCreateRequest
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogsApicatalogsCreate
     */
    adAccountId?: string
}

export interface CatalogsApiCatalogsListRequest {
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof CatalogsApicatalogsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof CatalogsApicatalogsList
     */
    pageSize?: number
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CatalogsApicatalogsList
     */
    adAccountId?: string
}

export class ObjectCatalogsApi {
    private api: ObservableCatalogsApi

    public constructor(configuration: Configuration, requestFactory?: CatalogsApiRequestFactory, responseProcessor?: CatalogsApiResponseProcessor) {
        this.api = new ObservableCatalogsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - <code>country</code>, <code>language</code>, and <code>feed_id</code> are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * List available filter values
     * @param param the request object
     */
    public catalogsAvailableFilterValuesWithHttpInfo(param: CatalogsApiCatalogsAvailableFilterValuesRequest, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsAvailableFilterValues>> {
        return this.api.catalogsAvailableFilterValuesWithHttpInfo(param.catalogId, param.feedId, param.country, param.language, param.adAccountId,  options).toPromise();
    }

    /**
     * Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - <code>country</code>, <code>language</code>, and <code>feed_id</code> are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * List available filter values
     * @param param the request object
     */
    public catalogsAvailableFilterValues(param: CatalogsApiCatalogsAvailableFilterValuesRequest, options?: ConfigurationOptions): Promise<CatalogsAvailableFilterValues> {
        return this.api.catalogsAvailableFilterValues(param.catalogId, param.feedId, param.country, param.language, param.adAccountId,  options).toPromise();
    }

    /**
     * Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Create catalog
     * @param param the request object
     */
    public catalogsCreateWithHttpInfo(param: CatalogsApiCatalogsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<Catalog>> {
        return this.api.catalogsCreateWithHttpInfo(param.catalogsCreateRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     * Create catalog
     * @param param the request object
     */
    public catalogsCreate(param: CatalogsApiCatalogsCreateRequest, options?: ConfigurationOptions): Promise<Catalog> {
        return this.api.catalogsCreate(param.catalogsCreateRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * List catalogs
     * @param param the request object
     */
    public catalogsListWithHttpInfo(param: CatalogsApiCatalogsListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<CatalogsList200Response>> {
        return this.api.catalogsListWithHttpInfo(param.bookmark, param.pageSize, param.adAccountId,  options).toPromise();
    }

    /**
     * Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>
     * List catalogs
     * @param param the request object
     */
    public catalogsList(param: CatalogsApiCatalogsListRequest = {}, options?: ConfigurationOptions): Promise<CatalogsList200Response> {
        return this.api.catalogsList(param.bookmark, param.pageSize, param.adAccountId,  options).toPromise();
    }

}

import { ObservableConversionEqsApi } from "./ObservableAPI";
import { ConversionEqsApiRequestFactory, ConversionEqsApiResponseProcessor} from "../apis/ConversionEqsApi";

export interface ConversionEqsApiConversionEqsListRequest {
    /**
     * Lookback window (number of days).
     * Defaults to: undefined
     * @type LookbackPeriodOptions
     * @memberof ConversionEqsApiconversionEqsList
     */
    lookbackPeriod: LookbackPeriodOptions
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof ConversionEqsApiconversionEqsList
     */
    adAccountId: string
    /**
     * Source platform of event.
     * Defaults to: undefined
     * @type SourcePlatformOptions
     * @memberof ConversionEqsApiconversionEqsList
     */
    sourcePlatform?: SourcePlatformOptions
    /**
     * Ingestion source of event.
     * Defaults to: undefined
     * @type IngestionSourceOptions
     * @memberof ConversionEqsApiconversionEqsList
     */
    ingestionSource?: IngestionSourceOptions
}

export class ObjectConversionEqsApi {
    private api: ObservableConversionEqsApi

    public constructor(configuration: Configuration, requestFactory?: ConversionEqsApiRequestFactory, responseProcessor?: ConversionEqsApiResponseProcessor) {
        this.api = new ObservableConversionEqsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
     * Get event quality score (EQS)
     * @param param the request object
     */
    public conversionEqsListWithHttpInfo(param: ConversionEqsApiConversionEqsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<EventQualityScore>>> {
        return this.api.conversionEqsListWithHttpInfo(param.lookbackPeriod, param.adAccountId, param.sourcePlatform, param.ingestionSource,  options).toPromise();
    }

    /**
     * Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
     * Get event quality score (EQS)
     * @param param the request object
     */
    public conversionEqsList(param: ConversionEqsApiConversionEqsListRequest, options?: ConfigurationOptions): Promise<Array<EventQualityScore>> {
        return this.api.conversionEqsList(param.lookbackPeriod, param.adAccountId, param.sourcePlatform, param.ingestionSource,  options).toPromise();
    }

}

import { ObservableConversionEventsApi } from "./ObservableAPI";
import { ConversionEventsApiRequestFactory, ConversionEventsApiResponseProcessor} from "../apis/ConversionEventsApi";

export interface ConversionEventsApiEventsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Defaults to: undefined
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
     * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/api-features/conversion-overview/\">Conversions Guide</a> for more details. (Note that the authorization header required is <code>Authorization: Bearer &lt;access_token&gt;</code>). - The token\'s <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
     * Send conversions
     * @param param the request object
     */
    public eventsCreateWithHttpInfo(param: ConversionEventsApiEventsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<ConversionApiResponse>> {
        return this.api.eventsCreateWithHttpInfo(param.adAccountId, param.conversionEvents, param.test,  options).toPromise();
    }

    /**
     * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/api-features/conversion-overview/\">Conversions Guide</a> for more details. (Note that the authorization header required is <code>Authorization: Bearer &lt;access_token&gt;</code>). - The token\'s <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
     * Send conversions
     * @param param the request object
     */
    public eventsCreate(param: ConversionEventsApiEventsCreateRequest, options?: ConfigurationOptions): Promise<ConversionApiResponse> {
        return this.api.eventsCreate(param.adAccountId, param.conversionEvents, param.test,  options).toPromise();
    }

}

import { ObservableConversionTagsApi } from "./ObservableAPI";
import { ConversionTagsApiRequestFactory, ConversionTagsApiResponseProcessor} from "../apis/ConversionTagsApi";

export interface ConversionTagsApiConversionTagsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof ConversionTagsApiconversionTagsCreate
     */
    adAccountId: string
    /**
     * 
     * @type ConversionTagCreate
     * @memberof ConversionTagsApiconversionTagsCreate
     */
    conversionTagCreate: ConversionTagCreate
}

export interface ConversionTagsApiConversionTagsGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof ConversionTagsApiconversionTagsGet
     */
    adAccountId: string
    /**
     * Id of the conversion tag.
     * Defaults to: undefined
     * @type string
     * @memberof ConversionTagsApiconversionTagsGet
     */
    conversionTagId: string
}

export interface ConversionTagsApiConversionTagsListRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof ConversionTagsApiconversionTagsList
     */
    adAccountId: string
    /**
     * Filter by deleted status
     * Defaults to: false
     * @type boolean
     * @memberof ConversionTagsApiconversionTagsList
     */
    filterDeleted?: boolean
}

export interface ConversionTagsApiOcpmEligibleConversionTagsGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof ConversionTagsApiocpmEligibleConversionTagsGet
     */
    adAccountId: string
}

export interface ConversionTagsApiPageVisitConversionTagsGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof ConversionTagsApipageVisitConversionTagsGet
     */
    adAccountId: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof ConversionTagsApipageVisitConversionTagsGet
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * Defaults to: undefined
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof ConversionTagsApipageVisitConversionTagsGet
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
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
     * Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account\'s website after they view the ad account\'s ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)
     * Create conversion tag
     * @param param the request object
     */
    public conversionTagsCreateWithHttpInfo(param: ConversionTagsApiConversionTagsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<ConversionTag>> {
        return this.api.conversionTagsCreateWithHttpInfo(param.adAccountId, param.conversionTagCreate,  options).toPromise();
    }

    /**
     * Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account\'s website after they view the ad account\'s ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)
     * Create conversion tag
     * @param param the request object
     */
    public conversionTagsCreate(param: ConversionTagsApiConversionTagsCreateRequest, options?: ConfigurationOptions): Promise<ConversionTag> {
        return this.api.conversionTagsCreate(param.adAccountId, param.conversionTagCreate,  options).toPromise();
    }

    /**
     * Get information about an existing conversion tag.
     * Get conversion tag
     * @param param the request object
     */
    public conversionTagsGetWithHttpInfo(param: ConversionTagsApiConversionTagsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<ConversionTag>> {
        return this.api.conversionTagsGetWithHttpInfo(param.adAccountId, param.conversionTagId,  options).toPromise();
    }

    /**
     * Get information about an existing conversion tag.
     * Get conversion tag
     * @param param the request object
     */
    public conversionTagsGet(param: ConversionTagsApiConversionTagsGetRequest, options?: ConfigurationOptions): Promise<ConversionTag> {
        return this.api.conversionTagsGet(param.adAccountId, param.conversionTagId,  options).toPromise();
    }

    /**
     * List conversion tags associated with an ad account.
     * List conversion tags
     * @param param the request object
     */
    public conversionTagsListWithHttpInfo(param: ConversionTagsApiConversionTagsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<ConversionTagsList200Response>> {
        return this.api.conversionTagsListWithHttpInfo(param.adAccountId, param.filterDeleted,  options).toPromise();
    }

    /**
     * List conversion tags associated with an ad account.
     * List conversion tags
     * @param param the request object
     */
    public conversionTagsList(param: ConversionTagsApiConversionTagsListRequest, options?: ConfigurationOptions): Promise<ConversionTagsList200Response> {
        return this.api.conversionTagsList(param.adAccountId, param.filterDeleted,  options).toPromise();
    }

    /**
     * Get Ocpm eligible conversion tag events for an ad account.
     * Get Ocpm eligible conversion tags
     * @param param the request object
     */
    public ocpmEligibleConversionTagsGetWithHttpInfo(param: ConversionTagsApiOcpmEligibleConversionTagsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<{ [key: string]: Array<ConversionEventResponse>; }>> {
        return this.api.ocpmEligibleConversionTagsGetWithHttpInfo(param.adAccountId,  options).toPromise();
    }

    /**
     * Get Ocpm eligible conversion tag events for an ad account.
     * Get Ocpm eligible conversion tags
     * @param param the request object
     */
    public ocpmEligibleConversionTagsGet(param: ConversionTagsApiOcpmEligibleConversionTagsGetRequest, options?: ConfigurationOptions): Promise<{ [key: string]: Array<ConversionEventResponse>; }> {
        return this.api.ocpmEligibleConversionTagsGet(param.adAccountId,  options).toPromise();
    }

    /**
     * Get all page visit conversion tag events for an ad account.
     * Get page visit conversion tags
     * @param param the request object
     */
    public pageVisitConversionTagsGetWithHttpInfo(param: ConversionTagsApiPageVisitConversionTagsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<PageVisitConversionTagsGet200Response>> {
        return this.api.pageVisitConversionTagsGetWithHttpInfo(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * Get all page visit conversion tag events for an ad account.
     * Get page visit conversion tags
     * @param param the request object
     */
    public pageVisitConversionTagsGet(param: ConversionTagsApiPageVisitConversionTagsGetRequest, options?: ConfigurationOptions): Promise<PageVisitConversionTagsGet200Response> {
        return this.api.pageVisitConversionTagsGet(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

}

import { ObservableConversionsApi } from "./ObservableAPI";
import { ConversionsApiRequestFactory, ConversionsApiResponseProcessor} from "../apis/ConversionsApi";

export interface ConversionsApiAdvertiserDefinedEventsGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof ConversionsApiadvertiserDefinedEventsGet
     */
    adAccountId: string
}

export class ObjectConversionsApi {
    private api: ObservableConversionsApi

    public constructor(configuration: Configuration, requestFactory?: ConversionsApiRequestFactory, responseProcessor?: ConversionsApiResponseProcessor) {
        this.api = new ObservableConversionsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * <p>Get advertiser defined events for the given ad account.</p>
     * Get advertiser defined events
     * @param param the request object
     */
    public advertiserDefinedEventsGetWithHttpInfo(param: ConversionsApiAdvertiserDefinedEventsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdvertiserDefinedEventsResponse>> {
        return this.api.advertiserDefinedEventsGetWithHttpInfo(param.adAccountId,  options).toPromise();
    }

    /**
     * <p>Get advertiser defined events for the given ad account.</p>
     * Get advertiser defined events
     * @param param the request object
     */
    public advertiserDefinedEventsGet(param: ConversionsApiAdvertiserDefinedEventsGetRequest, options?: ConfigurationOptions): Promise<AdvertiserDefinedEventsResponse> {
        return this.api.advertiserDefinedEventsGet(param.adAccountId,  options).toPromise();
    }

}

import { ObservableCustomerListUploadsApi } from "./ObservableAPI";
import { CustomerListUploadsApiRequestFactory, CustomerListUploadsApiResponseProcessor} from "../apis/CustomerListUploadsApi";

export interface CustomerListUploadsApiCustomerListUploadsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CustomerListUploadsApicustomerListUploadsCreate
     */
    adAccountId: string
    /**
     * Unique identifier of a customer list
     * Defaults to: undefined
     * @type string
     * @memberof CustomerListUploadsApicustomerListUploadsCreate
     */
    customerListId: string
    /**
     * Parameters to create a customer list upload request
     * @type CustomerListUploadCreateRequest
     * @memberof CustomerListUploadsApicustomerListUploadsCreate
     */
    customerListUploadCreateRequest: CustomerListUploadCreateRequest
}

export interface CustomerListUploadsApiCustomerListUploadsGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CustomerListUploadsApicustomerListUploadsGet
     */
    adAccountId: string
    /**
     * Unique identifier of a customer list
     * Defaults to: undefined
     * @type string
     * @memberof CustomerListUploadsApicustomerListUploadsGet
     */
    customerListId: string
    /**
     * Unique identifier of a customer list upload
     * Defaults to: undefined
     * @type string
     * @memberof CustomerListUploadsApicustomerListUploadsGet
     */
    customerListUploadId: string
}

export interface CustomerListUploadsApiCustomerListUploadsRunRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CustomerListUploadsApicustomerListUploadsRun
     */
    adAccountId: string
    /**
     * Unique identifier of a customer list
     * Defaults to: undefined
     * @type string
     * @memberof CustomerListUploadsApicustomerListUploadsRun
     */
    customerListId: string
    /**
     * Unique identifier of a customer list upload
     * Defaults to: undefined
     * @type string
     * @memberof CustomerListUploadsApicustomerListUploadsRun
     */
    customerListUploadId: string
}

export class ObjectCustomerListUploadsApi {
    private api: ObservableCustomerListUploadsApi

    public constructor(configuration: Configuration, requestFactory?: CustomerListUploadsApiRequestFactory, responseProcessor?: CustomerListUploadsApiResponseProcessor) {
        this.api = new ObservableCustomerListUploadsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>
     * Create customer list upload
     * @param param the request object
     */
    public customerListUploadsCreateWithHttpInfo(param: CustomerListUploadsApiCustomerListUploadsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<CustomerListUploadCreateResponse>> {
        return this.api.customerListUploadsCreateWithHttpInfo(param.adAccountId, param.customerListId, param.customerListUploadCreateRequest,  options).toPromise();
    }

    /**
     * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>
     * Create customer list upload
     * @param param the request object
     */
    public customerListUploadsCreate(param: CustomerListUploadsApiCustomerListUploadsCreateRequest, options?: ConfigurationOptions): Promise<CustomerListUploadCreateResponse> {
        return this.api.customerListUploadsCreate(param.adAccountId, param.customerListId, param.customerListUploadCreateRequest,  options).toPromise();
    }

    /**
     * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>
     * Get customer list upload
     * @param param the request object
     */
    public customerListUploadsGetWithHttpInfo(param: CustomerListUploadsApiCustomerListUploadsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<CustomerListUploadResponse>> {
        return this.api.customerListUploadsGetWithHttpInfo(param.adAccountId, param.customerListId, param.customerListUploadId,  options).toPromise();
    }

    /**
     * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>
     * Get customer list upload
     * @param param the request object
     */
    public customerListUploadsGet(param: CustomerListUploadsApiCustomerListUploadsGetRequest, options?: ConfigurationOptions): Promise<CustomerListUploadResponse> {
        return this.api.customerListUploadsGet(param.adAccountId, param.customerListId, param.customerListUploadId,  options).toPromise();
    }

    /**
     * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>
     * Run customer list upload
     * @param param the request object
     */
    public customerListUploadsRunWithHttpInfo(param: CustomerListUploadsApiCustomerListUploadsRunRequest, options?: ConfigurationOptions): Promise<HttpInfo<CustomerListUploadResponse>> {
        return this.api.customerListUploadsRunWithHttpInfo(param.adAccountId, param.customerListId, param.customerListUploadId,  options).toPromise();
    }

    /**
     * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>
     * Run customer list upload
     * @param param the request object
     */
    public customerListUploadsRun(param: CustomerListUploadsApiCustomerListUploadsRunRequest, options?: ConfigurationOptions): Promise<CustomerListUploadResponse> {
        return this.api.customerListUploadsRun(param.adAccountId, param.customerListId, param.customerListUploadId,  options).toPromise();
    }

}

import { ObservableCustomerListsApi } from "./ObservableAPI";
import { CustomerListsApiRequestFactory, CustomerListsApiResponseProcessor} from "../apis/CustomerListsApi";

export interface CustomerListsApiCustomerListsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Defaults to: undefined
     * @type string
     * @memberof CustomerListsApicustomerListsGet
     */
    adAccountId: string
    /**
     * Unique identifier of a customer list
     * Defaults to: undefined
     * @type string
     * @memberof CustomerListsApicustomerListsGet
     */
    customerListId: string
}

export interface CustomerListsApiCustomerListsListRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CustomerListsApicustomerListsList
     */
    adAccountId: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof CustomerListsApicustomerListsList
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * Defaults to: undefined
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof CustomerListsApicustomerListsList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof CustomerListsApicustomerListsList
     */
    bookmark?: string
}

export interface CustomerListsApiCustomerListsUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof CustomerListsApicustomerListsUpdate
     */
    adAccountId: string
    /**
     * Unique identifier of a customer list
     * Defaults to: undefined
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
     * <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the <a href=\"https://developer.pinterest.com/docs/api/v5/audiences-create\" target=\"blank\">create audience endpoint</a>.</p>
     * Create customer lists
     * @param param the request object
     */
    public customerListsCreateWithHttpInfo(param: CustomerListsApiCustomerListsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<CustomerList>> {
        return this.api.customerListsCreateWithHttpInfo(param.adAccountId, param.customerListRequest,  options).toPromise();
    }

    /**
     * <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the <a href=\"https://developer.pinterest.com/docs/api/v5/audiences-create\" target=\"blank\">create audience endpoint</a>.</p>
     * Create customer lists
     * @param param the request object
     */
    public customerListsCreate(param: CustomerListsApiCustomerListsCreateRequest, options?: ConfigurationOptions): Promise<CustomerList> {
        return this.api.customerListsCreate(param.adAccountId, param.customerListRequest,  options).toPromise();
    }

    /**
     * Gets a specific customer list given the customer list ID.
     * Get customer list
     * @param param the request object
     */
    public customerListsGetWithHttpInfo(param: CustomerListsApiCustomerListsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<CustomerList>> {
        return this.api.customerListsGetWithHttpInfo(param.adAccountId, param.customerListId,  options).toPromise();
    }

    /**
     * Gets a specific customer list given the customer list ID.
     * Get customer list
     * @param param the request object
     */
    public customerListsGet(param: CustomerListsApiCustomerListsGetRequest, options?: ConfigurationOptions): Promise<CustomerList> {
        return this.api.customerListsGet(param.adAccountId, param.customerListId,  options).toPromise();
    }

    /**
     * <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
     * Get customer lists
     * @param param the request object
     */
    public customerListsListWithHttpInfo(param: CustomerListsApiCustomerListsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<CustomerListsList200Response>> {
        return this.api.customerListsListWithHttpInfo(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
     * Get customer lists
     * @param param the request object
     */
    public customerListsList(param: CustomerListsApiCustomerListsListRequest, options?: ConfigurationOptions): Promise<CustomerListsList200Response> {
        return this.api.customerListsList(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
     * Update customer list
     * @param param the request object
     */
    public customerListsUpdateWithHttpInfo(param: CustomerListsApiCustomerListsUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<CustomerList>> {
        return this.api.customerListsUpdateWithHttpInfo(param.adAccountId, param.customerListId, param.customerListUpdateRequest,  options).toPromise();
    }

    /**
     * <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
     * Update customer list
     * @param param the request object
     */
    public customerListsUpdate(param: CustomerListsApiCustomerListsUpdateRequest, options?: ConfigurationOptions): Promise<CustomerList> {
        return this.api.customerListsUpdate(param.adAccountId, param.customerListId, param.customerListUpdateRequest,  options).toPromise();
    }

}

import { ObservableIntegrationsApi } from "./ObservableAPI";
import { IntegrationsApiRequestFactory, IntegrationsApiResponseProcessor} from "../apis/IntegrationsApi";

export interface IntegrationsApiIntegrationsCommerceDelRequest {
    /**
     * External business ID for the integration.
     * Defaults to: undefined
     * @type string
     * @memberof IntegrationsApiintegrationsCommerceDel
     */
    externalBusinessId: string
}

export interface IntegrationsApiIntegrationsCommerceGetRequest {
    /**
     * External business ID for the integration.
     * Defaults to: undefined
     * @type string
     * @memberof IntegrationsApiintegrationsCommerceGet
     */
    externalBusinessId: string
}

export interface IntegrationsApiIntegrationsCommercePatchRequest {
    /**
     * External business ID for the integration.
     * Defaults to: undefined
     * @type string
     * @memberof IntegrationsApiintegrationsCommercePatch
     */
    externalBusinessId: string
    /**
     * Parameters to get create/update the Integration Metadata
     * @type IntegrationRequestPatch
     * @memberof IntegrationsApiintegrationsCommercePatch
     */
    integrationRequestPatch: IntegrationRequestPatch
}

export interface IntegrationsApiIntegrationsCommercePostRequest {
    /**
     * Parameters to get create/update the Integration Metadata
     * @type IntegrationRequest
     * @memberof IntegrationsApiintegrationsCommercePost
     */
    integrationRequest: IntegrationRequest
}

export interface IntegrationsApiIntegrationsGetByIdRequest {
    /**
     * Integration ID.
     * Defaults to: undefined
     * @type string
     * @memberof IntegrationsApiintegrationsGetById
     */
    id: string
}

export interface IntegrationsApiIntegrationsGetListRequest {
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof IntegrationsApiintegrationsGetList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
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
    public integrationsCommerceDelWithHttpInfo(param: IntegrationsApiIntegrationsCommerceDelRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.integrationsCommerceDelWithHttpInfo(param.externalBusinessId,  options).toPromise();
    }

    /**
     * Delete commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Delete commerce integration
     * @param param the request object
     */
    public integrationsCommerceDel(param: IntegrationsApiIntegrationsCommerceDelRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.integrationsCommerceDel(param.externalBusinessId,  options).toPromise();
    }

    /**
     * Get commerce integration metadata associated with the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get commerce integration
     * @param param the request object
     */
    public integrationsCommerceGetWithHttpInfo(param: IntegrationsApiIntegrationsCommerceGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<IntegrationMetadata>> {
        return this.api.integrationsCommerceGetWithHttpInfo(param.externalBusinessId,  options).toPromise();
    }

    /**
     * Get commerce integration metadata associated with the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get commerce integration
     * @param param the request object
     */
    public integrationsCommerceGet(param: IntegrationsApiIntegrationsCommerceGetRequest, options?: ConfigurationOptions): Promise<IntegrationMetadata> {
        return this.api.integrationsCommerceGet(param.externalBusinessId,  options).toPromise();
    }

    /**
     * Update commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Update commerce integration
     * @param param the request object
     */
    public integrationsCommercePatchWithHttpInfo(param: IntegrationsApiIntegrationsCommercePatchRequest, options?: ConfigurationOptions): Promise<HttpInfo<IntegrationMetadata>> {
        return this.api.integrationsCommercePatchWithHttpInfo(param.externalBusinessId, param.integrationRequestPatch,  options).toPromise();
    }

    /**
     * Update commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Update commerce integration
     * @param param the request object
     */
    public integrationsCommercePatch(param: IntegrationsApiIntegrationsCommercePatchRequest, options?: ConfigurationOptions): Promise<IntegrationMetadata> {
        return this.api.integrationsCommercePatch(param.externalBusinessId, param.integrationRequestPatch,  options).toPromise();
    }

    /**
     * Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Create commerce integration
     * @param param the request object
     */
    public integrationsCommercePostWithHttpInfo(param: IntegrationsApiIntegrationsCommercePostRequest, options?: ConfigurationOptions): Promise<HttpInfo<IntegrationMetadata>> {
        return this.api.integrationsCommercePostWithHttpInfo(param.integrationRequest,  options).toPromise();
    }

    /**
     * Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Create commerce integration
     * @param param the request object
     */
    public integrationsCommercePost(param: IntegrationsApiIntegrationsCommercePostRequest, options?: ConfigurationOptions): Promise<IntegrationMetadata> {
        return this.api.integrationsCommercePost(param.integrationRequest,  options).toPromise();
    }

    /**
     * Get integration metadata by ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get integration metadata
     * @param param the request object
     */
    public integrationsGetByIdWithHttpInfo(param: IntegrationsApiIntegrationsGetByIdRequest, options?: ConfigurationOptions): Promise<HttpInfo<IntegrationRecord>> {
        return this.api.integrationsGetByIdWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Get integration metadata by ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get integration metadata
     * @param param the request object
     */
    public integrationsGetById(param: IntegrationsApiIntegrationsGetByIdRequest, options?: ConfigurationOptions): Promise<IntegrationRecord> {
        return this.api.integrationsGetById(param.id,  options).toPromise();
    }

    /**
     * Get integration metadata list. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get integration metadata list
     * @param param the request object
     */
    public integrationsGetListWithHttpInfo(param: IntegrationsApiIntegrationsGetListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<IntegrationsGetList200Response>> {
        return this.api.integrationsGetListWithHttpInfo(param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get integration metadata list. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get integration metadata list
     * @param param the request object
     */
    public integrationsGetList(param: IntegrationsApiIntegrationsGetListRequest = {}, options?: ConfigurationOptions): Promise<IntegrationsGetList200Response> {
        return this.api.integrationsGetList(param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * This endpoint receives batched logs from integration applications on partner platforms. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Receives batched logs from integration applications.
     * @param param the request object
     */
    public integrationsLogsPostWithHttpInfo(param: IntegrationsApiIntegrationsLogsPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<IntegrationLogsSuccessResponse>> {
        return this.api.integrationsLogsPostWithHttpInfo(param.integrationLogsRequest,  options).toPromise();
    }

    /**
     * This endpoint receives batched logs from integration applications on partner platforms. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Receives batched logs from integration applications.
     * @param param the request object
     */
    public integrationsLogsPost(param: IntegrationsApiIntegrationsLogsPostRequest, options?: ConfigurationOptions): Promise<IntegrationLogsSuccessResponse> {
        return this.api.integrationsLogsPost(param.integrationLogsRequest,  options).toPromise();
    }

}

import { ObservableKeywordsApi } from "./ObservableAPI";
import { KeywordsApiRequestFactory, KeywordsApiResponseProcessor} from "../apis/KeywordsApi";

export interface KeywordsApiCountryKeywordsMetricsGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof KeywordsApicountryKeywordsMetricsGet
     */
    adAccountId: string
    /**
     * Two letter country code (ISO 3166-1 alpha-2)
     * Defaults to: undefined
     * @type string
     * @memberof KeywordsApicountryKeywordsMetricsGet
     */
    countryCode: string
    /**
     * Comma-separated keywords
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof KeywordsApicountryKeywordsMetricsGet
     */
    keywords: Array<string>
}

export interface KeywordsApiKeywordsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Defaults to: undefined
     * @type string
     * @memberof KeywordsApikeywordsGet
     */
    adAccountId: string
    /**
     * Campaign Id to use to filter the results.
     * Defaults to: undefined
     * @type string
     * @memberof KeywordsApikeywordsGet
     */
    campaignId?: string
    /**
     * Ad group Id.
     * Defaults to: undefined
     * @type string
     * @memberof KeywordsApikeywordsGet
     */
    adGroupId?: string
    /**
     * List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof KeywordsApikeywordsGet
     */
    adGroupIds?: Array<string>
    /**
     * Keyword &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot;&gt;match type&lt;/a&gt;
     * Defaults to: undefined
     * @type Array&lt;MatchType&gt;
     * @memberof KeywordsApikeywordsGet
     */
    matchTypes?: Array<MatchType>
    /**
     * Maximum number of items to include in a single page of the response. Default maximum of 250. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Defaults to: 25
     * @type number
     * @memberof KeywordsApikeywordsGet
     */
    pageSize?: number
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof KeywordsApikeywordsGet
     */
    bookmark?: string
}

export interface KeywordsApiKeywordsUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Defaults to: undefined
     * @type TrendsSupportedRegion
     * @memberof KeywordsApitrendingKeywordsList
     */
    region: TrendsSupportedRegion
    /**
     * The methodology used to rank how trendy a keyword is. - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter - &#x60;monthly&#x60; trends have high search volume in the last month - &#x60;yearly&#x60; trends have high search volume in the last year - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
     * Defaults to: undefined
     * @type TrendType
     * @memberof KeywordsApitrendingKeywordsList
     */
    trendType: TrendType
    /**
     * If set, filters the results to trends associated with the specified interests.&lt;br /&gt; If unset, trends for all interests will be returned.&lt;br /&gt; The list of supported interests is: - &#x60;animals&#x60; - Animals - &#x60;architecture&#x60; - Architecture - &#x60;art&#x60; - Art - &#x60;beauty&#x60; - Beauty - &#x60;childrens_fashion&#x60; - Children\&#39;s Fashion - &#x60;design&#x60; - Design - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts - &#x60;education&#x60; - Education - &#x60;electronics&#x60; - Electronics - &#x60;entertainment&#x60; - Entertainment - &#x60;event_planning&#x60; - Event Planning - &#x60;finance&#x60; - Finance - &#x60;food_and_drinks&#x60; - Food &amp; Drink - &#x60;gardening&#x60; - Gardening - &#x60;health&#x60; - Health - &#x60;home_decor&#x60; - Home Decor - &#x60;mens_fashion&#x60; - Men\&#39;s Fashion - &#x60;parenting&#x60; - Parenting - &#x60;quotes&#x60; - Quotes - &#x60;sport&#x60; - Sports - &#x60;travel&#x60; - Travel - &#x60;vehicles&#x60; - Vehicles - &#x60;wedding&#x60; - Wedding - &#x60;womens_fashion&#x60; - Women\&#39;s Fashion
     * Defaults to: undefined
     * @type Array&lt;&#39;animals&#39; | &#39;architecture&#39; | &#39;art&#39; | &#39;beauty&#39; | &#39;childrens_fashion&#39; | &#39;design&#39; | &#39;diy_and_crafts&#39; | &#39;education&#39; | &#39;electronics&#39; | &#39;entertainment&#39; | &#39;event_planning&#39; | &#39;finance&#39; | &#39;food_and_drinks&#39; | &#39;gardening&#39; | &#39;health&#39; | &#39;home_decor&#39; | &#39;mens_fashion&#39; | &#39;parenting&#39; | &#39;quotes&#39; | &#39;sport&#39; | &#39;travel&#39; | &#39;vehicles&#39; | &#39;wedding&#39; | &#39;womens_fashion&#39;&gt;
     * @memberof KeywordsApitrendingKeywordsList
     */
    interests?: Array<'animals' | 'architecture' | 'art' | 'beauty' | 'childrens_fashion' | 'design' | 'diy_and_crafts' | 'education' | 'electronics' | 'entertainment' | 'event_planning' | 'finance' | 'food_and_drinks' | 'gardening' | 'health' | 'home_decor' | 'mens_fashion' | 'parenting' | 'quotes' | 'sport' | 'travel' | 'vehicles' | 'wedding' | 'womens_fashion'>
    /**
     * If set, filters the results to trends among users who identify with the specified gender(s).&lt;br /&gt; If unset, trends among all genders will be returned.&lt;br /&gt; The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings.
     * Defaults to: undefined
     * @type Array&lt;&#39;female&#39; | &#39;male&#39; | &#39;unknown&#39;&gt;
     * @memberof KeywordsApitrendingKeywordsList
     */
    genders?: Array<'female' | 'male' | 'unknown'>
    /**
     * If set, filters the results to trends among users in the specified age range(s).&lt;br /&gt; If unset, trends among all age groups will be returned.
     * Defaults to: undefined
     * @type Array&lt;&#39;18-24&#39; | &#39;25-34&#39; | &#39;35-44&#39; | &#39;45-49&#39; | &#39;50-54&#39; | &#39;55-64&#39; | &#39;65+&#39;&gt;
     * @memberof KeywordsApitrendingKeywordsList
     */
    ages?: Array<'18-24' | '25-34' | '35-44' | '45-49' | '50-54' | '55-64' | '65+'>
    /**
     * If set, filters the results to top trends which include at least one of the specified keywords.&lt;br /&gt; If unset, no keyword filtering logic is applied.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof KeywordsApitrendingKeywordsList
     */
    includeKeywords?: Array<string>
    /**
     * Governs how the resulting time series data will be normalized to a [0-100] scale.&lt;br /&gt; By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword\&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.&lt;br /&gt; If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.
     * Defaults to: false
     * @type boolean
     * @memberof KeywordsApitrendingKeywordsList
     */
    normalizeAgainstGroup?: boolean
    /**
     * The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends.
     * Minimum: 1
     * Maximum: 50
     * Defaults to: 50
     * @type number
     * @memberof KeywordsApitrendingKeywordsList
     */
    limit?: number
    /**
     * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; Including predicted weekly search volume data for the next 90 days. By default (&#x60;false&#x60;), the response will not include predicted data.
     * Defaults to: false
     * @type boolean
     * @memberof KeywordsApitrendingKeywordsList
     */
    includePrediction?: boolean
    /**
     * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; Including the age and gender distribution for each keyword. By default (&#x60;false&#x60;), the response will not include demographics data.
     * Defaults to: false
     * @type boolean
     * @memberof KeywordsApitrendingKeywordsList
     */
    includeDemographics?: boolean
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
    public countryKeywordsMetricsGetWithHttpInfo(param: KeywordsApiCountryKeywordsMetricsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<KeywordsMetricsArrayResponse>> {
        return this.api.countryKeywordsMetricsGetWithHttpInfo(param.adAccountId, param.countryCode, param.keywords,  options).toPromise();
    }

    /**
     * See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).
     * Get country\'s keyword metrics
     * @param param the request object
     */
    public countryKeywordsMetricsGet(param: KeywordsApiCountryKeywordsMetricsGetRequest, options?: ConfigurationOptions): Promise<KeywordsMetricsArrayResponse> {
        return this.api.countryKeywordsMetricsGet(param.adAccountId, param.countryCode, param.keywords,  options).toPromise();
    }

    /**
     * <p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding (\'_NEGATIVE\').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/reference/rate-limits/\">WRITE</a>.</p>
     * Create keywords
     * @param param the request object
     */
    public keywordsCreateWithHttpInfo(param: KeywordsApiKeywordsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<KeywordsResponse>> {
        return this.api.keywordsCreateWithHttpInfo(param.adAccountId, param.keywordsRequest,  options).toPromise();
    }

    /**
     * <p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding (\'_NEGATIVE\').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/reference/rate-limits/\">WRITE</a>.</p>
     * Create keywords
     * @param param the request object
     */
    public keywordsCreate(param: KeywordsApiKeywordsCreateRequest, options?: ConfigurationOptions): Promise<KeywordsResponse> {
        return this.api.keywordsCreate(param.adAccountId, param.keywordsRequest,  options).toPromise();
    }

    /**
     * <p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding (\'_NEGATIVE\').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>
     * Get keywords
     * @param param the request object
     */
    public keywordsGetWithHttpInfo(param: KeywordsApiKeywordsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<KeywordsGet200Response>> {
        return this.api.keywordsGetWithHttpInfo(param.adAccountId, param.campaignId, param.adGroupId, param.adGroupIds, param.matchTypes, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * <p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding (\'_NEGATIVE\').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>
     * Get keywords
     * @param param the request object
     */
    public keywordsGet(param: KeywordsApiKeywordsGetRequest, options?: ConfigurationOptions): Promise<KeywordsGet200Response> {
        return this.api.keywordsGet(param.adAccountId, param.campaignId, param.adGroupId, param.adGroupIds, param.matchTypes, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * <p>Update one or more keywords\' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity\'s keywords list.</p>
     * Update keywords
     * @param param the request object
     */
    public keywordsUpdateWithHttpInfo(param: KeywordsApiKeywordsUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<KeywordsResponse>> {
        return this.api.keywordsUpdateWithHttpInfo(param.adAccountId, param.keywordUpdateBody,  options).toPromise();
    }

    /**
     * <p>Update one or more keywords\' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity\'s keywords list.</p>
     * Update keywords
     * @param param the request object
     */
    public keywordsUpdate(param: KeywordsApiKeywordsUpdateRequest, options?: ConfigurationOptions): Promise<KeywordsResponse> {
        return this.api.keywordsUpdate(param.adAccountId, param.keywordUpdateBody,  options).toPromise();
    }

    /**
     * <p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>. 
     * List trending keywords
     * @param param the request object
     */
    public trendingKeywordsListWithHttpInfo(param: KeywordsApiTrendingKeywordsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<TrendingKeywordsResponse>> {
        return this.api.trendingKeywordsListWithHttpInfo(param.region, param.trendType, param.interests, param.genders, param.ages, param.includeKeywords, param.normalizeAgainstGroup, param.limit, param.includePrediction, param.includeDemographics,  options).toPromise();
    }

    /**
     * <p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>. 
     * List trending keywords
     * @param param the request object
     */
    public trendingKeywordsList(param: KeywordsApiTrendingKeywordsListRequest, options?: ConfigurationOptions): Promise<TrendingKeywordsResponse> {
        return this.api.trendingKeywordsList(param.region, param.trendType, param.interests, param.genders, param.ages, param.includeKeywords, param.normalizeAgainstGroup, param.limit, param.includePrediction, param.includeDemographics,  options).toPromise();
    }

}

import { ObservableLabelsApi } from "./ObservableAPI";
import { LabelsApiRequestFactory, LabelsApiResponseProcessor} from "../apis/LabelsApi";

export interface LabelsApiLabelsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof LabelsApilabelsCreate
     */
    adAccountId: string
    /**
     * 
     * @type LabelCreateRequest
     * @memberof LabelsApilabelsCreate
     */
    labelCreateRequest: LabelCreateRequest
}

export interface LabelsApiLabelsListRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof LabelsApilabelsList
     */
    adAccountId: string
    /**
     * List of Campaign Ids to use to filter the results.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof LabelsApilabelsList
     */
    campaignIds?: Array<string>
    /**
     * List of Label Ids to use to filter the results.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof LabelsApilabelsList
     */
    labelIds?: Array<string>
    /**
     * Label entity status
     * Defaults to: undefined
     * @type Array&lt;&#39;ACTIVE&#39; | &#39;ARCHIVED&#39;&gt;
     * @memberof LabelsApilabelsList
     */
    entityStatuses?: Array<'ACTIVE' | 'ARCHIVED'>
    /**
     * Label type.
     * Defaults to: undefined
     * @type Array&lt;&#39;BRAND&#39; | &#39;CUSTOM&#39;&gt;
     * @memberof LabelsApilabelsList
     */
    labelTypes?: Array<'BRAND' | 'CUSTOM'>
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof LabelsApilabelsList
     */
    pageSize?: number
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof LabelsApilabelsList
     */
    bookmark?: string
}

export interface LabelsApiLabelsUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof LabelsApilabelsUpdate
     */
    adAccountId: string
    /**
     * 
     * @type LabelUpdateRequest
     * @memberof LabelsApilabelsUpdate
     */
    labelUpdateRequest: LabelUpdateRequest
}

export class ObjectLabelsApi {
    private api: ObservableLabelsApi

    public constructor(configuration: Configuration, requestFactory?: LabelsApiRequestFactory, responseProcessor?: LabelsApiResponseProcessor) {
        this.api = new ObservableLabelsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * <p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>
     * Create labels
     * @param param the request object
     */
    public labelsCreateWithHttpInfo(param: LabelsApiLabelsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<LabelsResponse>> {
        return this.api.labelsCreateWithHttpInfo(param.adAccountId, param.labelCreateRequest,  options).toPromise();
    }

    /**
     * <p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>
     * Create labels
     * @param param the request object
     */
    public labelsCreate(param: LabelsApiLabelsCreateRequest, options?: ConfigurationOptions): Promise<LabelsResponse> {
        return this.api.labelsCreate(param.adAccountId, param.labelCreateRequest,  options).toPromise();
    }

    /**
     * <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>
     * List labels
     * @param param the request object
     */
    public labelsListWithHttpInfo(param: LabelsApiLabelsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<LabelsList200Response>> {
        return this.api.labelsListWithHttpInfo(param.adAccountId, param.campaignIds, param.labelIds, param.entityStatuses, param.labelTypes, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>
     * List labels
     * @param param the request object
     */
    public labelsList(param: LabelsApiLabelsListRequest, options?: ConfigurationOptions): Promise<LabelsList200Response> {
        return this.api.labelsList(param.adAccountId, param.campaignIds, param.labelIds, param.entityStatuses, param.labelTypes, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>
     * Update labels
     * @param param the request object
     */
    public labelsUpdateWithHttpInfo(param: LabelsApiLabelsUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<LabelsResponse>> {
        return this.api.labelsUpdateWithHttpInfo(param.adAccountId, param.labelUpdateRequest,  options).toPromise();
    }

    /**
     * <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>
     * Update labels
     * @param param the request object
     */
    public labelsUpdate(param: LabelsApiLabelsUpdateRequest, options?: ConfigurationOptions): Promise<LabelsResponse> {
        return this.api.labelsUpdate(param.adAccountId, param.labelUpdateRequest,  options).toPromise();
    }

}

import { ObservableLeadAdsApi } from "./ObservableAPI";
import { LeadAdsApiRequestFactory, LeadAdsApiResponseProcessor} from "../apis/LeadAdsApi";

export interface LeadAdsApiAdAccountsSubscriptionsDelByIdRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof LeadAdsApiadAccountsSubscriptionsDelById
     */
    adAccountId: string
    /**
     * Unique identifier of a subscription.
     * Defaults to: undefined
     * @type string
     * @memberof LeadAdsApiadAccountsSubscriptionsDelById
     */
    subscriptionId: string
}

export interface LeadAdsApiAdAccountsSubscriptionsGetByIdRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof LeadAdsApiadAccountsSubscriptionsGetById
     */
    adAccountId: string
    /**
     * Unique identifier of a subscription.
     * Defaults to: undefined
     * @type string
     * @memberof LeadAdsApiadAccountsSubscriptionsGetById
     */
    subscriptionId: string
}

export interface LeadAdsApiAdAccountsSubscriptionsGetListRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof LeadAdsApiadAccountsSubscriptionsGetList
     */
    adAccountId: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof LeadAdsApiadAccountsSubscriptionsGetList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof LeadAdsApiadAccountsSubscriptionsGetList
     */
    pageSize?: number
}

export interface LeadAdsApiAdAccountsSubscriptionsPostRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof LeadAdsApiadAccountsSubscriptionsPost
     */
    adAccountId: string
    /**
     * 
     * @type LeadSubscriptionPostParamsCreate
     * @memberof LeadAdsApiadAccountsSubscriptionsPost
     */
    leadSubscriptionPostParamsCreate: LeadSubscriptionPostParamsCreate
}

export class ObjectLeadAdsApi {
    private api: ObservableLeadAdsApi

    public constructor(configuration: Configuration, requestFactory?: LeadAdsApiRequestFactory, responseProcessor?: LeadAdsApiResponseProcessor) {
        this.api = new ObservableLeadAdsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.\'
     * Delete lead ads subscription
     * @param param the request object
     */
    public adAccountsSubscriptionsDelByIdWithHttpInfo(param: LeadAdsApiAdAccountsSubscriptionsDelByIdRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.adAccountsSubscriptionsDelByIdWithHttpInfo(param.adAccountId, param.subscriptionId,  options).toPromise();
    }

    /**
     * Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.\'
     * Delete lead ads subscription
     * @param param the request object
     */
    public adAccountsSubscriptionsDelById(param: LeadAdsApiAdAccountsSubscriptionsDelByIdRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.adAccountsSubscriptionsDelById(param.adAccountId, param.subscriptionId,  options).toPromise();
    }

    /**
     * Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.\'
     * Get lead ads subscription by ID
     * @param param the request object
     */
    public adAccountsSubscriptionsGetByIdWithHttpInfo(param: LeadAdsApiAdAccountsSubscriptionsGetByIdRequest, options?: ConfigurationOptions): Promise<HttpInfo<LeadSubscription>> {
        return this.api.adAccountsSubscriptionsGetByIdWithHttpInfo(param.adAccountId, param.subscriptionId,  options).toPromise();
    }

    /**
     * Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.\'
     * Get lead ads subscription by ID
     * @param param the request object
     */
    public adAccountsSubscriptionsGetById(param: LeadAdsApiAdAccountsSubscriptionsGetByIdRequest, options?: ConfigurationOptions): Promise<LeadSubscription> {
        return this.api.adAccountsSubscriptionsGetById(param.adAccountId, param.subscriptionId,  options).toPromise();
    }

    /**
     * Get the advertiser\'s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
     * Get lead ads subscriptions
     * @param param the request object
     */
    public adAccountsSubscriptionsGetListWithHttpInfo(param: LeadAdsApiAdAccountsSubscriptionsGetListRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdAccountsSubscriptionsGetList200Response>> {
        return this.api.adAccountsSubscriptionsGetListWithHttpInfo(param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get the advertiser\'s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
     * Get lead ads subscriptions
     * @param param the request object
     */
    public adAccountsSubscriptionsGetList(param: LeadAdsApiAdAccountsSubscriptionsGetListRequest, options?: ConfigurationOptions): Promise<AdAccountsSubscriptionsGetList200Response> {
        return this.api.adAccountsSubscriptionsGetList(param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.
     * Create lead ads subscription
     * @param param the request object
     */
    public adAccountsSubscriptionsPostWithHttpInfo(param: LeadAdsApiAdAccountsSubscriptionsPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<LeadSubscription>> {
        return this.api.adAccountsSubscriptionsPostWithHttpInfo(param.adAccountId, param.leadSubscriptionPostParamsCreate,  options).toPromise();
    }

    /**
     * Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.
     * Create lead ads subscription
     * @param param the request object
     */
    public adAccountsSubscriptionsPost(param: LeadAdsApiAdAccountsSubscriptionsPostRequest, options?: ConfigurationOptions): Promise<LeadSubscription> {
        return this.api.adAccountsSubscriptionsPost(param.adAccountId, param.leadSubscriptionPostParamsCreate,  options).toPromise();
    }

}

import { ObservableLeadFormsApi } from "./ObservableAPI";
import { LeadFormsApiRequestFactory, LeadFormsApiResponseProcessor} from "../apis/LeadFormsApi";

export interface LeadFormsApiLeadFormGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof LeadFormsApileadFormGet
     */
    adAccountId: string
    /**
     * Unique identifier of a lead form.
     * Defaults to: undefined
     * @type string
     * @memberof LeadFormsApileadFormGet
     */
    leadFormId: string
}

export interface LeadFormsApiLeadFormTestCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof LeadFormsApileadFormTestCreate
     */
    adAccountId: string
    /**
     * Unique identifier of a lead form.
     * Defaults to: undefined
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

export interface LeadFormsApiLeadFormsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof LeadFormsApileadFormsCreate
     */
    adAccountId: string
    /**
     * List of lead forms to create, size limit [1, 30].
     * @type Array&lt;LeadFormCreateRequest&gt;
     * @memberof LeadFormsApileadFormsCreate
     */
    leadFormCreateRequest: Array<LeadFormCreateRequest>
}

export interface LeadFormsApiLeadFormsListRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof LeadFormsApileadFormsList
     */
    adAccountId: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof LeadFormsApileadFormsList
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * Defaults to: undefined
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof LeadFormsApileadFormsList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof LeadFormsApileadFormsList
     */
    bookmark?: string
}

export interface LeadFormsApiLeadFormsUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof LeadFormsApileadFormsUpdate
     */
    adAccountId: string
    /**
     * List of lead forms to update, size limit [1, 30].
     * @type Array&lt;LeadFormUpdateRequest&gt;
     * @memberof LeadFormsApileadFormsUpdate
     */
    leadFormUpdateRequest: Array<LeadFormUpdateRequest>
}

export class ObjectLeadFormsApi {
    private api: ObservableLeadFormsApi

    public constructor(configuration: Configuration, requestFactory?: LeadFormsApiRequestFactory, responseProcessor?: LeadFormsApiResponseProcessor) {
        this.api = new ObservableLeadFormsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it\'s ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * Get lead form by id
     * @param param the request object
     */
    public leadFormGetWithHttpInfo(param: LeadFormsApiLeadFormGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<LeadFormResponse>> {
        return this.api.leadFormGetWithHttpInfo(param.adAccountId, param.leadFormId,  options).toPromise();
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it\'s ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * Get lead form by id
     * @param param the request object
     */
    public leadFormGet(param: LeadFormsApiLeadFormGetRequest, options?: ConfigurationOptions): Promise<LeadFormResponse> {
        return this.api.leadFormGet(param.adAccountId, param.leadFormId,  options).toPromise();
    }

    /**
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
     * Create lead form test data
     * @param param the request object
     */
    public leadFormTestCreateWithHttpInfo(param: LeadFormsApiLeadFormTestCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<LeadFormTestResponse>> {
        return this.api.leadFormTestCreateWithHttpInfo(param.adAccountId, param.leadFormId, param.leadFormTestRequest,  options).toPromise();
    }

    /**
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
     * Create lead form test data
     * @param param the request object
     */
    public leadFormTestCreate(param: LeadFormsApiLeadFormTestCreateRequest, options?: ConfigurationOptions): Promise<LeadFormTestResponse> {
        return this.api.leadFormTestCreate(param.adAccountId, param.leadFormId, param.leadFormTestRequest,  options).toPromise();
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * Create lead forms
     * @param param the request object
     */
    public leadFormsCreateWithHttpInfo(param: LeadFormsApiLeadFormsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<LeadFormArrayResponse>> {
        return this.api.leadFormsCreateWithHttpInfo(param.adAccountId, param.leadFormCreateRequest,  options).toPromise();
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * Create lead forms
     * @param param the request object
     */
    public leadFormsCreate(param: LeadFormsApiLeadFormsCreateRequest, options?: ConfigurationOptions): Promise<LeadFormArrayResponse> {
        return this.api.leadFormsCreate(param.adAccountId, param.leadFormCreateRequest,  options).toPromise();
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * List lead forms
     * @param param the request object
     */
    public leadFormsListWithHttpInfo(param: LeadFormsApiLeadFormsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<LeadFormsList200Response>> {
        return this.api.leadFormsListWithHttpInfo(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * List lead forms
     * @param param the request object
     */
    public leadFormsList(param: LeadFormsApiLeadFormsListRequest, options?: ConfigurationOptions): Promise<LeadFormsList200Response> {
        return this.api.leadFormsList(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * Update lead forms
     * @param param the request object
     */
    public leadFormsUpdateWithHttpInfo(param: LeadFormsApiLeadFormsUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<LeadFormArrayResponse>> {
        return this.api.leadFormsUpdateWithHttpInfo(param.adAccountId, param.leadFormUpdateRequest,  options).toPromise();
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * Update lead forms
     * @param param the request object
     */
    public leadFormsUpdate(param: LeadFormsApiLeadFormsUpdateRequest, options?: ConfigurationOptions): Promise<LeadFormArrayResponse> {
        return this.api.leadFormsUpdate(param.adAccountId, param.leadFormUpdateRequest,  options).toPromise();
    }

}

import { ObservableLeadsExportApi } from "./ObservableAPI";
import { LeadsExportApiRequestFactory, LeadsExportApiResponseProcessor} from "../apis/LeadsExportApi";

export interface LeadsExportApiLeadsExportCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof LeadsExportApileadsExportCreate
     */
    adAccountId: string
    /**
     * 
     * @type LeadsExportCreateRequest
     * @memberof LeadsExportApileadsExportCreate
     */
    leadsExportCreateRequest: LeadsExportCreateRequest
}

export interface LeadsExportApiLeadsExportGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof LeadsExportApileadsExportGet
     */
    adAccountId: string
    /**
     * lead_export_id token returned from the create a lead export endpoint
     * Defaults to: undefined
     * @type string
     * @memberof LeadsExportApileadsExportGet
     */
    leadsExportId: string
}

export class ObjectLeadsExportApi {
    private api: ObservableLeadsExportApi

    public constructor(configuration: Configuration, requestFactory?: LeadsExportApiRequestFactory, responseProcessor?: LeadsExportApiResponseProcessor) {
        this.api = new ObservableLeadsExportApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * Create a request to export leads collected from a lead ad
     * @param param the request object
     */
    public leadsExportCreateWithHttpInfo(param: LeadsExportApiLeadsExportCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<LeadsExportCreateResponse>> {
        return this.api.leadsExportCreateWithHttpInfo(param.adAccountId, param.leadsExportCreateRequest,  options).toPromise();
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * Create a request to export leads collected from a lead ad
     * @param param the request object
     */
    public leadsExportCreate(param: LeadsExportApiLeadsExportCreateRequest, options?: ConfigurationOptions): Promise<LeadsExportCreateResponse> {
        return this.api.leadsExportCreate(param.adAccountId, param.leadsExportCreateRequest,  options).toPromise();
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * Get the lead export from the lead export create call
     * @param param the request object
     */
    public leadsExportGetWithHttpInfo(param: LeadsExportApiLeadsExportGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<LeadsExportResponseData>> {
        return this.api.leadsExportGetWithHttpInfo(param.adAccountId, param.leadsExportId,  options).toPromise();
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * Get the lead export from the lead export create call
     * @param param the request object
     */
    public leadsExportGet(param: LeadsExportApiLeadsExportGetRequest, options?: ConfigurationOptions): Promise<LeadsExportResponseData> {
        return this.api.leadsExportGet(param.adAccountId, param.leadsExportId,  options).toPromise();
    }

}

import { ObservableMediaApi } from "./ObservableAPI";
import { MediaApiRequestFactory, MediaApiResponseProcessor} from "../apis/MediaApi";

export interface MediaApiMediaCreateRequest {
    /**
     * 
     * @type MediaUploadCreate
     * @memberof MediaApimediaCreate
     */
    mediaUploadCreate: MediaUploadCreate
}

export interface MediaApiMediaGetRequest {
    /**
     * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
     * Defaults to: undefined
     * @type string
     * @memberof MediaApimediaGet
     */
    mediaId: string
}

export interface MediaApiMediaListRequest {
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof MediaApimediaList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
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
     * Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file\'s contents as the request\'s `file` parameter and also include all of the parameters from `upload_parameters`.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
     * Register media upload
     * @param param the request object
     */
    public mediaCreateWithHttpInfo(param: MediaApiMediaCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<MediaUpload>> {
        return this.api.mediaCreateWithHttpInfo(param.mediaUploadCreate,  options).toPromise();
    }

    /**
     * Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file\'s contents as the request\'s `file` parameter and also include all of the parameters from `upload_parameters`.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
     * Register media upload
     * @param param the request object
     */
    public mediaCreate(param: MediaApiMediaCreateRequest, options?: ConfigurationOptions): Promise<MediaUpload> {
        return this.api.mediaCreate(param.mediaUploadCreate,  options).toPromise();
    }

    /**
     * Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
     * Get media upload details
     * @param param the request object
     */
    public mediaGetWithHttpInfo(param: MediaApiMediaGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<Media>> {
        return this.api.mediaGetWithHttpInfo(param.mediaId,  options).toPromise();
    }

    /**
     * Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
     * Get media upload details
     * @param param the request object
     */
    public mediaGet(param: MediaApiMediaGetRequest, options?: ConfigurationOptions): Promise<Media> {
        return this.api.mediaGet(param.mediaId,  options).toPromise();
    }

    /**
     * List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
     * List media uploads
     * @param param the request object
     */
    public mediaListWithHttpInfo(param: MediaApiMediaListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<MediaList200Response>> {
        return this.api.mediaListWithHttpInfo(param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
     * List media uploads
     * @param param the request object
     */
    public mediaList(param: MediaApiMediaListRequest = {}, options?: ConfigurationOptions): Promise<MediaList200Response> {
        return this.api.mediaList(param.bookmark, param.pageSize,  options).toPromise();
    }

}

import { ObservableMsotEventsApi } from "./ObservableAPI";
import { MsotEventsApiRequestFactory, MsotEventsApiResponseProcessor} from "../apis/MsotEventsApi";

export interface MsotEventsApiMsotEventsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof MsotEventsApimsotEventsCreate
     */
    adAccountId: string
    /**
     * Attributed MSOT conversion events
     * @type ConversionMSOTEvents
     * @memberof MsotEventsApimsotEventsCreate
     */
    conversionMSOTEvents: ConversionMSOTEvents
}

export class ObjectMsotEventsApi {
    private api: ObservableMsotEventsApi

    public constructor(configuration: Configuration, requestFactory?: MsotEventsApiRequestFactory, responseProcessor?: MsotEventsApiResponseProcessor) {
        this.api = new ObservableMsotEventsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting.
     * Send Measurement Source Of Truth (MSOT) attributed conversion events
     * @param param the request object
     */
    public msotEventsCreateWithHttpInfo(param: MsotEventsApiMsotEventsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.msotEventsCreateWithHttpInfo(param.adAccountId, param.conversionMSOTEvents,  options).toPromise();
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting.
     * Send Measurement Source Of Truth (MSOT) attributed conversion events
     * @param param the request object
     */
    public msotEventsCreate(param: MsotEventsApiMsotEventsCreateRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.msotEventsCreate(param.adAccountId, param.conversionMSOTEvents,  options).toPromise();
    }

}

import { ObservableNotificationApi } from "./ObservableAPI";
import { NotificationApiRequestFactory, NotificationApiResponseProcessor} from "../apis/NotificationApi";

export interface NotificationApiNotificationPostRequest {
    /**
     * notification event.
     * @type NotificationPostRequest
     * @memberof NotificationApinotificationPost
     */
    notificationPostRequest: NotificationPostRequest
}

export class ObjectNotificationApi {
    private api: ObservableNotificationApi

    public constructor(configuration: Configuration, requestFactory?: NotificationApiRequestFactory, responseProcessor?: NotificationApiResponseProcessor) {
        this.api = new ObservableNotificationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests\' systems. This API is gated and you need to request access to this feature.
     * Receive notifications from external partners.
     * @param param the request object
     */
    public notificationPostWithHttpInfo(param: NotificationApiNotificationPostRequest, options?: ConfigurationOptions): Promise<HttpInfo<NotificationResponse>> {
        return this.api.notificationPostWithHttpInfo(param.notificationPostRequest,  options).toPromise();
    }

    /**
     * Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests\' systems. This API is gated and you need to request access to this feature.
     * Receive notifications from external partners.
     * @param param the request object
     */
    public notificationPost(param: NotificationApiNotificationPostRequest, options?: ConfigurationOptions): Promise<NotificationResponse> {
        return this.api.notificationPost(param.notificationPostRequest,  options).toPromise();
    }

}

import { ObservableOauthApi } from "./ObservableAPI";
import { OauthApiRequestFactory, OauthApiResponseProcessor} from "../apis/OauthApi";

export interface OauthApiOauthConversionTokenRequest {
}

export interface OauthApiOauthTokenRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof OauthApioauthToken
     */
    grantType: string
}

export interface OauthApiTokenRevokeRequest {
    /**
     * The token to revoke.
     * Defaults to: undefined
     * @type string
     * @memberof OauthApitokenRevoke
     */
    token: string
    /**
     * The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.
     * Defaults to: undefined
     * @type string
     * @memberof OauthApitokenRevoke
     */
    tokenTypeHint?: string
}

export class ObjectOauthApi {
    private api: ObservableOauthApi

    public constructor(configuration: Configuration, requestFactory?: OauthApiRequestFactory, responseProcessor?: OauthApiResponseProcessor) {
        this.api = new ObservableOauthApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
     * Generate OAuth access token for conversion API
     * @param param the request object
     */
    public oauthConversionTokenWithHttpInfo(param: OauthApiOauthConversionTokenRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ConversionAccessTokenResponse>> {
        return this.api.oauthConversionTokenWithHttpInfo( options).toPromise();
    }

    /**
     * Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
     * Generate OAuth access token for conversion API
     * @param param the request object
     */
    public oauthConversionToken(param: OauthApiOauthConversionTokenRequest = {}, options?: ConfigurationOptions): Promise<ConversionAccessTokenResponse> {
        return this.api.oauthConversionToken( options).toPromise();
    }

    /**
     * Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href=\'/docs/getting-started/set-up-authentication-and-authorization/\' target=\'blank\'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href=\'/docs/developer-tools/token-debugger/\' target=\'blank\'>Token Debugger</a> to validate and inspect your access token.
     * Generate OAuth access token
     * @param param the request object
     */
    public oauthTokenWithHttpInfo(param: OauthApiOauthTokenRequest, options?: ConfigurationOptions): Promise<HttpInfo<OauthAccessTokenResponse>> {
        return this.api.oauthTokenWithHttpInfo(param.grantType,  options).toPromise();
    }

    /**
     * Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href=\'/docs/getting-started/set-up-authentication-and-authorization/\' target=\'blank\'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href=\'/docs/developer-tools/token-debugger/\' target=\'blank\'>Token Debugger</a> to validate and inspect your access token.
     * Generate OAuth access token
     * @param param the request object
     */
    public oauthToken(param: OauthApiOauthTokenRequest, options?: ConfigurationOptions): Promise<OauthAccessTokenResponse> {
        return this.api.oauthToken(param.grantType,  options).toPromise();
    }

    /**
     * Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
     * Revoke a token
     * @param param the request object
     */
    public tokenRevokeWithHttpInfo(param: OauthApiTokenRevokeRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.tokenRevokeWithHttpInfo(param.token, param.tokenTypeHint,  options).toPromise();
    }

    /**
     * Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
     * Revoke a token
     * @param param the request object
     */
    public tokenRevoke(param: OauthApiTokenRevokeRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.tokenRevoke(param.token, param.tokenTypeHint,  options).toPromise();
    }

}

import { ObservableOrderLinesApi } from "./ObservableAPI";
import { OrderLinesApiRequestFactory, OrderLinesApiResponseProcessor} from "../apis/OrderLinesApi";

export interface OrderLinesApiOrderLinesGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof OrderLinesApiorderLinesGet
     */
    adAccountId: string
    /**
     * Unique identifier of an order line.
     * Defaults to: undefined
     * @type string
     * @memberof OrderLinesApiorderLinesGet
     */
    orderLineId: string
}

export interface OrderLinesApiOrderLinesListRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof OrderLinesApiorderLinesList
     */
    adAccountId: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof OrderLinesApiorderLinesList
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * Defaults to: undefined
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof OrderLinesApiorderLinesList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
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
    public orderLinesGetWithHttpInfo(param: OrderLinesApiOrderLinesGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<OrderLine>> {
        return this.api.orderLinesGetWithHttpInfo(param.adAccountId, param.orderLineId,  options).toPromise();
    }

    /**
     * Get a specific existing order line associated with an ad account.
     * Get order line
     * @param param the request object
     */
    public orderLinesGet(param: OrderLinesApiOrderLinesGetRequest, options?: ConfigurationOptions): Promise<OrderLine> {
        return this.api.orderLinesGet(param.adAccountId, param.orderLineId,  options).toPromise();
    }

    /**
     * List existing order lines associated with an ad account.
     * Get order lines
     * @param param the request object
     */
    public orderLinesListWithHttpInfo(param: OrderLinesApiOrderLinesListRequest, options?: ConfigurationOptions): Promise<HttpInfo<OrderLinesList200Response>> {
        return this.api.orderLinesListWithHttpInfo(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * List existing order lines associated with an ad account.
     * Get order lines
     * @param param the request object
     */
    public orderLinesList(param: OrderLinesApiOrderLinesListRequest, options?: ConfigurationOptions): Promise<OrderLinesList200Response> {
        return this.api.orderLinesList(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

}

import { ObservablePinsApi } from "./ObservableAPI";
import { PinsApiRequestFactory, PinsApiResponseProcessor} from "../apis/PinsApi";

export interface PinsApiMultiPinsAnalyticsRequest {
    /**
     * List of Pin IDs.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof PinsApimultiPinsAnalytics
     */
    pinIds: Array<string>
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * Defaults to: undefined
     * @type string
     * @memberof PinsApimultiPinsAnalytics
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * Defaults to: undefined
     * @type string
     * @memberof PinsApimultiPinsAnalytics
     */
    endDate: string
    /**
     * Pin metric types to get data for.
     * Defaults to: undefined
     * @type Array&lt;&#39;IMPRESSION&#39; | &#39;OUTBOUND_CLICK&#39; | &#39;PIN_CLICK&#39; | &#39;SAVE&#39; | &#39;SAVE_RATE&#39; | &#39;TOTAL_COMMENTS&#39; | &#39;TOTAL_REACTIONS&#39; | &#39;USER_FOLLOW&#39; | &#39;PROFILE_VISIT&#39; | &#39;VIDEO_MRC_VIEW&#39; | &#39;VIDEO_10S_VIEW&#39; | &#39;QUARTILE_95_PERCENT_VIEW&#39; | &#39;VIDEO_V50_WATCH_TIME&#39; | &#39;VIDEO_START&#39; | &#39;VIDEO_AVG_WATCH_TIME&#39;&gt;
     * @memberof PinsApimultiPinsAnalytics
     */
    metricTypes: Array<'IMPRESSION' | 'OUTBOUND_CLICK' | 'PIN_CLICK' | 'SAVE' | 'SAVE_RATE' | 'TOTAL_COMMENTS' | 'TOTAL_REACTIONS' | 'USER_FOLLOW' | 'PROFILE_VISIT' | 'VIDEO_MRC_VIEW' | 'VIDEO_10S_VIEW' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_V50_WATCH_TIME' | 'VIDEO_START' | 'VIDEO_AVG_WATCH_TIME'>
    /**
     * Apps or devices to get data for, default is all.
     * Defaults to: &#39;ALL&#39;
     * @type &#39;ALL&#39; | &#39;MOBILE&#39; | &#39;TABLET&#39; | &#39;WEB&#39;
     * @memberof PinsApimultiPinsAnalytics
     */
    appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB'
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof PinsApimultiPinsAnalytics
     */
    adAccountId?: string
}

export interface PinsApiPinsAnalyticsRequest {
    /**
     * Unique identifier of a Pin.
     * Defaults to: undefined
     * @type string
     * @memberof PinsApipinsAnalytics
     */
    pinId: string
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * Defaults to: undefined
     * @type string
     * @memberof PinsApipinsAnalytics
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * Defaults to: undefined
     * @type string
     * @memberof PinsApipinsAnalytics
     */
    endDate: string
    /**
     * Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &lt;code&gt;NO_SPLIT&lt;/code&gt;.
     * Defaults to: undefined
     * @type Array&lt;&#39;IMPRESSION&#39; | &#39;OUTBOUND_CLICK&#39; | &#39;PIN_CLICK&#39; | &#39;SAVE&#39; | &#39;SAVE_RATE&#39; | &#39;TOTAL_COMMENTS&#39; | &#39;TOTAL_REACTIONS&#39; | &#39;USER_FOLLOW&#39; | &#39;PROFILE_VISIT&#39; | &#39;VIDEO_MRC_VIEW&#39; | &#39;VIDEO_10S_VIEW&#39; | &#39;QUARTILE_95_PERCENT_VIEW&#39; | &#39;VIDEO_V50_WATCH_TIME&#39; | &#39;VIDEO_START&#39; | &#39;VIDEO_AVG_WATCH_TIME&#39;&gt;
     * @memberof PinsApipinsAnalytics
     */
    metricTypes: Array<'IMPRESSION' | 'OUTBOUND_CLICK' | 'PIN_CLICK' | 'SAVE' | 'SAVE_RATE' | 'TOTAL_COMMENTS' | 'TOTAL_REACTIONS' | 'USER_FOLLOW' | 'PROFILE_VISIT' | 'VIDEO_MRC_VIEW' | 'VIDEO_10S_VIEW' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_V50_WATCH_TIME' | 'VIDEO_START' | 'VIDEO_AVG_WATCH_TIME'>
    /**
     * Apps or devices to get data for, default is all.
     * Defaults to: &#39;ALL&#39;
     * @type &#39;ALL&#39; | &#39;MOBILE&#39; | &#39;TABLET&#39; | &#39;WEB&#39;
     * @memberof PinsApipinsAnalytics
     */
    appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB'
    /**
     * How to split the data into groups. Not including this param means data won\&#39;t be split.
     * Defaults to: &#39;NO_SPLIT&#39;
     * @type &#39;NO_SPLIT&#39; | &#39;APP_TYPE&#39;
     * @memberof PinsApipinsAnalytics
     */
    splitField?: 'NO_SPLIT' | 'APP_TYPE'
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof PinsApipinsAnalytics
     */
    adAccountId?: string
}

export interface PinsApiPinsCreateRequest {
    /**
     * 
     * @type PinCreate
     * @memberof PinsApipinsCreate
     */
    pinCreate: PinCreate
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof PinsApipinsCreate
     */
    adAccountId?: string
}

export interface PinsApiPinsDeleteRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof PinsApipinsDelete
     */
    pinId: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof PinsApipinsDelete
     */
    adAccountId?: string
}

export interface PinsApiPinsGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof PinsApipinsGet
     */
    pinId: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof PinsApipinsGet
     */
    adAccountId?: string
    /**
     * Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Defaults to: false
     * @type boolean
     * @memberof PinsApipinsGet
     */
    pinMetrics?: boolean
}

export interface PinsApiPinsListRequest {
    /**
     * The filter to apply to the pins
     * Defaults to: undefined
     * @type &#39;exclude_native&#39; | &#39;exclude_repins&#39; | &#39;has_been_promoted&#39;
     * @memberof PinsApipinsList
     */
    pinFilter?: 'exclude_native' | 'exclude_repins' | 'has_been_promoted'
    /**
     * Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Defaults to: false
     * @type boolean
     * @memberof PinsApipinsList
     */
    pinMetrics?: boolean
    /**
     * Whether to include protected pins in the results
     * Defaults to: false
     * @type boolean
     * @memberof PinsApipinsList
     */
    includeProtectedPins?: boolean
    /**
     * The type of pins to return, currently only enabled for private pins
     * Defaults to: undefined
     * @type &#39;PRIVATE&#39;
     * @memberof PinsApipinsList
     */
    pinType?: 'PRIVATE'
    /**
     * Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
     * Defaults to: undefined
     * @type Array&lt;CreativeType&gt;
     * @memberof PinsApipinsList
     */
    creativeTypes?: Array<CreativeType>
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof PinsApipinsList
     */
    adAccountId?: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof PinsApipinsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof PinsApipinsList
     */
    pageSize?: number
}

export interface PinsApiPinsSaveRequest {
    /**
     * Unique identifier of a Pin.
     * Defaults to: undefined
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
     * Defaults to: undefined
     * @type string
     * @memberof PinsApipinsSave
     */
    adAccountId?: string
}

export interface PinsApiPinsUpdateRequest {
    /**
     * 
     * Defaults to: undefined
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
     * Defaults to: undefined
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
     * <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Get multiple Pin analytics
     * @param param the request object
     */
    public multiPinsAnalyticsWithHttpInfo(param: PinsApiMultiPinsAnalyticsRequest, options?: ConfigurationOptions): Promise<HttpInfo<{ [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; }>> {
        return this.api.multiPinsAnalyticsWithHttpInfo(param.pinIds, param.startDate, param.endDate, param.metricTypes, param.appTypes, param.adAccountId,  options).toPromise();
    }

    /**
     * <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Get multiple Pin analytics
     * @param param the request object
     */
    public multiPinsAnalytics(param: PinsApiMultiPinsAnalyticsRequest, options?: ConfigurationOptions): Promise<{ [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; }> {
        return this.api.multiPinsAnalytics(param.pinIds, param.startDate, param.endDate, param.metricTypes, param.appTypes, param.adAccountId,  options).toPromise();
    }

    /**
     * Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Get Pin analytics
     * @param param the request object
     */
    public pinsAnalyticsWithHttpInfo(param: PinsApiPinsAnalyticsRequest, options?: ConfigurationOptions): Promise<HttpInfo<{ [key: string]: PinAnalyticsMetricsResponse; }>> {
        return this.api.pinsAnalyticsWithHttpInfo(param.pinId, param.startDate, param.endDate, param.metricTypes, param.appTypes, param.splitField, param.adAccountId,  options).toPromise();
    }

    /**
     * Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Get Pin analytics
     * @param param the request object
     */
    public pinsAnalytics(param: PinsApiPinsAnalyticsRequest, options?: ConfigurationOptions): Promise<{ [key: string]: PinAnalyticsMetricsResponse; }> {
        return this.api.pinsAnalytics(param.pinId, param.startDate, param.endDate, param.metricTypes, param.appTypes, param.splitField, param.adAccountId,  options).toPromise();
    }

    /**
     *   Create a Pin on a board or board section owned by the \"operation user_account\".   Note: If the current \"operation user_account\" (defined by the access token) has access to another user\'s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account\'s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called \'curated content\', please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.
     * Create Pin
     * @param param the request object
     */
    public pinsCreateWithHttpInfo(param: PinsApiPinsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<Pin>> {
        return this.api.pinsCreateWithHttpInfo(param.pinCreate, param.adAccountId,  options).toPromise();
    }

    /**
     *   Create a Pin on a board or board section owned by the \"operation user_account\".   Note: If the current \"operation user_account\" (defined by the access token) has access to another user\'s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account\'s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called \'curated content\', please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.
     * Create Pin
     * @param param the request object
     */
    public pinsCreate(param: PinsApiPinsCreateRequest, options?: ConfigurationOptions): Promise<Pin> {
        return this.api.pinsCreate(param.pinCreate, param.adAccountId,  options).toPromise();
    }

    /**
     *    Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.
     * Delete Pin
     * @param param the request object
     */
    public pinsDeleteWithHttpInfo(param: PinsApiPinsDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.pinsDeleteWithHttpInfo(param.pinId, param.adAccountId,  options).toPromise();
    }

    /**
     *    Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.
     * Delete Pin
     * @param param the request object
     */
    public pinsDelete(param: PinsApiPinsDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.pinsDelete(param.pinId, param.adAccountId,  options).toPromise();
    }

    /**
     *    Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.
     * Get Pin
     * @param param the request object
     */
    public pinsGetWithHttpInfo(param: PinsApiPinsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<Pin>> {
        return this.api.pinsGetWithHttpInfo(param.pinId, param.adAccountId, param.pinMetrics,  options).toPromise();
    }

    /**
     *    Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.
     * Get Pin
     * @param param the request object
     */
    public pinsGet(param: PinsApiPinsGetRequest, options?: ConfigurationOptions): Promise<Pin> {
        return this.api.pinsGet(param.pinId, param.adAccountId, param.pinMetrics,  options).toPromise();
    }

    /**
     *      Get a list of the Pins owned by the \"operation user_account\".     - By default, the \"operation user_account\" is the token user_account.     - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an `ad_account_id` to use the owner of that ad_account as the \"operation user_account\".      Disclaimer: There are known performance issues when filtering by field `creative_type` and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).
     * List Pins
     * @param param the request object
     */
    public pinsListWithHttpInfo(param: PinsApiPinsListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PinsList200Response>> {
        return this.api.pinsListWithHttpInfo(param.pinFilter, param.pinMetrics, param.includeProtectedPins, param.pinType, param.creativeTypes, param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     *      Get a list of the Pins owned by the \"operation user_account\".     - By default, the \"operation user_account\" is the token user_account.     - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an `ad_account_id` to use the owner of that ad_account as the \"operation user_account\".      Disclaimer: There are known performance issues when filtering by field `creative_type` and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).
     * List Pins
     * @param param the request object
     */
    public pinsList(param: PinsApiPinsListRequest = {}, options?: ConfigurationOptions): Promise<PinsList200Response> {
        return this.api.pinsList(param.pinFilter, param.pinMetrics, param.includeProtectedPins, param.pinType, param.creativeTypes, param.adAccountId, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
     * Save Pin
     * @param param the request object
     */
    public pinsSaveWithHttpInfo(param: PinsApiPinsSaveRequest, options?: ConfigurationOptions): Promise<HttpInfo<Pin>> {
        return this.api.pinsSaveWithHttpInfo(param.pinId, param.pinsSaveRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
     * Save Pin
     * @param param the request object
     */
    public pinsSave(param: PinsApiPinsSaveRequest, options?: ConfigurationOptions): Promise<Pin> {
        return this.api.pinsSave(param.pinId, param.pinsSaveRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     * Update Pin
     * @param param the request object
     */
    public pinsUpdateWithHttpInfo(param: PinsApiPinsUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<Pin>> {
        return this.api.pinsUpdateWithHttpInfo(param.pinId, param.pinUpdate, param.adAccountId,  options).toPromise();
    }

    /**
     * Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     * Update Pin
     * @param param the request object
     */
    public pinsUpdate(param: PinsApiPinsUpdateRequest, options?: ConfigurationOptions): Promise<Pin> {
        return this.api.pinsUpdate(param.pinId, param.pinUpdate, param.adAccountId,  options).toPromise();
    }

}

import { ObservableProductCategoriesApi } from "./ObservableAPI";
import { ProductCategoriesApiRequestFactory, ProductCategoriesApiResponseProcessor} from "../apis/ProductCategoriesApi";

export interface ProductCategoriesApiTrendsFeaturedTopicsListRequest {
    /**
     *       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
     * Defaults to: undefined
     * @type ProductCategoryRegion
     * @memberof ProductCategoriesApitrendsFeaturedTopicsList
     */
    region: ProductCategoryRegion
    /**
     * Interest to filter by
     * Defaults to: undefined
     * @type InterestsEnum
     * @memberof ProductCategoriesApitrendsFeaturedTopicsList
     */
    interest?: InterestsEnum
}

export interface ProductCategoriesApiTrendsProductCategoriesDetailsListRequest {
    /**
     * List of product categories
     * Defaults to: undefined
     * @type Array&lt;ProductCategoryEnum&gt;
     * @memberof ProductCategoriesApitrendsProductCategoriesDetailsList
     */
    productCategories: Array<ProductCategoryEnum>
    /**
     *       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
     * Defaults to: undefined
     * @type ProductCategoryRegion
     * @memberof ProductCategoriesApitrendsProductCategoriesDetailsList
     */
    region: ProductCategoryRegion
    /**
     *    Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years)
     * Defaults to: undefined
     * @type ProductCategoryDetailLookbackWindow
     * @memberof ProductCategoriesApitrendsProductCategoriesDetailsList
     */
    lookbackWindow?: ProductCategoryDetailLookbackWindow
    /**
     *      Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves
     * Defaults to: undefined
     * @type ProductCategoriesEngagementType
     * @memberof ProductCategoriesApitrendsProductCategoriesDetailsList
     */
    engagementType?: ProductCategoriesEngagementType
}

export interface ProductCategoriesApiTrendsProductCategoriesTrendingListRequest {
    /**
     *       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
     * Defaults to: undefined
     * @type ProductCategoryRegion
     * @memberof ProductCategoriesApitrendsProductCategoriesTrendingList
     */
    region: ProductCategoryRegion
    /**
     * List of verticals to filter by
     * Defaults to: undefined
     * @type Array&lt;VerticalProductCategory&gt;
     * @memberof ProductCategoriesApitrendsProductCategoriesTrendingList
     */
    verticals?: Array<VerticalProductCategory>
    /**
     * Age to filter by. If not provided, the results will be filtered by all ages.
     * Defaults to: undefined
     * @type Array&lt;AgeTrendsBucket&gt;
     * @memberof ProductCategoriesApitrendsProductCategoriesTrendingList
     */
    ages?: Array<AgeTrendsBucket>
    /**
     * Gender to filter by, If not provided, the results will be filtered by all genders.
     * Defaults to: undefined
     * @type Array&lt;GenderBucket&gt;
     * @memberof ProductCategoriesApitrendsProductCategoriesTrendingList
     */
    genders?: Array<GenderBucket>
    /**
     *      Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves
     * Defaults to: undefined
     * @type ProductCategoriesEngagementType
     * @memberof ProductCategoriesApitrendsProductCategoriesTrendingList
     */
    engagementType?: ProductCategoriesEngagementType
}

export class ObjectProductCategoriesApi {
    private api: ObservableProductCategoriesApi

    public constructor(configuration: Configuration, requestFactory?: ProductCategoriesApiRequestFactory, responseProcessor?: ProductCategoriesApiResponseProcessor) {
        this.api = new ObservableProductCategoriesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     *   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
     * Get featured topics
     * @param param the request object
     */
    public trendsFeaturedTopicsListWithHttpInfo(param: ProductCategoriesApiTrendsFeaturedTopicsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<FeaturedTrend>>> {
        return this.api.trendsFeaturedTopicsListWithHttpInfo(param.region, param.interest,  options).toPromise();
    }

    /**
     *   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
     * Get featured topics
     * @param param the request object
     */
    public trendsFeaturedTopicsList(param: ProductCategoriesApiTrendsFeaturedTopicsListRequest, options?: ConfigurationOptions): Promise<Array<FeaturedTrend>> {
        return this.api.trendsFeaturedTopicsList(param.region, param.interest,  options).toPromise();
    }

    /**
     *   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
     * Get product category details
     * @param param the request object
     */
    public trendsProductCategoriesDetailsListWithHttpInfo(param: ProductCategoriesApiTrendsProductCategoriesDetailsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<ProductCategoryDetails>>> {
        return this.api.trendsProductCategoriesDetailsListWithHttpInfo(param.productCategories, param.region, param.lookbackWindow, param.engagementType,  options).toPromise();
    }

    /**
     *   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
     * Get product category details
     * @param param the request object
     */
    public trendsProductCategoriesDetailsList(param: ProductCategoriesApiTrendsProductCategoriesDetailsListRequest, options?: ConfigurationOptions): Promise<Array<ProductCategoryDetails>> {
        return this.api.trendsProductCategoriesDetailsList(param.productCategories, param.region, param.lookbackWindow, param.engagementType,  options).toPromise();
    }

    /**
     *   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
     * Get a list of growing Shopping Product Categories
     * @param param the request object
     */
    public trendsProductCategoriesTrendingListWithHttpInfo(param: ProductCategoriesApiTrendsProductCategoriesTrendingListRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<TrendingProductCategory>>> {
        return this.api.trendsProductCategoriesTrendingListWithHttpInfo(param.region, param.verticals, param.ages, param.genders, param.engagementType,  options).toPromise();
    }

    /**
     *   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
     * Get a list of growing Shopping Product Categories
     * @param param the request object
     */
    public trendsProductCategoriesTrendingList(param: ProductCategoriesApiTrendsProductCategoriesTrendingListRequest, options?: ConfigurationOptions): Promise<Array<TrendingProductCategory>> {
        return this.api.trendsProductCategoriesTrendingList(param.region, param.verticals, param.ages, param.genders, param.engagementType,  options).toPromise();
    }

}

import { ObservableProductGroupPromotionsApi } from "./ObservableAPI";
import { ProductGroupPromotionsApiRequestFactory, ProductGroupPromotionsApiResponseProcessor} from "../apis/ProductGroupPromotionsApi";

export interface ProductGroupPromotionsApiProductGroupPromotionsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Defaults to: undefined
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsGet
     */
    adAccountId: string
    /**
     * Unique identifier of a product group promotion
     * Defaults to: undefined
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsGet
     */
    productGroupPromotionId: string
}

export interface ProductGroupPromotionsApiProductGroupPromotionsListRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsList
     */
    adAccountId: string
    /**
     * List of Product group promotion Ids.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsList
     */
    productGroupPromotionIds?: Array<string>
    /**
     * Entity status
     * Defaults to: undefined
     * @type Array&lt;&#39;ACTIVE&#39; | &#39;PAUSED&#39; | &#39;ARCHIVED&#39; | &#39;DRAFT&#39; | &#39;DELETED_DRAFT&#39;&gt;
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsList
     */
    entityStatuses?: Array<'ACTIVE' | 'PAUSED' | 'ARCHIVED' | 'DRAFT' | 'DELETED_DRAFT'>
    /**
     * Ad group Id.
     * Defaults to: undefined
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsList
     */
    adGroupId?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsList
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * Defaults to: undefined
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupPromotionsList
     */
    bookmark?: string
}

export interface ProductGroupPromotionsApiProductGroupPromotionsUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
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
     * Defaults to: undefined
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    adAccountId: string
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * Defaults to: undefined
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * Defaults to: undefined
     * @type string
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    endDate: string
    /**
     * List of Product group Ids to use to filter the results.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    productGroupIds: Array<string>
    /**
     * Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile\&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it\&#39;s microdollars. Otherwise, it\&#39;s in microunits of the advertiser\&#39;s currency.&lt;br/&gt;For example, if the advertiser\&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
     * Defaults to: undefined
     * @type Array&lt;&#39;SPEND_IN_MICRO_DOLLAR&#39; | &#39;PAID_IMPRESSION&#39; | &#39;SPEND_IN_DOLLAR&#39; | &#39;CPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_MICRO_DOLLAR&#39; | &#39;ECPC_IN_DOLLAR&#39; | &#39;CTR&#39; | &#39;ECTR&#39; | &#39;OUTBOUND_CTR_1&#39; | &#39;CAMPAIGN_NAME&#39; | &#39;CAMPAIGN_BRAND_LABEL&#39; | &#39;PIN_ID&#39; | &#39;TOTAL_ENGAGEMENT&#39; | &#39;ENGAGEMENT_1&#39; | &#39;ENGAGEMENT_2&#39; | &#39;ECPE_IN_DOLLAR&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;EENGAGEMENT_RATE&#39; | &#39;ECPM_IN_MICRO_DOLLAR&#39; | &#39;REPIN_RATE&#39; | &#39;CTR_2&#39; | &#39;CAMPAIGN_ID&#39; | &#39;ADVERTISER_ID&#39; | &#39;AD_ACCOUNT_ID&#39; | &#39;PIN_PROMOTION_ID&#39; | &#39;AD_ID&#39; | &#39;AD_GROUP_ID&#39; | &#39;CAMPAIGN_ENTITY_STATUS&#39; | &#39;CAMPAIGN_OBJECTIVE_TYPE&#39; | &#39;CPM_IN_MICRO_DOLLAR&#39; | &#39;CPM_IN_DOLLAR&#39; | &#39;AD_GROUP_NAME&#39; | &#39;AD_GROUP_BUDGET_TYPE&#39; | &#39;AD_GROUP_BUDGET_IN_LOCAL_CURRENCY&#39; | &#39;AD_GROUP_ENTITY_STATUS&#39; | &#39;AD_GROUP_BID_MULTIPLIER&#39; | &#39;PROMO_ID&#39; | &#39;PROMO_NAME&#39; | &#39;ORDER_LINE_ID&#39; | &#39;ORDER_LINE_NAME&#39; | &#39;CLICKTHROUGH_1&#39; | &#39;REPIN_1&#39; | &#39;IMPRESSION_1&#39; | &#39;IMPRESSION_1_GROSS&#39; | &#39;CLICKTHROUGH_1_GROSS&#39; | &#39;OUTBOUND_CLICK_1&#39; | &#39;CLICKTHROUGH_2&#39; | &#39;REPIN_2&#39; | &#39;IMPRESSION_2&#39; | &#39;OUTBOUND_CLICK_2&#39; | &#39;TOTAL_CLICKTHROUGH&#39; | &#39;TOTAL_IMPRESSION&#39; | &#39;TOTAL_IMPRESSION_USER&#39; | &#39;TOTAL_IMPRESSION_FREQUENCY&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR&#39; | &#39;COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_ENGAGEMENT_LEAD&#39; | &#39;TOTAL_CLICK_SIGNUP&#39; | &#39;TOTAL_CLICK_CHECKOUT&#39; | &#39;TOTAL_CLICK_ADD_TO_CART&#39; | &#39;TOTAL_CLICK_LEAD&#39; | &#39;TOTAL_VIEW_SIGNUP&#39; | &#39;TOTAL_VIEW_CHECKOUT&#39; | &#39;TOTAL_VIEW_ADD_TO_CART&#39; | &#39;TOTAL_VIEW_LEAD&#39; | &#39;TOTAL_CONVERSIONS&#39; | &#39;TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_SESSIONS&#39; | &#39;WEB_SESSIONS_1&#39; | &#39;WEB_SESSIONS_2&#39; | &#39;AD_NAME&#39; | &#39;CAMPAIGN_LIFETIME_SPEND_CAP&#39; | &#39;AD_GROUP_OPTIMIZATION&#39; | &#39;CAMPAIGN_DAILY_SPEND_CAP&#39; | &#39;CAMPAIGN_BUDGET_OPTIMIZATION&#39; | &#39;IS_PREMIERE_CAMPAIGN&#39; | &#39;TOTAL_PAGE_VISIT&#39; | &#39;TOTAL_SIGNUP&#39; | &#39;TOTAL_CHECKOUT&#39; | &#39;TOTAL_CUSTOM&#39; | &#39;TOTAL_LEAD&#39; | &#39;TOTAL_ADD_TO_WISHLIST&#39; | &#39;TOTAL_SUBSCRIBE&#39; | &#39;TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR&#39; | &#39;PAGE_VISIT_COST_PER_ACTION&#39; | &#39;PAGE_VISIT_ROAS&#39; | &#39;CHECKOUT_ROAS&#39; | &#39;CUSTOM_ROAS&#39; | &#39;PRODUCT_GROUP_AD_IMAGE_TAG&#39; | &#39;PRODUCT_GROUP_AD_VIDEO_TAG&#39; | &#39;VIDEO_3SEC_VIEWS_1&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_1&#39; | &#39;VIDEO_MRC_VIEWS_1&#39; | &#39;VIDEO_3SEC_VIEWS_2&#39; | &#39;VIDEO_15SEC_UNIQUE_VIEWS_2&#39; | &#39;VIDEO_P100_COMPLETE_2&#39; | &#39;VIDEO_P0_COMBINED_2&#39; | &#39;VIDEO_P25_COMBINED_2&#39; | &#39;VIDEO_P50_COMBINED_2&#39; | &#39;VIDEO_P75_COMBINED_2&#39; | &#39;VIDEO_P95_COMBINED_2&#39; | &#39;VIDEO_MRC_VIEWS_2&#39; | &#39;PAID_VIDEO_VIEWABLE_RATE&#39; | &#39;VIDEO_LENGTH&#39; | &#39;VIDEO_SPEND_IN_DOLLAR&#39; | &#39;ECPV_IN_DOLLAR&#39; | &#39;ECPCV_IN_DOLLAR&#39; | &#39;ECPCV_P95_IN_DOLLAR&#39; | &#39;TOTAL_VIDEO_3SEC_VIEWS&#39; | &#39;TOTAL_VIDEO_15SEC_UNIQUE_VIEWS&#39; | &#39;TOTAL_VIDEO_P100_COMPLETE&#39; | &#39;TOTAL_VIDEO_P0_COMBINED&#39; | &#39;TOTAL_VIDEO_P25_COMBINED&#39; | &#39;TOTAL_VIDEO_P50_COMBINED&#39; | &#39;TOTAL_VIDEO_P75_COMBINED&#39; | &#39;TOTAL_VIDEO_P95_COMBINED&#39; | &#39;TOTAL_VIDEO_MRC_VIEWS&#39; | &#39;TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND&#39; | &#39;TOTAL_REPIN_RATE&#39; | &#39;WEB_CHECKOUT_COST_PER_ACTION&#39; | &#39;WEB_CHECKOUT_ROAS&#39; | &#39;TOTAL_WEB_CHECKOUT&#39; | &#39;TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT&#39; | &#39;TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT&#39; | &#39;TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT&#39; | &#39;TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR&#39; | &#39;INAPP_CHECKOUT_COST_PER_ACTION&#39; | &#39;TOTAL_OFFLINE_CHECKOUT&#39; | &#39;TOTAL_APP_INSTALL_CONVERSION_RATE&#39; | &#39;TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_1&#39; | &#39;IDEA_PIN_PRODUCT_TAG_VISIT_2&#39; | &#39;TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT&#39; | &#39;LEADS&#39; | &#39;COST_PER_LEAD&#39; | &#39;QUIZ_COMPLETED&#39; | &#39;QUIZ_PIN_RESULT_OPEN&#39; | &#39;QUIZ_COMPLETION_RATE&#39; | &#39;SHOWCASE_PIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPIN_CLICKTHROUGH&#39; | &#39;SHOWCASE_SUBPAGE_IMPRESSION&#39; | &#39;SHOWCASE_SUBPIN_IMPRESSION&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPAGE_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_LEFT&#39; | &#39;SHOWCASE_SUBPIN_SWIPE_RIGHT&#39; | &#39;SHOWCASE_SUBPAGE_REPIN&#39; | &#39;SHOWCASE_SUBPIN_REPIN&#39; | &#39;SHOWCASE_SUBPAGE_CLOSEUP&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD&#39; | &#39;SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD&#39; | &#39;SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION&#39; | &#39;TOTAL_CHECKOUT_CONVERSION_RATE&#39; | &#39;TOTAL_VIEW_CATEGORY_CONVERSION_RATE&#39; | &#39;TOTAL_ADD_TO_CART_CONVERSION_RATE&#39; | &#39;TOTAL_SIGNUP_CONVERSION_RATE&#39; | &#39;TOTAL_PAGE_VISIT_CONVERSION_RATE&#39; | &#39;TOTAL_LEAD_CONVERSION_RATE&#39; | &#39;TOTAL_SEARCH_CONVERSION_RATE&#39; | &#39;TOTAL_WATCH_VIDEO_CONVERSION_RATE&#39; | &#39;TOTAL_UNKNOWN_CONVERSION_RATE&#39; | &#39;TOTAL_CUSTOM_CONVERSION_RATE&#39;&gt;
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    columns: Array<'SPEND_IN_MICRO_DOLLAR' | 'PAID_IMPRESSION' | 'SPEND_IN_DOLLAR' | 'CPC_IN_MICRO_DOLLAR' | 'ECPC_IN_MICRO_DOLLAR' | 'ECPC_IN_DOLLAR' | 'CTR' | 'ECTR' | 'OUTBOUND_CTR_1' | 'CAMPAIGN_NAME' | 'CAMPAIGN_BRAND_LABEL' | 'PIN_ID' | 'TOTAL_ENGAGEMENT' | 'ENGAGEMENT_1' | 'ENGAGEMENT_2' | 'ECPE_IN_DOLLAR' | 'ENGAGEMENT_RATE' | 'EENGAGEMENT_RATE' | 'ECPM_IN_MICRO_DOLLAR' | 'REPIN_RATE' | 'CTR_2' | 'CAMPAIGN_ID' | 'ADVERTISER_ID' | 'AD_ACCOUNT_ID' | 'PIN_PROMOTION_ID' | 'AD_ID' | 'AD_GROUP_ID' | 'CAMPAIGN_ENTITY_STATUS' | 'CAMPAIGN_OBJECTIVE_TYPE' | 'CPM_IN_MICRO_DOLLAR' | 'CPM_IN_DOLLAR' | 'AD_GROUP_NAME' | 'AD_GROUP_BUDGET_TYPE' | 'AD_GROUP_BUDGET_IN_LOCAL_CURRENCY' | 'AD_GROUP_ENTITY_STATUS' | 'AD_GROUP_BID_MULTIPLIER' | 'PROMO_ID' | 'PROMO_NAME' | 'ORDER_LINE_ID' | 'ORDER_LINE_NAME' | 'CLICKTHROUGH_1' | 'REPIN_1' | 'IMPRESSION_1' | 'IMPRESSION_1_GROSS' | 'CLICKTHROUGH_1_GROSS' | 'OUTBOUND_CLICK_1' | 'CLICKTHROUGH_2' | 'REPIN_2' | 'IMPRESSION_2' | 'OUTBOUND_CLICK_2' | 'TOTAL_CLICKTHROUGH' | 'TOTAL_IMPRESSION' | 'TOTAL_IMPRESSION_USER' | 'TOTAL_IMPRESSION_FREQUENCY' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR' | 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1' | 'TOTAL_ENGAGEMENT_SIGNUP' | 'TOTAL_ENGAGEMENT_CHECKOUT' | 'TOTAL_ENGAGEMENT_LEAD' | 'TOTAL_CLICK_SIGNUP' | 'TOTAL_CLICK_CHECKOUT' | 'TOTAL_CLICK_ADD_TO_CART' | 'TOTAL_CLICK_LEAD' | 'TOTAL_VIEW_SIGNUP' | 'TOTAL_VIEW_CHECKOUT' | 'TOTAL_VIEW_ADD_TO_CART' | 'TOTAL_VIEW_LEAD' | 'TOTAL_CONVERSIONS' | 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_SESSIONS' | 'WEB_SESSIONS_1' | 'WEB_SESSIONS_2' | 'AD_NAME' | 'CAMPAIGN_LIFETIME_SPEND_CAP' | 'AD_GROUP_OPTIMIZATION' | 'CAMPAIGN_DAILY_SPEND_CAP' | 'CAMPAIGN_BUDGET_OPTIMIZATION' | 'IS_PREMIERE_CAMPAIGN' | 'TOTAL_PAGE_VISIT' | 'TOTAL_SIGNUP' | 'TOTAL_CHECKOUT' | 'TOTAL_CUSTOM' | 'TOTAL_LEAD' | 'TOTAL_ADD_TO_WISHLIST' | 'TOTAL_SUBSCRIBE' | 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR' | 'PAGE_VISIT_COST_PER_ACTION' | 'PAGE_VISIT_ROAS' | 'CHECKOUT_ROAS' | 'CUSTOM_ROAS' | 'PRODUCT_GROUP_AD_IMAGE_TAG' | 'PRODUCT_GROUP_AD_VIDEO_TAG' | 'VIDEO_3SEC_VIEWS_1' | 'VIDEO_15SEC_UNIQUE_VIEWS_1' | 'VIDEO_MRC_VIEWS_1' | 'VIDEO_3SEC_VIEWS_2' | 'VIDEO_15SEC_UNIQUE_VIEWS_2' | 'VIDEO_P100_COMPLETE_2' | 'VIDEO_P0_COMBINED_2' | 'VIDEO_P25_COMBINED_2' | 'VIDEO_P50_COMBINED_2' | 'VIDEO_P75_COMBINED_2' | 'VIDEO_P95_COMBINED_2' | 'VIDEO_MRC_VIEWS_2' | 'PAID_VIDEO_VIEWABLE_RATE' | 'VIDEO_LENGTH' | 'VIDEO_SPEND_IN_DOLLAR' | 'ECPV_IN_DOLLAR' | 'ECPCV_IN_DOLLAR' | 'ECPCV_P95_IN_DOLLAR' | 'TOTAL_VIDEO_3SEC_VIEWS' | 'TOTAL_VIDEO_15SEC_UNIQUE_VIEWS' | 'TOTAL_VIDEO_P100_COMPLETE' | 'TOTAL_VIDEO_P0_COMBINED' | 'TOTAL_VIDEO_P25_COMBINED' | 'TOTAL_VIDEO_P50_COMBINED' | 'TOTAL_VIDEO_P75_COMBINED' | 'TOTAL_VIDEO_P95_COMBINED' | 'TOTAL_VIDEO_MRC_VIEWS' | 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND' | 'TOTAL_REPIN_RATE' | 'WEB_CHECKOUT_COST_PER_ACTION' | 'WEB_CHECKOUT_ROAS' | 'TOTAL_WEB_CHECKOUT' | 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_CLICK_CHECKOUT' | 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT' | 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'TOTAL_WEB_VIEW_CHECKOUT' | 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR' | 'INAPP_CHECKOUT_COST_PER_ACTION' | 'TOTAL_OFFLINE_CHECKOUT' | 'TOTAL_APP_INSTALL_CONVERSION_RATE' | 'TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE' | 'IDEA_PIN_PRODUCT_TAG_VISIT_1' | 'IDEA_PIN_PRODUCT_TAG_VISIT_2' | 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT' | 'LEADS' | 'COST_PER_LEAD' | 'QUIZ_COMPLETED' | 'QUIZ_PIN_RESULT_OPEN' | 'QUIZ_COMPLETION_RATE' | 'SHOWCASE_PIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_CLICKTHROUGH' | 'SHOWCASE_SUBPIN_CLICKTHROUGH' | 'SHOWCASE_SUBPAGE_IMPRESSION' | 'SHOWCASE_SUBPIN_IMPRESSION' | 'SHOWCASE_SUBPAGE_SWIPE_LEFT' | 'SHOWCASE_SUBPAGE_SWIPE_RIGHT' | 'SHOWCASE_SUBPIN_SWIPE_LEFT' | 'SHOWCASE_SUBPIN_SWIPE_RIGHT' | 'SHOWCASE_SUBPAGE_REPIN' | 'SHOWCASE_SUBPIN_REPIN' | 'SHOWCASE_SUBPAGE_CLOSEUP' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD' | 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD' | 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION' | 'TOTAL_CHECKOUT_CONVERSION_RATE' | 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE' | 'TOTAL_ADD_TO_CART_CONVERSION_RATE' | 'TOTAL_SIGNUP_CONVERSION_RATE' | 'TOTAL_PAGE_VISIT_CONVERSION_RATE' | 'TOTAL_LEAD_CONVERSION_RATE' | 'TOTAL_SEARCH_CONVERSION_RATE' | 'TOTAL_WATCH_VIDEO_CONVERSION_RATE' | 'TOTAL_UNKNOWN_CONVERSION_RATE' | 'TOTAL_CUSTOM_CONVERSION_RATE'>
    /**
     * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
     * Defaults to: undefined
     * @type Granularity
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    granularity: Granularity
    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    clickWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;.
     * Defaults to: 30
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    engagementWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * Defaults to: 1
     * @type 0 | 1 | 7 | 14 | 30 | 60
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    viewWindowDays?: 0 | 1 | 7 | 14 | 30 | 60
    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * Defaults to: &#39;TIME_OF_AD_ACTION&#39;
     * @type &#39;TIME_OF_AD_ACTION&#39; | &#39;TIME_OF_CONVERSION&#39;
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    conversionReportTime?: 'TIME_OF_AD_ACTION' | 'TIME_OF_CONVERSION'
    /**
     * Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
     * Defaults to: undefined
     * @type ReportingTimeZone
     * @memberof ProductGroupPromotionsApiproductGroupsAnalytics
     */
    reportingTimezone?: ReportingTimeZone
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
    public productGroupPromotionsCreateWithHttpInfo(param: ProductGroupPromotionsApiProductGroupPromotionsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProductGroupPromotionResponse>> {
        return this.api.productGroupPromotionsCreateWithHttpInfo(param.adAccountId, param.productGroupPromotionCreateRequest,  options).toPromise();
    }

    /**
     * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a \'product group promotion.\')
     * Create product group promotions
     * @param param the request object
     */
    public productGroupPromotionsCreate(param: ProductGroupPromotionsApiProductGroupPromotionsCreateRequest, options?: ConfigurationOptions): Promise<ProductGroupPromotionResponse> {
        return this.api.productGroupPromotionsCreate(param.adAccountId, param.productGroupPromotionCreateRequest,  options).toPromise();
    }

    /**
     * Get a product group promotion by id
     * Get a product group promotion by id
     * @param param the request object
     */
    public productGroupPromotionsGetWithHttpInfo(param: ProductGroupPromotionsApiProductGroupPromotionsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProductGroupPromotion>> {
        return this.api.productGroupPromotionsGetWithHttpInfo(param.adAccountId, param.productGroupPromotionId,  options).toPromise();
    }

    /**
     * Get a product group promotion by id
     * Get a product group promotion by id
     * @param param the request object
     */
    public productGroupPromotionsGet(param: ProductGroupPromotionsApiProductGroupPromotionsGetRequest, options?: ConfigurationOptions): Promise<ProductGroupPromotion> {
        return this.api.productGroupPromotionsGet(param.adAccountId, param.productGroupPromotionId,  options).toPromise();
    }

    /**
     * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
     * Get product group promotions
     * @param param the request object
     */
    public productGroupPromotionsListWithHttpInfo(param: ProductGroupPromotionsApiProductGroupPromotionsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProductGroupPromotionsList200Response>> {
        return this.api.productGroupPromotionsListWithHttpInfo(param.adAccountId, param.productGroupPromotionIds, param.entityStatuses, param.adGroupId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
     * Get product group promotions
     * @param param the request object
     */
    public productGroupPromotionsList(param: ProductGroupPromotionsApiProductGroupPromotionsListRequest, options?: ConfigurationOptions): Promise<ProductGroupPromotionsList200Response> {
        return this.api.productGroupPromotionsList(param.adAccountId, param.productGroupPromotionIds, param.entityStatuses, param.adGroupId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * Update multiple existing Product Group Promotions (by product_group_id)
     * Update product group promotions
     * @param param the request object
     */
    public productGroupPromotionsUpdateWithHttpInfo(param: ProductGroupPromotionsApiProductGroupPromotionsUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProductGroupPromotionResponse>> {
        return this.api.productGroupPromotionsUpdateWithHttpInfo(param.adAccountId, param.productGroupPromotionUpdateRequest,  options).toPromise();
    }

    /**
     * Update multiple existing Product Group Promotions (by product_group_id)
     * Update product group promotions
     * @param param the request object
     */
    public productGroupPromotionsUpdate(param: ProductGroupPromotionsApiProductGroupPromotionsUpdateRequest, options?: ConfigurationOptions): Promise<ProductGroupPromotionResponse> {
        return this.api.productGroupPromotionsUpdate(param.adAccountId, param.productGroupPromotionUpdateRequest,  options).toPromise();
    }

    /**
     * Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     * Get product group analytics
     * @param param the request object
     */
    public productGroupsAnalyticsWithHttpInfo(param: ProductGroupPromotionsApiProductGroupsAnalyticsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<ProductGroupAnalyticsResponseInner>>> {
        return this.api.productGroupsAnalyticsWithHttpInfo(param.adAccountId, param.startDate, param.endDate, param.productGroupIds, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.reportingTimezone,  options).toPromise();
    }

    /**
     * Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     * Get product group analytics
     * @param param the request object
     */
    public productGroupsAnalytics(param: ProductGroupPromotionsApiProductGroupsAnalyticsRequest, options?: ConfigurationOptions): Promise<Array<ProductGroupAnalyticsResponseInner>> {
        return this.api.productGroupsAnalytics(param.adAccountId, param.startDate, param.endDate, param.productGroupIds, param.columns, param.granularity, param.clickWindowDays, param.engagementWindowDays, param.viewWindowDays, param.conversionReportTime, param.reportingTimezone,  options).toPromise();
    }

}

import { ObservablePromotionsApi } from "./ObservableAPI";
import { PromotionsApiRequestFactory, PromotionsApiResponseProcessor} from "../apis/PromotionsApi";

export interface PromotionsApiPromotionsCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof PromotionsApipromotionsCreate
     */
    adAccountId: string
    /**
     * List of promotions to create, size limit [1, 30].
     * @type Array&lt;PromotionCreateRequest&gt;
     * @memberof PromotionsApipromotionsCreate
     */
    promotionCreateRequest: Array<PromotionCreateRequest>
}

export interface PromotionsApiPromotionsDeleteRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof PromotionsApipromotionsDelete
     */
    adAccountId: string
    /**
     * Unique identifier of a promotion
     * Defaults to: undefined
     * @type string
     * @memberof PromotionsApipromotionsDelete
     */
    promotionId: string
}

export interface PromotionsApiPromotionsGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof PromotionsApipromotionsGet
     */
    adAccountId: string
    /**
     * Unique identifier of a promotion
     * Defaults to: undefined
     * @type string
     * @memberof PromotionsApipromotionsGet
     */
    promotionId: string
}

export interface PromotionsApiPromotionsListRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof PromotionsApipromotionsList
     */
    adAccountId: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof PromotionsApipromotionsList
     */
    pageSize?: number
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * Defaults to: undefined
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof PromotionsApipromotionsList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof PromotionsApipromotionsList
     */
    bookmark?: string
}

export interface PromotionsApiPromotionsUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof PromotionsApipromotionsUpdate
     */
    adAccountId: string
    /**
     * List of promotions to create, size limit [1, 30].
     * @type Array&lt;PromotionUpdateRequest&gt;
     * @memberof PromotionsApipromotionsUpdate
     */
    promotionUpdateRequest: Array<PromotionUpdateRequest>
}

export class ObjectPromotionsApi {
    private api: ObservablePromotionsApi

    public constructor(configuration: Configuration, requestFactory?: PromotionsApiRequestFactory, responseProcessor?: PromotionsApiResponseProcessor) {
        this.api = new ObservablePromotionsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create multiple new promotions.
     * Create promotions
     * @param param the request object
     */
    public promotionsCreateWithHttpInfo(param: PromotionsApiPromotionsCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<PromotionsResponse>> {
        return this.api.promotionsCreateWithHttpInfo(param.adAccountId, param.promotionCreateRequest,  options).toPromise();
    }

    /**
     * Create multiple new promotions.
     * Create promotions
     * @param param the request object
     */
    public promotionsCreate(param: PromotionsApiPromotionsCreateRequest, options?: ConfigurationOptions): Promise<PromotionsResponse> {
        return this.api.promotionsCreate(param.adAccountId, param.promotionCreateRequest,  options).toPromise();
    }

    /**
     * Delete a promotion within Pinterest.
     * Delete promotion by id
     * @param param the request object
     */
    public promotionsDeleteWithHttpInfo(param: PromotionsApiPromotionsDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.promotionsDeleteWithHttpInfo(param.adAccountId, param.promotionId,  options).toPromise();
    }

    /**
     * Delete a promotion within Pinterest.
     * Delete promotion by id
     * @param param the request object
     */
    public promotionsDelete(param: PromotionsApiPromotionsDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.promotionsDelete(param.adAccountId, param.promotionId,  options).toPromise();
    }

    /**
     * Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
     * Get promotion by id
     * @param param the request object
     */
    public promotionsGetWithHttpInfo(param: PromotionsApiPromotionsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<PromotionResponse>> {
        return this.api.promotionsGetWithHttpInfo(param.adAccountId, param.promotionId,  options).toPromise();
    }

    /**
     * Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
     * Get promotion by id
     * @param param the request object
     */
    public promotionsGet(param: PromotionsApiPromotionsGetRequest, options?: ConfigurationOptions): Promise<PromotionResponse> {
        return this.api.promotionsGet(param.adAccountId, param.promotionId,  options).toPromise();
    }

    /**
     * Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
     * Get promotions
     * @param param the request object
     */
    public promotionsListWithHttpInfo(param: PromotionsApiPromotionsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<PromotionsList200Response>> {
        return this.api.promotionsListWithHttpInfo(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
     * Get promotions
     * @param param the request object
     */
    public promotionsList(param: PromotionsApiPromotionsListRequest, options?: ConfigurationOptions): Promise<PromotionsList200Response> {
        return this.api.promotionsList(param.adAccountId, param.pageSize, param.order, param.bookmark,  options).toPromise();
    }

    /**
     * Update multiple promotions.
     * Update promotions
     * @param param the request object
     */
    public promotionsUpdateWithHttpInfo(param: PromotionsApiPromotionsUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<PromotionsResponse>> {
        return this.api.promotionsUpdateWithHttpInfo(param.adAccountId, param.promotionUpdateRequest,  options).toPromise();
    }

    /**
     * Update multiple promotions.
     * Update promotions
     * @param param the request object
     */
    public promotionsUpdate(param: PromotionsApiPromotionsUpdateRequest, options?: ConfigurationOptions): Promise<PromotionsResponse> {
        return this.api.promotionsUpdate(param.adAccountId, param.promotionUpdateRequest,  options).toPromise();
    }

}

import { ObservableResourcesApi } from "./ObservableAPI";
import { ResourcesApiRequestFactory, ResourcesApiResponseProcessor} from "../apis/ResourcesApi";

export interface ResourcesApiAdAccountCountriesGetRequest {
}

export interface ResourcesApiDeliveryMetricsGetRequest {
    /**
     * Report type.
     * Defaults to: undefined
     * @type &#39;SYNC&#39; | &#39;ASYNC&#39;
     * @memberof ResourcesApideliveryMetricsGet
     */
    reportType?: 'SYNC' | 'ASYNC'
}

export interface ResourcesApiInterestTargetingOptionsGetRequest {
    /**
     * Unique identifier of an interest.
     * Defaults to: undefined
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
     * Defaults to: undefined
     * @type string
     * @memberof ResourcesApimetricsReadyStateGet
     */
    date: string
}

export interface ResourcesApiTargetingOptionsGetRequest {
    /**
     * Public targeting type.
     * Defaults to: undefined
     * @type &#39;APPTYPE&#39; | &#39;GENDER&#39; | &#39;LOCALE&#39; | &#39;AGE_BUCKET&#39; | &#39;LOCATION&#39; | &#39;GEO&#39; | &#39;INTEREST&#39; | &#39;KEYWORD&#39; | &#39;AUDIENCE_INCLUDE&#39; | &#39;AUDIENCE_EXCLUDE&#39;
     * @memberof ResourcesApitargetingOptionsGet
     */
    targetingType: 'APPTYPE' | 'GENDER' | 'LOCALE' | 'AGE_BUCKET' | 'LOCATION' | 'GEO' | 'INTEREST' | 'KEYWORD' | 'AUDIENCE_INCLUDE' | 'AUDIENCE_EXCLUDE'
    /**
     * Client ID.
     * Defaults to: undefined
     * @type string
     * @memberof ResourcesApitargetingOptionsGet
     */
    clientId?: string
    /**
     * Oauth signature
     * Defaults to: undefined
     * @type string
     * @memberof ResourcesApitargetingOptionsGet
     */
    oauthSignature?: string
    /**
     * Timestamp
     * Defaults to: undefined
     * @type string
     * @memberof ResourcesApitargetingOptionsGet
     */
    timestamp?: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof ResourcesApitargetingOptionsGet
     */
    adAccountId?: string
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
    public adAccountCountriesGetWithHttpInfo(param: ResourcesApiAdAccountCountriesGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<AdAccountsCountryResponse>> {
        return this.api.adAccountCountriesGetWithHttpInfo( options).toPromise();
    }

    /**
     * Get Ad Accounts countries
     * Get ad accounts countries
     * @param param the request object
     */
    public adAccountCountriesGet(param: ResourcesApiAdAccountCountriesGetRequest = {}, options?: ConfigurationOptions): Promise<AdAccountsCountryResponse> {
        return this.api.adAccountCountriesGet( options).toPromise();
    }

    /**
     * Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href=\'/docs/api-features/analytics-overview/\'>Organic Analytics</a> and <a href=\'/docs/api-features/ads-reporting/\'>Ads Analytics</a> for more information.
     * Get available metrics\' definitions
     * @param param the request object
     */
    public deliveryMetricsGetWithHttpInfo(param: ResourcesApiDeliveryMetricsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<DeliveryMetricsResponse>> {
        return this.api.deliveryMetricsGetWithHttpInfo(param.reportType,  options).toPromise();
    }

    /**
     * Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href=\'/docs/api-features/analytics-overview/\'>Organic Analytics</a> and <a href=\'/docs/api-features/ads-reporting/\'>Ads Analytics</a> for more information.
     * Get available metrics\' definitions
     * @param param the request object
     */
    public deliveryMetricsGet(param: ResourcesApiDeliveryMetricsGetRequest = {}, options?: ConfigurationOptions): Promise<DeliveryMetricsResponse> {
        return this.api.deliveryMetricsGet(param.reportType,  options).toPromise();
    }

    /**
     * <p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>
     * Get interest details
     * @param param the request object
     */
    public interestTargetingOptionsGetWithHttpInfo(param: ResourcesApiInterestTargetingOptionsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<SingleInterestTargetingOptionResponse>> {
        return this.api.interestTargetingOptionsGetWithHttpInfo(param.interestId,  options).toPromise();
    }

    /**
     * <p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>
     * Get interest details
     * @param param the request object
     */
    public interestTargetingOptionsGet(param: ResourcesApiInterestTargetingOptionsGetRequest, options?: ConfigurationOptions): Promise<SingleInterestTargetingOptionResponse> {
        return this.api.interestTargetingOptionsGet(param.interestId,  options).toPromise();
    }

    /**
     * Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>
     * Get lead form questions
     * @param param the request object
     */
    public leadFormQuestionsGetWithHttpInfo(param: ResourcesApiLeadFormQuestionsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.leadFormQuestionsGetWithHttpInfo( options).toPromise();
    }

    /**
     * Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>
     * Get lead form questions
     * @param param the request object
     */
    public leadFormQuestionsGet(param: ResourcesApiLeadFormQuestionsGetRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.leadFormQuestionsGet( options).toPromise();
    }

    /**
     * Learn whether conversion or non-conversion metrics are finalized and ready to query.
     * Get metrics ready state
     * @param param the request object
     */
    public metricsReadyStateGetWithHttpInfo(param: ResourcesApiMetricsReadyStateGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<BookClosedResponse>> {
        return this.api.metricsReadyStateGetWithHttpInfo(param.date,  options).toPromise();
    }

    /**
     * Learn whether conversion or non-conversion metrics are finalized and ready to query.
     * Get metrics ready state
     * @param param the request object
     */
    public metricsReadyStateGet(param: ResourcesApiMetricsReadyStateGetRequest, options?: ConfigurationOptions): Promise<BookClosedResponse> {
        return this.api.metricsReadyStateGet(param.date,  options).toPromise();
    }

    /**
     * <p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>
     * Get targeting options
     * @param param the request object
     */
    public targetingOptionsGetWithHttpInfo(param: ResourcesApiTargetingOptionsGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<any>>> {
        return this.api.targetingOptionsGetWithHttpInfo(param.targetingType, param.clientId, param.oauthSignature, param.timestamp, param.adAccountId,  options).toPromise();
    }

    /**
     * <p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>
     * Get targeting options
     * @param param the request object
     */
    public targetingOptionsGet(param: ResourcesApiTargetingOptionsGetRequest, options?: ConfigurationOptions): Promise<Array<any>> {
        return this.api.targetingOptionsGet(param.targetingType, param.clientId, param.oauthSignature, param.timestamp, param.adAccountId,  options).toPromise();
    }

}

import { ObservableSearchApi } from "./ObservableAPI";
import { SearchApiRequestFactory, SearchApiResponseProcessor} from "../apis/SearchApi";

export interface SearchApiSearchPartnerPinsRequest {
    /**
     * Search term to look up pins.
     * Defaults to: undefined
     * @type string
     * @memberof SearchApisearchPartnerPins
     */
    term: string
    /**
     * Two letter country code (ISO 3166-1 alpha-2)
     * Defaults to: undefined
     * @type string
     * @memberof SearchApisearchPartnerPins
     */
    countryCode: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof SearchApisearchPartnerPins
     */
    bookmark?: string
    /**
     * Search locale.
     * Defaults to: undefined
     * @type string
     * @memberof SearchApisearchPartnerPins
     */
    locale?: string
    /**
     * Max search result size
     * Minimum: 1
     * Maximum: 50
     * Defaults to: 10
     * @type number
     * @memberof SearchApisearchPartnerPins
     */
    limit?: number
}

export interface SearchApiSearchUserBoardsGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof SearchApisearchUserBoardsGet
     */
    adAccountId?: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof SearchApisearchUserBoardsGet
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof SearchApisearchUserBoardsGet
     */
    pageSize?: number
    /**
     * Search query. Can contain pin description keywords or comma-separated pin IDs.
     * Defaults to: undefined
     * @type string
     * @memberof SearchApisearchUserBoardsGet
     */
    query?: string
}

export interface SearchApiSearchUserPinsListRequest {
    /**
     * Search query. Can contain pin description keywords or comma-separated pin IDs.
     * Defaults to: undefined
     * @type string
     * @memberof SearchApisearchUserPinsList
     */
    query: string
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof SearchApisearchUserPinsList
     */
    adAccountId?: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
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
     * <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
     * Search pins by a given search term
     * @param param the request object
     */
    public searchPartnerPinsWithHttpInfo(param: SearchApiSearchPartnerPinsRequest, options?: ConfigurationOptions): Promise<HttpInfo<SearchPartnerPins200Response>> {
        return this.api.searchPartnerPinsWithHttpInfo(param.term, param.countryCode, param.bookmark, param.locale, param.limit,  options).toPromise();
    }

    /**
     * <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
     * Search pins by a given search term
     * @param param the request object
     */
    public searchPartnerPins(param: SearchApiSearchPartnerPinsRequest, options?: ConfigurationOptions): Promise<SearchPartnerPins200Response> {
        return this.api.searchPartnerPins(param.term, param.countryCode, param.bookmark, param.locale, param.limit,  options).toPromise();
    }

    /**
     * Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/getting-started/using-business-access/\'>Understanding Business Access</a> for more information.
     * Search user\'s boards
     * @param param the request object
     */
    public searchUserBoardsGetWithHttpInfo(param: SearchApiSearchUserBoardsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<SearchUserBoardsGet200Response>> {
        return this.api.searchUserBoardsGetWithHttpInfo(param.adAccountId, param.bookmark, param.pageSize, param.query,  options).toPromise();
    }

    /**
     * Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/getting-started/using-business-access/\'>Understanding Business Access</a> for more information.
     * Search user\'s boards
     * @param param the request object
     */
    public searchUserBoardsGet(param: SearchApiSearchUserBoardsGetRequest = {}, options?: ConfigurationOptions): Promise<SearchUserBoardsGet200Response> {
        return this.api.searchUserBoardsGet(param.adAccountId, param.bookmark, param.pageSize, param.query,  options).toPromise();
    }

    /**
     * Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/getting-started/using-business-access/\'>Understanding Business Access</a> for more information.
     * Search user\'s Pins
     * @param param the request object
     */
    public searchUserPinsListWithHttpInfo(param: SearchApiSearchUserPinsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<SearchUserPinsList200Response>> {
        return this.api.searchUserPinsListWithHttpInfo(param.query, param.adAccountId, param.bookmark,  options).toPromise();
    }

    /**
     * Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/getting-started/using-business-access/\'>Understanding Business Access</a> for more information.
     * Search user\'s Pins
     * @param param the request object
     */
    public searchUserPinsList(param: SearchApiSearchUserPinsListRequest, options?: ConfigurationOptions): Promise<SearchUserPinsList200Response> {
        return this.api.searchUserPinsList(param.query, param.adAccountId, param.bookmark,  options).toPromise();
    }

}

import { ObservableTargetingTemplateApi } from "./ObservableAPI";
import { TargetingTemplateApiRequestFactory, TargetingTemplateApiResponseProcessor} from "../apis/TargetingTemplateApi";

export interface TargetingTemplateApiTargetingTemplateCreateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof TargetingTemplateApitargetingTemplateCreate
     */
    adAccountId: string
    /**
     * targeting template creation entity
     * @type TargetingTemplateCreate
     * @memberof TargetingTemplateApitargetingTemplateCreate
     */
    targetingTemplateCreate: TargetingTemplateCreate
}

export interface TargetingTemplateApiTargetingTemplateListRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof TargetingTemplateApitargetingTemplateList
     */
    adAccountId: string
    /**
     * The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * Defaults to: undefined
     * @type &#39;ASCENDING&#39; | &#39;DESCENDING&#39;
     * @memberof TargetingTemplateApitargetingTemplateList
     */
    order?: 'ASCENDING' | 'DESCENDING'
    /**
     * Include audience sizing in result or not
     * Defaults to: false
     * @type boolean
     * @memberof TargetingTemplateApitargetingTemplateList
     */
    includeSizing?: boolean
    /**
     * Search keyword for targeting templates
     * Defaults to: undefined
     * @type string
     * @memberof TargetingTemplateApitargetingTemplateList
     */
    searchQuery?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof TargetingTemplateApitargetingTemplateList
     */
    pageSize?: number
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof TargetingTemplateApitargetingTemplateList
     */
    bookmark?: string
}

export interface TargetingTemplateApiTargetingTemplateUpdateRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof TargetingTemplateApitargetingTemplateUpdate
     */
    adAccountId: string
    /**
     * Operation type and targeting template ID
     * @type TargetingTemplateUpdateRequest
     * @memberof TargetingTemplateApitargetingTemplateUpdate
     */
    targetingTemplateUpdateRequest: TargetingTemplateUpdateRequest
}

export class ObjectTargetingTemplateApi {
    private api: ObservableTargetingTemplateApi

    public constructor(configuration: Configuration, requestFactory?: TargetingTemplateApiRequestFactory, responseProcessor?: TargetingTemplateApiResponseProcessor) {
        this.api = new ObservableTargetingTemplateApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
     * Create targeting templates
     * @param param the request object
     */
    public targetingTemplateCreateWithHttpInfo(param: TargetingTemplateApiTargetingTemplateCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<TargetingTemplateGetResponseData>> {
        return this.api.targetingTemplateCreateWithHttpInfo(param.adAccountId, param.targetingTemplateCreate,  options).toPromise();
    }

    /**
     * <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
     * Create targeting templates
     * @param param the request object
     */
    public targetingTemplateCreate(param: TargetingTemplateApiTargetingTemplateCreateRequest, options?: ConfigurationOptions): Promise<TargetingTemplateGetResponseData> {
        return this.api.targetingTemplateCreate(param.adAccountId, param.targetingTemplateCreate,  options).toPromise();
    }

    /**
     * Get a list of the targeting templates in the specified <code>ad_account_id</code>
     * List targeting templates
     * @param param the request object
     */
    public targetingTemplateListWithHttpInfo(param: TargetingTemplateApiTargetingTemplateListRequest, options?: ConfigurationOptions): Promise<HttpInfo<TargetingTemplateList200Response>> {
        return this.api.targetingTemplateListWithHttpInfo(param.adAccountId, param.order, param.includeSizing, param.searchQuery, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * Get a list of the targeting templates in the specified <code>ad_account_id</code>
     * List targeting templates
     * @param param the request object
     */
    public targetingTemplateList(param: TargetingTemplateApiTargetingTemplateListRequest, options?: ConfigurationOptions): Promise<TargetingTemplateList200Response> {
        return this.api.targetingTemplateList(param.adAccountId, param.order, param.includeSizing, param.searchQuery, param.pageSize, param.bookmark,  options).toPromise();
    }

    /**
     * <p>Update the targeting template given advertiser ID and targeting template ID</p>
     * Update targeting templates
     * @param param the request object
     */
    public targetingTemplateUpdateWithHttpInfo(param: TargetingTemplateApiTargetingTemplateUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.targetingTemplateUpdateWithHttpInfo(param.adAccountId, param.targetingTemplateUpdateRequest,  options).toPromise();
    }

    /**
     * <p>Update the targeting template given advertiser ID and targeting template ID</p>
     * Update targeting templates
     * @param param the request object
     */
    public targetingTemplateUpdate(param: TargetingTemplateApiTargetingTemplateUpdateRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.targetingTemplateUpdate(param.adAccountId, param.targetingTemplateUpdateRequest,  options).toPromise();
    }

}

import { ObservableTermsApi } from "./ObservableAPI";
import { TermsApiRequestFactory, TermsApiResponseProcessor} from "../apis/TermsApi";

export interface TermsApiTermsRelatedListRequest {
    /**
     * List of input terms.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof TermsApitermsRelatedList
     */
    terms: Array<string>
}

export interface TermsApiTermsSuggestedListRequest {
    /**
     * Input term.
     * Defaults to: undefined
     * @type string
     * @memberof TermsApitermsSuggestedList
     */
    term: string
    /**
     * Max suggested terms to return.
     * Minimum: 1
     * Maximum: 10
     * Defaults to: 4
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
    public termsRelatedListWithHttpInfo(param: TermsApiTermsRelatedListRequest, options?: ConfigurationOptions): Promise<HttpInfo<RelatedTerms>> {
        return this.api.termsRelatedListWithHttpInfo(param.terms,  options).toPromise();
    }

    /**
     * Get a list of terms logically related to each input term. <p/> Example: the term \'workout\' would list related terms like \'one song workout\', \'yoga workout\', \'workout motivation\', etc.
     * List related terms
     * @param param the request object
     */
    public termsRelatedList(param: TermsApiTermsRelatedListRequest, options?: ConfigurationOptions): Promise<RelatedTerms> {
        return this.api.termsRelatedList(param.terms,  options).toPromise();
    }

    /**
     * Get popular search terms that begin with your input term. <p/> Example: \'sport\' would return popular terms like \'sports bar\' and \'sportswear\', but not \'motor sports\' since the phrase does not begin with the given term.
     * List suggested terms
     * @param param the request object
     */
    public termsSuggestedListWithHttpInfo(param: TermsApiTermsSuggestedListRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<string>>> {
        return this.api.termsSuggestedListWithHttpInfo(param.term, param.limit,  options).toPromise();
    }

    /**
     * Get popular search terms that begin with your input term. <p/> Example: \'sport\' would return popular terms like \'sports bar\' and \'sportswear\', but not \'motor sports\' since the phrase does not begin with the given term.
     * List suggested terms
     * @param param the request object
     */
    public termsSuggestedList(param: TermsApiTermsSuggestedListRequest, options?: ConfigurationOptions): Promise<Array<string>> {
        return this.api.termsSuggestedList(param.term, param.limit,  options).toPromise();
    }

}

import { ObservableTermsOfServiceApi } from "./ObservableAPI";
import { TermsOfServiceApiRequestFactory, TermsOfServiceApiResponseProcessor} from "../apis/TermsOfServiceApi";

export interface TermsOfServiceApiTermsOfServiceGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof TermsOfServiceApitermsOfServiceGet
     */
    adAccountId: string
    /**
     * Return HTML in TOS text.
     * Defaults to: false
     * @type boolean
     * @memberof TermsOfServiceApitermsOfServiceGet
     */
    includeHtml?: boolean
    /**
     * Request type.
     * Defaults to: undefined
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
    public termsOfServiceGetWithHttpInfo(param: TermsOfServiceApiTermsOfServiceGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<TermsOfService>> {
        return this.api.termsOfServiceGetWithHttpInfo(param.adAccountId, param.includeHtml, param.tosType,  options).toPromise();
    }

    /**
     * Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
     * Get terms of service
     * @param param the request object
     */
    public termsOfServiceGet(param: TermsOfServiceApiTermsOfServiceGetRequest, options?: ConfigurationOptions): Promise<TermsOfService> {
        return this.api.termsOfServiceGet(param.adAccountId, param.includeHtml, param.tosType,  options).toPromise();
    }

}

import { ObservableUserAccountApi } from "./ObservableAPI";
import { UserAccountApiRequestFactory, UserAccountApiResponseProcessor} from "../apis/UserAccountApi";

export interface UserAccountApiBoardsUserFollowsListRequest {
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiboardsUserFollowsList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof UserAccountApiboardsUserFollowsList
     */
    pageSize?: number
    /**
     * Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
     * Defaults to: false
     * @type boolean
     * @memberof UserAccountApiboardsUserFollowsList
     */
    explicitFollowing?: boolean
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiboardsUserFollowsList
     */
    adAccountId?: string
}

export interface UserAccountApiFollowUserUpdateRequest {
    /**
     * A valid username
     * Defaults to: undefined
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
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApifollowersList
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
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
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiunverifyWebsiteDelete
     */
    website: string
}

export interface UserAccountApiUserAccountAnalyticsRequest {
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiuserAccountAnalytics
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiuserAccountAnalytics
     */
    endDate: string
    /**
     * Filter on Pins that match your claimed domain.
     * Defaults to: &#39;BOTH&#39;
     * @type &#39;OTHER&#39; | &#39;CLAIMED&#39; | &#39;BOTH&#39;
     * @memberof UserAccountApiuserAccountAnalytics
     */
    fromClaimedContent?: 'OTHER' | 'CLAIMED' | 'BOTH'
    /**
     * Pin formats to get data for, default is all.
     * Defaults to: &#39;ALL&#39;
     * @type &#39;ALL&#39; | &#39;ORGANIC_IMAGE&#39; | &#39;ORGANIC_PRODUCT&#39; | &#39;ORGANIC_VIDEO&#39; | &#39;ADS_STANDARD&#39; | &#39;ADS_PRODUCT&#39; | &#39;ADS_VIDEO&#39; | &#39;ADS_IDEA&#39;
     * @memberof UserAccountApiuserAccountAnalytics
     */
    pinFormat?: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA'
    /**
     * Apps or devices to get data for, default is all.
     * Defaults to: &#39;ALL&#39;
     * @type &#39;ALL&#39; | &#39;MOBILE&#39; | &#39;TABLET&#39; | &#39;WEB&#39;
     * @memberof UserAccountApiuserAccountAnalytics
     */
    appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB'
    /**
     * Filter to paid or organic data. Default is all.
     * Defaults to: &#39;ALL&#39;
     * @type &#39;ALL&#39; | &#39;PAID&#39; | &#39;ORGANIC&#39;
     * @memberof UserAccountApiuserAccountAnalytics
     */
    contentType?: 'ALL' | 'PAID' | 'ORGANIC'
    /**
     * Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
     * Defaults to: &#39;ALL&#39;
     * @type &#39;ALL&#39; | &#39;YOUR_PINS&#39; | &#39;OTHER_PINS&#39;
     * @memberof UserAccountApiuserAccountAnalytics
     */
    source?: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS'
    /**
     * Metric types to get data for, default is all. 
     * Defaults to: undefined
     * @type Array&lt;&#39;ENGAGEMENT&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;IMPRESSION&#39; | &#39;OUTBOUND_CLICK&#39; | &#39;OUTBOUND_CLICK_RATE&#39; | &#39;PIN_CLICK&#39; | &#39;PIN_CLICK_RATE&#39; | &#39;SAVE&#39; | &#39;SAVE_RATE&#39;&gt;
     * @memberof UserAccountApiuserAccountAnalytics
     */
    metricTypes?: Array<'ENGAGEMENT' | 'ENGAGEMENT_RATE' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'OUTBOUND_CLICK_RATE' | 'PIN_CLICK' | 'PIN_CLICK_RATE' | 'SAVE' | 'SAVE_RATE'>
    /**
     * How to split the data into groups. Not including this param means data won\&#39;t be split.
     * Defaults to: &#39;NO_SPLIT&#39;
     * @type &#39;NO_SPLIT&#39; | &#39;APP_TYPE&#39; | &#39;OWNED_CONTENT&#39; | &#39;SOURCE&#39; | &#39;PIN_FORMAT&#39;
     * @memberof UserAccountApiuserAccountAnalytics
     */
    splitField?: 'NO_SPLIT' | 'APP_TYPE' | 'OWNED_CONTENT' | 'SOURCE' | 'PIN_FORMAT'
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiuserAccountAnalytics
     */
    adAccountId?: string
}

export interface UserAccountApiUserAccountAnalyticsTopPinsRequest {
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    endDate: string
    /**
     * Specify sorting order for metrics
     * Defaults to: undefined
     * @type &#39;ENGAGEMENT&#39; | &#39;IMPRESSION&#39; | &#39;OUTBOUND_CLICK&#39; | &#39;PIN_CLICK&#39; | &#39;SAVE&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    sortBy: 'ENGAGEMENT' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'PIN_CLICK' | 'SAVE'
    /**
     * Filter on Pins that match your claimed domain.
     * Defaults to: &#39;BOTH&#39;
     * @type &#39;OTHER&#39; | &#39;CLAIMED&#39; | &#39;BOTH&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    fromClaimedContent?: 'OTHER' | 'CLAIMED' | 'BOTH'
    /**
     * Pin formats to get data for, default is all.
     * Defaults to: &#39;ALL&#39;
     * @type &#39;ALL&#39; | &#39;ORGANIC_IMAGE&#39; | &#39;ORGANIC_PRODUCT&#39; | &#39;ORGANIC_VIDEO&#39; | &#39;ADS_STANDARD&#39; | &#39;ADS_PRODUCT&#39; | &#39;ADS_VIDEO&#39; | &#39;ADS_IDEA&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    pinFormat?: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA'
    /**
     * Apps or devices to get data for, default is all.
     * Defaults to: &#39;ALL&#39;
     * @type &#39;ALL&#39; | &#39;MOBILE&#39; | &#39;TABLET&#39; | &#39;WEB&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB'
    /**
     * Filter to paid or organic data. Default is all.
     * Defaults to: &#39;ALL&#39;
     * @type &#39;ALL&#39; | &#39;PAID&#39; | &#39;ORGANIC&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    contentType?: 'ALL' | 'PAID' | 'ORGANIC'
    /**
     * Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
     * Defaults to: &#39;ALL&#39;
     * @type &#39;ALL&#39; | &#39;YOUR_PINS&#39; | &#39;OTHER_PINS&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    source?: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS'
    /**
     * Metric types to get data for, default is all. 
     * Defaults to: undefined
     * @type Array&lt;&#39;ENGAGEMENT&#39; | &#39;ENGAGEMENT_RATE&#39; | &#39;IMPRESSION&#39; | &#39;OUTBOUND_CLICK&#39; | &#39;OUTBOUND_CLICK_RATE&#39; | &#39;PIN_CLICK&#39; | &#39;PIN_CLICK_RATE&#39; | &#39;SAVE&#39; | &#39;SAVE_RATE&#39;&gt;
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    metricTypes?: Array<'ENGAGEMENT' | 'ENGAGEMENT_RATE' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'OUTBOUND_CLICK_RATE' | 'PIN_CLICK' | 'PIN_CLICK_RATE' | 'SAVE' | 'SAVE_RATE'>
    /**
     * Number of pins to include, default is 10. Max is 50.
     * Minimum: 1
     * Maximum: 50
     * Defaults to: 10
     * @type number
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    numOfPins?: number
    /**
     * Get metrics for pins created in the last \&quot;n\&quot; days.
     * Defaults to: undefined
     * @type 30
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    createdInLastNDays?: 30
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiuserAccountAnalyticsTopPins
     */
    adAccountId?: string
}

export interface UserAccountApiUserAccountAnalyticsTopVideoPinsRequest {
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    startDate: string
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    endDate: string
    /**
     * Specify sorting order for video metrics
     * Defaults to: undefined
     * @type &#39;IMPRESSION&#39; | &#39;SAVE&#39; | &#39;OUTBOUND_CLICK&#39; | &#39;VIDEO_MRC_VIEW&#39; | &#39;VIDEO_AVG_WATCH_TIME&#39; | &#39;VIDEO_V50_WATCH_TIME&#39; | &#39;QUARTILE_95_PERCENT_VIEW&#39; | &#39;VIDEO_10S_VIEW&#39; | &#39;VIDEO_START&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    sortBy: 'IMPRESSION' | 'SAVE' | 'OUTBOUND_CLICK' | 'VIDEO_MRC_VIEW' | 'VIDEO_AVG_WATCH_TIME' | 'VIDEO_V50_WATCH_TIME' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_10S_VIEW' | 'VIDEO_START'
    /**
     * Filter on Pins that match your claimed domain.
     * Defaults to: &#39;BOTH&#39;
     * @type &#39;OTHER&#39; | &#39;CLAIMED&#39; | &#39;BOTH&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    fromClaimedContent?: 'OTHER' | 'CLAIMED' | 'BOTH'
    /**
     * Pin formats to get data for, default is all.
     * Defaults to: &#39;ALL&#39;
     * @type &#39;ALL&#39; | &#39;ORGANIC_IMAGE&#39; | &#39;ORGANIC_PRODUCT&#39; | &#39;ORGANIC_VIDEO&#39; | &#39;ADS_STANDARD&#39; | &#39;ADS_PRODUCT&#39; | &#39;ADS_VIDEO&#39; | &#39;ADS_IDEA&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    pinFormat?: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA'
    /**
     * Apps or devices to get data for, default is all.
     * Defaults to: &#39;ALL&#39;
     * @type &#39;ALL&#39; | &#39;MOBILE&#39; | &#39;TABLET&#39; | &#39;WEB&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB'
    /**
     * Filter to paid or organic data. Default is all.
     * Defaults to: &#39;ALL&#39;
     * @type &#39;ALL&#39; | &#39;PAID&#39; | &#39;ORGANIC&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    contentType?: 'ALL' | 'PAID' | 'ORGANIC'
    /**
     * Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
     * Defaults to: &#39;ALL&#39;
     * @type &#39;ALL&#39; | &#39;YOUR_PINS&#39; | &#39;OTHER_PINS&#39;
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    source?: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS'
    /**
     * Metric types to get video data for, default is all. 
     * Defaults to: undefined
     * @type Array&lt;&#39;IMPRESSION&#39; | &#39;SAVE&#39; | &#39;VIDEO_MRC_VIEW&#39; | &#39;VIDEO_AVG_WATCH_TIME&#39; | &#39;VIDEO_V50_WATCH_TIME&#39; | &#39;QUARTILE_95_PERCENT_VIEW&#39; | &#39;VIDEO_10S_VIEW&#39; | &#39;VIDEO_START&#39; | &#39;OUTBOUND_CLICK&#39;&gt;
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    metricTypes?: Array<'IMPRESSION' | 'SAVE' | 'VIDEO_MRC_VIEW' | 'VIDEO_AVG_WATCH_TIME' | 'VIDEO_V50_WATCH_TIME' | 'QUARTILE_95_PERCENT_VIEW' | 'VIDEO_10S_VIEW' | 'VIDEO_START' | 'OUTBOUND_CLICK'>
    /**
     * Number of pins to include, default is 10. Max is 50.
     * Minimum: 1
     * Maximum: 50
     * Defaults to: 10
     * @type number
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    numOfPins?: number
    /**
     * Get metrics for pins created in the last \&quot;n\&quot; days.
     * Defaults to: undefined
     * @type 30
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    createdInLastNDays?: 30
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiuserAccountAnalyticsTopVideoPins
     */
    adAccountId?: string
}

export interface UserAccountApiUserAccountFollowedInterestsRequest {
    /**
     * A valid username
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiuserAccountFollowedInterests
     */
    username: string
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiuserAccountFollowedInterests
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof UserAccountApiuserAccountFollowedInterests
     */
    pageSize?: number
}

export interface UserAccountApiUserAccountGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiuserAccountGet
     */
    adAccountId?: string
}

export interface UserAccountApiUserFollowingGetRequest {
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiuserFollowingGet
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
     * @type number
     * @memberof UserAccountApiuserFollowingGet
     */
    pageSize?: number
    /**
     * Thrift param specifying what type of followees will be kept. Default to include all followees.
     * Defaults to: undefined
     * @type UserFollowingFeedType
     * @memberof UserAccountApiuserFollowingGet
     */
    feedType?: UserFollowingFeedType
    /**
     * Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
     * Defaults to: false
     * @type boolean
     * @memberof UserAccountApiuserFollowingGet
     */
    explicitFollowing?: boolean
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiuserFollowingGet
     */
    adAccountId?: string
}

export interface UserAccountApiUserWebsitesGetRequest {
    /**
     * Cursor used to fetch the next page of items
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiuserWebsitesGet
     */
    bookmark?: string
    /**
     * Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * Minimum: 1
     * Maximum: 250
     * Defaults to: 25
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
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiverifyWebsiteUpdate
     */
    adAccountId?: string
}

export interface UserAccountApiWebsiteVerificationGetRequest {
    /**
     * Unique identifier of an ad account.
     * Defaults to: undefined
     * @type string
     * @memberof UserAccountApiwebsiteVerificationGet
     */
    adAccountId?: string
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
    public boardsUserFollowsListWithHttpInfo(param: UserAccountApiBoardsUserFollowsListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<BoardsUserFollowsList200Response>> {
        return this.api.boardsUserFollowsListWithHttpInfo(param.bookmark, param.pageSize, param.explicitFollowing, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of the boards a user follows. The request returns a board summary object array.
     * List following boards
     * @param param the request object
     */
    public boardsUserFollowsList(param: UserAccountApiBoardsUserFollowsListRequest = {}, options?: ConfigurationOptions): Promise<BoardsUserFollowsList200Response> {
        return this.api.boardsUserFollowsList(param.bookmark, param.pageSize, param.explicitFollowing, param.adAccountId,  options).toPromise();
    }

    /**
     * <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.
     * Follow user
     * @param param the request object
     */
    public followUserUpdateWithHttpInfo(param: UserAccountApiFollowUserUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<UserSummary>> {
        return this.api.followUserUpdateWithHttpInfo(param.username, param.followUserRequest,  options).toPromise();
    }

    /**
     * <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.
     * Follow user
     * @param param the request object
     */
    public followUserUpdate(param: UserAccountApiFollowUserUpdateRequest, options?: ConfigurationOptions): Promise<UserSummary> {
        return this.api.followUserUpdate(param.username, param.followUserRequest,  options).toPromise();
    }

    /**
     * Get a list of your followers.
     * List followers
     * @param param the request object
     */
    public followersListWithHttpInfo(param: UserAccountApiFollowersListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<FollowersList200Response>> {
        return this.api.followersListWithHttpInfo(param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get a list of your followers.
     * List followers
     * @param param the request object
     */
    public followersList(param: UserAccountApiFollowersListRequest = {}, options?: ConfigurationOptions): Promise<FollowersList200Response> {
        return this.api.followersList(param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get a list of your linked business accounts.
     * List linked businesses
     * @param param the request object
     */
    public linkedBusinessAccountsGetWithHttpInfo(param: UserAccountApiLinkedBusinessAccountsGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Array<LinkedBusiness>>> {
        return this.api.linkedBusinessAccountsGetWithHttpInfo( options).toPromise();
    }

    /**
     * Get a list of your linked business accounts.
     * List linked businesses
     * @param param the request object
     */
    public linkedBusinessAccountsGet(param: UserAccountApiLinkedBusinessAccountsGetRequest = {}, options?: ConfigurationOptions): Promise<Array<LinkedBusiness>> {
        return this.api.linkedBusinessAccountsGet( options).toPromise();
    }

    /**
     * Unverifu a website verified by the signed-in user.
     * Unverify website
     * @param param the request object
     */
    public unverifyWebsiteDeleteWithHttpInfo(param: UserAccountApiUnverifyWebsiteDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.unverifyWebsiteDeleteWithHttpInfo(param.website,  options).toPromise();
    }

    /**
     * Unverifu a website verified by the signed-in user.
     * Unverify website
     * @param param the request object
     */
    public unverifyWebsiteDelete(param: UserAccountApiUnverifyWebsiteDeleteRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.unverifyWebsiteDelete(param.website,  options).toPromise();
    }

    /**
     * Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account analytics
     * @param param the request object
     */
    public userAccountAnalyticsWithHttpInfo(param: UserAccountApiUserAccountAnalyticsRequest, options?: ConfigurationOptions): Promise<HttpInfo<{ [key: string]: AnalyticsMetricsResponse; }>> {
        return this.api.userAccountAnalyticsWithHttpInfo(param.startDate, param.endDate, param.fromClaimedContent, param.pinFormat, param.appTypes, param.contentType, param.source, param.metricTypes, param.splitField, param.adAccountId,  options).toPromise();
    }

    /**
     * Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account analytics
     * @param param the request object
     */
    public userAccountAnalytics(param: UserAccountApiUserAccountAnalyticsRequest, options?: ConfigurationOptions): Promise<{ [key: string]: AnalyticsMetricsResponse; }> {
        return this.api.userAccountAnalytics(param.startDate, param.endDate, param.fromClaimedContent, param.pinFormat, param.appTypes, param.contentType, param.source, param.metricTypes, param.splitField, param.adAccountId,  options).toPromise();
    }

    /**
     * Gets analytics data about a user\'s top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account top pins analytics
     * @param param the request object
     */
    public userAccountAnalyticsTopPinsWithHttpInfo(param: UserAccountApiUserAccountAnalyticsTopPinsRequest, options?: ConfigurationOptions): Promise<HttpInfo<TopPinsAnalyticsResponse>> {
        return this.api.userAccountAnalyticsTopPinsWithHttpInfo(param.startDate, param.endDate, param.sortBy, param.fromClaimedContent, param.pinFormat, param.appTypes, param.contentType, param.source, param.metricTypes, param.numOfPins, param.createdInLastNDays, param.adAccountId,  options).toPromise();
    }

    /**
     * Gets analytics data about a user\'s top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account top pins analytics
     * @param param the request object
     */
    public userAccountAnalyticsTopPins(param: UserAccountApiUserAccountAnalyticsTopPinsRequest, options?: ConfigurationOptions): Promise<TopPinsAnalyticsResponse> {
        return this.api.userAccountAnalyticsTopPins(param.startDate, param.endDate, param.sortBy, param.fromClaimedContent, param.pinFormat, param.appTypes, param.contentType, param.source, param.metricTypes, param.numOfPins, param.createdInLastNDays, param.adAccountId,  options).toPromise();
    }

    /**
     * Gets analytics data about a user\'s top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account top video pins analytics
     * @param param the request object
     */
    public userAccountAnalyticsTopVideoPinsWithHttpInfo(param: UserAccountApiUserAccountAnalyticsTopVideoPinsRequest, options?: ConfigurationOptions): Promise<HttpInfo<TopVideoPinsAnalyticsResponse>> {
        return this.api.userAccountAnalyticsTopVideoPinsWithHttpInfo(param.startDate, param.endDate, param.sortBy, param.fromClaimedContent, param.pinFormat, param.appTypes, param.contentType, param.source, param.metricTypes, param.numOfPins, param.createdInLastNDays, param.adAccountId,  options).toPromise();
    }

    /**
     * Gets analytics data about a user\'s top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * Get user account top video pins analytics
     * @param param the request object
     */
    public userAccountAnalyticsTopVideoPins(param: UserAccountApiUserAccountAnalyticsTopVideoPinsRequest, options?: ConfigurationOptions): Promise<TopVideoPinsAnalyticsResponse> {
        return this.api.userAccountAnalyticsTopVideoPins(param.startDate, param.endDate, param.sortBy, param.fromClaimedContent, param.pinFormat, param.appTypes, param.contentType, param.source, param.metricTypes, param.numOfPins, param.createdInLastNDays, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of a user\'s following interests in one place.
     * List following interests
     * @param param the request object
     */
    public userAccountFollowedInterestsWithHttpInfo(param: UserAccountApiUserAccountFollowedInterestsRequest, options?: ConfigurationOptions): Promise<HttpInfo<UserAccountFollowedInterests200Response>> {
        return this.api.userAccountFollowedInterestsWithHttpInfo(param.username, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get a list of a user\'s following interests in one place.
     * List following interests
     * @param param the request object
     */
    public userAccountFollowedInterests(param: UserAccountApiUserAccountFollowedInterestsRequest, options?: ConfigurationOptions): Promise<UserAccountFollowedInterests200Response> {
        return this.api.userAccountFollowedInterests(param.username, param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/getting-started/using-business-access/\'>Understanding Business Access</a> for more information.
     * Get user account
     * @param param the request object
     */
    public userAccountGetWithHttpInfo(param: UserAccountApiUserAccountGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Account>> {
        return this.api.userAccountGetWithHttpInfo(param.adAccountId,  options).toPromise();
    }

    /**
     * Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href=\'/docs/getting-started/using-business-access/\'>Understanding Business Access</a> for more information.
     * Get user account
     * @param param the request object
     */
    public userAccountGet(param: UserAccountApiUserAccountGetRequest = {}, options?: ConfigurationOptions): Promise<Account> {
        return this.api.userAccountGet(param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of who a certain user follows.
     * List following
     * @param param the request object
     */
    public userFollowingGetWithHttpInfo(param: UserAccountApiUserFollowingGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<UserFollowingGet200Response>> {
        return this.api.userFollowingGetWithHttpInfo(param.bookmark, param.pageSize, param.feedType, param.explicitFollowing, param.adAccountId,  options).toPromise();
    }

    /**
     * Get a list of who a certain user follows.
     * List following
     * @param param the request object
     */
    public userFollowingGet(param: UserAccountApiUserFollowingGetRequest = {}, options?: ConfigurationOptions): Promise<UserFollowingGet200Response> {
        return this.api.userFollowingGet(param.bookmark, param.pageSize, param.feedType, param.explicitFollowing, param.adAccountId,  options).toPromise();
    }

    /**
     * Get user websites, claimed or not
     * Get user websites
     * @param param the request object
     */
    public userWebsitesGetWithHttpInfo(param: UserAccountApiUserWebsitesGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<UserWebsitesGet200Response>> {
        return this.api.userWebsitesGetWithHttpInfo(param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Get user websites, claimed or not
     * Get user websites
     * @param param the request object
     */
    public userWebsitesGet(param: UserAccountApiUserWebsitesGetRequest = {}, options?: ConfigurationOptions): Promise<UserWebsitesGet200Response> {
        return this.api.userWebsitesGet(param.bookmark, param.pageSize,  options).toPromise();
    }

    /**
     * Verify a website as a signed-in user.
     * Verify website
     * @param param the request object
     */
    public verifyWebsiteUpdateWithHttpInfo(param: UserAccountApiVerifyWebsiteUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<UserWebsiteSummary>> {
        return this.api.verifyWebsiteUpdateWithHttpInfo(param.userWebsiteVerifyRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Verify a website as a signed-in user.
     * Verify website
     * @param param the request object
     */
    public verifyWebsiteUpdate(param: UserAccountApiVerifyWebsiteUpdateRequest, options?: ConfigurationOptions): Promise<UserWebsiteSummary> {
        return this.api.verifyWebsiteUpdate(param.userWebsiteVerifyRequest, param.adAccountId,  options).toPromise();
    }

    /**
     * Get verification code for user to install on the website to claim it.
     * Get user verification code for website claiming
     * @param param the request object
     */
    public websiteVerificationGetWithHttpInfo(param: UserAccountApiWebsiteVerificationGetRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<UserWebsiteVerificationCode>> {
        return this.api.websiteVerificationGetWithHttpInfo(param.adAccountId,  options).toPromise();
    }

    /**
     * Get verification code for user to install on the website to claim it.
     * Get user verification code for website claiming
     * @param param the request object
     */
    public websiteVerificationGet(param: UserAccountApiWebsiteVerificationGetRequest = {}, options?: ConfigurationOptions): Promise<UserWebsiteVerificationCode> {
        return this.api.websiteVerificationGet(param.adAccountId,  options).toPromise();
    }

}
