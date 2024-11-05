# OAICatalogsCreativeAssetsFeedsCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultCurrency** | [**OAINullableCurrency***](OAINullableCurrency.md) |  | [optional] 
**name** | **NSString*** | A human-friendly name associated to a given feed. | 
**format** | [**OAICatalogsFormat***](OAICatalogsFormat.md) |  | 
**defaultLocale** | [**OAICatalogsFeedsCreateRequestDefaultLocale***](OAICatalogsFeedsCreateRequestDefaultLocale.md) |  | 
**defaultCountry** | [**OAICountry***](OAICountry.md) |  | 
**credentials** | [**OAICatalogsFeedCredentials***](OAICatalogsFeedCredentials.md) |  | [optional] 
**location** | **NSString*** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferredProcessingSchedule** | [**OAICatalogsFeedProcessingSchedule***](OAICatalogsFeedProcessingSchedule.md) |  | [optional] 
**catalogType** | [**OAICatalogsType***](OAICatalogsType.md) |  | 
**catalogId** | **NSString*** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future. | [optional] 
**status** | [**OAICatalogsStatus***](OAICatalogsStatus.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


