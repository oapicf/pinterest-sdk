# CatalogsVerticalFeedsCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogId** | **string** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | [optional] 
**catalogType** | **string** |  | 
**credentials** | [**OpenAPI\Server\Model\CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**defaultAvailability** | [**OpenAPI\Server\Model\ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**defaultCountry** | [**OpenAPI\Server\Model\Country**](Country.md) |  | 
**defaultCurrency** | [**OpenAPI\Server\Model\NullableCurrency**](NullableCurrency.md) |  | [optional] 
**defaultLocale** | [**OpenAPI\Server\Model\CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale**](CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md) |  | 
**format** | [**OpenAPI\Server\Model\CatalogsFormat**](CatalogsFormat.md) |  | 
**location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **string** | A human-friendly name associated to a given feed. | 
**preferredProcessingSchedule** | [**OpenAPI\Server\Model\CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**OpenAPI\Server\Model\CatalogsStatus**](CatalogsStatus.md) |  | [optional] [default to CatalogsStatus::ACTIVE]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


