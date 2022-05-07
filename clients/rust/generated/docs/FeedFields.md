# FeedFields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_country** | [**crate::models::Country**](Country.md) |  | 
**default_availability** | Option<[**crate::models::ProductAvailabilityType**](ProductAvailabilityType.md)> |  | 
**default_currency** | Option<[**crate::models::NullableCurrency**](NullableCurrency.md)> |  | 
**name** | Option<**String**> | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**format** | [**crate::models::CatalogsFormat**](CatalogsFormat.md) |  | 
**default_locale** | **String** | The locale used within a feed for product descriptions. | 
**credentials** | Option<[**crate::models::CatalogsFeedCredentials**](CatalogsFeedCredentials.md)> |  | 
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferred_processing_schedule** | Option<[**crate::models::CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md)> |  | 
**status** | [**crate::models::CatalogsStatus**](CatalogsStatus.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


