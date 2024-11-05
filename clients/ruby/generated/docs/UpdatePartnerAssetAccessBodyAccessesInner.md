# PinterestSdkClient::UpdatePartnerAssetAccessBodyAccessesInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **partner_id** | **String** | Unique identifier of a business partner to update asset access to. |  |
| **asset_id** | **String** | Unique identifier of the business asset. |  |
| **permissions** | [**Array&lt;Permissions&gt;**](Permissions.md) | A non-empty array of permissions to assign to the partner. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UpdatePartnerAssetAccessBodyAccessesInner.new(
  partner_id: 1234567890123,
  asset_id: 549755885175,
  permissions: [&quot;ANALYST&quot;,&quot;ADMIN&quot;]
)
```

