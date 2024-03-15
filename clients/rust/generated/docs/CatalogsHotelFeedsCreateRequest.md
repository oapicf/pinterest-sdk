# CatalogsHotelFeedsCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_currency** | Option<[**models::NullableCurrency**](NullableCurrency.md)> |  | [optional]
**name** | **String** | A human-friendly name associated to a given feed. | 
**format** | [**models::CatalogsFormat**](CatalogsFormat.md) |  | 
**default_locale** | [**models::CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequest_default_locale.md) |  | 
**credentials** | Option<[**models::CatalogsFeedCredentials**](CatalogsFeedCredentials.md)> |  | [optional]
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferred_processing_schedule** | Option<[**models::CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md)> |  | [optional]
**catalog_type** | [**models::CatalogsType**](CatalogsType.md) |  | 
**catalog_id** | Option<**String**> | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


