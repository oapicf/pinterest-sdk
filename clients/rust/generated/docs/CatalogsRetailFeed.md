# CatalogsRetailFeed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **String** |  | 
**id** | **String** |  | 
**updated_at** | **String** |  | 
**name** | Option<**String**> | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**format** | [**models::CatalogsFormat**](CatalogsFormat.md) |  | 
**catalog_type** | [**models::CatalogsType**](CatalogsType.md) |  | 
**credentials** | Option<[**models::CatalogsFeedCredentials**](CatalogsFeedCredentials.md)> |  | 
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferred_processing_schedule** | Option<[**models::CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md)> |  | 
**status** | [**models::CatalogsStatus**](CatalogsStatus.md) |  | 
**default_currency** | Option<[**models::NullableCurrency**](NullableCurrency.md)> |  | 
**default_locale** | **String** | The locale used within a feed for product descriptions. | 
**default_country** | [**models::Country**](Country.md) |  | 
**default_availability** | Option<[**models::ProductAvailabilityType**](ProductAvailabilityType.md)> |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


