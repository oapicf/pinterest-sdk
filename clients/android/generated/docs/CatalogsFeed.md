

# CatalogsFeed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**Date**](Date.md) |  |  [optional]
**id** | **String** |  |  [optional]
**updatedAt** | [**Date**](Date.md) |  |  [optional]
**name** | **String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**catalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | 
**defaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  | 
**defaultLocale** | **String** | The locale used within a feed for product descriptions. | 
**defaultCountry** | [**Country**](Country.md) |  | 
**defaultAvailability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | 
**catalogId** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 




