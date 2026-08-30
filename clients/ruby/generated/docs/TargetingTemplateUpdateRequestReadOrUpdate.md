# PinterestSdkClient::TargetingTemplateUpdateRequestReadOrUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Targeting template ID |  |
| **operation_type** | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  |  |
| **targeting_attributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TargetingTemplateUpdateRequestReadOrUpdate.new(
  id: 643,
  operation_type: null,
  targeting_attributes: null
)
```

