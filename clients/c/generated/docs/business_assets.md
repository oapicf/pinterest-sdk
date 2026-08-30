# business_assets_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | [**asset_group_binding_t**](asset_group_binding.md) \* | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. | [optional] 
**asset_id** | **char \*** | Unique identifier of a business asset. | [optional] 
**asset_type** | **asset_type_response_t \*** |  | [optional] 
**permissions** | **list_t \*** | Permission levels the requesting business has on an asset. | [optional] 
**catalog_info** | [**catalog_binding_t**](catalog_binding.md) \* | An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


