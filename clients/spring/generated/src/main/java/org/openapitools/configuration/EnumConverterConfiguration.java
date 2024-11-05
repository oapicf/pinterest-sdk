package org.openapitools.configuration;

import org.openapitools.model.ActionType;
import org.openapitools.model.AdCountry;
import org.openapitools.model.AdGroupSummaryStatus;
import org.openapitools.model.AdsAnalyticsAdTargetingType;
import org.openapitools.model.AdsAnalyticsCampaignTargetingType;
import org.openapitools.model.AdsAnalyticsFilterColumn;
import org.openapitools.model.AdsAnalyticsFilterOperator;
import org.openapitools.model.AdsAnalyticsTargetingType;
import org.openapitools.model.AdvancedAuctionOperation;
import org.openapitools.model.AssetGroupType;
import org.openapitools.model.AudienceAccountType;
import org.openapitools.model.AudienceDataParty;
import org.openapitools.model.AudienceInsightType;
import org.openapitools.model.AudienceShareType;
import org.openapitools.model.AudienceSharingType;
import org.openapitools.model.AudienceType;
import org.openapitools.model.AudienceUpdateOperationType;
import org.openapitools.model.BatchOperation;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.BudgetType;
import org.openapitools.model.BulkEntityType;
import org.openapitools.model.BulkOutputFormat;
import org.openapitools.model.BulkReportingJobStatus;
import org.openapitools.model.BulkUpsertStatus;
import org.openapitools.model.BusinessAccessRole;
import org.openapitools.model.BusinessRole;
import org.openapitools.model.BusinessRoleCheckMode;
import org.openapitools.model.BusinessRoleForMembers;
import org.openapitools.model.CampaignSummaryStatus;
import org.openapitools.model.CatalogsFeedProcessingStatus;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsItemValidationIssue;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupStatus;
import org.openapitools.model.CatalogsProductGroupType;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.ConversionTagType;
import org.openapitools.model.Country;
import org.openapitools.model.CreativeAssetsVisibilityType;
import org.openapitools.model.CreativeType;
import org.openapitools.model.Currency;
import org.openapitools.model.DataOutputFormat;
import org.openapitools.model.DataStatus;
import org.openapitools.model.EnhancedMatchStatusType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.Gender;
import org.openapitools.model.GetAudiencesOrderBy;
import org.openapitools.model.GetBusinessAssetTypeResponse;
import org.openapitools.model.Granularity;
import org.openapitools.model.GridClickType;
import org.openapitools.model.InviteStatus;
import org.openapitools.model.InviteType;
import org.openapitools.model.ItemProcessingStatus;
import org.openapitools.model.Language;
import org.openapitools.model.LeadFormQuestionFieldType;
import org.openapitools.model.LeadFormQuestionType;
import org.openapitools.model.LeadFormStatus;
import org.openapitools.model.LeadsExportStatus;
import org.openapitools.model.MMMReportingColumn;
import org.openapitools.model.MMMReportingTargetingType;
import org.openapitools.model.MatchType;
import org.openapitools.model.MatchTypeResponse;
import org.openapitools.model.MediaType;
import org.openapitools.model.MediaUploadStatus;
import org.openapitools.model.MediaUploadType;
import org.openapitools.model.MemberBusinessRole;
import org.openapitools.model.MetricsReportingLevel;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.NonNullableProductAvailabilityType;
import org.openapitools.model.NullableCatalogsItemFieldType;
import org.openapitools.model.NullableCurrency;
import org.openapitools.model.ObjectiveType;
import org.openapitools.model.OperationType;
import org.openapitools.model.OrderLinePaidType;
import org.openapitools.model.OrderLineStatus;
import org.openapitools.model.PacingDeliveryType;
import org.openapitools.model.PartnerType;
import org.openapitools.model.Permissions;
import org.openapitools.model.PermissionsWithOwner;
import org.openapitools.model.PinPromotionSummaryStatus;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.ProductAvailabilityType;
import org.openapitools.model.ProductGroupSummaryStatus;
import org.openapitools.model.ReportingColumnAsync;
import org.openapitools.model.Role;
import org.openapitools.model.TargetingAdvertiserCountry;
import org.openapitools.model.TargetingSpecAppType;
import org.openapitools.model.TrendType;
import org.openapitools.model.TrendsSupportedRegion;
import org.openapitools.model.UpdateMaskBidOptionField;
import org.openapitools.model.UpdateMaskFieldType;
import org.openapitools.model.UserFollowingFeedType;
import org.openapitools.model.UserListOperationType;
import org.openapitools.model.UserListType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adCountryConverter")
    Converter<String, AdCountry> adCountryConverter() {
        return new Converter<String, AdCountry>() {
            @Override
            public AdCountry convert(String source) {
                return AdCountry.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.adsAnalyticsTargetingTypeConverter")
    Converter<String, AdsAnalyticsTargetingType> adsAnalyticsTargetingTypeConverter() {
        return new Converter<String, AdsAnalyticsTargetingType>() {
            @Override
            public AdsAnalyticsTargetingType convert(String source) {
                return AdsAnalyticsTargetingType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.advancedAuctionOperationConverter")
    Converter<String, AdvancedAuctionOperation> advancedAuctionOperationConverter() {
        return new Converter<String, AdvancedAuctionOperation>() {
            @Override
            public AdvancedAuctionOperation convert(String source) {
                return AdvancedAuctionOperation.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.audienceAccountTypeConverter")
    Converter<String, AudienceAccountType> audienceAccountTypeConverter() {
        return new Converter<String, AudienceAccountType>() {
            @Override
            public AudienceAccountType convert(String source) {
                return AudienceAccountType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.audienceDataPartyConverter")
    Converter<String, AudienceDataParty> audienceDataPartyConverter() {
        return new Converter<String, AudienceDataParty>() {
            @Override
            public AudienceDataParty convert(String source) {
                return AudienceDataParty.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.audienceShareTypeConverter")
    Converter<String, AudienceShareType> audienceShareTypeConverter() {
        return new Converter<String, AudienceShareType>() {
            @Override
            public AudienceShareType convert(String source) {
                return AudienceShareType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.audienceSharingTypeConverter")
    Converter<String, AudienceSharingType> audienceSharingTypeConverter() {
        return new Converter<String, AudienceSharingType>() {
            @Override
            public AudienceSharingType convert(String source) {
                return AudienceSharingType.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.batchOperationConverter")
    Converter<String, BatchOperation> batchOperationConverter() {
        return new Converter<String, BatchOperation>() {
            @Override
            public BatchOperation convert(String source) {
                return BatchOperation.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.bulkUpsertStatusConverter")
    Converter<String, BulkUpsertStatus> bulkUpsertStatusConverter() {
        return new Converter<String, BulkUpsertStatus>() {
            @Override
            public BulkUpsertStatus convert(String source) {
                return BulkUpsertStatus.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.businessRoleConverter")
    Converter<String, BusinessRole> businessRoleConverter() {
        return new Converter<String, BusinessRole>() {
            @Override
            public BusinessRole convert(String source) {
                return BusinessRole.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.businessRoleCheckModeConverter")
    Converter<String, BusinessRoleCheckMode> businessRoleCheckModeConverter() {
        return new Converter<String, BusinessRoleCheckMode>() {
            @Override
            public BusinessRoleCheckMode convert(String source) {
                return BusinessRoleCheckMode.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.campaignSummaryStatusConverter")
    Converter<String, CampaignSummaryStatus> campaignSummaryStatusConverter() {
        return new Converter<String, CampaignSummaryStatus>() {
            @Override
            public CampaignSummaryStatus convert(String source) {
                return CampaignSummaryStatus.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.conversionAttributionWindowDaysConverter")
    Converter<Integer, ConversionAttributionWindowDays> conversionAttributionWindowDaysConverter() {
        return new Converter<Integer, ConversionAttributionWindowDays>() {
            @Override
            public ConversionAttributionWindowDays convert(Integer source) {
                return ConversionAttributionWindowDays.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.countryConverter")
    Converter<String, Country> countryConverter() {
        return new Converter<String, Country>() {
            @Override
            public Country convert(String source) {
                return Country.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.enhancedMatchStatusTypeConverter")
    Converter<String, EnhancedMatchStatusType> enhancedMatchStatusTypeConverter() {
        return new Converter<String, EnhancedMatchStatusType>() {
            @Override
            public EnhancedMatchStatusType convert(String source) {
                return EnhancedMatchStatusType.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.genderConverter")
    Converter<String, Gender> genderConverter() {
        return new Converter<String, Gender>() {
            @Override
            public Gender convert(String source) {
                return Gender.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.getAudiencesOrderByConverter")
    Converter<String, GetAudiencesOrderBy> getAudiencesOrderByConverter() {
        return new Converter<String, GetAudiencesOrderBy>() {
            @Override
            public GetAudiencesOrderBy convert(String source) {
                return GetAudiencesOrderBy.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.getBusinessAssetTypeResponseConverter")
    Converter<String, GetBusinessAssetTypeResponse> getBusinessAssetTypeResponseConverter() {
        return new Converter<String, GetBusinessAssetTypeResponse>() {
            @Override
            public GetBusinessAssetTypeResponse convert(String source) {
                return GetBusinessAssetTypeResponse.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.itemProcessingStatusConverter")
    Converter<String, ItemProcessingStatus> itemProcessingStatusConverter() {
        return new Converter<String, ItemProcessingStatus>() {
            @Override
            public ItemProcessingStatus convert(String source) {
                return ItemProcessingStatus.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.nonNullableCatalogsCurrencyConverter")
    Converter<String, NonNullableCatalogsCurrency> nonNullableCatalogsCurrencyConverter() {
        return new Converter<String, NonNullableCatalogsCurrency>() {
            @Override
            public NonNullableCatalogsCurrency convert(String source) {
                return NonNullableCatalogsCurrency.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.nonNullableProductAvailabilityTypeConverter")
    Converter<String, NonNullableProductAvailabilityType> nonNullableProductAvailabilityTypeConverter() {
        return new Converter<String, NonNullableProductAvailabilityType>() {
            @Override
            public NonNullableProductAvailabilityType convert(String source) {
                return NonNullableProductAvailabilityType.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.pinPromotionSummaryStatusConverter")
    Converter<String, PinPromotionSummaryStatus> pinPromotionSummaryStatusConverter() {
        return new Converter<String, PinPromotionSummaryStatus>() {
            @Override
            public PinPromotionSummaryStatus convert(String source) {
                return PinPromotionSummaryStatus.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.productAvailabilityTypeConverter")
    Converter<String, ProductAvailabilityType> productAvailabilityTypeConverter() {
        return new Converter<String, ProductAvailabilityType>() {
            @Override
            public ProductAvailabilityType convert(String source) {
                return ProductAvailabilityType.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.reportingColumnAsyncConverter")
    Converter<String, ReportingColumnAsync> reportingColumnAsyncConverter() {
        return new Converter<String, ReportingColumnAsync>() {
            @Override
            public ReportingColumnAsync convert(String source) {
                return ReportingColumnAsync.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.targetingAdvertiserCountryConverter")
    Converter<String, TargetingAdvertiserCountry> targetingAdvertiserCountryConverter() {
        return new Converter<String, TargetingAdvertiserCountry>() {
            @Override
            public TargetingAdvertiserCountry convert(String source) {
                return TargetingAdvertiserCountry.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.trendTypeConverter")
    Converter<String, TrendType> trendTypeConverter() {
        return new Converter<String, TrendType>() {
            @Override
            public TrendType convert(String source) {
                return TrendType.fromValue(source);
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

}
