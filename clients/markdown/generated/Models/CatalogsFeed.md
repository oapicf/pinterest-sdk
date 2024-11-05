# CatalogsFeed
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **created\_at** | **Date** |  | [default to null] |
| **id** | **String** |  | [default to null] |
| **updated\_at** | **Date** |  | [default to null] |
| **name** | **String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | [default to null] |
| **format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [default to null] |
| **catalog\_type** | [**CatalogsType**](CatalogsType.md) |  | [default to null] |
| **credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [default to null] |
| **location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [default to null] |
| **preferred\_processing\_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [default to null] |
| **status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [default to null] |
| **default\_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [default to null] |
| **default\_locale** | **String** | The locale used within a feed for product descriptions. | [default to null] |
| **default\_country** | [**Country**](Country.md) |  | [default to null] |
| **default\_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [default to null] |
| **catalog\_id** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

