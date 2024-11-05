# PinterestSdkClient::BusinessSharedAudience

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **audience_id** | **String** | Unique identifier of an audience |  |
| **operation_type** | [**OperationType**](OperationType.md) |  |  |
| **recipient_business_ids** | **Array&lt;String&gt;** | List of business IDs to share with or revoke from. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BusinessSharedAudience.new(
  audience_id: 2542621871096,
  operation_type: null,
  recipient_business_ids: null
)
```

