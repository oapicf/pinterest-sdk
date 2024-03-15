# catalog_product_group_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | ID of the catalog product group. | [optional] 
**merchant_id** | **char \*** | Merchant ID pertaining to the owner of the catalog product group. | [optional] 
**name** | **char \*** | Name of catalog product group | [optional] 
**filters** | [**object_t**](.md) \* | Object holding a list of filters | [optional] 
**filter_v2** | [**object_t**](.md) \* | Object holding a list of filters | [optional] 
**type** | [**board_t**](board.md) \* |  | [optional] 
**status** | **entity_status_t \*** |  | [optional] 
**feed_profile_id** | **char \*** | id of the feed profile belonging to this catalog product group | [optional] 
**created_at** | **int** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**last_update** | **int** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**product_count** | **int** | Amount of products in the catalog product group | [optional] 
**featured_position** | **int** | index of the featured position of the catalog product group | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


