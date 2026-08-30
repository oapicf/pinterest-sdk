# PinterestSdkClient::InviteDataResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **invite_expiration** | **Integer** | The date and time when the invite/request will expire. Returned in milliseconds. | [optional] |
| **invite_status** | **String** | The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. | [optional] |
| **invite_type** | **String** | The type of invite. - &#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. - &#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. - &#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets. | [optional] |
| **last_updated_time** | **Integer** | The date and time the invite/request was last updated. Returned in milliseconds. | [optional] |
| **sent_at** | **Integer** | The date and time the invite/request was sent/created. Returned in milliseconds. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::InviteDataResponse.new(
  invite_expiration: null,
  invite_status: null,
  invite_type: null,
  last_updated_time: null,
  sent_at: null
)
```

