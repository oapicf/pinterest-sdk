# OAICatalogsCreativeAssetsFeed

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **NSDate*** |  | 
**_id** | **NSString*** |  | 
**updatedAt** | **NSDate*** |  | 
**catalogId** | **NSString*** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 
**catalogType** | [**OAICatalogsType***](OAICatalogsType.md) |  | 
**credentials** | [**OAICatalogsFeedCredentials***](OAICatalogsFeedCredentials.md) |  | 
**defaultCountry** | [**OAICountry***](OAICountry.md) |  | 
**defaultCurrency** | [**OAINullableCurrency***](OAINullableCurrency.md) |  | 
**defaultLocale** | **NSString*** | The locale used within a feed for product descriptions. | 
**format** | [**OAICatalogsFormat***](OAICatalogsFormat.md) |  | 
**location** | **NSString*** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **NSString*** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**preferredProcessingSchedule** | [**OAICatalogsFeedProcessingSchedule***](OAICatalogsFeedProcessingSchedule.md) |  | 
**status** | [**OAICatalogsStatus***](OAICatalogsStatus.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


