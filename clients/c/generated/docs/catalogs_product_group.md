# catalogs_product_group_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | ID of the catalog product group. | 
**name** | **char \*** | Name of catalog product group | [optional] 
**description** | **char \*** |  | [optional] 
**filters** | [**catalogs_product_group_filters_t**](catalogs_product_group_filters.md) \* |  | 
**is_featured** | **int** | boolean indicator of whether the product group is being featured or not | [optional] 
**type** | **catalogs_product_group_type_t \*** |  | [optional] 
**status** | **catalogs_product_group_status_t \*** |  | [optional] 
**created_at** | **int** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**updated_at** | **int** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**feed_id** | **char \*** | id of the catalogs feed belonging to this catalog product group | 
**catalog_type** | **pinterest_rest_api_catalogs_product_group_CATALOGTYPE_e** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


