
# CatalogsHotelFeed

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**catalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**location** | **kotlin.String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | 
**defaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  | 
**defaultLocale** | **kotlin.String** | The locale used within a feed for product descriptions. | 
**catalogId** | **kotlin.String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**id** | **kotlin.String** |  |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]



