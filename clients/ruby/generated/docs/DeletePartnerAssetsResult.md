# PinterestSdkClient::DeletePartnerAssetsResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_id** | **String** | Unique identifier of a business asset. | [optional] |
| **asset_type** | **String** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] |
| **permissions** | **Array&lt;String&gt;** | Permission levels member or partner has on an asset. | [optional] |
| **is_shared_partner** | **Boolean** | If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset. | [optional] |
| **partner_id** | **String** | Unique identifier of a business partner. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DeletePartnerAssetsResult.new(
  asset_id: 549755885175,
  asset_type: AD_ACCOUNT,
  permissions: [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;],
  is_shared_partner: false,
  partner_id: 140943737684417
)
```

