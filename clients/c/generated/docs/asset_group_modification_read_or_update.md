# asset_group_modification_read_or_update_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_groups_to_update** | [**list_t**](asset_group_update_item_read_or_update_item.md) \* | A list of asset groups and the data that will be used to update them. | [optional] 
**exceptions** | [**list_t**](asset_group_update_error.md) \* | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] [readonly] 
**updated_asset_groups** | [**list_t**](asset_group_binding.md) \* | A list of successfully edited asset groups. | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


