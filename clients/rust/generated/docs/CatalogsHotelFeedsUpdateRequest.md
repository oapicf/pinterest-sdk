# CatalogsHotelFeedsUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_currency** | Option<[**models::NullableCurrency**](NullableCurrency.md)> |  | [optional]
**name** | Option<**String**> | A human-friendly name associated to a given feed. | [optional]
**format** | Option<[**models::CatalogsFormat**](CatalogsFormat.md)> |  | [optional]
**credentials** | Option<[**models::CatalogsFeedCredentials**](CatalogsFeedCredentials.md)> |  | [optional]
**location** | Option<**String**> | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [optional]
**preferred_processing_schedule** | Option<[**models::CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md)> |  | [optional]
**status** | Option<[**models::CatalogsStatus**](CatalogsStatus.md)> |  | [optional]
**catalog_type** | [**models::CatalogsType**](CatalogsType.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


