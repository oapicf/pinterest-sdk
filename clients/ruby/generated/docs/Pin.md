# PinterestSdkClient::Pin

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ai_disclosures** | [**AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. | [optional] |
| **board_id** | **String** | The board to which this Pin belongs. | [optional] |
| **board_owner** | [**BoardOwner**](BoardOwner.md) |  | [optional][readonly] |
| **board_section_id** | **String** | The board section to which this Pin belongs. | [optional] |
| **created_at** | **Time** |  | [optional][readonly] |
| **creative_type** | [**CreativeType**](CreativeType.md) |  | [optional][readonly] |
| **dominant_color** | **String** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] |
| **has_been_promoted** | **Boolean** | Whether the Pin has been promoted or not. | [optional][readonly] |
| **id** | **String** |  |  |
| **is_owner** | **Boolean** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional][readonly] |
| **is_product** | **Boolean** | Whether the Pin is a product Pin. | [optional][readonly] |
| **is_standard** | **Boolean** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional][readonly] |
| **media** | [**PinMedia**](PinMedia.md) |  | [optional][readonly] |
| **parent_pin_id** | **String** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] |
| **pin_metrics** | **Object** | Pin metrics with associated time intervals if any. | [optional][readonly] |
| **alt_text** | **String** |  | [optional] |
| **description** | **String** |  | [optional] |
| **link** | **String** |  | [optional] |
| **title** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Pin.new(
  ai_disclosures: null,
  board_id: null,
  board_owner: null,
  board_section_id: null,
  created_at: null,
  creative_type: null,
  dominant_color: null,
  has_been_promoted: null,
  id: null,
  is_owner: null,
  is_product: null,
  is_standard: null,
  media: null,
  parent_pin_id: null,
  pin_metrics: {90d&#x3D;{pin_click&#x3D;7, impression&#x3D;2, clickthrough&#x3D;3}, lifetime_metrics&#x3D;{pin_click&#x3D;7, impression&#x3D;2, clickthrough&#x3D;3, reaction&#x3D;10, comment&#x3D;2}},
  alt_text: null,
  description: null,
  link: null,
  title: null
)
```

