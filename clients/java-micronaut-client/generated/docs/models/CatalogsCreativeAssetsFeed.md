

# CatalogsCreativeAssetsFeed

Catalogs Creative Asset Feed object

The class is defined in **[CatalogsCreativeAssetsFeed.java](../../src/main/java/org/openapitools/model/CatalogsCreativeAssetsFeed.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogId** | `String` | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**createdAt** | `OffsetDateTime` |  |  [readonly property]
**credentials** | [`CatalogsFeedCredentials`](CatalogsFeedCredentials.md) |  |  [optional property]
**defaultCountry** | `Country` |  | 
**defaultCurrency** | `NullableCurrency` |  |  [optional property]
**defaultLocale** | `String` | The locale used within a feed for product descriptions. | 
**_format** | `CatalogsFormat` |  | 
**id** | `String` | ID of the feed entity. |  [readonly property]
**location** | `String` | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | `String` | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**preferredProcessingSchedule** | [`CatalogsFeedProcessingSchedule`](CatalogsFeedProcessingSchedule.md) |  |  [optional property]
**status** | `CatalogsStatus` |  | 
**updatedAt** | `OffsetDateTime` |  |  [readonly property]


## CatalogTypeEnum

Name | Value
---- | -----
CREATIVE_ASSETS | `"CREATIVE_ASSETS"`














