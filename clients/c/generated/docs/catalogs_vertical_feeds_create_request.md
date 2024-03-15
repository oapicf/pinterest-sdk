# catalogs_vertical_feeds_create_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_currency** | **nullable_currency_t \*** |  | [optional] 
**name** | **char \*** | A human-friendly name associated to a given feed. | 
**format** | **catalogs_format_t \*** |  | 
**default_locale** | [**catalogs_feeds_create_request_default_locale_t**](catalogs_feeds_create_request_default_locale.md) \* |  | 
**credentials** | [**catalogs_feed_credentials_t**](catalogs_feed_credentials.md) \* |  | [optional] 
**location** | **char \*** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferred_processing_schedule** | [**catalogs_feed_processing_schedule_t**](catalogs_feed_processing_schedule.md) \* |  | [optional] 
**catalog_type** | **catalogs_type_t \*** |  | 
**default_country** | **country_t \*** |  | 
**default_availability** | **product_availability_type_t \*** |  | [optional] 
**catalog_id** | **char \*** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


