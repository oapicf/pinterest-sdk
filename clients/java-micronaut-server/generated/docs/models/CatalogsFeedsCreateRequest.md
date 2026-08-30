

# CatalogsFeedsCreateRequest

Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.

The class is defined in **[CatalogsFeedsCreateRequest.java](../../src/main/java/org/openapitools/model/CatalogsFeedsCreateRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**credentials** | [`CatalogsFeedCredentials`](CatalogsFeedCredentials.md) |  |  [optional property]
**defaultAvailability** | `ProductAvailabilityType` |  |  [optional property]
**defaultCountry** | `Country` |  |  [optional property]
**defaultCurrency** | `NullableCurrency` |  |  [optional property]
**defaultLocale** | [`CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale`](CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md) |  |  [optional property]
**_format** | `CatalogsFormat` |  | 
**location** | `String` | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | `String` | A human-friendly name associated to a given feed. | 
**preferredProcessingSchedule** | [`CatalogsFeedProcessingSchedule`](CatalogsFeedProcessingSchedule.md) |  |  [optional property]
**status** | `CatalogsStatus` |  |  [optional property]












