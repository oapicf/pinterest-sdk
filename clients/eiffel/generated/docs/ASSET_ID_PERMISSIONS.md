# ASSET_ID_PERMISSIONS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | [**ASSET_GROUP_BINDING**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. | [optional] [default to null]
**asset_id** | [**STRING_32**](STRING_32.md) | Unique identifier of a business asset. | [default to null]
**asset_type** | [**ASSET_TYPE_RESPONSE**](AssetTypeResponse.md) |  | [default to null]
**permissions** | [**LIST [STRING_32]**](STRING_32.md) | Permission levels member or partner has on an asset. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


