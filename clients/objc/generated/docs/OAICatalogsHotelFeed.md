# OAICatalogsHotelFeed

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogId** | **NSString*** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 
**catalogType** | **NSString*** |  | 
**createdAt** | **NSDate*** |  | [readonly] 
**credentials** | [**OAICatalogsFeedCredentials***](OAICatalogsFeedCredentials.md) |  | [optional] 
**defaultCurrency** | [**OAINullableCurrency***](OAINullableCurrency.md) |  | [optional] 
**defaultLocale** | **NSString*** | The locale used within a feed for product descriptions. | 
**format** | [**OAICatalogsFormat***](OAICatalogsFormat.md) |  | 
**_id** | **NSString*** | ID of the feed entity. | [readonly] 
**location** | **NSString*** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **NSString*** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**preferredProcessingSchedule** | [**OAICatalogsFeedProcessingSchedule***](OAICatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**OAICatalogsStatus***](OAICatalogsStatus.md) |  | 
**updatedAt** | **NSDate*** |  | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


