# PinterestSdkClient::PinUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ai_disclosures** | [**AiDisclosuresUpdate**](AiDisclosuresUpdate.md) | AI disclosure declarations the creator has made about this Pin. | [optional] |
| **alt_text** | **String** |  | [optional] |
| **board_id** | **String** | The board to which this Pin belongs. | [optional] |
| **board_section_id** | **String** | The board section to which this Pin belongs. | [optional] |
| **carousel_slots** | [**Array&lt;CarouselSlot&gt;**](CarouselSlot.md) | Carousel Pin slots data. | [optional] |
| **description** | **String** |  | [optional] |
| **link** | **String** |  | [optional] |
| **title** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinUpdate.new(
  ai_disclosures: null,
  alt_text: null,
  board_id: null,
  board_section_id: null,
  carousel_slots: null,
  description: null,
  link: null,
  title: null
)
```

