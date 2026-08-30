# PinterestSdkClient::CancelInviteResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  | [optional] |
| **invite_data** | [**InviteDataResponse**](InviteDataResponse.md) |  | [optional] |
| **is_received_invite** | **Boolean** |  | [optional] |
| **user** | [**CancelInviteResultUser**](CancelInviteResultUser.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CancelInviteResult.new(
  id: null,
  invite_data: null,
  is_received_invite: null,
  user: null
)
```

