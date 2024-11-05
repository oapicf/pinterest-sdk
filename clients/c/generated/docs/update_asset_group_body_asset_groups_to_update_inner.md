# update_asset_group_body_asset_groups_to_update_inner_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_id** | **char \*** | Unique identifier of the asset group to update. | 
**name** | **char \*** | Asset Group name | [optional] 
**description** | **char \*** | Asset group description | [optional] 
**asset_group_types** | [**list_t**](asset_group_type.md) \* | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | [optional] 
**assets_to_add** | **list_t \*** | A list of asset ids to add to the asset group. | [optional] 
**assets_to_remove** | **list_t \*** | A list of asset ids to remove from the asset group. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


