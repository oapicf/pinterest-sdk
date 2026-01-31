package org.openapitools.configuration

import org.openapitools.model.ActionType
import org.openapitools.model.AdCountry
import org.openapitools.model.AdGroupSummaryStatus
import org.openapitools.model.AdsAnalyticsAdTargetingType
import org.openapitools.model.AdsAnalyticsCampaignTargetingType
import org.openapitools.model.AdsAnalyticsFilterColumn
import org.openapitools.model.AdsAnalyticsFilterOperator
import org.openapitools.model.AdsAnalyticsTargetingType
import org.openapitools.model.AdvancedAuctionOperation
import org.openapitools.model.AssetGroupType
import org.openapitools.model.AudienceAccountType
import org.openapitools.model.AudienceDataParty
import org.openapitools.model.AudienceInsightType
import org.openapitools.model.AudienceShareType
import org.openapitools.model.AudienceSharingType
import org.openapitools.model.AudienceType
import org.openapitools.model.AudienceUpdateOperationType
import org.openapitools.model.BatchOperation
import org.openapitools.model.BatchOperationStatus
import org.openapitools.model.BudgetType
import org.openapitools.model.BulkEntityType
import org.openapitools.model.BulkOutputFormat
import org.openapitools.model.BulkReportingJobStatus
import org.openapitools.model.BulkUpsertStatus
import org.openapitools.model.BusinessAccessRole
import org.openapitools.model.BusinessRole
import org.openapitools.model.BusinessRoleCheckMode
import org.openapitools.model.BusinessRoleForMembers
import org.openapitools.model.CampaignSummaryStatus
import org.openapitools.model.CatalogsFeedProcessingStatus
import org.openapitools.model.CatalogsFormat
import org.openapitools.model.CatalogsItemValidationIssue
import org.openapitools.model.CatalogsLocale
import org.openapitools.model.CatalogsProductGroupStatus
import org.openapitools.model.CatalogsProductGroupType
import org.openapitools.model.CatalogsStatus
import org.openapitools.model.CatalogsType
import org.openapitools.model.ConversionAttributionWindowDays
import org.openapitools.model.ConversionReportAttributionType
import org.openapitools.model.ConversionReportTimeType
import org.openapitools.model.ConversionTagType
import org.openapitools.model.Country
import org.openapitools.model.CreativeAssetsVisibilityType
import org.openapitools.model.CreativeType
import org.openapitools.model.Currency
import org.openapitools.model.DataOutputFormat
import org.openapitools.model.DataStatus
import org.openapitools.model.EnhancedMatchStatusType
import org.openapitools.model.EntityStatus
import org.openapitools.model.Gender
import org.openapitools.model.GetAudiencesOrderBy
import org.openapitools.model.GetBusinessAssetTypeResponse
import org.openapitools.model.Granularity
import org.openapitools.model.GridClickType
import org.openapitools.model.InviteStatus
import org.openapitools.model.InviteType
import org.openapitools.model.ItemProcessingStatus
import org.openapitools.model.Language
import org.openapitools.model.LeadFormQuestionFieldType
import org.openapitools.model.LeadFormQuestionType
import org.openapitools.model.LeadFormStatus
import org.openapitools.model.LeadsExportStatus
import org.openapitools.model.MMMReportingColumn
import org.openapitools.model.MMMReportingTargetingType
import org.openapitools.model.MatchType
import org.openapitools.model.MatchTypeResponse
import org.openapitools.model.MediaType
import org.openapitools.model.MediaUploadStatus
import org.openapitools.model.MediaUploadType
import org.openapitools.model.MemberBusinessRole
import org.openapitools.model.MetricsReportingLevel
import org.openapitools.model.NonNullableCatalogsCurrency
import org.openapitools.model.NonNullableProductAvailabilityType
import org.openapitools.model.NullableCatalogsItemFieldType
import org.openapitools.model.NullableCurrency
import org.openapitools.model.ObjectiveType
import org.openapitools.model.OperationType
import org.openapitools.model.OrderLinePaidType
import org.openapitools.model.OrderLineStatus
import org.openapitools.model.PacingDeliveryType
import org.openapitools.model.PartnerType
import org.openapitools.model.Permissions
import org.openapitools.model.PermissionsWithOwner
import org.openapitools.model.PinPromotionSummaryStatus
import org.openapitools.model.PlacementGroupType
import org.openapitools.model.ProductAvailabilityType
import org.openapitools.model.ProductGroupSummaryStatus
import org.openapitools.model.ReportingColumnAsync
import org.openapitools.model.Role
import org.openapitools.model.TargetingAdvertiserCountry
import org.openapitools.model.TargetingSpecAppType
import org.openapitools.model.TrendType
import org.openapitools.model.TrendsSupportedRegion
import org.openapitools.model.UpdateMaskBidOptionField
import org.openapitools.model.UpdateMaskFieldType
import org.openapitools.model.UserFollowingFeedType
import org.openapitools.model.UserListOperationType
import org.openapitools.model.UserListType

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
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adCountryConverter"])
    fun adCountryConverter(): Converter<kotlin.String, AdCountry> {
        return object: Converter<kotlin.String, AdCountry> {
            override fun convert(source: kotlin.String): AdCountry = AdCountry.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adGroupSummaryStatusConverter"])
    fun adGroupSummaryStatusConverter(): Converter<kotlin.String, AdGroupSummaryStatus> {
        return object: Converter<kotlin.String, AdGroupSummaryStatus> {
            override fun convert(source: kotlin.String): AdGroupSummaryStatus = AdGroupSummaryStatus.forValue(source)
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
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.adsAnalyticsTargetingTypeConverter"])
    fun adsAnalyticsTargetingTypeConverter(): Converter<kotlin.String, AdsAnalyticsTargetingType> {
        return object: Converter<kotlin.String, AdsAnalyticsTargetingType> {
            override fun convert(source: kotlin.String): AdsAnalyticsTargetingType = AdsAnalyticsTargetingType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.advancedAuctionOperationConverter"])
    fun advancedAuctionOperationConverter(): Converter<kotlin.String, AdvancedAuctionOperation> {
        return object: Converter<kotlin.String, AdvancedAuctionOperation> {
            override fun convert(source: kotlin.String): AdvancedAuctionOperation = AdvancedAuctionOperation.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.assetGroupTypeConverter"])
    fun assetGroupTypeConverter(): Converter<kotlin.String, AssetGroupType> {
        return object: Converter<kotlin.String, AssetGroupType> {
            override fun convert(source: kotlin.String): AssetGroupType = AssetGroupType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.audienceAccountTypeConverter"])
    fun audienceAccountTypeConverter(): Converter<kotlin.String, AudienceAccountType> {
        return object: Converter<kotlin.String, AudienceAccountType> {
            override fun convert(source: kotlin.String): AudienceAccountType = AudienceAccountType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.audienceDataPartyConverter"])
    fun audienceDataPartyConverter(): Converter<kotlin.String, AudienceDataParty> {
        return object: Converter<kotlin.String, AudienceDataParty> {
            override fun convert(source: kotlin.String): AudienceDataParty = AudienceDataParty.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.audienceInsightTypeConverter"])
    fun audienceInsightTypeConverter(): Converter<kotlin.String, AudienceInsightType> {
        return object: Converter<kotlin.String, AudienceInsightType> {
            override fun convert(source: kotlin.String): AudienceInsightType = AudienceInsightType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.audienceShareTypeConverter"])
    fun audienceShareTypeConverter(): Converter<kotlin.String, AudienceShareType> {
        return object: Converter<kotlin.String, AudienceShareType> {
            override fun convert(source: kotlin.String): AudienceShareType = AudienceShareType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.audienceSharingTypeConverter"])
    fun audienceSharingTypeConverter(): Converter<kotlin.String, AudienceSharingType> {
        return object: Converter<kotlin.String, AudienceSharingType> {
            override fun convert(source: kotlin.String): AudienceSharingType = AudienceSharingType.forValue(source)
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
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.batchOperationConverter"])
    fun batchOperationConverter(): Converter<kotlin.String, BatchOperation> {
        return object: Converter<kotlin.String, BatchOperation> {
            override fun convert(source: kotlin.String): BatchOperation = BatchOperation.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.batchOperationStatusConverter"])
    fun batchOperationStatusConverter(): Converter<kotlin.String, BatchOperationStatus> {
        return object: Converter<kotlin.String, BatchOperationStatus> {
            override fun convert(source: kotlin.String): BatchOperationStatus = BatchOperationStatus.forValue(source)
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
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.bulkUpsertStatusConverter"])
    fun bulkUpsertStatusConverter(): Converter<kotlin.String, BulkUpsertStatus> {
        return object: Converter<kotlin.String, BulkUpsertStatus> {
            override fun convert(source: kotlin.String): BulkUpsertStatus = BulkUpsertStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.businessAccessRoleConverter"])
    fun businessAccessRoleConverter(): Converter<kotlin.String, BusinessAccessRole> {
        return object: Converter<kotlin.String, BusinessAccessRole> {
            override fun convert(source: kotlin.String): BusinessAccessRole = BusinessAccessRole.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.businessRoleConverter"])
    fun businessRoleConverter(): Converter<kotlin.String, BusinessRole> {
        return object: Converter<kotlin.String, BusinessRole> {
            override fun convert(source: kotlin.String): BusinessRole = BusinessRole.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.businessRoleCheckModeConverter"])
    fun businessRoleCheckModeConverter(): Converter<kotlin.String, BusinessRoleCheckMode> {
        return object: Converter<kotlin.String, BusinessRoleCheckMode> {
            override fun convert(source: kotlin.String): BusinessRoleCheckMode = BusinessRoleCheckMode.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.businessRoleForMembersConverter"])
    fun businessRoleForMembersConverter(): Converter<kotlin.String, BusinessRoleForMembers> {
        return object: Converter<kotlin.String, BusinessRoleForMembers> {
            override fun convert(source: kotlin.String): BusinessRoleForMembers = BusinessRoleForMembers.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.campaignSummaryStatusConverter"])
    fun campaignSummaryStatusConverter(): Converter<kotlin.String, CampaignSummaryStatus> {
        return object: Converter<kotlin.String, CampaignSummaryStatus> {
            override fun convert(source: kotlin.String): CampaignSummaryStatus = CampaignSummaryStatus.forValue(source)
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
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.conversionAttributionWindowDaysConverter"])
    fun conversionAttributionWindowDaysConverter(): Converter<kotlin.Int, ConversionAttributionWindowDays> {
        return object: Converter<kotlin.Int, ConversionAttributionWindowDays> {
            override fun convert(source: kotlin.Int): ConversionAttributionWindowDays = ConversionAttributionWindowDays.forValue(source)
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
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.countryConverter"])
    fun countryConverter(): Converter<kotlin.String, Country> {
        return object: Converter<kotlin.String, Country> {
            override fun convert(source: kotlin.String): Country = Country.forValue(source)
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
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.enhancedMatchStatusTypeConverter"])
    fun enhancedMatchStatusTypeConverter(): Converter<kotlin.String, EnhancedMatchStatusType> {
        return object: Converter<kotlin.String, EnhancedMatchStatusType> {
            override fun convert(source: kotlin.String): EnhancedMatchStatusType = EnhancedMatchStatusType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.entityStatusConverter"])
    fun entityStatusConverter(): Converter<kotlin.String, EntityStatus> {
        return object: Converter<kotlin.String, EntityStatus> {
            override fun convert(source: kotlin.String): EntityStatus = EntityStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.genderConverter"])
    fun genderConverter(): Converter<kotlin.String, Gender> {
        return object: Converter<kotlin.String, Gender> {
            override fun convert(source: kotlin.String): Gender = Gender.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.getAudiencesOrderByConverter"])
    fun getAudiencesOrderByConverter(): Converter<kotlin.String, GetAudiencesOrderBy> {
        return object: Converter<kotlin.String, GetAudiencesOrderBy> {
            override fun convert(source: kotlin.String): GetAudiencesOrderBy = GetAudiencesOrderBy.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.getBusinessAssetTypeResponseConverter"])
    fun getBusinessAssetTypeResponseConverter(): Converter<kotlin.String, GetBusinessAssetTypeResponse> {
        return object: Converter<kotlin.String, GetBusinessAssetTypeResponse> {
            override fun convert(source: kotlin.String): GetBusinessAssetTypeResponse = GetBusinessAssetTypeResponse.forValue(source)
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
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.itemProcessingStatusConverter"])
    fun itemProcessingStatusConverter(): Converter<kotlin.String, ItemProcessingStatus> {
        return object: Converter<kotlin.String, ItemProcessingStatus> {
            override fun convert(source: kotlin.String): ItemProcessingStatus = ItemProcessingStatus.forValue(source)
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
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.nonNullableCatalogsCurrencyConverter"])
    fun nonNullableCatalogsCurrencyConverter(): Converter<kotlin.String, NonNullableCatalogsCurrency> {
        return object: Converter<kotlin.String, NonNullableCatalogsCurrency> {
            override fun convert(source: kotlin.String): NonNullableCatalogsCurrency = NonNullableCatalogsCurrency.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.nonNullableProductAvailabilityTypeConverter"])
    fun nonNullableProductAvailabilityTypeConverter(): Converter<kotlin.String, NonNullableProductAvailabilityType> {
        return object: Converter<kotlin.String, NonNullableProductAvailabilityType> {
            override fun convert(source: kotlin.String): NonNullableProductAvailabilityType = NonNullableProductAvailabilityType.forValue(source)
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
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.pinPromotionSummaryStatusConverter"])
    fun pinPromotionSummaryStatusConverter(): Converter<kotlin.String, PinPromotionSummaryStatus> {
        return object: Converter<kotlin.String, PinPromotionSummaryStatus> {
            override fun convert(source: kotlin.String): PinPromotionSummaryStatus = PinPromotionSummaryStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.placementGroupTypeConverter"])
    fun placementGroupTypeConverter(): Converter<kotlin.String, PlacementGroupType> {
        return object: Converter<kotlin.String, PlacementGroupType> {
            override fun convert(source: kotlin.String): PlacementGroupType = PlacementGroupType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.productAvailabilityTypeConverter"])
    fun productAvailabilityTypeConverter(): Converter<kotlin.String, ProductAvailabilityType> {
        return object: Converter<kotlin.String, ProductAvailabilityType> {
            override fun convert(source: kotlin.String): ProductAvailabilityType = ProductAvailabilityType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.productGroupSummaryStatusConverter"])
    fun productGroupSummaryStatusConverter(): Converter<kotlin.String, ProductGroupSummaryStatus> {
        return object: Converter<kotlin.String, ProductGroupSummaryStatus> {
            override fun convert(source: kotlin.String): ProductGroupSummaryStatus = ProductGroupSummaryStatus.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.reportingColumnAsyncConverter"])
    fun reportingColumnAsyncConverter(): Converter<kotlin.String, ReportingColumnAsync> {
        return object: Converter<kotlin.String, ReportingColumnAsync> {
            override fun convert(source: kotlin.String): ReportingColumnAsync = ReportingColumnAsync.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.roleConverter"])
    fun roleConverter(): Converter<kotlin.String, Role> {
        return object: Converter<kotlin.String, Role> {
            override fun convert(source: kotlin.String): Role = Role.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.targetingAdvertiserCountryConverter"])
    fun targetingAdvertiserCountryConverter(): Converter<kotlin.String, TargetingAdvertiserCountry> {
        return object: Converter<kotlin.String, TargetingAdvertiserCountry> {
            override fun convert(source: kotlin.String): TargetingAdvertiserCountry = TargetingAdvertiserCountry.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.targetingSpecAppTypeConverter"])
    fun targetingSpecAppTypeConverter(): Converter<kotlin.String, TargetingSpecAppType> {
        return object: Converter<kotlin.String, TargetingSpecAppType> {
            override fun convert(source: kotlin.String): TargetingSpecAppType = TargetingSpecAppType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.trendTypeConverter"])
    fun trendTypeConverter(): Converter<kotlin.String, TrendType> {
        return object: Converter<kotlin.String, TrendType> {
            override fun convert(source: kotlin.String): TrendType = TrendType.forValue(source)
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

}
