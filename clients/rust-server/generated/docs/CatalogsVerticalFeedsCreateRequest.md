# CatalogsVerticalFeedsCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_currency** | [***models::NullableCurrency**](NullableCurrency.md) |  | [optional] [default to None]
**name** | **String** | A human-friendly name associated to a given feed. | 
**format** | [***models::CatalogsFormat**](CatalogsFormat.md) |  | 
**default_locale** | [***models::CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequest_default_locale.md) |  | 
**credentials** | [***models::CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] [default to None]
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferred_processing_schedule** | [***models::CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] [default to None]
**catalog_type** | [***models::CatalogsType**](CatalogsType.md) |  | 
**default_country** | [***models::Country**](Country.md) |  | 
**default_availability** | [***models::ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] [default to None]
**catalog_id** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


