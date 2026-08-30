# CatalogsHotelFeed

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **swagger::Nullable<String>** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 
**catalog_type** | [***models::CatalogsHotelAvailableFilterValuesCatalogType**](CatalogsHotelAvailableFilterValues_catalog_type.md) |  | 
**created_at** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) |  | [readonly] 
**credentials** | [***swagger::Nullable<models::CatalogsFeedCredentials>**](CatalogsFeedCredentials.md) |  | [optional] [default to None]
**default_currency** | [***swagger::Nullable<models::NullableCurrency>**](NullableCurrency.md) |  | [optional] [default to None]
**default_locale** | **String** | The locale used within a feed for product descriptions. | 
**format** | [***models::CatalogsFormat**](CatalogsFormat.md) |  | 
**id** | **String** | ID of the feed entity. | [readonly] 
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **swagger::Nullable<String>** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**preferred_processing_schedule** | [***swagger::Nullable<models::CatalogsFeedProcessingSchedule>**](CatalogsFeedProcessingSchedule.md) |  | [optional] [default to None]
**status** | [***models::CatalogsStatus**](CatalogsStatus.md) |  | 
**updated_at** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) |  | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


