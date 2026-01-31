# PinterestSdkClient::LineItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product_brand** | **String** | Product brand. For example, &#39;Parker&#39;. | [optional] |
| **product_category** | **String** | Product category. For example, &#39;Shoes&#39;. | [optional] |
| **product_id** | **Integer** | Product ID. For example, 1414. | [optional] |
| **product_name** | **String** | Product name. For example, &#39;Parker Boots&#39;. | [optional] |
| **product_price** | **String** | Product price. For example, &#39;99.99&#39;. | [optional] |
| **product_quantity** | **Integer** | Product quantity. For example, 2. | [optional] |
| **product_variant** | **String** | Product variant. For example, &#39;Red&#39;. | [optional] |
| **product_variant_id** | **String** | Product variant ID. For example, &#39;1414-34832&#39;. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LineItem.new(
  product_brand: Parker,
  product_category: Shoes,
  product_id: 1414,
  product_name: Parker Boots,
  product_price: 99.99,
  product_quantity: 2,
  product_variant: Red,
  product_variant_id: 1414-34832
)
```

