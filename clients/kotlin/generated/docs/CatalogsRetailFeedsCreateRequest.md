
# CatalogsRetailFeedsCreateRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **catalogType** | [**CatalogsType**](CatalogsType.md) |  |  |
| **defaultCountry** | [**Country**](Country.md) |  |  |
| **defaultLocale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  |  |
| **format** | [**CatalogsFormat**](CatalogsFormat.md) |  |  |
| **location** | **kotlin.String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  |
| **name** | **kotlin.String** | A human-friendly name associated to a given feed. |  |
| **catalogId** | **kotlin.String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. Currently, this field has no effect. |  [optional] |
| **credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional] |
| **defaultAvailability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  |  [optional] |
| **defaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  |  [optional] |
| **preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional] |
| **status** | [**CatalogsStatus**](CatalogsStatus.md) |  |  [optional] |



