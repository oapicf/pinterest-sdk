

# CatalogsRetailFeedsCreateRequest

Request object for creating a retail feed.

The class is defined in **[CatalogsRetailFeedsCreateRequest.java](../../src/main/java/org/openapitools/model/CatalogsRetailFeedsCreateRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogId** | `String` | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. Currently, this field has no effect. |  [optional property]
**catalogType** | `CatalogsType` |  | 
**credentials** | [`CatalogsFeedCredentials`](CatalogsFeedCredentials.md) |  |  [optional property]
**defaultAvailability** | `ProductAvailabilityType` |  |  [optional property]
**defaultCountry** | `Country` |  | 
**defaultCurrency** | `NullableCurrency` |  |  [optional property]
**defaultLocale** | [`CatalogsFeedsCreateRequestDefaultLocale`](CatalogsFeedsCreateRequestDefaultLocale.md) |  | 
**_format** | `CatalogsFormat` |  | 
**location** | `String` | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | `String` | A human-friendly name associated to a given feed. | 
**preferredProcessingSchedule** | [`CatalogsFeedProcessingSchedule`](CatalogsFeedProcessingSchedule.md) |  |  [optional property]
**status** | `CatalogsStatus` |  |  [optional property]














