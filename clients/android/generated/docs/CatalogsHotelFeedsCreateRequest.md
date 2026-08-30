

# CatalogsHotelFeedsCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogId** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. |  [optional]
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional]
**defaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  |  [optional]
**defaultLocale** | [**CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale**](CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md) |  | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **String** | A human-friendly name associated to a given feed. | 
**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional]
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  |  [optional]


## Enum: CatalogTypeEnum

Name | Value
---- | -----




