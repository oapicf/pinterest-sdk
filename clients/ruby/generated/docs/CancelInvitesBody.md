# PinterestSdkClient::CancelInvitesBody

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **invite_ids** | **Array&lt;String&gt;** | List of invite/request ids to be cancelled |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CancelInvitesBody.new(
  invite_ids: [&quot;1234567890123456789&quot;,&quot;1122334455667788991&quot;]
)
```

