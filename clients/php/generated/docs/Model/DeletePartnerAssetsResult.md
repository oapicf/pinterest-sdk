# # DeletePartnerAssetsResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **string** | Unique identifier of a business asset. | [optional]
**asset_type** | **string** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional]
**permissions** | **string[]** | Permission levels member or partner has on an asset. | [optional]
**is_shared_partner** | **bool** | If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset. | [optional]
**partner_id** | **string** | Unique identifier of a business partner. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
