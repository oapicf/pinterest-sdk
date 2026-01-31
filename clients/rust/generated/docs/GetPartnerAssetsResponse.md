# GetPartnerAssetsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | Option<[**models::AssetGroupBinding**](AssetGroupBinding.md)> |  | [optional]
**asset_id** | Option<**String**> | Unique identifier of a business asset. | [optional]
**asset_type** | Option<**String**> | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional]
**permissions** | Option<**Vec<String>**> | The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


