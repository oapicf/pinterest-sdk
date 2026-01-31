# catalogs_hotel_feed_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **char \*** |  | 
**id** | **char \*** |  | 
**updated_at** | **char \*** |  | 
**catalog_id** | **char \*** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 
**catalog_type** | **catalogs_type_t \*** |  | 
**credentials** | [**catalogs_feed_credentials_t**](catalogs_feed_credentials.md) \* |  | 
**default_currency** | **nullable_currency_t \*** |  | 
**default_locale** | **char \*** | The locale used within a feed for product descriptions. | 
**format** | **catalogs_format_t \*** |  | 
**location** | **char \*** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **char \*** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**preferred_processing_schedule** | [**catalogs_feed_processing_schedule_t**](catalogs_feed_processing_schedule.md) \* |  | 
**status** | **catalogs_status_t \*** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


