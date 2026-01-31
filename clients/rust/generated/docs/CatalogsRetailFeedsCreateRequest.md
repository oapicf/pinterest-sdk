# CatalogsRetailFeedsCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | Option<**String**> | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. Currently, this field has no effect. | [optional]
**catalog_type** | [**models::CatalogsType**](CatalogsType.md) |  | 
**credentials** | Option<[**models::CatalogsFeedCredentials**](CatalogsFeedCredentials.md)> |  | [optional]
**default_availability** | Option<[**models::ProductAvailabilityType**](ProductAvailabilityType.md)> |  | [optional]
**default_country** | [**models::Country**](Country.md) |  | 
**default_currency** | Option<[**models::NullableCurrency**](NullableCurrency.md)> |  | [optional]
**default_locale** | [**models::CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequest_default_locale.md) |  | 
**format** | [**models::CatalogsFormat**](CatalogsFormat.md) |  | 
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **String** | A human-friendly name associated to a given feed. | 
**preferred_processing_schedule** | Option<[**models::CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md)> |  | [optional]
**status** | Option<[**models::CatalogsStatus**](CatalogsStatus.md)> |  | [optional][default to Active]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


