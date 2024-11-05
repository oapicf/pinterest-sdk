# PinterestSdkClient::UpdateMemberBusinessRoleBody

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_role** | [**BusinessRoleForMembers**](BusinessRoleForMembers.md) |  |  |
| **member_id** | **String** | Unique identifier of the member |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UpdateMemberBusinessRoleBody.new(
  business_role: null,
  member_id: 140943737684417
)
```

