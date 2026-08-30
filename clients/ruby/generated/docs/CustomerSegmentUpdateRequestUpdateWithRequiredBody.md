# PinterestSdkClient::CustomerSegmentUpdateRequestUpdateWithRequiredBody

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **audience_ids** | **Array&lt;String&gt;** | Audience IDs to update the customer segment to. Only applicable for UPDATE operations. | [optional] |
| **id** | **String** | Customer segment ID. |  |
| **operation_type** | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CustomerSegmentUpdateRequestUpdateWithRequiredBody.new(
  audience_ids: null,
  id: null,
  operation_type: null
)
```

