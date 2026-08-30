//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class QueryParam {
  const QueryParam(this.name, this.value);

  final String name;
  final String value;

  @override
  String toString() => '${Uri.encodeQueryComponent(name)}=${Uri.encodeQueryComponent(value)}';
}

// Ported from the Java version.
Iterable<QueryParam> _queryParams(String collectionFormat, String name, dynamic value,) {
  // Assertions to run in debug mode only.
  assert(name.isNotEmpty, 'Parameter cannot be an empty string.');

  final params = <QueryParam>[];

  if (value is List) {
    if (collectionFormat == 'multi') {
      return value.map((dynamic v) => QueryParam(name, parameterToString(v)),);
    }

    // Default collection format is 'csv'.
    if (collectionFormat.isEmpty) {
      collectionFormat = 'csv'; // ignore: parameter_assignments
    }

    final delimiter = _delimiters[collectionFormat] ?? ',';

    params.add(QueryParam(name, value.map<dynamic>(parameterToString).join(delimiter),));
  } else if (value != null) {
    params.add(QueryParam(name, parameterToString(value)));
  }

  return params;
}

/// Format the given parameter object into a [String].
String parameterToString(dynamic value) {
  if (value == null) {
    return '';
  }
  if (value is DateTime) {
    return value.toUtc().toIso8601String();
  }
  if (value is ActionType) {
    return ActionTypeTypeTransformer().encode(value).toString();
  }
  if (value is AdAccountEntityType) {
    return AdAccountEntityTypeTypeTransformer().encode(value).toString();
  }
  if (value is AdAdsAnalyticsAsyncTargetingTypes) {
    return AdAdsAnalyticsAsyncTargetingTypesTypeTransformer().encode(value).toString();
  }
  if (value is AdCollectionsHeaderType) {
    return AdCollectionsHeaderTypeTypeTransformer().encode(value).toString();
  }
  if (value is AdDisapprovalReasons) {
    return AdDisapprovalReasonsTypeTransformer().encode(value).toString();
  }
  if (value is AdGroupAudienceSizingCreativeTypes) {
    return AdGroupAudienceSizingCreativeTypesTypeTransformer().encode(value).toString();
  }
  if (value is AdGroupSummaryStatus) {
    return AdGroupSummaryStatusTypeTransformer().encode(value).toString();
  }
  if (value is AdPinPreviewCreativeType) {
    return AdPinPreviewCreativeTypeTypeTransformer().encode(value).toString();
  }
  if (value is AdReviewStatus) {
    return AdReviewStatusTypeTransformer().encode(value).toString();
  }
  if (value is AdShoppingPreviewCreativeType) {
    return AdShoppingPreviewCreativeTypeTypeTransformer().encode(value).toString();
  }
  if (value is AdeColumnType) {
    return AdeColumnTypeTypeTransformer().encode(value).toString();
  }
  if (value is AdgroupPlacementGroupType) {
    return AdgroupPlacementGroupTypeTypeTransformer().encode(value).toString();
  }
  if (value is AdgroupTrackingFeatureType) {
    return AdgroupTrackingFeatureTypeTypeTransformer().encode(value).toString();
  }
  if (value is AdsAnalyticsAccountTargetingType) {
    return AdsAnalyticsAccountTargetingTypeTypeTransformer().encode(value).toString();
  }
  if (value is AdsAnalyticsAdGroupTargetingType) {
    return AdsAnalyticsAdGroupTargetingTypeTypeTransformer().encode(value).toString();
  }
  if (value is AdsAnalyticsAdTargetingType) {
    return AdsAnalyticsAdTargetingTypeTypeTransformer().encode(value).toString();
  }
  if (value is AdsAnalyticsCampaignTargetingType) {
    return AdsAnalyticsCampaignTargetingTypeTypeTransformer().encode(value).toString();
  }
  if (value is AdsAnalyticsFilterColumn) {
    return AdsAnalyticsFilterColumnTypeTransformer().encode(value).toString();
  }
  if (value is AdsAnalyticsFilterOperator) {
    return AdsAnalyticsFilterOperatorTypeTransformer().encode(value).toString();
  }
  if (value is AdsCreditDiscountType) {
    return AdsCreditDiscountTypeTypeTransformer().encode(value).toString();
  }
  if (value is AdvertiserDefinedEventMappingType) {
    return AdvertiserDefinedEventMappingTypeTypeTransformer().encode(value).toString();
  }
  if (value is AgeTrendsBucket) {
    return AgeTrendsBucketTypeTransformer().encode(value).toString();
  }
  if (value is AiDisclosureItem) {
    return AiDisclosureItemTypeTransformer().encode(value).toString();
  }
  if (value is AppsflyerPlatform) {
    return AppsflyerPlatformTypeTransformer().encode(value).toString();
  }
  if (value is AssetGroupType) {
    return AssetGroupTypeTypeTransformer().encode(value).toString();
  }
  if (value is AssetPermissionType) {
    return AssetPermissionTypeTypeTransformer().encode(value).toString();
  }
  if (value is AssetSearchBy) {
    return AssetSearchByTypeTransformer().encode(value).toString();
  }
  if (value is AssetSortBy) {
    return AssetSortByTypeTransformer().encode(value).toString();
  }
  if (value is AssetTypeResponse) {
    return AssetTypeResponseTypeTransformer().encode(value).toString();
  }
  if (value is AttributionActionType) {
    return AttributionActionTypeTypeTransformer().encode(value).toString();
  }
  if (value is AttributionMatchType) {
    return AttributionMatchTypeTypeTransformer().encode(value).toString();
  }
  if (value is AttributionModel) {
    return AttributionModelTypeTransformer().encode(value).toString();
  }
  if (value is AttributionScope) {
    return AttributionScopeTypeTransformer().encode(value).toString();
  }
  if (value is AudienceAccountType) {
    return AudienceAccountTypeTypeTransformer().encode(value).toString();
  }
  if (value is AudienceInsightType) {
    return AudienceInsightTypeTypeTransformer().encode(value).toString();
  }
  if (value is AudienceObjectiveType) {
    return AudienceObjectiveTypeTypeTransformer().encode(value).toString();
  }
  if (value is AudienceOwnershipType) {
    return AudienceOwnershipTypeTypeTransformer().encode(value).toString();
  }
  if (value is AudienceStatus) {
    return AudienceStatusTypeTransformer().encode(value).toString();
  }
  if (value is AudienceType) {
    return AudienceTypeTypeTransformer().encode(value).toString();
  }
  if (value is AudienceUpdateOperationType) {
    return AudienceUpdateOperationTypeTypeTransformer().encode(value).toString();
  }
  if (value is BasePreferredMediaType) {
    return BasePreferredMediaTypeTypeTransformer().encode(value).toString();
  }
  if (value is BatchOperationStatus) {
    return BatchOperationStatusTypeTransformer().encode(value).toString();
  }
  if (value is BidFloorObjectiveType) {
    return BidFloorObjectiveTypeTypeTransformer().encode(value).toString();
  }
  if (value is BidStrategyType) {
    return BidStrategyTypeTypeTransformer().encode(value).toString();
  }
  if (value is BillingInvoiceDocumentType) {
    return BillingInvoiceDocumentTypeTypeTransformer().encode(value).toString();
  }
  if (value is BillingInvoiceSortField) {
    return BillingInvoiceSortFieldTypeTransformer().encode(value).toString();
  }
  if (value is BillingInvoiceStatus) {
    return BillingInvoiceStatusTypeTransformer().encode(value).toString();
  }
  if (value is BillingProfileCardType) {
    return BillingProfileCardTypeTypeTransformer().encode(value).toString();
  }
  if (value is BillingProfilePaymentMethodBrand) {
    return BillingProfilePaymentMethodBrandTypeTransformer().encode(value).toString();
  }
  if (value is BillingProfileStatus) {
    return BillingProfileStatusTypeTransformer().encode(value).toString();
  }
  if (value is BillingType) {
    return BillingTypeTypeTransformer().encode(value).toString();
  }
  if (value is BoardPrivacy) {
    return BoardPrivacyTypeTransformer().encode(value).toString();
  }
  if (value is BoardPrivacyFilter) {
    return BoardPrivacyFilterTypeTransformer().encode(value).toString();
  }
  if (value is BoardUpdatePrivacy) {
    return BoardUpdatePrivacyTypeTransformer().encode(value).toString();
  }
  if (value is BudgetDurationType) {
    return BudgetDurationTypeTypeTransformer().encode(value).toString();
  }
  if (value is BudgetType) {
    return BudgetTypeTypeTransformer().encode(value).toString();
  }
  if (value is BulkEntityType) {
    return BulkEntityTypeTypeTransformer().encode(value).toString();
  }
  if (value is BulkOutputFormat) {
    return BulkOutputFormatTypeTransformer().encode(value).toString();
  }
  if (value is BulkReportingJobStatus) {
    return BulkReportingJobStatusTypeTransformer().encode(value).toString();
  }
  if (value is BulkRequestStatus) {
    return BulkRequestStatusTypeTransformer().encode(value).toString();
  }
  if (value is BusinessAccessRole) {
    return BusinessAccessRoleTypeTransformer().encode(value).toString();
  }
  if (value is BusinessMemberSortBy) {
    return BusinessMemberSortByTypeTransformer().encode(value).toString();
  }
  if (value is BusinessRoleForInvite) {
    return BusinessRoleForInviteTypeTransformer().encode(value).toString();
  }
  if (value is BusinessRoleForMembers) {
    return BusinessRoleForMembersTypeTransformer().encode(value).toString();
  }
  if (value is BusinessSearchBy) {
    return BusinessSearchByTypeTransformer().encode(value).toString();
  }
  if (value is CampaignBidOptionsUpdateMaskItems) {
    return CampaignBidOptionsUpdateMaskItemsTypeTransformer().encode(value).toString();
  }
  if (value is CampaignObjectiveType) {
    return CampaignObjectiveTypeTypeTransformer().encode(value).toString();
  }
  if (value is CampaignPlanningConfidenceLevelAlertReason) {
    return CampaignPlanningConfidenceLevelAlertReasonTypeTransformer().encode(value).toString();
  }
  if (value is CampaignPlanningConfidenceLevelAlertSeverity) {
    return CampaignPlanningConfidenceLevelAlertSeverityTypeTransformer().encode(value).toString();
  }
  if (value is CampaignPlanningConversionAttributionWindowDays) {
    return CampaignPlanningConversionAttributionWindowDaysTypeTransformer().encode(value).toString();
  }
  if (value is CampaignPlanningConversionEvent) {
    return CampaignPlanningConversionEventTypeTransformer().encode(value).toString();
  }
  if (value is CampaignPlanningEstimationType) {
    return CampaignPlanningEstimationTypeTypeTransformer().encode(value).toString();
  }
  if (value is CampaignPlanningResponseErrorCode) {
    return CampaignPlanningResponseErrorCodeTypeTransformer().encode(value).toString();
  }
  if (value is CampaignSummaryStatus) {
    return CampaignSummaryStatusTypeTransformer().encode(value).toString();
  }
  if (value is CatalogsAiContentDisclosureLabel) {
    return CatalogsAiContentDisclosureLabelTypeTransformer().encode(value).toString();
  }
  if (value is CatalogsFeedProcessingScheduleTimezone) {
    return CatalogsFeedProcessingScheduleTimezoneTypeTransformer().encode(value).toString();
  }
  if (value is CatalogsFeedProcessingStatus) {
    return CatalogsFeedProcessingStatusTypeTransformer().encode(value).toString();
  }
  if (value is CatalogsFormat) {
    return CatalogsFormatTypeTransformer().encode(value).toString();
  }
  if (value is CatalogsHotelProductGroupType) {
    return CatalogsHotelProductGroupTypeTypeTransformer().encode(value).toString();
  }
  if (value is CatalogsItemValidationIssue) {
    return CatalogsItemValidationIssueTypeTransformer().encode(value).toString();
  }
  if (value is CatalogsLocale) {
    return CatalogsLocaleTypeTransformer().encode(value).toString();
  }
  if (value is CatalogsProductGroupStatus) {
    return CatalogsProductGroupStatusTypeTransformer().encode(value).toString();
  }
  if (value is CatalogsProductGroupType) {
    return CatalogsProductGroupTypeTypeTransformer().encode(value).toString();
  }
  if (value is CatalogsStatus) {
    return CatalogsStatusTypeTransformer().encode(value).toString();
  }
  if (value is CatalogsType) {
    return CatalogsTypeTypeTransformer().encode(value).toString();
  }
  if (value is ChangeHistoryDataType) {
    return ChangeHistoryDataTypeTypeTransformer().encode(value).toString();
  }
  if (value is ChangeHistoryOperationType) {
    return ChangeHistoryOperationTypeTypeTransformer().encode(value).toString();
  }
  if (value is CollectionsHeaderType) {
    return CollectionsHeaderTypeTypeTransformer().encode(value).toString();
  }
  if (value is ContentType) {
    return ContentTypeTypeTransformer().encode(value).toString();
  }
  if (value is ConversionAttributionWindowDays) {
    return ConversionAttributionWindowDaysTypeTransformer().encode(value).toString();
  }
  if (value is ConversionDeletionRequestStatus) {
    return ConversionDeletionRequestStatusTypeTransformer().encode(value).toString();
  }
  if (value is ConversionEvent) {
    return ConversionEventTypeTransformer().encode(value).toString();
  }
  if (value is ConversionEventIngestionSource) {
    return ConversionEventIngestionSourceTypeTransformer().encode(value).toString();
  }
  if (value is ConversionLearningModeType) {
    return ConversionLearningModeTypeTypeTransformer().encode(value).toString();
  }
  if (value is ConversionObjectiveType) {
    return ConversionObjectiveTypeTypeTransformer().encode(value).toString();
  }
  if (value is ConversionProductAttributionType) {
    return ConversionProductAttributionTypeTypeTransformer().encode(value).toString();
  }
  if (value is ConversionProductReportBreakdownType) {
    return ConversionProductReportBreakdownTypeTypeTransformer().encode(value).toString();
  }
  if (value is ConversionProductReportGranularity) {
    return ConversionProductReportGranularityTypeTransformer().encode(value).toString();
  }
  if (value is ConversionProductReportLevel) {
    return ConversionProductReportLevelTypeTransformer().encode(value).toString();
  }
  if (value is ConversionProductReportingColumn) {
    return ConversionProductReportingColumnTypeTransformer().encode(value).toString();
  }
  if (value is ConversionReportAttributionType) {
    return ConversionReportAttributionTypeTypeTransformer().encode(value).toString();
  }
  if (value is ConversionReportTimeType) {
    return ConversionReportTimeTypeTypeTransformer().encode(value).toString();
  }
  if (value is ConversionTagType) {
    return ConversionTagTypeTypeTransformer().encode(value).toString();
  }
  if (value is ConversionTagTypeOptimal) {
    return ConversionTagTypeOptimalTypeTransformer().encode(value).toString();
  }
  if (value is Country) {
    return CountryTypeTransformer().encode(value).toString();
  }
  if (value is CreationSource) {
    return CreationSourceTypeTransformer().encode(value).toString();
  }
  if (value is CreativeAssetsVisibilityType) {
    return CreativeAssetsVisibilityTypeTypeTransformer().encode(value).toString();
  }
  if (value is CreativeType) {
    return CreativeTypeTypeTransformer().encode(value).toString();
  }
  if (value is Currency) {
    return CurrencyTypeTransformer().encode(value).toString();
  }
  if (value is CustomerListStatus) {
    return CustomerListStatusTypeTransformer().encode(value).toString();
  }
  if (value is CustomizableCTAType) {
    return CustomizableCTATypeTypeTransformer().encode(value).toString();
  }
  if (value is DataOutputFormat) {
    return DataOutputFormatTypeTransformer().encode(value).toString();
  }
  if (value is DataStatus) {
    return DataStatusTypeTransformer().encode(value).toString();
  }
  if (value is DeliveryEstimateObjectiveType) {
    return DeliveryEstimateObjectiveTypeTypeTransformer().encode(value).toString();
  }
  if (value is DisclosureType) {
    return DisclosureTypeTypeTransformer().encode(value).toString();
  }
  if (value is DiscountStatus) {
    return DiscountStatusTypeTransformer().encode(value).toString();
  }
  if (value is EnhancedMatchStatusType) {
    return EnhancedMatchStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is EntityLabelStatus) {
    return EntityLabelStatusTypeTransformer().encode(value).toString();
  }
  if (value is EntityStatus) {
    return EntityStatusTypeTransformer().encode(value).toString();
  }
  if (value is EventProcessingStatus) {
    return EventProcessingStatusTypeTransformer().encode(value).toString();
  }
  if (value is FilterOperatorType) {
    return FilterOperatorTypeTypeTransformer().encode(value).toString();
  }
  if (value is FormFactor) {
    return FormFactorTypeTransformer().encode(value).toString();
  }
  if (value is FreqBidMultiplierTimeWindow) {
    return FreqBidMultiplierTimeWindowTypeTransformer().encode(value).toString();
  }
  if (value is FrequencyGoalMetadataTimerange) {
    return FrequencyGoalMetadataTimerangeTypeTransformer().encode(value).toString();
  }
  if (value is Gender) {
    return GenderTypeTransformer().encode(value).toString();
  }
  if (value is GenderBucket) {
    return GenderBucketTypeTransformer().encode(value).toString();
  }
  if (value is Granularity) {
    return GranularityTypeTransformer().encode(value).toString();
  }
  if (value is GridClickType) {
    return GridClickTypeTypeTransformer().encode(value).toString();
  }
  if (value is HttpMethod) {
    return HttpMethodTypeTransformer().encode(value).toString();
  }
  if (value is IneligibleProductTagReason) {
    return IneligibleProductTagReasonTypeTransformer().encode(value).toString();
  }
  if (value is IngestionSource) {
    return IngestionSourceTypeTransformer().encode(value).toString();
  }
  if (value is IngestionSourceOptions) {
    return IngestionSourceOptionsTypeTransformer().encode(value).toString();
  }
  if (value is IntegrationLogEventType) {
    return IntegrationLogEventTypeTypeTransformer().encode(value).toString();
  }
  if (value is IntegrationLogLevel) {
    return IntegrationLogLevelTypeTransformer().encode(value).toString();
  }
  if (value is IntendedPromotionType) {
    return IntendedPromotionTypeTypeTransformer().encode(value).toString();
  }
  if (value is InterestsEnum) {
    return InterestsEnumTypeTransformer().encode(value).toString();
  }
  if (value is InviteFilterStatus) {
    return InviteFilterStatusTypeTransformer().encode(value).toString();
  }
  if (value is InviteStatus) {
    return InviteStatusTypeTransformer().encode(value).toString();
  }
  if (value is InviteType) {
    return InviteTypeTypeTransformer().encode(value).toString();
  }
  if (value is ItemAvailability) {
    return ItemAvailabilityTypeTransformer().encode(value).toString();
  }
  if (value is ItemProcessingStatus) {
    return ItemProcessingStatusTypeTransformer().encode(value).toString();
  }
  if (value is LabelParentType) {
    return LabelParentTypeTypeTransformer().encode(value).toString();
  }
  if (value is LabelStatus) {
    return LabelStatusTypeTransformer().encode(value).toString();
  }
  if (value is LabelStatusBulkUpdate) {
    return LabelStatusBulkUpdateTypeTransformer().encode(value).toString();
  }
  if (value is LabelType) {
    return LabelTypeTypeTransformer().encode(value).toString();
  }
  if (value is Language) {
    return LanguageTypeTransformer().encode(value).toString();
  }
  if (value is LeadFormQuestionFieldType) {
    return LeadFormQuestionFieldTypeTypeTransformer().encode(value).toString();
  }
  if (value is LeadFormQuestionType) {
    return LeadFormQuestionTypeTypeTransformer().encode(value).toString();
  }
  if (value is LeadFormStatus) {
    return LeadFormStatusTypeTransformer().encode(value).toString();
  }
  if (value is LeadsExportStatus) {
    return LeadsExportStatusTypeTransformer().encode(value).toString();
  }
  if (value is LookbackPeriodOptions) {
    return LookbackPeriodOptionsTypeTransformer().encode(value).toString();
  }
  if (value is MMMReportGranularity) {
    return MMMReportGranularityTypeTransformer().encode(value).toString();
  }
  if (value is MMMReportLevel) {
    return MMMReportLevelTypeTransformer().encode(value).toString();
  }
  if (value is MMMReportingColumn) {
    return MMMReportingColumnTypeTransformer().encode(value).toString();
  }
  if (value is MMMReportingTargetingType) {
    return MMMReportingTargetingTypeTypeTransformer().encode(value).toString();
  }
  if (value is MatchType) {
    return MatchTypeTypeTransformer().encode(value).toString();
  }
  if (value is MatchTypeResponse) {
    return MatchTypeResponseTypeTransformer().encode(value).toString();
  }
  if (value is MediaType) {
    return MediaTypeTypeTransformer().encode(value).toString();
  }
  if (value is MediaUploadStatus) {
    return MediaUploadStatusTypeTransformer().encode(value).toString();
  }
  if (value is MediaUploadType) {
    return MediaUploadTypeTypeTransformer().encode(value).toString();
  }
  if (value is MemberBusinessRole) {
    return MemberBusinessRoleTypeTransformer().encode(value).toString();
  }
  if (value is MetricsReportingLevel) {
    return MetricsReportingLevelTypeTransformer().encode(value).toString();
  }
  if (value is MetricsReportingTemplateType) {
    return MetricsReportingTemplateTypeTypeTransformer().encode(value).toString();
  }
  if (value is MobileAppPlatform) {
    return MobileAppPlatformTypeTransformer().encode(value).toString();
  }
  if (value is MsotEventName) {
    return MsotEventNameTypeTransformer().encode(value).toString();
  }
  if (value is MultiPinsAnalyticsMetricTypesItem) {
    return MultiPinsAnalyticsMetricTypesItemTypeTransformer().encode(value).toString();
  }
  if (value is NetworkType) {
    return NetworkTypeTypeTransformer().encode(value).toString();
  }
  if (value is NonDraftEntityStatus) {
    return NonDraftEntityStatusTypeTransformer().encode(value).toString();
  }
  if (value is NonNullableCatalogsCurrency) {
    return NonNullableCatalogsCurrencyTypeTransformer().encode(value).toString();
  }
  if (value is NullableCatalogsItemFieldType) {
    return NullableCatalogsItemFieldTypeTypeTransformer().encode(value).toString();
  }
  if (value is NullableCurrency) {
    return NullableCurrencyTypeTransformer().encode(value).toString();
  }
  if (value is NullableEntityStatus) {
    return NullableEntityStatusTypeTransformer().encode(value).toString();
  }
  if (value is NullableLabelStatus) {
    return NullableLabelStatusTypeTransformer().encode(value).toString();
  }
  if (value is NullableLabelType) {
    return NullableLabelTypeTypeTransformer().encode(value).toString();
  }
  if (value is NullablePartnerType) {
    return NullablePartnerTypeTypeTransformer().encode(value).toString();
  }
  if (value is NullalbleMatchType) {
    return NullalbleMatchTypeTypeTransformer().encode(value).toString();
  }
  if (value is NumericFilterOperatorType) {
    return NumericFilterOperatorTypeTypeTransformer().encode(value).toString();
  }
  if (value is ObjectiveType) {
    return ObjectiveTypeTypeTransformer().encode(value).toString();
  }
  if (value is OperationType) {
    return OperationTypeTypeTransformer().encode(value).toString();
  }
  if (value is OptimizationType) {
    return OptimizationTypeTypeTransformer().encode(value).toString();
  }
  if (value is Order) {
    return OrderTypeTransformer().encode(value).toString();
  }
  if (value is OrderLinePaidType) {
    return OrderLinePaidTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderLineStatus) {
    return OrderLineStatusTypeTransformer().encode(value).toString();
  }
  if (value is OsFamily) {
    return OsFamilyTypeTransformer().encode(value).toString();
  }
  if (value is OverallStatusOptions) {
    return OverallStatusOptionsTypeTransformer().encode(value).toString();
  }
  if (value is PacingDeliveryType) {
    return PacingDeliveryTypeTypeTransformer().encode(value).toString();
  }
  if (value is PartnerType) {
    return PartnerTypeTypeTransformer().encode(value).toString();
  }
  if (value is Permissions) {
    return PermissionsTypeTransformer().encode(value).toString();
  }
  if (value is PermissionsWithOwner) {
    return PermissionsWithOwnerTypeTransformer().encode(value).toString();
  }
  if (value is PinFilter) {
    return PinFilterTypeTransformer().encode(value).toString();
  }
  if (value is PinPromotionSummaryStatus) {
    return PinPromotionSummaryStatusTypeTransformer().encode(value).toString();
  }
  if (value is PinType) {
    return PinTypeTypeTransformer().encode(value).toString();
  }
  if (value is PinnerListType) {
    return PinnerListTypeTypeTransformer().encode(value).toString();
  }
  if (value is PinterestLibPaginationOrder) {
    return PinterestLibPaginationOrderTypeTransformer().encode(value).toString();
  }
  if (value is PlacementGroupType) {
    return PlacementGroupTypeTypeTransformer().encode(value).toString();
  }
  if (value is PlacementTrafficType) {
    return PlacementTrafficTypeTypeTransformer().encode(value).toString();
  }
  if (value is PlacementType) {
    return PlacementTypeTypeTransformer().encode(value).toString();
  }
  if (value is PreferredMediaType) {
    return PreferredMediaTypeTypeTransformer().encode(value).toString();
  }
  if (value is PrimarySort) {
    return PrimarySortTypeTransformer().encode(value).toString();
  }
  if (value is ProductAvailability) {
    return ProductAvailabilityTypeTransformer().encode(value).toString();
  }
  if (value is ProductAvailabilityType) {
    return ProductAvailabilityTypeTypeTransformer().encode(value).toString();
  }
  if (value is ProductCategoriesEngagementType) {
    return ProductCategoriesEngagementTypeTypeTransformer().encode(value).toString();
  }
  if (value is ProductCategoryDetailLookbackWindow) {
    return ProductCategoryDetailLookbackWindowTypeTransformer().encode(value).toString();
  }
  if (value is ProductCategoryEnum) {
    return ProductCategoryEnumTypeTransformer().encode(value).toString();
  }
  if (value is ProductCategoryRegion) {
    return ProductCategoryRegionTypeTransformer().encode(value).toString();
  }
  if (value is ProductCondition) {
    return ProductConditionTypeTransformer().encode(value).toString();
  }
  if (value is ProductGroupPromotionCustomizableCTAType) {
    return ProductGroupPromotionCustomizableCTATypeTypeTransformer().encode(value).toString();
  }
  if (value is ProductGroupSummaryStatus) {
    return ProductGroupSummaryStatusTypeTransformer().encode(value).toString();
  }
  if (value is PromotionApplicationLevel) {
    return PromotionApplicationLevelTypeTransformer().encode(value).toString();
  }
  if (value is PromotionType) {
    return PromotionTypeTypeTransformer().encode(value).toString();
  }
  if (value is PublicTargetingType) {
    return PublicTargetingTypeTypeTransformer().encode(value).toString();
  }
  if (value is QueryLabelEntityStatusesItems) {
    return QueryLabelEntityStatusesItemsTypeTransformer().encode(value).toString();
  }
  if (value is QueryLabelTypesItems) {
    return QueryLabelTypesItemsTypeTransformer().encode(value).toString();
  }
  if (value is QuerymetrictypesItems) {
    return QuerymetrictypesItemsTypeTransformer().encode(value).toString();
  }
  if (value is QuerypinanalyticsmetrictypesItems) {
    return QuerypinanalyticsmetrictypesItemsTypeTransformer().encode(value).toString();
  }
  if (value is QueryvideopinmetrictypesItems) {
    return QueryvideopinmetrictypesItemsTypeTransformer().encode(value).toString();
  }
  if (value is ReportType) {
    return ReportTypeTypeTransformer().encode(value).toString();
  }
  if (value is ReportingColumn) {
    return ReportingColumnTypeTransformer().encode(value).toString();
  }
  if (value is ReportingColumnAsync) {
    return ReportingColumnAsyncTypeTransformer().encode(value).toString();
  }
  if (value is ReportingColumnSync) {
    return ReportingColumnSyncTypeTransformer().encode(value).toString();
  }
  if (value is ReportingTimeZone) {
    return ReportingTimeZoneTypeTransformer().encode(value).toString();
  }
  if (value is Role) {
    return RoleTypeTransformer().encode(value).toString();
  }
  if (value is SSIOOrderLineType) {
    return SSIOOrderLineTypeTypeTransformer().encode(value).toString();
  }
  if (value is ScheduleAction) {
    return ScheduleActionTypeTransformer().encode(value).toString();
  }
  if (value is ScheduleStatus) {
    return ScheduleStatusTypeTransformer().encode(value).toString();
  }
  if (value is ScheduleType) {
    return ScheduleTypeTypeTransformer().encode(value).toString();
  }
  if (value is SourcePlatformOptions) {
    return SourcePlatformOptionsTypeTransformer().encode(value).toString();
  }
  if (value is StandardPinMetricTypes) {
    return StandardPinMetricTypesTypeTransformer().encode(value).toString();
  }
  if (value is SummaryStatus) {
    return SummaryStatusTypeTransformer().encode(value).toString();
  }
  if (value is SupplementalItemBatchOperationStatus) {
    return SupplementalItemBatchOperationStatusTypeTransformer().encode(value).toString();
  }
  if (value is SupplementalItemProcessingStatus) {
    return SupplementalItemProcessingStatusTypeTransformer().encode(value).toString();
  }
  if (value is TargetingAdvertiserCountry) {
    return TargetingAdvertiserCountryTypeTransformer().encode(value).toString();
  }
  if (value is TargetingSpecAgeBucket) {
    return TargetingSpecAgeBucketTypeTransformer().encode(value).toString();
  }
  if (value is TargetingSpecAppType) {
    return TargetingSpecAppTypeTypeTransformer().encode(value).toString();
  }
  if (value is TargetingSpecGender) {
    return TargetingSpecGenderTypeTransformer().encode(value).toString();
  }
  if (value is TargetingSpecListOperation) {
    return TargetingSpecListOperationTypeTransformer().encode(value).toString();
  }
  if (value is TargetingSpecTargetingStrategyItems) {
    return TargetingSpecTargetingStrategyItemsTypeTransformer().encode(value).toString();
  }
  if (value is TargetingStrategy) {
    return TargetingStrategyTypeTransformer().encode(value).toString();
  }
  if (value is TargetingTemplateStatus) {
    return TargetingTemplateStatusTypeTransformer().encode(value).toString();
  }
  if (value is TieBreakerType) {
    return TieBreakerTypeTypeTransformer().encode(value).toString();
  }
  if (value is TokenGrantType) {
    return TokenGrantTypeTypeTransformer().encode(value).toString();
  }
  if (value is TokenTypeHint) {
    return TokenTypeHintTypeTransformer().encode(value).toString();
  }
  if (value is TopPinsSortBy) {
    return TopPinsSortByTypeTransformer().encode(value).toString();
  }
  if (value is TopVideoPinsSortBy) {
    return TopVideoPinsSortByTypeTransformer().encode(value).toString();
  }
  if (value is TrendType) {
    return TrendTypeTypeTransformer().encode(value).toString();
  }
  if (value is TrendsAgeBucket) {
    return TrendsAgeBucketTypeTransformer().encode(value).toString();
  }
  if (value is TrendsGender) {
    return TrendsGenderTypeTransformer().encode(value).toString();
  }
  if (value is TrendsGenderFilter) {
    return TrendsGenderFilterTypeTransformer().encode(value).toString();
  }
  if (value is TrendsL1Interest) {
    return TrendsL1InterestTypeTransformer().encode(value).toString();
  }
  if (value is TrendsSupportedRegion) {
    return TrendsSupportedRegionTypeTransformer().encode(value).toString();
  }
  if (value is UpdateMaskBidOptionField) {
    return UpdateMaskBidOptionFieldTypeTransformer().encode(value).toString();
  }
  if (value is UpdateMaskFieldType) {
    return UpdateMaskFieldTypeTypeTransformer().encode(value).toString();
  }
  if (value is UserAccountType) {
    return UserAccountTypeTypeTransformer().encode(value).toString();
  }
  if (value is UserFollowingFeedType) {
    return UserFollowingFeedTypeTypeTransformer().encode(value).toString();
  }
  if (value is UserListOperationType) {
    return UserListOperationTypeTypeTransformer().encode(value).toString();
  }
  if (value is UserListType) {
    return UserListTypeTypeTransformer().encode(value).toString();
  }
  if (value is VerticalProductCategory) {
    return VerticalProductCategoryTypeTransformer().encode(value).toString();
  }
  if (value is VideoPinMetricTypes) {
    return VideoPinMetricTypesTypeTransformer().encode(value).toString();
  }
  if (value is WebsiteVerificationMethod) {
    return WebsiteVerificationMethodTypeTransformer().encode(value).toString();
  }
  if (value is WorkloadState) {
    return WorkloadStateTypeTransformer().encode(value).toString();
  }
  return value.toString();
}

/// Returns the decoded body as UTF-8 if the given headers indicate an 'application/json'
/// content type. Otherwise, returns the decoded body as decoded by dart:http package.
Future<String> _decodeBodyBytes(Response response) async {
  final contentType = response.headers['content-type'];
  return contentType != null && contentType.toLowerCase().startsWith('application/json')
    ? response.bodyBytes.isEmpty ? '' : utf8.decode(response.bodyBytes)
    : response.body;
}

/// Returns a valid [T] value found at the specified Map [key], null otherwise.
T? mapValueOfType<T>(dynamic map, String key) {
  final dynamic value = map is Map ? map[key] : null;
  if (T == double && value is int) {
    return value.toDouble() as T;
  }
  return value is T ? value : null;
}

/// Returns a valid Map<K, V> found at the specified Map [key], null otherwise.
Map<K, V>? mapCastOfType<K, V>(dynamic map, String key) {
  final dynamic value = map is Map ? map[key] : null;
  return value is Map ? value.cast<K, V>() : null;
}

/// Returns a valid [DateTime] found at the specified Map [key], null otherwise.
DateTime? mapDateTime(dynamic map, String key, [String? pattern]) {
  final dynamic value = map is Map ? map[key] : null;
  if (value != null) {
    int? millis;
    if (value is int) {
      millis = value;
    } else if (value is String) {
      if (_isEpochMarker(pattern)) {
        millis = int.tryParse(value);
      } else {
        return DateTime.tryParse(value);
      }
    }
    if (millis != null) {
      return DateTime.fromMillisecondsSinceEpoch(millis, isUtc: true);
    }
  }
  return null;
}
