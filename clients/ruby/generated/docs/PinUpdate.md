# PinterestSdkClient::PinUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **alt_text** | **String** | Pin&#39;s alternative text. | [optional] |
| **board_id** | **String** | The id of the board to move the Pin onto. | [optional] |
| **board_section_id** | **String** | &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/create-a-board-section\&quot;&gt;Board section&lt;/a&gt; ID. | [optional] |
| **description** | **String** | Pin description - 800 characters maximum. | [optional] |
| **link** | **String** | URL viewer is taken to when they click pin. | [optional] |
| **title** | **String** | The native pin title that creators explicitly prefer to display. | [optional] |
| **carousel_slots** | [**Array&lt;PinUpdateCarouselSlotsInner&gt;**](PinUpdateCarouselSlotsInner.md) | Carousel Pin slots data. | [optional] |
| **note** | **String** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinUpdate.new(
  alt_text: null,
  board_id: null,
  board_section_id: null,
  description: null,
  link: https://www.pinterest.com/,
  title: null,
  carousel_slots: null,
  note: null
)
```

