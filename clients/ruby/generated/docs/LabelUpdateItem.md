# PinterestSdkClient::LabelUpdateItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Label ID. |  |
| **status** | [**LabelStatus**](LabelStatus.md) |  | [optional] |
| **value** | **String** | Label name. 100-character limit. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LabelUpdateItem.new(
  id: 1106385754497,
  status: null,
  value: null
)
```

