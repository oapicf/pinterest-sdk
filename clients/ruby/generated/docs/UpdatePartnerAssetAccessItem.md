# PinterestSdkClient::UpdatePartnerAssetAccessItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_id** | **String** | Unique identifier of the business asset. |  |
| **partner_id** | **String** | Unique identifier of a business partner to update asset access to. |  |
| **permissions** | [**Array&lt;Permissions&gt;**](Permissions.md) | A non-empty array of permissions to assign to the partner. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UpdatePartnerAssetAccessItem.new(
  asset_id: null,
  partner_id: null,
  permissions: null
)
```

