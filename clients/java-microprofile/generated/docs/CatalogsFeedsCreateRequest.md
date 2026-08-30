

# CatalogsFeedsCreateRequest

Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional] |
|**defaultAvailability** | **ProductAvailabilityType** |  |  [optional] |
|**defaultCountry** | **Country** |  |  [optional] |
|**defaultCurrency** | **NullableCurrency** |  |  [optional] |
|**defaultLocale** | [**CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale**](CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md) |  |  [optional] |
|**format** | **CatalogsFormat** |  |  |
|**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  |
|**name** | **String** | A human-friendly name associated to a given feed. |  |
|**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional] |
|**status** | **CatalogsStatus** |  |  [optional] |



