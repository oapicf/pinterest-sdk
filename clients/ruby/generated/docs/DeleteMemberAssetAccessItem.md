# PinterestSdkClient::DeleteMemberAssetAccessItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_id** | **String** | Id of the asset on which to remove member permissions. |  |
| **member_id** | **String** | Unique identifier of the member on which to perform the asset permission removal |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DeleteMemberAssetAccessItem.new(
  asset_id: null,
  member_id: null
)
```

