# CatalogsVerticalFeedsCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultCurrency** | [**OpenAPI\Server\Model\NullableCurrency**](NullableCurrency.md) |  | [optional] 
**name** | **string** | A human-friendly name associated to a given feed. | 
**format** | [**OpenAPI\Server\Model\CatalogsFormat**](CatalogsFormat.md) |  | 
**defaultLocale** | [**OpenAPI\Server\Model\CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  | 
**credentials** | [**OpenAPI\Server\Model\CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferredProcessingSchedule** | [**OpenAPI\Server\Model\CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**catalogType** | [**OpenAPI\Server\Model\CatalogsType**](CatalogsType.md) |  | 
**defaultCountry** | [**OpenAPI\Server\Model\Country**](Country.md) |  | 
**defaultAvailability** | [**OpenAPI\Server\Model\ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] 
**catalogId** | **string** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


