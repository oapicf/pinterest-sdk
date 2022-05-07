# PinterestSdkClient::Pin

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  | [optional][readonly] |
| **created_at** | **Time** |  | [optional][readonly] |
| **link** | **String** |  | [optional] |
| **title** | **String** |  | [optional] |
| **description** | **String** |  | [optional] |
| **alt_text** | **String** |  | [optional] |
| **board_id** | **String** | The board to which this Pin belongs. | [optional] |
| **board_section_id** | **String** | The board section to which this Pin belongs. | [optional] |
| **board_owner** | [**BoardOwner**](BoardOwner.md) |  | [optional][readonly] |
| **media** | [**PinMedia**](PinMedia.md) |  | [optional][readonly] |
| **media_source** | [**PinMediaSource**](PinMediaSource.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Pin.new(
  id: 813744226420795884,
  created_at: 2020-01-01T20:10:40Z,
  link: https://www.pinterest.com/,
  title: null,
  description: null,
  alt_text: null,
  board_id: null,
  board_section_id: null,
  board_owner: null,
  media: null,
  media_source: null
)
```

