# OAICatalogsFeed

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **NSDate*** |  | 
**_id** | **NSString*** |  | 
**updatedAt** | **NSDate*** |  | 
**name** | **NSString*** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**format** | [**OAICatalogsFormat***](OAICatalogsFormat.md) |  | 
**catalogType** | [**OAICatalogsType***](OAICatalogsType.md) |  | 
**credentials** | [**OAICatalogsFeedCredentials***](OAICatalogsFeedCredentials.md) |  | 
**location** | **NSString*** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferredProcessingSchedule** | [**OAICatalogsFeedProcessingSchedule***](OAICatalogsFeedProcessingSchedule.md) |  | 
**status** | [**OAICatalogsStatus***](OAICatalogsStatus.md) |  | 
**defaultCurrency** | [**OAINullableCurrency***](OAINullableCurrency.md) |  | 
**defaultLocale** | **NSString*** | The locale used within a feed for product descriptions. | 
**defaultCountry** | [**OAICountry***](OAICountry.md) |  | 
**defaultAvailability** | [**OAIProductAvailabilityType***](OAIProductAvailabilityType.md) |  | 
**catalogId** | **NSString*** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


