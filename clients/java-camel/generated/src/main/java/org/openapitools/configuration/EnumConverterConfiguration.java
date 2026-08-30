package org.openapitools.configuration;

import java.math.BigDecimal;
import java.net.URI;
import java.util.UUID;

import org.openapitools.model.ActionType;
import org.openapitools.model.AdAccountEntityType;
import org.openapitools.model.AdAdsAnalyticsAsyncTargetingTypes;
import org.openapitools.model.AdCollectionsHeaderType;
import org.openapitools.model.AdDisapprovalReasons;
import org.openapitools.model.AdGroupAudienceSizingCreativeTypes;
import org.openapitools.model.AdGroupSummaryStatus;
import org.openapitools.model.AdPinPreviewCreativeType;
import org.openapitools.model.AdReviewStatus;
import org.openapitools.model.AdShoppingPreviewCreativeType;
import org.openapitools.model.AdeColumnType;
import org.openapitools.model.AdgroupPlacementGroupType;
import org.openapitools.model.AdgroupTrackingFeatureType;
import org.openapitools.model.AdsAnalyticsAccountTargetingType;
import org.openapitools.model.AdsAnalyticsAdGroupTargetingType;
import org.openapitools.model.AdsAnalyticsAdTargetingType;
import org.openapitools.model.AdsAnalyticsCampaignTargetingType;
import org.openapitools.model.AdsAnalyticsFilterColumn;
import org.openapitools.model.AdsAnalyticsFilterOperator;
import org.openapitools.model.AdsCreditDiscountType;
import org.openapitools.model.AdvertiserDefinedEventMappingType;
import org.openapitools.model.AgeTrendsBucket;
import org.openapitools.model.AiDisclosureItem;
import org.openapitools.model.AppsflyerPlatform;
import org.openapitools.model.AssetGroupType;
import org.openapitools.model.AssetPermissionType;
import org.openapitools.model.AssetSearchBy;
import org.openapitools.model.AssetSortBy;
import org.openapitools.model.AssetTypeResponse;
import org.openapitools.model.AttributionActionType;
import org.openapitools.model.AttributionMatchType;
import org.openapitools.model.AttributionModel;
import org.openapitools.model.AttributionScope;
import org.openapitools.model.AudienceAccountType;
import org.openapitools.model.AudienceInsightType;
import org.openapitools.model.AudienceObjectiveType;
import org.openapitools.model.AudienceOwnershipType;
import org.openapitools.model.AudienceStatus;
import org.openapitools.model.AudienceType;
import org.openapitools.model.AudienceUpdateOperationType;
import org.openapitools.model.BasePreferredMediaType;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.BidFloorObjectiveType;
import org.openapitools.model.BidStrategyType;
import org.openapitools.model.BillingInvoiceDocumentType;
import org.openapitools.model.BillingInvoiceSortField;
import org.openapitools.model.BillingInvoiceStatus;
import org.openapitools.model.BillingProfileCardType;
import org.openapitools.model.BillingProfilePaymentMethodBrand;
import org.openapitools.model.BillingProfileStatus;
import org.openapitools.model.BillingType;
import org.openapitools.model.BoardPrivacy;
import org.openapitools.model.BoardPrivacyFilter;
import org.openapitools.model.BoardUpdatePrivacy;
import org.openapitools.model.BudgetDurationType;
import org.openapitools.model.BudgetType;
import org.openapitools.model.BulkEntityType;
import org.openapitools.model.BulkOutputFormat;
import org.openapitools.model.BulkReportingJobStatus;
import org.openapitools.model.BulkRequestStatus;
import org.openapitools.model.BusinessAccessRole;
import org.openapitools.model.BusinessMemberSortBy;
import org.openapitools.model.BusinessRoleForInvite;
import org.openapitools.model.BusinessRoleForMembers;
import org.openapitools.model.BusinessSearchBy;
import org.openapitools.model.CampaignBidOptionsUpdateMaskItems;
import org.openapitools.model.CampaignObjectiveType;
import org.openapitools.model.CampaignPlanningConfidenceLevelAlertReason;
import org.openapitools.model.CampaignPlanningConfidenceLevelAlertSeverity;
import org.openapitools.model.CampaignPlanningConversionAttributionWindowDays;
import org.openapitools.model.CampaignPlanningConversionEvent;
import org.openapitools.model.CampaignPlanningEstimationType;
import org.openapitools.model.CampaignPlanningResponseErrorCode;
import org.openapitools.model.CampaignSummaryStatus;
import org.openapitools.model.CatalogsAiContentDisclosureLabel;
import org.openapitools.model.CatalogsFeedProcessingScheduleTimezone;
import org.openapitools.model.CatalogsFeedProcessingStatus;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsHotelProductGroupType;
import org.openapitools.model.CatalogsItemValidationIssue;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupStatus;
import org.openapitools.model.CatalogsProductGroupType;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.ChangeHistoryDataType;
import org.openapitools.model.ChangeHistoryOperationType;
import org.openapitools.model.CollectionsHeaderType;
import org.openapitools.model.ContentType;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionDeletionRequestStatus;
import org.openapitools.model.ConversionEvent;
import org.openapitools.model.ConversionEventIngestionSource;
import org.openapitools.model.ConversionLearningModeType;
import org.openapitools.model.ConversionObjectiveType;
import org.openapitools.model.ConversionProductAttributionType;
import org.openapitools.model.ConversionProductReportBreakdownType;
import org.openapitools.model.ConversionProductReportGranularity;
import org.openapitools.model.ConversionProductReportLevel;
import org.openapitools.model.ConversionProductReportingColumn;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.ConversionTagType;
import org.openapitools.model.ConversionTagTypeOptimal;
import org.openapitools.model.Country;
import org.openapitools.model.CreationSource;
import org.openapitools.model.CreativeAssetsVisibilityType;
import org.openapitools.model.CreativeType;
import org.openapitools.model.Currency;
import org.openapitools.model.CustomerListStatus;
import org.openapitools.model.CustomizableCTAType;
import org.openapitools.model.DataOutputFormat;
import org.openapitools.model.DataStatus;
import org.openapitools.model.DeliveryEstimateObjectiveType;
import org.openapitools.model.DisclosureType;
import org.openapitools.model.DiscountStatus;
import org.openapitools.model.EnhancedMatchStatusType;
import org.openapitools.model.EntityLabelStatus;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.EventProcessingStatus;
import org.openapitools.model.FilterOperatorType;
import org.openapitools.model.FormFactor;
import org.openapitools.model.FreqBidMultiplierTimeWindow;
import org.openapitools.model.FrequencyGoalMetadataTimerange;
import org.openapitools.model.Gender;
import org.openapitools.model.GenderBucket;
import org.openapitools.model.Granularity;
import org.openapitools.model.GridClickType;
import org.openapitools.model.HttpMethod;
import org.openapitools.model.IneligibleProductTagReason;
import org.openapitools.model.IngestionSource;
import org.openapitools.model.IngestionSourceOptions;
import org.openapitools.model.IntegrationLogEventType;
import org.openapitools.model.IntegrationLogLevel;
import org.openapitools.model.IntendedPromotionType;
import org.openapitools.model.InterestsEnum;
import org.openapitools.model.InviteFilterStatus;
import org.openapitools.model.InviteStatus;
import org.openapitools.model.InviteType;
import org.openapitools.model.ItemAvailability;
import org.openapitools.model.ItemProcessingStatus;
import org.openapitools.model.LabelParentType;
import org.openapitools.model.LabelStatus;
import org.openapitools.model.LabelStatusBulkUpdate;
import org.openapitools.model.LabelType;
import org.openapitools.model.Language;
import org.openapitools.model.LeadFormQuestionFieldType;
import org.openapitools.model.LeadFormQuestionType;
import org.openapitools.model.LeadFormStatus;
import org.openapitools.model.LeadsExportStatus;
import org.openapitools.model.LookbackPeriodOptions;
import org.openapitools.model.MMMReportGranularity;
import org.openapitools.model.MMMReportLevel;
import org.openapitools.model.MMMReportingColumn;
import org.openapitools.model.MMMReportingTargetingType;
import org.openapitools.model.MatchType;
import org.openapitools.model.MatchTypeResponse;
import org.openapitools.model.MediaType;
import org.openapitools.model.MediaUploadStatus;
import org.openapitools.model.MediaUploadType;
import org.openapitools.model.MemberBusinessRole;
import org.openapitools.model.MetricsReportingLevel;
import org.openapitools.model.MetricsReportingTemplateType;
import org.openapitools.model.MobileAppPlatform;
import org.openapitools.model.MsotEventName;
import org.openapitools.model.MultiPinsAnalyticsMetricTypesItem;
import org.openapitools.model.NetworkType;
import org.openapitools.model.NonDraftEntityStatus;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.NullableCatalogsItemFieldType;
import org.openapitools.model.NullableCurrency;
import org.openapitools.model.NullableEntityStatus;
import org.openapitools.model.NullableLabelStatus;
import org.openapitools.model.NullableLabelType;
import org.openapitools.model.NullablePartnerType;
import org.openapitools.model.NullalbleMatchType;
import org.openapitools.model.NumericFilterOperatorType;
import org.openapitools.model.ObjectiveType;
import org.openapitools.model.OperationType;
import org.openapitools.model.OptimizationType;
import org.openapitools.model.Order;
import org.openapitools.model.OrderLinePaidType;
import org.openapitools.model.OrderLineStatus;
import org.openapitools.model.OsFamily;
import org.openapitools.model.OverallStatusOptions;
import org.openapitools.model.PacingDeliveryType;
import org.openapitools.model.PartnerType;
import org.openapitools.model.Permissions;
import org.openapitools.model.PermissionsWithOwner;
import org.openapitools.model.PinFilter;
import org.openapitools.model.PinPromotionSummaryStatus;
import org.openapitools.model.PinType;
import org.openapitools.model.PinnerListType;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.PlacementTrafficType;
import org.openapitools.model.PlacementType;
import org.openapitools.model.PreferredMediaType;
import org.openapitools.model.PrimarySort;
import org.openapitools.model.ProductAvailability;
import org.openapitools.model.ProductAvailabilityType;
import org.openapitools.model.ProductCategoriesEngagementType;
import org.openapitools.model.ProductCategoryDetailLookbackWindow;
import org.openapitools.model.ProductCategoryEnum;
import org.openapitools.model.ProductCategoryRegion;
import org.openapitools.model.ProductCondition;
import org.openapitools.model.ProductGroupPromotionCustomizableCTAType;
import org.openapitools.model.ProductGroupSummaryStatus;
import org.openapitools.model.PromotionApplicationLevel;
import org.openapitools.model.PromotionType;
import org.openapitools.model.PublicTargetingType;
import org.openapitools.model.QueryLabelEntityStatusesItems;
import org.openapitools.model.QueryLabelTypesItems;
import org.openapitools.model.QuerymetrictypesItems;
import org.openapitools.model.QuerypinanalyticsmetrictypesItems;
import org.openapitools.model.QueryvideopinmetrictypesItems;
import org.openapitools.model.ReportType;
import org.openapitools.model.ReportingColumn;
import org.openapitools.model.ReportingColumnAsync;
import org.openapitools.model.ReportingColumnSync;
import org.openapitools.model.ReportingTimeZone;
import org.openapitools.model.Role;
import org.openapitools.model.SSIOOrderLineType;
import org.openapitools.model.ScheduleAction;
import org.openapitools.model.ScheduleStatus;
import org.openapitools.model.ScheduleType;
import org.openapitools.model.SourcePlatformOptions;
import org.openapitools.model.StandardPinMetricTypes;
import org.openapitools.model.SummaryStatus;
import org.openapitools.model.SupplementalItemBatchOperationStatus;
import org.openapitools.model.SupplementalItemProcessingStatus;
import org.openapitools.model.TargetingAdvertiserCountry;
import org.openapitools.model.TargetingSpecAgeBucket;
import org.openapitools.model.TargetingSpecAppType;
import org.openapitools.model.TargetingSpecGender;
import org.openapitools.model.TargetingSpecListOperation;
import org.openapitools.model.TargetingSpecTargetingStrategyItems;
import org.openapitools.model.TargetingStrategy;
import org.openapitools.model.TargetingTemplateStatus;
import org.openapitools.model.TieBreakerType;
import org.openapitools.model.TokenGrantType;
import org.openapitools.model.TokenTypeHint;
import org.openapitools.model.TopPinsSortBy;
import org.openapitools.model.TopVideoPinsSortBy;
import org.openapitools.model.TrendType;
import org.openapitools.model.TrendsAgeBucket;
import org.openapitools.model.TrendsGender;
import org.openapitools.model.TrendsGenderFilter;
import org.openapitools.model.TrendsL1Interest;
import org.openapitools.model.TrendsSupportedRegion;
import org.openapitools.model.UpdateMaskBidOptionField;
import org.openapitools.model.UpdateMaskFieldType;
import org.openapitools.model.UserAccountType;
import org.openapitools.model.UserFollowingFeedType;
import org.openapitools.model.UserListOperationType;
import org.openapitools.model.UserListType;
import org.openapitools.model.VerticalProductCategory;
import org.openapitools.model.VideoPinMetricTypes;
import org.openapitools.model.WebsiteVerificationMethod;
import org.openapitools.model.WorkloadState;

import jakarta.annotation.Generated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

/**
 * This class provides Spring Converter beans for the enum models in the OpenAPI specification.
 *
 * By default, Spring only converts primitive types to enums using Enum::valueOf, which can prevent
 * correct conversion if the OpenAPI specification is using an `enumPropertyNaming` other than
 * `original` or the specification has an integer enum.
 */
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Configuration(value = "org.openapitools.configuration.enumConverterConfiguration")
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.actionTypeConverter")
    Converter<String, ActionType> actionTypeConverter() {
        return new Converter<String, ActionType>() {
            @Override
            public ActionType convert(String source) {
                return ActionType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adAccountEntityTypeConverter")
    Converter<String, AdAccountEntityType> adAccountEntityTypeConverter() {
        return new Converter<String, AdAccountEntityType>() {
            @Override
            public AdAccountEntityType convert(String source) {
                return AdAccountEntityType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adAdsAnalyticsAsyncTargetingTypesConverter")
    Converter<String, AdAdsAnalyticsAsyncTargetingTypes> adAdsAnalyticsAsyncTargetingTypesConverter() {
        return new Converter<String, AdAdsAnalyticsAsyncTargetingTypes>() {
            @Override
            public AdAdsAnalyticsAsyncTargetingTypes convert(String source) {
                return AdAdsAnalyticsAsyncTargetingTypes.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adCollectionsHeaderTypeConverter")
    Converter<String, AdCollectionsHeaderType> adCollectionsHeaderTypeConverter() {
        return new Converter<String, AdCollectionsHeaderType>() {
            @Override
            public AdCollectionsHeaderType convert(String source) {
                return AdCollectionsHeaderType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adDisapprovalReasonsConverter")
    Converter<String, AdDisapprovalReasons> adDisapprovalReasonsConverter() {
        return new Converter<String, AdDisapprovalReasons>() {
            @Override
            public AdDisapprovalReasons convert(String source) {
                return AdDisapprovalReasons.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adGroupAudienceSizingCreativeTypesConverter")
    Converter<String, AdGroupAudienceSizingCreativeTypes> adGroupAudienceSizingCreativeTypesConverter() {
        return new Converter<String, AdGroupAudienceSizingCreativeTypes>() {
            @Override
            public AdGroupAudienceSizingCreativeTypes convert(String source) {
                return AdGroupAudienceSizingCreativeTypes.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adGroupSummaryStatusConverter")
    Converter<String, AdGroupSummaryStatus> adGroupSummaryStatusConverter() {
        return new Converter<String, AdGroupSummaryStatus>() {
            @Override
            public AdGroupSummaryStatus convert(String source) {
                return AdGroupSummaryStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adPinPreviewCreativeTypeConverter")
    Converter<String, AdPinPreviewCreativeType> adPinPreviewCreativeTypeConverter() {
        return new Converter<String, AdPinPreviewCreativeType>() {
            @Override
            public AdPinPreviewCreativeType convert(String source) {
                return AdPinPreviewCreativeType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adReviewStatusConverter")
    Converter<String, AdReviewStatus> adReviewStatusConverter() {
        return new Converter<String, AdReviewStatus>() {
            @Override
            public AdReviewStatus convert(String source) {
                return AdReviewStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adShoppingPreviewCreativeTypeConverter")
    Converter<String, AdShoppingPreviewCreativeType> adShoppingPreviewCreativeTypeConverter() {
        return new Converter<String, AdShoppingPreviewCreativeType>() {
            @Override
            public AdShoppingPreviewCreativeType convert(String source) {
                return AdShoppingPreviewCreativeType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adeColumnTypeConverter")
    Converter<String, AdeColumnType> adeColumnTypeConverter() {
        return new Converter<String, AdeColumnType>() {
            @Override
            public AdeColumnType convert(String source) {
                return AdeColumnType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adgroupPlacementGroupTypeConverter")
    Converter<String, AdgroupPlacementGroupType> adgroupPlacementGroupTypeConverter() {
        return new Converter<String, AdgroupPlacementGroupType>() {
            @Override
            public AdgroupPlacementGroupType convert(String source) {
                return AdgroupPlacementGroupType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adgroupTrackingFeatureTypeConverter")
    Converter<String, AdgroupTrackingFeatureType> adgroupTrackingFeatureTypeConverter() {
        return new Converter<String, AdgroupTrackingFeatureType>() {
            @Override
            public AdgroupTrackingFeatureType convert(String source) {
                return AdgroupTrackingFeatureType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adsAnalyticsAccountTargetingTypeConverter")
    Converter<String, AdsAnalyticsAccountTargetingType> adsAnalyticsAccountTargetingTypeConverter() {
        return new Converter<String, AdsAnalyticsAccountTargetingType>() {
            @Override
            public AdsAnalyticsAccountTargetingType convert(String source) {
                return AdsAnalyticsAccountTargetingType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adsAnalyticsAdGroupTargetingTypeConverter")
    Converter<String, AdsAnalyticsAdGroupTargetingType> adsAnalyticsAdGroupTargetingTypeConverter() {
        return new Converter<String, AdsAnalyticsAdGroupTargetingType>() {
            @Override
            public AdsAnalyticsAdGroupTargetingType convert(String source) {
                return AdsAnalyticsAdGroupTargetingType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adsAnalyticsAdTargetingTypeConverter")
    Converter<String, AdsAnalyticsAdTargetingType> adsAnalyticsAdTargetingTypeConverter() {
        return new Converter<String, AdsAnalyticsAdTargetingType>() {
            @Override
            public AdsAnalyticsAdTargetingType convert(String source) {
                return AdsAnalyticsAdTargetingType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adsAnalyticsCampaignTargetingTypeConverter")
    Converter<String, AdsAnalyticsCampaignTargetingType> adsAnalyticsCampaignTargetingTypeConverter() {
        return new Converter<String, AdsAnalyticsCampaignTargetingType>() {
            @Override
            public AdsAnalyticsCampaignTargetingType convert(String source) {
                return AdsAnalyticsCampaignTargetingType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adsAnalyticsFilterColumnConverter")
    Converter<String, AdsAnalyticsFilterColumn> adsAnalyticsFilterColumnConverter() {
        return new Converter<String, AdsAnalyticsFilterColumn>() {
            @Override
            public AdsAnalyticsFilterColumn convert(String source) {
                return AdsAnalyticsFilterColumn.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adsAnalyticsFilterOperatorConverter")
    Converter<String, AdsAnalyticsFilterOperator> adsAnalyticsFilterOperatorConverter() {
        return new Converter<String, AdsAnalyticsFilterOperator>() {
            @Override
            public AdsAnalyticsFilterOperator convert(String source) {
                return AdsAnalyticsFilterOperator.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adsCreditDiscountTypeConverter")
    Converter<String, AdsCreditDiscountType> adsCreditDiscountTypeConverter() {
        return new Converter<String, AdsCreditDiscountType>() {
            @Override
            public AdsCreditDiscountType convert(String source) {
                return AdsCreditDiscountType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.advertiserDefinedEventMappingTypeConverter")
    Converter<String, AdvertiserDefinedEventMappingType> advertiserDefinedEventMappingTypeConverter() {
        return new Converter<String, AdvertiserDefinedEventMappingType>() {
            @Override
            public AdvertiserDefinedEventMappingType convert(String source) {
                return AdvertiserDefinedEventMappingType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.ageTrendsBucketConverter")
    Converter<String, AgeTrendsBucket> ageTrendsBucketConverter() {
        return new Converter<String, AgeTrendsBucket>() {
            @Override
            public AgeTrendsBucket convert(String source) {
                return AgeTrendsBucket.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.aiDisclosureItemConverter")
    Converter<String, AiDisclosureItem> aiDisclosureItemConverter() {
        return new Converter<String, AiDisclosureItem>() {
            @Override
            public AiDisclosureItem convert(String source) {
                return AiDisclosureItem.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.appsflyerPlatformConverter")
    Converter<String, AppsflyerPlatform> appsflyerPlatformConverter() {
        return new Converter<String, AppsflyerPlatform>() {
            @Override
            public AppsflyerPlatform convert(String source) {
                return AppsflyerPlatform.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.assetGroupTypeConverter")
    Converter<String, AssetGroupType> assetGroupTypeConverter() {
        return new Converter<String, AssetGroupType>() {
            @Override
            public AssetGroupType convert(String source) {
                return AssetGroupType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.assetPermissionTypeConverter")
    Converter<String, AssetPermissionType> assetPermissionTypeConverter() {
        return new Converter<String, AssetPermissionType>() {
            @Override
            public AssetPermissionType convert(String source) {
                return AssetPermissionType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.assetSearchByConverter")
    Converter<String, AssetSearchBy> assetSearchByConverter() {
        return new Converter<String, AssetSearchBy>() {
            @Override
            public AssetSearchBy convert(String source) {
                return AssetSearchBy.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.assetSortByConverter")
    Converter<String, AssetSortBy> assetSortByConverter() {
        return new Converter<String, AssetSortBy>() {
            @Override
            public AssetSortBy convert(String source) {
                return AssetSortBy.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.assetTypeResponseConverter")
    Converter<String, AssetTypeResponse> assetTypeResponseConverter() {
        return new Converter<String, AssetTypeResponse>() {
            @Override
            public AssetTypeResponse convert(String source) {
                return AssetTypeResponse.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.attributionActionTypeConverter")
    Converter<String, AttributionActionType> attributionActionTypeConverter() {
        return new Converter<String, AttributionActionType>() {
            @Override
            public AttributionActionType convert(String source) {
                return AttributionActionType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.attributionMatchTypeConverter")
    Converter<String, AttributionMatchType> attributionMatchTypeConverter() {
        return new Converter<String, AttributionMatchType>() {
            @Override
            public AttributionMatchType convert(String source) {
                return AttributionMatchType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.attributionModelConverter")
    Converter<String, AttributionModel> attributionModelConverter() {
        return new Converter<String, AttributionModel>() {
            @Override
            public AttributionModel convert(String source) {
                return AttributionModel.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.attributionScopeConverter")
    Converter<String, AttributionScope> attributionScopeConverter() {
        return new Converter<String, AttributionScope>() {
            @Override
            public AttributionScope convert(String source) {
                return AttributionScope.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.audienceAccountTypeConverter")
    Converter<String, AudienceAccountType> audienceAccountTypeConverter() {
        return new Converter<String, AudienceAccountType>() {
            @Override
            public AudienceAccountType convert(String source) {
                return AudienceAccountType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.audienceInsightTypeConverter")
    Converter<String, AudienceInsightType> audienceInsightTypeConverter() {
        return new Converter<String, AudienceInsightType>() {
            @Override
            public AudienceInsightType convert(String source) {
                return AudienceInsightType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.audienceObjectiveTypeConverter")
    Converter<String, AudienceObjectiveType> audienceObjectiveTypeConverter() {
        return new Converter<String, AudienceObjectiveType>() {
            @Override
            public AudienceObjectiveType convert(String source) {
                return AudienceObjectiveType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.audienceOwnershipTypeConverter")
    Converter<String, AudienceOwnershipType> audienceOwnershipTypeConverter() {
        return new Converter<String, AudienceOwnershipType>() {
            @Override
            public AudienceOwnershipType convert(String source) {
                return AudienceOwnershipType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.audienceStatusConverter")
    Converter<String, AudienceStatus> audienceStatusConverter() {
        return new Converter<String, AudienceStatus>() {
            @Override
            public AudienceStatus convert(String source) {
                return AudienceStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.audienceTypeConverter")
    Converter<String, AudienceType> audienceTypeConverter() {
        return new Converter<String, AudienceType>() {
            @Override
            public AudienceType convert(String source) {
                return AudienceType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.audienceUpdateOperationTypeConverter")
    Converter<String, AudienceUpdateOperationType> audienceUpdateOperationTypeConverter() {
        return new Converter<String, AudienceUpdateOperationType>() {
            @Override
            public AudienceUpdateOperationType convert(String source) {
                return AudienceUpdateOperationType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.basePreferredMediaTypeConverter")
    Converter<String, BasePreferredMediaType> basePreferredMediaTypeConverter() {
        return new Converter<String, BasePreferredMediaType>() {
            @Override
            public BasePreferredMediaType convert(String source) {
                return BasePreferredMediaType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.batchOperationStatusConverter")
    Converter<String, BatchOperationStatus> batchOperationStatusConverter() {
        return new Converter<String, BatchOperationStatus>() {
            @Override
            public BatchOperationStatus convert(String source) {
                return BatchOperationStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.bidFloorObjectiveTypeConverter")
    Converter<String, BidFloorObjectiveType> bidFloorObjectiveTypeConverter() {
        return new Converter<String, BidFloorObjectiveType>() {
            @Override
            public BidFloorObjectiveType convert(String source) {
                return BidFloorObjectiveType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.bidStrategyTypeConverter")
    Converter<String, BidStrategyType> bidStrategyTypeConverter() {
        return new Converter<String, BidStrategyType>() {
            @Override
            public BidStrategyType convert(String source) {
                return BidStrategyType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.billingInvoiceDocumentTypeConverter")
    Converter<String, BillingInvoiceDocumentType> billingInvoiceDocumentTypeConverter() {
        return new Converter<String, BillingInvoiceDocumentType>() {
            @Override
            public BillingInvoiceDocumentType convert(String source) {
                return BillingInvoiceDocumentType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.billingInvoiceSortFieldConverter")
    Converter<String, BillingInvoiceSortField> billingInvoiceSortFieldConverter() {
        return new Converter<String, BillingInvoiceSortField>() {
            @Override
            public BillingInvoiceSortField convert(String source) {
                return BillingInvoiceSortField.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.billingInvoiceStatusConverter")
    Converter<String, BillingInvoiceStatus> billingInvoiceStatusConverter() {
        return new Converter<String, BillingInvoiceStatus>() {
            @Override
            public BillingInvoiceStatus convert(String source) {
                return BillingInvoiceStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.billingProfileCardTypeConverter")
    Converter<String, BillingProfileCardType> billingProfileCardTypeConverter() {
        return new Converter<String, BillingProfileCardType>() {
            @Override
            public BillingProfileCardType convert(String source) {
                return BillingProfileCardType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.billingProfilePaymentMethodBrandConverter")
    Converter<String, BillingProfilePaymentMethodBrand> billingProfilePaymentMethodBrandConverter() {
        return new Converter<String, BillingProfilePaymentMethodBrand>() {
            @Override
            public BillingProfilePaymentMethodBrand convert(String source) {
                return BillingProfilePaymentMethodBrand.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.billingProfileStatusConverter")
    Converter<String, BillingProfileStatus> billingProfileStatusConverter() {
        return new Converter<String, BillingProfileStatus>() {
            @Override
            public BillingProfileStatus convert(String source) {
                return BillingProfileStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.billingTypeConverter")
    Converter<String, BillingType> billingTypeConverter() {
        return new Converter<String, BillingType>() {
            @Override
            public BillingType convert(String source) {
                return BillingType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.boardPrivacyConverter")
    Converter<String, BoardPrivacy> boardPrivacyConverter() {
        return new Converter<String, BoardPrivacy>() {
            @Override
            public BoardPrivacy convert(String source) {
                return BoardPrivacy.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.boardPrivacyFilterConverter")
    Converter<String, BoardPrivacyFilter> boardPrivacyFilterConverter() {
        return new Converter<String, BoardPrivacyFilter>() {
            @Override
            public BoardPrivacyFilter convert(String source) {
                return BoardPrivacyFilter.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.boardUpdatePrivacyConverter")
    Converter<String, BoardUpdatePrivacy> boardUpdatePrivacyConverter() {
        return new Converter<String, BoardUpdatePrivacy>() {
            @Override
            public BoardUpdatePrivacy convert(String source) {
                return BoardUpdatePrivacy.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.budgetDurationTypeConverter")
    Converter<String, BudgetDurationType> budgetDurationTypeConverter() {
        return new Converter<String, BudgetDurationType>() {
            @Override
            public BudgetDurationType convert(String source) {
                return BudgetDurationType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.budgetTypeConverter")
    Converter<String, BudgetType> budgetTypeConverter() {
        return new Converter<String, BudgetType>() {
            @Override
            public BudgetType convert(String source) {
                return BudgetType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.bulkEntityTypeConverter")
    Converter<String, BulkEntityType> bulkEntityTypeConverter() {
        return new Converter<String, BulkEntityType>() {
            @Override
            public BulkEntityType convert(String source) {
                return BulkEntityType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.bulkOutputFormatConverter")
    Converter<String, BulkOutputFormat> bulkOutputFormatConverter() {
        return new Converter<String, BulkOutputFormat>() {
            @Override
            public BulkOutputFormat convert(String source) {
                return BulkOutputFormat.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.bulkReportingJobStatusConverter")
    Converter<String, BulkReportingJobStatus> bulkReportingJobStatusConverter() {
        return new Converter<String, BulkReportingJobStatus>() {
            @Override
            public BulkReportingJobStatus convert(String source) {
                return BulkReportingJobStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.bulkRequestStatusConverter")
    Converter<String, BulkRequestStatus> bulkRequestStatusConverter() {
        return new Converter<String, BulkRequestStatus>() {
            @Override
            public BulkRequestStatus convert(String source) {
                return BulkRequestStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.businessAccessRoleConverter")
    Converter<String, BusinessAccessRole> businessAccessRoleConverter() {
        return new Converter<String, BusinessAccessRole>() {
            @Override
            public BusinessAccessRole convert(String source) {
                return BusinessAccessRole.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.businessMemberSortByConverter")
    Converter<String, BusinessMemberSortBy> businessMemberSortByConverter() {
        return new Converter<String, BusinessMemberSortBy>() {
            @Override
            public BusinessMemberSortBy convert(String source) {
                return BusinessMemberSortBy.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.businessRoleForInviteConverter")
    Converter<String, BusinessRoleForInvite> businessRoleForInviteConverter() {
        return new Converter<String, BusinessRoleForInvite>() {
            @Override
            public BusinessRoleForInvite convert(String source) {
                return BusinessRoleForInvite.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.businessRoleForMembersConverter")
    Converter<String, BusinessRoleForMembers> businessRoleForMembersConverter() {
        return new Converter<String, BusinessRoleForMembers>() {
            @Override
            public BusinessRoleForMembers convert(String source) {
                return BusinessRoleForMembers.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.businessSearchByConverter")
    Converter<String, BusinessSearchBy> businessSearchByConverter() {
        return new Converter<String, BusinessSearchBy>() {
            @Override
            public BusinessSearchBy convert(String source) {
                return BusinessSearchBy.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.campaignBidOptionsUpdateMaskItemsConverter")
    Converter<String, CampaignBidOptionsUpdateMaskItems> campaignBidOptionsUpdateMaskItemsConverter() {
        return new Converter<String, CampaignBidOptionsUpdateMaskItems>() {
            @Override
            public CampaignBidOptionsUpdateMaskItems convert(String source) {
                return CampaignBidOptionsUpdateMaskItems.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.campaignObjectiveTypeConverter")
    Converter<String, CampaignObjectiveType> campaignObjectiveTypeConverter() {
        return new Converter<String, CampaignObjectiveType>() {
            @Override
            public CampaignObjectiveType convert(String source) {
                return CampaignObjectiveType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.campaignPlanningConfidenceLevelAlertReasonConverter")
    Converter<String, CampaignPlanningConfidenceLevelAlertReason> campaignPlanningConfidenceLevelAlertReasonConverter() {
        return new Converter<String, CampaignPlanningConfidenceLevelAlertReason>() {
            @Override
            public CampaignPlanningConfidenceLevelAlertReason convert(String source) {
                return CampaignPlanningConfidenceLevelAlertReason.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.campaignPlanningConfidenceLevelAlertSeverityConverter")
    Converter<String, CampaignPlanningConfidenceLevelAlertSeverity> campaignPlanningConfidenceLevelAlertSeverityConverter() {
        return new Converter<String, CampaignPlanningConfidenceLevelAlertSeverity>() {
            @Override
            public CampaignPlanningConfidenceLevelAlertSeverity convert(String source) {
                return CampaignPlanningConfidenceLevelAlertSeverity.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.campaignPlanningConversionAttributionWindowDaysConverter")
    Converter<String, CampaignPlanningConversionAttributionWindowDays> campaignPlanningConversionAttributionWindowDaysConverter() {
        return new Converter<String, CampaignPlanningConversionAttributionWindowDays>() {
            @Override
            public CampaignPlanningConversionAttributionWindowDays convert(String source) {
                return CampaignPlanningConversionAttributionWindowDays.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.campaignPlanningConversionEventConverter")
    Converter<String, CampaignPlanningConversionEvent> campaignPlanningConversionEventConverter() {
        return new Converter<String, CampaignPlanningConversionEvent>() {
            @Override
            public CampaignPlanningConversionEvent convert(String source) {
                return CampaignPlanningConversionEvent.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.campaignPlanningEstimationTypeConverter")
    Converter<String, CampaignPlanningEstimationType> campaignPlanningEstimationTypeConverter() {
        return new Converter<String, CampaignPlanningEstimationType>() {
            @Override
            public CampaignPlanningEstimationType convert(String source) {
                return CampaignPlanningEstimationType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.campaignPlanningResponseErrorCodeConverter")
    Converter<String, CampaignPlanningResponseErrorCode> campaignPlanningResponseErrorCodeConverter() {
        return new Converter<String, CampaignPlanningResponseErrorCode>() {
            @Override
            public CampaignPlanningResponseErrorCode convert(String source) {
                return CampaignPlanningResponseErrorCode.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.campaignSummaryStatusConverter")
    Converter<String, CampaignSummaryStatus> campaignSummaryStatusConverter() {
        return new Converter<String, CampaignSummaryStatus>() {
            @Override
            public CampaignSummaryStatus convert(String source) {
                return CampaignSummaryStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.catalogsAiContentDisclosureLabelConverter")
    Converter<String, CatalogsAiContentDisclosureLabel> catalogsAiContentDisclosureLabelConverter() {
        return new Converter<String, CatalogsAiContentDisclosureLabel>() {
            @Override
            public CatalogsAiContentDisclosureLabel convert(String source) {
                return CatalogsAiContentDisclosureLabel.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.catalogsFeedProcessingScheduleTimezoneConverter")
    Converter<String, CatalogsFeedProcessingScheduleTimezone> catalogsFeedProcessingScheduleTimezoneConverter() {
        return new Converter<String, CatalogsFeedProcessingScheduleTimezone>() {
            @Override
            public CatalogsFeedProcessingScheduleTimezone convert(String source) {
                return CatalogsFeedProcessingScheduleTimezone.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.catalogsFeedProcessingStatusConverter")
    Converter<String, CatalogsFeedProcessingStatus> catalogsFeedProcessingStatusConverter() {
        return new Converter<String, CatalogsFeedProcessingStatus>() {
            @Override
            public CatalogsFeedProcessingStatus convert(String source) {
                return CatalogsFeedProcessingStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.catalogsFormatConverter")
    Converter<String, CatalogsFormat> catalogsFormatConverter() {
        return new Converter<String, CatalogsFormat>() {
            @Override
            public CatalogsFormat convert(String source) {
                return CatalogsFormat.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.catalogsHotelProductGroupTypeConverter")
    Converter<String, CatalogsHotelProductGroupType> catalogsHotelProductGroupTypeConverter() {
        return new Converter<String, CatalogsHotelProductGroupType>() {
            @Override
            public CatalogsHotelProductGroupType convert(String source) {
                return CatalogsHotelProductGroupType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.catalogsItemValidationIssueConverter")
    Converter<String, CatalogsItemValidationIssue> catalogsItemValidationIssueConverter() {
        return new Converter<String, CatalogsItemValidationIssue>() {
            @Override
            public CatalogsItemValidationIssue convert(String source) {
                return CatalogsItemValidationIssue.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.catalogsLocaleConverter")
    Converter<String, CatalogsLocale> catalogsLocaleConverter() {
        return new Converter<String, CatalogsLocale>() {
            @Override
            public CatalogsLocale convert(String source) {
                return CatalogsLocale.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.catalogsProductGroupStatusConverter")
    Converter<String, CatalogsProductGroupStatus> catalogsProductGroupStatusConverter() {
        return new Converter<String, CatalogsProductGroupStatus>() {
            @Override
            public CatalogsProductGroupStatus convert(String source) {
                return CatalogsProductGroupStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.catalogsProductGroupTypeConverter")
    Converter<String, CatalogsProductGroupType> catalogsProductGroupTypeConverter() {
        return new Converter<String, CatalogsProductGroupType>() {
            @Override
            public CatalogsProductGroupType convert(String source) {
                return CatalogsProductGroupType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.catalogsStatusConverter")
    Converter<String, CatalogsStatus> catalogsStatusConverter() {
        return new Converter<String, CatalogsStatus>() {
            @Override
            public CatalogsStatus convert(String source) {
                return CatalogsStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.catalogsTypeConverter")
    Converter<String, CatalogsType> catalogsTypeConverter() {
        return new Converter<String, CatalogsType>() {
            @Override
            public CatalogsType convert(String source) {
                return CatalogsType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.changeHistoryDataTypeConverter")
    Converter<String, ChangeHistoryDataType> changeHistoryDataTypeConverter() {
        return new Converter<String, ChangeHistoryDataType>() {
            @Override
            public ChangeHistoryDataType convert(String source) {
                return ChangeHistoryDataType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.changeHistoryOperationTypeConverter")
    Converter<String, ChangeHistoryOperationType> changeHistoryOperationTypeConverter() {
        return new Converter<String, ChangeHistoryOperationType>() {
            @Override
            public ChangeHistoryOperationType convert(String source) {
                return ChangeHistoryOperationType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.collectionsHeaderTypeConverter")
    Converter<String, CollectionsHeaderType> collectionsHeaderTypeConverter() {
        return new Converter<String, CollectionsHeaderType>() {
            @Override
            public CollectionsHeaderType convert(String source) {
                return CollectionsHeaderType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.contentTypeConverter")
    Converter<String, ContentType> contentTypeConverter() {
        return new Converter<String, ContentType>() {
            @Override
            public ContentType convert(String source) {
                return ContentType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.conversionAttributionWindowDaysConverter")
    Converter<BigDecimal, ConversionAttributionWindowDays> conversionAttributionWindowDaysConverter() {
        return new Converter<BigDecimal, ConversionAttributionWindowDays>() {
            @Override
            public ConversionAttributionWindowDays convert(BigDecimal source) {
                return ConversionAttributionWindowDays.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.conversionDeletionRequestStatusConverter")
    Converter<String, ConversionDeletionRequestStatus> conversionDeletionRequestStatusConverter() {
        return new Converter<String, ConversionDeletionRequestStatus>() {
            @Override
            public ConversionDeletionRequestStatus convert(String source) {
                return ConversionDeletionRequestStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.conversionEventConverter")
    Converter<String, ConversionEvent> conversionEventConverter() {
        return new Converter<String, ConversionEvent>() {
            @Override
            public ConversionEvent convert(String source) {
                return ConversionEvent.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.conversionEventIngestionSourceConverter")
    Converter<String, ConversionEventIngestionSource> conversionEventIngestionSourceConverter() {
        return new Converter<String, ConversionEventIngestionSource>() {
            @Override
            public ConversionEventIngestionSource convert(String source) {
                return ConversionEventIngestionSource.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.conversionLearningModeTypeConverter")
    Converter<String, ConversionLearningModeType> conversionLearningModeTypeConverter() {
        return new Converter<String, ConversionLearningModeType>() {
            @Override
            public ConversionLearningModeType convert(String source) {
                return ConversionLearningModeType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.conversionObjectiveTypeConverter")
    Converter<String, ConversionObjectiveType> conversionObjectiveTypeConverter() {
        return new Converter<String, ConversionObjectiveType>() {
            @Override
            public ConversionObjectiveType convert(String source) {
                return ConversionObjectiveType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.conversionProductAttributionTypeConverter")
    Converter<String, ConversionProductAttributionType> conversionProductAttributionTypeConverter() {
        return new Converter<String, ConversionProductAttributionType>() {
            @Override
            public ConversionProductAttributionType convert(String source) {
                return ConversionProductAttributionType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.conversionProductReportBreakdownTypeConverter")
    Converter<String, ConversionProductReportBreakdownType> conversionProductReportBreakdownTypeConverter() {
        return new Converter<String, ConversionProductReportBreakdownType>() {
            @Override
            public ConversionProductReportBreakdownType convert(String source) {
                return ConversionProductReportBreakdownType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.conversionProductReportGranularityConverter")
    Converter<String, ConversionProductReportGranularity> conversionProductReportGranularityConverter() {
        return new Converter<String, ConversionProductReportGranularity>() {
            @Override
            public ConversionProductReportGranularity convert(String source) {
                return ConversionProductReportGranularity.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.conversionProductReportLevelConverter")
    Converter<String, ConversionProductReportLevel> conversionProductReportLevelConverter() {
        return new Converter<String, ConversionProductReportLevel>() {
            @Override
            public ConversionProductReportLevel convert(String source) {
                return ConversionProductReportLevel.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.conversionProductReportingColumnConverter")
    Converter<String, ConversionProductReportingColumn> conversionProductReportingColumnConverter() {
        return new Converter<String, ConversionProductReportingColumn>() {
            @Override
            public ConversionProductReportingColumn convert(String source) {
                return ConversionProductReportingColumn.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.conversionReportAttributionTypeConverter")
    Converter<String, ConversionReportAttributionType> conversionReportAttributionTypeConverter() {
        return new Converter<String, ConversionReportAttributionType>() {
            @Override
            public ConversionReportAttributionType convert(String source) {
                return ConversionReportAttributionType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.conversionReportTimeTypeConverter")
    Converter<String, ConversionReportTimeType> conversionReportTimeTypeConverter() {
        return new Converter<String, ConversionReportTimeType>() {
            @Override
            public ConversionReportTimeType convert(String source) {
                return ConversionReportTimeType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.conversionTagTypeConverter")
    Converter<String, ConversionTagType> conversionTagTypeConverter() {
        return new Converter<String, ConversionTagType>() {
            @Override
            public ConversionTagType convert(String source) {
                return ConversionTagType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.conversionTagTypeOptimalConverter")
    Converter<String, ConversionTagTypeOptimal> conversionTagTypeOptimalConverter() {
        return new Converter<String, ConversionTagTypeOptimal>() {
            @Override
            public ConversionTagTypeOptimal convert(String source) {
                return ConversionTagTypeOptimal.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.countryConverter")
    Converter<String, Country> countryConverter() {
        return new Converter<String, Country>() {
            @Override
            public Country convert(String source) {
                return Country.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.creationSourceConverter")
    Converter<String, CreationSource> creationSourceConverter() {
        return new Converter<String, CreationSource>() {
            @Override
            public CreationSource convert(String source) {
                return CreationSource.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.creativeAssetsVisibilityTypeConverter")
    Converter<String, CreativeAssetsVisibilityType> creativeAssetsVisibilityTypeConverter() {
        return new Converter<String, CreativeAssetsVisibilityType>() {
            @Override
            public CreativeAssetsVisibilityType convert(String source) {
                return CreativeAssetsVisibilityType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.creativeTypeConverter")
    Converter<String, CreativeType> creativeTypeConverter() {
        return new Converter<String, CreativeType>() {
            @Override
            public CreativeType convert(String source) {
                return CreativeType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.currencyConverter")
    Converter<String, Currency> currencyConverter() {
        return new Converter<String, Currency>() {
            @Override
            public Currency convert(String source) {
                return Currency.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.customerListStatusConverter")
    Converter<String, CustomerListStatus> customerListStatusConverter() {
        return new Converter<String, CustomerListStatus>() {
            @Override
            public CustomerListStatus convert(String source) {
                return CustomerListStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.customizableCTATypeConverter")
    Converter<String, CustomizableCTAType> customizableCTATypeConverter() {
        return new Converter<String, CustomizableCTAType>() {
            @Override
            public CustomizableCTAType convert(String source) {
                return CustomizableCTAType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.dataOutputFormatConverter")
    Converter<String, DataOutputFormat> dataOutputFormatConverter() {
        return new Converter<String, DataOutputFormat>() {
            @Override
            public DataOutputFormat convert(String source) {
                return DataOutputFormat.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.dataStatusConverter")
    Converter<String, DataStatus> dataStatusConverter() {
        return new Converter<String, DataStatus>() {
            @Override
            public DataStatus convert(String source) {
                return DataStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.deliveryEstimateObjectiveTypeConverter")
    Converter<String, DeliveryEstimateObjectiveType> deliveryEstimateObjectiveTypeConverter() {
        return new Converter<String, DeliveryEstimateObjectiveType>() {
            @Override
            public DeliveryEstimateObjectiveType convert(String source) {
                return DeliveryEstimateObjectiveType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.disclosureTypeConverter")
    Converter<String, DisclosureType> disclosureTypeConverter() {
        return new Converter<String, DisclosureType>() {
            @Override
            public DisclosureType convert(String source) {
                return DisclosureType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.discountStatusConverter")
    Converter<String, DiscountStatus> discountStatusConverter() {
        return new Converter<String, DiscountStatus>() {
            @Override
            public DiscountStatus convert(String source) {
                return DiscountStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.enhancedMatchStatusTypeConverter")
    Converter<String, EnhancedMatchStatusType> enhancedMatchStatusTypeConverter() {
        return new Converter<String, EnhancedMatchStatusType>() {
            @Override
            public EnhancedMatchStatusType convert(String source) {
                return EnhancedMatchStatusType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.entityLabelStatusConverter")
    Converter<String, EntityLabelStatus> entityLabelStatusConverter() {
        return new Converter<String, EntityLabelStatus>() {
            @Override
            public EntityLabelStatus convert(String source) {
                return EntityLabelStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.entityStatusConverter")
    Converter<String, EntityStatus> entityStatusConverter() {
        return new Converter<String, EntityStatus>() {
            @Override
            public EntityStatus convert(String source) {
                return EntityStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.eventProcessingStatusConverter")
    Converter<String, EventProcessingStatus> eventProcessingStatusConverter() {
        return new Converter<String, EventProcessingStatus>() {
            @Override
            public EventProcessingStatus convert(String source) {
                return EventProcessingStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.filterOperatorTypeConverter")
    Converter<String, FilterOperatorType> filterOperatorTypeConverter() {
        return new Converter<String, FilterOperatorType>() {
            @Override
            public FilterOperatorType convert(String source) {
                return FilterOperatorType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formFactorConverter")
    Converter<String, FormFactor> formFactorConverter() {
        return new Converter<String, FormFactor>() {
            @Override
            public FormFactor convert(String source) {
                return FormFactor.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.freqBidMultiplierTimeWindowConverter")
    Converter<String, FreqBidMultiplierTimeWindow> freqBidMultiplierTimeWindowConverter() {
        return new Converter<String, FreqBidMultiplierTimeWindow>() {
            @Override
            public FreqBidMultiplierTimeWindow convert(String source) {
                return FreqBidMultiplierTimeWindow.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.frequencyGoalMetadataTimerangeConverter")
    Converter<String, FrequencyGoalMetadataTimerange> frequencyGoalMetadataTimerangeConverter() {
        return new Converter<String, FrequencyGoalMetadataTimerange>() {
            @Override
            public FrequencyGoalMetadataTimerange convert(String source) {
                return FrequencyGoalMetadataTimerange.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.genderConverter")
    Converter<String, Gender> genderConverter() {
        return new Converter<String, Gender>() {
            @Override
            public Gender convert(String source) {
                return Gender.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.genderBucketConverter")
    Converter<String, GenderBucket> genderBucketConverter() {
        return new Converter<String, GenderBucket>() {
            @Override
            public GenderBucket convert(String source) {
                return GenderBucket.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.granularityConverter")
    Converter<String, Granularity> granularityConverter() {
        return new Converter<String, Granularity>() {
            @Override
            public Granularity convert(String source) {
                return Granularity.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.gridClickTypeConverter")
    Converter<String, GridClickType> gridClickTypeConverter() {
        return new Converter<String, GridClickType>() {
            @Override
            public GridClickType convert(String source) {
                return GridClickType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.httpMethodConverter")
    Converter<String, HttpMethod> httpMethodConverter() {
        return new Converter<String, HttpMethod>() {
            @Override
            public HttpMethod convert(String source) {
                return HttpMethod.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.ineligibleProductTagReasonConverter")
    Converter<String, IneligibleProductTagReason> ineligibleProductTagReasonConverter() {
        return new Converter<String, IneligibleProductTagReason>() {
            @Override
            public IneligibleProductTagReason convert(String source) {
                return IneligibleProductTagReason.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.ingestionSourceConverter")
    Converter<String, IngestionSource> ingestionSourceConverter() {
        return new Converter<String, IngestionSource>() {
            @Override
            public IngestionSource convert(String source) {
                return IngestionSource.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.ingestionSourceOptionsConverter")
    Converter<String, IngestionSourceOptions> ingestionSourceOptionsConverter() {
        return new Converter<String, IngestionSourceOptions>() {
            @Override
            public IngestionSourceOptions convert(String source) {
                return IngestionSourceOptions.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.integrationLogEventTypeConverter")
    Converter<String, IntegrationLogEventType> integrationLogEventTypeConverter() {
        return new Converter<String, IntegrationLogEventType>() {
            @Override
            public IntegrationLogEventType convert(String source) {
                return IntegrationLogEventType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.integrationLogLevelConverter")
    Converter<String, IntegrationLogLevel> integrationLogLevelConverter() {
        return new Converter<String, IntegrationLogLevel>() {
            @Override
            public IntegrationLogLevel convert(String source) {
                return IntegrationLogLevel.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.intendedPromotionTypeConverter")
    Converter<String, IntendedPromotionType> intendedPromotionTypeConverter() {
        return new Converter<String, IntendedPromotionType>() {
            @Override
            public IntendedPromotionType convert(String source) {
                return IntendedPromotionType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.interestsEnumConverter")
    Converter<String, InterestsEnum> interestsEnumConverter() {
        return new Converter<String, InterestsEnum>() {
            @Override
            public InterestsEnum convert(String source) {
                return InterestsEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.inviteFilterStatusConverter")
    Converter<String, InviteFilterStatus> inviteFilterStatusConverter() {
        return new Converter<String, InviteFilterStatus>() {
            @Override
            public InviteFilterStatus convert(String source) {
                return InviteFilterStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.inviteStatusConverter")
    Converter<String, InviteStatus> inviteStatusConverter() {
        return new Converter<String, InviteStatus>() {
            @Override
            public InviteStatus convert(String source) {
                return InviteStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.inviteTypeConverter")
    Converter<String, InviteType> inviteTypeConverter() {
        return new Converter<String, InviteType>() {
            @Override
            public InviteType convert(String source) {
                return InviteType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.itemAvailabilityConverter")
    Converter<String, ItemAvailability> itemAvailabilityConverter() {
        return new Converter<String, ItemAvailability>() {
            @Override
            public ItemAvailability convert(String source) {
                return ItemAvailability.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.itemProcessingStatusConverter")
    Converter<String, ItemProcessingStatus> itemProcessingStatusConverter() {
        return new Converter<String, ItemProcessingStatus>() {
            @Override
            public ItemProcessingStatus convert(String source) {
                return ItemProcessingStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.labelParentTypeConverter")
    Converter<String, LabelParentType> labelParentTypeConverter() {
        return new Converter<String, LabelParentType>() {
            @Override
            public LabelParentType convert(String source) {
                return LabelParentType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.labelStatusConverter")
    Converter<String, LabelStatus> labelStatusConverter() {
        return new Converter<String, LabelStatus>() {
            @Override
            public LabelStatus convert(String source) {
                return LabelStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.labelStatusBulkUpdateConverter")
    Converter<String, LabelStatusBulkUpdate> labelStatusBulkUpdateConverter() {
        return new Converter<String, LabelStatusBulkUpdate>() {
            @Override
            public LabelStatusBulkUpdate convert(String source) {
                return LabelStatusBulkUpdate.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.labelTypeConverter")
    Converter<String, LabelType> labelTypeConverter() {
        return new Converter<String, LabelType>() {
            @Override
            public LabelType convert(String source) {
                return LabelType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.languageConverter")
    Converter<String, Language> languageConverter() {
        return new Converter<String, Language>() {
            @Override
            public Language convert(String source) {
                return Language.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.leadFormQuestionFieldTypeConverter")
    Converter<String, LeadFormQuestionFieldType> leadFormQuestionFieldTypeConverter() {
        return new Converter<String, LeadFormQuestionFieldType>() {
            @Override
            public LeadFormQuestionFieldType convert(String source) {
                return LeadFormQuestionFieldType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.leadFormQuestionTypeConverter")
    Converter<String, LeadFormQuestionType> leadFormQuestionTypeConverter() {
        return new Converter<String, LeadFormQuestionType>() {
            @Override
            public LeadFormQuestionType convert(String source) {
                return LeadFormQuestionType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.leadFormStatusConverter")
    Converter<String, LeadFormStatus> leadFormStatusConverter() {
        return new Converter<String, LeadFormStatus>() {
            @Override
            public LeadFormStatus convert(String source) {
                return LeadFormStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.leadsExportStatusConverter")
    Converter<String, LeadsExportStatus> leadsExportStatusConverter() {
        return new Converter<String, LeadsExportStatus>() {
            @Override
            public LeadsExportStatus convert(String source) {
                return LeadsExportStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.lookbackPeriodOptionsConverter")
    Converter<String, LookbackPeriodOptions> lookbackPeriodOptionsConverter() {
        return new Converter<String, LookbackPeriodOptions>() {
            @Override
            public LookbackPeriodOptions convert(String source) {
                return LookbackPeriodOptions.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.mmMReportGranularityConverter")
    Converter<String, MMMReportGranularity> mmMReportGranularityConverter() {
        return new Converter<String, MMMReportGranularity>() {
            @Override
            public MMMReportGranularity convert(String source) {
                return MMMReportGranularity.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.mmMReportLevelConverter")
    Converter<String, MMMReportLevel> mmMReportLevelConverter() {
        return new Converter<String, MMMReportLevel>() {
            @Override
            public MMMReportLevel convert(String source) {
                return MMMReportLevel.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.mmMReportingColumnConverter")
    Converter<String, MMMReportingColumn> mmMReportingColumnConverter() {
        return new Converter<String, MMMReportingColumn>() {
            @Override
            public MMMReportingColumn convert(String source) {
                return MMMReportingColumn.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.mmMReportingTargetingTypeConverter")
    Converter<String, MMMReportingTargetingType> mmMReportingTargetingTypeConverter() {
        return new Converter<String, MMMReportingTargetingType>() {
            @Override
            public MMMReportingTargetingType convert(String source) {
                return MMMReportingTargetingType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.matchTypeConverter")
    Converter<String, MatchType> matchTypeConverter() {
        return new Converter<String, MatchType>() {
            @Override
            public MatchType convert(String source) {
                return MatchType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.matchTypeResponseConverter")
    Converter<String, MatchTypeResponse> matchTypeResponseConverter() {
        return new Converter<String, MatchTypeResponse>() {
            @Override
            public MatchTypeResponse convert(String source) {
                return MatchTypeResponse.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.mediaTypeConverter")
    Converter<String, MediaType> mediaTypeConverter() {
        return new Converter<String, MediaType>() {
            @Override
            public MediaType convert(String source) {
                return MediaType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.mediaUploadStatusConverter")
    Converter<String, MediaUploadStatus> mediaUploadStatusConverter() {
        return new Converter<String, MediaUploadStatus>() {
            @Override
            public MediaUploadStatus convert(String source) {
                return MediaUploadStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.mediaUploadTypeConverter")
    Converter<String, MediaUploadType> mediaUploadTypeConverter() {
        return new Converter<String, MediaUploadType>() {
            @Override
            public MediaUploadType convert(String source) {
                return MediaUploadType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.memberBusinessRoleConverter")
    Converter<String, MemberBusinessRole> memberBusinessRoleConverter() {
        return new Converter<String, MemberBusinessRole>() {
            @Override
            public MemberBusinessRole convert(String source) {
                return MemberBusinessRole.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.metricsReportingLevelConverter")
    Converter<String, MetricsReportingLevel> metricsReportingLevelConverter() {
        return new Converter<String, MetricsReportingLevel>() {
            @Override
            public MetricsReportingLevel convert(String source) {
                return MetricsReportingLevel.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.metricsReportingTemplateTypeConverter")
    Converter<String, MetricsReportingTemplateType> metricsReportingTemplateTypeConverter() {
        return new Converter<String, MetricsReportingTemplateType>() {
            @Override
            public MetricsReportingTemplateType convert(String source) {
                return MetricsReportingTemplateType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.mobileAppPlatformConverter")
    Converter<String, MobileAppPlatform> mobileAppPlatformConverter() {
        return new Converter<String, MobileAppPlatform>() {
            @Override
            public MobileAppPlatform convert(String source) {
                return MobileAppPlatform.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.msotEventNameConverter")
    Converter<String, MsotEventName> msotEventNameConverter() {
        return new Converter<String, MsotEventName>() {
            @Override
            public MsotEventName convert(String source) {
                return MsotEventName.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.multiPinsAnalyticsMetricTypesItemConverter")
    Converter<String, MultiPinsAnalyticsMetricTypesItem> multiPinsAnalyticsMetricTypesItemConverter() {
        return new Converter<String, MultiPinsAnalyticsMetricTypesItem>() {
            @Override
            public MultiPinsAnalyticsMetricTypesItem convert(String source) {
                return MultiPinsAnalyticsMetricTypesItem.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.networkTypeConverter")
    Converter<String, NetworkType> networkTypeConverter() {
        return new Converter<String, NetworkType>() {
            @Override
            public NetworkType convert(String source) {
                return NetworkType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.nonDraftEntityStatusConverter")
    Converter<String, NonDraftEntityStatus> nonDraftEntityStatusConverter() {
        return new Converter<String, NonDraftEntityStatus>() {
            @Override
            public NonDraftEntityStatus convert(String source) {
                return NonDraftEntityStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.nonNullableCatalogsCurrencyConverter")
    Converter<String, NonNullableCatalogsCurrency> nonNullableCatalogsCurrencyConverter() {
        return new Converter<String, NonNullableCatalogsCurrency>() {
            @Override
            public NonNullableCatalogsCurrency convert(String source) {
                return NonNullableCatalogsCurrency.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.nullableCatalogsItemFieldTypeConverter")
    Converter<String, NullableCatalogsItemFieldType> nullableCatalogsItemFieldTypeConverter() {
        return new Converter<String, NullableCatalogsItemFieldType>() {
            @Override
            public NullableCatalogsItemFieldType convert(String source) {
                return NullableCatalogsItemFieldType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.nullableCurrencyConverter")
    Converter<String, NullableCurrency> nullableCurrencyConverter() {
        return new Converter<String, NullableCurrency>() {
            @Override
            public NullableCurrency convert(String source) {
                return NullableCurrency.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.nullableEntityStatusConverter")
    Converter<String, NullableEntityStatus> nullableEntityStatusConverter() {
        return new Converter<String, NullableEntityStatus>() {
            @Override
            public NullableEntityStatus convert(String source) {
                return NullableEntityStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.nullableLabelStatusConverter")
    Converter<String, NullableLabelStatus> nullableLabelStatusConverter() {
        return new Converter<String, NullableLabelStatus>() {
            @Override
            public NullableLabelStatus convert(String source) {
                return NullableLabelStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.nullableLabelTypeConverter")
    Converter<String, NullableLabelType> nullableLabelTypeConverter() {
        return new Converter<String, NullableLabelType>() {
            @Override
            public NullableLabelType convert(String source) {
                return NullableLabelType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.nullablePartnerTypeConverter")
    Converter<String, NullablePartnerType> nullablePartnerTypeConverter() {
        return new Converter<String, NullablePartnerType>() {
            @Override
            public NullablePartnerType convert(String source) {
                return NullablePartnerType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.nullalbleMatchTypeConverter")
    Converter<String, NullalbleMatchType> nullalbleMatchTypeConverter() {
        return new Converter<String, NullalbleMatchType>() {
            @Override
            public NullalbleMatchType convert(String source) {
                return NullalbleMatchType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.numericFilterOperatorTypeConverter")
    Converter<String, NumericFilterOperatorType> numericFilterOperatorTypeConverter() {
        return new Converter<String, NumericFilterOperatorType>() {
            @Override
            public NumericFilterOperatorType convert(String source) {
                return NumericFilterOperatorType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.objectiveTypeConverter")
    Converter<String, ObjectiveType> objectiveTypeConverter() {
        return new Converter<String, ObjectiveType>() {
            @Override
            public ObjectiveType convert(String source) {
                return ObjectiveType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.operationTypeConverter")
    Converter<String, OperationType> operationTypeConverter() {
        return new Converter<String, OperationType>() {
            @Override
            public OperationType convert(String source) {
                return OperationType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.optimizationTypeConverter")
    Converter<String, OptimizationType> optimizationTypeConverter() {
        return new Converter<String, OptimizationType>() {
            @Override
            public OptimizationType convert(String source) {
                return OptimizationType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.orderConverter")
    Converter<String, Order> orderConverter() {
        return new Converter<String, Order>() {
            @Override
            public Order convert(String source) {
                return Order.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.orderLinePaidTypeConverter")
    Converter<String, OrderLinePaidType> orderLinePaidTypeConverter() {
        return new Converter<String, OrderLinePaidType>() {
            @Override
            public OrderLinePaidType convert(String source) {
                return OrderLinePaidType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.orderLineStatusConverter")
    Converter<String, OrderLineStatus> orderLineStatusConverter() {
        return new Converter<String, OrderLineStatus>() {
            @Override
            public OrderLineStatus convert(String source) {
                return OrderLineStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.osFamilyConverter")
    Converter<String, OsFamily> osFamilyConverter() {
        return new Converter<String, OsFamily>() {
            @Override
            public OsFamily convert(String source) {
                return OsFamily.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.overallStatusOptionsConverter")
    Converter<String, OverallStatusOptions> overallStatusOptionsConverter() {
        return new Converter<String, OverallStatusOptions>() {
            @Override
            public OverallStatusOptions convert(String source) {
                return OverallStatusOptions.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.pacingDeliveryTypeConverter")
    Converter<String, PacingDeliveryType> pacingDeliveryTypeConverter() {
        return new Converter<String, PacingDeliveryType>() {
            @Override
            public PacingDeliveryType convert(String source) {
                return PacingDeliveryType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.partnerTypeConverter")
    Converter<String, PartnerType> partnerTypeConverter() {
        return new Converter<String, PartnerType>() {
            @Override
            public PartnerType convert(String source) {
                return PartnerType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.permissionsConverter")
    Converter<String, Permissions> permissionsConverter() {
        return new Converter<String, Permissions>() {
            @Override
            public Permissions convert(String source) {
                return Permissions.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.permissionsWithOwnerConverter")
    Converter<String, PermissionsWithOwner> permissionsWithOwnerConverter() {
        return new Converter<String, PermissionsWithOwner>() {
            @Override
            public PermissionsWithOwner convert(String source) {
                return PermissionsWithOwner.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.pinFilterConverter")
    Converter<String, PinFilter> pinFilterConverter() {
        return new Converter<String, PinFilter>() {
            @Override
            public PinFilter convert(String source) {
                return PinFilter.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.pinPromotionSummaryStatusConverter")
    Converter<String, PinPromotionSummaryStatus> pinPromotionSummaryStatusConverter() {
        return new Converter<String, PinPromotionSummaryStatus>() {
            @Override
            public PinPromotionSummaryStatus convert(String source) {
                return PinPromotionSummaryStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.pinTypeConverter")
    Converter<String, PinType> pinTypeConverter() {
        return new Converter<String, PinType>() {
            @Override
            public PinType convert(String source) {
                return PinType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.pinnerListTypeConverter")
    Converter<String, PinnerListType> pinnerListTypeConverter() {
        return new Converter<String, PinnerListType>() {
            @Override
            public PinnerListType convert(String source) {
                return PinnerListType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.pinterestLibPaginationOrderConverter")
    Converter<String, PinterestLibPaginationOrder> pinterestLibPaginationOrderConverter() {
        return new Converter<String, PinterestLibPaginationOrder>() {
            @Override
            public PinterestLibPaginationOrder convert(String source) {
                return PinterestLibPaginationOrder.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.placementGroupTypeConverter")
    Converter<String, PlacementGroupType> placementGroupTypeConverter() {
        return new Converter<String, PlacementGroupType>() {
            @Override
            public PlacementGroupType convert(String source) {
                return PlacementGroupType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.placementTrafficTypeConverter")
    Converter<String, PlacementTrafficType> placementTrafficTypeConverter() {
        return new Converter<String, PlacementTrafficType>() {
            @Override
            public PlacementTrafficType convert(String source) {
                return PlacementTrafficType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.placementTypeConverter")
    Converter<String, PlacementType> placementTypeConverter() {
        return new Converter<String, PlacementType>() {
            @Override
            public PlacementType convert(String source) {
                return PlacementType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.preferredMediaTypeConverter")
    Converter<String, PreferredMediaType> preferredMediaTypeConverter() {
        return new Converter<String, PreferredMediaType>() {
            @Override
            public PreferredMediaType convert(String source) {
                return PreferredMediaType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.primarySortConverter")
    Converter<String, PrimarySort> primarySortConverter() {
        return new Converter<String, PrimarySort>() {
            @Override
            public PrimarySort convert(String source) {
                return PrimarySort.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.productAvailabilityConverter")
    Converter<String, ProductAvailability> productAvailabilityConverter() {
        return new Converter<String, ProductAvailability>() {
            @Override
            public ProductAvailability convert(String source) {
                return ProductAvailability.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.productAvailabilityTypeConverter")
    Converter<String, ProductAvailabilityType> productAvailabilityTypeConverter() {
        return new Converter<String, ProductAvailabilityType>() {
            @Override
            public ProductAvailabilityType convert(String source) {
                return ProductAvailabilityType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.productCategoriesEngagementTypeConverter")
    Converter<String, ProductCategoriesEngagementType> productCategoriesEngagementTypeConverter() {
        return new Converter<String, ProductCategoriesEngagementType>() {
            @Override
            public ProductCategoriesEngagementType convert(String source) {
                return ProductCategoriesEngagementType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.productCategoryDetailLookbackWindowConverter")
    Converter<BigDecimal, ProductCategoryDetailLookbackWindow> productCategoryDetailLookbackWindowConverter() {
        return new Converter<BigDecimal, ProductCategoryDetailLookbackWindow>() {
            @Override
            public ProductCategoryDetailLookbackWindow convert(BigDecimal source) {
                return ProductCategoryDetailLookbackWindow.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.productCategoryEnumConverter")
    Converter<String, ProductCategoryEnum> productCategoryEnumConverter() {
        return new Converter<String, ProductCategoryEnum>() {
            @Override
            public ProductCategoryEnum convert(String source) {
                return ProductCategoryEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.productCategoryRegionConverter")
    Converter<String, ProductCategoryRegion> productCategoryRegionConverter() {
        return new Converter<String, ProductCategoryRegion>() {
            @Override
            public ProductCategoryRegion convert(String source) {
                return ProductCategoryRegion.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.productConditionConverter")
    Converter<String, ProductCondition> productConditionConverter() {
        return new Converter<String, ProductCondition>() {
            @Override
            public ProductCondition convert(String source) {
                return ProductCondition.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.productGroupPromotionCustomizableCTATypeConverter")
    Converter<String, ProductGroupPromotionCustomizableCTAType> productGroupPromotionCustomizableCTATypeConverter() {
        return new Converter<String, ProductGroupPromotionCustomizableCTAType>() {
            @Override
            public ProductGroupPromotionCustomizableCTAType convert(String source) {
                return ProductGroupPromotionCustomizableCTAType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.productGroupSummaryStatusConverter")
    Converter<String, ProductGroupSummaryStatus> productGroupSummaryStatusConverter() {
        return new Converter<String, ProductGroupSummaryStatus>() {
            @Override
            public ProductGroupSummaryStatus convert(String source) {
                return ProductGroupSummaryStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.promotionApplicationLevelConverter")
    Converter<String, PromotionApplicationLevel> promotionApplicationLevelConverter() {
        return new Converter<String, PromotionApplicationLevel>() {
            @Override
            public PromotionApplicationLevel convert(String source) {
                return PromotionApplicationLevel.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.promotionTypeConverter")
    Converter<String, PromotionType> promotionTypeConverter() {
        return new Converter<String, PromotionType>() {
            @Override
            public PromotionType convert(String source) {
                return PromotionType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.publicTargetingTypeConverter")
    Converter<String, PublicTargetingType> publicTargetingTypeConverter() {
        return new Converter<String, PublicTargetingType>() {
            @Override
            public PublicTargetingType convert(String source) {
                return PublicTargetingType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.queryLabelEntityStatusesItemsConverter")
    Converter<String, QueryLabelEntityStatusesItems> queryLabelEntityStatusesItemsConverter() {
        return new Converter<String, QueryLabelEntityStatusesItems>() {
            @Override
            public QueryLabelEntityStatusesItems convert(String source) {
                return QueryLabelEntityStatusesItems.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.queryLabelTypesItemsConverter")
    Converter<String, QueryLabelTypesItems> queryLabelTypesItemsConverter() {
        return new Converter<String, QueryLabelTypesItems>() {
            @Override
            public QueryLabelTypesItems convert(String source) {
                return QueryLabelTypesItems.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.querymetrictypesItemsConverter")
    Converter<String, QuerymetrictypesItems> querymetrictypesItemsConverter() {
        return new Converter<String, QuerymetrictypesItems>() {
            @Override
            public QuerymetrictypesItems convert(String source) {
                return QuerymetrictypesItems.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.querypinanalyticsmetrictypesItemsConverter")
    Converter<String, QuerypinanalyticsmetrictypesItems> querypinanalyticsmetrictypesItemsConverter() {
        return new Converter<String, QuerypinanalyticsmetrictypesItems>() {
            @Override
            public QuerypinanalyticsmetrictypesItems convert(String source) {
                return QuerypinanalyticsmetrictypesItems.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.queryvideopinmetrictypesItemsConverter")
    Converter<String, QueryvideopinmetrictypesItems> queryvideopinmetrictypesItemsConverter() {
        return new Converter<String, QueryvideopinmetrictypesItems>() {
            @Override
            public QueryvideopinmetrictypesItems convert(String source) {
                return QueryvideopinmetrictypesItems.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.reportTypeConverter")
    Converter<String, ReportType> reportTypeConverter() {
        return new Converter<String, ReportType>() {
            @Override
            public ReportType convert(String source) {
                return ReportType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.reportingColumnConverter")
    Converter<String, ReportingColumn> reportingColumnConverter() {
        return new Converter<String, ReportingColumn>() {
            @Override
            public ReportingColumn convert(String source) {
                return ReportingColumn.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.reportingColumnAsyncConverter")
    Converter<String, ReportingColumnAsync> reportingColumnAsyncConverter() {
        return new Converter<String, ReportingColumnAsync>() {
            @Override
            public ReportingColumnAsync convert(String source) {
                return ReportingColumnAsync.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.reportingColumnSyncConverter")
    Converter<String, ReportingColumnSync> reportingColumnSyncConverter() {
        return new Converter<String, ReportingColumnSync>() {
            @Override
            public ReportingColumnSync convert(String source) {
                return ReportingColumnSync.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.reportingTimeZoneConverter")
    Converter<String, ReportingTimeZone> reportingTimeZoneConverter() {
        return new Converter<String, ReportingTimeZone>() {
            @Override
            public ReportingTimeZone convert(String source) {
                return ReportingTimeZone.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.roleConverter")
    Converter<String, Role> roleConverter() {
        return new Converter<String, Role>() {
            @Override
            public Role convert(String source) {
                return Role.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.ssIOOrderLineTypeConverter")
    Converter<String, SSIOOrderLineType> ssIOOrderLineTypeConverter() {
        return new Converter<String, SSIOOrderLineType>() {
            @Override
            public SSIOOrderLineType convert(String source) {
                return SSIOOrderLineType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.scheduleActionConverter")
    Converter<String, ScheduleAction> scheduleActionConverter() {
        return new Converter<String, ScheduleAction>() {
            @Override
            public ScheduleAction convert(String source) {
                return ScheduleAction.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.scheduleStatusConverter")
    Converter<String, ScheduleStatus> scheduleStatusConverter() {
        return new Converter<String, ScheduleStatus>() {
            @Override
            public ScheduleStatus convert(String source) {
                return ScheduleStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.scheduleTypeConverter")
    Converter<String, ScheduleType> scheduleTypeConverter() {
        return new Converter<String, ScheduleType>() {
            @Override
            public ScheduleType convert(String source) {
                return ScheduleType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.sourcePlatformOptionsConverter")
    Converter<String, SourcePlatformOptions> sourcePlatformOptionsConverter() {
        return new Converter<String, SourcePlatformOptions>() {
            @Override
            public SourcePlatformOptions convert(String source) {
                return SourcePlatformOptions.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.standardPinMetricTypesConverter")
    Converter<String, StandardPinMetricTypes> standardPinMetricTypesConverter() {
        return new Converter<String, StandardPinMetricTypes>() {
            @Override
            public StandardPinMetricTypes convert(String source) {
                return StandardPinMetricTypes.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.summaryStatusConverter")
    Converter<String, SummaryStatus> summaryStatusConverter() {
        return new Converter<String, SummaryStatus>() {
            @Override
            public SummaryStatus convert(String source) {
                return SummaryStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.supplementalItemBatchOperationStatusConverter")
    Converter<String, SupplementalItemBatchOperationStatus> supplementalItemBatchOperationStatusConverter() {
        return new Converter<String, SupplementalItemBatchOperationStatus>() {
            @Override
            public SupplementalItemBatchOperationStatus convert(String source) {
                return SupplementalItemBatchOperationStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.supplementalItemProcessingStatusConverter")
    Converter<String, SupplementalItemProcessingStatus> supplementalItemProcessingStatusConverter() {
        return new Converter<String, SupplementalItemProcessingStatus>() {
            @Override
            public SupplementalItemProcessingStatus convert(String source) {
                return SupplementalItemProcessingStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.targetingAdvertiserCountryConverter")
    Converter<String, TargetingAdvertiserCountry> targetingAdvertiserCountryConverter() {
        return new Converter<String, TargetingAdvertiserCountry>() {
            @Override
            public TargetingAdvertiserCountry convert(String source) {
                return TargetingAdvertiserCountry.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.targetingSpecAgeBucketConverter")
    Converter<String, TargetingSpecAgeBucket> targetingSpecAgeBucketConverter() {
        return new Converter<String, TargetingSpecAgeBucket>() {
            @Override
            public TargetingSpecAgeBucket convert(String source) {
                return TargetingSpecAgeBucket.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.targetingSpecAppTypeConverter")
    Converter<String, TargetingSpecAppType> targetingSpecAppTypeConverter() {
        return new Converter<String, TargetingSpecAppType>() {
            @Override
            public TargetingSpecAppType convert(String source) {
                return TargetingSpecAppType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.targetingSpecGenderConverter")
    Converter<String, TargetingSpecGender> targetingSpecGenderConverter() {
        return new Converter<String, TargetingSpecGender>() {
            @Override
            public TargetingSpecGender convert(String source) {
                return TargetingSpecGender.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.targetingSpecListOperationConverter")
    Converter<String, TargetingSpecListOperation> targetingSpecListOperationConverter() {
        return new Converter<String, TargetingSpecListOperation>() {
            @Override
            public TargetingSpecListOperation convert(String source) {
                return TargetingSpecListOperation.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.targetingSpecTargetingStrategyItemsConverter")
    Converter<String, TargetingSpecTargetingStrategyItems> targetingSpecTargetingStrategyItemsConverter() {
        return new Converter<String, TargetingSpecTargetingStrategyItems>() {
            @Override
            public TargetingSpecTargetingStrategyItems convert(String source) {
                return TargetingSpecTargetingStrategyItems.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.targetingStrategyConverter")
    Converter<String, TargetingStrategy> targetingStrategyConverter() {
        return new Converter<String, TargetingStrategy>() {
            @Override
            public TargetingStrategy convert(String source) {
                return TargetingStrategy.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.targetingTemplateStatusConverter")
    Converter<String, TargetingTemplateStatus> targetingTemplateStatusConverter() {
        return new Converter<String, TargetingTemplateStatus>() {
            @Override
            public TargetingTemplateStatus convert(String source) {
                return TargetingTemplateStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.tieBreakerTypeConverter")
    Converter<String, TieBreakerType> tieBreakerTypeConverter() {
        return new Converter<String, TieBreakerType>() {
            @Override
            public TieBreakerType convert(String source) {
                return TieBreakerType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.tokenGrantTypeConverter")
    Converter<String, TokenGrantType> tokenGrantTypeConverter() {
        return new Converter<String, TokenGrantType>() {
            @Override
            public TokenGrantType convert(String source) {
                return TokenGrantType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.tokenTypeHintConverter")
    Converter<String, TokenTypeHint> tokenTypeHintConverter() {
        return new Converter<String, TokenTypeHint>() {
            @Override
            public TokenTypeHint convert(String source) {
                return TokenTypeHint.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.topPinsSortByConverter")
    Converter<String, TopPinsSortBy> topPinsSortByConverter() {
        return new Converter<String, TopPinsSortBy>() {
            @Override
            public TopPinsSortBy convert(String source) {
                return TopPinsSortBy.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.topVideoPinsSortByConverter")
    Converter<String, TopVideoPinsSortBy> topVideoPinsSortByConverter() {
        return new Converter<String, TopVideoPinsSortBy>() {
            @Override
            public TopVideoPinsSortBy convert(String source) {
                return TopVideoPinsSortBy.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.trendTypeConverter")
    Converter<String, TrendType> trendTypeConverter() {
        return new Converter<String, TrendType>() {
            @Override
            public TrendType convert(String source) {
                return TrendType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.trendsAgeBucketConverter")
    Converter<String, TrendsAgeBucket> trendsAgeBucketConverter() {
        return new Converter<String, TrendsAgeBucket>() {
            @Override
            public TrendsAgeBucket convert(String source) {
                return TrendsAgeBucket.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.trendsGenderConverter")
    Converter<String, TrendsGender> trendsGenderConverter() {
        return new Converter<String, TrendsGender>() {
            @Override
            public TrendsGender convert(String source) {
                return TrendsGender.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.trendsGenderFilterConverter")
    Converter<String, TrendsGenderFilter> trendsGenderFilterConverter() {
        return new Converter<String, TrendsGenderFilter>() {
            @Override
            public TrendsGenderFilter convert(String source) {
                return TrendsGenderFilter.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.trendsL1InterestConverter")
    Converter<String, TrendsL1Interest> trendsL1InterestConverter() {
        return new Converter<String, TrendsL1Interest>() {
            @Override
            public TrendsL1Interest convert(String source) {
                return TrendsL1Interest.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.trendsSupportedRegionConverter")
    Converter<String, TrendsSupportedRegion> trendsSupportedRegionConverter() {
        return new Converter<String, TrendsSupportedRegion>() {
            @Override
            public TrendsSupportedRegion convert(String source) {
                return TrendsSupportedRegion.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.updateMaskBidOptionFieldConverter")
    Converter<String, UpdateMaskBidOptionField> updateMaskBidOptionFieldConverter() {
        return new Converter<String, UpdateMaskBidOptionField>() {
            @Override
            public UpdateMaskBidOptionField convert(String source) {
                return UpdateMaskBidOptionField.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.updateMaskFieldTypeConverter")
    Converter<String, UpdateMaskFieldType> updateMaskFieldTypeConverter() {
        return new Converter<String, UpdateMaskFieldType>() {
            @Override
            public UpdateMaskFieldType convert(String source) {
                return UpdateMaskFieldType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.userAccountTypeConverter")
    Converter<String, UserAccountType> userAccountTypeConverter() {
        return new Converter<String, UserAccountType>() {
            @Override
            public UserAccountType convert(String source) {
                return UserAccountType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.userFollowingFeedTypeConverter")
    Converter<String, UserFollowingFeedType> userFollowingFeedTypeConverter() {
        return new Converter<String, UserFollowingFeedType>() {
            @Override
            public UserFollowingFeedType convert(String source) {
                return UserFollowingFeedType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.userListOperationTypeConverter")
    Converter<String, UserListOperationType> userListOperationTypeConverter() {
        return new Converter<String, UserListOperationType>() {
            @Override
            public UserListOperationType convert(String source) {
                return UserListOperationType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.userListTypeConverter")
    Converter<String, UserListType> userListTypeConverter() {
        return new Converter<String, UserListType>() {
            @Override
            public UserListType convert(String source) {
                return UserListType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.verticalProductCategoryConverter")
    Converter<String, VerticalProductCategory> verticalProductCategoryConverter() {
        return new Converter<String, VerticalProductCategory>() {
            @Override
            public VerticalProductCategory convert(String source) {
                return VerticalProductCategory.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.videoPinMetricTypesConverter")
    Converter<String, VideoPinMetricTypes> videoPinMetricTypesConverter() {
        return new Converter<String, VideoPinMetricTypes>() {
            @Override
            public VideoPinMetricTypes convert(String source) {
                return VideoPinMetricTypes.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.websiteVerificationMethodConverter")
    Converter<String, WebsiteVerificationMethod> websiteVerificationMethodConverter() {
        return new Converter<String, WebsiteVerificationMethod>() {
            @Override
            public WebsiteVerificationMethod convert(String source) {
                return WebsiteVerificationMethod.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.workloadStateConverter")
    Converter<String, WorkloadState> workloadStateConverter() {
        return new Converter<String, WorkloadState>() {
            @Override
            public WorkloadState convert(String source) {
                return WorkloadState.fromValue(source);
            }
        };
    }

}
