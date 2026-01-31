import localVarRequest from 'request';

export * from './account';
export * from './actionType';
export * from './adAccount';
export * from './adAccountAnalyticsResponseInner';
export * from './adAccountCreate';
export * from './adAccountCreateSubscriptionRequest';
export * from './adAccountCreateSubscriptionRequestPartnerMetadata';
export * from './adAccountCreateSubscriptionResponse';
export * from './adAccountGetSubscriptionResponse';
export * from './adAccountOwner';
export * from './adAccountsAudiencesSharedAccountsList200Response';
export * from './adAccountsCountryResponse';
export * from './adAccountsCountryResponseData';
export * from './adAccountsList200Response';
export * from './adAccountsSubscriptionsGetList200Response';
export * from './adArrayResponse';
export * from './adArrayResponseElement';
export * from './adCommon';
export * from './adCountry';
export * from './adCreateRequest';
export * from './adGroupArrayResponse';
export * from './adGroupArrayResponseElement';
export * from './adGroupAudienceSizingRequest';
export * from './adGroupAudienceSizingRequestKeywordsInner';
export * from './adGroupAudienceSizingResponse';
export * from './adGroupCommon';
export * from './adGroupCreateRequest';
export * from './adGroupIdFilter';
export * from './adGroupResponse';
export * from './adGroupSummaryStatus';
export * from './adGroupUpdateRequest';
export * from './adGroupsAnalyticsResponseInner';
export * from './adGroupsList200Response';
export * from './adPinAnalytics';
export * from './adPinId';
export * from './adPreviewCreateFromImage';
export * from './adPreviewCreateFromPin';
export * from './adPreviewRequest';
export * from './adPreviewShopping';
export * from './adPreviewURLResponse';
export * from './adResponse';
export * from './adUpdateRequest';
export * from './adsAnalyticsAdGroupTargetingType';
export * from './adsAnalyticsAdTargetingType';
export * from './adsAnalyticsCampaignTargetingType';
export * from './adsAnalyticsCreateAsyncRequest';
export * from './adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics';
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
export * from './advancedAuctionBidOptions';
export * from './advancedAuctionItem';
export * from './advancedAuctionItems';
export * from './advancedAuctionItemsGetRecord';
export * from './advancedAuctionItemsGetRequest';
export * from './advancedAuctionItemsSubmitDeleteRecord';
export * from './advancedAuctionItemsSubmitRecord';
export * from './advancedAuctionItemsSubmitRequest';
export * from './advancedAuctionItemsSubmitUpsertRecord';
export * from './advancedAuctionKey';
export * from './advancedAuctionOperation';
export * from './advancedAuctionOperationError';
export * from './advancedAuctionProcessedItems';
export * from './advertiserDefinedEvent';
export * from './advertiserDefinedEventsResponse';
export * from './ageTrendsBucket';
export * from './allOf';
export * from './amazonConnectRequest';
export * from './analyticsDailyMetrics';
export * from './analyticsMetricsResponse';
export * from './anyOf';
export * from './appTypeMultipliers';
export * from './assetGroupBinding';
export * from './assetGroupType';
export * from './assetIdPermissions';
export * from './audience';
export * from './audienceAccountType';
export * from './audienceCategory';
export * from './audienceCommon';
export * from './audienceCreateRequest';
export * from './audienceDefinition';
export * from './audienceDefinitionResponse';
export * from './audienceDefinitionScope';
export * from './audienceDefinitionType';
export * from './audienceDemographicValue';
export * from './audienceDemographics';
export * from './audienceInsightCategoryArrayResponse';
export * from './audienceInsightCategoryCommon';
export * from './audienceInsightType';
export * from './audienceInsightsResponse';
export * from './audienceRule';
export * from './audienceShareType';
export * from './audienceSubcategory';
export * from './audienceType';
export * from './audienceUpdateOperationType';
export * from './audienceUpdateRequest';
export * from './audiencesList200Response';
export * from './authRespondInvitesBody';
export * from './authRespondInvitesBodyInvitesInner';
export * from './authRespondInvitesBodyInvitesInnerAction';
export * from './availabilityFilter';
export * from './baseInviteDataResponse';
export * from './baseInviteDataResponseInviteData';
export * from './batchOperation';
export * from './batchOperationStatus';
export * from './bidFloor';
export * from './bidFloorRequest';
export * from './bidFloorSpec';
export * from './billingInvoiceDownloadResponse';
export * from './billingInvoiceResponse';
export * from './billingInvoicesGet200Response';
export * from './billingProfilesGet200Response';
export * from './billingProfilesResponse';
export * from './board';
export * from './boardBase';
export * from './boardCreate';
export * from './boardMedia';
export * from './boardOwner';
export * from './boardPrivacy';
export * from './boardPrivacyFilter';
export * from './boardSection';
export * from './boardSectionsList200Response';
export * from './boardUpdatePrivacy';
export * from './boardWithUpdatePrivacy';
export * from './boardWithUpdatePrivacyUpdate';
export * from './boardsList200Response';
export * from './boardsListPins200Response';
export * from './boardsUserFollowsList200Response';
export * from './bookClosedResponse';
export * from './brandAccountsCreate200Response';
export * from './brandAccountsCreateRequest';
export * from './brandAccountsUpdateRequest';
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
export * from './businessAccessError';
export * from './businessAccessRole';
export * from './businessAccessUserSummary';
export * from './businessAssetMembersGet200Response';
export * from './businessAssetPartnersGet200Response';
export * from './businessAssetsGet200Response';
export * from './businessMemberAssetsGet200Response';
export * from './businessMemberAssetsSummary';
export * from './businessMemberAssetsSummaryAdAccountsInner';
export * from './businessMemberAssetsSummaryProfilesInner';
export * from './businessMembersAssetAccessDeleteRequest';
export * from './businessMembersAssetAccessDeleteRequestAccessesInner';
export * from './businessPartnerAssetAccessGet200Response';
export * from './businessRole';
export * from './businessRoleCheckMode';
export * from './businessRoleForMembers';
export * from './businessSharedAudience';
export * from './businessSharedAudienceResponse';
export * from './campaignAudienceMultipliers';
export * from './campaignBidOptions';
export * from './campaignBidOptionsCreate';
export * from './campaignBidOptionsUpdate';
export * from './campaignCommon';
export * from './campaignCreateCommon';
export * from './campaignCreateRequest';
export * from './campaignCreateResponse';
export * from './campaignCreateResponseData';
export * from './campaignCreateResponseItem';
export * from './campaignId';
export * from './campaignIdFilter';
export * from './campaignObjectivesFilter';
export * from './campaignResponse';
export * from './campaignSummaryStatus';
export * from './campaignUpdateRequest';
export * from './campaignUpdateResponse';
export * from './campaignsAnalyticsResponseInner';
export * from './campaignsList200Response';
export * from './cancelInvitesBody';
export * from './carouselSlot';
export * from './catalog';
export * from './catalogsAvailableFilterValues';
export * from './catalogsCreateCreativeAssetsItem';
export * from './catalogsCreateHotelItem';
export * from './catalogsCreateReportResponse';
export * from './catalogsCreateRequest';
export * from './catalogsCreateRetailItem';
export * from './catalogsCreativeAssetsAttributes';
export * from './catalogsCreativeAssetsAvailableFilterValues';
export * from './catalogsCreativeAssetsBatchItem';
export * from './catalogsCreativeAssetsBatchRequest';
export * from './catalogsCreativeAssetsFeed';
export * from './catalogsCreativeAssetsFeedsCreateRequest';
export * from './catalogsCreativeAssetsFeedsUpdateRequest';
export * from './catalogsCreativeAssetsFilterValuesMap';
export * from './catalogsCreativeAssetsItemErrorResponse';
export * from './catalogsCreativeAssetsItemResponse';
export * from './catalogsCreativeAssetsItemsBatch';
export * from './catalogsCreativeAssetsItemsFilter';
export * from './catalogsCreativeAssetsItemsPostFilter';
export * from './catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest';
export * from './catalogsCreativeAssetsProduct';
export * from './catalogsCreativeAssetsProductGroup';
export * from './catalogsCreativeAssetsProductGroupCreateRequest';
export * from './catalogsCreativeAssetsProductGroupFilterKeys';
export * from './catalogsCreativeAssetsProductGroupFilters';
export * from './catalogsCreativeAssetsProductGroupFiltersAllOf';
export * from './catalogsCreativeAssetsProductGroupFiltersAnyOf';
export * from './catalogsCreativeAssetsProductGroupProductCounts';
export * from './catalogsCreativeAssetsProductGroupUpdateRequest';
export * from './catalogsCreativeAssetsProductMetadata';
export * from './catalogsDbItem';
export * from './catalogsDeleteCreativeAssetsItem';
export * from './catalogsDeleteHotelItem';
export * from './catalogsDeleteRetailItem';
export * from './catalogsFeed';
export * from './catalogsFeedCredentials';
export * from './catalogsFeedIngestion';
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
export * from './catalogsFeedVideoCounts';
export * from './catalogsFeedsCreateRequest';
export * from './catalogsFeedsCreateRequestDefaultLocale';
export * from './catalogsFeedsUpdateRequest';
export * from './catalogsFormat';
export * from './catalogsHotelAddress';
export * from './catalogsHotelAttributes';
export * from './catalogsHotelAttributesAllOfMainImage';
export * from './catalogsHotelAvailableFilterValues';
export * from './catalogsHotelBatchItem';
export * from './catalogsHotelBatchRequest';
export * from './catalogsHotelFeed';
export * from './catalogsHotelFeedsCreateRequest';
export * from './catalogsHotelFeedsUpdateRequest';
export * from './catalogsHotelFilterValuesMap';
export * from './catalogsHotelGuestRatings';
export * from './catalogsHotelItemErrorResponse';
export * from './catalogsHotelItemResponse';
export * from './catalogsHotelItemsBatch';
export * from './catalogsHotelItemsFilter';
export * from './catalogsHotelItemsPostFilter';
export * from './catalogsHotelListProductsByCatalogBasedFilterRequest';
export * from './catalogsHotelProduct';
export * from './catalogsHotelProductGroup';
export * from './catalogsHotelProductGroupCreateRequest';
export * from './catalogsHotelProductGroupFilterKeys';
export * from './catalogsHotelProductGroupFilters';
export * from './catalogsHotelProductGroupFiltersAllOf';
export * from './catalogsHotelProductGroupFiltersAnyOf';
export * from './catalogsHotelProductGroupProductCounts';
export * from './catalogsHotelProductGroupType';
export * from './catalogsHotelProductGroupUpdateRequest';
export * from './catalogsHotelProductMetadata';
export * from './catalogsHotelReportParameters';
export * from './catalogsHotelReportParametersReport';
export * from './catalogsHotelReportStatsParameters';
export * from './catalogsHotelReportStatsParametersReport';
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
export * from './catalogsItemsPostFilters';
export * from './catalogsItemsRequest';
export * from './catalogsItemsUpdateBatchRequest';
export * from './catalogsItemsUpsertBatchRequest';
export * from './catalogsList200Response';
export * from './catalogsListProductsByFeedBasedFilter';
export * from './catalogsListProductsByFilterRequest';
export * from './catalogsLocale';
export * from './catalogsProduct';
export * from './catalogsProductGroupCreateRequest';
export * from './catalogsProductGroupCurrencyCriteria';
export * from './catalogsProductGroupFilterKeys';
export * from './catalogsProductGroupFilterOperatorTypeCriteria';
export * from './catalogsProductGroupFilters';
export * from './catalogsProductGroupFiltersAllOf';
export * from './catalogsProductGroupFiltersAnyOf';
export * from './catalogsProductGroupFiltersRequest';
export * from './catalogsProductGroupMultipleCountriesCriteria';
export * from './catalogsProductGroupMultipleGenderCriteria';
export * from './catalogsProductGroupMultipleMediaTypesCriteria';
export * from './catalogsProductGroupMultipleStringCriteria';
export * from './catalogsProductGroupMultipleStringListCriteria';
export * from './catalogsProductGroupPinsList200Response';
export * from './catalogsProductGroupPricingCriteria';
export * from './catalogsProductGroupPricingCurrencyCriteria';
export * from './catalogsProductGroupProductCountsVertical';
export * from './catalogsProductGroupStatus';
export * from './catalogsProductGroupType';
export * from './catalogsProductGroupUint32Criteria';
export * from './catalogsProductGroupUpdateRequest';
export * from './catalogsProductGroupsList200Response';
export * from './catalogsProductGroupsUpdateRequest';
export * from './catalogsReport';
export * from './catalogsReportAllItemsFilter';
export * from './catalogsReportDistributionIssueFilter';
export * from './catalogsReportDistributionStats';
export * from './catalogsReportFeedIngestionFilter';
export * from './catalogsReportFeedIngestionStats';
export * from './catalogsReportParameters';
export * from './catalogsReportStats';
export * from './catalogsRetailAvailableFilterValues';
export * from './catalogsRetailBatchRequest';
export * from './catalogsRetailBatchRequestItemsInner';
export * from './catalogsRetailFeed';
export * from './catalogsRetailFeedsCreateRequest';
export * from './catalogsRetailFeedsUpdateRequest';
export * from './catalogsRetailFilterValuesMap';
export * from './catalogsRetailItemErrorResponse';
export * from './catalogsRetailItemResponse';
export * from './catalogsRetailItemsBatch';
export * from './catalogsRetailItemsFilter';
export * from './catalogsRetailItemsPostFilter';
export * from './catalogsRetailListProductsByCatalogBasedFilterRequest';
export * from './catalogsRetailProduct';
export * from './catalogsRetailProductGroup';
export * from './catalogsRetailProductGroupCreateRequest';
export * from './catalogsRetailProductGroupProductCounts';
export * from './catalogsRetailProductGroupUpdateRequest';
export * from './catalogsRetailProductMetadata';
export * from './catalogsRetailReportParameters';
export * from './catalogsRetailReportStatsParameters';
export * from './catalogsStatus';
export * from './catalogsType';
export * from './catalogsUpdatableCreativeAssetsAttributes';
export * from './catalogsUpdatableHotelAttributes';
export * from './catalogsUpdateCreativeAssetsItem';
export * from './catalogsUpdateHotelItem';
export * from './catalogsUpdateRetailItem';
export * from './catalogsUpsertCreativeAssetsItem';
export * from './catalogsUpsertHotelItem';
export * from './catalogsUpsertRetailItem';
export * from './catalogsVerticalBatchRequest';
export * from './catalogsVerticalFeedsCreateRequest';
export * from './catalogsVerticalFeedsUpdateRequest';
export * from './catalogsVerticalProductGroup';
export * from './catalogsVerticalProductGroupCreateRequest';
export * from './catalogsVerticalProductGroupUpdateRequest';
export * from './catalogsVerticalsListProductsByCatalogBasedFilterRequest';
export * from './conditionFilter';
export * from './contentType';
export * from './conversionAccessTokenResponse';
export * from './conversionApiResponse';
export * from './conversionApiResponseEventsInner';
export * from './conversionAttributionWindowDays';
export * from './conversionEventAppInfo';
export * from './conversionEventDeviceInfo';
export * from './conversionEventResponse';
export * from './conversionEvents';
export * from './conversionEventsDataInner';
export * from './conversionEventsDataInnerCustomData';
export * from './conversionEventsDataInnerCustomDataContentsInner';
export * from './conversionEventsUserData';
export * from './conversionEventsUserDataProperties';
export * from './conversionHealthSelectionItem';
export * from './conversionMSOTEvents';
export * from './conversionProductReportRequest';
export * from './conversionProductReportingColumn';
export * from './conversionReportAttributionType';
export * from './conversionReportTimeType';
export * from './conversionTag';
export * from './conversionTagCommon';
export * from './conversionTagConfigs';
export * from './conversionTagCreate';
export * from './conversionTagListResponse';
export * from './conversionTagResponse';
export * from './conversionTagType';
export * from './conversionTagsList200Response';
export * from './country';
export * from './countryFilter';
export * from './createAssetAccessRequestBody';
export * from './createAssetAccessRequestBodyAssetRequestsInner';
export * from './createAssetAccessRequestErrorMessageInner';
export * from './createAssetAccessRequestResponse';
export * from './createAssetGroupBody';
export * from './createAssetGroupResponse';
export * from './createAssetInvitesRequest';
export * from './createAssetInvitesRequestItem';
export * from './createInvitesResultsResponseArray';
export * from './createInvitesResultsResponseArrayItemsInner';
export * from './createInvitesResultsResponseArrayItemsInnerInvite';
export * from './createMMMReportRequest';
export * from './createMMMReportResponse';
export * from './createMMMReportResponseData';
export * from './createMembershipOrPartnershipInvitesBody';
export * from './creativeAssetsIdFilter';
export * from './creativeAssetsProcessingRecord';
export * from './creativeAssetsVisibilityType';
export * from './creativeType';
export * from './currency';
export * from './currencyFilter';
export * from './customLabel0Filter';
export * from './customLabel1Filter';
export * from './customLabel2Filter';
export * from './customLabel3Filter';
export * from './customLabel4Filter';
export * from './customNumber0Filter';
export * from './customNumber1Filter';
export * from './customNumber2Filter';
export * from './customNumber3Filter';
export * from './customNumber4Filter';
export * from './customerList';
export * from './customerListRequest';
export * from './customerListUpdateRequest';
export * from './customerListUpload';
export * from './customerListUploadCreateRequest';
export * from './customerListUploadCreateResponse';
export * from './customerListUploadResponse';
export * from './customerListsList200Response';
export * from './customizableCTAType';
export * from './dataOutputFormat';
export * from './dataStatus';
export * from './deleteAssetGroupBody';
export * from './deleteAssetGroupResponse';
export * from './deleteAssetGroupResponseExceptionsInner';
export * from './deleteInvitesResultsResponseArray';
export * from './deleteInvitesResultsResponseArrayItemsInner';
export * from './deleteInvitesResultsResponseArrayItemsInnerException';
export * from './deleteMemberAccessResult';
export * from './deleteMemberAccessResultsResponseArray';
export * from './deletePartnerAssetAccessBody';
export * from './deletePartnerAssetAccessBodyAccessesInner';
export * from './deletePartnerAssetsResult';
export * from './deletePartnerAssetsResultsResponseArray';
export * from './deletePartnersRequest';
export * from './deletePartnersResponse';
export * from './deletedMembersResponse';
export * from './deliveryMetricsResponse';
export * from './deliveryMetricsResponseItemsInner';
export * from './detailedError';
export * from './disclosureType';
export * from './enhancedMatchStatusType';
export * from './entityStatus';
export * from './errorDetail';
export * from './eventData';
export * from './eventQualityScore';
export * from './exception';
export * from './featuredTrend';
export * from './feedProcessingResultsList200Response';
export * from './feedsCreateRequest';
export * from './feedsList200Response';
export * from './feedsUpdateRequest';
export * from './followUserRequest';
export * from './followersList200Response';
export * from './gender';
export * from './genderBucket';
export * from './genderDemographics';
export * from './genderFilter';
export * from './getAudiencesOrderBy';
export * from './getBusinessAssetTypeResponse';
export * from './getBusinessAssetsResponse';
export * from './getBusinessAssetsResponseCatalogInfo';
export * from './getBusinessEmployers200Response';
export * from './getBusinessMembers200Response';
export * from './getBusinessPartners200Response';
export * from './getInvites200Response';
export * from './getMMMReportResponse';
export * from './getMMMReportResponseData';
export * from './getPartnerAssetsResponse';
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
export * from './imageBase64';
export * from './imageDetails';
export * from './imageMetadata';
export * from './imageSize';
export * from './ingestionSourceOptions';
export * from './innerProductCategoriesMetricsHighlights';
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
export * from './integrationsLogsPost400Response';
export * from './interest';
export * from './interestsEnum';
export * from './inviteAssetsSummary';
export * from './inviteAssetsSummaryAdAccountsInner';
export * from './inviteAssetsSummaryProfilesInner';
export * from './inviteBusinessRoleBinding';
export * from './inviteExceptionResponse';
export * from './inviteResponse';
export * from './inviteStatus';
export * from './inviteType';
export * from './itemAttributes';
export * from './itemAttributesRequest';
export * from './itemAttributesRequestAllOfImageLink';
export * from './itemBatchRecord';
export * from './itemCreateBatchRecord';
export * from './itemDeleteBatchRecord';
export * from './itemDeleteDiscontinuedBatchRecord';
export * from './itemGroupIdFilter';
export * from './itemIdFilter';
export * from './itemProcessingRecord';
export * from './itemProcessingStatus';
export * from './itemResponse';
export * from './itemResponseOneOf';
export * from './itemResponseOneOf1';
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
export * from './label';
export * from './labelBulkUpdateRequest';
export * from './labelCreateRequest';
export * from './labelCreateRequestLabelsInner';
export * from './labelError';
export * from './labelParentType';
export * from './labelStatus';
export * from './labelType';
export * from './labelUpdateRequest';
export * from './labelUpdateRequestLabelsInner';
export * from './labelsList200Response';
export * from './labelsResponse';
export * from './language';
export * from './leadFormArrayResponse';
export * from './leadFormArrayResponseItemsInner';
export * from './leadFormCommon';
export * from './leadFormCommonPolicyLinksInner';
export * from './leadFormCreateRequest';
export * from './leadFormQuestion';
export * from './leadFormQuestionFieldType';
export * from './leadFormQuestionType';
export * from './leadFormResponse';
export * from './leadFormStatus';
export * from './leadFormTestRequest';
export * from './leadFormTestResponse';
export * from './leadFormUpdateRequest';
export * from './leadFormsList200Response';
export * from './leadSubscription';
export * from './leadSubscriptionPostParamsCreate';
export * from './leadSubscriptionPostParamsCreateAllOfPartnerMetadata';
export * from './leadsExportCreateRequest';
export * from './leadsExportCreateResponse';
export * from './leadsExportResponseData';
export * from './leadsExportStatus';
export * from './lineItem';
export * from './linkedBusiness';
export * from './localStoreUpdate';
export * from './lookbackPeriodOptions';
export * from './mMMReportingColumn';
export * from './mMMReportingTargetingType';
export * from './matchType';
export * from './matchTypeResponse';
export * from './maxPriceFilter';
export * from './media';
export * from './mediaList200Response';
export * from './mediaType';
export * from './mediaTypeFilter';
export * from './mediaUpload';
export * from './mediaUploadCreate';
export * from './mediaUploadParameters';
export * from './mediaUploadStatus';
export * from './mediaUploadType';
export * from './memberBusinessRole';
export * from './membersToDeleteBody';
export * from './membersToDeleteBodyMembersInner';
export * from './metricsReportingLevel';
export * from './metricsResponse';
export * from './minPriceFilter';
export * from './modelError';
export * from './multipleProductGroupsInner';
export * from './nonDraftEntityStatus';
export * from './nonNullableCatalogsCurrency';
export * from './nonNullableProductAvailabilityType';
export * from './notificationPostRequest';
export * from './notificationResponse';
export * from './nullableCatalogsItemFieldType';
export * from './nullableCurrency';
export * from './oauthAccessTokenRequestClientCredentials';
export * from './oauthAccessTokenRequestCode';
export * from './oauthAccessTokenRequestRefresh';
export * from './oauthAccessTokenResponse';
export * from './oauthAccessTokenResponseClientCredentials';
export * from './oauthAccessTokenResponseCode';
export * from './oauthAccessTokenResponseIntegrationRefresh';
export * from './oauthAccessTokenResponseRefresh';
export * from './objectiveType';
export * from './operationType';
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
export * from './overallStatusOptions';
export * from './pacingDeliveryType';
export * from './pageVisitConversionTagsGet200Response';
export * from './paginated';
export * from './partnerType';
export * from './permissions';
export * from './permissionsWithOwner';
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
export * from './pinMediaSourceImagesBase64Item';
export * from './pinMediaSourceImagesURL';
export * from './pinMediaSourceImagesURLItem';
export * from './pinMediaSourcePinURL';
export * from './pinMediaSourceVideoID';
export * from './pinMediaWithImage';
export * from './pinMediaWithImageAndVideo';
export * from './pinMediaWithImages';
export * from './pinMediaWithVideo';
export * from './pinMediaWithVideos';
export * from './pinPromotionSummaryStatus';
export * from './pinUpdate';
export * from './pinsList200Response';
export * from './pinsSaveRequest';
export * from './pinterestLibError';
export * from './pinterestLibPaginationOrder';
export * from './pinterestLibStatus204';
export * from './placementGroupType';
export * from './placementMultipliers';
export * from './predictedTimeSeries';
export * from './priceFilter';
export * from './productAvailabilityType';
export * from './productCategoriesDemographic';
export * from './productCategoriesEngagementType';
export * from './productCategoriesMetricsHighlights';
export * from './productCategoryDetailLookbackWindow';
export * from './productCategoryDetails';
export * from './productCategoryEnum';
export * from './productCategoryRegion';
export * from './productGroupAnalyticsResponseInner';
export * from './productGroupPromotion';
export * from './productGroupPromotionCreateRequest';
export * from './productGroupPromotionResponse';
export * from './productGroupPromotionResponseItem';
export * from './productGroupPromotionUpdateRequest';
export * from './productGroupPromotionsList200Response';
export * from './productGroupReferenceFilter';
export * from './productGroupSummaryStatus';
export * from './productType0Filter';
export * from './productType1Filter';
export * from './productType2Filter';
export * from './productType3Filter';
export * from './productType4Filter';
export * from './promotionArrayElement';
export * from './promotionCommon';
export * from './promotionCreateRequest';
export * from './promotionResponse';
export * from './promotionTemplateValue';
export * from './promotionType';
export * from './promotionUpdateRequest';
export * from './promotionsList200Response';
export * from './promotionsResponse';
export * from './qualityComponentDetails';
export * from './qualityComponentIssue';
export * from './qualityComponents';
export * from './quizPinData';
export * from './quizPinOption';
export * from './quizPinQuestion';
export * from './quizPinResult';
export * from './recordCounts';
export * from './relatedTerms';
export * from './relatedTermsRelatedTermsListInner';
export * from './reportingColumnAsync';
export * from './reportingTimeZone';
export * from './reportsStats200Response';
export * from './reportsStatsParametersParameter';
export * from './respondToInvitesResponseArray';
export * from './respondToInvitesResponseArrayItemsInner';
export * from './role';
export * from './s3FilePart';
export * from './s3MultipartUploadData';
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
export * from './searchUserPinsList200Response';
export * from './sharedAudience';
export * from './sharedAudienceAccount';
export * from './sharedAudienceCommon';
export * from './sharedAudienceResponse';
export * from './sharedAudienceResponseCommon';
export * from './singleInterestTargetingOptionResponse';
export * from './sourcePlatformOptions';
export * from './ssioInsertionOrdersStatusGetByAdAccount200Response';
export * from './ssioOrderLinesGetByAdAccount200Response';
export * from './summaryPin';
export * from './systemUserUpdateRequest';
export * from './targetingAdvertiserCountry';
export * from './targetingSpec';
export * from './targetingSpecAgeBucket';
export * from './targetingSpecAppType';
export * from './targetingSpecGender';
export * from './targetingSpecOperationAgeBucket';
export * from './targetingSpecOperationAppType';
export * from './targetingSpecOperationGender';
export * from './targetingSpecOperationList';
export * from './targetingSpecOperationMinMaxAge';
export * from './targetingSpecOperationShoppingRetargeting';
export * from './targetingSpecOperationString';
export * from './targetingSpecShoppingRetargeting';
export * from './targetingTemplateAudienceSizing';
export * from './targetingTemplateAudienceSizingReachEstimate';
export * from './targetingTemplateCommon';
export * from './targetingTemplateCreate';
export * from './targetingTemplateGetResponseData';
export * from './targetingTemplateKeyword';
export * from './targetingTemplateList200Response';
export * from './targetingTemplateResponseData';
export * from './targetingTemplateUpdateRequest';
export * from './targetingTypeFilter';
export * from './templateBasedReport';
export * from './templateResponse';
export * from './templateResponseDateRange';
export * from './templateResponseDateRangeAbsoluteDateRange';
export * from './templateResponseDateRangeDynamicDateRange';
export * from './templateResponseDateRangeRelativeDateRange';
export * from './templatesList200Response';
export * from './termsOfService';
export * from './timeSeries';
export * from './titleKeywordsFilter';
export * from './topPinsAnalyticsResponse';
export * from './topPinsAnalyticsResponseDateAvailability';
export * from './topPinsAnalyticsResponsePinsInner';
export * from './topVideoPinsAnalyticsResponse';
export * from './topVideoPinsAnalyticsResponsePinsInner';
export * from './trackingUrls';
export * from './trendType';
export * from './trendingKeyword';
export * from './trendingKeywordDemographics';
export * from './trendingKeywordDemographicsAgeDistribution';
export * from './trendingKeywordDemographicsGenderDistribution';
export * from './trendingKeywordsResponse';
export * from './trendingPin';
export * from './trendingProductCategory';
export * from './trendingTopic';
export * from './trendsSupportedRegion';
export * from './updatableItemAttributes';
export * from './updatableItemAttributesGtin';
export * from './updateAssetGroupBody';
export * from './updateAssetGroupBodyAssetGroupsToUpdateInner';
export * from './updateAssetGroupResponse';
export * from './updateAssetGroupResponseExceptionsInner';
export * from './updateInvitesResultsResponseArray';
export * from './updateInvitesResultsResponseArrayItemsInner';
export * from './updateMaskBidOptionField';
export * from './updateMaskFieldType';
export * from './updateMemberAssetAccessBody';
export * from './updateMemberAssetAccessBodyAccessesInner';
export * from './updateMemberAssetsResultsResponseArray';
export * from './updateMemberAssetsResultsResponseArrayItemsInner';
export * from './updateMemberBusinessRoleBody';
export * from './updateMemberResult';
export * from './updateMemberResultsResponseArray';
export * from './updatePartnerAssetAccessBody';
export * from './updatePartnerAssetAccessBodyAccessesInner';
export * from './updatePartnerAssetsResult';
export * from './updatePartnerAssetsResultsResponseArray';
export * from './updatePartnerResultsResponseArray';
export * from './updatePartnerResultsResponseArrayItemsInner';
export * from './userAccountFollowedInterests200Response';
export * from './userBusinessRoleBinding';
export * from './userFollowingFeedType';
export * from './userFollowingGet200Response';
export * from './userListOperationType';
export * from './userListType';
export * from './userSingleAssetBinding';
export * from './userSummary';
export * from './userWebsiteSummary';
export * from './userWebsiteVerificationCode';
export * from './userWebsiteVerifyRequest';
export * from './userWebsitesGet200Response';
export * from './usersForIndividualAssetResponse';
export * from './verticalProductCategory';
export * from './videoMetadataWithItemType';

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
import { AdAccountCreate } from './adAccountCreate';
import { AdAccountCreateSubscriptionRequest } from './adAccountCreateSubscriptionRequest';
import { AdAccountCreateSubscriptionRequestPartnerMetadata } from './adAccountCreateSubscriptionRequestPartnerMetadata';
import { AdAccountCreateSubscriptionResponse } from './adAccountCreateSubscriptionResponse';
import { AdAccountGetSubscriptionResponse } from './adAccountGetSubscriptionResponse';
import { AdAccountOwner } from './adAccountOwner';
import { AdAccountsAudiencesSharedAccountsList200Response } from './adAccountsAudiencesSharedAccountsList200Response';
import { AdAccountsCountryResponse } from './adAccountsCountryResponse';
import { AdAccountsCountryResponseData } from './adAccountsCountryResponseData';
import { AdAccountsList200Response } from './adAccountsList200Response';
import { AdAccountsSubscriptionsGetList200Response } from './adAccountsSubscriptionsGetList200Response';
import { AdArrayResponse } from './adArrayResponse';
import { AdArrayResponseElement } from './adArrayResponseElement';
import { AdCommon } from './adCommon';
import { AdCountry } from './adCountry';
import { AdCreateRequest } from './adCreateRequest';
import { AdGroupArrayResponse } from './adGroupArrayResponse';
import { AdGroupArrayResponseElement } from './adGroupArrayResponseElement';
import { AdGroupAudienceSizingRequest } from './adGroupAudienceSizingRequest';
import { AdGroupAudienceSizingRequestKeywordsInner } from './adGroupAudienceSizingRequestKeywordsInner';
import { AdGroupAudienceSizingResponse } from './adGroupAudienceSizingResponse';
import { AdGroupCommon } from './adGroupCommon';
import { AdGroupCreateRequest } from './adGroupCreateRequest';
import { AdGroupIdFilter } from './adGroupIdFilter';
import { AdGroupResponse } from './adGroupResponse';
import { AdGroupSummaryStatus } from './adGroupSummaryStatus';
import { AdGroupUpdateRequest } from './adGroupUpdateRequest';
import { AdGroupsAnalyticsResponseInner } from './adGroupsAnalyticsResponseInner';
import { AdGroupsList200Response } from './adGroupsList200Response';
import { AdPinAnalytics } from './adPinAnalytics';
import { AdPinId } from './adPinId';
import { AdPreviewCreateFromImage } from './adPreviewCreateFromImage';
import { AdPreviewCreateFromPin } from './adPreviewCreateFromPin';
import { AdPreviewRequest } from './adPreviewRequest';
import { AdPreviewShopping } from './adPreviewShopping';
import { AdPreviewURLResponse } from './adPreviewURLResponse';
import { AdResponse } from './adResponse';
import { AdUpdateRequest } from './adUpdateRequest';
import { AdsAnalyticsAdGroupTargetingType } from './adsAnalyticsAdGroupTargetingType';
import { AdsAnalyticsAdTargetingType } from './adsAnalyticsAdTargetingType';
import { AdsAnalyticsCampaignTargetingType } from './adsAnalyticsCampaignTargetingType';
import { AdsAnalyticsCreateAsyncRequest } from './adsAnalyticsCreateAsyncRequest';
import { AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics } from './adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics';
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
import { AdvancedAuctionBidOptions } from './advancedAuctionBidOptions';
import { AdvancedAuctionItem } from './advancedAuctionItem';
import { AdvancedAuctionItems } from './advancedAuctionItems';
import { AdvancedAuctionItemsGetRecord } from './advancedAuctionItemsGetRecord';
import { AdvancedAuctionItemsGetRequest } from './advancedAuctionItemsGetRequest';
import { AdvancedAuctionItemsSubmitDeleteRecord } from './advancedAuctionItemsSubmitDeleteRecord';
import { AdvancedAuctionItemsSubmitRecord } from './advancedAuctionItemsSubmitRecord';
import { AdvancedAuctionItemsSubmitRequest } from './advancedAuctionItemsSubmitRequest';
import { AdvancedAuctionItemsSubmitUpsertRecord } from './advancedAuctionItemsSubmitUpsertRecord';
import { AdvancedAuctionKey } from './advancedAuctionKey';
import { AdvancedAuctionOperation } from './advancedAuctionOperation';
import { AdvancedAuctionOperationError } from './advancedAuctionOperationError';
import { AdvancedAuctionProcessedItems } from './advancedAuctionProcessedItems';
import { AdvertiserDefinedEvent } from './advertiserDefinedEvent';
import { AdvertiserDefinedEventsResponse } from './advertiserDefinedEventsResponse';
import { AgeTrendsBucket } from './ageTrendsBucket';
import { AllOf } from './allOf';
import { AmazonConnectRequest } from './amazonConnectRequest';
import { AnalyticsDailyMetrics } from './analyticsDailyMetrics';
import { AnalyticsMetricsResponse } from './analyticsMetricsResponse';
import { AnyOf } from './anyOf';
import { AppTypeMultipliers } from './appTypeMultipliers';
import { AssetGroupBinding } from './assetGroupBinding';
import { AssetGroupType } from './assetGroupType';
import { AssetIdPermissions } from './assetIdPermissions';
import { Audience } from './audience';
import { AudienceAccountType } from './audienceAccountType';
import { AudienceCategory } from './audienceCategory';
import { AudienceCommon } from './audienceCommon';
import { AudienceCreateRequest } from './audienceCreateRequest';
import { AudienceDefinition } from './audienceDefinition';
import { AudienceDefinitionResponse } from './audienceDefinitionResponse';
import { AudienceDefinitionScope } from './audienceDefinitionScope';
import { AudienceDefinitionType } from './audienceDefinitionType';
import { AudienceDemographicValue } from './audienceDemographicValue';
import { AudienceDemographics } from './audienceDemographics';
import { AudienceInsightCategoryArrayResponse } from './audienceInsightCategoryArrayResponse';
import { AudienceInsightCategoryCommon } from './audienceInsightCategoryCommon';
import { AudienceInsightType } from './audienceInsightType';
import { AudienceInsightsResponse } from './audienceInsightsResponse';
import { AudienceRule } from './audienceRule';
import { AudienceShareType } from './audienceShareType';
import { AudienceSubcategory } from './audienceSubcategory';
import { AudienceType } from './audienceType';
import { AudienceUpdateOperationType } from './audienceUpdateOperationType';
import { AudienceUpdateRequest } from './audienceUpdateRequest';
import { AudiencesList200Response } from './audiencesList200Response';
import { AuthRespondInvitesBody } from './authRespondInvitesBody';
import { AuthRespondInvitesBodyInvitesInner } from './authRespondInvitesBodyInvitesInner';
import { AuthRespondInvitesBodyInvitesInnerAction } from './authRespondInvitesBodyInvitesInnerAction';
import { AvailabilityFilter } from './availabilityFilter';
import { BaseInviteDataResponse } from './baseInviteDataResponse';
import { BaseInviteDataResponseInviteData } from './baseInviteDataResponseInviteData';
import { BatchOperation } from './batchOperation';
import { BatchOperationStatus } from './batchOperationStatus';
import { BidFloor } from './bidFloor';
import { BidFloorRequest } from './bidFloorRequest';
import { BidFloorSpec } from './bidFloorSpec';
import { BillingInvoiceDownloadResponse } from './billingInvoiceDownloadResponse';
import { BillingInvoiceResponse } from './billingInvoiceResponse';
import { BillingInvoicesGet200Response } from './billingInvoicesGet200Response';
import { BillingProfilesGet200Response } from './billingProfilesGet200Response';
import { BillingProfilesResponse } from './billingProfilesResponse';
import { Board } from './board';
import { BoardBase } from './boardBase';
import { BoardCreate } from './boardCreate';
import { BoardMedia } from './boardMedia';
import { BoardOwner } from './boardOwner';
import { BoardPrivacy } from './boardPrivacy';
import { BoardPrivacyFilter } from './boardPrivacyFilter';
import { BoardSection } from './boardSection';
import { BoardSectionsList200Response } from './boardSectionsList200Response';
import { BoardUpdatePrivacy } from './boardUpdatePrivacy';
import { BoardWithUpdatePrivacy } from './boardWithUpdatePrivacy';
import { BoardWithUpdatePrivacyUpdate } from './boardWithUpdatePrivacyUpdate';
import { BoardsList200Response } from './boardsList200Response';
import { BoardsListPins200Response } from './boardsListPins200Response';
import { BoardsUserFollowsList200Response } from './boardsUserFollowsList200Response';
import { BookClosedResponse } from './bookClosedResponse';
import { BrandAccountsCreate200Response } from './brandAccountsCreate200Response';
import { BrandAccountsCreateRequest } from './brandAccountsCreateRequest';
import { BrandAccountsUpdateRequest } from './brandAccountsUpdateRequest';
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
import { BusinessAccessError } from './businessAccessError';
import { BusinessAccessRole } from './businessAccessRole';
import { BusinessAccessUserSummary } from './businessAccessUserSummary';
import { BusinessAssetMembersGet200Response } from './businessAssetMembersGet200Response';
import { BusinessAssetPartnersGet200Response } from './businessAssetPartnersGet200Response';
import { BusinessAssetsGet200Response } from './businessAssetsGet200Response';
import { BusinessMemberAssetsGet200Response } from './businessMemberAssetsGet200Response';
import { BusinessMemberAssetsSummary } from './businessMemberAssetsSummary';
import { BusinessMemberAssetsSummaryAdAccountsInner } from './businessMemberAssetsSummaryAdAccountsInner';
import { BusinessMemberAssetsSummaryProfilesInner } from './businessMemberAssetsSummaryProfilesInner';
import { BusinessMembersAssetAccessDeleteRequest } from './businessMembersAssetAccessDeleteRequest';
import { BusinessMembersAssetAccessDeleteRequestAccessesInner } from './businessMembersAssetAccessDeleteRequestAccessesInner';
import { BusinessPartnerAssetAccessGet200Response } from './businessPartnerAssetAccessGet200Response';
import { BusinessRole } from './businessRole';
import { BusinessRoleCheckMode } from './businessRoleCheckMode';
import { BusinessRoleForMembers } from './businessRoleForMembers';
import { BusinessSharedAudience } from './businessSharedAudience';
import { BusinessSharedAudienceResponse } from './businessSharedAudienceResponse';
import { CampaignAudienceMultipliers } from './campaignAudienceMultipliers';
import { CampaignBidOptions } from './campaignBidOptions';
import { CampaignBidOptionsCreate } from './campaignBidOptionsCreate';
import { CampaignBidOptionsUpdate } from './campaignBidOptionsUpdate';
import { CampaignCommon } from './campaignCommon';
import { CampaignCreateCommon } from './campaignCreateCommon';
import { CampaignCreateRequest } from './campaignCreateRequest';
import { CampaignCreateResponse } from './campaignCreateResponse';
import { CampaignCreateResponseData } from './campaignCreateResponseData';
import { CampaignCreateResponseItem } from './campaignCreateResponseItem';
import { CampaignId } from './campaignId';
import { CampaignIdFilter } from './campaignIdFilter';
import { CampaignObjectivesFilter } from './campaignObjectivesFilter';
import { CampaignResponse } from './campaignResponse';
import { CampaignSummaryStatus } from './campaignSummaryStatus';
import { CampaignUpdateRequest } from './campaignUpdateRequest';
import { CampaignUpdateResponse } from './campaignUpdateResponse';
import { CampaignsAnalyticsResponseInner } from './campaignsAnalyticsResponseInner';
import { CampaignsList200Response } from './campaignsList200Response';
import { CancelInvitesBody } from './cancelInvitesBody';
import { CarouselSlot } from './carouselSlot';
import { Catalog } from './catalog';
import { CatalogsAvailableFilterValues } from './catalogsAvailableFilterValues';
import { CatalogsCreateCreativeAssetsItem } from './catalogsCreateCreativeAssetsItem';
import { CatalogsCreateHotelItem } from './catalogsCreateHotelItem';
import { CatalogsCreateReportResponse } from './catalogsCreateReportResponse';
import { CatalogsCreateRequest } from './catalogsCreateRequest';
import { CatalogsCreateRetailItem } from './catalogsCreateRetailItem';
import { CatalogsCreativeAssetsAttributes } from './catalogsCreativeAssetsAttributes';
import { CatalogsCreativeAssetsAvailableFilterValues } from './catalogsCreativeAssetsAvailableFilterValues';
import { CatalogsCreativeAssetsBatchItem } from './catalogsCreativeAssetsBatchItem';
import { CatalogsCreativeAssetsBatchRequest } from './catalogsCreativeAssetsBatchRequest';
import { CatalogsCreativeAssetsFeed } from './catalogsCreativeAssetsFeed';
import { CatalogsCreativeAssetsFeedsCreateRequest } from './catalogsCreativeAssetsFeedsCreateRequest';
import { CatalogsCreativeAssetsFeedsUpdateRequest } from './catalogsCreativeAssetsFeedsUpdateRequest';
import { CatalogsCreativeAssetsFilterValuesMap } from './catalogsCreativeAssetsFilterValuesMap';
import { CatalogsCreativeAssetsItemErrorResponse } from './catalogsCreativeAssetsItemErrorResponse';
import { CatalogsCreativeAssetsItemResponse } from './catalogsCreativeAssetsItemResponse';
import { CatalogsCreativeAssetsItemsBatch } from './catalogsCreativeAssetsItemsBatch';
import { CatalogsCreativeAssetsItemsFilter } from './catalogsCreativeAssetsItemsFilter';
import { CatalogsCreativeAssetsItemsPostFilter } from './catalogsCreativeAssetsItemsPostFilter';
import { CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest } from './catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest';
import { CatalogsCreativeAssetsProduct } from './catalogsCreativeAssetsProduct';
import { CatalogsCreativeAssetsProductGroup } from './catalogsCreativeAssetsProductGroup';
import { CatalogsCreativeAssetsProductGroupCreateRequest } from './catalogsCreativeAssetsProductGroupCreateRequest';
import { CatalogsCreativeAssetsProductGroupFilterKeys } from './catalogsCreativeAssetsProductGroupFilterKeys';
import { CatalogsCreativeAssetsProductGroupFilters } from './catalogsCreativeAssetsProductGroupFilters';
import { CatalogsCreativeAssetsProductGroupFiltersAllOf } from './catalogsCreativeAssetsProductGroupFiltersAllOf';
import { CatalogsCreativeAssetsProductGroupFiltersAnyOf } from './catalogsCreativeAssetsProductGroupFiltersAnyOf';
import { CatalogsCreativeAssetsProductGroupProductCounts } from './catalogsCreativeAssetsProductGroupProductCounts';
import { CatalogsCreativeAssetsProductGroupUpdateRequest } from './catalogsCreativeAssetsProductGroupUpdateRequest';
import { CatalogsCreativeAssetsProductMetadata } from './catalogsCreativeAssetsProductMetadata';
import { CatalogsDbItem } from './catalogsDbItem';
import { CatalogsDeleteCreativeAssetsItem } from './catalogsDeleteCreativeAssetsItem';
import { CatalogsDeleteHotelItem } from './catalogsDeleteHotelItem';
import { CatalogsDeleteRetailItem } from './catalogsDeleteRetailItem';
import { CatalogsFeed } from './catalogsFeed';
import { CatalogsFeedCredentials } from './catalogsFeedCredentials';
import { CatalogsFeedIngestion } from './catalogsFeedIngestion';
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
import { CatalogsFeedVideoCounts } from './catalogsFeedVideoCounts';
import { CatalogsFeedsCreateRequest } from './catalogsFeedsCreateRequest';
import { CatalogsFeedsCreateRequestDefaultLocale } from './catalogsFeedsCreateRequestDefaultLocale';
import { CatalogsFeedsUpdateRequest } from './catalogsFeedsUpdateRequest';
import { CatalogsFormat } from './catalogsFormat';
import { CatalogsHotelAddress } from './catalogsHotelAddress';
import { CatalogsHotelAttributes } from './catalogsHotelAttributes';
import { CatalogsHotelAttributesAllOfMainImage } from './catalogsHotelAttributesAllOfMainImage';
import { CatalogsHotelAvailableFilterValues } from './catalogsHotelAvailableFilterValues';
import { CatalogsHotelBatchItem } from './catalogsHotelBatchItem';
import { CatalogsHotelBatchRequest } from './catalogsHotelBatchRequest';
import { CatalogsHotelFeed } from './catalogsHotelFeed';
import { CatalogsHotelFeedsCreateRequest } from './catalogsHotelFeedsCreateRequest';
import { CatalogsHotelFeedsUpdateRequest } from './catalogsHotelFeedsUpdateRequest';
import { CatalogsHotelFilterValuesMap } from './catalogsHotelFilterValuesMap';
import { CatalogsHotelGuestRatings } from './catalogsHotelGuestRatings';
import { CatalogsHotelItemErrorResponse } from './catalogsHotelItemErrorResponse';
import { CatalogsHotelItemResponse } from './catalogsHotelItemResponse';
import { CatalogsHotelItemsBatch } from './catalogsHotelItemsBatch';
import { CatalogsHotelItemsFilter } from './catalogsHotelItemsFilter';
import { CatalogsHotelItemsPostFilter } from './catalogsHotelItemsPostFilter';
import { CatalogsHotelListProductsByCatalogBasedFilterRequest } from './catalogsHotelListProductsByCatalogBasedFilterRequest';
import { CatalogsHotelProduct } from './catalogsHotelProduct';
import { CatalogsHotelProductGroup } from './catalogsHotelProductGroup';
import { CatalogsHotelProductGroupCreateRequest } from './catalogsHotelProductGroupCreateRequest';
import { CatalogsHotelProductGroupFilterKeys } from './catalogsHotelProductGroupFilterKeys';
import { CatalogsHotelProductGroupFilters } from './catalogsHotelProductGroupFilters';
import { CatalogsHotelProductGroupFiltersAllOf } from './catalogsHotelProductGroupFiltersAllOf';
import { CatalogsHotelProductGroupFiltersAnyOf } from './catalogsHotelProductGroupFiltersAnyOf';
import { CatalogsHotelProductGroupProductCounts } from './catalogsHotelProductGroupProductCounts';
import { CatalogsHotelProductGroupType } from './catalogsHotelProductGroupType';
import { CatalogsHotelProductGroupUpdateRequest } from './catalogsHotelProductGroupUpdateRequest';
import { CatalogsHotelProductMetadata } from './catalogsHotelProductMetadata';
import { CatalogsHotelReportParameters } from './catalogsHotelReportParameters';
import { CatalogsHotelReportParametersReport } from './catalogsHotelReportParametersReport';
import { CatalogsHotelReportStatsParameters } from './catalogsHotelReportStatsParameters';
import { CatalogsHotelReportStatsParametersReport } from './catalogsHotelReportStatsParametersReport';
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
import { CatalogsItemsPostFilters } from './catalogsItemsPostFilters';
import { CatalogsItemsRequest } from './catalogsItemsRequest';
import { CatalogsItemsUpdateBatchRequest } from './catalogsItemsUpdateBatchRequest';
import { CatalogsItemsUpsertBatchRequest } from './catalogsItemsUpsertBatchRequest';
import { CatalogsList200Response } from './catalogsList200Response';
import { CatalogsListProductsByFeedBasedFilter } from './catalogsListProductsByFeedBasedFilter';
import { CatalogsListProductsByFilterRequest } from './catalogsListProductsByFilterRequest';
import { CatalogsLocale } from './catalogsLocale';
import { CatalogsProduct } from './catalogsProduct';
import { CatalogsProductGroupCreateRequest } from './catalogsProductGroupCreateRequest';
import { CatalogsProductGroupCurrencyCriteria } from './catalogsProductGroupCurrencyCriteria';
import { CatalogsProductGroupFilterKeys } from './catalogsProductGroupFilterKeys';
import { CatalogsProductGroupFilterOperatorTypeCriteria } from './catalogsProductGroupFilterOperatorTypeCriteria';
import { CatalogsProductGroupFilters } from './catalogsProductGroupFilters';
import { CatalogsProductGroupFiltersAllOf } from './catalogsProductGroupFiltersAllOf';
import { CatalogsProductGroupFiltersAnyOf } from './catalogsProductGroupFiltersAnyOf';
import { CatalogsProductGroupFiltersRequest } from './catalogsProductGroupFiltersRequest';
import { CatalogsProductGroupMultipleCountriesCriteria } from './catalogsProductGroupMultipleCountriesCriteria';
import { CatalogsProductGroupMultipleGenderCriteria } from './catalogsProductGroupMultipleGenderCriteria';
import { CatalogsProductGroupMultipleMediaTypesCriteria } from './catalogsProductGroupMultipleMediaTypesCriteria';
import { CatalogsProductGroupMultipleStringCriteria } from './catalogsProductGroupMultipleStringCriteria';
import { CatalogsProductGroupMultipleStringListCriteria } from './catalogsProductGroupMultipleStringListCriteria';
import { CatalogsProductGroupPinsList200Response } from './catalogsProductGroupPinsList200Response';
import { CatalogsProductGroupPricingCriteria } from './catalogsProductGroupPricingCriteria';
import { CatalogsProductGroupPricingCurrencyCriteria } from './catalogsProductGroupPricingCurrencyCriteria';
import { CatalogsProductGroupProductCountsVertical } from './catalogsProductGroupProductCountsVertical';
import { CatalogsProductGroupStatus } from './catalogsProductGroupStatus';
import { CatalogsProductGroupType } from './catalogsProductGroupType';
import { CatalogsProductGroupUint32Criteria } from './catalogsProductGroupUint32Criteria';
import { CatalogsProductGroupUpdateRequest } from './catalogsProductGroupUpdateRequest';
import { CatalogsProductGroupsList200Response } from './catalogsProductGroupsList200Response';
import { CatalogsProductGroupsUpdateRequest } from './catalogsProductGroupsUpdateRequest';
import { CatalogsReport } from './catalogsReport';
import { CatalogsReportAllItemsFilter } from './catalogsReportAllItemsFilter';
import { CatalogsReportDistributionIssueFilter } from './catalogsReportDistributionIssueFilter';
import { CatalogsReportDistributionStats } from './catalogsReportDistributionStats';
import { CatalogsReportFeedIngestionFilter } from './catalogsReportFeedIngestionFilter';
import { CatalogsReportFeedIngestionStats } from './catalogsReportFeedIngestionStats';
import { CatalogsReportParameters } from './catalogsReportParameters';
import { CatalogsReportStats } from './catalogsReportStats';
import { CatalogsRetailAvailableFilterValues } from './catalogsRetailAvailableFilterValues';
import { CatalogsRetailBatchRequest } from './catalogsRetailBatchRequest';
import { CatalogsRetailBatchRequestItemsInner } from './catalogsRetailBatchRequestItemsInner';
import { CatalogsRetailFeed } from './catalogsRetailFeed';
import { CatalogsRetailFeedsCreateRequest } from './catalogsRetailFeedsCreateRequest';
import { CatalogsRetailFeedsUpdateRequest } from './catalogsRetailFeedsUpdateRequest';
import { CatalogsRetailFilterValuesMap } from './catalogsRetailFilterValuesMap';
import { CatalogsRetailItemErrorResponse } from './catalogsRetailItemErrorResponse';
import { CatalogsRetailItemResponse } from './catalogsRetailItemResponse';
import { CatalogsRetailItemsBatch } from './catalogsRetailItemsBatch';
import { CatalogsRetailItemsFilter } from './catalogsRetailItemsFilter';
import { CatalogsRetailItemsPostFilter } from './catalogsRetailItemsPostFilter';
import { CatalogsRetailListProductsByCatalogBasedFilterRequest } from './catalogsRetailListProductsByCatalogBasedFilterRequest';
import { CatalogsRetailProduct } from './catalogsRetailProduct';
import { CatalogsRetailProductGroup } from './catalogsRetailProductGroup';
import { CatalogsRetailProductGroupCreateRequest } from './catalogsRetailProductGroupCreateRequest';
import { CatalogsRetailProductGroupProductCounts } from './catalogsRetailProductGroupProductCounts';
import { CatalogsRetailProductGroupUpdateRequest } from './catalogsRetailProductGroupUpdateRequest';
import { CatalogsRetailProductMetadata } from './catalogsRetailProductMetadata';
import { CatalogsRetailReportParameters } from './catalogsRetailReportParameters';
import { CatalogsRetailReportStatsParameters } from './catalogsRetailReportStatsParameters';
import { CatalogsStatus } from './catalogsStatus';
import { CatalogsType } from './catalogsType';
import { CatalogsUpdatableCreativeAssetsAttributes } from './catalogsUpdatableCreativeAssetsAttributes';
import { CatalogsUpdatableHotelAttributes } from './catalogsUpdatableHotelAttributes';
import { CatalogsUpdateCreativeAssetsItem } from './catalogsUpdateCreativeAssetsItem';
import { CatalogsUpdateHotelItem } from './catalogsUpdateHotelItem';
import { CatalogsUpdateRetailItem } from './catalogsUpdateRetailItem';
import { CatalogsUpsertCreativeAssetsItem } from './catalogsUpsertCreativeAssetsItem';
import { CatalogsUpsertHotelItem } from './catalogsUpsertHotelItem';
import { CatalogsUpsertRetailItem } from './catalogsUpsertRetailItem';
import { CatalogsVerticalBatchRequest } from './catalogsVerticalBatchRequest';
import { CatalogsVerticalFeedsCreateRequest } from './catalogsVerticalFeedsCreateRequest';
import { CatalogsVerticalFeedsUpdateRequest } from './catalogsVerticalFeedsUpdateRequest';
import { CatalogsVerticalProductGroup } from './catalogsVerticalProductGroup';
import { CatalogsVerticalProductGroupCreateRequest } from './catalogsVerticalProductGroupCreateRequest';
import { CatalogsVerticalProductGroupUpdateRequest } from './catalogsVerticalProductGroupUpdateRequest';
import { CatalogsVerticalsListProductsByCatalogBasedFilterRequest } from './catalogsVerticalsListProductsByCatalogBasedFilterRequest';
import { ConditionFilter } from './conditionFilter';
import { ContentType } from './contentType';
import { ConversionAccessTokenResponse } from './conversionAccessTokenResponse';
import { ConversionApiResponse } from './conversionApiResponse';
import { ConversionApiResponseEventsInner } from './conversionApiResponseEventsInner';
import { ConversionAttributionWindowDays } from './conversionAttributionWindowDays';
import { ConversionEventAppInfo } from './conversionEventAppInfo';
import { ConversionEventDeviceInfo } from './conversionEventDeviceInfo';
import { ConversionEventResponse } from './conversionEventResponse';
import { ConversionEvents } from './conversionEvents';
import { ConversionEventsDataInner } from './conversionEventsDataInner';
import { ConversionEventsDataInnerCustomData } from './conversionEventsDataInnerCustomData';
import { ConversionEventsDataInnerCustomDataContentsInner } from './conversionEventsDataInnerCustomDataContentsInner';
import { ConversionEventsUserData } from './conversionEventsUserData';
import { ConversionEventsUserDataProperties } from './conversionEventsUserDataProperties';
import { ConversionHealthSelectionItem } from './conversionHealthSelectionItem';
import { ConversionMSOTEvents } from './conversionMSOTEvents';
import { ConversionProductReportRequest } from './conversionProductReportRequest';
import { ConversionProductReportingColumn } from './conversionProductReportingColumn';
import { ConversionReportAttributionType } from './conversionReportAttributionType';
import { ConversionReportTimeType } from './conversionReportTimeType';
import { ConversionTag } from './conversionTag';
import { ConversionTagCommon } from './conversionTagCommon';
import { ConversionTagConfigs } from './conversionTagConfigs';
import { ConversionTagCreate } from './conversionTagCreate';
import { ConversionTagListResponse } from './conversionTagListResponse';
import { ConversionTagResponse } from './conversionTagResponse';
import { ConversionTagType } from './conversionTagType';
import { ConversionTagsList200Response } from './conversionTagsList200Response';
import { Country } from './country';
import { CountryFilter } from './countryFilter';
import { CreateAssetAccessRequestBody } from './createAssetAccessRequestBody';
import { CreateAssetAccessRequestBodyAssetRequestsInner } from './createAssetAccessRequestBodyAssetRequestsInner';
import { CreateAssetAccessRequestErrorMessageInner } from './createAssetAccessRequestErrorMessageInner';
import { CreateAssetAccessRequestResponse } from './createAssetAccessRequestResponse';
import { CreateAssetGroupBody } from './createAssetGroupBody';
import { CreateAssetGroupResponse } from './createAssetGroupResponse';
import { CreateAssetInvitesRequest } from './createAssetInvitesRequest';
import { CreateAssetInvitesRequestItem } from './createAssetInvitesRequestItem';
import { CreateInvitesResultsResponseArray } from './createInvitesResultsResponseArray';
import { CreateInvitesResultsResponseArrayItemsInner } from './createInvitesResultsResponseArrayItemsInner';
import { CreateInvitesResultsResponseArrayItemsInnerInvite } from './createInvitesResultsResponseArrayItemsInnerInvite';
import { CreateMMMReportRequest } from './createMMMReportRequest';
import { CreateMMMReportResponse } from './createMMMReportResponse';
import { CreateMMMReportResponseData } from './createMMMReportResponseData';
import { CreateMembershipOrPartnershipInvitesBody } from './createMembershipOrPartnershipInvitesBody';
import { CreativeAssetsIdFilter } from './creativeAssetsIdFilter';
import { CreativeAssetsProcessingRecord } from './creativeAssetsProcessingRecord';
import { CreativeAssetsVisibilityType } from './creativeAssetsVisibilityType';
import { CreativeType } from './creativeType';
import { Currency } from './currency';
import { CurrencyFilter } from './currencyFilter';
import { CustomLabel0Filter } from './customLabel0Filter';
import { CustomLabel1Filter } from './customLabel1Filter';
import { CustomLabel2Filter } from './customLabel2Filter';
import { CustomLabel3Filter } from './customLabel3Filter';
import { CustomLabel4Filter } from './customLabel4Filter';
import { CustomNumber0Filter } from './customNumber0Filter';
import { CustomNumber1Filter } from './customNumber1Filter';
import { CustomNumber2Filter } from './customNumber2Filter';
import { CustomNumber3Filter } from './customNumber3Filter';
import { CustomNumber4Filter } from './customNumber4Filter';
import { CustomerList } from './customerList';
import { CustomerListRequest } from './customerListRequest';
import { CustomerListUpdateRequest } from './customerListUpdateRequest';
import { CustomerListUpload } from './customerListUpload';
import { CustomerListUploadCreateRequest } from './customerListUploadCreateRequest';
import { CustomerListUploadCreateResponse } from './customerListUploadCreateResponse';
import { CustomerListUploadResponse } from './customerListUploadResponse';
import { CustomerListsList200Response } from './customerListsList200Response';
import { CustomizableCTAType } from './customizableCTAType';
import { DataOutputFormat } from './dataOutputFormat';
import { DataStatus } from './dataStatus';
import { DeleteAssetGroupBody } from './deleteAssetGroupBody';
import { DeleteAssetGroupResponse } from './deleteAssetGroupResponse';
import { DeleteAssetGroupResponseExceptionsInner } from './deleteAssetGroupResponseExceptionsInner';
import { DeleteInvitesResultsResponseArray } from './deleteInvitesResultsResponseArray';
import { DeleteInvitesResultsResponseArrayItemsInner } from './deleteInvitesResultsResponseArrayItemsInner';
import { DeleteInvitesResultsResponseArrayItemsInnerException } from './deleteInvitesResultsResponseArrayItemsInnerException';
import { DeleteMemberAccessResult } from './deleteMemberAccessResult';
import { DeleteMemberAccessResultsResponseArray } from './deleteMemberAccessResultsResponseArray';
import { DeletePartnerAssetAccessBody } from './deletePartnerAssetAccessBody';
import { DeletePartnerAssetAccessBodyAccessesInner } from './deletePartnerAssetAccessBodyAccessesInner';
import { DeletePartnerAssetsResult } from './deletePartnerAssetsResult';
import { DeletePartnerAssetsResultsResponseArray } from './deletePartnerAssetsResultsResponseArray';
import { DeletePartnersRequest } from './deletePartnersRequest';
import { DeletePartnersResponse } from './deletePartnersResponse';
import { DeletedMembersResponse } from './deletedMembersResponse';
import { DeliveryMetricsResponse } from './deliveryMetricsResponse';
import { DeliveryMetricsResponseItemsInner } from './deliveryMetricsResponseItemsInner';
import { DetailedError } from './detailedError';
import { DisclosureType } from './disclosureType';
import { EnhancedMatchStatusType } from './enhancedMatchStatusType';
import { EntityStatus } from './entityStatus';
import { ErrorDetail } from './errorDetail';
import { EventData } from './eventData';
import { EventQualityScore } from './eventQualityScore';
import { Exception } from './exception';
import { FeaturedTrend } from './featuredTrend';
import { FeedProcessingResultsList200Response } from './feedProcessingResultsList200Response';
import { FeedsCreateRequest } from './feedsCreateRequest';
import { FeedsList200Response } from './feedsList200Response';
import { FeedsUpdateRequest } from './feedsUpdateRequest';
import { FollowUserRequest } from './followUserRequest';
import { FollowersList200Response } from './followersList200Response';
import { Gender } from './gender';
import { GenderBucket } from './genderBucket';
import { GenderDemographics } from './genderDemographics';
import { GenderFilter } from './genderFilter';
import { GetAudiencesOrderBy } from './getAudiencesOrderBy';
import { GetBusinessAssetTypeResponse } from './getBusinessAssetTypeResponse';
import { GetBusinessAssetsResponse } from './getBusinessAssetsResponse';
import { GetBusinessAssetsResponseCatalogInfo } from './getBusinessAssetsResponseCatalogInfo';
import { GetBusinessEmployers200Response } from './getBusinessEmployers200Response';
import { GetBusinessMembers200Response } from './getBusinessMembers200Response';
import { GetBusinessPartners200Response } from './getBusinessPartners200Response';
import { GetInvites200Response } from './getInvites200Response';
import { GetMMMReportResponse } from './getMMMReportResponse';
import { GetMMMReportResponseData } from './getMMMReportResponseData';
import { GetPartnerAssetsResponse } from './getPartnerAssetsResponse';
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
import { ImageBase64 } from './imageBase64';
import { ImageDetails } from './imageDetails';
import { ImageMetadata } from './imageMetadata';
import { ImageSize } from './imageSize';
import { IngestionSourceOptions } from './ingestionSourceOptions';
import { InnerProductCategoriesMetricsHighlights } from './innerProductCategoriesMetricsHighlights';
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
import { IntegrationsLogsPost400Response } from './integrationsLogsPost400Response';
import { Interest } from './interest';
import { InterestsEnum } from './interestsEnum';
import { InviteAssetsSummary } from './inviteAssetsSummary';
import { InviteAssetsSummaryAdAccountsInner } from './inviteAssetsSummaryAdAccountsInner';
import { InviteAssetsSummaryProfilesInner } from './inviteAssetsSummaryProfilesInner';
import { InviteBusinessRoleBinding } from './inviteBusinessRoleBinding';
import { InviteExceptionResponse } from './inviteExceptionResponse';
import { InviteResponse } from './inviteResponse';
import { InviteStatus } from './inviteStatus';
import { InviteType } from './inviteType';
import { ItemAttributes } from './itemAttributes';
import { ItemAttributesRequest } from './itemAttributesRequest';
import { ItemAttributesRequestAllOfImageLink } from './itemAttributesRequestAllOfImageLink';
import { ItemBatchRecord } from './itemBatchRecord';
import { ItemCreateBatchRecord } from './itemCreateBatchRecord';
import { ItemDeleteBatchRecord } from './itemDeleteBatchRecord';
import { ItemDeleteDiscontinuedBatchRecord } from './itemDeleteDiscontinuedBatchRecord';
import { ItemGroupIdFilter } from './itemGroupIdFilter';
import { ItemIdFilter } from './itemIdFilter';
import { ItemProcessingRecord } from './itemProcessingRecord';
import { ItemProcessingStatus } from './itemProcessingStatus';
import { ItemResponse } from './itemResponse';
import { ItemResponseOneOf } from './itemResponseOneOf';
import { ItemResponseOneOf1 } from './itemResponseOneOf1';
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
import { Label } from './label';
import { LabelBulkUpdateRequest } from './labelBulkUpdateRequest';
import { LabelCreateRequest } from './labelCreateRequest';
import { LabelCreateRequestLabelsInner } from './labelCreateRequestLabelsInner';
import { LabelError } from './labelError';
import { LabelParentType } from './labelParentType';
import { LabelStatus } from './labelStatus';
import { LabelType } from './labelType';
import { LabelUpdateRequest } from './labelUpdateRequest';
import { LabelUpdateRequestLabelsInner } from './labelUpdateRequestLabelsInner';
import { LabelsList200Response } from './labelsList200Response';
import { LabelsResponse } from './labelsResponse';
import { Language } from './language';
import { LeadFormArrayResponse } from './leadFormArrayResponse';
import { LeadFormArrayResponseItemsInner } from './leadFormArrayResponseItemsInner';
import { LeadFormCommon } from './leadFormCommon';
import { LeadFormCommonPolicyLinksInner } from './leadFormCommonPolicyLinksInner';
import { LeadFormCreateRequest } from './leadFormCreateRequest';
import { LeadFormQuestion } from './leadFormQuestion';
import { LeadFormQuestionFieldType } from './leadFormQuestionFieldType';
import { LeadFormQuestionType } from './leadFormQuestionType';
import { LeadFormResponse } from './leadFormResponse';
import { LeadFormStatus } from './leadFormStatus';
import { LeadFormTestRequest } from './leadFormTestRequest';
import { LeadFormTestResponse } from './leadFormTestResponse';
import { LeadFormUpdateRequest } from './leadFormUpdateRequest';
import { LeadFormsList200Response } from './leadFormsList200Response';
import { LeadSubscription } from './leadSubscription';
import { LeadSubscriptionPostParamsCreate } from './leadSubscriptionPostParamsCreate';
import { LeadSubscriptionPostParamsCreateAllOfPartnerMetadata } from './leadSubscriptionPostParamsCreateAllOfPartnerMetadata';
import { LeadsExportCreateRequest } from './leadsExportCreateRequest';
import { LeadsExportCreateResponse } from './leadsExportCreateResponse';
import { LeadsExportResponseData } from './leadsExportResponseData';
import { LeadsExportStatus } from './leadsExportStatus';
import { LineItem } from './lineItem';
import { LinkedBusiness } from './linkedBusiness';
import { LocalStoreUpdate } from './localStoreUpdate';
import { LookbackPeriodOptions } from './lookbackPeriodOptions';
import { MMMReportingColumn } from './mMMReportingColumn';
import { MMMReportingTargetingType } from './mMMReportingTargetingType';
import { MatchType } from './matchType';
import { MatchTypeResponse } from './matchTypeResponse';
import { MaxPriceFilter } from './maxPriceFilter';
import { Media } from './media';
import { MediaList200Response } from './mediaList200Response';
import { MediaType } from './mediaType';
import { MediaTypeFilter } from './mediaTypeFilter';
import { MediaUpload } from './mediaUpload';
import { MediaUploadCreate } from './mediaUploadCreate';
import { MediaUploadParameters } from './mediaUploadParameters';
import { MediaUploadStatus } from './mediaUploadStatus';
import { MediaUploadType } from './mediaUploadType';
import { MemberBusinessRole } from './memberBusinessRole';
import { MembersToDeleteBody } from './membersToDeleteBody';
import { MembersToDeleteBodyMembersInner } from './membersToDeleteBodyMembersInner';
import { MetricsReportingLevel } from './metricsReportingLevel';
import { MetricsResponse } from './metricsResponse';
import { MinPriceFilter } from './minPriceFilter';
import { ModelError } from './modelError';
import { MultipleProductGroupsInner } from './multipleProductGroupsInner';
import { NonDraftEntityStatus } from './nonDraftEntityStatus';
import { NonNullableCatalogsCurrency } from './nonNullableCatalogsCurrency';
import { NonNullableProductAvailabilityType } from './nonNullableProductAvailabilityType';
import { NotificationPostRequest } from './notificationPostRequest';
import { NotificationResponse } from './notificationResponse';
import { NullableCatalogsItemFieldType } from './nullableCatalogsItemFieldType';
import { NullableCurrency } from './nullableCurrency';
import { OauthAccessTokenRequestClientCredentials } from './oauthAccessTokenRequestClientCredentials';
import { OauthAccessTokenRequestCode } from './oauthAccessTokenRequestCode';
import { OauthAccessTokenRequestRefresh } from './oauthAccessTokenRequestRefresh';
import { OauthAccessTokenResponse } from './oauthAccessTokenResponse';
import { OauthAccessTokenResponseClientCredentials } from './oauthAccessTokenResponseClientCredentials';
import { OauthAccessTokenResponseCode } from './oauthAccessTokenResponseCode';
import { OauthAccessTokenResponseIntegrationRefresh } from './oauthAccessTokenResponseIntegrationRefresh';
import { OauthAccessTokenResponseRefresh } from './oauthAccessTokenResponseRefresh';
import { ObjectiveType } from './objectiveType';
import { OperationType } from './operationType';
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
import { OverallStatusOptions } from './overallStatusOptions';
import { PacingDeliveryType } from './pacingDeliveryType';
import { PageVisitConversionTagsGet200Response } from './pageVisitConversionTagsGet200Response';
import { Paginated } from './paginated';
import { PartnerType } from './partnerType';
import { Permissions } from './permissions';
import { PermissionsWithOwner } from './permissionsWithOwner';
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
import { PinMediaSourceImagesBase64Item } from './pinMediaSourceImagesBase64Item';
import { PinMediaSourceImagesURL } from './pinMediaSourceImagesURL';
import { PinMediaSourceImagesURLItem } from './pinMediaSourceImagesURLItem';
import { PinMediaSourcePinURL } from './pinMediaSourcePinURL';
import { PinMediaSourceVideoID } from './pinMediaSourceVideoID';
import { PinMediaWithImage } from './pinMediaWithImage';
import { PinMediaWithImageAndVideo } from './pinMediaWithImageAndVideo';
import { PinMediaWithImages } from './pinMediaWithImages';
import { PinMediaWithVideo } from './pinMediaWithVideo';
import { PinMediaWithVideos } from './pinMediaWithVideos';
import { PinPromotionSummaryStatus } from './pinPromotionSummaryStatus';
import { PinUpdate } from './pinUpdate';
import { PinsList200Response } from './pinsList200Response';
import { PinsSaveRequest } from './pinsSaveRequest';
import { PinterestLibError } from './pinterestLibError';
import { PinterestLibPaginationOrder } from './pinterestLibPaginationOrder';
import { PinterestLibStatus204 } from './pinterestLibStatus204';
import { PlacementGroupType } from './placementGroupType';
import { PlacementMultipliers } from './placementMultipliers';
import { PredictedTimeSeries } from './predictedTimeSeries';
import { PriceFilter } from './priceFilter';
import { ProductAvailabilityType } from './productAvailabilityType';
import { ProductCategoriesDemographic } from './productCategoriesDemographic';
import { ProductCategoriesEngagementType } from './productCategoriesEngagementType';
import { ProductCategoriesMetricsHighlights } from './productCategoriesMetricsHighlights';
import { ProductCategoryDetailLookbackWindow } from './productCategoryDetailLookbackWindow';
import { ProductCategoryDetails } from './productCategoryDetails';
import { ProductCategoryEnum } from './productCategoryEnum';
import { ProductCategoryRegion } from './productCategoryRegion';
import { ProductGroupAnalyticsResponseInner } from './productGroupAnalyticsResponseInner';
import { ProductGroupPromotion } from './productGroupPromotion';
import { ProductGroupPromotionCreateRequest } from './productGroupPromotionCreateRequest';
import { ProductGroupPromotionResponse } from './productGroupPromotionResponse';
import { ProductGroupPromotionResponseItem } from './productGroupPromotionResponseItem';
import { ProductGroupPromotionUpdateRequest } from './productGroupPromotionUpdateRequest';
import { ProductGroupPromotionsList200Response } from './productGroupPromotionsList200Response';
import { ProductGroupReferenceFilter } from './productGroupReferenceFilter';
import { ProductGroupSummaryStatus } from './productGroupSummaryStatus';
import { ProductType0Filter } from './productType0Filter';
import { ProductType1Filter } from './productType1Filter';
import { ProductType2Filter } from './productType2Filter';
import { ProductType3Filter } from './productType3Filter';
import { ProductType4Filter } from './productType4Filter';
import { PromotionArrayElement } from './promotionArrayElement';
import { PromotionCommon } from './promotionCommon';
import { PromotionCreateRequest } from './promotionCreateRequest';
import { PromotionResponse } from './promotionResponse';
import { PromotionTemplateValue } from './promotionTemplateValue';
import { PromotionType } from './promotionType';
import { PromotionUpdateRequest } from './promotionUpdateRequest';
import { PromotionsList200Response } from './promotionsList200Response';
import { PromotionsResponse } from './promotionsResponse';
import { QualityComponentDetails } from './qualityComponentDetails';
import { QualityComponentIssue } from './qualityComponentIssue';
import { QualityComponents } from './qualityComponents';
import { QuizPinData } from './quizPinData';
import { QuizPinOption } from './quizPinOption';
import { QuizPinQuestion } from './quizPinQuestion';
import { QuizPinResult } from './quizPinResult';
import { RecordCounts } from './recordCounts';
import { RelatedTerms } from './relatedTerms';
import { RelatedTermsRelatedTermsListInner } from './relatedTermsRelatedTermsListInner';
import { ReportingColumnAsync } from './reportingColumnAsync';
import { ReportingTimeZone } from './reportingTimeZone';
import { ReportsStats200Response } from './reportsStats200Response';
import { ReportsStatsParametersParameter } from './reportsStatsParametersParameter';
import { RespondToInvitesResponseArray } from './respondToInvitesResponseArray';
import { RespondToInvitesResponseArrayItemsInner } from './respondToInvitesResponseArrayItemsInner';
import { Role } from './role';
import { S3FilePart } from './s3FilePart';
import { S3MultipartUploadData } from './s3MultipartUploadData';
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
import { SearchUserPinsList200Response } from './searchUserPinsList200Response';
import { SharedAudience } from './sharedAudience';
import { SharedAudienceAccount } from './sharedAudienceAccount';
import { SharedAudienceCommon } from './sharedAudienceCommon';
import { SharedAudienceResponse } from './sharedAudienceResponse';
import { SharedAudienceResponseCommon } from './sharedAudienceResponseCommon';
import { SingleInterestTargetingOptionResponse } from './singleInterestTargetingOptionResponse';
import { SourcePlatformOptions } from './sourcePlatformOptions';
import { SsioInsertionOrdersStatusGetByAdAccount200Response } from './ssioInsertionOrdersStatusGetByAdAccount200Response';
import { SsioOrderLinesGetByAdAccount200Response } from './ssioOrderLinesGetByAdAccount200Response';
import { SummaryPin } from './summaryPin';
import { SystemUserUpdateRequest } from './systemUserUpdateRequest';
import { TargetingAdvertiserCountry } from './targetingAdvertiserCountry';
import { TargetingSpec } from './targetingSpec';
import { TargetingSpecAgeBucket } from './targetingSpecAgeBucket';
import { TargetingSpecAppType } from './targetingSpecAppType';
import { TargetingSpecGender } from './targetingSpecGender';
import { TargetingSpecOperationAgeBucket } from './targetingSpecOperationAgeBucket';
import { TargetingSpecOperationAppType } from './targetingSpecOperationAppType';
import { TargetingSpecOperationGender } from './targetingSpecOperationGender';
import { TargetingSpecOperationList } from './targetingSpecOperationList';
import { TargetingSpecOperationMinMaxAge } from './targetingSpecOperationMinMaxAge';
import { TargetingSpecOperationShoppingRetargeting } from './targetingSpecOperationShoppingRetargeting';
import { TargetingSpecOperationString } from './targetingSpecOperationString';
import { TargetingSpecShoppingRetargeting } from './targetingSpecShoppingRetargeting';
import { TargetingTemplateAudienceSizing } from './targetingTemplateAudienceSizing';
import { TargetingTemplateAudienceSizingReachEstimate } from './targetingTemplateAudienceSizingReachEstimate';
import { TargetingTemplateCommon } from './targetingTemplateCommon';
import { TargetingTemplateCreate } from './targetingTemplateCreate';
import { TargetingTemplateGetResponseData } from './targetingTemplateGetResponseData';
import { TargetingTemplateKeyword } from './targetingTemplateKeyword';
import { TargetingTemplateList200Response } from './targetingTemplateList200Response';
import { TargetingTemplateResponseData } from './targetingTemplateResponseData';
import { TargetingTemplateUpdateRequest } from './targetingTemplateUpdateRequest';
import { TargetingTypeFilter } from './targetingTypeFilter';
import { TemplateBasedReport } from './templateBasedReport';
import { TemplateResponse } from './templateResponse';
import { TemplateResponseDateRange } from './templateResponseDateRange';
import { TemplateResponseDateRangeAbsoluteDateRange } from './templateResponseDateRangeAbsoluteDateRange';
import { TemplateResponseDateRangeDynamicDateRange } from './templateResponseDateRangeDynamicDateRange';
import { TemplateResponseDateRangeRelativeDateRange } from './templateResponseDateRangeRelativeDateRange';
import { TemplatesList200Response } from './templatesList200Response';
import { TermsOfService } from './termsOfService';
import { TimeSeries } from './timeSeries';
import { TitleKeywordsFilter } from './titleKeywordsFilter';
import { TopPinsAnalyticsResponse } from './topPinsAnalyticsResponse';
import { TopPinsAnalyticsResponseDateAvailability } from './topPinsAnalyticsResponseDateAvailability';
import { TopPinsAnalyticsResponsePinsInner } from './topPinsAnalyticsResponsePinsInner';
import { TopVideoPinsAnalyticsResponse } from './topVideoPinsAnalyticsResponse';
import { TopVideoPinsAnalyticsResponsePinsInner } from './topVideoPinsAnalyticsResponsePinsInner';
import { TrackingUrls } from './trackingUrls';
import { TrendType } from './trendType';
import { TrendingKeyword } from './trendingKeyword';
import { TrendingKeywordDemographics } from './trendingKeywordDemographics';
import { TrendingKeywordDemographicsAgeDistribution } from './trendingKeywordDemographicsAgeDistribution';
import { TrendingKeywordDemographicsGenderDistribution } from './trendingKeywordDemographicsGenderDistribution';
import { TrendingKeywordsResponse } from './trendingKeywordsResponse';
import { TrendingPin } from './trendingPin';
import { TrendingProductCategory } from './trendingProductCategory';
import { TrendingTopic } from './trendingTopic';
import { TrendsSupportedRegion } from './trendsSupportedRegion';
import { UpdatableItemAttributes } from './updatableItemAttributes';
import { UpdatableItemAttributesGtin } from './updatableItemAttributesGtin';
import { UpdateAssetGroupBody } from './updateAssetGroupBody';
import { UpdateAssetGroupBodyAssetGroupsToUpdateInner } from './updateAssetGroupBodyAssetGroupsToUpdateInner';
import { UpdateAssetGroupResponse } from './updateAssetGroupResponse';
import { UpdateAssetGroupResponseExceptionsInner } from './updateAssetGroupResponseExceptionsInner';
import { UpdateInvitesResultsResponseArray } from './updateInvitesResultsResponseArray';
import { UpdateInvitesResultsResponseArrayItemsInner } from './updateInvitesResultsResponseArrayItemsInner';
import { UpdateMaskBidOptionField } from './updateMaskBidOptionField';
import { UpdateMaskFieldType } from './updateMaskFieldType';
import { UpdateMemberAssetAccessBody } from './updateMemberAssetAccessBody';
import { UpdateMemberAssetAccessBodyAccessesInner } from './updateMemberAssetAccessBodyAccessesInner';
import { UpdateMemberAssetsResultsResponseArray } from './updateMemberAssetsResultsResponseArray';
import { UpdateMemberAssetsResultsResponseArrayItemsInner } from './updateMemberAssetsResultsResponseArrayItemsInner';
import { UpdateMemberBusinessRoleBody } from './updateMemberBusinessRoleBody';
import { UpdateMemberResult } from './updateMemberResult';
import { UpdateMemberResultsResponseArray } from './updateMemberResultsResponseArray';
import { UpdatePartnerAssetAccessBody } from './updatePartnerAssetAccessBody';
import { UpdatePartnerAssetAccessBodyAccessesInner } from './updatePartnerAssetAccessBodyAccessesInner';
import { UpdatePartnerAssetsResult } from './updatePartnerAssetsResult';
import { UpdatePartnerAssetsResultsResponseArray } from './updatePartnerAssetsResultsResponseArray';
import { UpdatePartnerResultsResponseArray } from './updatePartnerResultsResponseArray';
import { UpdatePartnerResultsResponseArrayItemsInner } from './updatePartnerResultsResponseArrayItemsInner';
import { UserAccountFollowedInterests200Response } from './userAccountFollowedInterests200Response';
import { UserBusinessRoleBinding } from './userBusinessRoleBinding';
import { UserFollowingFeedType } from './userFollowingFeedType';
import { UserFollowingGet200Response } from './userFollowingGet200Response';
import { UserListOperationType } from './userListOperationType';
import { UserListType } from './userListType';
import { UserSingleAssetBinding } from './userSingleAssetBinding';
import { UserSummary } from './userSummary';
import { UserWebsiteSummary } from './userWebsiteSummary';
import { UserWebsiteVerificationCode } from './userWebsiteVerificationCode';
import { UserWebsiteVerifyRequest } from './userWebsiteVerifyRequest';
import { UserWebsitesGet200Response } from './userWebsitesGet200Response';
import { UsersForIndividualAssetResponse } from './usersForIndividualAssetResponse';
import { VerticalProductCategory } from './verticalProductCategory';
import { VideoMetadataWithItemType } from './videoMetadataWithItemType';

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
        "AdCountry": AdCountry,
        "AdGroupAudienceSizingRequest.CreativeTypesEnum": AdGroupAudienceSizingRequest.CreativeTypesEnum,
        "AdGroupCommon.BidStrategyTypeEnum": AdGroupCommon.BidStrategyTypeEnum,
        "AdGroupCommon.PromotionApplicationLevelEnum": AdGroupCommon.PromotionApplicationLevelEnum,
        "AdGroupCreateRequest.BidStrategyTypeEnum": AdGroupCreateRequest.BidStrategyTypeEnum,
        "AdGroupCreateRequest.PromotionApplicationLevelEnum": AdGroupCreateRequest.PromotionApplicationLevelEnum,
        "AdGroupResponse.BidStrategyTypeEnum": AdGroupResponse.BidStrategyTypeEnum,
        "AdGroupResponse.PromotionApplicationLevelEnum": AdGroupResponse.PromotionApplicationLevelEnum,
        "AdGroupResponse.ConversionLearningModeTypeEnum": AdGroupResponse.ConversionLearningModeTypeEnum,
        "AdGroupSummaryStatus": AdGroupSummaryStatus,
        "AdGroupUpdateRequest.BidStrategyTypeEnum": AdGroupUpdateRequest.BidStrategyTypeEnum,
        "AdGroupUpdateRequest.PromotionApplicationLevelEnum": AdGroupUpdateRequest.PromotionApplicationLevelEnum,
        "AdPreviewRequest.CreativeTypeEnum": AdPreviewRequest.CreativeTypeEnum,
        "AdPreviewRequest.PreferredMediaTypeEnum": AdPreviewRequest.PreferredMediaTypeEnum,
        "AdPreviewShopping.CreativeTypeEnum": AdPreviewShopping.CreativeTypeEnum,
        "AdPreviewShopping.PreferredMediaTypeEnum": AdPreviewShopping.PreferredMediaTypeEnum,
        "AdResponse.RejectedReasonsEnum": AdResponse.RejectedReasonsEnum,
        "AdResponse.ReviewStatusEnum": AdResponse.ReviewStatusEnum,
        "AdsAnalyticsAdGroupTargetingType": AdsAnalyticsAdGroupTargetingType,
        "AdsAnalyticsAdTargetingType": AdsAnalyticsAdTargetingType,
        "AdsAnalyticsCampaignTargetingType": AdsAnalyticsCampaignTargetingType,
        "AdsAnalyticsCreateAsyncRequest.TargetingTypesEnum": AdsAnalyticsCreateAsyncRequest.TargetingTypesEnum,
        "AdsAnalyticsCreateAsyncRequest.PrimarySortEnum": AdsAnalyticsCreateAsyncRequest.PrimarySortEnum,
        "AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics.CustomEventMetricsTypeEnum": AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics.CustomEventMetricsTypeEnum,
        "AdsAnalyticsFilterColumn": AdsAnalyticsFilterColumn,
        "AdsAnalyticsFilterOperator": AdsAnalyticsFilterOperator,
        "AdsAnalyticsTargetingType": AdsAnalyticsTargetingType,
        "AdsCreditDiscountsResponse.DiscountTypeEnum": AdsCreditDiscountsResponse.DiscountTypeEnum,
        "AdvancedAuctionOperation": AdvancedAuctionOperation,
        "AdvertiserDefinedEvent.MappedConversionTypeEnum": AdvertiserDefinedEvent.MappedConversionTypeEnum,
        "AgeTrendsBucket": AgeTrendsBucket,
        "AppTypeMultipliers.APPTYPEEnum": AppTypeMultipliers.APPTYPEEnum,
        "AssetGroupType": AssetGroupType,
        "AudienceAccountType": AudienceAccountType,
        "AudienceDefinitionScope.ScopeEnum": AudienceDefinitionScope.ScopeEnum,
        "AudienceDefinitionType.ScopeEnum": AudienceDefinitionType.ScopeEnum,
        "AudienceInsightType": AudienceInsightType,
        "AudienceShareType": AudienceShareType,
        "AudienceType": AudienceType,
        "AudienceUpdateOperationType": AudienceUpdateOperationType,
        "BatchOperation": BatchOperation,
        "BatchOperationStatus": BatchOperationStatus,
        "BillingInvoiceResponse.DocumentTypeEnum": BillingInvoiceResponse.DocumentTypeEnum,
        "BillingInvoiceResponse.StatusEnum": BillingInvoiceResponse.StatusEnum,
        "BillingProfilesResponse.BillingTypeEnum": BillingProfilesResponse.BillingTypeEnum,
        "BillingProfilesResponse.CardTypeEnum": BillingProfilesResponse.CardTypeEnum,
        "BillingProfilesResponse.PaymentMethodBrandEnum": BillingProfilesResponse.PaymentMethodBrandEnum,
        "BillingProfilesResponse.StatusEnum": BillingProfilesResponse.StatusEnum,
        "BoardPrivacy": BoardPrivacy,
        "BoardPrivacyFilter": BoardPrivacyFilter,
        "BoardUpdatePrivacy": BoardUpdatePrivacy,
        "BudgetType": BudgetType,
        "BulkEntityType": BulkEntityType,
        "BulkOutputFormat": BulkOutputFormat,
        "BulkReportingJobStatus": BulkReportingJobStatus,
        "BulkUpsertStatus": BulkUpsertStatus,
        "BusinessAccessRole": BusinessAccessRole,
        "BusinessRole": BusinessRole,
        "BusinessRoleCheckMode": BusinessRoleCheckMode,
        "BusinessRoleForMembers": BusinessRoleForMembers,
        "CampaignBidOptionsUpdate.UpdateMaskEnum": CampaignBidOptionsUpdate.UpdateMaskEnum,
        "CampaignSummaryStatus": CampaignSummaryStatus,
        "CatalogsAvailableFilterValues.CatalogTypeEnum": CatalogsAvailableFilterValues.CatalogTypeEnum,
        "CatalogsCreateCreativeAssetsItem.OperationEnum": CatalogsCreateCreativeAssetsItem.OperationEnum,
        "CatalogsCreateHotelItem.OperationEnum": CatalogsCreateHotelItem.OperationEnum,
        "CatalogsCreateRetailItem.OperationEnum": CatalogsCreateRetailItem.OperationEnum,
        "CatalogsCreativeAssetsAvailableFilterValues.CatalogTypeEnum": CatalogsCreativeAssetsAvailableFilterValues.CatalogTypeEnum,
        "CatalogsCreativeAssetsBatchItem.OperationEnum": CatalogsCreativeAssetsBatchItem.OperationEnum,
        "CatalogsCreativeAssetsBatchRequest.CatalogTypeEnum": CatalogsCreativeAssetsBatchRequest.CatalogTypeEnum,
        "CatalogsCreativeAssetsBatchRequest.LanguageEnum": CatalogsCreativeAssetsBatchRequest.LanguageEnum,
        "CatalogsCreativeAssetsFilterValuesMap.MediaTypeEnum": CatalogsCreativeAssetsFilterValuesMap.MediaTypeEnum,
        "CatalogsCreativeAssetsItemsFilter.CatalogTypeEnum": CatalogsCreativeAssetsItemsFilter.CatalogTypeEnum,
        "CatalogsCreativeAssetsItemsPostFilter.CatalogTypeEnum": CatalogsCreativeAssetsItemsPostFilter.CatalogTypeEnum,
        "CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.CatalogTypeEnum": CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.CatalogTypeEnum,
        "CatalogsCreativeAssetsProduct.CatalogTypeEnum": CatalogsCreativeAssetsProduct.CatalogTypeEnum,
        "CatalogsCreativeAssetsProductGroup.CatalogTypeEnum": CatalogsCreativeAssetsProductGroup.CatalogTypeEnum,
        "CatalogsCreativeAssetsProductGroupCreateRequest.CatalogTypeEnum": CatalogsCreativeAssetsProductGroupCreateRequest.CatalogTypeEnum,
        "CatalogsCreativeAssetsProductGroupProductCounts.CatalogTypeEnum": CatalogsCreativeAssetsProductGroupProductCounts.CatalogTypeEnum,
        "CatalogsCreativeAssetsProductGroupUpdateRequest.CatalogTypeEnum": CatalogsCreativeAssetsProductGroupUpdateRequest.CatalogTypeEnum,
        "CatalogsDeleteCreativeAssetsItem.OperationEnum": CatalogsDeleteCreativeAssetsItem.OperationEnum,
        "CatalogsDeleteHotelItem.OperationEnum": CatalogsDeleteHotelItem.OperationEnum,
        "CatalogsDeleteRetailItem.OperationEnum": CatalogsDeleteRetailItem.OperationEnum,
        "CatalogsFeedIngestionErrors.LARGEPRODUCTCOUNTDECREASEEnum": CatalogsFeedIngestionErrors.LARGEPRODUCTCOUNTDECREASEEnum,
        "CatalogsFeedProcessingSchedule.TimezoneEnum": CatalogsFeedProcessingSchedule.TimezoneEnum,
        "CatalogsFeedProcessingStatus": CatalogsFeedProcessingStatus,
        "CatalogsFeedValidationWarnings.FETCHSAMESIGNATUREEnum": CatalogsFeedValidationWarnings.FETCHSAMESIGNATUREEnum,
        "CatalogsFormat": CatalogsFormat,
        "CatalogsHotelAvailableFilterValues.CatalogTypeEnum": CatalogsHotelAvailableFilterValues.CatalogTypeEnum,
        "CatalogsHotelBatchItem.OperationEnum": CatalogsHotelBatchItem.OperationEnum,
        "CatalogsHotelBatchRequest.CatalogTypeEnum": CatalogsHotelBatchRequest.CatalogTypeEnum,
        "CatalogsHotelBatchRequest.LanguageEnum": CatalogsHotelBatchRequest.LanguageEnum,
        "CatalogsHotelItemsFilter.CatalogTypeEnum": CatalogsHotelItemsFilter.CatalogTypeEnum,
        "CatalogsHotelItemsPostFilter.CatalogTypeEnum": CatalogsHotelItemsPostFilter.CatalogTypeEnum,
        "CatalogsHotelListProductsByCatalogBasedFilterRequest.CatalogTypeEnum": CatalogsHotelListProductsByCatalogBasedFilterRequest.CatalogTypeEnum,
        "CatalogsHotelProduct.CatalogTypeEnum": CatalogsHotelProduct.CatalogTypeEnum,
        "CatalogsHotelProductGroup.CatalogTypeEnum": CatalogsHotelProductGroup.CatalogTypeEnum,
        "CatalogsHotelProductGroupCreateRequest.CatalogTypeEnum": CatalogsHotelProductGroupCreateRequest.CatalogTypeEnum,
        "CatalogsHotelProductGroupProductCounts.CatalogTypeEnum": CatalogsHotelProductGroupProductCounts.CatalogTypeEnum,
        "CatalogsHotelProductGroupType": CatalogsHotelProductGroupType,
        "CatalogsHotelProductGroupUpdateRequest.CatalogTypeEnum": CatalogsHotelProductGroupUpdateRequest.CatalogTypeEnum,
        "CatalogsHotelReportParameters.CatalogTypeEnum": CatalogsHotelReportParameters.CatalogTypeEnum,
        "CatalogsHotelReportParametersReport.ReportTypeEnum": CatalogsHotelReportParametersReport.ReportTypeEnum,
        "CatalogsHotelReportStatsParameters.CatalogTypeEnum": CatalogsHotelReportStatsParameters.CatalogTypeEnum,
        "CatalogsHotelReportStatsParametersReport.ReportTypeEnum": CatalogsHotelReportStatsParametersReport.ReportTypeEnum,
        "CatalogsItemValidationIssue": CatalogsItemValidationIssue,
        "CatalogsItemsBatchRequest.LanguageEnum": CatalogsItemsBatchRequest.LanguageEnum,
        "CatalogsItemsCreateBatchRequest.LanguageEnum": CatalogsItemsCreateBatchRequest.LanguageEnum,
        "CatalogsItemsDeleteBatchRequest.LanguageEnum": CatalogsItemsDeleteBatchRequest.LanguageEnum,
        "CatalogsItemsDeleteDiscontinuedBatchRequest.LanguageEnum": CatalogsItemsDeleteDiscontinuedBatchRequest.LanguageEnum,
        "CatalogsItemsRequest.LanguageEnum": CatalogsItemsRequest.LanguageEnum,
        "CatalogsItemsUpdateBatchRequest.LanguageEnum": CatalogsItemsUpdateBatchRequest.LanguageEnum,
        "CatalogsItemsUpsertBatchRequest.LanguageEnum": CatalogsItemsUpsertBatchRequest.LanguageEnum,
        "CatalogsLocale": CatalogsLocale,
        "CatalogsProductGroupFilterOperatorTypeCriteria.FilterOperatorTypeEnum": CatalogsProductGroupFilterOperatorTypeCriteria.FilterOperatorTypeEnum,
        "CatalogsProductGroupPricingCurrencyCriteria.OperatorEnum": CatalogsProductGroupPricingCurrencyCriteria.OperatorEnum,
        "CatalogsProductGroupStatus": CatalogsProductGroupStatus,
        "CatalogsProductGroupType": CatalogsProductGroupType,
        "CatalogsProductGroupUint32Criteria.OperatorEnum": CatalogsProductGroupUint32Criteria.OperatorEnum,
        "CatalogsReport.ReportStatusEnum": CatalogsReport.ReportStatusEnum,
        "CatalogsReportAllItemsFilter.ReportTypeEnum": CatalogsReportAllItemsFilter.ReportTypeEnum,
        "CatalogsReportDistributionIssueFilter.ReportTypeEnum": CatalogsReportDistributionIssueFilter.ReportTypeEnum,
        "CatalogsReportDistributionStats.ReportTypeEnum": CatalogsReportDistributionStats.ReportTypeEnum,
        "CatalogsReportFeedIngestionFilter.ReportTypeEnum": CatalogsReportFeedIngestionFilter.ReportTypeEnum,
        "CatalogsReportFeedIngestionStats.ReportTypeEnum": CatalogsReportFeedIngestionStats.ReportTypeEnum,
        "CatalogsReportFeedIngestionStats.SeverityEnum": CatalogsReportFeedIngestionStats.SeverityEnum,
        "CatalogsReportStats.ReportTypeEnum": CatalogsReportStats.ReportTypeEnum,
        "CatalogsReportStats.SeverityEnum": CatalogsReportStats.SeverityEnum,
        "CatalogsRetailAvailableFilterValues.CatalogTypeEnum": CatalogsRetailAvailableFilterValues.CatalogTypeEnum,
        "CatalogsRetailBatchRequest.CatalogTypeEnum": CatalogsRetailBatchRequest.CatalogTypeEnum,
        "CatalogsRetailBatchRequest.LanguageEnum": CatalogsRetailBatchRequest.LanguageEnum,
        "CatalogsRetailBatchRequestItemsInner.OperationEnum": CatalogsRetailBatchRequestItemsInner.OperationEnum,
        "CatalogsRetailFilterValuesMap.AvailabilityEnum": CatalogsRetailFilterValuesMap.AvailabilityEnum,
        "CatalogsRetailFilterValuesMap.ConditionEnum": CatalogsRetailFilterValuesMap.ConditionEnum,
        "CatalogsRetailFilterValuesMap.GenderEnum": CatalogsRetailFilterValuesMap.GenderEnum,
        "CatalogsRetailFilterValuesMap.MediaTypeEnum": CatalogsRetailFilterValuesMap.MediaTypeEnum,
        "CatalogsRetailItemsFilter.CatalogTypeEnum": CatalogsRetailItemsFilter.CatalogTypeEnum,
        "CatalogsRetailItemsPostFilter.CatalogTypeEnum": CatalogsRetailItemsPostFilter.CatalogTypeEnum,
        "CatalogsRetailListProductsByCatalogBasedFilterRequest.CatalogTypeEnum": CatalogsRetailListProductsByCatalogBasedFilterRequest.CatalogTypeEnum,
        "CatalogsRetailProduct.CatalogTypeEnum": CatalogsRetailProduct.CatalogTypeEnum,
        "CatalogsRetailProductGroup.CatalogTypeEnum": CatalogsRetailProductGroup.CatalogTypeEnum,
        "CatalogsRetailProductGroupCreateRequest.CatalogTypeEnum": CatalogsRetailProductGroupCreateRequest.CatalogTypeEnum,
        "CatalogsRetailProductGroupProductCounts.CatalogTypeEnum": CatalogsRetailProductGroupProductCounts.CatalogTypeEnum,
        "CatalogsRetailProductGroupUpdateRequest.CatalogTypeEnum": CatalogsRetailProductGroupUpdateRequest.CatalogTypeEnum,
        "CatalogsRetailReportParameters.CatalogTypeEnum": CatalogsRetailReportParameters.CatalogTypeEnum,
        "CatalogsRetailReportStatsParameters.CatalogTypeEnum": CatalogsRetailReportStatsParameters.CatalogTypeEnum,
        "CatalogsStatus": CatalogsStatus,
        "CatalogsType": CatalogsType,
        "CatalogsUpdateCreativeAssetsItem.OperationEnum": CatalogsUpdateCreativeAssetsItem.OperationEnum,
        "CatalogsUpdateHotelItem.OperationEnum": CatalogsUpdateHotelItem.OperationEnum,
        "CatalogsUpdateRetailItem.OperationEnum": CatalogsUpdateRetailItem.OperationEnum,
        "CatalogsUpsertCreativeAssetsItem.OperationEnum": CatalogsUpsertCreativeAssetsItem.OperationEnum,
        "CatalogsUpsertHotelItem.OperationEnum": CatalogsUpsertHotelItem.OperationEnum,
        "CatalogsUpsertRetailItem.OperationEnum": CatalogsUpsertRetailItem.OperationEnum,
        "CatalogsVerticalBatchRequest.CatalogTypeEnum": CatalogsVerticalBatchRequest.CatalogTypeEnum,
        "CatalogsVerticalBatchRequest.LanguageEnum": CatalogsVerticalBatchRequest.LanguageEnum,
        "CatalogsVerticalProductGroup.CatalogTypeEnum": CatalogsVerticalProductGroup.CatalogTypeEnum,
        "CatalogsVerticalProductGroupCreateRequest.CatalogTypeEnum": CatalogsVerticalProductGroupCreateRequest.CatalogTypeEnum,
        "CatalogsVerticalProductGroupUpdateRequest.CatalogTypeEnum": CatalogsVerticalProductGroupUpdateRequest.CatalogTypeEnum,
        "CatalogsVerticalsListProductsByCatalogBasedFilterRequest.CatalogTypeEnum": CatalogsVerticalsListProductsByCatalogBasedFilterRequest.CatalogTypeEnum,
        "ContentType": ContentType,
        "ConversionApiResponseEventsInner.StatusEnum": ConversionApiResponseEventsInner.StatusEnum,
        "ConversionAttributionWindowDays": ConversionAttributionWindowDays,
        "ConversionEventDeviceInfo.FormFactorEnum": ConversionEventDeviceInfo.FormFactorEnum,
        "ConversionEventDeviceInfo.NetworkTypeEnum": ConversionEventDeviceInfo.NetworkTypeEnum,
        "ConversionEventDeviceInfo.OsFamilyEnum": ConversionEventDeviceInfo.OsFamilyEnum,
        "ConversionMSOTEvents.AttributionModelEnum": ConversionMSOTEvents.AttributionModelEnum,
        "ConversionMSOTEvents.AttributionScopeEnum": ConversionMSOTEvents.AttributionScopeEnum,
        "ConversionMSOTEvents.EventNameEnum": ConversionMSOTEvents.EventNameEnum,
        "ConversionProductReportRequest.ConversionProductAttributionTypeEnum": ConversionProductReportRequest.ConversionProductAttributionTypeEnum,
        "ConversionProductReportRequest.ConversionProductBreakdownEnum": ConversionProductReportRequest.ConversionProductBreakdownEnum,
        "ConversionProductReportRequest.GranularityEnum": ConversionProductReportRequest.GranularityEnum,
        "ConversionProductReportRequest.LevelEnum": ConversionProductReportRequest.LevelEnum,
        "ConversionProductReportingColumn": ConversionProductReportingColumn,
        "ConversionReportAttributionType": ConversionReportAttributionType,
        "ConversionReportTimeType": ConversionReportTimeType,
        "ConversionTagType": ConversionTagType,
        "Country": Country,
        "CreateMMMReportRequest.GranularityEnum": CreateMMMReportRequest.GranularityEnum,
        "CreateMMMReportRequest.LevelEnum": CreateMMMReportRequest.LevelEnum,
        "CreateMembershipOrPartnershipInvitesBody.BusinessRoleEnum": CreateMembershipOrPartnershipInvitesBody.BusinessRoleEnum,
        "CreativeAssetsVisibilityType": CreativeAssetsVisibilityType,
        "CreativeType": CreativeType,
        "Currency": Currency,
        "CustomerList.StatusEnum": CustomerList.StatusEnum,
        "CustomerListUpload.StateEnum": CustomerListUpload.StateEnum,
        "CustomerListUploadResponse.StateEnum": CustomerListUploadResponse.StateEnum,
        "CustomizableCTAType": CustomizableCTAType,
        "DataOutputFormat": DataOutputFormat,
        "DataStatus": DataStatus,
        "DeletePartnerAssetAccessBodyAccessesInner.PartnerTypeEnum": DeletePartnerAssetAccessBodyAccessesInner.PartnerTypeEnum,
        "DeliveryMetricsResponseItemsInner.CategoryEnum": DeliveryMetricsResponseItemsInner.CategoryEnum,
        "DisclosureType": DisclosureType,
        "EnhancedMatchStatusType": EnhancedMatchStatusType,
        "EntityStatus": EntityStatus,
        "Gender": Gender,
        "GenderBucket": GenderBucket,
        "GetAudiencesOrderBy": GetAudiencesOrderBy,
        "GetBusinessAssetTypeResponse": GetBusinessAssetTypeResponse,
        "GetMMMReportResponseData.ReportStatusEnum": GetMMMReportResponseData.ReportStatusEnum,
        "Granularity": Granularity,
        "GridClickType": GridClickType,
        "ImageBase64.ContentTypeEnum": ImageBase64.ContentTypeEnum,
        "IngestionSourceOptions": IngestionSourceOptions,
        "IntegrationLog.EventTypeEnum": IntegrationLog.EventTypeEnum,
        "IntegrationLog.LogLevelEnum": IntegrationLog.LogLevelEnum,
        "IntegrationLogClientRequest.MethodEnum": IntegrationLogClientRequest.MethodEnum,
        "InterestsEnum": InterestsEnum,
        "InviteStatus": InviteStatus,
        "InviteType": InviteType,
        "ItemProcessingStatus": ItemProcessingStatus,
        "ItemsBatchPostRequest.CatalogTypeEnum": ItemsBatchPostRequest.CatalogTypeEnum,
        "ItemsBatchPostRequest.LanguageEnum": ItemsBatchPostRequest.LanguageEnum,
        "Label.ParentTypeEnum": Label.ParentTypeEnum,
        "LabelBulkUpdateRequest.StatusEnum": LabelBulkUpdateRequest.StatusEnum,
        "LabelParentType": LabelParentType,
        "LabelStatus": LabelStatus,
        "LabelType": LabelType,
        "Language": Language,
        "LeadFormQuestionFieldType": LeadFormQuestionFieldType,
        "LeadFormQuestionType": LeadFormQuestionType,
        "LeadFormStatus": LeadFormStatus,
        "LeadsExportStatus": LeadsExportStatus,
        "LookbackPeriodOptions": LookbackPeriodOptions,
        "MMMReportingColumn": MMMReportingColumn,
        "MMMReportingTargetingType": MMMReportingTargetingType,
        "MatchType": MatchType,
        "MatchTypeResponse": MatchTypeResponse,
        "MediaType": MediaType,
        "MediaUploadStatus": MediaUploadStatus,
        "MediaUploadType": MediaUploadType,
        "MemberBusinessRole": MemberBusinessRole,
        "MetricsReportingLevel": MetricsReportingLevel,
        "NonDraftEntityStatus": NonDraftEntityStatus,
        "NonNullableCatalogsCurrency": NonNullableCatalogsCurrency,
        "NonNullableProductAvailabilityType": NonNullableProductAvailabilityType,
        "NullableCatalogsItemFieldType": NullableCatalogsItemFieldType,
        "NullableCurrency": NullableCurrency,
        "OauthAccessTokenRequestClientCredentials.GrantTypeEnum": OauthAccessTokenRequestClientCredentials.GrantTypeEnum,
        "OauthAccessTokenRequestCode.GrantTypeEnum": OauthAccessTokenRequestCode.GrantTypeEnum,
        "OauthAccessTokenRequestRefresh.GrantTypeEnum": OauthAccessTokenRequestRefresh.GrantTypeEnum,
        "OauthAccessTokenResponse.ResponseTypeEnum": OauthAccessTokenResponse.ResponseTypeEnum,
        "OauthAccessTokenResponseClientCredentials.ResponseTypeEnum": OauthAccessTokenResponseClientCredentials.ResponseTypeEnum,
        "OauthAccessTokenResponseCode.ResponseTypeEnum": OauthAccessTokenResponseCode.ResponseTypeEnum,
        "OauthAccessTokenResponseIntegrationRefresh.ResponseTypeEnum": OauthAccessTokenResponseIntegrationRefresh.ResponseTypeEnum,
        "OauthAccessTokenResponseRefresh.ResponseTypeEnum": OauthAccessTokenResponseRefresh.ResponseTypeEnum,
        "ObjectiveType": ObjectiveType,
        "OperationType": OperationType,
        "OptimizationGoalMetadataConversionTagV3GoalMetadata.ConversionEventEnum": OptimizationGoalMetadataConversionTagV3GoalMetadata.ConversionEventEnum,
        "OptimizationGoalMetadataConversionTagV3GoalMetadata.LearningModeTypeEnum": OptimizationGoalMetadataConversionTagV3GoalMetadata.LearningModeTypeEnum,
        "OptimizationGoalMetadataFrequencyGoalMetadata.TimerangeEnum": OptimizationGoalMetadataFrequencyGoalMetadata.TimerangeEnum,
        "OrderLinePaidType": OrderLinePaidType,
        "OrderLineStatus": OrderLineStatus,
        "OverallStatusOptions": OverallStatusOptions,
        "PacingDeliveryType": PacingDeliveryType,
        "PartnerType": PartnerType,
        "Permissions": Permissions,
        "PermissionsWithOwner": PermissionsWithOwner,
        "PinMedia.MediaTypeEnum": PinMedia.MediaTypeEnum,
        "PinMediaSource.SourceTypeEnum": PinMediaSource.SourceTypeEnum,
        "PinMediaSourceImageBase64.SourceTypeEnum": PinMediaSourceImageBase64.SourceTypeEnum,
        "PinMediaSourceImageURL.SourceTypeEnum": PinMediaSourceImageURL.SourceTypeEnum,
        "PinMediaSourceImagesBase64.SourceTypeEnum": PinMediaSourceImagesBase64.SourceTypeEnum,
        "PinMediaSourceImagesURL.SourceTypeEnum": PinMediaSourceImagesURL.SourceTypeEnum,
        "PinMediaSourcePinURL.SourceTypeEnum": PinMediaSourcePinURL.SourceTypeEnum,
        "PinMediaSourceVideoID.SourceTypeEnum": PinMediaSourceVideoID.SourceTypeEnum,
        "PinMediaWithImage.MediaTypeEnum": PinMediaWithImage.MediaTypeEnum,
        "PinMediaWithImageAndVideo.MediaTypeEnum": PinMediaWithImageAndVideo.MediaTypeEnum,
        "PinMediaWithImages.MediaTypeEnum": PinMediaWithImages.MediaTypeEnum,
        "PinMediaWithVideo.MediaTypeEnum": PinMediaWithVideo.MediaTypeEnum,
        "PinMediaWithVideos.MediaTypeEnum": PinMediaWithVideos.MediaTypeEnum,
        "PinPromotionSummaryStatus": PinPromotionSummaryStatus,
        "PinterestLibPaginationOrder": PinterestLibPaginationOrder,
        "PinterestLibStatus204.StatusCodeEnum": PinterestLibStatus204.StatusCodeEnum,
        "PlacementGroupType": PlacementGroupType,
        "PlacementMultipliers.PLACEMENTEnum": PlacementMultipliers.PLACEMENTEnum,
        "ProductAvailabilityType": ProductAvailabilityType,
        "ProductCategoriesEngagementType": ProductCategoriesEngagementType,
        "ProductCategoryDetailLookbackWindow": ProductCategoryDetailLookbackWindow,
        "ProductCategoryEnum": ProductCategoryEnum,
        "ProductCategoryRegion": ProductCategoryRegion,
        "ProductGroupPromotion.CollectionsHeaderTypeEnum": ProductGroupPromotion.CollectionsHeaderTypeEnum,
        "ProductGroupPromotion.CustomizableCtaTypeEnum": ProductGroupPromotion.CustomizableCtaTypeEnum,
        "ProductGroupPromotion.PreferredMediaTypeEnum": ProductGroupPromotion.PreferredMediaTypeEnum,
        "ProductGroupSummaryStatus": ProductGroupSummaryStatus,
        "PromotionCommon.DiscountStatusEnum": PromotionCommon.DiscountStatusEnum,
        "PromotionCreateRequest.DiscountStatusEnum": PromotionCreateRequest.DiscountStatusEnum,
        "PromotionResponse.DiscountStatusEnum": PromotionResponse.DiscountStatusEnum,
        "PromotionType": PromotionType,
        "PromotionUpdateRequest.DiscountStatusEnum": PromotionUpdateRequest.DiscountStatusEnum,
        "QuizPinData.TieBreakerTypeEnum": QuizPinData.TieBreakerTypeEnum,
        "ReportingColumnAsync": ReportingColumnAsync,
        "ReportingTimeZone": ReportingTimeZone,
        "Role": Role,
        "SSIOCreateInsertionOrderRequest.OrderLineTypeEnum": SSIOCreateInsertionOrderRequest.OrderLineTypeEnum,
        "SharedAudienceAccount.AccountTypeEnum": SharedAudienceAccount.AccountTypeEnum,
        "SourcePlatformOptions": SourcePlatformOptions,
        "TargetingAdvertiserCountry": TargetingAdvertiserCountry,
        "TargetingSpec.TARGETINGSTRATEGYEnum": TargetingSpec.TARGETINGSTRATEGYEnum,
        "TargetingSpecAgeBucket": TargetingSpecAgeBucket,
        "TargetingSpecAppType": TargetingSpecAppType,
        "TargetingSpecGender": TargetingSpecGender,
        "TargetingSpecOperationAgeBucket.FieldEnum": TargetingSpecOperationAgeBucket.FieldEnum,
        "TargetingSpecOperationAgeBucket.OperationEnum": TargetingSpecOperationAgeBucket.OperationEnum,
        "TargetingSpecOperationAppType.FieldEnum": TargetingSpecOperationAppType.FieldEnum,
        "TargetingSpecOperationAppType.OperationEnum": TargetingSpecOperationAppType.OperationEnum,
        "TargetingSpecOperationGender.FieldEnum": TargetingSpecOperationGender.FieldEnum,
        "TargetingSpecOperationGender.OperationEnum": TargetingSpecOperationGender.OperationEnum,
        "TargetingSpecOperationList.OperationEnum": TargetingSpecOperationList.OperationEnum,
        "TargetingSpecOperationMinMaxAge.FieldEnum": TargetingSpecOperationMinMaxAge.FieldEnum,
        "TargetingSpecOperationMinMaxAge.OperationEnum": TargetingSpecOperationMinMaxAge.OperationEnum,
        "TargetingSpecOperationShoppingRetargeting.FieldEnum": TargetingSpecOperationShoppingRetargeting.FieldEnum,
        "TargetingSpecOperationShoppingRetargeting.OperationEnum": TargetingSpecOperationShoppingRetargeting.OperationEnum,
        "TargetingSpecOperationString.OperationEnum": TargetingSpecOperationString.OperationEnum,
        "TargetingTemplateGetResponseData.StatusEnum": TargetingTemplateGetResponseData.StatusEnum,
        "TargetingTemplateResponseData.StatusEnum": TargetingTemplateResponseData.StatusEnum,
        "TargetingTemplateUpdateRequest.OperationTypeEnum": TargetingTemplateUpdateRequest.OperationTypeEnum,
        "TargetingTypeFilter.TargetingTypesEnum": TargetingTypeFilter.TargetingTypesEnum,
        "TemplateResponse.ColumnsEnum": TemplateResponse.ColumnsEnum,
        "TemplateResponse.ConversionReportTimeTypeEnum": TemplateResponse.ConversionReportTimeTypeEnum,
        "TemplateResponse.CreationSourceEnum": TemplateResponse.CreationSourceEnum,
        "TemplateResponse.IngestionSourcesEnum": TemplateResponse.IngestionSourcesEnum,
        "TemplateResponse.TypeEnum": TemplateResponse.TypeEnum,
        "TemplateResponseDateRangeDynamicDateRange.RangeEnum": TemplateResponseDateRangeDynamicDateRange.RangeEnum,
        "TopPinsAnalyticsResponse.SortByEnum": TopPinsAnalyticsResponse.SortByEnum,
        "TopVideoPinsAnalyticsResponse.SortByEnum": TopVideoPinsAnalyticsResponse.SortByEnum,
        "TrendType": TrendType,
        "TrendingKeywordDemographicsAgeDistribution.AgeDistributionEnum": TrendingKeywordDemographicsAgeDistribution.AgeDistributionEnum,
        "TrendingKeywordDemographicsGenderDistribution.GenderDistributionEnum": TrendingKeywordDemographicsGenderDistribution.GenderDistributionEnum,
        "TrendsSupportedRegion": TrendsSupportedRegion,
        "UpdateMaskBidOptionField": UpdateMaskBidOptionField,
        "UpdateMaskFieldType": UpdateMaskFieldType,
        "UserFollowingFeedType": UserFollowingFeedType,
        "UserListOperationType": UserListOperationType,
        "UserListType": UserListType,
        "UserWebsiteVerifyRequest.VerificationMethodEnum": UserWebsiteVerifyRequest.VerificationMethodEnum,
        "VerticalProductCategory": VerticalProductCategory,
}

let typeMap: {[index: string]: any} = {
    "Account": Account,
    "AdAccount": AdAccount,
    "AdAccountAnalyticsResponseInner": AdAccountAnalyticsResponseInner,
    "AdAccountCreate": AdAccountCreate,
    "AdAccountCreateSubscriptionRequest": AdAccountCreateSubscriptionRequest,
    "AdAccountCreateSubscriptionRequestPartnerMetadata": AdAccountCreateSubscriptionRequestPartnerMetadata,
    "AdAccountCreateSubscriptionResponse": AdAccountCreateSubscriptionResponse,
    "AdAccountGetSubscriptionResponse": AdAccountGetSubscriptionResponse,
    "AdAccountOwner": AdAccountOwner,
    "AdAccountsAudiencesSharedAccountsList200Response": AdAccountsAudiencesSharedAccountsList200Response,
    "AdAccountsCountryResponse": AdAccountsCountryResponse,
    "AdAccountsCountryResponseData": AdAccountsCountryResponseData,
    "AdAccountsList200Response": AdAccountsList200Response,
    "AdAccountsSubscriptionsGetList200Response": AdAccountsSubscriptionsGetList200Response,
    "AdArrayResponse": AdArrayResponse,
    "AdArrayResponseElement": AdArrayResponseElement,
    "AdCommon": AdCommon,
    "AdCreateRequest": AdCreateRequest,
    "AdGroupArrayResponse": AdGroupArrayResponse,
    "AdGroupArrayResponseElement": AdGroupArrayResponseElement,
    "AdGroupAudienceSizingRequest": AdGroupAudienceSizingRequest,
    "AdGroupAudienceSizingRequestKeywordsInner": AdGroupAudienceSizingRequestKeywordsInner,
    "AdGroupAudienceSizingResponse": AdGroupAudienceSizingResponse,
    "AdGroupCommon": AdGroupCommon,
    "AdGroupCreateRequest": AdGroupCreateRequest,
    "AdGroupIdFilter": AdGroupIdFilter,
    "AdGroupResponse": AdGroupResponse,
    "AdGroupUpdateRequest": AdGroupUpdateRequest,
    "AdGroupsAnalyticsResponseInner": AdGroupsAnalyticsResponseInner,
    "AdGroupsList200Response": AdGroupsList200Response,
    "AdPinAnalytics": AdPinAnalytics,
    "AdPinId": AdPinId,
    "AdPreviewCreateFromImage": AdPreviewCreateFromImage,
    "AdPreviewCreateFromPin": AdPreviewCreateFromPin,
    "AdPreviewRequest": AdPreviewRequest,
    "AdPreviewShopping": AdPreviewShopping,
    "AdPreviewURLResponse": AdPreviewURLResponse,
    "AdResponse": AdResponse,
    "AdUpdateRequest": AdUpdateRequest,
    "AdsAnalyticsCreateAsyncRequest": AdsAnalyticsCreateAsyncRequest,
    "AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics": AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics,
    "AdsAnalyticsCreateAsyncResponse": AdsAnalyticsCreateAsyncResponse,
    "AdsAnalyticsGetAsyncResponse": AdsAnalyticsGetAsyncResponse,
    "AdsAnalyticsMetricsFilter": AdsAnalyticsMetricsFilter,
    "AdsAnalyticsResponseInner": AdsAnalyticsResponseInner,
    "AdsCreditDiscountsResponse": AdsCreditDiscountsResponse,
    "AdsCreditRedeemRequest": AdsCreditRedeemRequest,
    "AdsCreditRedeemResponse": AdsCreditRedeemResponse,
    "AdsCreditsDiscountsGet200Response": AdsCreditsDiscountsGet200Response,
    "AdsList200Response": AdsList200Response,
    "AdvancedAuctionBidOptions": AdvancedAuctionBidOptions,
    "AdvancedAuctionItem": AdvancedAuctionItem,
    "AdvancedAuctionItems": AdvancedAuctionItems,
    "AdvancedAuctionItemsGetRecord": AdvancedAuctionItemsGetRecord,
    "AdvancedAuctionItemsGetRequest": AdvancedAuctionItemsGetRequest,
    "AdvancedAuctionItemsSubmitDeleteRecord": AdvancedAuctionItemsSubmitDeleteRecord,
    "AdvancedAuctionItemsSubmitRecord": AdvancedAuctionItemsSubmitRecord,
    "AdvancedAuctionItemsSubmitRequest": AdvancedAuctionItemsSubmitRequest,
    "AdvancedAuctionItemsSubmitUpsertRecord": AdvancedAuctionItemsSubmitUpsertRecord,
    "AdvancedAuctionKey": AdvancedAuctionKey,
    "AdvancedAuctionOperationError": AdvancedAuctionOperationError,
    "AdvancedAuctionProcessedItems": AdvancedAuctionProcessedItems,
    "AdvertiserDefinedEvent": AdvertiserDefinedEvent,
    "AdvertiserDefinedEventsResponse": AdvertiserDefinedEventsResponse,
    "AllOf": AllOf,
    "AmazonConnectRequest": AmazonConnectRequest,
    "AnalyticsDailyMetrics": AnalyticsDailyMetrics,
    "AnalyticsMetricsResponse": AnalyticsMetricsResponse,
    "AnyOf": AnyOf,
    "AppTypeMultipliers": AppTypeMultipliers,
    "AssetGroupBinding": AssetGroupBinding,
    "AssetIdPermissions": AssetIdPermissions,
    "Audience": Audience,
    "AudienceCategory": AudienceCategory,
    "AudienceCommon": AudienceCommon,
    "AudienceCreateRequest": AudienceCreateRequest,
    "AudienceDefinition": AudienceDefinition,
    "AudienceDefinitionResponse": AudienceDefinitionResponse,
    "AudienceDefinitionScope": AudienceDefinitionScope,
    "AudienceDefinitionType": AudienceDefinitionType,
    "AudienceDemographicValue": AudienceDemographicValue,
    "AudienceDemographics": AudienceDemographics,
    "AudienceInsightCategoryArrayResponse": AudienceInsightCategoryArrayResponse,
    "AudienceInsightCategoryCommon": AudienceInsightCategoryCommon,
    "AudienceInsightsResponse": AudienceInsightsResponse,
    "AudienceRule": AudienceRule,
    "AudienceSubcategory": AudienceSubcategory,
    "AudienceUpdateRequest": AudienceUpdateRequest,
    "AudiencesList200Response": AudiencesList200Response,
    "AuthRespondInvitesBody": AuthRespondInvitesBody,
    "AuthRespondInvitesBodyInvitesInner": AuthRespondInvitesBodyInvitesInner,
    "AuthRespondInvitesBodyInvitesInnerAction": AuthRespondInvitesBodyInvitesInnerAction,
    "AvailabilityFilter": AvailabilityFilter,
    "BaseInviteDataResponse": BaseInviteDataResponse,
    "BaseInviteDataResponseInviteData": BaseInviteDataResponseInviteData,
    "BidFloor": BidFloor,
    "BidFloorRequest": BidFloorRequest,
    "BidFloorSpec": BidFloorSpec,
    "BillingInvoiceDownloadResponse": BillingInvoiceDownloadResponse,
    "BillingInvoiceResponse": BillingInvoiceResponse,
    "BillingInvoicesGet200Response": BillingInvoicesGet200Response,
    "BillingProfilesGet200Response": BillingProfilesGet200Response,
    "BillingProfilesResponse": BillingProfilesResponse,
    "Board": Board,
    "BoardBase": BoardBase,
    "BoardCreate": BoardCreate,
    "BoardMedia": BoardMedia,
    "BoardOwner": BoardOwner,
    "BoardSection": BoardSection,
    "BoardSectionsList200Response": BoardSectionsList200Response,
    "BoardWithUpdatePrivacy": BoardWithUpdatePrivacy,
    "BoardWithUpdatePrivacyUpdate": BoardWithUpdatePrivacyUpdate,
    "BoardsList200Response": BoardsList200Response,
    "BoardsListPins200Response": BoardsListPins200Response,
    "BoardsUserFollowsList200Response": BoardsUserFollowsList200Response,
    "BookClosedResponse": BookClosedResponse,
    "BrandAccountsCreate200Response": BrandAccountsCreate200Response,
    "BrandAccountsCreateRequest": BrandAccountsCreateRequest,
    "BrandAccountsUpdateRequest": BrandAccountsUpdateRequest,
    "BrandFilter": BrandFilter,
    "BulkDownloadRequest": BulkDownloadRequest,
    "BulkDownloadRequestCampaignFilter": BulkDownloadRequestCampaignFilter,
    "BulkDownloadResponse": BulkDownloadResponse,
    "BulkUpsertRequest": BulkUpsertRequest,
    "BulkUpsertRequestCreate": BulkUpsertRequestCreate,
    "BulkUpsertRequestUpdate": BulkUpsertRequestUpdate,
    "BulkUpsertResponse": BulkUpsertResponse,
    "BulkUpsertStatusResponse": BulkUpsertStatusResponse,
    "BusinessAccessError": BusinessAccessError,
    "BusinessAccessUserSummary": BusinessAccessUserSummary,
    "BusinessAssetMembersGet200Response": BusinessAssetMembersGet200Response,
    "BusinessAssetPartnersGet200Response": BusinessAssetPartnersGet200Response,
    "BusinessAssetsGet200Response": BusinessAssetsGet200Response,
    "BusinessMemberAssetsGet200Response": BusinessMemberAssetsGet200Response,
    "BusinessMemberAssetsSummary": BusinessMemberAssetsSummary,
    "BusinessMemberAssetsSummaryAdAccountsInner": BusinessMemberAssetsSummaryAdAccountsInner,
    "BusinessMemberAssetsSummaryProfilesInner": BusinessMemberAssetsSummaryProfilesInner,
    "BusinessMembersAssetAccessDeleteRequest": BusinessMembersAssetAccessDeleteRequest,
    "BusinessMembersAssetAccessDeleteRequestAccessesInner": BusinessMembersAssetAccessDeleteRequestAccessesInner,
    "BusinessPartnerAssetAccessGet200Response": BusinessPartnerAssetAccessGet200Response,
    "BusinessSharedAudience": BusinessSharedAudience,
    "BusinessSharedAudienceResponse": BusinessSharedAudienceResponse,
    "CampaignAudienceMultipliers": CampaignAudienceMultipliers,
    "CampaignBidOptions": CampaignBidOptions,
    "CampaignBidOptionsCreate": CampaignBidOptionsCreate,
    "CampaignBidOptionsUpdate": CampaignBidOptionsUpdate,
    "CampaignCommon": CampaignCommon,
    "CampaignCreateCommon": CampaignCreateCommon,
    "CampaignCreateRequest": CampaignCreateRequest,
    "CampaignCreateResponse": CampaignCreateResponse,
    "CampaignCreateResponseData": CampaignCreateResponseData,
    "CampaignCreateResponseItem": CampaignCreateResponseItem,
    "CampaignId": CampaignId,
    "CampaignIdFilter": CampaignIdFilter,
    "CampaignObjectivesFilter": CampaignObjectivesFilter,
    "CampaignResponse": CampaignResponse,
    "CampaignUpdateRequest": CampaignUpdateRequest,
    "CampaignUpdateResponse": CampaignUpdateResponse,
    "CampaignsAnalyticsResponseInner": CampaignsAnalyticsResponseInner,
    "CampaignsList200Response": CampaignsList200Response,
    "CancelInvitesBody": CancelInvitesBody,
    "CarouselSlot": CarouselSlot,
    "Catalog": Catalog,
    "CatalogsAvailableFilterValues": CatalogsAvailableFilterValues,
    "CatalogsCreateCreativeAssetsItem": CatalogsCreateCreativeAssetsItem,
    "CatalogsCreateHotelItem": CatalogsCreateHotelItem,
    "CatalogsCreateReportResponse": CatalogsCreateReportResponse,
    "CatalogsCreateRequest": CatalogsCreateRequest,
    "CatalogsCreateRetailItem": CatalogsCreateRetailItem,
    "CatalogsCreativeAssetsAttributes": CatalogsCreativeAssetsAttributes,
    "CatalogsCreativeAssetsAvailableFilterValues": CatalogsCreativeAssetsAvailableFilterValues,
    "CatalogsCreativeAssetsBatchItem": CatalogsCreativeAssetsBatchItem,
    "CatalogsCreativeAssetsBatchRequest": CatalogsCreativeAssetsBatchRequest,
    "CatalogsCreativeAssetsFeed": CatalogsCreativeAssetsFeed,
    "CatalogsCreativeAssetsFeedsCreateRequest": CatalogsCreativeAssetsFeedsCreateRequest,
    "CatalogsCreativeAssetsFeedsUpdateRequest": CatalogsCreativeAssetsFeedsUpdateRequest,
    "CatalogsCreativeAssetsFilterValuesMap": CatalogsCreativeAssetsFilterValuesMap,
    "CatalogsCreativeAssetsItemErrorResponse": CatalogsCreativeAssetsItemErrorResponse,
    "CatalogsCreativeAssetsItemResponse": CatalogsCreativeAssetsItemResponse,
    "CatalogsCreativeAssetsItemsBatch": CatalogsCreativeAssetsItemsBatch,
    "CatalogsCreativeAssetsItemsFilter": CatalogsCreativeAssetsItemsFilter,
    "CatalogsCreativeAssetsItemsPostFilter": CatalogsCreativeAssetsItemsPostFilter,
    "CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest": CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest,
    "CatalogsCreativeAssetsProduct": CatalogsCreativeAssetsProduct,
    "CatalogsCreativeAssetsProductGroup": CatalogsCreativeAssetsProductGroup,
    "CatalogsCreativeAssetsProductGroupCreateRequest": CatalogsCreativeAssetsProductGroupCreateRequest,
    "CatalogsCreativeAssetsProductGroupFilterKeys": CatalogsCreativeAssetsProductGroupFilterKeys,
    "CatalogsCreativeAssetsProductGroupFilters": CatalogsCreativeAssetsProductGroupFilters,
    "CatalogsCreativeAssetsProductGroupFiltersAllOf": CatalogsCreativeAssetsProductGroupFiltersAllOf,
    "CatalogsCreativeAssetsProductGroupFiltersAnyOf": CatalogsCreativeAssetsProductGroupFiltersAnyOf,
    "CatalogsCreativeAssetsProductGroupProductCounts": CatalogsCreativeAssetsProductGroupProductCounts,
    "CatalogsCreativeAssetsProductGroupUpdateRequest": CatalogsCreativeAssetsProductGroupUpdateRequest,
    "CatalogsCreativeAssetsProductMetadata": CatalogsCreativeAssetsProductMetadata,
    "CatalogsDbItem": CatalogsDbItem,
    "CatalogsDeleteCreativeAssetsItem": CatalogsDeleteCreativeAssetsItem,
    "CatalogsDeleteHotelItem": CatalogsDeleteHotelItem,
    "CatalogsDeleteRetailItem": CatalogsDeleteRetailItem,
    "CatalogsFeed": CatalogsFeed,
    "CatalogsFeedCredentials": CatalogsFeedCredentials,
    "CatalogsFeedIngestion": CatalogsFeedIngestion,
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
    "CatalogsFeedVideoCounts": CatalogsFeedVideoCounts,
    "CatalogsFeedsCreateRequest": CatalogsFeedsCreateRequest,
    "CatalogsFeedsCreateRequestDefaultLocale": CatalogsFeedsCreateRequestDefaultLocale,
    "CatalogsFeedsUpdateRequest": CatalogsFeedsUpdateRequest,
    "CatalogsHotelAddress": CatalogsHotelAddress,
    "CatalogsHotelAttributes": CatalogsHotelAttributes,
    "CatalogsHotelAttributesAllOfMainImage": CatalogsHotelAttributesAllOfMainImage,
    "CatalogsHotelAvailableFilterValues": CatalogsHotelAvailableFilterValues,
    "CatalogsHotelBatchItem": CatalogsHotelBatchItem,
    "CatalogsHotelBatchRequest": CatalogsHotelBatchRequest,
    "CatalogsHotelFeed": CatalogsHotelFeed,
    "CatalogsHotelFeedsCreateRequest": CatalogsHotelFeedsCreateRequest,
    "CatalogsHotelFeedsUpdateRequest": CatalogsHotelFeedsUpdateRequest,
    "CatalogsHotelFilterValuesMap": CatalogsHotelFilterValuesMap,
    "CatalogsHotelGuestRatings": CatalogsHotelGuestRatings,
    "CatalogsHotelItemErrorResponse": CatalogsHotelItemErrorResponse,
    "CatalogsHotelItemResponse": CatalogsHotelItemResponse,
    "CatalogsHotelItemsBatch": CatalogsHotelItemsBatch,
    "CatalogsHotelItemsFilter": CatalogsHotelItemsFilter,
    "CatalogsHotelItemsPostFilter": CatalogsHotelItemsPostFilter,
    "CatalogsHotelListProductsByCatalogBasedFilterRequest": CatalogsHotelListProductsByCatalogBasedFilterRequest,
    "CatalogsHotelProduct": CatalogsHotelProduct,
    "CatalogsHotelProductGroup": CatalogsHotelProductGroup,
    "CatalogsHotelProductGroupCreateRequest": CatalogsHotelProductGroupCreateRequest,
    "CatalogsHotelProductGroupFilterKeys": CatalogsHotelProductGroupFilterKeys,
    "CatalogsHotelProductGroupFilters": CatalogsHotelProductGroupFilters,
    "CatalogsHotelProductGroupFiltersAllOf": CatalogsHotelProductGroupFiltersAllOf,
    "CatalogsHotelProductGroupFiltersAnyOf": CatalogsHotelProductGroupFiltersAnyOf,
    "CatalogsHotelProductGroupProductCounts": CatalogsHotelProductGroupProductCounts,
    "CatalogsHotelProductGroupUpdateRequest": CatalogsHotelProductGroupUpdateRequest,
    "CatalogsHotelProductMetadata": CatalogsHotelProductMetadata,
    "CatalogsHotelReportParameters": CatalogsHotelReportParameters,
    "CatalogsHotelReportParametersReport": CatalogsHotelReportParametersReport,
    "CatalogsHotelReportStatsParameters": CatalogsHotelReportStatsParameters,
    "CatalogsHotelReportStatsParametersReport": CatalogsHotelReportStatsParametersReport,
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
    "CatalogsItemsPostFilters": CatalogsItemsPostFilters,
    "CatalogsItemsRequest": CatalogsItemsRequest,
    "CatalogsItemsUpdateBatchRequest": CatalogsItemsUpdateBatchRequest,
    "CatalogsItemsUpsertBatchRequest": CatalogsItemsUpsertBatchRequest,
    "CatalogsList200Response": CatalogsList200Response,
    "CatalogsListProductsByFeedBasedFilter": CatalogsListProductsByFeedBasedFilter,
    "CatalogsListProductsByFilterRequest": CatalogsListProductsByFilterRequest,
    "CatalogsProduct": CatalogsProduct,
    "CatalogsProductGroupCreateRequest": CatalogsProductGroupCreateRequest,
    "CatalogsProductGroupCurrencyCriteria": CatalogsProductGroupCurrencyCriteria,
    "CatalogsProductGroupFilterKeys": CatalogsProductGroupFilterKeys,
    "CatalogsProductGroupFilterOperatorTypeCriteria": CatalogsProductGroupFilterOperatorTypeCriteria,
    "CatalogsProductGroupFilters": CatalogsProductGroupFilters,
    "CatalogsProductGroupFiltersAllOf": CatalogsProductGroupFiltersAllOf,
    "CatalogsProductGroupFiltersAnyOf": CatalogsProductGroupFiltersAnyOf,
    "CatalogsProductGroupFiltersRequest": CatalogsProductGroupFiltersRequest,
    "CatalogsProductGroupMultipleCountriesCriteria": CatalogsProductGroupMultipleCountriesCriteria,
    "CatalogsProductGroupMultipleGenderCriteria": CatalogsProductGroupMultipleGenderCriteria,
    "CatalogsProductGroupMultipleMediaTypesCriteria": CatalogsProductGroupMultipleMediaTypesCriteria,
    "CatalogsProductGroupMultipleStringCriteria": CatalogsProductGroupMultipleStringCriteria,
    "CatalogsProductGroupMultipleStringListCriteria": CatalogsProductGroupMultipleStringListCriteria,
    "CatalogsProductGroupPinsList200Response": CatalogsProductGroupPinsList200Response,
    "CatalogsProductGroupPricingCriteria": CatalogsProductGroupPricingCriteria,
    "CatalogsProductGroupPricingCurrencyCriteria": CatalogsProductGroupPricingCurrencyCriteria,
    "CatalogsProductGroupProductCountsVertical": CatalogsProductGroupProductCountsVertical,
    "CatalogsProductGroupUint32Criteria": CatalogsProductGroupUint32Criteria,
    "CatalogsProductGroupUpdateRequest": CatalogsProductGroupUpdateRequest,
    "CatalogsProductGroupsList200Response": CatalogsProductGroupsList200Response,
    "CatalogsProductGroupsUpdateRequest": CatalogsProductGroupsUpdateRequest,
    "CatalogsReport": CatalogsReport,
    "CatalogsReportAllItemsFilter": CatalogsReportAllItemsFilter,
    "CatalogsReportDistributionIssueFilter": CatalogsReportDistributionIssueFilter,
    "CatalogsReportDistributionStats": CatalogsReportDistributionStats,
    "CatalogsReportFeedIngestionFilter": CatalogsReportFeedIngestionFilter,
    "CatalogsReportFeedIngestionStats": CatalogsReportFeedIngestionStats,
    "CatalogsReportParameters": CatalogsReportParameters,
    "CatalogsReportStats": CatalogsReportStats,
    "CatalogsRetailAvailableFilterValues": CatalogsRetailAvailableFilterValues,
    "CatalogsRetailBatchRequest": CatalogsRetailBatchRequest,
    "CatalogsRetailBatchRequestItemsInner": CatalogsRetailBatchRequestItemsInner,
    "CatalogsRetailFeed": CatalogsRetailFeed,
    "CatalogsRetailFeedsCreateRequest": CatalogsRetailFeedsCreateRequest,
    "CatalogsRetailFeedsUpdateRequest": CatalogsRetailFeedsUpdateRequest,
    "CatalogsRetailFilterValuesMap": CatalogsRetailFilterValuesMap,
    "CatalogsRetailItemErrorResponse": CatalogsRetailItemErrorResponse,
    "CatalogsRetailItemResponse": CatalogsRetailItemResponse,
    "CatalogsRetailItemsBatch": CatalogsRetailItemsBatch,
    "CatalogsRetailItemsFilter": CatalogsRetailItemsFilter,
    "CatalogsRetailItemsPostFilter": CatalogsRetailItemsPostFilter,
    "CatalogsRetailListProductsByCatalogBasedFilterRequest": CatalogsRetailListProductsByCatalogBasedFilterRequest,
    "CatalogsRetailProduct": CatalogsRetailProduct,
    "CatalogsRetailProductGroup": CatalogsRetailProductGroup,
    "CatalogsRetailProductGroupCreateRequest": CatalogsRetailProductGroupCreateRequest,
    "CatalogsRetailProductGroupProductCounts": CatalogsRetailProductGroupProductCounts,
    "CatalogsRetailProductGroupUpdateRequest": CatalogsRetailProductGroupUpdateRequest,
    "CatalogsRetailProductMetadata": CatalogsRetailProductMetadata,
    "CatalogsRetailReportParameters": CatalogsRetailReportParameters,
    "CatalogsRetailReportStatsParameters": CatalogsRetailReportStatsParameters,
    "CatalogsUpdatableCreativeAssetsAttributes": CatalogsUpdatableCreativeAssetsAttributes,
    "CatalogsUpdatableHotelAttributes": CatalogsUpdatableHotelAttributes,
    "CatalogsUpdateCreativeAssetsItem": CatalogsUpdateCreativeAssetsItem,
    "CatalogsUpdateHotelItem": CatalogsUpdateHotelItem,
    "CatalogsUpdateRetailItem": CatalogsUpdateRetailItem,
    "CatalogsUpsertCreativeAssetsItem": CatalogsUpsertCreativeAssetsItem,
    "CatalogsUpsertHotelItem": CatalogsUpsertHotelItem,
    "CatalogsUpsertRetailItem": CatalogsUpsertRetailItem,
    "CatalogsVerticalBatchRequest": CatalogsVerticalBatchRequest,
    "CatalogsVerticalFeedsCreateRequest": CatalogsVerticalFeedsCreateRequest,
    "CatalogsVerticalFeedsUpdateRequest": CatalogsVerticalFeedsUpdateRequest,
    "CatalogsVerticalProductGroup": CatalogsVerticalProductGroup,
    "CatalogsVerticalProductGroupCreateRequest": CatalogsVerticalProductGroupCreateRequest,
    "CatalogsVerticalProductGroupUpdateRequest": CatalogsVerticalProductGroupUpdateRequest,
    "CatalogsVerticalsListProductsByCatalogBasedFilterRequest": CatalogsVerticalsListProductsByCatalogBasedFilterRequest,
    "ConditionFilter": ConditionFilter,
    "ConversionAccessTokenResponse": ConversionAccessTokenResponse,
    "ConversionApiResponse": ConversionApiResponse,
    "ConversionApiResponseEventsInner": ConversionApiResponseEventsInner,
    "ConversionEventAppInfo": ConversionEventAppInfo,
    "ConversionEventDeviceInfo": ConversionEventDeviceInfo,
    "ConversionEventResponse": ConversionEventResponse,
    "ConversionEvents": ConversionEvents,
    "ConversionEventsDataInner": ConversionEventsDataInner,
    "ConversionEventsDataInnerCustomData": ConversionEventsDataInnerCustomData,
    "ConversionEventsDataInnerCustomDataContentsInner": ConversionEventsDataInnerCustomDataContentsInner,
    "ConversionEventsUserData": ConversionEventsUserData,
    "ConversionEventsUserDataProperties": ConversionEventsUserDataProperties,
    "ConversionHealthSelectionItem": ConversionHealthSelectionItem,
    "ConversionMSOTEvents": ConversionMSOTEvents,
    "ConversionProductReportRequest": ConversionProductReportRequest,
    "ConversionTag": ConversionTag,
    "ConversionTagCommon": ConversionTagCommon,
    "ConversionTagConfigs": ConversionTagConfigs,
    "ConversionTagCreate": ConversionTagCreate,
    "ConversionTagListResponse": ConversionTagListResponse,
    "ConversionTagResponse": ConversionTagResponse,
    "ConversionTagsList200Response": ConversionTagsList200Response,
    "CountryFilter": CountryFilter,
    "CreateAssetAccessRequestBody": CreateAssetAccessRequestBody,
    "CreateAssetAccessRequestBodyAssetRequestsInner": CreateAssetAccessRequestBodyAssetRequestsInner,
    "CreateAssetAccessRequestErrorMessageInner": CreateAssetAccessRequestErrorMessageInner,
    "CreateAssetAccessRequestResponse": CreateAssetAccessRequestResponse,
    "CreateAssetGroupBody": CreateAssetGroupBody,
    "CreateAssetGroupResponse": CreateAssetGroupResponse,
    "CreateAssetInvitesRequest": CreateAssetInvitesRequest,
    "CreateAssetInvitesRequestItem": CreateAssetInvitesRequestItem,
    "CreateInvitesResultsResponseArray": CreateInvitesResultsResponseArray,
    "CreateInvitesResultsResponseArrayItemsInner": CreateInvitesResultsResponseArrayItemsInner,
    "CreateInvitesResultsResponseArrayItemsInnerInvite": CreateInvitesResultsResponseArrayItemsInnerInvite,
    "CreateMMMReportRequest": CreateMMMReportRequest,
    "CreateMMMReportResponse": CreateMMMReportResponse,
    "CreateMMMReportResponseData": CreateMMMReportResponseData,
    "CreateMembershipOrPartnershipInvitesBody": CreateMembershipOrPartnershipInvitesBody,
    "CreativeAssetsIdFilter": CreativeAssetsIdFilter,
    "CreativeAssetsProcessingRecord": CreativeAssetsProcessingRecord,
    "CurrencyFilter": CurrencyFilter,
    "CustomLabel0Filter": CustomLabel0Filter,
    "CustomLabel1Filter": CustomLabel1Filter,
    "CustomLabel2Filter": CustomLabel2Filter,
    "CustomLabel3Filter": CustomLabel3Filter,
    "CustomLabel4Filter": CustomLabel4Filter,
    "CustomNumber0Filter": CustomNumber0Filter,
    "CustomNumber1Filter": CustomNumber1Filter,
    "CustomNumber2Filter": CustomNumber2Filter,
    "CustomNumber3Filter": CustomNumber3Filter,
    "CustomNumber4Filter": CustomNumber4Filter,
    "CustomerList": CustomerList,
    "CustomerListRequest": CustomerListRequest,
    "CustomerListUpdateRequest": CustomerListUpdateRequest,
    "CustomerListUpload": CustomerListUpload,
    "CustomerListUploadCreateRequest": CustomerListUploadCreateRequest,
    "CustomerListUploadCreateResponse": CustomerListUploadCreateResponse,
    "CustomerListUploadResponse": CustomerListUploadResponse,
    "CustomerListsList200Response": CustomerListsList200Response,
    "DeleteAssetGroupBody": DeleteAssetGroupBody,
    "DeleteAssetGroupResponse": DeleteAssetGroupResponse,
    "DeleteAssetGroupResponseExceptionsInner": DeleteAssetGroupResponseExceptionsInner,
    "DeleteInvitesResultsResponseArray": DeleteInvitesResultsResponseArray,
    "DeleteInvitesResultsResponseArrayItemsInner": DeleteInvitesResultsResponseArrayItemsInner,
    "DeleteInvitesResultsResponseArrayItemsInnerException": DeleteInvitesResultsResponseArrayItemsInnerException,
    "DeleteMemberAccessResult": DeleteMemberAccessResult,
    "DeleteMemberAccessResultsResponseArray": DeleteMemberAccessResultsResponseArray,
    "DeletePartnerAssetAccessBody": DeletePartnerAssetAccessBody,
    "DeletePartnerAssetAccessBodyAccessesInner": DeletePartnerAssetAccessBodyAccessesInner,
    "DeletePartnerAssetsResult": DeletePartnerAssetsResult,
    "DeletePartnerAssetsResultsResponseArray": DeletePartnerAssetsResultsResponseArray,
    "DeletePartnersRequest": DeletePartnersRequest,
    "DeletePartnersResponse": DeletePartnersResponse,
    "DeletedMembersResponse": DeletedMembersResponse,
    "DeliveryMetricsResponse": DeliveryMetricsResponse,
    "DeliveryMetricsResponseItemsInner": DeliveryMetricsResponseItemsInner,
    "DetailedError": DetailedError,
    "ErrorDetail": ErrorDetail,
    "EventData": EventData,
    "EventQualityScore": EventQualityScore,
    "Exception": Exception,
    "FeaturedTrend": FeaturedTrend,
    "FeedProcessingResultsList200Response": FeedProcessingResultsList200Response,
    "FeedsCreateRequest": FeedsCreateRequest,
    "FeedsList200Response": FeedsList200Response,
    "FeedsUpdateRequest": FeedsUpdateRequest,
    "FollowUserRequest": FollowUserRequest,
    "FollowersList200Response": FollowersList200Response,
    "GenderDemographics": GenderDemographics,
    "GenderFilter": GenderFilter,
    "GetBusinessAssetsResponse": GetBusinessAssetsResponse,
    "GetBusinessAssetsResponseCatalogInfo": GetBusinessAssetsResponseCatalogInfo,
    "GetBusinessEmployers200Response": GetBusinessEmployers200Response,
    "GetBusinessMembers200Response": GetBusinessMembers200Response,
    "GetBusinessPartners200Response": GetBusinessPartners200Response,
    "GetInvites200Response": GetInvites200Response,
    "GetMMMReportResponse": GetMMMReportResponse,
    "GetMMMReportResponseData": GetMMMReportResponseData,
    "GetPartnerAssetsResponse": GetPartnerAssetsResponse,
    "GoogleProductCategory0Filter": GoogleProductCategory0Filter,
    "GoogleProductCategory1Filter": GoogleProductCategory1Filter,
    "GoogleProductCategory2Filter": GoogleProductCategory2Filter,
    "GoogleProductCategory3Filter": GoogleProductCategory3Filter,
    "GoogleProductCategory4Filter": GoogleProductCategory4Filter,
    "GoogleProductCategory5Filter": GoogleProductCategory5Filter,
    "GoogleProductCategory6Filter": GoogleProductCategory6Filter,
    "HotelIdFilter": HotelIdFilter,
    "HotelProcessingRecord": HotelProcessingRecord,
    "ImageBase64": ImageBase64,
    "ImageDetails": ImageDetails,
    "ImageMetadata": ImageMetadata,
    "ImageSize": ImageSize,
    "InnerProductCategoriesMetricsHighlights": InnerProductCategoriesMetricsHighlights,
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
    "IntegrationsLogsPost400Response": IntegrationsLogsPost400Response,
    "Interest": Interest,
    "InviteAssetsSummary": InviteAssetsSummary,
    "InviteAssetsSummaryAdAccountsInner": InviteAssetsSummaryAdAccountsInner,
    "InviteAssetsSummaryProfilesInner": InviteAssetsSummaryProfilesInner,
    "InviteBusinessRoleBinding": InviteBusinessRoleBinding,
    "InviteExceptionResponse": InviteExceptionResponse,
    "InviteResponse": InviteResponse,
    "ItemAttributes": ItemAttributes,
    "ItemAttributesRequest": ItemAttributesRequest,
    "ItemAttributesRequestAllOfImageLink": ItemAttributesRequestAllOfImageLink,
    "ItemBatchRecord": ItemBatchRecord,
    "ItemCreateBatchRecord": ItemCreateBatchRecord,
    "ItemDeleteBatchRecord": ItemDeleteBatchRecord,
    "ItemDeleteDiscontinuedBatchRecord": ItemDeleteDiscontinuedBatchRecord,
    "ItemGroupIdFilter": ItemGroupIdFilter,
    "ItemIdFilter": ItemIdFilter,
    "ItemProcessingRecord": ItemProcessingRecord,
    "ItemResponse": ItemResponse,
    "ItemResponseOneOf": ItemResponseOneOf,
    "ItemResponseOneOf1": ItemResponseOneOf1,
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
    "Label": Label,
    "LabelBulkUpdateRequest": LabelBulkUpdateRequest,
    "LabelCreateRequest": LabelCreateRequest,
    "LabelCreateRequestLabelsInner": LabelCreateRequestLabelsInner,
    "LabelError": LabelError,
    "LabelUpdateRequest": LabelUpdateRequest,
    "LabelUpdateRequestLabelsInner": LabelUpdateRequestLabelsInner,
    "LabelsList200Response": LabelsList200Response,
    "LabelsResponse": LabelsResponse,
    "LeadFormArrayResponse": LeadFormArrayResponse,
    "LeadFormArrayResponseItemsInner": LeadFormArrayResponseItemsInner,
    "LeadFormCommon": LeadFormCommon,
    "LeadFormCommonPolicyLinksInner": LeadFormCommonPolicyLinksInner,
    "LeadFormCreateRequest": LeadFormCreateRequest,
    "LeadFormQuestion": LeadFormQuestion,
    "LeadFormResponse": LeadFormResponse,
    "LeadFormTestRequest": LeadFormTestRequest,
    "LeadFormTestResponse": LeadFormTestResponse,
    "LeadFormUpdateRequest": LeadFormUpdateRequest,
    "LeadFormsList200Response": LeadFormsList200Response,
    "LeadSubscription": LeadSubscription,
    "LeadSubscriptionPostParamsCreate": LeadSubscriptionPostParamsCreate,
    "LeadSubscriptionPostParamsCreateAllOfPartnerMetadata": LeadSubscriptionPostParamsCreateAllOfPartnerMetadata,
    "LeadsExportCreateRequest": LeadsExportCreateRequest,
    "LeadsExportCreateResponse": LeadsExportCreateResponse,
    "LeadsExportResponseData": LeadsExportResponseData,
    "LineItem": LineItem,
    "LinkedBusiness": LinkedBusiness,
    "LocalStoreUpdate": LocalStoreUpdate,
    "MaxPriceFilter": MaxPriceFilter,
    "Media": Media,
    "MediaList200Response": MediaList200Response,
    "MediaTypeFilter": MediaTypeFilter,
    "MediaUpload": MediaUpload,
    "MediaUploadCreate": MediaUploadCreate,
    "MediaUploadParameters": MediaUploadParameters,
    "MembersToDeleteBody": MembersToDeleteBody,
    "MembersToDeleteBodyMembersInner": MembersToDeleteBodyMembersInner,
    "MetricsResponse": MetricsResponse,
    "MinPriceFilter": MinPriceFilter,
    "ModelError": ModelError,
    "MultipleProductGroupsInner": MultipleProductGroupsInner,
    "NotificationPostRequest": NotificationPostRequest,
    "NotificationResponse": NotificationResponse,
    "OauthAccessTokenRequestClientCredentials": OauthAccessTokenRequestClientCredentials,
    "OauthAccessTokenRequestCode": OauthAccessTokenRequestCode,
    "OauthAccessTokenRequestRefresh": OauthAccessTokenRequestRefresh,
    "OauthAccessTokenResponse": OauthAccessTokenResponse,
    "OauthAccessTokenResponseClientCredentials": OauthAccessTokenResponseClientCredentials,
    "OauthAccessTokenResponseCode": OauthAccessTokenResponseCode,
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
    "PinMediaSourceImagesBase64Item": PinMediaSourceImagesBase64Item,
    "PinMediaSourceImagesURL": PinMediaSourceImagesURL,
    "PinMediaSourceImagesURLItem": PinMediaSourceImagesURLItem,
    "PinMediaSourcePinURL": PinMediaSourcePinURL,
    "PinMediaSourceVideoID": PinMediaSourceVideoID,
    "PinMediaWithImage": PinMediaWithImage,
    "PinMediaWithImageAndVideo": PinMediaWithImageAndVideo,
    "PinMediaWithImages": PinMediaWithImages,
    "PinMediaWithVideo": PinMediaWithVideo,
    "PinMediaWithVideos": PinMediaWithVideos,
    "PinUpdate": PinUpdate,
    "PinsList200Response": PinsList200Response,
    "PinsSaveRequest": PinsSaveRequest,
    "PinterestLibError": PinterestLibError,
    "PinterestLibStatus204": PinterestLibStatus204,
    "PlacementMultipliers": PlacementMultipliers,
    "PredictedTimeSeries": PredictedTimeSeries,
    "PriceFilter": PriceFilter,
    "ProductCategoriesDemographic": ProductCategoriesDemographic,
    "ProductCategoriesMetricsHighlights": ProductCategoriesMetricsHighlights,
    "ProductCategoryDetails": ProductCategoryDetails,
    "ProductGroupAnalyticsResponseInner": ProductGroupAnalyticsResponseInner,
    "ProductGroupPromotion": ProductGroupPromotion,
    "ProductGroupPromotionCreateRequest": ProductGroupPromotionCreateRequest,
    "ProductGroupPromotionResponse": ProductGroupPromotionResponse,
    "ProductGroupPromotionResponseItem": ProductGroupPromotionResponseItem,
    "ProductGroupPromotionUpdateRequest": ProductGroupPromotionUpdateRequest,
    "ProductGroupPromotionsList200Response": ProductGroupPromotionsList200Response,
    "ProductGroupReferenceFilter": ProductGroupReferenceFilter,
    "ProductType0Filter": ProductType0Filter,
    "ProductType1Filter": ProductType1Filter,
    "ProductType2Filter": ProductType2Filter,
    "ProductType3Filter": ProductType3Filter,
    "ProductType4Filter": ProductType4Filter,
    "PromotionArrayElement": PromotionArrayElement,
    "PromotionCommon": PromotionCommon,
    "PromotionCreateRequest": PromotionCreateRequest,
    "PromotionResponse": PromotionResponse,
    "PromotionTemplateValue": PromotionTemplateValue,
    "PromotionUpdateRequest": PromotionUpdateRequest,
    "PromotionsList200Response": PromotionsList200Response,
    "PromotionsResponse": PromotionsResponse,
    "QualityComponentDetails": QualityComponentDetails,
    "QualityComponentIssue": QualityComponentIssue,
    "QualityComponents": QualityComponents,
    "QuizPinData": QuizPinData,
    "QuizPinOption": QuizPinOption,
    "QuizPinQuestion": QuizPinQuestion,
    "QuizPinResult": QuizPinResult,
    "RecordCounts": RecordCounts,
    "RelatedTerms": RelatedTerms,
    "RelatedTermsRelatedTermsListInner": RelatedTermsRelatedTermsListInner,
    "ReportsStats200Response": ReportsStats200Response,
    "ReportsStatsParametersParameter": ReportsStatsParametersParameter,
    "RespondToInvitesResponseArray": RespondToInvitesResponseArray,
    "RespondToInvitesResponseArrayItemsInner": RespondToInvitesResponseArrayItemsInner,
    "S3FilePart": S3FilePart,
    "S3MultipartUploadData": S3MultipartUploadData,
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
    "SearchUserPinsList200Response": SearchUserPinsList200Response,
    "SharedAudience": SharedAudience,
    "SharedAudienceAccount": SharedAudienceAccount,
    "SharedAudienceCommon": SharedAudienceCommon,
    "SharedAudienceResponse": SharedAudienceResponse,
    "SharedAudienceResponseCommon": SharedAudienceResponseCommon,
    "SingleInterestTargetingOptionResponse": SingleInterestTargetingOptionResponse,
    "SsioInsertionOrdersStatusGetByAdAccount200Response": SsioInsertionOrdersStatusGetByAdAccount200Response,
    "SsioOrderLinesGetByAdAccount200Response": SsioOrderLinesGetByAdAccount200Response,
    "SummaryPin": SummaryPin,
    "SystemUserUpdateRequest": SystemUserUpdateRequest,
    "TargetingSpec": TargetingSpec,
    "TargetingSpecOperationAgeBucket": TargetingSpecOperationAgeBucket,
    "TargetingSpecOperationAppType": TargetingSpecOperationAppType,
    "TargetingSpecOperationGender": TargetingSpecOperationGender,
    "TargetingSpecOperationList": TargetingSpecOperationList,
    "TargetingSpecOperationMinMaxAge": TargetingSpecOperationMinMaxAge,
    "TargetingSpecOperationShoppingRetargeting": TargetingSpecOperationShoppingRetargeting,
    "TargetingSpecOperationString": TargetingSpecOperationString,
    "TargetingSpecShoppingRetargeting": TargetingSpecShoppingRetargeting,
    "TargetingTemplateAudienceSizing": TargetingTemplateAudienceSizing,
    "TargetingTemplateAudienceSizingReachEstimate": TargetingTemplateAudienceSizingReachEstimate,
    "TargetingTemplateCommon": TargetingTemplateCommon,
    "TargetingTemplateCreate": TargetingTemplateCreate,
    "TargetingTemplateGetResponseData": TargetingTemplateGetResponseData,
    "TargetingTemplateKeyword": TargetingTemplateKeyword,
    "TargetingTemplateList200Response": TargetingTemplateList200Response,
    "TargetingTemplateResponseData": TargetingTemplateResponseData,
    "TargetingTemplateUpdateRequest": TargetingTemplateUpdateRequest,
    "TargetingTypeFilter": TargetingTypeFilter,
    "TemplateBasedReport": TemplateBasedReport,
    "TemplateResponse": TemplateResponse,
    "TemplateResponseDateRange": TemplateResponseDateRange,
    "TemplateResponseDateRangeAbsoluteDateRange": TemplateResponseDateRangeAbsoluteDateRange,
    "TemplateResponseDateRangeDynamicDateRange": TemplateResponseDateRangeDynamicDateRange,
    "TemplateResponseDateRangeRelativeDateRange": TemplateResponseDateRangeRelativeDateRange,
    "TemplatesList200Response": TemplatesList200Response,
    "TermsOfService": TermsOfService,
    "TimeSeries": TimeSeries,
    "TitleKeywordsFilter": TitleKeywordsFilter,
    "TopPinsAnalyticsResponse": TopPinsAnalyticsResponse,
    "TopPinsAnalyticsResponseDateAvailability": TopPinsAnalyticsResponseDateAvailability,
    "TopPinsAnalyticsResponsePinsInner": TopPinsAnalyticsResponsePinsInner,
    "TopVideoPinsAnalyticsResponse": TopVideoPinsAnalyticsResponse,
    "TopVideoPinsAnalyticsResponsePinsInner": TopVideoPinsAnalyticsResponsePinsInner,
    "TrackingUrls": TrackingUrls,
    "TrendingKeyword": TrendingKeyword,
    "TrendingKeywordDemographics": TrendingKeywordDemographics,
    "TrendingKeywordDemographicsAgeDistribution": TrendingKeywordDemographicsAgeDistribution,
    "TrendingKeywordDemographicsGenderDistribution": TrendingKeywordDemographicsGenderDistribution,
    "TrendingKeywordsResponse": TrendingKeywordsResponse,
    "TrendingPin": TrendingPin,
    "TrendingProductCategory": TrendingProductCategory,
    "TrendingTopic": TrendingTopic,
    "UpdatableItemAttributes": UpdatableItemAttributes,
    "UpdatableItemAttributesGtin": UpdatableItemAttributesGtin,
    "UpdateAssetGroupBody": UpdateAssetGroupBody,
    "UpdateAssetGroupBodyAssetGroupsToUpdateInner": UpdateAssetGroupBodyAssetGroupsToUpdateInner,
    "UpdateAssetGroupResponse": UpdateAssetGroupResponse,
    "UpdateAssetGroupResponseExceptionsInner": UpdateAssetGroupResponseExceptionsInner,
    "UpdateInvitesResultsResponseArray": UpdateInvitesResultsResponseArray,
    "UpdateInvitesResultsResponseArrayItemsInner": UpdateInvitesResultsResponseArrayItemsInner,
    "UpdateMemberAssetAccessBody": UpdateMemberAssetAccessBody,
    "UpdateMemberAssetAccessBodyAccessesInner": UpdateMemberAssetAccessBodyAccessesInner,
    "UpdateMemberAssetsResultsResponseArray": UpdateMemberAssetsResultsResponseArray,
    "UpdateMemberAssetsResultsResponseArrayItemsInner": UpdateMemberAssetsResultsResponseArrayItemsInner,
    "UpdateMemberBusinessRoleBody": UpdateMemberBusinessRoleBody,
    "UpdateMemberResult": UpdateMemberResult,
    "UpdateMemberResultsResponseArray": UpdateMemberResultsResponseArray,
    "UpdatePartnerAssetAccessBody": UpdatePartnerAssetAccessBody,
    "UpdatePartnerAssetAccessBodyAccessesInner": UpdatePartnerAssetAccessBodyAccessesInner,
    "UpdatePartnerAssetsResult": UpdatePartnerAssetsResult,
    "UpdatePartnerAssetsResultsResponseArray": UpdatePartnerAssetsResultsResponseArray,
    "UpdatePartnerResultsResponseArray": UpdatePartnerResultsResponseArray,
    "UpdatePartnerResultsResponseArrayItemsInner": UpdatePartnerResultsResponseArrayItemsInner,
    "UserAccountFollowedInterests200Response": UserAccountFollowedInterests200Response,
    "UserBusinessRoleBinding": UserBusinessRoleBinding,
    "UserFollowingGet200Response": UserFollowingGet200Response,
    "UserSingleAssetBinding": UserSingleAssetBinding,
    "UserSummary": UserSummary,
    "UserWebsiteSummary": UserWebsiteSummary,
    "UserWebsiteVerificationCode": UserWebsiteVerificationCode,
    "UserWebsiteVerifyRequest": UserWebsiteVerifyRequest,
    "UserWebsitesGet200Response": UserWebsitesGet200Response,
    "UsersForIndividualAssetResponse": UsersForIndividualAssetResponse,
    "VideoMetadataWithItemType": VideoMetadataWithItemType,
}

// Check if a string starts with another string without using es6 features
function startsWith(str: string, match: string): boolean {
    return str.substring(0, match.length) === match;
}

// Check if a string ends with another string without using es6 features
function endsWith(str: string, match: string): boolean {
    return str.length >= match.length && str.substring(str.length - match.length) === match;
}

const nullableSuffix = " | null";
const optionalSuffix = " | undefined";
const arrayPrefix = "Array<";
const arraySuffix = ">";
const mapPrefix = "{ [key: string]: ";
const mapSuffix = "; }";

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

    public static serialize(data: any, type: string): any {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (endsWith(type, nullableSuffix)) {
            let subType: string = type.slice(0, -nullableSuffix.length); // Type | null => Type
            return ObjectSerializer.serialize(data, subType);
        } else if (endsWith(type, optionalSuffix)) {
            let subType: string = type.slice(0, -optionalSuffix.length); // Type | undefined => Type
            return ObjectSerializer.serialize(data, subType);
        } else if (startsWith(type, arrayPrefix)) {
            let subType: string = type.slice(arrayPrefix.length, -arraySuffix.length); // Array<Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.serialize(datum, subType));
            }
            return transformedData;
        } else if (startsWith(type, mapPrefix)) {
            let subType: string = type.slice(mapPrefix.length, -mapSuffix.length); // { [key: string]: Type; } => Type
            let transformedData: { [key: string]: any } = {};
            for (let key in data) {
                transformedData[key] = ObjectSerializer.serialize(
                    data[key],
                    subType,
                );
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

    public static deserialize(data: any, type: string): any {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (endsWith(type, nullableSuffix)) {
            let subType: string = type.slice(0, -nullableSuffix.length); // Type | null => Type
            return ObjectSerializer.deserialize(data, subType);
        } else if (endsWith(type, optionalSuffix)) {
            let subType: string = type.slice(0, -optionalSuffix.length); // Type | undefined => Type
            return ObjectSerializer.deserialize(data, subType);
        } else if (startsWith(type, arrayPrefix)) {
            let subType: string = type.slice(arrayPrefix.length, -arraySuffix.length); // Array<Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.deserialize(datum, subType));
            }
            return transformedData;
        } else if (startsWith(type, mapPrefix)) {
            let subType: string = type.slice(mapPrefix.length, -mapSuffix.length); // { [key: string]: Type; } => Type
            let transformedData: { [key: string]: any } = {};
            for (let key in data) {
                transformedData[key] = ObjectSerializer.deserialize(
                    data[key],
                    subType,
                );
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
