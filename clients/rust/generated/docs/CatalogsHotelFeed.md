# CatalogsHotelFeed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | Option<**String**> | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 
**catalog_type** | **CatalogType** |  (enum: HOTEL) | 
**created_at** | **chrono::DateTime<chrono::FixedOffset>** |  | [readonly]
**credentials** | Option<[**models::CatalogsFeedCredentials**](CatalogsFeedCredentials.md)> |  | [optional]
**default_currency** | Option<[**models::NullableCurrency**](NullableCurrency.md)> |  | [optional]
**default_locale** | **String** | The locale used within a feed for product descriptions. | 
**format** | [**models::CatalogsFormat**](CatalogsFormat.md) |  | 
**id** | **String** | ID of the feed entity. | [readonly]
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | Option<**String**> | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**preferred_processing_schedule** | Option<[**models::CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md)> |  | [optional]
**status** | [**models::CatalogsStatus**](CatalogsStatus.md) |  | 
**updated_at** | **chrono::DateTime<chrono::FixedOffset>** |  | [readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


