# PinterestSdkClient::TargetingTemplateUpdateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Targeting template ID |  |
| **operation_type** | **String** |  |  |
| **targeting_attributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TargetingTemplateUpdateRequest.new(
  id: 643,
  operation_type: null,
  targeting_attributes: null
)
```

