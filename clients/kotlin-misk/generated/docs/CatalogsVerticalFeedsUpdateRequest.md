
# CatalogsVerticalFeedsUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**inline**](#CatalogType) |  | 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional]
**defaultAvailability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  |  [optional]
**defaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  |  [optional]
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  |  [optional]
**location** | **kotlin.String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  [optional]
**name** | **kotlin.String** | A human-friendly name associated to a given feed. |  [optional]
**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional]
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  |  [optional]


<a id="CatalogType"></a>
## Enum: catalog_type
Name | Value
---- | -----
catalogType | CREATIVE_ASSETS



