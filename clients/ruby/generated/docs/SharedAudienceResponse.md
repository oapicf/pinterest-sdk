# PinterestSdkClient::SharedAudienceResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **audience_id** | **String** | Audience ID that was shared | [optional] |
| **permissions** | [**Array&lt;Role&gt;**](Role.md) |  | [optional] |
| **recipient_account_ids** | **Array&lt;String&gt;** | Account IDs that received the audience | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SharedAudienceResponse.new(
  audience_id: 2542621871096,
  permissions: [RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER],
  recipient_account_ids: [&quot;549755885175&quot;]
)
```

