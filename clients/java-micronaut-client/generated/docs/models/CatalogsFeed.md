

# CatalogsFeed

Catalogs Feed object

The class is defined in **[CatalogsFeed.java](../../src/main/java/org/openapitools/model/CatalogsFeed.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | `OffsetDateTime` |  |  [optional property]
**id** | `String` |  |  [optional property]
**updatedAt** | `OffsetDateTime` |  |  [optional property]
**name** | `String` | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**_format** | `CatalogsFormat` |  | 
**catalogType** | `CatalogsType` |  | 
**credentials** | [`CatalogsFeedCredentials`](CatalogsFeedCredentials.md) |  | 
**location** | `String` | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferredProcessingSchedule** | [`CatalogsFeedProcessingSchedule`](CatalogsFeedProcessingSchedule.md) |  | 
**status** | `CatalogsStatus` |  | 
**defaultCurrency** | `NullableCurrency` |  | 
**defaultLocale** | `String` | The locale used within a feed for product descriptions. | 
**defaultCountry** | `Country` |  | 
**defaultAvailability** | `ProductAvailabilityType` |  | 
**catalogId** | `String` | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 

















