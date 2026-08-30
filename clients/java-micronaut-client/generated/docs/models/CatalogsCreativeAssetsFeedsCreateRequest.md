

# CatalogsCreativeAssetsFeedsCreateRequest

Request object for creating a feed.

The class is defined in **[CatalogsCreativeAssetsFeedsCreateRequest.java](../../src/main/java/org/openapitools/model/CatalogsCreativeAssetsFeedsCreateRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogId** | `String` | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. |  [optional property]
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**credentials** | [`CatalogsFeedCredentials`](CatalogsFeedCredentials.md) |  |  [optional property]
**defaultCountry** | `Country` |  | 
**defaultCurrency** | `NullableCurrency` |  |  [optional property]
**defaultLocale** | [`CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale`](CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md) |  | 
**_format** | `CatalogsFormat` |  | 
**location** | `String` | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | `String` | A human-friendly name associated to a given feed. | 
**preferredProcessingSchedule** | [`CatalogsFeedProcessingSchedule`](CatalogsFeedProcessingSchedule.md) |  |  [optional property]
**status** | `CatalogsStatus` |  |  [optional property]


## CatalogTypeEnum

Name | Value
---- | -----
CREATIVE_ASSETS | `"CREATIVE_ASSETS"`











