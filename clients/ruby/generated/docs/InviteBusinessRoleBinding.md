# PinterestSdkClient::InviteBusinessRoleBinding

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Unique identifier of the invite/request. | [optional] |
| **invite_data** | [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  | [optional] |
| **is_received_invite** | **Boolean** | Indicates whether the invite/request was received. | [optional] |
| **user** | **Object** | Metadata for the user that updated the invite/request. | [optional] |
| **created_by_business_id** | **String** | Unique identifier for the business that created the invite/request. | [optional] |
| **created_by_user_id** | **String** | Unique identifier for the user that created the invite/request. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::InviteBusinessRoleBinding.new(
  id: 383791336903426391,
  invite_data: null,
  is_received_invite: null,
  user: null,
  created_by_business_id: 1234567890123,
  created_by_user_id: 1234567890123
)
```

