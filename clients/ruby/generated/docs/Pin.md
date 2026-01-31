# PinterestSdkClient::Pin

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **alt_text** | **String** |  | [optional] |
| **board_id** | **String** | The board to which this Pin belongs. | [optional] |
| **board_owner** | [**BoardOwner**](BoardOwner.md) |  | [optional][readonly] |
| **board_section_id** | **String** | The board section to which this Pin belongs. | [optional] |
| **created_at** | **Time** |  | [optional][readonly] |
| **creative_type** | [**CreativeType**](CreativeType.md) |  | [optional][readonly] |
| **description** | **String** |  | [optional] |
| **dominant_color** | **String** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] |
| **has_been_promoted** | **Boolean** | Whether the Pin has been promoted or not. | [optional][readonly] |
| **id** | **String** |  |  |
| **is_owner** | **Boolean** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional][readonly] |
| **is_standard** | **Boolean** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional][readonly] |
| **link** | **String** |  | [optional] |
| **media** | [**PinMedia**](PinMedia.md) |  | [optional][readonly] |
| **parent_pin_id** | **String** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] |
| **pin_metrics** | **Object** | Pin metrics with associated time intervals if any. | [optional][readonly] |
| **title** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Pin.new(
  alt_text: null,
  board_id: null,
  board_owner: null,
  board_section_id: null,
  created_at: null,
  creative_type: null,
  description: null,
  dominant_color: null,
  has_been_promoted: null,
  id: null,
  is_owner: null,
  is_standard: null,
  link: null,
  media: null,
  parent_pin_id: null,
  pin_metrics: {&quot;90d&quot;:{&quot;pin_click&quot;:7,&quot;impression&quot;:2,&quot;clickthrough&quot;:3},&quot;lifetime_metrics&quot;:{&quot;pin_click&quot;:7,&quot;impression&quot;:2,&quot;clickthrough&quot;:3,&quot;reaction&quot;:10,&quot;comment&quot;:2}},
  title: null
)
```

