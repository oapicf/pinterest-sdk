

# CatalogsVerticalFeedsUpdateRequest

Request object for updating a feed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  |  |
|**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional] |
|**defaultAvailability** | **ProductAvailabilityType** |  |  [optional] |
|**defaultCurrency** | **NullableCurrency** |  |  [optional] |
|**format** | **CatalogsFormat** |  |  [optional] |
|**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  [optional] |
|**name** | **String** | A human-friendly name associated to a given feed. |  [optional] |
|**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional] |
|**status** | **CatalogsStatus** |  |  [optional] |



## Enum: CatalogTypeEnum

| Name | Value |
|---- | -----|
| CREATIVE_ASSETS | &quot;CREATIVE_ASSETS&quot; |



