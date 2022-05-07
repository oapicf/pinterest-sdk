# FeedFields

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_country** | [***models::Country**](Country.md) |  | 
**default_availability** | [***models::ProductAvailabilityType**](ProductAvailabilityType.md) |  | 
**default_currency** | [***models::NullableCurrency**](NullableCurrency.md) |  | 
**name** | **String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**format** | [***models::CatalogsFormat**](CatalogsFormat.md) |  | 
**default_locale** | **String** | The locale used within a feed for product descriptions. | 
**credentials** | [***models::CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferred_processing_schedule** | [***models::CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 
**status** | [***models::CatalogsStatus**](CatalogsStatus.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


