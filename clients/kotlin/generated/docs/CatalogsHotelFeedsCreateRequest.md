
# CatalogsHotelFeedsCreateRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | A human-friendly name associated to a given feed. |  |
| **format** | [**CatalogsFormat**](CatalogsFormat.md) |  |  |
| **defaultLocale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  |  |
| **location** | **kotlin.String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  |
| **catalogType** | [**CatalogsType**](CatalogsType.md) |  |  |
| **defaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  |  [optional] |
| **credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional] |
| **preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional] |
| **catalogId** | **kotlin.String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. |  [optional] |
| **status** | [**CatalogsStatus**](CatalogsStatus.md) |  |  [optional] |



