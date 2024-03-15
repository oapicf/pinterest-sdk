# PinterestSdkClient::PinterestTagEventData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **currency** | [**Currency**](Currency.md) |  | [optional] |
| **lead_type** | **String** | Promotion code. For example, \&quot;Newsletter\&quot;. | [optional] |
| **line_items** | [**LineItem**](LineItem.md) |  | [optional] |
| **order_id** | **String** | Order ID. For example, \&quot;X-151481\&quot;. | [optional] |
| **order_quantity** | **Integer** | Order quantity. For example, 1. | [optional] |
| **page_name** | **String** | Page name. For example, \&quot;Our Favorite Pins on Pinterest\&quot;. | [optional] |
| **promo_code** | **String** | Promotion code. For example, \&quot;WINTER10\&quot;. | [optional] |
| **property** | **String** | Property. For example, \&quot;Athleta\&quot;. | [optional] |
| **search_query** | **String** | Search query string. For example, \&quot;boots\&quot;. | [optional] |
| **value** | **String** | Product value. For example, \&quot;199.98\&quot; | [optional] |
| **video_title** | **String** | Video title. For example, \&quot;How to style your Parker Boots\&quot;. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinterestTagEventData.new(
  currency: null,
  lead_type: Newsletter,
  line_items: null,
  order_id: X-151481,
  order_quantity: 1,
  page_name: Our Favorite Pins on Pinterest.,
  promo_code: WINTER10,
  property: Athleta,
  search_query: boots,
  value: 199.98,
  video_title: How to style your Parker Boots
)
```

