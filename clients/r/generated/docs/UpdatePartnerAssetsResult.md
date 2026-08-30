# openapi::UpdatePartnerAssetsResult

An object containing the permissions a business partner has on the asset.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **character** | Unique identifier of a business asset. | [optional] [Pattern: ^\\d+$] 
**asset_type** | [**AssetTypeResponse**](AssetTypeResponse.md) |  | [optional] [Enum: ] 
**partner_id** | **character** | Unique identifier of a business partner. | [optional] [Pattern: ^\\d+$] 
**permissions** | **array[character]** | Permission levels member or partner has on an asset. | [optional] 


