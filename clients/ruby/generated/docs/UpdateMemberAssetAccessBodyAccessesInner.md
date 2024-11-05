# PinterestSdkClient::UpdateMemberAssetAccessBodyAccessesInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_id** | **String** | Id of the asset to update. |  |
| **member_id** | **String** | Unique identifier of the member on which to perform the update |  |
| **permissions** | [**Array&lt;Permissions&gt;**](Permissions.md) | A non-empty array of permissions to assign to the member. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UpdateMemberAssetAccessBodyAccessesInner.new(
  asset_id: 549755885175,
  member_id: 140943737684417,
  permissions: [&quot;ANALYST&quot;,&quot;ADMIN&quot;]
)
```

