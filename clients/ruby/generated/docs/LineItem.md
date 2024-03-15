# PinterestSdkClient::LineItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product_brand** | **String** | Product brand. For example, \&quot;Parker\&quot;. | [optional] |
| **product_category** | **String** | Product category. For example, \&quot;Shoes\&quot;. | [optional] |
| **product_id** | **Integer** | Product ID. For example, 1414. | [optional] |
| **product_name** | **String** | Product name. For example, \&quot;Parker Boots\&quot;. | [optional] |
| **product_price** | **String** | Product price. For example, \&quot;99.99\&quot;. | [optional] |
| **product_quantity** | **Integer** | Product quantity. For example, 2. | [optional] |
| **product_variant** | **String** | Product variant. For example, \&quot;Red\&quot;. | [optional] |
| **product_variant_id** | **String** | Product variant ID. For example, \&quot;1414-34832\&quot;. | [optional] |

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

