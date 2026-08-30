# catalogs_creative_assets_feed_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **char \*** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 
**catalog_type** | **pinterest_rest_api_catalogs_creative_assets_feed_CATALOGTYPE_e** |  | 
**created_at** | **char \*** |  | [readonly] 
**credentials** | [**catalogs_feed_credentials_t**](catalogs_feed_credentials.md) \* |  | [optional] 
**default_country** | **country_t \*** |  | 
**default_currency** | **nullable_currency_t \*** |  | [optional] 
**default_locale** | **char \*** | The locale used within a feed for product descriptions. | 
**format** | **catalogs_format_t \*** |  | 
**id** | **char \*** | ID of the feed entity. | [readonly] 
**location** | **char \*** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **char \*** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**preferred_processing_schedule** | [**catalogs_feed_processing_schedule_t**](catalogs_feed_processing_schedule.md) \* |  | [optional] 
**status** | **catalogs_status_t \*** |  | 
**updated_at** | **char \*** |  | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


