# PinterestSdkClient::BusinessSharedAudienceResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **audience_id** | **String** | Audience ID that was shared | [optional] |
| **permissions** | [**Array&lt;Role&gt;**](Role.md) |  | [optional] |
| **recipient_business_ids** | **Array&lt;String&gt;** | Business IDs that received the audience | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BusinessSharedAudienceResponse.new(
  audience_id: 2542621871096,
  permissions: [RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER],
  recipient_business_ids: [&quot;549755885175&quot;]
)
```

