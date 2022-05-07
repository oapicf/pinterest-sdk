# CatalogsFeedsCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_country** | Option<[**crate::models::Country**](Country.md)> |  | [optional]
**default_availability** | Option<[**crate::models::ProductAvailabilityType**](ProductAvailabilityType.md)> |  | [optional]
**default_currency** | Option<[**crate::models::NullableCurrency**](NullableCurrency.md)> |  | [optional]
**name** | **String** | A human-friendly name associated to a given feed. | 
**format** | [**crate::models::CatalogsFormat**](CatalogsFormat.md) |  | 
**default_locale** | Option<**String**> | The locale used within a feed for product descriptions. | [optional]
**credentials** | Option<[**crate::models::CatalogsFeedCredentials**](CatalogsFeedCredentials.md)> |  | [optional]
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferred_processing_schedule** | Option<[**crate::models::CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


