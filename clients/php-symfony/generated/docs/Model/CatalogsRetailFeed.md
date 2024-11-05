# CatalogsRetailFeed

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **\DateTime** |  | 
**id** | **string** |  | 
**updatedAt** | **\DateTime** |  | 
**name** | **string** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**format** | [**OpenAPI\Server\Model\CatalogsFormat**](CatalogsFormat.md) |  | 
**catalogType** | [**OpenAPI\Server\Model\CatalogsType**](CatalogsType.md) |  | 
**credentials** | [**OpenAPI\Server\Model\CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferredProcessingSchedule** | [**OpenAPI\Server\Model\CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 
**status** | [**OpenAPI\Server\Model\CatalogsStatus**](CatalogsStatus.md) |  | 
**defaultCurrency** | [**OpenAPI\Server\Model\NullableCurrency**](NullableCurrency.md) |  | 
**defaultLocale** | **string** | The locale used within a feed for product descriptions. | 
**defaultCountry** | [**OpenAPI\Server\Model\Country**](Country.md) |  | 
**defaultAvailability** | [**OpenAPI\Server\Model\ProductAvailabilityType**](ProductAvailabilityType.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


