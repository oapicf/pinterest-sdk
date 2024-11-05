# PinterestSdkClient::PinCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  | [optional][readonly] |
| **created_at** | **Time** |  | [optional][readonly] |
| **link** | **String** |  | [optional] |
| **title** | **String** |  | [optional] |
| **description** | **String** |  | [optional] |
| **dominant_color** | **String** | Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;. | [optional] |
| **alt_text** | **String** |  | [optional] |
| **board_id** | **String** | The board to which this Pin belongs. | [optional] |
| **board_section_id** | **String** | The board section to which this Pin belongs. | [optional] |
| **board_owner** | [**BoardOwner**](BoardOwner.md) |  | [optional][readonly] |
| **media** | [**PinMedia**](PinMedia.md) |  | [optional][readonly] |
| **media_source** | [**PinMediaSource**](PinMediaSource.md) |  | [optional] |
| **parent_pin_id** | **String** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. | [optional] |
| **note** | **String** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinCreate.new(
  id: 813744226420795884,
  created_at: 2020-01-01T20:10:40Z,
  link: https://www.pinterest.com/,
  title: null,
  description: null,
  dominant_color: #6E7874,
  alt_text: null,
  board_id: null,
  board_section_id: null,
  board_owner: null,
  media: null,
  media_source: null,
  parent_pin_id: null,
  note: null
)
```

