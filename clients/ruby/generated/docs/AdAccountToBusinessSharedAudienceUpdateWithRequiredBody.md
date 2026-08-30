# PinterestSdkClient::AdAccountToBusinessSharedAudienceUpdateWithRequiredBody

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **audience_id** | **String** | Unique identifier of an audience |  |
| **operation_type** | [**OperationType**](OperationType.md) |  |  |
| **recipient_business_ids** | **Array&lt;String&gt;** | Business IDs to share with or revoke from (request) / that received the audience (response). |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.new(
  audience_id: 2542621871096,
  operation_type: null,
  recipient_business_ids: null
)
```

