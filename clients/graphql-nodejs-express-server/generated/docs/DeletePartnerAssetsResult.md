# DeletePartnerAssetsResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetId** | **String!** | Unique identifier of a business asset. | [optional] [default to null]
**assetType** | **String!** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] [default to null]
**permissions** | **String!** | Permission levels member or partner has on an asset. | [optional] [default to null]
**isSharedPartner** | **Boolean!** | If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset. | [optional] [default to null]
**partnerId** | **String!** | Unique identifier of a business partner. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


