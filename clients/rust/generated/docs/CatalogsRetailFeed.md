# CatalogsRetailFeed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **CatalogType** |  (enum: RETAIL) | 
**created_at** | **chrono::DateTime<chrono::FixedOffset>** |  | [readonly]
**credentials** | Option<[**models::CatalogsFeedCredentials**](CatalogsFeedCredentials.md)> |  | [optional]
**default_availability** | Option<[**models::ProductAvailabilityType**](ProductAvailabilityType.md)> |  | [optional]
**default_country** | [**models::Country**](Country.md) |  | 
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


