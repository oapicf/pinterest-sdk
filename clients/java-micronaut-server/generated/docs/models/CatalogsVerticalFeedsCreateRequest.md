

# CatalogsVerticalFeedsCreateRequest

Request object for creating a feed.

The class is defined in **[CatalogsVerticalFeedsCreateRequest.java](../../src/main/java/org/openapitools/model/CatalogsVerticalFeedsCreateRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultCurrency** | `NullableCurrency` |  |  [optional property]
**name** | `String` | A human-friendly name associated to a given feed. | 
**_format** | `CatalogsFormat` |  | 
**defaultLocale** | [`CatalogsFeedsCreateRequestDefaultLocale`](CatalogsFeedsCreateRequestDefaultLocale.md) |  | 
**credentials** | [`CatalogsFeedCredentials`](CatalogsFeedCredentials.md) |  |  [optional property]
**location** | `String` | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferredProcessingSchedule** | [`CatalogsFeedProcessingSchedule`](CatalogsFeedProcessingSchedule.md) |  |  [optional property]
**catalogType** | `CatalogsType` |  | 
**defaultCountry** | `Country` |  | 
**defaultAvailability** | `ProductAvailabilityType` |  |  [optional property]
**status** | [`CatalogsStatus`](CatalogsStatus.md) |  |  [optional property]
**catalogId** | `String` | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future. |  [optional property]














