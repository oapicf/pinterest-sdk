# CatalogsFeedsCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**credentials** | Option<[**models::CatalogsFeedCredentials**](CatalogsFeedCredentials.md)> |  | [optional]
**default_availability** | Option<[**models::ProductAvailabilityType**](ProductAvailabilityType.md)> |  | [optional]
**default_country** | Option<[**models::Country**](Country.md)> |  | [optional]
**default_currency** | Option<[**models::NullableCurrency**](NullableCurrency.md)> |  | [optional]
**default_locale** | Option<[**models::CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequest_default_locale.md)> |  | [optional]
**format** | [**models::CatalogsFormat**](CatalogsFormat.md) |  | 
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **String** | A human-friendly name associated to a given feed. | 
**preferred_processing_schedule** | Option<[**models::CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md)> |  | [optional]
**status** | Option<[**models::CatalogsStatus**](CatalogsStatus.md)> |  | [optional][default to Active]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


