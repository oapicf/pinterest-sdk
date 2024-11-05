# openapi::DeletePartnerAssetsResult

The terminated asset access.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **character** | Unique identifier of a business asset. | [optional] [Pattern: ^\\d+$] 
**asset_type** | **character** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] 
**permissions** | **array[character]** | Permission levels member or partner has on an asset. | [optional] 
**is_shared_partner** | **character** | If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset. | [optional] 
**partner_id** | **character** | Unique identifier of a business partner. | [optional] [Pattern: ^\\d+$] 


