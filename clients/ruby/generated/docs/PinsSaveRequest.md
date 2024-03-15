# PinterestSdkClient::PinsSaveRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **board_id** | **String** | Unique identifier of the board to which the pin will be saved. | [optional] |
| **board_section_id** | **String** | Unique identifier of the board section to which the pin will be saved. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinsSaveRequest.new(
  board_id: null,
  board_section_id: null
)
```

