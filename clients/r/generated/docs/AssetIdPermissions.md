# openapi::AssetIdPermissions

An object containing the permissions a business member has on the asset.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. | [optional] 
**asset_id** | **character** | Unique identifier of a business asset. | [Pattern: ^\\d+$] [Max. length: 20] [Min. length: 1] 
**asset_type** | [**AssetTypeResponse**](AssetTypeResponse.md) |  | [Enum: ] 
**permissions** | **array[character]** | Permission levels member or partner has on an asset. | 


