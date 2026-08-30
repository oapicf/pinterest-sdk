# CatalogsHotelFeed

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogId** | **string** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 
**catalogType** | **string** |  | 
**createdAt** | **\DateTime** |  | [readonly] 
**credentials** | [**OpenAPI\Server\Model\CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**defaultCurrency** | [**OpenAPI\Server\Model\NullableCurrency**](NullableCurrency.md) |  | [optional] 
**defaultLocale** | **string** | The locale used within a feed for product descriptions. | 
**format** | [**OpenAPI\Server\Model\CatalogsFormat**](CatalogsFormat.md) |  | 
**id** | **string** | ID of the feed entity. | [readonly] 
**location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **string** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**preferredProcessingSchedule** | [**OpenAPI\Server\Model\CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**OpenAPI\Server\Model\CatalogsStatus**](CatalogsStatus.md) |  | 
**updatedAt** | **\DateTime** |  | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


