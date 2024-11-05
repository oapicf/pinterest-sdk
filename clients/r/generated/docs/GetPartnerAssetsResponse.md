# openapi::GetPartnerAssetsResponse

An object containing the permissions a you/your business partner has on the asset.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **character** | Unique identifier of a business asset. | [optional] [Pattern: ^\\d+$] [Max. length: 20] [Min. length: 1] 
**asset_type** | **character** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] 
**permissions** | **array[character]** | The permissions you or your partner has on the asset. If partner_type&#x3D;INTERNAL, the permission levels are for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the permission levels are for the access you have to the partner&#39;s business asset. | [optional] 
**asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 


