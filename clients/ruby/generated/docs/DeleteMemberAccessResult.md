# PinterestSdkClient::DeleteMemberAccessResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_id** | **String** | Unique identifier of the business asset. | [optional] |
| **member_id** | **String** | Unique identifier of the business member. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DeleteMemberAccessResult.new(
  asset_id: 549755885175,
  member_id: 140943737684417
)
```

