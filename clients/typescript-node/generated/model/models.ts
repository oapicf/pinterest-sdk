import localVarRequest from 'request';

export * from './account';
export * from './actionType';
export * from './adAccount';
export * from './adAccountOwner';
export * from './adGroupResponse';
export * from './adGroupResponseAllOf';
export * from './adGroupResponseAllOf1';
export * from './adGroupSummaryStatus';
export * from './adResponse';
export * from './adResponseAllOf';
export * from './adResponseAllOf1';
export * from './adsAnalyticsCreateAsyncRequest';
export * from './adsAnalyticsCreateAsyncRequestAllOf';
export * from './adsAnalyticsCreateAsyncRequestAllOf1';
export * from './adsAnalyticsCreateAsyncResponse';
export * from './adsAnalyticsFilterColumn';
export * from './adsAnalyticsFilterOperator';
export * from './adsAnalyticsGetAsyncResponse';
export * from './adsAnalyticsMetricsFilter';
export * from './adsAnalyticsTargetingType';
export * from './analyticsMetricsResponse';
export * from './analyticsMetricsResponseDailyMetrics';
export * from './availabilityFilter';
export * from './batchOperation';
export * from './batchOperationStatus';
export * from './board';
export * from './boardOwner';
export * from './boardSection';
export * from './boardUpdate';
export * from './brandFilter';
export * from './campaignCommon';
export * from './campaignResponse';
export * from './campaignResponseAllOf';
export * from './campaignResponseAllOf1';
export * from './campaignSummaryStatus';
export * from './catalogsDbItem';
export * from './catalogsFeed';
export * from './catalogsFeedCredentials';
export * from './catalogsFeedIngestionDetails';
export * from './catalogsFeedIngestionErrors';
export * from './catalogsFeedIngestionInfo';
export * from './catalogsFeedProcessingResult';
export * from './catalogsFeedProcessingResultFields';
export * from './catalogsFeedProcessingSchedule';
export * from './catalogsFeedProcessingStatus';
export * from './catalogsFeedProductCounts';
export * from './catalogsFeedValidationDetails';
export * from './catalogsFeedValidationErrors';
export * from './catalogsFeedValidationWarnings';
export * from './catalogsFeedsCreateRequest';
export * from './catalogsFeedsUpdateRequest';
export * from './catalogsFormat';
export * from './catalogsItems';
export * from './catalogsItemsBatch';
export * from './catalogsItemsBatchRequest';
export * from './catalogsProductGroup';
export * from './catalogsProductGroupCreateRequest';
export * from './catalogsProductGroupCurrencyCriteria';
export * from './catalogsProductGroupFilterKeys';
export * from './catalogsProductGroupFilters';
export * from './catalogsProductGroupFiltersAllOf';
export * from './catalogsProductGroupFiltersAnyOf';
export * from './catalogsProductGroupMultipleStringCriteria';
export * from './catalogsProductGroupMultipleStringListCriteria';
export * from './catalogsProductGroupPricingCriteria';
export * from './catalogsProductGroupStatus';
export * from './catalogsProductGroupType';
export * from './catalogsProductGroupUpdateRequest';
export * from './catalogsStatus';
export * from './conditionFilter';
export * from './conversionAttributionWindowDays';
export * from './conversionReportAttributionType';
export * from './conversionReportTimeType';
export * from './country';
export * from './currency';
export * from './currencyFilter';
export * from './customLabel0Filter';
export * from './customLabel1Filter';
export * from './customLabel2Filter';
export * from './customLabel3Filter';
export * from './customLabel4Filter';
export * from './dataOutputFormat';
export * from './entityStatus';
export * from './feedFields';
export * from './genderFilter';
export * from './googleProductCategory0Filter';
export * from './googleProductCategory1Filter';
export * from './googleProductCategory2Filter';
export * from './googleProductCategory3Filter';
export * from './googleProductCategory4Filter';
export * from './googleProductCategory5Filter';
export * from './googleProductCategory6Filter';
export * from './granularity';
export * from './imageDetails';
export * from './itemAttributes';
export * from './itemBatchRecord';
export * from './itemGroupIdFilter';
export * from './itemIdFilter';
export * from './itemProcessingRecord';
export * from './itemProcessingStatus';
export * from './itemValidationEvent';
export * from './language';
export * from './maxPriceFilter';
export * from './mediaUpload';
export * from './mediaUploadAllOf';
export * from './mediaUploadAllOfUploadParameters';
export * from './mediaUploadDetails';
export * from './mediaUploadRequest';
export * from './mediaUploadStatus';
export * from './mediaUploadType';
export * from './metricsReportingLevel';
export * from './minPriceFilter';
export * from './modelError';
export * from './nonNullableCatalogsCurrency';
export * from './nullableCurrency';
export * from './oauthAccessTokenRequest';
export * from './oauthAccessTokenRequestCode';
export * from './oauthAccessTokenRequestCodeAllOf';
export * from './oauthAccessTokenRequestRefresh';
export * from './oauthAccessTokenRequestRefreshAllOf';
export * from './oauthAccessTokenResponse';
export * from './oauthAccessTokenResponseCode';
export * from './oauthAccessTokenResponseCodeAllOf';
export * from './oauthAccessTokenResponseRefresh';
export * from './objectiveType';
export * from './pacingDeliveryType';
export * from './paginated';
export * from './pin';
export * from './pinMedia';
export * from './pinMediaSource';
export * from './pinMediaSourceImageBase64';
export * from './pinMediaSourceImageURL';
export * from './pinMediaSourceVideoID';
export * from './pinMediaWithImage';
export * from './pinMediaWithImageAllOf';
export * from './pinPromotionSummaryStatus';
export * from './placementGroupType';
export * from './productAvailabilityType';
export * from './productGroupSummaryStatus';
export * from './productType0Filter';
export * from './productType1Filter';
export * from './productType2Filter';
export * from './productType3Filter';
export * from './productType4Filter';
export * from './reportingColumnAsync';
export * from './targetingTypeFilter';
export * from './trackingUrls';

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
import { AdAccountOwner } from './adAccountOwner';
import { AdGroupResponse } from './adGroupResponse';
import { AdGroupResponseAllOf } from './adGroupResponseAllOf';
import { AdGroupResponseAllOf1 } from './adGroupResponseAllOf1';
import { AdGroupSummaryStatus } from './adGroupSummaryStatus';
import { AdResponse } from './adResponse';
import { AdResponseAllOf } from './adResponseAllOf';
import { AdResponseAllOf1 } from './adResponseAllOf1';
import { AdsAnalyticsCreateAsyncRequest } from './adsAnalyticsCreateAsyncRequest';
import { AdsAnalyticsCreateAsyncRequestAllOf } from './adsAnalyticsCreateAsyncRequestAllOf';
import { AdsAnalyticsCreateAsyncRequestAllOf1 } from './adsAnalyticsCreateAsyncRequestAllOf1';
import { AdsAnalyticsCreateAsyncResponse } from './adsAnalyticsCreateAsyncResponse';
import { AdsAnalyticsFilterColumn } from './adsAnalyticsFilterColumn';
import { AdsAnalyticsFilterOperator } from './adsAnalyticsFilterOperator';
import { AdsAnalyticsGetAsyncResponse } from './adsAnalyticsGetAsyncResponse';
import { AdsAnalyticsMetricsFilter } from './adsAnalyticsMetricsFilter';
import { AdsAnalyticsTargetingType } from './adsAnalyticsTargetingType';
import { AnalyticsMetricsResponse } from './analyticsMetricsResponse';
import { AnalyticsMetricsResponseDailyMetrics } from './analyticsMetricsResponseDailyMetrics';
import { AvailabilityFilter } from './availabilityFilter';
import { BatchOperation } from './batchOperation';
import { BatchOperationStatus } from './batchOperationStatus';
import { Board } from './board';
import { BoardOwner } from './boardOwner';
import { BoardSection } from './boardSection';
import { BoardUpdate } from './boardUpdate';
import { BrandFilter } from './brandFilter';
import { CampaignCommon } from './campaignCommon';
import { CampaignResponse } from './campaignResponse';
import { CampaignResponseAllOf } from './campaignResponseAllOf';
import { CampaignResponseAllOf1 } from './campaignResponseAllOf1';
import { CampaignSummaryStatus } from './campaignSummaryStatus';
import { CatalogsDbItem } from './catalogsDbItem';
import { CatalogsFeed } from './catalogsFeed';
import { CatalogsFeedCredentials } from './catalogsFeedCredentials';
import { CatalogsFeedIngestionDetails } from './catalogsFeedIngestionDetails';
import { CatalogsFeedIngestionErrors } from './catalogsFeedIngestionErrors';
import { CatalogsFeedIngestionInfo } from './catalogsFeedIngestionInfo';
import { CatalogsFeedProcessingResult } from './catalogsFeedProcessingResult';
import { CatalogsFeedProcessingResultFields } from './catalogsFeedProcessingResultFields';
import { CatalogsFeedProcessingSchedule } from './catalogsFeedProcessingSchedule';
import { CatalogsFeedProcessingStatus } from './catalogsFeedProcessingStatus';
import { CatalogsFeedProductCounts } from './catalogsFeedProductCounts';
import { CatalogsFeedValidationDetails } from './catalogsFeedValidationDetails';
import { CatalogsFeedValidationErrors } from './catalogsFeedValidationErrors';
import { CatalogsFeedValidationWarnings } from './catalogsFeedValidationWarnings';
import { CatalogsFeedsCreateRequest } from './catalogsFeedsCreateRequest';
import { CatalogsFeedsUpdateRequest } from './catalogsFeedsUpdateRequest';
import { CatalogsFormat } from './catalogsFormat';
import { CatalogsItems } from './catalogsItems';
import { CatalogsItemsBatch } from './catalogsItemsBatch';
import { CatalogsItemsBatchRequest } from './catalogsItemsBatchRequest';
import { CatalogsProductGroup } from './catalogsProductGroup';
import { CatalogsProductGroupCreateRequest } from './catalogsProductGroupCreateRequest';
import { CatalogsProductGroupCurrencyCriteria } from './catalogsProductGroupCurrencyCriteria';
import { CatalogsProductGroupFilterKeys } from './catalogsProductGroupFilterKeys';
import { CatalogsProductGroupFilters } from './catalogsProductGroupFilters';
import { CatalogsProductGroupFiltersAllOf } from './catalogsProductGroupFiltersAllOf';
import { CatalogsProductGroupFiltersAnyOf } from './catalogsProductGroupFiltersAnyOf';
import { CatalogsProductGroupMultipleStringCriteria } from './catalogsProductGroupMultipleStringCriteria';
import { CatalogsProductGroupMultipleStringListCriteria } from './catalogsProductGroupMultipleStringListCriteria';
import { CatalogsProductGroupPricingCriteria } from './catalogsProductGroupPricingCriteria';
import { CatalogsProductGroupStatus } from './catalogsProductGroupStatus';
import { CatalogsProductGroupType } from './catalogsProductGroupType';
import { CatalogsProductGroupUpdateRequest } from './catalogsProductGroupUpdateRequest';
import { CatalogsStatus } from './catalogsStatus';
import { ConditionFilter } from './conditionFilter';
import { ConversionAttributionWindowDays } from './conversionAttributionWindowDays';
import { ConversionReportAttributionType } from './conversionReportAttributionType';
import { ConversionReportTimeType } from './conversionReportTimeType';
import { Country } from './country';
import { Currency } from './currency';
import { CurrencyFilter } from './currencyFilter';
import { CustomLabel0Filter } from './customLabel0Filter';
import { CustomLabel1Filter } from './customLabel1Filter';
import { CustomLabel2Filter } from './customLabel2Filter';
import { CustomLabel3Filter } from './customLabel3Filter';
import { CustomLabel4Filter } from './customLabel4Filter';
import { DataOutputFormat } from './dataOutputFormat';
import { EntityStatus } from './entityStatus';
import { FeedFields } from './feedFields';
import { GenderFilter } from './genderFilter';
import { GoogleProductCategory0Filter } from './googleProductCategory0Filter';
import { GoogleProductCategory1Filter } from './googleProductCategory1Filter';
import { GoogleProductCategory2Filter } from './googleProductCategory2Filter';
import { GoogleProductCategory3Filter } from './googleProductCategory3Filter';
import { GoogleProductCategory4Filter } from './googleProductCategory4Filter';
import { GoogleProductCategory5Filter } from './googleProductCategory5Filter';
import { GoogleProductCategory6Filter } from './googleProductCategory6Filter';
import { Granularity } from './granularity';
import { ImageDetails } from './imageDetails';
import { ItemAttributes } from './itemAttributes';
import { ItemBatchRecord } from './itemBatchRecord';
import { ItemGroupIdFilter } from './itemGroupIdFilter';
import { ItemIdFilter } from './itemIdFilter';
import { ItemProcessingRecord } from './itemProcessingRecord';
import { ItemProcessingStatus } from './itemProcessingStatus';
import { ItemValidationEvent } from './itemValidationEvent';
import { Language } from './language';
import { MaxPriceFilter } from './maxPriceFilter';
import { MediaUpload } from './mediaUpload';
import { MediaUploadAllOf } from './mediaUploadAllOf';
import { MediaUploadAllOfUploadParameters } from './mediaUploadAllOfUploadParameters';
import { MediaUploadDetails } from './mediaUploadDetails';
import { MediaUploadRequest } from './mediaUploadRequest';
import { MediaUploadStatus } from './mediaUploadStatus';
import { MediaUploadType } from './mediaUploadType';
import { MetricsReportingLevel } from './metricsReportingLevel';
import { MinPriceFilter } from './minPriceFilter';
import { ModelError } from './modelError';
import { NonNullableCatalogsCurrency } from './nonNullableCatalogsCurrency';
import { NullableCurrency } from './nullableCurrency';
import { OauthAccessTokenRequest } from './oauthAccessTokenRequest';
import { OauthAccessTokenRequestCode } from './oauthAccessTokenRequestCode';
import { OauthAccessTokenRequestCodeAllOf } from './oauthAccessTokenRequestCodeAllOf';
import { OauthAccessTokenRequestRefresh } from './oauthAccessTokenRequestRefresh';
import { OauthAccessTokenRequestRefreshAllOf } from './oauthAccessTokenRequestRefreshAllOf';
import { OauthAccessTokenResponse } from './oauthAccessTokenResponse';
import { OauthAccessTokenResponseCode } from './oauthAccessTokenResponseCode';
import { OauthAccessTokenResponseCodeAllOf } from './oauthAccessTokenResponseCodeAllOf';
import { OauthAccessTokenResponseRefresh } from './oauthAccessTokenResponseRefresh';
import { ObjectiveType } from './objectiveType';
import { PacingDeliveryType } from './pacingDeliveryType';
import { Paginated } from './paginated';
import { Pin } from './pin';
import { PinMedia } from './pinMedia';
import { PinMediaSource } from './pinMediaSource';
import { PinMediaSourceImageBase64 } from './pinMediaSourceImageBase64';
import { PinMediaSourceImageURL } from './pinMediaSourceImageURL';
import { PinMediaSourceVideoID } from './pinMediaSourceVideoID';
import { PinMediaWithImage } from './pinMediaWithImage';
import { PinMediaWithImageAllOf } from './pinMediaWithImageAllOf';
import { PinPromotionSummaryStatus } from './pinPromotionSummaryStatus';
import { PlacementGroupType } from './placementGroupType';
import { ProductAvailabilityType } from './productAvailabilityType';
import { ProductGroupSummaryStatus } from './productGroupSummaryStatus';
import { ProductType0Filter } from './productType0Filter';
import { ProductType1Filter } from './productType1Filter';
import { ProductType2Filter } from './productType2Filter';
import { ProductType3Filter } from './productType3Filter';
import { ProductType4Filter } from './productType4Filter';
import { ReportingColumnAsync } from './reportingColumnAsync';
import { TargetingTypeFilter } from './targetingTypeFilter';
import { TrackingUrls } from './trackingUrls';

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
        "AdGroupResponse.BudgetTypeEnum": AdGroupResponse.BudgetTypeEnum,
        "AdGroupResponse.ConversionLearningModeTypeEnum": AdGroupResponse.ConversionLearningModeTypeEnum,
        "AdGroupResponseAllOf.BudgetTypeEnum": AdGroupResponseAllOf.BudgetTypeEnum,
        "AdGroupResponseAllOf.ConversionLearningModeTypeEnum": AdGroupResponseAllOf.ConversionLearningModeTypeEnum,
        "AdGroupSummaryStatus": AdGroupSummaryStatus,
        "AdResponse.CreativeTypeEnum": AdResponse.CreativeTypeEnum,
        "AdResponse.RejectedReasonsEnum": AdResponse.RejectedReasonsEnum,
        "AdResponse.ReviewStatusEnum": AdResponse.ReviewStatusEnum,
        "AdResponseAllOf.CreativeTypeEnum": AdResponseAllOf.CreativeTypeEnum,
        "AdResponseAllOf1.RejectedReasonsEnum": AdResponseAllOf1.RejectedReasonsEnum,
        "AdResponseAllOf1.ReviewStatusEnum": AdResponseAllOf1.ReviewStatusEnum,
        "AdsAnalyticsFilterColumn": AdsAnalyticsFilterColumn,
        "AdsAnalyticsFilterOperator": AdsAnalyticsFilterOperator,
        "AdsAnalyticsTargetingType": AdsAnalyticsTargetingType,
        "AnalyticsMetricsResponseDailyMetrics.DataStatusEnum": AnalyticsMetricsResponseDailyMetrics.DataStatusEnum,
        "BatchOperation": BatchOperation,
        "BatchOperationStatus": BatchOperationStatus,
        "Board.PrivacyEnum": Board.PrivacyEnum,
        "BoardUpdate.PrivacyEnum": BoardUpdate.PrivacyEnum,
        "CampaignSummaryStatus": CampaignSummaryStatus,
        "CatalogsFeedIngestionErrors.LargeProductCountDecreaseEnum": CatalogsFeedIngestionErrors.LargeProductCountDecreaseEnum,
        "CatalogsFeedProcessingSchedule.TimezoneEnum": CatalogsFeedProcessingSchedule.TimezoneEnum,
        "CatalogsFeedProcessingStatus": CatalogsFeedProcessingStatus,
        "CatalogsFormat": CatalogsFormat,
        "CatalogsProductGroupStatus": CatalogsProductGroupStatus,
        "CatalogsProductGroupType": CatalogsProductGroupType,
        "CatalogsStatus": CatalogsStatus,
        "ConversionAttributionWindowDays": ConversionAttributionWindowDays,
        "ConversionReportAttributionType": ConversionReportAttributionType,
        "ConversionReportTimeType": ConversionReportTimeType,
        "Country": Country,
        "Currency": Currency,
        "DataOutputFormat": DataOutputFormat,
        "EntityStatus": EntityStatus,
        "Granularity": Granularity,
        "ItemProcessingStatus": ItemProcessingStatus,
        "Language": Language,
        "MediaUploadStatus": MediaUploadStatus,
        "MediaUploadType": MediaUploadType,
        "MetricsReportingLevel": MetricsReportingLevel,
        "NonNullableCatalogsCurrency": NonNullableCatalogsCurrency,
        "NullableCurrency": NullableCurrency,
        "OauthAccessTokenRequest.GrantTypeEnum": OauthAccessTokenRequest.GrantTypeEnum,
        "OauthAccessTokenResponse.ResponseTypeEnum": OauthAccessTokenResponse.ResponseTypeEnum,
        "ObjectiveType": ObjectiveType,
        "PacingDeliveryType": PacingDeliveryType,
        "PinMediaSource.SourceTypeEnum": PinMediaSource.SourceTypeEnum,
        "PinMediaSource.ContentTypeEnum": PinMediaSource.ContentTypeEnum,
        "PinMediaSourceImageBase64.SourceTypeEnum": PinMediaSourceImageBase64.SourceTypeEnum,
        "PinMediaSourceImageBase64.ContentTypeEnum": PinMediaSourceImageBase64.ContentTypeEnum,
        "PinMediaSourceImageURL.SourceTypeEnum": PinMediaSourceImageURL.SourceTypeEnum,
        "PinMediaSourceVideoID.SourceTypeEnum": PinMediaSourceVideoID.SourceTypeEnum,
        "PinPromotionSummaryStatus": PinPromotionSummaryStatus,
        "PlacementGroupType": PlacementGroupType,
        "ProductAvailabilityType": ProductAvailabilityType,
        "ProductGroupSummaryStatus": ProductGroupSummaryStatus,
        "ReportingColumnAsync": ReportingColumnAsync,
}

let typeMap: {[index: string]: any} = {
    "Account": Account,
    "AdAccount": AdAccount,
    "AdAccountOwner": AdAccountOwner,
    "AdGroupResponse": AdGroupResponse,
    "AdGroupResponseAllOf": AdGroupResponseAllOf,
    "AdGroupResponseAllOf1": AdGroupResponseAllOf1,
    "AdResponse": AdResponse,
    "AdResponseAllOf": AdResponseAllOf,
    "AdResponseAllOf1": AdResponseAllOf1,
    "AdsAnalyticsCreateAsyncRequest": AdsAnalyticsCreateAsyncRequest,
    "AdsAnalyticsCreateAsyncRequestAllOf": AdsAnalyticsCreateAsyncRequestAllOf,
    "AdsAnalyticsCreateAsyncRequestAllOf1": AdsAnalyticsCreateAsyncRequestAllOf1,
    "AdsAnalyticsCreateAsyncResponse": AdsAnalyticsCreateAsyncResponse,
    "AdsAnalyticsGetAsyncResponse": AdsAnalyticsGetAsyncResponse,
    "AdsAnalyticsMetricsFilter": AdsAnalyticsMetricsFilter,
    "AnalyticsMetricsResponse": AnalyticsMetricsResponse,
    "AnalyticsMetricsResponseDailyMetrics": AnalyticsMetricsResponseDailyMetrics,
    "AvailabilityFilter": AvailabilityFilter,
    "Board": Board,
    "BoardOwner": BoardOwner,
    "BoardSection": BoardSection,
    "BoardUpdate": BoardUpdate,
    "BrandFilter": BrandFilter,
    "CampaignCommon": CampaignCommon,
    "CampaignResponse": CampaignResponse,
    "CampaignResponseAllOf": CampaignResponseAllOf,
    "CampaignResponseAllOf1": CampaignResponseAllOf1,
    "CatalogsDbItem": CatalogsDbItem,
    "CatalogsFeed": CatalogsFeed,
    "CatalogsFeedCredentials": CatalogsFeedCredentials,
    "CatalogsFeedIngestionDetails": CatalogsFeedIngestionDetails,
    "CatalogsFeedIngestionErrors": CatalogsFeedIngestionErrors,
    "CatalogsFeedIngestionInfo": CatalogsFeedIngestionInfo,
    "CatalogsFeedProcessingResult": CatalogsFeedProcessingResult,
    "CatalogsFeedProcessingResultFields": CatalogsFeedProcessingResultFields,
    "CatalogsFeedProcessingSchedule": CatalogsFeedProcessingSchedule,
    "CatalogsFeedProductCounts": CatalogsFeedProductCounts,
    "CatalogsFeedValidationDetails": CatalogsFeedValidationDetails,
    "CatalogsFeedValidationErrors": CatalogsFeedValidationErrors,
    "CatalogsFeedValidationWarnings": CatalogsFeedValidationWarnings,
    "CatalogsFeedsCreateRequest": CatalogsFeedsCreateRequest,
    "CatalogsFeedsUpdateRequest": CatalogsFeedsUpdateRequest,
    "CatalogsItems": CatalogsItems,
    "CatalogsItemsBatch": CatalogsItemsBatch,
    "CatalogsItemsBatchRequest": CatalogsItemsBatchRequest,
    "CatalogsProductGroup": CatalogsProductGroup,
    "CatalogsProductGroupCreateRequest": CatalogsProductGroupCreateRequest,
    "CatalogsProductGroupCurrencyCriteria": CatalogsProductGroupCurrencyCriteria,
    "CatalogsProductGroupFilterKeys": CatalogsProductGroupFilterKeys,
    "CatalogsProductGroupFilters": CatalogsProductGroupFilters,
    "CatalogsProductGroupFiltersAllOf": CatalogsProductGroupFiltersAllOf,
    "CatalogsProductGroupFiltersAnyOf": CatalogsProductGroupFiltersAnyOf,
    "CatalogsProductGroupMultipleStringCriteria": CatalogsProductGroupMultipleStringCriteria,
    "CatalogsProductGroupMultipleStringListCriteria": CatalogsProductGroupMultipleStringListCriteria,
    "CatalogsProductGroupPricingCriteria": CatalogsProductGroupPricingCriteria,
    "CatalogsProductGroupUpdateRequest": CatalogsProductGroupUpdateRequest,
    "ConditionFilter": ConditionFilter,
    "CurrencyFilter": CurrencyFilter,
    "CustomLabel0Filter": CustomLabel0Filter,
    "CustomLabel1Filter": CustomLabel1Filter,
    "CustomLabel2Filter": CustomLabel2Filter,
    "CustomLabel3Filter": CustomLabel3Filter,
    "CustomLabel4Filter": CustomLabel4Filter,
    "FeedFields": FeedFields,
    "GenderFilter": GenderFilter,
    "GoogleProductCategory0Filter": GoogleProductCategory0Filter,
    "GoogleProductCategory1Filter": GoogleProductCategory1Filter,
    "GoogleProductCategory2Filter": GoogleProductCategory2Filter,
    "GoogleProductCategory3Filter": GoogleProductCategory3Filter,
    "GoogleProductCategory4Filter": GoogleProductCategory4Filter,
    "GoogleProductCategory5Filter": GoogleProductCategory5Filter,
    "GoogleProductCategory6Filter": GoogleProductCategory6Filter,
    "ImageDetails": ImageDetails,
    "ItemAttributes": ItemAttributes,
    "ItemBatchRecord": ItemBatchRecord,
    "ItemGroupIdFilter": ItemGroupIdFilter,
    "ItemIdFilter": ItemIdFilter,
    "ItemProcessingRecord": ItemProcessingRecord,
    "ItemValidationEvent": ItemValidationEvent,
    "MaxPriceFilter": MaxPriceFilter,
    "MediaUpload": MediaUpload,
    "MediaUploadAllOf": MediaUploadAllOf,
    "MediaUploadAllOfUploadParameters": MediaUploadAllOfUploadParameters,
    "MediaUploadDetails": MediaUploadDetails,
    "MediaUploadRequest": MediaUploadRequest,
    "MinPriceFilter": MinPriceFilter,
    "ModelError": ModelError,
    "OauthAccessTokenRequest": OauthAccessTokenRequest,
    "OauthAccessTokenRequestCode": OauthAccessTokenRequestCode,
    "OauthAccessTokenRequestCodeAllOf": OauthAccessTokenRequestCodeAllOf,
    "OauthAccessTokenRequestRefresh": OauthAccessTokenRequestRefresh,
    "OauthAccessTokenRequestRefreshAllOf": OauthAccessTokenRequestRefreshAllOf,
    "OauthAccessTokenResponse": OauthAccessTokenResponse,
    "OauthAccessTokenResponseCode": OauthAccessTokenResponseCode,
    "OauthAccessTokenResponseCodeAllOf": OauthAccessTokenResponseCodeAllOf,
    "OauthAccessTokenResponseRefresh": OauthAccessTokenResponseRefresh,
    "Paginated": Paginated,
    "Pin": Pin,
    "PinMedia": PinMedia,
    "PinMediaSource": PinMediaSource,
    "PinMediaSourceImageBase64": PinMediaSourceImageBase64,
    "PinMediaSourceImageURL": PinMediaSourceImageURL,
    "PinMediaSourceVideoID": PinMediaSourceVideoID,
    "PinMediaWithImage": PinMediaWithImage,
    "PinMediaWithImageAllOf": PinMediaWithImageAllOf,
    "ProductType0Filter": ProductType0Filter,
    "ProductType1Filter": ProductType1Filter,
    "ProductType2Filter": ProductType2Filter,
    "ProductType3Filter": ProductType3Filter,
    "ProductType4Filter": ProductType4Filter,
    "TargetingTypeFilter": TargetingTypeFilter,
    "TrackingUrls": TrackingUrls,
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
