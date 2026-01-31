# PinterestSdkClient::EventData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **currency** | [**Currency**](Currency.md) | Currency. For example, &#39;USD&#39;. | [optional] |
| **lead_type** | **String** | Promotion code. For example, &#39;Newsletter&#39;. | [optional] |
| **line_items** | [**LineItem**](LineItem.md) |  | [optional] |
| **order_id** | **String** | Order ID. For example, &#39;X-151481&#39;. | [optional] |
| **order_quantity** | **Integer** | Order quantity. For example, 1. | [optional] |
| **page_name** | **String** | Page name. For example, &#39;Our Favorite Pins on Pinterest&#39;. | [optional] |
| **promo_code** | **String** | Promotion code. For example, &#39;WINTER10&#39;. | [optional] |
| **property** | **String** | Property. For example, &#39;Athleta&#39;. | [optional] |
| **search_query** | **String** | Search query string. For example, &#39;boots&#39;. | [optional] |
| **value** | **String** | Product value. For example, &#39;199.98&#39;. | [optional] |
| **video_title** | **String** | Video title. For example, &#39;How to style your Parker Boots&#39;. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::EventData.new(
  currency: null,
  lead_type: Newsletter,
  line_items: null,
  order_id: X-151481,
  order_quantity: 1,
  page_name: Our Favorite Pins on Pinterest,
  promo_code: WINTER10,
  property: Athleta,
  search_query: boots,
  value: 199.98,
  video_title: How to style your Parker Boots
)
```

