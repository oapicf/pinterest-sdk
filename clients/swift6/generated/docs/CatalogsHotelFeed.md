# CatalogsHotelFeed

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogId** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 
**catalogType** | **String** |  | 
**createdAt** | **Date** |  | [readonly] 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**defaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**defaultLocale** | **String** | The locale used within a feed for product descriptions. | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**id** | **String** | ID of the feed entity. | [readonly] 
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | 
**updatedAt** | **Date** |  | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


