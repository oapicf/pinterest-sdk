# CatalogsRetailFeedsCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogId** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | [optional] 
**catalogType** | **String** |  | 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**defaultAvailability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**defaultCountry** | [**Country**](Country.md) |  | 
**defaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**defaultLocale** | [**CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale**](CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md) |  | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **String** | A human-friendly name associated to a given feed. | 
**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


