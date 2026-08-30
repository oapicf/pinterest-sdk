# PinterestSdkClient::AdAccountToAdAccountSharedAudience

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **audience_id** | **String** | Unique identifier of an audience |  |
| **permissions** | [**Array&lt;Role&gt;**](Role.md) | Permissions granted to the recipients. | [optional][readonly] |
| **recipient_account_ids** | **Array&lt;String&gt;** | Ad account IDs to share with or revoke from (request) / that received the audience (response). |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdAccountToAdAccountSharedAudience.new(
  audience_id: 2542621871096,
  permissions: [&quot;RESOURCE_PINNER_LIST_READER&quot;,&quot;RESOURCE_PINNER_LIST_OWNER&quot;],
  recipient_account_ids: null
)
```

