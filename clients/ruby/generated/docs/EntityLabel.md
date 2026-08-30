# PinterestSdkClient::EntityLabel

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **entity_id** | **String** | Entity ID to apply label to. |  |
| **entity_type** | [**LabelParentType**](LabelParentType.md) |  | [optional] |
| **label_id** | **String** | Label ID. |  |
| **status** | [**EntityLabelStatus**](EntityLabelStatus.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::EntityLabel.new(
  entity_id: null,
  entity_type: null,
  label_id: null,
  status: null
)
```

