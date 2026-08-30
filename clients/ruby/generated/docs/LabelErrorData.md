# PinterestSdkClient::LabelErrorData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Label ID. | [optional] |
| **label_type** | [**NullableLabelType**](NullableLabelType.md) |  | [optional] |
| **status** | [**NullableLabelStatus**](NullableLabelStatus.md) |  | [optional] |
| **value** | **String** | Label name. 100-character limit. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LabelErrorData.new(
  id: 1106385754497,
  label_type: null,
  status: null,
  value: null
)
```

