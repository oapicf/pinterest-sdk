

# CatalogsFeedsCreateRequest

Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultCurrency** | **NullableCurrency** |  |  [optional] |
|**name** | **String** | A human-friendly name associated to a given feed. |  |
|**format** | **CatalogsFormat** |  |  |
|**defaultLocale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  |  [optional] |
|**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional] |
|**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  |
|**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional] |
|**defaultCountry** | **Country** |  |  [optional] |
|**defaultAvailability** | **ProductAvailabilityType** |  |  [optional] |



