# DeletePartnerAssetAccessResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **String** | Unique identifier of a business asset. | [optional] [default to None]
**asset_type** | **String** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional] [default to None]
**is_shared_partner** | **bool** | If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset. If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset. | [optional] [default to None]
**partner_id** | **String** | Unique identifier of a business partner. | [optional] [default to None]
**permissions** | **Vec<String>** | Permission levels member or partner has on an asset. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


