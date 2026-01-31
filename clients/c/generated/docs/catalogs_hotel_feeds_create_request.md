# catalogs_hotel_feeds_create_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **char \*** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. | [optional] 
**catalog_type** | **catalogs_type_t \*** |  | 
**credentials** | [**catalogs_feed_credentials_t**](catalogs_feed_credentials.md) \* |  | [optional] 
**default_currency** | **nullable_currency_t \*** |  | [optional] 
**default_locale** | [**catalogs_feeds_create_request_default_locale_t**](catalogs_feeds_create_request_default_locale.md) \* |  | 
**format** | **catalogs_format_t \*** |  | 
**location** | **char \*** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **char \*** | A human-friendly name associated to a given feed. | 
**preferred_processing_schedule** | [**catalogs_feed_processing_schedule_t**](catalogs_feed_processing_schedule.md) \* |  | [optional] 
**status** | **catalogs_status_t \*** |  | [optional] [default to 'ACTIVE']

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


