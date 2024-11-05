
# DeletePartnerAssetsResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **assetId** | **kotlin.String** | Unique identifier of a business asset. |  [optional] |
| **assetType** | **kotlin.String** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. |  [optional] |
| **permissions** | **kotlin.collections.List&lt;kotlin.String&gt;** | Permission levels member or partner has on an asset. |  [optional] |
| **isSharedPartner** | **kotlin.Boolean** | If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset. |  [optional] |
| **partnerId** | **kotlin.String** | Unique identifier of a business partner. |  [optional] |



