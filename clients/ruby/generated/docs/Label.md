# PinterestSdkClient::Label

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Label ID. | [optional] |
| **label_type** | [**LabelType**](LabelType.md) |  | [optional] |
| **parent_id** | **String** | Label parent entity ID. | [optional] |
| **parent_type** | **String** | Label parent entity type. | [optional] |
| **status** | [**LabelStatus**](LabelStatus.md) |  | [optional] |
| **value** | **String** | Label name. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Label.new(
  id: 1106385754497,
  label_type: null,
  parent_id: 626753052072,
  parent_type: CAMPAIGN,
  status: null,
  value: null
)
```

