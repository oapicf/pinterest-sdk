# PinterestSdkClient::UpdateMemberAssetAccessItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_id** | **String** | Id of the asset to update. |  |
| **member_id** | **String** | Unique identifier of the member on which to perform the update |  |
| **permissions** | [**Array&lt;Permissions&gt;**](Permissions.md) | A non-empty array of permissions to assign to the member. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UpdateMemberAssetAccessItem.new(
  asset_id: null,
  member_id: null,
  permissions: null
)
```

