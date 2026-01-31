# DeletePartnerAssetsResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | Option<**String**> | Unique identifier of a business asset. | [optional]
**asset_type** | Option<**String**> | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional]
**is_shared_partner** | Option<**bool**> | If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset. | [optional]
**partner_id** | Option<**String**> | Unique identifier of a business partner. | [optional]
**permissions** | Option<**Vec<String>**> | Permission levels member or partner has on an asset. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


