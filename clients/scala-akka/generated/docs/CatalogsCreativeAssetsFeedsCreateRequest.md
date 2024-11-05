

# CatalogsCreativeAssetsFeedsCreateRequest

Request object for creating a feed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultCurrency** | **NullableCurrency** |  |  [optional]
**name** | **String** | A human-friendly name associated to a given feed. | 
**format** | **CatalogsFormat** |  | 
**defaultLocale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  | 
**defaultCountry** | **Country** |  | 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional]
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional]
**catalogType** | **CatalogsType** |  | 
**catalogId** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future. |  [optional]
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  |  [optional]



