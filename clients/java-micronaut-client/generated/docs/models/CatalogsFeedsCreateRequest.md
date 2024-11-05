

# CatalogsFeedsCreateRequest

Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.

The class is defined in **[CatalogsFeedsCreateRequest.java](../../src/main/java/org/openapitools/model/CatalogsFeedsCreateRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultCurrency** | `NullableCurrency` |  |  [optional property]
**name** | `String` | A human-friendly name associated to a given feed. | 
**_format** | `CatalogsFormat` |  | 
**defaultLocale** | [`CatalogsFeedsCreateRequestDefaultLocale`](CatalogsFeedsCreateRequestDefaultLocale.md) |  |  [optional property]
**credentials** | [`CatalogsFeedCredentials`](CatalogsFeedCredentials.md) |  |  [optional property]
**location** | `String` | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferredProcessingSchedule** | [`CatalogsFeedProcessingSchedule`](CatalogsFeedProcessingSchedule.md) |  |  [optional property]
**defaultCountry** | `Country` |  |  [optional property]
**defaultAvailability** | `ProductAvailabilityType` |  |  [optional property]
**status** | [`CatalogsStatus`](CatalogsStatus.md) |  |  [optional property]












