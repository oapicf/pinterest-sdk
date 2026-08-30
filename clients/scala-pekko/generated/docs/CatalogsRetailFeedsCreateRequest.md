

# CatalogsRetailFeedsCreateRequest

Request object for creating a retail feed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogId** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. |  [optional]
**catalogType** | [**CatalogType**](#CatalogType) |  | 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional]
**defaultAvailability** | **ProductAvailabilityType** |  |  [optional]
**defaultCountry** | **Country** |  | 
**defaultCurrency** | **NullableCurrency** |  |  [optional]
**defaultLocale** | [**CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale**](CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md) |  | 
**format** | **CatalogsFormat** |  | 
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **String** | A human-friendly name associated to a given feed. | 
**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional]
**status** | **CatalogsStatus** |  |  [optional]


## Enum: CatalogType
Allowed values: [RETAIL]




