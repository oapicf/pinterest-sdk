# DeletePartnerAssetAccessResult


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`asset_id`** | **`String`** | Unique identifier of a business asset. | [optional] [default to nothing]
**`asset_type`** | **`String`** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional] [default to nothing]
**`is_shared_partner`** | **`Bool`** | If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset. If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset. | [optional] [default to nothing]
**`partner_id`** | **`String`** | Unique identifier of a business partner. | [optional] [default to nothing]
**`permissions`** | **`Vector{String}`** | Permission levels member or partner has on an asset. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


