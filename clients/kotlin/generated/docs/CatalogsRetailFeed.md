
# CatalogsRetailFeed

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **id** | **kotlin.String** |  |  |
| **updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **catalogType** | [**CatalogsType**](CatalogsType.md) |  |  |
| **credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  |
| **defaultAvailability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  |  |
| **defaultCountry** | [**Country**](Country.md) |  |  |
| **defaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  |  |
| **defaultLocale** | **kotlin.String** | The locale used within a feed for product descriptions. |  |
| **format** | [**CatalogsFormat**](CatalogsFormat.md) |  |  |
| **location** | **kotlin.String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  |
| **name** | **kotlin.String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. |  |
| **preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  |
| **status** | [**CatalogsStatus**](CatalogsStatus.md) |  |  |



