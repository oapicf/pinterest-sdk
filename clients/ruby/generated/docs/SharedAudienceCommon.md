# PinterestSdkClient::SharedAudienceCommon

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **audience_id** | **String** | Unique identifier of an audience | [optional] |
| **operation_type** | [**OperationType**](OperationType.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SharedAudienceCommon.new(
  audience_id: 2542621871096,
  operation_type: null
)
```

