

# CatalogsCreativeAssetsFeedsCreateRequest

Request object for creating a feed.

The class is defined in **[CatalogsCreativeAssetsFeedsCreateRequest.java](../../src/main/java/org/openapitools/model/CatalogsCreativeAssetsFeedsCreateRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogId** | `String` | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future. |  [optional property]
**catalogType** | `CatalogsType` |  | 
**credentials** | [`CatalogsFeedCredentials`](CatalogsFeedCredentials.md) |  |  [optional property]
**defaultCountry** | `Country` |  | 
**defaultCurrency** | `NullableCurrency` |  |  [optional property]
**defaultLocale** | [`CatalogsFeedsCreateRequestDefaultLocale`](CatalogsFeedsCreateRequestDefaultLocale.md) |  | 
**_format** | `CatalogsFormat` |  | 
**location** | `String` | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | `String` | A human-friendly name associated to a given feed. | 
**preferredProcessingSchedule** | [`CatalogsFeedProcessingSchedule`](CatalogsFeedProcessingSchedule.md) |  |  [optional property]
**status** | `CatalogsStatus` |  |  [optional property]













