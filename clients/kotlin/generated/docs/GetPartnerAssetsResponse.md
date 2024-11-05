
# GetPartnerAssetsResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **assetId** | **kotlin.String** | Unique identifier of a business asset. |  [optional] |
| **assetType** | **kotlin.String** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. |  [optional] |
| **permissions** | **kotlin.collections.List&lt;kotlin.String&gt;** | The permissions you or your partner has on the asset. If partner_type&#x3D;INTERNAL, the permission levels are for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the permission levels are for the access you have to the partner&#39;s business asset. |  [optional] |
| **assetGroupInfo** | [**AssetGroupBinding**](AssetGroupBinding.md) |  |  [optional] |



