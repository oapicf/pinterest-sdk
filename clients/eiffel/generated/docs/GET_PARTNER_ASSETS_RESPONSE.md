# GET_PARTNER_ASSETS_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | [**STRING_32**](STRING_32.md) | Unique identifier of a business asset. | [optional] [default to null]
**asset_type** | [**STRING_32**](STRING_32.md) | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] [default to null]
**permissions** | [**LIST [STRING_32]**](STRING_32.md) | The permissions you or your partner has on the asset. If partner_type&#x3D;INTERNAL, the permission levels are for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the permission levels are for the access you have to the partner&#39;s business asset. | [optional] [default to null]
**asset_group_info** | [**ASSET_GROUP_BINDING**](AssetGroupBinding.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


