# PinterestSdkClient::BaseInviteDataResponseInviteData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **invite_expiration** | **Integer** | The date and time when the invite/request will expire. Returned in milliseconds. | [optional] |
| **invite_status** | **String** | The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. | [optional] |
| **invite_type** | **String** | The type of invite. &lt;br&gt;&#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. &lt;br&gt;&#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. &lt;br&gt;&#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets. | [optional] |
| **last_updated_time** | **Integer** | The date and time the invite/request was last updated. Returned in milliseconds. | [optional] |
| **sent_at** | **Integer** | The date and time the invite/request was sent/created. Returned in milliseconds. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BaseInviteDataResponseInviteData.new(
  invite_expiration: 1709748104775,
  invite_status: PENDING,
  invite_type: MEMBER_INVITE,
  last_updated_time: 1646767577816,
  sent_at: 1646767577816
)
```

