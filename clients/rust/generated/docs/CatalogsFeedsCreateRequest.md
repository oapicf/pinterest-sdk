# CatalogsFeedsCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_currency** | Option<[**models::NullableCurrency**](NullableCurrency.md)> |  | [optional]
**name** | **String** | A human-friendly name associated to a given feed. | 
**format** | [**models::CatalogsFormat**](CatalogsFormat.md) |  | 
**default_locale** | Option<[**models::CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequest_default_locale.md)> |  | [optional]
**credentials** | Option<[**models::CatalogsFeedCredentials**](CatalogsFeedCredentials.md)> |  | [optional]
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferred_processing_schedule** | Option<[**models::CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md)> |  | [optional]
**default_country** | Option<[**models::Country**](Country.md)> |  | [optional]
**default_availability** | Option<[**models::ProductAvailabilityType**](ProductAvailabilityType.md)> |  | [optional]
**status** | Option<[**models::CatalogsStatus**](CatalogsStatus.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


