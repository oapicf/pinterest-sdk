# openapi::BaseBusinessAssets

An object containing the permissions a business has on the asset.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. | [optional] 
**asset_id** | **character** | Unique identifier of a business asset. | [optional] [Pattern: ^\\d+$] [Max. length: 20] [Min. length: 1] 
**asset_type** | [**AssetTypeResponse**](AssetTypeResponse.md) |  | [optional] [Enum: ] 
**permissions** | **array[character]** | Permission levels the requesting business has on an asset. | [optional] 


