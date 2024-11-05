# DeletePartnerAssetsResult
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **asset\_id** | **String** | Unique identifier of a business asset. | [optional] [default to null] |
| **asset\_type** | **String** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] [default to null] |
| **permissions** | **List** | Permission levels member or partner has on an asset. | [optional] [default to null] |
| **is\_shared\_partner** | **Boolean** | If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset. | [optional] [default to null] |
| **partner\_id** | **String** | Unique identifier of a business partner. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

