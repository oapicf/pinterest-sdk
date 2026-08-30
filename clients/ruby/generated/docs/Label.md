# PinterestSdkClient::Label

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Label ID. |  |
| **label_type** | [**NullableLabelType**](NullableLabelType.md) |  |  |
| **status** | [**NullableLabelStatus**](NullableLabelStatus.md) |  | [optional] |
| **value** | **String** | Label name. 100-character limit. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Label.new(
  id: 1106385754497,
  label_type: null,
  status: null,
  value: null
)
```

