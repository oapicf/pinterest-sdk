# CatalogsFeedsCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_currency** | [***models::NullableCurrency**](NullableCurrency.md) |  | [optional] [default to None]
**name** | **String** | A human-friendly name associated to a given feed. | 
**format** | [***models::CatalogsFormat**](CatalogsFormat.md) |  | 
**default_locale** | [***models::CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequest_default_locale.md) |  | [optional] [default to None]
**credentials** | [***models::CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] [default to None]
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferred_processing_schedule** | [***models::CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] [default to None]
**default_country** | [***models::Country**](Country.md) |  | [optional] [default to None]
**default_availability** | [***models::ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


