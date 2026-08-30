package org.openapitools.configuration

import org.openapitools.model.ActionType
import org.openapitools.model.AdAccountEntityType
import org.openapitools.model.AdAdsAnalyticsAsyncTargetingTypes
import org.openapitools.model.AdCollectionsHeaderType
import org.openapitools.model.AdDisapprovalReasons
import org.openapitools.model.AdGroupAudienceSizingCreativeTypes
import org.openapitools.model.AdGroupSummaryStatus
import org.openapitools.model.AdPinPreviewCreativeType
import org.openapitools.model.AdReviewStatus
import org.openapitools.model.AdShoppingPreviewCreativeType
import org.openapitools.model.AdeColumnType
import org.openapitools.model.AdgroupPlacementGroupType
import org.openapitools.model.AdgroupTrackingFeatureType
import org.openapitools.model.AdsAnalyticsAccountTargetingType
import org.openapitools.model.AdsAnalyticsAdGroupTargetingType
import org.openapitools.model.AdsAnalyticsAdTargetingType
import org.openapitools.model.AdsAnalyticsCampaignTargetingType
import org.openapitools.model.AdsAnalyticsFilterColumn
import org.openapitools.model.AdsAnalyticsFilterOperator
import org.openapitools.model.AdsCreditDiscountType
import org.openapitools.model.AdvertiserDefinedEventMappingType
import org.openapitools.model.AgeTrendsBucket
import org.openapitools.model.AiDisclosureItem
import org.openapitools.model.AppsflyerPlatform
import org.openapitools.model.AssetGroupType
import org.openapitools.model.AssetPermissionType
import org.openapitools.model.AssetSearchBy
import org.openapitools.model.AssetSortBy
import org.openapitools.model.AssetTypeResponse
import org.openapitools.model.AttributionActionType
import org.openapitools.model.AttributionMatchType
import org.openapitools.model.AttributionModel
import org.openapitools.model.AttributionScope
import org.openapitools.model.AudienceAccountType
import org.openapitools.model.AudienceInsightType
import org.openapitools.model.AudienceObjectiveType
import org.openapitools.model.AudienceOwnershipType
import org.openapitools.model.AudienceStatus
import org.openapitools.model.AudienceType
import org.openapitools.model.AudienceUpdateOperationType
import org.openapitools.model.BasePreferredMediaType
import org.openapitools.model.BatchOperationStatus
import org.openapitools.model.BidFloorObjectiveType
import org.openapitools.model.BidStrategyType
import org.openapitools.model.BillingInvoiceDocumentType
import org.openapitools.model.BillingInvoiceSortField
import org.openapitools.model.BillingInvoiceStatus
import org.openapitools.model.BillingProfileCardType
import org.openapitools.model.BillingProfilePaymentMethodBrand
import org.openapitools.model.BillingProfileStatus
import org.openapitools.model.BillingType
import org.openapitools.model.BoardPrivacy
import org.openapitools.model.BoardPrivacyFilter
import org.openapitools.model.BoardUpdatePrivacy
import org.openapitools.model.BudgetDurationType
import org.openapitools.model.BudgetType
import org.openapitools.model.BulkEntityType
import org.openapitools.model.BulkOutputFormat
import org.openapitools.model.BulkReportingJobStatus
import org.openapitools.model.BulkRequestStatus
import org.openapitools.model.BusinessAccessRole
import org.openapitools.model.BusinessMemberSortBy
import org.openapitools.model.BusinessRoleForInvite
import org.openapitools.model.BusinessRoleForMembers
import org.openapitools.model.BusinessSearchBy
import org.openapitools.model.CampaignBidOptionsUpdateMaskItems
import org.openapitools.model.CampaignObjectiveType
import org.openapitools.model.CampaignPlanningConfidenceLevelAlertReason
import org.openapitools.model.CampaignPlanningConfidenceLevelAlertSeverity
import org.openapitools.model.CampaignPlanningConversionAttributionWindowDays
import org.openapitools.model.CampaignPlanningConversionEvent
import org.openapitools.model.CampaignPlanningEstimationType
import org.openapitools.model.CampaignPlanningResponseErrorCode
import org.openapitools.model.CampaignSummaryStatus
import org.openapitools.model.CatalogsAiContentDisclosureLabel
import org.openapitools.model.CatalogsFeedProcessingScheduleTimezone
import org.openapitools.model.CatalogsFeedProcessingStatus
import org.openapitools.model.CatalogsFormat
import org.openapitools.model.CatalogsHotelProductGroupType
import org.openapitools.model.CatalogsItemValidationIssue
import org.openapitools.model.CatalogsLocale
import org.openapitools.model.CatalogsProductGroupStatus
import org.openapitools.model.CatalogsProductGroupType
import org.openapitools.model.CatalogsStatus
import org.openapitools.model.CatalogsType
import org.openapitools.model.ChangeHistoryDataType
import org.openapitools.model.ChangeHistoryOperationType
import org.openapitools.model.CollectionsHeaderType
import org.openapitools.model.ContentType
import org.openapitools.model.ConversionAttributionWindowDays
import org.openapitools.model.ConversionDeletionRequestStatus
import org.openapitools.model.ConversionEvent
import org.openapitools.model.ConversionEventIngestionSource
import org.openapitools.model.ConversionLearningModeType
import org.openapitools.model.ConversionObjectiveType
import org.openapitools.model.ConversionProductAttributionType
import org.openapitools.model.ConversionProductReportBreakdownType
import org.openapitools.model.ConversionProductReportGranularity
import org.openapitools.model.ConversionProductReportLevel
import org.openapitools.model.ConversionProductReportingColumn
import org.openapitools.model.ConversionReportAttributionType
import org.openapitools.model.ConversionReportTimeType
import org.openapitools.model.ConversionTagType
import org.openapitools.model.ConversionTagTypeOptimal
import org.openapitools.model.Country
import org.openapitools.model.CreationSource
import org.openapitools.model.CreativeAssetsVisibilityType
import org.openapitools.model.CreativeType
import org.openapitools.model.Currency
import org.openapitools.model.CustomerListStatus
import org.openapitools.model.CustomizableCTAType
import org.openapitools.model.DataOutputFormat
import org.openapitools.model.DataStatus
import org.openapitools.model.DeliveryEstimateObjectiveType
import org.openapitools.model.DisclosureType
import org.openapitools.model.DiscountStatus
import org.openapitools.model.EnhancedMatchStatusType
import org.openapitools.model.EntityLabelStatus
import org.openapitools.model.EntityStatus
import org.openapitools.model.EventProcessingStatus
import org.openapitools.model.FilterOperatorType
import org.openapitools.model.FormFactor
import org.openapitools.model.FreqBidMultiplierTimeWindow
import org.openapitools.model.FrequencyGoalMetadataTimerange
import org.openapitools.model.Gender
import org.openapitools.model.GenderBucket
import org.openapitools.model.Granularity
import org.openapitools.model.GridClickType
import org.openapitools.model.HttpMethod
import org.openapitools.model.IneligibleProductTagReason
import org.openapitools.model.IngestionSource
import org.openapitools.model.IngestionSourceOptions
import org.openapitools.model.IntegrationLogEventType
import org.openapitools.model.IntegrationLogLevel
import org.openapitools.model.IntendedPromotionType
import org.openapitools.model.InterestsEnum
import org.openapitools.model.InviteFilterStatus
import org.openapitools.model.InviteStatus
import org.openapitools.model.InviteType
import org.openapitools.model.ItemAvailability
import org.openapitools.model.ItemProcessingStatus
import org.openapitools.model.LabelParentType
import org.openapitools.model.LabelStatus
import org.openapitools.model.LabelStatusBulkUpdate
import org.openapitools.model.LabelType
import org.openapitools.model.Language
import org.openapitools.model.LeadFormQuestionFieldType
import org.openapitools.model.LeadFormQuestionType
import org.openapitools.model.LeadFormStatus
import org.openapitools.model.LeadsExportStatus
import org.openapitools.model.LookbackPeriodOptions
import org.openapitools.model.MMMReportGranularity
import org.openapitools.model.MMMReportLevel
import org.openapitools.model.MMMReportingColumn
import org.openapitools.model.MMMReportingTargetingType
import org.openapitools.model.MatchType
import org.openapitools.model.MatchTypeResponse
import org.openapitools.model.MediaType
import org.openapitools.model.MediaUploadStatus
import org.openapitools.model.MediaUploadType
import org.openapitools.model.MemberBusinessRole
import org.openapitools.model.MetricsReportingLevel
import org.openapitools.model.MetricsReportingTemplateType
import org.openapitools.model.MobileAppPlatform
import org.openapitools.model.MsotEventName
import org.openapitools.model.MultiPinsAnalyticsMetricTypesItem
import org.openapitools.model.NetworkType
import org.openapitools.model.NonDraftEntityStatus
import org.openapitools.model.NonNullableCatalogsCurrency
import org.openapitools.model.NullableCatalogsItemFieldType
import org.openapitools.model.NullableCurrency
import org.openapitools.model.NullableEntityStatus
import org.openapitools.model.NullableLabelStatus
import org.openapitools.model.NullableLabelType
import org.openapitools.model.NullablePartnerType
import org.openapitools.model.NullalbleMatchType
import org.openapitools.model.NumericFilterOperatorType
import org.openapitools.model.ObjectiveType
import org.openapitools.model.OperationType
import org.openapitools.model.OptimizationType
import org.openapitools.model.Order
import org.openapitools.model.OrderLinePaidType
import org.openapitools.model.OrderLineStatus
import org.openapitools.model.OsFamily
import org.openapitools.model.OverallStatusOptions
import org.openapitools.model.PacingDeliveryType
import org.openapitools.model.PartnerType
import org.openapitools.model.Permissions
import org.openapitools.model.PermissionsWithOwner
import org.openapitools.model.PinFilter
import org.openapitools.model.PinPromotionSummaryStatus
import org.openapitools.model.PinType
import org.openapitools.model.PinnerListType
import org.openapitools.model.PinterestLibPaginationOrder
import org.openapitools.model.PlacementGroupType
import org.openapitools.model.PlacementTrafficType
import org.openapitools.model.PlacementType
import org.openapitools.model.PreferredMediaType
import org.openapitools.model.PrimarySort
import org.openapitools.model.ProductAvailability
import org.openapitools.model.ProductAvailabilityType
import org.openapitools.model.ProductCategoriesEngagementType
import org.openapitools.model.ProductCategoryDetailLookbackWindow
import org.openapitools.model.ProductCategoryEnum
import org.openapitools.model.ProductCategoryRegion
import org.openapitools.model.ProductCondition
import org.openapitools.model.ProductGroupPromotionCustomizableCTAType
import org.openapitools.model.ProductGroupSummaryStatus
import org.openapitools.model.PromotionApplicationLevel
import org.openapitools.model.PromotionType
import org.openapitools.model.PublicTargetingType
import org.openapitools.model.QueryLabelEntityStatusesItems
import org.openapitools.model.QueryLabelTypesItems
import org.openapitools.model.QuerymetrictypesItems
import org.openapitools.model.QuerypinanalyticsmetrictypesItems
import org.openapitools.model.QueryvideopinmetrictypesItems
import org.openapitools.model.ReportType
import org.openapitools.model.ReportingColumn
import org.openapitools.model.ReportingColumnAsync
import org.openapitools.model.ReportingColumnSync
import org.openapitools.model.ReportingTimeZone
import org.openapitools.model.Role
import org.openapitools.model.SSIOOrderLineType
import org.openapitools.model.ScheduleAction
import org.openapitools.model.ScheduleStatus
import org.openapitools.model.ScheduleType
import org.openapitools.model.SourcePlatformOptions
import org.openapitools.model.StandardPinMetricTypes
import org.openapitools.model.SummaryStatus
import org.openapitools.model.SupplementalItemBatchOperationStatus
import org.openapitools.model.SupplementalItemProcessingStatus
import org.openapitools.model.TargetingAdvertiserCountry
import org.openapitools.model.TargetingSpecAgeBucket
import org.openapitools.model.TargetingSpecAppType
import org.openapitools.model.TargetingSpecGender
import org.openapitools.model.TargetingSpecListOperation
import org.openapitools.model.TargetingSpecTargetingStrategyItems
import org.openapitools.model.TargetingStrategy
import org.openapitools.model.TargetingTemplateStatus
import org.openapitools.model.TieBreakerType
import org.openapitools.model.TokenGrantType
import org.openapitools.model.TokenTypeHint
import org.openapitools.model.TopPinsSortBy
import org.openapitools.model.TopVideoPinsSortBy
import org.openapitools.model.TrendType
import org.openapitools.model.TrendsAgeBucket
import org.openapitools.model.TrendsGender
import org.openapitools.model.TrendsGenderFilter
import org.openapitools.model.TrendsL1Interest
import org.openapitools.model.TrendsSupportedRegion
import org.openapitools.model.UpdateMaskBidOptionField
import org.openapitools.model.UpdateMaskFieldType
import org.openapitools.model.UserAccountType
import org.openapitools.model.UserFollowingFeedType
import org.openapitools.model.UserListOperationType
import org.openapitools.model.UserListType
import org.openapitools.model.VerticalProductCategory
import org.openapitools.model.VideoPinMetricTypes
import org.openapitools.model.WebsiteVerificationMethod
import org.openapitools.model.WorkloadState

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.convert.converter.Converter

/**
 * This class provides Spring Converter beans for the enum models in the OpenAPI specification.
 *
 * By default, Spring only converts primitive types to enums using Enum::valueOf, which can prevent
 * correct conversion if the OpenAPI specification is using an `enumPropertyNaming` other than
 * `original` or the specification has an integer enum.
 */
@Configuration(value = "org.openapitools.configuration.enumConverterConfiguration")
class EnumConverterConfiguration {

    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.actionTypeConverter"])
    fun actionTypeConverter(): Converter<kotlin.String, ActionType> {
        return object: Converter<kotlin.String, ActionType> {
            override fun convert(source: kotlin.String): ActionType = ActionType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adAccountEntityTypeConverter"])
    fun adAccountEntityTypeConverter(): Converter<kotlin.String, AdAccountEntityType> {
        return object: Converter<kotlin.String, AdAccountEntityType> {
            override fun convert(source: kotlin.String): AdAccountEntityType = AdAccountEntityType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adAdsAnalyticsAsyncTargetingTypesConverter"])
    fun adAdsAnalyticsAsyncTargetingTypesConverter(): Converter<kotlin.String, AdAdsAnalyticsAsyncTargetingTypes> {
        return object: Converter<kotlin.String, AdAdsAnalyticsAsyncTargetingTypes> {
            override fun convert(source: kotlin.String): AdAdsAnalyticsAsyncTargetingTypes = AdAdsAnalyticsAsyncTargetingTypes.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adCollectionsHeaderTypeConverter"])
    fun adCollectionsHeaderTypeConverter(): Converter<kotlin.String, AdCollectionsHeaderType> {
        return object: Converter<kotlin.String, AdCollectionsHeaderType> {
            override fun convert(source: kotlin.String): AdCollectionsHeaderType = AdCollectionsHeaderType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adDisapprovalReasonsConverter"])
    fun adDisapprovalReasonsConverter(): Converter<kotlin.String, AdDisapprovalReasons> {
        return object: Converter<kotlin.String, AdDisapprovalReasons> {
            override fun convert(source: kotlin.String): AdDisapprovalReasons = AdDisapprovalReasons.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adGroupAudienceSizingCreativeTypesConverter"])
    fun adGroupAudienceSizingCreativeTypesConverter(): Converter<kotlin.String, AdGroupAudienceSizingCreativeTypes> {
        return object: Converter<kotlin.String, AdGroupAudienceSizingCreativeTypes> {
            override fun convert(source: kotlin.String): AdGroupAudienceSizingCreativeTypes = AdGroupAudienceSizingCreativeTypes.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adGroupSummaryStatusConverter"])
    fun adGroupSummaryStatusConverter(): Converter<kotlin.String, AdGroupSummaryStatus> {
        return object: Converter<kotlin.String, AdGroupSummaryStatus> {
            override fun convert(source: kotlin.String): AdGroupSummaryStatus = AdGroupSummaryStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adPinPreviewCreativeTypeConverter"])
    fun adPinPreviewCreativeTypeConverter(): Converter<kotlin.String, AdPinPreviewCreativeType> {
        return object: Converter<kotlin.String, AdPinPreviewCreativeType> {
            override fun convert(source: kotlin.String): AdPinPreviewCreativeType = AdPinPreviewCreativeType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adReviewStatusConverter"])
    fun adReviewStatusConverter(): Converter<kotlin.String, AdReviewStatus> {
        return object: Converter<kotlin.String, AdReviewStatus> {
            override fun convert(source: kotlin.String): AdReviewStatus = AdReviewStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adShoppingPreviewCreativeTypeConverter"])
    fun adShoppingPreviewCreativeTypeConverter(): Converter<kotlin.String, AdShoppingPreviewCreativeType> {
        return object: Converter<kotlin.String, AdShoppingPreviewCreativeType> {
            override fun convert(source: kotlin.String): AdShoppingPreviewCreativeType = AdShoppingPreviewCreativeType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adeColumnTypeConverter"])
    fun adeColumnTypeConverter(): Converter<kotlin.String, AdeColumnType> {
        return object: Converter<kotlin.String, AdeColumnType> {
            override fun convert(source: kotlin.String): AdeColumnType = AdeColumnType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adgroupPlacementGroupTypeConverter"])
    fun adgroupPlacementGroupTypeConverter(): Converter<kotlin.String, AdgroupPlacementGroupType> {
        return object: Converter<kotlin.String, AdgroupPlacementGroupType> {
            override fun convert(source: kotlin.String): AdgroupPlacementGroupType = AdgroupPlacementGroupType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adgroupTrackingFeatureTypeConverter"])
    fun adgroupTrackingFeatureTypeConverter(): Converter<kotlin.String, AdgroupTrackingFeatureType> {
        return object: Converter<kotlin.String, AdgroupTrackingFeatureType> {
            override fun convert(source: kotlin.String): AdgroupTrackingFeatureType = AdgroupTrackingFeatureType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adsAnalyticsAccountTargetingTypeConverter"])
    fun adsAnalyticsAccountTargetingTypeConverter(): Converter<kotlin.String, AdsAnalyticsAccountTargetingType> {
        return object: Converter<kotlin.String, AdsAnalyticsAccountTargetingType> {
            override fun convert(source: kotlin.String): AdsAnalyticsAccountTargetingType = AdsAnalyticsAccountTargetingType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adsAnalyticsAdGroupTargetingTypeConverter"])
    fun adsAnalyticsAdGroupTargetingTypeConverter(): Converter<kotlin.String, AdsAnalyticsAdGroupTargetingType> {
        return object: Converter<kotlin.String, AdsAnalyticsAdGroupTargetingType> {
            override fun convert(source: kotlin.String): AdsAnalyticsAdGroupTargetingType = AdsAnalyticsAdGroupTargetingType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adsAnalyticsAdTargetingTypeConverter"])
    fun adsAnalyticsAdTargetingTypeConverter(): Converter<kotlin.String, AdsAnalyticsAdTargetingType> {
        return object: Converter<kotlin.String, AdsAnalyticsAdTargetingType> {
            override fun convert(source: kotlin.String): AdsAnalyticsAdTargetingType = AdsAnalyticsAdTargetingType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adsAnalyticsCampaignTargetingTypeConverter"])
    fun adsAnalyticsCampaignTargetingTypeConverter(): Converter<kotlin.String, AdsAnalyticsCampaignTargetingType> {
        return object: Converter<kotlin.String, AdsAnalyticsCampaignTargetingType> {
            override fun convert(source: kotlin.String): AdsAnalyticsCampaignTargetingType = AdsAnalyticsCampaignTargetingType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adsAnalyticsFilterColumnConverter"])
    fun adsAnalyticsFilterColumnConverter(): Converter<kotlin.String, AdsAnalyticsFilterColumn> {
        return object: Converter<kotlin.String, AdsAnalyticsFilterColumn> {
            override fun convert(source: kotlin.String): AdsAnalyticsFilterColumn = AdsAnalyticsFilterColumn.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adsAnalyticsFilterOperatorConverter"])
    fun adsAnalyticsFilterOperatorConverter(): Converter<kotlin.String, AdsAnalyticsFilterOperator> {
        return object: Converter<kotlin.String, AdsAnalyticsFilterOperator> {
            override fun convert(source: kotlin.String): AdsAnalyticsFilterOperator = AdsAnalyticsFilterOperator.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adsCreditDiscountTypeConverter"])
    fun adsCreditDiscountTypeConverter(): Converter<kotlin.String, AdsCreditDiscountType> {
        return object: Converter<kotlin.String, AdsCreditDiscountType> {
            override fun convert(source: kotlin.String): AdsCreditDiscountType = AdsCreditDiscountType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.advertiserDefinedEventMappingTypeConverter"])
    fun advertiserDefinedEventMappingTypeConverter(): Converter<kotlin.String, AdvertiserDefinedEventMappingType> {
        return object: Converter<kotlin.String, AdvertiserDefinedEventMappingType> {
            override fun convert(source: kotlin.String): AdvertiserDefinedEventMappingType = AdvertiserDefinedEventMappingType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.ageTrendsBucketConverter"])
    fun ageTrendsBucketConverter(): Converter<kotlin.String, AgeTrendsBucket> {
        return object: Converter<kotlin.String, AgeTrendsBucket> {
            override fun convert(source: kotlin.String): AgeTrendsBucket = AgeTrendsBucket.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.aiDisclosureItemConverter"])
    fun aiDisclosureItemConverter(): Converter<kotlin.String, AiDisclosureItem> {
        return object: Converter<kotlin.String, AiDisclosureItem> {
            override fun convert(source: kotlin.String): AiDisclosureItem = AiDisclosureItem.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.appsflyerPlatformConverter"])
    fun appsflyerPlatformConverter(): Converter<kotlin.String, AppsflyerPlatform> {
        return object: Converter<kotlin.String, AppsflyerPlatform> {
            override fun convert(source: kotlin.String): AppsflyerPlatform = AppsflyerPlatform.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.assetGroupTypeConverter"])
    fun assetGroupTypeConverter(): Converter<kotlin.String, AssetGroupType> {
        return object: Converter<kotlin.String, AssetGroupType> {
            override fun convert(source: kotlin.String): AssetGroupType = AssetGroupType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.assetPermissionTypeConverter"])
    fun assetPermissionTypeConverter(): Converter<kotlin.String, AssetPermissionType> {
        return object: Converter<kotlin.String, AssetPermissionType> {
            override fun convert(source: kotlin.String): AssetPermissionType = AssetPermissionType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.assetSearchByConverter"])
    fun assetSearchByConverter(): Converter<kotlin.String, AssetSearchBy> {
        return object: Converter<kotlin.String, AssetSearchBy> {
            override fun convert(source: kotlin.String): AssetSearchBy = AssetSearchBy.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.assetSortByConverter"])
    fun assetSortByConverter(): Converter<kotlin.String, AssetSortBy> {
        return object: Converter<kotlin.String, AssetSortBy> {
            override fun convert(source: kotlin.String): AssetSortBy = AssetSortBy.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.assetTypeResponseConverter"])
    fun assetTypeResponseConverter(): Converter<kotlin.String, AssetTypeResponse> {
        return object: Converter<kotlin.String, AssetTypeResponse> {
            override fun convert(source: kotlin.String): AssetTypeResponse = AssetTypeResponse.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.attributionActionTypeConverter"])
    fun attributionActionTypeConverter(): Converter<kotlin.String, AttributionActionType> {
        return object: Converter<kotlin.String, AttributionActionType> {
            override fun convert(source: kotlin.String): AttributionActionType = AttributionActionType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.attributionMatchTypeConverter"])
    fun attributionMatchTypeConverter(): Converter<kotlin.String, AttributionMatchType> {
        return object: Converter<kotlin.String, AttributionMatchType> {
            override fun convert(source: kotlin.String): AttributionMatchType = AttributionMatchType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.attributionModelConverter"])
    fun attributionModelConverter(): Converter<kotlin.String, AttributionModel> {
        return object: Converter<kotlin.String, AttributionModel> {
            override fun convert(source: kotlin.String): AttributionModel = AttributionModel.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.attributionScopeConverter"])
    fun attributionScopeConverter(): Converter<kotlin.String, AttributionScope> {
        return object: Converter<kotlin.String, AttributionScope> {
            override fun convert(source: kotlin.String): AttributionScope = AttributionScope.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.audienceAccountTypeConverter"])
    fun audienceAccountTypeConverter(): Converter<kotlin.String, AudienceAccountType> {
        return object: Converter<kotlin.String, AudienceAccountType> {
            override fun convert(source: kotlin.String): AudienceAccountType = AudienceAccountType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.audienceInsightTypeConverter"])
    fun audienceInsightTypeConverter(): Converter<kotlin.String, AudienceInsightType> {
        return object: Converter<kotlin.String, AudienceInsightType> {
            override fun convert(source: kotlin.String): AudienceInsightType = AudienceInsightType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.audienceObjectiveTypeConverter"])
    fun audienceObjectiveTypeConverter(): Converter<kotlin.String, AudienceObjectiveType> {
        return object: Converter<kotlin.String, AudienceObjectiveType> {
            override fun convert(source: kotlin.String): AudienceObjectiveType = AudienceObjectiveType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.audienceOwnershipTypeConverter"])
    fun audienceOwnershipTypeConverter(): Converter<kotlin.String, AudienceOwnershipType> {
        return object: Converter<kotlin.String, AudienceOwnershipType> {
            override fun convert(source: kotlin.String): AudienceOwnershipType = AudienceOwnershipType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.audienceStatusConverter"])
    fun audienceStatusConverter(): Converter<kotlin.String, AudienceStatus> {
        return object: Converter<kotlin.String, AudienceStatus> {
            override fun convert(source: kotlin.String): AudienceStatus = AudienceStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.audienceTypeConverter"])
    fun audienceTypeConverter(): Converter<kotlin.String, AudienceType> {
        return object: Converter<kotlin.String, AudienceType> {
            override fun convert(source: kotlin.String): AudienceType = AudienceType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.audienceUpdateOperationTypeConverter"])
    fun audienceUpdateOperationTypeConverter(): Converter<kotlin.String, AudienceUpdateOperationType> {
        return object: Converter<kotlin.String, AudienceUpdateOperationType> {
            override fun convert(source: kotlin.String): AudienceUpdateOperationType = AudienceUpdateOperationType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.basePreferredMediaTypeConverter"])
    fun basePreferredMediaTypeConverter(): Converter<kotlin.String, BasePreferredMediaType> {
        return object: Converter<kotlin.String, BasePreferredMediaType> {
            override fun convert(source: kotlin.String): BasePreferredMediaType = BasePreferredMediaType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.batchOperationStatusConverter"])
    fun batchOperationStatusConverter(): Converter<kotlin.String, BatchOperationStatus> {
        return object: Converter<kotlin.String, BatchOperationStatus> {
            override fun convert(source: kotlin.String): BatchOperationStatus = BatchOperationStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.bidFloorObjectiveTypeConverter"])
    fun bidFloorObjectiveTypeConverter(): Converter<kotlin.String, BidFloorObjectiveType> {
        return object: Converter<kotlin.String, BidFloorObjectiveType> {
            override fun convert(source: kotlin.String): BidFloorObjectiveType = BidFloorObjectiveType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.bidStrategyTypeConverter"])
    fun bidStrategyTypeConverter(): Converter<kotlin.String, BidStrategyType> {
        return object: Converter<kotlin.String, BidStrategyType> {
            override fun convert(source: kotlin.String): BidStrategyType = BidStrategyType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.billingInvoiceDocumentTypeConverter"])
    fun billingInvoiceDocumentTypeConverter(): Converter<kotlin.String, BillingInvoiceDocumentType> {
        return object: Converter<kotlin.String, BillingInvoiceDocumentType> {
            override fun convert(source: kotlin.String): BillingInvoiceDocumentType = BillingInvoiceDocumentType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.billingInvoiceSortFieldConverter"])
    fun billingInvoiceSortFieldConverter(): Converter<kotlin.String, BillingInvoiceSortField> {
        return object: Converter<kotlin.String, BillingInvoiceSortField> {
            override fun convert(source: kotlin.String): BillingInvoiceSortField = BillingInvoiceSortField.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.billingInvoiceStatusConverter"])
    fun billingInvoiceStatusConverter(): Converter<kotlin.String, BillingInvoiceStatus> {
        return object: Converter<kotlin.String, BillingInvoiceStatus> {
            override fun convert(source: kotlin.String): BillingInvoiceStatus = BillingInvoiceStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.billingProfileCardTypeConverter"])
    fun billingProfileCardTypeConverter(): Converter<kotlin.String, BillingProfileCardType> {
        return object: Converter<kotlin.String, BillingProfileCardType> {
            override fun convert(source: kotlin.String): BillingProfileCardType = BillingProfileCardType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.billingProfilePaymentMethodBrandConverter"])
    fun billingProfilePaymentMethodBrandConverter(): Converter<kotlin.String, BillingProfilePaymentMethodBrand> {
        return object: Converter<kotlin.String, BillingProfilePaymentMethodBrand> {
            override fun convert(source: kotlin.String): BillingProfilePaymentMethodBrand = BillingProfilePaymentMethodBrand.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.billingProfileStatusConverter"])
    fun billingProfileStatusConverter(): Converter<kotlin.String, BillingProfileStatus> {
        return object: Converter<kotlin.String, BillingProfileStatus> {
            override fun convert(source: kotlin.String): BillingProfileStatus = BillingProfileStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.billingTypeConverter"])
    fun billingTypeConverter(): Converter<kotlin.String, BillingType> {
        return object: Converter<kotlin.String, BillingType> {
            override fun convert(source: kotlin.String): BillingType = BillingType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.boardPrivacyConverter"])
    fun boardPrivacyConverter(): Converter<kotlin.String, BoardPrivacy> {
        return object: Converter<kotlin.String, BoardPrivacy> {
            override fun convert(source: kotlin.String): BoardPrivacy = BoardPrivacy.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.boardPrivacyFilterConverter"])
    fun boardPrivacyFilterConverter(): Converter<kotlin.String, BoardPrivacyFilter> {
        return object: Converter<kotlin.String, BoardPrivacyFilter> {
            override fun convert(source: kotlin.String): BoardPrivacyFilter = BoardPrivacyFilter.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.boardUpdatePrivacyConverter"])
    fun boardUpdatePrivacyConverter(): Converter<kotlin.String, BoardUpdatePrivacy> {
        return object: Converter<kotlin.String, BoardUpdatePrivacy> {
            override fun convert(source: kotlin.String): BoardUpdatePrivacy = BoardUpdatePrivacy.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.budgetDurationTypeConverter"])
    fun budgetDurationTypeConverter(): Converter<kotlin.String, BudgetDurationType> {
        return object: Converter<kotlin.String, BudgetDurationType> {
            override fun convert(source: kotlin.String): BudgetDurationType = BudgetDurationType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.budgetTypeConverter"])
    fun budgetTypeConverter(): Converter<kotlin.String, BudgetType> {
        return object: Converter<kotlin.String, BudgetType> {
            override fun convert(source: kotlin.String): BudgetType = BudgetType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.bulkEntityTypeConverter"])
    fun bulkEntityTypeConverter(): Converter<kotlin.String, BulkEntityType> {
        return object: Converter<kotlin.String, BulkEntityType> {
            override fun convert(source: kotlin.String): BulkEntityType = BulkEntityType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.bulkOutputFormatConverter"])
    fun bulkOutputFormatConverter(): Converter<kotlin.String, BulkOutputFormat> {
        return object: Converter<kotlin.String, BulkOutputFormat> {
            override fun convert(source: kotlin.String): BulkOutputFormat = BulkOutputFormat.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.bulkReportingJobStatusConverter"])
    fun bulkReportingJobStatusConverter(): Converter<kotlin.String, BulkReportingJobStatus> {
        return object: Converter<kotlin.String, BulkReportingJobStatus> {
            override fun convert(source: kotlin.String): BulkReportingJobStatus = BulkReportingJobStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.bulkRequestStatusConverter"])
    fun bulkRequestStatusConverter(): Converter<kotlin.String, BulkRequestStatus> {
        return object: Converter<kotlin.String, BulkRequestStatus> {
            override fun convert(source: kotlin.String): BulkRequestStatus = BulkRequestStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.businessAccessRoleConverter"])
    fun businessAccessRoleConverter(): Converter<kotlin.String, BusinessAccessRole> {
        return object: Converter<kotlin.String, BusinessAccessRole> {
            override fun convert(source: kotlin.String): BusinessAccessRole = BusinessAccessRole.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.businessMemberSortByConverter"])
    fun businessMemberSortByConverter(): Converter<kotlin.String, BusinessMemberSortBy> {
        return object: Converter<kotlin.String, BusinessMemberSortBy> {
            override fun convert(source: kotlin.String): BusinessMemberSortBy = BusinessMemberSortBy.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.businessRoleForInviteConverter"])
    fun businessRoleForInviteConverter(): Converter<kotlin.String, BusinessRoleForInvite> {
        return object: Converter<kotlin.String, BusinessRoleForInvite> {
            override fun convert(source: kotlin.String): BusinessRoleForInvite = BusinessRoleForInvite.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.businessRoleForMembersConverter"])
    fun businessRoleForMembersConverter(): Converter<kotlin.String, BusinessRoleForMembers> {
        return object: Converter<kotlin.String, BusinessRoleForMembers> {
            override fun convert(source: kotlin.String): BusinessRoleForMembers = BusinessRoleForMembers.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.businessSearchByConverter"])
    fun businessSearchByConverter(): Converter<kotlin.String, BusinessSearchBy> {
        return object: Converter<kotlin.String, BusinessSearchBy> {
            override fun convert(source: kotlin.String): BusinessSearchBy = BusinessSearchBy.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.campaignBidOptionsUpdateMaskItemsConverter"])
    fun campaignBidOptionsUpdateMaskItemsConverter(): Converter<kotlin.String, CampaignBidOptionsUpdateMaskItems> {
        return object: Converter<kotlin.String, CampaignBidOptionsUpdateMaskItems> {
            override fun convert(source: kotlin.String): CampaignBidOptionsUpdateMaskItems = CampaignBidOptionsUpdateMaskItems.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.campaignObjectiveTypeConverter"])
    fun campaignObjectiveTypeConverter(): Converter<kotlin.String, CampaignObjectiveType> {
        return object: Converter<kotlin.String, CampaignObjectiveType> {
            override fun convert(source: kotlin.String): CampaignObjectiveType = CampaignObjectiveType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.campaignPlanningConfidenceLevelAlertReasonConverter"])
    fun campaignPlanningConfidenceLevelAlertReasonConverter(): Converter<kotlin.String, CampaignPlanningConfidenceLevelAlertReason> {
        return object: Converter<kotlin.String, CampaignPlanningConfidenceLevelAlertReason> {
            override fun convert(source: kotlin.String): CampaignPlanningConfidenceLevelAlertReason = CampaignPlanningConfidenceLevelAlertReason.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.campaignPlanningConfidenceLevelAlertSeverityConverter"])
    fun campaignPlanningConfidenceLevelAlertSeverityConverter(): Converter<kotlin.String, CampaignPlanningConfidenceLevelAlertSeverity> {
        return object: Converter<kotlin.String, CampaignPlanningConfidenceLevelAlertSeverity> {
            override fun convert(source: kotlin.String): CampaignPlanningConfidenceLevelAlertSeverity = CampaignPlanningConfidenceLevelAlertSeverity.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.campaignPlanningConversionAttributionWindowDaysConverter"])
    fun campaignPlanningConversionAttributionWindowDaysConverter(): Converter<kotlin.String, CampaignPlanningConversionAttributionWindowDays> {
        return object: Converter<kotlin.String, CampaignPlanningConversionAttributionWindowDays> {
            override fun convert(source: kotlin.String): CampaignPlanningConversionAttributionWindowDays = CampaignPlanningConversionAttributionWindowDays.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.campaignPlanningConversionEventConverter"])
    fun campaignPlanningConversionEventConverter(): Converter<kotlin.String, CampaignPlanningConversionEvent> {
        return object: Converter<kotlin.String, CampaignPlanningConversionEvent> {
            override fun convert(source: kotlin.String): CampaignPlanningConversionEvent = CampaignPlanningConversionEvent.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.campaignPlanningEstimationTypeConverter"])
    fun campaignPlanningEstimationTypeConverter(): Converter<kotlin.String, CampaignPlanningEstimationType> {
        return object: Converter<kotlin.String, CampaignPlanningEstimationType> {
            override fun convert(source: kotlin.String): CampaignPlanningEstimationType = CampaignPlanningEstimationType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.campaignPlanningResponseErrorCodeConverter"])
    fun campaignPlanningResponseErrorCodeConverter(): Converter<kotlin.String, CampaignPlanningResponseErrorCode> {
        return object: Converter<kotlin.String, CampaignPlanningResponseErrorCode> {
            override fun convert(source: kotlin.String): CampaignPlanningResponseErrorCode = CampaignPlanningResponseErrorCode.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.campaignSummaryStatusConverter"])
    fun campaignSummaryStatusConverter(): Converter<kotlin.String, CampaignSummaryStatus> {
        return object: Converter<kotlin.String, CampaignSummaryStatus> {
            override fun convert(source: kotlin.String): CampaignSummaryStatus = CampaignSummaryStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.catalogsAiContentDisclosureLabelConverter"])
    fun catalogsAiContentDisclosureLabelConverter(): Converter<kotlin.String, CatalogsAiContentDisclosureLabel> {
        return object: Converter<kotlin.String, CatalogsAiContentDisclosureLabel> {
            override fun convert(source: kotlin.String): CatalogsAiContentDisclosureLabel = CatalogsAiContentDisclosureLabel.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.catalogsFeedProcessingScheduleTimezoneConverter"])
    fun catalogsFeedProcessingScheduleTimezoneConverter(): Converter<kotlin.String, CatalogsFeedProcessingScheduleTimezone> {
        return object: Converter<kotlin.String, CatalogsFeedProcessingScheduleTimezone> {
            override fun convert(source: kotlin.String): CatalogsFeedProcessingScheduleTimezone = CatalogsFeedProcessingScheduleTimezone.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.catalogsFeedProcessingStatusConverter"])
    fun catalogsFeedProcessingStatusConverter(): Converter<kotlin.String, CatalogsFeedProcessingStatus> {
        return object: Converter<kotlin.String, CatalogsFeedProcessingStatus> {
            override fun convert(source: kotlin.String): CatalogsFeedProcessingStatus = CatalogsFeedProcessingStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.catalogsFormatConverter"])
    fun catalogsFormatConverter(): Converter<kotlin.String, CatalogsFormat> {
        return object: Converter<kotlin.String, CatalogsFormat> {
            override fun convert(source: kotlin.String): CatalogsFormat = CatalogsFormat.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.catalogsHotelProductGroupTypeConverter"])
    fun catalogsHotelProductGroupTypeConverter(): Converter<kotlin.String, CatalogsHotelProductGroupType> {
        return object: Converter<kotlin.String, CatalogsHotelProductGroupType> {
            override fun convert(source: kotlin.String): CatalogsHotelProductGroupType = CatalogsHotelProductGroupType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.catalogsItemValidationIssueConverter"])
    fun catalogsItemValidationIssueConverter(): Converter<kotlin.String, CatalogsItemValidationIssue> {
        return object: Converter<kotlin.String, CatalogsItemValidationIssue> {
            override fun convert(source: kotlin.String): CatalogsItemValidationIssue = CatalogsItemValidationIssue.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.catalogsLocaleConverter"])
    fun catalogsLocaleConverter(): Converter<kotlin.String, CatalogsLocale> {
        return object: Converter<kotlin.String, CatalogsLocale> {
            override fun convert(source: kotlin.String): CatalogsLocale = CatalogsLocale.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.catalogsProductGroupStatusConverter"])
    fun catalogsProductGroupStatusConverter(): Converter<kotlin.String, CatalogsProductGroupStatus> {
        return object: Converter<kotlin.String, CatalogsProductGroupStatus> {
            override fun convert(source: kotlin.String): CatalogsProductGroupStatus = CatalogsProductGroupStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.catalogsProductGroupTypeConverter"])
    fun catalogsProductGroupTypeConverter(): Converter<kotlin.String, CatalogsProductGroupType> {
        return object: Converter<kotlin.String, CatalogsProductGroupType> {
            override fun convert(source: kotlin.String): CatalogsProductGroupType = CatalogsProductGroupType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.catalogsStatusConverter"])
    fun catalogsStatusConverter(): Converter<kotlin.String, CatalogsStatus> {
        return object: Converter<kotlin.String, CatalogsStatus> {
            override fun convert(source: kotlin.String): CatalogsStatus = CatalogsStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.catalogsTypeConverter"])
    fun catalogsTypeConverter(): Converter<kotlin.String, CatalogsType> {
        return object: Converter<kotlin.String, CatalogsType> {
            override fun convert(source: kotlin.String): CatalogsType = CatalogsType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.changeHistoryDataTypeConverter"])
    fun changeHistoryDataTypeConverter(): Converter<kotlin.String, ChangeHistoryDataType> {
        return object: Converter<kotlin.String, ChangeHistoryDataType> {
            override fun convert(source: kotlin.String): ChangeHistoryDataType = ChangeHistoryDataType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.changeHistoryOperationTypeConverter"])
    fun changeHistoryOperationTypeConverter(): Converter<kotlin.String, ChangeHistoryOperationType> {
        return object: Converter<kotlin.String, ChangeHistoryOperationType> {
            override fun convert(source: kotlin.String): ChangeHistoryOperationType = ChangeHistoryOperationType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.collectionsHeaderTypeConverter"])
    fun collectionsHeaderTypeConverter(): Converter<kotlin.String, CollectionsHeaderType> {
        return object: Converter<kotlin.String, CollectionsHeaderType> {
            override fun convert(source: kotlin.String): CollectionsHeaderType = CollectionsHeaderType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.contentTypeConverter"])
    fun contentTypeConverter(): Converter<kotlin.String, ContentType> {
        return object: Converter<kotlin.String, ContentType> {
            override fun convert(source: kotlin.String): ContentType = ContentType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.conversionAttributionWindowDaysConverter"])
    fun conversionAttributionWindowDaysConverter(): Converter<java.math.BigDecimal, ConversionAttributionWindowDays> {
        return object: Converter<java.math.BigDecimal, ConversionAttributionWindowDays> {
            override fun convert(source: java.math.BigDecimal): ConversionAttributionWindowDays = ConversionAttributionWindowDays.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.conversionDeletionRequestStatusConverter"])
    fun conversionDeletionRequestStatusConverter(): Converter<kotlin.String, ConversionDeletionRequestStatus> {
        return object: Converter<kotlin.String, ConversionDeletionRequestStatus> {
            override fun convert(source: kotlin.String): ConversionDeletionRequestStatus = ConversionDeletionRequestStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.conversionEventConverter"])
    fun conversionEventConverter(): Converter<kotlin.String, ConversionEvent> {
        return object: Converter<kotlin.String, ConversionEvent> {
            override fun convert(source: kotlin.String): ConversionEvent = ConversionEvent.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.conversionEventIngestionSourceConverter"])
    fun conversionEventIngestionSourceConverter(): Converter<kotlin.String, ConversionEventIngestionSource> {
        return object: Converter<kotlin.String, ConversionEventIngestionSource> {
            override fun convert(source: kotlin.String): ConversionEventIngestionSource = ConversionEventIngestionSource.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.conversionLearningModeTypeConverter"])
    fun conversionLearningModeTypeConverter(): Converter<kotlin.String, ConversionLearningModeType> {
        return object: Converter<kotlin.String, ConversionLearningModeType> {
            override fun convert(source: kotlin.String): ConversionLearningModeType = ConversionLearningModeType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.conversionObjectiveTypeConverter"])
    fun conversionObjectiveTypeConverter(): Converter<kotlin.String, ConversionObjectiveType> {
        return object: Converter<kotlin.String, ConversionObjectiveType> {
            override fun convert(source: kotlin.String): ConversionObjectiveType = ConversionObjectiveType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.conversionProductAttributionTypeConverter"])
    fun conversionProductAttributionTypeConverter(): Converter<kotlin.String, ConversionProductAttributionType> {
        return object: Converter<kotlin.String, ConversionProductAttributionType> {
            override fun convert(source: kotlin.String): ConversionProductAttributionType = ConversionProductAttributionType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.conversionProductReportBreakdownTypeConverter"])
    fun conversionProductReportBreakdownTypeConverter(): Converter<kotlin.String, ConversionProductReportBreakdownType> {
        return object: Converter<kotlin.String, ConversionProductReportBreakdownType> {
            override fun convert(source: kotlin.String): ConversionProductReportBreakdownType = ConversionProductReportBreakdownType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.conversionProductReportGranularityConverter"])
    fun conversionProductReportGranularityConverter(): Converter<kotlin.String, ConversionProductReportGranularity> {
        return object: Converter<kotlin.String, ConversionProductReportGranularity> {
            override fun convert(source: kotlin.String): ConversionProductReportGranularity = ConversionProductReportGranularity.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.conversionProductReportLevelConverter"])
    fun conversionProductReportLevelConverter(): Converter<kotlin.String, ConversionProductReportLevel> {
        return object: Converter<kotlin.String, ConversionProductReportLevel> {
            override fun convert(source: kotlin.String): ConversionProductReportLevel = ConversionProductReportLevel.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.conversionProductReportingColumnConverter"])
    fun conversionProductReportingColumnConverter(): Converter<kotlin.String, ConversionProductReportingColumn> {
        return object: Converter<kotlin.String, ConversionProductReportingColumn> {
            override fun convert(source: kotlin.String): ConversionProductReportingColumn = ConversionProductReportingColumn.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.conversionReportAttributionTypeConverter"])
    fun conversionReportAttributionTypeConverter(): Converter<kotlin.String, ConversionReportAttributionType> {
        return object: Converter<kotlin.String, ConversionReportAttributionType> {
            override fun convert(source: kotlin.String): ConversionReportAttributionType = ConversionReportAttributionType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.conversionReportTimeTypeConverter"])
    fun conversionReportTimeTypeConverter(): Converter<kotlin.String, ConversionReportTimeType> {
        return object: Converter<kotlin.String, ConversionReportTimeType> {
            override fun convert(source: kotlin.String): ConversionReportTimeType = ConversionReportTimeType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.conversionTagTypeConverter"])
    fun conversionTagTypeConverter(): Converter<kotlin.String, ConversionTagType> {
        return object: Converter<kotlin.String, ConversionTagType> {
            override fun convert(source: kotlin.String): ConversionTagType = ConversionTagType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.conversionTagTypeOptimalConverter"])
    fun conversionTagTypeOptimalConverter(): Converter<kotlin.String, ConversionTagTypeOptimal> {
        return object: Converter<kotlin.String, ConversionTagTypeOptimal> {
            override fun convert(source: kotlin.String): ConversionTagTypeOptimal = ConversionTagTypeOptimal.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.countryConverter"])
    fun countryConverter(): Converter<kotlin.String, Country> {
        return object: Converter<kotlin.String, Country> {
            override fun convert(source: kotlin.String): Country = Country.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.creationSourceConverter"])
    fun creationSourceConverter(): Converter<kotlin.String, CreationSource> {
        return object: Converter<kotlin.String, CreationSource> {
            override fun convert(source: kotlin.String): CreationSource = CreationSource.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.creativeAssetsVisibilityTypeConverter"])
    fun creativeAssetsVisibilityTypeConverter(): Converter<kotlin.String, CreativeAssetsVisibilityType> {
        return object: Converter<kotlin.String, CreativeAssetsVisibilityType> {
            override fun convert(source: kotlin.String): CreativeAssetsVisibilityType = CreativeAssetsVisibilityType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.creativeTypeConverter"])
    fun creativeTypeConverter(): Converter<kotlin.String, CreativeType> {
        return object: Converter<kotlin.String, CreativeType> {
            override fun convert(source: kotlin.String): CreativeType = CreativeType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.currencyConverter"])
    fun currencyConverter(): Converter<kotlin.String, Currency> {
        return object: Converter<kotlin.String, Currency> {
            override fun convert(source: kotlin.String): Currency = Currency.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.customerListStatusConverter"])
    fun customerListStatusConverter(): Converter<kotlin.String, CustomerListStatus> {
        return object: Converter<kotlin.String, CustomerListStatus> {
            override fun convert(source: kotlin.String): CustomerListStatus = CustomerListStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.customizableCTATypeConverter"])
    fun customizableCTATypeConverter(): Converter<kotlin.String, CustomizableCTAType> {
        return object: Converter<kotlin.String, CustomizableCTAType> {
            override fun convert(source: kotlin.String): CustomizableCTAType = CustomizableCTAType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.dataOutputFormatConverter"])
    fun dataOutputFormatConverter(): Converter<kotlin.String, DataOutputFormat> {
        return object: Converter<kotlin.String, DataOutputFormat> {
            override fun convert(source: kotlin.String): DataOutputFormat = DataOutputFormat.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.dataStatusConverter"])
    fun dataStatusConverter(): Converter<kotlin.String, DataStatus> {
        return object: Converter<kotlin.String, DataStatus> {
            override fun convert(source: kotlin.String): DataStatus = DataStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.deliveryEstimateObjectiveTypeConverter"])
    fun deliveryEstimateObjectiveTypeConverter(): Converter<kotlin.String, DeliveryEstimateObjectiveType> {
        return object: Converter<kotlin.String, DeliveryEstimateObjectiveType> {
            override fun convert(source: kotlin.String): DeliveryEstimateObjectiveType = DeliveryEstimateObjectiveType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.disclosureTypeConverter"])
    fun disclosureTypeConverter(): Converter<kotlin.String, DisclosureType> {
        return object: Converter<kotlin.String, DisclosureType> {
            override fun convert(source: kotlin.String): DisclosureType = DisclosureType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.discountStatusConverter"])
    fun discountStatusConverter(): Converter<kotlin.String, DiscountStatus> {
        return object: Converter<kotlin.String, DiscountStatus> {
            override fun convert(source: kotlin.String): DiscountStatus = DiscountStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.enhancedMatchStatusTypeConverter"])
    fun enhancedMatchStatusTypeConverter(): Converter<kotlin.String, EnhancedMatchStatusType> {
        return object: Converter<kotlin.String, EnhancedMatchStatusType> {
            override fun convert(source: kotlin.String): EnhancedMatchStatusType = EnhancedMatchStatusType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.entityLabelStatusConverter"])
    fun entityLabelStatusConverter(): Converter<kotlin.String, EntityLabelStatus> {
        return object: Converter<kotlin.String, EntityLabelStatus> {
            override fun convert(source: kotlin.String): EntityLabelStatus = EntityLabelStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.entityStatusConverter"])
    fun entityStatusConverter(): Converter<kotlin.String, EntityStatus> {
        return object: Converter<kotlin.String, EntityStatus> {
            override fun convert(source: kotlin.String): EntityStatus = EntityStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.eventProcessingStatusConverter"])
    fun eventProcessingStatusConverter(): Converter<kotlin.String, EventProcessingStatus> {
        return object: Converter<kotlin.String, EventProcessingStatus> {
            override fun convert(source: kotlin.String): EventProcessingStatus = EventProcessingStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.filterOperatorTypeConverter"])
    fun filterOperatorTypeConverter(): Converter<kotlin.String, FilterOperatorType> {
        return object: Converter<kotlin.String, FilterOperatorType> {
            override fun convert(source: kotlin.String): FilterOperatorType = FilterOperatorType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.formFactorConverter"])
    fun formFactorConverter(): Converter<kotlin.String, FormFactor> {
        return object: Converter<kotlin.String, FormFactor> {
            override fun convert(source: kotlin.String): FormFactor = FormFactor.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.freqBidMultiplierTimeWindowConverter"])
    fun freqBidMultiplierTimeWindowConverter(): Converter<kotlin.String, FreqBidMultiplierTimeWindow> {
        return object: Converter<kotlin.String, FreqBidMultiplierTimeWindow> {
            override fun convert(source: kotlin.String): FreqBidMultiplierTimeWindow = FreqBidMultiplierTimeWindow.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.frequencyGoalMetadataTimerangeConverter"])
    fun frequencyGoalMetadataTimerangeConverter(): Converter<kotlin.String, FrequencyGoalMetadataTimerange> {
        return object: Converter<kotlin.String, FrequencyGoalMetadataTimerange> {
            override fun convert(source: kotlin.String): FrequencyGoalMetadataTimerange = FrequencyGoalMetadataTimerange.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.genderConverter"])
    fun genderConverter(): Converter<kotlin.String, Gender> {
        return object: Converter<kotlin.String, Gender> {
            override fun convert(source: kotlin.String): Gender = Gender.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.genderBucketConverter"])
    fun genderBucketConverter(): Converter<kotlin.String, GenderBucket> {
        return object: Converter<kotlin.String, GenderBucket> {
            override fun convert(source: kotlin.String): GenderBucket = GenderBucket.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.granularityConverter"])
    fun granularityConverter(): Converter<kotlin.String, Granularity> {
        return object: Converter<kotlin.String, Granularity> {
            override fun convert(source: kotlin.String): Granularity = Granularity.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.gridClickTypeConverter"])
    fun gridClickTypeConverter(): Converter<kotlin.String, GridClickType> {
        return object: Converter<kotlin.String, GridClickType> {
            override fun convert(source: kotlin.String): GridClickType = GridClickType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.httpMethodConverter"])
    fun httpMethodConverter(): Converter<kotlin.String, HttpMethod> {
        return object: Converter<kotlin.String, HttpMethod> {
            override fun convert(source: kotlin.String): HttpMethod = HttpMethod.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.ineligibleProductTagReasonConverter"])
    fun ineligibleProductTagReasonConverter(): Converter<kotlin.String, IneligibleProductTagReason> {
        return object: Converter<kotlin.String, IneligibleProductTagReason> {
            override fun convert(source: kotlin.String): IneligibleProductTagReason = IneligibleProductTagReason.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.ingestionSourceConverter"])
    fun ingestionSourceConverter(): Converter<kotlin.String, IngestionSource> {
        return object: Converter<kotlin.String, IngestionSource> {
            override fun convert(source: kotlin.String): IngestionSource = IngestionSource.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.ingestionSourceOptionsConverter"])
    fun ingestionSourceOptionsConverter(): Converter<kotlin.String, IngestionSourceOptions> {
        return object: Converter<kotlin.String, IngestionSourceOptions> {
            override fun convert(source: kotlin.String): IngestionSourceOptions = IngestionSourceOptions.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.integrationLogEventTypeConverter"])
    fun integrationLogEventTypeConverter(): Converter<kotlin.String, IntegrationLogEventType> {
        return object: Converter<kotlin.String, IntegrationLogEventType> {
            override fun convert(source: kotlin.String): IntegrationLogEventType = IntegrationLogEventType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.integrationLogLevelConverter"])
    fun integrationLogLevelConverter(): Converter<kotlin.String, IntegrationLogLevel> {
        return object: Converter<kotlin.String, IntegrationLogLevel> {
            override fun convert(source: kotlin.String): IntegrationLogLevel = IntegrationLogLevel.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.intendedPromotionTypeConverter"])
    fun intendedPromotionTypeConverter(): Converter<kotlin.String, IntendedPromotionType> {
        return object: Converter<kotlin.String, IntendedPromotionType> {
            override fun convert(source: kotlin.String): IntendedPromotionType = IntendedPromotionType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.interestsEnumConverter"])
    fun interestsEnumConverter(): Converter<kotlin.String, InterestsEnum> {
        return object: Converter<kotlin.String, InterestsEnum> {
            override fun convert(source: kotlin.String): InterestsEnum = InterestsEnum.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.inviteFilterStatusConverter"])
    fun inviteFilterStatusConverter(): Converter<kotlin.String, InviteFilterStatus> {
        return object: Converter<kotlin.String, InviteFilterStatus> {
            override fun convert(source: kotlin.String): InviteFilterStatus = InviteFilterStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.inviteStatusConverter"])
    fun inviteStatusConverter(): Converter<kotlin.String, InviteStatus> {
        return object: Converter<kotlin.String, InviteStatus> {
            override fun convert(source: kotlin.String): InviteStatus = InviteStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.inviteTypeConverter"])
    fun inviteTypeConverter(): Converter<kotlin.String, InviteType> {
        return object: Converter<kotlin.String, InviteType> {
            override fun convert(source: kotlin.String): InviteType = InviteType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.itemAvailabilityConverter"])
    fun itemAvailabilityConverter(): Converter<kotlin.String, ItemAvailability> {
        return object: Converter<kotlin.String, ItemAvailability> {
            override fun convert(source: kotlin.String): ItemAvailability = ItemAvailability.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.itemProcessingStatusConverter"])
    fun itemProcessingStatusConverter(): Converter<kotlin.String, ItemProcessingStatus> {
        return object: Converter<kotlin.String, ItemProcessingStatus> {
            override fun convert(source: kotlin.String): ItemProcessingStatus = ItemProcessingStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.labelParentTypeConverter"])
    fun labelParentTypeConverter(): Converter<kotlin.String, LabelParentType> {
        return object: Converter<kotlin.String, LabelParentType> {
            override fun convert(source: kotlin.String): LabelParentType = LabelParentType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.labelStatusConverter"])
    fun labelStatusConverter(): Converter<kotlin.String, LabelStatus> {
        return object: Converter<kotlin.String, LabelStatus> {
            override fun convert(source: kotlin.String): LabelStatus = LabelStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.labelStatusBulkUpdateConverter"])
    fun labelStatusBulkUpdateConverter(): Converter<kotlin.String, LabelStatusBulkUpdate> {
        return object: Converter<kotlin.String, LabelStatusBulkUpdate> {
            override fun convert(source: kotlin.String): LabelStatusBulkUpdate = LabelStatusBulkUpdate.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.labelTypeConverter"])
    fun labelTypeConverter(): Converter<kotlin.String, LabelType> {
        return object: Converter<kotlin.String, LabelType> {
            override fun convert(source: kotlin.String): LabelType = LabelType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.languageConverter"])
    fun languageConverter(): Converter<kotlin.String, Language> {
        return object: Converter<kotlin.String, Language> {
            override fun convert(source: kotlin.String): Language = Language.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.leadFormQuestionFieldTypeConverter"])
    fun leadFormQuestionFieldTypeConverter(): Converter<kotlin.String, LeadFormQuestionFieldType> {
        return object: Converter<kotlin.String, LeadFormQuestionFieldType> {
            override fun convert(source: kotlin.String): LeadFormQuestionFieldType = LeadFormQuestionFieldType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.leadFormQuestionTypeConverter"])
    fun leadFormQuestionTypeConverter(): Converter<kotlin.String, LeadFormQuestionType> {
        return object: Converter<kotlin.String, LeadFormQuestionType> {
            override fun convert(source: kotlin.String): LeadFormQuestionType = LeadFormQuestionType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.leadFormStatusConverter"])
    fun leadFormStatusConverter(): Converter<kotlin.String, LeadFormStatus> {
        return object: Converter<kotlin.String, LeadFormStatus> {
            override fun convert(source: kotlin.String): LeadFormStatus = LeadFormStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.leadsExportStatusConverter"])
    fun leadsExportStatusConverter(): Converter<kotlin.String, LeadsExportStatus> {
        return object: Converter<kotlin.String, LeadsExportStatus> {
            override fun convert(source: kotlin.String): LeadsExportStatus = LeadsExportStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.lookbackPeriodOptionsConverter"])
    fun lookbackPeriodOptionsConverter(): Converter<kotlin.String, LookbackPeriodOptions> {
        return object: Converter<kotlin.String, LookbackPeriodOptions> {
            override fun convert(source: kotlin.String): LookbackPeriodOptions = LookbackPeriodOptions.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.mmMReportGranularityConverter"])
    fun mmMReportGranularityConverter(): Converter<kotlin.String, MMMReportGranularity> {
        return object: Converter<kotlin.String, MMMReportGranularity> {
            override fun convert(source: kotlin.String): MMMReportGranularity = MMMReportGranularity.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.mmMReportLevelConverter"])
    fun mmMReportLevelConverter(): Converter<kotlin.String, MMMReportLevel> {
        return object: Converter<kotlin.String, MMMReportLevel> {
            override fun convert(source: kotlin.String): MMMReportLevel = MMMReportLevel.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.mmMReportingColumnConverter"])
    fun mmMReportingColumnConverter(): Converter<kotlin.String, MMMReportingColumn> {
        return object: Converter<kotlin.String, MMMReportingColumn> {
            override fun convert(source: kotlin.String): MMMReportingColumn = MMMReportingColumn.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.mmMReportingTargetingTypeConverter"])
    fun mmMReportingTargetingTypeConverter(): Converter<kotlin.String, MMMReportingTargetingType> {
        return object: Converter<kotlin.String, MMMReportingTargetingType> {
            override fun convert(source: kotlin.String): MMMReportingTargetingType = MMMReportingTargetingType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.matchTypeConverter"])
    fun matchTypeConverter(): Converter<kotlin.String, MatchType> {
        return object: Converter<kotlin.String, MatchType> {
            override fun convert(source: kotlin.String): MatchType = MatchType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.matchTypeResponseConverter"])
    fun matchTypeResponseConverter(): Converter<kotlin.String, MatchTypeResponse> {
        return object: Converter<kotlin.String, MatchTypeResponse> {
            override fun convert(source: kotlin.String): MatchTypeResponse = MatchTypeResponse.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.mediaTypeConverter"])
    fun mediaTypeConverter(): Converter<kotlin.String, MediaType> {
        return object: Converter<kotlin.String, MediaType> {
            override fun convert(source: kotlin.String): MediaType = MediaType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.mediaUploadStatusConverter"])
    fun mediaUploadStatusConverter(): Converter<kotlin.String, MediaUploadStatus> {
        return object: Converter<kotlin.String, MediaUploadStatus> {
            override fun convert(source: kotlin.String): MediaUploadStatus = MediaUploadStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.mediaUploadTypeConverter"])
    fun mediaUploadTypeConverter(): Converter<kotlin.String, MediaUploadType> {
        return object: Converter<kotlin.String, MediaUploadType> {
            override fun convert(source: kotlin.String): MediaUploadType = MediaUploadType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.memberBusinessRoleConverter"])
    fun memberBusinessRoleConverter(): Converter<kotlin.String, MemberBusinessRole> {
        return object: Converter<kotlin.String, MemberBusinessRole> {
            override fun convert(source: kotlin.String): MemberBusinessRole = MemberBusinessRole.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.metricsReportingLevelConverter"])
    fun metricsReportingLevelConverter(): Converter<kotlin.String, MetricsReportingLevel> {
        return object: Converter<kotlin.String, MetricsReportingLevel> {
            override fun convert(source: kotlin.String): MetricsReportingLevel = MetricsReportingLevel.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.metricsReportingTemplateTypeConverter"])
    fun metricsReportingTemplateTypeConverter(): Converter<kotlin.String, MetricsReportingTemplateType> {
        return object: Converter<kotlin.String, MetricsReportingTemplateType> {
            override fun convert(source: kotlin.String): MetricsReportingTemplateType = MetricsReportingTemplateType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.mobileAppPlatformConverter"])
    fun mobileAppPlatformConverter(): Converter<kotlin.String, MobileAppPlatform> {
        return object: Converter<kotlin.String, MobileAppPlatform> {
            override fun convert(source: kotlin.String): MobileAppPlatform = MobileAppPlatform.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.msotEventNameConverter"])
    fun msotEventNameConverter(): Converter<kotlin.String, MsotEventName> {
        return object: Converter<kotlin.String, MsotEventName> {
            override fun convert(source: kotlin.String): MsotEventName = MsotEventName.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.multiPinsAnalyticsMetricTypesItemConverter"])
    fun multiPinsAnalyticsMetricTypesItemConverter(): Converter<kotlin.String, MultiPinsAnalyticsMetricTypesItem> {
        return object: Converter<kotlin.String, MultiPinsAnalyticsMetricTypesItem> {
            override fun convert(source: kotlin.String): MultiPinsAnalyticsMetricTypesItem = MultiPinsAnalyticsMetricTypesItem.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.networkTypeConverter"])
    fun networkTypeConverter(): Converter<kotlin.String, NetworkType> {
        return object: Converter<kotlin.String, NetworkType> {
            override fun convert(source: kotlin.String): NetworkType = NetworkType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.nonDraftEntityStatusConverter"])
    fun nonDraftEntityStatusConverter(): Converter<kotlin.String, NonDraftEntityStatus> {
        return object: Converter<kotlin.String, NonDraftEntityStatus> {
            override fun convert(source: kotlin.String): NonDraftEntityStatus = NonDraftEntityStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.nonNullableCatalogsCurrencyConverter"])
    fun nonNullableCatalogsCurrencyConverter(): Converter<kotlin.String, NonNullableCatalogsCurrency> {
        return object: Converter<kotlin.String, NonNullableCatalogsCurrency> {
            override fun convert(source: kotlin.String): NonNullableCatalogsCurrency = NonNullableCatalogsCurrency.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.nullableCatalogsItemFieldTypeConverter"])
    fun nullableCatalogsItemFieldTypeConverter(): Converter<kotlin.String, NullableCatalogsItemFieldType> {
        return object: Converter<kotlin.String, NullableCatalogsItemFieldType> {
            override fun convert(source: kotlin.String): NullableCatalogsItemFieldType = NullableCatalogsItemFieldType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.nullableCurrencyConverter"])
    fun nullableCurrencyConverter(): Converter<kotlin.String, NullableCurrency> {
        return object: Converter<kotlin.String, NullableCurrency> {
            override fun convert(source: kotlin.String): NullableCurrency = NullableCurrency.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.nullableEntityStatusConverter"])
    fun nullableEntityStatusConverter(): Converter<kotlin.String, NullableEntityStatus> {
        return object: Converter<kotlin.String, NullableEntityStatus> {
            override fun convert(source: kotlin.String): NullableEntityStatus = NullableEntityStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.nullableLabelStatusConverter"])
    fun nullableLabelStatusConverter(): Converter<kotlin.String, NullableLabelStatus> {
        return object: Converter<kotlin.String, NullableLabelStatus> {
            override fun convert(source: kotlin.String): NullableLabelStatus = NullableLabelStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.nullableLabelTypeConverter"])
    fun nullableLabelTypeConverter(): Converter<kotlin.String, NullableLabelType> {
        return object: Converter<kotlin.String, NullableLabelType> {
            override fun convert(source: kotlin.String): NullableLabelType = NullableLabelType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.nullablePartnerTypeConverter"])
    fun nullablePartnerTypeConverter(): Converter<kotlin.String, NullablePartnerType> {
        return object: Converter<kotlin.String, NullablePartnerType> {
            override fun convert(source: kotlin.String): NullablePartnerType = NullablePartnerType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.nullalbleMatchTypeConverter"])
    fun nullalbleMatchTypeConverter(): Converter<kotlin.String, NullalbleMatchType> {
        return object: Converter<kotlin.String, NullalbleMatchType> {
            override fun convert(source: kotlin.String): NullalbleMatchType = NullalbleMatchType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.numericFilterOperatorTypeConverter"])
    fun numericFilterOperatorTypeConverter(): Converter<kotlin.String, NumericFilterOperatorType> {
        return object: Converter<kotlin.String, NumericFilterOperatorType> {
            override fun convert(source: kotlin.String): NumericFilterOperatorType = NumericFilterOperatorType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.objectiveTypeConverter"])
    fun objectiveTypeConverter(): Converter<kotlin.String, ObjectiveType> {
        return object: Converter<kotlin.String, ObjectiveType> {
            override fun convert(source: kotlin.String): ObjectiveType = ObjectiveType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.operationTypeConverter"])
    fun operationTypeConverter(): Converter<kotlin.String, OperationType> {
        return object: Converter<kotlin.String, OperationType> {
            override fun convert(source: kotlin.String): OperationType = OperationType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.optimizationTypeConverter"])
    fun optimizationTypeConverter(): Converter<kotlin.String, OptimizationType> {
        return object: Converter<kotlin.String, OptimizationType> {
            override fun convert(source: kotlin.String): OptimizationType = OptimizationType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.orderConverter"])
    fun orderConverter(): Converter<kotlin.String, Order> {
        return object: Converter<kotlin.String, Order> {
            override fun convert(source: kotlin.String): Order = Order.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.orderLinePaidTypeConverter"])
    fun orderLinePaidTypeConverter(): Converter<kotlin.String, OrderLinePaidType> {
        return object: Converter<kotlin.String, OrderLinePaidType> {
            override fun convert(source: kotlin.String): OrderLinePaidType = OrderLinePaidType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.orderLineStatusConverter"])
    fun orderLineStatusConverter(): Converter<kotlin.String, OrderLineStatus> {
        return object: Converter<kotlin.String, OrderLineStatus> {
            override fun convert(source: kotlin.String): OrderLineStatus = OrderLineStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.osFamilyConverter"])
    fun osFamilyConverter(): Converter<kotlin.String, OsFamily> {
        return object: Converter<kotlin.String, OsFamily> {
            override fun convert(source: kotlin.String): OsFamily = OsFamily.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.overallStatusOptionsConverter"])
    fun overallStatusOptionsConverter(): Converter<kotlin.String, OverallStatusOptions> {
        return object: Converter<kotlin.String, OverallStatusOptions> {
            override fun convert(source: kotlin.String): OverallStatusOptions = OverallStatusOptions.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.pacingDeliveryTypeConverter"])
    fun pacingDeliveryTypeConverter(): Converter<kotlin.String, PacingDeliveryType> {
        return object: Converter<kotlin.String, PacingDeliveryType> {
            override fun convert(source: kotlin.String): PacingDeliveryType = PacingDeliveryType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.partnerTypeConverter"])
    fun partnerTypeConverter(): Converter<kotlin.String, PartnerType> {
        return object: Converter<kotlin.String, PartnerType> {
            override fun convert(source: kotlin.String): PartnerType = PartnerType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.permissionsConverter"])
    fun permissionsConverter(): Converter<kotlin.String, Permissions> {
        return object: Converter<kotlin.String, Permissions> {
            override fun convert(source: kotlin.String): Permissions = Permissions.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.permissionsWithOwnerConverter"])
    fun permissionsWithOwnerConverter(): Converter<kotlin.String, PermissionsWithOwner> {
        return object: Converter<kotlin.String, PermissionsWithOwner> {
            override fun convert(source: kotlin.String): PermissionsWithOwner = PermissionsWithOwner.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.pinFilterConverter"])
    fun pinFilterConverter(): Converter<kotlin.String, PinFilter> {
        return object: Converter<kotlin.String, PinFilter> {
            override fun convert(source: kotlin.String): PinFilter = PinFilter.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.pinPromotionSummaryStatusConverter"])
    fun pinPromotionSummaryStatusConverter(): Converter<kotlin.String, PinPromotionSummaryStatus> {
        return object: Converter<kotlin.String, PinPromotionSummaryStatus> {
            override fun convert(source: kotlin.String): PinPromotionSummaryStatus = PinPromotionSummaryStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.pinTypeConverter"])
    fun pinTypeConverter(): Converter<kotlin.String, PinType> {
        return object: Converter<kotlin.String, PinType> {
            override fun convert(source: kotlin.String): PinType = PinType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.pinnerListTypeConverter"])
    fun pinnerListTypeConverter(): Converter<kotlin.String, PinnerListType> {
        return object: Converter<kotlin.String, PinnerListType> {
            override fun convert(source: kotlin.String): PinnerListType = PinnerListType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.pinterestLibPaginationOrderConverter"])
    fun pinterestLibPaginationOrderConverter(): Converter<kotlin.String, PinterestLibPaginationOrder> {
        return object: Converter<kotlin.String, PinterestLibPaginationOrder> {
            override fun convert(source: kotlin.String): PinterestLibPaginationOrder = PinterestLibPaginationOrder.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.placementGroupTypeConverter"])
    fun placementGroupTypeConverter(): Converter<kotlin.String, PlacementGroupType> {
        return object: Converter<kotlin.String, PlacementGroupType> {
            override fun convert(source: kotlin.String): PlacementGroupType = PlacementGroupType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.placementTrafficTypeConverter"])
    fun placementTrafficTypeConverter(): Converter<kotlin.String, PlacementTrafficType> {
        return object: Converter<kotlin.String, PlacementTrafficType> {
            override fun convert(source: kotlin.String): PlacementTrafficType = PlacementTrafficType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.placementTypeConverter"])
    fun placementTypeConverter(): Converter<kotlin.String, PlacementType> {
        return object: Converter<kotlin.String, PlacementType> {
            override fun convert(source: kotlin.String): PlacementType = PlacementType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.preferredMediaTypeConverter"])
    fun preferredMediaTypeConverter(): Converter<kotlin.String, PreferredMediaType> {
        return object: Converter<kotlin.String, PreferredMediaType> {
            override fun convert(source: kotlin.String): PreferredMediaType = PreferredMediaType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.primarySortConverter"])
    fun primarySortConverter(): Converter<kotlin.String, PrimarySort> {
        return object: Converter<kotlin.String, PrimarySort> {
            override fun convert(source: kotlin.String): PrimarySort = PrimarySort.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.productAvailabilityConverter"])
    fun productAvailabilityConverter(): Converter<kotlin.String, ProductAvailability> {
        return object: Converter<kotlin.String, ProductAvailability> {
            override fun convert(source: kotlin.String): ProductAvailability = ProductAvailability.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.productAvailabilityTypeConverter"])
    fun productAvailabilityTypeConverter(): Converter<kotlin.String, ProductAvailabilityType> {
        return object: Converter<kotlin.String, ProductAvailabilityType> {
            override fun convert(source: kotlin.String): ProductAvailabilityType = ProductAvailabilityType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.productCategoriesEngagementTypeConverter"])
    fun productCategoriesEngagementTypeConverter(): Converter<kotlin.String, ProductCategoriesEngagementType> {
        return object: Converter<kotlin.String, ProductCategoriesEngagementType> {
            override fun convert(source: kotlin.String): ProductCategoriesEngagementType = ProductCategoriesEngagementType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.productCategoryDetailLookbackWindowConverter"])
    fun productCategoryDetailLookbackWindowConverter(): Converter<java.math.BigDecimal, ProductCategoryDetailLookbackWindow> {
        return object: Converter<java.math.BigDecimal, ProductCategoryDetailLookbackWindow> {
            override fun convert(source: java.math.BigDecimal): ProductCategoryDetailLookbackWindow = ProductCategoryDetailLookbackWindow.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.productCategoryEnumConverter"])
    fun productCategoryEnumConverter(): Converter<kotlin.String, ProductCategoryEnum> {
        return object: Converter<kotlin.String, ProductCategoryEnum> {
            override fun convert(source: kotlin.String): ProductCategoryEnum = ProductCategoryEnum.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.productCategoryRegionConverter"])
    fun productCategoryRegionConverter(): Converter<kotlin.String, ProductCategoryRegion> {
        return object: Converter<kotlin.String, ProductCategoryRegion> {
            override fun convert(source: kotlin.String): ProductCategoryRegion = ProductCategoryRegion.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.productConditionConverter"])
    fun productConditionConverter(): Converter<kotlin.String, ProductCondition> {
        return object: Converter<kotlin.String, ProductCondition> {
            override fun convert(source: kotlin.String): ProductCondition = ProductCondition.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.productGroupPromotionCustomizableCTATypeConverter"])
    fun productGroupPromotionCustomizableCTATypeConverter(): Converter<kotlin.String, ProductGroupPromotionCustomizableCTAType> {
        return object: Converter<kotlin.String, ProductGroupPromotionCustomizableCTAType> {
            override fun convert(source: kotlin.String): ProductGroupPromotionCustomizableCTAType = ProductGroupPromotionCustomizableCTAType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.productGroupSummaryStatusConverter"])
    fun productGroupSummaryStatusConverter(): Converter<kotlin.String, ProductGroupSummaryStatus> {
        return object: Converter<kotlin.String, ProductGroupSummaryStatus> {
            override fun convert(source: kotlin.String): ProductGroupSummaryStatus = ProductGroupSummaryStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.promotionApplicationLevelConverter"])
    fun promotionApplicationLevelConverter(): Converter<kotlin.String, PromotionApplicationLevel> {
        return object: Converter<kotlin.String, PromotionApplicationLevel> {
            override fun convert(source: kotlin.String): PromotionApplicationLevel = PromotionApplicationLevel.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.promotionTypeConverter"])
    fun promotionTypeConverter(): Converter<kotlin.String, PromotionType> {
        return object: Converter<kotlin.String, PromotionType> {
            override fun convert(source: kotlin.String): PromotionType = PromotionType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.publicTargetingTypeConverter"])
    fun publicTargetingTypeConverter(): Converter<kotlin.String, PublicTargetingType> {
        return object: Converter<kotlin.String, PublicTargetingType> {
            override fun convert(source: kotlin.String): PublicTargetingType = PublicTargetingType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.queryLabelEntityStatusesItemsConverter"])
    fun queryLabelEntityStatusesItemsConverter(): Converter<kotlin.String, QueryLabelEntityStatusesItems> {
        return object: Converter<kotlin.String, QueryLabelEntityStatusesItems> {
            override fun convert(source: kotlin.String): QueryLabelEntityStatusesItems = QueryLabelEntityStatusesItems.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.queryLabelTypesItemsConverter"])
    fun queryLabelTypesItemsConverter(): Converter<kotlin.String, QueryLabelTypesItems> {
        return object: Converter<kotlin.String, QueryLabelTypesItems> {
            override fun convert(source: kotlin.String): QueryLabelTypesItems = QueryLabelTypesItems.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.querymetrictypesItemsConverter"])
    fun querymetrictypesItemsConverter(): Converter<kotlin.String, QuerymetrictypesItems> {
        return object: Converter<kotlin.String, QuerymetrictypesItems> {
            override fun convert(source: kotlin.String): QuerymetrictypesItems = QuerymetrictypesItems.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.querypinanalyticsmetrictypesItemsConverter"])
    fun querypinanalyticsmetrictypesItemsConverter(): Converter<kotlin.String, QuerypinanalyticsmetrictypesItems> {
        return object: Converter<kotlin.String, QuerypinanalyticsmetrictypesItems> {
            override fun convert(source: kotlin.String): QuerypinanalyticsmetrictypesItems = QuerypinanalyticsmetrictypesItems.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.queryvideopinmetrictypesItemsConverter"])
    fun queryvideopinmetrictypesItemsConverter(): Converter<kotlin.String, QueryvideopinmetrictypesItems> {
        return object: Converter<kotlin.String, QueryvideopinmetrictypesItems> {
            override fun convert(source: kotlin.String): QueryvideopinmetrictypesItems = QueryvideopinmetrictypesItems.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.reportTypeConverter"])
    fun reportTypeConverter(): Converter<kotlin.String, ReportType> {
        return object: Converter<kotlin.String, ReportType> {
            override fun convert(source: kotlin.String): ReportType = ReportType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.reportingColumnConverter"])
    fun reportingColumnConverter(): Converter<kotlin.String, ReportingColumn> {
        return object: Converter<kotlin.String, ReportingColumn> {
            override fun convert(source: kotlin.String): ReportingColumn = ReportingColumn.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.reportingColumnAsyncConverter"])
    fun reportingColumnAsyncConverter(): Converter<kotlin.String, ReportingColumnAsync> {
        return object: Converter<kotlin.String, ReportingColumnAsync> {
            override fun convert(source: kotlin.String): ReportingColumnAsync = ReportingColumnAsync.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.reportingColumnSyncConverter"])
    fun reportingColumnSyncConverter(): Converter<kotlin.String, ReportingColumnSync> {
        return object: Converter<kotlin.String, ReportingColumnSync> {
            override fun convert(source: kotlin.String): ReportingColumnSync = ReportingColumnSync.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.reportingTimeZoneConverter"])
    fun reportingTimeZoneConverter(): Converter<kotlin.String, ReportingTimeZone> {
        return object: Converter<kotlin.String, ReportingTimeZone> {
            override fun convert(source: kotlin.String): ReportingTimeZone = ReportingTimeZone.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.roleConverter"])
    fun roleConverter(): Converter<kotlin.String, Role> {
        return object: Converter<kotlin.String, Role> {
            override fun convert(source: kotlin.String): Role = Role.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.ssIOOrderLineTypeConverter"])
    fun ssIOOrderLineTypeConverter(): Converter<kotlin.String, SSIOOrderLineType> {
        return object: Converter<kotlin.String, SSIOOrderLineType> {
            override fun convert(source: kotlin.String): SSIOOrderLineType = SSIOOrderLineType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.scheduleActionConverter"])
    fun scheduleActionConverter(): Converter<kotlin.String, ScheduleAction> {
        return object: Converter<kotlin.String, ScheduleAction> {
            override fun convert(source: kotlin.String): ScheduleAction = ScheduleAction.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.scheduleStatusConverter"])
    fun scheduleStatusConverter(): Converter<kotlin.String, ScheduleStatus> {
        return object: Converter<kotlin.String, ScheduleStatus> {
            override fun convert(source: kotlin.String): ScheduleStatus = ScheduleStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.scheduleTypeConverter"])
    fun scheduleTypeConverter(): Converter<kotlin.String, ScheduleType> {
        return object: Converter<kotlin.String, ScheduleType> {
            override fun convert(source: kotlin.String): ScheduleType = ScheduleType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.sourcePlatformOptionsConverter"])
    fun sourcePlatformOptionsConverter(): Converter<kotlin.String, SourcePlatformOptions> {
        return object: Converter<kotlin.String, SourcePlatformOptions> {
            override fun convert(source: kotlin.String): SourcePlatformOptions = SourcePlatformOptions.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.standardPinMetricTypesConverter"])
    fun standardPinMetricTypesConverter(): Converter<kotlin.String, StandardPinMetricTypes> {
        return object: Converter<kotlin.String, StandardPinMetricTypes> {
            override fun convert(source: kotlin.String): StandardPinMetricTypes = StandardPinMetricTypes.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.summaryStatusConverter"])
    fun summaryStatusConverter(): Converter<kotlin.String, SummaryStatus> {
        return object: Converter<kotlin.String, SummaryStatus> {
            override fun convert(source: kotlin.String): SummaryStatus = SummaryStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.supplementalItemBatchOperationStatusConverter"])
    fun supplementalItemBatchOperationStatusConverter(): Converter<kotlin.String, SupplementalItemBatchOperationStatus> {
        return object: Converter<kotlin.String, SupplementalItemBatchOperationStatus> {
            override fun convert(source: kotlin.String): SupplementalItemBatchOperationStatus = SupplementalItemBatchOperationStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.supplementalItemProcessingStatusConverter"])
    fun supplementalItemProcessingStatusConverter(): Converter<kotlin.String, SupplementalItemProcessingStatus> {
        return object: Converter<kotlin.String, SupplementalItemProcessingStatus> {
            override fun convert(source: kotlin.String): SupplementalItemProcessingStatus = SupplementalItemProcessingStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.targetingAdvertiserCountryConverter"])
    fun targetingAdvertiserCountryConverter(): Converter<kotlin.String, TargetingAdvertiserCountry> {
        return object: Converter<kotlin.String, TargetingAdvertiserCountry> {
            override fun convert(source: kotlin.String): TargetingAdvertiserCountry = TargetingAdvertiserCountry.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.targetingSpecAgeBucketConverter"])
    fun targetingSpecAgeBucketConverter(): Converter<kotlin.String, TargetingSpecAgeBucket> {
        return object: Converter<kotlin.String, TargetingSpecAgeBucket> {
            override fun convert(source: kotlin.String): TargetingSpecAgeBucket = TargetingSpecAgeBucket.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.targetingSpecAppTypeConverter"])
    fun targetingSpecAppTypeConverter(): Converter<kotlin.String, TargetingSpecAppType> {
        return object: Converter<kotlin.String, TargetingSpecAppType> {
            override fun convert(source: kotlin.String): TargetingSpecAppType = TargetingSpecAppType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.targetingSpecGenderConverter"])
    fun targetingSpecGenderConverter(): Converter<kotlin.String, TargetingSpecGender> {
        return object: Converter<kotlin.String, TargetingSpecGender> {
            override fun convert(source: kotlin.String): TargetingSpecGender = TargetingSpecGender.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.targetingSpecListOperationConverter"])
    fun targetingSpecListOperationConverter(): Converter<kotlin.String, TargetingSpecListOperation> {
        return object: Converter<kotlin.String, TargetingSpecListOperation> {
            override fun convert(source: kotlin.String): TargetingSpecListOperation = TargetingSpecListOperation.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.targetingSpecTargetingStrategyItemsConverter"])
    fun targetingSpecTargetingStrategyItemsConverter(): Converter<kotlin.String, TargetingSpecTargetingStrategyItems> {
        return object: Converter<kotlin.String, TargetingSpecTargetingStrategyItems> {
            override fun convert(source: kotlin.String): TargetingSpecTargetingStrategyItems = TargetingSpecTargetingStrategyItems.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.targetingStrategyConverter"])
    fun targetingStrategyConverter(): Converter<kotlin.String, TargetingStrategy> {
        return object: Converter<kotlin.String, TargetingStrategy> {
            override fun convert(source: kotlin.String): TargetingStrategy = TargetingStrategy.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.targetingTemplateStatusConverter"])
    fun targetingTemplateStatusConverter(): Converter<kotlin.String, TargetingTemplateStatus> {
        return object: Converter<kotlin.String, TargetingTemplateStatus> {
            override fun convert(source: kotlin.String): TargetingTemplateStatus = TargetingTemplateStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.tieBreakerTypeConverter"])
    fun tieBreakerTypeConverter(): Converter<kotlin.String, TieBreakerType> {
        return object: Converter<kotlin.String, TieBreakerType> {
            override fun convert(source: kotlin.String): TieBreakerType = TieBreakerType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.tokenGrantTypeConverter"])
    fun tokenGrantTypeConverter(): Converter<kotlin.String, TokenGrantType> {
        return object: Converter<kotlin.String, TokenGrantType> {
            override fun convert(source: kotlin.String): TokenGrantType = TokenGrantType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.tokenTypeHintConverter"])
    fun tokenTypeHintConverter(): Converter<kotlin.String, TokenTypeHint> {
        return object: Converter<kotlin.String, TokenTypeHint> {
            override fun convert(source: kotlin.String): TokenTypeHint = TokenTypeHint.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.topPinsSortByConverter"])
    fun topPinsSortByConverter(): Converter<kotlin.String, TopPinsSortBy> {
        return object: Converter<kotlin.String, TopPinsSortBy> {
            override fun convert(source: kotlin.String): TopPinsSortBy = TopPinsSortBy.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.topVideoPinsSortByConverter"])
    fun topVideoPinsSortByConverter(): Converter<kotlin.String, TopVideoPinsSortBy> {
        return object: Converter<kotlin.String, TopVideoPinsSortBy> {
            override fun convert(source: kotlin.String): TopVideoPinsSortBy = TopVideoPinsSortBy.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.trendTypeConverter"])
    fun trendTypeConverter(): Converter<kotlin.String, TrendType> {
        return object: Converter<kotlin.String, TrendType> {
            override fun convert(source: kotlin.String): TrendType = TrendType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.trendsAgeBucketConverter"])
    fun trendsAgeBucketConverter(): Converter<kotlin.String, TrendsAgeBucket> {
        return object: Converter<kotlin.String, TrendsAgeBucket> {
            override fun convert(source: kotlin.String): TrendsAgeBucket = TrendsAgeBucket.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.trendsGenderConverter"])
    fun trendsGenderConverter(): Converter<kotlin.String, TrendsGender> {
        return object: Converter<kotlin.String, TrendsGender> {
            override fun convert(source: kotlin.String): TrendsGender = TrendsGender.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.trendsGenderFilterConverter"])
    fun trendsGenderFilterConverter(): Converter<kotlin.String, TrendsGenderFilter> {
        return object: Converter<kotlin.String, TrendsGenderFilter> {
            override fun convert(source: kotlin.String): TrendsGenderFilter = TrendsGenderFilter.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.trendsL1InterestConverter"])
    fun trendsL1InterestConverter(): Converter<kotlin.String, TrendsL1Interest> {
        return object: Converter<kotlin.String, TrendsL1Interest> {
            override fun convert(source: kotlin.String): TrendsL1Interest = TrendsL1Interest.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.trendsSupportedRegionConverter"])
    fun trendsSupportedRegionConverter(): Converter<kotlin.String, TrendsSupportedRegion> {
        return object: Converter<kotlin.String, TrendsSupportedRegion> {
            override fun convert(source: kotlin.String): TrendsSupportedRegion = TrendsSupportedRegion.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.updateMaskBidOptionFieldConverter"])
    fun updateMaskBidOptionFieldConverter(): Converter<kotlin.String, UpdateMaskBidOptionField> {
        return object: Converter<kotlin.String, UpdateMaskBidOptionField> {
            override fun convert(source: kotlin.String): UpdateMaskBidOptionField = UpdateMaskBidOptionField.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.updateMaskFieldTypeConverter"])
    fun updateMaskFieldTypeConverter(): Converter<kotlin.String, UpdateMaskFieldType> {
        return object: Converter<kotlin.String, UpdateMaskFieldType> {
            override fun convert(source: kotlin.String): UpdateMaskFieldType = UpdateMaskFieldType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.userAccountTypeConverter"])
    fun userAccountTypeConverter(): Converter<kotlin.String, UserAccountType> {
        return object: Converter<kotlin.String, UserAccountType> {
            override fun convert(source: kotlin.String): UserAccountType = UserAccountType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.userFollowingFeedTypeConverter"])
    fun userFollowingFeedTypeConverter(): Converter<kotlin.String, UserFollowingFeedType> {
        return object: Converter<kotlin.String, UserFollowingFeedType> {
            override fun convert(source: kotlin.String): UserFollowingFeedType = UserFollowingFeedType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.userListOperationTypeConverter"])
    fun userListOperationTypeConverter(): Converter<kotlin.String, UserListOperationType> {
        return object: Converter<kotlin.String, UserListOperationType> {
            override fun convert(source: kotlin.String): UserListOperationType = UserListOperationType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.userListTypeConverter"])
    fun userListTypeConverter(): Converter<kotlin.String, UserListType> {
        return object: Converter<kotlin.String, UserListType> {
            override fun convert(source: kotlin.String): UserListType = UserListType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.verticalProductCategoryConverter"])
    fun verticalProductCategoryConverter(): Converter<kotlin.String, VerticalProductCategory> {
        return object: Converter<kotlin.String, VerticalProductCategory> {
            override fun convert(source: kotlin.String): VerticalProductCategory = VerticalProductCategory.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.videoPinMetricTypesConverter"])
    fun videoPinMetricTypesConverter(): Converter<kotlin.String, VideoPinMetricTypes> {
        return object: Converter<kotlin.String, VideoPinMetricTypes> {
            override fun convert(source: kotlin.String): VideoPinMetricTypes = VideoPinMetricTypes.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.websiteVerificationMethodConverter"])
    fun websiteVerificationMethodConverter(): Converter<kotlin.String, WebsiteVerificationMethod> {
        return object: Converter<kotlin.String, WebsiteVerificationMethod> {
            override fun convert(source: kotlin.String): WebsiteVerificationMethod = WebsiteVerificationMethod.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.workloadStateConverter"])
    fun workloadStateConverter(): Converter<kotlin.String, WorkloadState> {
        return object: Converter<kotlin.String, WorkloadState> {
            override fun convert(source: kotlin.String): WorkloadState = WorkloadState.forValue(source)
        }
    }

}
