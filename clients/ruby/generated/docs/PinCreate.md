# PinterestSdkClient::PinCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ai_disclosures** | [**AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. | [optional] |
| **alt_text** | **String** |  | [optional] |
| **board_id** | **String** | The board to which this Pin belongs. | [optional] |
| **board_section_id** | **String** | The board section to which this Pin belongs. | [optional] |
| **description** | **String** |  | [optional] |
| **dominant_color** | **String** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] |
| **link** | **String** |  | [optional] |
| **media_source** | [**PinMediaSource**](PinMediaSource.md) |  | [optional] |
| **parent_pin_id** | **String** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] |
| **sponsor_id** | **String** | The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta. | [optional] |
| **title** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinCreate.new(
  ai_disclosures: null,
  alt_text: null,
  board_id: null,
  board_section_id: null,
  description: null,
  dominant_color: null,
  link: null,
  media_source: null,
  parent_pin_id: null,
  sponsor_id: null,
  title: null
)
```

