# PinterestSdkClient::BaseInviteDataResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Unique identifier of the invite/request. | [optional] |
| **invite_data** | [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  | [optional] |
| **is_received_invite** | **Boolean** | Indicates whether the invite/request was received. | [optional] |
| **user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BaseInviteDataResponse.new(
  id: 383791336903426391,
  invite_data: null,
  is_received_invite: null,
  user: null
)
```

