# PinterestSdkClient::BusinessToAdAccountSharedAudienceUpdateWithRequiredBody

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **audience_id** | **String** | Unique identifier of an audience |  |
| **operation_type** | [**OperationType**](OperationType.md) |  |  |
| **recipient_account_ids** | **Array&lt;String&gt;** | Ad account IDs to share with or revoke from (request) / that received the audience (response). |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.new(
  audience_id: 2542621871096,
  operation_type: null,
  recipient_account_ids: null
)
```

