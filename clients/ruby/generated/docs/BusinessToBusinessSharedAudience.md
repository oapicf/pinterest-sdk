# PinterestSdkClient::BusinessToBusinessSharedAudience

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **audience_id** | **String** | Unique identifier of an audience |  |
| **permissions** | [**Array&lt;Role&gt;**](Role.md) | Permissions granted to the recipients. | [optional][readonly] |
| **recipient_business_ids** | **Array&lt;String&gt;** | Business IDs to share with or revoke from (request) / that received the audience (response). |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BusinessToBusinessSharedAudience.new(
  audience_id: 2542621871096,
  permissions: [&quot;RESOURCE_PINNER_LIST_READER&quot;,&quot;RESOURCE_PINNER_LIST_OWNER&quot;],
  recipient_business_ids: null
)
```

