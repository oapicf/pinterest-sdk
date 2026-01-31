

# CatalogsHotelFeed

Catalogs Hotel Feed object

The class is defined in **[CatalogsHotelFeed.java](../../src/main/java/org/openapitools/model/CatalogsHotelFeed.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | `OffsetDateTime` |  | 
**id** | `String` |  | 
**updatedAt** | `OffsetDateTime` |  | 
**catalogId** | `String` | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 
**catalogType** | `CatalogsType` |  | 
**credentials** | [`CatalogsFeedCredentials`](CatalogsFeedCredentials.md) |  | 
**defaultCurrency** | `NullableCurrency` |  | 
**defaultLocale** | `String` | The locale used within a feed for product descriptions. | 
**_format** | `CatalogsFormat` |  | 
**location** | `String` | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | `String` | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**preferredProcessingSchedule** | [`CatalogsFeedProcessingSchedule`](CatalogsFeedProcessingSchedule.md) |  | 
**status** | `CatalogsStatus` |  | 















