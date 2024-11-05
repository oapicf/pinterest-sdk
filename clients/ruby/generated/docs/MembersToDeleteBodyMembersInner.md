# PinterestSdkClient::MembersToDeleteBodyMembersInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **member_id** | **String** | Unique identifier of the member |  |
| **business_role** | [**BusinessRoleForMembers**](BusinessRoleForMembers.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::MembersToDeleteBodyMembersInner.new(
  member_id: 140943737684417,
  business_role: null
)
```

