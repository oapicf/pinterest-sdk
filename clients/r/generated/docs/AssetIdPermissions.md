# openapi::AssetIdPermissions

An object containing the permissions a business member has on the asset.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 
**asset_id** | **character** | Unique identifier of a business asset. | [optional] [Pattern: ^\\d+$] [Max. length: 20] [Min. length: 1] 
**asset_type** | **character** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional] 
**permissions** | **array[character]** | Permission levels member or partner has on an asset. | [optional] 


