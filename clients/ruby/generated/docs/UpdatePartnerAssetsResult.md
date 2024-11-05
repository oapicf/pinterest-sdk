# PinterestSdkClient::UpdatePartnerAssetsResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_id** | **String** | Unique identifier of a business asset. | [optional] |
| **asset_type** | **String** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] |
| **partner_id** | **String** | Unique identifier of a business partner. | [optional] |
| **permissions** | **Array&lt;String&gt;** | Permission levels member or partner has on an asset. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UpdatePartnerAssetsResult.new(
  asset_id: 549755885175,
  asset_type: AD_ACCOUNT,
  partner_id: 140943737684417,
  permissions: [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;]
)
```

