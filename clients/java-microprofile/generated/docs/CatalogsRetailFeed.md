

# CatalogsRetailFeed

Catalogs Retail Feed object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  |  |
|**createdAt** | **Date** |  |  [readonly] |
|**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional] |
|**defaultAvailability** | **ProductAvailabilityType** |  |  [optional] |
|**defaultCountry** | **Country** |  |  |
|**defaultCurrency** | **NullableCurrency** |  |  [optional] |
|**defaultLocale** | **String** | The locale used within a feed for product descriptions. |  |
|**format** | **CatalogsFormat** |  |  |
|**id** | **String** | ID of the feed entity. |  [readonly] |
|**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  |
|**name** | **String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. |  |
|**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional] |
|**status** | **CatalogsStatus** |  |  |
|**updatedAt** | **Date** |  |  [readonly] |



## Enum: CatalogTypeEnum

| Name | Value |
|---- | -----|
| RETAIL | &quot;RETAIL&quot; |



