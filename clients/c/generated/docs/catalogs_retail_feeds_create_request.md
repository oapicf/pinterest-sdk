# catalogs_retail_feeds_create_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **char \*** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | [optional] 
**catalog_type** | **pinterest_rest_api_catalogs_retail_feeds_create_request_CATALOGTYPE_e** |  | 
**credentials** | [**catalogs_feed_credentials_t**](catalogs_feed_credentials.md) \* |  | [optional] 
**default_availability** | **product_availability_type_t \*** |  | [optional] 
**default_country** | **country_t \*** |  | 
**default_currency** | **nullable_currency_t \*** |  | [optional] 
**default_locale** | [**catalogs_creative_assets_feeds_create_request_default_locale_t**](catalogs_creative_assets_feeds_create_request_default_locale.md) \* |  | 
**format** | **catalogs_format_t \*** |  | 
**location** | **char \*** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **char \*** | A human-friendly name associated to a given feed. | 
**preferred_processing_schedule** | [**catalogs_feed_processing_schedule_t**](catalogs_feed_processing_schedule.md) \* |  | [optional] 
**status** | **catalogs_status_t \*** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


