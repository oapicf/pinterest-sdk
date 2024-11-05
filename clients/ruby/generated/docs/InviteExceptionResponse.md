# PinterestSdkClient::InviteExceptionResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **invite_or_request_id** | **String** | Unique identifier of the invite/request. | [optional] |
| **code** | **Integer** | Error code associated with the error in performing the action on the invite/request. | [optional] |
| **message** | **String** | Error message associated with the error in performing the action on the invite/request. | [optional] |
| **users_or_partner_ids** | **Array&lt;String&gt;** | A list of users&#39; usernames or emails OR a list of partner ids that caused the error. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::InviteExceptionResponse.new(
  invite_or_request_id: 383791336903426391,
  code: 403,
  message: You hit the maximum number of pending invites allowed.,
  users_or_partner_ids: [&quot;businessMember0101&quot;,&quot;business+member@business.com&quot;]
)
```

