# CatalogsFeedCreateRequestSchema
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **catalog\_id** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | [optional] [default to null] |
| **catalog\_type** | **String** |  | [default to null] |
| **credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] [default to null] |
| **default\_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] [default to null] |
| **default\_country** | [**Country**](Country.md) |  | [default to null] |
| **default\_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] [default to null] |
| **default\_locale** | [**CatalogsCreativeAssetsFeedsCreateRequest_default_locale**](CatalogsCreativeAssetsFeedsCreateRequest_default_locale.md) |  | [default to null] |
| **format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [default to null] |
| **location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [default to null] |
| **name** | **String** | A human-friendly name associated to a given feed. | [default to null] |
| **preferred\_processing\_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] [default to null] |
| **status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] [default to ACTIVE] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

