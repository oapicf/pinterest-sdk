# catalogs_hotel_batch_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **pinterest_rest_api_catalogs_hotel_batch_request_CATALOGTYPE_e** |  | 
**country** | **country_t \*** |  | 
**language** | [**catalogs_items_request_language_t**](catalogs_items_request_language.md) \* |  | 
**items** | [**list_t**](catalogs_hotel_batch_item.md) \* | Array with catalogs item operations | 
**catalog_id** | **char \*** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


