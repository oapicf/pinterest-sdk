

# CatalogsHotelFeed

Catalogs Hotel Feed object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**name** | **String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. |  |
|**format** | **CatalogsFormat** |  |  |
|**catalogType** | **CatalogsType** |  |  |
|**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  |
|**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  |
|**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  |
|**status** | **CatalogsStatus** |  |  |
|**defaultCurrency** | **NullableCurrency** |  |  |
|**defaultLocale** | **String** | The locale used within a feed for product descriptions. |  |
|**catalogId** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. |  |



